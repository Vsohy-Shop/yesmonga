package com.carrefour.fid.android.domain.models.product;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.domain.C37479b;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/TraceabilityType;", "", "", "value", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "", "stringResId", "I", "q", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum TraceabilityType {
    BREEDING_AREA("breeding_area", C37479b.C37490k.breeding_area),
    FISHING_AREA("fishing_area", C37479b.C37490k.fishing_area),
    UNDER_FISHING_AREA("under_fishing_area", C37479b.C37490k.under_fishing_area),
    LATIN_FISHNAME("latin_fishName", C37479b.C37490k.latin_fishName),
    BORN_IN("born_in", C37479b.C37490k.born_in),
    RAISED_IN("raised_in", C37479b.C37490k.raised_in),
    SHOT_IN("shot_in", C37479b.C37490k.shot_in),
    AGE_AT_SLAUGHTER("age_at_slaughter", C37479b.C37490k.age_at_slaughter),
    TURNED_INTO("turned_into", C37479b.C37490k.turned_into),
    SALT_ADDITION("salt_addition", C37479b.C37490k.salt_addition),
    CAPTURE_GEAR("capture_gear", C37479b.C37490k.capture_gear),
    PRODUCTION_METHOD("production_method", C37479b.C37490k.production_method),
    THAWED_PRODUCTS("thawed_products", C37479b.C37490k.thawed_products),
    BRINE_PRODUCTS("brine_products", C37479b.C37490k.brine_products),
    CALIBER("caliber", C37479b.C37490k.caliber),
    VARIETY("variety", C37479b.C37490k.variety),
    CATEGORY("category", C37479b.C37490k.category);
    
    private final int stringResId;
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    TraceabilityType(String str, @C0324b1 int i) {
        this.value = str;
        this.stringResId = i;
    }

    /* renamed from: q */
    public final int mo118651q() {
        return this.stringResId;
    }

    @C12579k
    /* renamed from: r */
    public final String mo118652r() {
        return this.value;
    }
}
