package dev.chrisbanes.snapper;

import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "dev.chrisbanes.snapper.SnapperFlingBehavior", mo22502f = "SnapperFlingBehavior.kt", mo22503i = {0, 0, 0, 0, 1}, mo22504l = {406, 416}, mo22505m = "flingToIndex", mo22506n = {"this", "$this$flingToIndex", "index", "initialVelocity", "this"}, mo22507s = {"L$0", "L$1", "I$0", "F$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class SnapperFlingBehavior$flingToIndex$1 extends ContinuationImpl {
    float F$0;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapperFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$flingToIndex$1(SnapperFlingBehavior snapperFlingBehavior, C11045c<? super SnapperFlingBehavior$flingToIndex$1> cVar) {
        super(cVar);
        this.this$0 = snapperFlingBehavior;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo21777j((C2201l) null, 0, 0.0f, this);
    }
}
