package com.google.android.gms.internal.mlkit_common;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.mlkit_common.p */
public abstract class C42468p extends C42380h implements ExecutorService {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo98719a() {
        throw null;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo98720b().awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public abstract ExecutorService mo98720b();

    public void execute(Runnable runnable) {
        mo98720b().execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return mo98720b().invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return mo98720b().invokeAny(collection);
    }

    public final boolean isShutdown() {
        return mo98720b().isShutdown();
    }

    public final boolean isTerminated() {
        return mo98720b().isTerminated();
    }

    public final void shutdown() {
        mo98720b().shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return mo98720b().shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return mo98720b().submit(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo98720b().invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo98720b().invokeAny(collection, j, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return mo98720b().submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return mo98720b().submit(callable);
    }
}
