package com.carrefour.fid.android.data.entities.coupons;

import androidx.annotation.Keep;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/CouponAction;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "EMIT", "BOOK", "BURN", "UNBOOK", "CANCEL", "ADDTOBASKET", "REMOVEFROMBASKET", "LOADTOCARD", "UNLOADTOCARD", "PRINT", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public enum CouponAction {
    EMIT("EMIT"),
    BOOK("BOOK"),
    BURN("BURN"),
    UNBOOK("UNBOOK"),
    CANCEL("CANCEL"),
    ADDTOBASKET("ADDTOBASKET"),
    REMOVEFROMBASKET("REMOVEFROMBASKET"),
    LOADTOCARD("LOADTOCARD"),
    UNLOADTOCARD("UNLOADTOCARD"),
    PRINT("PRINT");
    
    @C12579k
    private final String type;

    private CouponAction(String str) {
        this.type = str;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }
}
