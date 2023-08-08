package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.z7 */
public final class C41734z7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41134a8 f105321a;

    public C41734z7(C41134a8 a8Var) {
        this.f105321a = a8Var;
    }

    public final void run() {
        if (this.f105321a.f104434a.f104760l == 1 || this.f105321a.f104434a.f104760l == 2) {
            this.f105321a.f104434a.f104760l = 4;
            C41493p6.m168149a("Container load timed out after 5000ms.");
            while (!this.f105321a.f104434a.f104761m.isEmpty()) {
                this.f105321a.f104434a.f104753e.execute((Runnable) this.f105321a.f104434a.f104761m.remove());
            }
        }
    }
}
