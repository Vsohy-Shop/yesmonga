package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMPaidVATEntity;", "", "percentage", "", "amount", "Lcom/carrefour/fid/android/data/entities/Amount;", "amountWithTax", "(Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;)V", "getAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getAmountWithTax", "getPercentage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMPaidVATEntity {
    public static final int $stable = 0;
    @C33608c("vat_amt")
    @C12580l
    private final Amount amount;
    @C33608c("sal_amt_w_tax")
    @C12580l
    private final Amount amountWithTax;
    @C33608c("vat_percentage")
    @C12580l
    private final String percentage;

    public APIMPaidVATEntity(@C12580l String str, @C12580l Amount amount2, @C12580l Amount amount3) {
        this.percentage = str;
        this.amount = amount2;
        this.amountWithTax = amount3;
    }

    public static /* synthetic */ APIMPaidVATEntity copy$default(APIMPaidVATEntity aPIMPaidVATEntity, String str, Amount amount2, Amount amount3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMPaidVATEntity.percentage;
        }
        if ((i & 2) != 0) {
            amount2 = aPIMPaidVATEntity.amount;
        }
        if ((i & 4) != 0) {
            amount3 = aPIMPaidVATEntity.amountWithTax;
        }
        return aPIMPaidVATEntity.copy(str, amount2, amount3);
    }

    @C12580l
    public final String component1() {
        return this.percentage;
    }

    @C12580l
    public final Amount component2() {
        return this.amount;
    }

    @C12580l
    public final Amount component3() {
        return this.amountWithTax;
    }

    @C12579k
    public final APIMPaidVATEntity copy(@C12580l String str, @C12580l Amount amount2, @C12580l Amount amount3) {
        return new APIMPaidVATEntity(str, amount2, amount3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMPaidVATEntity)) {
            return false;
        }
        APIMPaidVATEntity aPIMPaidVATEntity = (APIMPaidVATEntity) obj;
        return Intrinsics.areEqual((Object) this.percentage, (Object) aPIMPaidVATEntity.percentage) && Intrinsics.areEqual((Object) this.amount, (Object) aPIMPaidVATEntity.amount) && Intrinsics.areEqual((Object) this.amountWithTax, (Object) aPIMPaidVATEntity.amountWithTax);
    }

    @C12580l
    public final Amount getAmount() {
        return this.amount;
    }

    @C12580l
    public final Amount getAmountWithTax() {
        return this.amountWithTax;
    }

    @C12580l
    public final String getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        String str = this.percentage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Amount amount2 = this.amount;
        int hashCode2 = (hashCode + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.amountWithTax;
        if (amount3 != null) {
            i = amount3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.percentage;
        Amount amount2 = this.amount;
        Amount amount3 = this.amountWithTax;
        return "APIMPaidVATEntity(percentage=" + str + ", amount=" + amount2 + ", amountWithTax=" + amount3 + ")";
    }
}
