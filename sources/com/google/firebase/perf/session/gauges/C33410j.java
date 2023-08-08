package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.j */
public final /* synthetic */ class C33410j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33412l f81204a;

    /* renamed from: b */
    public final /* synthetic */ Timer f81205b;

    public /* synthetic */ C33410j(C33412l lVar, Timer timer) {
        this.f81204a = lVar;
        this.f81205b = timer;
    }

    public final void run() {
        this.f81204a.m134716g(this.f81205b);
    }
}
