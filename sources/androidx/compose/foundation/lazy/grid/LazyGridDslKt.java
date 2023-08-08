package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,493:1\n154#2:494\n154#2:495\n67#3,3:496\n66#3:499\n67#3,3:506\n66#3:509\n1114#4,6:500\n1114#4,6:510\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n67#1:494\n121#1:495\n153#1:496,3\n153#1:499\n185#1:506,3\n185#1:509\n153#1:500,6\n185#1:510,6\n*E\n"})
public final class LazyGridDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10974a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.grid.C2485c r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, @org.jetbrains.annotations.C12580l androidx.compose.foundation.lazy.grid.LazyGridState r29, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r30, boolean r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2269d r32, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2279l r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r34, boolean r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r1 = r27
            r0 = r36
            r15 = r38
            r14 = r39
            java.lang.String r2 = "rows"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 2123608858(0x7e93b31a, float:9.816323E37)
            r3 = r37
            androidx.compose.runtime.o r13 = r3.mo15009o(r2)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r13.mo15006n0(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r15
            goto L_0x0032
        L_0x0031:
            r3 = r15
        L_0x0032:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r28
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r28
        L_0x004e:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r14 & 4
            if (r6 != 0) goto L_0x0061
            r6 = r29
            boolean r7 = r13.mo15006n0(r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r6 = r29
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r29
        L_0x0069:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r30
            boolean r9 = r13.mo15006n0(r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r30
        L_0x0085:
            r9 = r14 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r11 = r15 & r10
            if (r11 != 0) goto L_0x00a2
            r11 = r31
            boolean r12 = r13.mo14961b(r11)
            if (r12 == 0) goto L_0x009e
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r12
            goto L_0x00a4
        L_0x00a2:
            r11 = r31
        L_0x00a4:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x00bf
            r12 = r14 & 32
            if (r12 != 0) goto L_0x00b8
            r12 = r32
            boolean r16 = r13.mo15006n0(r12)
            if (r16 == 0) goto L_0x00ba
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00b8:
            r12 = r32
        L_0x00ba:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r3 = r3 | r16
            goto L_0x00c1
        L_0x00bf:
            r12 = r32
        L_0x00c1:
            r16 = r14 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00ce
            r18 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r18
            r10 = r33
            goto L_0x00e1
        L_0x00ce:
            r18 = r15 & r17
            r10 = r33
            if (r18 != 0) goto L_0x00e1
            boolean r18 = r13.mo15006n0(r10)
            if (r18 == 0) goto L_0x00dd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r3 = r3 | r18
        L_0x00e1:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r15 & r18
            if (r19 != 0) goto L_0x00fd
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f6
            r2 = r34
            boolean r20 = r13.mo15006n0(r2)
            if (r20 == 0) goto L_0x00f8
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f6:
            r2 = r34
        L_0x00f8:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r3 = r3 | r20
            goto L_0x00ff
        L_0x00fd:
            r2 = r34
        L_0x00ff:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010c
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r21
            r5 = r35
            goto L_0x011f
        L_0x010c:
            r21 = r15 & r20
            r5 = r35
            if (r21 != 0) goto L_0x011f
            boolean r21 = r13.mo14961b(r5)
            if (r21 == 0) goto L_0x011b
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r3 = r3 | r21
        L_0x011f:
            r5 = r14 & 512(0x200, float:7.175E-43)
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            if (r5 == 0) goto L_0x0129
            r5 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0127:
            r3 = r3 | r5
            goto L_0x0139
        L_0x0129:
            r5 = r15 & r21
            if (r5 != 0) goto L_0x0139
            boolean r5 = r13.mo14927P(r0)
            if (r5 == 0) goto L_0x0136
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0136:
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0127
        L_0x0139:
            r5 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r5 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r0) goto L_0x015b
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x0149
            goto L_0x015b
        L_0x0149:
            r13.mo14958a0()
            r2 = r28
            r9 = r35
            r3 = r6
            r4 = r8
            r7 = r10
            r5 = r11
            r6 = r12
            r21 = r13
            r8 = r34
            goto L_0x027e
        L_0x015b:
            r13.mo14930Q()
            r0 = r15 & 1
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0192
            boolean r0 = r13.mo14977f0()
            if (r0 == 0) goto L_0x016c
            goto L_0x0192
        L_0x016c:
            r13.mo14958a0()
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0175
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0175:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x017a
            r3 = r3 & r5
        L_0x017a:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0182
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x0182:
            r0 = r28
            r25 = r34
            r26 = r35
            r22 = r6
            r23 = r11
            r24 = r12
            r12 = r8
            r11 = r10
            goto L_0x01fd
        L_0x0192:
            if (r4 == 0) goto L_0x0197
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0199
        L_0x0197:
            r0 = r28
        L_0x0199:
            r4 = r14 & 4
            r5 = 0
            if (r4 == 0) goto L_0x01a6
            r4 = 3
            androidx.compose.foundation.lazy.grid.LazyGridState r4 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.m11132a(r5, r5, r13, r5, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01a7
        L_0x01a6:
            r4 = r6
        L_0x01a7:
            if (r7 == 0) goto L_0x01b3
            float r6 = (float) r5
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.foundation.layout.i0 r6 = androidx.compose.foundation.layout.PaddingKt.m10014a(r6)
            goto L_0x01b4
        L_0x01b3:
            r6 = r8
        L_0x01b4:
            if (r9 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r5 = r11
        L_0x01b8:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x01ce
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            if (r5 != 0) goto L_0x01c5
            androidx.compose.foundation.layout.Arrangement$d r7 = r7.mo7630p()
            goto L_0x01c9
        L_0x01c5:
            androidx.compose.foundation.layout.Arrangement$d r7 = r7.mo7626h()
        L_0x01c9:
            r8 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r8
            goto L_0x01cf
        L_0x01ce:
            r7 = r12
        L_0x01cf:
            if (r16 == 0) goto L_0x01d8
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r8 = r8.mo7631r()
            goto L_0x01d9
        L_0x01d8:
            r8 = r10
        L_0x01d9:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01e9
            androidx.compose.foundation.gestures.m r9 = androidx.compose.foundation.gestures.C2202m.f5935a
            r10 = 6
            androidx.compose.foundation.gestures.g r9 = r9.mo7540a(r13, r10)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r10
            goto L_0x01eb
        L_0x01e9:
            r9 = r34
        L_0x01eb:
            if (r2 == 0) goto L_0x01f1
            r2 = 1
            r26 = r2
            goto L_0x01f3
        L_0x01f1:
            r26 = r35
        L_0x01f3:
            r22 = r4
            r23 = r5
            r12 = r6
            r24 = r7
            r11 = r8
            r25 = r9
        L_0x01fd:
            r13.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x020f
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)"
            r5 = 2123608858(0x7e93b31a, float:9.816323E37)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r3, r2, r4)
        L_0x020f:
            r2 = r3 & 14
            int r4 = r3 >> 15
            r4 = r4 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r3 >> 3
            r5 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            kotlin.jvm.functions.p r5 = m10987n(r1, r11, r12, r13, r2)
            r7 = 0
            r2 = r4 & 14
            r6 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r6
            r6 = r4 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            r6 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r2 = r2 | r6
            r6 = r4 & r17
            r2 = r2 | r6
            r4 = r4 & r18
            r2 = r2 | r4
            int r4 = r3 << 6
            r4 = r4 & r20
            r2 = r2 | r4
            int r4 = r3 << 12
            r4 = r4 & r21
            r16 = r2 | r4
            int r2 = r3 >> 27
            r17 = r2 & 14
            r18 = 0
            r2 = r0
            r3 = r22
            r4 = r5
            r5 = r12
            r6 = r23
            r8 = r25
            r9 = r26
            r10 = r11
            r19 = r11
            r11 = r24
            r20 = r12
            r12 = r36
            r21 = r13
            r14 = r16
            r15 = r17
            r16 = r18
            androidx.compose.foundation.lazy.grid.LazyGridKt.m11034a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x026f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x026f:
            r2 = r0
            r7 = r19
            r4 = r20
            r3 = r22
            r5 = r23
            r6 = r24
            r8 = r25
            r9 = r26
        L_0x027e:
            androidx.compose.runtime.t1 r13 = r21.mo15020s()
            if (r13 != 0) goto L_0x0285
            goto L_0x0296
        L_0x0285:
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1 r14 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
            r0 = r14
            r1 = r27
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo15202a(r14)
        L_0x0296:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.m10974a(androidx.compose.foundation.lazy.grid.c, androidx.compose.ui.m, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.i0, boolean, androidx.compose.foundation.layout.Arrangement$d, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.foundation.gestures.g, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10975b(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.grid.C2485c r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, @org.jetbrains.annotations.C12580l androidx.compose.foundation.lazy.grid.LazyGridState r29, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r30, boolean r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2279l r32, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2269d r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r34, boolean r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r1 = r27
            r0 = r36
            r15 = r38
            r14 = r39
            java.lang.String r2 = "columns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 1485410512(0x588990d0, float:1.21004046E15)
            r3 = r37
            androidx.compose.runtime.o r13 = r3.mo15009o(r2)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r13.mo15006n0(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r15
            goto L_0x0032
        L_0x0031:
            r3 = r15
        L_0x0032:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r28
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r28
        L_0x004e:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r14 & 4
            if (r6 != 0) goto L_0x0061
            r6 = r29
            boolean r7 = r13.mo15006n0(r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r6 = r29
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r29
        L_0x0069:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r30
            boolean r9 = r13.mo15006n0(r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r30
        L_0x0085:
            r9 = r14 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r11 = r15 & r10
            if (r11 != 0) goto L_0x00a2
            r11 = r31
            boolean r12 = r13.mo14961b(r11)
            if (r12 == 0) goto L_0x009e
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r12
            goto L_0x00a4
        L_0x00a2:
            r11 = r31
        L_0x00a4:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x00bf
            r12 = r14 & 32
            if (r12 != 0) goto L_0x00b8
            r12 = r32
            boolean r16 = r13.mo15006n0(r12)
            if (r16 == 0) goto L_0x00ba
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00b8:
            r12 = r32
        L_0x00ba:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r3 = r3 | r16
            goto L_0x00c1
        L_0x00bf:
            r12 = r32
        L_0x00c1:
            r16 = r14 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00ce
            r18 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r18
            r10 = r33
            goto L_0x00e1
        L_0x00ce:
            r18 = r15 & r17
            r10 = r33
            if (r18 != 0) goto L_0x00e1
            boolean r18 = r13.mo15006n0(r10)
            if (r18 == 0) goto L_0x00dd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r3 = r3 | r18
        L_0x00e1:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r15 & r18
            if (r19 != 0) goto L_0x00fd
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f6
            r2 = r34
            boolean r20 = r13.mo15006n0(r2)
            if (r20 == 0) goto L_0x00f8
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f6:
            r2 = r34
        L_0x00f8:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r3 = r3 | r20
            goto L_0x00ff
        L_0x00fd:
            r2 = r34
        L_0x00ff:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010c
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r21
            r5 = r35
            goto L_0x011f
        L_0x010c:
            r21 = r15 & r20
            r5 = r35
            if (r21 != 0) goto L_0x011f
            boolean r21 = r13.mo14961b(r5)
            if (r21 == 0) goto L_0x011b
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r3 = r3 | r21
        L_0x011f:
            r5 = r14 & 512(0x200, float:7.175E-43)
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            if (r5 == 0) goto L_0x0129
            r5 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0127:
            r3 = r3 | r5
            goto L_0x0139
        L_0x0129:
            r5 = r15 & r21
            if (r5 != 0) goto L_0x0139
            boolean r5 = r13.mo14927P(r0)
            if (r5 == 0) goto L_0x0136
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0136:
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0127
        L_0x0139:
            r5 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r5 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r0) goto L_0x015b
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x0149
            goto L_0x015b
        L_0x0149:
            r13.mo14958a0()
            r2 = r28
            r9 = r35
            r3 = r6
            r4 = r8
            r7 = r10
            r5 = r11
            r6 = r12
            r21 = r13
            r8 = r34
            goto L_0x027b
        L_0x015b:
            r13.mo14930Q()
            r0 = r15 & 1
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0192
            boolean r0 = r13.mo14977f0()
            if (r0 == 0) goto L_0x016c
            goto L_0x0192
        L_0x016c:
            r13.mo14958a0()
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0175
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0175:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x017a
            r3 = r3 & r5
        L_0x017a:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0182
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x0182:
            r0 = r28
            r25 = r34
            r26 = r35
            r22 = r6
            r23 = r11
            r24 = r12
            r12 = r8
            r11 = r10
            goto L_0x01fd
        L_0x0192:
            if (r4 == 0) goto L_0x0197
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0199
        L_0x0197:
            r0 = r28
        L_0x0199:
            r4 = r14 & 4
            r5 = 0
            if (r4 == 0) goto L_0x01a6
            r4 = 3
            androidx.compose.foundation.lazy.grid.LazyGridState r4 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.m11132a(r5, r5, r13, r5, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01a7
        L_0x01a6:
            r4 = r6
        L_0x01a7:
            if (r7 == 0) goto L_0x01b3
            float r6 = (float) r5
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.foundation.layout.i0 r6 = androidx.compose.foundation.layout.PaddingKt.m10014a(r6)
            goto L_0x01b4
        L_0x01b3:
            r6 = r8
        L_0x01b4:
            if (r9 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r5 = r11
        L_0x01b8:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x01ce
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            if (r5 != 0) goto L_0x01c5
            androidx.compose.foundation.layout.Arrangement$l r7 = r7.mo7631r()
            goto L_0x01c9
        L_0x01c5:
            androidx.compose.foundation.layout.Arrangement$l r7 = r7.mo7624d()
        L_0x01c9:
            r8 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r8
            goto L_0x01cf
        L_0x01ce:
            r7 = r12
        L_0x01cf:
            if (r16 == 0) goto L_0x01d8
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r8 = r8.mo7630p()
            goto L_0x01d9
        L_0x01d8:
            r8 = r10
        L_0x01d9:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01e9
            androidx.compose.foundation.gestures.m r9 = androidx.compose.foundation.gestures.C2202m.f5935a
            r10 = 6
            androidx.compose.foundation.gestures.g r9 = r9.mo7540a(r13, r10)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r10
            goto L_0x01eb
        L_0x01e9:
            r9 = r34
        L_0x01eb:
            if (r2 == 0) goto L_0x01f1
            r2 = 1
            r26 = r2
            goto L_0x01f3
        L_0x01f1:
            r26 = r35
        L_0x01f3:
            r22 = r4
            r23 = r5
            r12 = r6
            r24 = r7
            r11 = r8
            r25 = r9
        L_0x01fd:
            r13.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x020f
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)"
            r5 = 1485410512(0x588990d0, float:1.21004046E15)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r3, r2, r4)
        L_0x020f:
            r2 = r3 & 14
            int r4 = r3 >> 15
            r4 = r4 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r3 >> 3
            r5 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            kotlin.jvm.functions.p r5 = m10986m(r1, r11, r12, r13, r2)
            r7 = 1
            r2 = r4 & 14
            r6 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r6
            r6 = r4 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            r6 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r2 = r2 | r6
            r6 = r4 & r17
            r2 = r2 | r6
            r4 = r4 & r18
            r2 = r2 | r4
            int r4 = r3 << 9
            r6 = r4 & r20
            r2 = r2 | r6
            r4 = r4 & r21
            r16 = r2 | r4
            int r2 = r3 >> 27
            r17 = r2 & 14
            r18 = 0
            r2 = r0
            r3 = r22
            r4 = r5
            r5 = r12
            r6 = r23
            r8 = r25
            r9 = r26
            r10 = r24
            r19 = r11
            r20 = r12
            r12 = r36
            r21 = r13
            r14 = r16
            r15 = r17
            r16 = r18
            androidx.compose.foundation.lazy.grid.LazyGridKt.m11034a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x026c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x026c:
            r2 = r0
            r7 = r19
            r4 = r20
            r3 = r22
            r5 = r23
            r6 = r24
            r8 = r25
            r9 = r26
        L_0x027b:
            androidx.compose.runtime.t1 r13 = r21.mo15020s()
            if (r13 != 0) goto L_0x0282
            goto L_0x0293
        L_0x0282:
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1 r14 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
            r0 = r14
            r1 = r27
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo15202a(r14)
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.m10975b(androidx.compose.foundation.lazy.grid.c, androidx.compose.ui.m, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.i0, boolean, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.foundation.layout.Arrangement$d, androidx.compose.foundation.gestures.g, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final List<Integer> m10977d(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i8 = 0; i8 < i2; i8++) {
            if (i8 < i7) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            arrayList.add(Integer.valueOf(i4 + i6));
        }
        return arrayList;
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: e */
    public static final <T> void m10978e(@C12579k LazyGridScope lazyGridScope, @C12579k List<? extends T> list, @C12580l C11300l<? super T, ? extends Object> lVar, @C12580l C11304p<? super C2497l, ? super T, C2488d> pVar, @C12579k C11300l<? super T, ? extends Object> lVar2, @C12579k C11306r<? super C2496k, ? super T, ? super C8592o, ? super Integer, C11079d2> rVar) {
        LazyGridDslKt$items$2 lazyGridDslKt$items$2;
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        int size = list.size();
        LazyGridDslKt$items$3 lazyGridDslKt$items$3 = null;
        if (lVar != null) {
            lazyGridDslKt$items$2 = new LazyGridDslKt$items$2(lVar, list);
        } else {
            lazyGridDslKt$items$2 = null;
        }
        if (pVar != null) {
            lazyGridDslKt$items$3 = new LazyGridDslKt$items$3(pVar, list);
        }
        lazyGridScope.mo8466d(size, lazyGridDslKt$items$2, lazyGridDslKt$items$3, new LazyGridDslKt$items$4(lVar2, list), C8553b.m31049c(699646206, true, new LazyGridDslKt$items$5(rVar, list)));
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: f */
    public static final <T> void m10979f(@C12579k LazyGridScope lazyGridScope, @C12579k T[] tArr, @C12580l C11300l<? super T, ? extends Object> lVar, @C12580l C11304p<? super C2497l, ? super T, C2488d> pVar, @C12579k C11300l<? super T, ? extends Object> lVar2, @C12579k C11306r<? super C2496k, ? super T, ? super C8592o, ? super Integer, C11079d2> rVar) {
        LazyGridDslKt$items$7 lazyGridDslKt$items$7;
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        int length = tArr.length;
        LazyGridDslKt$items$8 lazyGridDslKt$items$8 = null;
        if (lVar != null) {
            lazyGridDslKt$items$7 = new LazyGridDslKt$items$7(lVar, tArr);
        } else {
            lazyGridDslKt$items$7 = null;
        }
        if (pVar != null) {
            lazyGridDslKt$items$8 = new LazyGridDslKt$items$8(pVar, tArr);
        }
        lazyGridScope.mo8466d(length, lazyGridDslKt$items$7, lazyGridDslKt$items$8, new LazyGridDslKt$items$9(lVar2, tArr), C8553b.m31049c(407562193, true, new LazyGridDslKt$items$10(rVar, tArr)));
    }

    /* renamed from: g */
    public static /* synthetic */ void m10980g(LazyGridScope lazyGridScope, List list, C11300l lVar, C11304p pVar, C11300l lVar2, C11306r rVar, int i, Object obj) {
        LazyGridDslKt$items$2 lazyGridDslKt$items$2;
        LazyGridDslKt$items$3 lazyGridDslKt$items$3 = null;
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            pVar = null;
        }
        if ((i & 8) != 0) {
            lVar2 = LazyGridDslKt$items$1.f6477f;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        int size = list.size();
        if (lVar != null) {
            lazyGridDslKt$items$2 = new LazyGridDslKt$items$2(lVar, list);
        } else {
            lazyGridDslKt$items$2 = null;
        }
        if (pVar != null) {
            lazyGridDslKt$items$3 = new LazyGridDslKt$items$3(pVar, list);
        }
        lazyGridScope.mo8466d(size, lazyGridDslKt$items$2, lazyGridDslKt$items$3, new LazyGridDslKt$items$4(lVar2, list), C8553b.m31049c(699646206, true, new LazyGridDslKt$items$5(rVar, list)));
    }

    /* renamed from: h */
    public static /* synthetic */ void m10981h(LazyGridScope lazyGridScope, Object[] objArr, C11300l lVar, C11304p pVar, C11300l lVar2, C11306r rVar, int i, Object obj) {
        LazyGridDslKt$items$7 lazyGridDslKt$items$7;
        LazyGridDslKt$items$8 lazyGridDslKt$items$8 = null;
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            pVar = null;
        }
        if ((i & 8) != 0) {
            lVar2 = LazyGridDslKt$items$6.f6478f;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        int length = objArr.length;
        if (lVar != null) {
            lazyGridDslKt$items$7 = new LazyGridDslKt$items$7(lVar, objArr);
        } else {
            lazyGridDslKt$items$7 = null;
        }
        if (pVar != null) {
            lazyGridDslKt$items$8 = new LazyGridDslKt$items$8(pVar, objArr);
        }
        lazyGridScope.mo8466d(length, lazyGridDslKt$items$7, lazyGridDslKt$items$8, new LazyGridDslKt$items$9(lVar2, objArr), C8553b.m31049c(407562193, true, new LazyGridDslKt$items$10(rVar, objArr)));
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: i */
    public static final <T> void m10982i(@C12579k LazyGridScope lazyGridScope, @C12579k List<? extends T> list, @C12580l C11304p<? super Integer, ? super T, ? extends Object> pVar, @C12580l C11305q<? super C2497l, ? super Integer, ? super T, C2488d> qVar, @C12579k C11304p<? super Integer, ? super T, ? extends Object> pVar2, @C12579k C11307s<? super C2496k, ? super Integer, ? super T, ? super C8592o, ? super Integer, C11079d2> sVar) {
        LazyGridDslKt$itemsIndexed$2 lazyGridDslKt$itemsIndexed$2;
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(pVar2, "contentType");
        Intrinsics.checkNotNullParameter(sVar, "itemContent");
        int size = list.size();
        LazyGridDslKt$itemsIndexed$3 lazyGridDslKt$itemsIndexed$3 = null;
        if (pVar != null) {
            lazyGridDslKt$itemsIndexed$2 = new LazyGridDslKt$itemsIndexed$2(pVar, list);
        } else {
            lazyGridDslKt$itemsIndexed$2 = null;
        }
        if (qVar != null) {
            lazyGridDslKt$itemsIndexed$3 = new LazyGridDslKt$itemsIndexed$3(qVar, list);
        }
        lazyGridScope.mo8466d(size, lazyGridDslKt$itemsIndexed$2, lazyGridDslKt$itemsIndexed$3, new LazyGridDslKt$itemsIndexed$4(pVar2, list), C8553b.m31049c(1229287273, true, new LazyGridDslKt$itemsIndexed$5(sVar, list)));
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: j */
    public static final <T> void m10983j(@C12579k LazyGridScope lazyGridScope, @C12579k T[] tArr, @C12580l C11304p<? super Integer, ? super T, ? extends Object> pVar, @C12580l C11305q<? super C2497l, ? super Integer, ? super T, C2488d> qVar, @C12579k C11304p<? super Integer, ? super T, ? extends Object> pVar2, @C12579k C11307s<? super C2496k, ? super Integer, ? super T, ? super C8592o, ? super Integer, C11079d2> sVar) {
        LazyGridDslKt$itemsIndexed$7 lazyGridDslKt$itemsIndexed$7;
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(pVar2, "contentType");
        Intrinsics.checkNotNullParameter(sVar, "itemContent");
        int length = tArr.length;
        LazyGridDslKt$itemsIndexed$8 lazyGridDslKt$itemsIndexed$8 = null;
        if (pVar != null) {
            lazyGridDslKt$itemsIndexed$7 = new LazyGridDslKt$itemsIndexed$7(pVar, tArr);
        } else {
            lazyGridDslKt$itemsIndexed$7 = null;
        }
        if (qVar != null) {
            lazyGridDslKt$itemsIndexed$8 = new LazyGridDslKt$itemsIndexed$8(qVar, tArr);
        }
        lazyGridScope.mo8466d(length, lazyGridDslKt$itemsIndexed$7, lazyGridDslKt$itemsIndexed$8, new LazyGridDslKt$itemsIndexed$9(pVar2, tArr), C8553b.m31049c(-911455938, true, new LazyGridDslKt$itemsIndexed$10(sVar, tArr)));
    }

    /* renamed from: k */
    public static /* synthetic */ void m10984k(LazyGridScope lazyGridScope, List list, C11304p pVar, C11305q qVar, C11304p pVar2, C11307s sVar, int i, Object obj) {
        LazyGridDslKt$itemsIndexed$2 lazyGridDslKt$itemsIndexed$2;
        LazyGridDslKt$itemsIndexed$3 lazyGridDslKt$itemsIndexed$3 = null;
        if ((i & 2) != 0) {
            pVar = null;
        }
        if ((i & 4) != 0) {
            qVar = null;
        }
        if ((i & 8) != 0) {
            pVar2 = LazyGridDslKt$itemsIndexed$1.f6479f;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(pVar2, "contentType");
        Intrinsics.checkNotNullParameter(sVar, "itemContent");
        int size = list.size();
        if (pVar != null) {
            lazyGridDslKt$itemsIndexed$2 = new LazyGridDslKt$itemsIndexed$2(pVar, list);
        } else {
            lazyGridDslKt$itemsIndexed$2 = null;
        }
        if (qVar != null) {
            lazyGridDslKt$itemsIndexed$3 = new LazyGridDslKt$itemsIndexed$3(qVar, list);
        }
        lazyGridScope.mo8466d(size, lazyGridDslKt$itemsIndexed$2, lazyGridDslKt$itemsIndexed$3, new LazyGridDslKt$itemsIndexed$4(pVar2, list), C8553b.m31049c(1229287273, true, new LazyGridDslKt$itemsIndexed$5(sVar, list)));
    }

    /* renamed from: l */
    public static /* synthetic */ void m10985l(LazyGridScope lazyGridScope, Object[] objArr, C11304p pVar, C11305q qVar, C11304p pVar2, C11307s sVar, int i, Object obj) {
        LazyGridDslKt$itemsIndexed$7 lazyGridDslKt$itemsIndexed$7;
        LazyGridDslKt$itemsIndexed$8 lazyGridDslKt$itemsIndexed$8 = null;
        if ((i & 2) != 0) {
            pVar = null;
        }
        if ((i & 4) != 0) {
            qVar = null;
        }
        if ((i & 8) != 0) {
            pVar2 = LazyGridDslKt$itemsIndexed$6.f6480f;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(pVar2, "contentType");
        Intrinsics.checkNotNullParameter(sVar, "itemContent");
        int length = objArr.length;
        if (pVar != null) {
            lazyGridDslKt$itemsIndexed$7 = new LazyGridDslKt$itemsIndexed$7(pVar, objArr);
        } else {
            lazyGridDslKt$itemsIndexed$7 = null;
        }
        if (qVar != null) {
            lazyGridDslKt$itemsIndexed$8 = new LazyGridDslKt$itemsIndexed$8(qVar, objArr);
        }
        lazyGridScope.mo8466d(length, lazyGridDslKt$itemsIndexed$7, lazyGridDslKt$itemsIndexed$8, new LazyGridDslKt$itemsIndexed$9(pVar2, objArr), C8553b.m31049c(-911455938, true, new LazyGridDslKt$itemsIndexed$10(sVar, objArr)));
    }

    @C8540g
    /* renamed from: m */
    public static final C11304p<C16479d, C16476b, List<Integer>> m10986m(C2485c cVar, Arrangement.C2269d dVar, C2366i0 i0Var, C8592o oVar, int i) {
        oVar.mo14918M(-1355301804);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1355301804, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(cVar) | oVar.mo15006n0(dVar) | oVar.mo15006n0(i0Var);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new LazyGridDslKt$rememberColumnWidthSums$1$1(i0Var, cVar, dVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C11304p<C16479d, C16476b, List<Integer>> pVar = (C11304p) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return pVar;
    }

    @C8540g
    /* renamed from: n */
    public static final C11304p<C16479d, C16476b, List<Integer>> m10987n(C2485c cVar, Arrangement.C2279l lVar, C2366i0 i0Var, C8592o oVar, int i) {
        oVar.mo14918M(239683573);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(239683573, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:180)");
        }
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(cVar) | oVar.mo15006n0(lVar) | oVar.mo15006n0(i0Var);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new LazyGridDslKt$rememberRowHeightSums$1$1(i0Var, cVar, lVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C11304p<C16479d, C16476b, List<Integer>> pVar = (C11304p) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return pVar;
    }
}
