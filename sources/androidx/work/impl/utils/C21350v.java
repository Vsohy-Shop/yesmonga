package androidx.work.impl.utils;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21397o;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21282o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.v */
public class C21350v implements Runnable {

    /* renamed from: a */
    public final C21191g0 f55062a;

    /* renamed from: b */
    public final C21282o f55063b = new C21282o();

    public C21350v(@C0359n0 C21191g0 g0Var) {
        this.f55062a = g0Var;
    }

    @C0359n0
    /* renamed from: a */
    public C21397o mo63703a() {
        return this.f55063b;
    }

    public void run() {
        try {
            this.f55062a.mo63363P().mo63207X().mo63530c();
            this.f55063b.mo63600b(C21397o.f55145a);
        } catch (Throwable th) {
            this.f55063b.mo63600b(new C21397o.C21399b.C21400a(th));
        }
    }
}
