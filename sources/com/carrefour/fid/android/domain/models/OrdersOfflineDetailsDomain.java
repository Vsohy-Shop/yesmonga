package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015HÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\tHÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003Jå\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0006HÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001a\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001a\u0010\u001c\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001f¨\u0006X"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsDomain;", "", "loyaltyCardNumber", "", "orderDate", "orderAmountUnscaled", "", "orderAmountScale", "orderAmount", "", "amountBeforeDiscountUnscaled", "amountBeforeDiscountScale", "amountBeforeDiscount", "amountImmediateDiscountUnscaled", "amountImmediateDiscountScale", "amountImmediateDiscount", "amountRewardedOnLoyalty", "facilityId", "facilityName", "facilityAddress", "orderProductList", "", "Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsProductDomain;", "orderPaymentsList", "Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsPaymentDomain;", "orderVATList", "Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsVATDomain;", "totalVATAmount", "downloadUrl", "(Ljava/lang/String;Ljava/lang/String;IIDIIDIIDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;DLjava/lang/String;)V", "getAmountBeforeDiscount", "()D", "setAmountBeforeDiscount", "(D)V", "getAmountBeforeDiscountScale", "()I", "getAmountBeforeDiscountUnscaled", "getAmountImmediateDiscount", "setAmountImmediateDiscount", "getAmountImmediateDiscountScale", "getAmountImmediateDiscountUnscaled", "getAmountRewardedOnLoyalty", "getDownloadUrl", "()Ljava/lang/String;", "setDownloadUrl", "(Ljava/lang/String;)V", "getFacilityAddress", "setFacilityAddress", "getFacilityId", "getFacilityName", "setFacilityName", "getLoyaltyCardNumber", "getOrderAmount", "setOrderAmount", "getOrderAmountScale", "getOrderAmountUnscaled", "getOrderDate", "getOrderPaymentsList", "()Ljava/util/List;", "getOrderProductList", "getOrderVATList", "getTotalVATAmount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersOfflineDetailsDomain {
    public static final int $stable = 8;
    private double amountBeforeDiscount;
    private final int amountBeforeDiscountScale;
    private final int amountBeforeDiscountUnscaled;
    private double amountImmediateDiscount;
    private final int amountImmediateDiscountScale;
    private final int amountImmediateDiscountUnscaled;
    private final double amountRewardedOnLoyalty;
    @C12579k
    private String downloadUrl;
    @C12580l
    private String facilityAddress;
    @C12579k
    private final String facilityId;
    @C12579k
    private String facilityName;
    @C12579k
    private final String loyaltyCardNumber;
    private double orderAmount;
    private final int orderAmountScale;
    private final int orderAmountUnscaled;
    @C12579k
    private final String orderDate;
    @C12579k
    private final List<OrdersOfflineDetailsPaymentDomain> orderPaymentsList;
    @C12579k
    private final List<OrdersOfflineDetailsProductDomain> orderProductList;
    @C12579k
    private final List<OrdersOfflineDetailsVATDomain> orderVATList;
    private final double totalVATAmount;

    public OrdersOfflineDetailsDomain(@C12579k String str, @C12579k String str2, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, double d4, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12579k List<OrdersOfflineDetailsProductDomain> list, @C12579k List<OrdersOfflineDetailsPaymentDomain> list2, @C12579k List<OrdersOfflineDetailsVATDomain> list3, double d5, @C12579k String str6) {
        String str7 = str3;
        String str8 = str4;
        List<OrdersOfflineDetailsProductDomain> list4 = list;
        List<OrdersOfflineDetailsPaymentDomain> list5 = list2;
        List<OrdersOfflineDetailsVATDomain> list6 = list3;
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        Intrinsics.checkNotNullParameter(str2, "orderDate");
        Intrinsics.checkNotNullParameter(str7, "facilityId");
        Intrinsics.checkNotNullParameter(str8, "facilityName");
        Intrinsics.checkNotNullParameter(list4, "orderProductList");
        Intrinsics.checkNotNullParameter(list5, "orderPaymentsList");
        Intrinsics.checkNotNullParameter(list6, "orderVATList");
        Intrinsics.checkNotNullParameter(str9, "downloadUrl");
        this.loyaltyCardNumber = str;
        this.orderDate = str2;
        this.orderAmountUnscaled = i;
        this.orderAmountScale = i2;
        this.orderAmount = d;
        this.amountBeforeDiscountUnscaled = i3;
        this.amountBeforeDiscountScale = i4;
        this.amountBeforeDiscount = d2;
        this.amountImmediateDiscountUnscaled = i5;
        this.amountImmediateDiscountScale = i6;
        this.amountImmediateDiscount = d3;
        this.amountRewardedOnLoyalty = d4;
        this.facilityId = str7;
        this.facilityName = str8;
        this.facilityAddress = str5;
        this.orderProductList = list4;
        this.orderPaymentsList = list5;
        this.orderVATList = list6;
        this.totalVATAmount = d5;
        this.downloadUrl = str9;
    }

    public static /* synthetic */ OrdersOfflineDetailsDomain copy$default(OrdersOfflineDetailsDomain ordersOfflineDetailsDomain, String str, String str2, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, double d4, String str3, String str4, String str5, List list, List list2, List list3, double d5, String str6, int i7, Object obj) {
        OrdersOfflineDetailsDomain ordersOfflineDetailsDomain2 = ordersOfflineDetailsDomain;
        int i8 = i7;
        return ordersOfflineDetailsDomain.copy((i8 & 1) != 0 ? ordersOfflineDetailsDomain2.loyaltyCardNumber : str, (i8 & 2) != 0 ? ordersOfflineDetailsDomain2.orderDate : str2, (i8 & 4) != 0 ? ordersOfflineDetailsDomain2.orderAmountUnscaled : i, (i8 & 8) != 0 ? ordersOfflineDetailsDomain2.orderAmountScale : i2, (i8 & 16) != 0 ? ordersOfflineDetailsDomain2.orderAmount : d, (i8 & 32) != 0 ? ordersOfflineDetailsDomain2.amountBeforeDiscountUnscaled : i3, (i8 & 64) != 0 ? ordersOfflineDetailsDomain2.amountBeforeDiscountScale : i4, (i8 & 128) != 0 ? ordersOfflineDetailsDomain2.amountBeforeDiscount : d2, (i8 & 256) != 0 ? ordersOfflineDetailsDomain2.amountImmediateDiscountUnscaled : i5, (i8 & 512) != 0 ? ordersOfflineDetailsDomain2.amountImmediateDiscountScale : i6, (i8 & 1024) != 0 ? ordersOfflineDetailsDomain2.amountImmediateDiscount : d3, (i8 & 2048) != 0 ? ordersOfflineDetailsDomain2.amountRewardedOnLoyalty : d4, (i8 & 4096) != 0 ? ordersOfflineDetailsDomain2.facilityId : str3, (i8 & 8192) != 0 ? ordersOfflineDetailsDomain2.facilityName : str4, (i8 & 16384) != 0 ? ordersOfflineDetailsDomain2.facilityAddress : str5, (i8 & 32768) != 0 ? ordersOfflineDetailsDomain2.orderProductList : list, (i8 & 65536) != 0 ? ordersOfflineDetailsDomain2.orderPaymentsList : list2, (i8 & 131072) != 0 ? ordersOfflineDetailsDomain2.orderVATList : list3, (i8 & 262144) != 0 ? ordersOfflineDetailsDomain2.totalVATAmount : d5, (i8 & 524288) != 0 ? ordersOfflineDetailsDomain2.downloadUrl : str6);
    }

    @C12579k
    public final String component1() {
        return this.loyaltyCardNumber;
    }

    public final int component10() {
        return this.amountImmediateDiscountScale;
    }

    public final double component11() {
        return this.amountImmediateDiscount;
    }

    public final double component12() {
        return this.amountRewardedOnLoyalty;
    }

    @C12579k
    public final String component13() {
        return this.facilityId;
    }

    @C12579k
    public final String component14() {
        return this.facilityName;
    }

    @C12580l
    public final String component15() {
        return this.facilityAddress;
    }

    @C12579k
    public final List<OrdersOfflineDetailsProductDomain> component16() {
        return this.orderProductList;
    }

    @C12579k
    public final List<OrdersOfflineDetailsPaymentDomain> component17() {
        return this.orderPaymentsList;
    }

    @C12579k
    public final List<OrdersOfflineDetailsVATDomain> component18() {
        return this.orderVATList;
    }

    public final double component19() {
        return this.totalVATAmount;
    }

    @C12579k
    public final String component2() {
        return this.orderDate;
    }

    @C12579k
    public final String component20() {
        return this.downloadUrl;
    }

    public final int component3() {
        return this.orderAmountUnscaled;
    }

    public final int component4() {
        return this.orderAmountScale;
    }

    public final double component5() {
        return this.orderAmount;
    }

    public final int component6() {
        return this.amountBeforeDiscountUnscaled;
    }

    public final int component7() {
        return this.amountBeforeDiscountScale;
    }

    public final double component8() {
        return this.amountBeforeDiscount;
    }

    public final int component9() {
        return this.amountImmediateDiscountUnscaled;
    }

    @C12579k
    public final OrdersOfflineDetailsDomain copy(@C12579k String str, @C12579k String str2, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, double d4, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12579k List<OrdersOfflineDetailsProductDomain> list, @C12579k List<OrdersOfflineDetailsPaymentDomain> list2, @C12579k List<OrdersOfflineDetailsVATDomain> list3, double d5, @C12579k String str6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        Intrinsics.checkNotNullParameter(str2, "orderDate");
        Intrinsics.checkNotNullParameter(str3, "facilityId");
        Intrinsics.checkNotNullParameter(str4, "facilityName");
        Intrinsics.checkNotNullParameter(list, "orderProductList");
        Intrinsics.checkNotNullParameter(list2, "orderPaymentsList");
        Intrinsics.checkNotNullParameter(list3, "orderVATList");
        Intrinsics.checkNotNullParameter(str6, "downloadUrl");
        return new OrdersOfflineDetailsDomain(str7, str2, i, i2, d, i3, i4, d2, i5, i6, d3, d4, str3, str4, str5, list, list2, list3, d5, str6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOfflineDetailsDomain)) {
            return false;
        }
        OrdersOfflineDetailsDomain ordersOfflineDetailsDomain = (OrdersOfflineDetailsDomain) obj;
        return Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) ordersOfflineDetailsDomain.loyaltyCardNumber) && Intrinsics.areEqual((Object) this.orderDate, (Object) ordersOfflineDetailsDomain.orderDate) && this.orderAmountUnscaled == ordersOfflineDetailsDomain.orderAmountUnscaled && this.orderAmountScale == ordersOfflineDetailsDomain.orderAmountScale && Double.compare(this.orderAmount, ordersOfflineDetailsDomain.orderAmount) == 0 && this.amountBeforeDiscountUnscaled == ordersOfflineDetailsDomain.amountBeforeDiscountUnscaled && this.amountBeforeDiscountScale == ordersOfflineDetailsDomain.amountBeforeDiscountScale && Double.compare(this.amountBeforeDiscount, ordersOfflineDetailsDomain.amountBeforeDiscount) == 0 && this.amountImmediateDiscountUnscaled == ordersOfflineDetailsDomain.amountImmediateDiscountUnscaled && this.amountImmediateDiscountScale == ordersOfflineDetailsDomain.amountImmediateDiscountScale && Double.compare(this.amountImmediateDiscount, ordersOfflineDetailsDomain.amountImmediateDiscount) == 0 && Double.compare(this.amountRewardedOnLoyalty, ordersOfflineDetailsDomain.amountRewardedOnLoyalty) == 0 && Intrinsics.areEqual((Object) this.facilityId, (Object) ordersOfflineDetailsDomain.facilityId) && Intrinsics.areEqual((Object) this.facilityName, (Object) ordersOfflineDetailsDomain.facilityName) && Intrinsics.areEqual((Object) this.facilityAddress, (Object) ordersOfflineDetailsDomain.facilityAddress) && Intrinsics.areEqual((Object) this.orderProductList, (Object) ordersOfflineDetailsDomain.orderProductList) && Intrinsics.areEqual((Object) this.orderPaymentsList, (Object) ordersOfflineDetailsDomain.orderPaymentsList) && Intrinsics.areEqual((Object) this.orderVATList, (Object) ordersOfflineDetailsDomain.orderVATList) && Double.compare(this.totalVATAmount, ordersOfflineDetailsDomain.totalVATAmount) == 0 && Intrinsics.areEqual((Object) this.downloadUrl, (Object) ordersOfflineDetailsDomain.downloadUrl);
    }

    public final double getAmountBeforeDiscount() {
        return this.amountBeforeDiscount;
    }

    public final int getAmountBeforeDiscountScale() {
        return this.amountBeforeDiscountScale;
    }

    public final int getAmountBeforeDiscountUnscaled() {
        return this.amountBeforeDiscountUnscaled;
    }

    public final double getAmountImmediateDiscount() {
        return this.amountImmediateDiscount;
    }

    public final int getAmountImmediateDiscountScale() {
        return this.amountImmediateDiscountScale;
    }

    public final int getAmountImmediateDiscountUnscaled() {
        return this.amountImmediateDiscountUnscaled;
    }

    public final double getAmountRewardedOnLoyalty() {
        return this.amountRewardedOnLoyalty;
    }

    @C12579k
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @C12580l
    public final String getFacilityAddress() {
        return this.facilityAddress;
    }

    @C12579k
    public final String getFacilityId() {
        return this.facilityId;
    }

    @C12579k
    public final String getFacilityName() {
        return this.facilityName;
    }

    @C12579k
    public final String getLoyaltyCardNumber() {
        return this.loyaltyCardNumber;
    }

    public final double getOrderAmount() {
        return this.orderAmount;
    }

    public final int getOrderAmountScale() {
        return this.orderAmountScale;
    }

    public final int getOrderAmountUnscaled() {
        return this.orderAmountUnscaled;
    }

    @C12579k
    public final String getOrderDate() {
        return this.orderDate;
    }

    @C12579k
    public final List<OrdersOfflineDetailsPaymentDomain> getOrderPaymentsList() {
        return this.orderPaymentsList;
    }

    @C12579k
    public final List<OrdersOfflineDetailsProductDomain> getOrderProductList() {
        return this.orderProductList;
    }

    @C12579k
    public final List<OrdersOfflineDetailsVATDomain> getOrderVATList() {
        return this.orderVATList;
    }

    public final double getTotalVATAmount() {
        return this.totalVATAmount;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((this.loyaltyCardNumber.hashCode() * 31) + this.orderDate.hashCode()) * 31) + Integer.hashCode(this.orderAmountUnscaled)) * 31) + Integer.hashCode(this.orderAmountScale)) * 31) + Double.hashCode(this.orderAmount)) * 31) + Integer.hashCode(this.amountBeforeDiscountUnscaled)) * 31) + Integer.hashCode(this.amountBeforeDiscountScale)) * 31) + Double.hashCode(this.amountBeforeDiscount)) * 31) + Integer.hashCode(this.amountImmediateDiscountUnscaled)) * 31) + Integer.hashCode(this.amountImmediateDiscountScale)) * 31) + Double.hashCode(this.amountImmediateDiscount)) * 31) + Double.hashCode(this.amountRewardedOnLoyalty)) * 31) + this.facilityId.hashCode()) * 31) + this.facilityName.hashCode()) * 31;
        String str = this.facilityAddress;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.orderProductList.hashCode()) * 31) + this.orderPaymentsList.hashCode()) * 31) + this.orderVATList.hashCode()) * 31) + Double.hashCode(this.totalVATAmount)) * 31) + this.downloadUrl.hashCode();
    }

    public final void setAmountBeforeDiscount(double d) {
        this.amountBeforeDiscount = d;
    }

    public final void setAmountImmediateDiscount(double d) {
        this.amountImmediateDiscount = d;
    }

    public final void setDownloadUrl(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setFacilityAddress(@C12580l String str) {
        this.facilityAddress = str;
    }

    public final void setFacilityName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.facilityName = str;
    }

    public final void setOrderAmount(double d) {
        this.orderAmount = d;
    }

    @C12579k
    public String toString() {
        String str = this.loyaltyCardNumber;
        String str2 = this.orderDate;
        int i = this.orderAmountUnscaled;
        int i2 = this.orderAmountScale;
        double d = this.orderAmount;
        int i3 = this.amountBeforeDiscountUnscaled;
        int i4 = this.amountBeforeDiscountScale;
        double d2 = this.amountBeforeDiscount;
        int i5 = this.amountImmediateDiscountUnscaled;
        int i6 = this.amountImmediateDiscountScale;
        double d3 = this.amountImmediateDiscount;
        double d4 = this.amountRewardedOnLoyalty;
        double d5 = d3;
        String str3 = this.facilityId;
        String str4 = this.facilityName;
        String str5 = this.facilityAddress;
        List<OrdersOfflineDetailsProductDomain> list = this.orderProductList;
        List<OrdersOfflineDetailsPaymentDomain> list2 = this.orderPaymentsList;
        List<OrdersOfflineDetailsVATDomain> list3 = this.orderVATList;
        double d6 = d4;
        double d7 = this.totalVATAmount;
        String str6 = this.downloadUrl;
        return "OrdersOfflineDetailsDomain(loyaltyCardNumber=" + str + ", orderDate=" + str2 + ", orderAmountUnscaled=" + i + ", orderAmountScale=" + i2 + ", orderAmount=" + d + ", amountBeforeDiscountUnscaled=" + i3 + ", amountBeforeDiscountScale=" + i4 + ", amountBeforeDiscount=" + d2 + ", amountImmediateDiscountUnscaled=" + i5 + ", amountImmediateDiscountScale=" + i6 + ", amountImmediateDiscount=" + d5 + ", amountRewardedOnLoyalty=" + d6 + ", facilityId=" + str3 + ", facilityName=" + str4 + ", facilityAddress=" + str5 + ", orderProductList=" + list + ", orderPaymentsList=" + list2 + ", orderVATList=" + list3 + ", totalVATAmount=" + d7 + ", downloadUrl=" + str6 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOfflineDetailsDomain(java.lang.String r30, java.lang.String r31, int r32, int r33, double r34, int r36, int r37, double r38, int r40, int r41, double r42, double r44, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.util.List r49, java.util.List r50, java.util.List r51, double r52, java.lang.String r54, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r32
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r33
        L_0x0013:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r3
            goto L_0x001d
        L_0x001b:
            r8 = r34
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            r10 = r2
            goto L_0x0025
        L_0x0023:
            r10 = r36
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r37
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r12 = r3
            goto L_0x0035
        L_0x0033:
            r12 = r38
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            r14 = r2
            goto L_0x003d
        L_0x003b:
            r14 = r40
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            r15 = r2
            goto L_0x0045
        L_0x0043:
            r15 = r41
        L_0x0045:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004c
            r16 = r3
            goto L_0x004e
        L_0x004c:
            r16 = r42
        L_0x004e:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0055
            r18 = r3
            goto L_0x0057
        L_0x0055:
            r18 = r44
        L_0x0057:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x005f
            r1 = 0
            r22 = r1
            goto L_0x0061
        L_0x005f:
            r22 = r48
        L_0x0061:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = ""
            r28 = r0
            goto L_0x006d
        L_0x006b:
            r28 = r54
        L_0x006d:
            r3 = r29
            r4 = r30
            r5 = r31
            r20 = r46
            r21 = r47
            r23 = r49
            r24 = r50
            r25 = r51
            r26 = r52
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain.<init>(java.lang.String, java.lang.String, int, int, double, int, int, double, int, int, double, double, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, double, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
