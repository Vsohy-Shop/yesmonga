package com.carrefour.fid.android.loyalty.core.util;

import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.C11395k;

@C11395k(message = "use LoyaltyCardType in core instead")
@Keep
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/util/LoyaltyCardType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "PASS", "FID", "CZAM", "NOTEXIST", "PASS_MASTERCARD", "LOYALTY", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public enum LoyaltyCardType {
    PASS(0),
    FID(1),
    CZAM(2),
    NOTEXIST(3),
    PASS_MASTERCARD(0),
    LOYALTY(1);
    
    private final int type;

    private LoyaltyCardType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
