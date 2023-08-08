package com.carrefour.fid.android.domain.models.product;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.domain.C37479b;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/AllergenType;", "", "", "nameResourceId", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum AllergenType {
    IS_CONTAINING_CELERY(C37479b.C37490k.pdp_allergen_celeri),
    IS_CONTAINING_CRUSTACEANS(C37479b.C37490k.pdp_allergen_crustaceans),
    IS_CONTAINING_EGG(C37479b.C37490k.pdp_allergen_egg),
    IS_CONTAINING_FISH(C37479b.C37490k.pdp_allergen_fish),
    IS_CONTAINING_GLUTEN(C37479b.C37490k.pdp_allergen_gluten),
    IS_CONTAINING_LACTOSE(C37479b.C37490k.pdp_allergen_lactose),
    IS_CONTAINING_LUPINE(C37479b.C37490k.pdp_allergen_lupine),
    IS_CONTAINING_MOLLUSCS(C37479b.C37490k.pdp_allergen_molluscs),
    IS_CONTAINING_MUSTARD(C37479b.C37490k.pdp_allergen_mustard),
    IS_CONTAINING_PEANUTS(C37479b.C37490k.pdp_allergen_peanauts),
    IS_CONTAINING_SESAME_SEEDS(C37479b.C37490k.pdp_allergen_sesame_seeds),
    IS_CONTAINING_SHELLNUTS(C37479b.C37490k.pdp_allergen_shellnuts),
    IS_CONTAINING_SOYA(C37479b.C37490k.pdp_allergen_soya),
    IS_CONTAINING_SULPHUR_DIOXIDE(C37479b.C37490k.pdp_allergen_sulphur_dioxide);
    
    private final int nameResourceId;

    /* access modifiers changed from: public */
    AllergenType(@C0324b1 int i) {
        this.nameResourceId = i;
    }

    /* renamed from: q */
    public final int mo118334q() {
        return this.nameResourceId;
    }
}
