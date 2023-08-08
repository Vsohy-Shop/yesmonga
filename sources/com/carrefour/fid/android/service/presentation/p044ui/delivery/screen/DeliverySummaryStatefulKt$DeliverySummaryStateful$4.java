package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryStateful$4 */
public final class DeliverySummaryStatefulKt$DeliverySummaryStateful$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Address $address;
    final /* synthetic */ DeliverySummaryAnalyticsReporter $analytics;
    final /* synthetic */ DeliveryType $deliveryType;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToHome;
    final /* synthetic */ C11300l<String, C11079d2> $onValidationError;
    final /* synthetic */ String $phone;
    final /* synthetic */ DeliverySummaryViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$DeliverySummaryStateful$4(DeliverySummaryViewModel deliverySummaryViewModel, DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter, Address address, DeliveryType deliveryType, String str, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11300l<? super String, C11079d2> lVar, int i) {
        super(2);
        this.$viewModel = deliverySummaryViewModel;
        this.$analytics = deliverySummaryAnalyticsReporter;
        this.$address = address;
        this.$deliveryType = deliveryType;
        this.$phone = str;
        this.$onBackPressed = aVar;
        this.$onNavigateToHome = aVar2;
        this.$onValidationError = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DeliverySummaryStatefulKt.DeliverySummaryStateful(this.$viewModel, this.$analytics, this.$address, this.$deliveryType, this.$phone, this.$onBackPressed, this.$onNavigateToHome, this.$onValidationError, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
