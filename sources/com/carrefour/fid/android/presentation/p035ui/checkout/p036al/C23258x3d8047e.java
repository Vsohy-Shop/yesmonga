package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.view.ViewGroup;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1AdditionOrderFooterStateful$3 */
public final class C23258x3d8047e extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BottomSheetBehavior<ViewGroup> $bottomSheetBehavior;
    final /* synthetic */ C11289a<C11079d2> $onValidateBasket;
    final /* synthetic */ CheckoutStepOneAdditionalOrderViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23258x3d8047e(CheckoutStepOneAdditionalOrderViewModel checkoutStepOneAdditionalOrderViewModel, C11289a<C11079d2> aVar, BottomSheetBehavior<ViewGroup> bottomSheetBehavior, int i, int i2) {
        super(2);
        this.$viewModel = checkoutStepOneAdditionalOrderViewModel;
        this.$onValidateBasket = aVar;
        this.$bottomSheetBehavior = bottomSheetBehavior;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutStep1FooterStatefulKt.m103945a(this.$viewModel, this.$onValidateBasket, this.$bottomSheetBehavior, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
