package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.gtm.p0 */
public final class C41487p0 extends C41535r0 {

    /* renamed from: c */
    public final C41368k1 f104850c;

    public C41487p0(C41607u0 u0Var, C41631v0 v0Var) {
        super(u0Var);
        C40843u.m166202l(v0Var);
        this.f104850c = new C41368k1(u0Var, v0Var);
    }

    /* renamed from: W */
    public final void mo133294W() {
        this.f104850c.mo135795U();
    }

    /* renamed from: X */
    public final long mo135690X(C41655w0 w0Var) {
        mo135794T();
        C40843u.m166202l(w0Var);
        C40372a0.m164215h();
        long x0 = this.f104850c.mo135574x0(w0Var, true);
        if (x0 == 0) {
            this.f104850c.mo135557L0(w0Var);
        }
        return x0;
    }

    /* renamed from: a0 */
    public final void mo135691a0() {
        mo135794T();
        Context G = mo135734G();
        if (!C41371k4.m167930a(G) || !C41491p4.m168141h(G)) {
            mo135692b0((C41704y1) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(G, "com.google.android.gms.analytics.AnalyticsService"));
        G.startService(intent);
    }

    /* renamed from: b0 */
    public final void mo135692b0(C41704y1 y1Var) {
        mo135794T();
        mo135736J().mo133262i(new C41439n0(this, y1Var));
    }

    /* renamed from: c0 */
    public final void mo135693c0(String str, Runnable runnable) {
        C40843u.m166199i(str, "campaign param can't be empty");
        mo135736J().mo133262i(new C41342j0(this, str, runnable));
    }

    /* renamed from: d0 */
    public final void mo135694d0() {
        mo135794T();
        mo135749l();
        mo135736J().mo133262i(new C41415m0(this));
    }

    /* renamed from: e0 */
    public final void mo135695e0(C41706y3 y3Var) {
        C40843u.m166202l(y3Var);
        mo135794T();
        mo135751n("Hit delivery requested", y3Var);
        mo135736J().mo133262i(new C41391l0(this, y3Var));
    }

    /* renamed from: f0 */
    public final void mo135696f0() {
        C40372a0.m164215h();
        this.f104850c.mo135558N0();
    }

    /* renamed from: g0 */
    public final void mo135697g0() {
        C40372a0.m164215h();
        this.f104850c.mo135559O0();
    }

    /* renamed from: n0 */
    public final void mo135698n0() {
        mo135794T();
        C40372a0.m164215h();
        C41368k1 k1Var = this.f104850c;
        C40372a0.m164215h();
        k1Var.mo135794T();
        k1Var.mo135759v("Service disconnected");
    }

    /* renamed from: p0 */
    public final void mo135699p0(int i) {
        mo135794T();
        mo135751n("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        mo135736J().mo133262i(new C41367k0(this, i));
    }

    /* renamed from: q0 */
    public final void mo135700q0() {
        this.f104850c.mo135563a0();
    }

    /* renamed from: t0 */
    public final boolean mo135701t0() {
        mo135794T();
        try {
            mo135736J().mo133261g(new C41463o0(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            mo135763z("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            mo135755r("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            mo135763z("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }
}
