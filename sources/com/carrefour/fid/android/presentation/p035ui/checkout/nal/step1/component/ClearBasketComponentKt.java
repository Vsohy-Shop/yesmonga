package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2683e;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3046h;
import androidx.compose.material.C3049i;
import androidx.compose.material.C7870j;
import androidx.compose.material.C7933t0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
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
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nClearBasketComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/ClearBasketComponentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n75#2,6:67\n81#2:99\n85#2:112\n75#3:73\n76#3,11:75\n89#3:111\n76#4:74\n460#5,13:86\n36#5:101\n473#5,3:108\n154#6:100\n1114#7,6:102\n*S KotlinDebug\n*F\n+ 1 ClearBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/ClearBasketComponentKt\n*L\n32#1:67,6\n32#1:99\n32#1:112\n32#1:73\n32#1:75,11\n32#1:111\n32#1:74\n32#1:86,13\n40#1:101\n32#1:108,3\n37#1:100\n40#1:102,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.ClearBasketComponentKt */
public final class ClearBasketComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104748a(@C12580l C8767m mVar, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar2;
        int i4;
        int i5;
        C11289a<C11079d2> aVar3 = aVar;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(aVar3, "onClearBasketClicked");
        C8592o o = oVar.mo15009o(332195134);
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
                ComposerKt.m29845w0(332195134, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.ClearBasketComponent (ClearBasketComponent.kt:27)");
            }
            C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(aVar2, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(d);
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
            Updater.m30188j(b, d2, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 8));
            C2683e d3 = C7933t0.f19075a.mo11076b(o, C7933t0.f19076b).mo10757d();
            C2223i a2 = C2250j.m9695a(C3049i.f8133a.mo10784j(), C37475b.f94185a.mo114218O());
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(aVar3);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ClearBasketComponentKt$ClearBasketComponent$1$1$1(aVar3);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8767m mVar3 = aVar2;
            oVar2 = o;
            ButtonKt.m13345c((C11289a) N, k, false, (C2243g) null, (C7870j) null, d3, a2, (C3046h) null, (C2366i0) null, ComposableSingletons$ClearBasketComponentKt.f59483a.mo68962a(), o, 805306416, 412);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar3;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ClearBasketComponentKt$ClearBasketComponent$2(mVar2, aVar3, i6, i7));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104749b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1663143207);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1663143207, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.ClearBasketComponentPreview (ClearBasketComponent.kt:58)");
            }
            ThemeKt.m153788a(ComposableSingletons$ClearBasketComponentKt.f59483a.mo68963b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ClearBasketComponentKt$ClearBasketComponentPreview$1(i));
        }
    }
}
