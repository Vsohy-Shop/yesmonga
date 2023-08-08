package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt", mo22502f = "NonFoodCheckoutStep1Stateful.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {494, 507}, mo22505m = "handleProductCardAction", mo22506n = {"action", "bottomSheetData", "action", "viewModel"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1 */
public final class NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1(C11045c<? super NonFoodCheckoutStep1StatefulKt$handleProductCardAction$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NonFoodCheckoutStep1StatefulKt.m104685u((C23520c.C23533f) null, (NonFoodCheckout1ViewModel) null, (C8700z0<C23547a>) null, (ModalBottomSheetState) null, this);
    }
}
