package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u000eJ!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricePerMeasureResponse;", "", "pricePerUnitValue", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "unitMeasure", "", "(Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;)V", "getPricePerUnitValue$basket_release", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getUnitMeasure$basket_release", "()Ljava/lang/String;", "component1", "component1$basket_release", "component2", "component2$basket_release", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricePerMeasureResponse */
public final class OfferPricePerMeasureResponse {
    @C33608c("price_per_unit_value")
    @C12580l
    private final BasketAmountResponse pricePerUnitValue;
    @C33608c("unit_measure")
    @C12580l
    private final String unitMeasure;

    public OfferPricePerMeasureResponse() {
        this((BasketAmountResponse) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OfferPricePerMeasureResponse copy$default(OfferPricePerMeasureResponse offerPricePerMeasureResponse, BasketAmountResponse basketAmountResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            basketAmountResponse = offerPricePerMeasureResponse.pricePerUnitValue;
        }
        if ((i & 2) != 0) {
            str = offerPricePerMeasureResponse.unitMeasure;
        }
        return offerPricePerMeasureResponse.copy(basketAmountResponse, str);
    }

    @C12580l
    public final BasketAmountResponse component1$basket_release() {
        return this.pricePerUnitValue;
    }

    @C12580l
    public final String component2$basket_release() {
        return this.unitMeasure;
    }

    @C12579k
    public final OfferPricePerMeasureResponse copy(@C12580l BasketAmountResponse basketAmountResponse, @C12580l String str) {
        return new OfferPricePerMeasureResponse(basketAmountResponse, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferPricePerMeasureResponse)) {
            return false;
        }
        OfferPricePerMeasureResponse offerPricePerMeasureResponse = (OfferPricePerMeasureResponse) obj;
        return Intrinsics.areEqual((Object) this.pricePerUnitValue, (Object) offerPricePerMeasureResponse.pricePerUnitValue) && Intrinsics.areEqual((Object) this.unitMeasure, (Object) offerPricePerMeasureResponse.unitMeasure);
    }

    @C12580l
    public final BasketAmountResponse getPricePerUnitValue$basket_release() {
        return this.pricePerUnitValue;
    }

    @C12580l
    public final String getUnitMeasure$basket_release() {
        return this.unitMeasure;
    }

    public int hashCode() {
        BasketAmountResponse basketAmountResponse = this.pricePerUnitValue;
        int i = 0;
        int hashCode = (basketAmountResponse == null ? 0 : basketAmountResponse.hashCode()) * 31;
        String str = this.unitMeasure;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BasketAmountResponse basketAmountResponse = this.pricePerUnitValue;
        String str = this.unitMeasure;
        return "OfferPricePerMeasureResponse(pricePerUnitValue=" + basketAmountResponse + ", unitMeasure=" + str + ")";
    }

    public OfferPricePerMeasureResponse(@C12580l BasketAmountResponse basketAmountResponse, @C12580l String str) {
        this.pricePerUnitValue = basketAmountResponse;
        this.unitMeasure = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferPricePerMeasureResponse(BasketAmountResponse basketAmountResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basketAmountResponse, (i & 2) != 0 ? null : str);
    }
}
