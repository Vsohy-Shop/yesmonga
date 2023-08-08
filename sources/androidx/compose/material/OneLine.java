package androidx.compose.material;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n75#2,6:430\n81#2:462\n85#2:580\n75#3:436\n76#3,11:438\n75#3:469\n76#3,11:471\n89#3:499\n75#3:506\n76#3,11:508\n89#3:536\n75#3:544\n76#3,11:546\n89#3:574\n89#3:579\n76#4:437\n76#4:470\n76#4:507\n76#4:545\n460#5,13:449\n460#5,13:482\n473#5,3:496\n460#5,13:519\n473#5,3:533\n460#5,13:557\n473#5,3:571\n473#5,3:576\n51#6:463\n68#7,5:464\n73#7:495\n77#7:500\n68#7,5:501\n73#7:532\n77#7:537\n67#7,6:538\n73#7:570\n77#7:575\n154#8:581\n154#8:582\n154#8:583\n154#8:584\n154#8:585\n154#8:586\n154#8:587\n154#8:588\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n*L\n143#1:430,6\n143#1:462\n143#1:580\n143#1:436\n143#1:438,11\n145#1:469\n145#1:471,11\n145#1:499\n156#1:506\n156#1:508,11\n156#1:536\n163#1:544\n163#1:546,11\n163#1:574\n143#1:579\n143#1:437\n145#1:470\n156#1:507\n163#1:545\n143#1:449,13\n145#1:482,13\n145#1:496,3\n156#1:519,13\n156#1:533,3\n163#1:557,13\n163#1:571,3\n143#1:576,3\n147#1:463\n145#1:464,5\n145#1:495\n145#1:500\n156#1:501,5\n156#1:532\n156#1:537\n163#1:538,6\n163#1:570\n163#1:575\n120#1:581\n121#1:582\n124#1:583\n125#1:584\n126#1:585\n129#1:586\n130#1:587\n133#1:588\n*E\n"})
public final class OneLine {
    @C12579k

    /* renamed from: a */
    public static final OneLine f7737a = new OneLine();

    /* renamed from: b */
    public static final float f7738b = C16483g.m74435M((float) 48);

    /* renamed from: c */
    public static final float f7739c = C16483g.m74435M((float) 56);

    /* renamed from: d */
    public static final float f7740d = C16483g.m74435M((float) 40);

    /* renamed from: e */
    public static final float f7741e;

    /* renamed from: f */
    public static final float f7742f = C16483g.m74435M((float) 8);

    /* renamed from: g */
    public static final float f7743g;

    /* renamed from: h */
    public static final float f7744h;

    /* renamed from: i */
    public static final float f7745i;

    static {
        float f = (float) 16;
        f7741e = C16483g.m74435M(f);
        f7743g = C16483g.m74435M(f);
        f7744h = C16483g.m74435M(f);
        f7745i = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10312a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r24 = this;
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r30
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -1884451315(0xffffffff8fad8e0d, float:-1.7113833E-29)
            r1 = r29
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r31 & 1
            r7 = 2
            if (r2 == 0) goto L_0x0021
            r8 = r6 | 6
            r9 = r8
            r8 = r25
            goto L_0x0035
        L_0x0021:
            r8 = r6 & 14
            if (r8 != 0) goto L_0x0032
            r8 = r25
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x002f
            r9 = 4
            goto L_0x0030
        L_0x002f:
            r9 = r7
        L_0x0030:
            r9 = r9 | r6
            goto L_0x0035
        L_0x0032:
            r8 = r25
            r9 = r6
        L_0x0035:
            r10 = r31 & 2
            if (r10 == 0) goto L_0x003c
            r9 = r9 | 48
            goto L_0x004c
        L_0x003c:
            r10 = r6 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x004c
            boolean r10 = r1.mo14927P(r3)
            if (r10 == 0) goto L_0x0049
            r10 = 32
            goto L_0x004b
        L_0x0049:
            r10 = 16
        L_0x004b:
            r9 = r9 | r10
        L_0x004c:
            r10 = r31 & 4
            if (r10 == 0) goto L_0x0053
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0063
            boolean r10 = r1.mo14927P(r4)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r9 = r9 | r10
        L_0x0063:
            r10 = r31 & 8
            if (r10 == 0) goto L_0x006a
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007a
            boolean r10 = r1.mo14927P(r5)
            if (r10 == 0) goto L_0x0077
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r9 = r9 | r10
        L_0x007a:
            r10 = r31 & 16
            if (r10 == 0) goto L_0x0081
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0096
        L_0x0081:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r6
            if (r10 != 0) goto L_0x0096
            r10 = r24
            boolean r11 = r1.mo15006n0(r10)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r9 = r9 | r11
            goto L_0x0098
        L_0x0096:
            r10 = r24
        L_0x0098:
            r11 = 46811(0xb6db, float:6.5596E-41)
            r11 = r11 & r9
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00ad
            boolean r11 = r1.mo15011p()
            if (r11 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            r1.mo14958a0()
        L_0x00aa:
            r2 = r8
            goto L_0x0402
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r8 = r2
        L_0x00b2:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00be
            r2 = -1
            java.lang.String r11 = "androidx.compose.material.OneLine.ListItem (ListItem.kt:135)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r2, r11)
        L_0x00be:
            if (r3 != 0) goto L_0x00c3
            float r0 = f7738b
            goto L_0x00c5
        L_0x00c3:
            float r0 = f7739c
        L_0x00c5:
            r2 = 0
            r11 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10117q(r8, r0, r2, r7, r11)
            r12 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r12)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r12 = r12.mo7630p()
            androidx.compose.ui.c$a r13 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r14 = r13.mo17073w()
            r15 = 0
            androidx.compose.ui.layout.f0 r12 = androidx.compose.foundation.layout.RowKt.m10071d(r12, r14, r1, r15)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r14)
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.unit.d r14 = (androidx.compose.p004ui.unit.C16479d) r14
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r16.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r15 = r1.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x011b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x011b:
            r1.mo14938T()
            boolean r15 = r1.mo14997l()
            if (r15 == 0) goto L_0x0128
            r1.mo14947W(r11)
            goto L_0x012b
        L_0x0128:
            r1.mo14888A()
        L_0x012b:
            r1.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r12, r15)
            kotlin.jvm.functions.p r12 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r14, r12)
            kotlin.jvm.functions.p r12 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r2, r12)
            kotlin.jvm.functions.p r2 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r2)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r7 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r0.invoke(r2, r1, r11)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r2 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r7 = 1825884304(0x6cd4c890, float:2.0579152E27)
            r1.mo14918M(r7)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            if (r3 == 0) goto L_0x0246
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c$c r14 = r13.mo17070q()
            androidx.compose.ui.m r12 = r2.mo7845f(r12, r14)
            float r18 = f7741e
            float r14 = f7740d
            float r14 = r18 + r14
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r14)
            r0 = 0
            r11 = 2
            r15 = 0
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10094J(r12, r14, r0, r11, r15)
            float r21 = f7742f
            r20 = 0
            r22 = 4
            r23 = 0
            r19 = r21
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.c r11 = r13.mo17069o()
            r1.mo14918M(r7)
            r12 = 6
            r14 = 0
            androidx.compose.ui.layout.f0 r11 = androidx.compose.foundation.layout.BoxKt.m9849k(r11, r14, r1, r12)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r1.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            kotlin.jvm.functions.a r7 = r16.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r6 = r1.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x01e1
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01e1:
            r1.mo14938T()
            boolean r6 = r1.mo14997l()
            if (r6 == 0) goto L_0x01ee
            r1.mo14947W(r7)
            goto L_0x01f1
        L_0x01ee:
            r1.mo14888A()
        L_0x01f1:
            r1.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r7 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r7)
            kotlin.jvm.functions.p r7 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r7)
            kotlin.jvm.functions.p r7 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r14, r7)
            kotlin.jvm.functions.p r7 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r15, r7)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r7 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r0.invoke(r6, r1, r11)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r0 = r9 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r1, r0)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
        L_0x0246:
            r1.mo15002m0()
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 2
            r22 = 0
            r17 = r2
            r18 = r0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.C2411u0.m10660e(r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.c$c r7 = r13.mo17070q()
            androidx.compose.ui.m r17 = r2.mo7845f(r6, r7)
            float r18 = f7743g
            r19 = 0
            float r20 = f7744h
            r21 = 0
            r22 = 10
            r23 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.c r7 = r13.mo17069o()
            r11 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo14918M(r11)
            r11 = 6
            r12 = 0
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.BoxKt.m9849k(r7, r12, r1, r11)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r15 = r16.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r3 = r1.mo15017r()
            boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
            if (r3 != 0) goto L_0x02ba
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02ba:
            r1.mo14938T()
            boolean r3 = r1.mo14997l()
            if (r3 == 0) goto L_0x02c7
            r1.mo14947W(r15)
            goto L_0x02ca
        L_0x02c7:
            r1.mo14888A()
        L_0x02ca:
            r1.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r7, r15)
            kotlin.jvm.functions.p r7 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r11, r7)
            kotlin.jvm.functions.p r7 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r12, r7)
            kotlin.jvm.functions.p r7 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r3, r14, r7)
            r1.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r7 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6.invoke(r3, r1, r11)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r3 = r9 >> 6
            r3 = r3 & 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.invoke(r1, r3)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r3 = -2068381427(0xffffffff84b7010d, float:-4.302406E-36)
            r1.mo14918M(r3)
            if (r5 == 0) goto L_0x03e8
            androidx.compose.ui.c$c r3 = r13.mo17070q()
            androidx.compose.ui.m r17 = r2.mo7845f(r0, r3)
            r18 = 0
            r19 = 0
            float r20 = f7745i
            r21 = 0
            r22 = 11
            r23 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo14918M(r2)
            androidx.compose.ui.c r2 = r13.mo17061C()
            r3 = 0
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.BoxKt.m9849k(r2, r3, r1, r3)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r1.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r11 = r16.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r12 = r1.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0385
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0385:
            r1.mo14938T()
            boolean r12 = r1.mo14997l()
            if (r12 == 0) goto L_0x0392
            r1.mo14947W(r11)
            goto L_0x0395
        L_0x0392:
            r1.mo14888A()
        L_0x0395:
            r1.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r12 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r2, r12)
            kotlin.jvm.functions.p r2 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r3, r2)
            kotlin.jvm.functions.p r2 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r2)
            kotlin.jvm.functions.p r2 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r2)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.invoke(r2, r1, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            int r0 = r9 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.invoke(r1, r0)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
        L_0x03e8:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00aa
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x00aa
        L_0x0402:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x0409
            goto L_0x041e
        L_0x0409:
            androidx.compose.material.OneLine$ListItem$2 r9 = new androidx.compose.material.OneLine$ListItem$2
            r0 = r9
            r1 = r24
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x041e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OneLine.mo10312a(androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }
}
