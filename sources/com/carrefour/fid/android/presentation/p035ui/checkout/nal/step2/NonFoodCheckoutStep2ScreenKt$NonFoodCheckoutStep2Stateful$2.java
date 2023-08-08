package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$2 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<String> $loyaltyCardSecretCodeCheck$delegate;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$2(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C8700z0<String> z0Var) {
        super(0);
        this.$viewModel = nonFoodCheckoutStep2ViewModel;
        this.$loyaltyCardSecretCodeCheck$delegate = z0Var;
    }

    public final void invoke() {
        NonFoodCheckoutStep2ScreenKt.m104883l(this.$loyaltyCardSecretCodeCheck$delegate, (String) null);
        this.$viewModel.mo75991V0();
    }
}
