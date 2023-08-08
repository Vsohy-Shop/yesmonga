package com.google.android.gms.measurement.internal;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
public final class C30692d5 extends C30654a6 {

    /* renamed from: l */
    public static final AtomicLong f73287l = new AtomicLong(Long.MIN_VALUE);
    @C0363p0

    /* renamed from: c */
    public C30666b5 f73288c;
    @C0363p0

    /* renamed from: d */
    public C30666b5 f73289d;

    /* renamed from: e */
    public final PriorityBlockingQueue f73290e = new PriorityBlockingQueue();

    /* renamed from: f */
    public final BlockingQueue f73291f = new LinkedBlockingQueue();

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f73292g = new C30960z4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f73293h = new C30960z4(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i */
    public final Object f73294i = new Object();

    /* renamed from: j */
    public final Semaphore f73295j = new Semaphore(2);

    /* renamed from: k */
    public volatile boolean f73296k;

    public C30692d5(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: A */
    public final void mo86942A(Runnable runnable) throws IllegalStateException {
        mo86873k();
        C40843u.m166202l(runnable);
        mo86944D(new C30653a5(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo86943C() {
        return Thread.currentThread() == this.f73288c;
    }

    /* renamed from: D */
    public final void mo86944D(C30653a5 a5Var) {
        synchronized (this.f73294i) {
            this.f73290e.add(a5Var);
            C30666b5 b5Var = this.f73288c;
            if (b5Var == null) {
                C30666b5 b5Var2 = new C30666b5(this, "Measurement Worker", this.f73290e);
                this.f73288c = b5Var2;
                b5Var2.setUncaughtExceptionHandler(this.f73292g);
                this.f73288c.start();
            } else {
                b5Var.mo86896a();
            }
        }
    }

    /* renamed from: g */
    public final void mo86945g() {
        if (Thread.currentThread() != this.f73289d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo86866h() {
        if (Thread.currentThread() != this.f73288c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: j */
    public final boolean mo86872j() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f74136a.mo86903d().mo87494w();
        r3.mo87463a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f74136a.mo86903d().mo87494w().mo87463a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    @androidx.annotation.C0363p0
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86946r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.g5 r0 = r1.f74136a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.d5 r0 = r0.mo86904f()     // Catch:{ all -> 0x0049 }
            r0.mo86950z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.g5 r3 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87494w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo87463a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.google.android.gms.measurement.internal.g5 r3 = r1.f74136a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87494w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo87463a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30692d5.mo86946r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo86947s(Callable callable) throws IllegalStateException {
        mo86873k();
        C40843u.m166202l(callable);
        C30653a5 a5Var = new C30653a5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f73288c) {
            if (!this.f73290e.isEmpty()) {
                this.f74136a.mo86903d().mo87494w().mo87463a("Callable skipped the worker queue.");
            }
            a5Var.run();
        } else {
            mo86944D(a5Var);
        }
        return a5Var;
    }

    /* renamed from: t */
    public final Future mo86948t(Callable callable) throws IllegalStateException {
        mo86873k();
        C40843u.m166202l(callable);
        C30653a5 a5Var = new C30653a5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f73288c) {
            a5Var.run();
        } else {
            mo86944D(a5Var);
        }
        return a5Var;
    }

    /* renamed from: y */
    public final void mo86949y(Runnable runnable) throws IllegalStateException {
        mo86873k();
        C40843u.m166202l(runnable);
        C30653a5 a5Var = new C30653a5(this, runnable, false, "Task exception on network thread");
        synchronized (this.f73294i) {
            this.f73291f.add(a5Var);
            C30666b5 b5Var = this.f73289d;
            if (b5Var == null) {
                C30666b5 b5Var2 = new C30666b5(this, "Measurement Network", this.f73291f);
                this.f73289d = b5Var2;
                b5Var2.setUncaughtExceptionHandler(this.f73293h);
                this.f73289d.start();
            } else {
                b5Var.mo86896a();
            }
        }
    }

    /* renamed from: z */
    public final void mo86950z(Runnable runnable) throws IllegalStateException {
        mo86873k();
        C40843u.m166202l(runnable);
        mo86944D(new C30653a5(this, runnable, false, "Task exception on worker thread"));
    }
}
