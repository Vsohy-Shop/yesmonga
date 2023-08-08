package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.y0 */
public final class C41703y0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41151b1 f105282a;

    /* renamed from: b */
    public final /* synthetic */ C41730z3 f105283b;

    public C41703y0(C41151b1 b1Var, C41730z3 z3Var, byte[] bArr) {
        this.f105282a = b1Var;
        this.f105283b = z3Var;
    }

    public final void run() {
        if (!this.f105282a.f104449d.mo135157d0()) {
            this.f105282a.f104449d.mo135750m("Connected to service after a timeout");
            C41175c1.m167239f0(this.f105282a.f104449d, this.f105283b);
        }
    }
}
