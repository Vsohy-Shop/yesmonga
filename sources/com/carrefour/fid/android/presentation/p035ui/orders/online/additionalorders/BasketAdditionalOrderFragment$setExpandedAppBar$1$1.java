package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import com.carrefour.fid.android.databinding.C36839u0;
import com.carrefour.fid.android.design.components.widgets.StepBarView;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.BasketAdditionalOrderFragment$setExpandedAppBar$1$1 */
public final class BasketAdditionalOrderFragment$setExpandedAppBar$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $isExpend;
    final /* synthetic */ C36839u0 $this_with;
    final /* synthetic */ BasketAdditionalOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketAdditionalOrderFragment$setExpandedAppBar$1$1(C36839u0 u0Var, BasketAdditionalOrderFragment basketAdditionalOrderFragment, boolean z) {
        super(0);
        this.$this_with = u0Var;
        this.this$0 = basketAdditionalOrderFragment;
        this.$isExpend = z;
    }

    public final void invoke() {
        C36839u0 u0Var = this.$this_with;
        AppBarLayout appBarLayout = u0Var.f91727b;
        this.this$0.f61769x = this.$isExpend;
        AppBarLayout appBarLayout2 = u0Var.f91727b;
        Intrinsics.checkNotNullExpressionValue(appBarLayout2, "additionalOrderAppBar");
        ViewKt.m118980E(appBarLayout2);
        CountDownTimerComponent countDownTimerComponent = this.$this_with.f91733h;
        Intrinsics.checkNotNullExpressionValue(countDownTimerComponent, "timerAdditionalOrder");
        ViewKt.m118980E(countDownTimerComponent);
        StepBarView stepBarView = this.$this_with.f91732g;
        Intrinsics.checkNotNullExpressionValue(stepBarView, "stepIndicator");
        ViewKt.m118980E(stepBarView);
    }
}
