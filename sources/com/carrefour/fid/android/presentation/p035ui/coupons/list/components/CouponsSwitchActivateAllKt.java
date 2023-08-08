package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nCouponsSwitchActivateAll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsSwitchActivateAll.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsSwitchActivateAllKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n75#2,6:69\n81#2:101\n85#2:114\n75#3:75\n76#3,11:77\n89#3:113\n76#4:76\n460#5,13:88\n36#5:103\n473#5,3:110\n154#6:102\n1114#7,6:104\n*S KotlinDebug\n*F\n+ 1 CouponsSwitchActivateAll.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsSwitchActivateAllKt\n*L\n34#1:69,6\n34#1:101\n34#1:114\n34#1:75\n34#1:77,11\n34#1:113\n34#1:76\n34#1:88,13\n40#1:103\n34#1:110,3\n36#1:102\n40#1:104,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllKt */
public final class CouponsSwitchActivateAllKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105654a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r33, boolean r34, boolean r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r3 = r35
            r4 = r36
            r5 = r38
            java.lang.String r0 = "onAllCouponsSwitchClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -1076888113(0xffffffffbfcffdcf, float:-1.6249331)
            r1 = r37
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r39 & 1
            if (r2 == 0) goto L_0x001e
            r6 = r5 | 6
            r7 = r6
            r6 = r33
            goto L_0x0032
        L_0x001e:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x002f
            r6 = r33
            boolean r7 = r1.mo15006n0(r6)
            if (r7 == 0) goto L_0x002c
            r7 = 4
            goto L_0x002d
        L_0x002c:
            r7 = 2
        L_0x002d:
            r7 = r7 | r5
            goto L_0x0032
        L_0x002f:
            r6 = r33
            r7 = r5
        L_0x0032:
            r8 = r39 & 2
            r9 = 16
            if (r8 == 0) goto L_0x003d
            r7 = r7 | 48
            r15 = r34
            goto L_0x004e
        L_0x003d:
            r8 = r5 & 112(0x70, float:1.57E-43)
            r15 = r34
            if (r8 != 0) goto L_0x004e
            boolean r8 = r1.mo14961b(r15)
            if (r8 == 0) goto L_0x004c
            r8 = 32
            goto L_0x004d
        L_0x004c:
            r8 = r9
        L_0x004d:
            r7 = r7 | r8
        L_0x004e:
            r8 = r39 & 4
            if (r8 == 0) goto L_0x0055
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0065
            boolean r8 = r1.mo14961b(r3)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r7 = r7 | r8
        L_0x0065:
            r8 = r39 & 8
            if (r8 == 0) goto L_0x006c
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r8 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007c
            boolean r8 = r1.mo14927P(r4)
            if (r8 == 0) goto L_0x0079
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r7 = r7 | r8
        L_0x007c:
            r14 = r7
            r7 = r14 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0090
            boolean r7 = r1.mo15011p()
            if (r7 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r1.mo14958a0()
            r2 = r6
            goto L_0x0236
        L_0x0090:
            if (r2 == 0) goto L_0x0095
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0096
        L_0x0095:
            r2 = r6
        L_0x0096:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00a2
            r6 = -1
            java.lang.String r7 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAll (CouponsSwitchActivateAll.kt:26)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r6, r7)
        L_0x00a2:
            r0 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r0, r7, r6)
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r6 = r6.mo17070q()
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r7 = r7.mo7630p()
            r8 = 48
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.RowKt.m10071d(r7, r6, r1, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x00fa
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00fa:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x0107
            r1.mo14947W(r12)
            goto L_0x010a
        L_0x0107:
            r1.mo14888A()
        L_0x010a:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r6, r13)
            kotlin.jvm.functions.p r6 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r6)
            kotlin.jvm.functions.p r6 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r6)
            kotlin.jvm.functions.p r6 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r6)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r13 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r0.invoke(r6, r1, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            if (r3 == 0) goto L_0x016e
            r0 = -1891362874(0xffffffff8f4417c6, float:-9.668125E-30)
            r1.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            float r6 = (float) r9
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r6)
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 6
            r0 = 30
            r13 = r1
            r15 = r0
            androidx.compose.material.ProgressIndicatorKt.m13705b(r6, r7, r9, r10, r12, r13, r14, r15)
            r1.mo15002m0()
            goto L_0x01de
        L_0x016e:
            r0 = -1891362783(0xffffffff8f441821, float:-9.668193E-30)
            r1.mo14918M(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r4)
            java.lang.Object r6 = r1.mo14921N()
            if (r0 != 0) goto L_0x018c
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r6 != r0) goto L_0x0194
        L_0x018c:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$1$1$1 r6 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$1$1$1
            r6.<init>(r4)
            r1.mo14893C(r6)
        L_0x0194:
            r1.mo15002m0()
            r0 = r6
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            r29 = 0
            r30 = 0
            r31 = 0
            androidx.compose.material.q1 r6 = androidx.compose.material.C7903q1.f18967a
            com.carrefour.fid.android.design.theme.b r7 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r7.mo114218O()
            r9 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r32 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 0
            int r27 = androidx.compose.material.C7903q1.f18968b
            r28 = 1022(0x3fe, float:1.432E-42)
            r25 = r1
            androidx.compose.material.p1 r11 = r6.mo10989a(r7, r9, r11, r12, r14, r16, r17, r19, r21, r23, r25, r26, r27, r28)
            int r6 = r32 >> 3
            r13 = r6 & 14
            r14 = 28
            r6 = r34
            r7 = r0
            r8 = r29
            r9 = r30
            r10 = r31
            r12 = r1
            androidx.compose.material.SwitchKt.m14058a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.mo15002m0()
        L_0x01de:
            r0 = 2131952448(0x7f130340, float:1.954134E38)
            r7 = 0
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r7)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r8)
            androidx.compose.ui.text.p0 r26 = r0.mo11088c()
            r0 = 2131099826(0x7f0600b2, float:1.7812016E38)
            long r8 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r1, r7)
            androidx.compose.ui.text.style.r$a r0 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r21 = r0.mo47727c()
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 3120(0xc30, float:4.372E-42)
            r30 = 55290(0xd7fa, float:7.7478E-41)
            r27 = r1
            androidx.compose.material.TextKt.m14196c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0236
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0236:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x023d
            goto L_0x0251
        L_0x023d:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$2 r8 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllKt$CouponsSwitchActivateAll$2
            r0 = r8
            r1 = r2
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponsSwitchActivateAllKt.m105654a(androidx.compose.ui.m, boolean, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105655b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-996053119);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-996053119, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsSwitchActivateAllPreview (CouponsSwitchActivateAll.kt:58)");
            }
            ThemeKt.m153788a(ComposableSingletons$CouponsSwitchActivateAllKt.f60017a.mo69869a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponsSwitchActivateAllKt$CouponsSwitchActivateAllPreview$1(i));
        }
    }
}
