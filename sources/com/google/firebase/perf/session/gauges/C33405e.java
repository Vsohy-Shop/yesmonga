package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.p049v1.ApplicationProcessState;

/* renamed from: com.google.firebase.perf.session.gauges.e */
public final /* synthetic */ class C33405e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GaugeManager f81196a;

    /* renamed from: b */
    public final /* synthetic */ String f81197b;

    /* renamed from: c */
    public final /* synthetic */ ApplicationProcessState f81198c;

    public /* synthetic */ C33405e(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.f81196a = gaugeManager;
        this.f81197b = str;
        this.f81198c = applicationProcessState;
    }

    public final void run() {
        this.f81196a.lambda$startCollectingGauges$2(this.f81197b, this.f81198c);
    }
}
