package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.SnackbarComponentKt;
import com.carrefour.fid.android.design.components.compose.Variant;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Screen$3 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Screen$3 extends Lambda implements C11305q<SnackbarHostState, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Variant $snackbarVariant;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Screen$3(Variant variant, int i) {
        super(3);
        this.$snackbarVariant = variant;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo68579a(@C12579k SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(snackbarHostState, "it");
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(snackbarHostState)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1112493409, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3Screen.<anonymous> (CheckoutStep3Screen.kt:265)");
            }
            SnackbarComponentKt.m151647a(snackbarHostState, this.$snackbarVariant, oVar, (i & 14) | (this.$$dirty & 112));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo68579a((SnackbarHostState) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
