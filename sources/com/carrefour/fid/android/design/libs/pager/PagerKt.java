package com.carrefour.fid.android.design.libs.pager;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.p004ui.unit.C16511x;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/design/libs/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,367:1\n154#2:368\n154#2:369\n154#2:370\n154#2:371\n1#3:372\n36#4:373\n50#4:380\n49#4:381\n36#4:388\n36#4:395\n36#4:402\n83#4,3:409\n83#4,3:418\n1114#5,6:374\n1114#5,6:382\n1114#5,6:389\n1114#5,6:396\n1114#5,6:403\n1114#5,6:412\n1114#5,6:421\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/design/libs/pager/PagerKt\n*L\n110#1:368\n111#1:369\n158#1:370\n159#1:371\n202#1:373\n206#1:380\n206#1:381\n211#1:388\n220#1:395\n228#1:402\n246#1:409,3\n274#1:418,3\n202#1:374,6\n206#1:382,6\n211#1:389,6\n220#1:396,6\n228#1:403,6\n246#1:412,6\n274#1:421,6\n*E\n"})
public final class PagerKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012a  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153665a(int r31, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.libs.pager.PagerState r33, boolean r34, float r35, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r37, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r38, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.carrefour.fid.android.design.libs.pager.C37465b, ? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r41, int r42, int r43) {
        /*
            r15 = r40
            r14 = r42
            r13 = r43
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = -1391877375(0xffffffffad09a301, float:-7.8237425E-12)
            r1 = r41
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r14 | 6
            r11 = r31
            goto L_0x002f
        L_0x001d:
            r1 = r14 & 14
            r11 = r31
            if (r1 != 0) goto L_0x002e
            boolean r1 = r12.mo14976f(r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r32
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r32
        L_0x004b:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r13 & 4
            if (r4 != 0) goto L_0x005e
            r4 = r33
            boolean r5 = r12.mo15006n0(r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r4 = r33
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
            goto L_0x0066
        L_0x0064:
            r4 = r33
        L_0x0066:
            r5 = r13 & 8
            if (r5 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0080
            r6 = r34
            boolean r7 = r12.mo14961b(r6)
            if (r7 == 0) goto L_0x007c
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r7
            goto L_0x0082
        L_0x0080:
            r6 = r34
        L_0x0082:
            r7 = r13 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008c:
            r8 = r14 & r10
            if (r8 != 0) goto L_0x009f
            r8 = r35
            boolean r9 = r12.mo14968d(r8)
            if (r9 == 0) goto L_0x009b
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r9
            goto L_0x00a1
        L_0x009f:
            r8 = r35
        L_0x00a1:
            r9 = r13 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00ac
            r1 = r1 | r16
            r10 = r36
            goto L_0x00c1
        L_0x00ac:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r14 & r17
            r10 = r36
            if (r17 != 0) goto L_0x00c1
            boolean r17 = r12.mo15006n0(r10)
            if (r17 == 0) goto L_0x00bd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r17
        L_0x00c1:
            r17 = r13 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00ce
            r19 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r19
            r0 = r37
            goto L_0x00e1
        L_0x00ce:
            r19 = r14 & r18
            r0 = r37
            if (r19 != 0) goto L_0x00e1
            boolean r20 = r12.mo15006n0(r0)
            if (r20 == 0) goto L_0x00dd
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r20
        L_0x00e1:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r14 & r20
            if (r21 != 0) goto L_0x00fd
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f6
            r0 = r38
            boolean r21 = r12.mo15006n0(r0)
            if (r21 == 0) goto L_0x00f8
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f6:
            r0 = r38
        L_0x00f8:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r21
            goto L_0x00ff
        L_0x00fd:
            r0 = r38
        L_0x00ff:
            r6 = r13 & 256(0x100, float:3.59E-43)
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x010a
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r22
            goto L_0x0120
        L_0x010a:
            r22 = r14 & r21
            if (r22 != 0) goto L_0x0120
            r22 = r6
            r6 = r39
            boolean r23 = r12.mo14927P(r6)
            if (r23 == 0) goto L_0x011b
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r1 = r1 | r23
            goto L_0x0124
        L_0x0120:
            r22 = r6
            r6 = r39
        L_0x0124:
            r0 = r13 & 512(0x200, float:7.175E-43)
            r23 = 1879048192(0x70000000, float:1.58456325E29)
            if (r0 == 0) goto L_0x012e
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012c:
            r1 = r1 | r0
            goto L_0x013e
        L_0x012e:
            r0 = r14 & r23
            if (r0 != 0) goto L_0x013e
            boolean r0 = r12.mo14927P(r15)
            if (r0 == 0) goto L_0x013b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x013b:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012c
        L_0x013e:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0161
            boolean r0 = r12.mo15011p()
            if (r0 != 0) goto L_0x014e
            goto L_0x0161
        L_0x014e:
            r12.mo14958a0()
            r2 = r32
            r7 = r37
            r3 = r4
            r9 = r6
            r5 = r8
            r6 = r10
            r20 = r12
            r4 = r34
            r8 = r38
            goto L_0x028a
        L_0x0161:
            r12.mo14930Q()
            r0 = r14 & 1
            r24 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0193
            boolean r0 = r12.mo14977f0()
            if (r0 == 0) goto L_0x0172
            goto L_0x0193
        L_0x0172:
            r12.mo14958a0()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x017b
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017b:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0181
            r1 = r1 & r24
        L_0x0181:
            r17 = r32
            r27 = r34
            r24 = r37
            r26 = r38
            r25 = r4
            r29 = r6
            r28 = r8
            r22 = r10
            goto L_0x0215
        L_0x0193:
            if (r2 == 0) goto L_0x0198
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x019a
        L_0x0198:
            r0 = r32
        L_0x019a:
            r2 = r13 & 4
            r3 = 0
            if (r2 == 0) goto L_0x01ab
            r2 = 1
            com.carrefour.fid.android.design.libs.pager.PagerState r2 = com.carrefour.fid.android.design.libs.pager.PagerStateKt.m153714a(r3, r12, r3, r2)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r26 = r1
            r25 = r2
            goto L_0x01af
        L_0x01ab:
            r26 = r1
            r25 = r4
        L_0x01af:
            if (r5 == 0) goto L_0x01b4
            r27 = r3
            goto L_0x01b6
        L_0x01b4:
            r27 = r34
        L_0x01b6:
            if (r7 == 0) goto L_0x01c0
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r28 = r1
            goto L_0x01c2
        L_0x01c0:
            r28 = r8
        L_0x01c2:
            if (r9 == 0) goto L_0x01ce
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.layout.i0 r1 = androidx.compose.foundation.layout.PaddingKt.m10014a(r1)
            r10 = r1
        L_0x01ce:
            if (r17 == 0) goto L_0x01d9
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17070q()
            r17 = r1
            goto L_0x01db
        L_0x01d9:
            r17 = r37
        L_0x01db:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01ff
            com.carrefour.fid.android.design.libs.pager.PagerDefaults r1 = com.carrefour.fid.android.design.libs.pager.PagerDefaults.f94070a
            r3 = 0
            r4 = 0
            androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
            float r5 = androidx.compose.foundation.layout.PaddingKt.m10021h(r10, r2)
            r7 = 0
            int r2 = r26 >> 6
            r2 = r2 & 14
            r8 = r2 | r16
            r9 = 22
            r2 = r25
            r6 = r7
            r7 = r12
            androidx.compose.foundation.gestures.g r1 = r1.mo114084a(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r26 & r24
            r26 = r2
            goto L_0x0201
        L_0x01ff:
            r1 = r38
        L_0x0201:
            if (r22 == 0) goto L_0x0207
            r2 = 0
            r29 = r2
            goto L_0x0209
        L_0x0207:
            r29 = r39
        L_0x0209:
            r22 = r10
            r24 = r17
            r17 = r0
            r30 = r26
            r26 = r1
            r1 = r30
        L_0x0215:
            r12.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0227
            r0 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.libs.pager.HorizontalPager (Pager.kt:104)"
            r3 = -1391877375(0xffffffffad09a301, float:-7.8237425E-12)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0227:
            r5 = 0
            r10 = 0
            r0 = r1 & 14
            r0 = r0 | r16
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 >> 3
            r3 = r2 & r18
            r0 = r0 | r3
            r2 = r2 & r20
            r0 = r0 | r2
            int r2 = r1 << 9
            r3 = r2 & r21
            r0 = r0 | r3
            r2 = r2 & r23
            r16 = r0 | r2
            int r0 = r1 >> 24
            r18 = r0 & 112(0x70, float:1.57E-43)
            r19 = 1024(0x400, float:1.435E-42)
            r0 = r31
            r1 = r17
            r2 = r25
            r3 = r27
            r4 = r28
            r6 = r26
            r7 = r29
            r8 = r22
            r9 = r24
            r11 = r40
            r20 = r12
            r13 = r16
            r14 = r18
            r15 = r19
            m153666b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x027a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x027a:
            r2 = r17
            r6 = r22
            r7 = r24
            r3 = r25
            r8 = r26
            r4 = r27
            r5 = r28
            r9 = r29
        L_0x028a:
            androidx.compose.runtime.t1 r13 = r20.mo15020s()
            if (r13 != 0) goto L_0x0291
            goto L_0x02a2
        L_0x0291:
            com.carrefour.fid.android.design.libs.pager.PagerKt$HorizontalPager$1 r14 = new com.carrefour.fid.android.design.libs.pager.PagerKt$HorizontalPager$1
            r0 = r14
            r1 = r31
            r10 = r40
            r11 = r42
            r12 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo15202a(r14)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.PagerKt.m153665a(int, androidx.compose.ui.m, com.carrefour.fid.android.design.libs.pager.PagerState, boolean, float, androidx.compose.foundation.layout.i0, androidx.compose.ui.c$c, androidx.compose.foundation.gestures.g, kotlin.jvm.functions.l, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.carrefour.fid.android.design.libs.pager.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$7$1} */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01e4, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x01e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153666b(int r29, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r30, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.libs.pager.PagerState r31, boolean r32, float r33, boolean r34, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2195g r35, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r36, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r37, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.carrefour.fid.android.design.libs.pager.C37465b, ? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r41, int r42, int r43, int r44) {
        /*
            r7 = r29
            r15 = r30
            r14 = r31
            r13 = r33
            r12 = r34
            r11 = r35
            r10 = r36
            r9 = r37
            r8 = r40
            r6 = r42
            r5 = r44
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
            r0 = 41592917(0x27aa855, float:1.8415408E-37)
            r1 = r41
            androidx.compose.runtime.o r4 = r1.mo15009o(r0)
            r1 = r5 & 1
            if (r1 == 0) goto L_0x003f
            r1 = r6 | 6
            goto L_0x004f
        L_0x003f:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x004e
            boolean r1 = r4.mo14976f(r7)
            if (r1 == 0) goto L_0x004b
            r1 = 4
            goto L_0x004c
        L_0x004b:
            r1 = 2
        L_0x004c:
            r1 = r1 | r6
            goto L_0x004f
        L_0x004e:
            r1 = r6
        L_0x004f:
            r16 = r5 & 2
            r17 = 32
            r18 = 16
            if (r16 == 0) goto L_0x005a
            r1 = r1 | 48
            goto L_0x006b
        L_0x005a:
            r16 = r6 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x006b
            boolean r16 = r4.mo15006n0(r15)
            if (r16 == 0) goto L_0x0067
            r16 = r17
            goto L_0x0069
        L_0x0067:
            r16 = r18
        L_0x0069:
            r1 = r1 | r16
        L_0x006b:
            r16 = r5 & 4
            if (r16 == 0) goto L_0x0072
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0082
        L_0x0072:
            r2 = r6 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0082
            boolean r2 = r4.mo15006n0(r14)
            if (r2 == 0) goto L_0x007f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0081
        L_0x007f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r5 & 8
            if (r2 == 0) goto L_0x0089
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009d
        L_0x0089:
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x009d
            r2 = r32
            boolean r16 = r4.mo14961b(r2)
            if (r16 == 0) goto L_0x0098
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x009a
        L_0x0098:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x009a:
            r1 = r1 | r16
            goto L_0x009f
        L_0x009d:
            r2 = r32
        L_0x009f:
            r16 = r5 & 16
            if (r16 == 0) goto L_0x00a6
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ba
        L_0x00a6:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r6 & r16
            if (r16 != 0) goto L_0x00ba
            boolean r16 = r4.mo14968d(r13)
            if (r16 == 0) goto L_0x00b6
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b8
        L_0x00b6:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00b8:
            r1 = r1 | r16
        L_0x00ba:
            r16 = r5 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00c5
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c2:
            r1 = r1 | r16
            goto L_0x00d5
        L_0x00c5:
            r16 = r6 & r19
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r4.mo14961b(r12)
            if (r16 == 0) goto L_0x00d2
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00d2:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c2
        L_0x00d5:
            r16 = r5 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e0
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00dd:
            r1 = r1 | r16
            goto L_0x00f0
        L_0x00e0:
            r16 = r6 & r20
            if (r16 != 0) goto L_0x00f0
            boolean r16 = r4.mo15006n0(r11)
            if (r16 == 0) goto L_0x00ed
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00ed:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00dd
        L_0x00f0:
            r3 = r5 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00f8
            r3 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00f6:
            r1 = r1 | r3
            goto L_0x0109
        L_0x00f8:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x0109
            boolean r3 = r4.mo14927P(r10)
            if (r3 == 0) goto L_0x0106
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x0106:
            r3 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00f6
        L_0x0109:
            r3 = r5 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0111
            r3 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x010f:
            r1 = r1 | r3
            goto L_0x0122
        L_0x0111:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x0122
            boolean r3 = r4.mo15006n0(r9)
            if (r3 == 0) goto L_0x011f
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x011f:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010f
        L_0x0122:
            r3 = r5 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x012d
            r21 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r21
            r0 = r38
            goto L_0x0142
        L_0x012d:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r6 & r21
            r0 = r38
            if (r21 != 0) goto L_0x0142
            boolean r22 = r4.mo15006n0(r0)
            if (r22 == 0) goto L_0x013e
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0140
        L_0x013e:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0140:
            r1 = r1 | r22
        L_0x0142:
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014b
            r22 = r43 | 6
            r2 = r39
            goto L_0x0161
        L_0x014b:
            r22 = r43 & 14
            r2 = r39
            if (r22 != 0) goto L_0x015f
            boolean r22 = r4.mo15006n0(r2)
            if (r22 == 0) goto L_0x015a
            r22 = 4
            goto L_0x015c
        L_0x015a:
            r22 = 2
        L_0x015c:
            r22 = r43 | r22
            goto L_0x0161
        L_0x015f:
            r22 = r43
        L_0x0161:
            r2 = r5 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0168
            r2 = r22 | 48
            goto L_0x017a
        L_0x0168:
            r2 = r43 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0178
            boolean r2 = r4.mo14927P(r8)
            if (r2 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r17 = r18
        L_0x0175:
            r2 = r22 | r17
            goto L_0x017a
        L_0x0178:
            r2 = r22
        L_0x017a:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r1 & r17
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x019b
            r5 = r2 & 91
            r6 = 18
            if (r5 != r6) goto L_0x019b
            boolean r5 = r4.mo15011p()
            if (r5 != 0) goto L_0x0191
            goto L_0x019b
        L_0x0191:
            r4.mo14958a0()
            r10 = r38
            r11 = r39
            r0 = r4
            goto L_0x0415
        L_0x019b:
            if (r3 == 0) goto L_0x01a5
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r3 = r3.mo17070q()
            r6 = r3
            goto L_0x01a7
        L_0x01a5:
            r6 = r38
        L_0x01a7:
            if (r0 == 0) goto L_0x01b1
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            r5 = r0
            goto L_0x01b3
        L_0x01b1:
            r5 = r39
        L_0x01b3:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = "com.carrefour.fid.android.design.libs.pager.Pager (Pager.kt:183)"
            r3 = 41592917(0x27aa855, float:1.8415408E-37)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r2, r0)
        L_0x01c1:
            if (r7 < 0) goto L_0x01c6
            r17 = 1
            goto L_0x01c8
        L_0x01c6:
            r17 = 0
        L_0x01c8:
            if (r17 == 0) goto L_0x0448
            int r3 = r1 >> 18
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r0)
            boolean r17 = r4.mo15006n0(r11)
            java.lang.Object r0 = r4.mo14921N()
            if (r17 != 0) goto L_0x01e7
            androidx.compose.runtime.o$a r17 = androidx.compose.runtime.C8592o.f23032a
            r21 = r2
            java.lang.Object r2 = r17.mo16277a()
            if (r0 != r2) goto L_0x01f1
            goto L_0x01e9
        L_0x01e7:
            r21 = r2
        L_0x01e9:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$2$1 r0 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$2$1
            r0.<init>(r11)
            r4.mo14893C(r0)
        L_0x01f1:
            r4.mo15002m0()
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r14.mo114106H(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            int r17 = r1 >> 6
            r17 = r17 & 14
            r22 = r3
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.mo14918M(r3)
            boolean r3 = r4.mo15006n0(r14)
            boolean r2 = r4.mo15006n0(r2)
            r2 = r2 | r3
            java.lang.Object r3 = r4.mo14921N()
            r23 = r5
            r5 = 0
            if (r2 != 0) goto L_0x0227
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x022f
        L_0x0227:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$3$1 r3 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$3$1
            r3.<init>(r14, r7, r5)
            r4.mo14893C(r3)
        L_0x022f:
            r4.mo15002m0()
            kotlin.jvm.functions.p r3 = (kotlin.jvm.functions.C11304p) r3
            r2 = r1 & 14
            r2 = r2 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r3, r4, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r0)
            boolean r0 = r4.mo15006n0(r14)
            java.lang.Object r2 = r4.mo14921N()
            if (r0 != 0) goto L_0x0253
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x025b
        L_0x0253:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$4$1 r2 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$4$1
            r2.<init>(r14, r5)
            r4.mo14893C(r2)
        L_0x025b:
            r4.mo15002m0()
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            r0 = r17 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r14, r2, r4, r0)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r2)
            boolean r2 = r4.mo15006n0(r14)
            java.lang.Object r3 = r4.mo14921N()
            if (r2 != 0) goto L_0x027d
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0285
        L_0x027d:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$5$1 r3 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$5$1
            r3.<init>(r14, r5)
            r4.mo14893C(r3)
        L_0x0285:
            r4.mo15002m0()
            kotlin.jvm.functions.p r3 = (kotlin.jvm.functions.C11304p) r3
            androidx.compose.runtime.EffectsKt.m29896h(r14, r3, r4, r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r0)
            boolean r0 = r4.mo15006n0(r14)
            java.lang.Object r2 = r4.mo14921N()
            if (r0 != 0) goto L_0x02a5
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x02ad
        L_0x02a5:
            com.carrefour.fid.android.design.libs.pager.c r2 = new com.carrefour.fid.android.design.libs.pager.c
            r2.<init>(r14)
            r4.mo14893C(r2)
        L_0x02ad:
            r4.mo15002m0()
            r5 = r2
            com.carrefour.fid.android.design.libs.pager.c r5 = (com.carrefour.fid.android.design.libs.pager.C37466c) r5
            com.carrefour.fid.android.design.libs.pager.a r3 = new com.carrefour.fid.android.design.libs.pager.a
            r0 = r12 ^ 1
            r3.<init>(r0, r12)
            if (r12 == 0) goto L_0x0370
            r2 = -1627087258(0xffffffff9f049e66, float:-2.808311E-20)
            r4.mo14918M(r2)
            androidx.compose.foundation.lazy.LazyListState r17 = r31.mo114119w()
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r18 = r2.mo7620B(r13, r6)
            r24 = 0
            r2 = 5
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r25 = java.lang.Integer.valueOf(r29)
            r26 = 0
            r0[r26] = r25
            r25 = 1
            r0[r25] = r10
            r16 = 2
            r0[r16] = r3
            r16 = 3
            r0[r16] = r8
            r16 = 4
            r0[r16] = r5
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.mo14918M(r2)
            r41 = r1
            r1 = 5
            r2 = 0
            r16 = 0
        L_0x02f5:
            if (r2 >= r1) goto L_0x0303
            r1 = r0[r2]
            boolean r1 = r4.mo15006n0(r1)
            r16 = r16 | r1
            int r2 = r2 + 1
            r1 = 5
            goto L_0x02f5
        L_0x0303:
            java.lang.Object r0 = r4.mo14921N()
            if (r16 != 0) goto L_0x031a
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x0312
            goto L_0x031a
        L_0x0312:
            r7 = r41
            r15 = r4
            r9 = r22
            r22 = r6
            goto L_0x0334
        L_0x031a:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$6$1 r2 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$6$1
            r0 = r2
            r7 = r41
            r1 = r29
            r8 = r2
            r2 = r36
            r9 = r22
            r15 = r4
            r4 = r40
            r22 = r6
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.mo14893C(r8)
            r0 = r8
        L_0x0334:
            r15.mo15002m0()
            r16 = r0
            kotlin.jvm.functions.l r16 = (kotlin.jvm.functions.C11300l) r16
            int r0 = r7 >> 3
            r0 = r0 & 14
            r1 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r21 << 15
            r1 = r1 & r19
            r0 = r0 | r1
            r1 = r7 & r20
            r0 = r0 | r1
            r19 = 128(0x80, float:1.794E-43)
            r8 = r30
            r9 = r17
            r10 = r37
            r11 = r32
            r12 = r18
            r6 = r13
            r13 = r23
            r14 = r35
            r4 = r15
            r15 = r24
            r17 = r4
            r18 = r0
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.mo15002m0()
            r0 = r4
            r1 = r23
            goto L_0x0409
        L_0x0370:
            r7 = r1
            r9 = r22
            r22 = r6
            r6 = r13
            r0 = -1627086102(0xffffffff9f04a2ea, float:-2.8086847E-20)
            r4.mo14918M(r0)
            androidx.compose.foundation.lazy.LazyListState r10 = r31.mo114119w()
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f6010a
            r15 = r23
            androidx.compose.foundation.layout.Arrangement$d r12 = r0.mo7619A(r6, r15)
            r17 = 0
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r8 = 0
            r1[r8] = r2
            r2 = 1
            r1[r2] = r36
            r2 = 2
            r1[r2] = r3
            r2 = 3
            r1[r2] = r40
            r2 = 4
            r1[r2] = r5
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.mo14918M(r2)
            r2 = r8
        L_0x03a7:
            if (r8 >= r0) goto L_0x03b3
            r11 = r1[r8]
            boolean r11 = r4.mo15006n0(r11)
            r2 = r2 | r11
            int r8 = r8 + 1
            goto L_0x03a7
        L_0x03b3:
            java.lang.Object r0 = r4.mo14921N()
            if (r2 != 0) goto L_0x03c4
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x03c2
            goto L_0x03c4
        L_0x03c2:
            r14 = r4
            goto L_0x03d6
        L_0x03c4:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$7$1 r8 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$7$1
            r0 = r8
            r1 = r29
            r2 = r36
            r14 = r4
            r4 = r40
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.mo14893C(r8)
        L_0x03d6:
            r14.mo15002m0()
            r16 = r0
            kotlin.jvm.functions.l r16 = (kotlin.jvm.functions.C11300l) r16
            int r0 = r7 >> 3
            r0 = r0 & 14
            r1 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r7 >> 12
            r1 = r1 & r19
            r0 = r0 | r1
            r1 = r7 & r20
            r18 = r0 | r1
            r19 = 128(0x80, float:1.794E-43)
            r8 = r30
            r9 = r10
            r10 = r37
            r11 = r32
            r13 = r22
            r0 = r14
            r14 = r35
            r1 = r15
            r15 = r17
            r17 = r0
            androidx.compose.foundation.lazy.LazyDslKt.m10739d(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.mo15002m0()
        L_0x0409:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0412
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0412:
            r11 = r1
            r10 = r22
        L_0x0415:
            androidx.compose.runtime.t1 r15 = r0.mo15020s()
            if (r15 != 0) goto L_0x041c
            goto L_0x0447
        L_0x041c:
            com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$8 r14 = new com.carrefour.fid.android.design.libs.pager.PagerKt$Pager$8
            r0 = r14
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r12 = r40
            r13 = r42
            r27 = r14
            r14 = r43
            r28 = r15
            r15 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r27
            r0 = r28
            r0.mo15202a(r1)
        L_0x0447:
            return
        L_0x0448:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "pageCount must be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.PagerKt.m153666b(int, androidx.compose.ui.m, com.carrefour.fid.android.design.libs.pager.PagerState, boolean, float, boolean, androidx.compose.foundation.gestures.g, kotlin.jvm.functions.l, androidx.compose.foundation.layout.i0, androidx.compose.ui.c$c, androidx.compose.ui.c$b, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0128  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153667c(int r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.libs.pager.PagerState r32, boolean r33, float r34, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r36, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.carrefour.fid.android.design.libs.pager.C37465b, ? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41, int r42) {
        /*
            r15 = r39
            r14 = r41
            r13 = r42
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = -1532120475(0xffffffffa4adb265, float:-7.5329E-17)
            r1 = r40
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r14 | 6
            r11 = r30
            goto L_0x002f
        L_0x001d:
            r1 = r14 & 14
            r11 = r30
            if (r1 != 0) goto L_0x002e
            boolean r1 = r12.mo14976f(r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r31
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r31
        L_0x004b:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r13 & 4
            if (r4 != 0) goto L_0x005e
            r4 = r32
            boolean r5 = r12.mo15006n0(r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r4 = r32
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
            goto L_0x0066
        L_0x0064:
            r4 = r32
        L_0x0066:
            r5 = r13 & 8
            if (r5 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0080
            r6 = r33
            boolean r7 = r12.mo14961b(r6)
            if (r7 == 0) goto L_0x007c
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r7
            goto L_0x0082
        L_0x0080:
            r6 = r33
        L_0x0082:
            r7 = r13 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008c:
            r8 = r14 & r10
            if (r8 != 0) goto L_0x009f
            r8 = r34
            boolean r9 = r12.mo14968d(r8)
            if (r9 == 0) goto L_0x009b
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r9
            goto L_0x00a1
        L_0x009f:
            r8 = r34
        L_0x00a1:
            r9 = r13 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00ac
            r1 = r1 | r16
            r10 = r35
            goto L_0x00c1
        L_0x00ac:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r14 & r17
            r10 = r35
            if (r17 != 0) goto L_0x00c1
            boolean r17 = r12.mo15006n0(r10)
            if (r17 == 0) goto L_0x00bd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r17
        L_0x00c1:
            r17 = r13 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00ce
            r19 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r19
            r0 = r36
            goto L_0x00e1
        L_0x00ce:
            r19 = r14 & r18
            r0 = r36
            if (r19 != 0) goto L_0x00e1
            boolean r20 = r12.mo15006n0(r0)
            if (r20 == 0) goto L_0x00dd
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r20
        L_0x00e1:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r14 & r20
            if (r21 != 0) goto L_0x00fd
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f6
            r0 = r37
            boolean r21 = r12.mo15006n0(r0)
            if (r21 == 0) goto L_0x00f8
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f6:
            r0 = r37
        L_0x00f8:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r21
            goto L_0x00ff
        L_0x00fd:
            r0 = r37
        L_0x00ff:
            r6 = r13 & 256(0x100, float:3.59E-43)
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x010a
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r22
            goto L_0x0120
        L_0x010a:
            r22 = r14 & r21
            if (r22 != 0) goto L_0x0120
            r22 = r6
            r6 = r38
            boolean r23 = r12.mo14927P(r6)
            if (r23 == 0) goto L_0x011b
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r1 = r1 | r23
            goto L_0x0124
        L_0x0120:
            r22 = r6
            r6 = r38
        L_0x0124:
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x012c
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012a:
            r1 = r1 | r0
            goto L_0x013d
        L_0x012c:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x013d
            boolean r0 = r12.mo14927P(r15)
            if (r0 == 0) goto L_0x013a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x013a:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012a
        L_0x013d:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0160
            boolean r0 = r12.mo15011p()
            if (r0 != 0) goto L_0x014d
            goto L_0x0160
        L_0x014d:
            r12.mo14958a0()
            r2 = r31
            r7 = r36
            r3 = r4
            r9 = r6
            r5 = r8
            r6 = r10
            r20 = r12
            r4 = r33
            r8 = r37
            goto L_0x028a
        L_0x0160:
            r12.mo14930Q()
            r0 = r14 & 1
            r23 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0192
            boolean r0 = r12.mo14977f0()
            if (r0 == 0) goto L_0x0171
            goto L_0x0192
        L_0x0171:
            r12.mo14958a0()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x017a
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017a:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r23
        L_0x0180:
            r17 = r31
            r26 = r33
            r23 = r36
            r25 = r37
            r24 = r4
            r28 = r6
            r27 = r8
            r22 = r10
            goto L_0x0212
        L_0x0192:
            if (r2 == 0) goto L_0x0197
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0199
        L_0x0197:
            r0 = r31
        L_0x0199:
            r2 = r13 & 4
            r3 = 0
            if (r2 == 0) goto L_0x01aa
            r2 = 1
            com.carrefour.fid.android.design.libs.pager.PagerState r2 = com.carrefour.fid.android.design.libs.pager.PagerStateKt.m153714a(r3, r12, r3, r2)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r25 = r1
            r24 = r2
            goto L_0x01ae
        L_0x01aa:
            r25 = r1
            r24 = r4
        L_0x01ae:
            if (r5 == 0) goto L_0x01b3
            r26 = r3
            goto L_0x01b5
        L_0x01b3:
            r26 = r33
        L_0x01b5:
            if (r7 == 0) goto L_0x01bf
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r27 = r1
            goto L_0x01c1
        L_0x01bf:
            r27 = r8
        L_0x01c1:
            if (r9 == 0) goto L_0x01cd
            float r1 = (float) r3
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.layout.i0 r1 = androidx.compose.foundation.layout.PaddingKt.m10014a(r1)
            r10 = r1
        L_0x01cd:
            if (r17 == 0) goto L_0x01d8
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r1 = r1.mo17068m()
            r17 = r1
            goto L_0x01da
        L_0x01d8:
            r17 = r36
        L_0x01da:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01fc
            com.carrefour.fid.android.design.libs.pager.PagerDefaults r1 = com.carrefour.fid.android.design.libs.pager.PagerDefaults.f94070a
            r3 = 0
            r4 = 0
            float r5 = r10.mo8090a()
            r7 = 0
            int r2 = r25 >> 6
            r2 = r2 & 14
            r8 = r2 | r16
            r9 = 22
            r2 = r24
            r6 = r7
            r7 = r12
            androidx.compose.foundation.gestures.g r1 = r1.mo114084a(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r25 & r23
            r25 = r2
            goto L_0x01fe
        L_0x01fc:
            r1 = r37
        L_0x01fe:
            if (r22 == 0) goto L_0x0204
            r2 = 0
            r28 = r2
            goto L_0x0206
        L_0x0204:
            r28 = r38
        L_0x0206:
            r22 = r10
            r23 = r17
            r17 = r0
            r29 = r25
            r25 = r1
            r1 = r29
        L_0x0212:
            r12.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0224
            r0 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.libs.pager.VerticalPager (Pager.kt:152)"
            r3 = -1532120475(0xffffffffa4adb265, float:-7.5329E-17)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0224:
            r5 = 1
            r9 = 0
            r0 = r1 & 14
            r0 = r0 | r16
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 >> 3
            r3 = r2 & r18
            r0 = r0 | r3
            r2 = r2 & r20
            r0 = r0 | r2
            int r2 = r1 << 9
            r2 = r2 & r21
            r16 = r0 | r2
            int r0 = r1 >> 18
            r0 = r0 & 14
            int r1 = r1 >> 24
            r1 = r1 & 112(0x70, float:1.57E-43)
            r18 = r0 | r1
            r19 = 512(0x200, float:7.175E-43)
            r0 = r30
            r1 = r17
            r2 = r24
            r3 = r26
            r4 = r27
            r6 = r25
            r7 = r28
            r8 = r22
            r10 = r23
            r11 = r39
            r20 = r12
            r13 = r16
            r14 = r18
            r15 = r19
            m153666b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x027a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x027a:
            r2 = r17
            r6 = r22
            r7 = r23
            r3 = r24
            r8 = r25
            r4 = r26
            r5 = r27
            r9 = r28
        L_0x028a:
            androidx.compose.runtime.t1 r13 = r20.mo15020s()
            if (r13 != 0) goto L_0x0291
            goto L_0x02a2
        L_0x0291:
            com.carrefour.fid.android.design.libs.pager.PagerKt$VerticalPager$1 r14 = new com.carrefour.fid.android.design.libs.pager.PagerKt$VerticalPager$1
            r0 = r14
            r1 = r30
            r10 = r39
            r11 = r41
            r12 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo15202a(r14)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.PagerKt.m153667c(int, androidx.compose.ui.m, com.carrefour.fid.android.design.libs.pager.PagerState, boolean, float, androidx.compose.foundation.layout.i0, androidx.compose.ui.c$b, androidx.compose.foundation.gestures.g, kotlin.jvm.functions.l, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: f */
    public static final float m153670f(@C12579k C37465b bVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (((float) bVar.mo114129a()) + bVar.mo114130b()) - ((float) i);
    }

    /* renamed from: g */
    public static final long m153671g(long j, boolean z, boolean z2) {
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
    public static final long m153672h(long j, boolean z, boolean z2) {
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
