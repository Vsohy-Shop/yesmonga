package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$15 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Stateful$15 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ C11300l<String, C11079d2> $onFidCardBlocked;
    final /* synthetic */ C11300l<C26122a.C26126d, C11079d2> $onNextStepNavigation;
    final /* synthetic */ C11300l<String, C11079d2> $onResetSecretCode;
    final /* synthetic */ C11289a<C11079d2> $onSlotError;
    final /* synthetic */ boolean $postOrderSubstitutionEnabled;
    final /* synthetic */ CheckoutStep3ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$15(CheckoutStep3ViewModel checkoutStep3ViewModel, boolean z, C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super C26122a.C26126d, C11079d2> lVar3, int i) {
        super(2);
        this.$viewModel = checkoutStep3ViewModel;
        this.$postOrderSubstitutionEnabled = z;
        this.$onBackPressed = aVar;
        this.$onFidCardBlocked = lVar;
        this.$onResetSecretCode = lVar2;
        this.$onCgvClicked = aVar2;
        this.$onSlotError = aVar3;
        this.$onNextStepNavigation = lVar3;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutStep3ScreenKt.m104411c(this.$viewModel, this.$postOrderSubstitutionEnabled, this.$onBackPressed, this.$onFidCardBlocked, this.$onResetSecretCode, this.$onCgvClicked, this.$onSlotError, this.$onNextStepNavigation, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
