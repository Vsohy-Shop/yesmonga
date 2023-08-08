package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.concurrent.o */
public class C32629o implements ScheduledExecutorService {

    /* renamed from: a */
    public final ExecutorService f79188a;

    /* renamed from: b */
    public final ScheduledExecutorService f79189b;

    public C32629o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f79188a = executorService;
        this.f79189b = scheduledExecutorService;
    }

    /* renamed from: n */
    public static /* synthetic */ void m131819n(Runnable runnable, C32630p.C32632b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.mo94804a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m131820o(Runnable runnable, C32630p.C32632b bVar) {
        this.f79188a.execute(new C32628n(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ ScheduledFuture m131821p(Runnable runnable, long j, TimeUnit timeUnit, C32630p.C32632b bVar) {
        return this.f79189b.schedule(new C32627m(this, runnable, bVar), j, timeUnit);
    }

    /* renamed from: q */
    public static /* synthetic */ void m131822q(Callable callable, C32630p.C32632b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.mo94804a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Future m131823r(Callable callable, C32630p.C32632b bVar) throws Exception {
        return this.f79188a.submit(new C32620f(callable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ ScheduledFuture m131824s(Callable callable, long j, TimeUnit timeUnit, C32630p.C32632b bVar) {
        return this.f79189b.schedule(new C32619e(this, callable, bVar), j, timeUnit);
    }

    /* renamed from: t */
    public static /* synthetic */ void m131825t(Runnable runnable, C32630p.C32632b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo94804a(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m131826u(Runnable runnable, C32630p.C32632b bVar) {
        this.f79188a.execute(new C32621g(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ ScheduledFuture m131827v(Runnable runnable, long j, long j2, TimeUnit timeUnit, C32630p.C32632b bVar) {
        return this.f79189b.scheduleAtFixedRate(new C32622h(this, runnable, bVar), j, j2, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m131828w(Runnable runnable, C32630p.C32632b bVar) {
        this.f79188a.execute(new C32618d(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ ScheduledFuture m131829x(Runnable runnable, long j, long j2, TimeUnit timeUnit, C32630p.C32632b bVar) {
        return this.f79189b.scheduleWithFixedDelay(new C32625k(this, runnable, bVar), j, j2, timeUnit);
    }

    /* renamed from: y */
    public static /* synthetic */ void m131830y(Runnable runnable, C32630p.C32632b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo94804a(e);
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f79188a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f79188a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f79188a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f79188a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f79188a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f79188a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new C32630p(new C32623i(this, runnable, j, timeUnit));
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new C32630p(new C32626l(this, runnable, j, j2, timeUnit));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new C32630p(new C32624j(this, runnable, j, j2, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f79188a.submit(callable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f79188a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f79188a.invokeAny(collection, j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return new C32630p(new C32617c(this, callable, j, timeUnit));
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f79188a.submit(runnable, t);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f79188a.submit(runnable);
    }
}
