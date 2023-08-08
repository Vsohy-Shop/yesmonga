package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Stateful$7 */
public /* synthetic */ class CheckoutStep3ScreenKt$CheckoutStep3Stateful$7 extends FunctionReferenceImpl implements C11300l<String, C11079d2> {
    public CheckoutStep3ScreenKt$CheckoutStep3Stateful$7(Object obj) {
        super(1, obj, CheckoutStep3ViewModel.class, "validatePromoCode", "validatePromoCode(Ljava/lang/String;)V", 0);
    }

    /* renamed from: d */
    public final void mo68591d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "p0");
        ((CheckoutStep3ViewModel) this.receiver).mo75842Y0(str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68591d((String) obj);
        return C11079d2.f28267a;
    }
}
