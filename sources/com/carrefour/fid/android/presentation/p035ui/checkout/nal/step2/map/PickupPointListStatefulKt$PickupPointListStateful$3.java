package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$3 */
public final class PickupPointListStatefulKt$PickupPointListStateful$3 extends Lambda implements C11300l<C38080a, C11079d2> {
    final /* synthetic */ C11300l<C38080a, C11079d2> $onPickupSelected;
    final /* synthetic */ PickupPointsMapViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointListStatefulKt$PickupPointListStateful$3(PickupPointsMapViewModel pickupPointsMapViewModel, C11300l<? super C38080a, C11079d2> lVar) {
        super(1);
        this.$viewModel = pickupPointsMapViewModel;
        this.$onPickupSelected = lVar;
    }

    /* renamed from: a */
    public final void mo69418a(@C12579k C38080a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        this.$viewModel.mo76070g0(aVar);
        this.$onPickupSelected.invoke(aVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69418a((C38080a) obj);
        return C11079d2.f28267a;
    }
}
