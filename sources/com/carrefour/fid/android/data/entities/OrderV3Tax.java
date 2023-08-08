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
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3Tax;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component3", "code", "label", "value", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getLabel", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getValue", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3Tax implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3Tax> CREATOR = new C36416a();
    @C33608c("code")
    @C12579k
    private final String code;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("value")
    @C12579k
    private final OrderV3Amounts value;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3Tax$a */
    public static final class C36416a implements Parcelable.Creator<OrderV3Tax> {
        @C12579k
        /* renamed from: a */
        public final OrderV3Tax createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3Tax(parcel.readString(), parcel.readString(), OrderV3Amounts.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3Tax[] newArray(int i) {
            return new OrderV3Tax[i];
        }
    }

    public OrderV3Tax(@C12579k String str, @C12579k String str2, @C12579k OrderV3Amounts orderV3Amounts) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(orderV3Amounts, "value");
        this.code = str;
        this.label = str2;
        this.value = orderV3Amounts;
    }

    public static /* synthetic */ OrderV3Tax copy$default(OrderV3Tax orderV3Tax, String str, String str2, OrderV3Amounts orderV3Amounts, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV3Tax.code;
        }
        if ((i & 2) != 0) {
            str2 = orderV3Tax.label;
        }
        if ((i & 4) != 0) {
            orderV3Amounts = orderV3Tax.value;
        }
        return orderV3Tax.copy(str, str2, orderV3Amounts);
    }

    @C12579k
    public final String component1() {
        return this.code;
    }

    @C12579k
    public final String component2() {
        return this.label;
    }

    @C12579k
    public final OrderV3Amounts component3() {
        return this.value;
    }

    @C12579k
    public final OrderV3Tax copy(@C12579k String str, @C12579k String str2, @C12579k OrderV3Amounts orderV3Amounts) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(orderV3Amounts, "value");
        return new OrderV3Tax(str, str2, orderV3Amounts);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3Tax)) {
            return false;
        }
        OrderV3Tax orderV3Tax = (OrderV3Tax) obj;
        return Intrinsics.areEqual((Object) this.code, (Object) orderV3Tax.code) && Intrinsics.areEqual((Object) this.label, (Object) orderV3Tax.label) && Intrinsics.areEqual((Object) this.value, (Object) orderV3Tax.value);
    }

    @C12579k
    public final String getCode() {
        return this.code;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    @C12579k
    public final OrderV3Amounts getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.code;
        String str2 = this.label;
        OrderV3Amounts orderV3Amounts = this.value;
        return "OrderV3Tax(code=" + str + ", label=" + str2 + ", value=" + orderV3Amounts + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.code);
        parcel.writeString(this.label);
        this.value.writeToParcel(parcel, i);
    }
}
