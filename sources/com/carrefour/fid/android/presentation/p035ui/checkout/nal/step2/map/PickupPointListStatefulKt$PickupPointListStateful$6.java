package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$6 */
public final class PickupPointListStatefulKt$PickupPointListStateful$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $externalPickupPrice;
    final /* synthetic */ C11300l<C38080a, C11079d2> $onCurrentItemChanged;
    final /* synthetic */ C11300l<C38080a, C11079d2> $onPickupSelected;
    final /* synthetic */ PickupPointsMapViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointListStatefulKt$PickupPointListStateful$6(PickupPointsMapViewModel pickupPointsMapViewModel, float f, C11300l<? super C38080a, C11079d2> lVar, C11300l<? super C38080a, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$viewModel = pickupPointsMapViewModel;
        this.$externalPickupPrice = f;
        this.$onCurrentItemChanged = lVar;
        this.$onPickupSelected = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PickupPointListStatefulKt.m105131a(this.$viewModel, this.$externalPickupPrice, this.$onCurrentItemChanged, this.$onPickupSelected, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
