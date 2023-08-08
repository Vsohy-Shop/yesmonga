package com.google.firebase.perf.transport;

import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.TraceMetric;

/* renamed from: com.google.firebase.perf.transport.e */
public final /* synthetic */ class C33418e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33424k f81240a;

    /* renamed from: b */
    public final /* synthetic */ TraceMetric f81241b;

    /* renamed from: c */
    public final /* synthetic */ ApplicationProcessState f81242c;

    public /* synthetic */ C33418e(C33424k kVar, TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.f81240a = kVar;
        this.f81241b = traceMetric;
        this.f81242c = applicationProcessState;
    }

    public final void run() {
        this.f81240a.m134768z(this.f81241b, this.f81242c);
    }
}
