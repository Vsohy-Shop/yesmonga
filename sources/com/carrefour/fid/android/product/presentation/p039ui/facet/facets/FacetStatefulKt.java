package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.annotation.C0324b1;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.C2485c;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C7873k;
import androidx.compose.material.C7933t0;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.performance.C38334f;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C27998a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.C28160a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import com.carrefour.fid.android.shared.extension.FlowKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt;
import java.util.ArrayList;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFacetStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,429:1\n76#2:430\n76#2:431\n76#2:451\n76#2:483\n76#2:530\n76#2:570\n800#3,11:432\n766#3:556\n857#3,2:557\n1549#3:559\n1620#3,3:560\n154#4:443\n154#4:444\n154#4:526\n154#4:606\n76#5,5:445\n81#5:476\n85#5:525\n79#5,2:527\n81#5:555\n85#5:605\n75#6:450\n76#6,11:452\n75#6:482\n76#6,11:484\n89#6:519\n89#6:524\n75#6:529\n76#6,11:531\n75#6:569\n76#6,11:571\n89#6:599\n89#6:604\n460#7,13:463\n460#7,13:495\n36#7:509\n473#7,3:516\n473#7,3:521\n460#7,13:542\n460#7,13:582\n473#7,3:596\n473#7,3:601\n36#7:607\n68#8,5:477\n73#8:508\n77#8:520\n1114#9,6:510\n1114#9,6:608\n74#10,6:563\n80#10:595\n84#10:600\n*S KotlinDebug\n*F\n+ 1 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt\n*L\n87#1:430\n121#1:431\n242#1:451\n248#1:483\n311#1:530\n321#1:570\n193#1:432,11\n320#1:556\n320#1:557,2\n320#1:559\n320#1:560,3\n203#1:443\n245#1:444\n288#1:526\n357#1:606\n242#1:445,5\n242#1:476\n242#1:525\n311#1:527,2\n311#1:555\n311#1:605\n242#1:450\n242#1:452,11\n248#1:482\n248#1:484,11\n248#1:519\n242#1:524\n311#1:529\n311#1:531,11\n321#1:569\n321#1:571,11\n321#1:599\n311#1:604\n242#1:463,13\n248#1:495,13\n257#1:509\n248#1:516,3\n242#1:521,3\n311#1:542,13\n321#1:582,13\n321#1:596,3\n311#1:601,3\n358#1:607\n248#1:477,5\n248#1:508\n248#1:520\n257#1:510,6\n358#1:608,6\n321#1:563,6\n321#1:595\n321#1:600\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt */
public final class FacetStatefulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117373a(C28892e<Facet> eVar, C11300l<? super C27998a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        C28892e<Facet> eVar2 = eVar;
        C11300l<? super C27998a, C11079d2> lVar2 = lVar;
        int i5 = i;
        C8592o o = oVar.mo15009o(1389144121);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(eVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1389144121, i6, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetScreen (FacetStateful.kt:136)");
            }
            C8592o oVar3 = o;
            oVar2 = oVar3;
            ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, C8553b.m31048b(o, 1782721982, true, new FacetStatefulKt$FacetScreen$1(lVar2, i6)), C8553b.m31048b(o, -1546682497, true, new FacetStatefulKt$FacetScreen$2(eVar2, lVar2, i6)), (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, C37475b.f94185a.mo114208E(), 0, C8553b.m31048b(oVar3, 109708663, true, new FacetStatefulKt$FacetScreen$3(eVar2, lVar2, i6)), oVar3, 3456, 12582912, 98291);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$FacetScreen$4(eVar2, lVar2, i5));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m117374b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-574470784);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-574470784, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetScreenPreview (FacetStateful.kt:382)");
            }
            ThemeKt.m153788a(ComposableSingletons$FacetStatefulKt.f67818a.mo81426c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$FacetScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m117375c(@C12579k FacetViewModel facetViewModel, @C12579k C27950a aVar, @C12579k C38326b bVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11300l<? super String, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar3, @C12580l C8592o oVar, int i) {
        FacetViewModel facetViewModel2 = facetViewModel;
        C27950a aVar4 = aVar;
        C11289a<C11079d2> aVar5 = aVar3;
        Intrinsics.checkNotNullParameter(facetViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar4, "analytics");
        Intrinsics.checkNotNullParameter(bVar, "performance");
        Intrinsics.checkNotNullParameter(aVar2, "onBackPress");
        Intrinsics.checkNotNullParameter(lVar, "onNavigateToFilters");
        Intrinsics.checkNotNullParameter(aVar5, "displayErrorSnackbar");
        C8592o o = oVar.mo15009o(909782033);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(909782033, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStateful (FacetStateful.kt:76)");
        } else {
            int i2 = i;
        }
        C8578k2<C28160a> b = C8415c2.m30233b(facetViewModel.getState(), (CoroutineContext) null, o, 8, 1);
        C11907e<C28007b> b2 = FlowKt.m118809b(facetViewModel.getSideEffect(), ((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i())).getLifecycle(), (Lifecycle.State) null, o, 72, 4);
        C28892e<Facet> f = b.getValue().mo81901f();
        C8592o oVar2 = o;
        FacetStatefulKt$FacetStateful$1 facetStatefulKt$FacetStateful$1 = new FacetStatefulKt$FacetStateful$1(aVar2, lVar, aVar, facetViewModel, bVar);
        int i3 = C28892e.f70778a;
        m117373a(f, facetStatefulKt$FacetStateful$1, oVar2, i3);
        EffectsKt.m29896h(b2, new FacetStatefulKt$FacetStateful$2(b2, aVar5, (C11045c<? super FacetStatefulKt$FacetStateful$2>) null), oVar2, 72);
        C8592o oVar3 = oVar2;
        EventLifecycleObserverKt.m119612a((C19499w) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, new FacetStatefulKt$FacetStateful$3(facetViewModel2), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, new FacetStatefulKt$FacetStateful$4(facetViewModel2), (C11289a<C11079d2>) null, oVar3, 8, 182);
        SingleEventCoroutineLauncherKt.m119625a(b.getValue().mo81901f(), FacetStatefulKt$FacetStateful$5.f67828f, new FacetStatefulKt$FacetStateful$6(aVar4), oVar3, i3 | 48, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$FacetStateful$7(facetViewModel, aVar, bVar, aVar2, lVar, aVar3, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m117376d(Filter.CheckboxFilter checkboxFilter, boolean z, C11300l<? super C27998a, C11079d2> lVar, C8592o oVar, int i) {
        Filter.CheckboxFilter checkboxFilter2 = checkboxFilter;
        boolean z2 = z;
        C11300l<? super C27998a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(1145329342);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1145329342, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.FilterItem (FacetStateful.kt:305)");
        }
        C8767m e = ClickableKt.m8878e(C37019o.m151909b(BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null), z2, (C15218g4) null, 2, (Object) null), false, (String) null, (C16031g) null, new FacetStatefulKt$FilterItem$1(lVar2, checkboxFilter2), 7, (Object) null);
        Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
        C8734c.C8737c q = C8734c.f23406a.mo17070q();
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(l, q, o, 54);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(e);
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
        ArrayList<Term> arrayList = new ArrayList<>();
        for (Object next : checkboxFilter.mo118368i()) {
            if (((Term) next).isSelected()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (Term e2 : arrayList) {
            arrayList2.add(e2.mo118626e());
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C37474a aVar2 = C37474a.f94133a;
        C8767m k = PaddingKt.m10024k(aVar, aVar2.mo114202y());
        o.mo14918M(-483455358);
        C15560f0 b2 = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a2 = companion2.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(k);
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
        Updater.m30188j(b3, b2, companion2.mo44588d());
        Updater.m30188j(b3, dVar2, companion2.mo44586b());
        Updater.m30188j(b3, layoutDirection2, companion2.mo44587c());
        Updater.m30188j(b3, c4Var2, companion2.mo44590f());
        o.mo14972e();
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        String h = checkboxFilter.mo118366h();
        C37475b bVar = C37475b.f94185a;
        long y = bVar.mo114257y();
        C8767m.C8768a aVar3 = aVar;
        ArrayList arrayList3 = arrayList2;
        C8592o oVar2 = o;
        C16432i.C16433a aVar4 = C16432i.f40718b;
        C16432i g = C16432i.m74172g(aVar4.mo47667a());
        C7933t0 t0Var = C7933t0.f19075a;
        int i3 = C7933t0.f19076b;
        C8592o oVar3 = oVar2;
        C7933t0 t0Var2 = t0Var;
        int i4 = i3;
        TextKt.m14196c(h, (C8767m) null, y, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, g, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153889a(t0Var.mo11077c(oVar2, i3)), oVar2, 0, 0, 65018);
        oVar3.mo14918M(216779086);
        if (!arrayList3.isEmpty()) {
            TextKt.m14196c(CollectionsKt___CollectionsKt.m40639h3(arrayList3, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null), (C8767m) null, bVar.mo114258z(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar4.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var2.mo11077c(oVar3, i4)), oVar3, 0, 0, 65018);
        }
        oVar3.mo15002m0();
        oVar3.mo15002m0();
        oVar3.mo14896D();
        oVar3.mo15002m0();
        oVar3.mo15002m0();
        C8592o oVar4 = oVar3;
        IconKt.m13539b(C16015f.m71849d(C27609f.C27617h.ic_arrow_filter, oVar3, 0), (String) null, SizeKt.m10087C(PaddingKt.m10028o(aVar3, 0.0f, 0.0f, aVar2.mo114202y(), 0.0f, 11, (Object) null), aVar2.mo114195r()), bVar.mo114218O(), oVar4, 56, 0);
        oVar3.mo15002m0();
        oVar3.mo14896D();
        oVar3.mo15002m0();
        oVar3.mo15002m0();
        DividerKt.m13428a((C8767m) null, bVar.mo114208E(), 0.0f, 0.0f, oVar4, 0, 13);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$FilterItem$3(checkboxFilter, z, lVar, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117377e(int r18, boolean r19, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C27998a, kotlin.C11079d2> r20, androidx.compose.runtime.C8592o r21, int r22) {
        /*
            r0 = r18
            r13 = r19
            r14 = r20
            r15 = r22
            r1 = 560086084(0x21623c44, float:7.665154E-19)
            r2 = r21
            androidx.compose.runtime.o r12 = r2.mo15009o(r1)
            r2 = r15 & 14
            if (r2 != 0) goto L_0x0020
            boolean r2 = r12.mo14976f(r0)
            if (r2 == 0) goto L_0x001d
            r2 = 4
            goto L_0x001e
        L_0x001d:
            r2 = 2
        L_0x001e:
            r2 = r2 | r15
            goto L_0x0021
        L_0x0020:
            r2 = r15
        L_0x0021:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0031
            boolean r3 = r12.mo14961b(r13)
            if (r3 == 0) goto L_0x002e
            r3 = 32
            goto L_0x0030
        L_0x002e:
            r3 = 16
        L_0x0030:
            r2 = r2 | r3
        L_0x0031:
            r3 = r15 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0041
            boolean r3 = r12.mo14927P(r14)
            if (r3 == 0) goto L_0x003e
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r2 = r2 | r3
        L_0x0041:
            r3 = r2 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0055
            boolean r3 = r12.mo15011p()
            if (r3 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            r12.mo14958a0()
            r17 = r12
            goto L_0x0230
        L_0x0055:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0061
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.product.presentation.ui.facet.facets.Footer (FacetStateful.kt:240)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r2, r3, r4)
        L_0x0061:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r3, r4, r5)
            r7 = 100
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10115o(r6, r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r7 = r7.mo7625f()
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r12.mo14918M(r8)
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r9 = r8.mo17073w()
            r10 = 6
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.RowKt.m10071d(r7, r9, r12, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r9)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r12.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r12.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r12.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r3 = r17.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r4 = r12.mo15017r()
            boolean r4 = r4 instanceof androidx.compose.runtime.C8428d
            if (r4 != 0) goto L_0x00c5
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00c5:
            r12.mo14938T()
            boolean r4 = r12.mo14997l()
            if (r4 == 0) goto L_0x00d2
            r12.mo14947W(r3)
            goto L_0x00d5
        L_0x00d2:
            r12.mo14888A()
        L_0x00d5:
            r12.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r4 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r7, r4)
            kotlin.jvm.functions.p r4 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r11, r4)
            kotlin.jvm.functions.p r4 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r9, r4)
            kotlin.jvm.functions.p r4 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r3, r10, r4)
            r12.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r4 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.invoke(r3, r12, r7)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r3)
            androidx.compose.foundation.layout.RowScopeInstance r6 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r6 = 0
            r7 = 1
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r6, r7, r5)
            com.carrefour.fid.android.design.theme.a r9 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r9 = r9.mo114200w()
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10026m(r1, r6, r9, r7, r5)
            r6 = 3
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10096L(r1, r5, r4, r6, r5)
            androidx.compose.ui.c r5 = r8.mo17066i()
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r12.mo14918M(r6)
            r6 = 6
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.BoxKt.m9849k(r5, r4, r12, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r12.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r12.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r12.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r17.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r10 = r12.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x016e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x016e:
            r12.mo14938T()
            boolean r10 = r12.mo14997l()
            if (r10 == 0) goto L_0x017b
            r12.mo14947W(r9)
            goto L_0x017e
        L_0x017b:
            r12.mo14888A()
        L_0x017e:
            r12.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r10 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r10)
            kotlin.jvm.functions.p r5 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r12.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1.invoke(r5, r12, r6)
            r12.mo14918M(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r1 = com.carrefour.fid.android.product.C27609f.C27625p.filter_validate_button
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r3[r4] = r5
            int r4 = r2 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 512(0x200, float:7.175E-43)
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71856b(r1, r0, r3, r12, r4)
            r1 = 0
            r3 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r3)
            boolean r3 = r12.mo15006n0(r14)
            java.lang.Object r4 = r12.mo14921N()
            if (r3 != 0) goto L_0x01e6
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x01ee
        L_0x01e6:
            com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$Footer$1$1$1$1 r4 = new com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$Footer$1$1$1$1
            r4.<init>(r14)
            r12.mo14893C(r4)
        L_0x01ee:
            r12.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r2 = r2 << 9
            r10 = 57344(0xe000, float:8.0356E-41)
            r11 = r2 & r10
            r16 = 461(0x1cd, float:6.46E-43)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r19
            r10 = r12
            r17 = r12
            r12 = r16
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151339f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r17.mo15002m0()
            r17.mo14896D()
            r17.mo15002m0()
            r17.mo15002m0()
            r17.mo15002m0()
            r17.mo14896D()
            r17.mo15002m0()
            r17.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0230
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0230:
            androidx.compose.runtime.t1 r1 = r17.mo15020s()
            if (r1 != 0) goto L_0x0237
            goto L_0x023f
        L_0x0237:
            com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$Footer$2 r2 = new com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$Footer$2
            r2.<init>(r0, r13, r14, r15)
            r1.mo15202a(r2)
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.facet.facets.FacetStatefulKt.m117377e(int, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117378f(androidx.compose.foundation.layout.C2366i0 r18, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C27998a, kotlin.C11079d2> r19, androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r13 = r18
            r14 = r19
            r15 = r21
            r0 = -1410241123(0xffffffffabf16d9d, float:-1.7154504E-12)
            r1 = r20
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r15 & 14
            if (r1 != 0) goto L_0x001e
            boolean r1 = r12.mo15006n0(r13)
            if (r1 == 0) goto L_0x001b
            r1 = 4
            goto L_0x001c
        L_0x001b:
            r1 = 2
        L_0x001c:
            r1 = r1 | r15
            goto L_0x001f
        L_0x001e:
            r1 = r15
        L_0x001f:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x002f
            boolean r2 = r12.mo14927P(r14)
            if (r2 == 0) goto L_0x002c
            r2 = 32
            goto L_0x002e
        L_0x002c:
            r2 = 16
        L_0x002e:
            r1 = r1 | r2
        L_0x002f:
            r2 = r1 & 91
            r3 = 18
            if (r2 != r3) goto L_0x0042
            boolean r2 = r12.mo15011p()
            if (r2 != 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            r12.mo14958a0()
            r17 = r12
            goto L_0x00a2
        L_0x0042:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x004e
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.product.presentation.ui.facet.facets.LoadingScreen (FacetStateful.kt:353)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x004e:
            androidx.compose.foundation.lazy.grid.c$a r0 = new androidx.compose.foundation.lazy.grid.c$a
            r2 = 160(0xa0, float:2.24E-43)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r3 = 0
            r0.<init>(r2, r3)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r9)
            boolean r9 = r12.mo15006n0(r14)
            java.lang.Object r10 = r12.mo14921N()
            if (r9 != 0) goto L_0x0079
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x0081
        L_0x0079:
            com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$LoadingScreen$1$1 r10 = new com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$LoadingScreen$1$1
            r10.<init>(r14, r1)
            r12.mo14893C(r10)
        L_0x0081:
            r12.mo15002m0()
            r9 = r10
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            int r1 = r1 << 9
            r11 = r1 & 7168(0x1c00, float:1.0045E-41)
            r16 = 502(0x1f6, float:7.03E-43)
            r1 = r2
            r2 = r3
            r3 = r18
            r10 = r12
            r17 = r12
            r12 = r16
            androidx.compose.foundation.lazy.grid.LazyGridDslKt.m10975b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00a2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00a2:
            androidx.compose.runtime.t1 r0 = r17.mo15020s()
            if (r0 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$LoadingScreen$2 r1 = new com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$LoadingScreen$2
            r1.<init>(r13, r14, r15)
            r0.mo15202a(r1)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.facet.facets.FacetStatefulKt.m117378f(androidx.compose.foundation.layout.i0, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m117379g(@C0324b1 int i, C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(-1062083981);
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
                ComposerKt.m29845w0(-1062083981, i3, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.SectionTitle (FacetStateful.kt:265)");
            }
            C8767m n = SizeKt.m10114n(PaddingKt.m10024k(C8767m.f23478j, C37474a.f94133a.mo114175A()), 0.0f, 1, (Object) null);
            oVar2 = o;
            TextKt.m14196c(StringKt.m118917Z(C16018i.m71858d(i5, o, i3 & 14)), n, C37475b.f94185a.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47672f()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153889a(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), oVar2, 0, 0, 65016);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$SectionTitle$1(i5, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m117380h(Facet facet, C2366i0 i0Var, C11300l<? super C27998a, C11079d2> lVar, C8592o oVar, int i) {
        Facet facet2 = facet;
        C11300l<? super C27998a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(551378927);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(551378927, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.SortAndFilterList (FacetStateful.kt:186)");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : facet.mo118343h()) {
            if (next instanceof Filter.CheckboxFilter) {
                arrayList.add(next);
            }
        }
        lVar2.invoke(new C27998a.C28004f.C28005a(C38334f.f97097l, arrayList.size()));
        LazyGridDslKt.m10975b(new C2485c.C2486a(C16483g.m74435M((float) 160), (DefaultConstructorMarker) null), (C8767m) null, (LazyGridState) null, i0Var, false, (Arrangement.C2279l) null, (Arrangement.C2269d) null, (C2195g) null, false, new FacetStatefulKt$SortAndFilterList$1(facet2, arrayList, lVar2, i2), o, (i2 << 6) & 7168, 502);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$SortAndFilterList$2(facet2, i0Var, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m117381i(Sort sort, boolean z, C11300l<? super C27998a, C11079d2> lVar, C8592o oVar, int i) {
        C2223i iVar;
        Sort sort2 = sort;
        boolean z2 = z;
        C11300l<? super C27998a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(1749828891);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1749828891, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.SortItem (FacetStateful.kt:278)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C37474a aVar2 = C37474a.f94133a;
        C8767m e = ClickableKt.m8878e(SizeKt.m10115o(C37019o.m151909b(PaddingKt.m10024k(aVar, aVar2.mo114176B()), z2, (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 80)), false, (String) null, (C16031g) null, new FacetStatefulKt$SortItem$1(lVar2, sort2), 7, (Object) null);
        C37475b bVar = C37475b.f94185a;
        long a0 = bVar.mo114231a0();
        if (sort.isSelected()) {
            iVar = C2250j.m9695a(aVar2.mo114178a(), bVar.mo114218O());
        } else {
            iVar = null;
        }
        C8592o oVar2 = o;
        C7873k.m25025b(e, (C15218g4) null, a0, 0, iVar, 0.0f, C8553b.m31048b(o, -806998658, true, new FacetStatefulKt$SortItem$2(sort2)), o, 1572864, 42);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetStatefulKt$SortItem$3(sort2, z2, lVar2, i2));
        }
    }
}
