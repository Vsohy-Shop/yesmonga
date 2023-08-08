package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
public final class C30783k7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f73683a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73684b;

    public C30783k7(C30819n7 n7Var, boolean z) {
        this.f73684b = n7Var;
        this.f73683a = z;
    }

    public final void run() {
        boolean o = this.f73684b.f74136a.mo87123o();
        boolean n = this.f73684b.f74136a.mo87122n();
        this.f73684b.f74136a.mo87119k(this.f73683a);
        if (n == this.f73683a) {
            this.f73684b.f74136a.mo86903d().mo87493v().mo87464b("Default data collection state already set to", Boolean.valueOf(this.f73683a));
        }
        if (this.f73684b.f74136a.mo87123o() == o || this.f73684b.f74136a.mo87123o() != this.f73684b.f74136a.mo87122n()) {
            this.f73684b.f74136a.mo86903d().mo87495x().mo87465c("Default data collection is different than actual status", Boolean.valueOf(this.f73683a), Boolean.valueOf(o));
        }
        this.f73684b.mo87314P();
    }
}
