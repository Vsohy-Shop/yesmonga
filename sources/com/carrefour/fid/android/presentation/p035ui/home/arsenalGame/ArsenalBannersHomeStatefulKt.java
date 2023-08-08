package com.carrefour.fid.android.presentation.p035ui.home.arsenalGame;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nArsenalBannersHomeStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArsenalBannersHomeStateful.kt\ncom/carrefour/fid/android/presentation/ui/home/arsenalGame/ArsenalBannersHomeStatefulKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,97:1\n36#2:98\n36#2:105\n460#2,13:131\n50#2:147\n49#2:148\n36#2:155\n473#2,3:163\n1114#3,6:99\n1114#3,6:106\n1114#3,6:149\n1114#3,6:156\n74#4,6:112\n80#4:144\n84#4:167\n75#5:118\n76#5,11:120\n89#5:166\n76#6:119\n1855#7:145\n1856#7:162\n154#8:146\n76#9:168\n76#9:169\n*S KotlinDebug\n*F\n+ 1 ArsenalBannersHomeStateful.kt\ncom/carrefour/fid/android/presentation/ui/home/arsenalGame/ArsenalBannersHomeStatefulKt\n*L\n32#1:98\n52#1:105\n71#1:131,13\n80#1:147\n80#1:148\n83#1:155\n71#1:163,3\n32#1:99,6\n52#1:106,6\n80#1:149,6\n83#1:156,6\n71#1:112,6\n71#1:144\n71#1:167\n71#1:118\n71#1:120,11\n71#1:166\n71#1:119\n76#1:145\n76#1:162\n79#1:146\n27#1:168\n47#1:169\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt */
public final class ArsenalBannersHomeStatefulKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106231a(androidx.compose.p004ui.C8767m r26, com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a r27, kotlin.jvm.functions.C11305q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.C11079d2> r28, androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r2 = r27
            r3 = r28
            r4 = r30
            r0 = -971680416(0xffffffffc6155560, float:-9557.344)
            r1 = r29
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r5 = r31 & 1
            if (r5 == 0) goto L_0x0019
            r6 = r4 | 6
            r7 = r6
            r6 = r26
            goto L_0x002d
        L_0x0019:
            r6 = r4 & 14
            if (r6 != 0) goto L_0x002a
            r6 = r26
            boolean r7 = r1.mo15006n0(r6)
            if (r7 == 0) goto L_0x0027
            r7 = 4
            goto L_0x0028
        L_0x0027:
            r7 = 2
        L_0x0028:
            r7 = r7 | r4
            goto L_0x002d
        L_0x002a:
            r6 = r26
            r7 = r4
        L_0x002d:
            r8 = r31 & 2
            r15 = 16
            if (r8 == 0) goto L_0x0036
            r7 = r7 | 48
            goto L_0x0045
        L_0x0036:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0045
            boolean r8 = r1.mo15006n0(r2)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0044
        L_0x0043:
            r8 = r15
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r31 & 4
            if (r8 == 0) goto L_0x004c
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004c:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005c
            boolean r8 = r1.mo14927P(r3)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r7 = r7 | r8
        L_0x005c:
            r8 = r7 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006e
            boolean r8 = r1.mo15011p()
            if (r8 != 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            r1.mo14958a0()
            goto L_0x020f
        L_0x006e:
            if (r5 == 0) goto L_0x0073
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = r5
        L_0x0073:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x007f
            r5 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHome (ArsenalBannersHomeStateful.kt:58)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r5, r8)
        L_0x007f:
            boolean r0 = r2 instanceof com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26482a
            if (r0 == 0) goto L_0x01fd
            r0 = 0
            r5 = 0
            r7 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r6, r0, r7, r5)
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r5.mo7631r()
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r7 = r7.mo17072u()
            r8 = 0
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r7, r1, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x00da
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00da:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x00e7
            r1.mo14947W(r12)
            goto L_0x00ea
        L_0x00e7:
            r1.mo14888A()
        L_0x00ea:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r5, r13)
            kotlin.jvm.functions.p r5 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r5)
            kotlin.jvm.functions.p r5 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r5)
            kotlin.jvm.functions.p r5 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r5)
            r1.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0.invoke(r5, r1, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 1717091624(0x6658bd28, float:2.5588012E23)
            r1.mo14918M(r0)
            r0 = r2
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$a r0 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26482a) r0
            java.util.List r0 = r0.mo77025d()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x013a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01eb
            java.lang.Object r5 = r0.next()
            com.carrefour.fid.android.domain.models.ArsenalGenericBanner r5 = (com.carrefour.fid.android.domain.models.ArsenalGenericBanner) r5
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            float r8 = (float) r15
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r12 = 0
            r13 = 2
            r14 = 0
            r8 = r9
            r9 = r12
            r12 = r13
            r13 = r14
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            r17 = 0
            r18 = 0
            r19 = 0
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r7)
            boolean r7 = r1.mo15006n0(r3)
            boolean r8 = r1.mo15006n0(r5)
            r7 = r7 | r8
            java.lang.Object r8 = r1.mo14921N()
            if (r7 != 0) goto L_0x0183
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r8 != r7) goto L_0x018b
        L_0x0183:
            com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$1$1 r8 = new com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$1$1
            r8.<init>(r3, r5)
            r1.mo14893C(r8)
        L_0x018b:
            r1.mo15002m0()
            r20 = r8
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r20 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r7)
            boolean r7 = r1.mo15006n0(r5)
            java.lang.Object r8 = r1.mo14921N()
            if (r7 != 0) goto L_0x01b5
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r8 != r7) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r5 = r8
            goto L_0x01be
        L_0x01b5:
            com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$2$1 r7 = new com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$2$1
            r7.<init>(r5)
            r1.mo14893C(r7)
            r5 = r7
        L_0x01be:
            r1.mo15002m0()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r24 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 2131231233(0x7f080201, float:1.8078541E38)
            r21 = 0
            r22 = 0
            r23 = 16380(0x3ffc, float:2.2953E-41)
            r25 = r6
            r6 = r20
            r20 = r1
            com.skydoves.landscapist.glide.C35325c.m145647d(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r15 = r24
            r6 = r25
            goto L_0x013a
        L_0x01eb:
            r25 = r6
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            goto L_0x0204
        L_0x01fd:
            r25 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.state.a$b r0 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a.C26483b.f64746a
            kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
        L_0x0204:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x020d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x020d:
            r6 = r25
        L_0x020f:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x0216
            goto L_0x0228
        L_0x0216:
            com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$2 r8 = new com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$2
            r0 = r8
            r1 = r6
            r2 = r27
            r3 = r28
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo15202a(r8)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.arsenalGame.ArsenalBannersHomeStatefulKt.m106231a(androidx.compose.ui.m, com.carrefour.fid.android.presentation.viewmodels.home.state.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106232b(@C12579k HomePageViewModel homePageViewModel, @C12579k C11305q<? super String, ? super String, ? super String, C11079d2> qVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(homePageViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(qVar, "OnArsenalBannerClicked");
        C8592o o = oVar.mo15009o(-551848127);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-551848127, i, -1, "com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBottomBannersHomeStateful (ArsenalBannersHomeStateful.kt:38)");
        }
        C8578k2<C26481a> b = C8415c2.m30233b(homePageViewModel.mo76796y1(), (CoroutineContext) null, o, 8, 1);
        C8767m.C8768a aVar = C8767m.f23478j;
        C26481a c = m106233c(b);
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(qVar);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C24116x6f953c6a(qVar);
            o.mo14893C(N);
        }
        o.mo15002m0();
        m106231a(aVar, c, (C11305q) N, o, 6, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ArsenalBannersHomeStatefulKt$ArsenalBottomBannersHomeStateful$2(homePageViewModel, qVar, i));
        }
    }

    /* renamed from: c */
    public static final C26481a m106233c(C8578k2<? extends C26481a> k2Var) {
        return (C26481a) k2Var.getValue();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106234d(@C12579k HomePageViewModel homePageViewModel, @C12579k C11305q<? super String, ? super String, ? super String, C11079d2> qVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(homePageViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(qVar, "OnArsenalBannerClicked");
        C8592o o = oVar.mo15009o(412534939);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(412534939, i, -1, "com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalTopBannersHomeStateful (ArsenalBannersHomeStateful.kt:18)");
        }
        C8578k2<C26481a> b = C8415c2.m30233b(homePageViewModel.mo76741L1(), (CoroutineContext) null, o, 8, 1);
        C8767m.C8768a aVar = C8767m.f23478j;
        C26481a e = m106235e(b);
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(qVar);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new ArsenalBannersHomeStatefulKt$ArsenalTopBannersHomeStateful$1$1(qVar);
            o.mo14893C(N);
        }
        o.mo15002m0();
        m106231a(aVar, e, (C11305q) N, o, 6, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ArsenalBannersHomeStatefulKt$ArsenalTopBannersHomeStateful$2(homePageViewModel, qVar, i));
        }
    }

    /* renamed from: e */
    public static final C26481a m106235e(C8578k2<? extends C26481a> k2Var) {
        return (C26481a) k2Var.getValue();
    }
}
