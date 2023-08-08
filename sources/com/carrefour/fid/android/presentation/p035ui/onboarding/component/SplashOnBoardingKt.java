package com.carrefour.fid.android.presentation.p035ui.onboarding.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.ButtonColor;
import com.carrefour.fid.android.design.components.compose.ButtonComponentKt;
import com.carrefour.fid.android.design.components.compose.ButtonSize;
import com.carrefour.fid.android.design.components.compose.ButtonType;
import com.carrefour.fid.android.design.libs.pager.PagerKt;
import com.carrefour.fid.android.design.libs.pager.PagerState;
import com.carrefour.fid.android.design.libs.pager.PagerStateKt;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSplashOnBoarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashOnBoarding.kt\ncom/carrefour/fid/android/presentation/ui/onboarding/component/SplashOnBoardingKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,180:1\n474#2,4:181\n478#2,2:189\n482#2:195\n25#3:185\n460#3,13:216\n460#3,13:248\n473#3,3:262\n460#3,13:286\n473#3,3:302\n473#3,3:307\n1114#4,3:186\n1117#4,3:192\n474#5:191\n154#6:196\n154#6:267\n154#6:300\n154#6:301\n74#7,6:197\n80#7:229\n84#7:311\n75#8:203\n76#8,11:205\n75#8:235\n76#8,11:237\n89#8:265\n75#8:273\n76#8,11:275\n89#8:305\n89#8:310\n76#9:204\n76#9:236\n76#9:274\n68#10,5:230\n73#10:261\n77#10:266\n76#11,5:268\n81#11:299\n85#11:306\n*S KotlinDebug\n*F\n+ 1 SplashOnBoarding.kt\ncom/carrefour/fid/android/presentation/ui/onboarding/component/SplashOnBoardingKt\n*L\n57#1:181,4\n57#1:189,2\n57#1:195\n57#1:185\n88#1:216,13\n94#1:248,13\n94#1:262,3\n136#1:286,13\n136#1:302,3\n88#1:307,3\n57#1:186,3\n57#1:192,3\n57#1:191\n91#1:196\n139#1:267\n145#1:300\n146#1:301\n88#1:197,6\n88#1:229\n88#1:311\n88#1:203\n88#1:205,11\n94#1:235\n94#1:237,11\n94#1:265\n136#1:273\n136#1:275,11\n136#1:305\n88#1:310\n88#1:204\n94#1:236\n136#1:274\n94#1:230,5\n94#1:261\n94#1:266\n136#1:268,5\n136#1:299\n136#1:306\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt */
public final class SplashOnBoardingKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m107716a(@C12579k C27420a aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11300l<? super Boolean, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        long j;
        C27420a aVar3 = aVar;
        C11289a<C11079d2> aVar4 = aVar2;
        C11300l<? super Boolean, C11079d2> lVar2 = lVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(aVar3, "analyticsViewModel");
        Intrinsics.checkNotNullParameter(aVar4, "onNavigateHome");
        Intrinsics.checkNotNullParameter(lVar2, "onNavigateToAuth");
        C8592o o = oVar.mo15009o(-992728395);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-992728395, i2, -1, "com.carrefour.fid.android.presentation.ui.onboarding.component.OnBoardingScreen (SplashOnBoarding.kt:51)");
        }
        o.mo14918M(773894976);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
            o.mo14893C(wVar);
            N = wVar;
        }
        o.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        o.mo15002m0();
        List L = CollectionsKt__CollectionsKt.m40448L(new C24662a(R.drawable.onboarding_step_one, R.string.on_boarding_first_step_title, R.string.on_boarding_first_step_description), new C24662a(R.drawable.onboarding_step_two, R.string.on_boarding_second_step_title, R.string.on_boarding_second_step_description), new C24662a(R.drawable.onboarding_step_three, R.string.on_boarding_third_step_title, R.string.on_boarding_third_step_description), new C24662a(R.drawable.onboarding_step_four, R.string.on_boarding_fourth_step_title, R.string.on_boarding_fourth_step_description));
        PagerState a2 = PagerStateKt.m153714a(0, o, 6, 0);
        List list = L;
        PagerState pagerState = a2;
        C11723c2 unused = C12038j.m48061f(a, (CoroutineContext) null, (CoroutineStart) null, new SplashOnBoardingKt$OnBoardingScreen$1(a2, aVar3, (C11045c<? super SplashOnBoardingKt$OnBoardingScreen$1>) null), 3, (Object) null);
        C8767m.C8768a aVar5 = C8767m.f23478j;
        C8767m m = PaddingKt.m10026m(SizeKt.m10112l(aVar5, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16), 0.0f, 2, (Object) null);
        C8734c.C8735a aVar6 = C8734c.f23406a;
        C8734c.C8736b m2 = aVar6.mo17068m();
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        C15560f0 b = ColumnKt.m9863b(arrangement.mo7631r(), m2, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(m);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a3);
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
        C8767m n = SizeKt.m10114n(aVar5, 0.0f, 1, (Object) null);
        C8734c k = aVar6.mo17067k();
        o.mo14918M(733328855);
        C15560f0 k2 = BoxKt.m9849k(k, false, o, 6);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a4 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a4);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b3 = Updater.m30180b(o);
        Updater.m30188j(b3, k2, companion.mo44588d());
        Updater.m30188j(b3, dVar2, companion.mo44586b());
        Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b3, c4Var2, companion.mo44590f());
        o.mo14972e();
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
        C8767m.C8768a aVar7 = aVar5;
        PagerState pagerState2 = pagerState;
        C8592o oVar2 = o;
        ButtonComponentKt.m151341h((C8767m) null, new SplashOnBoardingKt$OnBoardingScreen$2$1$1(aVar3, pagerState, aVar4), (ButtonSize) null, (ButtonColor) null, false, C16018i.m71858d(R.string.on_boarding_skip, o, 0), (Integer) null, false, o, 0, 221);
        oVar2.mo15002m0();
        oVar2.mo14896D();
        oVar2.mo15002m0();
        oVar2.mo15002m0();
        int size = list.size();
        C8767m c = C2373k.m10461c(columnScopeInstance, aVar7, 3.0f, false, 2, (Object) null);
        List list2 = list;
        C8552a b4 = C8553b.m31048b(oVar2, 1376873884, true, new SplashOnBoardingKt$OnBoardingScreen$2$2(list2));
        List list3 = list2;
        C8592o oVar3 = oVar2;
        PagerKt.m153665a(size, c, pagerState2, false, 0.0f, (C2366i0) null, (C8734c.C8737c) null, (C2195g) null, (C11300l<? super Integer, ? extends Object>) null, b4, oVar3, 805306368, 504);
        float f3 = (float) 8;
        C8767m m3 = PaddingKt.m10026m(SizeKt.m10114n(aVar7, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f3), 1, (Object) null);
        Arrangement.C2271e f4 = arrangement.mo7625f();
        oVar3.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(f4, aVar6.mo17073w(), oVar3, 6);
        oVar3.mo14918M(-1323940314);
        C16479d dVar3 = (C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection3 = (LayoutDirection) oVar3.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var3 = (C15863c4) oVar3.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a5 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(m3);
        if (!(oVar3.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar3.mo14938T();
        if (oVar3.mo14997l()) {
            oVar3.mo14947W(a5);
        } else {
            oVar3.mo14888A();
        }
        oVar3.mo14941U();
        C8592o b5 = Updater.m30180b(oVar3);
        Updater.m30188j(b5, d, companion.mo44588d());
        Updater.m30188j(b5, dVar3, companion.mo44586b());
        Updater.m30188j(b5, layoutDirection3, companion.mo44587c());
        Updater.m30188j(b5, c4Var3, companion.mo44590f());
        oVar3.mo14972e();
        f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar3)), oVar3, 0);
        oVar3.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        oVar3.mo14918M(201005470);
        int size2 = list3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C8767m a6 = C8744d.m32514a(SizeKt.m10087C(PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 4), 0.0f, 2, (Object) null), C16483g.m74435M(f3)), C2694o.m12169k());
            if (i3 == pagerState2.mo114114s()) {
                j = C37475b.f94185a.mo114218O();
            } else {
                j = C37475b.f94185a.mo114204A();
            }
            BoxKt.m9839a(BackgroundKt.m8825d(a6, j, (C15218g4) null, 2, (Object) null), oVar3, 0);
        }
        oVar3.mo15002m0();
        oVar3.mo15002m0();
        oVar3.mo14896D();
        oVar3.mo15002m0();
        oVar3.mo15002m0();
        C8767m.C8768a aVar8 = C8767m.f23478j;
        C37474a aVar9 = C37474a.f94133a;
        C2428y0.m10726a(SizeKt.m10115o(aVar8, aVar9.mo114200w()), oVar3, 0);
        PagerState pagerState3 = pagerState2;
        C8767m.C8768a aVar10 = aVar8;
        ButtonComponentKt.m151339f(SizeKt.m10114n(aVar8, 0.0f, 1, (Object) null), new SplashOnBoardingKt$OnBoardingScreen$2$4(aVar3, pagerState3, lVar2), (ButtonType) null, (ButtonColor) null, false, C16018i.m71858d(R.string.on_boarding_authenticate, oVar3, 0), false, (Integer) null, false, oVar3, 6, 476);
        C8592o oVar4 = oVar3;
        C2428y0.m10726a(SizeKt.m10115o(aVar10, aVar9.mo114202y()), oVar4, 0);
        ButtonComponentKt.m151339f(SizeKt.m10114n(aVar10, 0.0f, 1, (Object) null), new SplashOnBoardingKt$OnBoardingScreen$2$5(aVar3, pagerState3, lVar2), ButtonType.Secondary, (ButtonColor) null, false, C16018i.m71858d(R.string.on_boarding_sign_up, oVar4, 0), false, (Integer) null, false, oVar4, 390, 472);
        C8592o oVar5 = oVar4;
        C2428y0.m10726a(SizeKt.m10115o(aVar10, aVar9.mo114202y()), oVar5, 0);
        oVar5.mo15002m0();
        oVar5.mo14896D();
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar5.mo15020s();
        if (s != null) {
            s.mo15202a(new SplashOnBoardingKt$OnBoardingScreen$3(aVar3, aVar4, lVar2, i2));
        }
    }
}
