package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
public final class C30734g8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73462a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73463b;

    /* renamed from: c */
    public final /* synthetic */ zzli f73464c;

    /* renamed from: d */
    public final /* synthetic */ C30696d9 f73465d;

    public C30734g8(C30696d9 d9Var, zzq zzq, boolean z, zzli zzli) {
        this.f73465d = d9Var;
        this.f73462a = zzq;
        this.f73463b = z;
        this.f73464c = zzli;
    }

    public final void run() {
        zzli zzli;
        C30696d9 d9Var = this.f73465d;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Failed to set user property");
            return;
        }
        C40843u.m166202l(this.f73462a);
        C30696d9 d9Var2 = this.f73465d;
        if (this.f73463b) {
            zzli = null;
        } else {
            zzli = this.f73464c;
        }
        d9Var2.mo87040r(H, zzli, this.f73462a);
        this.f73465d.mo87023E();
    }
}
