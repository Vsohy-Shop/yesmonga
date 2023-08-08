package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.p049v1.ApplicationProcessState;

/* renamed from: com.google.firebase.perf.session.gauges.d */
public final /* synthetic */ class C33404d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GaugeManager f81193a;

    /* renamed from: b */
    public final /* synthetic */ String f81194b;

    /* renamed from: c */
    public final /* synthetic */ ApplicationProcessState f81195c;

    public /* synthetic */ C33404d(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.f81193a = gaugeManager;
        this.f81194b = str;
        this.f81195c = applicationProcessState;
    }

    public final void run() {
        this.f81193a.lambda$stopCollectingGauges$3(this.f81194b, this.f81195c);
    }
}
