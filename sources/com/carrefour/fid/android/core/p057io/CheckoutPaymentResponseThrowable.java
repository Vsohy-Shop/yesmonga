package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.PaymentErrorType;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/CheckoutPaymentResponseThrowable;", "", "Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "errorType", "Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "b", "()Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "", "errorCode", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "paymentMethod", "c", "<init>", "(Lcom/carrefour/fid/android/core/type/PaymentErrorType;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.CheckoutPaymentResponseThrowable */
public final class CheckoutPaymentResponseThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89680a = 0;
    @C12580l
    private final String errorCode;
    @C12579k
    private final PaymentErrorType errorType;
    @C12580l
    private final String paymentMethod;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutPaymentResponseThrowable(@C12579k PaymentErrorType paymentErrorType, @C12580l String str, @C12580l String str2) {
        super("Payment error");
        Intrinsics.checkNotNullParameter(paymentErrorType, "errorType");
        this.errorType = paymentErrorType;
        this.errorCode = str;
        this.paymentMethod = str2;
    }

    @C12580l
    /* renamed from: a */
    public final String mo108356a() {
        return this.errorCode;
    }

    @C12579k
    /* renamed from: b */
    public final PaymentErrorType mo108357b() {
        return this.errorType;
    }

    @C12580l
    /* renamed from: c */
    public final String mo108358c() {
        return this.paymentMethod;
    }
}
