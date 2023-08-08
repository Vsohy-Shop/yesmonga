package com.carrefour.fid.android.loyalty.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/models/BenefitsDomain;", "", "acquiredBenefits", "", "usedBenefits", "(Ljava/lang/String;Ljava/lang/String;)V", "getAcquiredBenefits", "()Ljava/lang/String;", "setAcquiredBenefits", "(Ljava/lang/String;)V", "getUsedBenefits", "setUsedBenefits", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BenefitsDomain {
    @C12579k
    private String acquiredBenefits;
    @C12579k
    private String usedBenefits;

    public BenefitsDomain() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BenefitsDomain copy$default(BenefitsDomain benefitsDomain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benefitsDomain.acquiredBenefits;
        }
        if ((i & 2) != 0) {
            str2 = benefitsDomain.usedBenefits;
        }
        return benefitsDomain.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.acquiredBenefits;
    }

    @C12579k
    public final String component2() {
        return this.usedBenefits;
    }

    @C12579k
    public final BenefitsDomain copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "acquiredBenefits");
        Intrinsics.checkNotNullParameter(str2, "usedBenefits");
        return new BenefitsDomain(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsDomain)) {
            return false;
        }
        BenefitsDomain benefitsDomain = (BenefitsDomain) obj;
        return Intrinsics.areEqual((Object) this.acquiredBenefits, (Object) benefitsDomain.acquiredBenefits) && Intrinsics.areEqual((Object) this.usedBenefits, (Object) benefitsDomain.usedBenefits);
    }

    @C12579k
    public final String getAcquiredBenefits() {
        return this.acquiredBenefits;
    }

    @C12579k
    public final String getUsedBenefits() {
        return this.usedBenefits;
    }

    public int hashCode() {
        return (this.acquiredBenefits.hashCode() * 31) + this.usedBenefits.hashCode();
    }

    public final void setAcquiredBenefits(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.acquiredBenefits = str;
    }

    public final void setUsedBenefits(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.usedBenefits = str;
    }

    @C12579k
    public String toString() {
        String str = this.acquiredBenefits;
        String str2 = this.usedBenefits;
        return "BenefitsDomain(acquiredBenefits=" + str + ", usedBenefits=" + str2 + ")";
    }

    public BenefitsDomain(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "acquiredBenefits");
        Intrinsics.checkNotNullParameter(str2, "usedBenefits");
        this.acquiredBenefits = str;
        this.usedBenefits = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BenefitsDomain(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2);
    }
}
