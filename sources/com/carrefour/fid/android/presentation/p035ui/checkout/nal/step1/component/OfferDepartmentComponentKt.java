package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
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
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
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
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.Locale;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOfferDepartmentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferDepartmentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/OfferDepartmentComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,67:1\n154#2:68\n154#2:98\n154#2:99\n79#3,2:69\n81#3:97\n85#3:141\n75#4:71\n76#4,11:73\n75#4:105\n76#4,11:107\n89#4:135\n89#4:140\n76#5:72\n76#5:106\n460#6,13:84\n460#6,13:118\n473#6,3:132\n473#6,3:137\n68#7,5:100\n73#7:131\n77#7:136\n*S KotlinDebug\n*F\n+ 1 OfferDepartmentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/OfferDepartmentComponentKt\n*L\n33#1:68\n38#1:98\n46#1:99\n29#1:69,2\n29#1:97\n29#1:141\n29#1:71\n29#1:73,11\n45#1:105\n45#1:107,11\n45#1:135\n29#1:140\n29#1:72\n45#1:106\n29#1:84,13\n45#1:118,13\n45#1:132,3\n29#1:137,3\n45#1:100,5\n45#1:131\n45#1:136\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.OfferDepartmentComponentKt */
public final class OfferDepartmentComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104769a(@C12579k String str, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5;
        String str2 = str;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(str2, "label");
        C8592o o = oVar.mo15009o(-224466643);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo14976f(i6)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-224466643, i7, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.OfferDepartmentComponent (OfferDepartmentComponent.kt:27)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C37475b bVar = C37475b.f94185a;
            C8767m o2 = SizeKt.m10115o(BackgroundKt.m8825d(n, bVar.mo114208E(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 40));
            Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8737c q = aVar2.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(p, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o2);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m m = PaddingKt.m10026m(SizeKt.m10093I(aVar, C16483g.m74435M((float) 0), C16483g.m74435M((float) 300)), C16483g.m74435M((float) 8), 0.0f, 2, (Object) null);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            int c = C16449r.f40760b.mo47727c();
            C7933t0 t0Var = C7933t0.f19075a;
            int i8 = C7933t0.f19076b;
            int i9 = i8;
            C7933t0 t0Var2 = t0Var;
            C8592o oVar3 = o;
            TextKt.m14196c(upperCase, m, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var.mo11077c(o, i8)), oVar3, 48, 3120, 55292);
            C8767m c2 = BackgroundKt.m8824c(SizeKt.m10087C(aVar, C16483g.m74435M((float) 24)), bVar.mo114231a0(), C2694o.m12169k());
            C8734c i10 = aVar2.mo17066i();
            C8592o oVar4 = oVar3;
            oVar4.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(i10, false, oVar4, 6);
            oVar4.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar4.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar4.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar4.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(c2);
            if (!(oVar4.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar4.mo14938T();
            if (oVar4.mo14997l()) {
                oVar4.mo14947W(a2);
            } else {
                oVar4.mo14888A();
            }
            oVar4.mo14941U();
            C8592o b2 = Updater.m30180b(oVar4);
            Updater.m30188j(b2, k, companion.mo44588d());
            Updater.m30188j(b2, dVar2, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b2, c4Var2, companion.mo44590f());
            oVar4.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar4)), oVar4, 0);
            oVar4.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            oVar2 = oVar4;
            TextKt.m14196c(String.valueOf(i), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var2.mo11077c(oVar4, i9)), oVar2, 0, 0, 65022);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
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
            s.mo15202a(new OfferDepartmentComponentKt$OfferDepartmentComponent$2(str2, i6, i7));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104770b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1569282383);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1569282383, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.OfferDepartmentComponentPreview (OfferDepartmentComponent.kt:61)");
            }
            ThemeKt.m153788a(ComposableSingletons$OfferDepartmentComponentKt.f59495a.mo68970a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OfferDepartmentComponentKt$OfferDepartmentComponentPreview$1(i));
        }
    }
}
