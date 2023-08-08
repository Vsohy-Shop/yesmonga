package com.carrefour.fid.android.presentation.models;

import com.carrefour.fid.android.ecommerce.utils.C38215e;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CouponCategory;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CouponCategory {
    OFFRES_SPECIALES("offresevent"),
    PRET_A_DEGUSTER("pretdeguster"),
    PAIN_ET_PATISSERIES("painspatisseries"),
    VIANDES_ET_POISSONS("viandespoissons"),
    HYGIENE_ET_BEAUTE("hygieneetbeaute"),
    CHARCUTERIE("charcuterie"),
    CREMERIE("cremerie"),
    SURGELES("surgeles"),
    EPICERIE_SALEE("epiceriesalee"),
    EPICERIE_SUCREE("epiceriesucree"),
    BOISSONS("boissons"),
    ALCOOL("boissons_alcool"),
    BOISSONS_ET_VINS("boissonsetvins"),
    BIO(C38215e.f96826c),
    BEBE("bebe"),
    HYGIENE("hygiene"),
    ENTRETIEN_ET_NETTOYAGE("maison_entretien"),
    MAISON_ET_DECORATION("maison"),
    ANIMALERIE("animaux"),
    TRAITEUR("traiteur"),
    FRUITS_ET_LEGUMES("fruitslegumes"),
    OTHERS("autres");
    
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    CouponCategory(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo121356q() {
        return this.value;
    }
}
