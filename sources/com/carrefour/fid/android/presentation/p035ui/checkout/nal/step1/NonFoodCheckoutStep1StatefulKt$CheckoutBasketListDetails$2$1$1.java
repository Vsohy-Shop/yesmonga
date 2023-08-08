package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.models.C38454b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.BundleHeaderKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$1 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C38454b $bundle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$1(C38454b bVar) {
        super(3);
        this.$bundle = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-128173645, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketListDetails.<anonymous>.<anonymous>.<anonymous> (NonFoodCheckoutStep1Stateful.kt:348)");
            }
            BundleHeaderKt.m104743a(this.$bundle.mo122000e().mo118087z(), this.$bundle.mo122000e().mo118085x(), this.$bundle.mo122000e().mo118074o(), oVar, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
