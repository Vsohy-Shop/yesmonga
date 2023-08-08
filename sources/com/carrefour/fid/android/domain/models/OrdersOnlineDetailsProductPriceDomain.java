package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOnlineDetailsProductPriceDomain;", "Landroid/os/Parcelable;", "", "a", "b", "salePrice", "standardPrice", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "e", "()D", "f", "<init>", "(DD)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrdersOnlineDetailsProductPriceDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrdersOnlineDetailsProductPriceDomain> CREATOR = new C37929a();

    /* renamed from: c */
    public static final int f95334c = 0;

    /* renamed from: a */
    public final double f95335a;

    /* renamed from: b */
    public final double f95336b;

    /* renamed from: com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain$a */
    public static final class C37929a implements Parcelable.Creator<OrdersOnlineDetailsProductPriceDomain> {
        @C12579k
        /* renamed from: a */
        public final OrdersOnlineDetailsProductPriceDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrdersOnlineDetailsProductPriceDomain(parcel.readDouble(), parcel.readDouble());
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineDetailsProductPriceDomain[] newArray(int i) {
            return new OrdersOnlineDetailsProductPriceDomain[i];
        }
    }

    public OrdersOnlineDetailsProductPriceDomain() {
        this(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ OrdersOnlineDetailsProductPriceDomain m155709d(OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = ordersOnlineDetailsProductPriceDomain.f95335a;
        }
        if ((i & 2) != 0) {
            d2 = ordersOnlineDetailsProductPriceDomain.f95336b;
        }
        return ordersOnlineDetailsProductPriceDomain.mo116375c(d, d2);
    }

    /* renamed from: a */
    public final double mo116373a() {
        return this.f95335a;
    }

    /* renamed from: b */
    public final double mo116374b() {
        return this.f95336b;
    }

    @C12579k
    /* renamed from: c */
    public final OrdersOnlineDetailsProductPriceDomain mo116375c(double d, double d2) {
        return new OrdersOnlineDetailsProductPriceDomain(d, d2);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo116377e() {
        return this.f95335a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOnlineDetailsProductPriceDomain)) {
            return false;
        }
        OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain = (OrdersOnlineDetailsProductPriceDomain) obj;
        return Double.compare(this.f95335a, ordersOnlineDetailsProductPriceDomain.f95335a) == 0 && Double.compare(this.f95336b, ordersOnlineDetailsProductPriceDomain.f95336b) == 0;
    }

    /* renamed from: f */
    public final double mo116379f() {
        return this.f95336b;
    }

    public int hashCode() {
        return (Double.hashCode(this.f95335a) * 31) + Double.hashCode(this.f95336b);
    }

    @C12579k
    public String toString() {
        double d = this.f95335a;
        double d2 = this.f95336b;
        return "OrdersOnlineDetailsProductPriceDomain(salePrice=" + d + ", standardPrice=" + d2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.f95335a);
        parcel.writeDouble(this.f95336b);
    }

    public OrdersOnlineDetailsProductPriceDomain(double d, double d2) {
        this.f95335a = d;
        this.f95336b = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrdersOnlineDetailsProductPriceDomain(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
