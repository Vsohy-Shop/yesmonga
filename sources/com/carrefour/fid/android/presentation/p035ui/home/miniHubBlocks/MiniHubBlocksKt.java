package com.carrefour.fid.android.presentation.p035ui.home.miniHubBlocks;

import androidx.camera.core.C1677r2;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
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
import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMiniHubBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniHubBlocks.kt\ncom/carrefour/fid/android/presentation/ui/home/miniHubBlocks/MiniHubBlocksKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n154#2:313\n154#2:314\n154#2:315\n75#3,6:316\n81#3:348\n85#3:353\n76#3,5:354\n81#3:385\n85#3:390\n76#3,5:424\n81#3:455\n85#3:460\n75#3,6:461\n81#3:493\n85#3:498\n76#3,5:537\n81#3:568\n85#3:573\n76#3,5:574\n81#3:605\n85#3:610\n75#4:322\n76#4,11:324\n89#4:352\n75#4:359\n76#4,11:361\n89#4:389\n75#4:397\n76#4,11:399\n75#4:429\n76#4,11:431\n89#4:459\n75#4:467\n76#4,11:469\n89#4:497\n89#4:502\n75#4:510\n76#4,11:512\n75#4:542\n76#4,11:544\n89#4:572\n75#4:579\n76#4,11:581\n89#4:609\n89#4:614\n76#5:323\n76#5:360\n76#5:398\n76#5:430\n76#5:468\n76#5:511\n76#5:543\n76#5:580\n460#6,13:335\n473#6,3:349\n460#6,13:372\n473#6,3:386\n460#6,13:410\n460#6,13:442\n473#6,3:456\n460#6,13:480\n473#6,3:494\n473#6,3:499\n460#6,13:523\n460#6,13:555\n473#6,3:569\n460#6,13:592\n473#6,3:606\n473#6,3:611\n74#7,6:391\n80#7:423\n84#7:503\n74#7,6:504\n80#7:536\n84#7:615\n1549#8:616\n1620#8,3:617\n1549#8:620\n1620#8,3:621\n1549#8:624\n1620#8,3:625\n*S KotlinDebug\n*F\n+ 1 MiniHubBlocks.kt\ncom/carrefour/fid/android/presentation/ui/home/miniHubBlocks/MiniHubBlocksKt\n*L\n71#1:313\n72#1:314\n96#1:315\n122#1:316,6\n122#1:348\n122#1:353\n140#1:354,5\n140#1:385\n140#1:390\n171#1:424,5\n171#1:455\n171#1:460\n187#1:461,6\n187#1:493\n187#1:498\n209#1:537,5\n209#1:568\n209#1:573\n225#1:574,5\n225#1:605\n225#1:610\n122#1:322\n122#1:324,11\n122#1:352\n140#1:359\n140#1:361,11\n140#1:389\n165#1:397\n165#1:399,11\n171#1:429\n171#1:431,11\n171#1:459\n187#1:467\n187#1:469,11\n187#1:497\n165#1:502\n203#1:510\n203#1:512,11\n209#1:542\n209#1:544,11\n209#1:572\n225#1:579\n225#1:581,11\n225#1:609\n203#1:614\n122#1:323\n140#1:360\n165#1:398\n171#1:430\n187#1:468\n203#1:511\n209#1:543\n225#1:580\n122#1:335,13\n122#1:349,3\n140#1:372,13\n140#1:386,3\n165#1:410,13\n171#1:442,13\n171#1:456,3\n187#1:480,13\n187#1:494,3\n165#1:499,3\n203#1:523,13\n209#1:555,13\n209#1:569,3\n225#1:592,13\n225#1:606,3\n203#1:611,3\n165#1:391,6\n165#1:423\n165#1:503\n203#1:504,6\n203#1:536\n203#1:615\n262#1:616\n262#1:617,3\n280#1:620\n280#1:621,3\n298#1:624\n298#1:625,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.MiniHubBlocksKt */
public final class MiniHubBlocksKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106476a(List<MiniHubBlocksModel> list, C11300l<? super LinkModel, C11079d2> lVar, C8592o oVar, int i) {
        List<MiniHubBlocksModel> list2 = list;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1194930463);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1194930463, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.FourBlocksView (MiniHubBlocks.kt:198)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        C37474a aVar2 = C37474a.f94133a;
        C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(n, aVar2.mo114202y(), 0.0f, 2, (Object) null), 0.0f, aVar2.mo114202y(), 0.0f, aVar2.mo114175A(), 5, (Object) null);
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar3 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar3.mo17072u(), o, 0);
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
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        o.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        C8767m n2 = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        Arrangement.C2271e z = arrangement.mo7638z(aVar2.mo114202y());
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(z, aVar3.mo17073w(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n2);
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
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        Arrangement arrangement2 = arrangement;
        int i3 = (i2 & 112) | 8;
        m106482g(list2.get(0), lVar2, C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), o, i3);
        int i4 = i3;
        m106482g(list2.get(1), lVar2, C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), o, i4);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C2428y0.m10726a(PaddingKt.m10024k(aVar, aVar2.mo114175A()), o, 0);
        C8767m n3 = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        Arrangement.C2271e z2 = arrangement2.mo7638z(aVar2.mo114202y());
        o.mo14918M(693286680);
        C15560f0 d2 = RowKt.m10071d(z2, aVar3.mo17073w(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(n3);
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
        C8592o b4 = Updater.m30180b(o);
        Updater.m30188j(b4, d2, companion.mo44588d());
        Updater.m30188j(b4, dVar3, companion.mo44586b());
        Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
        Updater.m30188j(b4, c4Var3, companion.mo44590f());
        o.mo14972e();
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        C8767m.C8768a aVar4 = aVar;
        m106482g(list2.get(2), lVar2, C2411u0.m10660e(rowScopeInstance, aVar4, 1.0f, false, 2, (Object) null), o, i4);
        m106482g(list2.get(3), lVar2, C2411u0.m10660e(rowScopeInstance, aVar4, 1.0f, false, 2, (Object) null), o, i4);
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
            s.mo15202a(new MiniHubBlocksKt$FourBlocksView$2(list2, lVar2, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106477b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1141657716);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1141657716, i, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.FourHubBlocksPreview (MiniHubBlocks.kt:296)");
            }
            C11466l lVar = new C11466l(1, 4);
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(lVar, 10));
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                ((C10953k0) it).mo6374c();
                arrayList.add(new MiniHubBlocksModel((String) null, (LinkModel) null, C1677r2.f4664s));
            }
            ThemeKt.m153788a(C8553b.m31048b(o, -1136400457, true, new MiniHubBlocksKt$FourHubBlocksPreview$1(arrayList)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$FourHubBlocksPreview$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m106478c(MiniHubBlocksModel miniHubBlocksModel, C11300l<? super LinkModel, C11079d2> lVar, C8592o oVar, int i) {
        MiniHubBlocksModel miniHubBlocksModel2 = miniHubBlocksModel;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(492020331);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(492020331, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.LargeMiniHubBlock (MiniHubBlocks.kt:88)");
        }
        C8592o oVar2 = o;
        SurfaceKt.m13879b(ClickableKt.m8878e(SizeKt.m10115o(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 58)), false, (String) null, (C16031g) null, new MiniHubBlocksKt$LargeMiniHubBlock$1(lVar2, miniHubBlocksModel2), 7, (Object) null), C2694o.m12166h(C37474a.f94133a.mo114189l()), 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(o, -274268241, true, new MiniHubBlocksKt$LargeMiniHubBlock$2(miniHubBlocksModel2)), o, 1572864, 60);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$LargeMiniHubBlock$3(miniHubBlocksModel2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106479d(@C12579k HomePageViewModel homePageViewModel, @C12579k C11300l<? super LinkModel, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        HomePageViewModel homePageViewModel2 = homePageViewModel;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(homePageViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(lVar2, "onBlockClick");
        C8592o o = oVar.mo15009o(-608241619);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-608241619, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.NalMiniHubBlocksStateful (MiniHubBlocks.kt:36)");
        }
        List<MiniHubBlocksModel> A = ((C26406a.C26449c) C8415c2.m30232a(homePageViewModel.getUiState(), new C26406a.C26449c((C26406a.C26449c.C26476i) null, (StoreServiceType) null, false, (C26406a.C26449c.C26456c) null, (List) null, (List) null, (List) null, (C26406a.C26449c.C26469g) null, (C26406a.C26449c.C26472h) null, (C26406a.C26449c.C26460d) null, (C26406a.C26449c.C26453b) null, (C26406a.C26449c.C26466f) null, (C26406a.C26449c.C26463e) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null), (CoroutineContext) null, o, 72, 2).getValue()).mo76950A();
        if (A.isEmpty()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new MiniHubBlocksKt$NalMiniHubBlocksStateful$1(homePageViewModel2, lVar2, i2));
                return;
            }
            return;
        }
        int size = A.size();
        if (size == 1) {
            o.mo14918M(-1446500188);
            m106480e((MiniHubBlocksModel) CollectionsKt___CollectionsKt.m40706w2(A), lVar2, o, (i2 & 112) | 8);
            o.mo15002m0();
        } else if (size == 2) {
            o.mo14918M(-1446500082);
            m106485j(A, lVar2, o, (i2 & 112) | 8);
            o.mo15002m0();
        } else if (size != 3) {
            o.mo14918M(-1446499879);
            m106476a(CollectionsKt___CollectionsKt.m40497E5(A, 4), lVar2, o, (i2 & 112) | 8);
            o.mo15002m0();
        } else {
            o.mo14918M(-1446499983);
            m106483h(A, lVar2, o, (i2 & 112) | 8);
            o.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new MiniHubBlocksKt$NalMiniHubBlocksStateful$3(homePageViewModel2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m106480e(MiniHubBlocksModel miniHubBlocksModel, C11300l<? super LinkModel, C11079d2> lVar, C8592o oVar, int i) {
        MiniHubBlocksModel miniHubBlocksModel2 = miniHubBlocksModel;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(469364077);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(469364077, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.OneBlockView (MiniHubBlocks.kt:117)");
        }
        C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
        C37474a aVar = C37474a.f94133a;
        C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(n, aVar.mo114202y(), 0.0f, 2, (Object) null), 0.0f, aVar.mo114202y(), 0.0f, aVar.mo114175A(), 5, (Object) null);
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
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
        m106478c(miniHubBlocksModel2, lVar2, o, (i2 & 112) | 8);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$OneBlockView$2(miniHubBlocksModel2, lVar2, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m106481f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1288382160);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1288382160, i, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.OneHubBlocksPreview (MiniHubBlocks.kt:244)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 1769085741, true, new MiniHubBlocksKt$OneHubBlocksPreview$1(new MiniHubBlocksModel((String) null, (LinkModel) null, C1677r2.f4664s))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$OneHubBlocksPreview$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m106482g(MiniHubBlocksModel miniHubBlocksModel, C11300l<? super LinkModel, C11079d2> lVar, C8767m mVar, C8592o oVar, int i) {
        MiniHubBlocksModel miniHubBlocksModel2 = miniHubBlocksModel;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        C8767m mVar2 = mVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(227651806);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(227651806, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.SmallMiniHubBlock (MiniHubBlocks.kt:63)");
        }
        C8592o oVar2 = o;
        SurfaceKt.m13879b(ClickableKt.m8878e(SizeKt.m10115o(SizeKt.m10092H(mVar2, C16483g.m74435M((float) 163)), C16483g.m74435M((float) 58)), false, (String) null, (C16031g) null, new MiniHubBlocksKt$SmallMiniHubBlock$1(lVar2, miniHubBlocksModel2), 7, (Object) null), C2694o.m12166h(C37474a.f94133a.mo114189l()), 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(o, -1170669542, true, new MiniHubBlocksKt$SmallMiniHubBlock$2(miniHubBlocksModel2)), o, 1572864, 60);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$SmallMiniHubBlock$3(miniHubBlocksModel2, lVar2, mVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m106483h(List<MiniHubBlocksModel> list, C11300l<? super LinkModel, C11079d2> lVar, C8592o oVar, int i) {
        List<MiniHubBlocksModel> list2 = list;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-2103381627);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2103381627, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.ThreeBlocksView (MiniHubBlocks.kt:160)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        C37474a aVar2 = C37474a.f94133a;
        C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(n, aVar2.mo114202y(), 0.0f, 2, (Object) null), 0.0f, aVar2.mo114202y(), 0.0f, aVar2.mo114175A(), 5, (Object) null);
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar3 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar3.mo17072u(), o, 0);
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
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        o.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        C8767m n2 = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        Arrangement.C2271e z = arrangement.mo7638z(aVar2.mo114202y());
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(z, aVar3.mo17073w(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n2);
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
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        Arrangement arrangement2 = arrangement;
        int i3 = (i2 & 112) | 8;
        m106482g(list2.get(0), lVar2, C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), o, i3);
        int i4 = i3;
        m106482g(list2.get(1), lVar2, C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), o, i4);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C2428y0.m10726a(PaddingKt.m10024k(aVar, aVar2.mo114175A()), o, 0);
        C8767m n3 = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        o.mo14918M(693286680);
        C15560f0 d2 = RowKt.m10071d(arrangement2.mo7630p(), aVar3.mo17073w(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(n3);
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
        C8592o b4 = Updater.m30180b(o);
        Updater.m30188j(b4, d2, companion.mo44588d());
        Updater.m30188j(b4, dVar3, companion.mo44586b());
        Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
        Updater.m30188j(b4, c4Var3, companion.mo44590f());
        o.mo14972e();
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        m106478c(list2.get(2), lVar2, o, i4);
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
            s.mo15202a(new MiniHubBlocksKt$ThreeBlocksView$2(list2, lVar2, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m106484i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-260745448);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-260745448, i, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.ThreeHubBlocksPreview (MiniHubBlocks.kt:278)");
            }
            C11466l lVar = new C11466l(1, 3);
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(lVar, 10));
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                ((C10953k0) it).mo6374c();
                arrayList.add(new MiniHubBlocksModel((String) null, (LinkModel) null, C1677r2.f4664s));
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 2133895221, true, new MiniHubBlocksKt$ThreeHubBlocksPreview$1(arrayList)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$ThreeHubBlocksPreview$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m106485j(List<MiniHubBlocksModel> list, C11300l<? super LinkModel, C11079d2> lVar, C8592o oVar, int i) {
        List<MiniHubBlocksModel> list2 = list;
        C11300l<? super LinkModel, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(18172183);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(18172183, i2, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.TwoBlocksView (MiniHubBlocks.kt:135)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        C37474a aVar2 = C37474a.f94133a;
        C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(n, aVar2.mo114202y(), 0.0f, 2, (Object) null), 0.0f, aVar2.mo114202y(), 0.0f, aVar2.mo114175A(), 5, (Object) null);
        Arrangement.C2271e z = Arrangement.f6010a.mo7638z(aVar2.mo114202y());
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(z, C8734c.f23406a.mo17073w(), o, 0);
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
        int i3 = (i2 & 112) | 8;
        m106482g(list2.get(0), lVar2, C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), o, i3);
        m106482g(list2.get(1), lVar2, C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), o, i3);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$TwoBlocksView$2(list2, lVar2, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m106486k(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1576755370);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1576755370, i, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.TwoHubBlocksPreview (MiniHubBlocks.kt:260)");
            }
            C11466l lVar = new C11466l(1, 2);
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(lVar, 10));
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                ((C10953k0) it).mo6374c();
                arrayList.add(new MiniHubBlocksModel((String) null, (LinkModel) null, C1677r2.f4664s));
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 2057458951, true, new MiniHubBlocksKt$TwoHubBlocksPreview$1(arrayList)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MiniHubBlocksKt$TwoHubBlocksPreview$2(i));
        }
    }
}
