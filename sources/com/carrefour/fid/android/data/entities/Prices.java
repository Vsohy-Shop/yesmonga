package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Prices;", "", "startingPrice", "", "permanentPrice", "discount", "Lcom/carrefour/fid/android/data/entities/APIMDiscount;", "currency", "", "salePrice", "standardPricePerUnit", "Lcom/carrefour/fid/android/data/entities/APIMPricePerUnit;", "(IILcom/carrefour/fid/android/data/entities/APIMDiscount;Ljava/lang/String;ILcom/carrefour/fid/android/data/entities/APIMPricePerUnit;)V", "getCurrency", "()Ljava/lang/String;", "getDiscount", "()Lcom/carrefour/fid/android/data/entities/APIMDiscount;", "getPermanentPrice", "()I", "getSalePrice", "getStandardPricePerUnit", "()Lcom/carrefour/fid/android/data/entities/APIMPricePerUnit;", "getStartingPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Prices {
    public static final int $stable = 8;
    @C33608c("currency")
    @C12579k
    private final String currency;
    @C33608c("discount")
    @C12580l
    private final APIMDiscount discount;
    @C33608c("permanent_price")
    private final int permanentPrice;
    @C33608c("sale_price")
    private final int salePrice;
    @C33608c("standard_price_per_unit")
    @C12579k
    private final APIMPricePerUnit standardPricePerUnit;
    @C33608c("starting_price")
    private final int startingPrice;

    public Prices(int i, int i2, @C12580l APIMDiscount aPIMDiscount, @C12579k String str, int i3, @C12579k APIMPricePerUnit aPIMPricePerUnit) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(aPIMPricePerUnit, "standardPricePerUnit");
        this.startingPrice = i;
        this.permanentPrice = i2;
        this.discount = aPIMDiscount;
        this.currency = str;
        this.salePrice = i3;
        this.standardPricePerUnit = aPIMPricePerUnit;
    }

    public static /* synthetic */ Prices copy$default(Prices prices, int i, int i2, APIMDiscount aPIMDiscount, String str, int i3, APIMPricePerUnit aPIMPricePerUnit, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = prices.startingPrice;
        }
        if ((i4 & 2) != 0) {
            i2 = prices.permanentPrice;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            aPIMDiscount = prices.discount;
        }
        APIMDiscount aPIMDiscount2 = aPIMDiscount;
        if ((i4 & 8) != 0) {
            str = prices.currency;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            i3 = prices.salePrice;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            aPIMPricePerUnit = prices.standardPricePerUnit;
        }
        return prices.copy(i, i5, aPIMDiscount2, str2, i6, aPIMPricePerUnit);
    }

    public final int component1() {
        return this.startingPrice;
    }

    public final int component2() {
        return this.permanentPrice;
    }

    @C12580l
    public final APIMDiscount component3() {
        return this.discount;
    }

    @C12579k
    public final String component4() {
        return this.currency;
    }

    public final int component5() {
        return this.salePrice;
    }

    @C12579k
    public final APIMPricePerUnit component6() {
        return this.standardPricePerUnit;
    }

    @C12579k
    public final Prices copy(int i, int i2, @C12580l APIMDiscount aPIMDiscount, @C12579k String str, int i3, @C12579k APIMPricePerUnit aPIMPricePerUnit) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        Intrinsics.checkNotNullParameter(aPIMPricePerUnit, "standardPricePerUnit");
        return new Prices(i, i2, aPIMDiscount, str, i3, aPIMPricePerUnit);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prices)) {
            return false;
        }
        Prices prices = (Prices) obj;
        return this.startingPrice == prices.startingPrice && this.permanentPrice == prices.permanentPrice && Intrinsics.areEqual((Object) this.discount, (Object) prices.discount) && Intrinsics.areEqual((Object) this.currency, (Object) prices.currency) && this.salePrice == prices.salePrice && Intrinsics.areEqual((Object) this.standardPricePerUnit, (Object) prices.standardPricePerUnit);
    }

    @C12579k
    public final String getCurrency() {
        return this.currency;
    }

    @C12580l
    public final APIMDiscount getDiscount() {
        return this.discount;
    }

    public final int getPermanentPrice() {
        return this.permanentPrice;
    }

    public final int getSalePrice() {
        return this.salePrice;
    }

    @C12579k
    public final APIMPricePerUnit getStandardPricePerUnit() {
        return this.standardPricePerUnit;
    }

    public final int getStartingPrice() {
        return this.startingPrice;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.startingPrice) * 31) + Integer.hashCode(this.permanentPrice)) * 31;
        APIMDiscount aPIMDiscount = this.discount;
        return ((((((hashCode + (aPIMDiscount == null ? 0 : aPIMDiscount.hashCode())) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.salePrice)) * 31) + this.standardPricePerUnit.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.startingPrice;
        int i2 = this.permanentPrice;
        APIMDiscount aPIMDiscount = this.discount;
        String str = this.currency;
        int i3 = this.salePrice;
        APIMPricePerUnit aPIMPricePerUnit = this.standardPricePerUnit;
        return "Prices(startingPrice=" + i + ", permanentPrice=" + i2 + ", discount=" + aPIMDiscount + ", currency=" + str + ", salePrice=" + i3 + ", standardPricePerUnit=" + aPIMPricePerUnit + ")";
    }
}
