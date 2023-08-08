package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferTaxResponse;", "", "amount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "code", "", "label", "(Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getCode", "()Ljava/lang/String;", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferTaxResponse */
public final class OfferTaxResponse {
    @C33608c("amount")
    @C12580l
    private final BasketAmountResponse amount;
    @C33608c("code")
    @C12580l
    private final String code;
    @C33608c("label")
    @C12580l
    private final String label;

    public OfferTaxResponse() {
        this((BasketAmountResponse) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OfferTaxResponse copy$default(OfferTaxResponse offerTaxResponse, BasketAmountResponse basketAmountResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            basketAmountResponse = offerTaxResponse.amount;
        }
        if ((i & 2) != 0) {
            str = offerTaxResponse.code;
        }
        if ((i & 4) != 0) {
            str2 = offerTaxResponse.label;
        }
        return offerTaxResponse.copy(basketAmountResponse, str, str2);
    }

    @C12580l
    public final BasketAmountResponse component1() {
        return this.amount;
    }

    @C12580l
    public final String component2() {
        return this.code;
    }

    @C12580l
    public final String component3() {
        return this.label;
    }

    @C12579k
    public final OfferTaxResponse copy(@C12580l BasketAmountResponse basketAmountResponse, @C12580l String str, @C12580l String str2) {
        return new OfferTaxResponse(basketAmountResponse, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferTaxResponse)) {
            return false;
        }
        OfferTaxResponse offerTaxResponse = (OfferTaxResponse) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) offerTaxResponse.amount) && Intrinsics.areEqual((Object) this.code, (Object) offerTaxResponse.code) && Intrinsics.areEqual((Object) this.label, (Object) offerTaxResponse.label);
    }

    @C12580l
    public final BasketAmountResponse getAmount() {
        return this.amount;
    }

    @C12580l
    public final String getCode() {
        return this.code;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        BasketAmountResponse basketAmountResponse = this.amount;
        int i = 0;
        int hashCode = (basketAmountResponse == null ? 0 : basketAmountResponse.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        BasketAmountResponse basketAmountResponse = this.amount;
        String str = this.code;
        String str2 = this.label;
        return "OfferTaxResponse(amount=" + basketAmountResponse + ", code=" + str + ", label=" + str2 + ")";
    }

    public OfferTaxResponse(@C12580l BasketAmountResponse basketAmountResponse, @C12580l String str, @C12580l String str2) {
        this.amount = basketAmountResponse;
        this.code = str;
        this.label = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferTaxResponse(BasketAmountResponse basketAmountResponse, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basketAmountResponse, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
