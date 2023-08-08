package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import androidx.annotation.C0359n0;
import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.crashlytics.internal.common.q0 */
public final class C32720q0 {

    /* renamed from: a */
    public static final ExecutorService f79436a = C32725t.m132193c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: com.google.firebase.crashlytics.internal.common.q0$a */
    public class C32721a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callable f79437a;

        /* renamed from: b */
        public final /* synthetic */ C31049l f79438b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.q0$a$a */
        public class C32722a implements C31031c<T, Void> {
            public C32722a() {
            }

            /* renamed from: b */
            public Void mo85756a(@C0359n0 C31047k<T> kVar) throws Exception {
                if (kVar.mo87738v()) {
                    C32721a.this.f79438b.mo87743c(kVar.mo87734r());
                    return null;
                }
                C32721a.this.f79438b.mo87742b(kVar.mo87733q());
                return null;
            }
        }

        public C32721a(Callable callable, C31049l lVar) {
            this.f79437a = callable;
            this.f79438b = lVar;
        }

        @SuppressLint({"TaskMainThread"})
        public void run() {
            try {
                ((C31047k) this.f79437a.call()).mo87729m(new C32722a());
            } catch (Exception e) {
                this.f79438b.mo87742b(e);
            }
        }
    }

    /* renamed from: d */
    public static <T> T m132170d(C31047k<T> kVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        kVar.mo87730n(f79436a, new C32715o0(countDownLatch));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (kVar.mo87738v()) {
            return kVar.mo87734r();
        }
        if (kVar.mo87736t()) {
            throw new CancellationException("Task is already canceled");
        } else if (kVar.mo87737u()) {
            throw new IllegalStateException(kVar.mo87733q());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: e */
    public static boolean m132171e(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static <T> C31047k<T> m132172f(Executor executor, Callable<C31047k<T>> callable) {
        C31049l lVar = new C31049l();
        executor.execute(new C32721a(callable, lVar));
        return lVar.mo87741a();
    }

    /* renamed from: h */
    public static /* synthetic */ Void m132174h(C31049l lVar, C31047k kVar) throws Exception {
        if (kVar.mo87738v()) {
            lVar.mo87745e(kVar.mo87734r());
            return null;
        }
        Exception q = kVar.mo87733q();
        Objects.requireNonNull(q);
        lVar.mo87744d(q);
        return null;
    }

    /* renamed from: i */
    public static /* synthetic */ Void m132175i(C31049l lVar, C31047k kVar) throws Exception {
        if (kVar.mo87738v()) {
            lVar.mo87745e(kVar.mo87734r());
            return null;
        }
        Exception q = kVar.mo87733q();
        Objects.requireNonNull(q);
        lVar.mo87744d(q);
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: j */
    public static <T> C31047k<T> m132176j(C31047k<T> kVar, C31047k<T> kVar2) {
        C31049l lVar = new C31049l();
        C32713n0 n0Var = new C32713n0(lVar);
        kVar.mo87729m(n0Var);
        kVar2.mo87729m(n0Var);
        return lVar.mo87741a();
    }

    /* renamed from: k */
    public static <T> C31047k<T> m132177k(Executor executor, C31047k<T> kVar, C31047k<T> kVar2) {
        C31049l lVar = new C31049l();
        C32717p0 p0Var = new C32717p0(lVar);
        kVar.mo87730n(executor, p0Var);
        kVar2.mo87730n(executor, p0Var);
        return lVar.mo87741a();
    }
}
