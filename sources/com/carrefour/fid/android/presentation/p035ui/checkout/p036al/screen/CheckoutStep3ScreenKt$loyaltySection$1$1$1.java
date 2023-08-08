package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11620r;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$loyaltySection$1$1$1 */
public final class CheckoutStep3ScreenKt$loyaltySection$1$1$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C11300l<Double, C11079d2> $onValidateLoyaltyAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$loyaltySection$1$1$1(C11300l<? super Double, C11079d2> lVar) {
        super(1);
        this.$onValidateLoyaltyAmount = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Double doubleOrNull = C11620r.toDoubleOrNull(str);
        if (doubleOrNull != null) {
            this.$onValidateLoyaltyAmount.invoke(doubleOrNull);
        }
    }
}
