package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
public final class C30820n8 extends C30823o {

    /* renamed from: e */
    public final /* synthetic */ C30696d9 f73786e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30820n8(C30696d9 d9Var, C30667b6 b6Var) {
        super(b6Var);
        this.f73786e = d9Var;
    }

    /* renamed from: c */
    public final void mo87340c() {
        C30696d9 d9Var = this.f73786e;
        d9Var.mo86866h();
        if (d9Var.mo87048z()) {
            d9Var.f74136a.mo86903d().mo87493v().mo87463a("Inactivity, disconnecting from the service");
            d9Var.mo87029Q();
        }
    }
}
