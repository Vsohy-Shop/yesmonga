package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.a */
public final /* synthetic */ class C33401a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33403c f81174a;

    /* renamed from: b */
    public final /* synthetic */ Timer f81175b;

    public /* synthetic */ C33401a(C33403c cVar, Timer timer) {
        this.f81174a = cVar;
        this.f81175b = timer;
    }

    public final void run() {
        this.f81174a.m134699h(this.f81175b);
    }
}
