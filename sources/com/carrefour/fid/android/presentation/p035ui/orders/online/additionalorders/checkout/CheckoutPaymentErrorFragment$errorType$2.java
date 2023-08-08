package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import com.carrefour.fid.android.core.constants.C36170c;
import com.carrefour.fid.android.core.type.PaymentErrorType;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "a", "()Lcom/carrefour/fid/android/core/type/PaymentErrorType;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentErrorFragment$errorType$2 */
public final class CheckoutPaymentErrorFragment$errorType$2 extends Lambda implements C11289a<PaymentErrorType> {
    final /* synthetic */ CheckoutPaymentErrorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutPaymentErrorFragment$errorType$2(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
        super(0);
        this.this$0 = checkoutPaymentErrorFragment;
    }

    @C12579k
    /* renamed from: a */
    public final PaymentErrorType invoke() {
        Object obj;
        Bundle e = this.this$0.mo72832X0().mo73052e();
        PaymentErrorType paymentErrorType = null;
        if (e != null) {
            obj = e.getSerializable(C36170c.f89279a);
        } else {
            obj = null;
        }
        if (obj instanceof PaymentErrorType) {
            paymentErrorType = (PaymentErrorType) obj;
        }
        if (paymentErrorType != null) {
            return paymentErrorType;
        }
        throw new Throwable("No error type");
    }
}
