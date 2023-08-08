package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
public final /* synthetic */ class C30748h9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30797l9 f73580a;

    /* renamed from: b */
    public final /* synthetic */ C30899u3 f73581b;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f73582c;

    public /* synthetic */ C30748h9(C30797l9 l9Var, C30899u3 u3Var, JobParameters jobParameters) {
        this.f73580a = l9Var;
        this.f73581b = u3Var;
        this.f73582c = jobParameters;
    }

    public final void run() {
        this.f73580a.mo87259d(this.f73581b, this.f73582c);
    }
}
