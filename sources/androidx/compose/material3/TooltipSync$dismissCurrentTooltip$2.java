package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.TooltipSync$dismissCurrentTooltip$2", mo22502f = "Tooltip.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TooltipSync$dismissCurrentTooltip$2 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    int label;

    public TooltipSync$dismissCurrentTooltip$2(C11045c<? super TooltipSync$dismissCurrentTooltip$2> cVar) {
        super(1, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new TooltipSync$dismissCurrentTooltip$2(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((TooltipSync$dismissCurrentTooltip$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
