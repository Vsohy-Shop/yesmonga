package androidx.compose.foundation;

import androidx.compose.p004ui.unit.C16509w;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", mo22502f = "AndroidOverscroll.kt", mo22503i = {1, 1}, mo22504l = {219, 244}, mo22505m = "applyToFling-BMRW4eQ", mo22506n = {"this", "remainingVelocity"}, mo22507s = {"L$0", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C11045c<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> cVar) {
        super(cVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7109d(0, (C11304p<? super C16509w, ? super C11045c<? super C16509w>, ? extends Object>) null, this);
    }
}
