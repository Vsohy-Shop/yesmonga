package com.skydoves.landscapist;

import androidx.compose.p004ui.graphics.C15211f3;
import androidx.core.util.C17997q;
import org.jetbrains.annotations.C12579k;

public final /* synthetic */ class Shimmer__ShimmerKt {
    @C12579k

    /* renamed from: a */
    public static final C17997q.C17999b<C15211f3> f86781a = new C17997q.C17999b<>(2);

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f6  */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145590a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r21, long r22, long r24, float r26, float r27, float r28, int r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r10 = r31
            r0 = 460361593(0x1b708f79, float:1.9898693E-22)
            r1 = r30
            androidx.compose.runtime.o r0 = r1.mo15009o(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0015
            r3 = r10 | 6
            r4 = r3
            r3 = r21
            goto L_0x0029
        L_0x0015:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r21
            boolean r4 = r0.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r10
            goto L_0x0029
        L_0x0026:
            r3 = r21
            r4 = r10
        L_0x0029:
            r5 = r32 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
            r7 = r22
            goto L_0x0044
        L_0x0032:
            r5 = r10 & 112(0x70, float:1.57E-43)
            r7 = r22
            if (r5 != 0) goto L_0x0044
            boolean r5 = r0.mo14980g(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r4 = r4 | r5
        L_0x0044:
            r5 = r32 & 4
            if (r5 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
            r14 = r24
            goto L_0x005f
        L_0x004d:
            r5 = r10 & 896(0x380, float:1.256E-42)
            r14 = r24
            if (r5 != 0) goto L_0x005f
            boolean r5 = r0.mo14980g(r14)
            if (r5 == 0) goto L_0x005c
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r5
        L_0x005f:
            r5 = r32 & 8
            if (r5 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0079
            r9 = r26
            boolean r11 = r0.mo14968d(r9)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r11
            goto L_0x007b
        L_0x0079:
            r9 = r26
        L_0x007b:
            r11 = r32 & 16
            if (r11 == 0) goto L_0x0082
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0082:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x0097
            r12 = r27
            boolean r13 = r0.mo14968d(r12)
            if (r13 == 0) goto L_0x0093
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r13
            goto L_0x0099
        L_0x0097:
            r12 = r27
        L_0x0099:
            r13 = r32 & 32
            if (r13 == 0) goto L_0x00a4
            r16 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r16
            r6 = r28
            goto L_0x00b9
        L_0x00a4:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            r6 = r28
            if (r16 != 0) goto L_0x00b9
            boolean r16 = r0.mo14968d(r6)
            if (r16 == 0) goto L_0x00b5
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r4 = r4 | r16
        L_0x00b9:
            r16 = r32 & 64
            if (r16 == 0) goto L_0x00c4
            r17 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r17
            r2 = r29
            goto L_0x00d9
        L_0x00c4:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r10 & r17
            r2 = r29
            if (r17 != 0) goto L_0x00d9
            boolean r18 = r0.mo14976f(r2)
            if (r18 == 0) goto L_0x00d5
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r4 = r4 | r18
        L_0x00d9:
            r18 = 2995931(0x2db6db, float:4.198194E-39)
            r18 = r4 & r18
            r19 = 599186(0x92492, float:8.39638E-40)
            r18 = r18 ^ r19
            if (r18 != 0) goto L_0x00f6
            boolean r18 = r0.mo15011p()
            if (r18 != 0) goto L_0x00ec
            goto L_0x00f6
        L_0x00ec:
            r0.mo14958a0()
            r1 = r3
            r8 = r6
            r6 = r9
            r7 = r12
            r9 = r2
            goto L_0x025b
        L_0x00f6:
            if (r1 == 0) goto L_0x00fb
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00fc
        L_0x00fb:
            r1 = r3
        L_0x00fc:
            r3 = 0
            if (r5 == 0) goto L_0x0100
            r9 = r3
        L_0x0100:
            if (r11 == 0) goto L_0x0105
            r5 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0106
        L_0x0105:
            r5 = r12
        L_0x0106:
            if (r13 == 0) goto L_0x010a
            r6 = 1101004800(0x41a00000, float:20.0)
        L_0x010a:
            if (r16 == 0) goto L_0x010e
            r2 = 650(0x28a, float:9.11E-43)
        L_0x010e:
            r11 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.mo14918M(r11)
            java.lang.Object r11 = r0.mo14921N()
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            r13 = 0
            if (r11 != r12) goto L_0x0129
            r12 = 2
            androidx.compose.animation.core.Animatable r11 = androidx.compose.animation.core.C1946b.m8288b(r3, r3, r12, r13)
            r0.mo14893C(r11)
        L_0x0129:
            r0.mo15002m0()
            r12 = r11
            androidx.compose.animation.core.Animatable r12 = (androidx.compose.animation.core.Animatable) r12
            androidx.compose.ui.graphics.j2 r11 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r22)
            com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$1 r3 = new com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$1
            r3.<init>(r12, r2, r13)
            int r16 = r4 >> 3
            r13 = r16 & 14
            androidx.compose.runtime.EffectsKt.m29896h(r11, r3, r0, r13)
            r3 = r4 & 14
            r4 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r0.mo14918M(r4)
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r4 = r4.mo17061C()
            int r11 = r3 >> 3
            r13 = r11 & 14
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | r13
            r13 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r13, r0, r11)
            int r11 = r3 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r13 = 1376089394(0x52057532, float:1.43299215E11)
            r0.mo14918M(r13)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r0.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            r27 = r2
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r0.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r0.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r8.mo44585a()
            r28 = r12
            kotlin.jvm.functions.q r12 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            int r11 = r11 << 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r20 = r1
            r1 = 6
            r11 = r11 | r1
            androidx.compose.runtime.d r1 = r0.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x01a2
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01a2:
            r0.mo14938T()
            boolean r1 = r0.mo14997l()
            if (r1 == 0) goto L_0x01af
            r0.mo14947W(r10)
            goto L_0x01b2
        L_0x01af:
            r0.mo14888A()
        L_0x01b2:
            r0.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r0)
            kotlin.jvm.functions.p r10 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r4, r10)
            kotlin.jvm.functions.p r4 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r13, r4)
            kotlin.jvm.functions.p r4 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r2, r4)
            kotlin.jvm.functions.p r2 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r7, r2)
            r0.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r0)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            int r2 = r11 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.invoke(r1, r0, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo14918M(r1)
            int r1 = r11 >> 9
            r1 = r1 & 14
            r2 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r0.mo14918M(r2)
            r1 = r1 & 11
            r2 = 2
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x020c
            boolean r1 = r0.mo15011p()
            if (r1 != 0) goto L_0x0208
            goto L_0x020c
        L_0x0208:
            r0.mo14958a0()
            goto L_0x0245
        L_0x020c:
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r1 = 6
            int r2 = r3 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r1
            r1 = r2 & 81
            r2 = 16
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0226
            boolean r1 = r0.mo15011p()
            if (r1 != 0) goto L_0x0222
            goto L_0x0226
        L_0x0222:
            r0.mo14958a0()
            goto L_0x0245
        L_0x0226:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10112l(r1, r4, r2, r3)
            com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$2$1 r2 = new com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$2$1
            r11 = r2
            r3 = r28
            r12 = r6
            r13 = r3
            r14 = r22
            r16 = r24
            r18 = r9
            r19 = r5
            r11.<init>(r12, r13, r14, r16, r18, r19)
            r3 = 6
            androidx.compose.foundation.CanvasKt.m8873b(r1, r2, r0, r3)
        L_0x0245:
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            r7 = r5
            r8 = r6
            r6 = r9
            r1 = r20
            r9 = r27
        L_0x025b:
            androidx.compose.runtime.t1 r12 = r0.mo15020s()
            if (r12 != 0) goto L_0x0262
            goto L_0x0273
        L_0x0262:
            com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$3 r13 = new com.skydoves.landscapist.Shimmer__ShimmerKt$Shimmer$3
            r0 = r13
            r2 = r22
            r4 = r24
            r10 = r31
            r11 = r32
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.landscapist.Shimmer__ShimmerKt.m145590a(androidx.compose.ui.m, long, long, float, float, float, int, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final float m145593d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }
}
