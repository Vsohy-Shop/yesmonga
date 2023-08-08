package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
public final class C30892t8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73966a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73967b;

    /* renamed from: c */
    public final /* synthetic */ zzac f73968c;

    /* renamed from: d */
    public final /* synthetic */ zzac f73969d;

    /* renamed from: e */
    public final /* synthetic */ C30696d9 f73970e;

    public C30892t8(C30696d9 d9Var, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.f73970e = d9Var;
        this.f73966a = zzq;
        this.f73967b = z2;
        this.f73968c = zzac;
        this.f73969d = zzac2;
    }

    public final void run() {
        zzac zzac;
        C30696d9 d9Var = this.f73970e;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C40843u.m166202l(this.f73966a);
        C30696d9 d9Var2 = this.f73970e;
        if (this.f73967b) {
            zzac = null;
        } else {
            zzac = this.f73968c;
        }
        d9Var2.mo87040r(H, zzac, this.f73966a);
        this.f73970e.mo87023E();
    }
}
