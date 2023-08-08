package com.google.android.play.core.tasks;

import android.support.annotation.NonNull;
import com.google.android.play.core.internal.C32028a0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.play.core.tasks.f */
public final class C32229f {
    /* renamed from: a */
    public static <ResultT> C32227d<ResultT> m130358a(ResultT resultt) {
        C32242s sVar = new C32242s();
        sVar.mo93037l(resultt);
        return sVar;
    }

    /* renamed from: b */
    public static <ResultT> ResultT m130359b(@NonNull C32227d<ResultT> dVar) throws ExecutionException, InterruptedException {
        C32028a0.m129764d(dVar, "Task must not be null");
        if (dVar.mo93022j()) {
            return m130362e(dVar);
        }
        C32243t tVar = new C32243t((byte[]) null);
        m130363f(dVar, tVar);
        tVar.mo93044b();
        return m130362e(dVar);
    }

    /* renamed from: c */
    public static <ResultT> ResultT m130360c(@NonNull C32227d<ResultT> dVar, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C32028a0.m129764d(dVar, "Task must not be null");
        C32028a0.m129764d(timeUnit, "TimeUnit must not be null");
        if (dVar.mo93022j()) {
            return m130362e(dVar);
        }
        C32243t tVar = new C32243t((byte[]) null);
        m130363f(dVar, tVar);
        if (tVar.mo93045c(j, timeUnit)) {
            return m130362e(dVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: d */
    public static <ResultT> C32227d<ResultT> m130361d(Exception exc) {
        C32242s sVar = new C32242s();
        sVar.mo93039n(exc);
        return sVar;
    }

    /* renamed from: e */
    public static <ResultT> ResultT m130362e(C32227d<ResultT> dVar) throws ExecutionException {
        if (dVar.mo93023k()) {
            return dVar.mo93020h();
        }
        throw new ExecutionException(dVar.mo93019g());
    }

    /* renamed from: f */
    public static void m130363f(C32227d<?> dVar, C32243t tVar) {
        Executor executor = C32228e.f78573b;
        dVar.mo93018f(executor, tVar);
        dVar.mo93016d(executor, tVar);
    }
}
