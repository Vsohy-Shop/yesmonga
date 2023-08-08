package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.CheckoutStep2ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Stateful$3 */
public /* synthetic */ class CheckoutStep2ScreenKt$CheckoutStep2Stateful$3 extends FunctionReferenceImpl implements C11300l<String, C11079d2> {
    public CheckoutStep2ScreenKt$CheckoutStep2Stateful$3(Object obj) {
        super(1, obj, CheckoutStep2ViewModel.class, "validatePromoCode", "validatePromoCode(Ljava/lang/String;)V", 0);
    }

    /* renamed from: d */
    public final void mo68550d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "p0");
        ((CheckoutStep2ViewModel) this.receiver).mo75756K0(str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68550d((String) obj);
        return C11079d2.f28267a;
    }
}
