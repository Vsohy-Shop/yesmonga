package com.carrefour.fid.android.basket.data.api.entities.p022v4.request;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/BasketYieldFeesRequest;", "", "slotId", "", "subBasketId", "yieldFeesAmount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/YieldFeesAmountRequest;", "yieldFeeToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/YieldFeesAmountRequest;Ljava/lang/String;)V", "getSlotId", "()Ljava/lang/String;", "getSubBasketId", "getYieldFeeToken", "getYieldFeesAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/YieldFeesAmountRequest;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.request.BasketYieldFeesRequest */
public final class BasketYieldFeesRequest {
    @C33608c("slot_id")
    @C12580l
    private final String slotId;
    @C33608c("sub_basket_id")
    @C12580l
    private final String subBasketId;
    @C33608c("yield_fee_token")
    @C12580l
    private final String yieldFeeToken;
    @C33608c("yield_fees")
    @C12580l
    private final YieldFeesAmountRequest yieldFeesAmount;

    public BasketYieldFeesRequest(@C12580l String str, @C12580l String str2, @C12580l YieldFeesAmountRequest yieldFeesAmountRequest, @C12580l String str3) {
        this.slotId = str;
        this.subBasketId = str2;
        this.yieldFeesAmount = yieldFeesAmountRequest;
        this.yieldFeeToken = str3;
    }

    public static /* synthetic */ BasketYieldFeesRequest copy$default(BasketYieldFeesRequest basketYieldFeesRequest, String str, String str2, YieldFeesAmountRequest yieldFeesAmountRequest, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketYieldFeesRequest.slotId;
        }
        if ((i & 2) != 0) {
            str2 = basketYieldFeesRequest.subBasketId;
        }
        if ((i & 4) != 0) {
            yieldFeesAmountRequest = basketYieldFeesRequest.yieldFeesAmount;
        }
        if ((i & 8) != 0) {
            str3 = basketYieldFeesRequest.yieldFeeToken;
        }
        return basketYieldFeesRequest.copy(str, str2, yieldFeesAmountRequest, str3);
    }

    @C12580l
    public final String component1() {
        return this.slotId;
    }

    @C12580l
    public final String component2() {
        return this.subBasketId;
    }

    @C12580l
    public final YieldFeesAmountRequest component3() {
        return this.yieldFeesAmount;
    }

    @C12580l
    public final String component4() {
        return this.yieldFeeToken;
    }

    @C12579k
    public final BasketYieldFeesRequest copy(@C12580l String str, @C12580l String str2, @C12580l YieldFeesAmountRequest yieldFeesAmountRequest, @C12580l String str3) {
        return new BasketYieldFeesRequest(str, str2, yieldFeesAmountRequest, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketYieldFeesRequest)) {
            return false;
        }
        BasketYieldFeesRequest basketYieldFeesRequest = (BasketYieldFeesRequest) obj;
        return Intrinsics.areEqual((Object) this.slotId, (Object) basketYieldFeesRequest.slotId) && Intrinsics.areEqual((Object) this.subBasketId, (Object) basketYieldFeesRequest.subBasketId) && Intrinsics.areEqual((Object) this.yieldFeesAmount, (Object) basketYieldFeesRequest.yieldFeesAmount) && Intrinsics.areEqual((Object) this.yieldFeeToken, (Object) basketYieldFeesRequest.yieldFeeToken);
    }

    @C12580l
    public final String getSlotId() {
        return this.slotId;
    }

    @C12580l
    public final String getSubBasketId() {
        return this.subBasketId;
    }

    @C12580l
    public final String getYieldFeeToken() {
        return this.yieldFeeToken;
    }

    @C12580l
    public final YieldFeesAmountRequest getYieldFeesAmount() {
        return this.yieldFeesAmount;
    }

    public int hashCode() {
        String str = this.slotId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subBasketId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        YieldFeesAmountRequest yieldFeesAmountRequest = this.yieldFeesAmount;
        int hashCode3 = (hashCode2 + (yieldFeesAmountRequest == null ? 0 : yieldFeesAmountRequest.hashCode())) * 31;
        String str3 = this.yieldFeeToken;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.slotId;
        String str2 = this.subBasketId;
        YieldFeesAmountRequest yieldFeesAmountRequest = this.yieldFeesAmount;
        String str3 = this.yieldFeeToken;
        return "BasketYieldFeesRequest(slotId=" + str + ", subBasketId=" + str2 + ", yieldFeesAmount=" + yieldFeesAmountRequest + ", yieldFeeToken=" + str3 + ")";
    }
}
