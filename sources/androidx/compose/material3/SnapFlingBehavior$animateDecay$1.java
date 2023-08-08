package androidx.compose.material3;

import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SnapFlingBehavior", mo22502f = "SnapFlingBehavior.kt", mo22503i = {0, 0, 0}, mo22504l = {261}, mo22505m = "animateDecay", mo22506n = {"animationState", "previousValue", "targetOffset"}, mo22507s = {"L$0", "L$1", "F$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnapFlingBehavior$animateDecay$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateDecay$1(SnapFlingBehavior snapFlingBehavior, C11045c<? super SnapFlingBehavior$animateDecay$1> cVar) {
        super(cVar);
        this.this$0 = snapFlingBehavior;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo11972l((C2201l) null, 0.0f, (C1976i<Float, C1983k>) null, (C2013v<Float>) null, this);
    }
}
