package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.a9 */
public final class C30657a9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30683c9 f73228a;

    public C30657a9(C30683c9 c9Var) {
        this.f73228a = c9Var;
    }

    public final void run() {
        C30696d9 d9Var = this.f73228a.f73269e;
        Context c = d9Var.f74136a.mo86902c();
        this.f73228a.f73269e.f74136a.mo86901b();
        C30696d9.m123657M(d9Var, new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
