package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.urbanairship.util.C9647e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B¡\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010/\u001a\u00020\t\u0012\u0006\u00100\u001a\u00020\u000b\u0012\u0006\u00101\u001a\u00020\r\u0012\u0006\u00102\u001a\u00020\t\u0012\u0006\u00103\u001a\u00020\t\u0012\u0006\u00104\u001a\u00020\t\u0012\u0006\u00105\u001a\u00020\t\u0012\u0006\u00106\u001a\u00020\t\u0012\u0006\u00107\u001a\u00020\t\u0012\u0006\u00108\u001a\u00020\t\u0012\u0006\u00109\u001a\u00020\t\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010;\u001a\u00020\t\u0012\u0006\u0010<\u001a\u00020\u0004\u0012\u0006\u0010=\u001a\u00020\t\u0012\u0006\u0010>\u001a\u00020\t\u0012\u0006\u0010?\u001a\u00020\t\u0012\u0006\u0010@\u001a\u00020\t\u0012\u0006\u0010A\u001a\u00020\t\u0012\u0006\u0010B\u001a\u00020\t\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\b\b\u0002\u0010D\u001a\u00020\u0004\u0012\b\b\u0002\u0010E\u001a\u00020\u0004\u0012\b\b\u0002\u0010F\u001a\u00020\u0004\u0012\b\b\u0002\u0010G\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010J\u001a\u00020\u0004¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010*HÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003JÒ\u0002\u0010K\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t2\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\t2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010D\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010J\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\bK\u0010LJ\t\u0010M\u001a\u00020\tHÖ\u0001J\t\u0010N\u001a\u00020\u0018HÖ\u0001J\u0013\u0010Q\u001a\u00020\u00042\b\u0010P\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010R\u001a\u00020\u0018HÖ\u0001J\u0019\u0010W\u001a\u00020V2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0018HÖ\u0001R\u001a\u0010-\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010.\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\bZ\u0010\\\u001a\u0004\bX\u0010\bR\u001a\u0010/\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u00100\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b_\u0010a\u001a\u0004\bb\u0010cR\u001a\u00101\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u00102\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\bf\u0010^\u001a\u0004\bd\u0010`R\u0017\u00103\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bY\u0010`R\u0017\u00104\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010^\u001a\u0004\bh\u0010`R\u0017\u00105\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010^\u001a\u0004\bi\u0010`R\u0017\u00106\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010^\u001a\u0004\bj\u0010`R\u0017\u00107\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010^\u001a\u0004\bk\u0010`R\u0017\u00108\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010^\u001a\u0004\bl\u0010`R\u0017\u00109\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010`R#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010;\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bY\u0010^\u001a\u0004\bq\u0010`R\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010Y\u001a\u0004\bs\u0010[R\u0017\u0010=\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bt\u0010^\u001a\u0004\bu\u0010`R\u0017\u0010>\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bv\u0010^\u001a\u0004\bw\u0010`R\u0017\u0010?\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bx\u0010^\u001a\u0004\by\u0010`R\u0017\u0010@\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bz\u0010^\u001a\u0004\b{\u0010`R\u0017\u0010A\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b|\u0010^\u001a\u0004\b}\u0010`R\u0017\u0010B\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b~\u0010^\u001a\u0004\b\u0010`R!\u0010C\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010D\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010Y\u001a\u0005\b\u0001\u0010[R\u0019\u0010E\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010Y\u001a\u0005\b\u0001\u0010[R\u0019\u0010F\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010Y\u001a\u0005\b\u0001\u0010[R\u0019\u0010G\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010Y\u001a\u0005\b\u0001\u0010[R\u0019\u0010H\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010^\u001a\u0005\b\u0001\u0010`R\u001d\u0010I\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010J\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010Y\u001a\u0005\b\u0001\u0010[¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsHeaderModel;", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/k;", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/e;", "Landroid/os/Parcelable;", "", "h", "", "s", "()Ljava/lang/Long;", "", "D", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "F", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "G", "H", "I", "J", "K", "i", "j", "k", "l", "Lkotlin/Pair;", "", "m", "n", "o", "p", "q", "r", "t", "u", "v", "", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsAllowanceModel;", "w", "x", "y", "z", "A", "B", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;", "C", "E", "additionalOrderEligible", "additionalOrderId", "orderCreationDateTime", "orderStatus", "orderType", "orderPaymentDate", "orderId", "orderAmount", "orderStoreName", "orderAddress", "orderPostalCode", "orderBeginSlot", "orderEndSlot", "orderStatusProgress", "orderPickingEligibility", "showStatusProgress", "downloadUrl", "refundUrl", "cancelUrl", "facilityServiceId", "trackingUrl", "invoiceUrl", "allowanceChargeList", "isShiftSlotAvailable", "isCancelOrderAvailable", "isChangeDeliveryAvailable", "canBeReturned", "eCardInvoiceUrl", "notificationModel", "isInstorePayment", "L", "(ZLjava/lang/Long;Ljava/lang/String;Lcom/carrefour/fid/android/core/constants/OrderStatus;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/String;Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;Z)Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsHeaderModel;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "Z", "b", "()Z", "Ljava/lang/Long;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "g", "()Lcom/carrefour/fid/android/core/constants/OrderStatus;", "e", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "f", "()Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "W", "d0", "V", "b0", "X", "Y", "Lkotlin/Pair;", "c0", "()Lkotlin/Pair;", "a0", "E0", "f0", "F0", "Q", "G0", "e0", "H0", "P", "I0", "S", "J0", "g0", "K0", "T", "L0", "Ljava/util/List;", "N", "()Ljava/util/List;", "M0", "k0", "N0", "h0", "O0", "i0", "P0", "O", "Q0", "R", "R0", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;", "U", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;", "S0", "j0", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Lcom/carrefour/fid/android/core/constants/OrderStatus;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/String;Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel */
public final class OrdersOnlineDetailsHeaderModel implements C25243k, C25237e, Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrdersOnlineDetailsHeaderModel> CREATOR = new C25227a();

    /* renamed from: T0 */
    public static final int f62128T0 = 8;

    /* renamed from: E0 */
    public final boolean f62129E0;
    @C12579k

    /* renamed from: F0 */
    public final String f62130F0;
    @C12579k

    /* renamed from: G0 */
    public final String f62131G0;
    @C12579k

    /* renamed from: H0 */
    public final String f62132H0;
    @C12579k

    /* renamed from: I0 */
    public final String f62133I0;
    @C12579k

    /* renamed from: J0 */
    public final String f62134J0;
    @C12579k

    /* renamed from: K0 */
    public final String f62135K0;
    @C12579k

    /* renamed from: L0 */
    public final List<OrdersOnlineDetailsAllowanceModel> f62136L0;

    /* renamed from: M0 */
    public final boolean f62137M0;

    /* renamed from: N0 */
    public final boolean f62138N0;

    /* renamed from: O0 */
    public final boolean f62139O0;

    /* renamed from: P0 */
    public final boolean f62140P0;
    @C12579k

    /* renamed from: Q0 */
    public final String f62141Q0;
    @C12580l

    /* renamed from: R0 */
    public final NotificationModel f62142R0;

    /* renamed from: S0 */
    public final boolean f62143S0;
    @C12579k

    /* renamed from: X */
    public final String f62144X;
    @C12579k

    /* renamed from: Y */
    public final Pair<Integer, Integer> f62145Y;
    @C12579k

    /* renamed from: Z */
    public final String f62146Z;

    /* renamed from: a */
    public final boolean f62147a;
    @C12580l

    /* renamed from: b */
    public final Long f62148b;
    @C12579k

    /* renamed from: c */
    public final String f62149c;
    @C12579k

    /* renamed from: d */
    public final OrderStatus f62150d;
    @C12579k

    /* renamed from: e */
    public final OrderType f62151e;
    @C12579k

    /* renamed from: f */
    public final String f62152f;
    @C12579k

    /* renamed from: g */
    public final String f62153g;
    @C12579k

    /* renamed from: v */
    public final String f62154v;
    @C12579k

    /* renamed from: w */
    public final String f62155w;
    @C12579k

    /* renamed from: x */
    public final String f62156x;
    @C12579k

    /* renamed from: y */
    public final String f62157y;
    @C12579k

    /* renamed from: z */
    public final String f62158z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel$a */
    public static final class C25227a implements Parcelable.Creator<OrdersOnlineDetailsHeaderModel> {
        @C12579k
        /* renamed from: a */
        public final OrdersOnlineDetailsHeaderModel createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            boolean z = parcel.readInt() != 0;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            Class<OrdersOnlineDetailsHeaderModel> cls = OrdersOnlineDetailsHeaderModel.class;
            OrderStatus orderStatus = (OrderStatus) parcel2.readParcelable(cls.getClassLoader());
            OrderType orderType = (OrderType) parcel2.readParcelable(cls.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            Pair pair = (Pair) parcel.readSerializable();
            String readString10 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(OrdersOnlineDetailsAllowanceModel.CREATOR.createFromParcel(parcel2));
            }
            return new OrdersOnlineDetailsHeaderModel(z, valueOf, readString, orderStatus, orderType, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, pair, readString10, z2, readString11, readString12, readString13, readString14, readString15, readString16, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : NotificationModel.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineDetailsHeaderModel[] newArray(int i) {
            return new OrdersOnlineDetailsHeaderModel[i];
        }
    }

    public OrdersOnlineDetailsHeaderModel(boolean z, @C12580l Long l, @C12579k String str, @C12579k OrderStatus orderStatus, @C12579k OrderType orderType, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k Pair<Integer, Integer> pair, @C12579k String str10, boolean z2, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, @C12579k String str15, @C12579k String str16, @C12579k List<OrdersOnlineDetailsAllowanceModel> list, boolean z3, boolean z4, boolean z5, boolean z6, @C12579k String str17, @C12580l NotificationModel notificationModel, boolean z7) {
        String str18 = str;
        OrderStatus orderStatus2 = orderStatus;
        OrderType orderType2 = orderType;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        Pair<Integer, Integer> pair2 = pair;
        String str27 = str10;
        String str28 = str11;
        String str29 = str13;
        Intrinsics.checkNotNullParameter(str18, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(orderStatus2, "orderStatus");
        Intrinsics.checkNotNullParameter(orderType2, "orderType");
        Intrinsics.checkNotNullParameter(str19, "orderPaymentDate");
        Intrinsics.checkNotNullParameter(str20, "orderId");
        Intrinsics.checkNotNullParameter(str21, "orderAmount");
        Intrinsics.checkNotNullParameter(str22, "orderStoreName");
        Intrinsics.checkNotNullParameter(str23, "orderAddress");
        Intrinsics.checkNotNullParameter(str24, "orderPostalCode");
        Intrinsics.checkNotNullParameter(str25, "orderBeginSlot");
        Intrinsics.checkNotNullParameter(str26, "orderEndSlot");
        Intrinsics.checkNotNullParameter(pair2, "orderStatusProgress");
        Intrinsics.checkNotNullParameter(str27, "orderPickingEligibility");
        Intrinsics.checkNotNullParameter(str28, "downloadUrl");
        Intrinsics.checkNotNullParameter(str12, "refundUrl");
        Intrinsics.checkNotNullParameter(str13, "cancelUrl");
        Intrinsics.checkNotNullParameter(str14, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str15, "trackingUrl");
        Intrinsics.checkNotNullParameter(str16, "invoiceUrl");
        Intrinsics.checkNotNullParameter(list, "allowanceChargeList");
        Intrinsics.checkNotNullParameter(str17, "eCardInvoiceUrl");
        this.f62147a = z;
        this.f62148b = l;
        this.f62149c = str18;
        this.f62150d = orderStatus2;
        this.f62151e = orderType2;
        this.f62152f = str19;
        this.f62153g = str20;
        this.f62154v = str21;
        this.f62155w = str22;
        this.f62156x = str23;
        this.f62157y = str24;
        this.f62158z = str25;
        this.f62144X = str26;
        this.f62145Y = pair2;
        this.f62146Z = str27;
        this.f62129E0 = z2;
        this.f62130F0 = str28;
        this.f62131G0 = str12;
        this.f62132H0 = str13;
        this.f62133I0 = str14;
        this.f62134J0 = str15;
        this.f62135K0 = str16;
        this.f62136L0 = list;
        this.f62137M0 = z3;
        this.f62138N0 = z4;
        this.f62139O0 = z5;
        this.f62140P0 = z6;
        this.f62141Q0 = str17;
        this.f62142R0 = notificationModel;
        this.f62143S0 = z7;
    }

    /* renamed from: M */
    public static /* synthetic */ OrdersOnlineDetailsHeaderModel m109021M(OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, boolean z, Long l, String str, OrderStatus orderStatus, OrderType orderType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, String str10, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, List list, boolean z3, boolean z4, boolean z5, boolean z6, String str17, NotificationModel notificationModel, boolean z7, int i, Object obj) {
        OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel2 = ordersOnlineDetailsHeaderModel;
        int i2 = i;
        return ordersOnlineDetailsHeaderModel.mo73353L((i2 & 1) != 0 ? ordersOnlineDetailsHeaderModel2.f62147a : z, (i2 & 2) != 0 ? ordersOnlineDetailsHeaderModel2.f62148b : l, (i2 & 4) != 0 ? ordersOnlineDetailsHeaderModel2.f62149c : str, (i2 & 8) != 0 ? ordersOnlineDetailsHeaderModel2.f62150d : orderStatus, (i2 & 16) != 0 ? ordersOnlineDetailsHeaderModel2.f62151e : orderType, (i2 & 32) != 0 ? ordersOnlineDetailsHeaderModel2.f62152f : str2, (i2 & 64) != 0 ? ordersOnlineDetailsHeaderModel2.f62153g : str3, (i2 & 128) != 0 ? ordersOnlineDetailsHeaderModel2.f62154v : str4, (i2 & 256) != 0 ? ordersOnlineDetailsHeaderModel2.f62155w : str5, (i2 & 512) != 0 ? ordersOnlineDetailsHeaderModel2.f62156x : str6, (i2 & 1024) != 0 ? ordersOnlineDetailsHeaderModel2.f62157y : str7, (i2 & 2048) != 0 ? ordersOnlineDetailsHeaderModel2.f62158z : str8, (i2 & 4096) != 0 ? ordersOnlineDetailsHeaderModel2.f62144X : str9, (i2 & 8192) != 0 ? ordersOnlineDetailsHeaderModel2.f62145Y : pair, (i2 & 16384) != 0 ? ordersOnlineDetailsHeaderModel2.f62146Z : str10, (i2 & 32768) != 0 ? ordersOnlineDetailsHeaderModel2.f62129E0 : z2, (i2 & 65536) != 0 ? ordersOnlineDetailsHeaderModel2.f62130F0 : str11, (i2 & 131072) != 0 ? ordersOnlineDetailsHeaderModel2.f62131G0 : str12, (i2 & 262144) != 0 ? ordersOnlineDetailsHeaderModel2.f62132H0 : str13, (i2 & 524288) != 0 ? ordersOnlineDetailsHeaderModel2.f62133I0 : str14, (i2 & 1048576) != 0 ? ordersOnlineDetailsHeaderModel2.f62134J0 : str15, (i2 & 2097152) != 0 ? ordersOnlineDetailsHeaderModel2.f62135K0 : str16, (i2 & 4194304) != 0 ? ordersOnlineDetailsHeaderModel2.f62136L0 : list, (i2 & 8388608) != 0 ? ordersOnlineDetailsHeaderModel2.f62137M0 : z3, (i2 & 16777216) != 0 ? ordersOnlineDetailsHeaderModel2.f62138N0 : z4, (i2 & C9647e0.f26435a) != 0 ? ordersOnlineDetailsHeaderModel2.f62139O0 : z5, (i2 & C8698y1.f23302n) != 0 ? ordersOnlineDetailsHeaderModel2.f62140P0 : z6, (i2 & C8698y1.f23301m) != 0 ? ordersOnlineDetailsHeaderModel2.f62141Q0 : str17, (i2 & 268435456) != 0 ? ordersOnlineDetailsHeaderModel2.f62142R0 : notificationModel, (i2 & 536870912) != 0 ? ordersOnlineDetailsHeaderModel2.f62143S0 : z7);
    }

    /* renamed from: A */
    public final boolean mo73342A() {
        return this.f62140P0;
    }

    @C12579k
    /* renamed from: B */
    public final String mo73343B() {
        return this.f62141Q0;
    }

    @C12580l
    /* renamed from: C */
    public final NotificationModel mo73344C() {
        return this.f62142R0;
    }

    @C12579k
    /* renamed from: D */
    public final String mo73345D() {
        return this.f62149c;
    }

    /* renamed from: E */
    public final boolean mo73346E() {
        return this.f62143S0;
    }

    @C12579k
    /* renamed from: F */
    public final OrderStatus mo73347F() {
        return this.f62150d;
    }

    @C12579k
    /* renamed from: G */
    public final OrderType mo73348G() {
        return this.f62151e;
    }

    @C12579k
    /* renamed from: H */
    public final String mo73349H() {
        return this.f62152f;
    }

    @C12579k
    /* renamed from: I */
    public final String mo73350I() {
        return this.f62153g;
    }

    @C12579k
    /* renamed from: J */
    public final String mo73351J() {
        return this.f62154v;
    }

    @C12579k
    /* renamed from: K */
    public final String mo73352K() {
        return this.f62155w;
    }

    @C12579k
    /* renamed from: L */
    public final OrdersOnlineDetailsHeaderModel mo73353L(boolean z, @C12580l Long l, @C12579k String str, @C12579k OrderStatus orderStatus, @C12579k OrderType orderType, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k Pair<Integer, Integer> pair, @C12579k String str10, boolean z2, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, @C12579k String str15, @C12579k String str16, @C12579k List<OrdersOnlineDetailsAllowanceModel> list, boolean z3, boolean z4, boolean z5, boolean z6, @C12579k String str17, @C12580l NotificationModel notificationModel, boolean z7) {
        boolean z8 = z;
        Intrinsics.checkNotNullParameter(str, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(str2, "orderPaymentDate");
        Intrinsics.checkNotNullParameter(str3, "orderId");
        Intrinsics.checkNotNullParameter(str4, "orderAmount");
        Intrinsics.checkNotNullParameter(str5, "orderStoreName");
        Intrinsics.checkNotNullParameter(str6, "orderAddress");
        Intrinsics.checkNotNullParameter(str7, "orderPostalCode");
        Intrinsics.checkNotNullParameter(str8, "orderBeginSlot");
        Intrinsics.checkNotNullParameter(str9, "orderEndSlot");
        Intrinsics.checkNotNullParameter(pair, "orderStatusProgress");
        Intrinsics.checkNotNullParameter(str10, "orderPickingEligibility");
        Intrinsics.checkNotNullParameter(str11, "downloadUrl");
        Intrinsics.checkNotNullParameter(str12, "refundUrl");
        Intrinsics.checkNotNullParameter(str13, "cancelUrl");
        Intrinsics.checkNotNullParameter(str14, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str15, "trackingUrl");
        Intrinsics.checkNotNullParameter(str16, "invoiceUrl");
        Intrinsics.checkNotNullParameter(list, "allowanceChargeList");
        Intrinsics.checkNotNullParameter(str17, "eCardInvoiceUrl");
        return new OrdersOnlineDetailsHeaderModel(z, l, str, orderStatus, orderType, str2, str3, str4, str5, str6, str7, str8, str9, pair, str10, z2, str11, str12, str13, str14, str15, str16, list, z3, z4, z5, z6, str17, notificationModel, z7);
    }

    @C12579k
    /* renamed from: N */
    public final List<OrdersOnlineDetailsAllowanceModel> mo73354N() {
        return this.f62136L0;
    }

    /* renamed from: O */
    public final boolean mo73355O() {
        return this.f62140P0;
    }

    @C12579k
    /* renamed from: P */
    public final String mo73356P() {
        return this.f62132H0;
    }

    @C12579k
    /* renamed from: Q */
    public final String mo73357Q() {
        return this.f62130F0;
    }

    @C12579k
    /* renamed from: R */
    public final String mo73358R() {
        return this.f62141Q0;
    }

    @C12579k
    /* renamed from: S */
    public final String mo73359S() {
        return this.f62133I0;
    }

    @C12579k
    /* renamed from: T */
    public final String mo73360T() {
        return this.f62135K0;
    }

    @C12580l
    /* renamed from: U */
    public final NotificationModel mo73361U() {
        return this.f62142R0;
    }

    @C12579k
    /* renamed from: V */
    public final String mo73362V() {
        return this.f62156x;
    }

    @C12579k
    /* renamed from: W */
    public final String mo73363W() {
        return this.f62154v;
    }

    @C12579k
    /* renamed from: X */
    public final String mo73364X() {
        return this.f62158z;
    }

    @C12579k
    /* renamed from: Y */
    public final String mo73365Y() {
        return this.f62144X;
    }

    @C12579k
    /* renamed from: Z */
    public final String mo73366Z() {
        return this.f62153g;
    }

    @C12580l
    /* renamed from: a */
    public Long mo73367a() {
        return this.f62148b;
    }

    @C12579k
    /* renamed from: a0 */
    public final String mo73368a0() {
        return this.f62146Z;
    }

    /* renamed from: b */
    public boolean mo73369b() {
        return this.f62147a;
    }

    @C12579k
    /* renamed from: b0 */
    public final String mo73370b0() {
        return this.f62157y;
    }

    @C12579k
    /* renamed from: c0 */
    public final Pair<Integer, Integer> mo73371c0() {
        return this.f62145Y;
    }

    @C12579k
    /* renamed from: d */
    public String mo73372d() {
        return this.f62149c;
    }

    @C12579k
    /* renamed from: d0 */
    public final String mo73373d0() {
        return this.f62155w;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public String mo73375e() {
        return this.f62152f;
    }

    @C12579k
    /* renamed from: e0 */
    public final String mo73376e0() {
        return this.f62131G0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOnlineDetailsHeaderModel)) {
            return false;
        }
        OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel = (OrdersOnlineDetailsHeaderModel) obj;
        return this.f62147a == ordersOnlineDetailsHeaderModel.f62147a && Intrinsics.areEqual((Object) this.f62148b, (Object) ordersOnlineDetailsHeaderModel.f62148b) && Intrinsics.areEqual((Object) this.f62149c, (Object) ordersOnlineDetailsHeaderModel.f62149c) && Intrinsics.areEqual((Object) this.f62150d, (Object) ordersOnlineDetailsHeaderModel.f62150d) && Intrinsics.areEqual((Object) this.f62151e, (Object) ordersOnlineDetailsHeaderModel.f62151e) && Intrinsics.areEqual((Object) this.f62152f, (Object) ordersOnlineDetailsHeaderModel.f62152f) && Intrinsics.areEqual((Object) this.f62153g, (Object) ordersOnlineDetailsHeaderModel.f62153g) && Intrinsics.areEqual((Object) this.f62154v, (Object) ordersOnlineDetailsHeaderModel.f62154v) && Intrinsics.areEqual((Object) this.f62155w, (Object) ordersOnlineDetailsHeaderModel.f62155w) && Intrinsics.areEqual((Object) this.f62156x, (Object) ordersOnlineDetailsHeaderModel.f62156x) && Intrinsics.areEqual((Object) this.f62157y, (Object) ordersOnlineDetailsHeaderModel.f62157y) && Intrinsics.areEqual((Object) this.f62158z, (Object) ordersOnlineDetailsHeaderModel.f62158z) && Intrinsics.areEqual((Object) this.f62144X, (Object) ordersOnlineDetailsHeaderModel.f62144X) && Intrinsics.areEqual((Object) this.f62145Y, (Object) ordersOnlineDetailsHeaderModel.f62145Y) && Intrinsics.areEqual((Object) this.f62146Z, (Object) ordersOnlineDetailsHeaderModel.f62146Z) && this.f62129E0 == ordersOnlineDetailsHeaderModel.f62129E0 && Intrinsics.areEqual((Object) this.f62130F0, (Object) ordersOnlineDetailsHeaderModel.f62130F0) && Intrinsics.areEqual((Object) this.f62131G0, (Object) ordersOnlineDetailsHeaderModel.f62131G0) && Intrinsics.areEqual((Object) this.f62132H0, (Object) ordersOnlineDetailsHeaderModel.f62132H0) && Intrinsics.areEqual((Object) this.f62133I0, (Object) ordersOnlineDetailsHeaderModel.f62133I0) && Intrinsics.areEqual((Object) this.f62134J0, (Object) ordersOnlineDetailsHeaderModel.f62134J0) && Intrinsics.areEqual((Object) this.f62135K0, (Object) ordersOnlineDetailsHeaderModel.f62135K0) && Intrinsics.areEqual((Object) this.f62136L0, (Object) ordersOnlineDetailsHeaderModel.f62136L0) && this.f62137M0 == ordersOnlineDetailsHeaderModel.f62137M0 && this.f62138N0 == ordersOnlineDetailsHeaderModel.f62138N0 && this.f62139O0 == ordersOnlineDetailsHeaderModel.f62139O0 && this.f62140P0 == ordersOnlineDetailsHeaderModel.f62140P0 && Intrinsics.areEqual((Object) this.f62141Q0, (Object) ordersOnlineDetailsHeaderModel.f62141Q0) && Intrinsics.areEqual((Object) this.f62142R0, (Object) ordersOnlineDetailsHeaderModel.f62142R0) && this.f62143S0 == ordersOnlineDetailsHeaderModel.f62143S0;
    }

    @C12579k
    /* renamed from: f */
    public OrderType mo73378f() {
        return this.f62151e;
    }

    /* renamed from: f0 */
    public final boolean mo73379f0() {
        return this.f62129E0;
    }

    @C12579k
    /* renamed from: g */
    public OrderStatus mo73380g() {
        return this.f62150d;
    }

    @C12579k
    /* renamed from: g0 */
    public final String mo73381g0() {
        return this.f62134J0;
    }

    /* renamed from: h */
    public final boolean mo73382h() {
        return this.f62147a;
    }

    /* renamed from: h0 */
    public final boolean mo73383h0() {
        return this.f62138N0;
    }

    public int hashCode() {
        boolean z = this.f62147a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Long l = this.f62148b;
        int i2 = 0;
        int hashCode = (((((((((((((((((((((((((((i + (l == null ? 0 : l.hashCode())) * 31) + this.f62149c.hashCode()) * 31) + this.f62150d.hashCode()) * 31) + this.f62151e.hashCode()) * 31) + this.f62152f.hashCode()) * 31) + this.f62153g.hashCode()) * 31) + this.f62154v.hashCode()) * 31) + this.f62155w.hashCode()) * 31) + this.f62156x.hashCode()) * 31) + this.f62157y.hashCode()) * 31) + this.f62158z.hashCode()) * 31) + this.f62144X.hashCode()) * 31) + this.f62145Y.hashCode()) * 31) + this.f62146Z.hashCode()) * 31;
        boolean z3 = this.f62129E0;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((((((((((((((hashCode + (z3 ? 1 : 0)) * 31) + this.f62130F0.hashCode()) * 31) + this.f62131G0.hashCode()) * 31) + this.f62132H0.hashCode()) * 31) + this.f62133I0.hashCode()) * 31) + this.f62134J0.hashCode()) * 31) + this.f62135K0.hashCode()) * 31) + this.f62136L0.hashCode()) * 31;
        boolean z4 = this.f62137M0;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f62138N0;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f62139O0;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f62140P0;
        if (z7) {
            z7 = true;
        }
        int hashCode3 = (((i5 + (z7 ? 1 : 0)) * 31) + this.f62141Q0.hashCode()) * 31;
        NotificationModel notificationModel = this.f62142R0;
        if (notificationModel != null) {
            i2 = notificationModel.hashCode();
        }
        int i6 = (hashCode3 + i2) * 31;
        boolean z8 = this.f62143S0;
        if (!z8) {
            z2 = z8;
        }
        return i6 + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final String mo73385i() {
        return this.f62156x;
    }

    /* renamed from: i0 */
    public final boolean mo73386i0() {
        return this.f62139O0;
    }

    @C12579k
    /* renamed from: j */
    public final String mo73387j() {
        return this.f62157y;
    }

    /* renamed from: j0 */
    public final boolean mo73388j0() {
        return this.f62143S0;
    }

    @C12579k
    /* renamed from: k */
    public final String mo73389k() {
        return this.f62158z;
    }

    /* renamed from: k0 */
    public final boolean mo73390k0() {
        return this.f62137M0;
    }

    @C12579k
    /* renamed from: l */
    public final String mo73391l() {
        return this.f62144X;
    }

    @C12579k
    /* renamed from: m */
    public final Pair<Integer, Integer> mo73392m() {
        return this.f62145Y;
    }

    @C12579k
    /* renamed from: n */
    public final String mo73393n() {
        return this.f62146Z;
    }

    /* renamed from: o */
    public final boolean mo73394o() {
        return this.f62129E0;
    }

    @C12579k
    /* renamed from: p */
    public final String mo73395p() {
        return this.f62130F0;
    }

    @C12579k
    /* renamed from: q */
    public final String mo73396q() {
        return this.f62131G0;
    }

    @C12579k
    /* renamed from: r */
    public final String mo73397r() {
        return this.f62132H0;
    }

    @C12580l
    /* renamed from: s */
    public final Long mo73398s() {
        return this.f62148b;
    }

    @C12579k
    /* renamed from: t */
    public final String mo73399t() {
        return this.f62133I0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f62147a;
        Long l = this.f62148b;
        String str = this.f62149c;
        OrderStatus orderStatus = this.f62150d;
        OrderType orderType = this.f62151e;
        String str2 = this.f62152f;
        String str3 = this.f62153g;
        String str4 = this.f62154v;
        String str5 = this.f62155w;
        String str6 = this.f62156x;
        String str7 = this.f62157y;
        String str8 = this.f62158z;
        String str9 = this.f62144X;
        Pair<Integer, Integer> pair = this.f62145Y;
        String str10 = this.f62146Z;
        boolean z2 = this.f62129E0;
        String str11 = this.f62130F0;
        String str12 = this.f62131G0;
        String str13 = this.f62132H0;
        String str14 = this.f62133I0;
        String str15 = this.f62134J0;
        String str16 = this.f62135K0;
        List<OrdersOnlineDetailsAllowanceModel> list = this.f62136L0;
        boolean z3 = this.f62137M0;
        boolean z4 = this.f62138N0;
        boolean z5 = this.f62139O0;
        boolean z6 = this.f62140P0;
        String str17 = this.f62141Q0;
        NotificationModel notificationModel = this.f62142R0;
        boolean z7 = this.f62143S0;
        return "OrdersOnlineDetailsHeaderModel(additionalOrderEligible=" + z + ", additionalOrderId=" + l + ", orderCreationDateTime=" + str + ", orderStatus=" + orderStatus + ", orderType=" + orderType + ", orderPaymentDate=" + str2 + ", orderId=" + str3 + ", orderAmount=" + str4 + ", orderStoreName=" + str5 + ", orderAddress=" + str6 + ", orderPostalCode=" + str7 + ", orderBeginSlot=" + str8 + ", orderEndSlot=" + str9 + ", orderStatusProgress=" + pair + ", orderPickingEligibility=" + str10 + ", showStatusProgress=" + z2 + ", downloadUrl=" + str11 + ", refundUrl=" + str12 + ", cancelUrl=" + str13 + ", facilityServiceId=" + str14 + ", trackingUrl=" + str15 + ", invoiceUrl=" + str16 + ", allowanceChargeList=" + list + ", isShiftSlotAvailable=" + z3 + ", isCancelOrderAvailable=" + z4 + ", isChangeDeliveryAvailable=" + z5 + ", canBeReturned=" + z6 + ", eCardInvoiceUrl=" + str17 + ", notificationModel=" + notificationModel + ", isInstorePayment=" + z7 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo73401u() {
        return this.f62134J0;
    }

    @C12579k
    /* renamed from: v */
    public final String mo73402v() {
        return this.f62135K0;
    }

    @C12579k
    /* renamed from: w */
    public final List<OrdersOnlineDetailsAllowanceModel> mo73403w() {
        return this.f62136L0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f62147a ? 1 : 0);
        Long l = this.f62148b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f62149c);
        parcel.writeParcelable(this.f62150d, i);
        parcel.writeParcelable(this.f62151e, i);
        parcel.writeString(this.f62152f);
        parcel.writeString(this.f62153g);
        parcel.writeString(this.f62154v);
        parcel.writeString(this.f62155w);
        parcel.writeString(this.f62156x);
        parcel.writeString(this.f62157y);
        parcel.writeString(this.f62158z);
        parcel.writeString(this.f62144X);
        parcel.writeSerializable(this.f62145Y);
        parcel.writeString(this.f62146Z);
        parcel.writeInt(this.f62129E0 ? 1 : 0);
        parcel.writeString(this.f62130F0);
        parcel.writeString(this.f62131G0);
        parcel.writeString(this.f62132H0);
        parcel.writeString(this.f62133I0);
        parcel.writeString(this.f62134J0);
        parcel.writeString(this.f62135K0);
        List<OrdersOnlineDetailsAllowanceModel> list = this.f62136L0;
        parcel.writeInt(list.size());
        for (OrdersOnlineDetailsAllowanceModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f62137M0 ? 1 : 0);
        parcel.writeInt(this.f62138N0 ? 1 : 0);
        parcel.writeInt(this.f62139O0 ? 1 : 0);
        parcel.writeInt(this.f62140P0 ? 1 : 0);
        parcel.writeString(this.f62141Q0);
        NotificationModel notificationModel = this.f62142R0;
        if (notificationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f62143S0 ? 1 : 0);
    }

    /* renamed from: x */
    public final boolean mo73405x() {
        return this.f62137M0;
    }

    /* renamed from: y */
    public final boolean mo73406y() {
        return this.f62138N0;
    }

    /* renamed from: z */
    public final boolean mo73407z() {
        return this.f62139O0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrdersOnlineDetailsHeaderModel(boolean z, Long l, String str, OrderStatus orderStatus, OrderType orderType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, String str10, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, List list, boolean z3, boolean z4, boolean z5, boolean z6, String str17, NotificationModel notificationModel, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : l, str, orderStatus, orderType, str2, str3, str4, str5, str6, str7, str8, str9, pair, str10, z2, str11, str12, str13, str14, str15, str16, list, (i & 8388608) != 0 ? false : z3, (i & 16777216) != 0 ? false : z4, (i & C9647e0.f26435a) != 0 ? false : z5, (i & C8698y1.f23302n) != 0 ? false : z6, (i & C8698y1.f23301m) != 0 ? "" : str17, (i & 268435456) != 0 ? null : notificationModel, (i & 536870912) != 0 ? false : z7);
    }
}
