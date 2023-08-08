package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", mo22502f = "SnapFlingBehavior.kt", mo22503i = {}, mo22504l = {134, 136}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Landroidx/compose/foundation/gestures/snapping/a;", "", "Landroidx/compose/animation/core/k;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C2214a<Float, C1983k>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ C11300l<Float, C11079d2> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ C2201l $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(float f, SnapFlingBehavior snapFlingBehavior, C2201l lVar, C11300l<? super Float, C11079d2> lVar2, C11045c<? super SnapFlingBehavior$fling$result$1> cVar) {
        super(2, cVar);
        this.$initialVelocity = f;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = lVar;
        this.$onRemainingScrollOffsetUpdate = lVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, this.$onRemainingScrollOffsetUpdate, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (Math.abs(this.$initialVelocity) <= Math.abs(this.this$0.f5955g)) {
                SnapFlingBehavior snapFlingBehavior = this.this$0;
                C2201l lVar = this.$this_fling;
                float f = this.$initialVelocity;
                C11300l<Float, C11079d2> lVar2 = this.$onRemainingScrollOffsetUpdate;
                this.label = 1;
                obj = snapFlingBehavior.mo7560n(lVar, f, lVar2, this);
                if (obj == h) {
                    return h;
                }
            } else {
                SnapFlingBehavior snapFlingBehavior2 = this.this$0;
                C2201l lVar3 = this.$this_fling;
                float f2 = this.$initialVelocity;
                C11300l<Float, C11079d2> lVar4 = this.$onRemainingScrollOffsetUpdate;
                this.label = 2;
                obj = snapFlingBehavior2.mo7556j(lVar3, f2, lVar4, this);
                if (obj == h) {
                    return h;
                }
                return (C2214a) obj;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return (C2214a) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (C2214a) obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C2214a<Float, C1983k>> cVar) {
        return ((SnapFlingBehavior$fling$result$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
