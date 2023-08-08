package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$7 */
public final class AccountMenuComponentStatefulKt$AccountMenuComponentStateful$7 extends Lambda implements C11300l<C23130a, C11079d2> {
    final /* synthetic */ C25796a $accountMenuAnalyticsHandler;
    final /* synthetic */ C8700z0<Boolean> $displayHelpDialog;
    final /* synthetic */ C11289a<C11079d2> $onAccountOrdersClicked;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onConfirmedHelpClicked;
    final /* synthetic */ C11289a<C11079d2> $onConfirmedLogoutClicked;
    final /* synthetic */ C11289a<C11079d2> $onDisabledNotificationClick;
    final /* synthetic */ C11289a<C11079d2> $onLegalsClicked;
    final /* synthetic */ C11289a<C11079d2> $onLoyaltyClicked;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onNotificationClicked;
    final /* synthetic */ C11289a<C11079d2> $onPaymentClicked;
    final /* synthetic */ C11289a<C11079d2> $onPersonalDataClicked;
    final /* synthetic */ C11289a<C11079d2> $onServicesClicked;
    final /* synthetic */ C11289a<C11079d2> $onUsabillaBannerClicked;
    final /* synthetic */ C11289a<C11079d2> $onUserConsentsClicked;
    final /* synthetic */ AccountMenuViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuComponentStateful$7(C25796a aVar, AccountMenuViewModel accountMenuViewModel, C8700z0<Boolean> z0Var, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, C11289a<C11079d2> aVar8, C11289a<C11079d2> aVar9, C11289a<C11079d2> aVar10, C11289a<C11079d2> aVar11, C11289a<C11079d2> aVar12, C11300l<? super Boolean, C11079d2> lVar, C11289a<C11079d2> aVar13) {
        super(1);
        this.$accountMenuAnalyticsHandler = aVar;
        this.$viewModel = accountMenuViewModel;
        this.$displayHelpDialog = z0Var;
        this.$onAccountOrdersClicked = aVar2;
        this.$onLoyaltyClicked = aVar3;
        this.$onPersonalDataClicked = aVar4;
        this.$onConfirmedHelpClicked = aVar5;
        this.$onLegalsClicked = aVar6;
        this.$onUserConsentsClicked = aVar7;
        this.$onPaymentClicked = aVar8;
        this.$onServicesClicked = aVar9;
        this.$onUsabillaBannerClicked = aVar10;
        this.$onConfirmedLogoutClicked = aVar11;
        this.$onBackPressed = aVar12;
        this.$onNotificationClicked = lVar;
        this.$onDisabledNotificationClick = aVar13;
    }

    /* renamed from: a */
    public final void mo67846a(@C12579k C23130a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        C23130a aVar2 = aVar;
        AccountMenuComponentStatefulKt.m103683q(aVar2, this.$accountMenuAnalyticsHandler, this.$viewModel, this.$displayHelpDialog, this.$onAccountOrdersClicked, this.$onLoyaltyClicked, this.$onPersonalDataClicked, this.$onConfirmedHelpClicked, this.$onLegalsClicked, this.$onUserConsentsClicked, this.$onPaymentClicked, this.$onServicesClicked, this.$onUsabillaBannerClicked, this.$onConfirmedLogoutClicked, this.$onBackPressed, this.$onNotificationClicked, this.$onDisabledNotificationClick);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67846a((C23130a) obj);
        return C11079d2.f28267a;
    }
}
