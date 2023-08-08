package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$5 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ C23547a $bottomSheetData;
    final /* synthetic */ boolean $displayClearBasketConfirmationDialog;
    final /* synthetic */ boolean $displayValidationButtonLoader;
    final /* synthetic */ Throwable $displayValidationErrorDialog;
    final /* synthetic */ ModalBottomSheetState $quantityListBottomSheetState;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ C26144b $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$5(C26144b bVar, boolean z, C23547a aVar, ModalBottomSheetState modalBottomSheetState, boolean z2, boolean z3, Throwable th, C11300l<? super C23520c, C11079d2> lVar, int i) {
        super(2);
        this.$state = bVar;
        this.$showPreparationFees = z;
        this.$bottomSheetData = aVar;
        this.$quantityListBottomSheetState = modalBottomSheetState;
        this.$displayClearBasketConfirmationDialog = z2;
        this.$displayValidationButtonLoader = z3;
        this.$displayValidationErrorDialog = th;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodCheckoutStep1StatefulKt.m104665a(this.$state, this.$showPreparationFees, this.$bottomSheetData, this.$quantityListBottomSheetState, this.$displayClearBasketConfirmationDialog, this.$displayValidationButtonLoader, this.$displayValidationErrorDialog, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
