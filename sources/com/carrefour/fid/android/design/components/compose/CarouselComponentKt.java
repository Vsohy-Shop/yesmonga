package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.AndroidDialog_androidKt;
import androidx.compose.p004ui.window.C16541b;
import androidx.compose.p004ui.window.SecureFlagPolicy;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.libs.pager.PagerKt;
import com.carrefour.fid.android.design.libs.pager.PagerState;
import com.carrefour.fid.android.design.libs.pager.PagerStateKt;
import com.carrefour.fid.android.design.theme.C37475b;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCarouselComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselComponent.kt\ncom/carrefour/fid/android/design/components/compose/CarouselComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,256:1\n25#2:257\n25#2:268\n460#2,13:298\n460#2,13:331\n473#2,3:347\n473#2,3:352\n25#2:361\n460#2,13:390\n460#2,13:423\n473#2,3:439\n473#2,3:446\n460#2,13:466\n473#2,3:480\n1114#3,6:258\n1114#3,3:269\n1117#3,3:275\n1114#3,3:362\n1117#3,3:368\n474#4,4:264\n478#4,2:272\n482#4:278\n474#4,4:357\n478#4,2:365\n482#4:371\n474#5:274\n474#5:367\n74#6,6:279\n80#6:311\n84#6:356\n78#6,2:451\n80#6:479\n84#6:484\n75#7:285\n76#7,11:287\n75#7:318\n76#7,11:320\n89#7:350\n89#7:355\n75#7:377\n76#7,11:379\n75#7:410\n76#7,11:412\n89#7:442\n89#7:449\n75#7:453\n76#7,11:455\n89#7:483\n76#8:286\n76#8:319\n76#8:378\n76#8:411\n76#8:454\n154#9:312\n154#9:345\n154#9:346\n154#9:404\n154#9:437\n154#9:438\n154#9:444\n154#9:445\n76#10,5:313\n81#10:344\n85#10:351\n76#10,5:405\n81#10:436\n85#10:443\n68#11,5:372\n73#11:403\n77#11:450\n76#12:485\n102#12,2:486\n*S KotlinDebug\n*F\n+ 1 CarouselComponent.kt\ncom/carrefour/fid/android/design/components/compose/CarouselComponentKt\n*L\n62#1:257\n64#1:268\n101#1:298,13\n121#1:331,13\n121#1:347,3\n101#1:352,3\n152#1:361\n154#1:390,13\n203#1:423,13\n203#1:439,3\n154#1:446,3\n246#1:466,13\n246#1:480,3\n62#1:258,6\n64#1:269,3\n64#1:275,3\n152#1:362,3\n152#1:368,3\n64#1:264,4\n64#1:272,2\n64#1:278\n152#1:357,4\n152#1:365,2\n152#1:371\n64#1:274\n152#1:367\n101#1:279,6\n101#1:311\n101#1:356\n246#1:451,2\n246#1:479\n246#1:484\n101#1:285\n101#1:287,11\n121#1:318\n121#1:320,11\n121#1:350\n101#1:355\n154#1:377\n154#1:379,11\n203#1:410\n203#1:412,11\n203#1:442\n154#1:449\n246#1:453\n246#1:455,11\n246#1:483\n101#1:286\n121#1:319\n154#1:378\n203#1:411\n246#1:454\n124#1:312\n130#1:345\n131#1:346\n206#1:404\n213#1:437\n214#1:438\n234#1:444\n235#1:445\n121#1:313,5\n121#1:344\n121#1:351\n203#1:405,5\n203#1:436\n203#1:443\n154#1:372,5\n154#1:403\n154#1:450\n62#1:485\n62#1:486,2\n*E\n"})
public final class CarouselComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151348a(@C12580l C8767m mVar, @C12579k List<String> list, int i, @C12580l PagerState pagerState, @C12580l C11300l<? super Integer, C11079d2> lVar, @C12580l C8592o oVar, int i2, int i3) {
        C8767m mVar2;
        int i4;
        PagerState pagerState2;
        int i5;
        C11300l<? super Integer, C11079d2> lVar2;
        long j;
        List<String> list2 = list;
        int i6 = i2;
        Intrinsics.checkNotNullParameter(list2, "urls");
        C8592o o = oVar.mo15009o(-439557474);
        if ((i3 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i3 & 4) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            i5 = i6 & -7169;
            pagerState2 = PagerStateKt.m153714a(i4, o, (i6 >> 6) & 14, 0);
        } else {
            pagerState2 = pagerState;
            i5 = i6;
        }
        if ((i3 & 16) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-439557474, i5, -1, "com.carrefour.fid.android.design.components.compose.Carousel (CarouselComponent.kt:93)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C8734c.C8736b m = aVar2.mo17068m();
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        C15560f0 b = ColumnKt.m9863b(arrangement.mo7631r(), m, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
        C11300l<? super Integer, C11079d2> lVar3 = lVar2;
        PagerKt.m153665a(list.size(), mVar2, pagerState2, false, 0.0f, (C2366i0) null, (C8734c.C8737c) null, (C2195g) null, (C11300l<? super Integer, ? extends Object>) null, C8553b.m31048b(o, 1134144133, true, new CarouselComponentKt$Carousel$1$1(list2, lVar2, i5)), o, ((i5 << 3) & 112) | 805306368 | ((i5 >> 3) & 896), 504);
        float f2 = (float) 8;
        C8767m m2 = PaddingKt.m10026m(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f2), 1, (Object) null);
        Arrangement.C2271e f3 = arrangement.mo7625f();
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(f3, aVar2.mo17073w(), o, 6);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(m2);
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
        f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        o.mo14918M(1032834710);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C8767m a3 = C8744d.m32514a(SizeKt.m10087C(PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 4), 0.0f, 2, (Object) null), C16483g.m74435M(f2)), C2694o.m12169k());
            if (i7 == pagerState2.mo114114s()) {
                j = C37475b.f94185a.mo114218O();
            } else {
                j = C37475b.f94185a.mo114204A();
            }
            BoxKt.m9839a(BackgroundKt.m8825d(a3, j, (C15218g4) null, 2, (Object) null), o, 0);
        }
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CarouselComponentKt$Carousel$2(mVar2, list, i4, pagerState2, lVar3, i2, i3));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151349b(@C12580l C8767m mVar, @C12579k List<String> list, @C12580l List<String> list2, @C12580l C11300l<? super Integer, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        List<String> list3;
        int i3;
        C11300l<? super Integer, C11079d2> lVar2;
        List<String> list4 = list;
        Intrinsics.checkNotNullParameter(list4, "urls");
        C8592o o = oVar.mo15009o(1465359697);
        if ((i2 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 4) != 0) {
            i3 = i & -897;
            list3 = list4;
        } else {
            list3 = list2;
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1465359697, i3, -1, "com.carrefour.fid.android.design.components.compose.CarouselWithPreview (CarouselComponent.kt:55)");
        }
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        C8592o.C8593a aVar2 = C8592o.f23032a;
        if (N == aVar2.mo16277a()) {
            N = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        PagerState a = PagerStateKt.m153714a(0, o, 6, 0);
        o.mo14918M(773894976);
        o.mo14918M(-492369756);
        Object N2 = o.mo14921N();
        if (N2 == aVar2.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
            o.mo14893C(wVar);
            N2 = wVar;
        }
        o.mo15002m0();
        C12074o0 a2 = ((C8690w) N2).mo16831a();
        o.mo15002m0();
        C12074o0 o0Var = a2;
        m151348a(aVar, list, 0, a, new CarouselComponentKt$CarouselWithPreview$1(lVar2, list3, list4, z0Var), o, (i3 & 14) | 64, 4);
        if (m151350c(z0Var) != null) {
            AndroidDialog_androidKt.m74858a(CarouselComponentKt$CarouselWithPreview$2.f92110f, new C16541b(false, false, (SecureFlagPolicy) null, false, false, 23, (DefaultConstructorMarker) null), C8553b.m31048b(o, -1697859325, true, new CarouselComponentKt$CarouselWithPreview$3(list4, a, new CarouselComponentKt$CarouselWithPreview$onDismiss$1(o0Var, z0Var, a))), o, 438, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CarouselComponentKt$CarouselWithPreview$4(aVar, list, list3, lVar2, i, i2));
        }
    }

    /* renamed from: c */
    public static final C36983e m151350c(C8700z0<C36983e> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: d */
    public static final void m151351d(C8700z0<C36983e> z0Var, C36983e eVar) {
        z0Var.setValue(eVar);
    }

    @C8540g
    @C8761g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151352e(List<String> list, int i, C11300l<? super Integer, C11079d2> lVar, C8592o oVar, int i2, int i3) {
        C11300l<? super Integer, C11079d2> lVar2;
        long j;
        int i4 = i2;
        C8592o o = oVar.mo15009o(-1407283756);
        if ((i3 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1407283756, i4, -1, "com.carrefour.fid.android.design.components.compose.ImagesFullScreen (CarouselComponent.kt:145)");
        }
        PagerState a = PagerStateKt.m153714a(i, o, (i4 >> 3) & 14, 0);
        o.mo14918M(773894976);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
            o.mo14893C(wVar);
            N = wVar;
        }
        o.mo15002m0();
        C12074o0 a2 = ((C8690w) N).mo16831a();
        o.mo15002m0();
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C8734c i5 = aVar2.mo17066i();
        o.mo14918M(733328855);
        C15560f0 k = BoxKt.m9849k(i5, false, o, 6);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, k, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        o.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
        C12074o0 o0Var = a2;
        PagerKt.m153665a(list.size(), boxScopeInstance.mo7701c(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), aVar2.mo17066i()), a, false, 0.0f, (C2366i0) null, (C8734c.C8737c) null, (C2195g) null, (C11300l<? super Integer, ? extends Object>) null, C8553b.m31048b(o, 209508459, true, new CarouselComponentKt$ImagesFullScreen$1$1(list, a2, a)), o, 805306368, 504);
        float f2 = (float) 16;
        BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
        C8767m c = boxScopeInstance2.mo7701c(PaddingKt.m10024k(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f2)), aVar2.mo17063c());
        Arrangement.C2271e f3 = Arrangement.f6010a.mo7625f();
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(f3, aVar2.mo17073w(), o, 6);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a4 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(c);
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
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, d, companion.mo44588d());
        Updater.m30188j(b2, dVar2, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b2, c4Var2, companion.mo44590f());
        o.mo14972e();
        f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        o.mo14918M(1942380368);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C8767m a5 = C8744d.m32514a(SizeKt.m10087C(PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 4), 0.0f, 2, (Object) null), C16483g.m74435M((float) 8)), C2694o.m12169k());
            if (i6 == a.mo114114s()) {
                j = C37475b.f94185a.mo114218O();
            } else {
                j = C37475b.f94185a.mo114204A();
            }
            BoxKt.m9839a(BackgroundKt.m8825d(a5, j, (C15218g4) null, 2, (Object) null), o, 0);
        }
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        ImageKt.m8967b(C16015f.m71849d(C36896b.C36904h.ds_ic_circle_cross, o, 0), C16018i.m71858d(C36896b.C36912p.accessibility_close, o, 0), boxScopeInstance2.mo7701c(BackgroundKt.m8825d(C8744d.m32514a(SizeKt.m10087C(PaddingKt.m10024k(ClickableKt.m8878e(C8767m.f23478j, false, (String) null, (C16031g) null, new CarouselComponentKt$ImagesFullScreen$1$3(lVar2, o0Var, a), 7, (Object) null), C16483g.m74435M(f2)), C16483g.m74435M((float) 36)), C2694o.m12169k()), C37475b.f94185a.mo114208E(), (C15218g4) null, 2, (Object) null), C8734c.f23406a.mo17060A()), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 8, 120);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CarouselComponentKt$ImagesFullScreen$2(list, i, lVar2, i2, i3));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151353f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-2023372766);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2023372766, i, -1, "com.carrefour.fid.android.design.components.compose.Loader (CarouselComponent.kt:244)");
            }
            C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
            C8734c.C8736b m = C8734c.f23406a.mo17068m();
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
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
            ProgressIndicatorKt.m13705b((C8767m) null, 0, 0.0f, 0, 0, o, 0, 31);
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
            s.mo15202a(new CarouselComponentKt$Loader$2(i));
        }
    }
}
