package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Double;", "", "component2", "totalLoyaltyAmount", "loyaltyCardNumber", "copy", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyModel;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Double;", "getTotalLoyaltyAmount", "Ljava/lang/String;", "getLoyaltyCardNumber", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoyaltyModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyModel> CREATOR = new Creator();
    @C12580l
    private final String loyaltyCardNumber;
    @C12580l
    private final Double totalLoyaltyAmount;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyModel> {
        @C12579k
        public final LoyaltyModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoyaltyModel(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        @C12579k
        public final LoyaltyModel[] newArray(int i) {
            return new LoyaltyModel[i];
        }
    }

    public LoyaltyModel(@C12580l Double d, @C12580l String str) {
        this.totalLoyaltyAmount = d;
        this.loyaltyCardNumber = str;
    }

    public static /* synthetic */ LoyaltyModel copy$default(LoyaltyModel loyaltyModel, Double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = loyaltyModel.totalLoyaltyAmount;
        }
        if ((i & 2) != 0) {
            str = loyaltyModel.loyaltyCardNumber;
        }
        return loyaltyModel.copy(d, str);
    }

    @C12580l
    public final Double component1() {
        return this.totalLoyaltyAmount;
    }

    @C12580l
    public final String component2() {
        return this.loyaltyCardNumber;
    }

    @C12579k
    public final LoyaltyModel copy(@C12580l Double d, @C12580l String str) {
        return new LoyaltyModel(d, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyModel)) {
            return false;
        }
        LoyaltyModel loyaltyModel = (LoyaltyModel) obj;
        return Intrinsics.areEqual((Object) this.totalLoyaltyAmount, (Object) loyaltyModel.totalLoyaltyAmount) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) loyaltyModel.loyaltyCardNumber);
    }

    @C12580l
    public final String getLoyaltyCardNumber() {
        return this.loyaltyCardNumber;
    }

    @C12580l
    public final Double getTotalLoyaltyAmount() {
        return this.totalLoyaltyAmount;
    }

    public int hashCode() {
        Double d = this.totalLoyaltyAmount;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.loyaltyCardNumber;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Double d = this.totalLoyaltyAmount;
        String str = this.loyaltyCardNumber;
        return "LoyaltyModel(totalLoyaltyAmount=" + d + ", loyaltyCardNumber=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d = this.totalLoyaltyAmount;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.loyaltyCardNumber);
    }
}
