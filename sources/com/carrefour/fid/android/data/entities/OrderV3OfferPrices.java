package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3OfferPrices;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component1", "component2", "", "component3", "salePrice", "standardPrice", "unitAmount", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getSalePrice", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getStandardPrice", "Ljava/lang/String;", "getUnitAmount", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3OfferPrices implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3OfferPrices> CREATOR = new C36409a();
    @C33608c("sale_price")
    @C12579k
    private final OrderV3Amounts salePrice;
    @C33608c("standard_price")
    @C12579k
    private final OrderV3Amounts standardPrice;
    @C33608c("unit_amount")
    @C12579k
    private final String unitAmount;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3OfferPrices$a */
    public static final class C36409a implements Parcelable.Creator<OrderV3OfferPrices> {
        @C12579k
        /* renamed from: a */
        public final OrderV3OfferPrices createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<OrderV3Amounts> creator = OrderV3Amounts.CREATOR;
            return new OrderV3OfferPrices(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3OfferPrices[] newArray(int i) {
            return new OrderV3OfferPrices[i];
        }
    }

    public OrderV3OfferPrices(@C12579k OrderV3Amounts orderV3Amounts, @C12579k OrderV3Amounts orderV3Amounts2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "salePrice");
        Intrinsics.checkNotNullParameter(orderV3Amounts2, "standardPrice");
        Intrinsics.checkNotNullParameter(str, "unitAmount");
        this.salePrice = orderV3Amounts;
        this.standardPrice = orderV3Amounts2;
        this.unitAmount = str;
    }

    public static /* synthetic */ OrderV3OfferPrices copy$default(OrderV3OfferPrices orderV3OfferPrices, OrderV3Amounts orderV3Amounts, OrderV3Amounts orderV3Amounts2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            orderV3Amounts = orderV3OfferPrices.salePrice;
        }
        if ((i & 2) != 0) {
            orderV3Amounts2 = orderV3OfferPrices.standardPrice;
        }
        if ((i & 4) != 0) {
            str = orderV3OfferPrices.unitAmount;
        }
        return orderV3OfferPrices.copy(orderV3Amounts, orderV3Amounts2, str);
    }

    @C12579k
    public final OrderV3Amounts component1() {
        return this.salePrice;
    }

    @C12579k
    public final OrderV3Amounts component2() {
        return this.standardPrice;
    }

    @C12579k
    public final String component3() {
        return this.unitAmount;
    }

    @C12579k
    public final OrderV3OfferPrices copy(@C12579k OrderV3Amounts orderV3Amounts, @C12579k OrderV3Amounts orderV3Amounts2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "salePrice");
        Intrinsics.checkNotNullParameter(orderV3Amounts2, "standardPrice");
        Intrinsics.checkNotNullParameter(str, "unitAmount");
        return new OrderV3OfferPrices(orderV3Amounts, orderV3Amounts2, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3OfferPrices)) {
            return false;
        }
        OrderV3OfferPrices orderV3OfferPrices = (OrderV3OfferPrices) obj;
        return Intrinsics.areEqual((Object) this.salePrice, (Object) orderV3OfferPrices.salePrice) && Intrinsics.areEqual((Object) this.standardPrice, (Object) orderV3OfferPrices.standardPrice) && Intrinsics.areEqual((Object) this.unitAmount, (Object) orderV3OfferPrices.unitAmount);
    }

    @C12579k
    public final OrderV3Amounts getSalePrice() {
        return this.salePrice;
    }

    @C12579k
    public final OrderV3Amounts getStandardPrice() {
        return this.standardPrice;
    }

    @C12579k
    public final String getUnitAmount() {
        return this.unitAmount;
    }

    public int hashCode() {
        return (((this.salePrice.hashCode() * 31) + this.standardPrice.hashCode()) * 31) + this.unitAmount.hashCode();
    }

    @C12579k
    public String toString() {
        OrderV3Amounts orderV3Amounts = this.salePrice;
        OrderV3Amounts orderV3Amounts2 = this.standardPrice;
        String str = this.unitAmount;
        return "OrderV3OfferPrices(salePrice=" + orderV3Amounts + ", standardPrice=" + orderV3Amounts2 + ", unitAmount=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.salePrice.writeToParcel(parcel, i);
        this.standardPrice.writeToParcel(parcel, i);
        parcel.writeString(this.unitAmount);
    }
}
