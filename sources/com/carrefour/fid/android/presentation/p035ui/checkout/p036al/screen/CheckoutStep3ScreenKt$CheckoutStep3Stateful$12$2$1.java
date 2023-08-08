package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$2$1 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ String $loyaltyCard;
    final /* synthetic */ C11300l<String, C11079d2> $onResetSecretCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$12$2$1(C11300l<? super String, C11079d2> lVar, String str) {
        super(0);
        this.$onResetSecretCode = lVar;
        this.$loyaltyCard = str;
    }

    public final void invoke() {
        this.$onResetSecretCode.invoke(this.$loyaltyCard);
    }
}
