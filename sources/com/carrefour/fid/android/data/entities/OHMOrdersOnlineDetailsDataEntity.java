package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0019\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0019\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010%J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010K\u001a\u00020\u0016HÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0019HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010,J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020!0\u0019HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010X\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\tHÆ\u0003Jª\u0002\u0010]\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00192\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020\u00032\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020bHÖ\u0001J\t\u0010c\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00008\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b2\u0010)R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u001a\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b#\u0010)R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\"\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u0017\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00104¨\u0006d"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDetailsDataEntity;", "", "additionalOrderEligible", "", "additionalOrderId", "", "additionalOrder", "expressPickup", "pickingEligibility", "", "orderId", "orderType", "orderCreationDateTime", "lastUpdateDateTime", "deliveryAddress", "Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;", "orderAmount", "Lcom/carrefour/fid/android/data/entities/Amount;", "orderPreparedAmount", "slotInfo", "Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;", "store", "Lcom/carrefour/fid/android/data/entities/OHMStore;", "status", "offersEntityList", "", "Lcom/carrefour/fid/android/data/entities/OHMOffersEntity;", "paymentInfo", "Lcom/carrefour/fid/android/data/entities/OHMPaymentInfo;", "invoiceUrl", "invoicesInfo", "Lcom/carrefour/fid/android/data/entities/InvoicesInfoEntity;", "allowanceCharge", "Lcom/carrefour/fid/android/data/entities/OHMAllowanceCharge;", "isChangeDeliveryAvailable", "isCancelOrderAvailable", "trackingUrl", "(Ljava/lang/Boolean;Ljava/lang/Long;Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDetailsDataEntity;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;Lcom/carrefour/fid/android/data/entities/OHMStore;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAdditionalOrder", "()Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDetailsDataEntity;", "getAdditionalOrderEligible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdditionalOrderId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAllowanceCharge", "()Ljava/util/List;", "getDeliveryAddress", "()Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;", "getExpressPickup", "getInvoiceUrl", "()Ljava/lang/String;", "getInvoicesInfo", "getLastUpdateDateTime", "getOffersEntityList", "getOrderAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getOrderCreationDateTime", "getOrderId", "getOrderPreparedAmount", "getOrderType", "getPaymentInfo", "getPickingEligibility", "getSlotInfo", "()Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;", "getStatus", "getStore", "()Lcom/carrefour/fid/android/data/entities/OHMStore;", "getTrackingUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDetailsDataEntity;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;Lcom/carrefour/fid/android/data/entities/OHMStore;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDetailsDataEntity;", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMOrdersOnlineDetailsDataEntity {
    public static final int $stable = 8;
    @C33608c("additional_order")
    @C12580l
    private final OHMOrdersOnlineDetailsDataEntity additionalOrder;
    @C33608c("additional_order_eligible")
    @C12580l
    private final Boolean additionalOrderEligible;
    @C33608c("additional_order_id")
    @C12580l
    private final Long additionalOrderId;
    @C33608c("allowance_charge")
    @C12579k
    private final List<OHMAllowanceCharge> allowanceCharge;
    @C33608c("delivery_address")
    @C12580l
    private final OHMDeliveryAddress deliveryAddress;
    @C33608c("express_pickup")
    @C12580l
    private final Boolean expressPickup;
    @C33608c("invoice_url")
    @C12580l
    private final String invoiceUrl;
    @C33608c("invoices_info")
    @C12580l
    private final List<InvoicesInfoEntity> invoicesInfo;
    @C33608c("can_cancel_order")
    @C12580l
    private final Boolean isCancelOrderAvailable;
    @C33608c("can_postpone_order")
    @C12580l
    private final Boolean isChangeDeliveryAvailable;
    @C33608c("last_update_date_time")
    @C12580l
    private final String lastUpdateDateTime;
    @C33608c("offers")
    @C12579k
    private final List<OHMOffersEntity> offersEntityList;
    @C33608c("one_order_amount")
    @C12580l
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
    @C33608c("order_type")
    @C12579k
    private final String orderType;
    @C33608c("payment_info")
    @C12579k
    private final List<OHMPaymentInfo> paymentInfo;
    @C33608c("picking_eligibility")
    @C12580l
    private final String pickingEligibility;
    @C33608c("slot_info")
    @C12580l
    private final OHMSlotInfoEntity slotInfo;
    @C33608c("status")
    @C12579k
    private final String status;
    @C33608c("store")
    @C12579k
    private final OHMStore store;
    @C33608c("tracking_url")
    @C12580l
    private final String trackingUrl;

    public OHMOrdersOnlineDetailsDataEntity(@C12580l Boolean bool, @C12580l Long l, @C12580l OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity, @C12580l Boolean bool2, @C12580l String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12580l OHMDeliveryAddress oHMDeliveryAddress, @C12580l Amount amount, @C12580l Amount amount2, @C12580l OHMSlotInfoEntity oHMSlotInfoEntity, @C12579k OHMStore oHMStore, @C12579k String str6, @C12579k List<OHMOffersEntity> list, @C12579k List<OHMPaymentInfo> list2, @C12580l String str7, @C12580l List<InvoicesInfoEntity> list3, @C12579k List<OHMAllowanceCharge> list4, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l String str8) {
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        OHMStore oHMStore2 = oHMStore;
        String str12 = str6;
        List<OHMOffersEntity> list5 = list;
        List<OHMPaymentInfo> list6 = list2;
        List<OHMAllowanceCharge> list7 = list4;
        Intrinsics.checkNotNullParameter(str9, "orderId");
        Intrinsics.checkNotNullParameter(str10, "orderType");
        Intrinsics.checkNotNullParameter(str11, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(oHMStore2, "store");
        Intrinsics.checkNotNullParameter(str12, "status");
        Intrinsics.checkNotNullParameter(list5, "offersEntityList");
        Intrinsics.checkNotNullParameter(list6, "paymentInfo");
        Intrinsics.checkNotNullParameter(list7, "allowanceCharge");
        this.additionalOrderEligible = bool;
        this.additionalOrderId = l;
        this.additionalOrder = oHMOrdersOnlineDetailsDataEntity;
        this.expressPickup = bool2;
        this.pickingEligibility = str;
        this.orderId = str9;
        this.orderType = str10;
        this.orderCreationDateTime = str11;
        this.lastUpdateDateTime = str5;
        this.deliveryAddress = oHMDeliveryAddress;
        this.orderAmount = amount;
        this.orderPreparedAmount = amount2;
        this.slotInfo = oHMSlotInfoEntity;
        this.store = oHMStore2;
        this.status = str12;
        this.offersEntityList = list5;
        this.paymentInfo = list6;
        this.invoiceUrl = str7;
        this.invoicesInfo = list3;
        this.allowanceCharge = list7;
        this.isChangeDeliveryAvailable = bool3;
        this.isCancelOrderAvailable = bool4;
        this.trackingUrl = str8;
    }

    public static /* synthetic */ OHMOrdersOnlineDetailsDataEntity copy$default(OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity, Boolean bool, Long l, OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity2, Boolean bool2, String str, String str2, String str3, String str4, String str5, OHMDeliveryAddress oHMDeliveryAddress, Amount amount, Amount amount2, OHMSlotInfoEntity oHMSlotInfoEntity, OHMStore oHMStore, String str6, List list, List list2, String str7, List list3, List list4, Boolean bool3, Boolean bool4, String str8, int i, Object obj) {
        OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity3 = oHMOrdersOnlineDetailsDataEntity;
        int i2 = i;
        return oHMOrdersOnlineDetailsDataEntity.copy((i2 & 1) != 0 ? oHMOrdersOnlineDetailsDataEntity3.additionalOrderEligible : bool, (i2 & 2) != 0 ? oHMOrdersOnlineDetailsDataEntity3.additionalOrderId : l, (i2 & 4) != 0 ? oHMOrdersOnlineDetailsDataEntity3.additionalOrder : oHMOrdersOnlineDetailsDataEntity2, (i2 & 8) != 0 ? oHMOrdersOnlineDetailsDataEntity3.expressPickup : bool2, (i2 & 16) != 0 ? oHMOrdersOnlineDetailsDataEntity3.pickingEligibility : str, (i2 & 32) != 0 ? oHMOrdersOnlineDetailsDataEntity3.orderId : str2, (i2 & 64) != 0 ? oHMOrdersOnlineDetailsDataEntity3.orderType : str3, (i2 & 128) != 0 ? oHMOrdersOnlineDetailsDataEntity3.orderCreationDateTime : str4, (i2 & 256) != 0 ? oHMOrdersOnlineDetailsDataEntity3.lastUpdateDateTime : str5, (i2 & 512) != 0 ? oHMOrdersOnlineDetailsDataEntity3.deliveryAddress : oHMDeliveryAddress, (i2 & 1024) != 0 ? oHMOrdersOnlineDetailsDataEntity3.orderAmount : amount, (i2 & 2048) != 0 ? oHMOrdersOnlineDetailsDataEntity3.orderPreparedAmount : amount2, (i2 & 4096) != 0 ? oHMOrdersOnlineDetailsDataEntity3.slotInfo : oHMSlotInfoEntity, (i2 & 8192) != 0 ? oHMOrdersOnlineDetailsDataEntity3.store : oHMStore, (i2 & 16384) != 0 ? oHMOrdersOnlineDetailsDataEntity3.status : str6, (i2 & 32768) != 0 ? oHMOrdersOnlineDetailsDataEntity3.offersEntityList : list, (i2 & 65536) != 0 ? oHMOrdersOnlineDetailsDataEntity3.paymentInfo : list2, (i2 & 131072) != 0 ? oHMOrdersOnlineDetailsDataEntity3.invoiceUrl : str7, (i2 & 262144) != 0 ? oHMOrdersOnlineDetailsDataEntity3.invoicesInfo : list3, (i2 & 524288) != 0 ? oHMOrdersOnlineDetailsDataEntity3.allowanceCharge : list4, (i2 & 1048576) != 0 ? oHMOrdersOnlineDetailsDataEntity3.isChangeDeliveryAvailable : bool3, (i2 & 2097152) != 0 ? oHMOrdersOnlineDetailsDataEntity3.isCancelOrderAvailable : bool4, (i2 & 4194304) != 0 ? oHMOrdersOnlineDetailsDataEntity3.trackingUrl : str8);
    }

    @C12580l
    public final Boolean component1() {
        return this.additionalOrderEligible;
    }

    @C12580l
    public final OHMDeliveryAddress component10() {
        return this.deliveryAddress;
    }

    @C12580l
    public final Amount component11() {
        return this.orderAmount;
    }

    @C12580l
    public final Amount component12() {
        return this.orderPreparedAmount;
    }

    @C12580l
    public final OHMSlotInfoEntity component13() {
        return this.slotInfo;
    }

    @C12579k
    public final OHMStore component14() {
        return this.store;
    }

    @C12579k
    public final String component15() {
        return this.status;
    }

    @C12579k
    public final List<OHMOffersEntity> component16() {
        return this.offersEntityList;
    }

    @C12579k
    public final List<OHMPaymentInfo> component17() {
        return this.paymentInfo;
    }

    @C12580l
    public final String component18() {
        return this.invoiceUrl;
    }

    @C12580l
    public final List<InvoicesInfoEntity> component19() {
        return this.invoicesInfo;
    }

    @C12580l
    public final Long component2() {
        return this.additionalOrderId;
    }

    @C12579k
    public final List<OHMAllowanceCharge> component20() {
        return this.allowanceCharge;
    }

    @C12580l
    public final Boolean component21() {
        return this.isChangeDeliveryAvailable;
    }

    @C12580l
    public final Boolean component22() {
        return this.isCancelOrderAvailable;
    }

    @C12580l
    public final String component23() {
        return this.trackingUrl;
    }

    @C12580l
    public final OHMOrdersOnlineDetailsDataEntity component3() {
        return this.additionalOrder;
    }

    @C12580l
    public final Boolean component4() {
        return this.expressPickup;
    }

    @C12580l
    public final String component5() {
        return this.pickingEligibility;
    }

    @C12579k
    public final String component6() {
        return this.orderId;
    }

    @C12579k
    public final String component7() {
        return this.orderType;
    }

    @C12579k
    public final String component8() {
        return this.orderCreationDateTime;
    }

    @C12580l
    public final String component9() {
        return this.lastUpdateDateTime;
    }

    @C12579k
    public final OHMOrdersOnlineDetailsDataEntity copy(@C12580l Boolean bool, @C12580l Long l, @C12580l OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity, @C12580l Boolean bool2, @C12580l String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12580l OHMDeliveryAddress oHMDeliveryAddress, @C12580l Amount amount, @C12580l Amount amount2, @C12580l OHMSlotInfoEntity oHMSlotInfoEntity, @C12579k OHMStore oHMStore, @C12579k String str6, @C12579k List<OHMOffersEntity> list, @C12579k List<OHMPaymentInfo> list2, @C12580l String str7, @C12580l List<InvoicesInfoEntity> list3, @C12579k List<OHMAllowanceCharge> list4, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l String str8) {
        Boolean bool5 = bool;
        Intrinsics.checkNotNullParameter(str2, "orderId");
        Intrinsics.checkNotNullParameter(str3, "orderType");
        Intrinsics.checkNotNullParameter(str4, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(oHMStore, "store");
        Intrinsics.checkNotNullParameter(str6, "status");
        Intrinsics.checkNotNullParameter(list, "offersEntityList");
        Intrinsics.checkNotNullParameter(list2, "paymentInfo");
        Intrinsics.checkNotNullParameter(list4, "allowanceCharge");
        return new OHMOrdersOnlineDetailsDataEntity(bool, l, oHMOrdersOnlineDetailsDataEntity, bool2, str, str2, str3, str4, str5, oHMDeliveryAddress, amount, amount2, oHMSlotInfoEntity, oHMStore, str6, list, list2, str7, list3, list4, bool3, bool4, str8);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMOrdersOnlineDetailsDataEntity)) {
            return false;
        }
        OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity = (OHMOrdersOnlineDetailsDataEntity) obj;
        return Intrinsics.areEqual((Object) this.additionalOrderEligible, (Object) oHMOrdersOnlineDetailsDataEntity.additionalOrderEligible) && Intrinsics.areEqual((Object) this.additionalOrderId, (Object) oHMOrdersOnlineDetailsDataEntity.additionalOrderId) && Intrinsics.areEqual((Object) this.additionalOrder, (Object) oHMOrdersOnlineDetailsDataEntity.additionalOrder) && Intrinsics.areEqual((Object) this.expressPickup, (Object) oHMOrdersOnlineDetailsDataEntity.expressPickup) && Intrinsics.areEqual((Object) this.pickingEligibility, (Object) oHMOrdersOnlineDetailsDataEntity.pickingEligibility) && Intrinsics.areEqual((Object) this.orderId, (Object) oHMOrdersOnlineDetailsDataEntity.orderId) && Intrinsics.areEqual((Object) this.orderType, (Object) oHMOrdersOnlineDetailsDataEntity.orderType) && Intrinsics.areEqual((Object) this.orderCreationDateTime, (Object) oHMOrdersOnlineDetailsDataEntity.orderCreationDateTime) && Intrinsics.areEqual((Object) this.lastUpdateDateTime, (Object) oHMOrdersOnlineDetailsDataEntity.lastUpdateDateTime) && Intrinsics.areEqual((Object) this.deliveryAddress, (Object) oHMOrdersOnlineDetailsDataEntity.deliveryAddress) && Intrinsics.areEqual((Object) this.orderAmount, (Object) oHMOrdersOnlineDetailsDataEntity.orderAmount) && Intrinsics.areEqual((Object) this.orderPreparedAmount, (Object) oHMOrdersOnlineDetailsDataEntity.orderPreparedAmount) && Intrinsics.areEqual((Object) this.slotInfo, (Object) oHMOrdersOnlineDetailsDataEntity.slotInfo) && Intrinsics.areEqual((Object) this.store, (Object) oHMOrdersOnlineDetailsDataEntity.store) && Intrinsics.areEqual((Object) this.status, (Object) oHMOrdersOnlineDetailsDataEntity.status) && Intrinsics.areEqual((Object) this.offersEntityList, (Object) oHMOrdersOnlineDetailsDataEntity.offersEntityList) && Intrinsics.areEqual((Object) this.paymentInfo, (Object) oHMOrdersOnlineDetailsDataEntity.paymentInfo) && Intrinsics.areEqual((Object) this.invoiceUrl, (Object) oHMOrdersOnlineDetailsDataEntity.invoiceUrl) && Intrinsics.areEqual((Object) this.invoicesInfo, (Object) oHMOrdersOnlineDetailsDataEntity.invoicesInfo) && Intrinsics.areEqual((Object) this.allowanceCharge, (Object) oHMOrdersOnlineDetailsDataEntity.allowanceCharge) && Intrinsics.areEqual((Object) this.isChangeDeliveryAvailable, (Object) oHMOrdersOnlineDetailsDataEntity.isChangeDeliveryAvailable) && Intrinsics.areEqual((Object) this.isCancelOrderAvailable, (Object) oHMOrdersOnlineDetailsDataEntity.isCancelOrderAvailable) && Intrinsics.areEqual((Object) this.trackingUrl, (Object) oHMOrdersOnlineDetailsDataEntity.trackingUrl);
    }

    @C12580l
    public final OHMOrdersOnlineDetailsDataEntity getAdditionalOrder() {
        return this.additionalOrder;
    }

    @C12580l
    public final Boolean getAdditionalOrderEligible() {
        return this.additionalOrderEligible;
    }

    @C12580l
    public final Long getAdditionalOrderId() {
        return this.additionalOrderId;
    }

    @C12579k
    public final List<OHMAllowanceCharge> getAllowanceCharge() {
        return this.allowanceCharge;
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
    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    @C12580l
    public final List<InvoicesInfoEntity> getInvoicesInfo() {
        return this.invoicesInfo;
    }

    @C12580l
    public final String getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    @C12579k
    public final List<OHMOffersEntity> getOffersEntityList() {
        return this.offersEntityList;
    }

    @C12580l
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
    public final String getOrderType() {
        return this.orderType;
    }

    @C12579k
    public final List<OHMPaymentInfo> getPaymentInfo() {
        return this.paymentInfo;
    }

    @C12580l
    public final String getPickingEligibility() {
        return this.pickingEligibility;
    }

    @C12580l
    public final OHMSlotInfoEntity getSlotInfo() {
        return this.slotInfo;
    }

    @C12579k
    public final String getStatus() {
        return this.status;
    }

    @C12579k
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
        OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity = this.additionalOrder;
        int hashCode3 = (hashCode2 + (oHMOrdersOnlineDetailsDataEntity == null ? 0 : oHMOrdersOnlineDetailsDataEntity.hashCode())) * 31;
        Boolean bool2 = this.expressPickup;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.pickingEligibility;
        int hashCode5 = (((((((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.orderId.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.orderCreationDateTime.hashCode()) * 31;
        String str2 = this.lastUpdateDateTime;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OHMDeliveryAddress oHMDeliveryAddress = this.deliveryAddress;
        int hashCode7 = (hashCode6 + (oHMDeliveryAddress == null ? 0 : oHMDeliveryAddress.hashCode())) * 31;
        Amount amount = this.orderAmount;
        int hashCode8 = (hashCode7 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.orderPreparedAmount;
        int hashCode9 = (hashCode8 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        OHMSlotInfoEntity oHMSlotInfoEntity = this.slotInfo;
        int hashCode10 = (((((((((hashCode9 + (oHMSlotInfoEntity == null ? 0 : oHMSlotInfoEntity.hashCode())) * 31) + this.store.hashCode()) * 31) + this.status.hashCode()) * 31) + this.offersEntityList.hashCode()) * 31) + this.paymentInfo.hashCode()) * 31;
        String str3 = this.invoiceUrl;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<InvoicesInfoEntity> list = this.invoicesInfo;
        int hashCode12 = (((hashCode11 + (list == null ? 0 : list.hashCode())) * 31) + this.allowanceCharge.hashCode()) * 31;
        Boolean bool3 = this.isChangeDeliveryAvailable;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isCancelOrderAvailable;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.trackingUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode14 + i;
    }

    @C12580l
    public final Boolean isCancelOrderAvailable() {
        return this.isCancelOrderAvailable;
    }

    @C12580l
    public final Boolean isChangeDeliveryAvailable() {
        return this.isChangeDeliveryAvailable;
    }

    @C12579k
    public String toString() {
        Boolean bool = this.additionalOrderEligible;
        Long l = this.additionalOrderId;
        OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity = this.additionalOrder;
        Boolean bool2 = this.expressPickup;
        String str = this.pickingEligibility;
        String str2 = this.orderId;
        String str3 = this.orderType;
        String str4 = this.orderCreationDateTime;
        String str5 = this.lastUpdateDateTime;
        OHMDeliveryAddress oHMDeliveryAddress = this.deliveryAddress;
        Amount amount = this.orderAmount;
        Amount amount2 = this.orderPreparedAmount;
        OHMSlotInfoEntity oHMSlotInfoEntity = this.slotInfo;
        OHMStore oHMStore = this.store;
        String str6 = this.status;
        List<OHMOffersEntity> list = this.offersEntityList;
        List<OHMPaymentInfo> list2 = this.paymentInfo;
        String str7 = this.invoiceUrl;
        List<InvoicesInfoEntity> list3 = this.invoicesInfo;
        List<OHMAllowanceCharge> list4 = this.allowanceCharge;
        Boolean bool3 = this.isChangeDeliveryAvailable;
        Boolean bool4 = this.isCancelOrderAvailable;
        String str8 = this.trackingUrl;
        return "OHMOrdersOnlineDetailsDataEntity(additionalOrderEligible=" + bool + ", additionalOrderId=" + l + ", additionalOrder=" + oHMOrdersOnlineDetailsDataEntity + ", expressPickup=" + bool2 + ", pickingEligibility=" + str + ", orderId=" + str2 + ", orderType=" + str3 + ", orderCreationDateTime=" + str4 + ", lastUpdateDateTime=" + str5 + ", deliveryAddress=" + oHMDeliveryAddress + ", orderAmount=" + amount + ", orderPreparedAmount=" + amount2 + ", slotInfo=" + oHMSlotInfoEntity + ", store=" + oHMStore + ", status=" + str6 + ", offersEntityList=" + list + ", paymentInfo=" + list2 + ", invoiceUrl=" + str7 + ", invoicesInfo=" + list3 + ", allowanceCharge=" + list4 + ", isChangeDeliveryAvailable=" + bool3 + ", isCancelOrderAvailable=" + bool4 + ", trackingUrl=" + str8 + ")";
    }
}
