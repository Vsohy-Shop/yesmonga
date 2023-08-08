package androidx.work.impl.utils;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.C21410t;
import androidx.work.impl.model.C21237m;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.i0 */
public class C21326i0 {

    /* renamed from: e */
    public static final String f55024e = C21377l.m98584i("WorkTimer");

    /* renamed from: a */
    public final C21410t f55025a;

    /* renamed from: b */
    public final Map<C21237m, C21328b> f55026b = new HashMap();

    /* renamed from: c */
    public final Map<C21237m, C21327a> f55027c = new HashMap();

    /* renamed from: d */
    public final Object f55028d = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.work.impl.utils.i0$a */
    public interface C21327a {
        /* renamed from: b */
        void mo63246b(@C0359n0 C21237m mVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.work.impl.utils.i0$b */
    public static class C21328b implements Runnable {

        /* renamed from: c */
        public static final String f55029c = "WrkTimerRunnable";

        /* renamed from: a */
        public final C21326i0 f55030a;

        /* renamed from: b */
        public final C21237m f55031b;

        public C21328b(@C0359n0 C21326i0 i0Var, @C0359n0 C21237m mVar) {
            this.f55030a = i0Var;
            this.f55031b = mVar;
        }

        public void run() {
            synchronized (this.f55030a.f55028d) {
                if (this.f55030a.f55026b.remove(this.f55031b) != null) {
                    C21327a remove = this.f55030a.f55027c.remove(this.f55031b);
                    if (remove != null) {
                        remove.mo63246b(this.f55031b);
                    }
                } else {
                    C21377l.m98582e().mo63774a(f55029c, String.format("Timer with %s is already marked as complete.", new Object[]{this.f55031b}));
                }
            }
        }
    }

    public C21326i0(@C0359n0 C21410t tVar) {
        this.f55025a = tVar;
    }

    @C0344h1
    @C0359n0
    /* renamed from: a */
    public Map<C21237m, C21327a> mo63679a() {
        Map<C21237m, C21327a> map;
        synchronized (this.f55028d) {
            map = this.f55027c;
        }
        return map;
    }

    @C0344h1
    @C0359n0
    /* renamed from: b */
    public Map<C21237m, C21328b> mo63680b() {
        Map<C21237m, C21328b> map;
        synchronized (this.f55028d) {
            map = this.f55026b;
        }
        return map;
    }

    /* renamed from: c */
    public void mo63681c(@C0359n0 C21237m mVar, long j, @C0359n0 C21327a aVar) {
        synchronized (this.f55028d) {
            C21377l e = C21377l.m98582e();
            String str = f55024e;
            e.mo63774a(str, "Starting timer for " + mVar);
            mo63682d(mVar);
            C21328b bVar = new C21328b(this, mVar);
            this.f55026b.put(mVar, bVar);
            this.f55027c.put(mVar, aVar);
            this.f55025a.mo63333b(j, bVar);
        }
    }

    /* renamed from: d */
    public void mo63682d(@C0359n0 C21237m mVar) {
        synchronized (this.f55028d) {
            if (this.f55026b.remove(mVar) != null) {
                C21377l e = C21377l.m98582e();
                String str = f55024e;
                e.mo63774a(str, "Stopping timer for " + mVar);
                this.f55027c.remove(mVar);
            }
        }
    }
}
