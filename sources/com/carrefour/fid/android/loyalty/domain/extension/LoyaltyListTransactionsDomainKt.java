package com.carrefour.fid.android.loyalty.domain.extension;

import com.carrefour.fid.android.loyalty.data.models.entities.BalancesResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.ExpiryBalanceResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyListTransactionsResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.TransactionsResponse;
import com.carrefour.fid.android.loyalty.domain.models.BalanceDomain;
import com.carrefour.fid.android.loyalty.domain.models.ExpiryBalanceDomain;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain;
import com.carrefour.fid.android.loyalty.domain.models.TransactionsDomain;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, mo22516d2 = {"toDomain", "Lcom/carrefour/fid/android/loyalty/domain/models/BalanceDomain;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/BalancesResponse;", "Lcom/carrefour/fid/android/loyalty/domain/models/ExpiryBalanceDomain;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/ExpiryBalanceResponse;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyListTransactionsDomain;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyListTransactionsResponse;", "Lcom/carrefour/fid/android/loyalty/domain/models/TransactionsDomain;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/TransactionsResponse;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLoyaltyListTransactionsDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyListTransactionsDomain.kt\ncom/carrefour/fid/android/loyalty/domain/extension/LoyaltyListTransactionsDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,3:39\n1549#2:42\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 LoyaltyListTransactionsDomain.kt\ncom/carrefour/fid/android/loyalty/domain/extension/LoyaltyListTransactionsDomainKt\n*L\n14#1:38\n14#1:39,3\n30#1:42\n30#1:43,3\n*E\n"})
public final class LoyaltyListTransactionsDomainKt {
    @C12579k
    public static final LoyaltyListTransactionsDomain toDomain(@C12579k LoyaltyListTransactionsResponse loyaltyListTransactionsResponse) {
        Intrinsics.checkNotNullParameter(loyaltyListTransactionsResponse, "<this>");
        BalanceDomain domain = toDomain(loyaltyListTransactionsResponse.getBalances());
        Iterable<TransactionsResponse> transactions = loyaltyListTransactionsResponse.getTransactions();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(transactions, 10));
        for (TransactionsResponse domain2 : transactions) {
            arrayList.add(toDomain(domain2));
        }
        return new LoyaltyListTransactionsDomain(domain, arrayList);
    }

    @C12579k
    public static final TransactionsDomain toDomain(@C12579k TransactionsResponse transactionsResponse) {
        Intrinsics.checkNotNullParameter(transactionsResponse, "<this>");
        return new TransactionsDomain(transactionsResponse.getId(), transactionsResponse.getCreationDate(), transactionsResponse.getAmount(), transactionsResponse.getCardId(), transactionsResponse.getCanal(), transactionsResponse.getStoreId(), transactionsResponse.getCashRegister(), transactionsResponse.getStatus());
    }

    @C12579k
    public static final BalanceDomain toDomain(@C12579k BalancesResponse balancesResponse) {
        Intrinsics.checkNotNullParameter(balancesResponse, "<this>");
        double balance = balancesResponse.getBalance();
        Iterable<ExpiryBalanceResponse> expiryBalances = balancesResponse.getExpiryBalances();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(expiryBalances, 10));
        for (ExpiryBalanceResponse domain : expiryBalances) {
            arrayList.add(toDomain(domain));
        }
        return new BalanceDomain(balance, arrayList);
    }

    @C12579k
    public static final ExpiryBalanceDomain toDomain(@C12579k ExpiryBalanceResponse expiryBalanceResponse) {
        Intrinsics.checkNotNullParameter(expiryBalanceResponse, "<this>");
        return new ExpiryBalanceDomain(expiryBalanceResponse.getDate(), expiryBalanceResponse.getBalance());
    }
}
