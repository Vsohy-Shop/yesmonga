package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.n4 */
public final class C41443n4 implements C41704y1 {

    /* renamed from: a */
    public final /* synthetic */ Runnable f104812a;

    /* renamed from: b */
    public final /* synthetic */ C41491p4 f104813b;

    public C41443n4(C41491p4 p4Var, Runnable runnable) {
        this.f104813b = p4Var;
        this.f104812a = runnable;
    }

    /* renamed from: a */
    public final void mo135503a(Throwable th) {
        this.f104813b.f104854a.post(this.f104812a);
    }
}
