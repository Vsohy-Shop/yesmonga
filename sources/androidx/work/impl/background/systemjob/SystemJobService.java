package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.PersistableBundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.C21176e;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21361v;
import androidx.work.impl.C21362w;
import androidx.work.impl.model.C21237m;
import java.util.HashMap;
import java.util.Map;

@C0376v0(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements C21176e {

    /* renamed from: d */
    public static final String f54567d = C21377l.m98584i("SystemJobService");

    /* renamed from: a */
    public C21191g0 f54568a;

    /* renamed from: b */
    public final Map<C21237m, JobParameters> f54569b = new HashMap();

    /* renamed from: c */
    public final C21362w f54570c = new C21362w();

    @C0376v0(24)
    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    public static class C21123a {
        @C0373u
        /* renamed from: a */
        public static String[] m97766a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @C0373u
        /* renamed from: b */
        public static Uri[] m97767b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    public static class C21124b {
        @C0373u
        /* renamed from: a */
        public static Network m97768a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @C0363p0
    /* renamed from: a */
    public static C21237m m97764a(@C0359n0 JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey(C21130f.f54572c)) {
                return null;
            }
            return new C21237m(extras.getString(C21130f.f54572c), extras.getInt(C21130f.f54574e));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo63222d(@C0359n0 C21237m mVar, boolean z) {
        JobParameters remove;
        C21377l e = C21377l.m98582e();
        String str = f54567d;
        e.mo63774a(str, mVar.mo63437f() + " executed on JobScheduler");
        synchronized (this.f54569b) {
            remove = this.f54569b.remove(mVar);
        }
        this.f54570c.mo63720b(mVar);
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C21191g0 J = C21191g0.m97937J(getApplicationContext());
            this.f54568a = J;
            J.mo63359L().mo63604g(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C21377l.m98582e().mo63782l(f54567d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C21191g0 g0Var = this.f54568a;
        if (g0Var != null) {
            g0Var.mo63359L().mo63609o(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = new androidx.work.WorkerParameters.C21081a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97767b(r8) == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r3.f54387b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97767b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97766a(r8) == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r3.f54386a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97766a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r2 < 28) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r3.f54388c = androidx.work.impl.background.systemjob.SystemJobService.C21124b.m97768a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r7.f54568a.mo63371Y(r7.f54570c.mo63723e(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(@androidx.annotation.C0359n0 android.app.job.JobParameters r8) {
        /*
            r7 = this;
            androidx.work.impl.g0 r0 = r7.f54568a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            androidx.work.l r0 = androidx.work.C21377l.m98582e()
            java.lang.String r3 = f54567d
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.mo63774a(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L_0x0015:
            androidx.work.impl.model.m r0 = m97764a(r8)
            if (r0 != 0) goto L_0x0027
            androidx.work.l r8 = androidx.work.C21377l.m98582e()
            java.lang.String r0 = f54567d
            java.lang.String r1 = "WorkSpec id not found!"
            r8.mo63776c(r0, r1)
            return r2
        L_0x0027:
            java.util.Map<androidx.work.impl.model.m, android.app.job.JobParameters> r3 = r7.f54569b
            monitor-enter(r3)
            java.util.Map<androidx.work.impl.model.m, android.app.job.JobParameters> r4 = r7.f54569b     // Catch:{ all -> 0x00ab }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x004e
            androidx.work.l r8 = androidx.work.C21377l.m98582e()     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = f54567d     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r4.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = "Job is already being executed by SystemJobService: "
            r4.append(r5)     // Catch:{ all -> 0x00ab }
            r4.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ab }
            r8.mo63774a(r1, r0)     // Catch:{ all -> 0x00ab }
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            return r2
        L_0x004e:
            androidx.work.l r2 = androidx.work.C21377l.m98582e()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = f54567d     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r5.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = "onStartJob for "
            r5.append(r6)     // Catch:{ all -> 0x00ab }
            r5.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ab }
            r2.mo63774a(r4, r5)     // Catch:{ all -> 0x00ab }
            java.util.Map<androidx.work.impl.model.m, android.app.job.JobParameters> r2 = r7.f54569b     // Catch:{ all -> 0x00ab }
            r2.put(r0, r8)     // Catch:{ all -> 0x00ab }
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97767b(r8)
            if (r4 == 0) goto L_0x0085
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97767b(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f54387b = r4
        L_0x0085:
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97766a(r8)
            if (r4 == 0) goto L_0x0095
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C21123a.m97766a(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f54386a = r4
        L_0x0095:
            r4 = 28
            if (r2 < r4) goto L_0x009f
            android.net.Network r8 = androidx.work.impl.background.systemjob.SystemJobService.C21124b.m97768a(r8)
            r3.f54388c = r8
        L_0x009f:
            androidx.work.impl.g0 r8 = r7.f54568a
            androidx.work.impl.w r2 = r7.f54570c
            androidx.work.impl.v r0 = r2.mo63723e(r0)
            r8.mo63371Y(r0, r3)
            return r1
        L_0x00ab:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(@C0359n0 JobParameters jobParameters) {
        if (this.f54568a == null) {
            C21377l.m98582e().mo63774a(f54567d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C21237m a = m97764a(jobParameters);
        if (a == null) {
            C21377l.m98582e().mo63776c(f54567d, "WorkSpec id not found!");
            return false;
        }
        C21377l e = C21377l.m98582e();
        String str = f54567d;
        e.mo63774a(str, "onStopJob for " + a);
        synchronized (this.f54569b) {
            this.f54569b.remove(a);
        }
        C21361v b = this.f54570c.mo63720b(a);
        if (b != null) {
            this.f54568a.mo63373a0(b);
        }
        return !this.f54568a.mo63359L().mo63607k(a.mo63437f());
    }
}
