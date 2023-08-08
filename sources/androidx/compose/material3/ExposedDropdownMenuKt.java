package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1058:1\n76#2:1059\n76#2:1060\n76#2:1106\n25#3:1061\n25#3:1068\n25#3:1076\n25#3:1083\n83#3,3:1090\n460#3,13:1118\n473#3,3:1132\n50#3:1137\n49#3:1138\n36#3:1145\n83#3,3:1152\n1114#4,6:1062\n1114#4,6:1069\n1114#4,6:1077\n1114#4,6:1084\n1114#4,6:1093\n1114#4,6:1139\n1114#4,6:1146\n1114#4,6:1155\n1#5:1075\n67#6,6:1099\n73#6:1131\n77#6:1136\n75#7:1105\n76#7,11:1107\n89#7:1135\n76#8:1161\n102#8,2:1162\n76#8:1164\n102#8,2:1165\n154#9:1167\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n*L\n107#1:1059\n108#1:1060\n150#1:1106\n109#1:1061\n110#1:1068\n112#1:1076\n114#1:1083\n116#1:1090,3\n150#1:1118,13\n150#1:1132,3\n154#1:1137\n154#1:1138\n1021#1:1145\n1031#1:1152,3\n109#1:1062,6\n110#1:1069,6\n112#1:1077,6\n114#1:1084,6\n116#1:1093,6\n154#1:1139,6\n1021#1:1146,6\n1031#1:1155,6\n150#1:1099,6\n150#1:1131\n150#1:1136\n150#1:1105\n150#1:1107,11\n150#1:1135\n109#1:1161\n109#1:1162,2\n110#1:1164\n110#1:1165,2\n1057#1:1167\n*E\n"})
public final class ExposedDropdownMenuKt {

    /* renamed from: a */
    public static final float f19410a = C16483g.m74435M((float) 16);

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25771a(boolean r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r11 = r23
            r12 = r24
            r13 = r26
            r14 = r28
            java.lang.String r0 = "onExpandedChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1990697039(0xffffffff89585fb1, float:-2.6045048E-33)
            r1 = r27
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r29 & 1
            r3 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r15.mo14961b(r11)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            r1 = r1 | r14
            goto L_0x0033
        L_0x0032:
            r1 = r14
        L_0x0033:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004a
        L_0x003a:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            boolean r4 = r15.mo14927P(r12)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0047:
            r4 = 16
        L_0x0049:
            r1 = r1 | r4
        L_0x004a:
            r4 = r29 & 4
            if (r4 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0064
            r5 = r25
            boolean r6 = r15.mo15006n0(r5)
            if (r6 == 0) goto L_0x0060
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r6
            goto L_0x0066
        L_0x0064:
            r5 = r25
        L_0x0066:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007d
            boolean r6 = r15.mo14927P(r13)
            if (r6 == 0) goto L_0x007a
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r6
        L_0x007d:
            r10 = r1
            r1 = r10 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x0091
            boolean r1 = r15.mo15011p()
            if (r1 != 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            r15.mo14958a0()
            r3 = r5
            goto L_0x02dc
        L_0x0091:
            if (r4 == 0) goto L_0x0098
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r1
            goto L_0x009a
        L_0x0098:
            r16 = r5
        L_0x009a:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00a6
            r1 = -1
            java.lang.String r4 = "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:100)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r1, r4)
        L_0x00a6:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r15.mo15032w(r0)
            r9 = r0
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70956k()
            java.lang.Object r0 = r15.mo15032w(r0)
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo14918M(r0)
            java.lang.Object r1 = r15.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            r6 = 0
            r7 = 0
            if (r1 != r5) goto L_0x00db
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r1, r6, r3, r6)
            r15.mo14893C(r1)
        L_0x00db:
            r15.mo15002m0()
            r17 = r1
            androidx.compose.runtime.z0 r17 = (androidx.compose.runtime.C8700z0) r17
            r15.mo14918M(r0)
            java.lang.Object r1 = r15.mo14921N()
            java.lang.Object r5 = r4.mo16277a()
            if (r1 != r5) goto L_0x00fa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r1, r6, r3, r6)
            r15.mo14893C(r1)
        L_0x00fa:
            r15.mo15002m0()
            r6 = r1
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            float r1 = androidx.compose.material3.MenuKt.m25877j()
            int r5 = r9.mo7429n2(r1)
            r15.mo14918M(r0)
            java.lang.Object r1 = r15.mo14921N()
            java.lang.Object r2 = r4.mo16277a()
            if (r1 != r2) goto L_0x011d
            androidx.compose.ui.node.i1 r1 = new androidx.compose.ui.node.i1
            r1.<init>()
            r15.mo14893C(r1)
        L_0x011d:
            r15.mo15002m0()
            r2 = r1
            androidx.compose.ui.node.i1 r2 = (androidx.compose.p004ui.node.C15695i1) r2
            r15.mo14918M(r0)
            java.lang.Object r0 = r15.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x0138
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r15.mo14893C(r0)
        L_0x0138:
            r15.mo15002m0()
            r4 = r0
            androidx.compose.ui.focus.FocusRequester r4 = (androidx.compose.p004ui.focus.FocusRequester) r4
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r23)
            r1[r7] = r18
            r18 = 1
            r1[r18] = r12
            r1[r3] = r9
            int r3 = m25774d(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r18 = 3
            r1[r18] = r3
            int r3 = m25772b(r17)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r19 = 4
            r1[r19] = r3
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r15.mo14918M(r3)
            r3 = r7
            r19 = r3
        L_0x016e:
            if (r3 >= r0) goto L_0x017c
            r0 = r1[r3]
            boolean r0 = r15.mo15006n0(r0)
            r19 = r19 | r0
            int r3 = r3 + 1
            r0 = 5
            goto L_0x016e
        L_0x017c:
            java.lang.Object r0 = r15.mo14921N()
            if (r19 != 0) goto L_0x0199
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x018b
            goto L_0x0199
        L_0x018b:
            r25 = r2
            r27 = r4
            r19 = r5
            r20 = r6
            r14 = r7
            r21 = r8
            r22 = r10
            goto L_0x01c3
        L_0x0199:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r3 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            r0 = r3
            r1 = r23
            r25 = r2
            r2 = r24
            r12 = r3
            r3 = r10
            r27 = r4
            r19 = r5
            r5 = r25
            r20 = r6
            r6 = r8
            r14 = r7
            r7 = r19
            r21 = r8
            r8 = r17
            r17 = r9
            r9 = r20
            r22 = r10
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.mo14893C(r12)
            r0 = r12
        L_0x01c3:
            r15.mo15002m0()
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r0 = (androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) r0
            int r1 = r22 >> 6
            r2 = r1 & 14
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.mo14918M(r3)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r3 = r3.mo17061C()
            int r4 = r2 >> 3
            r5 = r4 & 14
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.BoxKt.m9849k(r3, r14, r15, r4)
            int r2 = r2 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r7.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r16)
            int r2 = r2 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 6
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0226
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0226:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x0233
            r15.mo14947W(r8)
            goto L_0x0236
        L_0x0233:
            r15.mo14888A()
        L_0x0236:
            r15.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r7.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r10)
            kotlin.jvm.functions.p r3 = r7.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r3)
            kotlin.jvm.functions.p r3 = r7.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r3)
            kotlin.jvm.functions.p r3 = r7.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r3)
            r15.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            int r2 = r2 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.invoke(r3, r15, r2)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r2)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.invoke(r0, r15, r1)
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo14918M(r1)
            boolean r0 = r15.mo15006n0(r0)
            r1 = r27
            boolean r2 = r15.mo15006n0(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r15.mo14921N()
            if (r0 != 0) goto L_0x02af
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x02b7
        L_0x02af:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 r2 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
            r2.<init>(r11, r1)
            r15.mo14893C(r2)
        L_0x02b7:
            r15.mo15002m0()
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            androidx.compose.runtime.EffectsKt.m29899k(r2, r15, r14)
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3 r0 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3
            r4 = r25
            r3 = r19
            r2 = r20
            r1 = r21
            r0.<init>(r1, r4, r3, r2)
            r2 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r1, r0, r15, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02da
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02da:
            r3 = r16
        L_0x02dc:
            androidx.compose.runtime.t1 r7 = r15.mo15020s()
            if (r7 != 0) goto L_0x02e3
            goto L_0x02f6
        L_0x02e3:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4 r8 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
            r0 = r8
            r1 = r23
            r2 = r24
            r4 = r26
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x02f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.m25771a(boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final int m25772b(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: c */
    public static final void m25773c(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    /* renamed from: d */
    public static final int m25774d(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: e */
    public static final void m25775e(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x00b4;
     */
    @androidx.compose.runtime.C8540g
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m25783m(androidx.compose.p004ui.C8767m r14, boolean r15, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r5 = r16
            r6 = r20
            r0 = 1006563320(0x3bfeeff8, float:0.0077800713)
            r6.mo14918M(r0)
            r1 = r22 & 4
            r2 = 6
            if (r1 == 0) goto L_0x001b
            androidx.compose.material3.t2$a r1 = androidx.compose.material3.C8284t2.f20507b
            int r1 = r1.mo13029O()
            java.lang.String r1 = androidx.compose.material3.C8357u2.m29348a(r1, r6, r2)
            r4 = r1
            goto L_0x001d
        L_0x001b:
            r4 = r17
        L_0x001d:
            r1 = r22 & 8
            if (r1 == 0) goto L_0x002d
            androidx.compose.material3.t2$a r1 = androidx.compose.material3.C8284t2.f20507b
            int r1 = r1.mo13031Q()
            java.lang.String r1 = androidx.compose.material3.C8357u2.m29348a(r1, r6, r2)
            r3 = r1
            goto L_0x002f
        L_0x002d:
            r3 = r18
        L_0x002f:
            r1 = r22 & 16
            if (r1 == 0) goto L_0x003f
            androidx.compose.material3.t2$a r1 = androidx.compose.material3.C8284t2.f20507b
            int r1 = r1.mo13030P()
            java.lang.String r1 = androidx.compose.material3.C8357u2.m29348a(r1, r6, r2)
            r7 = r1
            goto L_0x0041
        L_0x003f:
            r7 = r19
        L_0x0041:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x004f
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.expandable (ExposedDropdownMenu.kt:1014)"
            r8 = r21
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r1, r2)
        L_0x004f:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r1 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r1)
            boolean r1 = r6.mo15006n0(r5)
            java.lang.Object r2 = r20.mo14921N()
            r8 = 0
            if (r1 != 0) goto L_0x006a
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0072
        L_0x006a:
            androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1 r2 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1
            r2.<init>(r5, r8)
            r6.mo14893C(r2)
        L_0x0072:
            r20.mo15002m0()
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            r1 = r14
            androidx.compose.ui.m r9 = androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt.m68437c(r14, r0, r2)
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            r10 = 0
            r1[r10] = r2
            r11 = 1
            r1[r11] = r3
            r2 = 2
            r1[r2] = r7
            r2 = 3
            r1[r2] = r4
            r2 = 4
            r1[r2] = r5
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r6.mo14918M(r2)
            r2 = r10
            r12 = r2
        L_0x009a:
            if (r2 >= r0) goto L_0x00a6
            r13 = r1[r2]
            boolean r13 = r6.mo15006n0(r13)
            r12 = r12 | r13
            int r2 = r2 + 1
            goto L_0x009a
        L_0x00a6:
            java.lang.Object r0 = r20.mo14921N()
            if (r12 != 0) goto L_0x00b4
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x00c2
        L_0x00b4:
            androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1 r12 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1
            r0 = r12
            r1 = r15
            r2 = r3
            r3 = r7
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo14893C(r12)
        L_0x00c2:
            r20.mo15002m0()
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r9, r10, r0, r11, r8)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00d4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d4:
            r20.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.m25783m(androidx.compose.ui.m, boolean, kotlin.jvm.functions.a, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.o, int, int):androidx.compose.ui.m");
    }

    /* renamed from: n */
    public static final void m25784n(View view, C15588o oVar, int i, C11300l<? super Integer, C11079d2> lVar) {
        if (oVar != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            float B = C15591p.m69301c(oVar).mo42249B();
            int i2 = rect.top;
            lVar.invoke(Integer.valueOf(((int) Math.max(B - ((float) i2), ((float) (rect.bottom - i2)) - C15591p.m69301c(oVar).mo42271j())) - i));
        }
    }
}
