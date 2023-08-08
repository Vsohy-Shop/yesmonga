package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.ButtonColor;
import com.carrefour.fid.android.design.components.compose.ButtonComponentKt;
import com.carrefour.fid.android.design.components.compose.ButtonType;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCouponsErrorComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsErrorComponent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsErrorComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,67:1\n78#2,2:68\n80#2:96\n84#2:141\n75#3:70\n76#3,11:72\n75#3:103\n76#3,11:105\n89#3:135\n89#3:140\n76#4:71\n76#4:104\n460#5,13:83\n460#5,13:116\n473#5,3:132\n473#5,3:137\n75#6,6:97\n81#6:129\n85#6:136\n154#7:130\n154#7:131\n*S KotlinDebug\n*F\n+ 1 CouponsErrorComponent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsErrorComponentKt\n*L\n32#1:68,2\n32#1:96\n32#1:141\n32#1:70\n32#1:72,11\n40#1:103\n40#1:105,11\n40#1:135\n32#1:140\n32#1:71\n40#1:104\n32#1:83,13\n40#1:116,13\n40#1:132,3\n32#1:137,3\n40#1:97,6\n40#1:129\n40#1:136\n46#1:130\n48#1:131\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsErrorComponentKt */
public final class CouponsErrorComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105649a(@C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C11289a<C11079d2> aVar2;
        C11289a<C11079d2> aVar3;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(2121976149);
        int i7 = i6 & 1;
        if (i7 != 0) {
            i3 = i5 | 6;
            aVar2 = aVar;
        } else if ((i5 & 14) == 0) {
            aVar2 = aVar;
            if (o.mo14927P(aVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            aVar2 = aVar;
            i3 = i5;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i7 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2121976149, i5, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsErrorComponent (CouponsErrorComponent.kt:30)");
            }
            C8767m.C8768a aVar4 = C8767m.f23478j;
            C37474a aVar5 = C37474a.f94133a;
            C8767m l = SizeKt.m10112l(PaddingKt.m10024k(aVar4, aVar5.mo114200w()), 0.0f, 1, (Object) null);
            C8734c.C8735a aVar6 = C8734c.f23406a;
            C8734c.C8736b m = aVar6.mo17068m();
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e f = arrangement.mo7625f();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(f, m, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(l);
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
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_il_catalogue_error, o, 0), (String) null, (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 56, 124);
            C8767m n = SizeKt.m10114n(aVar4, 0.0f, 1, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), aVar6.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(n);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a2);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_red_error, o, 0), (String) null, SizeKt.m10087C(aVar4, C16483g.m74435M((float) 30)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
            C2428y0.m10726a(SizeKt.m10092H(aVar4, C16483g.m74435M((float) 10)), o, 6);
            C8592o oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.coupons_loading_error, o, 0), (C8767m) null, C37475b.f94185a.mo114228Y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47672f()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11094h(), oVar2, 0, 0, 65018);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            o = oVar2;
            o.mo14918M(2078062293);
            if (aVar3 != null) {
                C2428y0.m10726a(SizeKt.m10115o(aVar4, aVar5.mo114202y()), o, 0);
                ButtonComponentKt.m151339f(SizeKt.m10114n(aVar4, 0.0f, 1, (Object) null), aVar3, ButtonType.Primary, (ButtonColor) null, false, C16018i.m71858d(R.string.retry_title, o, 0), false, (Integer) null, false, o, 390, 472);
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            aVar2 = aVar3;
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsErrorComponentKt$CouponsErrorComponent$2(aVar2, i, i6));
        }
    }
}
