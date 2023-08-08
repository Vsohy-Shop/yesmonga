package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\b\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jä\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\tHÖ\u0001J\t\u0010P\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u001c\u0010)R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010+R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010+R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010+R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010+R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u001b\u0010)R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0017\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006Q"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Offer;", "", "isIndispensable", "", "gtin", "", "isNew", "origin", "promoTypeSort", "", "flags", "Lcom/carrefour/fid/android/data/entities/Flags;", "availability", "Lcom/carrefour/fid/android/data/entities/APIMAvailability;", "purchasingMin", "cdbase", "purchasingStep", "facilityServiceId", "prices", "Lcom/carrefour/fid/android/data/entities/Prices;", "metiRef", "isEligible", "isInAssortment", "purchasingMax", "traceability", "Lcom/carrefour/fid/android/data/entities/APITraceability;", "freshnessGuarantee", "isVariableWeight", "isAlternativeCheaper", "(ZLjava/lang/String;ZLjava/lang/String;ILcom/carrefour/fid/android/data/entities/Flags;Lcom/carrefour/fid/android/data/entities/APIMAvailability;ILjava/lang/String;ILjava/lang/String;Lcom/carrefour/fid/android/data/entities/Prices;Ljava/lang/String;ZZILcom/carrefour/fid/android/data/entities/APITraceability;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAvailability", "()Lcom/carrefour/fid/android/data/entities/APIMAvailability;", "getCdbase", "()Ljava/lang/String;", "getFacilityServiceId", "getFlags", "()Lcom/carrefour/fid/android/data/entities/Flags;", "getFreshnessGuarantee", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGtin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getMetiRef", "getOrigin", "getPrices", "()Lcom/carrefour/fid/android/data/entities/Prices;", "getPromoTypeSort", "()I", "getPurchasingMax", "getPurchasingMin", "getPurchasingStep", "getTraceability", "()Lcom/carrefour/fid/android/data/entities/APITraceability;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;ZLjava/lang/String;ILcom/carrefour/fid/android/data/entities/Flags;Lcom/carrefour/fid/android/data/entities/APIMAvailability;ILjava/lang/String;ILjava/lang/String;Lcom/carrefour/fid/android/data/entities/Prices;Ljava/lang/String;ZZILcom/carrefour/fid/android/data/entities/APITraceability;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/data/entities/Offer;", "equals", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Offer {
    public static final int $stable = 8;
    @C33608c("availability")
    @C12580l
    private final APIMAvailability availability;
    @C33608c("cdbase")
    @C12580l
    private final String cdbase;
    @C33608c("facility_service_id")
    @C12579k
    private final String facilityServiceId;
    @C33608c("flags")
    @C12580l
    private final Flags flags;
    @C33608c("freshness_garanteed")
    @C12580l
    private final Integer freshnessGuarantee;
    @C33608c("gtin")
    @C12579k
    private final String gtin;
    @C33608c("is_alternative_cheaper")
    @C12580l
    private final Boolean isAlternativeCheaper;
    @C33608c("is_eligible")
    private final boolean isEligible;
    @C33608c("is_in_assortment")
    private final boolean isInAssortment;
    @C33608c("is_indispensable")
    private final boolean isIndispensable;
    @C33608c("is_new")
    private final boolean isNew;
    @C33608c("is_variable_weight")
    @C12580l
    private final Boolean isVariableWeight;
    @C33608c("meti_ref")
    @C12579k
    private final String metiRef;
    @C33608c("origin")
    @C12579k
    private final String origin;
    @C33608c("prices")
    @C12579k
    private final Prices prices;
    @C33608c("promo_type_sort")
    private final int promoTypeSort;
    @C33608c("purchasing_max")
    private final int purchasingMax;
    @C33608c("purchasing_min")
    private final int purchasingMin;
    @C33608c("purchasing_step")
    private final int purchasingStep;
    @C33608c("traceability")
    @C12580l
    private final APITraceability traceability;

    public Offer(boolean z, @C12579k String str, boolean z2, @C12579k String str2, int i, @C12580l Flags flags2, @C12580l APIMAvailability aPIMAvailability, int i2, @C12580l String str3, int i3, @C12579k String str4, @C12579k Prices prices2, @C12579k String str5, boolean z3, boolean z4, int i4, @C12580l APITraceability aPITraceability, @C12580l Integer num, @C12580l Boolean bool, @C12580l Boolean bool2) {
        String str6 = str4;
        Prices prices3 = prices2;
        String str7 = str5;
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "origin");
        Intrinsics.checkNotNullParameter(str6, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(prices3, "prices");
        Intrinsics.checkNotNullParameter(str7, "metiRef");
        this.isIndispensable = z;
        this.gtin = str;
        this.isNew = z2;
        this.origin = str2;
        this.promoTypeSort = i;
        this.flags = flags2;
        this.availability = aPIMAvailability;
        this.purchasingMin = i2;
        this.cdbase = str3;
        this.purchasingStep = i3;
        this.facilityServiceId = str6;
        this.prices = prices3;
        this.metiRef = str7;
        this.isEligible = z3;
        this.isInAssortment = z4;
        this.purchasingMax = i4;
        this.traceability = aPITraceability;
        this.freshnessGuarantee = num;
        this.isVariableWeight = bool;
        this.isAlternativeCheaper = bool2;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, boolean z, String str, boolean z2, String str2, int i, Flags flags2, APIMAvailability aPIMAvailability, int i2, String str3, int i3, String str4, Prices prices2, String str5, boolean z3, boolean z4, int i4, APITraceability aPITraceability, Integer num, Boolean bool, Boolean bool2, int i5, Object obj) {
        Offer offer2 = offer;
        int i6 = i5;
        return offer.copy((i6 & 1) != 0 ? offer2.isIndispensable : z, (i6 & 2) != 0 ? offer2.gtin : str, (i6 & 4) != 0 ? offer2.isNew : z2, (i6 & 8) != 0 ? offer2.origin : str2, (i6 & 16) != 0 ? offer2.promoTypeSort : i, (i6 & 32) != 0 ? offer2.flags : flags2, (i6 & 64) != 0 ? offer2.availability : aPIMAvailability, (i6 & 128) != 0 ? offer2.purchasingMin : i2, (i6 & 256) != 0 ? offer2.cdbase : str3, (i6 & 512) != 0 ? offer2.purchasingStep : i3, (i6 & 1024) != 0 ? offer2.facilityServiceId : str4, (i6 & 2048) != 0 ? offer2.prices : prices2, (i6 & 4096) != 0 ? offer2.metiRef : str5, (i6 & 8192) != 0 ? offer2.isEligible : z3, (i6 & 16384) != 0 ? offer2.isInAssortment : z4, (i6 & 32768) != 0 ? offer2.purchasingMax : i4, (i6 & 65536) != 0 ? offer2.traceability : aPITraceability, (i6 & 131072) != 0 ? offer2.freshnessGuarantee : num, (i6 & 262144) != 0 ? offer2.isVariableWeight : bool, (i6 & 524288) != 0 ? offer2.isAlternativeCheaper : bool2);
    }

    public final boolean component1() {
        return this.isIndispensable;
    }

    public final int component10() {
        return this.purchasingStep;
    }

    @C12579k
    public final String component11() {
        return this.facilityServiceId;
    }

    @C12579k
    public final Prices component12() {
        return this.prices;
    }

    @C12579k
    public final String component13() {
        return this.metiRef;
    }

    public final boolean component14() {
        return this.isEligible;
    }

    public final boolean component15() {
        return this.isInAssortment;
    }

    public final int component16() {
        return this.purchasingMax;
    }

    @C12580l
    public final APITraceability component17() {
        return this.traceability;
    }

    @C12580l
    public final Integer component18() {
        return this.freshnessGuarantee;
    }

    @C12580l
    public final Boolean component19() {
        return this.isVariableWeight;
    }

    @C12579k
    public final String component2() {
        return this.gtin;
    }

    @C12580l
    public final Boolean component20() {
        return this.isAlternativeCheaper;
    }

    public final boolean component3() {
        return this.isNew;
    }

    @C12579k
    public final String component4() {
        return this.origin;
    }

    public final int component5() {
        return this.promoTypeSort;
    }

    @C12580l
    public final Flags component6() {
        return this.flags;
    }

    @C12580l
    public final APIMAvailability component7() {
        return this.availability;
    }

    public final int component8() {
        return this.purchasingMin;
    }

    @C12580l
    public final String component9() {
        return this.cdbase;
    }

    @C12579k
    public final Offer copy(boolean z, @C12579k String str, boolean z2, @C12579k String str2, int i, @C12580l Flags flags2, @C12580l APIMAvailability aPIMAvailability, int i2, @C12580l String str3, int i3, @C12579k String str4, @C12579k Prices prices2, @C12579k String str5, boolean z3, boolean z4, int i4, @C12580l APITraceability aPITraceability, @C12580l Integer num, @C12580l Boolean bool, @C12580l Boolean bool2) {
        boolean z5 = z;
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "origin");
        Intrinsics.checkNotNullParameter(str4, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(prices2, "prices");
        Intrinsics.checkNotNullParameter(str5, "metiRef");
        return new Offer(z, str, z2, str2, i, flags2, aPIMAvailability, i2, str3, i3, str4, prices2, str5, z3, z4, i4, aPITraceability, num, bool, bool2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return this.isIndispensable == offer.isIndispensable && Intrinsics.areEqual((Object) this.gtin, (Object) offer.gtin) && this.isNew == offer.isNew && Intrinsics.areEqual((Object) this.origin, (Object) offer.origin) && this.promoTypeSort == offer.promoTypeSort && Intrinsics.areEqual((Object) this.flags, (Object) offer.flags) && Intrinsics.areEqual((Object) this.availability, (Object) offer.availability) && this.purchasingMin == offer.purchasingMin && Intrinsics.areEqual((Object) this.cdbase, (Object) offer.cdbase) && this.purchasingStep == offer.purchasingStep && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) offer.facilityServiceId) && Intrinsics.areEqual((Object) this.prices, (Object) offer.prices) && Intrinsics.areEqual((Object) this.metiRef, (Object) offer.metiRef) && this.isEligible == offer.isEligible && this.isInAssortment == offer.isInAssortment && this.purchasingMax == offer.purchasingMax && Intrinsics.areEqual((Object) this.traceability, (Object) offer.traceability) && Intrinsics.areEqual((Object) this.freshnessGuarantee, (Object) offer.freshnessGuarantee) && Intrinsics.areEqual((Object) this.isVariableWeight, (Object) offer.isVariableWeight) && Intrinsics.areEqual((Object) this.isAlternativeCheaper, (Object) offer.isAlternativeCheaper);
    }

    @C12580l
    public final APIMAvailability getAvailability() {
        return this.availability;
    }

    @C12580l
    public final String getCdbase() {
        return this.cdbase;
    }

    @C12579k
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final Flags getFlags() {
        return this.flags;
    }

    @C12580l
    public final Integer getFreshnessGuarantee() {
        return this.freshnessGuarantee;
    }

    @C12579k
    public final String getGtin() {
        return this.gtin;
    }

    @C12579k
    public final String getMetiRef() {
        return this.metiRef;
    }

    @C12579k
    public final String getOrigin() {
        return this.origin;
    }

    @C12579k
    public final Prices getPrices() {
        return this.prices;
    }

    public final int getPromoTypeSort() {
        return this.promoTypeSort;
    }

    public final int getPurchasingMax() {
        return this.purchasingMax;
    }

    public final int getPurchasingMin() {
        return this.purchasingMin;
    }

    public final int getPurchasingStep() {
        return this.purchasingStep;
    }

    @C12580l
    public final APITraceability getTraceability() {
        return this.traceability;
    }

    public int hashCode() {
        boolean z = this.isIndispensable;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + this.gtin.hashCode()) * 31;
        boolean z3 = this.isNew;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((((hashCode + (z3 ? 1 : 0)) * 31) + this.origin.hashCode()) * 31) + Integer.hashCode(this.promoTypeSort)) * 31;
        Flags flags2 = this.flags;
        int i = 0;
        int hashCode3 = (hashCode2 + (flags2 == null ? 0 : flags2.hashCode())) * 31;
        APIMAvailability aPIMAvailability = this.availability;
        int hashCode4 = (((hashCode3 + (aPIMAvailability == null ? 0 : aPIMAvailability.hashCode())) * 31) + Integer.hashCode(this.purchasingMin)) * 31;
        String str = this.cdbase;
        int hashCode5 = (((((((((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.purchasingStep)) * 31) + this.facilityServiceId.hashCode()) * 31) + this.prices.hashCode()) * 31) + this.metiRef.hashCode()) * 31;
        boolean z4 = this.isEligible;
        if (z4) {
            z4 = true;
        }
        int i2 = (hashCode5 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isInAssortment;
        if (!z5) {
            z2 = z5;
        }
        int hashCode6 = (((i2 + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.purchasingMax)) * 31;
        APITraceability aPITraceability = this.traceability;
        int hashCode7 = (hashCode6 + (aPITraceability == null ? 0 : aPITraceability.hashCode())) * 31;
        Integer num = this.freshnessGuarantee;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isVariableWeight;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAlternativeCheaper;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    @C12580l
    public final Boolean isAlternativeCheaper() {
        return this.isAlternativeCheaper;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final boolean isInAssortment() {
        return this.isInAssortment;
    }

    public final boolean isIndispensable() {
        return this.isIndispensable;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    @C12580l
    public final Boolean isVariableWeight() {
        return this.isVariableWeight;
    }

    @C12579k
    public String toString() {
        boolean z = this.isIndispensable;
        String str = this.gtin;
        boolean z2 = this.isNew;
        String str2 = this.origin;
        int i = this.promoTypeSort;
        Flags flags2 = this.flags;
        APIMAvailability aPIMAvailability = this.availability;
        int i2 = this.purchasingMin;
        String str3 = this.cdbase;
        int i3 = this.purchasingStep;
        String str4 = this.facilityServiceId;
        Prices prices2 = this.prices;
        String str5 = this.metiRef;
        boolean z3 = this.isEligible;
        boolean z4 = this.isInAssortment;
        int i4 = this.purchasingMax;
        APITraceability aPITraceability = this.traceability;
        Integer num = this.freshnessGuarantee;
        Boolean bool = this.isVariableWeight;
        Boolean bool2 = this.isAlternativeCheaper;
        return "Offer(isIndispensable=" + z + ", gtin=" + str + ", isNew=" + z2 + ", origin=" + str2 + ", promoTypeSort=" + i + ", flags=" + flags2 + ", availability=" + aPIMAvailability + ", purchasingMin=" + i2 + ", cdbase=" + str3 + ", purchasingStep=" + i3 + ", facilityServiceId=" + str4 + ", prices=" + prices2 + ", metiRef=" + str5 + ", isEligible=" + z3 + ", isInAssortment=" + z4 + ", purchasingMax=" + i4 + ", traceability=" + aPITraceability + ", freshnessGuarantee=" + num + ", isVariableWeight=" + bool + ", isAlternativeCheaper=" + bool2 + ")";
    }
}
