package com.android.volley;

import android.os.Process;
import androidx.annotation.C0344h1;
import com.android.volley.C21751e;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.f */
public class C21753f extends Thread {

    /* renamed from: g */
    public static final boolean f56268g = C21776s.f56329b;

    /* renamed from: a */
    public final BlockingQueue<Request<?>> f56269a;

    /* renamed from: b */
    public final BlockingQueue<Request<?>> f56270b;

    /* renamed from: c */
    public final C21751e f56271c;

    /* renamed from: d */
    public final C21774q f56272d;

    /* renamed from: e */
    public volatile boolean f56273e = false;

    /* renamed from: f */
    public final C21779t f56274f;

    /* renamed from: com.android.volley.f$a */
    public class C21754a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Request f56275a;

        public C21754a(Request request) {
            this.f56275a = request;
        }

        public void run() {
            try {
                C21753f.this.f56270b.put(this.f56275a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public C21753f(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, C21751e eVar, C21774q qVar) {
        this.f56269a = blockingQueue;
        this.f56270b = blockingQueue2;
        this.f56271c = eVar;
        this.f56272d = qVar;
        this.f56274f = new C21779t(this, blockingQueue2, qVar);
    }

    /* renamed from: c */
    private void m100044c() throws InterruptedException {
        mo64920d(this.f56269a.take());
    }

    @C0344h1
    /* renamed from: d */
    public void mo64920d(Request<?> request) throws InterruptedException {
        request.mo64801g("cache-queue-take");
        request.mo64805l1(1);
        try {
            if (request.mo64791O0()) {
                request.mo64792Q("cache-discard-canceled");
                return;
            }
            C21751e.C21752a aVar = this.f56271c.get(request.mo64799e0());
            if (aVar == null) {
                request.mo64801g("cache-miss");
                if (!this.f56274f.mo64965c(request)) {
                    this.f56270b.put(request);
                }
                request.mo64805l1(2);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.mo64917b(currentTimeMillis)) {
                request.mo64801g("cache-hit-expired");
                request.mo64808n1(aVar);
                if (!this.f56274f.mo64965c(request)) {
                    this.f56270b.put(request);
                }
                request.mo64805l1(2);
                return;
            }
            request.mo64801g("cache-hit");
            C21771p<?> k1 = request.mo20305k1(new C21762l(aVar.f56260a, aVar.f56266g));
            request.mo64801g("cache-hit-parsed");
            if (!k1.mo64960b()) {
                request.mo64801g("cache-parsing-failed");
                this.f56271c.mo64876c(request.mo64799e0(), true);
                request.mo64808n1((C21751e.C21752a) null);
                if (!this.f56274f.mo64965c(request)) {
                    this.f56270b.put(request);
                }
                request.mo64805l1(2);
                return;
            }
            if (!aVar.mo64919d(currentTimeMillis)) {
                this.f56272d.mo64929a(request, k1);
            } else {
                request.mo64801g("cache-hit-refresh-needed");
                request.mo64808n1(aVar);
                k1.f56327d = true;
                if (!this.f56274f.mo64965c(request)) {
                    this.f56272d.mo64930b(request, k1, new C21754a(request));
                } else {
                    this.f56272d.mo64929a(request, k1);
                }
            }
            request.mo64805l1(2);
        } finally {
            request.mo64805l1(2);
        }
    }

    /* renamed from: e */
    public void mo64921e() {
        this.f56273e = true;
        interrupt();
    }

    public void run() {
        if (f56268g) {
            C21776s.m100102f("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f56271c.mo64875b();
        while (true) {
            try {
                m100044c();
            } catch (InterruptedException unused) {
                if (this.f56273e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C21776s.m100099c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
