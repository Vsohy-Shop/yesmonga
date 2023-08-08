package androidx.compose.material3;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n154#2:162\n25#3:163\n25#3:170\n36#3:178\n25#3:185\n1114#4,6:164\n1114#4,6:171\n1114#4,6:179\n1114#4,6:186\n76#5:177\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n*L\n78#1:162\n82#1:163\n86#1:170\n91#1:178\n147#1:185\n82#1:164,6\n86#1:171,6\n91#1:179,6\n147#1:186,6\n87#1:177\n*E\n"})
public final class AndroidMenu_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: kotlin.jvm.functions.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25378a(boolean r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, long r29, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.window.C16547h r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r7 = r27
            r8 = r32
            r9 = r34
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 354826666(0x152639aa, float:3.3568922E-26)
            r1 = r33
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r35 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 6
            r11 = r26
            goto L_0x0034
        L_0x0022:
            r1 = r9 & 14
            r11 = r26
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.mo14961b(r11)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r9
            goto L_0x0034
        L_0x0033:
            r1 = r9
        L_0x0034:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.mo14927P(r7)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r1 = r1 | r3
        L_0x004b:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0065
            r4 = r28
            boolean r5 = r10.mo15006n0(r4)
            if (r5 == 0) goto L_0x0061
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r5
            goto L_0x0067
        L_0x0065:
            r4 = r28
        L_0x0067:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r12 = r29
            goto L_0x0082
        L_0x0070:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r12 = r29
            if (r6 != 0) goto L_0x0082
            boolean r6 = r10.mo14980g(r12)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r6
        L_0x0082:
            r6 = r35 & 16
            if (r6 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009e
            r14 = r31
            boolean r15 = r10.mo15006n0(r14)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r15
            goto L_0x00a0
        L_0x009e:
            r14 = r31
        L_0x00a0:
            r15 = r35 & 32
            if (r15 == 0) goto L_0x00a8
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a6:
            r1 = r1 | r15
            goto L_0x00b9
        L_0x00a8:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00b9
            boolean r15 = r10.mo14927P(r8)
            if (r15 == 0) goto L_0x00b6
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00b6:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a6
        L_0x00b9:
            r15 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r15
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x00d2
            boolean r1 = r10.mo15011p()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r10.mo14958a0()
            r3 = r4
            r4 = r12
            r6 = r14
            goto L_0x01ea
        L_0x00d2:
            if (r3 == 0) goto L_0x00d9
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r1
            goto L_0x00db
        L_0x00d9:
            r16 = r4
        L_0x00db:
            if (r5 == 0) goto L_0x00ec
            r1 = 0
            float r1 = (float) r1
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            long r1 = androidx.compose.p004ui.unit.C16485h.m74482a(r2, r1)
            r12 = r1
        L_0x00ec:
            if (r6 == 0) goto L_0x0106
            androidx.compose.ui.window.h r1 = new androidx.compose.ui.window.h
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r25 = 0
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = r1
        L_0x0106:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0112
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r1, r2)
        L_0x0112:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r0)
            java.lang.Object r1 = r10.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r2.mo16277a()
            if (r1 != r3) goto L_0x012e
            androidx.compose.animation.core.o0 r1 = new androidx.compose.animation.core.o0
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.<init>(r3)
            r10.mo14893C(r1)
        L_0x012e:
            r10.mo15002m0()
            androidx.compose.animation.core.o0 r1 = (androidx.compose.animation.core.C1998o0) r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r1.mo6949g(r3)
            java.lang.Object r3 = r1.mo6943a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0152
            java.lang.Object r3 = r1.mo6944b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01dd
        L_0x0152:
            r10.mo14918M(r0)
            java.lang.Object r0 = r10.mo14921N()
            java.lang.Object r3 = r2.mo16277a()
            if (r0 != r3) goto L_0x0172
            androidx.compose.ui.graphics.o4$a r0 = androidx.compose.p004ui.graphics.C15283o4.f37618b
            long r3 = r0.mo42933a()
            androidx.compose.ui.graphics.o4 r0 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r3)
            r3 = 0
            r4 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r3, r4, r3)
            r10.mo14893C(r0)
        L_0x0172:
            r10.mo15002m0()
            r3 = r0
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r10.mo15032w(r0)
            r20 = r0
            androidx.compose.ui.unit.d r20 = (androidx.compose.p004ui.unit.C16479d) r20
            r0 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r0)
            boolean r0 = r10.mo15006n0(r3)
            java.lang.Object r4 = r10.mo14921N()
            if (r0 != 0) goto L_0x019a
            java.lang.Object r0 = r2.mo16277a()
            if (r4 != r0) goto L_0x01a2
        L_0x019a:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 r4 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            r4.<init>(r3)
            r10.mo14893C(r4)
        L_0x01a2:
            r10.mo15002m0()
            r21 = r4
            kotlin.jvm.functions.p r21 = (kotlin.jvm.functions.C11304p) r21
            r22 = 0
            androidx.compose.material3.DropdownMenuPositionProvider r6 = new androidx.compose.material3.DropdownMenuPositionProvider
            r17 = r6
            r18 = r12
            r17.<init>(r18, r20, r21, r22)
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1 r5 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
            r0 = r5
            r2 = r3
            r3 = r16
            r4 = r32
            r7 = r5
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1192563503(0xffffffffb8eaecd1, float:-1.12021E-4)
            r1 = 1
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r0, r1, r7)
            r0 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r15 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r7 = 0
            r0 = r6
            r1 = r27
            r2 = r14
            r4 = r10
            r6 = r7
            androidx.compose.p004ui.window.AndroidPopup_androidKt.m74868a(r0, r1, r2, r3, r4, r5, r6)
        L_0x01dd:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01e6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01e6:
            r4 = r12
            r6 = r14
            r3 = r16
        L_0x01ea:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x01f1
            goto L_0x0204
        L_0x01f1:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2 r12 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
            r0 = r12
            r1 = r26
            r2 = r27
            r7 = r32
            r8 = r34
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r10.mo15202a(r12)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.m25378a(boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, long, androidx.compose.ui.window.h, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25379b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r39, boolean r40, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8234k1 r41, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r42, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r11 = r35
            r12 = r36
            r13 = r45
            r14 = r46
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            r1 = r44
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r10.mo14927P(r11)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r10.mo14927P(r12)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0063
            r3 = r37
            boolean r4 = r10.mo15006n0(r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
            goto L_0x0065
        L_0x0063:
            r3 = r37
        L_0x0065:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r38
            boolean r6 = r10.mo14927P(r5)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r6
            goto L_0x0081
        L_0x007f:
            r5 = r38
        L_0x0081:
            r6 = r14 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r8 = r13 & r7
            if (r8 != 0) goto L_0x009e
            r8 = r39
            boolean r9 = r10.mo14927P(r8)
            if (r9 == 0) goto L_0x009a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r9
            goto L_0x00a0
        L_0x009e:
            r8 = r39
        L_0x00a0:
            r9 = r14 & 32
            r31 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00aa
            r15 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r15
            goto L_0x00be
        L_0x00aa:
            r15 = r13 & r31
            if (r15 != 0) goto L_0x00be
            r15 = r40
            boolean r16 = r10.mo14961b(r15)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r16
            goto L_0x00c0
        L_0x00be:
            r15 = r40
        L_0x00c0:
            r32 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r32
            if (r16 != 0) goto L_0x00da
            r16 = r14 & 64
            r7 = r41
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r10.mo15006n0(r7)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r16
            goto L_0x00dc
        L_0x00da:
            r7 = r41
        L_0x00dc:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r33 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e9
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r42
            goto L_0x00fc
        L_0x00e9:
            r16 = r13 & r33
            r3 = r42
            if (r16 != 0) goto L_0x00fc
            boolean r16 = r10.mo15006n0(r3)
            if (r16 == 0) goto L_0x00f8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r16
        L_0x00fc:
            r3 = r14 & 256(0x100, float:3.59E-43)
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0109
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            r5 = r43
            goto L_0x011c
        L_0x0109:
            r16 = r13 & r34
            r5 = r43
            if (r16 != 0) goto L_0x011c
            boolean r16 = r10.mo15006n0(r5)
            if (r16 == 0) goto L_0x0118
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r1 = r1 | r16
        L_0x011c:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r5 = r1 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r7) goto L_0x0140
            boolean r5 = r10.mo15011p()
            if (r5 != 0) goto L_0x012d
            goto L_0x0140
        L_0x012d:
            r10.mo14958a0()
            r3 = r37
            r4 = r38
            r7 = r41
            r9 = r43
            r5 = r8
            r23 = r10
            r6 = r15
            r8 = r42
            goto L_0x023c
        L_0x0140:
            r10.mo14930Q()
            r5 = r13 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r5 == 0) goto L_0x0169
            boolean r5 = r10.mo14977f0()
            if (r5 == 0) goto L_0x0151
            goto L_0x0169
        L_0x0151:
            r10.mo14958a0()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0159
            r1 = r1 & r7
        L_0x0159:
            r16 = r38
            r19 = r41
            r20 = r42
            r21 = r43
            r17 = r8
            r18 = r15
            r15 = r37
            goto L_0x01de
        L_0x0169:
            if (r2 == 0) goto L_0x016e
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0170
        L_0x016e:
            r2 = r37
        L_0x0170:
            r5 = 0
            if (r4 == 0) goto L_0x0175
            r4 = r5
            goto L_0x0177
        L_0x0175:
            r4 = r38
        L_0x0177:
            if (r6 == 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r5 = r8
        L_0x017b:
            if (r9 == 0) goto L_0x017f
            r6 = 1
            goto L_0x0180
        L_0x017f:
            r6 = r15
        L_0x0180:
            r8 = r14 & 64
            if (r8 == 0) goto L_0x019e
            androidx.compose.material3.j1 r15 = androidx.compose.material3.C8228j1.f20233a
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 1572864(0x180000, float:2.204052E-39)
            r30 = 63
            r28 = r10
            androidx.compose.material3.k1 r8 = r15.mo12716b(r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r1 = r1 & r7
            goto L_0x01a0
        L_0x019e:
            r8 = r41
        L_0x01a0:
            if (r0 == 0) goto L_0x01a9
            androidx.compose.material3.j1 r0 = androidx.compose.material3.C8228j1.f20233a
            androidx.compose.foundation.layout.i0 r0 = r0.mo12715a()
            goto L_0x01ab
        L_0x01a9:
            r0 = r42
        L_0x01ab:
            if (r3 == 0) goto L_0x01d1
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r3)
            java.lang.Object r3 = r10.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r3 != r7) goto L_0x01c6
            androidx.compose.foundation.interaction.g r3 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r10.mo14893C(r3)
        L_0x01c6:
            r10.mo15002m0()
            androidx.compose.foundation.interaction.g r3 = (androidx.compose.foundation.interaction.C2243g) r3
            r20 = r0
            r15 = r2
            r21 = r3
            goto L_0x01d6
        L_0x01d1:
            r21 = r43
            r20 = r0
            r15 = r2
        L_0x01d6:
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r8
        L_0x01de:
            r10.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01f0
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)"
            r3 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x01f0:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r31
            r0 = r0 | r2
            r2 = r1 & r32
            r0 = r0 | r2
            r2 = r1 & r33
            r0 = r0 | r2
            r1 = r1 & r34
            r22 = r0 | r1
            r0 = r35
            r1 = r36
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r10
            r23 = r10
            r10 = r22
            androidx.compose.material3.MenuKt.m25871d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x022f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x022f:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
        L_0x023c:
            androidx.compose.runtime.t1 r15 = r23.mo15020s()
            if (r15 != 0) goto L_0x0243
            goto L_0x0255
        L_0x0243:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2 r10 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
            r0 = r10
            r1 = r35
            r2 = r36
            r12 = r10
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.mo15202a(r12)
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.m25379b(kotlin.jvm.functions.p, kotlin.jvm.functions.a, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, androidx.compose.material3.k1, androidx.compose.foundation.layout.i0, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }
}
