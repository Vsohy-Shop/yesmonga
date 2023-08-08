package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.animation.core.SuspendAnimationKt", mo22502f = "SuspendAnimation.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1, 1}, mo22504l = {239, 278}, mo22505m = "animate", mo22506n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SuspendAnimationKt$animate$4<T, V extends C1997o> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public SuspendAnimationKt$animate$4(C11045c<? super SuspendAnimationKt$animate$4> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SuspendAnimationKt.m8077d((C1976i) null, (C1950c) null, 0, (C11300l) null, this);
    }
}
