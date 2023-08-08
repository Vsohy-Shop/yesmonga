package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/ExpiryBalanceResponse;", "Ljava/io/Serializable;", "date", "", "balance", "(Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "getDate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ExpiryBalanceResponse implements Serializable {
    @C33608c("balance")
    @C12579k
    private final String balance;
    @C33608c("date")
    @C12579k
    private final String date;

    public ExpiryBalanceResponse(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "balance");
        this.date = str;
        this.balance = str2;
    }

    public static /* synthetic */ ExpiryBalanceResponse copy$default(ExpiryBalanceResponse expiryBalanceResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expiryBalanceResponse.date;
        }
        if ((i & 2) != 0) {
            str2 = expiryBalanceResponse.balance;
        }
        return expiryBalanceResponse.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.date;
    }

    @C12579k
    public final String component2() {
        return this.balance;
    }

    @C12579k
    public final ExpiryBalanceResponse copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "balance");
        return new ExpiryBalanceResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiryBalanceResponse)) {
            return false;
        }
        ExpiryBalanceResponse expiryBalanceResponse = (ExpiryBalanceResponse) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) expiryBalanceResponse.date) && Intrinsics.areEqual((Object) this.balance, (Object) expiryBalanceResponse.balance);
    }

    @C12579k
    public final String getBalance() {
        return this.balance;
    }

    @C12579k
    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.balance.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.date;
        String str2 = this.balance;
        return "ExpiryBalanceResponse(date=" + str + ", balance=" + str2 + ")";
    }
}
