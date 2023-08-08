package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,279:1\n67#2,3:280\n66#2:283\n460#2,13:310\n460#2,13:343\n473#2,3:357\n36#2:362\n460#2,13:388\n473#2,3:402\n473#2,3:407\n1114#3,6:284\n1114#3,6:363\n76#4:290\n76#4:298\n76#4:331\n76#4:376\n67#5,6:291\n73#5:323\n77#5:411\n75#6:297\n76#6,11:299\n75#6:330\n76#6,11:332\n89#6:360\n75#6:375\n76#6,11:377\n89#6:405\n89#6:410\n75#7,6:324\n81#7:356\n85#7:361\n75#7,6:369\n81#7:401\n85#7:406\n154#8:412\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissKt\n*L\n213#1:280,3\n213#1:283\n241#1:310,13\n261#1:343,13\n261#1:357,3\n267#1:362\n265#1:388,13\n265#1:402,3\n241#1:407,3\n213#1:284,6\n267#1:363,6\n239#1:290\n241#1:298\n261#1:331\n265#1:376\n241#1:291,6\n241#1:323\n241#1:411\n241#1:297\n241#1:299,11\n261#1:330\n261#1:332,11\n261#1:360\n265#1:375\n265#1:377,11\n265#1:405\n241#1:410\n261#1:324,6\n261#1:356\n261#1:361\n265#1:369,6\n265#1:401\n265#1:406\n279#1:412\n*E\n"})
public final class SwipeToDismissKt {

    /* renamed from: a */
    public static final float f19752a = C16483g.m74435M((float) 125);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a2  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26368a(@org.jetbrains.annotations.C12579k androidx.compose.material3.DismissState r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l java.util.Set<? extends androidx.compose.material3.DismissDirection> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r6 = r34
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "background"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dismissContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = -373200705(0xffffffffe9c168bf, float:-2.9227167E25)
            r4 = r33
            androidx.compose.runtime.o r4 = r4.mo15009o(r0)
            r5 = r35 & 1
            r7 = 2
            if (r5 == 0) goto L_0x0028
            r5 = r6 | 6
            goto L_0x0038
        L_0x0028:
            r5 = r6 & 14
            if (r5 != 0) goto L_0x0037
            boolean r5 = r4.mo15006n0(r1)
            if (r5 == 0) goto L_0x0034
            r5 = 4
            goto L_0x0035
        L_0x0034:
            r5 = r7
        L_0x0035:
            r5 = r5 | r6
            goto L_0x0038
        L_0x0037:
            r5 = r6
        L_0x0038:
            r8 = r35 & 2
            r9 = 16
            if (r8 == 0) goto L_0x0041
            r5 = r5 | 48
            goto L_0x0050
        L_0x0041:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0050
            boolean r8 = r4.mo14927P(r2)
            if (r8 == 0) goto L_0x004e
            r8 = 32
            goto L_0x004f
        L_0x004e:
            r8 = r9
        L_0x004f:
            r5 = r5 | r8
        L_0x0050:
            r8 = r35 & 4
            if (r8 == 0) goto L_0x0057
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0067
            boolean r8 = r4.mo14927P(r3)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r8
        L_0x0067:
            r8 = r35 & 8
            if (r8 == 0) goto L_0x006e
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0081
            r10 = r31
            boolean r11 = r4.mo15006n0(r10)
            if (r11 == 0) goto L_0x007d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r5 = r5 | r11
            goto L_0x0083
        L_0x0081:
            r10 = r31
        L_0x0083:
            r11 = r35 & 16
            if (r11 == 0) goto L_0x0089
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            if (r11 != r9) goto L_0x00a2
            r9 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r5
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r12) goto L_0x00a2
            boolean r9 = r4.mo15011p()
            if (r9 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r4.mo14958a0()
            r18 = r32
            r5 = r3
            goto L_0x0394
        L_0x00a2:
            if (r8 == 0) goto L_0x00a7
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00a8
        L_0x00a7:
            r8 = r10
        L_0x00a8:
            r9 = 0
            r10 = 1
            if (r11 == 0) goto L_0x00bb
            androidx.compose.material3.DismissDirection[] r11 = new androidx.compose.material3.DismissDirection[r7]
            androidx.compose.material3.DismissDirection r12 = androidx.compose.material3.DismissDirection.EndToStart
            r11[r9] = r12
            androidx.compose.material3.DismissDirection r12 = androidx.compose.material3.DismissDirection.StartToEnd
            r11[r10] = r12
            java.util.Set r11 = kotlin.collections.C10930d1.m40902u(r11)
            goto L_0x00bd
        L_0x00bb:
            r11 = r32
        L_0x00bd:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x00c9
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.SwipeToDismiss (SwipeToDismiss.kt:231)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r12, r13)
        L_0x00c9:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r4.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r12 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            if (r0 != r12) goto L_0x00d8
            r16 = r10
            goto L_0x00da
        L_0x00d8:
            r16 = r9
        L_0x00da:
            androidx.compose.material3.SwipeableV2State r13 = r28.mo11498f()
            androidx.compose.foundation.gestures.Orientation r14 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.material3.DismissValue r0 = r28.mo11494b()
            androidx.compose.material3.DismissValue r15 = androidx.compose.material3.DismissValue.Default
            if (r0 != r15) goto L_0x00ea
            r0 = r10
            goto L_0x00eb
        L_0x00ea:
            r0 = r9
        L_0x00eb:
            r17 = 0
            r18 = 16
            r19 = 0
            r12 = r8
            r20 = r15
            r15 = r0
            androidx.compose.ui.m r21 = androidx.compose.material3.SwipeableV2Kt.m26473n(r12, r13, r14, r15, r16, r17, r18, r19)
            androidx.compose.material3.SwipeableV2State r22 = r28.mo11498f()
            r0 = 3
            androidx.compose.material3.DismissValue[] r12 = new androidx.compose.material3.DismissValue[r0]
            r12[r9] = r20
            androidx.compose.material3.DismissValue r13 = androidx.compose.material3.DismissValue.DismissedToEnd
            r12[r10] = r13
            androidx.compose.material3.DismissValue r10 = androidx.compose.material3.DismissValue.DismissedToStart
            r12[r7] = r10
            java.util.Set r23 = kotlin.collections.C10930d1.m40902u(r12)
            r24 = 0
            androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1 r7 = new androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1
            r7.<init>(r11)
            r26 = 4
            r27 = 0
            r25 = r7
            androidx.compose.ui.m r7 = androidx.compose.material3.SwipeableV2Kt.m26471l(r21, r22, r23, r24, r25, r26, r27)
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r4.mo14918M(r10)
            androidx.compose.ui.c$a r10 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r12 = r10.mo17061C()
            androidx.compose.ui.layout.f0 r12 = androidx.compose.foundation.layout.BoxKt.m9849k(r12, r9, r4, r9)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.mo14918M(r13)
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r14 = r4.mo15032w(r14)
            androidx.compose.ui.unit.d r14 = (androidx.compose.p004ui.unit.C16479d) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r15 = r4.mo15032w(r15)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.p004ui.unit.LayoutDirection) r15
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r0 = r4.mo15032w(r0)
            androidx.compose.ui.platform.c4 r0 = (androidx.compose.p004ui.platform.C15863c4) r0
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r13 = r16.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r9 = r4.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x0168
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0168:
            r4.mo14938T()
            boolean r9 = r4.mo14997l()
            if (r9 == 0) goto L_0x0175
            r4.mo14947W(r13)
            goto L_0x0178
        L_0x0175:
            r4.mo14888A()
        L_0x0178:
            r4.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r4)
            kotlin.jvm.functions.p r13 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r12, r13)
            kotlin.jvm.functions.p r12 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r14, r12)
            kotlin.jvm.functions.p r12 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r15, r12)
            kotlin.jvm.functions.p r12 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r0, r12)
            r4.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r4)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.invoke(r0, r4, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r7 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r7 = r7.mo7702e(r9)
            int r12 = r5 << 6
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r13 = 693286680(0x2952b718, float:4.6788176E-14)
            r4.mo14918M(r13)
            androidx.compose.foundation.layout.Arrangement r14 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r15 = r14.mo7630p()
            androidx.compose.ui.c$c r13 = r10.mo17073w()
            int r17 = r12 >> 3
            r18 = r17 & 14
            r17 = r17 & 112(0x70, float:1.57E-43)
            r0 = r18 | r17
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r15, r13, r4, r0)
            int r13 = r12 << 3
            r13 = r13 & 112(0x70, float:1.57E-43)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.mo14918M(r15)
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r15 = r4.mo15032w(r15)
            androidx.compose.ui.unit.d r15 = (androidx.compose.p004ui.unit.C16479d) r15
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r4.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            r17 = r8
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r4.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            r18 = r11
            kotlin.jvm.functions.a r11 = r16.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            int r13 = r13 << 9
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | 6
            androidx.compose.runtime.d r3 = r4.mo15017r()
            boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
            if (r3 != 0) goto L_0x0221
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0221:
            r4.mo14938T()
            boolean r3 = r4.mo14997l()
            if (r3 == 0) goto L_0x022e
            r4.mo14947W(r11)
            goto L_0x0231
        L_0x022e:
            r4.mo14888A()
        L_0x0231:
            r4.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r4)
            kotlin.jvm.functions.p r11 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r0, r11)
            kotlin.jvm.functions.p r0 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r15, r0)
            kotlin.jvm.functions.p r0 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r6, r0)
            kotlin.jvm.functions.p r0 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r3, r8, r0)
            r4.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r4)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r3 = 3
            int r6 = r13 >> 3
            r3 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.invoke(r0, r4, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r3 = r12 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.invoke(r0, r4, r3)
            r4.mo15002m0()
            r4.mo14896D()
            r4.mo15002m0()
            r4.mo15002m0()
            r3 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r3)
            boolean r3 = r4.mo15006n0(r1)
            java.lang.Object r6 = r4.mo14921N()
            if (r3 != 0) goto L_0x02a4
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r6 != r3) goto L_0x02ac
        L_0x02a4:
            androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$2$1$1 r6 = new androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$2$1$1
            r6.<init>(r1)
            r4.mo14893C(r6)
        L_0x02ac:
            r4.mo15002m0()
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.OffsetKt.m9998d(r9, r6)
            r6 = 3
            int r5 = r5 << r6
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r4.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement$d r6 = r14.mo7630p()
            androidx.compose.ui.c$c r7 = r10.mo17073w()
            int r8 = r5 >> 3
            r9 = r8 & 14
            r8 = r8 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.RowKt.m10071d(r6, r7, r4, r8)
            int r7 = r5 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r4.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r4.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r4.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r11 = r16.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            androidx.compose.runtime.d r12 = r4.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0313
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0313:
            r4.mo14938T()
            boolean r12 = r4.mo14997l()
            if (r12 == 0) goto L_0x0320
            r4.mo14947W(r11)
            goto L_0x0323
        L_0x0320:
            r4.mo14888A()
        L_0x0323:
            r4.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r4)
            kotlin.jvm.functions.p r12 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r12)
            kotlin.jvm.functions.p r6 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r6)
            kotlin.jvm.functions.p r6 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r6)
            kotlin.jvm.functions.p r6 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r6)
            r4.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r4)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r8 = 3
            int r7 = r7 >> r8
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.invoke(r6, r4, r7)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.mo14918M(r3)
            int r3 = r5 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = r30
            r5.invoke(r0, r4, r3)
            r4.mo15002m0()
            r4.mo14896D()
            r4.mo15002m0()
            r4.mo15002m0()
            r4.mo15002m0()
            r4.mo14896D()
            r4.mo15002m0()
            r4.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0392
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0392:
            r10 = r17
        L_0x0394:
            androidx.compose.runtime.t1 r8 = r4.mo15020s()
            if (r8 != 0) goto L_0x039b
            goto L_0x03b1
        L_0x039b:
            androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$3 r9 = new androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$3
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r10
            r5 = r18
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x03b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissKt.m26368a(androidx.compose.material3.DismissState, kotlin.jvm.functions.q, kotlin.jvm.functions.q, androidx.compose.ui.m, java.util.Set, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.jvm.functions.p<? super androidx.compose.ui.unit.d, ? super java.lang.Float, java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlin.jvm.functions.p<? super androidx.compose.ui.unit.d, ? super java.lang.Float, java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: kotlin.jvm.functions.p<androidx.compose.ui.unit.d, java.lang.Float, java.lang.Float>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.DismissState m26370c(@org.jetbrains.annotations.C12580l androidx.compose.material3.DismissValue r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material3.DismissValue, java.lang.Boolean> r8, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.unit.C16479d, ? super java.lang.Float, java.lang.Float> r9, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            r0 = -263967123(0xfffffffff0442e6d, float:-2.4286075E29)
            r10.mo14918M(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x000c
            androidx.compose.material3.DismissValue r7 = androidx.compose.material3.DismissValue.Default
        L_0x000c:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0012
            androidx.compose.material3.SwipeToDismissKt$rememberDismissState$1 r8 = androidx.compose.material3.SwipeToDismissKt$rememberDismissState$1.f19753f
        L_0x0012:
            r12 = r12 & 4
            if (r12 == 0) goto L_0x001c
            androidx.compose.material3.SwipeToDismissDefaults r9 = androidx.compose.material3.SwipeToDismissDefaults.f19748a
            kotlin.jvm.functions.p r9 = r9.mo12014a()
        L_0x001c:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0028
            r12 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberDismissState (SwipeToDismiss.kt:205)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r12, r1)
        L_0x0028:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            androidx.compose.material3.DismissState$Companion r11 = androidx.compose.material3.DismissState.f19367b
            androidx.compose.runtime.saveable.e r1 = r11.mo11505a(r8, r9)
            r2 = 0
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.mo14918M(r11)
            boolean r11 = r10.mo15006n0(r7)
            boolean r12 = r10.mo15006n0(r8)
            r11 = r11 | r12
            boolean r12 = r10.mo15006n0(r9)
            r11 = r11 | r12
            java.lang.Object r12 = r10.mo14921N()
            if (r11 != 0) goto L_0x0054
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x005c
        L_0x0054:
            androidx.compose.material3.SwipeToDismissKt$rememberDismissState$2$1 r12 = new androidx.compose.material3.SwipeToDismissKt$rememberDismissState$2$1
            r12.<init>(r7, r8, r9)
            r10.mo14893C(r12)
        L_0x005c:
            r10.mo15002m0()
            r3 = r12
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 72
            r6 = 4
            r4 = r10
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.DismissState r7 = (androidx.compose.material3.DismissState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0075
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0075:
            r10.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissKt.m26370c(androidx.compose.material3.DismissValue, kotlin.jvm.functions.l, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):androidx.compose.material3.DismissState");
    }
}
