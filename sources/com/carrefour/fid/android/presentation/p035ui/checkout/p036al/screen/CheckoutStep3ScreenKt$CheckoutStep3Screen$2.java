package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.ValidatePaymentComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Screen$2 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Screen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ boolean $paymentLoadingState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Screen$2(Basket basket, boolean z, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i, int i2) {
        super(2);
        this.$basket = basket;
        this.$paymentLoadingState = z;
        this.$onValidate = aVar;
        this.$onCgvClicked = aVar2;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-26359756, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3Screen.<anonymous> (CheckoutStep3Screen.kt:273)");
            }
            double D = this.$basket.mo116855w().mo116868D();
            boolean z = !this.$paymentLoadingState;
            String d = C16018i.m71858d(R.string.checkout_step_three_validate, oVar, 0);
            boolean z2 = this.$paymentLoadingState;
            C11289a<C11079d2> aVar = this.$onValidate;
            C11289a<C11079d2> aVar2 = this.$onCgvClicked;
            int i2 = this.$$dirty1;
            ValidatePaymentComponentKt.m104655a((C8767m) null, D, z2, z, d, aVar, aVar2, oVar, ((this.$$dirty >> 18) & 896) | ((i2 >> 6) & 458752) | ((i2 << 3) & 3670016), 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
