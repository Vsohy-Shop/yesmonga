package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 ^2\u00020\u0001:\u0002_^BÓ\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bX\u0010YBç\u0001\b\u0017\u0012\u0006\u0010Z\u001a\u00020.\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bX\u0010]J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JÕ\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020.HÖ\u0001J\u0013\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00103\u0012\u0004\b9\u00107\u001a\u0004\b8\u00105R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00103\u0012\u0004\b;\u00107\u001a\u0004\b:\u00105R\"\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b=\u00107\u001a\u0004\b<\u00105R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00103\u0012\u0004\b?\u00107\u001a\u0004\b>\u00105R\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u00103\u0012\u0004\bA\u00107\u001a\u0004\b@\u00105R\"\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00103\u0012\u0004\bC\u00107\u001a\u0004\bB\u00105R\"\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u00103\u0012\u0004\bE\u00107\u001a\u0004\bD\u00105R\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u00103\u0012\u0004\bG\u00107\u001a\u0004\bF\u00105R\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u00103\u0012\u0004\bI\u00107\u001a\u0004\bH\u00105R\"\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u00103\u0012\u0004\bK\u00107\u001a\u0004\bJ\u00105R\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u00103\u0012\u0004\bM\u00107\u001a\u0004\bL\u00105R\"\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00103\u0012\u0004\bO\u00107\u001a\u0004\bN\u00105R\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u00103\u0012\u0004\bQ\u00107\u001a\u0004\bP\u00105R\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u00103\u0012\u0004\bS\u00107\u001a\u0004\bR\u00105R\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u00103\u0012\u0004\bU\u00107\u001a\u0004\bT\u00105R\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u00103\u0012\u0004\bW\u00107\u001a\u0004\bV\u00105¨\u0006`"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "saltAddition", "captureGear", "productionMethod", "latinFishName", "thawedProducts", "brineProducts", "breedingArea", "fishingArea", "underFishingArea", "caliber", "variety", "shotIn", "ageAtSlaughter", "category", "raisedIn", "bornIn", "turnedInto", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSaltAddition", "()Ljava/lang/String;", "getSaltAddition$annotations", "()V", "getCaptureGear", "getCaptureGear$annotations", "getProductionMethod", "getProductionMethod$annotations", "getLatinFishName", "getLatinFishName$annotations", "getThawedProducts", "getThawedProducts$annotations", "getBrineProducts", "getBrineProducts$annotations", "getBreedingArea", "getBreedingArea$annotations", "getFishingArea", "getFishingArea$annotations", "getUnderFishingArea", "getUnderFishingArea$annotations", "getCaliber", "getCaliber$annotations", "getVariety", "getVariety$annotations", "getShotIn", "getShotIn$annotations", "getAgeAtSlaughter", "getAgeAtSlaughter$annotations", "getCategory", "getCategory$annotations", "getRaisedIn", "getRaisedIn$annotations", "getBornIn", "getBornIn$annotations", "getTurnedInto", "getTurnedInto$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffTraceability {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String ageAtSlaughter;
    @C12580l
    private final String bornIn;
    @C12580l
    private final String breedingArea;
    @C12580l
    private final String brineProducts;
    @C12580l
    private final String caliber;
    @C12580l
    private final String captureGear;
    @C12580l
    private final String category;
    @C12580l
    private final String fishingArea;
    @C12580l
    private final String latinFishName;
    @C12580l
    private final String productionMethod;
    @C12580l
    private final String raisedIn;
    @C12580l
    private final String saltAddition;
    @C12580l
    private final String shotIn;
    @C12580l
    private final String thawedProducts;
    @C12580l
    private final String turnedInto;
    @C12580l
    private final String underFishingArea;
    @C12580l
    private final String variety;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffTraceability> serializer() {
            return BffTraceability$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffTraceability() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffTraceability copy$default(BffTraceability bffTraceability, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, Object obj) {
        BffTraceability bffTraceability2 = bffTraceability;
        int i2 = i;
        return bffTraceability.copy((i2 & 1) != 0 ? bffTraceability2.saltAddition : str, (i2 & 2) != 0 ? bffTraceability2.captureGear : str2, (i2 & 4) != 0 ? bffTraceability2.productionMethod : str3, (i2 & 8) != 0 ? bffTraceability2.latinFishName : str4, (i2 & 16) != 0 ? bffTraceability2.thawedProducts : str5, (i2 & 32) != 0 ? bffTraceability2.brineProducts : str6, (i2 & 64) != 0 ? bffTraceability2.breedingArea : str7, (i2 & 128) != 0 ? bffTraceability2.fishingArea : str8, (i2 & 256) != 0 ? bffTraceability2.underFishingArea : str9, (i2 & 512) != 0 ? bffTraceability2.caliber : str10, (i2 & 1024) != 0 ? bffTraceability2.variety : str11, (i2 & 2048) != 0 ? bffTraceability2.shotIn : str12, (i2 & 4096) != 0 ? bffTraceability2.ageAtSlaughter : str13, (i2 & 8192) != 0 ? bffTraceability2.category : str14, (i2 & 16384) != 0 ? bffTraceability2.raisedIn : str15, (i2 & 32768) != 0 ? bffTraceability2.bornIn : str16, (i2 & 65536) != 0 ? bffTraceability2.turnedInto : str17);
    }

    @C12438n("age_at_slaughter")
    public static /* synthetic */ void getAgeAtSlaughter$annotations() {
    }

    @C12438n("born_in")
    public static /* synthetic */ void getBornIn$annotations() {
    }

    @C12438n("breeding_area")
    public static /* synthetic */ void getBreedingArea$annotations() {
    }

    @C12438n("brine_products")
    public static /* synthetic */ void getBrineProducts$annotations() {
    }

    @C12438n("caliber")
    public static /* synthetic */ void getCaliber$annotations() {
    }

    @C12438n("capture_gear")
    public static /* synthetic */ void getCaptureGear$annotations() {
    }

    @C12438n("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @C12438n("fishing_area")
    public static /* synthetic */ void getFishingArea$annotations() {
    }

    @C12438n("latin_fish_name")
    public static /* synthetic */ void getLatinFishName$annotations() {
    }

    @C12438n("production_method")
    public static /* synthetic */ void getProductionMethod$annotations() {
    }

    @C12438n("raised_in")
    public static /* synthetic */ void getRaisedIn$annotations() {
    }

    @C12438n("salt_addition")
    public static /* synthetic */ void getSaltAddition$annotations() {
    }

    @C12438n("shot_in")
    public static /* synthetic */ void getShotIn$annotations() {
    }

    @C12438n("thawed_products")
    public static /* synthetic */ void getThawedProducts$annotations() {
    }

    @C12438n("turned_into")
    public static /* synthetic */ void getTurnedInto$annotations() {
    }

    @C12438n("under_fishing_area")
    public static /* synthetic */ void getUnderFishingArea$annotations() {
    }

    @C12438n("variety")
    public static /* synthetic */ void getVariety$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffTraceability bffTraceability, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffTraceability.saltAddition != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffTraceability.saltAddition);
        }
        if (dVar.mo24897A(fVar, 1) || bffTraceability.captureGear != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffTraceability.captureGear);
        }
        if (dVar.mo24897A(fVar, 2) || bffTraceability.productionMethod != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffTraceability.productionMethod);
        }
        if (dVar.mo24897A(fVar, 3) || bffTraceability.latinFishName != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffTraceability.latinFishName);
        }
        if (dVar.mo24897A(fVar, 4) || bffTraceability.thawedProducts != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffTraceability.thawedProducts);
        }
        if (dVar.mo24897A(fVar, 5) || bffTraceability.brineProducts != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffTraceability.brineProducts);
        }
        if (dVar.mo24897A(fVar, 6) || bffTraceability.breedingArea != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffTraceability.breedingArea);
        }
        if (dVar.mo24897A(fVar, 7) || bffTraceability.fishingArea != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffTraceability.fishingArea);
        }
        if (dVar.mo24897A(fVar, 8) || bffTraceability.underFishingArea != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffTraceability.underFishingArea);
        }
        if (dVar.mo24897A(fVar, 9) || bffTraceability.caliber != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffTraceability.caliber);
        }
        if (dVar.mo24897A(fVar, 10) || bffTraceability.variety != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffTraceability.variety);
        }
        if (dVar.mo24897A(fVar, 11) || bffTraceability.shotIn != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffTraceability.shotIn);
        }
        if (dVar.mo24897A(fVar, 12) || bffTraceability.ageAtSlaughter != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffTraceability.ageAtSlaughter);
        }
        if (dVar.mo24897A(fVar, 13) || bffTraceability.category != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffTraceability.category);
        }
        if (dVar.mo24897A(fVar, 14) || bffTraceability.raisedIn != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffTraceability.raisedIn);
        }
        if (dVar.mo24897A(fVar, 15) || bffTraceability.bornIn != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffTraceability.bornIn);
        }
        if (dVar.mo24897A(fVar, 16) || bffTraceability.turnedInto != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffTraceability.turnedInto);
        }
    }

    @C12580l
    public final String component1() {
        return this.saltAddition;
    }

    @C12580l
    public final String component10() {
        return this.caliber;
    }

    @C12580l
    public final String component11() {
        return this.variety;
    }

    @C12580l
    public final String component12() {
        return this.shotIn;
    }

    @C12580l
    public final String component13() {
        return this.ageAtSlaughter;
    }

    @C12580l
    public final String component14() {
        return this.category;
    }

    @C12580l
    public final String component15() {
        return this.raisedIn;
    }

    @C12580l
    public final String component16() {
        return this.bornIn;
    }

    @C12580l
    public final String component17() {
        return this.turnedInto;
    }

    @C12580l
    public final String component2() {
        return this.captureGear;
    }

    @C12580l
    public final String component3() {
        return this.productionMethod;
    }

    @C12580l
    public final String component4() {
        return this.latinFishName;
    }

    @C12580l
    public final String component5() {
        return this.thawedProducts;
    }

    @C12580l
    public final String component6() {
        return this.brineProducts;
    }

    @C12580l
    public final String component7() {
        return this.breedingArea;
    }

    @C12580l
    public final String component8() {
        return this.fishingArea;
    }

    @C12580l
    public final String component9() {
        return this.underFishingArea;
    }

    @C12579k
    public final BffTraceability copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17) {
        return new BffTraceability(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffTraceability)) {
            return false;
        }
        BffTraceability bffTraceability = (BffTraceability) obj;
        return Intrinsics.areEqual((Object) this.saltAddition, (Object) bffTraceability.saltAddition) && Intrinsics.areEqual((Object) this.captureGear, (Object) bffTraceability.captureGear) && Intrinsics.areEqual((Object) this.productionMethod, (Object) bffTraceability.productionMethod) && Intrinsics.areEqual((Object) this.latinFishName, (Object) bffTraceability.latinFishName) && Intrinsics.areEqual((Object) this.thawedProducts, (Object) bffTraceability.thawedProducts) && Intrinsics.areEqual((Object) this.brineProducts, (Object) bffTraceability.brineProducts) && Intrinsics.areEqual((Object) this.breedingArea, (Object) bffTraceability.breedingArea) && Intrinsics.areEqual((Object) this.fishingArea, (Object) bffTraceability.fishingArea) && Intrinsics.areEqual((Object) this.underFishingArea, (Object) bffTraceability.underFishingArea) && Intrinsics.areEqual((Object) this.caliber, (Object) bffTraceability.caliber) && Intrinsics.areEqual((Object) this.variety, (Object) bffTraceability.variety) && Intrinsics.areEqual((Object) this.shotIn, (Object) bffTraceability.shotIn) && Intrinsics.areEqual((Object) this.ageAtSlaughter, (Object) bffTraceability.ageAtSlaughter) && Intrinsics.areEqual((Object) this.category, (Object) bffTraceability.category) && Intrinsics.areEqual((Object) this.raisedIn, (Object) bffTraceability.raisedIn) && Intrinsics.areEqual((Object) this.bornIn, (Object) bffTraceability.bornIn) && Intrinsics.areEqual((Object) this.turnedInto, (Object) bffTraceability.turnedInto);
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
        String str = this.saltAddition;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.captureGear;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productionMethod;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.latinFishName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thawedProducts;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.brineProducts;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.breedingArea;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fishingArea;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.underFishingArea;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.caliber;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.variety;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.shotIn;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.ageAtSlaughter;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.category;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.raisedIn;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.bornIn;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.turnedInto;
        if (str17 != null) {
            i = str17.hashCode();
        }
        return hashCode16 + i;
    }

    @C12579k
    public String toString() {
        String str = this.saltAddition;
        String str2 = this.captureGear;
        String str3 = this.productionMethod;
        String str4 = this.latinFishName;
        String str5 = this.thawedProducts;
        String str6 = this.brineProducts;
        String str7 = this.breedingArea;
        String str8 = this.fishingArea;
        String str9 = this.underFishingArea;
        String str10 = this.caliber;
        String str11 = this.variety;
        String str12 = this.shotIn;
        String str13 = this.ageAtSlaughter;
        String str14 = this.category;
        String str15 = this.raisedIn;
        String str16 = this.bornIn;
        String str17 = this.turnedInto;
        return "BffTraceability(saltAddition=" + str + ", captureGear=" + str2 + ", productionMethod=" + str3 + ", latinFishName=" + str4 + ", thawedProducts=" + str5 + ", brineProducts=" + str6 + ", breedingArea=" + str7 + ", fishingArea=" + str8 + ", underFishingArea=" + str9 + ", caliber=" + str10 + ", variety=" + str11 + ", shotIn=" + str12 + ", ageAtSlaughter=" + str13 + ", category=" + str14 + ", raisedIn=" + str15 + ", bornIn=" + str16 + ", turnedInto=" + str17 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffTraceability(int i, @C12438n("salt_addition") String str, @C12438n("capture_gear") String str2, @C12438n("production_method") String str3, @C12438n("latin_fish_name") String str4, @C12438n("thawed_products") String str5, @C12438n("brine_products") String str6, @C12438n("breeding_area") String str7, @C12438n("fishing_area") String str8, @C12438n("under_fishing_area") String str9, @C12438n("caliber") String str10, @C12438n("variety") String str11, @C12438n("shot_in") String str12, @C12438n("age_at_slaughter") String str13, @C12438n("category") String str14, @C12438n("raised_in") String str15, @C12438n("born_in") String str16, @C12438n("turned_into") String str17, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffTraceability$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.saltAddition = null;
        } else {
            this.saltAddition = str;
        }
        if ((i2 & 2) == 0) {
            this.captureGear = null;
        } else {
            this.captureGear = str2;
        }
        if ((i2 & 4) == 0) {
            this.productionMethod = null;
        } else {
            this.productionMethod = str3;
        }
        if ((i2 & 8) == 0) {
            this.latinFishName = null;
        } else {
            this.latinFishName = str4;
        }
        if ((i2 & 16) == 0) {
            this.thawedProducts = null;
        } else {
            this.thawedProducts = str5;
        }
        if ((i2 & 32) == 0) {
            this.brineProducts = null;
        } else {
            this.brineProducts = str6;
        }
        if ((i2 & 64) == 0) {
            this.breedingArea = null;
        } else {
            this.breedingArea = str7;
        }
        if ((i2 & 128) == 0) {
            this.fishingArea = null;
        } else {
            this.fishingArea = str8;
        }
        if ((i2 & 256) == 0) {
            this.underFishingArea = null;
        } else {
            this.underFishingArea = str9;
        }
        if ((i2 & 512) == 0) {
            this.caliber = null;
        } else {
            this.caliber = str10;
        }
        if ((i2 & 1024) == 0) {
            this.variety = null;
        } else {
            this.variety = str11;
        }
        if ((i2 & 2048) == 0) {
            this.shotIn = null;
        } else {
            this.shotIn = str12;
        }
        if ((i2 & 4096) == 0) {
            this.ageAtSlaughter = null;
        } else {
            this.ageAtSlaughter = str13;
        }
        if ((i2 & 8192) == 0) {
            this.category = null;
        } else {
            this.category = str14;
        }
        if ((i2 & 16384) == 0) {
            this.raisedIn = null;
        } else {
            this.raisedIn = str15;
        }
        if ((32768 & i2) == 0) {
            this.bornIn = null;
        } else {
            this.bornIn = str16;
        }
        if ((i2 & 65536) == 0) {
            this.turnedInto = null;
        } else {
            this.turnedInto = str17;
        }
    }

    public BffTraceability(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17) {
        this.saltAddition = str;
        this.captureGear = str2;
        this.productionMethod = str3;
        this.latinFishName = str4;
        this.thawedProducts = str5;
        this.brineProducts = str6;
        this.breedingArea = str7;
        this.fishingArea = str8;
        this.underFishingArea = str9;
        this.caliber = str10;
        this.variety = str11;
        this.shotIn = str12;
        this.ageAtSlaughter = str13;
        this.category = str14;
        this.raisedIn = str15;
        this.bornIn = str16;
        this.turnedInto = str17;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffTraceability(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
