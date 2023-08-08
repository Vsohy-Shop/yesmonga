package androidx.compose.material3;

import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SwipeableState", mo22502f = "Swipeable.kt", mo22503i = {1, 1, 1, 2, 2, 2}, mo22504l = {159, 183, 186}, mo22505m = "processNewAnchors$material3_release", mo22506n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, mo22507s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, C11045c<? super SwipeableState$processNewAnchors$1> cVar) {
        super(cVar);
        this.this$0 = swipeableState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo12041H((Map) null, (Map) null, this);
    }
}
