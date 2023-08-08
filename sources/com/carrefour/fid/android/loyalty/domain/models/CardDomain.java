package com.carrefour.fid.android.loyalty.domain.models;

import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/models/CardDomain;", "", "cardNumber", "", "cardType", "cardStatus", "Lcom/carrefour/fid/android/loyalty/domain/models/CardStatus;", "porterType", "codeSecretFlag", "", "idFoyer", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/domain/models/CardStatus;Ljava/lang/String;ZLjava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCardStatus", "()Lcom/carrefour/fid/android/loyalty/domain/models/CardStatus;", "getCardType", "getCodeSecretFlag", "()Z", "getIdFoyer", "getPorterType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CardDomain {
    @C12579k
    private final String cardNumber;
    @C12579k
    private final CardStatus cardStatus;
    @C12579k
    private final String cardType;
    private final boolean codeSecretFlag;
    @C12579k
    private final String idFoyer;
    @C12579k
    private final String porterType;

    public CardDomain(@C12579k String str, @C12579k String str2, @C12579k CardStatus cardStatus2, @C12579k String str3, boolean z, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        Intrinsics.checkNotNullParameter(str2, "cardType");
        Intrinsics.checkNotNullParameter(cardStatus2, "cardStatus");
        Intrinsics.checkNotNullParameter(str3, "porterType");
        Intrinsics.checkNotNullParameter(str4, "idFoyer");
        this.cardNumber = str;
        this.cardType = str2;
        this.cardStatus = cardStatus2;
        this.porterType = str3;
        this.codeSecretFlag = z;
        this.idFoyer = str4;
    }

    public static /* synthetic */ CardDomain copy$default(CardDomain cardDomain, String str, String str2, CardStatus cardStatus2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDomain.cardNumber;
        }
        if ((i & 2) != 0) {
            str2 = cardDomain.cardType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            cardStatus2 = cardDomain.cardStatus;
        }
        CardStatus cardStatus3 = cardStatus2;
        if ((i & 8) != 0) {
            str3 = cardDomain.porterType;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = cardDomain.codeSecretFlag;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = cardDomain.idFoyer;
        }
        return cardDomain.copy(str, str5, cardStatus3, str6, z2, str4);
    }

    @C12579k
    public final String component1() {
        return this.cardNumber;
    }

    @C12579k
    public final String component2() {
        return this.cardType;
    }

    @C12579k
    public final CardStatus component3() {
        return this.cardStatus;
    }

    @C12579k
    public final String component4() {
        return this.porterType;
    }

    public final boolean component5() {
        return this.codeSecretFlag;
    }

    @C12579k
    public final String component6() {
        return this.idFoyer;
    }

    @C12579k
    public final CardDomain copy(@C12579k String str, @C12579k String str2, @C12579k CardStatus cardStatus2, @C12579k String str3, boolean z, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        Intrinsics.checkNotNullParameter(str2, "cardType");
        Intrinsics.checkNotNullParameter(cardStatus2, "cardStatus");
        Intrinsics.checkNotNullParameter(str3, "porterType");
        Intrinsics.checkNotNullParameter(str4, "idFoyer");
        return new CardDomain(str, str2, cardStatus2, str3, z, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDomain)) {
            return false;
        }
        CardDomain cardDomain = (CardDomain) obj;
        return Intrinsics.areEqual((Object) this.cardNumber, (Object) cardDomain.cardNumber) && Intrinsics.areEqual((Object) this.cardType, (Object) cardDomain.cardType) && this.cardStatus == cardDomain.cardStatus && Intrinsics.areEqual((Object) this.porterType, (Object) cardDomain.porterType) && this.codeSecretFlag == cardDomain.codeSecretFlag && Intrinsics.areEqual((Object) this.idFoyer, (Object) cardDomain.idFoyer);
    }

    @C12579k
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @C12579k
    public final CardStatus getCardStatus() {
        return this.cardStatus;
    }

    @C12579k
    public final String getCardType() {
        return this.cardType;
    }

    public final boolean getCodeSecretFlag() {
        return this.codeSecretFlag;
    }

    @C12579k
    public final String getIdFoyer() {
        return this.idFoyer;
    }

    @C12579k
    public final String getPorterType() {
        return this.porterType;
    }

    public int hashCode() {
        int hashCode = ((((((this.cardNumber.hashCode() * 31) + this.cardType.hashCode()) * 31) + this.cardStatus.hashCode()) * 31) + this.porterType.hashCode()) * 31;
        boolean z = this.codeSecretFlag;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.idFoyer.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.cardNumber;
        String str2 = this.cardType;
        CardStatus cardStatus2 = this.cardStatus;
        String str3 = this.porterType;
        boolean z = this.codeSecretFlag;
        String str4 = this.idFoyer;
        return "CardDomain(cardNumber=" + str + ", cardType=" + str2 + ", cardStatus=" + cardStatus2 + ", porterType=" + str3 + ", codeSecretFlag=" + z + ", idFoyer=" + str4 + ")";
    }
}
