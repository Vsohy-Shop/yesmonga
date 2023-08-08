package com.carrefour.fid.android.core.type;

import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "", "", "title", "I", "w", "()I", "subtitle", "r", "image", "q", "<init>", "(Ljava/lang/String;IIII)V", "a", "b", "c", "d", "e", "f", "g", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum PaymentErrorType {
    PAYMENT_CANCELED(R.string.checkout_payment_canceled_title, R.string.checkout_payment_canceled_subtitle, R.drawable.checkout_payment_error),
    PAYMENT_REFUSED(R.string.checkout_payment_refused_title, R.string.checkout_payment_refused_subtitle, R.drawable.checkout_payment_error),
    CARD_EXPIRED(R.string.checkout_payment_card_expired_title, R.string.checkout_payment_card_expired_subtitle, R.drawable.checkout_payment_error),
    AMOUNT_LIMIT_EXCEEDED(R.string.checkout_payment_limit_exceeded_title, R.string.checkout_payment_limit_exceeded_subtitle, R.drawable.checkout_payment_error),
    REJECTED_TRANSACTION(R.string.checkout_payment_rejected_title, R.string.checkout_payment_rejected_subtitle, R.drawable.checkout_payment_error),
    TECHNICAL_ERROR(R.string.checkout_payment_technical_error_title, R.string.checkout_payment_technical_error_subtitle, R.drawable.checkout_payment_technical_error),
    PAYMENT_GENERIC_ERROR(R.string.checkout_order_confirmation_error, R.string.checkout_order_confirmation_mail_error, R.drawable.ic_order_error);
    
    private final int image;
    private final int subtitle;
    private final int title;

    /* access modifiers changed from: public */
    PaymentErrorType(@C0324b1 int i, @C0324b1 int i2, @C0375v int i3) {
        this.title = i;
        this.subtitle = i2;
        this.image = i3;
    }

    /* renamed from: q */
    public final int mo108571q() {
        return this.image;
    }

    /* renamed from: r */
    public final int mo108572r() {
        return this.subtitle;
    }

    /* renamed from: w */
    public final int mo108573w() {
        return this.title;
    }
}
