package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import com.google.android.gms.measurement.internal.C30785k9;
import com.google.android.gms.measurement.internal.C30797l9;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C30785k9 {

    /* renamed from: a */
    public C30797l9 f73188a;

    /* renamed from: a */
    public final boolean mo86740a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo86741b(@C0359n0 Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: c */
    public final void mo86742c(@C0359n0 JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final C30797l9 mo86743d() {
        if (this.f73188a == null) {
            this.f73188a = new C30797l9(this);
        }
        return this.f73188a;
    }

    @C0353k0
    public void onCreate() {
        super.onCreate();
        mo86743d().mo87260e();
    }

    @C0353k0
    public void onDestroy() {
        mo86743d().mo87261f();
        super.onDestroy();
    }

    @C0353k0
    public void onRebind(@C0359n0 Intent intent) {
        mo86743d().mo87262g(intent);
    }

    public boolean onStartJob(@C0359n0 JobParameters jobParameters) {
        mo86743d().mo87264i(jobParameters);
        return true;
    }

    public boolean onStopJob(@C0359n0 JobParameters jobParameters) {
        return false;
    }

    @C0353k0
    public boolean onUnbind(@C0359n0 Intent intent) {
        mo86743d().mo87265j(intent);
        return true;
    }
}
