package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.C21289t;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.h */
public class C21121h implements C21289t {

    /* renamed from: b */
    public static final String f54565b = C21377l.m98584i("SystemAlarmScheduler");

    /* renamed from: a */
    public final Context f54566a;

    public C21121h(@C0359n0 Context context) {
        this.f54566a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo63266a(@C0359n0 C21249u uVar) {
        C21377l e = C21377l.m98582e();
        String str = f54565b;
        e.mo63774a(str, "Scheduling work with workSpecId " + uVar.f54804a);
        this.f54566a.startService(C21111b.m97721f(this.f54566a, C21273x.m98280a(uVar)));
    }

    /* renamed from: b */
    public void mo63220b(@C0359n0 String str) {
        this.f54566a.startService(C21111b.m97723h(this.f54566a, str));
    }

    /* renamed from: c */
    public void mo63221c(@C0359n0 C21249u... uVarArr) {
        for (C21249u a : uVarArr) {
            mo63266a(a);
        }
    }

    /* renamed from: e */
    public boolean mo63223e() {
        return true;
    }
}
