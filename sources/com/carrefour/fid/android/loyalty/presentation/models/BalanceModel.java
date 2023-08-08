package com.carrefour.fid.android.loyalty.presentation.models;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/BalanceModel;", "", "balance", "", "expiryBalances", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/ExpiryBalanceModel;", "(DLjava/util/List;)V", "getBalance", "()D", "getExpiryBalances", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BalanceModel {
    private final double balance;
    @C12579k
    private final List<ExpiryBalanceModel> expiryBalances;

    public BalanceModel(double d, @C12579k List<ExpiryBalanceModel> list) {
        Intrinsics.checkNotNullParameter(list, "expiryBalances");
        this.balance = d;
        this.expiryBalances = list;
    }

    public static /* synthetic */ BalanceModel copy$default(BalanceModel balanceModel, double d, List<ExpiryBalanceModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = balanceModel.balance;
        }
        if ((i & 2) != 0) {
            list = balanceModel.expiryBalances;
        }
        return balanceModel.copy(d, list);
    }

    public final double component1() {
        return this.balance;
    }

    @C12579k
    public final List<ExpiryBalanceModel> component2() {
        return this.expiryBalances;
    }

    @C12579k
    public final BalanceModel copy(double d, @C12579k List<ExpiryBalanceModel> list) {
        Intrinsics.checkNotNullParameter(list, "expiryBalances");
        return new BalanceModel(d, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceModel)) {
            return false;
        }
        BalanceModel balanceModel = (BalanceModel) obj;
        return Double.compare(this.balance, balanceModel.balance) == 0 && Intrinsics.areEqual((Object) this.expiryBalances, (Object) balanceModel.expiryBalances);
    }

    public final double getBalance() {
        return this.balance;
    }

    @C12579k
    public final List<ExpiryBalanceModel> getExpiryBalances() {
        return this.expiryBalances;
    }

    public int hashCode() {
        return (Double.hashCode(this.balance) * 31) + this.expiryBalances.hashCode();
    }

    @C12579k
    public String toString() {
        double d = this.balance;
        List<ExpiryBalanceModel> list = this.expiryBalances;
        return "BalanceModel(balance=" + d + ", expiryBalances=" + list + ")";
    }
}
