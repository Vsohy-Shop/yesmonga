package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0003J\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricesResponse;", "", "discountAmount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "discounts", "", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketDiscountResponse;", "linePrice", "linePriceDiscounted", "lineShippingPrice", "loyaltyAmount", "salePrice", "standardPricePerMeasure", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricePerMeasureResponse;", "taxes", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferTaxResponse;", "unitPrice", "(Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricePerMeasureResponse;Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;)V", "getDiscountAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getDiscounts", "()Ljava/util/List;", "getLinePrice", "getLinePriceDiscounted", "getLineShippingPrice", "getLoyaltyAmount", "getSalePrice", "getStandardPricePerMeasure", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricePerMeasureResponse;", "getTaxes", "getUnitPrice", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricesResponse */
public final class OfferPricesResponse {
    @C33608c("discount_amount")
    @C12580l
    private final BasketAmountResponse discountAmount;
    @C33608c("discounts")
    @C12580l
    private final List<BasketDiscountResponse> discounts;
    @C33608c("line_price")
    @C12580l
    private final BasketAmountResponse linePrice;
    @C33608c("line_price_discounted")
    @C12580l
    private final BasketAmountResponse linePriceDiscounted;
    @C33608c("line_shipping_price")
    @C12580l
    private final BasketAmountResponse lineShippingPrice;
    @C33608c("loyalty_amount")
    @C12580l
    private final BasketAmountResponse loyaltyAmount;
    @C33608c("sale_price")
    @C12580l
    private final BasketAmountResponse salePrice;
    @C33608c("standard_price_per_measure")
    @C12580l
    private final OfferPricePerMeasureResponse standardPricePerMeasure;
    @C33608c("taxes")
    @C12580l
    private final List<OfferTaxResponse> taxes;
    @C33608c("unit_price")
    @C12580l
    private final BasketAmountResponse unitPrice;

    public OfferPricesResponse() {
        this((BasketAmountResponse) null, (List) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (OfferPricePerMeasureResponse) null, (List) null, (BasketAmountResponse) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OfferPricesResponse copy$default(OfferPricesResponse offerPricesResponse, BasketAmountResponse basketAmountResponse, List list, BasketAmountResponse basketAmountResponse2, BasketAmountResponse basketAmountResponse3, BasketAmountResponse basketAmountResponse4, BasketAmountResponse basketAmountResponse5, BasketAmountResponse basketAmountResponse6, OfferPricePerMeasureResponse offerPricePerMeasureResponse, List list2, BasketAmountResponse basketAmountResponse7, int i, Object obj) {
        OfferPricesResponse offerPricesResponse2 = offerPricesResponse;
        int i2 = i;
        return offerPricesResponse.copy((i2 & 1) != 0 ? offerPricesResponse2.discountAmount : basketAmountResponse, (i2 & 2) != 0 ? offerPricesResponse2.discounts : list, (i2 & 4) != 0 ? offerPricesResponse2.linePrice : basketAmountResponse2, (i2 & 8) != 0 ? offerPricesResponse2.linePriceDiscounted : basketAmountResponse3, (i2 & 16) != 0 ? offerPricesResponse2.lineShippingPrice : basketAmountResponse4, (i2 & 32) != 0 ? offerPricesResponse2.loyaltyAmount : basketAmountResponse5, (i2 & 64) != 0 ? offerPricesResponse2.salePrice : basketAmountResponse6, (i2 & 128) != 0 ? offerPricesResponse2.standardPricePerMeasure : offerPricePerMeasureResponse, (i2 & 256) != 0 ? offerPricesResponse2.taxes : list2, (i2 & 512) != 0 ? offerPricesResponse2.unitPrice : basketAmountResponse7);
    }

    @C12580l
    public final BasketAmountResponse component1() {
        return this.discountAmount;
    }

    @C12580l
    public final BasketAmountResponse component10() {
        return this.unitPrice;
    }

    @C12580l
    public final List<BasketDiscountResponse> component2() {
        return this.discounts;
    }

    @C12580l
    public final BasketAmountResponse component3() {
        return this.linePrice;
    }

    @C12580l
    public final BasketAmountResponse component4() {
        return this.linePriceDiscounted;
    }

    @C12580l
    public final BasketAmountResponse component5() {
        return this.lineShippingPrice;
    }

    @C12580l
    public final BasketAmountResponse component6() {
        return this.loyaltyAmount;
    }

    @C12580l
    public final BasketAmountResponse component7() {
        return this.salePrice;
    }

    @C12580l
    public final OfferPricePerMeasureResponse component8() {
        return this.standardPricePerMeasure;
    }

    @C12580l
    public final List<OfferTaxResponse> component9() {
        return this.taxes;
    }

    @C12579k
    public final OfferPricesResponse copy(@C12580l BasketAmountResponse basketAmountResponse, @C12580l List<BasketDiscountResponse> list, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l BasketAmountResponse basketAmountResponse3, @C12580l BasketAmountResponse basketAmountResponse4, @C12580l BasketAmountResponse basketAmountResponse5, @C12580l BasketAmountResponse basketAmountResponse6, @C12580l OfferPricePerMeasureResponse offerPricePerMeasureResponse, @C12580l List<OfferTaxResponse> list2, @C12580l BasketAmountResponse basketAmountResponse7) {
        return new OfferPricesResponse(basketAmountResponse, list, basketAmountResponse2, basketAmountResponse3, basketAmountResponse4, basketAmountResponse5, basketAmountResponse6, offerPricePerMeasureResponse, list2, basketAmountResponse7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferPricesResponse)) {
            return false;
        }
        OfferPricesResponse offerPricesResponse = (OfferPricesResponse) obj;
        return Intrinsics.areEqual((Object) this.discountAmount, (Object) offerPricesResponse.discountAmount) && Intrinsics.areEqual((Object) this.discounts, (Object) offerPricesResponse.discounts) && Intrinsics.areEqual((Object) this.linePrice, (Object) offerPricesResponse.linePrice) && Intrinsics.areEqual((Object) this.linePriceDiscounted, (Object) offerPricesResponse.linePriceDiscounted) && Intrinsics.areEqual((Object) this.lineShippingPrice, (Object) offerPricesResponse.lineShippingPrice) && Intrinsics.areEqual((Object) this.loyaltyAmount, (Object) offerPricesResponse.loyaltyAmount) && Intrinsics.areEqual((Object) this.salePrice, (Object) offerPricesResponse.salePrice) && Intrinsics.areEqual((Object) this.standardPricePerMeasure, (Object) offerPricesResponse.standardPricePerMeasure) && Intrinsics.areEqual((Object) this.taxes, (Object) offerPricesResponse.taxes) && Intrinsics.areEqual((Object) this.unitPrice, (Object) offerPricesResponse.unitPrice);
    }

    @C12580l
    public final BasketAmountResponse getDiscountAmount() {
        return this.discountAmount;
    }

    @C12580l
    public final List<BasketDiscountResponse> getDiscounts() {
        return this.discounts;
    }

    @C12580l
    public final BasketAmountResponse getLinePrice() {
        return this.linePrice;
    }

    @C12580l
    public final BasketAmountResponse getLinePriceDiscounted() {
        return this.linePriceDiscounted;
    }

    @C12580l
    public final BasketAmountResponse getLineShippingPrice() {
        return this.lineShippingPrice;
    }

    @C12580l
    public final BasketAmountResponse getLoyaltyAmount() {
        return this.loyaltyAmount;
    }

    @C12580l
    public final BasketAmountResponse getSalePrice() {
        return this.salePrice;
    }

    @C12580l
    public final OfferPricePerMeasureResponse getStandardPricePerMeasure() {
        return this.standardPricePerMeasure;
    }

    @C12580l
    public final List<OfferTaxResponse> getTaxes() {
        return this.taxes;
    }

    @C12580l
    public final BasketAmountResponse getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        BasketAmountResponse basketAmountResponse = this.discountAmount;
        int i = 0;
        int hashCode = (basketAmountResponse == null ? 0 : basketAmountResponse.hashCode()) * 31;
        List<BasketDiscountResponse> list = this.discounts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse2 = this.linePrice;
        int hashCode3 = (hashCode2 + (basketAmountResponse2 == null ? 0 : basketAmountResponse2.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse3 = this.linePriceDiscounted;
        int hashCode4 = (hashCode3 + (basketAmountResponse3 == null ? 0 : basketAmountResponse3.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse4 = this.lineShippingPrice;
        int hashCode5 = (hashCode4 + (basketAmountResponse4 == null ? 0 : basketAmountResponse4.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse5 = this.loyaltyAmount;
        int hashCode6 = (hashCode5 + (basketAmountResponse5 == null ? 0 : basketAmountResponse5.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse6 = this.salePrice;
        int hashCode7 = (hashCode6 + (basketAmountResponse6 == null ? 0 : basketAmountResponse6.hashCode())) * 31;
        OfferPricePerMeasureResponse offerPricePerMeasureResponse = this.standardPricePerMeasure;
        int hashCode8 = (hashCode7 + (offerPricePerMeasureResponse == null ? 0 : offerPricePerMeasureResponse.hashCode())) * 31;
        List<OfferTaxResponse> list2 = this.taxes;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse7 = this.unitPrice;
        if (basketAmountResponse7 != null) {
            i = basketAmountResponse7.hashCode();
        }
        return hashCode9 + i;
    }

    @C12579k
    public String toString() {
        BasketAmountResponse basketAmountResponse = this.discountAmount;
        List<BasketDiscountResponse> list = this.discounts;
        BasketAmountResponse basketAmountResponse2 = this.linePrice;
        BasketAmountResponse basketAmountResponse3 = this.linePriceDiscounted;
        BasketAmountResponse basketAmountResponse4 = this.lineShippingPrice;
        BasketAmountResponse basketAmountResponse5 = this.loyaltyAmount;
        BasketAmountResponse basketAmountResponse6 = this.salePrice;
        OfferPricePerMeasureResponse offerPricePerMeasureResponse = this.standardPricePerMeasure;
        List<OfferTaxResponse> list2 = this.taxes;
        BasketAmountResponse basketAmountResponse7 = this.unitPrice;
        return "OfferPricesResponse(discountAmount=" + basketAmountResponse + ", discounts=" + list + ", linePrice=" + basketAmountResponse2 + ", linePriceDiscounted=" + basketAmountResponse3 + ", lineShippingPrice=" + basketAmountResponse4 + ", loyaltyAmount=" + basketAmountResponse5 + ", salePrice=" + basketAmountResponse6 + ", standardPricePerMeasure=" + offerPricePerMeasureResponse + ", taxes=" + list2 + ", unitPrice=" + basketAmountResponse7 + ")";
    }

    public OfferPricesResponse(@C12580l BasketAmountResponse basketAmountResponse, @C12580l List<BasketDiscountResponse> list, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l BasketAmountResponse basketAmountResponse3, @C12580l BasketAmountResponse basketAmountResponse4, @C12580l BasketAmountResponse basketAmountResponse5, @C12580l BasketAmountResponse basketAmountResponse6, @C12580l OfferPricePerMeasureResponse offerPricePerMeasureResponse, @C12580l List<OfferTaxResponse> list2, @C12580l BasketAmountResponse basketAmountResponse7) {
        this.discountAmount = basketAmountResponse;
        this.discounts = list;
        this.linePrice = basketAmountResponse2;
        this.linePriceDiscounted = basketAmountResponse3;
        this.lineShippingPrice = basketAmountResponse4;
        this.loyaltyAmount = basketAmountResponse5;
        this.salePrice = basketAmountResponse6;
        this.standardPricePerMeasure = offerPricePerMeasureResponse;
        this.taxes = list2;
        this.unitPrice = basketAmountResponse7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferPricesResponse(com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r12, java.util.List r13, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r14, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r15, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r16, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r17, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r18, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPricePerMeasureResponse r19, java.util.List r20, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPricesResponse.<init>(com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.util.List, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricePerMeasureResponse, java.util.List, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
