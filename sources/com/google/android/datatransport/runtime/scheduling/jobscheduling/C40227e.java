package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.C0344h1;
import androidx.annotation.C0376v0;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.logging.C40195a;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.util.C40321a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

@C0376v0(api = 21)
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
public class C40227e implements C40246x {

    /* renamed from: d */
    public static final String f102510d = "JobInfoScheduler";

    /* renamed from: e */
    public static final String f102511e = "attemptNumber";

    /* renamed from: f */
    public static final String f102512f = "backendName";

    /* renamed from: g */
    public static final String f102513g = "priority";

    /* renamed from: h */
    public static final String f102514h = "extras";

    /* renamed from: a */
    public final Context f102515a;

    /* renamed from: b */
    public final C40255d f102516b;

    /* renamed from: c */
    public final SchedulerConfig f102517c;

    public C40227e(Context context, C40255d dVar, SchedulerConfig schedulerConfig) {
        this.f102515a = context;
        this.f102516b = dVar;
        this.f102517c = schedulerConfig;
    }

    /* renamed from: a */
    public void mo132880a(C40203r rVar, int i) {
        mo132881b(rVar, i, false);
    }

    /* renamed from: b */
    public void mo132881b(C40203r rVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f102515a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f102515a.getSystemService("jobscheduler");
        int c = mo132890c(rVar);
        if (z || !mo132891d(jobScheduler, c, i)) {
            long S1 = this.f102516b.mo132930S1(rVar);
            JobInfo.Builder c2 = this.f102517c.mo132864c(new JobInfo.Builder(c, componentName), rVar.mo132739d(), S1, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", rVar.mo132737b());
            persistableBundle.putInt("priority", C40321a.m163826a(rVar.mo132739d()));
            if (rVar.mo132738c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(rVar.mo132738c(), 0));
            }
            c2.setExtras(persistableBundle);
            C40195a.m163494e(f102510d, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", rVar, Integer.valueOf(c), Long.valueOf(this.f102517c.mo132867h(rVar.mo132739d(), S1, i)), Long.valueOf(S1), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C40195a.m163492c(f102510d, "Upload for context %s is already scheduled. Returning...", rVar);
    }

    @C0344h1
    /* renamed from: c */
    public int mo132890c(C40203r rVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f102515a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rVar.mo132737b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C40321a.m163826a(rVar.mo132739d())).array());
        if (rVar.mo132738c() != null) {
            adler32.update(rVar.mo132738c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean mo132891d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
