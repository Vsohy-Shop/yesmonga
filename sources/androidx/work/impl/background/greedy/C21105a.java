package androidx.work.impl.background.greedy;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.C21410t;
import androidx.work.impl.model.C21249u;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.greedy.a */
public class C21105a {

    /* renamed from: d */
    public static final String f54476d = C21377l.m98584i("DelayedWorkTracker");

    /* renamed from: a */
    public final C21107b f54477a;

    /* renamed from: b */
    public final C21410t f54478b;

    /* renamed from: c */
    public final Map<String, Runnable> f54479c = new HashMap();

    /* renamed from: androidx.work.impl.background.greedy.a$a */
    public class C21106a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C21249u f54480a;

        public C21106a(C21249u uVar) {
            this.f54480a = uVar;
        }

        public void run() {
            C21377l e = C21377l.m98582e();
            String str = C21105a.f54476d;
            e.mo63774a(str, "Scheduling work " + this.f54480a.f54804a);
            C21105a.this.f54477a.mo63221c(this.f54480a);
        }
    }

    public C21105a(@C0359n0 C21107b bVar, @C0359n0 C21410t tVar) {
        this.f54477a = bVar;
        this.f54478b = tVar;
    }

    /* renamed from: a */
    public void mo63216a(@C0359n0 C21249u uVar) {
        Runnable remove = this.f54479c.remove(uVar.f54804a);
        if (remove != null) {
            this.f54478b.mo63332a(remove);
        }
        C21106a aVar = new C21106a(uVar);
        this.f54479c.put(uVar.f54804a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f54478b.mo63333b(uVar.mo63461c() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo63217b(@C0359n0 String str) {
        Runnable remove = this.f54479c.remove(str);
        if (remove != null) {
            this.f54478b.mo63332a(remove);
        }
    }
}
