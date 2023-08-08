package androidx.compose.animation.core;

import androidx.compose.p004ui.platform.C15963s0;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class InfiniteAnimationPolicyKt {
    @C12580l
    /* renamed from: a */
    public static final <R> Object m7998a(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        return m8000c(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar), cVar);
    }

    /* renamed from: b */
    public static final <R> Object m7999b(C11300l<? super Long, ? extends R> lVar, C11045c<? super R> cVar) {
        InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar);
        C11322b0.m43482e(0);
        Object c = m8000c(infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, cVar);
        C11322b0.m43482e(1);
        return c;
    }

    @C12580l
    /* renamed from: c */
    public static final <R> Object m8000c(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        C15963s0 s0Var = (C15963s0) cVar.getContext().mo7444b(C15963s0.f39662o);
        if (s0Var == null) {
            return MonotonicFrameClockKt.m29919f(lVar, cVar);
        }
        return s0Var.mo45950Z(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, (C11045c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null), cVar);
    }
}
