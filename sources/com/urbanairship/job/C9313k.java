package com.urbanairship.job;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.work.BackoffPolicy;
import androidx.work.C21087c;
import androidx.work.C21091d;
import androidx.work.C21379m;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.google.firebase.installations.C33124s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.job.k */
public class C9313k implements C9312j {

    /* renamed from: a */
    public static final String f25413a = "job_info";

    /* renamed from: b */
    public static final String f25414b = "airship";

    @C0359n0
    /* renamed from: b */
    public static ExistingWorkPolicy m34942b(int i) {
        if (i == 0) {
            return ExistingWorkPolicy.REPLACE;
        }
        if (i != 1) {
            return ExistingWorkPolicy.KEEP;
        }
        return ExistingWorkPolicy.APPEND_OR_REPLACE;
    }

    @C0359n0
    /* renamed from: c */
    public static C21087c m34943c(@C0359n0 C9304f fVar) {
        NetworkType networkType;
        C21087c.C21088a aVar = new C21087c.C21088a();
        if (fVar.mo18720h()) {
            networkType = NetworkType.CONNECTED;
        } else {
            networkType = NetworkType.NOT_REQUIRED;
        }
        return aVar.mo63138c(networkType).mo63137b();
    }

    /* renamed from: d */
    public static C21379m m34944d(@C0359n0 C9304f fVar, long j) {
        C21091d a = C9314l.m34946a(fVar);
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        long e = fVar.mo18716e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C21379m.C21380a aVar = (C21379m.C21380a) ((C21379m.C21380a) ((C21379m.C21380a) ((C21379m.C21380a) new C21379m.C21380a(AirshipWorker.class).mo63861a(f25414b)).mo63881w(a)).mo63870l(backoffPolicy, e, timeUnit)).mo63873o(m34943c(fVar));
        if (j > 0) {
            aVar.mo63877s(j, timeUnit);
        }
        return (C21379m) aVar.mo63862b();
    }

    /* renamed from: a */
    public void mo18737a(@C0359n0 Context context, @C0359n0 C9304f fVar, long j) throws SchedulerException {
        try {
            C21379m d = m34944d(fVar, j);
            ExistingWorkPolicy b = m34942b(fVar.mo18714c());
            WorkManager.m97474q(context).mo63063m(fVar.mo18713b() + C33124s.f80355c + fVar.mo18712a(), b, d);
        } catch (Exception e) {
            throw new SchedulerException("Failed to schedule job", e);
        }
    }
}
