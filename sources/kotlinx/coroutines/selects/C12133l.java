package kotlinx.coroutines.selects;

import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.selects.l */
public final class C12133l {
    /* renamed from: c */
    public static final <T> void m48551c(C12072o<? super T> oVar, T t) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) oVar.getContext().mo7444b(CoroutineDispatcher.f29001b);
        if (coroutineDispatcher != null) {
            oVar.mo24534b0(coroutineDispatcher, t);
            return;
        }
        Result.C10852a aVar = Result.f28060a;
        oVar.resumeWith(Result.m38702b(t));
    }

    /* renamed from: d */
    public static final void m48552d(C12072o<?> oVar, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) oVar.getContext().mo7444b(CoroutineDispatcher.f29001b);
        if (coroutineDispatcher != null) {
            oVar.mo24531N(coroutineDispatcher, th);
            return;
        }
        Result.C10852a aVar = Result.f28060a;
        oVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
    }

    @C12580l
    @C11532s0
    /* renamed from: e */
    public static final <R> Object m48553e(@C12579k C11300l<? super C12122b<? super R>, C11079d2> lVar, @C12579k C11045c<? super R> cVar) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(cVar);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.mo24691O(th);
        }
        Object N = selectBuilderImpl.mo24690N();
        if (N == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return N;
    }

    @C11532s0
    /* renamed from: f */
    public static final <R> Object m48554f(C11300l<? super C12122b<? super R>, C11079d2> lVar, C11045c<? super R> cVar) {
        C11322b0.m43482e(0);
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(cVar);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.mo24691O(th);
        }
        Object N = selectBuilderImpl.mo24690N();
        if (N == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        C11322b0.m43482e(1);
        return N;
    }

    @C12580l
    @C11532s0
    /* renamed from: g */
    public static final <R> Object m48555g(@C12579k C11300l<? super C12122b<? super R>, C11079d2> lVar, @C12579k C11045c<? super R> cVar) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(cVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.mo24725P(th);
        }
        Object Q = unbiasedSelectBuilderImpl.mo24726Q();
        if (Q == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return Q;
    }

    @C11532s0
    /* renamed from: h */
    public static final <R> Object m48556h(C11300l<? super C12122b<? super R>, C11079d2> lVar, C11045c<? super R> cVar) {
        C11322b0.m43482e(0);
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(cVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.mo24725P(th);
        }
        Object Q = unbiasedSelectBuilderImpl.mo24726Q();
        if (Q == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        C11322b0.m43482e(1);
        return Q;
    }
}
