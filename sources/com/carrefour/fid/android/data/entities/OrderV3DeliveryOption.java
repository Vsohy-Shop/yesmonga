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
@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3DeliveryOption;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "component3", "Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "component4", "mode", "location", "slotInfo", "shippingType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getMode", "()Ljava/lang/String;", "getLocation", "Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "getSlotInfo", "()Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "getShippingType", "()Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3DeliveryOption implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3DeliveryOption> CREATOR = new C36407a();
    @C33608c("location")
    @C12580l
    private final String location;
    @C33608c("mode")
    @C12580l
    private final String mode;
    @C33608c("shipping_type")
    @C12580l
    private final OrderV3ShippingType shippingType;
    @C33608c("slot_info")
    @C12580l
    private final OrderV3SlotInfo slotInfo;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3DeliveryOption$a */
    public static final class C36407a implements Parcelable.Creator<OrderV3DeliveryOption> {
        @C12579k
        /* renamed from: a */
        public final OrderV3DeliveryOption createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            OrderV3ShippingType orderV3ShippingType = null;
            OrderV3SlotInfo createFromParcel = parcel.readInt() == 0 ? null : OrderV3SlotInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                orderV3ShippingType = OrderV3ShippingType.CREATOR.createFromParcel(parcel);
            }
            return new OrderV3DeliveryOption(readString, readString2, createFromParcel, orderV3ShippingType);
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3DeliveryOption[] newArray(int i) {
            return new OrderV3DeliveryOption[i];
        }
    }

    public OrderV3DeliveryOption(@C12580l String str, @C12580l String str2, @C12580l OrderV3SlotInfo orderV3SlotInfo, @C12580l OrderV3ShippingType orderV3ShippingType) {
        this.mode = str;
        this.location = str2;
        this.slotInfo = orderV3SlotInfo;
        this.shippingType = orderV3ShippingType;
    }

    public static /* synthetic */ OrderV3DeliveryOption copy$default(OrderV3DeliveryOption orderV3DeliveryOption, String str, String str2, OrderV3SlotInfo orderV3SlotInfo, OrderV3ShippingType orderV3ShippingType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV3DeliveryOption.mode;
        }
        if ((i & 2) != 0) {
            str2 = orderV3DeliveryOption.location;
        }
        if ((i & 4) != 0) {
            orderV3SlotInfo = orderV3DeliveryOption.slotInfo;
        }
        if ((i & 8) != 0) {
            orderV3ShippingType = orderV3DeliveryOption.shippingType;
        }
        return orderV3DeliveryOption.copy(str, str2, orderV3SlotInfo, orderV3ShippingType);
    }

    @C12580l
    public final String component1() {
        return this.mode;
    }

    @C12580l
    public final String component2() {
        return this.location;
    }

    @C12580l
    public final OrderV3SlotInfo component3() {
        return this.slotInfo;
    }

    @C12580l
    public final OrderV3ShippingType component4() {
        return this.shippingType;
    }

    @C12579k
    public final OrderV3DeliveryOption copy(@C12580l String str, @C12580l String str2, @C12580l OrderV3SlotInfo orderV3SlotInfo, @C12580l OrderV3ShippingType orderV3ShippingType) {
        return new OrderV3DeliveryOption(str, str2, orderV3SlotInfo, orderV3ShippingType);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3DeliveryOption)) {
            return false;
        }
        OrderV3DeliveryOption orderV3DeliveryOption = (OrderV3DeliveryOption) obj;
        return Intrinsics.areEqual((Object) this.mode, (Object) orderV3DeliveryOption.mode) && Intrinsics.areEqual((Object) this.location, (Object) orderV3DeliveryOption.location) && Intrinsics.areEqual((Object) this.slotInfo, (Object) orderV3DeliveryOption.slotInfo) && Intrinsics.areEqual((Object) this.shippingType, (Object) orderV3DeliveryOption.shippingType);
    }

    @C12580l
    public final String getLocation() {
        return this.location;
    }

    @C12580l
    public final String getMode() {
        return this.mode;
    }

    @C12580l
    public final OrderV3ShippingType getShippingType() {
        return this.shippingType;
    }

    @C12580l
    public final OrderV3SlotInfo getSlotInfo() {
        return this.slotInfo;
    }

    public int hashCode() {
        String str = this.mode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        OrderV3SlotInfo orderV3SlotInfo = this.slotInfo;
        int hashCode3 = (hashCode2 + (orderV3SlotInfo == null ? 0 : orderV3SlotInfo.hashCode())) * 31;
        OrderV3ShippingType orderV3ShippingType = this.shippingType;
        if (orderV3ShippingType != null) {
            i = orderV3ShippingType.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.mode;
        String str2 = this.location;
        OrderV3SlotInfo orderV3SlotInfo = this.slotInfo;
        OrderV3ShippingType orderV3ShippingType = this.shippingType;
        return "OrderV3DeliveryOption(mode=" + str + ", location=" + str2 + ", slotInfo=" + orderV3SlotInfo + ", shippingType=" + orderV3ShippingType + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.mode);
        parcel.writeString(this.location);
        OrderV3SlotInfo orderV3SlotInfo = this.slotInfo;
        if (orderV3SlotInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3SlotInfo.writeToParcel(parcel, i);
        }
        OrderV3ShippingType orderV3ShippingType = this.shippingType;
        if (orderV3ShippingType == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        orderV3ShippingType.writeToParcel(parcel, i);
    }
}
