package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.Flags;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.h */
public final class C36451h {
    @C12579k
    /* renamed from: a */
    public static final List<OfferFlag> m149523a(@C12579k Flags flags) {
        Intrinsics.checkNotNullParameter(flags, "<this>");
        ArrayList arrayList = new ArrayList();
        Boolean isAddedSugarFree = flags.isAddedSugarFree();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual((Object) isAddedSugarFree, (Object) bool)) {
            arrayList.add(OfferFlag.ADDED_SUGAR_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isAdditifsFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.ADDITIFS_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isAntibioticFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.ANTIBIOTIC_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isAop(), (Object) bool)) {
            arrayList.add(OfferFlag.AOP);
        }
        if (Intrinsics.areEqual((Object) flags.isArtificialColorsFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_COLORS_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isArtificialFragranceFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_FRAGRANCE_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isArtificialPreservativesFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_PRESERVATIVES_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isAsc(), (Object) bool)) {
            arrayList.add(OfferFlag.ASC);
        }
        if (Intrinsics.areEqual((Object) flags.isAspartameFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.ASPARTAME_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isAwardWinnerWine(), (Object) bool)) {
            arrayList.add(OfferFlag.AWARD_WINNER_WINE);
        }
        if (Intrinsics.areEqual((Object) flags.isCarrefourBrand(), (Object) bool)) {
            arrayList.add(OfferFlag.CARREFOUR_BRAND);
        }
        if (Intrinsics.areEqual((Object) flags.isCarrefourQualityAssured(), (Object) bool)) {
            arrayList.add(OfferFlag.CARREFOUR_QUALITY_ASSURED);
        }
        if (Intrinsics.areEqual((Object) flags.isCerealFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.CEREAL_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isClpAcuteToxicity(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_ACUTE_TOXICITY);
        }
        if (Intrinsics.areEqual((Object) flags.isClpCorrosive(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_CORROSIVE);
        }
        if (Intrinsics.areEqual((Object) flags.isClpExplosive(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_EXPLOSIVE);
        }
        if (Intrinsics.areEqual((Object) flags.isClpFlammable(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_FLAMMABLE);
        }
        if (Intrinsics.areEqual((Object) flags.isClpGazUnderPressure(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_GAZ_UNDER_PRESSURE);
        }
        if (Intrinsics.areEqual((Object) flags.isClpHazardousToEnvironment(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_HAZARDOUS_TO_ENVIRONMENT);
        }
        if (Intrinsics.areEqual((Object) flags.isClpHealthHazard(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_HEALTH_HAZARD);
        }
        if (Intrinsics.areEqual((Object) flags.isClpOxidising(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_OXIDISING);
        }
        if (Intrinsics.areEqual((Object) flags.isClpSeriousHealthHazard(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_SERIOUS_HEALTH_HAZARD);
        }
        if (Intrinsics.areEqual((Object) flags.isClubBio(), (Object) bool)) {
            arrayList.add(OfferFlag.CLUB_BIO);
        }
        if (Intrinsics.areEqual((Object) flags.isClubMarche(), (Object) bool)) {
            arrayList.add(OfferFlag.CLUB_MARCHE);
        }
        if (Intrinsics.areEqual((Object) flags.isClubFamily(), (Object) bool)) {
            arrayList.add(OfferFlag.CLUB_FAMILY);
        }
        if (Intrinsics.areEqual((Object) flags.isCosher(), (Object) bool)) {
            arrayList.add(OfferFlag.COSHER);
        }
        if (Intrinsics.areEqual((Object) flags.isDefrost(), (Object) bool)) {
            arrayList.add(OfferFlag.DEFROST);
        }
        if (Intrinsics.areEqual((Object) flags.isEcoFriendly(), (Object) bool)) {
            arrayList.add(OfferFlag.ECO_FRIENDLY);
        }
        if (Intrinsics.areEqual((Object) flags.isEcoPackaged(), (Object) bool)) {
            arrayList.add(OfferFlag.ECO_PACKAGED);
        }
        if (Intrinsics.areEqual((Object) flags.isEligibleGlovo(), (Object) bool)) {
            arrayList.add(OfferFlag.ELIGIBLE_GLOVO);
        }
        if (Intrinsics.areEqual((Object) flags.isFairTrade(), (Object) bool)) {
            arrayList.add(OfferFlag.FAIR_TRADE);
        }
        if (Intrinsics.areEqual((Object) flags.isFatFree(), (Object) bool)) {
            arrayList.add(OfferFlag.FAT_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isFlavorEnhancerFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.FLAVOR_ENHANCER_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isFreeRangeChicken(), (Object) bool)) {
            arrayList.add(OfferFlag.FREE_RANGE_CHICKEN);
        }
        if (Intrinsics.areEqual((Object) flags.isFrenchBeef(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_BEEF);
        }
        if (Intrinsics.areEqual((Object) flags.isFrenchFruitOrVegetable(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_FRUIT_OR_VEGETABLE);
        }
        if (Intrinsics.areEqual((Object) flags.isFrenchPork(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_PORK);
        }
        if (Intrinsics.areEqual((Object) flags.isFrenchPoultryMeat(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_POULTRY_MEAT);
        }
        if (Intrinsics.areEqual((Object) flags.isFrenchVealMeat(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_VEAL_MEAT);
        }
        if (Intrinsics.areEqual((Object) flags.isFrozen(), (Object) bool)) {
            arrayList.add(OfferFlag.FROZEN);
        }
        if (Intrinsics.areEqual((Object) flags.isFsc(), (Object) bool)) {
            arrayList.add(OfferFlag.FSC);
        }
        if (Intrinsics.areEqual((Object) flags.isGlutenFree(), (Object) bool)) {
            arrayList.add(OfferFlag.GLUTEN_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isGmoFree(), (Object) bool)) {
            arrayList.add(OfferFlag.GMO_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isHalal(), (Object) bool)) {
            arrayList.add(OfferFlag.HALAL);
        }
        if (Intrinsics.areEqual((Object) flags.isHydrogenatedOilFree(), (Object) bool)) {
            arrayList.add(OfferFlag.HYDROGENATED_OIL_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isIdealForInfant(), (Object) bool)) {
            arrayList.add(OfferFlag.IDEAL_FOR_INFANT);
        }
        if (Intrinsics.areEqual((Object) flags.isInadvisableForPregnantWomen(), (Object) bool)) {
            arrayList.add(OfferFlag.INADVISABLE_FOR_PREGNANT_WOMEN);
        }
        if (Intrinsics.areEqual((Object) flags.isIndividualFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.INDIVIDUAL_FORMAT);
        }
        if (Intrinsics.areEqual((Object) flags.isInnovation(), (Object) bool)) {
            arrayList.add(OfferFlag.INNOVATION);
        }
        if (Intrinsics.areEqual((Object) flags.isLabelRouge(), (Object) bool)) {
            arrayList.add(OfferFlag.LABEL_ROUGE);
        }
        if (Intrinsics.areEqual((Object) flags.isLactoseFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.LACTOSE_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isLargeFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.LARGE_FORMAT);
        }
        if (Intrinsics.areEqual((Object) flags.isLight(), (Object) bool)) {
            arrayList.add(OfferFlag.LIGHT);
        }
        if (Intrinsics.areEqual((Object) flags.isLoopProduct(), (Object) bool)) {
            arrayList.add(OfferFlag.LOOP_PRODUCT);
        }
        if (Intrinsics.areEqual((Object) flags.isLowFat(), (Object) bool)) {
            arrayList.add(OfferFlag.LOW_FAT);
        }
        if (Intrinsics.areEqual((Object) flags.isLowSugar(), (Object) bool)) {
            arrayList.add(OfferFlag.LOW_SUGAR);
        }
        if (Intrinsics.areEqual((Object) flags.isMadeInFrance(), (Object) bool)) {
            arrayList.add(OfferFlag.MADE_IN_FRANCE);
        }
        if (Intrinsics.areEqual((Object) flags.isOrganic(), (Object) bool)) {
            arrayList.add(OfferFlag.ORGANIC);
        }
        if (Intrinsics.areEqual((Object) flags.isParabenFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PARABEN_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isPesticidesFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.PESTICIDES_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isPhenoxyethanolFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.PHENOXYETHANOL_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isPhenylalanineFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PHENYLALANINE_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isProtectedGeographicalIndication(), (Object) bool)) {
            arrayList.add(OfferFlag.PROTECTED_GEOGRAPHICAL_INDICATION);
        }
        if (Intrinsics.areEqual((Object) flags.isPureJuice(), (Object) bool)) {
            arrayList.add(OfferFlag.PURE_JUICE);
        }
        if (Intrinsics.areEqual((Object) flags.isRaisedOutdoorChicken(), (Object) bool)) {
            arrayList.add(OfferFlag.RAISED_OUTDOOR_CHICKEN);
        }
        if (Intrinsics.areEqual((Object) flags.isRedSheep(), (Object) bool)) {
            arrayList.add(OfferFlag.RED_SHEEP);
        }
        if (Intrinsics.areEqual((Object) flags.isRichInOmega3(), (Object) bool)) {
            arrayList.add(OfferFlag.RICH_IN_OMEGA3);
        }
        if (Intrinsics.areEqual((Object) flags.isSaltFree(), (Object) bool)) {
            arrayList.add(OfferFlag.SALT_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isSmallFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.SMALL_FORMAT);
        }
        if (Intrinsics.areEqual((Object) flags.isSpecialForCommunities(), (Object) bool)) {
            arrayList.add(OfferFlag.SPECIAL_FOR_COMMUNITIES);
        }
        if (Intrinsics.areEqual((Object) flags.isSugarDiet(), (Object) bool)) {
            arrayList.add(OfferFlag.SUGAR_DIET);
        }
        if (Intrinsics.areEqual((Object) flags.isSugarFree(), (Object) bool)) {
            arrayList.add(OfferFlag.SUGAR_FREE);
        }
        if (Intrinsics.areEqual((Object) flags.isSustainable(), (Object) bool)) {
            arrayList.add(OfferFlag.SUSTAINABLE);
        }
        if (Intrinsics.areEqual((Object) flags.isSustainableFisheries(), (Object) bool)) {
            arrayList.add(OfferFlag.SUSTAINABLE_FISHERIES);
        }
        if (Intrinsics.areEqual((Object) flags.isSweeteningFreeFrom(), (Object) bool)) {
            arrayList.add(OfferFlag.SWEETENING_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) flags.isTraditionalSpecialitiesGuaranteed(), (Object) bool)) {
            arrayList.add(OfferFlag.TRADITIONAL_SPECIALITIES_GUARANTEED);
        }
        if (Intrinsics.areEqual((Object) flags.isVegetarian(), (Object) bool)) {
            arrayList.add(OfferFlag.VEGETARIAN);
        }
        if (Intrinsics.areEqual((Object) flags.isVerifiedAllergoBox(), (Object) bool)) {
            arrayList.add(OfferFlag.VERIFIED_ALLERGO_BOX);
        }
        if (Intrinsics.areEqual((Object) flags.isCrisisRecipeChange(), (Object) bool)) {
            arrayList.add(OfferFlag.CRISIS_RECIPE_CHANGE);
        }
        if (Intrinsics.areEqual((Object) flags.isCrisisAllergenAdded(), (Object) bool)) {
            arrayList.add(OfferFlag.CRISIS_ALLERGEN_ADDED);
        }
        return CollectionsKt___CollectionsKt.m40557Q5(arrayList);
    }
}
