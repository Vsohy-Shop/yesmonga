package com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo22516d2 = {"Landroidx/compose/ui/m;", "modifier", "", "name", "banner", "address", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "serviceType", "", "distanceInMeters", "Lkotlin/d2;", "DriveCard", "(Landroidx/compose/ui/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/service/models/DriveType;FLandroidx/compose/runtime/o;II)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/component/DriveCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,96:1\n154#2:97\n154#2:98\n154#2:165\n154#2:166\n154#2:167\n154#2:173\n154#2:208\n74#3,6:99\n80#3:131\n84#3:218\n75#4:105\n76#4,11:107\n75#4:138\n76#4,11:140\n89#4:171\n75#4:181\n76#4,11:183\n89#4:212\n89#4:217\n76#5:106\n76#5:139\n76#5:182\n460#6,13:118\n460#6,13:151\n473#6,3:168\n460#6,13:194\n473#6,3:209\n473#6,3:214\n75#7,6:132\n81#7:164\n85#7:172\n74#7,7:174\n81#7:207\n85#7:213\n*S KotlinDebug\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/component/DriveCardKt\n*L\n43#1:97\n44#1:98\n54#1:165\n55#1:166\n62#1:167\n77#1:173\n88#1:208\n41#1:99,6\n41#1:131\n41#1:218\n41#1:105\n41#1:107,11\n46#1:138\n46#1:140,11\n46#1:171\n83#1:181\n83#1:183,11\n83#1:212\n41#1:217\n41#1:106\n46#1:139\n83#1:182\n41#1:118,13\n46#1:151,13\n46#1:168,3\n83#1:194,13\n83#1:209,3\n41#1:214,3\n46#1:132,6\n46#1:164\n46#1:172\n83#1:174,7\n83#1:207\n83#1:213\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.component.DriveCardKt */
public final class DriveCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DriveCard(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r38, @org.jetbrains.annotations.C12579k java.lang.String r39, @org.jetbrains.annotations.C12579k java.lang.String r40, @org.jetbrains.annotations.C12579k java.lang.String r41, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.DriveType r42, float r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r0 = r39
            r13 = r40
            r14 = r41
            r12 = r42
            r11 = r43
            r9 = r45
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "banner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "serviceType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            r1 = 669974050(0x27eefe22, float:6.63338E-15)
            r2 = r44
            androidx.compose.runtime.o r10 = r2.mo15009o(r1)
            r2 = r46 & 1
            if (r2 == 0) goto L_0x0033
            r3 = r9 | 6
            r4 = r3
            r3 = r38
            goto L_0x0047
        L_0x0033:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x0044
            r3 = r38
            boolean r4 = r10.mo15006n0(r3)
            if (r4 == 0) goto L_0x0041
            r4 = 4
            goto L_0x0042
        L_0x0041:
            r4 = 2
        L_0x0042:
            r4 = r4 | r9
            goto L_0x0047
        L_0x0044:
            r3 = r38
            r4 = r9
        L_0x0047:
            r5 = r46 & 2
            r6 = 16
            if (r5 == 0) goto L_0x0050
            r4 = r4 | 48
            goto L_0x005f
        L_0x0050:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x005f
            boolean r5 = r10.mo15006n0(r0)
            if (r5 == 0) goto L_0x005d
            r5 = 32
            goto L_0x005e
        L_0x005d:
            r5 = r6
        L_0x005e:
            r4 = r4 | r5
        L_0x005f:
            r5 = r46 & 4
            if (r5 == 0) goto L_0x0066
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0066:
            r5 = r9 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0076
            boolean r5 = r10.mo15006n0(r13)
            if (r5 == 0) goto L_0x0073
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r4 = r4 | r5
        L_0x0076:
            r5 = r46 & 8
            if (r5 == 0) goto L_0x007d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x008d
            boolean r5 = r10.mo15006n0(r14)
            if (r5 == 0) goto L_0x008a
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r4 = r4 | r5
        L_0x008d:
            r5 = r46 & 16
            if (r5 == 0) goto L_0x0094
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0094:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r9
            if (r5 != 0) goto L_0x00a6
            boolean r5 = r10.mo15006n0(r12)
            if (r5 == 0) goto L_0x00a3
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r4 = r4 | r5
        L_0x00a6:
            r5 = r46 & 32
            if (r5 == 0) goto L_0x00ae
            r5 = 196608(0x30000, float:2.75506E-40)
        L_0x00ac:
            r4 = r4 | r5
            goto L_0x00bf
        L_0x00ae:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r9
            if (r5 != 0) goto L_0x00bf
            boolean r5 = r10.mo14968d(r11)
            if (r5 == 0) goto L_0x00bc
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00bc:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ac
        L_0x00bf:
            r7 = r4
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r7
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r5) goto L_0x00d6
            boolean r4 = r10.mo15011p()
            if (r4 != 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            r10.mo14958a0()
            r1 = r10
            goto L_0x04da
        L_0x00d6:
            if (r2 == 0) goto L_0x00dc
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r2
            goto L_0x00dd
        L_0x00dc:
            r4 = r3
        L_0x00dd:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00e9
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.service.presentation.ui.drive.summary.component.DriveCard (DriveCard.kt:32)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r7, r2, r3)
        L_0x00e9:
            r1 = 120(0x78, float:1.68E-43)
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r1)
            float r2 = (float) r6
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r1, r2)
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r10.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement r27 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r2 = r27.mo7631r()
            androidx.compose.ui.c$a r28 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r28.mo17072u()
            r6 = 0
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r3, r10, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10.mo14918M(r5)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r10.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r15 = r10.mo15032w(r15)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.p004ui.unit.LayoutDirection) r15
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r10.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r29 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r5 = r29.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r6 = r10.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x014d
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x014d:
            r10.mo14938T()
            boolean r6 = r10.mo14997l()
            if (r6 == 0) goto L_0x015a
            r10.mo14947W(r5)
            goto L_0x015d
        L_0x015a:
            r10.mo14888A()
        L_0x015d:
            r10.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r10)
            kotlin.jvm.functions.p r6 = r29.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r6)
            kotlin.jvm.functions.p r2 = r29.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r2)
            kotlin.jvm.functions.p r2 = r29.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r15, r2)
            kotlin.jvm.functions.p r2 = r29.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r8, r2)
            r10.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r10)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.invoke(r2, r10, r5)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10.mo14918M(r8)
            androidx.compose.foundation.layout.ColumnScopeInstance r30 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 0
            r5 = 0
            r2 = 1
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r6, r5, r2, r1)
            androidx.compose.ui.c$c r3 = r28.mo17070q()
            r15 = 693286680(0x2952b718, float:4.6788176E-14)
            r10.mo14918M(r15)
            androidx.compose.foundation.layout.Arrangement$d r5 = r27.mo7630p()
            r13 = 48
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r3, r10, r13)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r10.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r10.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r10.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            kotlin.jvm.functions.a r2 = r29.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r8 = r10.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x01ef
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01ef:
            r10.mo14938T()
            boolean r8 = r10.mo14997l()
            if (r8 == 0) goto L_0x01fc
            r10.mo14947W(r2)
            goto L_0x01ff
        L_0x01fc:
            r10.mo14888A()
        L_0x01ff:
            r10.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r10)
            kotlin.jvm.functions.p r8 = r29.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r3, r8)
            kotlin.jvm.functions.p r3 = r29.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r5, r3)
            kotlin.jvm.functions.p r3 = r29.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r13, r3)
            kotlin.jvm.functions.p r3 = r29.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r15, r3)
            r10.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r10)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r8 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r1.invoke(r2, r10, r3)
            r13 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10.mo14918M(r13)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r2 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.CommonKt.getFacilitiesLogo(r40)
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r2, r10, r8)
            java.lang.String r3 = "carrefour pictogram"
            r5 = 0
            r17 = 0
            r15 = 8
            float r15 = (float) r15
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r15)
            r19 = 0
            r20 = 11
            r21 = 0
            r25 = r15
            r15 = r6
            r16 = r5
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r15, r16, r17, r18, r19, r20, r21)
            r15 = 24
            float r15 = (float) r15
            float r15 = androidx.compose.p004ui.unit.C16483g.m74435M(r15)
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10087C(r5, r15)
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 440(0x1b8, float:6.17E-43)
            r24 = 120(0x78, float:1.68E-43)
            r15 = r2
            r16 = r3
            r22 = r10
            androidx.compose.foundation.ImageKt.m8967b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            androidx.compose.ui.m r15 = r1.mo7842b(r6, r2, r3)
            r16 = 0
            r17 = 0
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r25)
            r19 = 0
            r20 = 11
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.text.style.r$a r2 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r15 = r2.mo47727c()
            com.carrefour.fid.android.design.theme.b r32 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r2 = r32.mo114205B()
            androidx.compose.material.t0 r5 = androidx.compose.material.C7933t0.f19075a
            int r13 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r16 = r5.mo11077c(r10, r13)
            androidx.compose.ui.text.p0 r20 = r16.mo11098k()
            r16 = 0
            r33 = r4
            r34 = r5
            r25 = 0
            r4 = r16
            r16 = 0
            r8 = r6
            r6 = r16
            r35 = r7
            r7 = r16
            r36 = r8
            r8 = r16
            r16 = 0
            r38 = r10
            r9 = r16
            r16 = 0
            r11 = r16
            r12 = r16
            r16 = 0
            r37 = r13
            r13 = r16
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            int r21 = r35 >> 3
            r22 = r21 & 14
            r23 = 3120(0xc30, float:4.372E-42)
            r24 = 55288(0xd7f8, float:7.7475E-41)
            r0 = r39
            r21 = r38
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = -436056255(0xffffffffe6024f41, float:-1.538424E23)
            r1 = r38
            r1.mo14918M(r0)
            r0 = r43
            int r2 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x0352
            double r2 = (double) r0
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            double r2 = java.lang.Math.rint(r2)
            r4 = 10
            double r4 = (double) r4
            double r2 = r2 / r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.StringKt.m118929i(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "km"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            long r4 = r32.mo114205B()
            r3 = r34
            r6 = r37
            androidx.compose.material.w1 r3 = r3.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r22 = com.carrefour.fid.android.design.theme.C37477d.m153900l(r3)
            r3 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 3072(0xc00, float:4.305E-42)
            r26 = 57338(0xdffa, float:8.0348E-41)
            r23 = r1
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0352:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r2 = 11
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r15 = r36
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10115o(r15, r2)
            r13 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r2, r1, r13)
            com.carrefour.fid.android.design.theme.a r31 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            long r4 = r31.mo114185h()
            long r2 = r32.mo114257y()
            r6 = 0
            r14 = r1
            r1 = r6
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r38 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r35 >> 9
            r22 = r21 & 14
            r23 = 0
            r24 = 131058(0x1fff2, float:1.83651E-40)
            r0 = r41
            r21 = r38
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r15 = 2
            r16 = 0
            r11 = r30
            r12 = r36
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.C2373k.m10461c(r11, r12, r13, r14, r15, r16)
            r15 = 0
            r1 = r38
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r1, r15)
            androidx.compose.ui.c$c r0 = r28.mo17070q()
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement$d r2 = r27.mo7630p()
            r3 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r0, r1, r3)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r1.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r1.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            kotlin.jvm.functions.a r5 = r29.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r36)
            androidx.compose.runtime.d r7 = r1.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0406
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0406:
            r1.mo14938T()
            boolean r7 = r1.mo14997l()
            if (r7 == 0) goto L_0x0413
            r1.mo14947W(r5)
            goto L_0x0416
        L_0x0413:
            r1.mo14888A()
        L_0x0416:
            r1.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r7 = r29.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r0, r7)
            kotlin.jvm.functions.p r0 = r29.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r0)
            kotlin.jvm.functions.p r0 = r29.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r0)
            kotlin.jvm.functions.p r0 = r29.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r6.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            int r0 = com.carrefour.fid.android.service.C28330R.string.drive_map_type_header
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r15)
            long r6 = r31.mo114185h()
            long r4 = r32.mo114257y()
            androidx.compose.ui.text.font.i0 r0 = new androidx.compose.ui.text.font.i0
            r9 = r0
            r3 = 700(0x2bc, float:9.81E-43)
            r0.<init>(r3)
            r3 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 0
            r26 = 131026(0x1ffd2, float:1.83607E-40)
            r23 = r1
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 4
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r3 = r36
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10092H(r3, r2)
            r3 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r2, r1, r3)
            int r2 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.CommonKt.getDriveLabelId(r42)
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r1, r0)
            long r6 = r31.mo114185h()
            long r4 = r32.mo114257y()
            r3 = 0
            r9 = 0
            r15 = 0
            r24 = 0
            r26 = 131058(0x1fff2, float:1.83651E-40)
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x04d8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04d8:
            r3 = r33
        L_0x04da:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x04e1
            goto L_0x04f9
        L_0x04e1:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.component.DriveCardKt$DriveCard$2 r10 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.component.DriveCardKt$DriveCard$2
            r0 = r10
            r1 = r3
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r45
            r8 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x04f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component.DriveCardKt.DriveCard(androidx.compose.ui.m, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.service.models.DriveType, float, androidx.compose.runtime.o, int, int):void");
    }
}
