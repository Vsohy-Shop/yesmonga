package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$8 */
public final class AccountMenuComponentStatefulKt$AccountMenuComponentStateful$8 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C25796a $accountMenuAnalyticsHandler;
    final /* synthetic */ String $appVersionText;
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
    final /* synthetic */ C11300l<String, C11079d2> $onUserUuidFetched;
    final /* synthetic */ AccountMenuViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuComponentStateful$8(AccountMenuViewModel accountMenuViewModel, C25796a aVar, String str, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, C11289a<C11079d2> aVar8, C11289a<C11079d2> aVar9, C11289a<C11079d2> aVar10, C11300l<? super Boolean, C11079d2> lVar, C11289a<C11079d2> aVar11, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar12, C11289a<C11079d2> aVar13, int i, int i2, int i3) {
        super(2);
        this.$viewModel = accountMenuViewModel;
        this.$accountMenuAnalyticsHandler = aVar;
        this.$appVersionText = str;
        this.$onAccountOrdersClicked = aVar2;
        this.$onLoyaltyClicked = aVar3;
        this.$onConfirmedHelpClicked = aVar4;
        this.$onLegalsClicked = aVar5;
        this.$onUserConsentsClicked = aVar6;
        this.$onPaymentClicked = aVar7;
        this.$onServicesClicked = aVar8;
        this.$onUsabillaBannerClicked = aVar9;
        this.$onConfirmedLogoutClicked = aVar10;
        this.$onNotificationClicked = lVar;
        this.$onBackPressed = aVar11;
        this.$onUserUuidFetched = lVar2;
        this.$onPersonalDataClicked = aVar12;
        this.$onDisabledNotificationClick = aVar13;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        AccountMenuViewModel accountMenuViewModel = this.$viewModel;
        AccountMenuViewModel accountMenuViewModel2 = accountMenuViewModel;
        AccountMenuComponentStatefulKt.m103670d(accountMenuViewModel2, this.$accountMenuAnalyticsHandler, this.$appVersionText, this.$onAccountOrdersClicked, this.$onLoyaltyClicked, this.$onConfirmedHelpClicked, this.$onLegalsClicked, this.$onUserConsentsClicked, this.$onPaymentClicked, this.$onServicesClicked, this.$onUsabillaBannerClicked, this.$onConfirmedLogoutClicked, this.$onNotificationClicked, this.$onBackPressed, this.$onUserUuidFetched, this.$onPersonalDataClicked, this.$onDisabledNotificationClick, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
