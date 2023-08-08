package com.google.firebase.perf.transport;

import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.GaugeMetric;

/* renamed from: com.google.firebase.perf.transport.j */
public final /* synthetic */ class C33423j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33424k f81250a;

    /* renamed from: b */
    public final /* synthetic */ GaugeMetric f81251b;

    /* renamed from: c */
    public final /* synthetic */ ApplicationProcessState f81252c;

    public /* synthetic */ C33423j(C33424k kVar, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.f81250a = kVar;
        this.f81251b = gaugeMetric;
        this.f81252c = applicationProcessState;
    }

    public final void run() {
        this.f81250a.m134753B(this.f81251b, this.f81252c);
    }
}
