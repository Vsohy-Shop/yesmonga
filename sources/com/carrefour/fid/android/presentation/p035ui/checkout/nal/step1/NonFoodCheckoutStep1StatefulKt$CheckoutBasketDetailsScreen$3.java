package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ boolean $displayClearBasketConfirmationDialog;
    final /* synthetic */ Throwable $displayValidationErrorDialog;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ C26144b $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$3(C26144b bVar, boolean z, boolean z2, Throwable th, C11300l<? super C23520c, C11079d2> lVar, int i) {
        super(3);
        this.$state = bVar;
        this.$showPreparationFees = z;
        this.$displayClearBasketConfirmationDialog = z2;
        this.$displayValidationErrorDialog = th;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if ((i & 14) == 0) {
            i |= oVar.mo15006n0(i0Var) ? 4 : 2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1012185974, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketDetailsScreen.<anonymous> (NonFoodCheckoutStep1Stateful.kt:248)");
            }
            C26144b bVar = this.$state;
            boolean z = this.$showPreparationFees;
            boolean z2 = this.$displayClearBasketConfirmationDialog;
            Throwable th = this.$displayValidationErrorDialog;
            C11300l<C23520c, C11079d2> lVar = this.$actioner;
            int i2 = C28892e.f70778a;
            int i3 = (i & 14) | 32768 | ((i2 | i2) << 3);
            int i4 = this.$$dirty;
            NonFoodCheckoutStep1StatefulKt.m104670f(i0Var, bVar, z, z2, th, lVar, oVar, i3 | ((i4 << 3) & 112) | ((i4 << 3) & 896) | ((i4 >> 3) & 7168) | ((i4 >> 6) & 458752));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
