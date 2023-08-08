package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nModalBottomSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ModalBottomSheetContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n154#2:69\n74#3,6:70\n80#3:102\n84#3:131\n75#4:76\n76#4,11:78\n89#4:130\n76#5:77\n460#6,13:89\n50#6:103\n49#6:104\n50#6:111\n49#6:112\n50#6:119\n49#6:120\n473#6,3:127\n1114#7,6:105\n1114#7,6:113\n1114#7,6:121\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ModalBottomSheetContentKt\n*L\n28#1:69\n24#1:70,6\n24#1:102\n24#1:131\n24#1:76\n24#1:78,11\n24#1:130\n24#1:77\n24#1:89,13\n41#1:103\n41#1:104\n46#1:111\n46#1:112\n50#1:119\n50#1:120\n24#1:127,3\n41#1:105,6\n46#1:113,6\n50#1:121,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt */
public final class ModalBottomSheetContentKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116821a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i r19, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r20, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r1 = r19
            r4 = r23
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1959583641(0xffffffff8b332067, float:-3.4498523E-32)
            r2 = r22
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r4 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            r5 = r24 & 2
            if (r5 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r20
            boolean r7 = r2.mo15006n0(r6)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r3 = r3 | r7
            goto L_0x0045
        L_0x0043:
            r6 = r20
        L_0x0045:
            r7 = r24 & 4
            if (r7 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005f
            r8 = r21
            boolean r9 = r2.mo14927P(r8)
            if (r9 == 0) goto L_0x005b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r9
            goto L_0x0061
        L_0x005f:
            r8 = r21
        L_0x0061:
            r9 = r3 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x0075
            boolean r9 = r2.mo15011p()
            if (r9 != 0) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            r2.mo14958a0()
            r15 = r6
            r3 = r8
            goto L_0x027b
        L_0x0075:
            if (r5 == 0) goto L_0x007b
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r5
            goto L_0x007c
        L_0x007b:
            r15 = r6
        L_0x007c:
            if (r7 == 0) goto L_0x0082
            com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$1 r5 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$1.f67438f
            r14 = r5
            goto L_0x0083
        L_0x0082:
            r14 = r8
        L_0x0083:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x008f
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContent (ModalBottomSheetContent.kt:18)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r5, r6)
        L_0x008f:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            r3 = 0
            r13 = 1
            r12 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r3, r13, r12)
            r6 = 0
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r8 = 0
            r9 = 0
            r10 = 13
            r11 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.mo7631r()
            r7 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r0, r2, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r2.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r9.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r11 = r2.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x00f8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00f8:
            r2.mo14938T()
            boolean r11 = r2.mo14997l()
            if (r11 == 0) goto L_0x0105
            r2.mo14947W(r10)
            goto L_0x0108
        L_0x0105:
            r2.mo14888A()
        L_0x0108:
            r2.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r11 = r9.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r0, r11)
            kotlin.jvm.functions.p r0 = r9.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r6, r0)
            kotlin.jvm.functions.p r0 = r9.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r7, r0)
            kotlin.jvm.functions.p r0 = r9.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r8, r0)
            r2.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r11 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.invoke(r0, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.backdrop_handle
            androidx.compose.ui.graphics.painter.Painter r5 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r2, r11)
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.layout.c$a r0 = androidx.compose.p004ui.layout.C15541c.f38696a
            androidx.compose.ui.layout.c r9 = r0.mo44372g()
            r10 = 0
            r0 = 0
            r16 = 24632(0x6038, float:3.4517E-41)
            r17 = 108(0x6c, float:1.51E-43)
            r11 = r0
            r0 = r12
            r12 = r2
            r13 = r16
            r18 = r14
            r14 = r17
            androidx.compose.foundation.ImageKt.m8967b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r5 = r1 instanceof com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27866b
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r5 == 0) goto L_0x01bc
            r5 = -1840249978(0xffffffff92500386, float:-6.563757E-28)
            r2.mo14918M(r5)
            r5 = 1
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r3, r5, r0)
            r0 = r1
            com.carrefour.fid.android.product.presentation.ui.details.nal.i$b r0 = (com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27866b) r0
            int r7 = r0.mo80955e()
            int r0 = r0.mo80957f()
            r8 = 0
            r9 = 0
            r2.mo14918M(r6)
            r3 = r18
            boolean r6 = r2.mo15006n0(r3)
            boolean r10 = r2.mo15006n0(r1)
            r6 = r6 | r10
            java.lang.Object r10 = r2.mo14921N()
            if (r6 != 0) goto L_0x01a2
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r10 != r6) goto L_0x01aa
        L_0x01a2:
            com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$1$1 r10 = new com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$1$1
            r10.<init>(r3, r1)
            r2.mo14893C(r10)
        L_0x01aa:
            r2.mo15002m0()
            kotlin.jvm.functions.l r10 = (kotlin.jvm.functions.C11300l) r10
            r12 = 0
            r13 = 24
            r6 = r0
            r11 = r2
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt.m151522a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.mo15002m0()
            goto L_0x0266
        L_0x01bc:
            r3 = r18
            r5 = 1
            com.carrefour.fid.android.product.presentation.ui.details.nal.i$e r7 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27869e.f67491a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x01fc
            r7 = -1840249596(0xffffffff92500504, float:-6.563941E-28)
            r2.mo14918M(r7)
            r2.mo14918M(r6)
            boolean r6 = r2.mo15006n0(r3)
            boolean r7 = r2.mo15006n0(r1)
            r6 = r6 | r7
            java.lang.Object r7 = r2.mo14921N()
            if (r6 != 0) goto L_0x01e7
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x01ef
        L_0x01e7:
            com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$2$1 r7 = new com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$2$1
            r7.<init>(r3, r1)
            r2.mo14893C(r7)
        L_0x01ef:
            r2.mo15002m0()
            kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
            r8 = 0
            com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt.m117261d(r0, r7, r2, r8, r5)
            r2.mo15002m0()
            goto L_0x0266
        L_0x01fc:
            r8 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.i$a r7 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27865a.f67482a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0239
            r7 = -1840249464(0xffffffff92500588, float:-6.5640045E-28)
            r2.mo14918M(r7)
            r2.mo14918M(r6)
            boolean r6 = r2.mo15006n0(r3)
            boolean r7 = r2.mo15006n0(r1)
            r6 = r6 | r7
            java.lang.Object r7 = r2.mo14921N()
            if (r6 != 0) goto L_0x0225
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x022d
        L_0x0225:
            com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$3$1 r7 = new com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$3$1
            r7.<init>(r3, r1)
            r2.mo14893C(r7)
        L_0x022d:
            r2.mo15002m0()
            kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
            com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt.m117185c(r0, r7, r2, r8, r5)
            r2.mo15002m0()
            goto L_0x0266
        L_0x0239:
            com.carrefour.fid.android.product.presentation.ui.details.nal.i$c r0 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27867c.f67487a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x024b
            r0 = -1840249345(0xffffffff925005ff, float:-6.564062E-28)
            r2.mo14918M(r0)
            r2.mo15002m0()
            goto L_0x0266
        L_0x024b:
            com.carrefour.fid.android.product.presentation.ui.details.nal.i$d r0 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27868d.f67489a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x025d
            r0 = -1840249285(0xffffffff9250063b, float:-6.5640907E-28)
            r2.mo14918M(r0)
            r2.mo15002m0()
            goto L_0x0266
        L_0x025d:
            r0 = -1840249259(0xffffffff92500655, float:-6.564103E-28)
            r2.mo14918M(r0)
            r2.mo15002m0()
        L_0x0266:
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x027b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x027b:
            androidx.compose.runtime.t1 r6 = r2.mo15020s()
            if (r6 != 0) goto L_0x0282
            goto L_0x0292
        L_0x0282:
            com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$3 r7 = new com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$3
            r0 = r7
            r1 = r19
            r2 = r15
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.ModalBottomSheetContentKt.m116821a(com.carrefour.fid.android.product.presentation.ui.details.nal.i, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }
}
