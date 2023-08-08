package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "a", "()Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$orderConfirmation$2 */
public final class CheckoutConfirmationFragment$orderConfirmation$2 extends Lambda implements C11289a<OrderConfirmationModel> {
    final /* synthetic */ CheckoutConfirmationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationFragment$orderConfirmation$2(CheckoutConfirmationFragment checkoutConfirmationFragment) {
        super(0);
        this.this$0 = checkoutConfirmationFragment;
    }

    @C12580l
    /* renamed from: a */
    public final OrderConfirmationModel invoke() {
        Bundle e = this.this$0.mo72794f1().mo73000e();
        OrderConfirmationModel orderConfirmationModel = e != null ? (OrderConfirmationModel) e.getParcelable("orderKey") : null;
        if (orderConfirmationModel instanceof OrderConfirmationModel) {
            return orderConfirmationModel;
        }
        return null;
    }
}
