package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardGetMemberResponse;", "", "accountNumber", "", "statusAccount", "cards", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/Card;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getCards", "()Ljava/util/List;", "getStatusAccount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class LoyaltyCardGetMemberResponse {
    @C33608c("num_compte")
    @C12580l
    private final String accountNumber;
    @C12580l
    private final List<Card> cards;
    @C33608c("statut_compte")
    @C12580l
    private final String statusAccount;

    public LoyaltyCardGetMemberResponse(@C12580l String str, @C12580l String str2, @C12580l List<Card> list) {
        this.accountNumber = str;
        this.statusAccount = str2;
        this.cards = list;
    }

    public static /* synthetic */ LoyaltyCardGetMemberResponse copy$default(LoyaltyCardGetMemberResponse loyaltyCardGetMemberResponse, String str, String str2, List<Card> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyCardGetMemberResponse.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyCardGetMemberResponse.statusAccount;
        }
        if ((i & 4) != 0) {
            list = loyaltyCardGetMemberResponse.cards;
        }
        return loyaltyCardGetMemberResponse.copy(str, str2, list);
    }

    @C12580l
    public final String component1() {
        return this.accountNumber;
    }

    @C12580l
    public final String component2() {
        return this.statusAccount;
    }

    @C12580l
    public final List<Card> component3() {
        return this.cards;
    }

    @C12579k
    public final LoyaltyCardGetMemberResponse copy(@C12580l String str, @C12580l String str2, @C12580l List<Card> list) {
        return new LoyaltyCardGetMemberResponse(str, str2, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyCardGetMemberResponse)) {
            return false;
        }
        LoyaltyCardGetMemberResponse loyaltyCardGetMemberResponse = (LoyaltyCardGetMemberResponse) obj;
        return Intrinsics.areEqual((Object) this.accountNumber, (Object) loyaltyCardGetMemberResponse.accountNumber) && Intrinsics.areEqual((Object) this.statusAccount, (Object) loyaltyCardGetMemberResponse.statusAccount) && Intrinsics.areEqual((Object) this.cards, (Object) loyaltyCardGetMemberResponse.cards);
    }

    @C12580l
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @C12580l
    public final List<Card> getCards() {
        return this.cards;
    }

    @C12580l
    public final String getStatusAccount() {
        return this.statusAccount;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusAccount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Card> list = this.cards;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.accountNumber;
        String str2 = this.statusAccount;
        List<Card> list = this.cards;
        return "LoyaltyCardGetMemberResponse(accountNumber=" + str + ", statusAccount=" + str2 + ", cards=" + list + ")";
    }
}
