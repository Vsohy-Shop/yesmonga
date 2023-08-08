package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.p049v1.GaugeMetric;

/* renamed from: com.google.firebase.perf.metrics.validator.b */
public final class C33385b extends C33388e {

    /* renamed from: a */
    public final GaugeMetric f81130a;

    public C33385b(GaugeMetric gaugeMetric) {
        this.f81130a = gaugeMetric;
    }

    /* renamed from: c */
    public boolean mo96558c() {
        if (!this.f81130a.hasSessionId() || (this.f81130a.getCpuMetricReadingsCount() <= 0 && this.f81130a.getAndroidMemoryReadingsCount() <= 0 && (!this.f81130a.hasGaugeMetadata() || !this.f81130a.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()))) {
            return false;
        }
        return true;
    }
}
