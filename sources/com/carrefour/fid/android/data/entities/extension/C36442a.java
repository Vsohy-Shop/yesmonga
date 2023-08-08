package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APIMAllergens;
import com.carrefour.fid.android.domain.models.product.AllergenType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.a */
public final class C36442a {
    @C12579k
    /* renamed from: a */
    public static final List<AllergenType> m149511a(@C12579k APIMAllergens aPIMAllergens) {
        Intrinsics.checkNotNullParameter(aPIMAllergens, "<this>");
        ArrayList arrayList = new ArrayList();
        Boolean is_containing_celery = aPIMAllergens.is_containing_celery();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual((Object) is_containing_celery, (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_CELERY);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_crustaceans(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_CRUSTACEANS);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_egg(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_EGG);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_fish(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_FISH);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_gluten(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_GLUTEN);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_lactose(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_LACTOSE);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_lupine(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_LUPINE);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_molluscs(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_MOLLUSCS);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_mustard(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_MUSTARD);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_peanuts(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_PEANUTS);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_sesame_seeds(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SESAME_SEEDS);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_shellnuts(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SHELLNUTS);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_soya(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SOYA);
        }
        if (Intrinsics.areEqual((Object) aPIMAllergens.is_containing_sulphur_dioxide(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SULPHUR_DIOXIDE);
        }
        return CollectionsKt___CollectionsKt.m40557Q5(arrayList);
    }
}
