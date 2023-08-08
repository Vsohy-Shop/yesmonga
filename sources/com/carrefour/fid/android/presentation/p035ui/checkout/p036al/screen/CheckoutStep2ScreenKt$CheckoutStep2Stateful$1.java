package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Stateful$1 */
public final class CheckoutStep2ScreenKt$CheckoutStep2Stateful$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$CheckoutStep2Stateful$1(C11289a<C11079d2> aVar, int i) {
        super(2);
        this.$onBackPressed = aVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1125755392, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2Stateful.<anonymous> (CheckoutStep2Screen.kt:109)");
            }
            HeaderComponentKt.m151505j(C16018i.m71858d(R.string.checkout_step_two_header_title, oVar2, 0), (C16361p0) null, 0, 0, 0, (Painter) null, C16018i.m71858d(R.string.accessibility_back_to_previous_page, oVar2, 0), this.$onBackPressed, oVar, 29360128 & (this.$$dirty << 12), 62);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
