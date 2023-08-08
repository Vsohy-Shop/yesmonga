package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics.C26092a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Stateful$7 */
public final class CheckoutStep2ScreenKt$CheckoutStep2Stateful$7 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C26092a $analytics;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onValidate;
    final /* synthetic */ C8578k2<Boolean> $postOrderSubstitutionSelection$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$CheckoutStep2Stateful$7(C26092a aVar, Basket basket, C11300l<? super Boolean, C11079d2> lVar, C8578k2<Boolean> k2Var) {
        super(0);
        this.$analytics = aVar;
        this.$basket = basket;
        this.$onValidate = lVar;
        this.$postOrderSubstitutionSelection$delegate = k2Var;
    }

    public final void invoke() {
        this.$analytics.mo75779d(this.$basket);
        boolean s = CheckoutStep2ScreenKt.m104374k(this.$postOrderSubstitutionSelection$delegate);
        if (s) {
            this.$analytics.mo75780e();
        } else {
            this.$analytics.mo75782g();
        }
        this.$onValidate.invoke(Boolean.valueOf(s));
    }
}
