package com.carrefour.fid.android.loyalty.core.p061io;

import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/io/LoyaltyCardNotSecured;", "", "cardNumber", "", "(Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.loyalty.core.io.LoyaltyCardNotSecured */
public final class LoyaltyCardNotSecured extends Throwable {
    @C12579k
    private final String cardNumber;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyCardNotSecured(@C12579k String str) {
        super("Loyalty card " + str + " not secured.");
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        this.cardNumber = str;
    }

    @C12579k
    public final String getCardNumber() {
        return this.cardNumber;
    }
}
