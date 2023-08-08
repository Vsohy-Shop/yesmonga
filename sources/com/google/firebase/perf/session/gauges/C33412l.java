package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.AndroidMemoryReading;
import com.google.firebase.perf.util.C33443k;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.session.gauges.l */
public class C33412l {

    /* renamed from: f */
    public static final C33363a f81208f = C33363a.m134449e();

    /* renamed from: g */
    public static final long f81209g = -1;

    /* renamed from: h */
    public static final int f81210h = -1;

    /* renamed from: a */
    public final ScheduledExecutorService f81211a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<AndroidMemoryReading> f81212b;

    /* renamed from: c */
    public final Runtime f81213c;
    @C0363p0

    /* renamed from: d */
    public ScheduledFuture f81214d;

    /* renamed from: e */
    public long f81215e;

    @SuppressLint({"ThreadPoolCreation"})
    public C33412l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: e */
    public static boolean m134714e(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m134715f(Timer timer) {
        AndroidMemoryReading l = mo96828l(timer);
        if (l != null) {
            this.f81212b.add(l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m134716g(Timer timer) {
        AndroidMemoryReading l = mo96828l(timer);
        if (l != null) {
            this.f81212b.add(l);
        }
    }

    /* renamed from: c */
    public void mo96822c(Timer timer) {
        mo96824h(timer);
    }

    /* renamed from: d */
    public final int mo96823d() {
        return C33443k.m134838d(StorageUnit.BYTES.mo96887r(this.f81213c.totalMemory() - this.f81213c.freeMemory()));
    }

    /* renamed from: h */
    public final synchronized void mo96824h(Timer timer) {
        try {
            this.f81211a.schedule(new C33411k(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C33363a aVar = f81208f;
            aVar.mo96439l("Unable to collect Memory Metric: " + e.getMessage());
        }
        return;
    }

    /* renamed from: i */
    public final synchronized void mo96825i(long j, Timer timer) {
        this.f81215e = j;
        try {
            this.f81214d = this.f81211a.scheduleAtFixedRate(new C33410j(this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C33363a aVar = f81208f;
            aVar.mo96439l("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: j */
    public void mo96826j(long j, Timer timer) {
        if (!m134714e(j)) {
            if (this.f81214d == null) {
                mo96825i(j, timer);
            } else if (this.f81215e != j) {
                mo96827k();
                mo96825i(j, timer);
            }
        }
    }

    /* renamed from: k */
    public void mo96827k() {
        ScheduledFuture scheduledFuture = this.f81214d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f81214d = null;
            this.f81215e = -1;
        }
    }

    @C0363p0
    /* renamed from: l */
    public final AndroidMemoryReading mo96828l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (AndroidMemoryReading) AndroidMemoryReading.newBuilder().mo96941S(timer.mo96890b()).mo96942T(mo96823d()).mo100473g();
    }

    @C0344h1
    public C33412l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f81214d = null;
        this.f81215e = -1;
        this.f81211a = scheduledExecutorService;
        this.f81212b = new ConcurrentLinkedQueue<>();
        this.f81213c = runtime;
    }
}
