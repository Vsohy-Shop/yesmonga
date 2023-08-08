package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23948c;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3ShippingType;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component1", "Lcom/carrefour/fid/android/data/entities/DlvCode;", "component2", "", "component3", "Lcom/carrefour/fid/android/data/entities/OrderV3ShippingDetails;", "component4", "amount", "code", "label", "details", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getAmount", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "Lcom/carrefour/fid/android/data/entities/DlvCode;", "getCode", "()Lcom/carrefour/fid/android/data/entities/DlvCode;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/data/entities/OrderV3ShippingDetails;", "getDetails", "()Lcom/carrefour/fid/android/data/entities/OrderV3ShippingDetails;", "<init>", "(Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/DlvCode;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3ShippingDetails;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3ShippingType implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3ShippingType> CREATOR = new C36413a();
    @C33608c("amount")
    @C12579k
    private final OrderV3Amounts amount;
    @C33608c("code")
    @C12579k
    private final DlvCode code;
    @C33608c("details")
    @C12579k
    private final OrderV3ShippingDetails details;
    @C33608c("label")
    @C12579k
    private final String label;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3ShippingType$a */
    public static final class C36413a implements Parcelable.Creator<OrderV3ShippingType> {
        @C12579k
        /* renamed from: a */
        public final OrderV3ShippingType createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3ShippingType(OrderV3Amounts.CREATOR.createFromParcel(parcel), DlvCode.valueOf(parcel.readString()), parcel.readString(), OrderV3ShippingDetails.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3ShippingType[] newArray(int i) {
            return new OrderV3ShippingType[i];
        }
    }

    public OrderV3ShippingType(@C12579k OrderV3Amounts orderV3Amounts, @C12579k DlvCode dlvCode, @C12579k String str, @C12579k OrderV3ShippingDetails orderV3ShippingDetails) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "amount");
        Intrinsics.checkNotNullParameter(dlvCode, "code");
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(orderV3ShippingDetails, C23948c.f60118a);
        this.amount = orderV3Amounts;
        this.code = dlvCode;
        this.label = str;
        this.details = orderV3ShippingDetails;
    }

    public static /* synthetic */ OrderV3ShippingType copy$default(OrderV3ShippingType orderV3ShippingType, OrderV3Amounts orderV3Amounts, DlvCode dlvCode, String str, OrderV3ShippingDetails orderV3ShippingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            orderV3Amounts = orderV3ShippingType.amount;
        }
        if ((i & 2) != 0) {
            dlvCode = orderV3ShippingType.code;
        }
        if ((i & 4) != 0) {
            str = orderV3ShippingType.label;
        }
        if ((i & 8) != 0) {
            orderV3ShippingDetails = orderV3ShippingType.details;
        }
        return orderV3ShippingType.copy(orderV3Amounts, dlvCode, str, orderV3ShippingDetails);
    }

    @C12579k
    public final OrderV3Amounts component1() {
        return this.amount;
    }

    @C12579k
    public final DlvCode component2() {
        return this.code;
    }

    @C12579k
    public final String component3() {
        return this.label;
    }

    @C12579k
    public final OrderV3ShippingDetails component4() {
        return this.details;
    }

    @C12579k
    public final OrderV3ShippingType copy(@C12579k OrderV3Amounts orderV3Amounts, @C12579k DlvCode dlvCode, @C12579k String str, @C12579k OrderV3ShippingDetails orderV3ShippingDetails) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "amount");
        Intrinsics.checkNotNullParameter(dlvCode, "code");
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(orderV3ShippingDetails, C23948c.f60118a);
        return new OrderV3ShippingType(orderV3Amounts, dlvCode, str, orderV3ShippingDetails);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3ShippingType)) {
            return false;
        }
        OrderV3ShippingType orderV3ShippingType = (OrderV3ShippingType) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) orderV3ShippingType.amount) && this.code == orderV3ShippingType.code && Intrinsics.areEqual((Object) this.label, (Object) orderV3ShippingType.label) && Intrinsics.areEqual((Object) this.details, (Object) orderV3ShippingType.details);
    }

    @C12579k
    public final OrderV3Amounts getAmount() {
        return this.amount;
    }

    @C12579k
    public final DlvCode getCode() {
        return this.code;
    }

    @C12579k
    public final OrderV3ShippingDetails getDetails() {
        return this.details;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (((((this.amount.hashCode() * 31) + this.code.hashCode()) * 31) + this.label.hashCode()) * 31) + this.details.hashCode();
    }

    @C12579k
    public String toString() {
        OrderV3Amounts orderV3Amounts = this.amount;
        DlvCode dlvCode = this.code;
        String str = this.label;
        OrderV3ShippingDetails orderV3ShippingDetails = this.details;
        return "OrderV3ShippingType(amount=" + orderV3Amounts + ", code=" + dlvCode + ", label=" + str + ", details=" + orderV3ShippingDetails + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.amount.writeToParcel(parcel, i);
        parcel.writeString(this.code.name());
        parcel.writeString(this.label);
        this.details.writeToParcel(parcel, i);
    }
}
