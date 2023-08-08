package com.carrefour.fid.android.core.p057io;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.InitPaymentResponse;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/RedirectionPaymentThrowable;", "", "Lcom/carrefour/fid/android/data/entities/InitPaymentResponse;", "paymentResponse", "Lcom/carrefour/fid/android/data/entities/InitPaymentResponse;", "a", "()Lcom/carrefour/fid/android/data/entities/InitPaymentResponse;", "", "userLoyaltyAmount", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/data/entities/InitPaymentResponse;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.RedirectionPaymentThrowable */
public final class RedirectionPaymentThrowable extends Throwable {

    /* renamed from: a */
    public static final int f89703a = 0;
    @C12580l
    private final InitPaymentResponse paymentResponse;
    @C12579k
    private final String userLoyaltyAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedirectionPaymentThrowable(@C12580l InitPaymentResponse initPaymentResponse, @C12579k String str) {
        super("redirection payment");
        Intrinsics.checkNotNullParameter(str, "userLoyaltyAmount");
        this.paymentResponse = initPaymentResponse;
        this.userLoyaltyAmount = str;
    }

    @C12580l
    /* renamed from: a */
    public final InitPaymentResponse mo108375a() {
        return this.paymentResponse;
    }

    @C12579k
    /* renamed from: b */
    public final String mo108376b() {
        return this.userLoyaltyAmount;
    }
}
