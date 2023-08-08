package androidx.compose.runtime;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
public final class MonotonicFrameClockKt {
    @C12579k
    /* renamed from: a */
    public static final C8686v0 m29914a(@C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        C8686v0 v0Var = (C8686v0) coroutineContext.mo7444b(C8686v0.f23251h);
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    @C8541g0
    /* renamed from: b */
    public static /* synthetic */ void m29915b(CoroutineContext coroutineContext) {
    }

    @C12580l
    /* renamed from: c */
    public static final <R> Object m29916c(@C12579k C8686v0 v0Var, @C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        return v0Var.mo14872B(new MonotonicFrameClockKt$withFrameMillis$2(lVar), cVar);
    }

    @C12580l
    /* renamed from: d */
    public static final <R> Object m29917d(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        return m29914a(cVar.getContext()).mo14872B(new MonotonicFrameClockKt$withFrameMillis$2(lVar), cVar);
    }

    /* renamed from: e */
    public static final <R> Object m29918e(C8686v0 v0Var, C11300l<? super Long, ? extends R> lVar, C11045c<? super R> cVar) {
        MonotonicFrameClockKt$withFrameMillis$2 monotonicFrameClockKt$withFrameMillis$2 = new MonotonicFrameClockKt$withFrameMillis$2(lVar);
        C11322b0.m43482e(0);
        Object B = v0Var.mo14872B(monotonicFrameClockKt$withFrameMillis$2, cVar);
        C11322b0.m43482e(1);
        return B;
    }

    @C12580l
    /* renamed from: f */
    public static final <R> Object m29919f(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        return m29914a(cVar.getContext()).mo14872B(lVar, cVar);
    }
}
