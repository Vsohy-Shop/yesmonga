package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.C40372a0;

/* renamed from: com.google.android.gms.internal.gtm.x0 */
public final class C41679x0 extends C41632v1 {

    /* renamed from: e */
    public final /* synthetic */ C41175c1 f105223e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41679x0(C41175c1 c1Var, C41607u0 u0Var) {
        super(u0Var);
        this.f105223e = c1Var;
    }

    /* renamed from: a */
    public final void mo135393a() {
        C41175c1 c1Var = this.f105223e;
        C40372a0.m164215h();
        if (c1Var.mo135157d0()) {
            c1Var.mo135759v("Inactivity, disconnecting from device AnalyticsService");
            c1Var.mo135154a0();
        }
    }
}
