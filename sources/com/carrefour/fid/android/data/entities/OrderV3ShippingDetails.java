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
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3ShippingDetails;", "Landroid/os/Parcelable;", "", "component1", "pickupPointName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getPickupPointName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3ShippingDetails implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3ShippingDetails> CREATOR = new C36412a();
    @C33608c("pickup_point_name")
    @C12580l
    private final String pickupPointName;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3ShippingDetails$a */
    public static final class C36412a implements Parcelable.Creator<OrderV3ShippingDetails> {
        @C12579k
        /* renamed from: a */
        public final OrderV3ShippingDetails createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3ShippingDetails(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3ShippingDetails[] newArray(int i) {
            return new OrderV3ShippingDetails[i];
        }
    }

    public OrderV3ShippingDetails(@C12580l String str) {
        this.pickupPointName = str;
    }

    public static /* synthetic */ OrderV3ShippingDetails copy$default(OrderV3ShippingDetails orderV3ShippingDetails, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV3ShippingDetails.pickupPointName;
        }
        return orderV3ShippingDetails.copy(str);
    }

    @C12580l
    public final String component1() {
        return this.pickupPointName;
    }

    @C12579k
    public final OrderV3ShippingDetails copy(@C12580l String str) {
        return new OrderV3ShippingDetails(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderV3ShippingDetails) && Intrinsics.areEqual((Object) this.pickupPointName, (Object) ((OrderV3ShippingDetails) obj).pickupPointName);
    }

    @C12580l
    public final String getPickupPointName() {
        return this.pickupPointName;
    }

    public int hashCode() {
        String str = this.pickupPointName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.pickupPointName;
        return "OrderV3ShippingDetails(pickupPointName=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.pickupPointName);
    }
}
