package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment$bindErrorView$1$1 */
public final class AdditionalOrderBottomSheetFragment$bindErrorView$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ MessageComponent $this_apply;
    final /* synthetic */ AdditionalOrderBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdditionalOrderBottomSheetFragment$bindErrorView$1$1(MessageComponent messageComponent, AdditionalOrderBottomSheetFragment additionalOrderBottomSheetFragment) {
        super(0);
        this.$this_apply = messageComponent;
        this.this$0 = additionalOrderBottomSheetFragment;
    }

    public final void invoke() {
        this.$this_apply.mo112900L(true);
        this.this$0.mo72655X0().sendIntent(new C26836a.C26845c.C26846a(this.this$0.mo72654W0()));
    }
}
