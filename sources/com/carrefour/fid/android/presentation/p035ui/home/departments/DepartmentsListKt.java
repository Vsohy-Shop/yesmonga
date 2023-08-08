package com.carrefour.fid.android.presentation.p035ui.home.departments;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.category.C37993b;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDepartmentsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentsList.kt\ncom/carrefour/fid/android/presentation/ui/home/departments/DepartmentsListKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,280:1\n67#2,3:281\n66#2:284\n460#2,13:310\n460#2,13:342\n460#2,13:375\n473#2,3:389\n460#2,13:413\n36#2:427\n473#2,3:435\n473#2,3:440\n473#2,3:445\n460#2,13:470\n473#2,3:484\n36#2:490\n460#2,13:516\n473#2,3:534\n460#2,13:559\n473#2,3:576\n1114#3,6:285\n1114#3,6:428\n1114#3,6:491\n74#4,6:291\n80#4:323\n74#4,6:356\n80#4:388\n84#4:393\n74#4,6:394\n80#4:426\n84#4:439\n84#4:449\n74#4,6:497\n80#4:529\n84#4:538\n74#4,6:540\n80#4:572\n84#4:580\n75#5:297\n76#5,11:299\n75#5:329\n76#5,11:331\n75#5:362\n76#5,11:364\n89#5:392\n75#5:400\n76#5,11:402\n89#5:438\n89#5:443\n89#5:448\n75#5:457\n76#5,11:459\n89#5:487\n75#5:503\n76#5,11:505\n89#5:537\n75#5:546\n76#5,11:548\n89#5:579\n76#6:298\n76#6:330\n76#6:363\n76#6:401\n76#6:458\n76#6:504\n76#6:547\n76#7,5:324\n81#7:355\n85#7:444\n75#7,6:451\n81#7:483\n85#7:488\n154#8:434\n154#8:450\n154#8:489\n154#8:530\n154#8:531\n154#8:532\n154#8:533\n154#8:539\n154#8:573\n154#8:574\n154#8:575\n*S KotlinDebug\n*F\n+ 1 DepartmentsList.kt\ncom/carrefour/fid/android/presentation/ui/home/departments/DepartmentsListKt\n*L\n75#1:281,3\n75#1:284\n90#1:310,13\n96#1:342,13\n100#1:375,13\n100#1:389,3\n112#1:413,13\n119#1:427\n112#1:435,3\n96#1:440,3\n90#1:445,3\n142#1:470,13\n142#1:484,3\n183#1:490\n180#1:516,13\n180#1:534,3\n213#1:559,13\n213#1:576,3\n75#1:285,6\n119#1:428,6\n183#1:491,6\n90#1:291,6\n90#1:323\n100#1:356,6\n100#1:388\n100#1:393\n112#1:394,6\n112#1:426\n112#1:439\n90#1:449\n180#1:497,6\n180#1:529\n180#1:538\n213#1:540,6\n213#1:572\n213#1:580\n90#1:297\n90#1:299,11\n96#1:329\n96#1:331,11\n100#1:362\n100#1:364,11\n100#1:392\n112#1:400\n112#1:402,11\n112#1:438\n96#1:443\n90#1:448\n142#1:457\n142#1:459,11\n142#1:487\n180#1:503\n180#1:505,11\n180#1:537\n213#1:546\n213#1:548,11\n213#1:579\n90#1:298\n96#1:330\n100#1:363\n112#1:401\n142#1:458\n180#1:504\n213#1:547\n96#1:324,5\n96#1:355\n96#1:444\n142#1:451,6\n142#1:483\n142#1:488\n122#1:434\n144#1:450\n182#1:489\n190#1:530\n192#1:531\n195#1:532\n198#1:533\n210#1:539\n223#1:573\n225#1:574\n228#1:575\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt */
public final class DepartmentsListKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106267a(ProductCategory productCategory, C11300l<? super C24137a, C11079d2> lVar, C8592o oVar, int i) {
        ProductCategory productCategory2 = productCategory;
        C11300l<? super C24137a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-655948543);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-655948543, i2, -1, "com.carrefour.fid.android.presentation.ui.home.departments.Department (DepartmentsList.kt:208)");
        }
        float M = C16483g.m74435M((float) 75);
        long a = C16009b.m71825a(R.color.ds_grey_60, o, 0);
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m e = ClickableKt.m8878e(SizeKt.m10092H(aVar, M), false, (String) null, (C16031g) null, new DepartmentsListKt$Department$1(lVar2, productCategory2), 7, (Object) null);
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(e);
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
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        o.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        C8592o oVar2 = o;
        C35325c.m145647d(productCategory.mo117295o(), PaddingKt.m10024k(SizeKt.m10087C(BorderKt.m8850f(aVar, C2250j.m9695a(C16483g.m74435M((float) 1), a), C2694o.m12169k()), M), C16483g.m74435M((float) 15)), (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, (Object) null, (Object) null, R.drawable.ds_ic_calendar, oVar2, 0, 0, 16380);
        C8767m.C8768a aVar2 = aVar;
        C8592o oVar3 = oVar2;
        C2428y0.m10726a(SizeKt.m10115o(aVar2, C16483g.m74435M((float) 5)), oVar3, 6);
        String q = productCategory.mo117297q();
        C8767m n = SizeKt.m10114n(aVar2, 0.0f, 1, (Object) null);
        long m = C16506u.m74712m(12);
        int a3 = C16432i.f40718b.mo47667a();
        C8592o oVar4 = oVar3;
        TextKt.m14196c(q, n, 0, m, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a3), 0, C16449r.f40760b.mo47727c(), false, 2, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar4, 3120, 3120, 120308);
        oVar4.mo15002m0();
        oVar4.mo14896D();
        oVar4.mo15002m0();
        oVar4.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar4.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentsListKt$Department$3(productCategory2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106268b(LazyListState lazyListState, List<ProductCategory> list, C11300l<? super C24137a, C11079d2> lVar, C8592o oVar, int i) {
        List<ProductCategory> list2 = list;
        C11300l<? super C24137a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-162672687);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-162672687, i2, -1, "com.carrefour.fid.android.presentation.ui.home.departments.DepartmentList (DepartmentsList.kt:136)");
        }
        C8767m a = C8744d.m32514a(C8767m.f23478j, C2694o.m12166h(C16483g.m74435M((float) 5)));
        C37474a aVar = C37474a.f94133a;
        C8767m d = BackgroundKt.m8825d(PaddingKt.m10028o(a, 0.0f, 0.0f, 0.0f, aVar.mo114175A(), 7, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
        o.mo14918M(693286680);
        Arrangement arrangement = Arrangement.f6010a;
        C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(d);
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
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, d2, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        o.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        C8592o oVar2 = o;
        LazyDslKt.m10739d((C8767m) null, lazyListState, (C2366i0) null, false, arrangement.mo7638z(aVar.mo114202y()), (C8734c.C8737c) null, (C2195g) null, false, new DepartmentsListKt$DepartmentList$1$1(list2, lVar2, i2), o, (i2 << 3) & 112, 237);
        oVar2.mo15002m0();
        oVar2.mo14896D();
        oVar2.mo15002m0();
        oVar2.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentsListKt$DepartmentList$2(lazyListState, list2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m106269c(@C12579k HomePageViewModel homePageViewModel, @C12579k C11300l<? super ProductCategory, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i) {
        C11300l<? super ProductCategory, C11079d2> lVar2 = lVar;
        C11289a<C11079d2> aVar3 = aVar;
        C11289a<C11079d2> aVar4 = aVar2;
        Intrinsics.checkNotNullParameter(homePageViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lVar2, "onDepartmentClick");
        Intrinsics.checkNotNullParameter(aVar3, "onViewAllClick");
        Intrinsics.checkNotNullParameter(aVar4, "onPromoClick");
        C8592o o = oVar.mo15009o(2114428428);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2114428428, i, -1, "com.carrefour.fid.android.presentation.ui.home.departments.DepartmentListStateful (DepartmentsList.kt:58)");
        } else {
            int i2 = i;
        }
        C8578k2 a = C8415c2.m30232a(homePageViewModel.getUiState(), new C26406a.C26449c((C26406a.C26449c.C26476i) null, (StoreServiceType) null, false, (C26406a.C26449c.C26456c) null, (List) null, (List) null, (List) null, (C26406a.C26449c.C26469g) null, (C26406a.C26449c.C26472h) null, (C26406a.C26449c.C26460d) null, (C26406a.C26449c.C26453b) null, (C26406a.C26449c.C26466f) null, (C26406a.C26449c.C26463e) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null), (CoroutineContext) null, o, 72, 2);
        if (((C26406a.C26449c) a.getValue()).mo76960K() == null) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new DepartmentsListKt$DepartmentListStateful$1(homePageViewModel, lVar, aVar, aVar2, i));
                return;
            }
            return;
        }
        List<ProductCategory> C = ((C26406a.C26449c) a.getValue()).mo76952C();
        if (C.isEmpty()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s2 = o.mo15020s();
            if (s2 != null) {
                s2.mo15202a(new DepartmentsListKt$DepartmentListStateful$2(homePageViewModel, lVar, aVar, aVar2, i));
                return;
            }
            return;
        }
        LazyListState a2 = LazyListStateKt.m10895a(0, 0, o, 0, 3);
        o.mo14918M(1618982084);
        boolean n0 = o.mo15006n0(lVar2) | o.mo15006n0(aVar4) | o.mo15006n0(aVar3);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new DepartmentsListKt$DepartmentListStateful$3$1(lVar2, aVar4, aVar3);
            o.mo14893C(N);
        }
        o.mo15002m0();
        m106270d(a2, C, (C11300l) N, o, 64);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s3 = o.mo15020s();
        if (s3 != null) {
            s3.mo15202a(new DepartmentsListKt$DepartmentListStateful$4(homePageViewModel, lVar, aVar, aVar2, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106270d(androidx.compose.foundation.lazy.LazyListState r35, java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory> r36, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.departments.C24137a, kotlin.C11079d2> r37, androidx.compose.runtime.C8592o r38, int r39) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r39
            r4 = 737511741(0x2bf5893d, float:1.7446388E-12)
            r5 = r38
            androidx.compose.runtime.o r14 = r5.mo15009o(r4)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x001d
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsAndSeeAll (DepartmentsList.kt:84)"
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r3, r5, r6)
        L_0x001d:
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            r15 = 0
            r6 = 1
            r13 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r15, r6, r13)
            androidx.compose.ui.graphics.j2$a r5 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r8 = r5.mo42852w()
            r10 = 0
            r11 = 2
            r12 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            com.carrefour.fid.android.design.theme.a r30 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r7 = r30.mo114175A()
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10026m(r5, r15, r7, r6, r13)
            r12 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r12)
            androidx.compose.foundation.layout.Arrangement r31 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r7 = r31.mo7631r()
            androidx.compose.ui.c$a r32 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r32.mo17072u()
            r11 = 0
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.ColumnKt.m9863b(r7, r8, r14, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r10)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r14.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r14.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r33 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r33.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r6 = r14.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x008d
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x008d:
            r14.mo14938T()
            boolean r6 = r14.mo14997l()
            if (r6 == 0) goto L_0x009a
            r14.mo14947W(r10)
            goto L_0x009d
        L_0x009a:
            r14.mo14888A()
        L_0x009d:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r10 = r33.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r7, r10)
            kotlin.jvm.functions.p r7 = r33.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r8, r7)
            kotlin.jvm.functions.p r7 = r33.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r9, r7)
            kotlin.jvm.functions.p r7 = r33.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r7)
            r14.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r5.invoke(r6, r14, r7)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r6)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r5 = 1
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r15, r5, r13)
            androidx.compose.foundation.layout.Arrangement$e r5 = r31.mo7628l()
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r8)
            androidx.compose.ui.c$c r8 = r32.mo17073w()
            r9 = 6
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r8, r14, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r14.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r14.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r12 = r33.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r13 = r14.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x0129
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0129:
            r14.mo14938T()
            boolean r13 = r14.mo14997l()
            if (r13 == 0) goto L_0x0136
            r14.mo14947W(r12)
            goto L_0x0139
        L_0x0136:
            r14.mo14888A()
        L_0x0139:
            r14.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r13 = r33.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r5, r13)
            kotlin.jvm.functions.p r5 = r33.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r5)
            kotlin.jvm.functions.p r5 = r33.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r5)
            kotlin.jvm.functions.p r5 = r33.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r5)
            r14.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7.invoke(r5, r14, r8)
            r14.mo14918M(r6)
            androidx.compose.foundation.layout.RowScopeInstance r13 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.c$c r5 = r32.mo17070q()
            androidx.compose.ui.m r5 = r13.mo7845f(r4, r5)
            r12 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r12)
            androidx.compose.foundation.layout.Arrangement$l r7 = r31.mo7631r()
            androidx.compose.ui.c$b r8 = r32.mo17072u()
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.ColumnKt.m9863b(r7, r8, r14, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r10)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r14.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r14.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r12 = r33.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r15 = r14.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x01c4
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c4:
            r14.mo14938T()
            boolean r15 = r14.mo14997l()
            if (r15 == 0) goto L_0x01d1
            r14.mo14947W(r12)
            goto L_0x01d4
        L_0x01d1:
            r14.mo14888A()
        L_0x01d4:
            r14.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r15 = r33.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r15)
            kotlin.jvm.functions.p r7 = r33.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r7)
            kotlin.jvm.functions.p r7 = r33.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r7)
            kotlin.jvm.functions.p r7 = r33.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r7)
            r14.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r5.invoke(r7, r14, r8)
            r14.mo14918M(r6)
            r5 = 2131952854(0x7f1304d6, float:1.9542163E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r14, r11)
            float r8 = r30.mo114202y()
            r9 = 0
            r10 = 0
            r12 = 0
            r15 = 14
            r20 = 0
            r7 = r4
            r11 = r12
            r12 = r15
            r38 = r13
            r15 = 0
            r13 = r20
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            float r8 = r30.mo114175A()
            r9 = 1
            r13 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10026m(r7, r13, r8, r9, r15)
            r12 = r6
            r6 = r7
            r7 = 2131099826(0x7f0600b2, float:1.7812016E38)
            r11 = 0
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r7, r14, r11)
            r9 = 0
            r16 = 0
            r11 = r16
            r12 = r16
            r17 = r13
            r13 = r16
            r18 = 0
            r10 = r38
            r9 = r14
            r14 = r18
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            int r11 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r25 = r10.mo11077c(r9, r11)
            androidx.compose.ui.text.p0 r25 = r25.mo11097j()
            r27 = 0
            r28 = 0
            r29 = 65528(0xfff8, float:9.1824E-41)
            r26 = r9
            r0 = r38
            r34 = r9
            r1 = r10
            r3 = r11
            r9 = 0
            r11 = 0
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r34.mo15002m0()
            r34.mo14896D()
            r34.mo15002m0()
            r34.mo15002m0()
            androidx.compose.ui.c$c r5 = r32.mo17070q()
            androidx.compose.ui.m r0 = r0.mo7845f(r4, r5)
            r5 = r34
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r5.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement$l r6 = r31.mo7631r()
            androidx.compose.ui.c$b r7 = r32.mo17072u()
            r8 = 0
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r7, r5, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r5.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r5.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r5.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r11 = r33.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r12 = r5.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x02de
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02de:
            r5.mo14938T()
            boolean r12 = r5.mo14997l()
            if (r12 == 0) goto L_0x02eb
            r5.mo14947W(r11)
            goto L_0x02ee
        L_0x02eb:
            r5.mo14888A()
        L_0x02ee:
            r5.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r5)
            kotlin.jvm.functions.p r12 = r33.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r12)
            kotlin.jvm.functions.p r6 = r33.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r6)
            kotlin.jvm.functions.p r6 = r33.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r6)
            kotlin.jvm.functions.p r6 = r33.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r6)
            r5.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r5)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0.invoke(r6, r5, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.mo14918M(r0)
            r0 = 2131952644(0x7f130404, float:1.9541737E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r5, r8)
            float r6 = r30.mo114175A()
            r7 = 2
            r9 = 0
            r10 = 0
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.PaddingKt.m10026m(r4, r6, r10, r7, r9)
            r12 = 0
            r13 = 0
            r14 = 0
            r4 = 1157296644(0x44faf204, float:2007.563)
            r5.mo14918M(r4)
            boolean r4 = r5.mo15006n0(r2)
            java.lang.Object r6 = r5.mo14921N()
            if (r4 != 0) goto L_0x0356
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r6 != r4) goto L_0x035e
        L_0x0356:
            com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentsAndSeeAll$1$1$2$1$1 r6 = new com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentsAndSeeAll$1$1$2$1$1
            r6.<init>(r2)
            r5.mo14893C(r6)
        L_0x035e:
            r5.mo15002m0()
            r15 = r6
            kotlin.jvm.functions.a r15 = (kotlin.jvm.functions.C11289a) r15
            r16 = 7
            r17 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.ClickableKt.m8878e(r11, r12, r13, r14, r15, r16, r17)
            r6 = 4
            float r6 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r6)
            r4 = 2131099840(0x7f0600c0, float:1.7812045E38)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r4, r5, r8)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.material.w1 r1 = r1.mo11077c(r5, r3)
            androidx.compose.ui.text.p0 r25 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r1)
            r27 = 0
            r28 = 0
            r29 = 65528(0xfff8, float:9.1824E-41)
            r1 = r5
            r5 = r0
            r26 = r1
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r0 = r39
            r3 = r0 & 14
            r3 = r3 | 64
            r4 = r0 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r35
            r5 = r36
            m106268b(r4, r5, r2, r1, r3)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x03e5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03e5:
            androidx.compose.runtime.t1 r1 = r1.mo15020s()
            if (r1 != 0) goto L_0x03ec
            goto L_0x03f4
        L_0x03ec:
            com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentsAndSeeAll$2 r3 = new com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentsAndSeeAll$2
            r3.<init>(r4, r5, r2, r0)
            r1.mo15202a(r3)
        L_0x03f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.departments.DepartmentsListKt.m106270d(androidx.compose.foundation.lazy.LazyListState, java.util.List, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m106271e(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(2007641954);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2007641954, i2, -1, "com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsPreview (DepartmentsList.kt:241)");
            }
            LazyListState a = LazyListStateKt.m10895a(0, 0, o, 0, 3);
            List i3 = C10976s.m41417i();
            ProductCategory productCategory = r5;
            String str = "";
            ProductCategory productCategory2 = new ProductCategory(C37993b.f95634a, "Promotions", 1, (String) null, str, CategoryType.RAYON, CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E(), C10975r0.m41401k(C11078d1.m42659a(1, "Promotions")));
            i3.add(productCategory);
            for (int i4 = 0; i4 < 15; i4++) {
                i3.add(new ProductCategory(String.valueOf(i4), "Rayon produits frais du traiteur", 1, (String) null, "https://picsum.photos/200", CategoryType.RAYON, CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E(), C10975r0.m41401k(C11078d1.m42659a(1, "Rayon produits frais du traiteur"))));
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 1884601189, true, new DepartmentsListKt$DepartmentsPreview$1(a, C10976s.m41409a(i3))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentsListKt$DepartmentsPreview$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m106272f(C11300l<? super C24137a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C24137a, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(-1784851871);
        if ((i4 & 14) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1784851871, i2, -1, "com.carrefour.fid.android.presentation.ui.home.departments.Promo (DepartmentsList.kt:176)");
            }
            long a = C16009b.m71825a(R.color.ds_grey_60, o, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 75;
            C8767m H = SizeKt.m10092H(aVar, C16483g.m74435M(f));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new DepartmentsListKt$Promo$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8767m e = ClickableKt.m8878e(H, false, (String) null, (C16031g) null, (C11289a) N, 7, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(e);
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_ic_promo, o, 0), (String) null, PaddingKt.m10024k(BackgroundKt.m8825d(C8744d.m32514a(SizeKt.m10087C(BorderKt.m8850f(aVar, C2250j.m9695a(C16483g.m74435M((float) 1), a), C2694o.m12169k()), C16483g.m74435M(f)), C2694o.m12169k()), C16009b.m71825a(R.color.ds_red_extra_light, o, 0), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 15)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 56, 120);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M((float) 5)), o, 6);
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.promotions, o, 0), SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0, C16506u.m74712m(12), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 3120, 0, 130548);
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
            s.mo15202a(new DepartmentsListKt$Promo$3(lVar2, i4));
        }
    }
}
