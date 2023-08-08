package com.carrefour.fid.android.loyalty.presentation.models.extension;

import com.carrefour.fid.android.loyalty.domain.models.BalanceDomain;
import com.carrefour.fid.android.loyalty.domain.models.ExpiryBalanceDomain;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain;
import com.carrefour.fid.android.loyalty.domain.models.TransactionsDomain;
import com.carrefour.fid.android.loyalty.presentation.models.BalanceModel;
import com.carrefour.fid.android.loyalty.presentation.models.ExpiryBalanceModel;
import com.carrefour.fid.android.loyalty.presentation.models.TransactionModel;
import com.carrefour.fid.android.loyalty.presentation.models.TransactionsModel;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, mo22516d2 = {"toModel", "Lcom/carrefour/fid/android/loyalty/presentation/models/BalanceModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/BalanceDomain;", "Lcom/carrefour/fid/android/loyalty/presentation/models/ExpiryBalanceModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/ExpiryBalanceDomain;", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyListTransactionsDomain;", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionModel;", "Lcom/carrefour/fid/android/loyalty/domain/models/TransactionsDomain;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTransactionsModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionsModel.kt\ncom/carrefour/fid/android/loyalty/presentation/models/extension/TransactionsModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,3:39\n1549#2:42\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 TransactionsModel.kt\ncom/carrefour/fid/android/loyalty/presentation/models/extension/TransactionsModelKt\n*L\n14#1:38\n14#1:39,3\n30#1:42\n30#1:43,3\n*E\n"})
public final class TransactionsModelKt {
    @C12579k
    public static final TransactionsModel toModel(@C12579k LoyaltyListTransactionsDomain loyaltyListTransactionsDomain) {
        Intrinsics.checkNotNullParameter(loyaltyListTransactionsDomain, "<this>");
        BalanceModel model = toModel(loyaltyListTransactionsDomain.getBalances());
        Iterable<TransactionsDomain> transactions = loyaltyListTransactionsDomain.getTransactions();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(transactions, 10));
        for (TransactionsDomain model2 : transactions) {
            arrayList.add(toModel(model2));
        }
        return new TransactionsModel(model, arrayList);
    }

    @C12579k
    public static final TransactionModel toModel(@C12579k TransactionsDomain transactionsDomain) {
        Intrinsics.checkNotNullParameter(transactionsDomain, "<this>");
        return new TransactionModel(transactionsDomain.getId(), transactionsDomain.getCreationDate(), transactionsDomain.getAmount(), transactionsDomain.getCardId(), transactionsDomain.getCanal(), transactionsDomain.getStoreId(), transactionsDomain.getCashRegister(), transactionsDomain.getStatus());
    }

    @C12579k
    public static final BalanceModel toModel(@C12579k BalanceDomain balanceDomain) {
        Intrinsics.checkNotNullParameter(balanceDomain, "<this>");
        double balance = balanceDomain.getBalance();
        Iterable<ExpiryBalanceDomain> expiryBalances = balanceDomain.getExpiryBalances();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(expiryBalances, 10));
        for (ExpiryBalanceDomain model : expiryBalances) {
            arrayList.add(toModel(model));
        }
        return new BalanceModel(balance, arrayList);
    }

    @C12579k
    public static final ExpiryBalanceModel toModel(@C12579k ExpiryBalanceDomain expiryBalanceDomain) {
        Intrinsics.checkNotNullParameter(expiryBalanceDomain, "<this>");
        return new ExpiryBalanceModel(expiryBalanceDomain.getDate(), expiryBalanceDomain.getBalance());
    }
}
