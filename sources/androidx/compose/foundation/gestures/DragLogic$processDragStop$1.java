package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C2187d;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragLogic", mo22502f = "Draggable.kt", mo22503i = {0, 0, 0}, mo22504l = {414, 417}, mo22505m = "processDragStop", mo22506n = {"this", "$this$processDragStop", "event"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DragLogic$processDragStop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStop$1(DragLogic dragLogic, C11045c<? super DragLogic$processDragStop$1> cVar) {
        super(cVar);
        this.this$0 = dragLogic;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7393g((C12074o0) null, (C2187d.C2191d) null, this);
    }
}
