package com.carrefour.fid.android.data.entities.luckycart;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JÒ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019¨\u0006F"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBody;", "", "cartId", "", "customerId", "orderAmount", "", "orderDiscountAmount", "promoCode", "promoDiscountAmount", "fidPaymentAmount", "slotBeginDate", "products", "", "Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartProduct;", "storeId", "storeFormat", "paymentType", "authKey", "authSign", "timestamp", "device", "authVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthKey", "()Ljava/lang/String;", "getAuthSign", "getAuthVersion", "getCartId", "getCustomerId", "getDevice", "getFidPaymentAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOrderAmount", "getOrderDiscountAmount", "getPaymentType", "getProducts", "()Ljava/util/List;", "getPromoCode", "getPromoDiscountAmount", "getSlotBeginDate", "getStoreFormat", "getStoreId", "getTimestamp", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBody;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class LuckyCartBody {
    public static final int $stable = 8;
    @C33608c("auth_key")
    @C12579k
    private final String authKey;
    @C33608c("auth_sign")
    @C12579k
    private final String authSign;
    @C33608c("auth_v")
    @C12579k
    private final String authVersion;
    @C33608c("cartId")
    @C12579k
    private final String cartId;
    @C33608c("customerId")
    @C12579k
    private final String customerId;
    @C33608c("device")
    @C12579k
    private final String device;
    @C33608c("fidAmountTtc")
    @C12580l
    private final Double fidPaymentAmount;
    @C33608c("ttc")
    @C12580l
    private final Double orderAmount;
    @C33608c("discountAmountTtc")
    @C12580l
    private final Double orderDiscountAmount;
    @C33608c("paymentType")
    @C12580l
    private final String paymentType;
    @C33608c("products")
    @C12580l
    private final List<LuckyCartProduct> products;
    @C33608c("promoCode")
    @C12580l
    private final String promoCode;
    @C33608c("promoCodeTtc")
    @C12580l
    private final Double promoDiscountAmount;
    @C33608c("delivery")
    @C12580l
    private final String slotBeginDate;
    @C33608c("store")
    @C12580l
    private final String storeFormat;
    @C33608c("storeId")
    @C12580l
    private final String storeId;
    @C33608c("auth_ts")
    @C12579k
    private final String timestamp;

    public LuckyCartBody(@C12579k String str, @C12579k String str2, @C12580l Double d, @C12580l Double d2, @C12580l String str3, @C12580l Double d3, @C12580l Double d4, @C12580l String str4, @C12580l List<LuckyCartProduct> list, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12) {
        String str13 = str8;
        String str14 = str9;
        String str15 = str10;
        String str16 = str11;
        String str17 = str12;
        Intrinsics.checkNotNullParameter(str, "cartId");
        Intrinsics.checkNotNullParameter(str2, "customerId");
        Intrinsics.checkNotNullParameter(str13, "authKey");
        Intrinsics.checkNotNullParameter(str14, "authSign");
        Intrinsics.checkNotNullParameter(str15, "timestamp");
        Intrinsics.checkNotNullParameter(str16, "device");
        Intrinsics.checkNotNullParameter(str17, "authVersion");
        this.cartId = str;
        this.customerId = str2;
        this.orderAmount = d;
        this.orderDiscountAmount = d2;
        this.promoCode = str3;
        this.promoDiscountAmount = d3;
        this.fidPaymentAmount = d4;
        this.slotBeginDate = str4;
        this.products = list;
        this.storeId = str5;
        this.storeFormat = str6;
        this.paymentType = str7;
        this.authKey = str13;
        this.authSign = str14;
        this.timestamp = str15;
        this.device = str16;
        this.authVersion = str17;
    }

    public static /* synthetic */ LuckyCartBody copy$default(LuckyCartBody luckyCartBody, String str, String str2, Double d, Double d2, String str3, Double d3, Double d4, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        LuckyCartBody luckyCartBody2 = luckyCartBody;
        int i2 = i;
        return luckyCartBody.copy((i2 & 1) != 0 ? luckyCartBody2.cartId : str, (i2 & 2) != 0 ? luckyCartBody2.customerId : str2, (i2 & 4) != 0 ? luckyCartBody2.orderAmount : d, (i2 & 8) != 0 ? luckyCartBody2.orderDiscountAmount : d2, (i2 & 16) != 0 ? luckyCartBody2.promoCode : str3, (i2 & 32) != 0 ? luckyCartBody2.promoDiscountAmount : d3, (i2 & 64) != 0 ? luckyCartBody2.fidPaymentAmount : d4, (i2 & 128) != 0 ? luckyCartBody2.slotBeginDate : str4, (i2 & 256) != 0 ? luckyCartBody2.products : list, (i2 & 512) != 0 ? luckyCartBody2.storeId : str5, (i2 & 1024) != 0 ? luckyCartBody2.storeFormat : str6, (i2 & 2048) != 0 ? luckyCartBody2.paymentType : str7, (i2 & 4096) != 0 ? luckyCartBody2.authKey : str8, (i2 & 8192) != 0 ? luckyCartBody2.authSign : str9, (i2 & 16384) != 0 ? luckyCartBody2.timestamp : str10, (i2 & 32768) != 0 ? luckyCartBody2.device : str11, (i2 & 65536) != 0 ? luckyCartBody2.authVersion : str12);
    }

    @C12579k
    public final String component1() {
        return this.cartId;
    }

    @C12580l
    public final String component10() {
        return this.storeId;
    }

    @C12580l
    public final String component11() {
        return this.storeFormat;
    }

    @C12580l
    public final String component12() {
        return this.paymentType;
    }

    @C12579k
    public final String component13() {
        return this.authKey;
    }

    @C12579k
    public final String component14() {
        return this.authSign;
    }

    @C12579k
    public final String component15() {
        return this.timestamp;
    }

    @C12579k
    public final String component16() {
        return this.device;
    }

    @C12579k
    public final String component17() {
        return this.authVersion;
    }

    @C12579k
    public final String component2() {
        return this.customerId;
    }

    @C12580l
    public final Double component3() {
        return this.orderAmount;
    }

    @C12580l
    public final Double component4() {
        return this.orderDiscountAmount;
    }

    @C12580l
    public final String component5() {
        return this.promoCode;
    }

    @C12580l
    public final Double component6() {
        return this.promoDiscountAmount;
    }

    @C12580l
    public final Double component7() {
        return this.fidPaymentAmount;
    }

    @C12580l
    public final String component8() {
        return this.slotBeginDate;
    }

    @C12580l
    public final List<LuckyCartProduct> component9() {
        return this.products;
    }

    @C12579k
    public final LuckyCartBody copy(@C12579k String str, @C12579k String str2, @C12580l Double d, @C12580l Double d2, @C12580l String str3, @C12580l Double d3, @C12580l Double d4, @C12580l String str4, @C12580l List<LuckyCartProduct> list, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12) {
        String str13 = str;
        Intrinsics.checkNotNullParameter(str13, "cartId");
        Intrinsics.checkNotNullParameter(str2, "customerId");
        Intrinsics.checkNotNullParameter(str8, "authKey");
        Intrinsics.checkNotNullParameter(str9, "authSign");
        Intrinsics.checkNotNullParameter(str10, "timestamp");
        Intrinsics.checkNotNullParameter(str11, "device");
        Intrinsics.checkNotNullParameter(str12, "authVersion");
        return new LuckyCartBody(str13, str2, d, d2, str3, d3, d4, str4, list, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartBody)) {
            return false;
        }
        LuckyCartBody luckyCartBody = (LuckyCartBody) obj;
        return Intrinsics.areEqual((Object) this.cartId, (Object) luckyCartBody.cartId) && Intrinsics.areEqual((Object) this.customerId, (Object) luckyCartBody.customerId) && Intrinsics.areEqual((Object) this.orderAmount, (Object) luckyCartBody.orderAmount) && Intrinsics.areEqual((Object) this.orderDiscountAmount, (Object) luckyCartBody.orderDiscountAmount) && Intrinsics.areEqual((Object) this.promoCode, (Object) luckyCartBody.promoCode) && Intrinsics.areEqual((Object) this.promoDiscountAmount, (Object) luckyCartBody.promoDiscountAmount) && Intrinsics.areEqual((Object) this.fidPaymentAmount, (Object) luckyCartBody.fidPaymentAmount) && Intrinsics.areEqual((Object) this.slotBeginDate, (Object) luckyCartBody.slotBeginDate) && Intrinsics.areEqual((Object) this.products, (Object) luckyCartBody.products) && Intrinsics.areEqual((Object) this.storeId, (Object) luckyCartBody.storeId) && Intrinsics.areEqual((Object) this.storeFormat, (Object) luckyCartBody.storeFormat) && Intrinsics.areEqual((Object) this.paymentType, (Object) luckyCartBody.paymentType) && Intrinsics.areEqual((Object) this.authKey, (Object) luckyCartBody.authKey) && Intrinsics.areEqual((Object) this.authSign, (Object) luckyCartBody.authSign) && Intrinsics.areEqual((Object) this.timestamp, (Object) luckyCartBody.timestamp) && Intrinsics.areEqual((Object) this.device, (Object) luckyCartBody.device) && Intrinsics.areEqual((Object) this.authVersion, (Object) luckyCartBody.authVersion);
    }

    @C12579k
    public final String getAuthKey() {
        return this.authKey;
    }

    @C12579k
    public final String getAuthSign() {
        return this.authSign;
    }

    @C12579k
    public final String getAuthVersion() {
        return this.authVersion;
    }

    @C12579k
    public final String getCartId() {
        return this.cartId;
    }

    @C12579k
    public final String getCustomerId() {
        return this.customerId;
    }

    @C12579k
    public final String getDevice() {
        return this.device;
    }

    @C12580l
    public final Double getFidPaymentAmount() {
        return this.fidPaymentAmount;
    }

    @C12580l
    public final Double getOrderAmount() {
        return this.orderAmount;
    }

    @C12580l
    public final Double getOrderDiscountAmount() {
        return this.orderDiscountAmount;
    }

    @C12580l
    public final String getPaymentType() {
        return this.paymentType;
    }

    @C12580l
    public final List<LuckyCartProduct> getProducts() {
        return this.products;
    }

    @C12580l
    public final String getPromoCode() {
        return this.promoCode;
    }

    @C12580l
    public final Double getPromoDiscountAmount() {
        return this.promoDiscountAmount;
    }

    @C12580l
    public final String getSlotBeginDate() {
        return this.slotBeginDate;
    }

    @C12580l
    public final String getStoreFormat() {
        return this.storeFormat;
    }

    @C12580l
    public final String getStoreId() {
        return this.storeId;
    }

    @C12579k
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = ((this.cartId.hashCode() * 31) + this.customerId.hashCode()) * 31;
        Double d = this.orderAmount;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.orderDiscountAmount;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.promoCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d3 = this.promoDiscountAmount;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.fidPaymentAmount;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str2 = this.slotBeginDate;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<LuckyCartProduct> list = this.products;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.storeId;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeFormat;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentType;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((((((((hashCode10 + i) * 31) + this.authKey.hashCode()) * 31) + this.authSign.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.device.hashCode()) * 31) + this.authVersion.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.cartId;
        String str2 = this.customerId;
        Double d = this.orderAmount;
        Double d2 = this.orderDiscountAmount;
        String str3 = this.promoCode;
        Double d3 = this.promoDiscountAmount;
        Double d4 = this.fidPaymentAmount;
        String str4 = this.slotBeginDate;
        List<LuckyCartProduct> list = this.products;
        String str5 = this.storeId;
        String str6 = this.storeFormat;
        String str7 = this.paymentType;
        String str8 = this.authKey;
        String str9 = this.authSign;
        String str10 = this.timestamp;
        String str11 = this.device;
        String str12 = this.authVersion;
        return "LuckyCartBody(cartId=" + str + ", customerId=" + str2 + ", orderAmount=" + d + ", orderDiscountAmount=" + d2 + ", promoCode=" + str3 + ", promoDiscountAmount=" + d3 + ", fidPaymentAmount=" + d4 + ", slotBeginDate=" + str4 + ", products=" + list + ", storeId=" + str5 + ", storeFormat=" + str6 + ", paymentType=" + str7 + ", authKey=" + str8 + ", authSign=" + str9 + ", timestamp=" + str10 + ", device=" + str11 + ", authVersion=" + str12 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LuckyCartBody(String str, String str2, Double d, Double d2, String str3, Double d3, Double d4, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, d2, str3, d3, d4, str4, list, str5, str6, str7, str8, str9, str10, (i & 32768) != 0 ? "android" : str11, (i & 65536) != 0 ? "2.0" : str12);
    }
}
