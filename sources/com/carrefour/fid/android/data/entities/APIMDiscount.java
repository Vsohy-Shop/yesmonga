package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u0013\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003Ju\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMDiscount;", "", "isDisplayedAsPromo", "", "isPromotion", "label", "", "type", "forcedPrice", "", "startDate", "endDate", "deals", "", "Lcom/carrefour/fid/android/data/entities/APIMDeal;", "gtins", "(ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getDeals", "()Ljava/util/List;", "getEndDate", "()Ljava/lang/String;", "getForcedPrice", "()I", "getGtins", "()Z", "getLabel", "getStartDate", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMDiscount {
    public static final int $stable = 8;
    @C33608c("deals")
    @C12580l
    private final List<APIMDeal> deals;
    @C33608c("end_date")
    @C12579k
    private final String endDate;
    @C33608c("forced_price")
    private final int forcedPrice;
    @C33608c("gtins")
    @C12580l
    private final List<String> gtins;
    @C33608c("is_displayed_as_promo")
    private final boolean isDisplayedAsPromo;
    @C33608c("is_promotion")
    private final boolean isPromotion;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("start_date")
    @C12579k
    private final String startDate;
    @C33608c("type")
    @C12579k
    private final String type;

    public APIMDiscount(boolean z, boolean z2, @C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k String str4, @C12580l List<APIMDeal> list, @C12580l List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "startDate");
        Intrinsics.checkNotNullParameter(str4, "endDate");
        this.isDisplayedAsPromo = z;
        this.isPromotion = z2;
        this.label = str;
        this.type = str2;
        this.forcedPrice = i;
        this.startDate = str3;
        this.endDate = str4;
        this.deals = list;
        this.gtins = list2;
    }

    public static /* synthetic */ APIMDiscount copy$default(APIMDiscount aPIMDiscount, boolean z, boolean z2, String str, String str2, int i, String str3, String str4, List list, List list2, int i2, Object obj) {
        APIMDiscount aPIMDiscount2 = aPIMDiscount;
        int i3 = i2;
        return aPIMDiscount.copy((i3 & 1) != 0 ? aPIMDiscount2.isDisplayedAsPromo : z, (i3 & 2) != 0 ? aPIMDiscount2.isPromotion : z2, (i3 & 4) != 0 ? aPIMDiscount2.label : str, (i3 & 8) != 0 ? aPIMDiscount2.type : str2, (i3 & 16) != 0 ? aPIMDiscount2.forcedPrice : i, (i3 & 32) != 0 ? aPIMDiscount2.startDate : str3, (i3 & 64) != 0 ? aPIMDiscount2.endDate : str4, (i3 & 128) != 0 ? aPIMDiscount2.deals : list, (i3 & 256) != 0 ? aPIMDiscount2.gtins : list2);
    }

    public final boolean component1() {
        return this.isDisplayedAsPromo;
    }

    public final boolean component2() {
        return this.isPromotion;
    }

    @C12579k
    public final String component3() {
        return this.label;
    }

    @C12579k
    public final String component4() {
        return this.type;
    }

    public final int component5() {
        return this.forcedPrice;
    }

    @C12579k
    public final String component6() {
        return this.startDate;
    }

    @C12579k
    public final String component7() {
        return this.endDate;
    }

    @C12580l
    public final List<APIMDeal> component8() {
        return this.deals;
    }

    @C12580l
    public final List<String> component9() {
        return this.gtins;
    }

    @C12579k
    public final APIMDiscount copy(boolean z, boolean z2, @C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k String str4, @C12580l List<APIMDeal> list, @C12580l List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "type");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "startDate");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "endDate");
        return new APIMDiscount(z, z2, str, str2, i, str5, str6, list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMDiscount)) {
            return false;
        }
        APIMDiscount aPIMDiscount = (APIMDiscount) obj;
        return this.isDisplayedAsPromo == aPIMDiscount.isDisplayedAsPromo && this.isPromotion == aPIMDiscount.isPromotion && Intrinsics.areEqual((Object) this.label, (Object) aPIMDiscount.label) && Intrinsics.areEqual((Object) this.type, (Object) aPIMDiscount.type) && this.forcedPrice == aPIMDiscount.forcedPrice && Intrinsics.areEqual((Object) this.startDate, (Object) aPIMDiscount.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) aPIMDiscount.endDate) && Intrinsics.areEqual((Object) this.deals, (Object) aPIMDiscount.deals) && Intrinsics.areEqual((Object) this.gtins, (Object) aPIMDiscount.gtins);
    }

    @C12580l
    public final List<APIMDeal> getDeals() {
        return this.deals;
    }

    @C12579k
    public final String getEndDate() {
        return this.endDate;
    }

    public final int getForcedPrice() {
        return this.forcedPrice;
    }

    @C12580l
    public final List<String> getGtins() {
        return this.gtins;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    @C12579k
    public final String getStartDate() {
        return this.startDate;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        boolean z = this.isDisplayedAsPromo;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.isPromotion;
        if (!z3) {
            z2 = z3;
        }
        int hashCode = (((((((((((i + (z2 ? 1 : 0)) * 31) + this.label.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.forcedPrice)) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31;
        List<APIMDeal> list = this.deals;
        int i2 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.gtins;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final boolean isDisplayedAsPromo() {
        return this.isDisplayedAsPromo;
    }

    public final boolean isPromotion() {
        return this.isPromotion;
    }

    @C12579k
    public String toString() {
        boolean z = this.isDisplayedAsPromo;
        boolean z2 = this.isPromotion;
        String str = this.label;
        String str2 = this.type;
        int i = this.forcedPrice;
        String str3 = this.startDate;
        String str4 = this.endDate;
        List<APIMDeal> list = this.deals;
        List<String> list2 = this.gtins;
        return "APIMDiscount(isDisplayedAsPromo=" + z + ", isPromotion=" + z2 + ", label=" + str + ", type=" + str2 + ", forcedPrice=" + i + ", startDate=" + str3 + ", endDate=" + str4 + ", deals=" + list + ", gtins=" + list2 + ")";
    }
}
