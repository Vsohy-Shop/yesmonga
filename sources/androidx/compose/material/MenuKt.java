package androidx.compose.material;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8578k2;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,298:1\n931#2,4:299\n852#2,5:303\n931#2,4:308\n852#2,5:312\n67#3,3:317\n66#3:320\n25#3:327\n460#3,13:353\n473#3,3:367\n1114#4,6:321\n1114#4,6:328\n75#5,6:334\n81#5:366\n85#5:371\n75#6:340\n76#6,11:342\n89#6:370\n76#7:341\n76#8:372\n76#8:373\n154#9:374\n154#9:375\n154#9:376\n154#9:377\n154#9:378\n154#9:379\n154#9:380\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n71#1:299,4\n71#1:303,5\n97#1:308,4\n97#1:312,5\n117#1:317,3\n117#1:320\n141#1:327\n145#1:353,13\n145#1:367,3\n117#1:321,6\n141#1:328,6\n145#1:334,6\n145#1:366\n145#1:371\n145#1:340\n145#1:342,11\n145#1:370\n145#1:341\n71#1:372\n97#1:373\n187#1:374\n188#1:375\n189#1:376\n190#1:377\n191#1:378\n192#1:379\n193#1:380\n*E\n"})
public final class MenuKt {

    /* renamed from: a */
    public static final float f7695a;

    /* renamed from: b */
    public static final float f7696b;

    /* renamed from: c */
    public static final float f7697c = C16483g.m74435M((float) 16);

    /* renamed from: d */
    public static final float f7698d;

    /* renamed from: e */
    public static final float f7699e = C16483g.m74435M((float) 112);

    /* renamed from: f */
    public static final float f7700f = C16483g.m74435M((float) 280);

    /* renamed from: g */
    public static final float f7701g;

    /* renamed from: h */
    public static final int f7702h = 120;

    /* renamed from: i */
    public static final int f7703i = 75;

    static {
        float f = (float) 8;
        f7695a = C16483g.m74435M(f);
        float f2 = (float) 48;
        f7696b = C16483g.m74435M(f2);
        f7698d = C16483g.m74435M(f);
        f7701g = C16483g.m74435M(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13564a(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1998o0<java.lang.Boolean> r22, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8700z0<androidx.compose.p004ui.graphics.C15283o4> r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            java.lang.String r0 = "expandedStates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "transformOriginState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1164283597(0x45658ecd, float:3672.925)
            r3 = r26
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r6 = r28 & 1
            if (r6 == 0) goto L_0x0027
            r6 = r5 | 6
            goto L_0x0037
        L_0x0027:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0036
            boolean r6 = r3.mo15006n0(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x003e
            r6 = r6 | 48
            goto L_0x004e
        L_0x003e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004e
            boolean r7 = r3.mo15006n0(r2)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x004b:
            r7 = 16
        L_0x004d:
            r6 = r6 | r7
        L_0x004e:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r24
            boolean r9 = r3.mo15006n0(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r24
        L_0x006a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            boolean r9 = r3.mo14927P(r4)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r6 = r6 | r9
        L_0x0081:
            r14 = r6
            r6 = r14 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x0094
            boolean r6 = r3.mo15011p()
            if (r6 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r3.mo14958a0()
            goto L_0x023e
        L_0x0094:
            if (r7 == 0) goto L_0x009a
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r6
            goto L_0x009b
        L_0x009a:
            r15 = r8
        L_0x009b:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            r13 = -1
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = "androidx.compose.material.DropdownMenuContent (Menu.kt:61)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r13, r6)
        L_0x00a7:
            int r0 = androidx.compose.animation.core.C1998o0.f5575d
            r0 = r0 | 48
            r6 = r14 & 14
            r0 = r0 | r6
            java.lang.String r6 = "DropDownMenu"
            r12 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8195n(r1, r6, r3, r0, r12)
            androidx.compose.material.MenuKt$DropdownMenuContent$scale$2 r6 = androidx.compose.material.MenuKt$DropdownMenuContent$scale$2.f7705f
            r11 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.mo14918M(r11)
            java.lang.String r16 = "FloatAnimation"
            kotlin.jvm.internal.x r17 = kotlin.jvm.internal.C11377x.f28521a
            androidx.compose.animation.core.a1 r10 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r17)
            r9 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.mo14918M(r9)
            java.lang.Object r7 = r0.mo6700h()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1958825495(0xffffffff8b3eb1e9, float:-3.6726514E-32)
            r3.mo14918M(r8)
            boolean r18 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r9 = "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)"
            if (r18 == 0) goto L_0x00e6
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r12, r13, r9)
        L_0x00e6:
            r18 = 1061997773(0x3f4ccccd, float:0.8)
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x00f0
            r7 = r19
            goto L_0x00f2
        L_0x00f0:
            r7 = r18
        L_0x00f2:
            boolean r20 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r20 == 0) goto L_0x00fb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00fb:
            r3.mo15002m0()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r20 = r0.mo6706o()
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            r3.mo14918M(r8)
            boolean r21 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r21 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r12, r13, r9)
        L_0x0118:
            if (r20 == 0) goto L_0x011c
            r18 = r19
        L_0x011c:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0125
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0125:
            r3.mo15002m0()
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$b r9 = r0.mo6704m()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r9, r3, r11)
            r9 = r6
            androidx.compose.animation.core.d0 r9 = (androidx.compose.animation.core.C1956d0) r9
            r18 = 0
            r6 = r0
            r11 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r11 = r16
            r1 = r12
            r12 = r3
            r5 = r13
            r13 = r18
            androidx.compose.runtime.k2 r13 = androidx.compose.animation.core.TransitionKt.m8194m(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.mo15002m0()
            r3.mo15002m0()
            androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2 r6 = androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2.f7704f
            r7 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.mo14918M(r7)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.a1 r10 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r17)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.mo14918M(r7)
            java.lang.Object r7 = r0.mo6700h()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1541356035(0xffffffffa420c5fd, float:-3.4862172E-17)
            r3.mo14918M(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r12 = "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)"
            if (r9 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r1, r5, r12)
        L_0x0181:
            r9 = 0
            if (r7 == 0) goto L_0x0187
            r7 = r19
            goto L_0x0188
        L_0x0187:
            r7 = r9
        L_0x0188:
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0191:
            r3.mo15002m0()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r16 = r0.mo6706o()
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            r3.mo14918M(r8)
            boolean r17 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r17 == 0) goto L_0x01ae
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r1, r5, r12)
        L_0x01ae:
            if (r16 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r19 = r9
        L_0x01b3:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x01bc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01bc:
            r3.mo15002m0()
            java.lang.Float r8 = java.lang.Float.valueOf(r19)
            androidx.compose.animation.core.Transition$b r5 = r0.mo6704m()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r6.invoke(r5, r3, r1)
            r9 = r1
            androidx.compose.animation.core.d0 r9 = (androidx.compose.animation.core.C1956d0) r9
            r6 = r0
            r12 = r3
            r0 = r13
            r13 = r18
            androidx.compose.runtime.k2 r1 = androidx.compose.animation.core.TransitionKt.m8194m(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.mo15002m0()
            r3.mo15002m0()
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.mo14918M(r6)
            boolean r6 = r3.mo15006n0(r0)
            boolean r7 = r3.mo15006n0(r1)
            r6 = r6 | r7
            boolean r7 = r3.mo15006n0(r2)
            r6 = r6 | r7
            java.lang.Object r7 = r3.mo14921N()
            if (r6 != 0) goto L_0x0205
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x020d
        L_0x0205:
            androidx.compose.material.MenuKt$DropdownMenuContent$1$1 r7 = new androidx.compose.material.MenuKt$DropdownMenuContent$1$1
            r7.<init>(r2, r0, r1)
            r3.mo14893C(r7)
        L_0x020d:
            r3.mo15002m0()
            kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
            androidx.compose.ui.m r6 = androidx.compose.p004ui.graphics.C15320t2.m66557a(r5, r7)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            float r13 = f7695a
            androidx.compose.material.MenuKt$DropdownMenuContent$2 r0 = new androidx.compose.material.MenuKt$DropdownMenuContent$2
            r0.<init>(r15, r4, r14)
            r1 = -242468534(0xfffffffff18c394a, float:-1.3887091E30)
            r5 = 1
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r1, r5, r0)
            r16 = 1769472(0x1b0000, float:2.479558E-39)
            r17 = 30
            r0 = r15
            r15 = r3
            androidx.compose.material.C7873k.m25025b(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x023d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x023d:
            r8 = r0
        L_0x023e:
            androidx.compose.runtime.t1 r7 = r3.mo15020s()
            if (r7 != 0) goto L_0x0245
            goto L_0x0259
        L_0x0245:
            androidx.compose.material.MenuKt$DropdownMenuContent$3 r9 = new androidx.compose.material.MenuKt$DropdownMenuContent$3
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r8
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r9)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.m13564a(androidx.compose.animation.core.o0, androidx.compose.runtime.z0, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final float m13565b(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: c */
    public static final float m13566c(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d5  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13567d(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, boolean r27, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r28, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r9 = r25
            r10 = r30
            r11 = r32
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 87134531(0x5319143, float:8.3491804E-36)
            r1 = r31
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.mo14927P(r9)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r26
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r26
        L_0x004c:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r27
            boolean r6 = r12.mo14961b(r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0068
        L_0x0066:
            r5 = r27
        L_0x0068:
            r6 = r33 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r28
            boolean r8 = r12.mo15006n0(r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r8
            goto L_0x0084
        L_0x0082:
            r7 = r28
        L_0x0084:
            r8 = r33 & 16
            if (r8 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00a0
            r13 = r29
            boolean r14 = r12.mo15006n0(r13)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r14
            goto L_0x00a2
        L_0x00a0:
            r13 = r29
        L_0x00a2:
            r14 = r33 & 32
            if (r14 == 0) goto L_0x00aa
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a8:
            r1 = r1 | r14
            goto L_0x00bb
        L_0x00aa:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00bb
            boolean r14 = r12.mo14927P(r10)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a8
        L_0x00bb:
            r14 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r14
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r15) goto L_0x00d5
            boolean r1 = r12.mo15011p()
            if (r1 != 0) goto L_0x00cc
            goto L_0x00d5
        L_0x00cc:
            r12.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r13
            goto L_0x0235
        L_0x00d5:
            if (r2 == 0) goto L_0x00db
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r1
            goto L_0x00dc
        L_0x00db:
            r15 = r3
        L_0x00dc:
            r3 = 1
            if (r4 == 0) goto L_0x00e2
            r16 = r3
            goto L_0x00e4
        L_0x00e2:
            r16 = r5
        L_0x00e4:
            if (r6 == 0) goto L_0x00ed
            androidx.compose.material.u0 r1 = androidx.compose.material.C7937u0.f19083a
            androidx.compose.foundation.layout.i0 r1 = r1.mo11081a()
            r7 = r1
        L_0x00ed:
            if (r8 == 0) goto L_0x010e
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo14918M(r1)
            java.lang.Object r1 = r12.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r1 != r2) goto L_0x0108
            androidx.compose.foundation.interaction.g r1 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r12.mo14893C(r1)
        L_0x0108:
            r12.mo15002m0()
            androidx.compose.foundation.interaction.g r1 = (androidx.compose.foundation.interaction.C2243g) r1
            r13 = r1
        L_0x010e:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x011a
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r1, r2)
        L_0x011a:
            r1 = 1
            r2 = 0
            r4 = 0
            r6 = 6
            r0 = 6
            r8 = r3
            r3 = r4
            r5 = r12
            r17 = r7
            r7 = r0
            androidx.compose.foundation.a0 r2 = androidx.compose.material.ripple.C7922j.m25285e(r1, r2, r3, r5, r6, r7)
            r4 = 0
            r5 = 0
            r7 = 24
            r18 = 0
            r0 = r15
            r1 = r13
            r3 = r16
            r6 = r25
            r9 = r8
            r8 = r18
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8876c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            r2 = 0
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r1, r9, r2)
            float r19 = f7699e
            float r21 = f7700f
            float r20 = f7701g
            r22 = 0
            r23 = 8
            r24 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10091G(r18, r19, r20, r21, r22, r23, r24)
            r7 = r17
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10023j(r0, r7)
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17070q()
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r12.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r2 = r2.mo7630p()
            r6 = 48
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r1, r12, r6)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r12.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r12.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r5.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r6 = r12.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x01aa
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01aa:
            r12.mo14938T()
            boolean r6 = r12.mo14997l()
            if (r6 == 0) goto L_0x01b7
            r12.mo14947W(r8)
            goto L_0x01ba
        L_0x01b7:
            r12.mo14888A()
        L_0x01ba:
            r12.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r8 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r8)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            r12.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r12, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r3 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r4 = 6
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            r1 = 6
            androidx.compose.material.w1 r0 = r0.mo11077c(r12, r1)
            androidx.compose.ui.text.p0 r6 = r0.mo11101n()
            androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1 r8 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
            r0 = r8
            r1 = r16
            r2 = r30
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1190489496(0x46f56d98, float:31414.797)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r0, r9, r8)
            r1 = 48
            androidx.compose.material.TextKt.m14194a(r6, r0, r12, r1)
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0230
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0230:
            r4 = r7
            r5 = r13
            r2 = r15
            r3 = r16
        L_0x0235:
            androidx.compose.runtime.t1 r9 = r12.mo15020s()
            if (r9 != 0) goto L_0x023c
            goto L_0x024d
        L_0x023c:
            androidx.compose.material.MenuKt$DropdownMenuItemContent$3 r12 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$3
            r0 = r12
            r1 = r25
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r12)
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.m13567d(kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.foundation.layout.i0, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m13571h(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16497o r5, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16497o r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.mo47886t()
            int r1 = r5.mo47890x()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x0019
        L_0x0017:
            r0 = r3
            goto L_0x0053
        L_0x0019:
            int r0 = r6.mo47890x()
            int r1 = r5.mo47886t()
            if (r0 > r1) goto L_0x0025
            r0 = r2
            goto L_0x0053
        L_0x0025:
            int r0 = r6.mo47862G()
            if (r0 != 0) goto L_0x002c
            goto L_0x0017
        L_0x002c:
            int r0 = r5.mo47886t()
            int r1 = r6.mo47886t()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.mo47890x()
            int r4 = r6.mo47890x()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.mo47886t()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.mo47862G()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0053:
            int r1 = r6.mo47858B()
            int r4 = r5.mo47878j()
            if (r1 < r4) goto L_0x005f
        L_0x005d:
            r2 = r3
            goto L_0x0099
        L_0x005f:
            int r1 = r6.mo47878j()
            int r4 = r5.mo47858B()
            if (r1 > r4) goto L_0x006a
            goto L_0x0099
        L_0x006a:
            int r1 = r6.mo47885r()
            if (r1 != 0) goto L_0x0071
            goto L_0x005d
        L_0x0071:
            int r1 = r5.mo47858B()
            int r2 = r6.mo47858B()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.mo47878j()
            int r2 = r6.mo47878j()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.mo47858B()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.mo47885r()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x0099:
            long r5 = androidx.compose.p004ui.graphics.C15291p4.m66401a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.m13571h(androidx.compose.ui.unit.o, androidx.compose.ui.unit.o):long");
    }

    /* renamed from: i */
    public static final float m13572i() {
        return f7698d;
    }

    /* renamed from: j */
    public static final float m13573j() {
        return f7696b;
    }
}
