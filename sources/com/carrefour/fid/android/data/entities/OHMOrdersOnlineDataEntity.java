package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0002\u0010\u001cJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010E\u001a\u00020\nHÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003JÖ\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00032\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b'\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0014\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDataEntity;", "", "additionalOrderEligible", "", "additionalOrderId", "", "expressPickup", "canPostponeOrder", "canCancelOrder", "orderStatus", "", "orderId", "orderType", "store", "Lcom/carrefour/fid/android/data/entities/OHMStore;", "slotInfo", "Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;", "orderAmount", "Lcom/carrefour/fid/android/data/entities/Amount;", "orderPreparedAmount", "orderCreationDateTime", "invoiceCreationDate", "deliveryAddress", "Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;", "trackingUrl", "paymentInfo", "", "Lcom/carrefour/fid/android/data/entities/OHMPaymentInfo;", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OHMStore;Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;Ljava/lang/String;Ljava/util/List;)V", "getAdditionalOrderEligible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdditionalOrderId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCanCancelOrder", "getCanPostponeOrder", "getDeliveryAddress", "()Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;", "getExpressPickup", "getInvoiceCreationDate", "()Ljava/lang/String;", "getOrderAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getOrderCreationDateTime", "getOrderId", "getOrderPreparedAmount", "getOrderStatus", "getOrderType", "getPaymentInfo", "()Ljava/util/List;", "getSlotInfo", "()Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;", "getStore", "()Lcom/carrefour/fid/android/data/entities/OHMStore;", "getTrackingUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OHMStore;Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;Ljava/lang/String;Ljava/util/List;)Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDataEntity;", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMOrdersOnlineDataEntity {
    public static final int $stable = 8;
    @C33608c("additional_order_eligible")
    @C12580l
    private final Boolean additionalOrderEligible;
    @C33608c("additional_order_id")
    @C12580l
    private final Long additionalOrderId;
    @C33608c("can_cancel_order")
    @C12580l
    private final Boolean canCancelOrder;
    @C33608c("can_postpone_order")
    @C12580l
    private final Boolean canPostponeOrder;
    @C33608c("delivery_address")
    @C12580l
    private final OHMDeliveryAddress deliveryAddress;
    @C33608c("express_pickup")
    @C12580l
    private final Boolean expressPickup;
    @C33608c("invoice_creation_date_time")
    @C12580l
    private final String invoiceCreationDate;
    @C33608c("one_order_amount")
    @C12579k
    private final Amount orderAmount;
    @C33608c("creation_date_time")
    @C12579k
    private final String orderCreationDateTime;
    @C33608c("one_order_id")
    @C12579k
    private final String orderId;
    @C33608c("one_order_prepared_amount")
    @C12580l
    private final Amount orderPreparedAmount;
    @C33608c("status")
    @C12579k
    private final String orderStatus;
    @C33608c("order_type")
    @C12579k
    private final String orderType;
    @C33608c("payment_info")
    @C12580l
    private final List<OHMPaymentInfo> paymentInfo;
    @C33608c("slot_info")
    @C12580l
    private final OHMSlotInfoEntity slotInfo;
    @C33608c("store")
    @C12580l
    private final OHMStore store;
    @C33608c("tracking_url")
    @C12580l
    private final String trackingUrl;

    public OHMOrdersOnlineDataEntity(@C12580l Boolean bool, @C12580l Long l, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l OHMStore oHMStore, @C12580l OHMSlotInfoEntity oHMSlotInfoEntity, @C12579k Amount amount, @C12580l Amount amount2, @C12579k String str4, @C12580l String str5, @C12580l OHMDeliveryAddress oHMDeliveryAddress, @C12580l String str6, @C12580l List<OHMPaymentInfo> list) {
        Amount amount3 = amount;
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str, "orderStatus");
        Intrinsics.checkNotNullParameter(str2, "orderId");
        Intrinsics.checkNotNullParameter(str3, "orderType");
        Intrinsics.checkNotNullParameter(amount3, "orderAmount");
        Intrinsics.checkNotNullParameter(str7, "orderCreationDateTime");
        this.additionalOrderEligible = bool;
        this.additionalOrderId = l;
        this.expressPickup = bool2;
        this.canPostponeOrder = bool3;
        this.canCancelOrder = bool4;
        this.orderStatus = str;
        this.orderId = str2;
        this.orderType = str3;
        this.store = oHMStore;
        this.slotInfo = oHMSlotInfoEntity;
        this.orderAmount = amount3;
        this.orderPreparedAmount = amount2;
        this.orderCreationDateTime = str7;
        this.invoiceCreationDate = str5;
        this.deliveryAddress = oHMDeliveryAddress;
        this.trackingUrl = str6;
        this.paymentInfo = list;
    }

    public static /* synthetic */ OHMOrdersOnlineDataEntity copy$default(OHMOrdersOnlineDataEntity oHMOrdersOnlineDataEntity, Boolean bool, Long l, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, OHMStore oHMStore, OHMSlotInfoEntity oHMSlotInfoEntity, Amount amount, Amount amount2, String str4, String str5, OHMDeliveryAddress oHMDeliveryAddress, String str6, List list, int i, Object obj) {
        OHMOrdersOnlineDataEntity oHMOrdersOnlineDataEntity2 = oHMOrdersOnlineDataEntity;
        int i2 = i;
        return oHMOrdersOnlineDataEntity.copy((i2 & 1) != 0 ? oHMOrdersOnlineDataEntity2.additionalOrderEligible : bool, (i2 & 2) != 0 ? oHMOrdersOnlineDataEntity2.additionalOrderId : l, (i2 & 4) != 0 ? oHMOrdersOnlineDataEntity2.expressPickup : bool2, (i2 & 8) != 0 ? oHMOrdersOnlineDataEntity2.canPostponeOrder : bool3, (i2 & 16) != 0 ? oHMOrdersOnlineDataEntity2.canCancelOrder : bool4, (i2 & 32) != 0 ? oHMOrdersOnlineDataEntity2.orderStatus : str, (i2 & 64) != 0 ? oHMOrdersOnlineDataEntity2.orderId : str2, (i2 & 128) != 0 ? oHMOrdersOnlineDataEntity2.orderType : str3, (i2 & 256) != 0 ? oHMOrdersOnlineDataEntity2.store : oHMStore, (i2 & 512) != 0 ? oHMOrdersOnlineDataEntity2.slotInfo : oHMSlotInfoEntity, (i2 & 1024) != 0 ? oHMOrdersOnlineDataEntity2.orderAmount : amount, (i2 & 2048) != 0 ? oHMOrdersOnlineDataEntity2.orderPreparedAmount : amount2, (i2 & 4096) != 0 ? oHMOrdersOnlineDataEntity2.orderCreationDateTime : str4, (i2 & 8192) != 0 ? oHMOrdersOnlineDataEntity2.invoiceCreationDate : str5, (i2 & 16384) != 0 ? oHMOrdersOnlineDataEntity2.deliveryAddress : oHMDeliveryAddress, (i2 & 32768) != 0 ? oHMOrdersOnlineDataEntity2.trackingUrl : str6, (i2 & 65536) != 0 ? oHMOrdersOnlineDataEntity2.paymentInfo : list);
    }

    @C12580l
    public final Boolean component1() {
        return this.additionalOrderEligible;
    }

    @C12580l
    public final OHMSlotInfoEntity component10() {
        return this.slotInfo;
    }

    @C12579k
    public final Amount component11() {
        return this.orderAmount;
    }

    @C12580l
    public final Amount component12() {
        return this.orderPreparedAmount;
    }

    @C12579k
    public final String component13() {
        return this.orderCreationDateTime;
    }

    @C12580l
    public final String component14() {
        return this.invoiceCreationDate;
    }

    @C12580l
    public final OHMDeliveryAddress component15() {
        return this.deliveryAddress;
    }

    @C12580l
    public final String component16() {
        return this.trackingUrl;
    }

    @C12580l
    public final List<OHMPaymentInfo> component17() {
        return this.paymentInfo;
    }

    @C12580l
    public final Long component2() {
        return this.additionalOrderId;
    }

    @C12580l
    public final Boolean component3() {
        return this.expressPickup;
    }

    @C12580l
    public final Boolean component4() {
        return this.canPostponeOrder;
    }

    @C12580l
    public final Boolean component5() {
        return this.canCancelOrder;
    }

    @C12579k
    public final String component6() {
        return this.orderStatus;
    }

    @C12579k
    public final String component7() {
        return this.orderId;
    }

    @C12579k
    public final String component8() {
        return this.orderType;
    }

    @C12580l
    public final OHMStore component9() {
        return this.store;
    }

    @C12579k
    public final OHMOrdersOnlineDataEntity copy(@C12580l Boolean bool, @C12580l Long l, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l OHMStore oHMStore, @C12580l OHMSlotInfoEntity oHMSlotInfoEntity, @C12579k Amount amount, @C12580l Amount amount2, @C12579k String str4, @C12580l String str5, @C12580l OHMDeliveryAddress oHMDeliveryAddress, @C12580l String str6, @C12580l List<OHMPaymentInfo> list) {
        Boolean bool5 = bool;
        Intrinsics.checkNotNullParameter(str, "orderStatus");
        Intrinsics.checkNotNullParameter(str2, "orderId");
        Intrinsics.checkNotNullParameter(str3, "orderType");
        Intrinsics.checkNotNullParameter(amount, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, "orderCreationDateTime");
        return new OHMOrdersOnlineDataEntity(bool, l, bool2, bool3, bool4, str, str2, str3, oHMStore, oHMSlotInfoEntity, amount, amount2, str4, str5, oHMDeliveryAddress, str6, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMOrdersOnlineDataEntity)) {
            return false;
        }
        OHMOrdersOnlineDataEntity oHMOrdersOnlineDataEntity = (OHMOrdersOnlineDataEntity) obj;
        return Intrinsics.areEqual((Object) this.additionalOrderEligible, (Object) oHMOrdersOnlineDataEntity.additionalOrderEligible) && Intrinsics.areEqual((Object) this.additionalOrderId, (Object) oHMOrdersOnlineDataEntity.additionalOrderId) && Intrinsics.areEqual((Object) this.expressPickup, (Object) oHMOrdersOnlineDataEntity.expressPickup) && Intrinsics.areEqual((Object) this.canPostponeOrder, (Object) oHMOrdersOnlineDataEntity.canPostponeOrder) && Intrinsics.areEqual((Object) this.canCancelOrder, (Object) oHMOrdersOnlineDataEntity.canCancelOrder) && Intrinsics.areEqual((Object) this.orderStatus, (Object) oHMOrdersOnlineDataEntity.orderStatus) && Intrinsics.areEqual((Object) this.orderId, (Object) oHMOrdersOnlineDataEntity.orderId) && Intrinsics.areEqual((Object) this.orderType, (Object) oHMOrdersOnlineDataEntity.orderType) && Intrinsics.areEqual((Object) this.store, (Object) oHMOrdersOnlineDataEntity.store) && Intrinsics.areEqual((Object) this.slotInfo, (Object) oHMOrdersOnlineDataEntity.slotInfo) && Intrinsics.areEqual((Object) this.orderAmount, (Object) oHMOrdersOnlineDataEntity.orderAmount) && Intrinsics.areEqual((Object) this.orderPreparedAmount, (Object) oHMOrdersOnlineDataEntity.orderPreparedAmount) && Intrinsics.areEqual((Object) this.orderCreationDateTime, (Object) oHMOrdersOnlineDataEntity.orderCreationDateTime) && Intrinsics.areEqual((Object) this.invoiceCreationDate, (Object) oHMOrdersOnlineDataEntity.invoiceCreationDate) && Intrinsics.areEqual((Object) this.deliveryAddress, (Object) oHMOrdersOnlineDataEntity.deliveryAddress) && Intrinsics.areEqual((Object) this.trackingUrl, (Object) oHMOrdersOnlineDataEntity.trackingUrl) && Intrinsics.areEqual((Object) this.paymentInfo, (Object) oHMOrdersOnlineDataEntity.paymentInfo);
    }

    @C12580l
    public final Boolean getAdditionalOrderEligible() {
        return this.additionalOrderEligible;
    }

    @C12580l
    public final Long getAdditionalOrderId() {
        return this.additionalOrderId;
    }

    @C12580l
    public final Boolean getCanCancelOrder() {
        return this.canCancelOrder;
    }

    @C12580l
    public final Boolean getCanPostponeOrder() {
        return this.canPostponeOrder;
    }

    @C12580l
    public final OHMDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    @C12580l
    public final Boolean getExpressPickup() {
        return this.expressPickup;
    }

    @C12580l
    public final String getInvoiceCreationDate() {
        return this.invoiceCreationDate;
    }

    @C12579k
    public final Amount getOrderAmount() {
        return this.orderAmount;
    }

    @C12579k
    public final String getOrderCreationDateTime() {
        return this.orderCreationDateTime;
    }

    @C12579k
    public final String getOrderId() {
        return this.orderId;
    }

    @C12580l
    public final Amount getOrderPreparedAmount() {
        return this.orderPreparedAmount;
    }

    @C12579k
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @C12579k
    public final String getOrderType() {
        return this.orderType;
    }

    @C12580l
    public final List<OHMPaymentInfo> getPaymentInfo() {
        return this.paymentInfo;
    }

    @C12580l
    public final OHMSlotInfoEntity getSlotInfo() {
        return this.slotInfo;
    }

    @C12580l
    public final OHMStore getStore() {
        return this.store;
    }

    @C12580l
    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    public int hashCode() {
        Boolean bool = this.additionalOrderEligible;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.additionalOrderId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.expressPickup;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canPostponeOrder;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canCancelOrder;
        int hashCode5 = (((((((hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.orderStatus.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.orderType.hashCode()) * 31;
        OHMStore oHMStore = this.store;
        int hashCode6 = (hashCode5 + (oHMStore == null ? 0 : oHMStore.hashCode())) * 31;
        OHMSlotInfoEntity oHMSlotInfoEntity = this.slotInfo;
        int hashCode7 = (((hashCode6 + (oHMSlotInfoEntity == null ? 0 : oHMSlotInfoEntity.hashCode())) * 31) + this.orderAmount.hashCode()) * 31;
        Amount amount = this.orderPreparedAmount;
        int hashCode8 = (((hashCode7 + (amount == null ? 0 : amount.hashCode())) * 31) + this.orderCreationDateTime.hashCode()) * 31;
        String str = this.invoiceCreationDate;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        OHMDeliveryAddress oHMDeliveryAddress = this.deliveryAddress;
        int hashCode10 = (hashCode9 + (oHMDeliveryAddress == null ? 0 : oHMDeliveryAddress.hashCode())) * 31;
        String str2 = this.trackingUrl;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<OHMPaymentInfo> list = this.paymentInfo;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode11 + i;
    }

    @C12579k
    public String toString() {
        Boolean bool = this.additionalOrderEligible;
        Long l = this.additionalOrderId;
        Boolean bool2 = this.expressPickup;
        Boolean bool3 = this.canPostponeOrder;
        Boolean bool4 = this.canCancelOrder;
        String str = this.orderStatus;
        String str2 = this.orderId;
        String str3 = this.orderType;
        OHMStore oHMStore = this.store;
        OHMSlotInfoEntity oHMSlotInfoEntity = this.slotInfo;
        Amount amount = this.orderAmount;
        Amount amount2 = this.orderPreparedAmount;
        String str4 = this.orderCreationDateTime;
        String str5 = this.invoiceCreationDate;
        OHMDeliveryAddress oHMDeliveryAddress = this.deliveryAddress;
        String str6 = this.trackingUrl;
        List<OHMPaymentInfo> list = this.paymentInfo;
        return "OHMOrdersOnlineDataEntity(additionalOrderEligible=" + bool + ", additionalOrderId=" + l + ", expressPickup=" + bool2 + ", canPostponeOrder=" + bool3 + ", canCancelOrder=" + bool4 + ", orderStatus=" + str + ", orderId=" + str2 + ", orderType=" + str3 + ", store=" + oHMStore + ", slotInfo=" + oHMSlotInfoEntity + ", orderAmount=" + amount + ", orderPreparedAmount=" + amount2 + ", orderCreationDateTime=" + str4 + ", invoiceCreationDate=" + str5 + ", deliveryAddress=" + oHMDeliveryAddress + ", trackingUrl=" + str6 + ", paymentInfo=" + list + ")";
    }
}
