package com.google.accompanist.pager;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.p004ui.unit.C16511x;
import kotlin.C11395k;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "Pager")
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,580:1\n154#2:581\n154#2:582\n154#2:583\n154#2:584\n1#3:585\n36#4:586\n50#4:593\n49#4:594\n36#4:601\n36#4:608\n67#4,3:616\n66#4:619\n36#4:626\n36#4:633\n83#4,3:640\n83#4,3:649\n1114#5,6:587\n1114#5,6:595\n1114#5,6:602\n1114#5,6:609\n1114#5,6:620\n1114#5,6:627\n1114#5,6:634\n1114#5,6:643\n1114#5,6:652\n76#6:615\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager\n*L\n275#1:581\n276#1:582\n337#1:583\n338#1:584\n384#1:586\n389#1:593\n389#1:594\n394#1:601\n403#1:608\n409#1:616,3\n409#1:619\n413#1:626\n417#1:633\n435#1:640,3\n464#1:649,3\n384#1:587,6\n389#1:595,6\n394#1:602,6\n403#1:609,6\n409#1:620,6\n413#1:627,6\n417#1:634,6\n435#1:643,6\n464#1:652,6\n408#1:615\n*E\n"})
public final class Pager {

    /* renamed from: a */
    public static final boolean f37127a = false;

    /* JADX WARNING: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012f  */
    @kotlin.C11395k(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of HorizontalPager is androidx.compose.foundation.pager.HorizontalPager\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @kotlin.C11587t0(expression = "HorizontalPager", imports = {"androidx.compose.foundation.pager.HorizontalPager"}))
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64354a(int r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, @org.jetbrains.annotations.C12580l com.google.accompanist.pager.PagerState r36, boolean r37, float r38, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r39, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r40, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r41, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r42, boolean r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.google.accompanist.pager.C15029c, ? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47, int r48) {
        /*
            r13 = r44
            r12 = r46
            r10 = r48
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -131850087(0xfffffffff8242099, float:-1.3315591E34)
            r1 = r45
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r12 | 6
            r15 = r34
            goto L_0x002f
        L_0x001d:
            r1 = r12 & 14
            r15 = r34
            if (r1 != 0) goto L_0x002e
            boolean r1 = r9.mo14976f(r15)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r35
            boolean r6 = r9.mo15006n0(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r1 = r1 | r6
            goto L_0x004b
        L_0x0049:
            r5 = r35
        L_0x004b:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r10 & 4
            if (r6 != 0) goto L_0x005e
            r6 = r36
            boolean r7 = r9.mo15006n0(r6)
            if (r7 == 0) goto L_0x0060
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r6 = r36
        L_0x0060:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r7
            goto L_0x0066
        L_0x0064:
            r6 = r36
        L_0x0066:
            r7 = r10 & 8
            if (r7 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r37
            boolean r11 = r9.mo14961b(r8)
            if (r11 == 0) goto L_0x007c
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r11
            goto L_0x0082
        L_0x0080:
            r8 = r37
        L_0x0082:
            r11 = r10 & 16
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r11 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r38
            goto L_0x00a1
        L_0x008e:
            r16 = r12 & r14
            r3 = r38
            if (r16 != 0) goto L_0x00a1
            boolean r16 = r9.mo14968d(r3)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r16
        L_0x00a1:
            r16 = r10 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00ac
            r1 = r1 | r17
            r14 = r39
            goto L_0x00c1
        L_0x00ac:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r12 & r18
            r14 = r39
            if (r18 != 0) goto L_0x00c1
            boolean r19 = r9.mo15006n0(r14)
            if (r19 == 0) goto L_0x00bd
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r19
        L_0x00c1:
            r19 = r10 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r19 == 0) goto L_0x00ce
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r0 = r40
            goto L_0x00e1
        L_0x00ce:
            r21 = r12 & r20
            r0 = r40
            if (r21 != 0) goto L_0x00e1
            boolean r22 = r9.mo15006n0(r0)
            if (r22 == 0) goto L_0x00dd
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r22
        L_0x00e1:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r12 & r22
            if (r23 != 0) goto L_0x00fd
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f6
            r2 = r41
            boolean r24 = r9.mo15006n0(r2)
            if (r24 == 0) goto L_0x00f8
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f6:
            r2 = r41
        L_0x00f8:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r24
            goto L_0x00ff
        L_0x00fd:
            r2 = r41
        L_0x00ff:
            r8 = r10 & 256(0x100, float:3.59E-43)
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            if (r8 == 0) goto L_0x010a
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r25
            goto L_0x0120
        L_0x010a:
            r25 = r12 & r24
            if (r25 != 0) goto L_0x0120
            r25 = r8
            r8 = r42
            boolean r26 = r9.mo14927P(r8)
            if (r26 == 0) goto L_0x011b
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r1 = r1 | r26
            goto L_0x0124
        L_0x0120:
            r25 = r8
            r8 = r42
        L_0x0124:
            r8 = r10 & 512(0x200, float:7.175E-43)
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            if (r8 == 0) goto L_0x012f
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x0145
        L_0x012f:
            r27 = r12 & r26
            if (r27 != 0) goto L_0x0145
            r27 = r8
            r8 = r43
            boolean r28 = r9.mo14961b(r8)
            if (r28 == 0) goto L_0x0140
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r1 = r1 | r28
            goto L_0x0149
        L_0x0145:
            r27 = r8
            r8 = r43
        L_0x0149:
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0150
            r0 = r47 | 6
            goto L_0x0162
        L_0x0150:
            r0 = r47 & 14
            if (r0 != 0) goto L_0x0160
            boolean r0 = r9.mo14927P(r13)
            if (r0 == 0) goto L_0x015c
            r0 = 4
            goto L_0x015d
        L_0x015c:
            r0 = 2
        L_0x015d:
            r0 = r47 | r0
            goto L_0x0162
        L_0x0160:
            r0 = r47
        L_0x0162:
            r28 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r1 & r28
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x018d
            r2 = r0 & 11
            r3 = 2
            if (r2 != r3) goto L_0x018d
            boolean r2 = r9.mo15011p()
            if (r2 != 0) goto L_0x0178
            goto L_0x018d
        L_0x0178:
            r9.mo14958a0()
            r4 = r37
            r7 = r40
            r2 = r5
            r3 = r6
            r10 = r8
            r17 = r9
            r6 = r14
            r5 = r38
            r8 = r41
            r9 = r42
            goto L_0x02d4
        L_0x018d:
            r9.mo14930Q()
            r2 = r12 & 1
            if (r2 == 0) goto L_0x01c0
            boolean r2 = r9.mo14977f0()
            if (r2 == 0) goto L_0x019b
            goto L_0x01c0
        L_0x019b:
            r9.mo14958a0()
            r2 = r10 & 4
            if (r2 == 0) goto L_0x01a4
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01a4:
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01ac
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r2
        L_0x01ac:
            r30 = r37
            r19 = r38
            r27 = r40
            r29 = r41
            r31 = r42
            r23 = r5
            r28 = r6
            r32 = r8
            r25 = r14
            goto L_0x025a
        L_0x01c0:
            if (r4 == 0) goto L_0x01c7
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r23 = r2
            goto L_0x01c9
        L_0x01c7:
            r23 = r5
        L_0x01c9:
            r2 = r10 & 4
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x01da
            com.google.accompanist.pager.PagerState r2 = com.google.accompanist.pager.PagerStateKt.m64414a(r3, r9, r3, r5)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r29 = r1
            r28 = r2
            goto L_0x01de
        L_0x01da:
            r29 = r1
            r28 = r6
        L_0x01de:
            if (r7 == 0) goto L_0x01e3
            r30 = r3
            goto L_0x01e5
        L_0x01e3:
            r30 = r37
        L_0x01e5:
            if (r11 == 0) goto L_0x01ee
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r11 = r1
            goto L_0x01f0
        L_0x01ee:
            r11 = r38
        L_0x01f0:
            if (r16 == 0) goto L_0x01fc
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.layout.i0 r1 = androidx.compose.foundation.layout.PaddingKt.m10014a(r1)
            r14 = r1
        L_0x01fc:
            if (r19 == 0) goto L_0x0207
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17070q()
            r16 = r1
            goto L_0x0209
        L_0x0207:
            r16 = r40
        L_0x0209:
            r1 = r10 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0231
            com.google.accompanist.pager.PagerDefaults r1 = com.google.accompanist.pager.PagerDefaults.f37132a
            r3 = 0
            r4 = 0
            androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
            float r6 = androidx.compose.foundation.layout.PaddingKt.m10021h(r14, r2)
            int r2 = r29 >> 6
            r2 = r2 & 14
            r7 = r2 | 24576(0x6000, float:3.4438E-41)
            r19 = 6
            r2 = r28
            r31 = r5
            r5 = r6
            r6 = r9
            r8 = r19
            androidx.compose.foundation.gestures.g r1 = r1.mo41989a(r2, r3, r4, r5, r6, r7, r8)
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r29 & r2
            goto L_0x0237
        L_0x0231:
            r31 = r5
            r1 = r41
            r2 = r29
        L_0x0237:
            if (r25 == 0) goto L_0x023b
            r3 = 0
            goto L_0x023d
        L_0x023b:
            r3 = r42
        L_0x023d:
            if (r27 == 0) goto L_0x024d
            r29 = r1
            r1 = r2
            r19 = r11
            r25 = r14
            r27 = r16
            r32 = r31
            r31 = r3
            goto L_0x025a
        L_0x024d:
            r32 = r43
            r29 = r1
            r1 = r2
            r31 = r3
            r19 = r11
            r25 = r14
            r27 = r16
        L_0x025a:
            r9.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x026b
            java.lang.String r2 = "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)"
            r3 = -131850087(0xfffffffff8242099, float:-1.3315591E34)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x026b:
            r5 = 0
            r11 = 0
            r2 = r1 & 14
            r2 = r2 | r17
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r2 = r2 | r3
            int r3 = r1 >> 3
            r4 = r3 & r20
            r2 = r2 | r4
            r3 = r3 & r22
            r2 = r2 | r3
            int r3 = r1 << 9
            r3 = r3 & r24
            r2 = r2 | r3
            r3 = r1 & r26
            r14 = r2 | r3
            int r1 = r1 >> 18
            r1 = r1 & 14
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r15 = r0
            r16 = 2048(0x800, float:2.87E-42)
            r0 = r34
            r1 = r23
            r2 = r28
            r3 = r30
            r4 = r19
            r6 = r29
            r7 = r31
            r8 = r25
            r17 = r9
            r9 = r32
            r10 = r27
            r12 = r44
            r13 = r17
            m64355b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02c2:
            r5 = r19
            r2 = r23
            r6 = r25
            r7 = r27
            r3 = r28
            r8 = r29
            r4 = r30
            r9 = r31
            r10 = r32
        L_0x02d4:
            androidx.compose.runtime.t1 r15 = r17.mo15020s()
            if (r15 != 0) goto L_0x02db
            goto L_0x02f2
        L_0x02db:
            com.google.accompanist.pager.Pager$HorizontalPager$1 r14 = new com.google.accompanist.pager.Pager$HorizontalPager$1
            r0 = r14
            r1 = r34
            r11 = r44
            r12 = r46
            r13 = r47
            r33 = r14
            r14 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r33
            r15.mo15202a(r0)
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager.m64354a(int, androidx.compose.ui.m, com.google.accompanist.pager.PagerState, boolean, float, androidx.compose.foundation.layout.i0, androidx.compose.ui.c$c, androidx.compose.foundation.gestures.g, kotlin.jvm.functions.l, boolean, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: kotlin.jvm.functions.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: com.google.accompanist.pager.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.accompanist.pager.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: com.google.accompanist.pager.Pager$Pager$8$1} */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x020a, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x020f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0136  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64355b(int r32, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r33, @org.jetbrains.annotations.C12579k com.google.accompanist.pager.PagerState r34, boolean r35, float r36, boolean r37, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2195g r38, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r39, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r40, boolean r41, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r42, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.google.accompanist.pager.C15029c, ? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47, int r48) {
        /*
            r7 = r32
            r15 = r33
            r14 = r34
            r13 = r36
            r12 = r37
            r11 = r38
            r10 = r39
            r9 = r40
            r8 = r44
            r6 = r46
            r5 = r47
            r4 = r48
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "flingBehavior"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -1072219707(0xffffffffc01739c5, float:-2.362901)
            r1 = r45
            androidx.compose.runtime.o r3 = r1.mo15009o(r0)
            r1 = r4 & 1
            r16 = 4
            r17 = 2
            if (r1 == 0) goto L_0x0045
            r1 = r6 | 6
            goto L_0x0057
        L_0x0045:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0056
            boolean r1 = r3.mo14976f(r7)
            if (r1 == 0) goto L_0x0052
            r1 = r16
            goto L_0x0054
        L_0x0052:
            r1 = r17
        L_0x0054:
            r1 = r1 | r6
            goto L_0x0057
        L_0x0056:
            r1 = r6
        L_0x0057:
            r2 = r4 & 2
            r18 = 32
            r19 = 16
            if (r2 == 0) goto L_0x0062
            r1 = r1 | 48
            goto L_0x0072
        L_0x0062:
            r2 = r6 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0072
            boolean r2 = r3.mo15006n0(r15)
            if (r2 == 0) goto L_0x006f
            r2 = r18
            goto L_0x0071
        L_0x006f:
            r2 = r19
        L_0x0071:
            r1 = r1 | r2
        L_0x0072:
            r2 = r4 & 4
            r20 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x007d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x008d
        L_0x007d:
            r2 = r6 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x008d
            boolean r2 = r3.mo15006n0(r14)
            if (r2 == 0) goto L_0x008a
            r2 = r20
            goto L_0x008c
        L_0x008a:
            r2 = r21
        L_0x008c:
            r1 = r1 | r2
        L_0x008d:
            r2 = r4 & 8
            if (r2 == 0) goto L_0x0094
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a8
        L_0x0094:
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00a8
            r2 = r35
            boolean r22 = r3.mo14961b(r2)
            if (r22 == 0) goto L_0x00a3
            r22 = 2048(0x800, float:2.87E-42)
            goto L_0x00a5
        L_0x00a3:
            r22 = 1024(0x400, float:1.435E-42)
        L_0x00a5:
            r1 = r1 | r22
            goto L_0x00aa
        L_0x00a8:
            r2 = r35
        L_0x00aa:
            r22 = r4 & 16
            if (r22 == 0) goto L_0x00b1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c5
        L_0x00b1:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r6 & r22
            if (r22 != 0) goto L_0x00c5
            boolean r22 = r3.mo14968d(r13)
            if (r22 == 0) goto L_0x00c1
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00c3
        L_0x00c1:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00c3:
            r1 = r1 | r22
        L_0x00c5:
            r22 = r4 & 32
            r23 = 458752(0x70000, float:6.42848E-40)
            if (r22 == 0) goto L_0x00d0
            r22 = 196608(0x30000, float:2.75506E-40)
        L_0x00cd:
            r1 = r1 | r22
            goto L_0x00e0
        L_0x00d0:
            r22 = r6 & r23
            if (r22 != 0) goto L_0x00e0
            boolean r22 = r3.mo14961b(r12)
            if (r22 == 0) goto L_0x00dd
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cd
        L_0x00dd:
            r22 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00cd
        L_0x00e0:
            r22 = r4 & 64
            r24 = 3670016(0x380000, float:5.142788E-39)
            if (r22 == 0) goto L_0x00eb
            r22 = 1572864(0x180000, float:2.204052E-39)
        L_0x00e8:
            r1 = r1 | r22
            goto L_0x00fb
        L_0x00eb:
            r22 = r6 & r24
            if (r22 != 0) goto L_0x00fb
            boolean r22 = r3.mo15006n0(r11)
            if (r22 == 0) goto L_0x00f8
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00f8:
            r22 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00e8
        L_0x00fb:
            r0 = r4 & 128(0x80, float:1.794E-43)
            r25 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x0105
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0103:
            r1 = r1 | r0
            goto L_0x0115
        L_0x0105:
            r0 = r6 & r25
            if (r0 != 0) goto L_0x0115
            boolean r0 = r3.mo14927P(r10)
            if (r0 == 0) goto L_0x0112
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0112:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0103
        L_0x0115:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011d
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x011b:
            r1 = r1 | r0
            goto L_0x012e
        L_0x011d:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x012e
            boolean r0 = r3.mo15006n0(r9)
            if (r0 == 0) goto L_0x012b
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x012b:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x011b
        L_0x012e:
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0136
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r0
            goto L_0x014b
        L_0x0136:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x014b
            r0 = r41
            boolean r26 = r3.mo14961b(r0)
            if (r26 == 0) goto L_0x0146
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0148
        L_0x0146:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0148:
            r1 = r1 | r26
            goto L_0x014d
        L_0x014b:
            r0 = r41
        L_0x014d:
            r0 = r4 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0156
            r26 = r5 | 6
            r2 = r42
            goto L_0x016c
        L_0x0156:
            r26 = r5 & 14
            r2 = r42
            if (r26 != 0) goto L_0x016a
            boolean r26 = r3.mo15006n0(r2)
            if (r26 == 0) goto L_0x0165
            r26 = r16
            goto L_0x0167
        L_0x0165:
            r26 = r17
        L_0x0167:
            r26 = r5 | r26
            goto L_0x016c
        L_0x016a:
            r26 = r5
        L_0x016c:
            r2 = r4 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0173
            r26 = r26 | 48
            goto L_0x0184
        L_0x0173:
            r27 = r5 & 112(0x70, float:1.57E-43)
            r6 = r43
            if (r27 != 0) goto L_0x0184
            boolean r27 = r3.mo15006n0(r6)
            if (r27 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r18 = r19
        L_0x0182:
            r26 = r26 | r18
        L_0x0184:
            r6 = r26
            r9 = r4 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018d
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x019c
        L_0x018d:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x019c
            boolean r9 = r3.mo14927P(r8)
            if (r9 == 0) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            r20 = r21
        L_0x019a:
            r6 = r6 | r20
        L_0x019c:
            r9 = r6
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r1
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r4) goto L_0x01bd
            r4 = r9 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r4 != r6) goto L_0x01bd
            boolean r4 = r3.mo15011p()
            if (r4 != 0) goto L_0x01b3
            goto L_0x01bd
        L_0x01b3:
            r3.mo14958a0()
            r11 = r42
            r12 = r43
            r0 = r3
            goto L_0x04a7
        L_0x01bd:
            if (r0 == 0) goto L_0x01c7
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r0 = r0.mo17070q()
            r6 = r0
            goto L_0x01c9
        L_0x01c7:
            r6 = r42
        L_0x01c9:
            if (r2 == 0) goto L_0x01d3
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            r4 = r0
            goto L_0x01d5
        L_0x01d3:
            r4 = r43
        L_0x01d5:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "com.google.accompanist.pager.Pager (Pager.kt:364)"
            r2 = -1072219707(0xffffffffc01739c5, float:-2.362901)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r9, r0)
        L_0x01e3:
            r18 = 0
            r19 = 1
            if (r7 < 0) goto L_0x01ec
            r0 = r19
            goto L_0x01ee
        L_0x01ec:
            r0 = r18
        L_0x01ee:
            if (r0 == 0) goto L_0x04dc
            int r2 = r1 >> 18
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r0)
            boolean r20 = r3.mo15006n0(r11)
            java.lang.Object r0 = r3.mo14921N()
            if (r20 != 0) goto L_0x020d
            androidx.compose.runtime.o$a r20 = androidx.compose.runtime.C8592o.f23032a
            r43 = r2
            java.lang.Object r2 = r20.mo16277a()
            if (r0 != r2) goto L_0x0217
            goto L_0x020f
        L_0x020d:
            r43 = r2
        L_0x020f:
            com.google.accompanist.pager.Pager$Pager$2$1 r0 = new com.google.accompanist.pager.Pager$Pager$2$1
            r0.<init>(r11)
            r3.mo14893C(r0)
        L_0x0217:
            r3.mo15002m0()
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r14.mo42003J(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r32)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r32)
            int r11 = r1 >> 6
            r20 = r11 & 14
            r45 = r4
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r4)
            boolean r4 = r3.mo15006n0(r14)
            boolean r2 = r3.mo15006n0(r2)
            r2 = r2 | r4
            java.lang.Object r4 = r3.mo14921N()
            r5 = 0
            if (r2 != 0) goto L_0x024b
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r4 != r2) goto L_0x0253
        L_0x024b:
            com.google.accompanist.pager.Pager$Pager$3$1 r4 = new com.google.accompanist.pager.Pager$Pager$3$1
            r4.<init>(r14, r7, r5)
            r3.mo14893C(r4)
        L_0x0253:
            r3.mo15002m0()
            kotlin.jvm.functions.p r4 = (kotlin.jvm.functions.C11304p) r4
            r2 = r1 & 14
            r2 = r2 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r4, r3, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r0)
            boolean r0 = r3.mo15006n0(r14)
            java.lang.Object r2 = r3.mo14921N()
            if (r0 != 0) goto L_0x0277
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x027f
        L_0x0277:
            com.google.accompanist.pager.Pager$Pager$4$1 r2 = new com.google.accompanist.pager.Pager$Pager$4$1
            r2.<init>(r14, r5)
            r3.mo14893C(r2)
        L_0x027f:
            r3.mo15002m0()
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            r0 = r20 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r14, r2, r3, r0)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r2)
            boolean r4 = r3.mo15006n0(r14)
            java.lang.Object r2 = r3.mo14921N()
            if (r4 != 0) goto L_0x02a1
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r2 != r4) goto L_0x02a9
        L_0x02a1:
            com.google.accompanist.pager.Pager$Pager$5$1 r2 = new com.google.accompanist.pager.Pager$Pager$5$1
            r2.<init>(r14, r5)
            r3.mo14893C(r2)
        L_0x02a9:
            r3.mo15002m0()
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            androidx.compose.runtime.EffectsKt.m29896h(r14, r2, r3, r0)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r3.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.ui.unit.g r2 = androidx.compose.p004ui.unit.C16483g.m74451w(r36)
            androidx.compose.ui.unit.g r4 = androidx.compose.p004ui.unit.C16483g.m74451w(r36)
            int r20 = r1 >> 3
            r5 = r20 & 112(0x70, float:1.57E-43)
            r22 = r1
            r1 = r11 & 896(0x380, float:1.256E-42)
            r7 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.mo14918M(r7)
            boolean r7 = r3.mo15006n0(r0)
            boolean r26 = r3.mo15006n0(r14)
            r7 = r7 | r26
            boolean r4 = r3.mo15006n0(r4)
            r4 = r4 | r7
            java.lang.Object r7 = r3.mo14921N()
            if (r4 != 0) goto L_0x02ee
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r7 != r4) goto L_0x02f7
        L_0x02ee:
            com.google.accompanist.pager.Pager$Pager$6$1 r7 = new com.google.accompanist.pager.Pager$Pager$6$1
            r4 = 0
            r7.<init>(r0, r14, r13, r4)
            r3.mo14893C(r7)
        L_0x02f7:
            r3.mo15002m0()
            r4 = r7
            kotlin.jvm.functions.p r4 = (kotlin.jvm.functions.C11304p) r4
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r5 = r5 | r1
            r7 = 1157296644(0x44faf204, float:2007.563)
            r28 = r22
            r1 = r34
            r29 = r43
            r42 = r3
            r3 = r4
            r4 = r42
            androidx.compose.runtime.EffectsKt.m29894f(r0, r1, r2, r3, r4, r5)
            r5 = r42
            r5.mo14918M(r7)
            boolean r0 = r5.mo15006n0(r14)
            java.lang.Object r1 = r5.mo14921N()
            if (r0 != 0) goto L_0x0328
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0330
        L_0x0328:
            com.google.accompanist.pager.d r1 = new com.google.accompanist.pager.d
            r1.<init>(r14)
            r5.mo14893C(r1)
        L_0x0330:
            r5.mo15002m0()
            r21 = r1
            com.google.accompanist.pager.d r21 = (com.google.accompanist.pager.C15030d) r21
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r37)
            r5.mo14918M(r7)
            boolean r0 = r5.mo15006n0(r0)
            java.lang.Object r1 = r5.mo14921N()
            if (r0 != 0) goto L_0x0350
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x035a
        L_0x0350:
            com.google.accompanist.pager.a r1 = new com.google.accompanist.pager.a
            r0 = r12 ^ 1
            r1.<init>(r0, r12, r14)
            r5.mo14893C(r1)
        L_0x035a:
            r5.mo15002m0()
            r3 = r1
            com.google.accompanist.pager.a r3 = (com.google.accompanist.pager.C15027a) r3
            r0 = 3
            if (r12 == 0) goto L_0x0402
            r1 = -510388635(0xffffffffe1941665, float:-3.4146648E20)
            r5.mo14918M(r1)
            androidx.compose.foundation.lazy.LazyListState r7 = r34.mo42017v()
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r22 = r1.mo7620B(r13, r6)
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r32)
            r2[r18] = r4
            r2[r19] = r10
            r2[r17] = r3
            r2[r0] = r8
            r2[r16] = r21
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r5.mo14918M(r0)
            r0 = r18
        L_0x038c:
            if (r0 >= r1) goto L_0x0399
            r4 = r2[r0]
            boolean r4 = r5.mo15006n0(r4)
            r18 = r18 | r4
            int r0 = r0 + 1
            goto L_0x038c
        L_0x0399:
            java.lang.Object r0 = r5.mo14921N()
            if (r18 != 0) goto L_0x03ac
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x03a8
            goto L_0x03ac
        L_0x03a8:
            r15 = r5
            r26 = r6
            goto L_0x03c3
        L_0x03ac:
            com.google.accompanist.pager.Pager$Pager$7$1 r4 = new com.google.accompanist.pager.Pager$Pager$7$1
            r0 = r4
            r1 = r32
            r2 = r39
            r8 = r4
            r4 = r44
            r15 = r5
            r5 = r21
            r26 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.mo14893C(r8)
            r0 = r8
        L_0x03c3:
            r15.mo15002m0()
            r16 = r0
            kotlin.jvm.functions.l r16 = (kotlin.jvm.functions.C11300l) r16
            r0 = r20 & 14
            r8 = r29
            r1 = r8 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r6 = r28
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r9 << 12
            r1 = r1 & r23
            r0 = r0 | r1
            r1 = r6 & r24
            r0 = r0 | r1
            r1 = r11 & r25
            r18 = r0 | r1
            r19 = 0
            r8 = r33
            r9 = r7
            r10 = r40
            r11 = r35
            r12 = r22
            r7 = r13
            r13 = r45
            r14 = r38
            r5 = r15
            r15 = r41
            r17 = r5
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5.mo15002m0()
            r1 = r45
            r0 = r5
            goto L_0x049b
        L_0x0402:
            r26 = r6
            r7 = r13
            r6 = r28
            r8 = r29
            r1 = -510387428(0xffffffffe1941b1c, float:-3.4150894E20)
            r5.mo14918M(r1)
            androidx.compose.foundation.lazy.LazyListState r10 = r34.mo42017v()
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f6010a
            r15 = r45
            androidx.compose.foundation.layout.Arrangement$d r12 = r1.mo7619A(r7, r15)
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r32)
            r2[r18] = r4
            r2[r19] = r39
            r2[r17] = r3
            r2[r0] = r44
            r2[r16] = r21
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r5.mo14918M(r0)
            r0 = r18
        L_0x0434:
            if (r0 >= r1) goto L_0x0441
            r4 = r2[r0]
            boolean r4 = r5.mo15006n0(r4)
            r18 = r18 | r4
            int r0 = r0 + 1
            goto L_0x0434
        L_0x0441:
            java.lang.Object r0 = r5.mo14921N()
            if (r18 != 0) goto L_0x0453
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x0450
            goto L_0x0453
        L_0x0450:
            r14 = r5
            r7 = r6
            goto L_0x0467
        L_0x0453:
            com.google.accompanist.pager.Pager$Pager$8$1 r13 = new com.google.accompanist.pager.Pager$Pager$8$1
            r0 = r13
            r1 = r32
            r2 = r39
            r4 = r44
            r14 = r5
            r5 = r21
            r7 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.mo14893C(r13)
        L_0x0467:
            r14.mo15002m0()
            r16 = r0
            kotlin.jvm.functions.l r16 = (kotlin.jvm.functions.C11300l) r16
            r0 = r20 & 14
            r1 = r8 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r9 << 15
            r1 = r1 & r23
            r0 = r0 | r1
            r1 = r7 & r24
            r0 = r0 | r1
            r1 = r11 & r25
            r18 = r0 | r1
            r19 = 0
            r8 = r33
            r9 = r10
            r10 = r40
            r11 = r35
            r13 = r26
            r0 = r14
            r14 = r38
            r1 = r15
            r15 = r41
            r17 = r0
            androidx.compose.foundation.lazy.LazyDslKt.m10739d(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.mo15002m0()
        L_0x049b:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x04a4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04a4:
            r12 = r1
            r11 = r26
        L_0x04a7:
            androidx.compose.runtime.t1 r15 = r0.mo15020s()
            if (r15 != 0) goto L_0x04ae
            goto L_0x04db
        L_0x04ae:
            com.google.accompanist.pager.Pager$Pager$9 r14 = new com.google.accompanist.pager.Pager$Pager$9
            r0 = r14
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r41
            r13 = r44
            r30 = r14
            r14 = r46
            r31 = r15
            r15 = r47
            r16 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r30
            r0 = r31
            r0.mo15202a(r1)
        L_0x04db:
            return
        L_0x04dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "pageCount must be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager.m64355b(int, androidx.compose.ui.m, com.google.accompanist.pager.PagerState, boolean, float, boolean, androidx.compose.foundation.gestures.g, kotlin.jvm.functions.l, androidx.compose.foundation.layout.i0, boolean, androidx.compose.ui.c$c, androidx.compose.ui.c$b, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012f  */
    @kotlin.C11395k(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of VerticalPager is androidx.compose.foundation.pager.VerticalPager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64356c(int r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, @org.jetbrains.annotations.C12580l com.google.accompanist.pager.PagerState r36, boolean r37, float r38, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r39, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r40, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r41, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r42, boolean r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.google.accompanist.pager.C15029c, ? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47, int r48) {
        /*
            r13 = r44
            r12 = r46
            r11 = r48
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 323934645(0x134ed9b5, float:2.6108193E-27)
            r1 = r45
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r12 | 6
            r15 = r34
            goto L_0x002f
        L_0x001d:
            r1 = r12 & 14
            r15 = r34
            if (r1 != 0) goto L_0x002e
            boolean r1 = r9.mo14976f(r15)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r35
            boolean r6 = r9.mo15006n0(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r1 = r1 | r6
            goto L_0x004b
        L_0x0049:
            r5 = r35
        L_0x004b:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r11 & 4
            if (r6 != 0) goto L_0x005e
            r6 = r36
            boolean r7 = r9.mo15006n0(r6)
            if (r7 == 0) goto L_0x0060
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r6 = r36
        L_0x0060:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r7
            goto L_0x0066
        L_0x0064:
            r6 = r36
        L_0x0066:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r37
            boolean r10 = r9.mo14961b(r8)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r10
            goto L_0x0082
        L_0x0080:
            r8 = r37
        L_0x0082:
            r10 = r11 & 16
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r38
            goto L_0x00a1
        L_0x008e:
            r16 = r12 & r14
            r3 = r38
            if (r16 != 0) goto L_0x00a1
            boolean r16 = r9.mo14968d(r3)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r16
        L_0x00a1:
            r16 = r11 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00ac
            r1 = r1 | r17
            r14 = r39
            goto L_0x00c1
        L_0x00ac:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r12 & r18
            r14 = r39
            if (r18 != 0) goto L_0x00c1
            boolean r19 = r9.mo15006n0(r14)
            if (r19 == 0) goto L_0x00bd
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r19
        L_0x00c1:
            r19 = r11 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r19 == 0) goto L_0x00ce
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r0 = r40
            goto L_0x00e1
        L_0x00ce:
            r21 = r12 & r20
            r0 = r40
            if (r21 != 0) goto L_0x00e1
            boolean r22 = r9.mo15006n0(r0)
            if (r22 == 0) goto L_0x00dd
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r22
        L_0x00e1:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r12 & r22
            if (r23 != 0) goto L_0x00fd
            r2 = r11 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f6
            r2 = r41
            boolean r24 = r9.mo15006n0(r2)
            if (r24 == 0) goto L_0x00f8
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f6:
            r2 = r41
        L_0x00f8:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r24
            goto L_0x00ff
        L_0x00fd:
            r2 = r41
        L_0x00ff:
            r8 = r11 & 256(0x100, float:3.59E-43)
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            if (r8 == 0) goto L_0x010a
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r25
            goto L_0x0120
        L_0x010a:
            r25 = r12 & r24
            if (r25 != 0) goto L_0x0120
            r25 = r8
            r8 = r42
            boolean r26 = r9.mo14927P(r8)
            if (r26 == 0) goto L_0x011b
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r1 = r1 | r26
            goto L_0x0124
        L_0x0120:
            r25 = r8
            r8 = r42
        L_0x0124:
            r8 = r11 & 512(0x200, float:7.175E-43)
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            if (r8 == 0) goto L_0x012f
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x0145
        L_0x012f:
            r27 = r12 & r26
            if (r27 != 0) goto L_0x0145
            r27 = r8
            r8 = r43
            boolean r28 = r9.mo14961b(r8)
            if (r28 == 0) goto L_0x0140
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r1 = r1 | r28
            goto L_0x0149
        L_0x0145:
            r27 = r8
            r8 = r43
        L_0x0149:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0150
            r0 = r47 | 6
            goto L_0x0162
        L_0x0150:
            r0 = r47 & 14
            if (r0 != 0) goto L_0x0160
            boolean r0 = r9.mo14927P(r13)
            if (r0 == 0) goto L_0x015c
            r0 = 4
            goto L_0x015d
        L_0x015c:
            r0 = 2
        L_0x015d:
            r0 = r47 | r0
            goto L_0x0162
        L_0x0160:
            r0 = r47
        L_0x0162:
            r28 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r1 & r28
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x018d
            r2 = r0 & 11
            r3 = 2
            if (r2 != r3) goto L_0x018d
            boolean r2 = r9.mo15011p()
            if (r2 != 0) goto L_0x0178
            goto L_0x018d
        L_0x0178:
            r9.mo14958a0()
            r4 = r37
            r7 = r40
            r2 = r5
            r3 = r6
            r10 = r8
            r17 = r9
            r6 = r14
            r5 = r38
            r8 = r41
            r9 = r42
            goto L_0x02d2
        L_0x018d:
            r9.mo14930Q()
            r2 = r12 & 1
            if (r2 == 0) goto L_0x01c0
            boolean r2 = r9.mo14977f0()
            if (r2 == 0) goto L_0x019b
            goto L_0x01c0
        L_0x019b:
            r9.mo14958a0()
            r2 = r11 & 4
            if (r2 == 0) goto L_0x01a4
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01a4:
            r2 = r11 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01ac
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r2
        L_0x01ac:
            r30 = r37
            r19 = r38
            r27 = r40
            r29 = r41
            r31 = r42
            r23 = r5
            r28 = r6
            r32 = r8
            r25 = r14
            goto L_0x0258
        L_0x01c0:
            if (r4 == 0) goto L_0x01c7
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r23 = r2
            goto L_0x01c9
        L_0x01c7:
            r23 = r5
        L_0x01c9:
            r2 = r11 & 4
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x01da
            com.google.accompanist.pager.PagerState r2 = com.google.accompanist.pager.PagerStateKt.m64414a(r3, r9, r3, r5)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r29 = r1
            r28 = r2
            goto L_0x01de
        L_0x01da:
            r29 = r1
            r28 = r6
        L_0x01de:
            if (r7 == 0) goto L_0x01e3
            r30 = r3
            goto L_0x01e5
        L_0x01e3:
            r30 = r37
        L_0x01e5:
            if (r10 == 0) goto L_0x01ee
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r10 = r1
            goto L_0x01f0
        L_0x01ee:
            r10 = r38
        L_0x01f0:
            if (r16 == 0) goto L_0x01fc
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.layout.i0 r1 = androidx.compose.foundation.layout.PaddingKt.m10014a(r1)
            r14 = r1
        L_0x01fc:
            if (r19 == 0) goto L_0x0207
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r1 = r1.mo17068m()
            r16 = r1
            goto L_0x0209
        L_0x0207:
            r16 = r40
        L_0x0209:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x022f
            com.google.accompanist.pager.PagerDefaults r1 = com.google.accompanist.pager.PagerDefaults.f37132a
            r3 = 0
            r4 = 0
            float r6 = r14.mo8090a()
            int r2 = r29 >> 6
            r2 = r2 & 14
            r7 = r2 | 24576(0x6000, float:3.4438E-41)
            r19 = 6
            r2 = r28
            r31 = r5
            r5 = r6
            r6 = r9
            r8 = r19
            androidx.compose.foundation.gestures.g r1 = r1.mo41989a(r2, r3, r4, r5, r6, r7, r8)
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r29 & r2
            goto L_0x0235
        L_0x022f:
            r31 = r5
            r1 = r41
            r2 = r29
        L_0x0235:
            if (r25 == 0) goto L_0x0239
            r3 = 0
            goto L_0x023b
        L_0x0239:
            r3 = r42
        L_0x023b:
            if (r27 == 0) goto L_0x024b
            r29 = r1
            r1 = r2
            r19 = r10
            r25 = r14
            r27 = r16
            r32 = r31
            r31 = r3
            goto L_0x0258
        L_0x024b:
            r32 = r43
            r29 = r1
            r1 = r2
            r31 = r3
            r19 = r10
            r25 = r14
            r27 = r16
        L_0x0258:
            r9.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0269
            java.lang.String r2 = "com.google.accompanist.pager.VerticalPager (Pager.kt:331)"
            r3 = 323934645(0x134ed9b5, float:2.6108193E-27)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0269:
            r5 = 1
            r10 = 0
            r2 = r1 & 14
            r2 = r2 | r17
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r2 = r2 | r3
            int r3 = r1 >> 3
            r4 = r3 & r20
            r2 = r2 | r4
            r3 = r3 & r22
            r2 = r2 | r3
            int r3 = r1 << 9
            r3 = r3 & r24
            r2 = r2 | r3
            r3 = r1 & r26
            r14 = r2 | r3
            int r1 = r1 >> 15
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r15 = r0
            r16 = 1024(0x400, float:1.435E-42)
            r0 = r34
            r1 = r23
            r2 = r28
            r3 = r30
            r4 = r19
            r6 = r29
            r7 = r31
            r8 = r25
            r17 = r9
            r9 = r32
            r11 = r27
            r12 = r44
            r13 = r17
            m64355b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02c0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02c0:
            r5 = r19
            r2 = r23
            r6 = r25
            r7 = r27
            r3 = r28
            r8 = r29
            r4 = r30
            r9 = r31
            r10 = r32
        L_0x02d2:
            androidx.compose.runtime.t1 r15 = r17.mo15020s()
            if (r15 != 0) goto L_0x02d9
            goto L_0x02f0
        L_0x02d9:
            com.google.accompanist.pager.Pager$VerticalPager$1 r14 = new com.google.accompanist.pager.Pager$VerticalPager$1
            r0 = r14
            r1 = r34
            r11 = r44
            r12 = r46
            r13 = r47
            r33 = r14
            r14 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r33
            r15.mo15202a(r0)
        L_0x02f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager.m64356c(int, androidx.compose.ui.m, com.google.accompanist.pager.PagerState, boolean, float, androidx.compose.foundation.layout.i0, androidx.compose.ui.c$b, androidx.compose.foundation.gestures.g, kotlin.jvm.functions.l, boolean, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int, int):void");
    }

    @C11395k(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    /* renamed from: f */
    public static final float m64359f(@C12579k C15029c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return ((float) (cVar.mo42028a() - i)) + cVar.mo42029b();
    }

    /* renamed from: g */
    public static final long m64360g(long j, boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (z) {
            f = C15094f.m64880p(j);
        } else {
            f = 0.0f;
        }
        if (z2) {
            f2 = C15094f.m64882r(j);
        }
        return C15096g.m64898a(f, f2);
    }

    /* renamed from: h */
    public static final long m64361h(long j, boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (z) {
            f = C16509w.m74750l(j);
        } else {
            f = 0.0f;
        }
        if (z2) {
            f2 = C16509w.m74752n(j);
        }
        return C16511x.m74763a(f, f2);
    }
}
