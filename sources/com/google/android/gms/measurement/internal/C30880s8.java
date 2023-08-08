package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
public final class C30880s8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73946a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73947b;

    /* renamed from: c */
    public final /* synthetic */ zzaw f73948c;

    /* renamed from: d */
    public final /* synthetic */ String f73949d;

    /* renamed from: e */
    public final /* synthetic */ C30696d9 f73950e;

    public C30880s8(C30696d9 d9Var, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.f73950e = d9Var;
        this.f73946a = zzq;
        this.f73947b = z2;
        this.f73948c = zzaw;
        this.f73949d = str;
    }

    public final void run() {
        zzaw zzaw;
        C30696d9 d9Var = this.f73950e;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Failed to send event to service");
            return;
        }
        C40843u.m166202l(this.f73946a);
        C30696d9 d9Var2 = this.f73950e;
        if (this.f73947b) {
            zzaw = null;
        } else {
            zzaw = this.f73948c;
        }
        d9Var2.mo87040r(H, zzaw, this.f73946a);
        this.f73950e.mo87023E();
    }
}
