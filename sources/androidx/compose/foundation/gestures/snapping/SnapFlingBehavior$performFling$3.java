package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", mo22502f = "SnapFlingBehavior.kt", mo22503i = {}, mo22504l = {118}, mo22505m = "performFling", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnapFlingBehavior$performFling$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$performFling$3(SnapFlingBehavior snapFlingBehavior, C11045c<? super SnapFlingBehavior$performFling$3> cVar) {
        super(cVar);
        this.this$0 = snapFlingBehavior;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7557k((C2201l) null, 0.0f, (C11300l<? super Float, C11079d2>) null, this);
    }
}
