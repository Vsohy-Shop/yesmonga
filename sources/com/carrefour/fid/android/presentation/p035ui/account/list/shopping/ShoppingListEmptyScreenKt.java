package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nShoppingListEmptyScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListEmptyScreen.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListEmptyScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,83:1\n154#2:84\n73#3,4:85\n77#3,20:96\n25#4:89\n955#5,6:90\n*S KotlinDebug\n*F\n+ 1 ShoppingListEmptyScreen.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListEmptyScreenKt\n*L\n31#1:84\n28#1:85,4\n28#1:96,20\n28#1:89\n28#1:90,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListEmptyScreenKt */
public final class ShoppingListEmptyScreenKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103510a(@C12579k String str, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        String str2 = str;
        C11289a<C11079d2> aVar2 = aVar;
        int i5 = i;
        Intrinsics.checkNotNullParameter(str2, "ButtonText");
        Intrinsics.checkNotNullParameter(aVar2, "onButtonClicked");
        C8592o o = oVar.mo15009o(970645914);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(970645914, i6, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListEmptyScreen (ShoppingListEmptyScreen.kt:26)");
            }
            C8767m k = PaddingKt.m10024k(SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16));
            o.mo14918M(-270267587);
            o.mo14918M(-3687241);
            Object N = o.mo14921N();
            C8592o.C8593a aVar3 = C8592o.f23032a;
            if (N == aVar3.mo16277a()) {
                N = new Measurer();
                o.mo14893C(N);
            }
            o.mo15002m0();
            Measurer measurer = (Measurer) N;
            o.mo14918M(-3687241);
            Object N2 = o.mo14921N();
            if (N2 == aVar3.mo16277a()) {
                N2 = new ConstraintLayoutScope();
                o.mo14893C(N2);
            }
            o.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
            o.mo14918M(-3687241);
            Object N3 = o.mo14921N();
            if (N3 == aVar3.mo16277a()) {
                N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            Pair<C15560f0, C11289a<C11079d2>> E = ConstraintLayoutKt.m75199E(257, constraintLayoutScope, (C8700z0) N3, measurer, o, 4544);
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(k, false, new C23034x57f6ccb8(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new C23035x57f6ccb9(constraintLayoutScope, 6, E.mo21847b(), aVar, i6, str)), E.mo21846a(), o, 48, 0);
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListEmptyScreenKt$ShoppingListEmptyScreen$2(str2, aVar2, i5));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m103511b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-929095322);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-929095322, i, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListPreview (ShoppingListEmptyScreen.kt:72)");
            }
            ThemeKt.m153788a(ComposableSingletons$ShoppingListEmptyScreenKt.f58677a.mo67665b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListEmptyScreenKt$ShoppingListPreview$1(i));
        }
    }
}
