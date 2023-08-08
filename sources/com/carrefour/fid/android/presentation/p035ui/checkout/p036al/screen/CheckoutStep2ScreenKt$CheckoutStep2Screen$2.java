package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.AddToCartComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$CheckoutStep2Screen$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,739:1\n154#2:740\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$CheckoutStep2Screen$2\n*L\n217#1:740\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Screen$2 */
public final class CheckoutStep2ScreenKt$CheckoutStep2Screen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ C11289a<C11079d2> $onValidate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$CheckoutStep2Screen$2(Basket basket, C11289a<C11079d2> aVar, int i) {
        super(2);
        this.$basket = basket;
        this.$onValidate = aVar;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1481553776, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2Screen.<anonymous> (CheckoutStep2Screen.kt:211)");
            }
            C8767m k = PaddingKt.m10024k(SizeKt.m10114n(BackgroundKt.m8825d(C8767m.f23478j, C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M((float) 16));
            C37475b bVar = C37475b.f94185a;
            long Q = bVar.mo114220Q();
            C8592o oVar2 = oVar;
            AddToCartComponentKt.m151307c(k, false, bVar.mo114218O(), Q, C28782t.m119105b(Double.valueOf(this.$basket.mo116855w().mo116868D())), C16018i.m71858d(R.string.checkout_step_two_continue, oVar2, 0), true, this.$onValidate, oVar2, ((this.$$dirty1 << 3) & 29360128) | 1572912, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
