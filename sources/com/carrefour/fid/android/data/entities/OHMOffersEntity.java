package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\b\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001dJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010%J\u0013\u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00103J\t\u0010A\u001a\u00020\u001aHÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00103J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0018HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR \u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0012\u0010%R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u001c\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b7\u00103¨\u0006R"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMOffersEntity;", "", "brandName", "", "category", "cdBase", "gtin", "name", "offerId", "offerPreparedTotalAmount", "Lcom/carrefour/fid/android/data/entities/Amount;", "offerTotalAmount", "offerTotalImmediateDiscountAmount", "offerTotalPaidAmount", "offerUnit", "originalCdBase", "packaging", "picturePath", "isDigitalItem", "", "digitalItem", "", "Lcom/carrefour/fid/android/data/entities/DigitalItemEntity;", "preparedQuantity", "", "prices", "Lcom/carrefour/fid/android/data/entities/OHMPrices;", "quantity", "isReturnableBag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Lcom/carrefour/fid/android/data/entities/OHMPrices;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getBrandName", "()Ljava/lang/String;", "getCategory", "getCdBase", "getDigitalItem", "()Ljava/util/List;", "getGtin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getOfferId", "getOfferPreparedTotalAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getOfferTotalAmount", "getOfferTotalImmediateDiscountAmount", "getOfferTotalPaidAmount", "getOfferUnit", "getOriginalCdBase", "getPackaging", "getPicturePath", "getPreparedQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrices", "()Lcom/carrefour/fid/android/data/entities/OHMPrices;", "getQuantity", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Lcom/carrefour/fid/android/data/entities/OHMPrices;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/data/entities/OHMOffersEntity;", "equals", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMOffersEntity {
    public static final int $stable = 8;
    @C33608c("brand_name")
    @C12580l
    private final String brandName;
    @C33608c("category")
    @C12579k
    private final String category;
    @C33608c("cdbase")
    @C12580l
    private final String cdBase;
    @C33608c("digital_items")
    @C12580l
    private final List<DigitalItemEntity> digitalItem;
    @C33608c("gtin")
    @C12580l
    private final String gtin;
    @C33608c("is_digital_item")
    @C12580l
    private final Boolean isDigitalItem;
    @C33608c("is_returnable_bag")
    @C12580l
    private final Boolean isReturnableBag;
    @C33608c("name")
    @C12580l
    private final String name;
    @C33608c("offer_id")
    @C12580l
    private final String offerId;
    @C33608c("offer_prepared_total_amount")
    @C12580l
    private final Amount offerPreparedTotalAmount;
    @C33608c("offer_total_amount")
    @C12580l
    private final Amount offerTotalAmount;
    @C33608c("offer_total_immediate_discount_amount")
    @C12580l
    private final Amount offerTotalImmediateDiscountAmount;
    @C33608c("offer_total_paid_amount")
    @C12580l
    private final Amount offerTotalPaidAmount;
    @C33608c("offer_unit")
    @C12580l
    private final String offerUnit;
    @C33608c("original_cdbase")
    @C12580l
    private final String originalCdBase;
    @C33608c("packaging")
    @C12580l
    private final String packaging;
    @C33608c("picture_path")
    @C12580l
    private final String picturePath;
    @C33608c("prepared_quantity")
    @C12580l
    private final Integer preparedQuantity;
    @C33608c("prices")
    @C12579k
    private final OHMPrices prices;
    @C33608c("quantity")
    @C12580l
    private final Integer quantity;

    public OHMOffersEntity(@C12580l String str, @C12579k String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l Amount amount, @C12580l Amount amount2, @C12580l Amount amount3, @C12580l Amount amount4, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l Boolean bool, @C12580l List<DigitalItemEntity> list, @C12580l Integer num, @C12579k OHMPrices oHMPrices, @C12580l Integer num2, @C12580l Boolean bool2) {
        OHMPrices oHMPrices2 = oHMPrices;
        Intrinsics.checkNotNullParameter(str2, "category");
        Intrinsics.checkNotNullParameter(oHMPrices2, "prices");
        this.brandName = str;
        this.category = str2;
        this.cdBase = str3;
        this.gtin = str4;
        this.name = str5;
        this.offerId = str6;
        this.offerPreparedTotalAmount = amount;
        this.offerTotalAmount = amount2;
        this.offerTotalImmediateDiscountAmount = amount3;
        this.offerTotalPaidAmount = amount4;
        this.offerUnit = str7;
        this.originalCdBase = str8;
        this.packaging = str9;
        this.picturePath = str10;
        this.isDigitalItem = bool;
        this.digitalItem = list;
        this.preparedQuantity = num;
        this.prices = oHMPrices2;
        this.quantity = num2;
        this.isReturnableBag = bool2;
    }

    public static /* synthetic */ OHMOffersEntity copy$default(OHMOffersEntity oHMOffersEntity, String str, String str2, String str3, String str4, String str5, String str6, Amount amount, Amount amount2, Amount amount3, Amount amount4, String str7, String str8, String str9, String str10, Boolean bool, List list, Integer num, OHMPrices oHMPrices, Integer num2, Boolean bool2, int i, Object obj) {
        OHMOffersEntity oHMOffersEntity2 = oHMOffersEntity;
        int i2 = i;
        return oHMOffersEntity.copy((i2 & 1) != 0 ? oHMOffersEntity2.brandName : str, (i2 & 2) != 0 ? oHMOffersEntity2.category : str2, (i2 & 4) != 0 ? oHMOffersEntity2.cdBase : str3, (i2 & 8) != 0 ? oHMOffersEntity2.gtin : str4, (i2 & 16) != 0 ? oHMOffersEntity2.name : str5, (i2 & 32) != 0 ? oHMOffersEntity2.offerId : str6, (i2 & 64) != 0 ? oHMOffersEntity2.offerPreparedTotalAmount : amount, (i2 & 128) != 0 ? oHMOffersEntity2.offerTotalAmount : amount2, (i2 & 256) != 0 ? oHMOffersEntity2.offerTotalImmediateDiscountAmount : amount3, (i2 & 512) != 0 ? oHMOffersEntity2.offerTotalPaidAmount : amount4, (i2 & 1024) != 0 ? oHMOffersEntity2.offerUnit : str7, (i2 & 2048) != 0 ? oHMOffersEntity2.originalCdBase : str8, (i2 & 4096) != 0 ? oHMOffersEntity2.packaging : str9, (i2 & 8192) != 0 ? oHMOffersEntity2.picturePath : str10, (i2 & 16384) != 0 ? oHMOffersEntity2.isDigitalItem : bool, (i2 & 32768) != 0 ? oHMOffersEntity2.digitalItem : list, (i2 & 65536) != 0 ? oHMOffersEntity2.preparedQuantity : num, (i2 & 131072) != 0 ? oHMOffersEntity2.prices : oHMPrices, (i2 & 262144) != 0 ? oHMOffersEntity2.quantity : num2, (i2 & 524288) != 0 ? oHMOffersEntity2.isReturnableBag : bool2);
    }

    @C12580l
    public final String component1() {
        return this.brandName;
    }

    @C12580l
    public final Amount component10() {
        return this.offerTotalPaidAmount;
    }

    @C12580l
    public final String component11() {
        return this.offerUnit;
    }

    @C12580l
    public final String component12() {
        return this.originalCdBase;
    }

    @C12580l
    public final String component13() {
        return this.packaging;
    }

    @C12580l
    public final String component14() {
        return this.picturePath;
    }

    @C12580l
    public final Boolean component15() {
        return this.isDigitalItem;
    }

    @C12580l
    public final List<DigitalItemEntity> component16() {
        return this.digitalItem;
    }

    @C12580l
    public final Integer component17() {
        return this.preparedQuantity;
    }

    @C12579k
    public final OHMPrices component18() {
        return this.prices;
    }

    @C12580l
    public final Integer component19() {
        return this.quantity;
    }

    @C12579k
    public final String component2() {
        return this.category;
    }

    @C12580l
    public final Boolean component20() {
        return this.isReturnableBag;
    }

    @C12580l
    public final String component3() {
        return this.cdBase;
    }

    @C12580l
    public final String component4() {
        return this.gtin;
    }

    @C12580l
    public final String component5() {
        return this.name;
    }

    @C12580l
    public final String component6() {
        return this.offerId;
    }

    @C12580l
    public final Amount component7() {
        return this.offerPreparedTotalAmount;
    }

    @C12580l
    public final Amount component8() {
        return this.offerTotalAmount;
    }

    @C12580l
    public final Amount component9() {
        return this.offerTotalImmediateDiscountAmount;
    }

    @C12579k
    public final OHMOffersEntity copy(@C12580l String str, @C12579k String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l Amount amount, @C12580l Amount amount2, @C12580l Amount amount3, @C12580l Amount amount4, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l Boolean bool, @C12580l List<DigitalItemEntity> list, @C12580l Integer num, @C12579k OHMPrices oHMPrices, @C12580l Integer num2, @C12580l Boolean bool2) {
        String str11 = str;
        Intrinsics.checkNotNullParameter(str2, "category");
        Intrinsics.checkNotNullParameter(oHMPrices, "prices");
        return new OHMOffersEntity(str, str2, str3, str4, str5, str6, amount, amount2, amount3, amount4, str7, str8, str9, str10, bool, list, num, oHMPrices, num2, bool2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMOffersEntity)) {
            return false;
        }
        OHMOffersEntity oHMOffersEntity = (OHMOffersEntity) obj;
        return Intrinsics.areEqual((Object) this.brandName, (Object) oHMOffersEntity.brandName) && Intrinsics.areEqual((Object) this.category, (Object) oHMOffersEntity.category) && Intrinsics.areEqual((Object) this.cdBase, (Object) oHMOffersEntity.cdBase) && Intrinsics.areEqual((Object) this.gtin, (Object) oHMOffersEntity.gtin) && Intrinsics.areEqual((Object) this.name, (Object) oHMOffersEntity.name) && Intrinsics.areEqual((Object) this.offerId, (Object) oHMOffersEntity.offerId) && Intrinsics.areEqual((Object) this.offerPreparedTotalAmount, (Object) oHMOffersEntity.offerPreparedTotalAmount) && Intrinsics.areEqual((Object) this.offerTotalAmount, (Object) oHMOffersEntity.offerTotalAmount) && Intrinsics.areEqual((Object) this.offerTotalImmediateDiscountAmount, (Object) oHMOffersEntity.offerTotalImmediateDiscountAmount) && Intrinsics.areEqual((Object) this.offerTotalPaidAmount, (Object) oHMOffersEntity.offerTotalPaidAmount) && Intrinsics.areEqual((Object) this.offerUnit, (Object) oHMOffersEntity.offerUnit) && Intrinsics.areEqual((Object) this.originalCdBase, (Object) oHMOffersEntity.originalCdBase) && Intrinsics.areEqual((Object) this.packaging, (Object) oHMOffersEntity.packaging) && Intrinsics.areEqual((Object) this.picturePath, (Object) oHMOffersEntity.picturePath) && Intrinsics.areEqual((Object) this.isDigitalItem, (Object) oHMOffersEntity.isDigitalItem) && Intrinsics.areEqual((Object) this.digitalItem, (Object) oHMOffersEntity.digitalItem) && Intrinsics.areEqual((Object) this.preparedQuantity, (Object) oHMOffersEntity.preparedQuantity) && Intrinsics.areEqual((Object) this.prices, (Object) oHMOffersEntity.prices) && Intrinsics.areEqual((Object) this.quantity, (Object) oHMOffersEntity.quantity) && Intrinsics.areEqual((Object) this.isReturnableBag, (Object) oHMOffersEntity.isReturnableBag);
    }

    @C12580l
    public final String getBrandName() {
        return this.brandName;
    }

    @C12579k
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final String getCdBase() {
        return this.cdBase;
    }

    @C12580l
    public final List<DigitalItemEntity> getDigitalItem() {
        return this.digitalItem;
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final String getOfferId() {
        return this.offerId;
    }

    @C12580l
    public final Amount getOfferPreparedTotalAmount() {
        return this.offerPreparedTotalAmount;
    }

    @C12580l
    public final Amount getOfferTotalAmount() {
        return this.offerTotalAmount;
    }

    @C12580l
    public final Amount getOfferTotalImmediateDiscountAmount() {
        return this.offerTotalImmediateDiscountAmount;
    }

    @C12580l
    public final Amount getOfferTotalPaidAmount() {
        return this.offerTotalPaidAmount;
    }

    @C12580l
    public final String getOfferUnit() {
        return this.offerUnit;
    }

    @C12580l
    public final String getOriginalCdBase() {
        return this.originalCdBase;
    }

    @C12580l
    public final String getPackaging() {
        return this.packaging;
    }

    @C12580l
    public final String getPicturePath() {
        return this.picturePath;
    }

    @C12580l
    public final Integer getPreparedQuantity() {
        return this.preparedQuantity;
    }

    @C12579k
    public final OHMPrices getPrices() {
        return this.prices;
    }

    @C12580l
    public final Integer getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.brandName;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.category.hashCode()) * 31;
        String str2 = this.cdBase;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gtin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offerId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Amount amount = this.offerPreparedTotalAmount;
        int hashCode6 = (hashCode5 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.offerTotalAmount;
        int hashCode7 = (hashCode6 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.offerTotalImmediateDiscountAmount;
        int hashCode8 = (hashCode7 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        Amount amount4 = this.offerTotalPaidAmount;
        int hashCode9 = (hashCode8 + (amount4 == null ? 0 : amount4.hashCode())) * 31;
        String str6 = this.offerUnit;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.originalCdBase;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.packaging;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.picturePath;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.isDigitalItem;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<DigitalItemEntity> list = this.digitalItem;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.preparedQuantity;
        int hashCode16 = (((hashCode15 + (num == null ? 0 : num.hashCode())) * 31) + this.prices.hashCode()) * 31;
        Integer num2 = this.quantity;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isReturnableBag;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode17 + i;
    }

    @C12580l
    public final Boolean isDigitalItem() {
        return this.isDigitalItem;
    }

    @C12580l
    public final Boolean isReturnableBag() {
        return this.isReturnableBag;
    }

    @C12579k
    public String toString() {
        String str = this.brandName;
        String str2 = this.category;
        String str3 = this.cdBase;
        String str4 = this.gtin;
        String str5 = this.name;
        String str6 = this.offerId;
        Amount amount = this.offerPreparedTotalAmount;
        Amount amount2 = this.offerTotalAmount;
        Amount amount3 = this.offerTotalImmediateDiscountAmount;
        Amount amount4 = this.offerTotalPaidAmount;
        String str7 = this.offerUnit;
        String str8 = this.originalCdBase;
        String str9 = this.packaging;
        String str10 = this.picturePath;
        Boolean bool = this.isDigitalItem;
        List<DigitalItemEntity> list = this.digitalItem;
        Integer num = this.preparedQuantity;
        OHMPrices oHMPrices = this.prices;
        Integer num2 = this.quantity;
        Boolean bool2 = this.isReturnableBag;
        return "OHMOffersEntity(brandName=" + str + ", category=" + str2 + ", cdBase=" + str3 + ", gtin=" + str4 + ", name=" + str5 + ", offerId=" + str6 + ", offerPreparedTotalAmount=" + amount + ", offerTotalAmount=" + amount2 + ", offerTotalImmediateDiscountAmount=" + amount3 + ", offerTotalPaidAmount=" + amount4 + ", offerUnit=" + str7 + ", originalCdBase=" + str8 + ", packaging=" + str9 + ", picturePath=" + str10 + ", isDigitalItem=" + bool + ", digitalItem=" + list + ", preparedQuantity=" + num + ", prices=" + oHMPrices + ", quantity=" + num2 + ", isReturnableBag=" + bool2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OHMOffersEntity(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.carrefour.fid.android.data.entities.Amount r31, com.carrefour.fid.android.data.entities.Amount r32, com.carrefour.fid.android.data.entities.Amount r33, com.carrefour.fid.android.data.entities.Amount r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.Boolean r39, java.util.List r40, java.lang.Integer r41, com.carrefour.fid.android.data.entities.OHMPrices r42, java.lang.Integer r43, java.lang.Boolean r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r18 = r2
            goto L_0x000c
        L_0x000a:
            r18 = r39
        L_0x000c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0015
            r19 = r2
            goto L_0x0017
        L_0x0015:
            r19 = r40
        L_0x0017:
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.OHMOffersEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.data.entities.Amount, com.carrefour.fid.android.data.entities.Amount, com.carrefour.fid.android.data.entities.Amount, com.carrefour.fid.android.data.entities.Amount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.lang.Integer, com.carrefour.fid.android.data.entities.OHMPrices, java.lang.Integer, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
