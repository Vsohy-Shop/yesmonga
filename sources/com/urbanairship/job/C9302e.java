package com.urbanairship.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17970d;
import com.urbanairship.C36059m;
import com.urbanairship.job.C9310i;
import com.urbanairship.job.RateLimiter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.job.e */
public class C9302e {

    /* renamed from: g */
    public static final int f25372g = 5;

    /* renamed from: h */
    public static final long f25373h = TimeUnit.HOURS.toMillis(1);

    /* renamed from: i */
    public static final long f25374i = 1000;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: j */
    public static C9302e f25375j;

    /* renamed from: a */
    public final Context f25376a;

    /* renamed from: b */
    public final C9310i f25377b;

    /* renamed from: c */
    public final RateLimiter f25378c;

    /* renamed from: d */
    public final C9312j f25379d;

    /* renamed from: e */
    public final List<C9303a> f25380e;

    /* renamed from: f */
    public final Runnable f25381f;

    /* renamed from: com.urbanairship.job.e$a */
    public static class C9303a {
        @C0359n0

        /* renamed from: a */
        public final C9304f f25382a;

        /* renamed from: b */
        public final long f25383b;

        public C9303a(@C0359n0 C9304f fVar, long j) {
            this.f25382a = fVar;
            this.f25383b = j;
        }
    }

    public C9302e(@C0359n0 Context context) {
        this(context, new C9313k());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m34893h() {
        try {
            mo18706e();
        } catch (SchedulerException unused) {
            mo18710k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m34894i(C9304f fVar, long j, C17970d dVar, JobResult jobResult) {
        C36059m.m148419o("Job finished. Job info: %s, result: %s", fVar, jobResult);
        if (jobResult != JobResult.RETRY || j < 5) {
            dVar.accept(jobResult);
            return;
        }
        C36059m.m148419o("Job retry limit reached. Rescheduling for a later time. Job info: %s, work Id: %s", fVar);
        mo18705d(fVar, f25373h);
        dVar.accept(JobResult.FAILURE);
    }

    @C0344h1
    /* renamed from: l */
    public static void m34895l(@C0359n0 C9302e eVar) {
        synchronized (C9302e.class) {
            f25375j = eVar;
        }
    }

    @C0359n0
    /* renamed from: n */
    public static C9302e m34896n(@C0359n0 Context context) {
        if (f25375j == null) {
            synchronized (C9302e.class) {
                if (f25375j == null) {
                    f25375j = new C9302e(context);
                }
            }
        }
        return f25375j;
    }

    /* renamed from: c */
    public void mo18704c(@C0359n0 C9304f fVar) {
        mo18705d(fVar, mo18707f(fVar));
    }

    /* renamed from: d */
    public final void mo18705d(@C0359n0 C9304f fVar, long j) {
        try {
            mo18706e();
            this.f25379d.mo18737a(this.f25376a, fVar, j);
        } catch (SchedulerException e) {
            C36059m.m148411g(e, "Scheduler failed to schedule jobInfo", new Object[0]);
            synchronized (this.f25380e) {
                this.f25380e.add(new C9303a(fVar, j));
                mo18710k();
            }
        }
    }

    /* renamed from: e */
    public final void mo18706e() throws SchedulerException {
        synchronized (this.f25380e) {
            Iterator it = new ArrayList(this.f25380e).iterator();
            while (it.hasNext()) {
                C9303a aVar = (C9303a) it.next();
                this.f25379d.mo18737a(this.f25376a, aVar.f25382a, aVar.f25383b);
                this.f25380e.remove(aVar);
            }
        }
    }

    /* renamed from: f */
    public final long mo18707f(@C0359n0 C9304f fVar) {
        return Math.max(fVar.mo18718f(), mo18708g(fVar));
    }

    /* renamed from: g */
    public final long mo18708g(@C0359n0 C9304f fVar) {
        long j = 0;
        for (String c : fVar.mo18719g()) {
            RateLimiter.C9297b c2 = this.f25378c.mo18699c(c);
            if (c2 != null && c2.mo18701a() == RateLimiter.LimitStatus.OVER) {
                j = Math.max(j, c2.mo18702b(TimeUnit.MILLISECONDS));
            }
        }
        return j;
    }

    /* renamed from: j */
    public void mo18709j(@C0359n0 C9304f fVar, long j, @C0359n0 C17970d<JobResult> dVar) {
        C36059m.m148419o("Running job: %s, run attempt: %s", fVar, Long.valueOf(j));
        long g = mo18708g(fVar);
        if (g > 0) {
            dVar.accept(JobResult.FAILURE);
            mo18705d(fVar, g);
            return;
        }
        for (String d : fVar.mo18719g()) {
            this.f25378c.mo18700d(d);
        }
        this.f25377b.mo18735a(fVar, new C9301d(this, fVar, j, dVar));
    }

    /* renamed from: k */
    public final void mo18710k() {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.f25381f);
        handler.postDelayed(this.f25381f, 1000);
    }

    /* renamed from: m */
    public void mo18711m(@C0359n0 String str, @C0337f0(from = 1) int i, long j, @C0359n0 TimeUnit timeUnit) {
        this.f25378c.mo18698b(str, i, j, timeUnit);
    }

    @C0344h1
    public C9302e(@C0359n0 Context context, @C0359n0 C9312j jVar) {
        this(context, jVar, new C9310i.C9311a(), new RateLimiter());
    }

    @C0344h1
    public C9302e(@C0359n0 Context context, @C0359n0 C9312j jVar, @C0359n0 C9310i iVar, @C0359n0 RateLimiter rateLimiter) {
        this.f25380e = new ArrayList();
        this.f25381f = new C9300c(this);
        this.f25376a = context.getApplicationContext();
        this.f25379d = jVar;
        this.f25377b = iVar;
        this.f25378c = rateLimiter;
    }
}
