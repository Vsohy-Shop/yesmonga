package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17970d;
import androidx.work.C21377l;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21289t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21229i;
import androidx.work.impl.model.C21236l;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.utils.C21333m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@C0376v0(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemjob.g */
public class C21132g implements C21289t {

    /* renamed from: e */
    public static final String f54577e = C21377l.m98584i("SystemJobScheduler");

    /* renamed from: a */
    public final Context f54578a;

    /* renamed from: b */
    public final JobScheduler f54579b;

    /* renamed from: c */
    public final C21191g0 f54580c;

    /* renamed from: d */
    public final C21130f f54581d;

    public C21132g(@C0359n0 Context context, @C0359n0 C21191g0 g0Var) {
        this(context, g0Var, (JobScheduler) context.getSystemService("jobscheduler"), new C21130f(context));
    }

    /* renamed from: a */
    public static void m97778a(@C0359n0 Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m97781g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m97779d(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: d */
    public static void m97779d(@C0359n0 JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C21377l.m98582e().mo63777d(f54577e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    @C0363p0
    /* renamed from: f */
    public static List<Integer> m97780f(@C0359n0 Context context, @C0359n0 JobScheduler jobScheduler, @C0359n0 String str) {
        List<JobInfo> g = m97781g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g) {
            C21237m h = m97782h(next);
            if (h != null && str.equals(h.mo63437f())) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: g */
    public static List<JobInfo> m97781g(@C0359n0 Context context, @C0359n0 JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C21377l.m98582e().mo63777d(f54577e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: h */
    public static C21237m m97782h(@C0359n0 JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey(C21130f.f54572c)) {
                return null;
            }
            return new C21237m(extras.getString(C21130f.f54572c), extras.getInt(C21130f.f54574e, 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m97783i(@C0359n0 Context context, @C0359n0 C21191g0 g0Var) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m97781g(context, jobScheduler);
        List<String> d = g0Var.mo63363P().mo63204U().mo63427d();
        boolean z = false;
        if (g != null) {
            i = g.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (g != null && !g.isEmpty()) {
            for (JobInfo next : g) {
                C21237m h = m97782h(next);
                if (h != null) {
                    hashSet.add(h.mo63437f());
                } else {
                    m97779d(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C21377l.m98582e().mo63774a(f54577e, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase P = g0Var.mo63363P();
            P.mo60905e();
            try {
                C21253v X = P.mo63207X();
                for (String t : d) {
                    X.mo63547t(t, -1);
                }
                P.mo60901O();
            } finally {
                P.mo60908k();
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo63220b(@C0359n0 String str) {
        List<Integer> f = m97780f(this.f54578a, this.f54579b, str);
        if (f != null && !f.isEmpty()) {
            for (Integer intValue : f) {
                m97779d(this.f54579b, intValue.intValue());
            }
            this.f54580c.mo63363P().mo63204U().mo63430g(str);
        }
    }

    /* renamed from: c */
    public void mo63221c(@C0359n0 C21249u... uVarArr) {
        int i;
        WorkDatabase P = this.f54580c.mo63363P();
        C21333m mVar = new C21333m(P);
        int length = uVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C21249u uVar = uVarArr[i2];
            P.mo60905e();
            try {
                C21249u l = P.mo63207X().mo63539l(uVar.f54804a);
                if (l == null) {
                    C21377l e = C21377l.m98582e();
                    String str = f54577e;
                    e.mo63782l(str, "Skipping scheduling " + uVar.f54804a + " because it's no longer in the DB");
                    P.mo60901O();
                } else if (l.f54805b != WorkInfo.State.ENQUEUED) {
                    C21377l e2 = C21377l.m98582e();
                    String str2 = f54577e;
                    e2.mo63782l(str2, "Skipping scheduling " + uVar.f54804a + " because it is no longer enqueued");
                    P.mo60901O();
                } else {
                    C21237m a = C21273x.m98280a(uVar);
                    C21229i a2 = P.mo63204U().mo63424a(a);
                    if (a2 != null) {
                        i = a2.f54776c;
                    } else {
                        i = mVar.mo63687e(this.f54580c.mo63065o().mo63103i(), this.f54580c.mo63065o().mo63101g());
                    }
                    if (a2 == null) {
                        this.f54580c.mo63363P().mo63204U().mo63428e(C21236l.m98084a(a, i));
                    }
                    mo63272j(uVar, i);
                    P.mo60901O();
                }
                i2++;
            } finally {
                P.mo60908k();
            }
        }
    }

    /* renamed from: e */
    public boolean mo63223e() {
        return true;
    }

    @C0344h1
    /* renamed from: j */
    public void mo63272j(@C0359n0 C21249u uVar, int i) {
        int i2;
        JobInfo a = this.f54581d.mo63271a(uVar, i);
        C21377l e = C21377l.m98582e();
        String str = f54577e;
        e.mo63774a(str, "Scheduling work ID " + uVar.f54804a + "Job ID " + i);
        try {
            if (this.f54579b.schedule(a) == 0) {
                C21377l.m98582e().mo63782l(str, "Unable to schedule work ID " + uVar.f54804a);
                if (uVar.f54820q && uVar.f54821r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f54820q = false;
                    C21377l.m98582e().mo63774a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{uVar.f54804a}));
                    mo63272j(uVar, i);
                }
            }
        } catch (IllegalStateException e2) {
            List<JobInfo> g = m97781g(this.f54578a, this.f54579b);
            if (g != null) {
                i2 = g.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f54580c.mo63363P().mo63207X().mo63535h().size()), Integer.valueOf(this.f54580c.mo63065o().mo63102h())});
            C21377l.m98582e().mo63776c(f54577e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e2);
            C17970d<Throwable> l = this.f54580c.mo63065o().mo63106l();
            if (l != null) {
                l.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            C21377l.m98582e().mo63777d(f54577e, "Unable to schedule " + uVar, th);
        }
    }

    @C0344h1
    public C21132g(@C0359n0 Context context, @C0359n0 C21191g0 g0Var, @C0359n0 JobScheduler jobScheduler, @C0359n0 C21130f fVar) {
        this.f54578a = context;
        this.f54580c = g0Var;
        this.f54579b = jobScheduler;
        this.f54581d = fVar;
    }
}
