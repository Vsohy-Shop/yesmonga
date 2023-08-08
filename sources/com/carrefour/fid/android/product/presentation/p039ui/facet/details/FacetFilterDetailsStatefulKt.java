package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.C2485c;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material.C7873k;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.design.components.compose.ButtonColor;
import com.carrefour.fid.android.design.components.compose.ButtonComponentKt;
import com.carrefour.fid.android.design.components.compose.ButtonSize;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.performance.C38334f;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.details.C27965a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.C28160a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import com.carrefour.fid.android.shared.extension.FlowKt;
import com.carrefour.fid.android.shared.type.C28897f;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFacetFilterDetailsStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetFilterDetailsStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/details/FacetFilterDetailsStatefulKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,336:1\n800#2,11:337\n1#3:348\n25#4:349\n25#4:357\n36#4:365\n36#4:372\n460#4,13:396\n36#4:410\n473#4,3:417\n1114#5,6:350\n1114#5,6:358\n1114#5,6:366\n1114#5,6:373\n1114#5,6:411\n76#6:356\n76#6:364\n76#6:384\n154#7:379\n154#7:380\n79#8,2:381\n81#8:409\n85#8:421\n75#9:383\n76#9,11:385\n89#9:420\n*S KotlinDebug\n*F\n+ 1 FacetFilterDetailsStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/details/FacetFilterDetailsStatefulKt\n*L\n78#1:337,11\n80#1:349\n84#1:357\n158#1:365\n159#1:372\n278#1:396,13\n285#1:410\n278#1:417,3\n80#1:350,6\n84#1:358,6\n158#1:366,6\n159#1:373,6\n285#1:411,6\n82#1:356\n136#1:364\n278#1:384\n226#1:379\n249#1:380\n278#1:381,2\n278#1:409\n278#1:421\n278#1:383\n278#1:385,11\n278#1:420\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt */
public final class FacetFilterDetailsStatefulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117339a(C11300l<? super C27965a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o o = oVar.mo15009o(-653508723);
        if ((i & 14) == 0) {
            if (o.mo14927P(lVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-653508723, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.AllergoBoxBanner (FacetFilterDetailsStateful.kt:276)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, o, 54);
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
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new FacetFilterDetailsStatefulKt$AllergoBoxBanner$1$1$1(lVar);
                o.mo14893C(N);
            }
            o.mo15002m0();
            ButtonComponentKt.m151341h((C8767m) null, (C11289a) N, (ButtonSize) null, (ButtonColor) null, false, C16018i.m71858d(C27609f.C27627r.allergobox_link, o, 0), (Integer) null, false, o, 0, 221);
            C8592o oVar2 = o;
            ImageKt.m8967b(C16015f.m71849d(C27609f.C27617h.ic_logo_consotrust, o, 0), (String) null, (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar2, 56, 124);
            ImageKt.m8967b(C16015f.m71849d(C27609f.C27617h.ic_logo_allergobox, o, 0), (String) null, (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar2, 56, 124);
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
            s.mo15202a(new FacetFilterDetailsStatefulKt$AllergoBoxBanner$2(lVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117340b(com.carrefour.fid.android.domain.models.product.Facet r35, com.carrefour.fid.android.domain.models.product.Filter.CheckboxFilter r36, boolean r37, boolean r38, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.facet.details.C27965a, kotlin.C11079d2> r39, androidx.compose.runtime.C8592o r40, int r41) {
        /*
            r6 = r39
            r7 = r41
            r0 = 633709341(0x25c5a31d, float:3.4284582E-16)
            r1 = r40
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0019
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsScreen (FacetFilterDetailsStateful.kt:143)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r1, r2)
        L_0x0019:
            r0 = -87140158(0xffffffffface58c2, float:-5.357067E35)
            r15.mo14918M(r0)
            if (r37 == 0) goto L_0x008e
            int r0 = com.carrefour.fid.android.product.C27609f.C27627r.general_information
            r1 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r15, r1)
            int r0 = com.carrefour.fid.android.product.C27609f.C27627r.customer_dialog_text
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r15, r1)
            int r0 = com.carrefour.fid.android.product.C27609f.C27627r.general_see
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r15, r1)
            int r0 = com.carrefour.fid.android.product.C27609f.C27627r.general_cancel
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r15, r1)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r0)
            boolean r1 = r15.mo15006n0(r6)
            java.lang.Object r2 = r15.mo14921N()
            if (r1 != 0) goto L_0x0052
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x005a
        L_0x0052:
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$1$1 r2 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$1$1
            r2.<init>(r6)
            r15.mo14893C(r2)
        L_0x005a:
            r15.mo15002m0()
            r13 = r2
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            r15.mo14918M(r0)
            boolean r0 = r15.mo15006n0(r6)
            java.lang.Object r1 = r15.mo14921N()
            if (r0 != 0) goto L_0x0075
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x007d
        L_0x0075:
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$2$1 r1 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$2$1
            r1.<init>(r6)
            r15.mo14893C(r1)
        L_0x007d:
            r15.mo15002m0()
            r14 = r1
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            com.carrefour.fid.android.design.components.compose.f$b r0 = new com.carrefour.fid.android.design.components.compose.f$b
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            int r1 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r0, r15, r1)
        L_0x008e:
            r15.mo15002m0()
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 0
            r2 = 0
            r14 = 1
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.SizeKt.m10112l(r0, r1, r14, r2)
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r26 = r0.mo114208E()
            r9 = 0
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$3 r0 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$3
            r0.<init>(r6, r7)
            r1 = -1167007710(0xffffffffba70e022, float:-9.188672E-4)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r1, r14, r0)
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4 r11 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$4
            r0 = r11
            r1 = r35
            r2 = r36
            r3 = r39
            r4 = r41
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1122468707(0x42e78363, float:115.756615)
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r14, r11)
            r12 = 0
            r13 = 0
            r0 = 0
            r1 = r14
            r14 = r0
            r2 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r28 = 0
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$5 r0 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$5
            r3 = r36
            r0.<init>(r3, r6, r7)
            r4 = -340427429(0xffffffffebb57d5b, float:-4.388151E26)
            androidx.compose.runtime.internal.a r30 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r4, r1, r0)
            r32 = 3462(0xd86, float:4.851E-42)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            r34 = 98290(0x17ff2, float:1.37734E-40)
            r31 = r2
            androidx.compose.material.ScaffoldKt.m13747a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00fe
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00fe:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x0105
            goto L_0x011a
        L_0x0105:
            com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$6 r9 = new com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$6
            r0 = r9
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mo15202a(r9)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.facet.details.FacetFilterDetailsStatefulKt.m117340b(com.carrefour.fid.android.domain.models.product.Facet, com.carrefour.fid.android.domain.models.product.Filter$CheckboxFilter, boolean, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m117341c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(738551994);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(738551994, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsScreenPreview (FacetFilterDetailsStateful.kt:303)");
            }
            ThemeKt.m153788a(ComposableSingletons$FacetFilterDetailsStatefulKt.f67795a.mo81385a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetFilterDetailsStatefulKt$FacetFilterDetailsScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m117342d(@C12579k FacetViewModel facetViewModel, @C12579k C27950a aVar, @C12579k C38326b bVar, @C12579k String str, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11289a<C11079d2> aVar4, @C12579k C11289a<C11079d2> aVar5, @C12580l C8592o oVar, int i) {
        List<Filter> h;
        Object obj;
        FacetViewModel facetViewModel2 = facetViewModel;
        String str2 = str;
        Intrinsics.checkNotNullParameter(facetViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(bVar, "performance");
        Intrinsics.checkNotNullParameter(str2, "selectedFilter");
        Intrinsics.checkNotNullParameter(aVar2, "onBackClicked");
        Intrinsics.checkNotNullParameter(aVar3, "onSeeProductClicked");
        Intrinsics.checkNotNullParameter(aVar4, "onShowAllergenClicked");
        Intrinsics.checkNotNullParameter(aVar5, "displayErrorSnackbar");
        C8592o o = oVar.mo15009o(-809874527);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-809874527, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStateful (FacetFilterDetailsStateful.kt:66)");
        } else {
            int i2 = i;
        }
        C8578k2<C28160a> b = C8415c2.m30233b(facetViewModel.getState(), (CoroutineContext) null, o, 8, 1);
        Facet facet = (Facet) C28897f.m119478b(b.getValue().mo81901f());
        if (!(facet == null || (h = facet.mo118343h()) == null)) {
            ArrayList arrayList = new ArrayList();
            for (Object next : h) {
                if (next instanceof Filter.CheckboxFilter) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((Filter.CheckboxFilter) obj).mo118356Q3(), (Object) str2)) {
                    break;
                }
            }
            Filter.CheckboxFilter checkboxFilter = (Filter.CheckboxFilter) obj;
            if (checkboxFilter != null) {
                o.mo14918M(-492369756);
                Object N = o.mo14921N();
                C8592o.C8593a aVar6 = C8592o.f23032a;
                if (N == aVar6.mo16277a()) {
                    N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                C8700z0 z0Var = (C8700z0) N;
                C11907e<C28007b> b2 = FlowKt.m118809b(facetViewModel.getSideEffect(), ((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i())).getLifecycle(), (Lifecycle.State) null, o, 72, 4);
                o.mo14918M(-492369756);
                Object N2 = o.mo14921N();
                if (N2 == aVar6.mo16277a()) {
                    N2 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                C8700z0 z0Var2 = (C8700z0) N2;
                Facet facet2 = (Facet) C28897f.m119478b(b.getValue().mo81901f());
                if (facet2 == null) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                    }
                    C8678t1 s = o.mo15020s();
                    if (s != null) {
                        FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$1 facetFilterDetailsStatefulKt$FacetFilterDetailsStateful$1 = r0;
                        FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$1 facetFilterDetailsStatefulKt$FacetFilterDetailsStateful$12 = new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$1(facetViewModel, aVar, bVar, str, aVar2, aVar3, aVar4, aVar5, i);
                        s.mo15202a(facetFilterDetailsStatefulKt$FacetFilterDetailsStateful$1);
                        return;
                    }
                    return;
                }
                C11907e<C28007b> eVar = b2;
                m117340b(facet2, checkboxFilter, ((Boolean) z0Var.getValue()).booleanValue(), ((Boolean) z0Var2.getValue()).booleanValue(), new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$2(aVar2, facetViewModel, aVar3, z0Var, aVar4, bVar), o, 72);
                C8592o oVar2 = o;
                EffectsKt.m29896h(eVar, new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3(eVar, z0Var2, aVar5, aVar, b, (C11045c<? super FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$3>) null), oVar2, 72);
                EventLifecycleObserverKt.m119612a((C19499w) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$4(facetViewModel2), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$5(facetViewModel2), (C11289a<C11079d2>) null, oVar2, 8, 182);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                C8678t1 s2 = oVar2.mo15020s();
                if (s2 != null) {
                    s2.mo15202a(new FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$6(facetViewModel, aVar, bVar, str, aVar2, aVar3, aVar4, aVar5, i));
                    return;
                }
                return;
            }
        }
        C8592o oVar3 = o;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s3 = oVar3.mo15020s();
        if (s3 != null) {
            s3.mo15202a(new C27963x39e51856(facetViewModel, aVar, bVar, str, aVar2, aVar3, aVar4, aVar5, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m117343e(C8767m mVar, Filter.CheckboxFilter checkboxFilter, C11300l<? super C27965a, C11079d2> lVar, C8592o oVar, int i) {
        C8767m mVar2 = mVar;
        Filter.CheckboxFilter checkboxFilter2 = checkboxFilter;
        C11300l<? super C27965a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(331536998);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(331536998, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.FilterList (FacetFilterDetailsStateful.kt:210)");
        }
        lVar2.invoke(new C27965a.C27972g.C27973a(C38334f.f97096k, checkboxFilter.mo118368i().size()));
        LazyGridDslKt.m10975b(new C2485c.C2486a(C16483g.m74435M((float) 160), (DefaultConstructorMarker) null), SizeKt.m10114n(mVar2, 0.0f, 1, (Object) null), (LazyGridState) null, (C2366i0) null, false, (Arrangement.C2279l) null, (Arrangement.C2269d) null, (C2195g) null, false, new FacetFilterDetailsStatefulKt$FilterList$1(checkboxFilter2, lVar2, i2), o, 0, C16717v.C16724g.f42312p);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetFilterDetailsStatefulKt$FilterList$2(mVar2, checkboxFilter2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m117344f(Term term, String str, C11300l<? super C27965a, C11079d2> lVar, C8592o oVar, int i) {
        C2223i iVar;
        Term term2 = term;
        String str2 = str;
        C11300l<? super C27965a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(1549886684);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1549886684, i2, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.GridItem (FacetFilterDetailsStateful.kt:240)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C37474a aVar2 = C37474a.f94133a;
        C8767m e = ClickableKt.m8878e(SizeKt.m10115o(PaddingKt.m10024k(aVar, aVar2.mo114176B()), C16483g.m74435M((float) 80)), false, (String) null, (C16031g) null, new FacetFilterDetailsStatefulKt$GridItem$1(lVar2, str2, term2), 7, (Object) null);
        C37475b bVar = C37475b.f94185a;
        long a0 = bVar.mo114231a0();
        if (term.isSelected()) {
            iVar = C2250j.m9695a(aVar2.mo114178a(), bVar.mo114218O());
        } else {
            iVar = null;
        }
        C8592o oVar2 = o;
        C7873k.m25025b(e, (C15218g4) null, a0, 0, iVar, 0.0f, C8553b.m31048b(o, 859762393, true, new FacetFilterDetailsStatefulKt$GridItem$2(term2)), o, 1572864, 42);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetFilterDetailsStatefulKt$GridItem$3(term2, str2, lVar2, i2));
        }
    }
}
