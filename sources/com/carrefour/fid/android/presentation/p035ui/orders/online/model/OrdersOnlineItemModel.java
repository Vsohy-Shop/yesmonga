package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import android.os.Parcel;
import android.os.Parcelable;
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

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\b¢\u0006\u0004\bQ\u0010RJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u000fHÖ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\u0019\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b4\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u001d\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b?\u0010;R\u0017\u0010\u001f\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010;R\u0017\u0010!\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010JR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\bL\u0010;R\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bK\u0010;R\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bM\u0010;R\u0017\u0010%\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bO\u0010;R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bI\u0010;¨\u0006S"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineItemModel;", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/k;", "Landroid/os/Parcelable;", "", "c", "", "m", "()Ljava/lang/Long;", "", "n", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "o", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "p", "q", "", "r", "s", "", "t", "h", "i", "j", "k", "l", "additionalOrderEligible", "additionalOrderId", "orderCreationDateTime", "orderType", "orderStatus", "orderPaymentDate", "viewType", "orderId", "orderAmount", "slotId", "orderBeginSlot", "orderEndSlot", "slotCutOff", "webRedirectionUrl", "u", "(ZLjava/lang/Long;Ljava/lang/String;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;Lcom/carrefour/fid/android/core/constants/OrderStatus;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineItemModel;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "Z", "b", "()Z", "Ljava/lang/Long;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "f", "()Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "e", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "g", "()Lcom/carrefour/fid/android/core/constants/OrderStatus;", "I", "C", "()I", "v", "z", "w", "D", "()D", "x", "B", "y", "X", "A", "Y", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;Lcom/carrefour/fid/android/core/constants/OrderStatus;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel */
public final class OrdersOnlineItemModel implements C25243k, Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrdersOnlineItemModel> CREATOR = new C25229a();

    /* renamed from: Z */
    public static final int f62181Z = OrderType.f70277d;
    @C12579k

    /* renamed from: X */
    public final String f62182X;
    @C12579k

    /* renamed from: Y */
    public final String f62183Y;

    /* renamed from: a */
    public final boolean f62184a;
    @C12580l

    /* renamed from: b */
    public final Long f62185b;
    @C12579k

    /* renamed from: c */
    public final String f62186c;
    @C12579k

    /* renamed from: d */
    public final OrderType f62187d;
    @C12579k

    /* renamed from: e */
    public final OrderStatus f62188e;
    @C12579k

    /* renamed from: f */
    public final String f62189f;

    /* renamed from: g */
    public final int f62190g;
    @C12579k

    /* renamed from: v */
    public final String f62191v;

    /* renamed from: w */
    public final double f62192w;
    @C12579k

    /* renamed from: x */
    public final String f62193x;
    @C12579k

    /* renamed from: y */
    public final String f62194y;
    @C12579k

    /* renamed from: z */
    public final String f62195z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel$a */
    public static final class C25229a implements Parcelable.Creator<OrdersOnlineItemModel> {
        @C12579k
        /* renamed from: a */
        public final OrdersOnlineItemModel createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            Class<OrdersOnlineItemModel> cls = OrdersOnlineItemModel.class;
            return new OrdersOnlineItemModel(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (OrderType) parcel2.readParcelable(cls.getClassLoader()), (OrderStatus) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineItemModel[] newArray(int i) {
            return new OrdersOnlineItemModel[i];
        }
    }

    public OrdersOnlineItemModel() {
        this(false, (Long) null, (String) null, (OrderType) null, (OrderStatus) null, (String) null, 0, (String) null, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* renamed from: v */
    public static /* synthetic */ OrdersOnlineItemModel m109133v(OrdersOnlineItemModel ordersOnlineItemModel, boolean z, Long l, String str, OrderType orderType, OrderStatus orderStatus, String str2, int i, String str3, double d, String str4, String str5, String str6, String str7, String str8, int i2, Object obj) {
        OrdersOnlineItemModel ordersOnlineItemModel2 = ordersOnlineItemModel;
        int i3 = i2;
        return ordersOnlineItemModel.mo73490u((i3 & 1) != 0 ? ordersOnlineItemModel2.f62184a : z, (i3 & 2) != 0 ? ordersOnlineItemModel2.f62185b : l, (i3 & 4) != 0 ? ordersOnlineItemModel2.f62186c : str, (i3 & 8) != 0 ? ordersOnlineItemModel2.f62187d : orderType, (i3 & 16) != 0 ? ordersOnlineItemModel2.f62188e : orderStatus, (i3 & 32) != 0 ? ordersOnlineItemModel2.f62189f : str2, (i3 & 64) != 0 ? ordersOnlineItemModel2.f62190g : i, (i3 & 128) != 0 ? ordersOnlineItemModel2.f62191v : str3, (i3 & 256) != 0 ? ordersOnlineItemModel2.f62192w : d, (i3 & 512) != 0 ? ordersOnlineItemModel2.f62193x : str4, (i3 & 1024) != 0 ? ordersOnlineItemModel2.f62194y : str5, (i3 & 2048) != 0 ? ordersOnlineItemModel2.f62195z : str6, (i3 & 4096) != 0 ? ordersOnlineItemModel2.f62182X : str7, (i3 & 8192) != 0 ? ordersOnlineItemModel2.f62183Y : str8);
    }

    @C12579k
    /* renamed from: A */
    public final String mo73468A() {
        return this.f62182X;
    }

    @C12579k
    /* renamed from: B */
    public final String mo73469B() {
        return this.f62193x;
    }

    /* renamed from: C */
    public final int mo73470C() {
        return this.f62190g;
    }

    @C12579k
    /* renamed from: D */
    public final String mo73471D() {
        return this.f62183Y;
    }

    @C12580l
    /* renamed from: a */
    public Long mo73367a() {
        return this.f62185b;
    }

    /* renamed from: b */
    public boolean mo73369b() {
        return this.f62184a;
    }

    /* renamed from: c */
    public final boolean mo73472c() {
        return this.f62184a;
    }

    @C12579k
    /* renamed from: d */
    public String mo73372d() {
        return this.f62186c;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public String mo73375e() {
        return this.f62189f;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOnlineItemModel)) {
            return false;
        }
        OrdersOnlineItemModel ordersOnlineItemModel = (OrdersOnlineItemModel) obj;
        return this.f62184a == ordersOnlineItemModel.f62184a && Intrinsics.areEqual((Object) this.f62185b, (Object) ordersOnlineItemModel.f62185b) && Intrinsics.areEqual((Object) this.f62186c, (Object) ordersOnlineItemModel.f62186c) && Intrinsics.areEqual((Object) this.f62187d, (Object) ordersOnlineItemModel.f62187d) && Intrinsics.areEqual((Object) this.f62188e, (Object) ordersOnlineItemModel.f62188e) && Intrinsics.areEqual((Object) this.f62189f, (Object) ordersOnlineItemModel.f62189f) && this.f62190g == ordersOnlineItemModel.f62190g && Intrinsics.areEqual((Object) this.f62191v, (Object) ordersOnlineItemModel.f62191v) && Double.compare(this.f62192w, ordersOnlineItemModel.f62192w) == 0 && Intrinsics.areEqual((Object) this.f62193x, (Object) ordersOnlineItemModel.f62193x) && Intrinsics.areEqual((Object) this.f62194y, (Object) ordersOnlineItemModel.f62194y) && Intrinsics.areEqual((Object) this.f62195z, (Object) ordersOnlineItemModel.f62195z) && Intrinsics.areEqual((Object) this.f62182X, (Object) ordersOnlineItemModel.f62182X) && Intrinsics.areEqual((Object) this.f62183Y, (Object) ordersOnlineItemModel.f62183Y);
    }

    @C12579k
    /* renamed from: f */
    public OrderType mo73378f() {
        return this.f62187d;
    }

    @C12579k
    /* renamed from: g */
    public OrderStatus mo73380g() {
        return this.f62188e;
    }

    @C12579k
    /* renamed from: h */
    public final String mo73475h() {
        return this.f62193x;
    }

    public int hashCode() {
        boolean z = this.f62184a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Long l = this.f62185b;
        return ((((((((((((((((((((((((i + (l == null ? 0 : l.hashCode())) * 31) + this.f62186c.hashCode()) * 31) + this.f62187d.hashCode()) * 31) + this.f62188e.hashCode()) * 31) + this.f62189f.hashCode()) * 31) + Integer.hashCode(this.f62190g)) * 31) + this.f62191v.hashCode()) * 31) + Double.hashCode(this.f62192w)) * 31) + this.f62193x.hashCode()) * 31) + this.f62194y.hashCode()) * 31) + this.f62195z.hashCode()) * 31) + this.f62182X.hashCode()) * 31) + this.f62183Y.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo73477i() {
        return this.f62194y;
    }

    @C12579k
    /* renamed from: j */
    public final String mo73478j() {
        return this.f62195z;
    }

    @C12579k
    /* renamed from: k */
    public final String mo73479k() {
        return this.f62182X;
    }

    @C12579k
    /* renamed from: l */
    public final String mo73480l() {
        return this.f62183Y;
    }

    @C12580l
    /* renamed from: m */
    public final Long mo73481m() {
        return this.f62185b;
    }

    @C12579k
    /* renamed from: n */
    public final String mo73482n() {
        return this.f62186c;
    }

    @C12579k
    /* renamed from: o */
    public final OrderType mo73483o() {
        return this.f62187d;
    }

    @C12579k
    /* renamed from: p */
    public final OrderStatus mo73484p() {
        return this.f62188e;
    }

    @C12579k
    /* renamed from: q */
    public final String mo73485q() {
        return this.f62189f;
    }

    /* renamed from: r */
    public final int mo73486r() {
        return this.f62190g;
    }

    @C12579k
    /* renamed from: s */
    public final String mo73487s() {
        return this.f62191v;
    }

    /* renamed from: t */
    public final double mo73488t() {
        return this.f62192w;
    }

    @C12579k
    public String toString() {
        boolean z = this.f62184a;
        Long l = this.f62185b;
        String str = this.f62186c;
        OrderType orderType = this.f62187d;
        OrderStatus orderStatus = this.f62188e;
        String str2 = this.f62189f;
        int i = this.f62190g;
        String str3 = this.f62191v;
        double d = this.f62192w;
        String str4 = this.f62193x;
        String str5 = this.f62194y;
        String str6 = this.f62195z;
        String str7 = this.f62182X;
        String str8 = this.f62183Y;
        return "OrdersOnlineItemModel(additionalOrderEligible=" + z + ", additionalOrderId=" + l + ", orderCreationDateTime=" + str + ", orderType=" + orderType + ", orderStatus=" + orderStatus + ", orderPaymentDate=" + str2 + ", viewType=" + i + ", orderId=" + str3 + ", orderAmount=" + d + ", slotId=" + str4 + ", orderBeginSlot=" + str5 + ", orderEndSlot=" + str6 + ", slotCutOff=" + str7 + ", webRedirectionUrl=" + str8 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final OrdersOnlineItemModel mo73490u(boolean z, @C12580l Long l, @C12579k String str, @C12579k OrderType orderType, @C12579k OrderStatus orderStatus, @C12579k String str2, int i, @C12579k String str3, double d, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8) {
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, "orderCreationDateTime");
        OrderType orderType2 = orderType;
        Intrinsics.checkNotNullParameter(orderType2, "orderType");
        OrderStatus orderStatus2 = orderStatus;
        Intrinsics.checkNotNullParameter(orderStatus2, "orderStatus");
        String str10 = str2;
        Intrinsics.checkNotNullParameter(str10, "orderPaymentDate");
        String str11 = str3;
        Intrinsics.checkNotNullParameter(str11, "orderId");
        String str12 = str4;
        Intrinsics.checkNotNullParameter(str12, C28547h2.f69319g);
        String str13 = str5;
        Intrinsics.checkNotNullParameter(str13, "orderBeginSlot");
        String str14 = str6;
        Intrinsics.checkNotNullParameter(str14, "orderEndSlot");
        String str15 = str7;
        Intrinsics.checkNotNullParameter(str15, "slotCutOff");
        Intrinsics.checkNotNullParameter(str8, "webRedirectionUrl");
        return new OrdersOnlineItemModel(z, l, str9, orderType2, orderStatus2, str10, i, str11, d, str12, str13, str14, str15, str8);
    }

    /* renamed from: w */
    public final double mo73491w() {
        return this.f62192w;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f62184a ? 1 : 0);
        Long l = this.f62185b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f62186c);
        parcel.writeParcelable(this.f62187d, i);
        parcel.writeParcelable(this.f62188e, i);
        parcel.writeString(this.f62189f);
        parcel.writeInt(this.f62190g);
        parcel.writeString(this.f62191v);
        parcel.writeDouble(this.f62192w);
        parcel.writeString(this.f62193x);
        parcel.writeString(this.f62194y);
        parcel.writeString(this.f62195z);
        parcel.writeString(this.f62182X);
        parcel.writeString(this.f62183Y);
    }

    @C12579k
    /* renamed from: x */
    public final String mo73493x() {
        return this.f62194y;
    }

    @C12579k
    /* renamed from: y */
    public final String mo73494y() {
        return this.f62195z;
    }

    @C12579k
    /* renamed from: z */
    public final String mo73495z() {
        return this.f62191v;
    }

    public OrdersOnlineItemModel(boolean z, @C12580l Long l, @C12579k String str, @C12579k OrderType orderType, @C12579k OrderStatus orderStatus, @C12579k String str2, int i, @C12579k String str3, double d, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8) {
        OrderType orderType2 = orderType;
        OrderStatus orderStatus2 = orderStatus;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        Intrinsics.checkNotNullParameter(str, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(orderType2, "orderType");
        Intrinsics.checkNotNullParameter(orderStatus2, "orderStatus");
        Intrinsics.checkNotNullParameter(str9, "orderPaymentDate");
        Intrinsics.checkNotNullParameter(str10, "orderId");
        Intrinsics.checkNotNullParameter(str11, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str12, "orderBeginSlot");
        Intrinsics.checkNotNullParameter(str13, "orderEndSlot");
        Intrinsics.checkNotNullParameter(str14, "slotCutOff");
        Intrinsics.checkNotNullParameter(str15, "webRedirectionUrl");
        this.f62184a = z;
        this.f62185b = l;
        this.f62186c = str;
        this.f62187d = orderType2;
        this.f62188e = orderStatus2;
        this.f62189f = str9;
        this.f62190g = i;
        this.f62191v = str10;
        this.f62192w = d;
        this.f62193x = str11;
        this.f62194y = str12;
        this.f62195z = str13;
        this.f62182X = str14;
        this.f62183Y = str15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOnlineItemModel(boolean r17, java.lang.Long r18, java.lang.String r19, com.carrefour.fid.android.shared.domain.models.order.OrderType r20, com.carrefour.fid.android.core.constants.OrderStatus r21, java.lang.String r22, int r23, java.lang.String r24, double r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r17
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0012
        L_0x0010:
            r2 = r18
        L_0x0012:
            r3 = r0 & 4
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x001a
            r3 = r4
            goto L_0x001c
        L_0x001a:
            r3 = r19
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0023
            com.carrefour.fid.android.shared.domain.models.order.OrderType$Unknown r5 = com.carrefour.fid.android.shared.domain.models.order.OrderType.Unknown.f70294e
            goto L_0x0025
        L_0x0023:
            r5 = r20
        L_0x0025:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002c
            com.carrefour.fid.android.core.constants.OrderStatus$Unknown r6 = com.carrefour.fid.android.core.constants.OrderStatus.Unknown.f89266e
            goto L_0x002e
        L_0x002c:
            r6 = r21
        L_0x002e:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0038
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x003a
        L_0x0038:
            r7 = r22
        L_0x003a:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0040
            r8 = -1
            goto L_0x0042
        L_0x0040:
            r8 = r23
        L_0x0042:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0048
            r9 = r4
            goto L_0x004a
        L_0x0048:
            r9 = r24
        L_0x004a:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0051
            r10 = 0
            goto L_0x0053
        L_0x0051:
            r10 = r25
        L_0x0053:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0059
            r12 = r4
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r4
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r4
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0071
            r15 = r4
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r4 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel.<init>(boolean, java.lang.Long, java.lang.String, com.carrefour.fid.android.shared.domain.models.order.OrderType, com.carrefour.fid.android.core.constants.OrderStatus, java.lang.String, int, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
