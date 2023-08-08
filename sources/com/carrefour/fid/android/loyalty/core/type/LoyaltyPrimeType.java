package com.carrefour.fid.android.loyalty.core.type;

import com.carrefour.fid.android.airship.util.C13758b;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/LoyaltyPrimeType;", "", "id", "", "value", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "CLUB_BEBE", "CLUB_MARCHE", "CLUB_BIO", "CLUB_PETFOOD", "CLUB_FAMILLE", "CLUB_PROMO", "CLUB_UNKNOWN", "Companion", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public enum LoyaltyPrimeType {
    CLUB_BEBE("CLUB_BEBE", C13758b.f33424Q),
    CLUB_MARCHE("CLUB_MARCHE", "Appprime_marche"),
    CLUB_BIO("CLUB_BIO", C13758b.f33422O),
    CLUB_PETFOOD("CLUB_PETFOOD", C13758b.f33426S),
    CLUB_FAMILLE("CLUB_FAMILLE", C13758b.f33425R),
    CLUB_PROMO("CLUB_PROMO", "AppPrime_Promo"),
    CLUB_UNKNOWN("CLUB_UNKNOWN", "unknown");
    
    @C12579k
    public static final Companion Companion = null;
    @C12579k

    /* renamed from: id */
    private final String f97017id;
    @C12579k
    private final String value;

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/LoyaltyPrimeType$Companion;", "", "()V", "getFromId", "Lcom/carrefour/fid/android/loyalty/core/type/LoyaltyPrimeType;", "idClub", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final LoyaltyPrimeType getFromId(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "idClub");
            LoyaltyPrimeType loyaltyPrimeType = LoyaltyPrimeType.CLUB_BEBE;
            if (Intrinsics.areEqual((Object) str, (Object) loyaltyPrimeType.getId())) {
                return loyaltyPrimeType;
            }
            LoyaltyPrimeType loyaltyPrimeType2 = LoyaltyPrimeType.CLUB_MARCHE;
            if (Intrinsics.areEqual((Object) str, (Object) loyaltyPrimeType2.getId())) {
                return loyaltyPrimeType2;
            }
            LoyaltyPrimeType loyaltyPrimeType3 = LoyaltyPrimeType.CLUB_BIO;
            if (Intrinsics.areEqual((Object) str, (Object) loyaltyPrimeType3.getId())) {
                return loyaltyPrimeType3;
            }
            LoyaltyPrimeType loyaltyPrimeType4 = LoyaltyPrimeType.CLUB_PETFOOD;
            if (Intrinsics.areEqual((Object) str, (Object) loyaltyPrimeType4.getId())) {
                return loyaltyPrimeType4;
            }
            LoyaltyPrimeType loyaltyPrimeType5 = LoyaltyPrimeType.CLUB_FAMILLE;
            if (Intrinsics.areEqual((Object) str, (Object) loyaltyPrimeType5.getId())) {
                return loyaltyPrimeType5;
            }
            LoyaltyPrimeType loyaltyPrimeType6 = LoyaltyPrimeType.CLUB_PROMO;
            if (Intrinsics.areEqual((Object) str, (Object) loyaltyPrimeType6.getId())) {
                return loyaltyPrimeType6;
            }
            return LoyaltyPrimeType.CLUB_UNKNOWN;
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private LoyaltyPrimeType(String str, String str2) {
        this.f97017id = str;
        this.value = str2;
    }

    @C12579k
    public final String getId() {
        return this.f97017id;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }
}
