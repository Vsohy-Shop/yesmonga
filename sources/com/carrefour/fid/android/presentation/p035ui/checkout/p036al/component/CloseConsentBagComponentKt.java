package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nCloseConsentBagComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseConsentBagComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/CloseConsentBagComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,41:1\n154#2:42\n36#3:43\n1114#4,6:44\n*S KotlinDebug\n*F\n+ 1 CloseConsentBagComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/CloseConsentBagComponentKt\n*L\n21#1:42\n22#1:43\n22#1:44,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.component.CloseConsentBagComponentKt */
public final class CloseConsentBagComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104206a(@C12580l C8767m mVar, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(1878175365);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (i7 != 0) {
                aVar = CloseConsentBagComponentKt$CloseConsentBagComponent$1.f59124f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1878175365, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.CloseConsentBagComponent (CloseConsentBagComponent.kt:15)");
            }
            C8767m o2 = SizeKt.m10115o(mVar, C16483g.m74435M((float) 56));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(aVar);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new CloseConsentBagComponentKt$CloseConsentBagComponent$2$1(aVar);
                o.mo14893C(N);
            }
            o.mo15002m0();
            IconButtonKt.m13536a((C11289a) N, o2, false, (C2243g) null, ComposableSingletons$CloseConsentBagComponentKt.f59125a.mo68397a(), o, C12888a.f31808q, 12);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CloseConsentBagComponentKt$CloseConsentBagComponent$3(mVar, aVar, i, i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104207b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-690802161);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-690802161, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.CloseConsentPreview (CloseConsentBagComponent.kt:35)");
            }
            ThemeKt.m153788a(ComposableSingletons$CloseConsentBagComponentKt.f59125a.mo68398b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CloseConsentBagComponentKt$CloseConsentPreview$1(i));
        }
    }
}
