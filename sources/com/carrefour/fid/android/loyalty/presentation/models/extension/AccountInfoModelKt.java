package com.carrefour.fid.android.loyalty.presentation.models.extension;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0002\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0001H\u0002\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\u0003\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, mo22516d2 = {"getFavorite", "Lcom/carrefour/fid/android/domain/models/account/Address;", "", "", "Lcom/carrefour/fid/android/domain/models/account/Phone;", "getLoyaltyCardId", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "toBffAddressInfo", "Lcom/carrefour/fid/android/loyalty/presentation/models/extension/BffAddressInfo;", "toCountryName", "toCreateOrAttachCardBody", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "loyaltyMembershipConsent", "Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAccountInfoModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoModel.kt\ncom/carrefour/fid/android/loyalty/presentation/models/extension/AccountInfoModelKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1#2:76\n288#3,2:77\n288#3,2:79\n288#3,2:81\n*S KotlinDebug\n*F\n+ 1 AccountInfoModel.kt\ncom/carrefour/fid/android/loyalty/presentation/models/extension/AccountInfoModelKt\n*L\n32#1:77,2\n36#1:79,2\n40#1:81,2\n*E\n"})
public final class AccountInfoModelKt {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r2 = r0.mo116741e();
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: getFavorite  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m173091getFavorite(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.account.Phone> r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x000b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r2.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.account.Phone r1 = (com.carrefour.fid.android.domain.models.account.Phone) r1
            boolean r1 = r1.mo116743f()
            if (r1 == 0) goto L_0x000b
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            com.carrefour.fid.android.domain.models.account.Phone r0 = (com.carrefour.fid.android.domain.models.account.Phone) r0
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r0.mo116741e()
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r2 = ""
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.models.extension.AccountInfoModelKt.m173091getFavorite(java.util.List):java.lang.String");
    }

    @C12580l
    public static final String getLoyaltyCardId(@C12579k AccountInfo accountInfo) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        Iterator it = accountInfo.mo116669w().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            UserCards userCards = (UserCards) obj;
            if (Intrinsics.areEqual((Object) userCards.mo116759h(), (Object) CardType.FID.getValue()) || Intrinsics.areEqual((Object) userCards.mo116759h(), (Object) CardType.PASS.getValue())) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        UserCards userCards2 = (UserCards) obj;
        if (userCards2 != null) {
            return userCards2.mo116763k();
        }
        return null;
    }

    private static final BffAddressInfo toBffAddressInfo(Address address) {
        String str;
        String str2;
        String str3;
        String J;
        String str4 = null;
        if (address != null) {
            str = address.mo116722w();
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = str5;
        }
        if (address != null) {
            str2 = address.mo116684I();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str5;
        }
        if (address != null) {
            str3 = address.mo116694S();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = str5;
        }
        if (!(address == null || (J = address.mo116685J()) == null)) {
            str4 = toCountryName(J);
        }
        if (str4 != null) {
            str5 = str4;
        }
        return new BffAddressInfo(str, str2, str3, str5);
    }

    @C12579k
    public static final String toCountryName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case 2083:
                if (!str.equals("AD")) {
                    return "France";
                }
                return "Andorre";
            case 2115:
                if (!str.equals("BE")) {
                    return "France";
                }
                return "Belgique";
            case 2149:
                if (!str.equals("CH")) {
                    return "France";
                }
                return "Suisse";
            case 2177:
                if (!str.equals("DE")) {
                    return "France";
                }
                return "Allemagne";
            case 2222:
                if (!str.equals("ES")) {
                    return "France";
                }
                return "Espagne";
            case 2252:
                boolean equals = str.equals("FR");
                return "France";
            case 2267:
                if (!str.equals("GB")) {
                    return "France";
                }
                return "Grande-Bretagne";
            case 2347:
                if (!str.equals("IT")) {
                    return "France";
                }
                return "Italie";
            case 2441:
                if (!str.equals("LU")) {
                    return "France";
                }
                return "Luxembourg";
            case 2454:
                if (!str.equals("MC")) {
                    return "France";
                }
                return "Monaco";
            case 2494:
                if (!str.equals("NL")) {
                    return "France";
                }
                return "Pays-Bas";
            default:
                return "France";
        }
    }

    @C12580l
    public static final BffCreateOrAttachCardBody toCreateOrAttachCardBody(@C12580l AccountInfo accountInfo, @C12579k LoyaltyMembershipConsentModel loyaltyMembershipConsentModel) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(loyaltyMembershipConsentModel, "loyaltyMembershipConsent");
        if (accountInfo == null) {
            return null;
        }
        String p = loyaltyMembershipConsentModel.mo117849p();
        String o = loyaltyMembershipConsentModel.mo117848o();
        String k = loyaltyMembershipConsentModel.mo117844k();
        String B = loyaltyMembershipConsentModel.mo117843j().mo116677B();
        String I = loyaltyMembershipConsentModel.mo117843j().mo116684I();
        String S = loyaltyMembershipConsentModel.mo117843j().mo116694S();
        String J = loyaltyMembershipConsentModel.mo117843j().mo116685J();
        Locale locale = Locale.ROOT;
        String lowerCase = J.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(lowerCase.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb.append(upperCase);
            String substring = lowerCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            lowerCase = sb.toString();
        }
        String str2 = lowerCase;
        String s = accountInfo.mo116664s();
        String u = accountInfo.mo116667u();
        if (accountInfo.mo116661p() == CivilityTitle.MR) {
            str = "3";
        } else {
            str = "1";
        }
        return new BffCreateOrAttachCardBody(p, o, k, B, I, S, str2, s, u, str, accountInfo.mo116663r(), loyaltyMembershipConsentModel.mo117846m(), loyaltyMembershipConsentModel.mo117847n());
    }

    private static final Address getFavorite(List<Address> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Address) obj).mo116695T()) {
                break;
            }
        }
        return (Address) obj;
    }
}
