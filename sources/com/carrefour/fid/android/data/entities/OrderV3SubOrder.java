package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u00102\u001a\u0004\u0018\u00010\u0013\u0012\b\u00103\u001a\u0004\u0018\u00010\u0015\u0012\b\u00104\u001a\u0004\u0018\u00010\u0004\u0012\b\u00105\u001a\u0004\u0018\u00010\u0004\u0012\b\u00106\u001a\u0004\u0018\u00010\u0019\u0012\b\u00107\u001a\u0004\u0018\u00010\u0019\u0012\b\u00108\u001a\u0004\u0018\u00010\u0019\u0012\b\u00109\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0010\u0012\b\u0010>\u001a\u0004\u0018\u00010%¢\u0006\u0004\bu\u0010vJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\bJ\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0010HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003Jº\u0002\u0010?\u001a\u00020\u00002\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00102\n\b\u0002\u0010>\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\b?\u0010@J\t\u0010A\u001a\u00020\u0004HÖ\u0001J\t\u0010C\u001a\u00020BHÖ\u0001J\u0013\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010G\u001a\u00020BHÖ\u0001J\u0019\u0010L\u001a\u00020K2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020BHÖ\u0001R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b'\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b(\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010S\u001a\u0004\bT\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b*\u0010S\u001a\u0004\bU\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b+\u0010S\u001a\u0004\bV\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b,\u0010P\u001a\u0004\bW\u0010RR\u001c\u0010-\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010S\u001a\u0004\bX\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010P\u001a\u0004\bY\u0010RR\u001c\u0010/\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b/\u0010P\u001a\u0004\bZ\u0010RR\u001c\u00100\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b0\u0010P\u001a\u0004\b[\u0010RR \u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0004¢\u0006\f\n\u0004\b1\u0010\\\u001a\u0004\b]\u0010^R\u001c\u00102\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010_\u001a\u0004\b`\u0010aR\u001c\u00103\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\f\n\u0004\b3\u0010b\u001a\u0004\bc\u0010dR\u001c\u00104\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b4\u0010P\u001a\u0004\be\u0010RR\u001c\u00105\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b5\u0010P\u001a\u0004\bf\u0010RR\u001c\u00106\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\f\n\u0004\b6\u0010g\u001a\u0004\bh\u0010iR\u001c\u00107\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\f\n\u0004\b7\u0010g\u001a\u0004\bj\u0010iR\u001c\u00108\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\f\n\u0004\b8\u0010g\u001a\u0004\bk\u0010iR\u001c\u00109\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\f\n\u0004\b9\u0010l\u001a\u0004\bm\u0010\u001fR\u001c\u0010:\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b:\u0010P\u001a\u0004\bn\u0010RR\u001c\u0010;\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b;\u0010P\u001a\u0004\bo\u0010RR\u001c\u0010<\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b<\u0010S\u001a\u0004\bp\u0010\bR\"\u0010=\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00108\u0006X\u0004¢\u0006\f\n\u0004\b=\u0010\\\u001a\u0004\bq\u0010^R\u001c\u0010>\u001a\u0004\u0018\u00010%8\u0006X\u0004¢\u0006\f\n\u0004\b>\u0010r\u001a\u0004\bs\u0010t¨\u0006w"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3SubOrder;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/data/entities/OrderV3CancellationReason;", "component1", "", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "Lcom/carrefour/fid/android/data/entities/OrderV3Offer;", "component11", "Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "component12", "Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "component13", "component14", "component15", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component16", "component17", "component18", "", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", "Lcom/carrefour/fid/android/data/entities/OrderV3Promotion;", "component23", "Lcom/carrefour/fid/android/data/entities/OrderV3DeliveryOption;", "component24", "cancellationReason", "creationDateTime", "customerIncident", "customerInvoice", "customerMessages", "facilityServiceId", "freeShipping", "invoiceUrl", "lastUpdateDateTime", "mkpOrderId", "offers", "selectedShippingType", "slotInfo", "status", "storeId", "subOrderAmount", "subOrderAmountWithoutDiscount", "subOrderDiscountAmount", "subOrderId", "subOrderType", "trackingUrl", "vendorAllowRatings", "promotions", "deliveryOption", "copy", "(Lcom/carrefour/fid/android/data/entities/OrderV3CancellationReason;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/OrderV3DeliveryOption;)Lcom/carrefour/fid/android/data/entities/OrderV3SubOrder;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/data/entities/OrderV3CancellationReason;", "getCancellationReason", "()Lcom/carrefour/fid/android/data/entities/OrderV3CancellationReason;", "Ljava/lang/String;", "getCreationDateTime", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getCustomerIncident", "getCustomerInvoice", "getCustomerMessages", "getFacilityServiceId", "getFreeShipping", "getInvoiceUrl", "getLastUpdateDateTime", "getMkpOrderId", "Ljava/util/List;", "getOffers", "()Ljava/util/List;", "Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "getSelectedShippingType", "()Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "getSlotInfo", "()Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "getStatus", "getStoreId", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getSubOrderAmount", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getSubOrderAmountWithoutDiscount", "getSubOrderDiscountAmount", "Ljava/lang/Long;", "getSubOrderId", "getSubOrderType", "getTrackingUrl", "getVendorAllowRatings", "getPromotions", "Lcom/carrefour/fid/android/data/entities/OrderV3DeliveryOption;", "getDeliveryOption", "()Lcom/carrefour/fid/android/data/entities/OrderV3DeliveryOption;", "<init>", "(Lcom/carrefour/fid/android/data/entities/OrderV3CancellationReason;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/OrderV3DeliveryOption;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3SubOrder implements Parcelable {
    public static final int $stable = 8;
    @C12579k
    public static final Parcelable.Creator<OrderV3SubOrder> CREATOR = new C36415a();
    @C33608c("adress_type")
    @C12580l
    private final OrderV3CancellationReason cancellationReason;
    @C33608c("creation_date_time")
    @C12580l
    private final String creationDateTime;
    @C33608c("customer_incident")
    @C12580l
    private final Boolean customerIncident;
    @C33608c("customer_invoice")
    @C12580l
    private final Boolean customerInvoice;
    @C33608c("customer_messages")
    @C12580l
    private final Boolean customerMessages;
    @C33608c("delivery_option")
    @C12580l
    private final OrderV3DeliveryOption deliveryOption;
    @C33608c("facility_service_id")
    @C12580l
    private final String facilityServiceId;
    @C33608c("free_shipping")
    @C12580l
    private final Boolean freeShipping;
    @C33608c("invoice_url")
    @C12580l
    private final String invoiceUrl;
    @C33608c("last_update_date_time")
    @C12580l
    private final String lastUpdateDateTime;
    @C33608c("mkp_order_id")
    @C12580l
    private final String mkpOrderId;
    @C33608c("offers")
    @C12579k
    private final List<OrderV3Offer> offers;
    @C33608c("promotions")
    @C12580l
    private final List<OrderV3Promotion> promotions;
    @C33608c("selected_shipping_type")
    @C12580l
    private final OrderV3ShippingType selectedShippingType;
    @C33608c("slot_info")
    @C12580l
    private final OrderV3SlotInfo slotInfo;
    @C33608c("status")
    @C12580l
    private final String status;
    @C33608c("store_id")
    @C12580l
    private final String storeId;
    @C33608c("sub_order_amount")
    @C12580l
    private final OrderV3Amounts subOrderAmount;
    @C33608c("sub_order_amount_without_discount")
    @C12580l
    private final OrderV3Amounts subOrderAmountWithoutDiscount;
    @C33608c("sub_order_discount_amount")
    @C12580l
    private final OrderV3Amounts subOrderDiscountAmount;
    @C33608c("sub_order_id")
    @C12580l
    private final Long subOrderId;
    @C33608c("sub_order_type")
    @C12580l
    private final String subOrderType;
    @C33608c("tracking_url")
    @C12580l
    private final String trackingUrl;
    @C33608c("vendor_allow_ratings")
    @C12580l
    private final Boolean vendorAllowRatings;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3SubOrder$a */
    public static final class C36415a implements Parcelable.Creator<OrderV3SubOrder> {
        @C12579k
        /* renamed from: a */
        public final OrderV3SubOrder createFromParcel(@C12579k Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OrderV3CancellationReason createFromParcel = parcel.readInt() == 0 ? null : OrderV3CancellationReason.CREATOR.createFromParcel(parcel2);
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                arrayList2.add(OrderV3Offer.CREATOR.createFromParcel(parcel2));
            }
            OrderV3ShippingType createFromParcel2 = parcel.readInt() == 0 ? null : OrderV3ShippingType.CREATOR.createFromParcel(parcel2);
            OrderV3SlotInfo createFromParcel3 = parcel.readInt() == 0 ? null : OrderV3SlotInfo.CREATOR.createFromParcel(parcel2);
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            OrderV3Amounts createFromParcel4 = parcel.readInt() == 0 ? null : OrderV3Amounts.CREATOR.createFromParcel(parcel2);
            OrderV3Amounts createFromParcel5 = parcel.readInt() == 0 ? null : OrderV3Amounts.CREATOR.createFromParcel(parcel2);
            OrderV3Amounts createFromParcel6 = parcel.readInt() == 0 ? null : OrderV3Amounts.CREATOR.createFromParcel(parcel2);
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    arrayList3.add(OrderV3Promotion.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt2 = readInt2;
                }
                arrayList = arrayList3;
            }
            return new OrderV3SubOrder(createFromParcel, readString, bool, bool2, bool3, readString2, bool4, readString3, readString4, readString5, arrayList2, createFromParcel2, createFromParcel3, readString6, readString7, createFromParcel4, createFromParcel5, createFromParcel6, valueOf, readString8, readString9, bool5, arrayList, parcel.readInt() == 0 ? null : OrderV3DeliveryOption.CREATOR.createFromParcel(parcel2));
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3SubOrder[] newArray(int i) {
            return new OrderV3SubOrder[i];
        }
    }

    public OrderV3SubOrder(@C12580l OrderV3CancellationReason orderV3CancellationReason, @C12580l String str, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l String str2, @C12580l Boolean bool4, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12579k List<OrderV3Offer> list, @C12580l OrderV3ShippingType orderV3ShippingType, @C12580l OrderV3SlotInfo orderV3SlotInfo, @C12580l String str6, @C12580l String str7, @C12580l OrderV3Amounts orderV3Amounts, @C12580l OrderV3Amounts orderV3Amounts2, @C12580l OrderV3Amounts orderV3Amounts3, @C12580l Long l, @C12580l String str8, @C12580l String str9, @C12580l Boolean bool5, @C12580l List<OrderV3Promotion> list2, @C12580l OrderV3DeliveryOption orderV3DeliveryOption) {
        Intrinsics.checkNotNullParameter(list, "offers");
        this.cancellationReason = orderV3CancellationReason;
        this.creationDateTime = str;
        this.customerIncident = bool;
        this.customerInvoice = bool2;
        this.customerMessages = bool3;
        this.facilityServiceId = str2;
        this.freeShipping = bool4;
        this.invoiceUrl = str3;
        this.lastUpdateDateTime = str4;
        this.mkpOrderId = str5;
        this.offers = list;
        this.selectedShippingType = orderV3ShippingType;
        this.slotInfo = orderV3SlotInfo;
        this.status = str6;
        this.storeId = str7;
        this.subOrderAmount = orderV3Amounts;
        this.subOrderAmountWithoutDiscount = orderV3Amounts2;
        this.subOrderDiscountAmount = orderV3Amounts3;
        this.subOrderId = l;
        this.subOrderType = str8;
        this.trackingUrl = str9;
        this.vendorAllowRatings = bool5;
        this.promotions = list2;
        this.deliveryOption = orderV3DeliveryOption;
    }

    public static /* synthetic */ OrderV3SubOrder copy$default(OrderV3SubOrder orderV3SubOrder, OrderV3CancellationReason orderV3CancellationReason, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, String str3, String str4, String str5, List list, OrderV3ShippingType orderV3ShippingType, OrderV3SlotInfo orderV3SlotInfo, String str6, String str7, OrderV3Amounts orderV3Amounts, OrderV3Amounts orderV3Amounts2, OrderV3Amounts orderV3Amounts3, Long l, String str8, String str9, Boolean bool5, List list2, OrderV3DeliveryOption orderV3DeliveryOption, int i, Object obj) {
        OrderV3SubOrder orderV3SubOrder2 = orderV3SubOrder;
        int i2 = i;
        return orderV3SubOrder.copy((i2 & 1) != 0 ? orderV3SubOrder2.cancellationReason : orderV3CancellationReason, (i2 & 2) != 0 ? orderV3SubOrder2.creationDateTime : str, (i2 & 4) != 0 ? orderV3SubOrder2.customerIncident : bool, (i2 & 8) != 0 ? orderV3SubOrder2.customerInvoice : bool2, (i2 & 16) != 0 ? orderV3SubOrder2.customerMessages : bool3, (i2 & 32) != 0 ? orderV3SubOrder2.facilityServiceId : str2, (i2 & 64) != 0 ? orderV3SubOrder2.freeShipping : bool4, (i2 & 128) != 0 ? orderV3SubOrder2.invoiceUrl : str3, (i2 & 256) != 0 ? orderV3SubOrder2.lastUpdateDateTime : str4, (i2 & 512) != 0 ? orderV3SubOrder2.mkpOrderId : str5, (i2 & 1024) != 0 ? orderV3SubOrder2.offers : list, (i2 & 2048) != 0 ? orderV3SubOrder2.selectedShippingType : orderV3ShippingType, (i2 & 4096) != 0 ? orderV3SubOrder2.slotInfo : orderV3SlotInfo, (i2 & 8192) != 0 ? orderV3SubOrder2.status : str6, (i2 & 16384) != 0 ? orderV3SubOrder2.storeId : str7, (i2 & 32768) != 0 ? orderV3SubOrder2.subOrderAmount : orderV3Amounts, (i2 & 65536) != 0 ? orderV3SubOrder2.subOrderAmountWithoutDiscount : orderV3Amounts2, (i2 & 131072) != 0 ? orderV3SubOrder2.subOrderDiscountAmount : orderV3Amounts3, (i2 & 262144) != 0 ? orderV3SubOrder2.subOrderId : l, (i2 & 524288) != 0 ? orderV3SubOrder2.subOrderType : str8, (i2 & 1048576) != 0 ? orderV3SubOrder2.trackingUrl : str9, (i2 & 2097152) != 0 ? orderV3SubOrder2.vendorAllowRatings : bool5, (i2 & 4194304) != 0 ? orderV3SubOrder2.promotions : list2, (i2 & 8388608) != 0 ? orderV3SubOrder2.deliveryOption : orderV3DeliveryOption);
    }

    @C12580l
    public final OrderV3CancellationReason component1() {
        return this.cancellationReason;
    }

    @C12580l
    public final String component10() {
        return this.mkpOrderId;
    }

    @C12579k
    public final List<OrderV3Offer> component11() {
        return this.offers;
    }

    @C12580l
    public final OrderV3ShippingType component12() {
        return this.selectedShippingType;
    }

    @C12580l
    public final OrderV3SlotInfo component13() {
        return this.slotInfo;
    }

    @C12580l
    public final String component14() {
        return this.status;
    }

    @C12580l
    public final String component15() {
        return this.storeId;
    }

    @C12580l
    public final OrderV3Amounts component16() {
        return this.subOrderAmount;
    }

    @C12580l
    public final OrderV3Amounts component17() {
        return this.subOrderAmountWithoutDiscount;
    }

    @C12580l
    public final OrderV3Amounts component18() {
        return this.subOrderDiscountAmount;
    }

    @C12580l
    public final Long component19() {
        return this.subOrderId;
    }

    @C12580l
    public final String component2() {
        return this.creationDateTime;
    }

    @C12580l
    public final String component20() {
        return this.subOrderType;
    }

    @C12580l
    public final String component21() {
        return this.trackingUrl;
    }

    @C12580l
    public final Boolean component22() {
        return this.vendorAllowRatings;
    }

    @C12580l
    public final List<OrderV3Promotion> component23() {
        return this.promotions;
    }

    @C12580l
    public final OrderV3DeliveryOption component24() {
        return this.deliveryOption;
    }

    @C12580l
    public final Boolean component3() {
        return this.customerIncident;
    }

    @C12580l
    public final Boolean component4() {
        return this.customerInvoice;
    }

    @C12580l
    public final Boolean component5() {
        return this.customerMessages;
    }

    @C12580l
    public final String component6() {
        return this.facilityServiceId;
    }

    @C12580l
    public final Boolean component7() {
        return this.freeShipping;
    }

    @C12580l
    public final String component8() {
        return this.invoiceUrl;
    }

    @C12580l
    public final String component9() {
        return this.lastUpdateDateTime;
    }

    @C12579k
    public final OrderV3SubOrder copy(@C12580l OrderV3CancellationReason orderV3CancellationReason, @C12580l String str, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l String str2, @C12580l Boolean bool4, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12579k List<OrderV3Offer> list, @C12580l OrderV3ShippingType orderV3ShippingType, @C12580l OrderV3SlotInfo orderV3SlotInfo, @C12580l String str6, @C12580l String str7, @C12580l OrderV3Amounts orderV3Amounts, @C12580l OrderV3Amounts orderV3Amounts2, @C12580l OrderV3Amounts orderV3Amounts3, @C12580l Long l, @C12580l String str8, @C12580l String str9, @C12580l Boolean bool5, @C12580l List<OrderV3Promotion> list2, @C12580l OrderV3DeliveryOption orderV3DeliveryOption) {
        OrderV3CancellationReason orderV3CancellationReason2 = orderV3CancellationReason;
        Intrinsics.checkNotNullParameter(list, "offers");
        return new OrderV3SubOrder(orderV3CancellationReason, str, bool, bool2, bool3, str2, bool4, str3, str4, str5, list, orderV3ShippingType, orderV3SlotInfo, str6, str7, orderV3Amounts, orderV3Amounts2, orderV3Amounts3, l, str8, str9, bool5, list2, orderV3DeliveryOption);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3SubOrder)) {
            return false;
        }
        OrderV3SubOrder orderV3SubOrder = (OrderV3SubOrder) obj;
        return Intrinsics.areEqual((Object) this.cancellationReason, (Object) orderV3SubOrder.cancellationReason) && Intrinsics.areEqual((Object) this.creationDateTime, (Object) orderV3SubOrder.creationDateTime) && Intrinsics.areEqual((Object) this.customerIncident, (Object) orderV3SubOrder.customerIncident) && Intrinsics.areEqual((Object) this.customerInvoice, (Object) orderV3SubOrder.customerInvoice) && Intrinsics.areEqual((Object) this.customerMessages, (Object) orderV3SubOrder.customerMessages) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) orderV3SubOrder.facilityServiceId) && Intrinsics.areEqual((Object) this.freeShipping, (Object) orderV3SubOrder.freeShipping) && Intrinsics.areEqual((Object) this.invoiceUrl, (Object) orderV3SubOrder.invoiceUrl) && Intrinsics.areEqual((Object) this.lastUpdateDateTime, (Object) orderV3SubOrder.lastUpdateDateTime) && Intrinsics.areEqual((Object) this.mkpOrderId, (Object) orderV3SubOrder.mkpOrderId) && Intrinsics.areEqual((Object) this.offers, (Object) orderV3SubOrder.offers) && Intrinsics.areEqual((Object) this.selectedShippingType, (Object) orderV3SubOrder.selectedShippingType) && Intrinsics.areEqual((Object) this.slotInfo, (Object) orderV3SubOrder.slotInfo) && Intrinsics.areEqual((Object) this.status, (Object) orderV3SubOrder.status) && Intrinsics.areEqual((Object) this.storeId, (Object) orderV3SubOrder.storeId) && Intrinsics.areEqual((Object) this.subOrderAmount, (Object) orderV3SubOrder.subOrderAmount) && Intrinsics.areEqual((Object) this.subOrderAmountWithoutDiscount, (Object) orderV3SubOrder.subOrderAmountWithoutDiscount) && Intrinsics.areEqual((Object) this.subOrderDiscountAmount, (Object) orderV3SubOrder.subOrderDiscountAmount) && Intrinsics.areEqual((Object) this.subOrderId, (Object) orderV3SubOrder.subOrderId) && Intrinsics.areEqual((Object) this.subOrderType, (Object) orderV3SubOrder.subOrderType) && Intrinsics.areEqual((Object) this.trackingUrl, (Object) orderV3SubOrder.trackingUrl) && Intrinsics.areEqual((Object) this.vendorAllowRatings, (Object) orderV3SubOrder.vendorAllowRatings) && Intrinsics.areEqual((Object) this.promotions, (Object) orderV3SubOrder.promotions) && Intrinsics.areEqual((Object) this.deliveryOption, (Object) orderV3SubOrder.deliveryOption);
    }

    @C12580l
    public final OrderV3CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    @C12580l
    public final String getCreationDateTime() {
        return this.creationDateTime;
    }

    @C12580l
    public final Boolean getCustomerIncident() {
        return this.customerIncident;
    }

    @C12580l
    public final Boolean getCustomerInvoice() {
        return this.customerInvoice;
    }

    @C12580l
    public final Boolean getCustomerMessages() {
        return this.customerMessages;
    }

    @C12580l
    public final OrderV3DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

    @C12580l
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final Boolean getFreeShipping() {
        return this.freeShipping;
    }

    @C12580l
    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    @C12580l
    public final String getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    @C12580l
    public final String getMkpOrderId() {
        return this.mkpOrderId;
    }

    @C12579k
    public final List<OrderV3Offer> getOffers() {
        return this.offers;
    }

    @C12580l
    public final List<OrderV3Promotion> getPromotions() {
        return this.promotions;
    }

    @C12580l
    public final OrderV3ShippingType getSelectedShippingType() {
        return this.selectedShippingType;
    }

    @C12580l
    public final OrderV3SlotInfo getSlotInfo() {
        return this.slotInfo;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final String getStoreId() {
        return this.storeId;
    }

    @C12580l
    public final OrderV3Amounts getSubOrderAmount() {
        return this.subOrderAmount;
    }

    @C12580l
    public final OrderV3Amounts getSubOrderAmountWithoutDiscount() {
        return this.subOrderAmountWithoutDiscount;
    }

    @C12580l
    public final OrderV3Amounts getSubOrderDiscountAmount() {
        return this.subOrderDiscountAmount;
    }

    @C12580l
    public final Long getSubOrderId() {
        return this.subOrderId;
    }

    @C12580l
    public final String getSubOrderType() {
        return this.subOrderType;
    }

    @C12580l
    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    @C12580l
    public final Boolean getVendorAllowRatings() {
        return this.vendorAllowRatings;
    }

    public int hashCode() {
        OrderV3CancellationReason orderV3CancellationReason = this.cancellationReason;
        int i = 0;
        int hashCode = (orderV3CancellationReason == null ? 0 : orderV3CancellationReason.hashCode()) * 31;
        String str = this.creationDateTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.customerIncident;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.customerInvoice;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.customerMessages;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.facilityServiceId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.freeShipping;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.invoiceUrl;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastUpdateDateTime;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mkpOrderId;
        int hashCode10 = (((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.offers.hashCode()) * 31;
        OrderV3ShippingType orderV3ShippingType = this.selectedShippingType;
        int hashCode11 = (hashCode10 + (orderV3ShippingType == null ? 0 : orderV3ShippingType.hashCode())) * 31;
        OrderV3SlotInfo orderV3SlotInfo = this.slotInfo;
        int hashCode12 = (hashCode11 + (orderV3SlotInfo == null ? 0 : orderV3SlotInfo.hashCode())) * 31;
        String str6 = this.status;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.storeId;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        OrderV3Amounts orderV3Amounts = this.subOrderAmount;
        int hashCode15 = (hashCode14 + (orderV3Amounts == null ? 0 : orderV3Amounts.hashCode())) * 31;
        OrderV3Amounts orderV3Amounts2 = this.subOrderAmountWithoutDiscount;
        int hashCode16 = (hashCode15 + (orderV3Amounts2 == null ? 0 : orderV3Amounts2.hashCode())) * 31;
        OrderV3Amounts orderV3Amounts3 = this.subOrderDiscountAmount;
        int hashCode17 = (hashCode16 + (orderV3Amounts3 == null ? 0 : orderV3Amounts3.hashCode())) * 31;
        Long l = this.subOrderId;
        int hashCode18 = (hashCode17 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.subOrderType;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.trackingUrl;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool5 = this.vendorAllowRatings;
        int hashCode21 = (hashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<OrderV3Promotion> list = this.promotions;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        OrderV3DeliveryOption orderV3DeliveryOption = this.deliveryOption;
        if (orderV3DeliveryOption != null) {
            i = orderV3DeliveryOption.hashCode();
        }
        return hashCode22 + i;
    }

    @C12579k
    public String toString() {
        OrderV3CancellationReason orderV3CancellationReason = this.cancellationReason;
        String str = this.creationDateTime;
        Boolean bool = this.customerIncident;
        Boolean bool2 = this.customerInvoice;
        Boolean bool3 = this.customerMessages;
        String str2 = this.facilityServiceId;
        Boolean bool4 = this.freeShipping;
        String str3 = this.invoiceUrl;
        String str4 = this.lastUpdateDateTime;
        String str5 = this.mkpOrderId;
        List<OrderV3Offer> list = this.offers;
        OrderV3ShippingType orderV3ShippingType = this.selectedShippingType;
        OrderV3SlotInfo orderV3SlotInfo = this.slotInfo;
        String str6 = this.status;
        String str7 = this.storeId;
        OrderV3Amounts orderV3Amounts = this.subOrderAmount;
        OrderV3Amounts orderV3Amounts2 = this.subOrderAmountWithoutDiscount;
        OrderV3Amounts orderV3Amounts3 = this.subOrderDiscountAmount;
        Long l = this.subOrderId;
        String str8 = this.subOrderType;
        String str9 = this.trackingUrl;
        Boolean bool5 = this.vendorAllowRatings;
        List<OrderV3Promotion> list2 = this.promotions;
        OrderV3DeliveryOption orderV3DeliveryOption = this.deliveryOption;
        return "OrderV3SubOrder(cancellationReason=" + orderV3CancellationReason + ", creationDateTime=" + str + ", customerIncident=" + bool + ", customerInvoice=" + bool2 + ", customerMessages=" + bool3 + ", facilityServiceId=" + str2 + ", freeShipping=" + bool4 + ", invoiceUrl=" + str3 + ", lastUpdateDateTime=" + str4 + ", mkpOrderId=" + str5 + ", offers=" + list + ", selectedShippingType=" + orderV3ShippingType + ", slotInfo=" + orderV3SlotInfo + ", status=" + str6 + ", storeId=" + str7 + ", subOrderAmount=" + orderV3Amounts + ", subOrderAmountWithoutDiscount=" + orderV3Amounts2 + ", subOrderDiscountAmount=" + orderV3Amounts3 + ", subOrderId=" + l + ", subOrderType=" + str8 + ", trackingUrl=" + str9 + ", vendorAllowRatings=" + bool5 + ", promotions=" + list2 + ", deliveryOption=" + orderV3DeliveryOption + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        OrderV3CancellationReason orderV3CancellationReason = this.cancellationReason;
        if (orderV3CancellationReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3CancellationReason.writeToParcel(parcel, i);
        }
        parcel.writeString(this.creationDateTime);
        Boolean bool = this.customerIncident;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.customerInvoice;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.customerMessages;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.facilityServiceId);
        Boolean bool4 = this.freeShipping;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.invoiceUrl);
        parcel.writeString(this.lastUpdateDateTime);
        parcel.writeString(this.mkpOrderId);
        List<OrderV3Offer> list = this.offers;
        parcel.writeInt(list.size());
        for (OrderV3Offer writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        OrderV3ShippingType orderV3ShippingType = this.selectedShippingType;
        if (orderV3ShippingType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3ShippingType.writeToParcel(parcel, i);
        }
        OrderV3SlotInfo orderV3SlotInfo = this.slotInfo;
        if (orderV3SlotInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3SlotInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.storeId);
        OrderV3Amounts orderV3Amounts = this.subOrderAmount;
        if (orderV3Amounts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Amounts.writeToParcel(parcel, i);
        }
        OrderV3Amounts orderV3Amounts2 = this.subOrderAmountWithoutDiscount;
        if (orderV3Amounts2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Amounts2.writeToParcel(parcel, i);
        }
        OrderV3Amounts orderV3Amounts3 = this.subOrderDiscountAmount;
        if (orderV3Amounts3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Amounts3.writeToParcel(parcel, i);
        }
        Long l = this.subOrderId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.subOrderType);
        parcel.writeString(this.trackingUrl);
        Boolean bool5 = this.vendorAllowRatings;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        List<OrderV3Promotion> list2 = this.promotions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (OrderV3Promotion writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        OrderV3DeliveryOption orderV3DeliveryOption = this.deliveryOption;
        if (orderV3DeliveryOption == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        orderV3DeliveryOption.writeToParcel(parcel, i);
    }
}
