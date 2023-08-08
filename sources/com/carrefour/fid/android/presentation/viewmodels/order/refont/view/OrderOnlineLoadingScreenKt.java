package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOrderOnlineLoadingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOnlineLoadingScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineLoadingScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,126:1\n154#2:127\n154#2:128\n154#2:162\n154#2:163\n154#2:164\n154#2:165\n154#2:166\n154#2:167\n154#2:173\n154#2:174\n154#2:175\n154#2:176\n154#2:177\n154#2:178\n154#2:179\n154#2:180\n154#2:181\n154#2:182\n154#2:183\n154#2:184\n154#2:185\n154#2:186\n154#2:187\n154#2:188\n74#3,6:129\n80#3:161\n84#3:172\n75#4:135\n76#4,11:137\n89#4:171\n76#5:136\n460#6,13:148\n473#6,3:168\n*S KotlinDebug\n*F\n+ 1 OrderOnlineLoadingScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineLoadingScreenKt\n*L\n19#1:127\n20#1:128\n27#1:162\n34#1:163\n40#1:164\n41#1:165\n47#1:166\n48#1:167\n62#1:173\n63#1:174\n65#1:175\n70#1:176\n71#1:177\n77#1:178\n78#1:179\n85#1:180\n90#1:181\n91#1:182\n97#1:183\n98#1:184\n104#1:185\n105#1:186\n112#1:187\n113#1:188\n17#1:129,6\n17#1:161\n17#1:172\n17#1:135\n17#1:137,11\n17#1:171\n17#1:136\n17#1:148,13\n17#1:168,3\n*E\n"})
public final class OrderOnlineLoadingScreenKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m114506a(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(-1540859057);
        int i7 = i6 & 1;
        if (i7 != 0) {
            i3 = i5 | 6;
            mVar2 = mVar;
        } else if ((i5 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            mVar2 = mVar;
            i3 = i5;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar3 = C8767m.f23478j;
            } else {
                mVar3 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1540859057, i5, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineLoadingScreen (OrderOnlineLoadingScreen.kt:15)");
            }
            float f = (float) 16;
            C8767m n = SizeKt.m10114n(PaddingKt.m10026m(PaddingKt.m10026m(mVar3, 0.0f, C16483g.m74435M(f), 1, (Object) null), C16483g.m74435M((float) 32), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
            C8734c.C8736b u = C8734c.f23406a.mo17072u();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), u, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8767m.C8768a aVar = C8767m.f23478j;
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m114511f(SizeKt.m10092H(PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M((float) 8), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 90))), o, 0);
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10092H(aVar, C16483g.m74435M((float) 50)), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            m114510e(o, 0);
            m114510e(o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineLoadingScreenKt$OrderOnlineLoadingScreen$2(mVar3, i5, i6));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m114507b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1622148806);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1622148806, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineLoadingScreenPreview (OrderOnlineLoadingScreen.kt:118)");
            }
            ThemeKt.m153788a(ComposableSingletons$OrderOnlineLoadingScreenKt.f65834a.mo78680b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineLoadingScreenKt$OrderOnlineLoadingScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m114510e(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-167241462);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-167241462, i2, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.cardShimmer (OrderOnlineLoadingScreen.kt:58)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 50;
            C2428y0.m10726a(SizeKt.m10115o(m114511f(PaddingKt.m10028o(SizeKt.m10092H(aVar, C16483g.m74435M(f)), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null)), C16483g.m74435M(f)), o, 0);
            float f2 = (float) 200;
            float f3 = (float) 16;
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10092H(aVar, C16483g.m74435M(f2)), 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            float f4 = (float) 90;
            C2428y0.m10726a(m114511f(SizeKt.m10092H(PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M(f4))), o, 0);
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m114511f(SizeKt.m10092H(PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M((float) 8), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M(f4))), o, 0);
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10092H(aVar, C16483g.m74435M(f2)), 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            C2428y0.m10726a(m114511f(PaddingKt.m10028o(SizeKt.m10092H(aVar, C16483g.m74435M(f2)), 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null)), o, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineLoadingScreenKt$cardShimmer$1(i2));
        }
    }

    /* renamed from: f */
    public static final C8767m m114511f(C8767m mVar) {
        return C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(mVar, C16483g.m74435M((float) 14)), C2694o.m12166h(C16483g.m74435M((float) 8))), true, (C15218g4) null, 2, (Object) null);
    }
}
