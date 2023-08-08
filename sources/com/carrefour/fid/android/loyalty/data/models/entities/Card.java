package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/Card;", "", "cardNumber", "", "cardType", "cardStatus", "porterType", "codeSecretFlag", "idFoyer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCardStatus", "getCardType", "getCodeSecretFlag", "getIdFoyer", "getPorterType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class Card {
    @C33608c("num_carte")
    @C12580l
    private final String cardNumber;
    @C33608c("statut_carte")
    @C12580l
    private final String cardStatus;
    @C33608c("type_carte")
    @C12580l
    private final String cardType;
    @C33608c("codeSecret_flg")
    @C12580l
    private final String codeSecretFlag;
    @C33608c("id_foyer")
    @C12580l
    private final String idFoyer;
    @C33608c("type_porteur")
    @C12580l
    private final String porterType;

    public Card(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        this.cardNumber = str;
        this.cardType = str2;
        this.cardStatus = str3;
        this.porterType = str4;
        this.codeSecretFlag = str5;
        this.idFoyer = str6;
    }

    public static /* synthetic */ Card copy$default(Card card, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card.cardNumber;
        }
        if ((i & 2) != 0) {
            str2 = card.cardType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = card.cardStatus;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = card.porterType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = card.codeSecretFlag;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = card.idFoyer;
        }
        return card.copy(str, str7, str8, str9, str10, str6);
    }

    @C12580l
    public final String component1() {
        return this.cardNumber;
    }

    @C12580l
    public final String component2() {
        return this.cardType;
    }

    @C12580l
    public final String component3() {
        return this.cardStatus;
    }

    @C12580l
    public final String component4() {
        return this.porterType;
    }

    @C12580l
    public final String component5() {
        return this.codeSecretFlag;
    }

    @C12580l
    public final String component6() {
        return this.idFoyer;
    }

    @C12579k
    public final Card copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        return new Card(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual((Object) this.cardNumber, (Object) card.cardNumber) && Intrinsics.areEqual((Object) this.cardType, (Object) card.cardType) && Intrinsics.areEqual((Object) this.cardStatus, (Object) card.cardStatus) && Intrinsics.areEqual((Object) this.porterType, (Object) card.porterType) && Intrinsics.areEqual((Object) this.codeSecretFlag, (Object) card.codeSecretFlag) && Intrinsics.areEqual((Object) this.idFoyer, (Object) card.idFoyer);
    }

    @C12580l
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @C12580l
    public final String getCardStatus() {
        return this.cardStatus;
    }

    @C12580l
    public final String getCardType() {
        return this.cardType;
    }

    @C12580l
    public final String getCodeSecretFlag() {
        return this.codeSecretFlag;
    }

    @C12580l
    public final String getIdFoyer() {
        return this.idFoyer;
    }

    @C12580l
    public final String getPorterType() {
        return this.porterType;
    }

    public int hashCode() {
        String str = this.cardNumber;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.porterType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.codeSecretFlag;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idFoyer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    public String toString() {
        String str = this.cardNumber;
        String str2 = this.cardType;
        String str3 = this.cardStatus;
        String str4 = this.porterType;
        String str5 = this.codeSecretFlag;
        String str6 = this.idFoyer;
        return "Card(cardNumber=" + str + ", cardType=" + str2 + ", cardStatus=" + str3 + ", porterType=" + str4 + ", codeSecretFlag=" + str5 + ", idFoyer=" + str6 + ")";
    }
}
