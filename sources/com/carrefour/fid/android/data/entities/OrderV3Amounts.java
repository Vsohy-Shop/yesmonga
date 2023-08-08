package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "Landroid/os/Parcelable;", "", "getScaledAmount", "", "component1", "", "component2", "component3", "currency", "scale", "unscaledAmount", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "I", "getScale", "()I", "getUnscaledAmount", "<init>", "(Ljava/lang/String;II)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3Amounts implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3Amounts> CREATOR = new C36404a();
    @C33608c("currency")
    @C12579k
    private final String currency;
    @C33608c("scale")
    private final int scale;
    @C33608c("unscaled_amount")
    private final int unscaledAmount;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3Amounts$a */
    public static final class C36404a implements Parcelable.Creator<OrderV3Amounts> {
        @C12579k
        /* renamed from: a */
        public final OrderV3Amounts createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3Amounts(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3Amounts[] newArray(int i) {
            return new OrderV3Amounts[i];
        }
    }

    public OrderV3Amounts(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        this.currency = str;
        this.scale = i;
        this.unscaledAmount = i2;
    }

    public static /* synthetic */ OrderV3Amounts copy$default(OrderV3Amounts orderV3Amounts, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = orderV3Amounts.currency;
        }
        if ((i3 & 2) != 0) {
            i = orderV3Amounts.scale;
        }
        if ((i3 & 4) != 0) {
            i2 = orderV3Amounts.unscaledAmount;
        }
        return orderV3Amounts.copy(str, i, i2);
    }

    @C12579k
    public final String component1() {
        return this.currency;
    }

    public final int component2() {
        return this.scale;
    }

    public final int component3() {
        return this.unscaledAmount;
    }

    @C12579k
    public final OrderV3Amounts copy(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        return new OrderV3Amounts(str, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3Amounts)) {
            return false;
        }
        OrderV3Amounts orderV3Amounts = (OrderV3Amounts) obj;
        return Intrinsics.areEqual((Object) this.currency, (Object) orderV3Amounts.currency) && this.scale == orderV3Amounts.scale && this.unscaledAmount == orderV3Amounts.unscaledAmount;
    }

    @C12579k
    public final String getCurrency() {
        return this.currency;
    }

    public final int getScale() {
        return this.scale;
    }

    public final double getScaledAmount() {
        return ((double) this.unscaledAmount) / Math.pow(10.0d, (double) this.scale);
    }

    public final int getUnscaledAmount() {
        return this.unscaledAmount;
    }

    public int hashCode() {
        return (((this.currency.hashCode() * 31) + Integer.hashCode(this.scale)) * 31) + Integer.hashCode(this.unscaledAmount);
    }

    @C12579k
    public String toString() {
        String str = this.currency;
        int i = this.scale;
        int i2 = this.unscaledAmount;
        return "OrderV3Amounts(currency=" + str + ", scale=" + i + ", unscaledAmount=" + i2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.currency);
        parcel.writeInt(this.scale);
        parcel.writeInt(this.unscaledAmount);
    }
}
