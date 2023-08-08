package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$4$1 */
public final class PickupPointListStatefulKt$PickupPointListStateful$4$1 extends Lambda implements C11300l<C38080a, C11079d2> {
    final /* synthetic */ C8700z0<C38080a> $pickupModal$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointListStatefulKt$PickupPointListStateful$4$1(C8700z0<C38080a> z0Var) {
        super(1);
        this.$pickupModal$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo69419a(@C12579k C38080a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        PickupPointListStatefulKt.m105134d(this.$pickupModal$delegate, aVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69419a((C38080a) obj);
        return C11079d2.f28267a;
    }
}
