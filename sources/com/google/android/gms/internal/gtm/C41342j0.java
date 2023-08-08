package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.j0 */
public final class C41342j0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f104695a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f104696b;

    /* renamed from: c */
    public final /* synthetic */ C41487p0 f104697c;

    public C41342j0(C41487p0 p0Var, String str, Runnable runnable) {
        this.f104697c = p0Var;
        this.f104695a = str;
        this.f104696b = runnable;
    }

    public final void run() {
        this.f104697c.f104850c.mo135560R0(this.f104695a);
        this.f104696b.run();
    }
}
