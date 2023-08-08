package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.CpuMetricReading;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.session.gauges.c */
public class C33403c {

    /* renamed from: g */
    public static final C33363a f81178g = C33363a.m134449e();

    /* renamed from: h */
    public static final long f81179h = -1;

    /* renamed from: i */
    public static final int f81180i = -1;

    /* renamed from: j */
    public static final int f81181j = -1;

    /* renamed from: k */
    public static final int f81182k = 13;

    /* renamed from: l */
    public static final int f81183l = 14;

    /* renamed from: m */
    public static final int f81184m = 15;

    /* renamed from: n */
    public static final int f81185n = 16;

    /* renamed from: o */
    public static final long f81186o = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<CpuMetricReading> f81187a;

    /* renamed from: b */
    public final ScheduledExecutorService f81188b;

    /* renamed from: c */
    public final String f81189c;

    /* renamed from: d */
    public final long f81190d;
    @C0363p0

    /* renamed from: e */
    public ScheduledFuture f81191e;

    /* renamed from: f */
    public long f81192f;

    @SuppressLint({"ThreadPoolCreation"})
    public C33403c() {
        this.f81191e = null;
        this.f81192f = -1;
        this.f81187a = new ConcurrentLinkedQueue<>();
        this.f81188b = Executors.newSingleThreadScheduledExecutor();
        int myPid = Process.myPid();
        this.f81189c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f81190d = mo96808e();
    }

    /* renamed from: f */
    public static boolean m134697f(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m134698g(Timer timer) {
        CpuMetricReading m = mo96813m(timer);
        if (m != null) {
            this.f81187a.add(m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m134699h(Timer timer) {
        CpuMetricReading m = mo96813m(timer);
        if (m != null) {
            this.f81187a.add(m);
        }
    }

    /* renamed from: c */
    public void mo96806c(Timer timer) {
        mo96809i(timer);
    }

    /* renamed from: d */
    public final long mo96807d(long j) {
        return Math.round((((double) j) / ((double) this.f81190d)) * ((double) f81186o));
    }

    /* renamed from: e */
    public final long mo96808e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: i */
    public final synchronized void mo96809i(Timer timer) {
        try {
            this.f81188b.schedule(new C33402b(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C33363a aVar = f81178g;
            aVar.mo96439l("Unable to collect Cpu Metric: " + e.getMessage());
        }
        return;
    }

    /* renamed from: j */
    public final synchronized void mo96810j(long j, Timer timer) {
        this.f81192f = j;
        try {
            this.f81191e = this.f81188b.scheduleAtFixedRate(new C33401a(this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C33363a aVar = f81178g;
            aVar.mo96439l("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: k */
    public void mo96811k(long j, Timer timer) {
        long j2 = this.f81190d;
        if (j2 != -1 && j2 != 0 && !m134697f(j)) {
            if (this.f81191e == null) {
                mo96810j(j, timer);
            } else if (this.f81192f != j) {
                mo96812l();
                mo96810j(j, timer);
            }
        }
    }

    /* renamed from: l */
    public void mo96812l() {
        ScheduledFuture scheduledFuture = this.f81191e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f81191e = null;
            this.f81192f = -1;
        }
    }

    @C0363p0
    /* renamed from: m */
    public final CpuMetricReading mo96813m(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f81189c));
            long b = timer.mo96890b();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            CpuMetricReading cpuMetricReading = (CpuMetricReading) CpuMetricReading.newBuilder().mo96985T(b).mo96986U(mo96807d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).mo96987V(mo96807d(parseLong + parseLong2)).mo100473g();
            bufferedReader.close();
            return cpuMetricReading;
        } catch (IOException e) {
            C33363a aVar = f81178g;
            aVar.mo96439l("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            C33363a aVar2 = f81178g;
            aVar2.mo96439l("Unexpected '/proc/[pid]/stat' file format encountered: " + e2.getMessage());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0344h1
    public C33403c(ScheduledExecutorService scheduledExecutorService, String str, long j) {
        this.f81191e = null;
        this.f81192f = -1;
        this.f81187a = new ConcurrentLinkedQueue<>();
        this.f81188b = scheduledExecutorService;
        this.f81189c = str;
        this.f81190d = j;
    }
}
