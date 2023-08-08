package com.carrefour.fid.android.loyalty.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/models/ExpiryBalanceDomain;", "", "date", "", "balance", "(Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "getDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExpiryBalanceDomain {
    @C12579k
    private final String balance;
    @C12579k
    private final String date;

    public ExpiryBalanceDomain(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "balance");
        this.date = str;
        this.balance = str2;
    }

    public static /* synthetic */ ExpiryBalanceDomain copy$default(ExpiryBalanceDomain expiryBalanceDomain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expiryBalanceDomain.date;
        }
        if ((i & 2) != 0) {
            str2 = expiryBalanceDomain.balance;
        }
        return expiryBalanceDomain.copy(str, str2);
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
    public final ExpiryBalanceDomain copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "balance");
        return new ExpiryBalanceDomain(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiryBalanceDomain)) {
            return false;
        }
        ExpiryBalanceDomain expiryBalanceDomain = (ExpiryBalanceDomain) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) expiryBalanceDomain.date) && Intrinsics.areEqual((Object) this.balance, (Object) expiryBalanceDomain.balance);
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
        return "ExpiryBalanceDomain(date=" + str + ", balance=" + str2 + ")";
    }
}
