package com.carrefour.fid.android.design.components.widgets;

import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$bindOrderSeekBarAndTitle$1$1", mo22502f = "OrderStatusComponent.kt", mo22503i = {}, mo22504l = {127}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OrderStatusComponent$bindOrderSeekBarAndTitle$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ int $progressIndex;
    final /* synthetic */ AppCompatSeekBar $this_apply;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderStatusComponent$bindOrderSeekBarAndTitle$1$1(AppCompatSeekBar appCompatSeekBar, int i, C11045c<? super OrderStatusComponent$bindOrderSeekBarAndTitle$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = appCompatSeekBar;
        this.$progressIndex = i;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OrderStatusComponent$bindOrderSeekBarAndTitle$1$1(this.$this_apply, this.$progressIndex, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.label = 1;
            if (DelayKt.m45925b(300, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$this_apply.setProgress(this.$progressIndex, true);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OrderStatusComponent$bindOrderSeekBarAndTitle$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
