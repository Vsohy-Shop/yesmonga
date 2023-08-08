package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$9 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Stateful$9 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $postOrderSubstitutionEnabled;
    final /* synthetic */ C8700z0<Boolean> $showFullFidWarning$delegate;
    final /* synthetic */ CheckoutStep3ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$9(CheckoutStep3ViewModel checkoutStep3ViewModel, boolean z, C8700z0<Boolean> z0Var) {
        super(0);
        this.$viewModel = checkoutStep3ViewModel;
        this.$postOrderSubstitutionEnabled = z;
        this.$showFullFidWarning$delegate = z0Var;
    }

    public final void invoke() {
        if (this.$viewModel.mo75839V0()) {
            CheckoutStep3ScreenKt.m104416h(this.$showFullFidWarning$delegate, true);
        } else {
            this.$viewModel.mo75837T0(this.$postOrderSubstitutionEnabled);
        }
    }
}
