package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/pickup/a;", "pickupPoint", "", "a", "(Lcom/carrefour/fid/android/domain/models/pickup/a;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$makePriceFormatter$1 */
public final class PickupPointListStatefulKt$makePriceFormatter$1 extends Lambda implements C11300l<C38080a, String> {
    final /* synthetic */ float $externalPickupPrice;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointListStatefulKt$makePriceFormatter$1(float f) {
        super(1);
        this.$externalPickupPrice = f;
    }

    @C12580l
    /* renamed from: a */
    public final String invoke(@C12579k C38080a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "pickupPoint");
        if (aVar.mo118295v()) {
            return null;
        }
        float t = C11479u.m44444t(this.$externalPickupPrice, 0.0f);
        if (t > 0.0f) {
            return C28782t.m119108e((double) t);
        }
        return null;
    }
}
