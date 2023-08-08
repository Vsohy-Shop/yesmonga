package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SnapFlingBehavior", mo22502f = "SnapFlingBehavior.kt", mo22503i = {0, 0, 0, 0, 0}, mo22504l = {299}, mo22505m = "animateSnap", mo22506n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, mo22507s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnapFlingBehavior$animateSnap$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateSnap$1(SnapFlingBehavior snapFlingBehavior, C11045c<? super SnapFlingBehavior$animateSnap$1> cVar) {
        super(cVar);
        this.this$0 = snapFlingBehavior;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11973n((C2201l) null, 0.0f, 0.0f, (C1976i<Float, C1983k>) null, (C1968g<Float>) null, this);
    }
}
