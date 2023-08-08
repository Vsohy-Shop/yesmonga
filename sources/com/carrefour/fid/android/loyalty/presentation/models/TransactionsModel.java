package com.carrefour.fid.android.loyalty.presentation.models;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "", "balances", "Lcom/carrefour/fid/android/loyalty/presentation/models/BalanceModel;", "transactions", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionModel;", "(Lcom/carrefour/fid/android/loyalty/presentation/models/BalanceModel;Ljava/util/List;)V", "getBalances", "()Lcom/carrefour/fid/android/loyalty/presentation/models/BalanceModel;", "getTransactions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TransactionsModel {
    @C12579k
    private final BalanceModel balances;
    @C12579k
    private final List<TransactionModel> transactions;

    public TransactionsModel(@C12579k BalanceModel balanceModel, @C12579k List<TransactionModel> list) {
        Intrinsics.checkNotNullParameter(balanceModel, "balances");
        Intrinsics.checkNotNullParameter(list, "transactions");
        this.balances = balanceModel;
        this.transactions = list;
    }

    public static /* synthetic */ TransactionsModel copy$default(TransactionsModel transactionsModel, BalanceModel balanceModel, List<TransactionModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            balanceModel = transactionsModel.balances;
        }
        if ((i & 2) != 0) {
            list = transactionsModel.transactions;
        }
        return transactionsModel.copy(balanceModel, list);
    }

    @C12579k
    public final BalanceModel component1() {
        return this.balances;
    }

    @C12579k
    public final List<TransactionModel> component2() {
        return this.transactions;
    }

    @C12579k
    public final TransactionsModel copy(@C12579k BalanceModel balanceModel, @C12579k List<TransactionModel> list) {
        Intrinsics.checkNotNullParameter(balanceModel, "balances");
        Intrinsics.checkNotNullParameter(list, "transactions");
        return new TransactionsModel(balanceModel, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionsModel)) {
            return false;
        }
        TransactionsModel transactionsModel = (TransactionsModel) obj;
        return Intrinsics.areEqual((Object) this.balances, (Object) transactionsModel.balances) && Intrinsics.areEqual((Object) this.transactions, (Object) transactionsModel.transactions);
    }

    @C12579k
    public final BalanceModel getBalances() {
        return this.balances;
    }

    @C12579k
    public final List<TransactionModel> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        return (this.balances.hashCode() * 31) + this.transactions.hashCode();
    }

    @C12579k
    public String toString() {
        BalanceModel balanceModel = this.balances;
        List<TransactionModel> list = this.transactions;
        return "TransactionsModel(balances=" + balanceModel + ", transactions=" + list + ")";
    }
}
