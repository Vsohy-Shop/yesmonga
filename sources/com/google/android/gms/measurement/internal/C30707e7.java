package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
public final class C30707e7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41977h1 f73362a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f73363b;

    public C30707e7(AppMeasurementDynamiteService appMeasurementDynamiteService, C41977h1 h1Var) {
        this.f73363b = appMeasurementDynamiteService;
        this.f73362a = h1Var;
    }

    public final void run() {
        this.f73363b.f73210n.mo87108L().mo87030R(this.f73362a);
    }
}
