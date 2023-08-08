package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/SelfCareType;", "", "", "iconResId", "I", "q", "()I", "txtResId", "r", "<init>", "(Ljava/lang/String;III)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum SelfCareType {
    RE_ORDER(R.drawable.cart, R.string.re_order_products_txt),
    ADD_FORGOTTEN_PRODUCTS(R.drawable.add_product, R.string.additional_order_add_products),
    RETURN_PRODUCT(R.drawable.download, R.string.order_txt_return_product),
    DOWNLOAD_E_BILL(R.drawable.download, R.string.order_txt_return_product),
    DOWNLOAD_BILL(R.drawable.download, R.string.order_txt_download_bill),
    ASK_REFUND(R.drawable.download, R.string.order_ask_refund),
    FOLLOW_COMMAND(R.drawable.ic_order_follow, R.string.order_txt_follow_command),
    CHANGE_SLOT(R.drawable.clock, R.string.order_txt_change_pickup),
    CANCEL_ORDER(R.drawable.circle_cross, R.string.order_txt_cancel_order),
    WITHDRAWAL_VOUCHER(R.drawable.ic_scan_app, R.string.order_withdrawal),
    CONTACT_SELLER(R.drawable.mail, R.string.order_txt_contact_seller);
    
    private final int iconResId;
    private final int txtResId;

    /* access modifiers changed from: public */
    SelfCareType(@C0375v int i, @C0324b1 int i2) {
        this.iconResId = i;
        this.txtResId = i2;
    }

    /* renamed from: q */
    public final int mo78760q() {
        return this.iconResId;
    }

    /* renamed from: r */
    public final int mo78761r() {
        return this.txtResId;
    }
}
