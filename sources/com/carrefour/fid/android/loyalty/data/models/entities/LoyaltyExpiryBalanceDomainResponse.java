package com.carrefour.fid.android.loyalty.data.models.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyExpiryBalanceDomainResponse;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "balance", "date", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "getBalance", "()D", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class LoyaltyExpiryBalanceDomainResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyExpiryBalanceDomainResponse> CREATOR = new Creator();
    @C33608c("balance")
    private final double balance;
    @C33608c("date")
    @C12579k
    private final String date;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyExpiryBalanceDomainResponse> {
        @C12579k
        public final LoyaltyExpiryBalanceDomainResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoyaltyExpiryBalanceDomainResponse(parcel.readDouble(), parcel.readString());
        }

        @C12579k
        public final LoyaltyExpiryBalanceDomainResponse[] newArray(int i) {
            return new LoyaltyExpiryBalanceDomainResponse[i];
        }
    }

    public LoyaltyExpiryBalanceDomainResponse(double d, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        this.balance = d;
        this.date = str;
    }

    public static /* synthetic */ LoyaltyExpiryBalanceDomainResponse copy$default(LoyaltyExpiryBalanceDomainResponse loyaltyExpiryBalanceDomainResponse, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = loyaltyExpiryBalanceDomainResponse.balance;
        }
        if ((i & 2) != 0) {
            str = loyaltyExpiryBalanceDomainResponse.date;
        }
        return loyaltyExpiryBalanceDomainResponse.copy(d, str);
    }

    public final double component1() {
        return this.balance;
    }

    @C12579k
    public final String component2() {
        return this.date;
    }

    @C12579k
    public final LoyaltyExpiryBalanceDomainResponse copy(double d, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        return new LoyaltyExpiryBalanceDomainResponse(d, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyExpiryBalanceDomainResponse)) {
            return false;
        }
        LoyaltyExpiryBalanceDomainResponse loyaltyExpiryBalanceDomainResponse = (LoyaltyExpiryBalanceDomainResponse) obj;
        return Double.compare(this.balance, loyaltyExpiryBalanceDomainResponse.balance) == 0 && Intrinsics.areEqual((Object) this.date, (Object) loyaltyExpiryBalanceDomainResponse.date);
    }

    public final double getBalance() {
        return this.balance;
    }

    @C12579k
    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return (Double.hashCode(this.balance) * 31) + this.date.hashCode();
    }

    @C12579k
    public String toString() {
        double d = this.balance;
        String str = this.date;
        return "LoyaltyExpiryBalanceDomainResponse(balance=" + d + ", date=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.balance);
        parcel.writeString(this.date);
    }
}
