package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyListTransactionsResponse;", "Ljava/io/Serializable;", "balances", "Lcom/carrefour/fid/android/loyalty/data/models/entities/BalancesResponse;", "transactions", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/TransactionsResponse;", "(Lcom/carrefour/fid/android/loyalty/data/models/entities/BalancesResponse;Ljava/util/List;)V", "getBalances", "()Lcom/carrefour/fid/android/loyalty/data/models/entities/BalancesResponse;", "getTransactions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class LoyaltyListTransactionsResponse implements Serializable {
    @C33608c("balances")
    @C12579k
    private final BalancesResponse balances;
    @C33608c("transactions")
    @C12579k
    private final List<TransactionsResponse> transactions;

    public LoyaltyListTransactionsResponse(@C12579k BalancesResponse balancesResponse, @C12579k List<TransactionsResponse> list) {
        Intrinsics.checkNotNullParameter(balancesResponse, "balances");
        Intrinsics.checkNotNullParameter(list, "transactions");
        this.balances = balancesResponse;
        this.transactions = list;
    }

    public static /* synthetic */ LoyaltyListTransactionsResponse copy$default(LoyaltyListTransactionsResponse loyaltyListTransactionsResponse, BalancesResponse balancesResponse, List<TransactionsResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            balancesResponse = loyaltyListTransactionsResponse.balances;
        }
        if ((i & 2) != 0) {
            list = loyaltyListTransactionsResponse.transactions;
        }
        return loyaltyListTransactionsResponse.copy(balancesResponse, list);
    }

    @C12579k
    public final BalancesResponse component1() {
        return this.balances;
    }

    @C12579k
    public final List<TransactionsResponse> component2() {
        return this.transactions;
    }

    @C12579k
    public final LoyaltyListTransactionsResponse copy(@C12579k BalancesResponse balancesResponse, @C12579k List<TransactionsResponse> list) {
        Intrinsics.checkNotNullParameter(balancesResponse, "balances");
        Intrinsics.checkNotNullParameter(list, "transactions");
        return new LoyaltyListTransactionsResponse(balancesResponse, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyListTransactionsResponse)) {
            return false;
        }
        LoyaltyListTransactionsResponse loyaltyListTransactionsResponse = (LoyaltyListTransactionsResponse) obj;
        return Intrinsics.areEqual((Object) this.balances, (Object) loyaltyListTransactionsResponse.balances) && Intrinsics.areEqual((Object) this.transactions, (Object) loyaltyListTransactionsResponse.transactions);
    }

    @C12579k
    public final BalancesResponse getBalances() {
        return this.balances;
    }

    @C12579k
    public final List<TransactionsResponse> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        return (this.balances.hashCode() * 31) + this.transactions.hashCode();
    }

    @C12579k
    public String toString() {
        BalancesResponse balancesResponse = this.balances;
        List<TransactionsResponse> list = this.transactions;
        return "LoyaltyListTransactionsResponse(balances=" + balancesResponse + ", transactions=" + list + ")";
    }
}
