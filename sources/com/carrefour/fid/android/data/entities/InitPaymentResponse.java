package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/InitPaymentResponse;", "", "oneOrderId", "", "psp", "pspToken", "remainingAmountToPay", "Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;)V", "getOneOrderId", "()Ljava/lang/String;", "getPsp", "getPspToken", "getRemainingAmountToPay", "()Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class InitPaymentResponse {
    public static final int $stable = 0;
    @C33608c("one_order_id")
    @C12579k
    private final String oneOrderId;
    @C33608c("psp")
    @C12579k
    private final String psp;
    @C33608c("psp_token")
    @C12579k
    private final String pspToken;
    @C33608c("remaining_amount_to_pay")
    @C12579k
    private final RemainingAmountToPay remainingAmountToPay;

    public InitPaymentResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k RemainingAmountToPay remainingAmountToPay2) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        Intrinsics.checkNotNullParameter(str2, "psp");
        Intrinsics.checkNotNullParameter(str3, "pspToken");
        Intrinsics.checkNotNullParameter(remainingAmountToPay2, "remainingAmountToPay");
        this.oneOrderId = str;
        this.psp = str2;
        this.pspToken = str3;
        this.remainingAmountToPay = remainingAmountToPay2;
    }

    public static /* synthetic */ InitPaymentResponse copy$default(InitPaymentResponse initPaymentResponse, String str, String str2, String str3, RemainingAmountToPay remainingAmountToPay2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initPaymentResponse.oneOrderId;
        }
        if ((i & 2) != 0) {
            str2 = initPaymentResponse.psp;
        }
        if ((i & 4) != 0) {
            str3 = initPaymentResponse.pspToken;
        }
        if ((i & 8) != 0) {
            remainingAmountToPay2 = initPaymentResponse.remainingAmountToPay;
        }
        return initPaymentResponse.copy(str, str2, str3, remainingAmountToPay2);
    }

    @C12579k
    public final String component1() {
        return this.oneOrderId;
    }

    @C12579k
    public final String component2() {
        return this.psp;
    }

    @C12579k
    public final String component3() {
        return this.pspToken;
    }

    @C12579k
    public final RemainingAmountToPay component4() {
        return this.remainingAmountToPay;
    }

    @C12579k
    public final InitPaymentResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k RemainingAmountToPay remainingAmountToPay2) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        Intrinsics.checkNotNullParameter(str2, "psp");
        Intrinsics.checkNotNullParameter(str3, "pspToken");
        Intrinsics.checkNotNullParameter(remainingAmountToPay2, "remainingAmountToPay");
        return new InitPaymentResponse(str, str2, str3, remainingAmountToPay2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitPaymentResponse)) {
            return false;
        }
        InitPaymentResponse initPaymentResponse = (InitPaymentResponse) obj;
        return Intrinsics.areEqual((Object) this.oneOrderId, (Object) initPaymentResponse.oneOrderId) && Intrinsics.areEqual((Object) this.psp, (Object) initPaymentResponse.psp) && Intrinsics.areEqual((Object) this.pspToken, (Object) initPaymentResponse.pspToken) && Intrinsics.areEqual((Object) this.remainingAmountToPay, (Object) initPaymentResponse.remainingAmountToPay);
    }

    @C12579k
    public final String getOneOrderId() {
        return this.oneOrderId;
    }

    @C12579k
    public final String getPsp() {
        return this.psp;
    }

    @C12579k
    public final String getPspToken() {
        return this.pspToken;
    }

    @C12579k
    public final RemainingAmountToPay getRemainingAmountToPay() {
        return this.remainingAmountToPay;
    }

    public int hashCode() {
        return (((((this.oneOrderId.hashCode() * 31) + this.psp.hashCode()) * 31) + this.pspToken.hashCode()) * 31) + this.remainingAmountToPay.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.oneOrderId;
        String str2 = this.psp;
        String str3 = this.pspToken;
        RemainingAmountToPay remainingAmountToPay2 = this.remainingAmountToPay;
        return "InitPaymentResponse(oneOrderId=" + str + ", psp=" + str2 + ", pspToken=" + str3 + ", remainingAmountToPay=" + remainingAmountToPay2 + ")";
    }
}
