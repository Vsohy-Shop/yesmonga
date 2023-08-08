package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.wa */
public final class C30930wa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41977h1 f74060a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f74061b;

    public C30930wa(AppMeasurementDynamiteService appMeasurementDynamiteService, C41977h1 h1Var) {
        this.f74061b = appMeasurementDynamiteService;
        this.f74060a = h1Var;
    }

    public final void run() {
        this.f74061b.f73210n.mo87110N().mo87505E(this.f74060a, this.f74061b.f73210n.mo87122n());
    }
}
