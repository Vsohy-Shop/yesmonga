package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b-\b\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003JÈ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\f\u0010%R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u000e\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b*\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001f¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketDiscountResponse;", "", "bundle", "", "discountAmount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "endDate", "", "financingTypeCode", "forcedPrice", "gcn", "", "isDisplayedAsPromo", "", "isPromotion", "label", "mandateId", "promoCode", "quantityOfTriggeredDiscount", "startDate", "type", "triggerArticles", "", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/DiscountArticleResponse;", "(Ljava/lang/Integer;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBundle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiscountAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getEndDate", "()Ljava/lang/String;", "getFinancingTypeCode", "getForcedPrice", "getGcn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLabel", "getMandateId", "getPromoCode", "getQuantityOfTriggeredDiscount", "getStartDate", "getTriggerArticles", "()Ljava/util/List;", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketDiscountResponse;", "equals", "other", "hashCode", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketDiscountResponse */
public final class BasketDiscountResponse {
    @C33608c("bundle")
    @C12580l
    private final Integer bundle;
    @C33608c("discount_amount")
    @C12580l
    private final BasketAmountResponse discountAmount;
    @C33608c("end_date")
    @C12580l
    private final String endDate;
    @C33608c("financing_type_code")
    @C12580l
    private final String financingTypeCode;
    @C33608c("forced_price")
    @C12580l
    private final BasketAmountResponse forcedPrice;
    @C33608c("gcn")
    @C12580l
    private final Long gcn;
    @C33608c("is_displayed_as_promo")
    @C12580l
    private final Boolean isDisplayedAsPromo;
    @C33608c("is_promotion")
    @C12580l
    private final Boolean isPromotion;
    @C33608c("label")
    @C12580l
    private final String label;
    @C33608c("mandate_id")
    @C12580l
    private final Long mandateId;
    @C33608c("promo_code")
    @C12580l
    private final String promoCode;
    @C33608c("quantity_of_triggered_discount")
    @C12580l
    private final Integer quantityOfTriggeredDiscount;
    @C33608c("start_date")
    @C12580l
    private final String startDate;
    @C33608c("trigger_articles")
    @C12580l
    private final List<DiscountArticleResponse> triggerArticles;
    @C33608c("type")
    @C12580l
    private final String type;

    public BasketDiscountResponse() {
        this((Integer) null, (BasketAmountResponse) null, (String) null, (String) null, (BasketAmountResponse) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (Long) null, (String) null, (Integer) null, (String) null, (String) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketDiscountResponse copy$default(BasketDiscountResponse basketDiscountResponse, Integer num, BasketAmountResponse basketAmountResponse, String str, String str2, BasketAmountResponse basketAmountResponse2, Long l, Boolean bool, Boolean bool2, String str3, Long l2, String str4, Integer num2, String str5, String str6, List list, int i, Object obj) {
        BasketDiscountResponse basketDiscountResponse2 = basketDiscountResponse;
        int i2 = i;
        return basketDiscountResponse.copy((i2 & 1) != 0 ? basketDiscountResponse2.bundle : num, (i2 & 2) != 0 ? basketDiscountResponse2.discountAmount : basketAmountResponse, (i2 & 4) != 0 ? basketDiscountResponse2.endDate : str, (i2 & 8) != 0 ? basketDiscountResponse2.financingTypeCode : str2, (i2 & 16) != 0 ? basketDiscountResponse2.forcedPrice : basketAmountResponse2, (i2 & 32) != 0 ? basketDiscountResponse2.gcn : l, (i2 & 64) != 0 ? basketDiscountResponse2.isDisplayedAsPromo : bool, (i2 & 128) != 0 ? basketDiscountResponse2.isPromotion : bool2, (i2 & 256) != 0 ? basketDiscountResponse2.label : str3, (i2 & 512) != 0 ? basketDiscountResponse2.mandateId : l2, (i2 & 1024) != 0 ? basketDiscountResponse2.promoCode : str4, (i2 & 2048) != 0 ? basketDiscountResponse2.quantityOfTriggeredDiscount : num2, (i2 & 4096) != 0 ? basketDiscountResponse2.startDate : str5, (i2 & 8192) != 0 ? basketDiscountResponse2.type : str6, (i2 & 16384) != 0 ? basketDiscountResponse2.triggerArticles : list);
    }

    @C12580l
    public final Integer component1() {
        return this.bundle;
    }

    @C12580l
    public final Long component10() {
        return this.mandateId;
    }

    @C12580l
    public final String component11() {
        return this.promoCode;
    }

    @C12580l
    public final Integer component12() {
        return this.quantityOfTriggeredDiscount;
    }

    @C12580l
    public final String component13() {
        return this.startDate;
    }

    @C12580l
    public final String component14() {
        return this.type;
    }

    @C12580l
    public final List<DiscountArticleResponse> component15() {
        return this.triggerArticles;
    }

    @C12580l
    public final BasketAmountResponse component2() {
        return this.discountAmount;
    }

    @C12580l
    public final String component3() {
        return this.endDate;
    }

    @C12580l
    public final String component4() {
        return this.financingTypeCode;
    }

    @C12580l
    public final BasketAmountResponse component5() {
        return this.forcedPrice;
    }

    @C12580l
    public final Long component6() {
        return this.gcn;
    }

    @C12580l
    public final Boolean component7() {
        return this.isDisplayedAsPromo;
    }

    @C12580l
    public final Boolean component8() {
        return this.isPromotion;
    }

    @C12580l
    public final String component9() {
        return this.label;
    }

    @C12579k
    public final BasketDiscountResponse copy(@C12580l Integer num, @C12580l BasketAmountResponse basketAmountResponse, @C12580l String str, @C12580l String str2, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l Long l, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l String str3, @C12580l Long l2, @C12580l String str4, @C12580l Integer num2, @C12580l String str5, @C12580l String str6, @C12580l List<DiscountArticleResponse> list) {
        return new BasketDiscountResponse(num, basketAmountResponse, str, str2, basketAmountResponse2, l, bool, bool2, str3, l2, str4, num2, str5, str6, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketDiscountResponse)) {
            return false;
        }
        BasketDiscountResponse basketDiscountResponse = (BasketDiscountResponse) obj;
        return Intrinsics.areEqual((Object) this.bundle, (Object) basketDiscountResponse.bundle) && Intrinsics.areEqual((Object) this.discountAmount, (Object) basketDiscountResponse.discountAmount) && Intrinsics.areEqual((Object) this.endDate, (Object) basketDiscountResponse.endDate) && Intrinsics.areEqual((Object) this.financingTypeCode, (Object) basketDiscountResponse.financingTypeCode) && Intrinsics.areEqual((Object) this.forcedPrice, (Object) basketDiscountResponse.forcedPrice) && Intrinsics.areEqual((Object) this.gcn, (Object) basketDiscountResponse.gcn) && Intrinsics.areEqual((Object) this.isDisplayedAsPromo, (Object) basketDiscountResponse.isDisplayedAsPromo) && Intrinsics.areEqual((Object) this.isPromotion, (Object) basketDiscountResponse.isPromotion) && Intrinsics.areEqual((Object) this.label, (Object) basketDiscountResponse.label) && Intrinsics.areEqual((Object) this.mandateId, (Object) basketDiscountResponse.mandateId) && Intrinsics.areEqual((Object) this.promoCode, (Object) basketDiscountResponse.promoCode) && Intrinsics.areEqual((Object) this.quantityOfTriggeredDiscount, (Object) basketDiscountResponse.quantityOfTriggeredDiscount) && Intrinsics.areEqual((Object) this.startDate, (Object) basketDiscountResponse.startDate) && Intrinsics.areEqual((Object) this.type, (Object) basketDiscountResponse.type) && Intrinsics.areEqual((Object) this.triggerArticles, (Object) basketDiscountResponse.triggerArticles);
    }

    @C12580l
    public final Integer getBundle() {
        return this.bundle;
    }

    @C12580l
    public final BasketAmountResponse getDiscountAmount() {
        return this.discountAmount;
    }

    @C12580l
    public final String getEndDate() {
        return this.endDate;
    }

    @C12580l
    public final String getFinancingTypeCode() {
        return this.financingTypeCode;
    }

    @C12580l
    public final BasketAmountResponse getForcedPrice() {
        return this.forcedPrice;
    }

    @C12580l
    public final Long getGcn() {
        return this.gcn;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final Long getMandateId() {
        return this.mandateId;
    }

    @C12580l
    public final String getPromoCode() {
        return this.promoCode;
    }

    @C12580l
    public final Integer getQuantityOfTriggeredDiscount() {
        return this.quantityOfTriggeredDiscount;
    }

    @C12580l
    public final String getStartDate() {
        return this.startDate;
    }

    @C12580l
    public final List<DiscountArticleResponse> getTriggerArticles() {
        return this.triggerArticles;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.bundle;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BasketAmountResponse basketAmountResponse = this.discountAmount;
        int hashCode2 = (hashCode + (basketAmountResponse == null ? 0 : basketAmountResponse.hashCode())) * 31;
        String str = this.endDate;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.financingTypeCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse2 = this.forcedPrice;
        int hashCode5 = (hashCode4 + (basketAmountResponse2 == null ? 0 : basketAmountResponse2.hashCode())) * 31;
        Long l = this.gcn;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isDisplayedAsPromo;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPromotion;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.mandateId;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.promoCode;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.quantityOfTriggeredDiscount;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.startDate;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<DiscountArticleResponse> list = this.triggerArticles;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode14 + i;
    }

    @C12580l
    public final Boolean isDisplayedAsPromo() {
        return this.isDisplayedAsPromo;
    }

    @C12580l
    public final Boolean isPromotion() {
        return this.isPromotion;
    }

    @C12579k
    public String toString() {
        Integer num = this.bundle;
        BasketAmountResponse basketAmountResponse = this.discountAmount;
        String str = this.endDate;
        String str2 = this.financingTypeCode;
        BasketAmountResponse basketAmountResponse2 = this.forcedPrice;
        Long l = this.gcn;
        Boolean bool = this.isDisplayedAsPromo;
        Boolean bool2 = this.isPromotion;
        String str3 = this.label;
        Long l2 = this.mandateId;
        String str4 = this.promoCode;
        Integer num2 = this.quantityOfTriggeredDiscount;
        String str5 = this.startDate;
        String str6 = this.type;
        List<DiscountArticleResponse> list = this.triggerArticles;
        return "BasketDiscountResponse(bundle=" + num + ", discountAmount=" + basketAmountResponse + ", endDate=" + str + ", financingTypeCode=" + str2 + ", forcedPrice=" + basketAmountResponse2 + ", gcn=" + l + ", isDisplayedAsPromo=" + bool + ", isPromotion=" + bool2 + ", label=" + str3 + ", mandateId=" + l2 + ", promoCode=" + str4 + ", quantityOfTriggeredDiscount=" + num2 + ", startDate=" + str5 + ", type=" + str6 + ", triggerArticles=" + list + ")";
    }

    public BasketDiscountResponse(@C12580l Integer num, @C12580l BasketAmountResponse basketAmountResponse, @C12580l String str, @C12580l String str2, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l Long l, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l String str3, @C12580l Long l2, @C12580l String str4, @C12580l Integer num2, @C12580l String str5, @C12580l String str6, @C12580l List<DiscountArticleResponse> list) {
        this.bundle = num;
        this.discountAmount = basketAmountResponse;
        this.endDate = str;
        this.financingTypeCode = str2;
        this.forcedPrice = basketAmountResponse2;
        this.gcn = l;
        this.isDisplayedAsPromo = bool;
        this.isPromotion = bool2;
        this.label = str3;
        this.mandateId = l2;
        this.promoCode = str4;
        this.quantityOfTriggeredDiscount = num2;
        this.startDate = str5;
        this.type = str6;
        this.triggerArticles = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketDiscountResponse(java.lang.Integer r17, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r18, java.lang.String r19, java.lang.String r20, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r21, java.lang.Long r22, java.lang.Boolean r23, java.lang.Boolean r24, java.lang.String r25, java.lang.Long r26, java.lang.String r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.util.List r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketDiscountResponse.<init>(java.lang.Integer, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.lang.String, java.lang.String, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
