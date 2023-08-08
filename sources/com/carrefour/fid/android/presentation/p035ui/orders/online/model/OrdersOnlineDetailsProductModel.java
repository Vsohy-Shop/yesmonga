package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bë\u0001\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\b\u0002\u0010,\u001a\u00020\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012\u0012\f\b\u0002\u0010.\u001a\u00060\u0015j\u0002`\u0016\u0012\b\b\u0002\u0010/\u001a\u00020\u0012\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u00103\u001a\u00020\u001d\u0012\b\b\u0002\u00104\u001a\u00020\u0003¢\u0006\u0004\bp\u0010qJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0012HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jô\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00122\f\b\u0002\u0010.\u001a\u00060\u0015j\u0002`\u00162\b\b\u0002\u0010/\u001a\u00020\u00122\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00103\u001a\u00020\u001d2\b\b\u0002\u00104\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b5\u00106J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0012HÖ\u0001J\u0013\u0010;\u001a\u00020\u001d2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010<\u001a\u00020\u0012HÖ\u0001J\u0019\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0012HÖ\u0001R\u001a\u0010 \u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010!\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bE\u0010DR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR\u0017\u0010#\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bH\u0010DR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010KR\u0017\u0010%\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bL\u0010NR\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bO\u0010NR\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u0010L\u001a\u0004\bP\u0010NR\u0019\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010DR\u0019\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bS\u0010DR\u0017\u0010+\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bH\u0010B\u001a\u0004\bT\u0010DR\u001a\u0010,\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bU\u0010B\u001a\u0004\bF\u0010DR\u0019\u0010-\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010\u0014R\u001b\u0010.\u001a\u00060\u0015j\u0002`\u00168\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010/\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b]\u0010T\u001a\u0004\b^\u0010_R$\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010B\u001a\u0004\ba\u0010D\"\u0004\bb\u0010KR$\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010\u001b\"\u0004\bf\u0010gR$\u00102\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bh\u0010d\u001a\u0004\bi\u0010\u001b\"\u0004\bj\u0010gR\u0017\u00103\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010mR\u0017\u00104\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bn\u0010B\u001a\u0004\bo\u0010D¨\u0006r"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsProductModel;", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/b;", "Landroid/os/Parcelable;", "", "a", "m", "p", "q", "r", "", "s", "t", "u", "v", "b", "d", "e", "f", "", "g", "()Ljava/lang/Integer;", "Lcom/carrefour/fid/android/domain/models/OrdersOnlineDetailsProductPriceDomain;", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsProductPriceModel;", "h", "i", "j", "k", "()Ljava/lang/Double;", "l", "", "n", "o", "category", "name", "brandName", "cdBase", "gtin", "offerPreparedTotalAmount", "offerTotalAmount", "offerTotalImmediateDiscountAmount", "offerTotalPaidAmount", "offerUnit", "originalCdBase", "packaging", "picturePath", "preparedQuantity", "prices", "quantity", "productDifference", "productCheaperAmount", "productDifferenceAmount", "isDigitalItem", "digitalItemLink", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/OrdersOnlineDetailsProductPriceDomain;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/String;)Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsProductModel;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "getName", "c", "y", "z", "B", "Q", "(Ljava/lang/String;)V", "D", "C", "()D", "E", "F", "x", "G", "H", "I", "X", "Y", "Ljava/lang/Integer;", "J", "Z", "Lcom/carrefour/fid/android/domain/models/OrdersOnlineDetailsProductPriceDomain;", "K", "()Lcom/carrefour/fid/android/domain/models/OrdersOnlineDetailsProductPriceDomain;", "E0", "O", "()I", "F0", "M", "S", "G0", "Ljava/lang/Double;", "L", "R", "(Ljava/lang/Double;)V", "H0", "N", "T", "I0", "P", "()Z", "J0", "A", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/OrdersOnlineDetailsProductPriceDomain;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel */
public final class OrdersOnlineDetailsProductModel implements C25234b, Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrdersOnlineDetailsProductModel> CREATOR = new C25228a();

    /* renamed from: K0 */
    public static final int f62159K0 = 8;

    /* renamed from: E0 */
    public final int f62160E0;
    @C12580l

    /* renamed from: F0 */
    public String f62161F0;
    @C12580l

    /* renamed from: G0 */
    public Double f62162G0;
    @C12580l

    /* renamed from: H0 */
    public Double f62163H0;

    /* renamed from: I0 */
    public final boolean f62164I0;
    @C12579k

    /* renamed from: J0 */
    public final String f62165J0;
    @C12579k

    /* renamed from: X */
    public final String f62166X;
    @C12580l

    /* renamed from: Y */
    public final Integer f62167Y;
    @C12579k

    /* renamed from: Z */
    public final OrdersOnlineDetailsProductPriceDomain f62168Z;
    @C12579k

    /* renamed from: a */
    public final String f62169a;
    @C12579k

    /* renamed from: b */
    public final String f62170b;
    @C12580l

    /* renamed from: c */
    public final String f62171c;
    @C12579k

    /* renamed from: d */
    public final String f62172d;
    @C12579k

    /* renamed from: e */
    public String f62173e;

    /* renamed from: f */
    public final double f62174f;

    /* renamed from: g */
    public final double f62175g;

    /* renamed from: v */
    public final double f62176v;

    /* renamed from: w */
    public final double f62177w;
    @C12580l

    /* renamed from: x */
    public final String f62178x;
    @C12580l

    /* renamed from: y */
    public final String f62179y;
    @C12579k

    /* renamed from: z */
    public final String f62180z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel$a */
    public static final class C25228a implements Parcelable.Creator<OrdersOnlineDetailsProductModel> {
        @C12579k
        /* renamed from: a */
        public final OrdersOnlineDetailsProductModel createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            return new OrdersOnlineDetailsProductModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), OrdersOnlineDetailsProductPriceDomain.CREATOR.createFromParcel(parcel2), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineDetailsProductModel[] newArray(int i) {
            return new OrdersOnlineDetailsProductModel[i];
        }
    }

    public OrdersOnlineDetailsProductModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, (Integer) null, (OrdersOnlineDetailsProductPriceDomain) null, 0, (String) null, (Double) null, (Double) null, false, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* renamed from: x */
    public static /* synthetic */ OrdersOnlineDetailsProductModel m109085x(OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel, String str, String str2, String str3, String str4, String str5, double d, double d2, double d3, double d4, String str6, String str7, String str8, String str9, Integer num, OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain, int i, String str10, Double d5, Double d6, boolean z, String str11, int i2, Object obj) {
        OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel2 = ordersOnlineDetailsProductModel;
        int i3 = i2;
        return ordersOnlineDetailsProductModel.mo73460w((i3 & 1) != 0 ? ordersOnlineDetailsProductModel2.f62169a : str, (i3 & 2) != 0 ? ordersOnlineDetailsProductModel2.f62170b : str2, (i3 & 4) != 0 ? ordersOnlineDetailsProductModel2.f62171c : str3, (i3 & 8) != 0 ? ordersOnlineDetailsProductModel2.f62172d : str4, (i3 & 16) != 0 ? ordersOnlineDetailsProductModel2.f62173e : str5, (i3 & 32) != 0 ? ordersOnlineDetailsProductModel2.f62174f : d, (i3 & 64) != 0 ? ordersOnlineDetailsProductModel2.f62175g : d2, (i3 & 128) != 0 ? ordersOnlineDetailsProductModel2.f62176v : d3, (i3 & 256) != 0 ? ordersOnlineDetailsProductModel2.f62177w : d4, (i3 & 512) != 0 ? ordersOnlineDetailsProductModel2.f62178x : str6, (i3 & 1024) != 0 ? ordersOnlineDetailsProductModel2.f62179y : str7, (i3 & 2048) != 0 ? ordersOnlineDetailsProductModel2.f62180z : str8, (i3 & 4096) != 0 ? ordersOnlineDetailsProductModel2.f62166X : str9, (i3 & 8192) != 0 ? ordersOnlineDetailsProductModel2.f62167Y : num, (i3 & 16384) != 0 ? ordersOnlineDetailsProductModel2.f62168Z : ordersOnlineDetailsProductPriceDomain, (i3 & 32768) != 0 ? ordersOnlineDetailsProductModel2.f62160E0 : i, (i3 & 65536) != 0 ? ordersOnlineDetailsProductModel2.f62161F0 : str10, (i3 & 131072) != 0 ? ordersOnlineDetailsProductModel2.f62162G0 : d5, (i3 & 262144) != 0 ? ordersOnlineDetailsProductModel2.f62163H0 : d6, (i3 & 524288) != 0 ? ordersOnlineDetailsProductModel2.f62164I0 : z, (i3 & 1048576) != 0 ? ordersOnlineDetailsProductModel2.f62165J0 : str11);
    }

    @C12579k
    /* renamed from: A */
    public final String mo73412A() {
        return this.f62165J0;
    }

    @C12579k
    /* renamed from: B */
    public final String mo73413B() {
        return this.f62173e;
    }

    /* renamed from: C */
    public final double mo73414C() {
        return this.f62174f;
    }

    /* renamed from: D */
    public final double mo73415D() {
        return this.f62175g;
    }

    /* renamed from: E */
    public final double mo73416E() {
        return this.f62176v;
    }

    /* renamed from: F */
    public final double mo73417F() {
        return this.f62177w;
    }

    @C12580l
    /* renamed from: G */
    public final String mo73418G() {
        return this.f62178x;
    }

    @C12580l
    /* renamed from: H */
    public final String mo73419H() {
        return this.f62179y;
    }

    @C12579k
    /* renamed from: I */
    public final String mo73420I() {
        return this.f62180z;
    }

    @C12580l
    /* renamed from: J */
    public final Integer mo73421J() {
        return this.f62167Y;
    }

    @C12579k
    /* renamed from: K */
    public final OrdersOnlineDetailsProductPriceDomain mo73422K() {
        return this.f62168Z;
    }

    @C12580l
    /* renamed from: L */
    public final Double mo73423L() {
        return this.f62162G0;
    }

    @C12580l
    /* renamed from: M */
    public final String mo73424M() {
        return this.f62161F0;
    }

    @C12580l
    /* renamed from: N */
    public final Double mo73425N() {
        return this.f62163H0;
    }

    /* renamed from: O */
    public final int mo73426O() {
        return this.f62160E0;
    }

    /* renamed from: P */
    public final boolean mo73427P() {
        return this.f62164I0;
    }

    /* renamed from: Q */
    public final void mo73428Q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f62173e = str;
    }

    /* renamed from: R */
    public final void mo73429R(@C12580l Double d) {
        this.f62162G0 = d;
    }

    /* renamed from: S */
    public final void mo73430S(@C12580l String str) {
        this.f62161F0 = str;
    }

    /* renamed from: T */
    public final void mo73431T(@C12580l Double d) {
        this.f62163H0 = d;
    }

    @C12579k
    /* renamed from: a */
    public final String mo73432a() {
        return this.f62169a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo73433b() {
        return this.f62178x;
    }

    @C12579k
    /* renamed from: c */
    public String mo73434c() {
        return this.f62166X;
    }

    @C12580l
    /* renamed from: d */
    public final String mo73435d() {
        return this.f62179y;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo73437e() {
        return this.f62180z;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOnlineDetailsProductModel)) {
            return false;
        }
        OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel = (OrdersOnlineDetailsProductModel) obj;
        return Intrinsics.areEqual((Object) this.f62169a, (Object) ordersOnlineDetailsProductModel.f62169a) && Intrinsics.areEqual((Object) this.f62170b, (Object) ordersOnlineDetailsProductModel.f62170b) && Intrinsics.areEqual((Object) this.f62171c, (Object) ordersOnlineDetailsProductModel.f62171c) && Intrinsics.areEqual((Object) this.f62172d, (Object) ordersOnlineDetailsProductModel.f62172d) && Intrinsics.areEqual((Object) this.f62173e, (Object) ordersOnlineDetailsProductModel.f62173e) && Double.compare(this.f62174f, ordersOnlineDetailsProductModel.f62174f) == 0 && Double.compare(this.f62175g, ordersOnlineDetailsProductModel.f62175g) == 0 && Double.compare(this.f62176v, ordersOnlineDetailsProductModel.f62176v) == 0 && Double.compare(this.f62177w, ordersOnlineDetailsProductModel.f62177w) == 0 && Intrinsics.areEqual((Object) this.f62178x, (Object) ordersOnlineDetailsProductModel.f62178x) && Intrinsics.areEqual((Object) this.f62179y, (Object) ordersOnlineDetailsProductModel.f62179y) && Intrinsics.areEqual((Object) this.f62180z, (Object) ordersOnlineDetailsProductModel.f62180z) && Intrinsics.areEqual((Object) this.f62166X, (Object) ordersOnlineDetailsProductModel.f62166X) && Intrinsics.areEqual((Object) this.f62167Y, (Object) ordersOnlineDetailsProductModel.f62167Y) && Intrinsics.areEqual((Object) this.f62168Z, (Object) ordersOnlineDetailsProductModel.f62168Z) && this.f62160E0 == ordersOnlineDetailsProductModel.f62160E0 && Intrinsics.areEqual((Object) this.f62161F0, (Object) ordersOnlineDetailsProductModel.f62161F0) && Intrinsics.areEqual((Object) this.f62162G0, (Object) ordersOnlineDetailsProductModel.f62162G0) && Intrinsics.areEqual((Object) this.f62163H0, (Object) ordersOnlineDetailsProductModel.f62163H0) && this.f62164I0 == ordersOnlineDetailsProductModel.f62164I0 && Intrinsics.areEqual((Object) this.f62165J0, (Object) ordersOnlineDetailsProductModel.f62165J0);
    }

    @C12579k
    /* renamed from: f */
    public final String mo73439f() {
        return this.f62166X;
    }

    @C12580l
    /* renamed from: g */
    public final Integer mo73440g() {
        return this.f62167Y;
    }

    @C12579k
    public String getCategory() {
        return this.f62169a;
    }

    @C12579k
    public String getName() {
        return this.f62170b;
    }

    @C12579k
    /* renamed from: h */
    public final OrdersOnlineDetailsProductPriceDomain mo73443h() {
        return this.f62168Z;
    }

    public int hashCode() {
        int hashCode = ((this.f62169a.hashCode() * 31) + this.f62170b.hashCode()) * 31;
        String str = this.f62171c;
        int i = 0;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f62172d.hashCode()) * 31) + this.f62173e.hashCode()) * 31) + Double.hashCode(this.f62174f)) * 31) + Double.hashCode(this.f62175g)) * 31) + Double.hashCode(this.f62176v)) * 31) + Double.hashCode(this.f62177w)) * 31;
        String str2 = this.f62178x;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62179y;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f62180z.hashCode()) * 31) + this.f62166X.hashCode()) * 31;
        Integer num = this.f62167Y;
        int hashCode5 = (((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.f62168Z.hashCode()) * 31) + Integer.hashCode(this.f62160E0)) * 31;
        String str4 = this.f62161F0;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.f62162G0;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f62163H0;
        if (d2 != null) {
            i = d2.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.f62164I0;
        if (z) {
            z = true;
        }
        return ((i2 + (z ? 1 : 0)) * 31) + this.f62165J0.hashCode();
    }

    /* renamed from: i */
    public final int mo73445i() {
        return this.f62160E0;
    }

    @C12580l
    /* renamed from: j */
    public final String mo73446j() {
        return this.f62161F0;
    }

    @C12580l
    /* renamed from: k */
    public final Double mo73447k() {
        return this.f62162G0;
    }

    @C12580l
    /* renamed from: l */
    public final Double mo73448l() {
        return this.f62163H0;
    }

    @C12579k
    /* renamed from: m */
    public final String mo73449m() {
        return this.f62170b;
    }

    /* renamed from: n */
    public final boolean mo73450n() {
        return this.f62164I0;
    }

    @C12579k
    /* renamed from: o */
    public final String mo73451o() {
        return this.f62165J0;
    }

    @C12580l
    /* renamed from: p */
    public final String mo73452p() {
        return this.f62171c;
    }

    @C12579k
    /* renamed from: q */
    public final String mo73453q() {
        return this.f62172d;
    }

    @C12579k
    /* renamed from: r */
    public final String mo73454r() {
        return this.f62173e;
    }

    /* renamed from: s */
    public final double mo73455s() {
        return this.f62174f;
    }

    /* renamed from: t */
    public final double mo73456t() {
        return this.f62175g;
    }

    @C12579k
    public String toString() {
        String str = this.f62169a;
        String str2 = this.f62170b;
        String str3 = this.f62171c;
        String str4 = this.f62172d;
        String str5 = this.f62173e;
        double d = this.f62174f;
        double d2 = this.f62175g;
        double d3 = this.f62176v;
        double d4 = this.f62177w;
        String str6 = this.f62178x;
        String str7 = this.f62179y;
        String str8 = this.f62180z;
        String str9 = this.f62166X;
        Integer num = this.f62167Y;
        OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain = this.f62168Z;
        int i = this.f62160E0;
        String str10 = this.f62161F0;
        Double d5 = this.f62162G0;
        Double d6 = this.f62163H0;
        boolean z = this.f62164I0;
        String str11 = this.f62165J0;
        return "OrdersOnlineDetailsProductModel(category=" + str + ", name=" + str2 + ", brandName=" + str3 + ", cdBase=" + str4 + ", gtin=" + str5 + ", offerPreparedTotalAmount=" + d + ", offerTotalAmount=" + d2 + ", offerTotalImmediateDiscountAmount=" + d3 + ", offerTotalPaidAmount=" + d4 + ", offerUnit=" + str6 + ", originalCdBase=" + str7 + ", packaging=" + str8 + ", picturePath=" + str9 + ", preparedQuantity=" + num + ", prices=" + ordersOnlineDetailsProductPriceDomain + ", quantity=" + i + ", productDifference=" + str10 + ", productCheaperAmount=" + d5 + ", productDifferenceAmount=" + d6 + ", isDigitalItem=" + z + ", digitalItemLink=" + str11 + ")";
    }

    /* renamed from: u */
    public final double mo73458u() {
        return this.f62176v;
    }

    /* renamed from: v */
    public final double mo73459v() {
        return this.f62177w;
    }

    @C12579k
    /* renamed from: w */
    public final OrdersOnlineDetailsProductModel mo73460w(@C12579k String str, @C12579k String str2, @C12580l String str3, @C12579k String str4, @C12579k String str5, double d, double d2, double d3, double d4, @C12580l String str6, @C12580l String str7, @C12579k String str8, @C12579k String str9, @C12580l Integer num, @C12579k OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain, int i, @C12580l String str10, @C12580l Double d5, @C12580l Double d6, boolean z, @C12579k String str11) {
        String str12 = str;
        Intrinsics.checkNotNullParameter(str12, "category");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str4, "cdBase");
        Intrinsics.checkNotNullParameter(str5, "gtin");
        Intrinsics.checkNotNullParameter(str8, "packaging");
        Intrinsics.checkNotNullParameter(str9, "picturePath");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsProductPriceDomain, "prices");
        Intrinsics.checkNotNullParameter(str11, "digitalItemLink");
        return new OrdersOnlineDetailsProductModel(str12, str2, str3, str4, str5, d, d2, d3, d4, str6, str7, str8, str9, num, ordersOnlineDetailsProductPriceDomain, i, str10, d5, d6, z, str11);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f62169a);
        parcel.writeString(this.f62170b);
        parcel.writeString(this.f62171c);
        parcel.writeString(this.f62172d);
        parcel.writeString(this.f62173e);
        parcel.writeDouble(this.f62174f);
        parcel.writeDouble(this.f62175g);
        parcel.writeDouble(this.f62176v);
        parcel.writeDouble(this.f62177w);
        parcel.writeString(this.f62178x);
        parcel.writeString(this.f62179y);
        parcel.writeString(this.f62180z);
        parcel.writeString(this.f62166X);
        Integer num = this.f62167Y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.f62168Z.writeToParcel(parcel, i);
        parcel.writeInt(this.f62160E0);
        parcel.writeString(this.f62161F0);
        Double d = this.f62162G0;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f62163H0;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeInt(this.f62164I0 ? 1 : 0);
        parcel.writeString(this.f62165J0);
    }

    @C12580l
    /* renamed from: y */
    public final String mo73462y() {
        return this.f62171c;
    }

    @C12579k
    /* renamed from: z */
    public final String mo73463z() {
        return this.f62172d;
    }

    public OrdersOnlineDetailsProductModel(@C12579k String str, @C12579k String str2, @C12580l String str3, @C12579k String str4, @C12579k String str5, double d, double d2, double d3, double d4, @C12580l String str6, @C12580l String str7, @C12579k String str8, @C12579k String str9, @C12580l Integer num, @C12579k OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain, int i, @C12580l String str10, @C12580l Double d5, @C12580l Double d6, boolean z, @C12579k String str11) {
        String str12 = str8;
        String str13 = str9;
        OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain2 = ordersOnlineDetailsProductPriceDomain;
        String str14 = str11;
        Intrinsics.checkNotNullParameter(str, "category");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str4, "cdBase");
        Intrinsics.checkNotNullParameter(str5, "gtin");
        Intrinsics.checkNotNullParameter(str12, "packaging");
        Intrinsics.checkNotNullParameter(str13, "picturePath");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsProductPriceDomain2, "prices");
        Intrinsics.checkNotNullParameter(str14, "digitalItemLink");
        this.f62169a = str;
        this.f62170b = str2;
        this.f62171c = str3;
        this.f62172d = str4;
        this.f62173e = str5;
        this.f62174f = d;
        this.f62175g = d2;
        this.f62176v = d3;
        this.f62177w = d4;
        this.f62178x = str6;
        this.f62179y = str7;
        this.f62180z = str12;
        this.f62166X = str13;
        this.f62167Y = num;
        this.f62168Z = ordersOnlineDetailsProductPriceDomain2;
        this.f62160E0 = i;
        this.f62161F0 = str10;
        this.f62162G0 = d5;
        this.f62163H0 = d6;
        this.f62164I0 = z;
        this.f62165J0 = str14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOnlineDetailsProductModel(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, double r32, double r34, double r36, double r38, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.Integer r44, com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r45, int r46, java.lang.String r47, java.lang.Double r48, java.lang.Double r49, boolean r50, java.lang.String r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            r26 = this;
            r0 = r52
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r27
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r28
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = 0
            goto L_0x001c
        L_0x001a:
            r4 = r29
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r2
            goto L_0x0024
        L_0x0022:
            r6 = r30
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r31
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0033
            r11 = 0
            goto L_0x0035
        L_0x0033:
            r11 = r32
        L_0x0035:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003c
            r13 = 0
            goto L_0x003e
        L_0x003c:
            r13 = r34
        L_0x003e:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0045
            r15 = 0
            goto L_0x0047
        L_0x0045:
            r15 = r36
        L_0x0047:
            r8 = r0 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x004e
            r17 = 0
            goto L_0x0050
        L_0x004e:
            r17 = r38
        L_0x0050:
            r8 = r0 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0056
            r8 = 0
            goto L_0x0058
        L_0x0056:
            r8 = r40
        L_0x0058:
            r5 = r0 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x005e
            r5 = 0
            goto L_0x0060
        L_0x005e:
            r5 = r41
        L_0x0060:
            r9 = r0 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0066
            r9 = r2
            goto L_0x0068
        L_0x0066:
            r9 = r42
        L_0x0068:
            r10 = r0 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x006e
            r10 = r2
            goto L_0x0070
        L_0x006e:
            r10 = r43
        L_0x0070:
            r53 = r2
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r44
        L_0x007a:
            r19 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0098
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r2 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            r20 = 0
            r22 = 0
            r24 = 3
            r25 = 0
            r30 = r2
            r31 = r20
            r33 = r22
            r35 = r24
            r36 = r25
            r30.<init>(r31, r33, r35, r36)
            goto L_0x009a
        L_0x0098:
            r2 = r45
        L_0x009a:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a4
            r20 = -1
            goto L_0x00a6
        L_0x00a4:
            r20 = r46
        L_0x00a6:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00af
            r21 = r53
            goto L_0x00b1
        L_0x00af:
            r21 = r47
        L_0x00b1:
            r22 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00be
            r22 = 0
            java.lang.Double r24 = java.lang.Double.valueOf(r22)
            goto L_0x00c2
        L_0x00be:
            r22 = 0
            r24 = r48
        L_0x00c2:
            r25 = 262144(0x40000, float:3.67342E-40)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00cd
            java.lang.Double r22 = java.lang.Double.valueOf(r22)
            goto L_0x00cf
        L_0x00cd:
            r22 = r49
        L_0x00cf:
            r23 = 524288(0x80000, float:7.34684E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d8
            r23 = 0
            goto L_0x00da
        L_0x00d8:
            r23 = r50
        L_0x00da:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00e3
            r0 = r53
            goto L_0x00e5
        L_0x00e3:
            r0 = r51
        L_0x00e5:
            r27 = r26
            r28 = r1
            r29 = r3
            r30 = r4
            r31 = r6
            r32 = r7
            r33 = r11
            r35 = r13
            r37 = r15
            r39 = r17
            r41 = r8
            r42 = r5
            r43 = r9
            r44 = r10
            r45 = r19
            r46 = r2
            r47 = r20
            r48 = r21
            r49 = r24
            r50 = r22
            r51 = r23
            r52 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain, int, java.lang.String, java.lang.Double, java.lang.Double, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
