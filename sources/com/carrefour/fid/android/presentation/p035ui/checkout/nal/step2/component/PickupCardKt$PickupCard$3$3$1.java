package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import com.carrefour.fid.android.domain.models.pickup.C38080a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupCardKt$PickupCard$3$3$1 */
public final class PickupCardKt$PickupCard$3$3$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C38080a, C11079d2> $onPickupSelected;
    final /* synthetic */ C38080a $pickupPoint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupCardKt$PickupCard$3$3$1(C11300l<? super C38080a, C11079d2> lVar, C38080a aVar) {
        super(0);
        this.$onPickupSelected = lVar;
        this.$pickupPoint = aVar;
    }

    public final void invoke() {
        this.$onPickupSelected.invoke(this.$pickupPoint);
    }
}
