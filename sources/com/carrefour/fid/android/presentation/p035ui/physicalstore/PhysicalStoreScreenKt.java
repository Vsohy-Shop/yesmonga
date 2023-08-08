package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,452:1\n43#2,6:453\n45#3,3:459\n76#4:462\n76#4:463\n36#5:464\n36#5:471\n36#5:478\n1114#6,6:465\n1114#6,6:472\n1114#6,6:479\n76#7:485\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreScreenKt\n*L\n82#1:453,6\n82#1:459,3\n97#1:462\n178#1:463\n353#1:464\n362#1:471\n367#1:478\n353#1:465,6\n362#1:472,6\n367#1:479,6\n96#1:485\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt */
public final class PhysicalStoreScreenKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109458a(C8767m mVar, C27116c cVar, C11300l<? super C27101a, C11079d2> lVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(1630811681);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(cVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(lVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1630811681, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreContent (PhysicalStoreScreen.kt:344)");
            }
            if (Intrinsics.areEqual((Object) cVar, (Object) C27116c.C27117a.f65950a)) {
                o.mo14918M(-878341340);
                o.mo14918M(1157296644);
                boolean n0 = o.mo15006n0(lVar);
                Object N = o.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new PhysicalStoreScreenKt$PhysicalStoreContent$1$1(lVar);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                PhysicalStoreComponentKt.m109584c(mVar, (C11289a) N, o, i3 & 14, 0);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) cVar, (Object) C27116c.C27118b.f65952a)) {
                o.mo14918M(-878341115);
                PhysicalStoreComponentKt.m109586e(mVar, o, i3 & 14, 0);
                o.mo15002m0();
            } else if (cVar instanceof C27116c.C27119c) {
                o.mo14918M(-878341022);
                C37396r1 f = ((C27116c.C27119c) cVar).mo78848f();
                o.mo14918M(1157296644);
                boolean n02 = o.mo15006n0(lVar);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new PhysicalStoreScreenKt$PhysicalStoreContent$2$1(lVar);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                int i8 = (i3 & 14) | (C37396r1.f93965d << 3);
                PhysicalStoreComponentKt.m109582a(mVar, f, (C11289a) N2, o, i8, 0);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) cVar, (Object) C27116c.C27120d.f65957a)) {
                o.mo14918M(-878340732);
                o.mo14918M(1157296644);
                boolean n03 = o.mo15006n0(lVar);
                Object N3 = o.mo14921N();
                if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                    N3 = new PhysicalStoreScreenKt$PhysicalStoreContent$3$1(lVar);
                    o.mo14893C(N3);
                }
                o.mo15002m0();
                PhysicalStoreComponentKt.m109588g(mVar, (C11289a) N3, o, i3 & 14, 0);
                o.mo15002m0();
            } else {
                o.mo14918M(-878340516);
                o.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreScreenKt$PhysicalStoreContent$4(mVar2, cVar, lVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109459b(@C12580l C8767m mVar, @C12579k C27127e eVar, @C12579k C11300l<? super C27101a, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5;
        int i6;
        C27127e eVar2 = eVar;
        C11300l<? super C27101a, C11079d2> lVar2 = lVar;
        int i7 = i;
        Intrinsics.checkNotNullParameter(eVar2, "state");
        Intrinsics.checkNotNullParameter(lVar2, "actioner");
        C8592o o = oVar.mo15009o(1635951029);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i7 | 6;
            mVar2 = mVar;
        } else if ((i7 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            mVar2 = mVar;
            i3 = i7;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i7 & 112) == 0) {
            if (o.mo15006n0(eVar2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1635951029, i9, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreen (PhysicalStoreScreen.kt:197)");
            }
            PhysicalStoreScreenKt$PhysicalStoreScreen$1 physicalStoreScreenKt$PhysicalStoreScreen$1 = r0;
            C8592o oVar3 = o;
            PhysicalStoreScreenKt$PhysicalStoreScreen$1 physicalStoreScreenKt$PhysicalStoreScreen$12 = new PhysicalStoreScreenKt$PhysicalStoreScreen$1(eVar.mo78876e().mo78840i() instanceof C26501g.C26502a, aVar, eVar, lVar, i9);
            oVar2 = oVar3;
            ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar3, -767949257, true, physicalStoreScreenKt$PhysicalStoreScreen$1), oVar3, 0, 12582912, 131071);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar3 = aVar;
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreScreenKt$PhysicalStoreScreen$2(mVar3, eVar, lVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109460c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(173418210);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(173418210, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenPreview (PhysicalStoreScreen.kt:384)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 933588543, true, new PhysicalStoreScreenKt$PhysicalStoreScreenPreview$1(PhysicalStoreScreenKt$PhysicalStoreScreenPreview$actioner$1.f62380f)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreScreenKt$PhysicalStoreScreenPreview$2(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109461d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1052891120);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1052891120, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenSteadyPreview (PhysicalStoreScreen.kt:437)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 115565965, true, new PhysicalStoreScreenKt$PhysicalStoreScreenSteadyPreview$1(C25322xa7348eaf.f62381f)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreScreenKt$PhysicalStoreScreenSteadyPreview$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m109462e(@C12580l C8767m mVar, @C12579k String str, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5;
        String str2 = str;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(str2, "title");
        C8592o o = oVar.mo15009o(622438011);
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
            if (o.mo15006n0(str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(622438011, i9, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServiceSubTitle (PhysicalStoreScreen.kt:374)");
            }
            C8767m mVar3 = aVar;
            oVar2 = o;
            String str3 = str2;
            String str4 = str;
            TextKt.m14196c(str4, SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0, C16506u.m74712m(20), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11098k(), oVar2, ((i9 >> 3) & 14) | 3072, 0, 65524);
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
            s.mo15202a(new PhysicalStoreScreenKt$PhysicalStoreServiceSubTitle$1(mVar2, str, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109463f(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r31, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.tracking.physicalstore.C29018a r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Integer, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46, int r47) {
        /*
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r8 = r39
            r7 = r40
            r6 = r41
            r5 = r42
            r4 = r43
            r3 = r45
            r2 = r46
            r1 = r47
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onNavigateToFacilitiesSearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onNavigateToCatalogs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onOpenCatalogWebView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onNavigateToChallengeFidFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onNavigateToLoyaltyHome"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onNavigateToLoyaltyAmountHistoryFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onNavigateToLoyaltyCardFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onNavigationToCouponFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onOpenArsenalWebView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onArsenalError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onNavigateToInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -589849422(0xffffffffdcd79cb2, float:-4.85515266E17)
            r4 = r44
            androidx.compose.runtime.o r4 = r4.mo15009o(r0)
            r0 = r1 & 1
            if (r0 == 0) goto L_0x006a
            r16 = r3 | 2
            goto L_0x006c
        L_0x006a:
            r16 = r3
        L_0x006c:
            r17 = r1 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x0077
            r16 = r16 | 48
            goto L_0x0088
        L_0x0077:
            r17 = r3 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x0088
            boolean r17 = r4.mo15006n0(r9)
            if (r17 == 0) goto L_0x0084
            r17 = r18
            goto L_0x0086
        L_0x0084:
            r17 = r19
        L_0x0086:
            r16 = r16 | r17
        L_0x0088:
            r9 = r16
            r16 = r1 & 4
            r17 = 256(0x100, float:3.59E-43)
            r20 = 128(0x80, float:1.794E-43)
            if (r16 == 0) goto L_0x0097
            r9 = r9 | 384(0x180, float:5.38E-43)
            r44 = r0
            goto L_0x00a9
        L_0x0097:
            r44 = r0
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r4.mo14927P(r10)
            if (r0 == 0) goto L_0x00a6
            r0 = r17
            goto L_0x00a8
        L_0x00a6:
            r0 = r20
        L_0x00a8:
            r9 = r9 | r0
        L_0x00a9:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x00b0
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x00c0
        L_0x00b0:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r4.mo14927P(r11)
            if (r0 == 0) goto L_0x00bd
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x00bf
        L_0x00bd:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x00bf:
            r9 = r9 | r0
        L_0x00c0:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x00c7
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00d9
        L_0x00c7:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r4.mo14927P(r12)
            if (r0 == 0) goto L_0x00d6
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00d8
        L_0x00d6:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00d8:
            r9 = r9 | r0
        L_0x00d9:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00e1
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x00df:
            r9 = r9 | r0
            goto L_0x00f2
        L_0x00e1:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r4.mo14927P(r13)
            if (r0 == 0) goto L_0x00ef
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00df
        L_0x00ef:
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00df
        L_0x00f2:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00fa
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x00f8:
            r9 = r9 | r0
            goto L_0x010b
        L_0x00fa:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.mo14927P(r14)
            if (r0 == 0) goto L_0x0108
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f8
        L_0x0108:
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00f8
        L_0x010b:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0113
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0111:
            r9 = r9 | r0
            goto L_0x0124
        L_0x0113:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0124
            boolean r0 = r4.mo14927P(r15)
            if (r0 == 0) goto L_0x0121
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x0121:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0111
        L_0x0124:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012c
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x012a:
            r9 = r9 | r0
            goto L_0x013d
        L_0x012c:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x013d
            boolean r0 = r4.mo14927P(r8)
            if (r0 == 0) goto L_0x013a
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x013a:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x012a
        L_0x013d:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0145
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0143:
            r9 = r9 | r0
            goto L_0x0156
        L_0x0145:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0156
            boolean r0 = r4.mo14927P(r7)
            if (r0 == 0) goto L_0x0153
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0153:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0143
        L_0x0156:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x015d
            r0 = r2 | 6
            goto L_0x016d
        L_0x015d:
            r0 = r2 & 14
            if (r0 != 0) goto L_0x016c
            boolean r0 = r4.mo14927P(r6)
            if (r0 == 0) goto L_0x0169
            r0 = 4
            goto L_0x016a
        L_0x0169:
            r0 = 2
        L_0x016a:
            r0 = r0 | r2
            goto L_0x016d
        L_0x016c:
            r0 = r2
        L_0x016d:
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0174
            r0 = r0 | 48
            goto L_0x0183
        L_0x0174:
            r6 = r2 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0183
            boolean r6 = r4.mo14927P(r5)
            if (r6 == 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r18 = r19
        L_0x0181:
            r0 = r0 | r18
        L_0x0183:
            r6 = r1 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x018a
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x019c
        L_0x018a:
            r6 = r2 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x019c
            r6 = r43
            boolean r16 = r4.mo14927P(r6)
            if (r16 == 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r17 = r20
        L_0x0199:
            r0 = r0 | r17
            goto L_0x019e
        L_0x019c:
            r6 = r43
        L_0x019e:
            r1 = 1
            r5 = r44
            if (r5 != r1) goto L_0x01c4
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r9 & r16
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r1) goto L_0x01c4
            r0 = r0 & 731(0x2db, float:1.024E-42)
            r1 = 146(0x92, float:2.05E-43)
            if (r0 != r1) goto L_0x01c4
            boolean r0 = r4.mo15011p()
            if (r0 != 0) goto L_0x01ba
            goto L_0x01c4
        L_0x01ba:
            r4.mo14958a0()
            r1 = r31
            r8 = r32
            r7 = r4
            goto L_0x02cf
        L_0x01c4:
            r4.mo14930Q()
            r0 = r3 & 1
            r1 = 8
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r4.mo14977f0()
            if (r0 == 0) goto L_0x01d4
            goto L_0x01d8
        L_0x01d4:
            r4.mo14958a0()
            goto L_0x0218
        L_0x01d8:
            if (r5 == 0) goto L_0x0218
            r0 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r4.mo14918M(r0)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r0 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r0 = r0.mo57681a(r4, r1)
            if (r0 == 0) goto L_0x020c
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r0, r4, r1)
            r5 = 564614654(0x21a755fe, float:1.1339122E-18)
            r4.mo14918M(r5)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel> r16 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r0
            r20 = r4
            androidx.lifecycle.v0 r0 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r4.mo15002m0()
            r4.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r0
            r9 = r0
            goto L_0x021a
        L_0x020c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0218:
            r9 = r31
        L_0x021a:
            r4.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreStateful (PhysicalStoreScreen.kt:80)"
            r5 = -589849422(0xffffffffdcd79cb2, float:-4.85515266E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r3, r2, r0)
        L_0x022b:
            kotlinx.coroutines.flow.j r0 = r9.mo78804w0()
            r5 = 0
            r2 = 1
            androidx.compose.runtime.k2 r27 = androidx.compose.runtime.C8415c2.m30233b(r0, r5, r4, r1, r2)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r4.mo15032w(r0)
            android.content.Context r0 = (android.content.Context) r0
            androidx.appcompat.app.e r5 = com.carrefour.fid.android.utils.C22702d.m102799a(r0)
            com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$actioner$1 r28 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$actioner$1
            r0 = r28
            r1 = r32
            r2 = r43
            r3 = r9
            r6 = r4
            r4 = r33
            r10 = r5
            r5 = r36
            r31 = r6
            r6 = r37
            r7 = r38
            r8 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.e r1 = r9.getSideEffect()
            r2 = 0
            r3 = 0
            r5 = 8
            r6 = 6
            r4 = r31
            kotlinx.coroutines.flow.e r8 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$1 r7 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$1
            r16 = 0
            r0 = r7
            r1 = r8
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r35
            r6 = r34
            r11 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 72
            r7 = r31
            androidx.compose.runtime.EffectsKt.m29896h(r8, r11, r7, r0)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r7.mo15032w(r0)
            r16 = r0
            androidx.lifecycle.w r16 = (androidx.lifecycle.C19499w) r16
            com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$2 r0 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$2
            r0.<init>(r10)
            r18 = 0
            com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$3 r1 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$3
            r8 = r32
            r1.<init>(r8, r9)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 8
            r26 = 244(0xf4, float:3.42E-43)
            r17 = r0
            r19 = r1
            r24 = r7
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = m109464g(r27)
            r5 = 0
            r6 = 1
            r3 = r28
            r4 = r7
            m109459b(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02ce
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02ce:
            r1 = r9
        L_0x02cf:
            androidx.compose.runtime.t1 r11 = r7.mo15020s()
            if (r11 != 0) goto L_0x02d6
            goto L_0x0307
        L_0x02d6:
            com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$4 r10 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$4
            r0 = r10
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r15 = r10
            r10 = r40
            r14 = r11
            r11 = r41
            r12 = r42
            r13 = r43
            r29 = r14
            r14 = r45
            r30 = r15
            r15 = r46
            r16 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r29
            r1 = r30
            r0.mo15202a(r1)
        L_0x0307:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt.m109463f(com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel, com.carrefour.fid.android.tracking.physicalstore.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: g */
    public static final C27127e m109464g(C8578k2<C27127e> k2Var) {
        return k2Var.getValue();
    }
}
