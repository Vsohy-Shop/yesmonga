package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ha */
public final class C30749ha implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30942xa f73583a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f73584b;

    public C30749ha(AppMeasurementDynamiteService appMeasurementDynamiteService, C30942xa xaVar) {
        this.f73584b = appMeasurementDynamiteService;
        this.f73583a = xaVar;
    }

    public final void run() {
        this.f73584b.f73210n.mo87105I().mo87306H(this.f73583a);
    }
}
