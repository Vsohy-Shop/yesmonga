package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.data.api.datasource.e */
public final class C27465e {
    @C12579k
    /* renamed from: a */
    public static final List<OfferFlag> m115611a(@C12579k BffProductFlags bffProductFlags) {
        Intrinsics.checkNotNullParameter(bffProductFlags, "<this>");
        ArrayList arrayList = new ArrayList();
        Boolean isAddedSugarFree = bffProductFlags.isAddedSugarFree();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual((Object) isAddedSugarFree, (Object) bool)) {
            arrayList.add(OfferFlag.ADDED_SUGAR_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFreeFromAdditifs(), (Object) bool)) {
            arrayList.add(OfferFlag.ADDITIFS_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isAntibioticFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ANTIBIOTIC_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isAop(), (Object) bool)) {
            arrayList.add(OfferFlag.AOP);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isArtificialColorsFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_COLORS_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isArtificialFragranceFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_FRAGRANCE_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isArtificialPreservativesFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_PRESERVATIVES_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isAwardWinnerWine(), (Object) bool)) {
            arrayList.add(OfferFlag.AWARD_WINNER_WINE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCarrefourBrand(), (Object) bool)) {
            arrayList.add(OfferFlag.CARREFOUR_BRAND);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCarrefourQualityAssured(), (Object) bool)) {
            arrayList.add(OfferFlag.CARREFOUR_QUALITY_ASSURED);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpAcuteToxicity(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_ACUTE_TOXICITY);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpCorrosive(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_CORROSIVE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpExplosive(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_EXPLOSIVE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpFlammable(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_FLAMMABLE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpGazUnderPressure(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_GAZ_UNDER_PRESSURE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpHazardousToEnvironment(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_HAZARDOUS_TO_ENVIRONMENT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpHealthHazard(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_HEALTH_HAZARD);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpOxidising(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_OXIDISING);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpSeriousHealthHazard(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_SERIOUS_HEALTH_HAZARD);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCosher(), (Object) bool)) {
            arrayList.add(OfferFlag.COSHER);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isDefrost(), (Object) bool)) {
            arrayList.add(OfferFlag.DEFROST);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isEcoFriendly(), (Object) bool)) {
            arrayList.add(OfferFlag.ECO_FRIENDLY);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isEcoPackaged(), (Object) bool)) {
            arrayList.add(OfferFlag.ECO_PACKAGED);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFairTrade(), (Object) bool)) {
            arrayList.add(OfferFlag.FAIR_TRADE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFatFree(), (Object) bool)) {
            arrayList.add(OfferFlag.FAT_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFreeRangeChicken(), (Object) bool)) {
            arrayList.add(OfferFlag.FREE_RANGE_CHICKEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrenchBeef(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_BEEF);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrenchFruitOrVegetable(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_FRUIT_OR_VEGETABLE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrenchPork(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_PORK);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFlagFrenchPoultryMeat(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_POULTRY_MEAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFlagFrenchVealMeat(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_VEAL_MEAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrozen(), (Object) bool)) {
            arrayList.add(OfferFlag.FROZEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFsc(), (Object) bool)) {
            arrayList.add(OfferFlag.FSC);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isGlutenFree(), (Object) bool)) {
            arrayList.add(OfferFlag.GLUTEN_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isGmoFree(), (Object) bool)) {
            arrayList.add(OfferFlag.GMO_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isHalal(), (Object) bool)) {
            arrayList.add(OfferFlag.HALAL);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isHydrogenatedOilFree(), (Object) bool)) {
            arrayList.add(OfferFlag.HYDROGENATED_OIL_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isIdealForInfant(), (Object) bool)) {
            arrayList.add(OfferFlag.IDEAL_FOR_INFANT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isInadvisableForPregnantWomen(), (Object) bool)) {
            arrayList.add(OfferFlag.INADVISABLE_FOR_PREGNANT_WOMEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isIndividualFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.INDIVIDUAL_FORMAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isInnovation(), (Object) bool)) {
            arrayList.add(OfferFlag.INNOVATION);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isLabelRouge(), (Object) bool)) {
            arrayList.add(OfferFlag.LABEL_ROUGE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isContainingLactose(), (Object) bool)) {
            arrayList.add(OfferFlag.LACTOSE_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isLargeFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.LARGE_FORMAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isLight(), (Object) bool)) {
            arrayList.add(OfferFlag.LIGHT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isMadeInFrance(), (Object) bool)) {
            arrayList.add(OfferFlag.MADE_IN_FRANCE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isOrganic(), (Object) bool)) {
            arrayList.add(OfferFlag.ORGANIC);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isParabenFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PARABEN_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isPesticideFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PESTICIDES_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isPhenylalanineFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PHENYLALANINE_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isProtectedGeographicalIndication(), (Object) bool)) {
            arrayList.add(OfferFlag.PROTECTED_GEOGRAPHICAL_INDICATION);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isPureJuice(), (Object) bool)) {
            arrayList.add(OfferFlag.PURE_JUICE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isRaisedOutdoorChicken(), (Object) bool)) {
            arrayList.add(OfferFlag.RAISED_OUTDOOR_CHICKEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isRichInOmega3(), (Object) bool)) {
            arrayList.add(OfferFlag.RICH_IN_OMEGA3);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSaltFree(), (Object) bool)) {
            arrayList.add(OfferFlag.SALT_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSmallFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.SMALL_FORMAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSpecialForCommunities(), (Object) bool)) {
            arrayList.add(OfferFlag.SPECIAL_FOR_COMMUNITIES);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSugarDiet(), (Object) bool)) {
            arrayList.add(OfferFlag.SUGAR_DIET);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSugarFree(), (Object) bool)) {
            arrayList.add(OfferFlag.SUGAR_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSustainable(), (Object) bool)) {
            arrayList.add(OfferFlag.SUSTAINABLE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSustainableFisheries(), (Object) bool)) {
            arrayList.add(OfferFlag.SUSTAINABLE_FISHERIES);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isTraditionnalSpecialitiesGuaranteed(), (Object) bool)) {
            arrayList.add(OfferFlag.TRADITIONAL_SPECIALITIES_GUARANTEED);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isVegetarian(), (Object) bool)) {
            arrayList.add(OfferFlag.VEGETARIAN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCrisis(), (Object) bool)) {
            arrayList.add(OfferFlag.CRISIS_RECIPE_CHANGE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCrisisAllergenAdded(), (Object) bool)) {
            arrayList.add(OfferFlag.CRISIS_ALLERGEN_ADDED);
        }
        return CollectionsKt___CollectionsKt.m40557Q5(arrayList);
    }
}
