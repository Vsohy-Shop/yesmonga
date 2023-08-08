package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.internal.gtm.m4 */
public final /* synthetic */ class C41419m4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41491p4 f104788a;

    /* renamed from: b */
    public final /* synthetic */ C41202d4 f104789b;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f104790c;

    public /* synthetic */ C41419m4(C41491p4 p4Var, C41202d4 d4Var, JobParameters jobParameters) {
        this.f104788a = p4Var;
        this.f104789b = d4Var;
        this.f104790c = jobParameters;
    }

    public final void run() {
        this.f104788a.mo135704d(this.f104789b, this.f104790c);
    }
}
