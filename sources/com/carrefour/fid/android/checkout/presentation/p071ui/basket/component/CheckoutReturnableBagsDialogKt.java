package com.carrefour.fid.android.checkout.presentation.p071ui.basket.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.C16541b;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.shared.extension.C28771o;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCheckoutReturnableBagsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutReturnableBagsDialog.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutReturnableBagsDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,144:1\n36#2:145\n460#2,13:172\n473#2,3:190\n460#2,13:213\n473#2,3:228\n1114#3,6:146\n154#4:152\n154#4:186\n154#4:187\n154#4:188\n154#4:189\n154#4:227\n74#5,6:153\n80#5:185\n84#5:194\n75#6:159\n76#6,11:161\n89#6:193\n75#6:200\n76#6,11:202\n89#6:231\n76#7:160\n76#7:201\n76#8,5:195\n81#8:226\n85#8:232\n*S KotlinDebug\n*F\n+ 1 CheckoutReturnableBagsDialog.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutReturnableBagsDialogKt\n*L\n33#1:145\n89#1:172,13\n89#1:190,3\n116#1:213,13\n116#1:228,3\n33#1:146,6\n89#1:152\n93#1:186\n97#1:187\n101#1:188\n105#1:189\n121#1:227\n89#1:153,6\n89#1:185\n89#1:194\n89#1:159\n89#1:161,11\n89#1:193\n116#1:200\n116#1:202,11\n116#1:231\n89#1:160\n116#1:201\n116#1:195,5\n116#1:226\n116#1:232\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialogKt */
public final class CheckoutReturnableBagsDialogKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m162547a(@C12580l C8767m mVar, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        C8767m.C8768a aVar2;
        int i4;
        int i5;
        C11289a<C11079d2> aVar3 = aVar;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(aVar3, "onDismiss");
        C8592o o = oVar.mo15009o(1293879526);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            mVar2 = mVar;
        } else if ((i6 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            mVar2 = mVar;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar2 = C8767m.f23478j;
            } else {
                aVar2 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1293879526, i3, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialog (CheckoutReturnableBagsDialog.kt:27)");
            }
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(aVar3);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$1$1(aVar3);
                o.mo14893C(N);
            }
            o.mo15002m0();
            mVar3 = aVar2;
            oVar2 = o;
            AndroidAlertDialog_androidKt.m13200a((C11289a) N, C8553b.m31048b(o, 1037691294, true, new CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$2(aVar3, i3)), (C8767m) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(o, -209750758, true, new CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$3(aVar2)), (C15218g4) null, 0, 0, (C16541b) null, oVar2, 196656, 988);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutReturnableBagsDialogKt$CheckoutReturnableBagsDialog$4(mVar3, aVar3, i6, i7));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m162548b(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(537572579);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i5 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(537572579, i, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialogContent (CheckoutReturnableBagsDialog.kt:85)");
            }
            C8767m k = PaddingKt.m10024k(mVar, C16483g.m74435M((float) 16));
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            m162549c(C39805b.C39823r.checkout_summary_returnable_bags_text_1, o, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            float f2 = (float) 24;
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m162549c(C39805b.C39823r.checkout_summary_returnable_bags_text_2, o, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m162549c(C39805b.C39823r.checkout_summary_returnable_bags_text_3, o, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m162549c(C39805b.C39823r.checkout_summary_returnable_bags_text_4, o, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m162549c(C39805b.C39823r.checkout_summary_returnable_bags_text_5, o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C39879x614cfc2c(mVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m162549c(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(-139896530);
        if ((i6 & 14) == 0) {
            if (o.mo14976f(i5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i6;
        } else {
            i3 = i6;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-139896530, i3, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialogContentItem (CheckoutReturnableBagsDialog.kt:112)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(f, C8734c.f23406a.mo17073w(), o, 6);
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
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m o2 = PaddingKt.m10028o(aVar, 0.0f, 0.0f, C16483g.m74435M((float) 4), 0.0f, 11, (Object) null);
            C7933t0 t0Var = C7933t0.f19075a;
            int i7 = C7933t0.f19076b;
            C16361p0 C = C37477d.m153876C(t0Var.mo11077c(o, i7));
            C16432i.C16433a aVar2 = C16432i.f40718b;
            C8592o oVar3 = o;
            TextKt.m14196c("•", o2, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar2.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C, oVar3, 54, 0, 65020);
            C8592o oVar4 = oVar3;
            oVar2 = oVar4;
            TextKt.m14197d(C28771o.m119089a(C16018i.m71858d(i5, oVar4, i3 & 14)), (C8767m) null, C37475b.f94185a.mo114207D(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar2.mo47672f()), 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153876C(t0Var.mo11077c(oVar4, i7)), oVar2, 0, 0, 130554);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C39880xffcfeb9f(i5, i6));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m162550d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(651861501);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(651861501, i, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutReturnableBagsDialogPreview (CheckoutReturnableBagsDialog.kt:136)");
            }
            ThemeKt.m153788a(ComposableSingletons$CheckoutReturnableBagsDialogKt.f101713a.mo131493c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C39881x47f013ba(i));
        }
    }
}
