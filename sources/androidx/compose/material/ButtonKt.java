package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.shape.C2683e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,618:1\n25#2:619\n25#2:627\n25#2:634\n1114#3,6:620\n1114#3,6:628\n1114#3,6:635\n154#4:626\n76#5:641\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n98#1:619\n172#1:627\n226#1:634\n98#1:620,6\n172#1:628,6\n226#1:635,6\n115#1:626\n106#1:641\n*E\n"})
public final class ButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13343a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r37, boolean r38, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r39, @org.jetbrains.annotations.C12580l androidx.compose.material.C7870j r40, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r41, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2223i r42, @org.jetbrains.annotations.C12580l androidx.compose.material.C3046h r43, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r46, int r47, int r48) {
        /*
            r15 = r36
            r14 = r45
            r13 = r47
            r12 = r48
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            r1 = r46
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
            r3 = r37
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
            r3 = r37
        L_0x004e:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r38
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
            r5 = r38
        L_0x006a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0084
            r7 = r39
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
            r7 = r39
        L_0x0086:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a1
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009b
            r8 = r40
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x009d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r8 = r40
        L_0x009d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r9
            goto L_0x00a3
        L_0x00a1:
            r8 = r40
        L_0x00a3:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00bb
            r9 = r12 & 32
            r10 = r41
            if (r9 != 0) goto L_0x00b7
            boolean r9 = r11.mo15006n0(r10)
            if (r9 == 0) goto L_0x00b7
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r9
            goto L_0x00bd
        L_0x00bb:
            r10 = r41
        L_0x00bd:
            r16 = r12 & 64
            r28 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c7
            r9 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r9
            goto L_0x00db
        L_0x00c7:
            r9 = r13 & r28
            if (r9 != 0) goto L_0x00db
            r9 = r42
            boolean r17 = r11.mo15006n0(r9)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r17
            goto L_0x00dd
        L_0x00db:
            r9 = r42
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00f9
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f2
            r0 = r43
            boolean r17 = r11.mo15006n0(r0)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r0 = r43
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
            goto L_0x00fb
        L_0x00f9:
            r0 = r43
        L_0x00fb:
            r9 = r12 & 256(0x100, float:3.59E-43)
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            if (r9 == 0) goto L_0x0106
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            goto L_0x011c
        L_0x0106:
            r17 = r13 & r29
            if (r17 != 0) goto L_0x011c
            r17 = r9
            r9 = r44
            boolean r18 = r11.mo15006n0(r9)
            if (r18 == 0) goto L_0x0117
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r1 = r1 | r18
            goto L_0x0120
        L_0x011c:
            r17 = r9
            r9 = r44
        L_0x0120:
            r0 = r12 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0129
            r1 = r1 | r30
            goto L_0x013a
        L_0x0129:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x013a
            boolean r0 = r11.mo14927P(r14)
            if (r0 == 0) goto L_0x0137
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r1 = r1 | r0
        L_0x013a:
            r0 = r1
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r0
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r3) goto L_0x015c
            boolean r1 = r11.mo15011p()
            if (r1 != 0) goto L_0x014b
            goto L_0x015c
        L_0x014b:
            r11.mo14958a0()
            r2 = r37
            r3 = r5
            r4 = r7
            r5 = r8
            r6 = r10
            r21 = r11
            r7 = r42
            r8 = r43
            goto L_0x0335
        L_0x015c:
            r11.mo14930Q()
            r1 = r13 & 1
            r31 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 0
            r9 = 1
            if (r1 == 0) goto L_0x019a
            boolean r1 = r11.mo14977f0()
            if (r1 == 0) goto L_0x0175
            goto L_0x019a
        L_0x0175:
            r11.mo14958a0()
            r1 = r12 & 16
            if (r1 == 0) goto L_0x017e
            r0 = r0 & r19
        L_0x017e:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0184
            r0 = r0 & r18
        L_0x0184:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x018a
            r0 = r0 & r31
        L_0x018a:
            r17 = r42
            r4 = r43
            r6 = r7
            r7 = r8
            r16 = r10
            r8 = r5
            r10 = r9
            r9 = r37
            r5 = r44
            goto L_0x024e
        L_0x019a:
            if (r2 == 0) goto L_0x01a1
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r32 = r1
            goto L_0x01a3
        L_0x01a1:
            r32 = r37
        L_0x01a3:
            if (r4 == 0) goto L_0x01a8
            r33 = r9
            goto L_0x01aa
        L_0x01a8:
            r33 = r5
        L_0x01aa:
            if (r6 == 0) goto L_0x01cd
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r1)
            java.lang.Object r1 = r11.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r1 != r2) goto L_0x01c5
            androidx.compose.foundation.interaction.g r1 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r1)
        L_0x01c5:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r1 = (androidx.compose.foundation.interaction.C2243g) r1
            r34 = r1
            goto L_0x01cf
        L_0x01cd:
            r34 = r7
        L_0x01cf:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x01f0
            androidx.compose.material.i r1 = androidx.compose.material.C3049i.f8133a
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 196608(0x30000, float:2.75506E-40)
            r20 = 31
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r10 = r9
            r35 = r17
            r9 = r20
            androidx.compose.material.j r1 = r1.mo10776b(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r0 & r19
            r8 = r1
            goto L_0x01f3
        L_0x01f0:
            r10 = r9
            r35 = r17
        L_0x01f3:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0205
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            r2 = 6
            androidx.compose.material.f1 r1 = r1.mo11076b(r11, r2)
            androidx.compose.foundation.shape.e r1 = r1.mo10758e()
            r0 = r0 & r18
            goto L_0x0207
        L_0x0205:
            r1 = r41
        L_0x0207:
            if (r16 == 0) goto L_0x020b
            r2 = 0
            goto L_0x020d
        L_0x020b:
            r2 = r42
        L_0x020d:
            r3 = r12 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0228
            androidx.compose.material.i r16 = androidx.compose.material.C3049i.f8133a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 24576(0x6000, float:3.4438E-41)
            r27 = 15
            r25 = r11
            androidx.compose.material.h r3 = r16.mo10775a(r17, r19, r21, r23, r25, r26, r27)
            r0 = r0 & r31
            goto L_0x022a
        L_0x0228:
            r3 = r43
        L_0x022a:
            if (r35 == 0) goto L_0x0240
            androidx.compose.material.i r4 = androidx.compose.material.C3049i.f8133a
            androidx.compose.foundation.layout.i0 r4 = r4.mo10778d()
            r16 = r1
            r17 = r2
            r5 = r4
            r7 = r8
            r9 = r32
            r8 = r33
            r6 = r34
            r4 = r3
            goto L_0x024e
        L_0x0240:
            r5 = r44
            r16 = r1
            r17 = r2
            r4 = r3
            r7 = r8
            r9 = r32
            r8 = r33
            r6 = r34
        L_0x024e:
            r11.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0260
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Button (Button.kt:93)"
            r3 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r0, r1, r2)
        L_0x0260:
            int r1 = r0 >> 6
            r2 = r1 & 14
            int r3 = r0 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r2
            androidx.compose.runtime.k2 r10 = r4.mo10769b(r8, r11, r3)
            androidx.compose.material.ButtonKt$Button$2 r12 = androidx.compose.material.ButtonKt$Button$2.f7566f
            r13 = 0
            r19 = r0
            r0 = 1
            r15 = 0
            androidx.compose.ui.m r12 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r9, r13, r12, r0, r15)
            androidx.compose.runtime.k2 r0 = r4.mo10768a(r8, r11, r3)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r20 = r0.mo42833M()
            long r22 = m13344b(r10)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            r37 = r22
            r39 = r0
            r40 = r3
            r41 = r24
            r42 = r25
            r43 = r26
            r44 = r27
            long r22 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r37, r39, r40, r41, r42, r43, r44)
            r0 = -423487112(0xffffffffe6c21978, float:-4.5830446E23)
            r11.mo14918M(r0)
            if (r7 != 0) goto L_0x02b1
            r3 = r15
            goto L_0x02bb
        L_0x02b1:
            r0 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            androidx.compose.runtime.k2 r3 = r7.mo10121a(r8, r6, r11, r0)
        L_0x02bb:
            r11.mo15002m0()
            if (r3 == 0) goto L_0x02cb
            java.lang.Object r0 = r3.getValue()
            androidx.compose.ui.unit.g r0 = (androidx.compose.p004ui.unit.C16483g) r0
            float r0 = r0.mo47823t0()
            goto L_0x02d0
        L_0x02cb:
            float r0 = (float) r13
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
        L_0x02d0:
            r13 = r0
            androidx.compose.material.ButtonKt$Button$3 r0 = new androidx.compose.material.ButtonKt$Button$3
            r2 = r19
            r0.<init>(r10, r5, r14, r2)
            r3 = 7524271(0x72cfaf, float:1.054375E-38)
            r10 = 1
            androidx.compose.runtime.internal.a r15 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r3, r10, r0)
            r0 = r2 & 14
            r0 = r0 | r30
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = r2 & r28
            r0 = r0 | r1
            int r1 = r2 << 15
            r1 = r1 & r29
            r18 = r0 | r1
            r19 = 0
            r0 = r36
            r1 = r12
            r2 = r8
            r3 = r16
            r24 = r4
            r25 = r5
            r4 = r20
            r34 = r6
            r20 = r7
            r6 = r22
            r33 = r8
            r8 = r17
            r32 = r9
            r9 = r13
            r10 = r34
            r21 = r11
            r11 = r15
            r12 = r21
            r13 = r18
            r14 = r19
            androidx.compose.material.SurfaceKt.m13880c(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0325
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0325:
            r6 = r16
            r7 = r17
            r5 = r20
            r8 = r24
            r9 = r25
            r2 = r32
            r3 = r33
            r4 = r34
        L_0x0335:
            androidx.compose.runtime.t1 r13 = r21.mo15020s()
            if (r13 != 0) goto L_0x033c
            goto L_0x034d
        L_0x033c:
            androidx.compose.material.ButtonKt$Button$4 r14 = new androidx.compose.material.ButtonKt$Button$4
            r0 = r14
            r1 = r36
            r10 = r45
            r11 = r47
            r12 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo15202a(r14)
        L_0x034d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.m13343a(kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, androidx.compose.material.j, androidx.compose.ui.graphics.g4, androidx.compose.foundation.i, androidx.compose.material.h, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final long m13344b(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m13345c(@C12579k C11289a<C11079d2> aVar, @C12580l C8767m mVar, boolean z, @C12580l C2243g gVar, @C12580l C7870j jVar, @C12580l C15218g4 g4Var, @C12580l C2223i iVar, @C12580l C3046h hVar, @C12580l C2366i0 i0Var, @C12579k C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar2;
        boolean z2;
        C2243g gVar2;
        C7870j jVar2;
        C2683e eVar;
        C2223i iVar2;
        C3046h hVar2;
        C2366i0 i0Var2;
        C8592o oVar2 = oVar;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar2.mo14918M(-1776134358);
        if ((i4 & 2) != 0) {
            aVar2 = C8767m.f23478j;
        } else {
            aVar2 = mVar;
        }
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C2242f.m9684a();
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C2243g) N;
        } else {
            gVar2 = gVar;
        }
        if ((i4 & 16) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i4 & 32) != 0) {
            eVar = C7933t0.f19075a.mo11076b(oVar2, 6).mo10758e();
        } else {
            eVar = g4Var;
        }
        if ((i4 & 64) != 0) {
            iVar2 = C3049i.f8133a.mo10783i(oVar2, 6);
        } else {
            iVar2 = iVar;
        }
        if ((i4 & 128) != 0) {
            hVar2 = C3049i.f8133a.mo10786l(0, 0, 0, oVar, 3072, 7);
        } else {
            hVar2 = hVar;
        }
        if ((i4 & 256) != 0) {
            i0Var2 = C3049i.f8133a.mo10778d();
        } else {
            i0Var2 = i0Var;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1776134358, i3, -1, "androidx.compose.material.OutlinedButton (Button.kt:167)");
        }
        m13343a(aVar, aVar2, z2, gVar2, jVar2, eVar, iVar2, hVar2, i0Var2, qVar, oVar, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m13346d(@C12579k C11289a<C11079d2> aVar, @C12580l C8767m mVar, boolean z, @C12580l C2243g gVar, @C12580l C7870j jVar, @C12580l C15218g4 g4Var, @C12580l C2223i iVar, @C12580l C3046h hVar, @C12580l C2366i0 i0Var, @C12579k C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar2;
        boolean z2;
        C2243g gVar2;
        C7870j jVar2;
        C2683e eVar;
        C2223i iVar2;
        C3046h hVar2;
        C2366i0 i0Var2;
        C8592o oVar2 = oVar;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar2.mo14918M(288797557);
        if ((i4 & 2) != 0) {
            aVar2 = C8767m.f23478j;
        } else {
            aVar2 = mVar;
        }
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C2242f.m9684a();
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C2243g) N;
        } else {
            gVar2 = gVar;
        }
        if ((i4 & 16) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i4 & 32) != 0) {
            eVar = C7933t0.f19075a.mo11076b(oVar2, 6).mo10758e();
        } else {
            eVar = g4Var;
        }
        if ((i4 & 64) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i4 & 128) != 0) {
            hVar2 = C3049i.f8133a.mo10787m(0, 0, 0, oVar, 3072, 7);
        } else {
            hVar2 = hVar;
        }
        if ((i4 & 256) != 0) {
            i0Var2 = C3049i.f8133a.mo10785k();
        } else {
            i0Var2 = i0Var;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(288797557, i3, -1, "androidx.compose.material.TextButton (Button.kt:221)");
        }
        m13343a(aVar, aVar2, z2, gVar2, jVar2, eVar, iVar2, hVar2, i0Var2, qVar, oVar, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }
}
