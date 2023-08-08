package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$6 */
public /* synthetic */ class CheckoutStep3ScreenKt$CheckoutStep3Stateful$6 extends FunctionReferenceImpl implements C11300l<Double, C11079d2> {
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$6(Object obj) {
        super(1, obj, CheckoutStep3ViewModel.class, "onCardFidAmount", "onCardFidAmount(D)V", 0);
    }

    /* renamed from: d */
    public final void mo68590d(double d) {
        ((CheckoutStep3ViewModel) this.receiver).mo75832O0(d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68590d(((Number) obj).doubleValue());
        return C11079d2.f28267a;
    }
}
