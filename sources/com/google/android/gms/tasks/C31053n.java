package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.tasks.C30305a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.n */
public final class C31053n {
    /* renamed from: a */
    public static <TResult> TResult m124519a(@C0359n0 C31047k<TResult> kVar) throws ExecutionException, InterruptedException {
        C40843u.m166200j();
        C40843u.m166203m(kVar, "Task must not be null");
        if (kVar.mo87737u()) {
            return m124533o(kVar);
        }
        C31063s sVar = new C31063s((C31061r) null);
        m124534p(kVar, sVar);
        sVar.mo87762b();
        return m124533o(kVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m124520b(@C0359n0 C31047k<TResult> kVar, long j, @C0359n0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C40843u.m166200j();
        C40843u.m166203m(kVar, "Task must not be null");
        C40843u.m166203m(timeUnit, "TimeUnit must not be null");
        if (kVar.mo87737u()) {
            return m124533o(kVar);
        }
        C31063s sVar = new C31063s((C31061r) null);
        m124534p(kVar, sVar);
        if (sVar.mo87763c(j, timeUnit)) {
            return m124533o(kVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @C0359n0
    @Deprecated
    /* renamed from: c */
    public static <TResult> C31047k<TResult> m124521c(@C0359n0 Callable<TResult> callable) {
        return m124522d(C31051m.f74312a, callable);
    }

    @C0359n0
    @Deprecated
    /* renamed from: d */
    public static <TResult> C31047k<TResult> m124522d(@C0359n0 Executor executor, @C0359n0 Callable<TResult> callable) {
        C40843u.m166203m(executor, "Executor must not be null");
        C40843u.m166203m(callable, "Callback must not be null");
        C31060q0 q0Var = new C31060q0();
        executor.execute(new C31066t0(q0Var, callable));
        return q0Var;
    }

    @C0359n0
    /* renamed from: e */
    public static <TResult> C31047k<TResult> m124523e() {
        C31060q0 q0Var = new C31060q0();
        q0Var.mo87752A();
        return q0Var;
    }

    @C0359n0
    /* renamed from: f */
    public static <TResult> C31047k<TResult> m124524f(@C0359n0 Exception exc) {
        C31060q0 q0Var = new C31060q0();
        q0Var.mo87759y(exc);
        return q0Var;
    }

    @C0359n0
    /* renamed from: g */
    public static <TResult> C31047k<TResult> m124525g(TResult tresult) {
        C31060q0 q0Var = new C31060q0();
        q0Var.mo87760z(tresult);
        return q0Var;
    }

    @C0359n0
    /* renamed from: h */
    public static C31047k<Void> m124526h(@C0363p0 Collection<? extends C31047k<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m124525g((Object) null);
        }
        for (C31047k kVar : collection) {
            if (kVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C31060q0 q0Var = new C31060q0();
        C31067u uVar = new C31067u(collection.size(), q0Var);
        for (C31047k p : collection) {
            m124534p(p, uVar);
        }
        return q0Var;
    }

    @C0359n0
    /* renamed from: i */
    public static C31047k<Void> m124527i(@C0363p0 C31047k<?>... kVarArr) {
        if (kVarArr == null || kVarArr.length == 0) {
            return m124525g((Object) null);
        }
        return m124526h(Arrays.asList(kVarArr));
    }

    @C0359n0
    /* renamed from: j */
    public static C31047k<List<C31047k<?>>> m124528j(@C0363p0 Collection<? extends C31047k<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m124525g(Collections.emptyList());
        }
        return m124526h(collection).mo87732p(C31051m.f74312a, new C31059q(collection));
    }

    @C0359n0
    /* renamed from: k */
    public static C31047k<List<C31047k<?>>> m124529k(@C0363p0 C31047k<?>... kVarArr) {
        if (kVarArr == null || kVarArr.length == 0) {
            return m124525g(Collections.emptyList());
        }
        return m124528j(Arrays.asList(kVarArr));
    }

    @C0359n0
    /* renamed from: l */
    public static <TResult> C31047k<List<TResult>> m124530l(@C0363p0 Collection<? extends C31047k> collection) {
        if (collection == null || collection.isEmpty()) {
            return m124525g(Collections.emptyList());
        }
        return m124526h(collection).mo87730n(C31051m.f74312a, new C31057p(collection));
    }

    @C0359n0
    /* renamed from: m */
    public static <TResult> C31047k<List<TResult>> m124531m(@C0363p0 C31047k... kVarArr) {
        if (kVarArr == null || kVarArr.length == 0) {
            return m124525g(Collections.emptyList());
        }
        return m124530l(Arrays.asList(kVarArr));
    }

    @C0359n0
    /* renamed from: n */
    public static <T> C31047k<T> m124532n(@C0359n0 C31047k<T> kVar, long j, @C0359n0 TimeUnit timeUnit) {
        boolean z;
        C40843u.m166203m(kVar, "Task must not be null");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "Timeout must be positive");
        C40843u.m166203m(timeUnit, "TimeUnit must not be null");
        C31068v vVar = new C31068v();
        C31049l lVar = new C31049l(vVar);
        C30305a aVar = new C30305a(Looper.getMainLooper());
        aVar.postDelayed(new C31062r0(lVar), timeUnit.toMillis(j));
        kVar.mo87721e(new C31064s0(aVar, lVar, vVar));
        return lVar.mo87741a();
    }

    /* renamed from: o */
    public static Object m124533o(@C0359n0 C31047k kVar) throws ExecutionException {
        if (kVar.mo87738v()) {
            return kVar.mo87734r();
        }
        if (kVar.mo87736t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.mo87733q());
    }

    /* renamed from: p */
    public static void m124534p(C31047k kVar, C31065t tVar) {
        Executor executor = C31051m.f74313b;
        kVar.mo87728l(executor, tVar);
        kVar.mo87725i(executor, tVar);
        kVar.mo87719c(executor, tVar);
    }
}
