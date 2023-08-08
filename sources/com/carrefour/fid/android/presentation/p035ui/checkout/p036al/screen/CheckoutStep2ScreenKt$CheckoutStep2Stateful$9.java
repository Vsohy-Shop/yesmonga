package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.CheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics.C26092a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Stateful$9 */
public final class CheckoutStep2ScreenKt$CheckoutStep2Stateful$9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C26092a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onSlotEdit;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onValidate;
    final /* synthetic */ CheckoutStep2ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$CheckoutStep2Stateful$9(CheckoutStep2ViewModel checkoutStep2ViewModel, C26092a aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super Boolean, C11079d2> lVar, int i) {
        super(2);
        this.$viewModel = checkoutStep2ViewModel;
        this.$analytics = aVar;
        this.$onSlotEdit = aVar2;
        this.$onBackPressed = aVar3;
        this.$onValidate = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutStep2ScreenKt.m104365b(this.$viewModel, this.$analytics, this.$onSlotEdit, this.$onBackPressed, this.$onValidate, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
