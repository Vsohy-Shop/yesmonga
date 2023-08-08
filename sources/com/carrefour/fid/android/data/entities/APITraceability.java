package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÕ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006?"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APITraceability;", "", "breedingArea", "", "fishingArea", "underFishingArea", "latinFishName", "bornIn", "raisedIn", "shotIn", "ageAtSlaughter", "turnedInto", "saltAddition", "captureGear", "productionMethod", "thawedProducts", "brineProducts", "caliber", "variety", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgeAtSlaughter", "()Ljava/lang/String;", "getBornIn", "getBreedingArea", "getBrineProducts", "getCaliber", "getCaptureGear", "getCategory", "getFishingArea", "getLatinFishName", "getProductionMethod", "getRaisedIn", "getSaltAddition", "getShotIn", "getThawedProducts", "getTurnedInto", "getUnderFishingArea", "getVariety", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APITraceability {
    public static final int $stable = 0;
    @C33608c("age_at_slaughter")
    @C12580l
    private final String ageAtSlaughter;
    @C33608c("born_in")
    @C12580l
    private final String bornIn;
    @C33608c("breeding_area")
    @C12580l
    private final String breedingArea;
    @C33608c("brine_products")
    @C12580l
    private final String brineProducts;
    @C33608c("caliber")
    @C12580l
    private final String caliber;
    @C33608c("capture_gear")
    @C12580l
    private final String captureGear;
    @C33608c("category")
    @C12580l
    private final String category;
    @C33608c("fishing_area")
    @C12580l
    private final String fishingArea;
    @C33608c("latin_fishName")
    @C12580l
    private final String latinFishName;
    @C33608c("production_method")
    @C12580l
    private final String productionMethod;
    @C33608c("raised_in")
    @C12580l
    private final String raisedIn;
    @C33608c("salt_addition")
    @C12580l
    private final String saltAddition;
    @C33608c("shot_in")
    @C12580l
    private final String shotIn;
    @C33608c("thawed_products")
    @C12580l
    private final String thawedProducts;
    @C33608c("turned_into")
    @C12580l
    private final String turnedInto;
    @C33608c("under_fishing_area")
    @C12580l
    private final String underFishingArea;
    @C33608c("variety")
    @C12580l
    private final String variety;

    public APITraceability() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ APITraceability copy$default(APITraceability aPITraceability, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, Object obj) {
        APITraceability aPITraceability2 = aPITraceability;
        int i2 = i;
        return aPITraceability.copy((i2 & 1) != 0 ? aPITraceability2.breedingArea : str, (i2 & 2) != 0 ? aPITraceability2.fishingArea : str2, (i2 & 4) != 0 ? aPITraceability2.underFishingArea : str3, (i2 & 8) != 0 ? aPITraceability2.latinFishName : str4, (i2 & 16) != 0 ? aPITraceability2.bornIn : str5, (i2 & 32) != 0 ? aPITraceability2.raisedIn : str6, (i2 & 64) != 0 ? aPITraceability2.shotIn : str7, (i2 & 128) != 0 ? aPITraceability2.ageAtSlaughter : str8, (i2 & 256) != 0 ? aPITraceability2.turnedInto : str9, (i2 & 512) != 0 ? aPITraceability2.saltAddition : str10, (i2 & 1024) != 0 ? aPITraceability2.captureGear : str11, (i2 & 2048) != 0 ? aPITraceability2.productionMethod : str12, (i2 & 4096) != 0 ? aPITraceability2.thawedProducts : str13, (i2 & 8192) != 0 ? aPITraceability2.brineProducts : str14, (i2 & 16384) != 0 ? aPITraceability2.caliber : str15, (i2 & 32768) != 0 ? aPITraceability2.variety : str16, (i2 & 65536) != 0 ? aPITraceability2.category : str17);
    }

    @C12580l
    public final String component1() {
        return this.breedingArea;
    }

    @C12580l
    public final String component10() {
        return this.saltAddition;
    }

    @C12580l
    public final String component11() {
        return this.captureGear;
    }

    @C12580l
    public final String component12() {
        return this.productionMethod;
    }

    @C12580l
    public final String component13() {
        return this.thawedProducts;
    }

    @C12580l
    public final String component14() {
        return this.brineProducts;
    }

    @C12580l
    public final String component15() {
        return this.caliber;
    }

    @C12580l
    public final String component16() {
        return this.variety;
    }

    @C12580l
    public final String component17() {
        return this.category;
    }

    @C12580l
    public final String component2() {
        return this.fishingArea;
    }

    @C12580l
    public final String component3() {
        return this.underFishingArea;
    }

    @C12580l
    public final String component4() {
        return this.latinFishName;
    }

    @C12580l
    public final String component5() {
        return this.bornIn;
    }

    @C12580l
    public final String component6() {
        return this.raisedIn;
    }

    @C12580l
    public final String component7() {
        return this.shotIn;
    }

    @C12580l
    public final String component8() {
        return this.ageAtSlaughter;
    }

    @C12580l
    public final String component9() {
        return this.turnedInto;
    }

    @C12579k
    public final APITraceability copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17) {
        return new APITraceability(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APITraceability)) {
            return false;
        }
        APITraceability aPITraceability = (APITraceability) obj;
        return Intrinsics.areEqual((Object) this.breedingArea, (Object) aPITraceability.breedingArea) && Intrinsics.areEqual((Object) this.fishingArea, (Object) aPITraceability.fishingArea) && Intrinsics.areEqual((Object) this.underFishingArea, (Object) aPITraceability.underFishingArea) && Intrinsics.areEqual((Object) this.latinFishName, (Object) aPITraceability.latinFishName) && Intrinsics.areEqual((Object) this.bornIn, (Object) aPITraceability.bornIn) && Intrinsics.areEqual((Object) this.raisedIn, (Object) aPITraceability.raisedIn) && Intrinsics.areEqual((Object) this.shotIn, (Object) aPITraceability.shotIn) && Intrinsics.areEqual((Object) this.ageAtSlaughter, (Object) aPITraceability.ageAtSlaughter) && Intrinsics.areEqual((Object) this.turnedInto, (Object) aPITraceability.turnedInto) && Intrinsics.areEqual((Object) this.saltAddition, (Object) aPITraceability.saltAddition) && Intrinsics.areEqual((Object) this.captureGear, (Object) aPITraceability.captureGear) && Intrinsics.areEqual((Object) this.productionMethod, (Object) aPITraceability.productionMethod) && Intrinsics.areEqual((Object) this.thawedProducts, (Object) aPITraceability.thawedProducts) && Intrinsics.areEqual((Object) this.brineProducts, (Object) aPITraceability.brineProducts) && Intrinsics.areEqual((Object) this.caliber, (Object) aPITraceability.caliber) && Intrinsics.areEqual((Object) this.variety, (Object) aPITraceability.variety) && Intrinsics.areEqual((Object) this.category, (Object) aPITraceability.category);
    }

    @C12580l
    public final String getAgeAtSlaughter() {
        return this.ageAtSlaughter;
    }

    @C12580l
    public final String getBornIn() {
        return this.bornIn;
    }

    @C12580l
    public final String getBreedingArea() {
        return this.breedingArea;
    }

    @C12580l
    public final String getBrineProducts() {
        return this.brineProducts;
    }

    @C12580l
    public final String getCaliber() {
        return this.caliber;
    }

    @C12580l
    public final String getCaptureGear() {
        return this.captureGear;
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final String getFishingArea() {
        return this.fishingArea;
    }

    @C12580l
    public final String getLatinFishName() {
        return this.latinFishName;
    }

    @C12580l
    public final String getProductionMethod() {
        return this.productionMethod;
    }

    @C12580l
    public final String getRaisedIn() {
        return this.raisedIn;
    }

    @C12580l
    public final String getSaltAddition() {
        return this.saltAddition;
    }

    @C12580l
    public final String getShotIn() {
        return this.shotIn;
    }

    @C12580l
    public final String getThawedProducts() {
        return this.thawedProducts;
    }

    @C12580l
    public final String getTurnedInto() {
        return this.turnedInto;
    }

    @C12580l
    public final String getUnderFishingArea() {
        return this.underFishingArea;
    }

    @C12580l
    public final String getVariety() {
        return this.variety;
    }

    public int hashCode() {
        String str = this.breedingArea;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fishingArea;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.underFishingArea;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.latinFishName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bornIn;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.raisedIn;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shotIn;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ageAtSlaughter;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.turnedInto;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.saltAddition;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.captureGear;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productionMethod;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.thawedProducts;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.brineProducts;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.caliber;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.variety;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.category;
        if (str17 != null) {
            i = str17.hashCode();
        }
        return hashCode16 + i;
    }

    @C12579k
    public String toString() {
        String str = this.breedingArea;
        String str2 = this.fishingArea;
        String str3 = this.underFishingArea;
        String str4 = this.latinFishName;
        String str5 = this.bornIn;
        String str6 = this.raisedIn;
        String str7 = this.shotIn;
        String str8 = this.ageAtSlaughter;
        String str9 = this.turnedInto;
        String str10 = this.saltAddition;
        String str11 = this.captureGear;
        String str12 = this.productionMethod;
        String str13 = this.thawedProducts;
        String str14 = this.brineProducts;
        String str15 = this.caliber;
        String str16 = this.variety;
        String str17 = this.category;
        return "APITraceability(breedingArea=" + str + ", fishingArea=" + str2 + ", underFishingArea=" + str3 + ", latinFishName=" + str4 + ", bornIn=" + str5 + ", raisedIn=" + str6 + ", shotIn=" + str7 + ", ageAtSlaughter=" + str8 + ", turnedInto=" + str9 + ", saltAddition=" + str10 + ", captureGear=" + str11 + ", productionMethod=" + str12 + ", thawedProducts=" + str13 + ", brineProducts=" + str14 + ", caliber=" + str15 + ", variety=" + str16 + ", category=" + str17 + ")";
    }

    public APITraceability(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17) {
        this.breedingArea = str;
        this.fishingArea = str2;
        this.underFishingArea = str3;
        this.latinFishName = str4;
        this.bornIn = str5;
        this.raisedIn = str6;
        this.shotIn = str7;
        this.ageAtSlaughter = str8;
        this.turnedInto = str9;
        this.saltAddition = str10;
        this.captureGear = str11;
        this.productionMethod = str12;
        this.thawedProducts = str13;
        this.brineProducts = str14;
        this.caliber = str15;
        this.variety = str16;
        this.category = str17;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ APITraceability(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.APITraceability.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
