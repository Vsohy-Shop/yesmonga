package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APITraceability;
import com.carrefour.fid.android.domain.models.product.Traceability;
import com.carrefour.fid.android.domain.models.product.TraceabilityType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.j */
public final class C36453j {
    @C12579k
    /* renamed from: a */
    public static final List<Traceability> m149526a(@C12579k APITraceability aPITraceability) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Intrinsics.checkNotNullParameter(aPITraceability, "<this>");
        ArrayList arrayList = new ArrayList();
        String breedingArea = aPITraceability.getBreedingArea();
        boolean z17 = false;
        if (breedingArea == null || C11622t.isBlank(breedingArea)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(new Traceability(TraceabilityType.BREEDING_AREA, aPITraceability.getBreedingArea()));
        }
        String fishingArea = aPITraceability.getFishingArea();
        if (fishingArea == null || C11622t.isBlank(fishingArea)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            arrayList.add(new Traceability(TraceabilityType.FISHING_AREA, aPITraceability.getFishingArea()));
        }
        String underFishingArea = aPITraceability.getUnderFishingArea();
        if (underFishingArea == null || C11622t.isBlank(underFishingArea)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            arrayList.add(new Traceability(TraceabilityType.UNDER_FISHING_AREA, aPITraceability.getUnderFishingArea()));
        }
        String latinFishName = aPITraceability.getLatinFishName();
        if (latinFishName == null || C11622t.isBlank(latinFishName)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            arrayList.add(new Traceability(TraceabilityType.LATIN_FISHNAME, aPITraceability.getLatinFishName()));
        }
        String bornIn = aPITraceability.getBornIn();
        if (bornIn == null || C11622t.isBlank(bornIn)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            arrayList.add(new Traceability(TraceabilityType.BORN_IN, aPITraceability.getBornIn()));
        }
        String raisedIn = aPITraceability.getRaisedIn();
        if (raisedIn == null || C11622t.isBlank(raisedIn)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            arrayList.add(new Traceability(TraceabilityType.RAISED_IN, aPITraceability.getRaisedIn()));
        }
        String shotIn = aPITraceability.getShotIn();
        if (shotIn == null || C11622t.isBlank(shotIn)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            arrayList.add(new Traceability(TraceabilityType.SHOT_IN, aPITraceability.getShotIn()));
        }
        String ageAtSlaughter = aPITraceability.getAgeAtSlaughter();
        if (ageAtSlaughter == null || C11622t.isBlank(ageAtSlaughter)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            arrayList.add(new Traceability(TraceabilityType.AGE_AT_SLAUGHTER, aPITraceability.getAgeAtSlaughter()));
        }
        String turnedInto = aPITraceability.getTurnedInto();
        if (turnedInto == null || C11622t.isBlank(turnedInto)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            arrayList.add(new Traceability(TraceabilityType.TURNED_INTO, aPITraceability.getTurnedInto()));
        }
        String saltAddition = aPITraceability.getSaltAddition();
        if (saltAddition == null || C11622t.isBlank(saltAddition)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            arrayList.add(new Traceability(TraceabilityType.SALT_ADDITION, aPITraceability.getSaltAddition()));
        }
        String captureGear = aPITraceability.getCaptureGear();
        if (captureGear == null || C11622t.isBlank(captureGear)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            arrayList.add(new Traceability(TraceabilityType.CAPTURE_GEAR, aPITraceability.getCaptureGear()));
        }
        String productionMethod = aPITraceability.getProductionMethod();
        if (productionMethod == null || C11622t.isBlank(productionMethod)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            arrayList.add(new Traceability(TraceabilityType.PRODUCTION_METHOD, aPITraceability.getProductionMethod()));
        }
        String thawedProducts = aPITraceability.getThawedProducts();
        if (thawedProducts == null || C11622t.isBlank(thawedProducts)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            arrayList.add(new Traceability(TraceabilityType.THAWED_PRODUCTS, aPITraceability.getThawedProducts()));
        }
        String brineProducts = aPITraceability.getBrineProducts();
        if (brineProducts == null || C11622t.isBlank(brineProducts)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            arrayList.add(new Traceability(TraceabilityType.BRINE_PRODUCTS, aPITraceability.getBrineProducts()));
        }
        String caliber = aPITraceability.getCaliber();
        if (caliber == null || C11622t.isBlank(caliber)) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            arrayList.add(new Traceability(TraceabilityType.CALIBER, aPITraceability.getCaliber()));
        }
        String variety = aPITraceability.getVariety();
        if (variety == null || C11622t.isBlank(variety)) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z16) {
            arrayList.add(new Traceability(TraceabilityType.VARIETY, aPITraceability.getVariety()));
        }
        String category = aPITraceability.getCategory();
        if (category == null || C11622t.isBlank(category)) {
            z17 = true;
        }
        if (!z17) {
            arrayList.add(new Traceability(TraceabilityType.CATEGORY, aPITraceability.getCategory()));
        }
        return arrayList;
    }
}
