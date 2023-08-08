package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.C0376v0;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.C40323w;
import com.google.android.datatransport.runtime.util.C40321a;

@C0376v0(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163553b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C40323w.m163831f(getApplicationContext());
        C40203r.C40204a d = C40203r.m163518a().mo132743b(string).mo132745d(C40321a.m163827b(i));
        if (string2 != null) {
            d.mo132744c(Base64.decode(string2, 0));
        }
        C40323w.m163829c().mo132984e().mo132897v(d.mo132742a(), i2, new C40228f(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
