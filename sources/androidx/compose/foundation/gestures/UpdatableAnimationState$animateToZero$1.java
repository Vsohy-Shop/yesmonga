package androidx.compose.foundation.gestures;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.UpdatableAnimationState", mo22502f = "UpdatableAnimationState.kt", mo22503i = {0, 0, 0, 0, 1, 1}, mo22504l = {100, 146}, mo22505m = "animateToZero", mo22506n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, mo22507s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, C11045c<? super UpdatableAnimationState$animateToZero$1> cVar) {
        super(cVar);
        this.this$0 = updatableAnimationState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7525h((C11300l<? super Float, C11079d2>) null, (C11289a<C11079d2>) null, this);
    }
}
