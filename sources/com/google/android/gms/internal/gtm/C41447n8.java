package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.n8 */
public final class C41447n8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41471o8 f104814a;

    public C41447n8(C41471o8 o8Var) {
        this.f104814a = o8Var;
    }

    public final void run() {
        if (this.f104814a.f104833n.isEmpty()) {
            C41493p6.m168153e("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        for (C41588t5 s : this.f104814a.f104833n.values()) {
            s.mo135846s();
        }
    }
}
