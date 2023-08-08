package com.google.firebase.perf.metrics;

import com.google.firebase.perf.p049v1.TraceMetric;

/* renamed from: com.google.firebase.perf.metrics.f */
public final /* synthetic */ class C33377f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AppStartTrace f81103a;

    /* renamed from: b */
    public final /* synthetic */ TraceMetric.C33480b f81104b;

    public /* synthetic */ C33377f(AppStartTrace appStartTrace, TraceMetric.C33480b bVar) {
        this.f81103a = appStartTrace;
        this.f81104b = bVar;
    }

    public final void run() {
        this.f81103a.m134484w(this.f81104b);
    }
}
