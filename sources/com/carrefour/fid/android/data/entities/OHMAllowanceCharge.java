package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMAllowanceCharge;", "", "allowanceChargeAmount", "Lcom/carrefour/fid/android/data/entities/Amount;", "allowanceChargeType", "", "allowanceOrChargeType", "allowanceChargeDescription", "promotionType", "bracketIdentifier", "(Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllowanceChargeAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getAllowanceChargeDescription", "()Ljava/lang/String;", "getAllowanceChargeType", "getAllowanceOrChargeType", "getBracketIdentifier", "getPromotionType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMAllowanceCharge {
    public static final int $stable = 0;
    @C33608c("allowance_charge_amount")
    @C12580l
    private final Amount allowanceChargeAmount;
    @C33608c("allowance_charge_description")
    @C12580l
    private final String allowanceChargeDescription;
    @C33608c("allowance_charge_type")
    @C12580l
    private final String allowanceChargeType;
    @C33608c("allowance_or_charge_type")
    @C12580l
    private final String allowanceOrChargeType;
    @C33608c("bracket_identifier")
    @C12580l
    private final String bracketIdentifier;
    @C33608c("promotion_type")
    @C12580l
    private final String promotionType;

    public OHMAllowanceCharge(@C12580l Amount amount, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.allowanceChargeAmount = amount;
        this.allowanceChargeType = str;
        this.allowanceOrChargeType = str2;
        this.allowanceChargeDescription = str3;
        this.promotionType = str4;
        this.bracketIdentifier = str5;
    }

    public static /* synthetic */ OHMAllowanceCharge copy$default(OHMAllowanceCharge oHMAllowanceCharge, Amount amount, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            amount = oHMAllowanceCharge.allowanceChargeAmount;
        }
        if ((i & 2) != 0) {
            str = oHMAllowanceCharge.allowanceChargeType;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = oHMAllowanceCharge.allowanceOrChargeType;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = oHMAllowanceCharge.allowanceChargeDescription;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = oHMAllowanceCharge.promotionType;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = oHMAllowanceCharge.bracketIdentifier;
        }
        return oHMAllowanceCharge.copy(amount, str6, str7, str8, str9, str5);
    }

    @C12580l
    public final Amount component1() {
        return this.allowanceChargeAmount;
    }

    @C12580l
    public final String component2() {
        return this.allowanceChargeType;
    }

    @C12580l
    public final String component3() {
        return this.allowanceOrChargeType;
    }

    @C12580l
    public final String component4() {
        return this.allowanceChargeDescription;
    }

    @C12580l
    public final String component5() {
        return this.promotionType;
    }

    @C12580l
    public final String component6() {
        return this.bracketIdentifier;
    }

    @C12579k
    public final OHMAllowanceCharge copy(@C12580l Amount amount, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new OHMAllowanceCharge(amount, str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMAllowanceCharge)) {
            return false;
        }
        OHMAllowanceCharge oHMAllowanceCharge = (OHMAllowanceCharge) obj;
        return Intrinsics.areEqual((Object) this.allowanceChargeAmount, (Object) oHMAllowanceCharge.allowanceChargeAmount) && Intrinsics.areEqual((Object) this.allowanceChargeType, (Object) oHMAllowanceCharge.allowanceChargeType) && Intrinsics.areEqual((Object) this.allowanceOrChargeType, (Object) oHMAllowanceCharge.allowanceOrChargeType) && Intrinsics.areEqual((Object) this.allowanceChargeDescription, (Object) oHMAllowanceCharge.allowanceChargeDescription) && Intrinsics.areEqual((Object) this.promotionType, (Object) oHMAllowanceCharge.promotionType) && Intrinsics.areEqual((Object) this.bracketIdentifier, (Object) oHMAllowanceCharge.bracketIdentifier);
    }

    @C12580l
    public final Amount getAllowanceChargeAmount() {
        return this.allowanceChargeAmount;
    }

    @C12580l
    public final String getAllowanceChargeDescription() {
        return this.allowanceChargeDescription;
    }

    @C12580l
    public final String getAllowanceChargeType() {
        return this.allowanceChargeType;
    }

    @C12580l
    public final String getAllowanceOrChargeType() {
        return this.allowanceOrChargeType;
    }

    @C12580l
    public final String getBracketIdentifier() {
        return this.bracketIdentifier;
    }

    @C12580l
    public final String getPromotionType() {
        return this.promotionType;
    }

    public int hashCode() {
        Amount amount = this.allowanceChargeAmount;
        int i = 0;
        int hashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        String str = this.allowanceChargeType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.allowanceOrChargeType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.allowanceChargeDescription;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bracketIdentifier;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    public String toString() {
        Amount amount = this.allowanceChargeAmount;
        String str = this.allowanceChargeType;
        String str2 = this.allowanceOrChargeType;
        String str3 = this.allowanceChargeDescription;
        String str4 = this.promotionType;
        String str5 = this.bracketIdentifier;
        return "OHMAllowanceCharge(allowanceChargeAmount=" + amount + ", allowanceChargeType=" + str + ", allowanceOrChargeType=" + str2 + ", allowanceChargeDescription=" + str3 + ", promotionType=" + str4 + ", bracketIdentifier=" + str5 + ")";
    }
}
