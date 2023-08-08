package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.database.SQLException;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40086g;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.C40196m;
import com.google.android.gms.tasks.C31049l;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.C32668a0;
import com.google.firebase.crashlytics.internal.common.C32716p;
import com.google.firebase.crashlytics.internal.common.C32720q0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C32932d;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.crashlytics.internal.send.e */
public final class C32926e {

    /* renamed from: k */
    public static final int f79961k = 1000;

    /* renamed from: l */
    public static final int f79962l = 60000;

    /* renamed from: m */
    public static final int f79963m = 3600000;

    /* renamed from: a */
    public final double f79964a;

    /* renamed from: b */
    public final double f79965b;

    /* renamed from: c */
    public final long f79966c;

    /* renamed from: d */
    public final int f79967d;

    /* renamed from: e */
    public final BlockingQueue<Runnable> f79968e;

    /* renamed from: f */
    public final ThreadPoolExecutor f79969f;

    /* renamed from: g */
    public final C40086g<CrashlyticsReport> f79970g;

    /* renamed from: h */
    public final C32668a0 f79971h;

    /* renamed from: i */
    public int f79972i;

    /* renamed from: j */
    public long f79973j;

    /* renamed from: com.google.firebase.crashlytics.internal.send.e$b */
    public final class C32928b implements Runnable {

        /* renamed from: a */
        public final C32716p f79974a;

        /* renamed from: b */
        public final C31049l<C32716p> f79975b;

        public void run() {
            C32926e.this.mo95590p(this.f79974a, this.f79975b);
            C32926e.this.f79971h.mo94853e();
            double e = C32926e.this.mo95583g();
            C32741f f = C32741f.m132248f();
            f.mo95052b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e / 1000.0d)}) + " s for report: " + this.f79974a.mo94856d());
            C32926e.m133084q(e);
        }

        public C32928b(C32716p pVar, C31049l<C32716p> lVar) {
            this.f79974a = pVar;
            this.f79975b = lVar;
        }
    }

    public C32926e(C40086g<CrashlyticsReport> gVar, C32932d dVar, C32668a0 a0Var) {
        this(dVar.f80007f, dVar.f80008g, ((long) dVar.f80009h) * 1000, gVar, a0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m133082m(CountDownLatch countDownLatch) {
        try {
            C40196m.m163500b(this.f79970g, Priority.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m133083n(C31049l lVar, C32716p pVar, Exception exc) {
        if (exc != null) {
            lVar.mo87744d(exc);
            return;
        }
        mo95586j();
        lVar.mo87745e(pVar);
    }

    /* renamed from: q */
    public static void m133084q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    public final double mo95583g() {
        return Math.min(3600000.0d, (60000.0d / this.f79964a) * Math.pow(this.f79965b, (double) mo95584h()));
    }

    /* renamed from: h */
    public final int mo95584h() {
        int i;
        if (this.f79973j == 0) {
            this.f79973j = mo95589o();
        }
        int o = (int) ((mo95589o() - this.f79973j) / this.f79966c);
        if (mo95588l()) {
            i = Math.min(100, this.f79972i + o);
        } else {
            i = Math.max(0, this.f79972i - o);
        }
        if (this.f79972i != i) {
            this.f79972i = i;
            this.f79973j = mo95589o();
        }
        return i;
    }

    /* renamed from: i */
    public C31049l<C32716p> mo95585i(C32716p pVar, boolean z) {
        synchronized (this.f79968e) {
            C31049l<C32716p> lVar = new C31049l<>();
            if (z) {
                this.f79971h.mo94852d();
                if (mo95587k()) {
                    C32741f f = C32741f.m132248f();
                    f.mo95052b("Enqueueing report: " + pVar.mo94856d());
                    C32741f f2 = C32741f.m132248f();
                    f2.mo95052b("Queue size: " + this.f79968e.size());
                    this.f79969f.execute(new C32928b(pVar, lVar));
                    C32741f f3 = C32741f.m132248f();
                    f3.mo95052b("Closing task for report: " + pVar.mo94856d());
                    lVar.mo87745e(pVar);
                    return lVar;
                }
                mo95584h();
                C32741f f4 = C32741f.m132248f();
                f4.mo95052b("Dropping report due to queue being full: " + pVar.mo94856d());
                this.f79971h.mo94851c();
                lVar.mo87745e(pVar);
                return lVar;
            }
            mo95590p(pVar, lVar);
            return lVar;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    /* renamed from: j */
    public void mo95586j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new C32925d(this, countDownLatch)).start();
        C32720q0.m132171e(countDownLatch, 2, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final boolean mo95587k() {
        return this.f79968e.size() < this.f79967d;
    }

    /* renamed from: l */
    public final boolean mo95588l() {
        return this.f79968e.size() == this.f79967d;
    }

    /* renamed from: o */
    public final long mo95589o() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public final void mo95590p(C32716p pVar, C31049l<C32716p> lVar) {
        C32741f f = C32741f.m132248f();
        f.mo95052b("Sending report through Google DataTransport: " + pVar.mo94856d());
        this.f79970g.mo132666a(C40083d.m163244i(pVar.mo94854b()), new C32924c(this, lVar, pVar));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C32926e(double d, double d2, long j, C40086g<CrashlyticsReport> gVar, C32668a0 a0Var) {
        this.f79964a = d;
        this.f79965b = d2;
        this.f79966c = j;
        this.f79970g = gVar;
        this.f79971h = a0Var;
        int i = (int) d;
        this.f79967d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f79968e = arrayBlockingQueue;
        this.f79969f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f79972i = 0;
        this.f79973j = 0;
    }
}
