package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* renamed from: com.google.firebase.perf.session.gauges.k */
public final /* synthetic */ class C33411k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33412l f81206a;

    /* renamed from: b */
    public final /* synthetic */ Timer f81207b;

    public /* synthetic */ C33411k(C33412l lVar, Timer timer) {
        this.f81206a = lVar;
        this.f81207b = timer;
    }

    public final void run() {
        this.f81206a.m134715f(this.f81207b);
    }
}
