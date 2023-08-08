package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u0001BÉ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\"R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b1\u0010*R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b2\u0010*R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b3\u0010*R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b4\u0010*R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b5\u0010*¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketOfferResponse;", "", "cdbase", "", "gtin", "messages", "", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferMessageResponse;", "offerId", "", "offerLine", "", "offerTotalAmount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "pictures", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPictureResponse;", "prices", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricesResponse;", "purchasingMax", "purchasingMin", "purchasingStep", "qtyToSell", "name", "quantity", "categoryLimit", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferCategoryLimitResponse;", "isDigitalCard", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricesResponse;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferCategoryLimitResponse;Z)V", "getCategoryLimit", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferCategoryLimitResponse;", "getCdbase", "()Ljava/lang/String;", "getGtin", "()Z", "getMessages", "()Ljava/util/List;", "getName", "getOfferId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOfferLine", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOfferTotalAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getPictures", "getPrices", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferPricesResponse;", "getPurchasingMax", "getPurchasingMin", "getPurchasingStep", "getQtyToSell", "getQuantity", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketOfferResponse */
public final class BasketOfferResponse {
    @C33608c("category_limit")
    @C12580l
    private final OfferCategoryLimitResponse categoryLimit;
    @C33608c("cdbase")
    @C12580l
    private final String cdbase;
    @C33608c("gtin")
    @C12579k
    private final String gtin;
    @C33608c("is_digital_card")
    private final boolean isDigitalCard;
    @C33608c("messages")
    @C12580l
    private final List<OfferMessageResponse> messages;
    @C33608c("name")
    @C12580l
    private final String name;
    @C33608c("offer_id")
    @C12580l
    private final Long offerId;
    @C33608c("offer_line")
    @C12580l
    private final Integer offerLine;
    @C33608c("offer_total_amount")
    @C12580l
    private final BasketAmountResponse offerTotalAmount;
    @C33608c("pictures")
    @C12580l
    private final List<OfferPictureResponse> pictures;
    @C33608c("prices")
    @C12580l
    private final OfferPricesResponse prices;
    @C33608c("purchasing_max")
    @C12580l
    private final Integer purchasingMax;
    @C33608c("purchasing_min")
    @C12580l
    private final Integer purchasingMin;
    @C33608c("purchasing_step")
    @C12580l
    private final Integer purchasingStep;
    @C33608c("qty_to_sell")
    @C12580l
    private final Integer qtyToSell;
    @C33608c("quantity")
    @C12580l
    private final Integer quantity;

    public BasketOfferResponse(@C12580l String str, @C12579k String str2, @C12580l List<OfferMessageResponse> list, @C12580l Long l, @C12580l Integer num, @C12580l BasketAmountResponse basketAmountResponse, @C12580l List<OfferPictureResponse> list2, @C12580l OfferPricesResponse offerPricesResponse, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l String str3, @C12580l Integer num6, @C12580l OfferCategoryLimitResponse offerCategoryLimitResponse, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "gtin");
        this.cdbase = str;
        this.gtin = str2;
        this.messages = list;
        this.offerId = l;
        this.offerLine = num;
        this.offerTotalAmount = basketAmountResponse;
        this.pictures = list2;
        this.prices = offerPricesResponse;
        this.purchasingMax = num2;
        this.purchasingMin = num3;
        this.purchasingStep = num4;
        this.qtyToSell = num5;
        this.name = str3;
        this.quantity = num6;
        this.categoryLimit = offerCategoryLimitResponse;
        this.isDigitalCard = z;
    }

    @C12580l
    public final OfferCategoryLimitResponse getCategoryLimit() {
        return this.categoryLimit;
    }

    @C12580l
    public final String getCdbase() {
        return this.cdbase;
    }

    @C12579k
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final List<OfferMessageResponse> getMessages() {
        return this.messages;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final Long getOfferId() {
        return this.offerId;
    }

    @C12580l
    public final Integer getOfferLine() {
        return this.offerLine;
    }

    @C12580l
    public final BasketAmountResponse getOfferTotalAmount() {
        return this.offerTotalAmount;
    }

    @C12580l
    public final List<OfferPictureResponse> getPictures() {
        return this.pictures;
    }

    @C12580l
    public final OfferPricesResponse getPrices() {
        return this.prices;
    }

    @C12580l
    public final Integer getPurchasingMax() {
        return this.purchasingMax;
    }

    @C12580l
    public final Integer getPurchasingMin() {
        return this.purchasingMin;
    }

    @C12580l
    public final Integer getPurchasingStep() {
        return this.purchasingStep;
    }

    @C12580l
    public final Integer getQtyToSell() {
        return this.qtyToSell;
    }

    @C12580l
    public final Integer getQuantity() {
        return this.quantity;
    }

    public final boolean isDigitalCard() {
        return this.isDigitalCard;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketOfferResponse(java.lang.String r21, java.lang.String r22, java.util.List r23, java.lang.Long r24, java.lang.Integer r25, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r26, java.util.List r27, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPricesResponse r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.String r33, java.lang.Integer r34, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferCategoryLimitResponse r35, boolean r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r21
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r23
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r24
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r25
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r26
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r27
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r28
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r29
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r30
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r31
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0059
            r15 = r2
            goto L_0x005b
        L_0x0059:
            r15 = r32
        L_0x005b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0062
            r16 = r2
            goto L_0x0064
        L_0x0062:
            r16 = r33
        L_0x0064:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            r17 = r2
            goto L_0x006d
        L_0x006b:
            r17 = r34
        L_0x006d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0077
            r0 = 0
            r19 = r0
            goto L_0x0079
        L_0x0077:
            r19 = r36
        L_0x0079:
            r3 = r20
            r5 = r22
            r18 = r35
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketOfferResponse.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.Long, java.lang.Integer, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.util.List, com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferPricesResponse, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferCategoryLimitResponse, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
