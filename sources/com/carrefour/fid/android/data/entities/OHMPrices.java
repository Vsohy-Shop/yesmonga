package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMPrices;", "", "salePrice", "Lcom/carrefour/fid/android/data/entities/Amount;", "standardPrice", "unitAmount", "", "(Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;)V", "getSalePrice", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getStandardPrice", "getUnitAmount", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMPrices {
    public static final int $stable = 0;
    @C33608c("sale_price")
    @C12580l
    private final Amount salePrice;
    @C33608c("standard_price")
    @C12580l
    private final Amount standardPrice;
    @C33608c("unit_amount")
    @C12580l
    private final String unitAmount;

    public OHMPrices(@C12580l Amount amount, @C12580l Amount amount2, @C12580l String str) {
        this.salePrice = amount;
        this.standardPrice = amount2;
        this.unitAmount = str;
    }

    public static /* synthetic */ OHMPrices copy$default(OHMPrices oHMPrices, Amount amount, Amount amount2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            amount = oHMPrices.salePrice;
        }
        if ((i & 2) != 0) {
            amount2 = oHMPrices.standardPrice;
        }
        if ((i & 4) != 0) {
            str = oHMPrices.unitAmount;
        }
        return oHMPrices.copy(amount, amount2, str);
    }

    @C12580l
    public final Amount component1() {
        return this.salePrice;
    }

    @C12580l
    public final Amount component2() {
        return this.standardPrice;
    }

    @C12580l
    public final String component3() {
        return this.unitAmount;
    }

    @C12579k
    public final OHMPrices copy(@C12580l Amount amount, @C12580l Amount amount2, @C12580l String str) {
        return new OHMPrices(amount, amount2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMPrices)) {
            return false;
        }
        OHMPrices oHMPrices = (OHMPrices) obj;
        return Intrinsics.areEqual((Object) this.salePrice, (Object) oHMPrices.salePrice) && Intrinsics.areEqual((Object) this.standardPrice, (Object) oHMPrices.standardPrice) && Intrinsics.areEqual((Object) this.unitAmount, (Object) oHMPrices.unitAmount);
    }

    @C12580l
    public final Amount getSalePrice() {
        return this.salePrice;
    }

    @C12580l
    public final Amount getStandardPrice() {
        return this.standardPrice;
    }

    @C12580l
    public final String getUnitAmount() {
        return this.unitAmount;
    }

    public int hashCode() {
        Amount amount = this.salePrice;
        int i = 0;
        int hashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.standardPrice;
        int hashCode2 = (hashCode + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        String str = this.unitAmount;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        Amount amount = this.salePrice;
        Amount amount2 = this.standardPrice;
        String str = this.unitAmount;
        return "OHMPrices(salePrice=" + amount + ", standardPrice=" + amount2 + ", unitAmount=" + str + ")";
    }
}
