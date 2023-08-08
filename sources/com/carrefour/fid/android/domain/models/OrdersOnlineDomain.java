package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010-\u001a\u00020\u000b\u0012\b\b\u0002\u0010.\u001a\u00020\u000b\u0012\b\b\u0002\u0010/\u001a\u00020\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00101\u001a\u00020\u000b\u0012\b\b\u0002\u00102\u001a\u00020\u000b\u0012\b\b\u0002\u00103\u001a\u00020\u000b\u0012\b\b\u0002\u00104\u001a\u00020\u000b\u0012\b\b\u0002\u00105\u001a\u00020\u000b\u0012\b\b\u0002\u00106\u001a\u00020\u0002¢\u0006\u0004\bj\u0010kJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0002HÆ\u0003Jø\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\t\u00109\u001a\u00020\u000bHÖ\u0001J\t\u0010:\u001a\u00020\tHÖ\u0001J\u0013\u0010=\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010>\u001a\u00020\tHÖ\u0001J\u0019\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\tHÖ\u0001R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010D\u001a\u0004\bG\u0010FR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010D\u001a\u0004\bH\u0010FR\u0019\u0010$\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010\bR\u0017\u0010%\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010&\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010'\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010(\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b(\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010K\u001a\u0004\bW\u0010MR\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010K\u001a\u0004\bX\u0010MR$\u0010+\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010Y\u001a\u0004\bZ\u0010\u0015\"\u0004\b[\u0010\\R$\u0010,\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010Y\u001a\u0004\b]\u0010\u0015\"\u0004\b^\u0010\\R\u0017\u0010-\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010N\u001a\u0004\b_\u0010PR\u0017\u0010.\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010N\u001a\u0004\b`\u0010PR\u0017\u0010/\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\ba\u0010PR\u0019\u00100\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010N\u001a\u0004\bb\u0010PR\u0017\u00101\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bc\u0010PR\u0017\u00102\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010N\u001a\u0004\bd\u0010PR\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010gR\u0017\u00104\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\bh\u0010PR\u0017\u00105\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\bi\u0010PR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010D\u001a\u0004\b6\u0010F¨\u0006l"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOnlineDomain;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "", "component5", "", "component6", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "component7", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "component8", "component9", "component10", "", "component11", "()Ljava/lang/Double;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "additionalOrderEligible", "canPostponeOrder", "canCancelOrder", "additionalOrderId", "viewType", "orderId", "orderStatus", "orderType", "orderAmountUnscaled", "orderAmountScale", "orderAmount", "orderPreparedAmount", "slotId", "slotBeginDate", "slotEndDate", "invoiceCreationDate", "slotCutOff", "orderCreationDateTime", "redirectionUrl", "trackingUrl", "facilityServiceId", "isInstorePayment", "copy", "(ZZZLjava/lang/Long;ILjava/lang/String;Lcom/carrefour/fid/android/core/constants/OrderStatus;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/carrefour/fid/android/domain/models/OrdersOnlineDomain;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "getAdditionalOrderEligible", "()Z", "getCanPostponeOrder", "getCanCancelOrder", "Ljava/lang/Long;", "getAdditionalOrderId", "I", "getViewType", "()I", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "getOrderStatus", "()Lcom/carrefour/fid/android/core/constants/OrderStatus;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "getOrderType", "()Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "getOrderAmountUnscaled", "getOrderAmountScale", "Ljava/lang/Double;", "getOrderAmount", "setOrderAmount", "(Ljava/lang/Double;)V", "getOrderPreparedAmount", "setOrderPreparedAmount", "getSlotId", "getSlotBeginDate", "getSlotEndDate", "getInvoiceCreationDate", "getSlotCutOff", "getOrderCreationDateTime", "getRedirectionUrl", "setRedirectionUrl", "(Ljava/lang/String;)V", "getTrackingUrl", "getFacilityServiceId", "<init>", "(ZZZLjava/lang/Long;ILjava/lang/String;Lcom/carrefour/fid/android/core/constants/OrderStatus;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrdersOnlineDomain implements Parcelable {
    public static final int $stable = 8;
    @C12579k
    public static final Parcelable.Creator<OrdersOnlineDomain> CREATOR = new C37930a();
    private final boolean additionalOrderEligible;
    @C12580l
    private final Long additionalOrderId;
    private final boolean canCancelOrder;
    private final boolean canPostponeOrder;
    @C12579k
    private final String facilityServiceId;
    @C12580l
    private final String invoiceCreationDate;
    private final boolean isInstorePayment;
    @C12580l
    private Double orderAmount;
    private final int orderAmountScale;
    private final int orderAmountUnscaled;
    @C12579k
    private final String orderCreationDateTime;
    @C12579k
    private final String orderId;
    @C12580l
    private Double orderPreparedAmount;
    @C12580l
    private final OrderStatus orderStatus;
    @C12580l
    private final OrderType orderType;
    @C12579k
    private String redirectionUrl;
    @C12579k
    private final String slotBeginDate;
    @C12579k
    private final String slotCutOff;
    @C12579k
    private final String slotEndDate;
    @C12579k
    private final String slotId;
    @C12579k
    private final String trackingUrl;
    private final int viewType;

    /* renamed from: com.carrefour.fid.android.domain.models.OrdersOnlineDomain$a */
    public static final class C37930a implements Parcelable.Creator<OrdersOnlineDomain> {
        @C12579k
        /* renamed from: a */
        public final OrdersOnlineDomain createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            Class<OrdersOnlineDomain> cls = OrdersOnlineDomain.class;
            return new OrdersOnlineDomain(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), (OrderStatus) parcel2.readParcelable(cls.getClassLoader()), (OrderType) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineDomain[] newArray(int i) {
            return new OrdersOnlineDomain[i];
        }
    }

    public OrdersOnlineDomain() {
        this(false, false, false, (Long) null, 0, (String) null, (OrderStatus) null, (OrderType) null, 0, 0, (Double) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 4194303, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OrdersOnlineDomain copy$default(OrdersOnlineDomain ordersOnlineDomain, boolean z, boolean z2, boolean z3, Long l, int i, String str, OrderStatus orderStatus2, OrderType orderType2, int i2, int i3, Double d, Double d2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z4, int i4, Object obj) {
        OrdersOnlineDomain ordersOnlineDomain2 = ordersOnlineDomain;
        int i5 = i4;
        return ordersOnlineDomain.copy((i5 & 1) != 0 ? ordersOnlineDomain2.additionalOrderEligible : z, (i5 & 2) != 0 ? ordersOnlineDomain2.canPostponeOrder : z2, (i5 & 4) != 0 ? ordersOnlineDomain2.canCancelOrder : z3, (i5 & 8) != 0 ? ordersOnlineDomain2.additionalOrderId : l, (i5 & 16) != 0 ? ordersOnlineDomain2.viewType : i, (i5 & 32) != 0 ? ordersOnlineDomain2.orderId : str, (i5 & 64) != 0 ? ordersOnlineDomain2.orderStatus : orderStatus2, (i5 & 128) != 0 ? ordersOnlineDomain2.orderType : orderType2, (i5 & 256) != 0 ? ordersOnlineDomain2.orderAmountUnscaled : i2, (i5 & 512) != 0 ? ordersOnlineDomain2.orderAmountScale : i3, (i5 & 1024) != 0 ? ordersOnlineDomain2.orderAmount : d, (i5 & 2048) != 0 ? ordersOnlineDomain2.orderPreparedAmount : d2, (i5 & 4096) != 0 ? ordersOnlineDomain2.slotId : str2, (i5 & 8192) != 0 ? ordersOnlineDomain2.slotBeginDate : str3, (i5 & 16384) != 0 ? ordersOnlineDomain2.slotEndDate : str4, (i5 & 32768) != 0 ? ordersOnlineDomain2.invoiceCreationDate : str5, (i5 & 65536) != 0 ? ordersOnlineDomain2.slotCutOff : str6, (i5 & 131072) != 0 ? ordersOnlineDomain2.orderCreationDateTime : str7, (i5 & 262144) != 0 ? ordersOnlineDomain2.redirectionUrl : str8, (i5 & 524288) != 0 ? ordersOnlineDomain2.trackingUrl : str9, (i5 & 1048576) != 0 ? ordersOnlineDomain2.facilityServiceId : str10, (i5 & 2097152) != 0 ? ordersOnlineDomain2.isInstorePayment : z4);
    }

    public final boolean component1() {
        return this.additionalOrderEligible;
    }

    public final int component10() {
        return this.orderAmountScale;
    }

    @C12580l
    public final Double component11() {
        return this.orderAmount;
    }

    @C12580l
    public final Double component12() {
        return this.orderPreparedAmount;
    }

    @C12579k
    public final String component13() {
        return this.slotId;
    }

    @C12579k
    public final String component14() {
        return this.slotBeginDate;
    }

    @C12579k
    public final String component15() {
        return this.slotEndDate;
    }

    @C12580l
    public final String component16() {
        return this.invoiceCreationDate;
    }

    @C12579k
    public final String component17() {
        return this.slotCutOff;
    }

    @C12579k
    public final String component18() {
        return this.orderCreationDateTime;
    }

    @C12579k
    public final String component19() {
        return this.redirectionUrl;
    }

    public final boolean component2() {
        return this.canPostponeOrder;
    }

    @C12579k
    public final String component20() {
        return this.trackingUrl;
    }

    @C12579k
    public final String component21() {
        return this.facilityServiceId;
    }

    public final boolean component22() {
        return this.isInstorePayment;
    }

    public final boolean component3() {
        return this.canCancelOrder;
    }

    @C12580l
    public final Long component4() {
        return this.additionalOrderId;
    }

    public final int component5() {
        return this.viewType;
    }

    @C12579k
    public final String component6() {
        return this.orderId;
    }

    @C12580l
    public final OrderStatus component7() {
        return this.orderStatus;
    }

    @C12580l
    public final OrderType component8() {
        return this.orderType;
    }

    public final int component9() {
        return this.orderAmountUnscaled;
    }

    @C12579k
    public final OrdersOnlineDomain copy(boolean z, boolean z2, boolean z3, @C12580l Long l, int i, @C12579k String str, @C12580l OrderStatus orderStatus2, @C12580l OrderType orderType2, int i2, int i3, @C12580l Double d, @C12580l Double d2, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, boolean z4) {
        boolean z5 = z;
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(str2, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str3, "slotBeginDate");
        Intrinsics.checkNotNullParameter(str4, "slotEndDate");
        Intrinsics.checkNotNullParameter(str6, "slotCutOff");
        Intrinsics.checkNotNullParameter(str7, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(str8, "redirectionUrl");
        Intrinsics.checkNotNullParameter(str9, "trackingUrl");
        Intrinsics.checkNotNullParameter(str10, C28547h2.f69320h);
        return new OrdersOnlineDomain(z, z2, z3, l, i, str, orderStatus2, orderType2, i2, i3, d, d2, str2, str3, str4, str5, str6, str7, str8, str9, str10, z4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOnlineDomain)) {
            return false;
        }
        OrdersOnlineDomain ordersOnlineDomain = (OrdersOnlineDomain) obj;
        return this.additionalOrderEligible == ordersOnlineDomain.additionalOrderEligible && this.canPostponeOrder == ordersOnlineDomain.canPostponeOrder && this.canCancelOrder == ordersOnlineDomain.canCancelOrder && Intrinsics.areEqual((Object) this.additionalOrderId, (Object) ordersOnlineDomain.additionalOrderId) && this.viewType == ordersOnlineDomain.viewType && Intrinsics.areEqual((Object) this.orderId, (Object) ordersOnlineDomain.orderId) && Intrinsics.areEqual((Object) this.orderStatus, (Object) ordersOnlineDomain.orderStatus) && Intrinsics.areEqual((Object) this.orderType, (Object) ordersOnlineDomain.orderType) && this.orderAmountUnscaled == ordersOnlineDomain.orderAmountUnscaled && this.orderAmountScale == ordersOnlineDomain.orderAmountScale && Intrinsics.areEqual((Object) this.orderAmount, (Object) ordersOnlineDomain.orderAmount) && Intrinsics.areEqual((Object) this.orderPreparedAmount, (Object) ordersOnlineDomain.orderPreparedAmount) && Intrinsics.areEqual((Object) this.slotId, (Object) ordersOnlineDomain.slotId) && Intrinsics.areEqual((Object) this.slotBeginDate, (Object) ordersOnlineDomain.slotBeginDate) && Intrinsics.areEqual((Object) this.slotEndDate, (Object) ordersOnlineDomain.slotEndDate) && Intrinsics.areEqual((Object) this.invoiceCreationDate, (Object) ordersOnlineDomain.invoiceCreationDate) && Intrinsics.areEqual((Object) this.slotCutOff, (Object) ordersOnlineDomain.slotCutOff) && Intrinsics.areEqual((Object) this.orderCreationDateTime, (Object) ordersOnlineDomain.orderCreationDateTime) && Intrinsics.areEqual((Object) this.redirectionUrl, (Object) ordersOnlineDomain.redirectionUrl) && Intrinsics.areEqual((Object) this.trackingUrl, (Object) ordersOnlineDomain.trackingUrl) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) ordersOnlineDomain.facilityServiceId) && this.isInstorePayment == ordersOnlineDomain.isInstorePayment;
    }

    public final boolean getAdditionalOrderEligible() {
        return this.additionalOrderEligible;
    }

    @C12580l
    public final Long getAdditionalOrderId() {
        return this.additionalOrderId;
    }

    public final boolean getCanCancelOrder() {
        return this.canCancelOrder;
    }

    public final boolean getCanPostponeOrder() {
        return this.canPostponeOrder;
    }

    @C12579k
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final String getInvoiceCreationDate() {
        return this.invoiceCreationDate;
    }

    @C12580l
    public final Double getOrderAmount() {
        return this.orderAmount;
    }

    public final int getOrderAmountScale() {
        return this.orderAmountScale;
    }

    public final int getOrderAmountUnscaled() {
        return this.orderAmountUnscaled;
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
    public final Double getOrderPreparedAmount() {
        return this.orderPreparedAmount;
    }

    @C12580l
    public final OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    @C12580l
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @C12579k
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @C12579k
    public final String getSlotBeginDate() {
        return this.slotBeginDate;
    }

    @C12579k
    public final String getSlotCutOff() {
        return this.slotCutOff;
    }

    @C12579k
    public final String getSlotEndDate() {
        return this.slotEndDate;
    }

    @C12579k
    public final String getSlotId() {
        return this.slotId;
    }

    @C12579k
    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        boolean z = this.additionalOrderEligible;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.canPostponeOrder;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.canCancelOrder;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        Long l = this.additionalOrderId;
        int i4 = 0;
        int hashCode = (((((i3 + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.viewType)) * 31) + this.orderId.hashCode()) * 31;
        OrderStatus orderStatus2 = this.orderStatus;
        int hashCode2 = (hashCode + (orderStatus2 == null ? 0 : orderStatus2.hashCode())) * 31;
        OrderType orderType2 = this.orderType;
        int hashCode3 = (((((hashCode2 + (orderType2 == null ? 0 : orderType2.hashCode())) * 31) + Integer.hashCode(this.orderAmountUnscaled)) * 31) + Integer.hashCode(this.orderAmountScale)) * 31;
        Double d = this.orderAmount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.orderPreparedAmount;
        int hashCode5 = (((((((hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31) + this.slotId.hashCode()) * 31) + this.slotBeginDate.hashCode()) * 31) + this.slotEndDate.hashCode()) * 31;
        String str = this.invoiceCreationDate;
        if (str != null) {
            i4 = str.hashCode();
        }
        int hashCode6 = (((((((((((hashCode5 + i4) * 31) + this.slotCutOff.hashCode()) * 31) + this.orderCreationDateTime.hashCode()) * 31) + this.redirectionUrl.hashCode()) * 31) + this.trackingUrl.hashCode()) * 31) + this.facilityServiceId.hashCode()) * 31;
        boolean z5 = this.isInstorePayment;
        if (!z5) {
            z2 = z5;
        }
        return hashCode6 + (z2 ? 1 : 0);
    }

    public final boolean isInstorePayment() {
        return this.isInstorePayment;
    }

    public final void setOrderAmount(@C12580l Double d) {
        this.orderAmount = d;
    }

    public final void setOrderPreparedAmount(@C12580l Double d) {
        this.orderPreparedAmount = d;
    }

    public final void setRedirectionUrl(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.redirectionUrl = str;
    }

    @C12579k
    public String toString() {
        boolean z = this.additionalOrderEligible;
        boolean z2 = this.canPostponeOrder;
        boolean z3 = this.canCancelOrder;
        Long l = this.additionalOrderId;
        int i = this.viewType;
        String str = this.orderId;
        OrderStatus orderStatus2 = this.orderStatus;
        OrderType orderType2 = this.orderType;
        int i2 = this.orderAmountUnscaled;
        int i3 = this.orderAmountScale;
        Double d = this.orderAmount;
        Double d2 = this.orderPreparedAmount;
        String str2 = this.slotId;
        String str3 = this.slotBeginDate;
        String str4 = this.slotEndDate;
        String str5 = this.invoiceCreationDate;
        String str6 = this.slotCutOff;
        String str7 = this.orderCreationDateTime;
        String str8 = this.redirectionUrl;
        String str9 = this.trackingUrl;
        String str10 = this.facilityServiceId;
        boolean z4 = this.isInstorePayment;
        return "OrdersOnlineDomain(additionalOrderEligible=" + z + ", canPostponeOrder=" + z2 + ", canCancelOrder=" + z3 + ", additionalOrderId=" + l + ", viewType=" + i + ", orderId=" + str + ", orderStatus=" + orderStatus2 + ", orderType=" + orderType2 + ", orderAmountUnscaled=" + i2 + ", orderAmountScale=" + i3 + ", orderAmount=" + d + ", orderPreparedAmount=" + d2 + ", slotId=" + str2 + ", slotBeginDate=" + str3 + ", slotEndDate=" + str4 + ", invoiceCreationDate=" + str5 + ", slotCutOff=" + str6 + ", orderCreationDateTime=" + str7 + ", redirectionUrl=" + str8 + ", trackingUrl=" + str9 + ", facilityServiceId=" + str10 + ", isInstorePayment=" + z4 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.additionalOrderEligible ? 1 : 0);
        parcel.writeInt(this.canPostponeOrder ? 1 : 0);
        parcel.writeInt(this.canCancelOrder ? 1 : 0);
        Long l = this.additionalOrderId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.viewType);
        parcel.writeString(this.orderId);
        parcel.writeParcelable(this.orderStatus, i);
        parcel.writeParcelable(this.orderType, i);
        parcel.writeInt(this.orderAmountUnscaled);
        parcel.writeInt(this.orderAmountScale);
        Double d = this.orderAmount;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.orderPreparedAmount;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.slotId);
        parcel.writeString(this.slotBeginDate);
        parcel.writeString(this.slotEndDate);
        parcel.writeString(this.invoiceCreationDate);
        parcel.writeString(this.slotCutOff);
        parcel.writeString(this.orderCreationDateTime);
        parcel.writeString(this.redirectionUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.facilityServiceId);
        parcel.writeInt(this.isInstorePayment ? 1 : 0);
    }

    public OrdersOnlineDomain(boolean z, boolean z2, boolean z3, @C12580l Long l, int i, @C12579k String str, @C12580l OrderStatus orderStatus2, @C12580l OrderType orderType2, int i2, int i3, @C12580l Double d, @C12580l Double d2, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, boolean z4) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        Intrinsics.checkNotNullParameter(str11, "orderId");
        Intrinsics.checkNotNullParameter(str12, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str13, "slotBeginDate");
        Intrinsics.checkNotNullParameter(str14, "slotEndDate");
        Intrinsics.checkNotNullParameter(str15, "slotCutOff");
        Intrinsics.checkNotNullParameter(str16, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(str17, "redirectionUrl");
        Intrinsics.checkNotNullParameter(str18, "trackingUrl");
        Intrinsics.checkNotNullParameter(str19, C28547h2.f69320h);
        this.additionalOrderEligible = z;
        this.canPostponeOrder = z2;
        this.canCancelOrder = z3;
        this.additionalOrderId = l;
        this.viewType = i;
        this.orderId = str11;
        this.orderStatus = orderStatus2;
        this.orderType = orderType2;
        this.orderAmountUnscaled = i2;
        this.orderAmountScale = i3;
        this.orderAmount = d;
        this.orderPreparedAmount = d2;
        this.slotId = str12;
        this.slotBeginDate = str13;
        this.slotEndDate = str14;
        this.invoiceCreationDate = str5;
        this.slotCutOff = str15;
        this.orderCreationDateTime = str16;
        this.redirectionUrl = str17;
        this.trackingUrl = str18;
        this.facilityServiceId = str19;
        this.isInstorePayment = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOnlineDomain(boolean r24, boolean r25, boolean r26, java.lang.Long r27, int r28, java.lang.String r29, com.carrefour.fid.android.core.constants.OrderStatus r30, com.carrefour.fid.android.shared.domain.models.order.OrderType r31, int r32, int r33, java.lang.Double r34, java.lang.Double r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, boolean r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            r23 = this;
            r0 = r46
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r24
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r25
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r26
        L_0x001a:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0021
            r5 = r6
            goto L_0x0023
        L_0x0021:
            r5 = r27
        L_0x0023:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0029
            r7 = 0
            goto L_0x002b
        L_0x0029:
            r7 = r28
        L_0x002b:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0035
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0037
        L_0x0035:
            r8 = r29
        L_0x0037:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003d
            r9 = r6
            goto L_0x003f
        L_0x003d:
            r9 = r30
        L_0x003f:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r6
            goto L_0x0047
        L_0x0045:
            r10 = r31
        L_0x0047:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004d
            r11 = 0
            goto L_0x004f
        L_0x004d:
            r11 = r32
        L_0x004f:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0055
            r12 = 0
            goto L_0x0057
        L_0x0055:
            r12 = r33
        L_0x0057:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005d
            r13 = r6
            goto L_0x005f
        L_0x005d:
            r13 = r34
        L_0x005f:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = r35
        L_0x0066:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0070
            java.lang.String r14 = new java.lang.String
            r14.<init>()
            goto L_0x0072
        L_0x0070:
            r14 = r36
        L_0x0072:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007c
            java.lang.String r15 = new java.lang.String
            r15.<init>()
            goto L_0x007e
        L_0x007c:
            r15 = r37
        L_0x007e:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0088
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x008a
        L_0x0088:
            r2 = r38
        L_0x008a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0097
            java.lang.String r16 = new java.lang.String
            r16.<init>()
            goto L_0x0099
        L_0x0097:
            r16 = r39
        L_0x0099:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a5
            java.lang.String r17 = new java.lang.String
            r17.<init>()
            goto L_0x00a7
        L_0x00a5:
            r17 = r40
        L_0x00a7:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00b3
            java.lang.String r18 = new java.lang.String
            r18.<init>()
            goto L_0x00b5
        L_0x00b3:
            r18 = r41
        L_0x00b5:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00c1
            java.lang.String r19 = new java.lang.String
            r19.<init>()
            goto L_0x00c3
        L_0x00c1:
            r19 = r42
        L_0x00c3:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00cf
            java.lang.String r20 = new java.lang.String
            r20.<init>()
            goto L_0x00d1
        L_0x00cf:
            r20 = r43
        L_0x00d1:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00dd
            java.lang.String r21 = new java.lang.String
            r21.<init>()
            goto L_0x00df
        L_0x00dd:
            r21 = r44
        L_0x00df:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00e7
            r0 = 0
            goto L_0x00e9
        L_0x00e7:
            r0 = r45
        L_0x00e9:
            r24 = r23
            r25 = r1
            r26 = r3
            r27 = r4
            r28 = r5
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r13
            r36 = r6
            r37 = r14
            r38 = r15
            r39 = r2
            r40 = r16
            r41 = r17
            r42 = r18
            r43 = r19
            r44 = r20
            r45 = r21
            r46 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OrdersOnlineDomain.<init>(boolean, boolean, boolean, java.lang.Long, int, java.lang.String, com.carrefour.fid.android.core.constants.OrderStatus, com.carrefour.fid.android.shared.domain.models.order.OrderType, int, int, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
