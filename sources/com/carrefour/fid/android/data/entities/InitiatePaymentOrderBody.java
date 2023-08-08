package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/InitiatePaymentOrderBody;", "", "oneOrderId", "", "loyaltyAmount", "Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "ipAddress", "(Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;Ljava/lang/String;)V", "getIpAddress", "()Ljava/lang/String;", "getLoyaltyAmount", "()Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "getOneOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class InitiatePaymentOrderBody {
    public static final int $stable = 0;
    @C33608c("ip_address")
    @C12579k
    private final String ipAddress;
    @C33608c("loyalty_amount")
    @C12580l
    private final RemainingAmountToPay loyaltyAmount;
    @C33608c("one_order_id")
    @C12579k
    private final String oneOrderId;

    public InitiatePaymentOrderBody(@C12579k String str, @C12580l RemainingAmountToPay remainingAmountToPay, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        Intrinsics.checkNotNullParameter(str2, "ipAddress");
        this.oneOrderId = str;
        this.loyaltyAmount = remainingAmountToPay;
        this.ipAddress = str2;
    }

    public static /* synthetic */ InitiatePaymentOrderBody copy$default(InitiatePaymentOrderBody initiatePaymentOrderBody, String str, RemainingAmountToPay remainingAmountToPay, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initiatePaymentOrderBody.oneOrderId;
        }
        if ((i & 2) != 0) {
            remainingAmountToPay = initiatePaymentOrderBody.loyaltyAmount;
        }
        if ((i & 4) != 0) {
            str2 = initiatePaymentOrderBody.ipAddress;
        }
        return initiatePaymentOrderBody.copy(str, remainingAmountToPay, str2);
    }

    @C12579k
    public final String component1() {
        return this.oneOrderId;
    }

    @C12580l
    public final RemainingAmountToPay component2() {
        return this.loyaltyAmount;
    }

    @C12579k
    public final String component3() {
        return this.ipAddress;
    }

    @C12579k
    public final InitiatePaymentOrderBody copy(@C12579k String str, @C12580l RemainingAmountToPay remainingAmountToPay, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        Intrinsics.checkNotNullParameter(str2, "ipAddress");
        return new InitiatePaymentOrderBody(str, remainingAmountToPay, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiatePaymentOrderBody)) {
            return false;
        }
        InitiatePaymentOrderBody initiatePaymentOrderBody = (InitiatePaymentOrderBody) obj;
        return Intrinsics.areEqual((Object) this.oneOrderId, (Object) initiatePaymentOrderBody.oneOrderId) && Intrinsics.areEqual((Object) this.loyaltyAmount, (Object) initiatePaymentOrderBody.loyaltyAmount) && Intrinsics.areEqual((Object) this.ipAddress, (Object) initiatePaymentOrderBody.ipAddress);
    }

    @C12579k
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @C12580l
    public final RemainingAmountToPay getLoyaltyAmount() {
        return this.loyaltyAmount;
    }

    @C12579k
    public final String getOneOrderId() {
        return this.oneOrderId;
    }

    public int hashCode() {
        int hashCode = this.oneOrderId.hashCode() * 31;
        RemainingAmountToPay remainingAmountToPay = this.loyaltyAmount;
        return ((hashCode + (remainingAmountToPay == null ? 0 : remainingAmountToPay.hashCode())) * 31) + this.ipAddress.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.oneOrderId;
        RemainingAmountToPay remainingAmountToPay = this.loyaltyAmount;
        String str2 = this.ipAddress;
        return "InitiatePaymentOrderBody(oneOrderId=" + str + ", loyaltyAmount=" + remainingAmountToPay + ", ipAddress=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InitiatePaymentOrderBody(String str, RemainingAmountToPay remainingAmountToPay, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : remainingAmountToPay, (i & 4) != 0 ? "127.0.0.1" : str2);
    }
}
