package com.carrefour.fid.android.core.type;

import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b+\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PriorityFlag;", "", "", "detailPriority", "I", "q", "()I", "listPriority", "r", "<init>", "(Ljava/lang/String;III)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "V0", "W0", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum PriorityFlag {
    ADDED_SUGAR_FREE(17, 17),
    AOP(4, 4),
    CLP_ACUTE_TOXICITY(-1, 21),
    CLP_CORROSIVE(-1, 21),
    CLP_EXPLOSIVE(-1, 21),
    CLP_FLAMMABLE(-1, 21),
    CLP_GAZ_UNDER_PRESSURE(-1, 21),
    CLP_HAZARDOUS_TO_ENVIRONMENT(-1, 21),
    CLP_HEALTH_HAZARD(-1, 21),
    CLP_OXIDISING(-1, 21),
    CLP_SERIOUS_HEALTH_HAZARD(-1, 21),
    FAIR_TRADE(14, 14),
    FRENCH_FRUIT_OR_VEGETABLE(10, 10),
    FROZEN(2, 2),
    FAT_FREE(16, 16),
    INADVISABLE_FOR_PREGNANT_WOMEN(-1, 20),
    IDEAL_FOR_INFANT(4, 4),
    GMO_FREE(12, 12),
    LABEL_ROUGE(7, 7),
    FRENCH_BEEF(9, 9),
    FRENCH_PORK(8, 8),
    FRENCH_POULTRY_MEAT(9, 9),
    FRENCH_VEAL_MEAT(9, 9),
    FSC(5, 5),
    GLUTEN_FREE(13, 13),
    ORGANIC(3, 3),
    VEGETARIAN(15, 15),
    SUGAR_FREE(17, 17),
    ECO_FRIENDLY(3, 3),
    LACTOSE_FREE_FROM(13, 13),
    SUSTAINABLE_FISHERIES(7, 7),
    CRISIS_RECIPE_CHANGE(1, 1),
    CRISIS_ALLERGEN_ADDED(1, 1),
    DEFAULT(-1, 0, 2, (int) null);
    
    private final int detailPriority;
    private final int listPriority;

    /* access modifiers changed from: public */
    PriorityFlag(int i, int i2) {
        this.detailPriority = i;
        this.listPriority = i2;
    }

    /* renamed from: q */
    public final int mo108592q() {
        return this.detailPriority;
    }

    /* renamed from: r */
    public final int mo108593r() {
        return this.listPriority;
    }
}
