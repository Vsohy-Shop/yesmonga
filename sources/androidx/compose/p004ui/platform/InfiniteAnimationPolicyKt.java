package androidx.compose.p004ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt */
public final class InfiniteAnimationPolicyKt {
    @C12580l
    /* renamed from: a */
    public static final <R> Object m71058a(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        C15963s0 s0Var = (C15963s0) cVar.getContext().mo7444b(C15963s0.f39662o);
        if (s0Var == null) {
            return MonotonicFrameClockKt.m29919f(lVar, cVar);
        }
        return s0Var.mo45950Z(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, (C11045c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null), cVar);
    }
}
