package com.carrefour.fid.android.loyalty.domain.models;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;", "", "accountNumber", "", "statusAccount", "Lcom/carrefour/fid/android/loyalty/domain/models/AccountStatus;", "cards", "", "Lcom/carrefour/fid/android/loyalty/domain/models/CardDomain;", "(Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/domain/models/AccountStatus;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getCards", "()Ljava/util/List;", "getStatusAccount", "()Lcom/carrefour/fid/android/loyalty/domain/models/AccountStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyMemberCardDomain {
    @C12579k
    private final String accountNumber;
    @C12579k
    private final List<CardDomain> cards;
    @C12579k
    private final AccountStatus statusAccount;

    public LoyaltyMemberCardDomain(@C12579k String str, @C12579k AccountStatus accountStatus, @C12579k List<CardDomain> list) {
        Intrinsics.checkNotNullParameter(str, "accountNumber");
        Intrinsics.checkNotNullParameter(accountStatus, "statusAccount");
        Intrinsics.checkNotNullParameter(list, "cards");
        this.accountNumber = str;
        this.statusAccount = accountStatus;
        this.cards = list;
    }

    public static /* synthetic */ LoyaltyMemberCardDomain copy$default(LoyaltyMemberCardDomain loyaltyMemberCardDomain, String str, AccountStatus accountStatus, List<CardDomain> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyMemberCardDomain.accountNumber;
        }
        if ((i & 2) != 0) {
            accountStatus = loyaltyMemberCardDomain.statusAccount;
        }
        if ((i & 4) != 0) {
            list = loyaltyMemberCardDomain.cards;
        }
        return loyaltyMemberCardDomain.copy(str, accountStatus, list);
    }

    @C12579k
    public final String component1() {
        return this.accountNumber;
    }

    @C12579k
    public final AccountStatus component2() {
        return this.statusAccount;
    }

    @C12579k
    public final List<CardDomain> component3() {
        return this.cards;
    }

    @C12579k
    public final LoyaltyMemberCardDomain copy(@C12579k String str, @C12579k AccountStatus accountStatus, @C12579k List<CardDomain> list) {
        Intrinsics.checkNotNullParameter(str, "accountNumber");
        Intrinsics.checkNotNullParameter(accountStatus, "statusAccount");
        Intrinsics.checkNotNullParameter(list, "cards");
        return new LoyaltyMemberCardDomain(str, accountStatus, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMemberCardDomain)) {
            return false;
        }
        LoyaltyMemberCardDomain loyaltyMemberCardDomain = (LoyaltyMemberCardDomain) obj;
        return Intrinsics.areEqual((Object) this.accountNumber, (Object) loyaltyMemberCardDomain.accountNumber) && this.statusAccount == loyaltyMemberCardDomain.statusAccount && Intrinsics.areEqual((Object) this.cards, (Object) loyaltyMemberCardDomain.cards);
    }

    @C12579k
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @C12579k
    public final List<CardDomain> getCards() {
        return this.cards;
    }

    @C12579k
    public final AccountStatus getStatusAccount() {
        return this.statusAccount;
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.statusAccount.hashCode()) * 31) + this.cards.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.accountNumber;
        AccountStatus accountStatus = this.statusAccount;
        List<CardDomain> list = this.cards;
        return "LoyaltyMemberCardDomain(accountNumber=" + str + ", statusAccount=" + accountStatus + ", cards=" + list + ")";
    }
}
