package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.va */
public final class C30918va implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41977h1 f74034a;

    /* renamed from: b */
    public final /* synthetic */ String f74035b;

    /* renamed from: c */
    public final /* synthetic */ String f74036c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f74037d;

    public C30918va(AppMeasurementDynamiteService appMeasurementDynamiteService, C41977h1 h1Var, String str, String str2) {
        this.f74037d = appMeasurementDynamiteService;
        this.f74034a = h1Var;
        this.f74035b = str;
        this.f74036c = str2;
    }

    public final void run() {
        this.f74037d.f73210n.mo87108L().mo87032T(this.f74034a, this.f74035b, this.f74036c);
    }
}
