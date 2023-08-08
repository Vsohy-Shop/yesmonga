package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.TooltipSync$show$4", mo22502f = "Tooltip.kt", mo22503i = {}, mo22504l = {771, 642}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipSync$show$4\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,770:1\n314#2,11:771\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipSync$show$4\n*L\n637#1:771,11\n*E\n"})
public final class TooltipSync$show$4 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $persistent;
    final /* synthetic */ C8265p3 $state;
    Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipSync$show$4(boolean z, C8265p3 p3Var, C11045c<? super TooltipSync$show$4> cVar) {
        super(1, cVar);
        this.$persistent = z;
        this.$state = p3Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new TooltipSync$show$4(this.$persistent, this.$state, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C8265p3 p3Var = (C8265p3) this.L$0;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11661u0.m45747n(obj);
        } else {
            C11661u0.m45747n(obj);
            if (this.$persistent) {
                C8265p3 p3Var2 = this.$state;
                this.L$0 = p3Var2;
                this.label = 1;
                C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(this), 1);
                pVar.mo24537e0();
                ((C8194e2) p3Var2).mo12566e(true);
                Object y = pVar.mo24572y();
                if (y == C11063b.m42612h()) {
                    C11069f.m42638c(this);
                }
                if (y == h) {
                    return h;
                }
            } else {
                ((C8194e2) this.$state).mo12566e(true);
                this.label = 2;
                if (DelayKt.m45925b(TooltipKt.f19944o, this) == h) {
                    return h;
                }
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((TooltipSync$show$4) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
