package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryStateful$1 */
public final class DeliverySummaryStatefulKt$DeliverySummaryStateful$1 extends Lambda implements C11300l<DeliverySummaryAction, C11079d2> {
    final /* synthetic */ Address $address;
    final /* synthetic */ DeliverySummaryAnalyticsReporter $analytics;
    final /* synthetic */ C8700z0<Boolean> $displayExitDialog;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToHome;
    final /* synthetic */ C11300l<String, C11079d2> $onValidationError;
    final /* synthetic */ String $phone;
    final /* synthetic */ DeliverySummaryViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$DeliverySummaryStateful$1(DeliverySummaryViewModel deliverySummaryViewModel, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C8700z0<Boolean> z0Var, DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter, Address address, String str, C11300l<? super String, C11079d2> lVar) {
        super(1);
        this.$viewModel = deliverySummaryViewModel;
        this.$onBackPressed = aVar;
        this.$onNavigateToHome = aVar2;
        this.$displayExitDialog = z0Var;
        this.$analytics = deliverySummaryAnalyticsReporter;
        this.$address = address;
        this.$phone = str;
        this.$onValidationError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DeliverySummaryAction) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k DeliverySummaryAction deliverySummaryAction) {
        Intrinsics.checkNotNullParameter(deliverySummaryAction, "action");
        if (Intrinsics.areEqual((Object) deliverySummaryAction, (Object) DeliverySummaryAction.OnRetry.INSTANCE)) {
            this.$viewModel.getStoreService();
        } else if (Intrinsics.areEqual((Object) deliverySummaryAction, (Object) DeliverySummaryAction.OnBackPressed.INSTANCE)) {
            this.$onBackPressed.invoke();
        } else if (Intrinsics.areEqual((Object) deliverySummaryAction, (Object) DeliverySummaryAction.OnNavigateToHome.INSTANCE)) {
            this.$onNavigateToHome.invoke();
        } else if (Intrinsics.areEqual((Object) deliverySummaryAction, (Object) DeliverySummaryAction.OnOpenExitDialog.INSTANCE)) {
            this.$displayExitDialog.setValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual((Object) deliverySummaryAction, (Object) DeliverySummaryAction.OnCloseExitDialog.INSTANCE)) {
            this.$displayExitDialog.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) deliverySummaryAction, (Object) DeliverySummaryAction.OnStartShoppingClicked.INSTANCE)) {
            this.$analytics.tagOnStartShoppingPressed();
            this.$viewModel.validate(this.$address, this.$phone);
        } else if (deliverySummaryAction instanceof DeliverySummaryAction.OnValidationError) {
            this.$onValidationError.invoke(((DeliverySummaryAction.OnValidationError) deliverySummaryAction).getTitle());
        }
    }
}
