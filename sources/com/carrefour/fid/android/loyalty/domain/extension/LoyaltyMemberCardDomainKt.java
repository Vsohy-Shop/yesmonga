package com.carrefour.fid.android.loyalty.domain.extension;

import com.carrefour.fid.android.loyalty.core.p061io.ActiveFidError;
import com.carrefour.fid.android.loyalty.core.p061io.TerminalError;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.loyalty.data.models.entities.Card;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardGetMemberResponse;
import com.carrefour.fid.android.loyalty.domain.models.AccountStatus;
import com.carrefour.fid.android.loyalty.domain.models.CardDomain;
import com.carrefour.fid.android.loyalty.domain.models.CardStatus;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain;
import com.google.android.gms.measurement.api.C30638a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0002\u001a \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00112\u0006\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u0014\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u0015\u001a\u00020\u0011*\u00020\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"getAccountStatusFromString", "Lcom/carrefour/fid/android/loyalty/domain/models/AccountStatus;", "input", "", "getCardStatusFromString", "Lcom/carrefour/fid/android/loyalty/domain/models/CardStatus;", "getCodeSecretFlag", "", "isPassCardInactive", "card", "Lcom/carrefour/fid/android/loyalty/domain/models/CardDomain;", "transformCard", "", "cards", "Lcom/carrefour/fid/android/loyalty/data/models/entities/Card;", "activeFidOrTerminalError", "Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;", "(Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;Lcom/carrefour/fid/android/loyalty/domain/models/CardDomain;)Ljava/lang/Object;", "isTemporaryStatusAccount", "isValidCard", "toDomain", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardGetMemberResponse;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLoyaltyMemberCardDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyMemberCardDomain.kt\ncom/carrefour/fid/android/loyalty/domain/extension/LoyaltyMemberCardDomainKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1#2:73\n1549#3:74\n1620#3,3:75\n*S KotlinDebug\n*F\n+ 1 LoyaltyMemberCardDomain.kt\ncom/carrefour/fid/android/loyalty/domain/extension/LoyaltyMemberCardDomainKt\n*L\n42#1:74\n42#1:75,3\n*E\n"})
public final class LoyaltyMemberCardDomainKt {
    @C12579k
    public static final Object activeFidOrTerminalError(@C12579k LoyaltyMemberCardDomain loyaltyMemberCardDomain, @C12579k CardDomain cardDomain) {
        Throwable th;
        Intrinsics.checkNotNullParameter(loyaltyMemberCardDomain, "<this>");
        Intrinsics.checkNotNullParameter(cardDomain, "card");
        Result.C10852a aVar = Result.f28060a;
        if (cardDomain.getCodeSecretFlag()) {
            th = new TerminalError("Error Terminal");
        } else {
            th = new ActiveFidError("Error active fid");
        }
        return Result.m38702b(C11661u0.m45734a(th));
    }

    private static final AccountStatus getAccountStatusFromString(String str) {
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3056653) {
            if (hashCode != 92645679) {
                if (hashCode == 219293280 && lowerCase.equals("provisoire")) {
                    return AccountStatus.Temporary;
                }
            } else if (lowerCase.equals("actif")) {
                return AccountStatus.Actif;
            }
        } else if (lowerCase.equals("clos")) {
            return AccountStatus.Closed;
        }
        return AccountStatus.Unknown;
    }

    private static final CardStatus getCardStatusFromString(String str) {
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) C30638a.C30639a.f73205n)) {
            return CardStatus.Active;
        }
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "inactive")) {
            return CardStatus.Inactive;
        }
        return CardStatus.Unknown;
    }

    private static final boolean getCodeSecretFlag(String str) {
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "y", false, 2, (Object) null);
    }

    public static final boolean isPassCardInactive(@C12579k CardDomain cardDomain) {
        Intrinsics.checkNotNullParameter(cardDomain, "card");
        if (!C11622t.equals(cardDomain.getCardType(), CardType.PASS.getValue(), true) || cardDomain.getCodeSecretFlag()) {
            return false;
        }
        return true;
    }

    public static final boolean isTemporaryStatusAccount(@C12579k LoyaltyMemberCardDomain loyaltyMemberCardDomain, @C12579k CardDomain cardDomain) {
        Intrinsics.checkNotNullParameter(loyaltyMemberCardDomain, "<this>");
        Intrinsics.checkNotNullParameter(cardDomain, "card");
        if (loyaltyMemberCardDomain.getStatusAccount() == AccountStatus.Temporary && cardDomain.getCardStatus() == CardStatus.Active) {
            return true;
        }
        return false;
    }

    public static final boolean isValidCard(@C12579k LoyaltyMemberCardDomain loyaltyMemberCardDomain, @C12579k CardDomain cardDomain) {
        Intrinsics.checkNotNullParameter(loyaltyMemberCardDomain, "<this>");
        Intrinsics.checkNotNullParameter(cardDomain, "card");
        if (loyaltyMemberCardDomain.getStatusAccount() == AccountStatus.Actif && cardDomain.getCardStatus() == CardStatus.Active && cardDomain.getCodeSecretFlag()) {
            return true;
        }
        return false;
    }

    @C12579k
    public static final LoyaltyMemberCardDomain toDomain(@C12579k LoyaltyCardGetMemberResponse loyaltyCardGetMemberResponse) {
        List<CardDomain> list;
        Intrinsics.checkNotNullParameter(loyaltyCardGetMemberResponse, "<this>");
        String accountNumber = loyaltyCardGetMemberResponse.getAccountNumber();
        if (accountNumber == null) {
            accountNumber = new String();
        }
        String statusAccount = loyaltyCardGetMemberResponse.getStatusAccount();
        if (statusAccount == null) {
            statusAccount = new String();
        }
        AccountStatus accountStatusFromString = getAccountStatusFromString(statusAccount);
        List<Card> cards = loyaltyCardGetMemberResponse.getCards();
        if (cards == null || (list = transformCard(cards)) == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return new LoyaltyMemberCardDomain(accountNumber, accountStatusFromString, list);
    }

    private static final List<CardDomain> transformCard(List<Card> list) {
        Iterable<Card> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Card card : iterable) {
            String cardNumber = card.getCardNumber();
            if (cardNumber == null) {
                cardNumber = new String();
            }
            String str = cardNumber;
            String cardType = card.getCardType();
            if (cardType == null) {
                cardType = new String();
            }
            String str2 = cardType;
            String cardStatus = card.getCardStatus();
            if (cardStatus == null) {
                cardStatus = new String();
            }
            CardStatus cardStatusFromString = getCardStatusFromString(cardStatus);
            String porterType = card.getPorterType();
            if (porterType == null) {
                porterType = new String();
            }
            String str3 = porterType;
            String codeSecretFlag = card.getCodeSecretFlag();
            if (codeSecretFlag == null) {
                codeSecretFlag = new String();
            }
            boolean codeSecretFlag2 = getCodeSecretFlag(codeSecretFlag);
            String idFoyer = card.getIdFoyer();
            if (idFoyer == null) {
                idFoyer = new String();
            }
            arrayList.add(new CardDomain(str, str2, cardStatusFromString, str3, codeSecretFlag2, idFoyer));
        }
        return arrayList;
    }
}
