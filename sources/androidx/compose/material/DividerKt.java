package androidx.compose.material;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n154#2:70\n154#2:71\n174#2:73\n76#3:72\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n47#1:70\n48#1:71\n56#1:73\n56#1:72\n*E\n"})
public final class DividerKt {

    /* renamed from: a */
    public static final float f7640a = 0.12f;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13428a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r22, long r23, float r25, float r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r6 = r28
            r0 = -1249392198(0xffffffffb587c9ba, float:-1.0116994E-6)
            r1 = r27
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r22
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r22
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r22
            r4 = r6
        L_0x0029:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0040
            r5 = r29 & 2
            r7 = r23
            if (r5 != 0) goto L_0x003c
            boolean r5 = r1.mo14980g(r7)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
            goto L_0x0042
        L_0x0040:
            r7 = r23
        L_0x0042:
            r5 = r29 & 4
            if (r5 == 0) goto L_0x0049
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005c
            r9 = r25
            boolean r10 = r1.mo14968d(r9)
            if (r10 == 0) goto L_0x0058
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r10
            goto L_0x005e
        L_0x005c:
            r9 = r25
        L_0x005e:
            r10 = r29 & 8
            if (r10 == 0) goto L_0x0065
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r11 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0078
            r11 = r26
            boolean r12 = r1.mo14968d(r11)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r12
            goto L_0x007a
        L_0x0078:
            r11 = r26
        L_0x007a:
            r4 = r4 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r4 != r12) goto L_0x008f
            boolean r4 = r1.mo15011p()
            if (r4 != 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            r1.mo14958a0()
            r2 = r3
            r3 = r7
        L_0x008c:
            r5 = r11
            goto L_0x0161
        L_0x008f:
            r1.mo14930Q()
            r4 = r6 & 1
            r12 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00a5
            boolean r4 = r1.mo14977f0()
            if (r4 == 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            r1.mo14958a0()
            r2 = r3
            r3 = r7
            goto L_0x00dd
        L_0x00a5:
            if (r2 == 0) goto L_0x00aa
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ab
        L_0x00aa:
            r2 = r3
        L_0x00ab:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x00cc
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            r4 = 6
            androidx.compose.material.q r3 = r3.mo11075a(r1, r4)
            long r14 = r3.mo10970i()
            r16 = 1039516303(0x3df5c28f, float:0.12)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 14
            r21 = 0
            long r3 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r14, r16, r17, r18, r19, r20, r21)
            goto L_0x00cd
        L_0x00cc:
            r3 = r7
        L_0x00cd:
            if (r5 == 0) goto L_0x00d5
            float r5 = (float) r13
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r9 = r5
        L_0x00d5:
            if (r10 == 0) goto L_0x00dd
            float r5 = (float) r12
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r11 = r5
        L_0x00dd:
            r1.mo14899E()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x00ec
            r5 = -1
            java.lang.String r7 = "androidx.compose.material.Divider (Divider.kt:43)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r5, r7)
        L_0x00ec:
            r0 = 0
            int r5 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00f3
            r5 = r13
            goto L_0x00f4
        L_0x00f3:
            r5 = r12
        L_0x00f4:
            if (r5 != 0) goto L_0x0108
            androidx.compose.ui.m$a r14 = androidx.compose.p004ui.C8767m.f23478j
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 14
            r20 = 0
            r15 = r11
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x010a
        L_0x0108:
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
        L_0x010a:
            r7 = 1228914189(0x493fbe0d, float:785376.8)
            r1.mo14918M(r7)
            androidx.compose.ui.unit.g$a r7 = androidx.compose.p004ui.unit.C16483g.f40871b
            float r7 = r7.mo47826a()
            boolean r7 = androidx.compose.p004ui.unit.C16483g.m74440e0(r9, r7)
            if (r7 == 0) goto L_0x0132
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            float r7 = r7.getDensity()
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 / r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            goto L_0x0133
        L_0x0132:
            r7 = r9
        L_0x0133:
            r1.mo15002m0()
            androidx.compose.ui.m r5 = r2.mo17224k3(r5)
            r8 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r0, r13, r8)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r7)
            r5 = 0
            r7 = 2
            r22 = r0
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8825d(r22, r23, r25, r26, r27)
            androidx.compose.foundation.layout.BoxKt.m9839a(r0, r1, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x008c
        L_0x0161:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x0168
            goto L_0x0178
        L_0x0168:
            androidx.compose.material.DividerKt$Divider$1 r10 = new androidx.compose.material.DividerKt$Divider$1
            r0 = r10
            r1 = r2
            r2 = r3
            r4 = r9
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.mo15202a(r10)
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DividerKt.m13428a(androidx.compose.ui.m, long, float, float, androidx.compose.runtime.o, int, int):void");
    }
}
