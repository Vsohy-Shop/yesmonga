package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import dev.chrisbanes.snapper.C10368f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupListComponentKt$PickupListComponent$1 */
public final class PickupListComponentKt$PickupListComponent$1 extends Lambda implements C11305q<C10368f, Integer, Integer, Integer> {

    /* renamed from: f */
    public static final PickupListComponentKt$PickupListComponent$1 f59693f = new PickupListComponentKt$PickupListComponent$1();

    public PickupListComponentKt$PickupListComponent$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C10368f) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    @C12579k
    public final Integer invoke(@C12579k C10368f fVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "layoutInfo");
        return Integer.valueOf(C11479u.m44334I(C11479u.m44334I(i2, i - 2, i + 2), 0, fVar.mo21759h() - 1));
    }
}
