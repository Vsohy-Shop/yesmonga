package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.b */
public final /* synthetic */ class C33402b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33403c f81176a;

    /* renamed from: b */
    public final /* synthetic */ Timer f81177b;

    public /* synthetic */ C33402b(C33403c cVar, Timer timer) {
        this.f81176a = cVar;
        this.f81177b = timer;
    }

    public final void run() {
        this.f81176a.m134698g(this.f81177b);
    }
}
