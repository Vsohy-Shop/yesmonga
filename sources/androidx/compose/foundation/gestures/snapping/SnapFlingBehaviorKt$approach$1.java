package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", mo22502f = "SnapFlingBehavior.kt", mo22503i = {0, 0}, mo22504l = {311}, mo22505m = "approach", mo22506n = {"snapLayoutInfoProvider", "density"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnapFlingBehaviorKt$approach$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$approach$1(C11045c<? super SnapFlingBehaviorKt$approach$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.m9620i((C2201l) null, 0.0f, 0.0f, (C2215b<Float, C1983k>) null, (C2218e) null, (C16479d) null, (C11300l<? super Float, C11079d2>) null, this);
    }
}
