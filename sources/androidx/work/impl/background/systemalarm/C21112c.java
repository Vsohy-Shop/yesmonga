package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.background.systemalarm.C21116g;
import androidx.work.impl.constraints.C21139c;
import androidx.work.impl.constraints.C21153e;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.c */
public class C21112c {

    /* renamed from: e */
    public static final String f54523e = C21377l.m98584i("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f54524a;

    /* renamed from: b */
    public final int f54525b;

    /* renamed from: c */
    public final C21116g f54526c;

    /* renamed from: d */
    public final C21153e f54527d;

    public C21112c(@C0359n0 Context context, int i, @C0359n0 C21116g gVar) {
        this.f54524a = context;
        this.f54525b = i;
        this.f54526c = gVar;
        this.f54527d = new C21153e(gVar.mo63257g().mo63362O(), (C21139c) null);
    }

    @C0348i1
    /* renamed from: a */
    public void mo63243a() {
        List<C21249u> h = this.f54526c.mo63257g().mo63363P().mo63207X().mo63535h();
        ConstraintProxy.m97708a(this.f54524a, h);
        this.f54527d.mo63305a(h);
        ArrayList<C21249u> arrayList = new ArrayList<>(h.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C21249u next : h) {
            String str = next.f54804a;
            if (currentTimeMillis >= next.mo63461c() && (!next.mo63454B() || this.f54527d.mo63307d(str))) {
                arrayList.add(next);
            }
        }
        for (C21249u uVar : arrayList) {
            String str2 = uVar.f54804a;
            Intent b = C21111b.m97718b(this.f54524a, C21273x.m98280a(uVar));
            C21377l e = C21377l.m98582e();
            String str3 = f54523e;
            e.mo63774a(str3, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f54526c.mo63256f().mo63698a().execute(new C21116g.C21118b(this.f54526c, b, this.f54525b));
        }
        this.f54527d.reset();
    }
}
