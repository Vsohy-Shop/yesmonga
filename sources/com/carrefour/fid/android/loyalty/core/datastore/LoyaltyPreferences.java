package com.carrefour.fid.android.loyalty.core.datastore;

import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferences;", "", "primeFidLaunched", "", "loyaltyCardNumber", "", "hasPrimeFid", "(ZLjava/lang/String;Z)V", "getHasPrimeFid", "()Z", "getLoyaltyCardNumber", "()Ljava/lang/String;", "getPrimeFidLaunched", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyPreferences {
    private final boolean hasPrimeFid;
    @C12579k
    private final String loyaltyCardNumber;
    private final boolean primeFidLaunched;

    public LoyaltyPreferences(boolean z, @C12579k String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        this.primeFidLaunched = z;
        this.loyaltyCardNumber = str;
        this.hasPrimeFid = z2;
    }

    public static /* synthetic */ LoyaltyPreferences copy$default(LoyaltyPreferences loyaltyPreferences, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loyaltyPreferences.primeFidLaunched;
        }
        if ((i & 2) != 0) {
            str = loyaltyPreferences.loyaltyCardNumber;
        }
        if ((i & 4) != 0) {
            z2 = loyaltyPreferences.hasPrimeFid;
        }
        return loyaltyPreferences.copy(z, str, z2);
    }

    public final boolean component1() {
        return this.primeFidLaunched;
    }

    @C12579k
    public final String component2() {
        return this.loyaltyCardNumber;
    }

    public final boolean component3() {
        return this.hasPrimeFid;
    }

    @C12579k
    public final LoyaltyPreferences copy(boolean z, @C12579k String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        return new LoyaltyPreferences(z, str, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyPreferences)) {
            return false;
        }
        LoyaltyPreferences loyaltyPreferences = (LoyaltyPreferences) obj;
        return this.primeFidLaunched == loyaltyPreferences.primeFidLaunched && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) loyaltyPreferences.loyaltyCardNumber) && this.hasPrimeFid == loyaltyPreferences.hasPrimeFid;
    }

    public final boolean getHasPrimeFid() {
        return this.hasPrimeFid;
    }

    @C12579k
    public final String getLoyaltyCardNumber() {
        return this.loyaltyCardNumber;
    }

    public final boolean getPrimeFidLaunched() {
        return this.primeFidLaunched;
    }

    public int hashCode() {
        boolean z = this.primeFidLaunched;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + this.loyaltyCardNumber.hashCode()) * 31;
        boolean z3 = this.hasPrimeFid;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    @C12579k
    public String toString() {
        boolean z = this.primeFidLaunched;
        String str = this.loyaltyCardNumber;
        boolean z2 = this.hasPrimeFid;
        return "LoyaltyPreferences(primeFidLaunched=" + z + ", loyaltyCardNumber=" + str + ", hasPrimeFid=" + z2 + ")";
    }
}
