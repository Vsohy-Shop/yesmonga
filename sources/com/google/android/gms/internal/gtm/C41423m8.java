package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.m8 */
public final class C41423m8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41132a6 f104793a;

    /* renamed from: b */
    public final /* synthetic */ C41471o8 f104794b;

    public C41423m8(C41471o8 o8Var, C41132a6 a6Var) {
        this.f104794b = o8Var;
        this.f104793a = a6Var;
    }

    public final void run() {
        if (this.f104794b.f104833n.isEmpty()) {
            C41493p6.m168149a("TagManagerBackend emit called without loaded container.");
            return;
        }
        for (C41588t5 t : this.f104794b.f104833n.values()) {
            t.mo135847t(this.f104793a);
        }
    }
}
