package com.carrefour.fid.android.presentation.viewmodels.order.refont.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.OrderOnlineItemModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020\u0018¢\u0006\u0004\bT\u0010UJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J¤\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\u0019\u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020+HÖ\u0001R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bD\u0010CR\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010CR\u0017\u0010\"\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bH\u0010CR\u0017\u0010#\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\bK\u0010CR\u0017\u0010$\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bE\u0010CR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b?\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010&\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010CR\u0017\u0010'\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bJ\u0010S¨\u0006V"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/model/OrdersOnlineItemModel;", "Landroid/os/Parcelable;", "", "a", "", "g", "()Ljava/lang/Long;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "h", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "i", "", "j", "k", "", "l", "m", "n", "b", "c", "", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/SelfCareType;", "d", "e", "Lcom/carrefour/fid/android/presentation/ui/orders/online/view/OrderOnlineItemModel;", "f", "additionalOrderEligible", "additionalOrderId", "orderType", "orderStatus", "orderPaymentDate", "orderId", "orderAmount", "orderBeginSlot", "orderEndSlot", "slotCutOff", "webRedirectionUrl", "selfcareTypes", "facilityServiceId", "orderOnlineItemModel", "o", "(ZLjava/lang/Long;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;Lcom/carrefour/fid/android/core/constants/OrderStatus;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/presentation/ui/orders/online/view/OrderOnlineItemModel;)Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/model/OrdersOnlineItemModel;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "q", "()Z", "Ljava/lang/Long;", "r", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "A", "()Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "z", "()Lcom/carrefour/fid/android/core/constants/OrderStatus;", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "w", "D", "t", "()D", "v", "u", "x", "C", "Ljava/util/List;", "B", "()Ljava/util/List;", "X", "s", "Y", "Lcom/carrefour/fid/android/presentation/ui/orders/online/view/OrderOnlineItemModel;", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/view/OrderOnlineItemModel;", "<init>", "(ZLjava/lang/Long;Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;Lcom/carrefour/fid/android/core/constants/OrderStatus;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/presentation/ui/orders/online/view/OrderOnlineItemModel;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrdersOnlineItemModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrdersOnlineItemModel> CREATOR = new C27076a();

    /* renamed from: Z */
    public static final int f65804Z = 8;
    @C12579k

    /* renamed from: X */
    public final String f65805X;
    @C12579k

    /* renamed from: Y */
    public final OrderOnlineItemModel f65806Y;

    /* renamed from: a */
    public final boolean f65807a;
    @C12580l

    /* renamed from: b */
    public final Long f65808b;
    @C12579k

    /* renamed from: c */
    public final OrderType f65809c;
    @C12579k

    /* renamed from: d */
    public final OrderStatus f65810d;
    @C12579k

    /* renamed from: e */
    public final String f65811e;
    @C12579k

    /* renamed from: f */
    public final String f65812f;

    /* renamed from: g */
    public final double f65813g;
    @C12579k

    /* renamed from: v */
    public final String f65814v;
    @C12579k

    /* renamed from: w */
    public final String f65815w;
    @C12579k

    /* renamed from: x */
    public final String f65816x;
    @C12579k

    /* renamed from: y */
    public final String f65817y;
    @C12579k

    /* renamed from: z */
    public final List<SelfCareType> f65818z;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel$a */
    public static final class C27076a implements Parcelable.Creator<OrdersOnlineItemModel> {
        @C12579k
        /* renamed from: a */
        public final OrdersOnlineItemModel createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            int i = 0;
            boolean z = parcel.readInt() != 0;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Class<OrdersOnlineItemModel> cls = OrdersOnlineItemModel.class;
            OrderType orderType = (OrderType) parcel2.readParcelable(cls.getClassLoader());
            OrderStatus orderStatus = (OrderStatus) parcel2.readParcelable(cls.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                arrayList.add(SelfCareType.valueOf(parcel.readString()));
                i++;
                readInt = readInt;
            }
            return new OrdersOnlineItemModel(z, valueOf, orderType, orderStatus, readString, readString2, readDouble, readString3, readString4, readString5, readString6, arrayList, parcel.readString(), OrderOnlineItemModel.CREATOR.createFromParcel(parcel2));
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineItemModel[] newArray(int i) {
            return new OrdersOnlineItemModel[i];
        }
    }

    public OrdersOnlineItemModel(boolean z, @C12580l Long l, @C12579k OrderType orderType, @C12579k OrderStatus orderStatus, @C12579k String str, @C12579k String str2, double d, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k List<? extends SelfCareType> list, @C12579k String str7, @C12579k OrderOnlineItemModel orderOnlineItemModel) {
        OrderType orderType2 = orderType;
        OrderStatus orderStatus2 = orderStatus;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        List<? extends SelfCareType> list2 = list;
        String str14 = str7;
        OrderOnlineItemModel orderOnlineItemModel2 = orderOnlineItemModel;
        Intrinsics.checkNotNullParameter(orderType2, "orderType");
        Intrinsics.checkNotNullParameter(orderStatus2, "orderStatus");
        Intrinsics.checkNotNullParameter(str8, "orderPaymentDate");
        Intrinsics.checkNotNullParameter(str9, "orderId");
        Intrinsics.checkNotNullParameter(str10, "orderBeginSlot");
        Intrinsics.checkNotNullParameter(str11, "orderEndSlot");
        Intrinsics.checkNotNullParameter(str12, "slotCutOff");
        Intrinsics.checkNotNullParameter(str13, "webRedirectionUrl");
        Intrinsics.checkNotNullParameter(list2, "selfcareTypes");
        Intrinsics.checkNotNullParameter(str14, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(orderOnlineItemModel2, "orderOnlineItemModel");
        this.f65807a = z;
        this.f65808b = l;
        this.f65809c = orderType2;
        this.f65810d = orderStatus2;
        this.f65811e = str8;
        this.f65812f = str9;
        this.f65813g = d;
        this.f65814v = str10;
        this.f65815w = str11;
        this.f65816x = str12;
        this.f65817y = str13;
        this.f65818z = list2;
        this.f65805X = str14;
        this.f65806Y = orderOnlineItemModel2;
    }

    /* renamed from: p */
    public static /* synthetic */ OrdersOnlineItemModel m114428p(OrdersOnlineItemModel ordersOnlineItemModel, boolean z, Long l, OrderType orderType, OrderStatus orderStatus, String str, String str2, double d, String str3, String str4, String str5, String str6, List list, String str7, OrderOnlineItemModel orderOnlineItemModel, int i, Object obj) {
        OrdersOnlineItemModel ordersOnlineItemModel2 = ordersOnlineItemModel;
        int i2 = i;
        return ordersOnlineItemModel.mo78642o((i2 & 1) != 0 ? ordersOnlineItemModel2.f65807a : z, (i2 & 2) != 0 ? ordersOnlineItemModel2.f65808b : l, (i2 & 4) != 0 ? ordersOnlineItemModel2.f65809c : orderType, (i2 & 8) != 0 ? ordersOnlineItemModel2.f65810d : orderStatus, (i2 & 16) != 0 ? ordersOnlineItemModel2.f65811e : str, (i2 & 32) != 0 ? ordersOnlineItemModel2.f65812f : str2, (i2 & 64) != 0 ? ordersOnlineItemModel2.f65813g : d, (i2 & 128) != 0 ? ordersOnlineItemModel2.f65814v : str3, (i2 & 256) != 0 ? ordersOnlineItemModel2.f65815w : str4, (i2 & 512) != 0 ? ordersOnlineItemModel2.f65816x : str5, (i2 & 1024) != 0 ? ordersOnlineItemModel2.f65817y : str6, (i2 & 2048) != 0 ? ordersOnlineItemModel2.f65818z : list, (i2 & 4096) != 0 ? ordersOnlineItemModel2.f65805X : str7, (i2 & 8192) != 0 ? ordersOnlineItemModel2.f65806Y : orderOnlineItemModel);
    }

    @C12579k
    /* renamed from: A */
    public final OrderType mo78621A() {
        return this.f65809c;
    }

    @C12579k
    /* renamed from: B */
    public final List<SelfCareType> mo78622B() {
        return this.f65818z;
    }

    @C12579k
    /* renamed from: C */
    public final String mo78623C() {
        return this.f65816x;
    }

    @C12579k
    /* renamed from: D */
    public final String mo78624D() {
        return this.f65817y;
    }

    /* renamed from: a */
    public final boolean mo78625a() {
        return this.f65807a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo78626b() {
        return this.f65816x;
    }

    @C12579k
    /* renamed from: c */
    public final String mo78627c() {
        return this.f65817y;
    }

    @C12579k
    /* renamed from: d */
    public final List<SelfCareType> mo78628d() {
        return this.f65818z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo78630e() {
        return this.f65805X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOnlineItemModel)) {
            return false;
        }
        OrdersOnlineItemModel ordersOnlineItemModel = (OrdersOnlineItemModel) obj;
        return this.f65807a == ordersOnlineItemModel.f65807a && Intrinsics.areEqual((Object) this.f65808b, (Object) ordersOnlineItemModel.f65808b) && Intrinsics.areEqual((Object) this.f65809c, (Object) ordersOnlineItemModel.f65809c) && Intrinsics.areEqual((Object) this.f65810d, (Object) ordersOnlineItemModel.f65810d) && Intrinsics.areEqual((Object) this.f65811e, (Object) ordersOnlineItemModel.f65811e) && Intrinsics.areEqual((Object) this.f65812f, (Object) ordersOnlineItemModel.f65812f) && Double.compare(this.f65813g, ordersOnlineItemModel.f65813g) == 0 && Intrinsics.areEqual((Object) this.f65814v, (Object) ordersOnlineItemModel.f65814v) && Intrinsics.areEqual((Object) this.f65815w, (Object) ordersOnlineItemModel.f65815w) && Intrinsics.areEqual((Object) this.f65816x, (Object) ordersOnlineItemModel.f65816x) && Intrinsics.areEqual((Object) this.f65817y, (Object) ordersOnlineItemModel.f65817y) && Intrinsics.areEqual((Object) this.f65818z, (Object) ordersOnlineItemModel.f65818z) && Intrinsics.areEqual((Object) this.f65805X, (Object) ordersOnlineItemModel.f65805X) && Intrinsics.areEqual((Object) this.f65806Y, (Object) ordersOnlineItemModel.f65806Y);
    }

    @C12579k
    /* renamed from: f */
    public final OrderOnlineItemModel mo78632f() {
        return this.f65806Y;
    }

    @C12580l
    /* renamed from: g */
    public final Long mo78633g() {
        return this.f65808b;
    }

    @C12579k
    /* renamed from: h */
    public final OrderType mo78634h() {
        return this.f65809c;
    }

    public int hashCode() {
        boolean z = this.f65807a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Long l = this.f65808b;
        return ((((((((((((((((((((((((i + (l == null ? 0 : l.hashCode())) * 31) + this.f65809c.hashCode()) * 31) + this.f65810d.hashCode()) * 31) + this.f65811e.hashCode()) * 31) + this.f65812f.hashCode()) * 31) + Double.hashCode(this.f65813g)) * 31) + this.f65814v.hashCode()) * 31) + this.f65815w.hashCode()) * 31) + this.f65816x.hashCode()) * 31) + this.f65817y.hashCode()) * 31) + this.f65818z.hashCode()) * 31) + this.f65805X.hashCode()) * 31) + this.f65806Y.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final OrderStatus mo78636i() {
        return this.f65810d;
    }

    @C12579k
    /* renamed from: j */
    public final String mo78637j() {
        return this.f65811e;
    }

    @C12579k
    /* renamed from: k */
    public final String mo78638k() {
        return this.f65812f;
    }

    /* renamed from: l */
    public final double mo78639l() {
        return this.f65813g;
    }

    @C12579k
    /* renamed from: m */
    public final String mo78640m() {
        return this.f65814v;
    }

    @C12579k
    /* renamed from: n */
    public final String mo78641n() {
        return this.f65815w;
    }

    @C12579k
    /* renamed from: o */
    public final OrdersOnlineItemModel mo78642o(boolean z, @C12580l Long l, @C12579k OrderType orderType, @C12579k OrderStatus orderStatus, @C12579k String str, @C12579k String str2, double d, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k List<? extends SelfCareType> list, @C12579k String str7, @C12579k OrderOnlineItemModel orderOnlineItemModel) {
        OrderType orderType2 = orderType;
        Intrinsics.checkNotNullParameter(orderType2, "orderType");
        OrderStatus orderStatus2 = orderStatus;
        Intrinsics.checkNotNullParameter(orderStatus2, "orderStatus");
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "orderPaymentDate");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "orderId");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "orderBeginSlot");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "orderEndSlot");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "slotCutOff");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "webRedirectionUrl");
        List<? extends SelfCareType> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "selfcareTypes");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(orderOnlineItemModel, "orderOnlineItemModel");
        return new OrdersOnlineItemModel(z, l, orderType2, orderStatus2, str8, str9, d, str10, str11, str12, str13, list2, str14, orderOnlineItemModel);
    }

    /* renamed from: q */
    public final boolean mo78643q() {
        return this.f65807a;
    }

    @C12580l
    /* renamed from: r */
    public final Long mo78644r() {
        return this.f65808b;
    }

    @C12579k
    /* renamed from: s */
    public final String mo78645s() {
        return this.f65805X;
    }

    /* renamed from: t */
    public final double mo78646t() {
        return this.f65813g;
    }

    @C12579k
    public String toString() {
        boolean z = this.f65807a;
        Long l = this.f65808b;
        OrderType orderType = this.f65809c;
        OrderStatus orderStatus = this.f65810d;
        String str = this.f65811e;
        String str2 = this.f65812f;
        double d = this.f65813g;
        String str3 = this.f65814v;
        String str4 = this.f65815w;
        String str5 = this.f65816x;
        String str6 = this.f65817y;
        List<SelfCareType> list = this.f65818z;
        String str7 = this.f65805X;
        OrderOnlineItemModel orderOnlineItemModel = this.f65806Y;
        return "OrdersOnlineItemModel(additionalOrderEligible=" + z + ", additionalOrderId=" + l + ", orderType=" + orderType + ", orderStatus=" + orderStatus + ", orderPaymentDate=" + str + ", orderId=" + str2 + ", orderAmount=" + d + ", orderBeginSlot=" + str3 + ", orderEndSlot=" + str4 + ", slotCutOff=" + str5 + ", webRedirectionUrl=" + str6 + ", selfcareTypes=" + list + ", facilityServiceId=" + str7 + ", orderOnlineItemModel=" + orderOnlineItemModel + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo78648u() {
        return this.f65814v;
    }

    @C12579k
    /* renamed from: v */
    public final String mo78649v() {
        return this.f65815w;
    }

    @C12579k
    /* renamed from: w */
    public final String mo78650w() {
        return this.f65812f;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f65807a ? 1 : 0);
        Long l = this.f65808b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.f65809c, i);
        parcel.writeParcelable(this.f65810d, i);
        parcel.writeString(this.f65811e);
        parcel.writeString(this.f65812f);
        parcel.writeDouble(this.f65813g);
        parcel.writeString(this.f65814v);
        parcel.writeString(this.f65815w);
        parcel.writeString(this.f65816x);
        parcel.writeString(this.f65817y);
        List<SelfCareType> list = this.f65818z;
        parcel.writeInt(list.size());
        for (SelfCareType name : list) {
            parcel.writeString(name.name());
        }
        parcel.writeString(this.f65805X);
        this.f65806Y.writeToParcel(parcel, i);
    }

    @C12579k
    /* renamed from: x */
    public final OrderOnlineItemModel mo78652x() {
        return this.f65806Y;
    }

    @C12579k
    /* renamed from: y */
    public final String mo78653y() {
        return this.f65811e;
    }

    @C12579k
    /* renamed from: z */
    public final OrderStatus mo78654z() {
        return this.f65810d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOnlineItemModel(boolean r19, java.lang.Long r20, com.carrefour.fid.android.shared.domain.models.order.OrderType r21, com.carrefour.fid.android.core.constants.OrderStatus r22, java.lang.String r23, java.lang.String r24, double r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.lang.String r32, com.carrefour.fid.android.presentation.p035ui.orders.online.view.OrderOnlineItemModel r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r3 = r1
            goto L_0x000b
        L_0x0009:
            r3 = r19
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r1 = 0
            r4 = r1
            goto L_0x0014
        L_0x0012:
            r4 = r20
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001c
            com.carrefour.fid.android.shared.domain.models.order.OrderType$Unknown r1 = com.carrefour.fid.android.shared.domain.models.order.OrderType.Unknown.f70294e
            r5 = r1
            goto L_0x001e
        L_0x001c:
            r5 = r21
        L_0x001e:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0026
            com.carrefour.fid.android.core.constants.OrderStatus$Unknown r1 = com.carrefour.fid.android.core.constants.OrderStatus.Unknown.f89266e
            r6 = r1
            goto L_0x0028
        L_0x0026:
            r6 = r22
        L_0x0028:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r7 = r1
            goto L_0x0035
        L_0x0033:
            r7 = r23
        L_0x0035:
            r1 = r0 & 32
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x003d
            r8 = r2
            goto L_0x003f
        L_0x003d:
            r8 = r24
        L_0x003f:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0046
            r9 = 0
            goto L_0x0048
        L_0x0046:
            r9 = r25
        L_0x0048:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r27
        L_0x0050:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0056
            r12 = r2
            goto L_0x0058
        L_0x0056:
            r12 = r28
        L_0x0058:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005e
            r13 = r2
            goto L_0x0060
        L_0x005e:
            r13 = r29
        L_0x0060:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r30
        L_0x0068:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0072
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r15 = r1
            goto L_0x0074
        L_0x0072:
            r15 = r31
        L_0x0074:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x007b
            r16 = r2
            goto L_0x007d
        L_0x007b:
            r16 = r32
        L_0x007d:
            r2 = r18
            r17 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel.<init>(boolean, java.lang.Long, com.carrefour.fid.android.shared.domain.models.order.OrderType, com.carrefour.fid.android.core.constants.OrderStatus, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
