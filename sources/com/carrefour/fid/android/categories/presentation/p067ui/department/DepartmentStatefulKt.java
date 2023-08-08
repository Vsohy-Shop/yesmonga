package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.C8275r3;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.categories.databinding.C39738a;
import com.carrefour.fid.android.categories.domain.extensions.C39745a;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39769a;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.list.C37265e;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.category.C37993b;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nDepartmentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n43#2,6:341\n45#3,3:347\n76#4:350\n76#4:351\n154#5:352\n88#6:353\n1747#7,3:354\n766#7:357\n857#7,2:358\n1549#7:360\n1620#7,3:361\n1549#7:364\n1620#7,3:365\n1549#7:368\n1620#7,3:369\n*S KotlinDebug\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt\n*L\n68#1:341,6\n68#1:347,3\n78#1:350\n82#1:351\n186#1:352\n186#1:353\n263#1:354,3\n268#1:357\n268#1:358,2\n268#1:360\n268#1:361,3\n280#1:364\n280#1:365,3\n280#1:368\n280#1:369,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt */
public final class DepartmentStatefulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m162262d(C8275r3 r3Var, C11300l<? super C39769a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        boolean z;
        int i3;
        int i4;
        C8275r3 r3Var2 = r3Var;
        C11300l<? super C39769a, C11079d2> lVar2 = lVar;
        int i5 = i;
        C8592o o = oVar.mo15009o(-59146014);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(r3Var2)) {
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
                ComposerKt.m29845w0(-59146014, i6, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentHeader (DepartmentStateful.kt:178)");
            }
            float b = 1.0f - r3Var.getState().mo12411b();
            if (b == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            oVar2 = o;
            SurfaceKt.m13879b((C8767m) null, (C15218g4) null, 0, 0, (C2223i) null, C16483g.m74435M(C16483g.m74435M((float) 4) * r3Var.getState().mo12411b()), C8553b.m31048b(o, -562620378, true, new DepartmentStatefulKt$DepartmentHeader$1(r3Var, b, i6, z, lVar)), oVar2, 1572864, 31);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentStatefulKt$DepartmentHeader$2(r3Var2, lVar2, i5));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m162263e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1400095572);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1400095572, i, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentHeaderCollapsedPreview (DepartmentStateful.kt:328)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 251796247, true, new DepartmentStatefulKt$DepartmentHeaderCollapsedPreview$1(TopAppBarDefaults.f19955a.mo12404c(AppBarKt.m25403w(-1.0f, -1.0f, 0.0f, o, 54, 4), (C11289a<Boolean>) null, (C1968g<Float>) null, (C2013v<Float>) null, o, TopAppBarDefaults.f19956b << 12, 14))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentStatefulKt$DepartmentHeaderCollapsedPreview$2(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m162264f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1214142128);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1214142128, i, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentHeaderExpandedPreview (DepartmentStateful.kt:316)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, -208373107, true, new DepartmentStatefulKt$DepartmentHeaderExpandedPreview$1(TopAppBarDefaults.f19955a.mo12404c(AppBarKt.m25403w(0.0f, 0.0f, 0.0f, o, 0, 7), (C11289a<Boolean>) null, (C1968g<Float>) null, (C2013v<Float>) null, o, TopAppBarDefaults.f19956b << 12, 14))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentStatefulKt$DepartmentHeaderExpandedPreview$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m162265g(C11300l<? super C39769a, C11079d2> lVar, C11300l<? super C39738a, C11079d2> lVar2, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        C11300l<? super C39769a, C11079d2> lVar3 = lVar;
        C11300l<? super C39738a, C11079d2> lVar4 = lVar2;
        int i5 = i;
        C8592o o = oVar.mo15009o(-1409410924);
        if ((i5 & 14) == 0) {
            if (o.mo14927P(lVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(lVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1409410924, i6, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentScreen (DepartmentStateful.kt:135)");
            }
            C8275r3 c = TopAppBarDefaults.f19955a.mo12404c(AppBarKt.m25403w(0.0f, 0.0f, 0.0f, o, 0, 7), (C11289a<Boolean>) null, (C1968g<Float>) null, (C2013v<Float>) null, o, TopAppBarDefaults.f19956b << 12, 14);
            C8592o oVar3 = o;
            oVar2 = oVar3;
            ScaffoldKt.m13747a(SizeKt.m10112l(NestedScrollModifierKt.m68305b(C8767m.f23478j, c.mo11535a(), (NestedScrollDispatcher) null, 2, (Object) null), 0.0f, 1, (Object) null), (C3036d1) null, C8553b.m31048b(o, 974518447, true, new DepartmentStatefulKt$DepartmentScreen$1(c, lVar3, i6)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar3, -1262305002, true, new DepartmentStatefulKt$DepartmentScreen$2(lVar4, i6)), oVar3, C22132b.f56831b, 12582912, 131066);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DepartmentStatefulKt$DepartmentScreen$3(lVar3, lVar4, i5));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e7  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m162266h(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel r30, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.list.C37269i r31, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.list.C37269i r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.category.ProductCategory, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.category.ProductCategory, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r14 = r39
            r15 = r40
            java.lang.String r0 = "promoItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "couponItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onDepartmentWithChildrenClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onDepartmentWithoutChildrenClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onSearchIconClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onSearchBarClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onScanIconClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 534896215(0x1fe1de57, float:9.565904E-20)
            r1 = r38
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0045
            r2 = r14 | 2
            goto L_0x0046
        L_0x0045:
            r2 = r14
        L_0x0046:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x004d
            r2 = r2 | 48
            goto L_0x005d
        L_0x004d:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x005d
            boolean r3 = r6.mo15006n0(r7)
            if (r3 == 0) goto L_0x005a
            r3 = 32
            goto L_0x005c
        L_0x005a:
            r3 = 16
        L_0x005c:
            r2 = r2 | r3
        L_0x005d:
            r3 = r15 & 4
            if (r3 == 0) goto L_0x0064
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0064:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0074
            boolean r3 = r6.mo15006n0(r8)
            if (r3 == 0) goto L_0x0071
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0073:
            r2 = r2 | r3
        L_0x0074:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x007b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x007b:
            r3 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x008b
            boolean r3 = r6.mo14927P(r9)
            if (r3 == 0) goto L_0x0088
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x008a
        L_0x0088:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x008a:
            r2 = r2 | r3
        L_0x008b:
            r3 = r15 & 16
            if (r3 == 0) goto L_0x0092
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0092:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00a4
            boolean r3 = r6.mo14927P(r10)
            if (r3 == 0) goto L_0x00a1
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r2 = r2 | r3
        L_0x00a4:
            r3 = r15 & 32
            if (r3 == 0) goto L_0x00ac
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x00aa:
            r2 = r2 | r3
            goto L_0x00bd
        L_0x00ac:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r6.mo14927P(r11)
            if (r3 == 0) goto L_0x00ba
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00ba:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00aa
        L_0x00bd:
            r3 = r15 & 64
            if (r3 == 0) goto L_0x00c5
            r3 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c3:
            r2 = r2 | r3
            goto L_0x00d6
        L_0x00c5:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00d6
            boolean r3 = r6.mo14927P(r12)
            if (r3 == 0) goto L_0x00d3
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00d3:
            r3 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c3
        L_0x00d6:
            r3 = r15 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00de
            r3 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00dc:
            r2 = r2 | r3
            goto L_0x00ef
        L_0x00de:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00ef
            boolean r3 = r6.mo14927P(r13)
            if (r3 == 0) goto L_0x00ec
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00dc
        L_0x00ec:
            r3 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00dc
        L_0x00ef:
            r3 = 1
            if (r1 != r3) goto L_0x010a
            r4 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r4
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r4) goto L_0x010a
            boolean r2 = r6.mo15011p()
            if (r2 != 0) goto L_0x0102
            goto L_0x010a
        L_0x0102:
            r6.mo14958a0()
            r1 = r30
            r7 = r6
            goto L_0x01ec
        L_0x010a:
            r6.mo14930Q()
            r2 = r14 & 1
            r4 = 8
            if (r2 == 0) goto L_0x011e
            boolean r2 = r6.mo14977f0()
            if (r2 == 0) goto L_0x011a
            goto L_0x011e
        L_0x011a:
            r6.mo14958a0()
            goto L_0x015e
        L_0x011e:
            if (r1 == 0) goto L_0x015e
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r6.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r1 = r1.mo57681a(r6, r4)
            if (r1 == 0) goto L_0x0152
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r1, r6, r4)
            r2 = 564614654(0x21a755fe, float:1.1339122E-18)
            r6.mo14918M(r2)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel> r16 = com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r1
            r20 = r6
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r6.mo15002m0()
            r6.mo15002m0()
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel r1 = (com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel) r1
            r5 = r1
            goto L_0x0160
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x015e:
            r5 = r30
        L_0x0160:
            r6.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x016f
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStateful (DepartmentStateful.kt:66)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r1, r2)
        L_0x016f:
            kotlinx.coroutines.flow.u r0 = r5.mo131204j0()
            r1 = 0
            androidx.compose.runtime.k2 r27 = androidx.compose.runtime.C8415c2.m30233b(r0, r1, r6, r4, r3)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r6.mo15032w(r0)
            r28 = r0
            android.content.Context r28 = (android.content.Context) r28
            kotlin.jvm.internal.Ref$BooleanRef r29 = new kotlin.jvm.internal.Ref$BooleanRef
            r29.<init>()
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r6.mo15032w(r0)
            r16 = r0
            androidx.lifecycle.w r16 = (androidx.lifecycle.C19499w) r16
            r17 = 0
            r18 = 0
            com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$1 r0 = new com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$1
            r0.<init>(r5)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 8
            r26 = 246(0xf6, float:3.45E-43)
            r19 = r0
            r24 = r6
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$actioner$1 r4 = new com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$actioner$1
            r0 = r4
            r1 = r33
            r2 = r34
            r3 = r35
            r30 = r4
            r4 = r36
            r16 = r5
            r5 = r37
            r7 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$2 r6 = new com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$2
            r0 = r6
            r1 = r27
            r2 = r28
            r3 = r31
            r4 = r32
            r5 = r30
            r8 = r6
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r1 = r30
            m162265g(r1, r8, r7, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ea
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ea:
            r1 = r16
        L_0x01ec:
            androidx.compose.runtime.t1 r8 = r7.mo15020s()
            if (r8 != 0) goto L_0x01f3
            goto L_0x0210
        L_0x01f3:
            com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$3 r7 = new com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$3
            r0 = r7
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r11 = r7
            r7 = r36
            r12 = r8
            r8 = r37
            r9 = r39
            r10 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mo15202a(r11)
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.presentation.p067ui.department.DepartmentStatefulKt.m162266h(com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel, com.carrefour.fid.android.design.components.widgets.list.i, com.carrefour.fid.android.design.components.widgets.list.i, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: o */
    public static final void m162273o(C39738a aVar, Context context, C11300l<? super C39769a, C11079d2> lVar) {
        Drawable b = C0507a.m2346b(context, C39711b.C39719h.ic_rayons_pb);
        String string = context.getString(C39711b.C39729r.department_loading_error);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…department_loading_error)");
        MessageComponent.C37154a aVar2 = new MessageComponent.C37154a(b, string, (String) null, context.getString(C39711b.C39729r.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null);
        MessageComponent messageComponent = aVar.f101386b.f70263b;
        messageComponent.mo112895A(aVar2);
        messageComponent.mo112897C(new C39792k(lVar), new C39793l(), new C39794m());
    }

    /* renamed from: p */
    public static final void m162274p(C11300l lVar, View view) {
        Intrinsics.checkNotNullParameter(lVar, "$actioner");
        lVar.invoke(C39769a.C39772c.f101493a);
    }

    /* renamed from: q */
    public static final void m162275q(View view) {
    }

    /* renamed from: r */
    public static final void m162276r(View view) {
    }

    /* renamed from: s */
    public static final void m162277s(C39738a aVar, Context context, List<ProductCategory> list, boolean z, boolean z2, C37269i iVar, C37269i iVar2, C11300l<? super C39769a, C11079d2> lVar) {
        boolean z3;
        if (!list.isEmpty()) {
            List i = C10976s.m41417i();
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((ProductCategory) it.next()).mo117294n(), (Object) C37993b.f95634a)) {
                            z3 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                i.add(iVar);
            }
            if (z && z2) {
                i.add(iVar2);
            }
            Collection a = C10976s.m41409a(i);
            ArrayList<ProductCategory> arrayList = new ArrayList<>();
            for (Object next : iterable) {
                if (!Intrinsics.areEqual((Object) ((ProductCategory) next).mo117294n(), (Object) C37993b.f95634a)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (ProductCategory productCategory : arrayList) {
                arrayList2.add(C39791j.m162355a(C39745a.m162192b(productCategory), context, new DepartmentStatefulKt$setDepartmentList$newDepartmentList$2$1(productCategory, lVar)));
            }
            List y4 = CollectionsKt___CollectionsKt.m40718y4(a, arrayList2);
            Iterable<C37269i> list2 = aVar.f101387c.getList();
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(list2, 10));
            for (C37269i iVar3 : list2) {
                Intrinsics.checkNotNull(iVar3, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemIconUI");
                arrayList3.add((C37265e) iVar3);
            }
            Iterable<C37269i> iterable2 = y4;
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (C37269i iVar4 : iterable2) {
                Intrinsics.checkNotNull(iVar4, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemIconUI");
                arrayList4.add((C37265e) iVar4);
            }
            if (!Intrinsics.areEqual((Object) arrayList3, (Object) arrayList4)) {
                ListItemRecyclerView listItemRecyclerView = aVar.f101387c;
                listItemRecyclerView.setVisibility(0);
                listItemRecyclerView.setList(y4);
            }
        }
    }
}
