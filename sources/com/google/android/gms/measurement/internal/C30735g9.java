package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
public final class C30735g9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41977h1 f73466a;

    /* renamed from: b */
    public final /* synthetic */ String f73467b;

    /* renamed from: c */
    public final /* synthetic */ String f73468c;

    /* renamed from: d */
    public final /* synthetic */ boolean f73469d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f73470e;

    public C30735g9(AppMeasurementDynamiteService appMeasurementDynamiteService, C41977h1 h1Var, String str, String str2, boolean z) {
        this.f73470e = appMeasurementDynamiteService;
        this.f73466a = h1Var;
        this.f73467b = str;
        this.f73468c = str2;
        this.f73469d = z;
    }

    public final void run() {
        this.f73470e.f73210n.mo87108L().mo87035W(this.f73466a, this.f73467b, this.f73468c, this.f73469d);
    }
}
