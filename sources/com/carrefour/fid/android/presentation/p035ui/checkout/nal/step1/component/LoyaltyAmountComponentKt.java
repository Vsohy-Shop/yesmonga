package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLoyaltyAmountComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyAmountComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/LoyaltyAmountComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,50:1\n154#2:51\n*S KotlinDebug\n*F\n+ 1 LoyaltyAmountComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/LoyaltyAmountComponentKt\n*L\n24#1:51\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.LoyaltyAmountComponentKt */
public final class LoyaltyAmountComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104764a(@C12579k C8767m mVar, double d, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        C8592o o = oVar.mo15009o(-229777903);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14993k(d)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-229777903, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.LoyaltyAmountComponent (LoyaltyAmountComponent.kt:22)");
            }
            SpacedItemsRowKt.m162561a(PaddingKt.m10024k(BackgroundKt.m8825d(mVar, C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16)), C8553b.m31048b(o, 344471255, true, new LoyaltyAmountComponentKt$LoyaltyAmountComponent$1(d)), o, 48, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyAmountComponentKt$LoyaltyAmountComponent$2(mVar, d, i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104765b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1946326639);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1946326639, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.LoyaltyAmountComponentPreview (LoyaltyAmountComponent.kt:44)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyAmountComponentKt.f59492a.mo68968a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyAmountComponentKt$LoyaltyAmountComponentPreview$1(i));
        }
    }
}
