package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
public final class C30853q5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73873a;

    /* renamed from: b */
    public final /* synthetic */ C30949y5 f73874b;

    public C30853q5(C30949y5 y5Var, zzq zzq) {
        this.f73874b = y5Var;
        this.f73873a = zzq;
    }

    public final void run() {
        this.f73874b.f74111n.mo87367e();
        C30822na T6 = this.f73874b.f74111n;
        zzq zzq = this.f73873a;
        T6.mo86904f().mo86866h();
        T6.mo87369g();
        C40843u.m166198h(zzq.f74188a);
        C30738h b = C30738h.m123795b(zzq.f74180K0);
        C30738h V = T6.mo87359V(zzq.f74188a);
        T6.mo86903d().mo87493v().mo87465c("Setting consent, package, consent", zzq.f74188a, b);
        T6.mo87342A(zzq.f74188a, b);
        if (b.mo87143k(V)) {
            T6.mo87389v(zzq);
        }
    }
}
