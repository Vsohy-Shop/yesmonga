package androidx.compose.material;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n154#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n508#1:518\n*E\n"})
public final class TabRowKt {

    /* renamed from: a */
    public static final float f7955a = C16483g.m74435M((float) 90);
    @C12579k

    /* renamed from: b */
    public static final C1968g<Float> f7956b = C1972h.m8392q(250, 0, C1947b0.m8290b(), 2, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:129:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0111  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.p004ui.C8782q
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14103a(int r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, long r29, long r31, float r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super java.util.List<androidx.compose.material.C7906r1>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r1 = r27
            r10 = r36
            r11 = r38
            r12 = r39
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1473476840(0xffffffffa82c8718, float:-9.577212E-15)
            r2 = r37
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r11 | 6
            goto L_0x002d
        L_0x001d:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.mo14976f(r1)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r11
            goto L_0x002d
        L_0x002c:
            r3 = r11
        L_0x002d:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
            goto L_0x0047
        L_0x0034:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            r5 = r28
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
            goto L_0x0049
        L_0x0047:
            r5 = r28
        L_0x0049:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0062
            r6 = r12 & 4
            if (r6 != 0) goto L_0x005c
            r6 = r29
            boolean r8 = r2.mo14980g(r6)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005c:
            r6 = r29
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
            goto L_0x0064
        L_0x0062:
            r6 = r29
        L_0x0064:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r12 & 8
            if (r8 != 0) goto L_0x0077
            r8 = r31
            boolean r13 = r2.mo14980g(r8)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0077:
            r8 = r31
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r13
            goto L_0x007f
        L_0x007d:
            r8 = r31
        L_0x007f:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0086
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009b
            r14 = r33
            boolean r15 = r2.mo14968d(r14)
            if (r15 == 0) goto L_0x0097
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r15
            goto L_0x009d
        L_0x009b:
            r14 = r33
        L_0x009d:
            r15 = r12 & 32
            if (r15 == 0) goto L_0x00a8
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r0 = r34
            goto L_0x00bd
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r0 = r34
            if (r16 != 0) goto L_0x00bd
            boolean r17 = r2.mo14927P(r0)
            if (r17 == 0) goto L_0x00b9
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r3 = r3 | r17
        L_0x00bd:
            r17 = r12 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c8
            r3 = r3 | r18
            r0 = r35
            goto L_0x00dd
        L_0x00c8:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r11 & r19
            r0 = r35
            if (r19 != 0) goto L_0x00dd
            boolean r19 = r2.mo14927P(r0)
            if (r19 == 0) goto L_0x00d9
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r19
        L_0x00dd:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e5
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e3:
            r3 = r3 | r0
            goto L_0x00f6
        L_0x00e5:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r2.mo14927P(r10)
            if (r0 == 0) goto L_0x00f3
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e3
        L_0x00f3:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e3
        L_0x00f6:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0111
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x0106
            goto L_0x0111
        L_0x0106:
            r2.mo14958a0()
            r3 = r28
            r13 = r34
            r25 = r35
            goto L_0x01e2
        L_0x0111:
            r2.mo14930Q()
            r0 = r11 & 1
            r5 = 1
            if (r0 == 0) goto L_0x0138
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x0120
            goto L_0x0138
        L_0x0120:
            r2.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0129
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0129:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x012f
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012f:
            r0 = r28
            r25 = r35
            r13 = r3
            r4 = r14
            r3 = r34
            goto L_0x018b
        L_0x0138:
            if (r4 == 0) goto L_0x013d
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x013f
        L_0x013d:
            r0 = r28
        L_0x013f:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0150
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            r6 = 6
            androidx.compose.material.q r4 = r4.mo11075a(r2, r6)
            long r6 = androidx.compose.material.ColorsKt.m13385f(r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0150:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x015e
            int r4 = r3 >> 6
            r4 = r4 & 14
            long r8 = androidx.compose.material.ColorsKt.m13381b(r6, r2, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x015e:
            if (r13 == 0) goto L_0x0167
            androidx.compose.material.TabRowDefaults r4 = androidx.compose.material.TabRowDefaults.f7949a
            float r4 = r4.mo10609e()
            goto L_0x0168
        L_0x0167:
            r4 = r14
        L_0x0168:
            if (r15 == 0) goto L_0x0177
            androidx.compose.material.TabRowKt$ScrollableTabRow$1 r13 = new androidx.compose.material.TabRowKt$ScrollableTabRow$1
            r13.<init>(r1)
            r14 = -655609869(0xffffffffd8ec2ff3, float:-2.07752548E15)
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r14, r5, r13)
            goto L_0x0179
        L_0x0177:
            r13 = r34
        L_0x0179:
            if (r17 == 0) goto L_0x0184
            androidx.compose.material.ComposableSingletons$TabRowKt r14 = androidx.compose.material.ComposableSingletons$TabRowKt.f7609a
            kotlin.jvm.functions.p r14 = r14.mo10116b()
            r25 = r14
            goto L_0x0186
        L_0x0184:
            r25 = r35
        L_0x0186:
            r26 = r13
            r13 = r3
            r3 = r26
        L_0x018b:
            r2.mo14899E()
            boolean r14 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r14 == 0) goto L_0x019d
            r14 = -1
            java.lang.String r15 = "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)"
            r5 = -1473476840(0xffffffffa82c8718, float:-9.577212E-15)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r13, r14, r15)
        L_0x019d:
            r19 = 0
            r20 = 0
            androidx.compose.material.TabRowKt$ScrollableTabRow$2 r5 = new androidx.compose.material.TabRowKt$ScrollableTabRow$2
            r28 = r5
            r29 = r4
            r30 = r36
            r31 = r25
            r32 = r27
            r33 = r3
            r34 = r13
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r15 = 1455860572(0x56c6ab5c, float:1.09219643E14)
            r14 = 1
            androidx.compose.runtime.internal.a r21 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r15, r14, r5)
            int r5 = r13 >> 3
            r5 = r5 & 14
            r5 = r5 | r18
            r14 = r13 & 896(0x380, float:1.256E-42)
            r5 = r5 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r23 = r5 | r13
            r24 = 50
            r13 = r0
            r5 = 0
            r14 = r5
            r15 = r6
            r17 = r8
            r22 = r2
            androidx.compose.material.SurfaceKt.m13879b(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x01df
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01df:
            r13 = r3
            r14 = r4
            r3 = r0
        L_0x01e2:
            androidx.compose.runtime.t1 r15 = r2.mo15020s()
            if (r15 != 0) goto L_0x01e9
            goto L_0x0204
        L_0x01e9:
            androidx.compose.material.TabRowKt$ScrollableTabRow$3 r5 = new androidx.compose.material.TabRowKt$ScrollableTabRow$3
            r0 = r5
            r1 = r27
            r2 = r3
            r3 = r6
            r7 = r5
            r5 = r8
            r9 = r7
            r7 = r14
            r8 = r13
            r13 = r9
            r9 = r25
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r15.mo15202a(r13)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m14103a(int, androidx.compose.ui.m, long, long, float, kotlin.jvm.functions.q, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ef  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.p004ui.C8782q
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14104b(int r26, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, long r28, long r30, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super java.util.List<androidx.compose.material.C7906r1>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r1 = r26
            r9 = r34
            r10 = r36
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -249175289(0xfffffffff125e307, float:-8.214318E29)
            r2 = r35
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo14976f(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r27
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r27
        L_0x0047:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0060
            r6 = r37 & 4
            if (r6 != 0) goto L_0x005a
            r6 = r28
            boolean r8 = r2.mo14980g(r6)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r6 = r28
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
            goto L_0x0062
        L_0x0060:
            r6 = r28
        L_0x0062:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0079
            r8 = r37 & 8
            r11 = r30
            if (r8 != 0) goto L_0x0075
            boolean r8 = r2.mo14980g(r11)
            if (r8 == 0) goto L_0x0075
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r3 = r3 | r8
            goto L_0x007b
        L_0x0079:
            r11 = r30
        L_0x007b:
            r8 = r37 & 16
            if (r8 == 0) goto L_0x0082
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0082:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x0097
            r13 = r32
            boolean r14 = r2.mo14927P(r13)
            if (r14 == 0) goto L_0x0093
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r3 = r3 | r14
            goto L_0x0099
        L_0x0097:
            r13 = r32
        L_0x0099:
            r14 = r37 & 32
            if (r14 == 0) goto L_0x00a1
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00b6
        L_0x00a1:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00b6
            r15 = r33
            boolean r16 = r2.mo14927P(r15)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r16
            goto L_0x00b8
        L_0x00b6:
            r15 = r33
        L_0x00b8:
            r16 = r37 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c1
            r3 = r3 | r17
            goto L_0x00d4
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d4
            boolean r16 = r2.mo14927P(r9)
            if (r16 == 0) goto L_0x00d0
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r3 = r3 | r16
        L_0x00d4:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00ef
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x00e5
            goto L_0x00ef
        L_0x00e5:
            r2.mo14958a0()
            r3 = r27
            r8 = r13
            r23 = r15
            goto L_0x01a3
        L_0x00ef:
            r2.mo14930Q()
            r0 = r10 & 1
            r5 = 1
            if (r0 == 0) goto L_0x0116
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x00fe
            goto L_0x0116
        L_0x00fe:
            r2.mo14958a0()
            r0 = r37 & 4
            if (r0 == 0) goto L_0x0107
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0107:
            r0 = r37 & 8
            if (r0 == 0) goto L_0x010d
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010d:
            r0 = r27
            r8 = r13
        L_0x0110:
            r24 = r11
            r11 = r3
            r3 = r24
            goto L_0x0157
        L_0x0116:
            if (r4 == 0) goto L_0x011b
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x011d
        L_0x011b:
            r0 = r27
        L_0x011d:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x012e
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            r6 = 6
            androidx.compose.material.q r4 = r4.mo11075a(r2, r6)
            long r6 = androidx.compose.material.ColorsKt.m13385f(r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x012e:
            r4 = r37 & 8
            if (r4 == 0) goto L_0x013c
            int r4 = r3 >> 6
            r4 = r4 & 14
            long r11 = androidx.compose.material.ColorsKt.m13381b(r6, r2, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013c:
            if (r8 == 0) goto L_0x014b
            androidx.compose.material.TabRowKt$TabRow$1 r4 = new androidx.compose.material.TabRowKt$TabRow$1
            r4.<init>(r1)
            r8 = -553782708(0xffffffffdefdf24c, float:-9.1493859E18)
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r8, r5, r4)
            goto L_0x014c
        L_0x014b:
            r4 = r13
        L_0x014c:
            if (r14 == 0) goto L_0x0155
            androidx.compose.material.ComposableSingletons$TabRowKt r8 = androidx.compose.material.ComposableSingletons$TabRowKt.f7609a
            kotlin.jvm.functions.p r8 = r8.mo10115a()
            r15 = r8
        L_0x0155:
            r8 = r4
            goto L_0x0110
        L_0x0157:
            r2.mo14899E()
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0169
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.TabRow (TabRow.kt:128)"
            r14 = -249175289(0xfffffffff125e307, float:-8.214318E29)
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r11, r12, r13)
        L_0x0169:
            androidx.compose.ui.m r12 = androidx.compose.foundation.selection.SelectableGroupKt.m12057a(r0)
            r18 = 0
            r19 = 0
            androidx.compose.material.TabRowKt$TabRow$2 r14 = new androidx.compose.material.TabRowKt$TabRow$2
            r14.<init>(r9, r15, r8, r11)
            r13 = -1961746365(0xffffffff8b122043, float:-2.8142848E-32)
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r13, r5, r14)
            r13 = r11 & 896(0x380, float:1.256E-42)
            r13 = r13 | r17
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r21 = r13 | r11
            r22 = 50
            r11 = r12
            r12 = 0
            r13 = r6
            r23 = r15
            r15 = r3
            r17 = r18
            r18 = r19
            r19 = r5
            r20 = r2
            androidx.compose.material.SurfaceKt.m13879b(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01a1:
            r11 = r3
            r3 = r0
        L_0x01a3:
            androidx.compose.runtime.t1 r13 = r2.mo15020s()
            if (r13 != 0) goto L_0x01aa
            goto L_0x01c1
        L_0x01aa:
            androidx.compose.material.TabRowKt$TabRow$3 r14 = new androidx.compose.material.TabRowKt$TabRow$3
            r0 = r14
            r1 = r26
            r2 = r3
            r3 = r6
            r5 = r11
            r7 = r8
            r8 = r23
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r13.mo15202a(r14)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m14104b(int, androidx.compose.ui.m, long, long, kotlin.jvm.functions.q, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }
}
