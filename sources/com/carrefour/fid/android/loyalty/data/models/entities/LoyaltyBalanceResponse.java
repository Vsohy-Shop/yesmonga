package com.carrefour.fid.android.loyalty.data.models.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyBalanceResponse;", "Landroid/os/Parcelable;", "", "component1", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyExpiryBalanceDomainResponse;", "component2", "balance", "expiryBalanceList", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "getBalance", "()D", "Ljava/util/List;", "getExpiryBalanceList", "()Ljava/util/List;", "<init>", "(DLjava/util/List;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class LoyaltyBalanceResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyBalanceResponse> CREATOR = new Creator();
    @C33608c("balance")
    private final double balance;
    @C33608c("expiry_balances")
    @C12580l
    private final List<LoyaltyExpiryBalanceDomainResponse> expiryBalanceList;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyBalanceResponse> {
        @C12579k
        public final LoyaltyBalanceResponse createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double readDouble = parcel.readDouble();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(LoyaltyExpiryBalanceDomainResponse.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new LoyaltyBalanceResponse(readDouble, arrayList);
        }

        @C12579k
        public final LoyaltyBalanceResponse[] newArray(int i) {
            return new LoyaltyBalanceResponse[i];
        }
    }

    public LoyaltyBalanceResponse(double d, @C12580l List<LoyaltyExpiryBalanceDomainResponse> list) {
        this.balance = d;
        this.expiryBalanceList = list;
    }

    public static /* synthetic */ LoyaltyBalanceResponse copy$default(LoyaltyBalanceResponse loyaltyBalanceResponse, double d, List<LoyaltyExpiryBalanceDomainResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = loyaltyBalanceResponse.balance;
        }
        if ((i & 2) != 0) {
            list = loyaltyBalanceResponse.expiryBalanceList;
        }
        return loyaltyBalanceResponse.copy(d, list);
    }

    public final double component1() {
        return this.balance;
    }

    @C12580l
    public final List<LoyaltyExpiryBalanceDomainResponse> component2() {
        return this.expiryBalanceList;
    }

    @C12579k
    public final LoyaltyBalanceResponse copy(double d, @C12580l List<LoyaltyExpiryBalanceDomainResponse> list) {
        return new LoyaltyBalanceResponse(d, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyBalanceResponse)) {
            return false;
        }
        LoyaltyBalanceResponse loyaltyBalanceResponse = (LoyaltyBalanceResponse) obj;
        return Double.compare(this.balance, loyaltyBalanceResponse.balance) == 0 && Intrinsics.areEqual((Object) this.expiryBalanceList, (Object) loyaltyBalanceResponse.expiryBalanceList);
    }

    public final double getBalance() {
        return this.balance;
    }

    @C12580l
    public final List<LoyaltyExpiryBalanceDomainResponse> getExpiryBalanceList() {
        return this.expiryBalanceList;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.balance) * 31;
        List<LoyaltyExpiryBalanceDomainResponse> list = this.expiryBalanceList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @C12579k
    public String toString() {
        double d = this.balance;
        List<LoyaltyExpiryBalanceDomainResponse> list = this.expiryBalanceList;
        return "LoyaltyBalanceResponse(balance=" + d + ", expiryBalanceList=" + list + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.balance);
        List<LoyaltyExpiryBalanceDomainResponse> list = this.expiryBalanceList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (LoyaltyExpiryBalanceDomainResponse writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
