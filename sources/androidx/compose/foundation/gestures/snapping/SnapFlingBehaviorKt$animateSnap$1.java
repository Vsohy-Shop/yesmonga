package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", mo22502f = "SnapFlingBehavior.kt", mo22503i = {0, 0, 0, 0}, mo22504l = {451}, mo22505m = "animateSnap", mo22506n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, mo22507s = {"L$0", "L$1", "F$0", "F$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnapFlingBehaviorKt$animateSnap$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateSnap$1(C11045c<? super SnapFlingBehaviorKt$animateSnap$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.m9619h((C2201l) null, 0.0f, 0.0f, (C1976i<Float, C1983k>) null, (C1968g<Float>) null, (C11300l<? super Float, C11079d2>) null, this);
    }
}
