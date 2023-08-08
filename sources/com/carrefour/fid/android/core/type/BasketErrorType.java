package com.carrefour.fid.android.core.type;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/BasketErrorType;", "", "", "resourceId", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum BasketErrorType {
    AccessFailure(R.string.fec_basket_module_basket_slot_error_acces),
    AuthenticationFailure(R.string.fec_basket_module_basket_slot_error_token_expire),
    BasketBillingAddressError(R.string.fec_basket_module_adress_billing_error_tag),
    BasketCheckDeliveryArea(R.string.basket_error_undefined),
    BasketDeliveryAddressError(R.string.fec_basket_module_adress_delivery_error),
    BasketNotAdded(R.string.unavailable_products_quantity),
    BasketNotFound(R.string.basket_error_undefined),
    BasketRefNotFoundError(R.string.fec_basket_module_basket_ref_error),
    BasketTotalHighError(R.string.basket_error_undefined),
    BasketTotalLowError(R.string.fec_basket_module_basket_total_low_error),
    BasketTotalWeightingError(R.string.fec_basket_module_basket_total_weighting_error),
    BasketUndefinedError(R.string.fec_basket_module_basket_undefined_error),
    NetworkError(R.string.general_error_no_network_message),
    ParameterMissing(R.string.basket_error_undefined),
    ProductNotAvailable(R.string.unavailable_products_quantity),
    ServerNotResponding(R.string.basket_module_exception_server_not_response),
    SlotBadRequestDuringBook(R.string.basket_error_undefined),
    SlotDateError(R.string.fec_basket_module_slot_date_error),
    SlotDetailsBadRequest(R.string.basket_error_undefined),
    SlotFullError(R.string.basket_error_undefined),
    SlotNotBooked(R.string.basket_fetch_slot_error),
    SlotRefNotFoundError(R.string.fec_basket_module_slot_ref_error),
    TokenInvalid(R.string.basket_error_undefined);
    
    private final int resourceId;

    /* access modifiers changed from: public */
    BasketErrorType(@C0324b1 int i) {
        this.resourceId = i;
    }

    /* renamed from: q */
    public final int mo108470q() {
        return this.resourceId;
    }
}
