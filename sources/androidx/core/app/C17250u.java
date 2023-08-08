package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.urbanairship.AirshipConfigOptions;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: androidx.core.app.u */
public abstract class C17250u extends Service {

    /* renamed from: v */
    public static final String f45536v = "JobIntentService";

    /* renamed from: w */
    public static final boolean f45537w = false;

    /* renamed from: x */
    public static final Object f45538x = new Object();

    /* renamed from: y */
    public static final HashMap<ComponentName, C17259h> f45539y = new HashMap<>();

    /* renamed from: a */
    public C17252b f45540a;

    /* renamed from: b */
    public C17259h f45541b;

    /* renamed from: c */
    public C17251a f45542c;

    /* renamed from: d */
    public boolean f45543d = false;

    /* renamed from: e */
    public boolean f45544e = false;

    /* renamed from: f */
    public boolean f45545f = false;

    /* renamed from: g */
    public final ArrayList<C17254d> f45546g;

    /* renamed from: androidx.core.app.u$a */
    public final class C17251a extends AsyncTask<Void, Void, Void> {
        public C17251a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C17255e a = C17250u.this.mo51702a();
                if (a == null) {
                    return null;
                }
                C17250u.this.mo51706h(a.getIntent());
                a.mo51727k();
            }
        }

        /* renamed from: b */
        public void onCancelled(Void voidR) {
            C17250u.this.mo51708j();
        }

        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            C17250u.this.mo51708j();
        }
    }

    /* renamed from: androidx.core.app.u$b */
    public interface C17252b {
        /* renamed from: a */
        IBinder mo51720a();

        /* renamed from: b */
        C17255e mo51721b();
    }

    /* renamed from: androidx.core.app.u$c */
    public static final class C17253c extends C17259h {

        /* renamed from: d */
        public final Context f45548d;

        /* renamed from: e */
        public final PowerManager.WakeLock f45549e;

        /* renamed from: f */
        public final PowerManager.WakeLock f45550f;

        /* renamed from: g */
        public boolean f45551g;

        /* renamed from: h */
        public boolean f45552h;

        public C17253c(Context context, ComponentName componentName) {
            super(componentName);
            this.f45548d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f45549e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f45550f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: a */
        public void mo51722a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f45565a);
            if (this.f45548d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f45551g) {
                        this.f45551g = true;
                        if (!this.f45552h) {
                            this.f45549e.acquire(AirshipConfigOptions.f87111Y);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo51723c() {
            synchronized (this) {
                if (this.f45552h) {
                    if (this.f45551g) {
                        this.f45549e.acquire(AirshipConfigOptions.f87111Y);
                    }
                    this.f45552h = false;
                    this.f45550f.release();
                }
            }
        }

        /* renamed from: d */
        public void mo51724d() {
            synchronized (this) {
                if (!this.f45552h) {
                    this.f45552h = true;
                    this.f45550f.acquire(600000);
                    this.f45549e.release();
                }
            }
        }

        /* renamed from: e */
        public void mo51725e() {
            synchronized (this) {
                this.f45551g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.u$d */
    public final class C17254d implements C17255e {

        /* renamed from: a */
        public final Intent f45553a;

        /* renamed from: b */
        public final int f45554b;

        public C17254d(Intent intent, int i) {
            this.f45553a = intent;
            this.f45554b = i;
        }

        public Intent getIntent() {
            return this.f45553a;
        }

        /* renamed from: k */
        public void mo51727k() {
            C17250u.this.stopSelf(this.f45554b);
        }
    }

    /* renamed from: androidx.core.app.u$e */
    public interface C17255e {
        Intent getIntent();

        /* renamed from: k */
        void mo51727k();
    }

    @C0376v0(26)
    /* renamed from: androidx.core.app.u$f */
    public static final class C17256f extends JobServiceEngine implements C17252b {

        /* renamed from: d */
        public static final String f45556d = "JobServiceEngineImpl";

        /* renamed from: e */
        public static final boolean f45557e = false;

        /* renamed from: a */
        public final C17250u f45558a;

        /* renamed from: b */
        public final Object f45559b = new Object();

        /* renamed from: c */
        public JobParameters f45560c;

        /* renamed from: androidx.core.app.u$f$a */
        public final class C17257a implements C17255e {

            /* renamed from: a */
            public final JobWorkItem f45561a;

            public C17257a(JobWorkItem jobWorkItem) {
                this.f45561a = jobWorkItem;
            }

            public Intent getIntent() {
                return this.f45561a.getIntent();
            }

            /* renamed from: k */
            public void mo51727k() {
                synchronized (C17256f.this.f45559b) {
                    JobParameters jobParameters = C17256f.this.f45560c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f45561a);
                    }
                }
            }
        }

        public C17256f(C17250u uVar) {
            super(uVar);
            this.f45558a = uVar;
        }

        /* renamed from: a */
        public IBinder mo51720a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f45558a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.C17250u.C17256f.C17257a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.C17250u.C17255e mo51721b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f45559b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f45560c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.u r2 = r3.f45558a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.u$f$a r0 = new androidx.core.app.u$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C17250u.C17256f.mo51721b():androidx.core.app.u$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f45560c = jobParameters;
            this.f45558a.mo51704e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f45558a.mo51703b();
            synchronized (this.f45559b) {
                this.f45560c = null;
            }
            return b;
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.app.u$g */
    public static final class C17258g extends C17259h {

        /* renamed from: d */
        public final JobInfo f45563d;

        /* renamed from: e */
        public final JobScheduler f45564e;

        public C17258g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo51730b(i);
            this.f45563d = new JobInfo.Builder(i, this.f45565a).setOverrideDeadline(0).build();
            this.f45564e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* renamed from: a */
        public void mo51722a(Intent intent) {
            JobScheduler jobScheduler = this.f45564e;
            JobInfo jobInfo = this.f45563d;
            C17009a0.m78727a();
            int unused = jobScheduler.enqueue(jobInfo, C17302z.m79697a(intent));
        }
    }

    /* renamed from: androidx.core.app.u$h */
    public static abstract class C17259h {

        /* renamed from: a */
        public final ComponentName f45565a;

        /* renamed from: b */
        public boolean f45566b;

        /* renamed from: c */
        public int f45567c;

        public C17259h(ComponentName componentName) {
            this.f45565a = componentName;
        }

        /* renamed from: a */
        public abstract void mo51722a(Intent intent);

        /* renamed from: b */
        public void mo51730b(int i) {
            if (!this.f45566b) {
                this.f45566b = true;
                this.f45567c = i;
            } else if (this.f45567c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f45567c);
            }
        }

        /* renamed from: c */
        public void mo51723c() {
        }

        /* renamed from: d */
        public void mo51724d() {
        }

        /* renamed from: e */
        public void mo51725e() {
        }
    }

    public C17250u() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45546g = null;
        } else {
            this.f45546g = new ArrayList<>();
        }
    }

    /* renamed from: c */
    public static void m79622c(@C0359n0 Context context, @C0359n0 ComponentName componentName, int i, @C0359n0 Intent intent) {
        if (intent != null) {
            synchronized (f45538x) {
                C17259h f = m79624f(context, componentName, true, i);
                f.mo51730b(i);
                f.mo51722a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: d */
    public static void m79623d(@C0359n0 Context context, @C0359n0 Class<?> cls, int i, @C0359n0 Intent intent) {
        m79622c(context, new ComponentName(context, cls), i, intent);
    }

    /* renamed from: f */
    public static C17259h m79624f(Context context, ComponentName componentName, boolean z, int i) {
        C17259h hVar;
        HashMap<ComponentName, C17259h> hashMap = f45539y;
        C17259h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C17253c(context, componentName);
        } else if (z) {
            hVar = new C17258g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C17259h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* renamed from: a */
    public C17255e mo51702a() {
        C17252b bVar = this.f45540a;
        if (bVar != null) {
            return bVar.mo51721b();
        }
        synchronized (this.f45546g) {
            if (this.f45546g.size() <= 0) {
                return null;
            }
            C17255e remove = this.f45546g.remove(0);
            return remove;
        }
    }

    /* renamed from: b */
    public boolean mo51703b() {
        C17251a aVar = this.f45542c;
        if (aVar != null) {
            aVar.cancel(this.f45543d);
        }
        this.f45544e = true;
        return mo51707i();
    }

    /* renamed from: e */
    public void mo51704e(boolean z) {
        if (this.f45542c == null) {
            this.f45542c = new C17251a();
            C17259h hVar = this.f45541b;
            if (hVar != null && z) {
                hVar.mo51724d();
            }
            this.f45542c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: g */
    public boolean mo51705g() {
        return this.f45544e;
    }

    /* renamed from: h */
    public abstract void mo51706h(@C0359n0 Intent intent);

    /* renamed from: i */
    public boolean mo51707i() {
        return true;
    }

    /* renamed from: j */
    public void mo51708j() {
        ArrayList<C17254d> arrayList = this.f45546g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f45542c = null;
                ArrayList<C17254d> arrayList2 = this.f45546g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo51704e(false);
                } else if (!this.f45545f) {
                    this.f45541b.mo51723c();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo51709k(boolean z) {
        this.f45543d = z;
    }

    public IBinder onBind(@C0359n0 Intent intent) {
        C17252b bVar = this.f45540a;
        if (bVar != null) {
            return bVar.mo51720a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45540a = new C17256f(this);
            this.f45541b = null;
            return;
        }
        this.f45540a = null;
        this.f45541b = m79624f(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C17254d> arrayList = this.f45546g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f45545f = true;
                this.f45541b.mo51723c();
            }
        }
    }

    public int onStartCommand(@C0363p0 Intent intent, int i, int i2) {
        if (this.f45546g == null) {
            return 2;
        }
        this.f45541b.mo51725e();
        synchronized (this.f45546g) {
            ArrayList<C17254d> arrayList = this.f45546g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C17254d(intent, i2));
            mo51704e(true);
        }
        return 3;
    }
}
