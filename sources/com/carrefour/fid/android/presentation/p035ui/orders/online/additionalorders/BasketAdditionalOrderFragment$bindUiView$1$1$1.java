package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26906e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.BasketAdditionalOrderFragment$bindUiView$1$1$1 */
public final class BasketAdditionalOrderFragment$bindUiView$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ CountDownTimerComponent $this_apply;
    final /* synthetic */ BasketAdditionalOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketAdditionalOrderFragment$bindUiView$1$1$1(BasketAdditionalOrderFragment basketAdditionalOrderFragment, CountDownTimerComponent countDownTimerComponent) {
        super(0);
        this.this$0 = basketAdditionalOrderFragment;
        this.$this_apply = countDownTimerComponent;
    }

    public final void invoke() {
        this.this$0.mo72749Z0().sendIntent(new C26906e.C26913c.C26914a(this.$this_apply.getState()));
    }
}
