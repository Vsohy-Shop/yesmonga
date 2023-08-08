package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryState;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$4 */
public final class DeliverySummaryStatefulKt$DeliverySummaryScreen$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<DeliverySummaryAction, C11079d2> $actioner;
    final /* synthetic */ Address $address;
    final /* synthetic */ DeliveryType $deliveryType;
    final /* synthetic */ boolean $displayExitDialog;
    final /* synthetic */ C11907e<DeliverySummarySideEffect> $sideEffect;
    final /* synthetic */ DeliverySummaryState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$DeliverySummaryScreen$4(DeliverySummaryState deliverySummaryState, Address address, DeliveryType deliveryType, boolean z, C11907e<? extends DeliverySummarySideEffect> eVar, C11300l<? super DeliverySummaryAction, C11079d2> lVar, int i) {
        super(2);
        this.$state = deliverySummaryState;
        this.$address = address;
        this.$deliveryType = deliveryType;
        this.$displayExitDialog = z;
        this.$sideEffect = eVar;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DeliverySummaryStatefulKt.DeliverySummaryScreen(this.$state, this.$address, this.$deliveryType, this.$displayExitDialog, this.$sideEffect, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
