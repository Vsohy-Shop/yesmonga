package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8578k2;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,753:1\n25#2:754\n25#2:761\n1114#3,6:755\n1114#3,6:762\n76#4:768\n154#5:769\n154#5:770\n154#5:771\n154#5:772\n154#5:773\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n92#1:754\n189#1:761\n92#1:755,6\n189#1:762,6\n99#1:768\n723#1:769\n728#1:770\n733#1:771\n738#1:772\n753#1:773\n*E\n"})
public final class ChipKt {

    /* renamed from: a */
    public static final float f7577a = C16483g.m74435M((float) 12);

    /* renamed from: b */
    public static final float f7578b = C16483g.m74435M((float) 4);

    /* renamed from: c */
    public static final float f7579c;

    /* renamed from: d */
    public static final float f7580d;

    /* renamed from: e */
    public static final float f7581e = 0.12f;

    /* renamed from: f */
    public static final float f7582f = 0.16f;

    /* renamed from: g */
    public static final float f7583g = C16483g.m74435M((float) 24);

    static {
        float f = (float) 8;
        f7579c = C16483g.m74435M(f);
        f7580d = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13370a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, boolean r36, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r37, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r38, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2223i r39, @org.jetbrains.annotations.C12580l androidx.compose.material.C7886o r40, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r42, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r15 = r34
            r14 = r42
            r13 = r44
            r12 = r45
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -368396408(0xffffffffea0ab788, float:-4.1924616E25)
            r1 = r43
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo14927P(r15)
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
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r35
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r35
        L_0x004e:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r36
            boolean r6 = r11.mo14961b(r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r6
            goto L_0x006a
        L_0x0068:
            r5 = r36
        L_0x006a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0084
            r7 = r37
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0080
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r8
            goto L_0x0086
        L_0x0084:
            r7 = r37
        L_0x0086:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a1
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009b
            r8 = r38
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x009d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r8 = r38
        L_0x009d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r9
            goto L_0x00a3
        L_0x00a1:
            r8 = r38
        L_0x00a3:
            r9 = r12 & 32
            if (r9 == 0) goto L_0x00ab
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00c0
        L_0x00ab:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00c0
            r10 = r39
            boolean r16 = r11.mo15006n0(r10)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r16
            goto L_0x00c2
        L_0x00c0:
            r10 = r39
        L_0x00c2:
            r32 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r32
            if (r16 != 0) goto L_0x00dc
            r16 = r12 & 64
            r0 = r40
            if (r16 != 0) goto L_0x00d7
            boolean r16 = r11.mo15006n0(r0)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r16
            goto L_0x00de
        L_0x00dc:
            r0 = r40
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r41
            goto L_0x00fe
        L_0x00e9:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r13 & r16
            r3 = r41
            if (r16 != 0) goto L_0x00fe
            boolean r16 = r11.mo14927P(r3)
            if (r16 == 0) goto L_0x00fa
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r16
        L_0x00fe:
            r3 = r12 & 256(0x100, float:3.59E-43)
            r33 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0108
            r3 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0106:
            r1 = r1 | r3
            goto L_0x0118
        L_0x0108:
            r3 = r13 & r33
            if (r3 != 0) goto L_0x0118
            boolean r3 = r11.mo14927P(r14)
            if (r3 == 0) goto L_0x0115
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0115:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0106
        L_0x0118:
            r3 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r3 & r1
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x013a
            boolean r3 = r11.mo15011p()
            if (r3 != 0) goto L_0x0128
            goto L_0x013a
        L_0x0128:
            r11.mo14958a0()
            r2 = r35
            r3 = r36
            r4 = r7
            r5 = r8
            r6 = r10
            r26 = r11
            r7 = r40
            r8 = r41
            goto L_0x02af
        L_0x013a:
            r11.mo14930Q()
            r3 = r13 & 1
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 1
            if (r3 == 0) goto L_0x016d
            boolean r3 = r11.mo14977f0()
            if (r3 == 0) goto L_0x014c
            goto L_0x016d
        L_0x014c:
            r11.mo14958a0()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0155
            r1 = r1 & r16
        L_0x0155:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x015d
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x015d:
            r9 = r36
            r19 = r41
            r16 = r7
            r17 = r8
            r18 = r10
            r10 = r35
            r8 = r40
            goto L_0x01f7
        L_0x016d:
            if (r2 == 0) goto L_0x0172
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0174
        L_0x0172:
            r2 = r35
        L_0x0174:
            if (r4 == 0) goto L_0x0178
            r3 = r5
            goto L_0x017a
        L_0x0178:
            r3 = r36
        L_0x017a:
            if (r6 == 0) goto L_0x019b
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r4)
            java.lang.Object r4 = r11.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r4 != r6) goto L_0x0195
            androidx.compose.foundation.interaction.g r4 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r4)
        L_0x0195:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r4 = (androidx.compose.foundation.interaction.C2243g) r4
            goto L_0x019c
        L_0x019b:
            r4 = r7
        L_0x019c:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x01b8
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            r7 = 6
            androidx.compose.material.f1 r6 = r6.mo11076b(r11, r7)
            androidx.compose.foundation.shape.e r6 = r6.mo10758e()
            r7 = 50
            androidx.compose.foundation.shape.f r7 = androidx.compose.foundation.shape.C2685g.m12117b(r7)
            androidx.compose.foundation.shape.e r6 = r6.mo9168b(r7)
            r1 = r1 & r16
            goto L_0x01b9
        L_0x01b8:
            r6 = r8
        L_0x01b9:
            if (r9 == 0) goto L_0x01bc
            r10 = 0
        L_0x01bc:
            r7 = r12 & 64
            if (r7 == 0) goto L_0x01dd
            androidx.compose.material.p r16 = androidx.compose.material.C7890p.f18900a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 1572864(0x180000, float:2.204052E-39)
            r31 = 63
            r29 = r11
            androidx.compose.material.o r7 = r16.mo10904a(r17, r19, r21, r23, r25, r27, r29, r30, r31)
            r8 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r8
            goto L_0x01df
        L_0x01dd:
            r7 = r40
        L_0x01df:
            if (r0 == 0) goto L_0x01ec
            r9 = r3
            r16 = r4
            r17 = r6
            r8 = r7
            r18 = r10
            r19 = 0
            goto L_0x01f6
        L_0x01ec:
            r19 = r41
            r9 = r3
            r16 = r4
            r17 = r6
            r8 = r7
            r18 = r10
        L_0x01f6:
            r10 = r2
        L_0x01f7:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0209
            r0 = -1
            java.lang.String r2 = "androidx.compose.material.Chip (Chip.kt:87)"
            r3 = -368396408(0xffffffffea0ab788, float:-4.1924616E25)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0209:
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r2 = r1 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            androidx.compose.runtime.k2 r2 = r8.mo10893b(r9, r11, r0)
            r3 = 0
            androidx.compose.material.ChipKt$Chip$2 r4 = androidx.compose.material.ChipKt$Chip$2.f7584f
            r6 = 0
            androidx.compose.ui.m r3 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r10, r3, r4, r5, r6)
            androidx.compose.runtime.k2 r0 = r8.mo10892a(r9, r11, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r6 = r0.mo42833M()
            long r20 = m13371b(r2)
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            long r20 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r20, r22, r23, r24, r25, r26, r27)
            r22 = 0
            androidx.compose.material.ChipKt$Chip$3 r0 = new androidx.compose.material.ChipKt$Chip$3
            r35 = r0
            r36 = r2
            r37 = r19
            r38 = r8
            r39 = r9
            r40 = r1
            r41 = r42
            r35.<init>(r36, r37, r38, r39, r40, r41)
            r2 = 139076687(0x84a244f, float:6.0829844E-34)
            androidx.compose.runtime.internal.a r23 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r5, r0)
            r0 = r1 & 14
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r2 = r1 >> 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 << 3
            r2 = r2 & r32
            r0 = r0 | r2
            int r1 = r1 << 15
            r1 = r1 & r33
            r24 = r0 | r1
            r25 = 128(0x80, float:1.794E-43)
            r0 = r34
            r1 = r3
            r2 = r9
            r3 = r17
            r4 = r6
            r6 = r20
            r20 = r8
            r8 = r18
            r21 = r9
            r9 = r22
            r22 = r10
            r10 = r16
            r26 = r11
            r11 = r23
            r12 = r26
            r13 = r24
            r14 = r25
            androidx.compose.material.SurfaceKt.m13880c(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a1:
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r19
            r7 = r20
            r3 = r21
            r2 = r22
        L_0x02af:
            androidx.compose.runtime.t1 r12 = r26.mo15020s()
            if (r12 != 0) goto L_0x02b6
            goto L_0x02c7
        L_0x02b6:
            androidx.compose.material.ChipKt$Chip$4 r13 = new androidx.compose.material.ChipKt$Chip$4
            r0 = r13
            r1 = r34
            r9 = r42
            r10 = r44
            r11 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x02c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.m13370a(kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, androidx.compose.ui.graphics.g4, androidx.compose.foundation.i, androidx.compose.material.o, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final long m13371b(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13372c(boolean r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r45, boolean r46, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r47, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r48, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2223i r49, @org.jetbrains.annotations.C12580l androidx.compose.material.C3039e1 r50, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r51, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r52, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r54, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r55, int r56, int r57, int r58) {
        /*
            r15 = r43
            r14 = r44
            r12 = r54
            r11 = r56
            r10 = r58
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1259208246(0xffffffffb4f201ca, float:-4.5077314E-7)
            r1 = r55
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r11 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r9.mo14961b(r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r11
            goto L_0x0034
        L_0x0033:
            r1 = r11
        L_0x0034:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r9.mo14927P(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r45
            boolean r8 = r9.mo15006n0(r7)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r8
            goto L_0x0067
        L_0x0065:
            r7 = r45
        L_0x0067:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006e:
            r13 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r46
            boolean r16 = r9.mo14961b(r13)
            if (r16 == 0) goto L_0x007d
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r16
            goto L_0x0084
        L_0x0082:
            r13 = r46
        L_0x0084:
            r16 = r10 & 16
            r38 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x0090
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r2 = r47
            goto L_0x00a3
        L_0x0090:
            r17 = r11 & r38
            r2 = r47
            if (r17 != 0) goto L_0x00a3
            boolean r17 = r9.mo15006n0(r2)
            if (r17 == 0) goto L_0x009f
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r1 = r1 | r17
        L_0x00a3:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00bd
            r17 = r10 & 32
            r3 = r48
            if (r17 != 0) goto L_0x00b8
            boolean r18 = r9.mo15006n0(r3)
            if (r18 == 0) goto L_0x00b8
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r18
            goto L_0x00bf
        L_0x00bd:
            r3 = r48
        L_0x00bf:
            r18 = r10 & 64
            if (r18 == 0) goto L_0x00ca
            r19 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r19
            r5 = r49
            goto L_0x00df
        L_0x00ca:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r11 & r19
            r5 = r49
            if (r19 != 0) goto L_0x00df
            boolean r20 = r9.mo15006n0(r5)
            if (r20 == 0) goto L_0x00db
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r20
        L_0x00df:
            r39 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r11 & r39
            if (r20 != 0) goto L_0x00fb
            r6 = r10 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x00f4
            r6 = r50
            boolean r21 = r9.mo15006n0(r6)
            if (r21 == 0) goto L_0x00f6
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f4:
            r6 = r50
        L_0x00f6:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r1 = r1 | r21
            goto L_0x00fd
        L_0x00fb:
            r6 = r50
        L_0x00fd:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0108
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r21
            r2 = r51
            goto L_0x011d
        L_0x0108:
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r21 = r11 & r21
            r2 = r51
            if (r21 != 0) goto L_0x011d
            boolean r21 = r9.mo14927P(r2)
            if (r21 == 0) goto L_0x0119
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r1 = r1 | r21
        L_0x011d:
            r2 = r10 & 512(0x200, float:7.175E-43)
            r40 = 1879048192(0x70000000, float:1.58456325E29)
            if (r2 == 0) goto L_0x012a
            r21 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r21
            r3 = r52
            goto L_0x013d
        L_0x012a:
            r21 = r11 & r40
            r3 = r52
            if (r21 != 0) goto L_0x013d
            boolean r21 = r9.mo14927P(r3)
            if (r21 == 0) goto L_0x0139
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013b
        L_0x0139:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013b:
            r1 = r1 | r21
        L_0x013d:
            r3 = r10 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0146
            r17 = r57 | 6
            r5 = r53
            goto L_0x015c
        L_0x0146:
            r21 = r57 & 14
            r5 = r53
            if (r21 != 0) goto L_0x015a
            boolean r21 = r9.mo14927P(r5)
            if (r21 == 0) goto L_0x0155
            r17 = 4
            goto L_0x0157
        L_0x0155:
            r17 = 2
        L_0x0157:
            r17 = r57 | r17
            goto L_0x015c
        L_0x015a:
            r17 = r57
        L_0x015c:
            r5 = r10 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0163
            r5 = r17 | 48
            goto L_0x0177
        L_0x0163:
            r5 = r57 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0175
            boolean r5 = r9.mo14927P(r12)
            if (r5 == 0) goto L_0x0170
            r5 = 32
            goto L_0x0172
        L_0x0170:
            r5 = 16
        L_0x0172:
            r5 = r17 | r5
            goto L_0x0177
        L_0x0175:
            r5 = r17
        L_0x0177:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r1 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x01a5
            r6 = r5 & 91
            r7 = 18
            if (r6 != r7) goto L_0x01a5
            boolean r6 = r9.mo15011p()
            if (r6 != 0) goto L_0x018e
            goto L_0x01a5
        L_0x018e:
            r9.mo14958a0()
            r3 = r45
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r10 = r52
            r11 = r53
            r0 = r9
            r4 = r13
            r9 = r51
            goto L_0x0360
        L_0x01a5:
            r9.mo14930Q()
            r6 = r11 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r6 == 0) goto L_0x01db
            boolean r6 = r9.mo14977f0()
            if (r6 == 0) goto L_0x01b6
            goto L_0x01db
        L_0x01b6:
            r9.mo14958a0()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x01bf
            r1 = r1 & r17
        L_0x01bf:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01c7
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01c7:
            r8 = r45
            r28 = r47
            r29 = r48
            r30 = r49
            r6 = r50
            r31 = r51
            r32 = r52
            r33 = r53
            r4 = r1
            r7 = r13
            goto L_0x0285
        L_0x01db:
            if (r4 == 0) goto L_0x01e0
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01e2
        L_0x01e0:
            r4 = r45
        L_0x01e2:
            if (r8 == 0) goto L_0x01e5
            r13 = 1
        L_0x01e5:
            if (r16 == 0) goto L_0x0206
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r6)
            java.lang.Object r6 = r9.mo14921N()
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r6 != r8) goto L_0x0200
            androidx.compose.foundation.interaction.g r6 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r9.mo14893C(r6)
        L_0x0200:
            r9.mo15002m0()
            androidx.compose.foundation.interaction.g r6 = (androidx.compose.foundation.interaction.C2243g) r6
            goto L_0x0208
        L_0x0206:
            r6 = r47
        L_0x0208:
            r8 = r10 & 32
            if (r8 == 0) goto L_0x0224
            androidx.compose.material.t0 r8 = androidx.compose.material.C7933t0.f19075a
            r7 = 6
            androidx.compose.material.f1 r7 = r8.mo11076b(r9, r7)
            androidx.compose.foundation.shape.e r7 = r7.mo10758e()
            r8 = 50
            androidx.compose.foundation.shape.f r8 = androidx.compose.foundation.shape.C2685g.m12117b(r8)
            androidx.compose.foundation.shape.e r7 = r7.mo9168b(r8)
            r1 = r1 & r17
            goto L_0x0226
        L_0x0224:
            r7 = r48
        L_0x0226:
            if (r18 == 0) goto L_0x022a
            r8 = 0
            goto L_0x022c
        L_0x022a:
            r8 = r49
        L_0x022c:
            r45 = r4
            r4 = r10 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0256
            androidx.compose.material.p r16 = androidx.compose.material.C7890p.f18900a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r36 = 805306368(0x30000000, float:4.656613E-10)
            r37 = 511(0x1ff, float:7.16E-43)
            r35 = r9
            androidx.compose.material.e1 r4 = r16.mo10905b(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37)
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r16
            goto L_0x0258
        L_0x0256:
            r4 = r50
        L_0x0258:
            if (r0 == 0) goto L_0x025c
            r0 = 0
            goto L_0x025e
        L_0x025c:
            r0 = r51
        L_0x025e:
            if (r2 == 0) goto L_0x0262
            r2 = 0
            goto L_0x0264
        L_0x0262:
            r2 = r52
        L_0x0264:
            if (r3 == 0) goto L_0x0274
            r31 = r0
            r32 = r2
            r28 = r6
            r29 = r7
            r30 = r8
            r7 = r13
            r33 = 0
            goto L_0x0281
        L_0x0274:
            r33 = r53
            r31 = r0
            r32 = r2
            r28 = r6
            r29 = r7
            r30 = r8
            r7 = r13
        L_0x0281:
            r8 = r45
            r6 = r4
            r4 = r1
        L_0x0285:
            r9.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0296
            java.lang.String r0 = "androidx.compose.material.FilterChip (Chip.kt:183)"
            r1 = -1259208246(0xffffffffb4f201ca, float:-4.5077314E-7)
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r4, r5, r0)
        L_0x0296:
            int r0 = r4 >> 9
            r0 = r0 & 14
            int r20 = r4 << 3
            r1 = r20 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r4 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            androidx.compose.runtime.k2 r1 = r6.mo10751d(r7, r15, r9, r0)
            r2 = 0
            androidx.compose.material.ChipKt$FilterChip$2 r3 = androidx.compose.material.ChipKt$FilterChip$2.f7585f
            r10 = 1
            r13 = 0
            androidx.compose.ui.m r13 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r8, r2, r3, r10, r13)
            androidx.compose.runtime.k2 r0 = r6.mo10750c(r7, r15, r9, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r16 = r0.mo42833M()
            java.lang.Object r0 = r1.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r2 = r0.mo42833M()
            r0 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 14
            r23 = 0
            r45 = r2
            r47 = r0
            r48 = r18
            r49 = r19
            r50 = r21
            r51 = r22
            r52 = r23
            long r18 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r45, r47, r48, r49, r50, r51, r52)
            androidx.compose.material.ChipKt$FilterChip$3 r3 = new androidx.compose.material.ChipKt$FilterChip$3
            r0 = r3
            r2 = r31
            r11 = r3
            r3 = r43
            r45 = r4
            r4 = r32
            r22 = r5
            r5 = r33
            r34 = r6
            r6 = r54
            r35 = r7
            r7 = r22
            r36 = r8
            r8 = r34
            r46 = r13
            r13 = r9
            r9 = r35
            r12 = r10
            r10 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 722126431(0x2b0ac65f, float:4.9302744E-13)
            androidx.compose.runtime.internal.a r23 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r0, r12, r11)
            r1 = r45
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 3
            r2 = r2 & r38
            r0 = r0 | r2
            r2 = r20 & r39
            r0 = r0 | r2
            int r1 = r1 << 15
            r1 = r1 & r40
            r25 = r0 | r1
            r26 = 6
            r27 = 256(0x100, float:3.59E-43)
            r11 = r43
            r12 = r44
            r14 = r35
            r15 = r29
            r20 = r30
            r22 = r28
            r24 = r13
            r0 = r13
            r13 = r46
            androidx.compose.material.SurfaceKt.m13881d(r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x034e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x034e:
            r5 = r28
            r6 = r29
            r7 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r8 = r34
            r4 = r35
            r3 = r36
        L_0x0360:
            androidx.compose.runtime.t1 r15 = r0.mo15020s()
            if (r15 != 0) goto L_0x0367
            goto L_0x0384
        L_0x0367:
            androidx.compose.material.ChipKt$FilterChip$4 r14 = new androidx.compose.material.ChipKt$FilterChip$4
            r0 = r14
            r1 = r43
            r2 = r44
            r12 = r54
            r13 = r56
            r41 = r14
            r14 = r57
            r42 = r15
            r15 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r41
            r0 = r42
            r0.mo15202a(r1)
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.m13372c(boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, androidx.compose.ui.graphics.g4, androidx.compose.foundation.i, androidx.compose.material.e1, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }
}
