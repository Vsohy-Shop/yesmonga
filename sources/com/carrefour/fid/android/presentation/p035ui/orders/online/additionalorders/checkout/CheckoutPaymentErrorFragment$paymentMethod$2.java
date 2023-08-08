package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import com.carrefour.fid.android.core.constants.C36170c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo22516d2 = {"<anonymous>", "", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentErrorFragment$paymentMethod$2 */
public final class CheckoutPaymentErrorFragment$paymentMethod$2 extends Lambda implements C11289a<String> {
    final /* synthetic */ CheckoutPaymentErrorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutPaymentErrorFragment$paymentMethod$2(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
        super(0);
        this.this$0 = checkoutPaymentErrorFragment;
    }

    @C12580l
    public final String invoke() {
        Bundle e = this.this$0.mo72832X0().mo73052e();
        if (e != null) {
            return e.getString(C36170c.f89281c);
        }
        return null;
    }
}
