package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.lazy.grid.LazyGridState", mo22502f = "LazyGridState.kt", mo22503i = {0, 0, 0}, mo22504l = {273, 274}, mo22505m = "scroll", mo22506n = {"this", "scrollPriority", "block"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyGridState$scroll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LazyGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(LazyGridState lazyGridState, C11045c<? super LazyGridState$scroll$1> cVar) {
        super(cVar);
        this.this$0 = lazyGridState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7253g((MutatePriority) null, (C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object>) null, this);
    }
}
