package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
public final /* synthetic */ class C40228f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobInfoSchedulerService f102518a;

    /* renamed from: b */
    public final /* synthetic */ JobParameters f102519b;

    public /* synthetic */ C40228f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f102518a = jobInfoSchedulerService;
        this.f102519b = jobParameters;
    }

    public final void run() {
        this.f102518a.m163553b(this.f102519b);
    }
}
