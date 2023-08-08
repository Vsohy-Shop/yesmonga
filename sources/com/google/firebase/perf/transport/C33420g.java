package com.google.firebase.perf.transport;

import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.NetworkRequestMetric;

/* renamed from: com.google.firebase.perf.transport.g */
public final /* synthetic */ class C33420g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33424k f81244a;

    /* renamed from: b */
    public final /* synthetic */ NetworkRequestMetric f81245b;

    /* renamed from: c */
    public final /* synthetic */ ApplicationProcessState f81246c;

    public /* synthetic */ C33420g(C33424k kVar, NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.f81244a = kVar;
        this.f81245b = networkRequestMetric;
        this.f81246c = applicationProcessState;
    }

    public final void run() {
        this.f81244a.m134752A(this.f81245b, this.f81246c);
    }
}
