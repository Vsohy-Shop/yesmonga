package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$11 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Stateful$11 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<String> $loyaltyCardSecretCodeCheck$delegate;
    final /* synthetic */ CheckoutStep3ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$11(CheckoutStep3ViewModel checkoutStep3ViewModel, C8700z0<String> z0Var) {
        super(0);
        this.$viewModel = checkoutStep3ViewModel;
        this.$loyaltyCardSecretCodeCheck$delegate = z0Var;
    }

    public final void invoke() {
        CheckoutStep3ScreenKt.m104418j(this.$loyaltyCardSecretCodeCheck$delegate, (String) null);
        this.$viewModel.mo75833P0();
    }
}
