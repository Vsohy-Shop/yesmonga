package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.C0344h1;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.k */
public class C21761k extends Thread {

    /* renamed from: a */
    public final BlockingQueue<Request<?>> f56292a;

    /* renamed from: b */
    public final C21760j f56293b;

    /* renamed from: c */
    public final C21751e f56294c;

    /* renamed from: d */
    public final C21774q f56295d;

    /* renamed from: e */
    public volatile boolean f56296e = false;

    public C21761k(BlockingQueue<Request<?>> blockingQueue, C21760j jVar, C21751e eVar, C21774q qVar) {
        this.f56292a = blockingQueue;
        this.f56293b = jVar;
        this.f56294c = eVar;
        this.f56295d = qVar;
    }

    /* renamed from: c */
    private void m100058c() throws InterruptedException {
        mo64941d(this.f56292a.take());
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void mo64939a(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.mo64787K0());
    }

    /* renamed from: b */
    public final void mo64940b(Request<?> request, VolleyError volleyError) {
        this.f56295d.mo64931c(request, request.mo64804j1(volleyError));
    }

    @C0344h1
    /* renamed from: d */
    public void mo64941d(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.mo64805l1(3);
        try {
            request.mo64801g("network-queue-take");
            if (request.mo64791O0()) {
                request.mo64792Q("network-discard-cancelled");
                request.mo64794U0();
                request.mo64805l1(4);
                return;
            }
            mo64939a(request);
            C21762l a = this.f56293b.mo64834a(request);
            request.mo64801g("network-http-complete");
            if (!a.f56301e || !request.mo64790N0()) {
                C21771p<?> k1 = request.mo20305k1(a);
                request.mo64801g("network-parse-complete");
                if (request.mo64785H1() && k1.f56325b != null) {
                    this.f56294c.mo64878d(request.mo64799e0(), k1.f56325b);
                    request.mo64801g("network-cache-written");
                }
                request.mo64793R0();
                this.f56295d.mo64929a(request, k1);
                request.mo64797c1(k1);
                request.mo64805l1(4);
                return;
            }
            request.mo64792Q("not-modified");
            request.mo64794U0();
            request.mo64805l1(4);
        } catch (VolleyError e) {
            e.mo64825b(SystemClock.elapsedRealtime() - elapsedRealtime);
            mo64940b(request, e);
            request.mo64794U0();
        } catch (Exception e2) {
            C21776s.m100100d(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError((Throwable) e2);
            volleyError.mo64825b(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f56295d.mo64931c(request, volleyError);
            request.mo64794U0();
        } catch (Throwable th) {
            request.mo64805l1(4);
            throw th;
        }
    }

    /* renamed from: e */
    public void mo64942e() {
        this.f56296e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m100058c();
            } catch (InterruptedException unused) {
                if (this.f56296e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C21776s.m100099c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
