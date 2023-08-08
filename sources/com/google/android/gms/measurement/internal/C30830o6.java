package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
public final /* synthetic */ class C30830o6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30819n7 f73830a;

    public /* synthetic */ C30830o6(C30819n7 n7Var) {
        this.f73830a = n7Var;
    }

    public final void run() {
        C30819n7 n7Var = this.f73830a;
        n7Var.mo86866h();
        if (!n7Var.f74136a.mo87103F().f73663s.mo87052b()) {
            long a = n7Var.f74136a.mo87103F().f73664t.mo87096a();
            n7Var.f74136a.mo87103F().f73664t.mo87097b(1 + a);
            n7Var.f74136a.mo87130z();
            if (a >= 5) {
                n7Var.f74136a.mo86903d().mo87494w().mo87463a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                n7Var.f74136a.mo87103F().f73663s.mo87051a(true);
                return;
            }
            n7Var.f74136a.mo87118j();
            return;
        }
        n7Var.f74136a.mo86903d().mo87488q().mo87463a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
