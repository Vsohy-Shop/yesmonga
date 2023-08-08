package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Nutrient;", "", "label", "", "value", "", "unit", "precision", "contributionPrecision", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContributionPrecision", "()Ljava/lang/String;", "getLabel", "getPrecision", "getUnit", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/Nutrient;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Nutrient {
    public static final int $stable = 0;
    @C33608c("contribution_precision")
    @C12580l
    private final String contributionPrecision;
    @C33608c("label")
    @C12580l
    private final String label;
    @C33608c("precision")
    @C12580l
    private final String precision;
    @C33608c("unit")
    @C12580l
    private final String unit;
    @C33608c("value")
    @C12580l
    private final Double value;

    public Nutrient(@C12580l String str, @C12580l Double d, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        this.label = str;
        this.value = d;
        this.unit = str2;
        this.precision = str3;
        this.contributionPrecision = str4;
    }

    public static /* synthetic */ Nutrient copy$default(Nutrient nutrient, String str, Double d, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nutrient.label;
        }
        if ((i & 2) != 0) {
            d = nutrient.value;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            str2 = nutrient.unit;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = nutrient.precision;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = nutrient.contributionPrecision;
        }
        return nutrient.copy(str, d2, str5, str6, str4);
    }

    @C12580l
    public final String component1() {
        return this.label;
    }

    @C12580l
    public final Double component2() {
        return this.value;
    }

    @C12580l
    public final String component3() {
        return this.unit;
    }

    @C12580l
    public final String component4() {
        return this.precision;
    }

    @C12580l
    public final String component5() {
        return this.contributionPrecision;
    }

    @C12579k
    public final Nutrient copy(@C12580l String str, @C12580l Double d, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        return new Nutrient(str, d, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nutrient)) {
            return false;
        }
        Nutrient nutrient = (Nutrient) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) nutrient.label) && Intrinsics.areEqual((Object) this.value, (Object) nutrient.value) && Intrinsics.areEqual((Object) this.unit, (Object) nutrient.unit) && Intrinsics.areEqual((Object) this.precision, (Object) nutrient.precision) && Intrinsics.areEqual((Object) this.contributionPrecision, (Object) nutrient.contributionPrecision);
    }

    @C12580l
    public final String getContributionPrecision() {
        return this.contributionPrecision;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final String getPrecision() {
        return this.precision;
    }

    @C12580l
    public final String getUnit() {
        return this.unit;
    }

    @C12580l
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.value;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.unit;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.precision;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contributionPrecision;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.label;
        Double d = this.value;
        String str2 = this.unit;
        String str3 = this.precision;
        String str4 = this.contributionPrecision;
        return "Nutrient(label=" + str + ", value=" + d + ", unit=" + str2 + ", precision=" + str3 + ", contributionPrecision=" + str4 + ")";
    }
}
