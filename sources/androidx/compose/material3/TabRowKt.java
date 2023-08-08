package androidx.compose.material3;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,505:1\n154#2:506\n154#2:507\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n491#1:506\n496#1:507\n*E\n"})
public final class TabRowKt {

    /* renamed from: a */
    public static final float f19832a = C16483g.m74435M((float) 90);

    /* renamed from: b */
    public static final float f19833b = C16483g.m74435M((float) 52);
    @C12579k

    /* renamed from: c */
    public static final C1968g<Float> f19834c = C1972h.m8392q(250, 0, C1947b0.m8290b(), 2, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0112  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26580a(int r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, long r30, long r32, float r34, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super java.util.List<androidx.compose.material3.C8184c3>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -497821003(0xffffffffe253dab5, float:-9.770056E20)
            r2 = r38
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
            r5 = r29
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
            r5 = r29
        L_0x0049:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0062
            r6 = r12 & 4
            if (r6 != 0) goto L_0x005c
            r6 = r30
            boolean r8 = r2.mo14980g(r6)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005c:
            r6 = r30
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
            goto L_0x0064
        L_0x0062:
            r6 = r30
        L_0x0064:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r12 & 8
            if (r8 != 0) goto L_0x0077
            r8 = r32
            boolean r13 = r2.mo14980g(r8)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0077:
            r8 = r32
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r13
            goto L_0x007f
        L_0x007d:
            r8 = r32
        L_0x007f:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0086
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009b
            r14 = r34
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
            r14 = r34
        L_0x009d:
            r15 = r12 & 32
            if (r15 == 0) goto L_0x00a8
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r0 = r35
            goto L_0x00bd
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r0 = r35
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
            if (r17 == 0) goto L_0x00c8
            r18 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r18
            r0 = r36
            goto L_0x00dd
        L_0x00c8:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r11 & r18
            r0 = r36
            if (r18 != 0) goto L_0x00dd
            boolean r18 = r2.mo14927P(r0)
            if (r18 == 0) goto L_0x00d9
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r18
        L_0x00dd:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e6
            r3 = r3 | r18
            goto L_0x00f7
        L_0x00e6:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r2.mo14927P(r10)
            if (r0 == 0) goto L_0x00f4
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r3 = r3 | r0
        L_0x00f7:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0112
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x0107
            goto L_0x0112
        L_0x0107:
            r2.mo14958a0()
            r3 = r29
            r13 = r35
            r15 = r36
            goto L_0x01de
        L_0x0112:
            r2.mo14930Q()
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0139
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x0120
            goto L_0x0139
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
            r0 = r29
            r13 = r3
            r4 = r8
            r8 = r14
            r9 = r35
        L_0x0136:
            r3 = r36
            goto L_0x0183
        L_0x0139:
            if (r4 == 0) goto L_0x013e
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0140
        L_0x013e:
            r0 = r29
        L_0x0140:
            r4 = r12 & 4
            r5 = 6
            if (r4 == 0) goto L_0x014d
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.f19830a
            long r6 = r4.mo12153b(r2, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014d:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x015a
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.f19830a
            long r4 = r4.mo12154c(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x015b
        L_0x015a:
            r4 = r8
        L_0x015b:
            if (r13 == 0) goto L_0x0160
            float r8 = f19833b
            goto L_0x0161
        L_0x0160:
            r8 = r14
        L_0x0161:
            if (r15 == 0) goto L_0x0171
            androidx.compose.material3.TabRowKt$ScrollableTabRow$1 r9 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$1
            r9.<init>(r1)
            r13 = -913748678(0xffffffffc9894d3a, float:-1124775.2)
            r14 = 1
            androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r13, r14, r9)
            goto L_0x0173
        L_0x0171:
            r9 = r35
        L_0x0173:
            if (r17 == 0) goto L_0x0181
            androidx.compose.material3.ComposableSingletons$TabRowKt r13 = androidx.compose.material3.ComposableSingletons$TabRowKt.f19288a
            kotlin.jvm.functions.p r13 = r13.mo11325b()
            r27 = r13
            r13 = r3
            r3 = r27
            goto L_0x0183
        L_0x0181:
            r13 = r3
            goto L_0x0136
        L_0x0183:
            r2.mo14899E()
            boolean r14 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r14 == 0) goto L_0x0195
            r14 = -1
            java.lang.String r15 = "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)"
            r1 = -497821003(0xffffffffe253dab5, float:-9.770056E20)
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r13, r14, r15)
        L_0x0195:
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.material3.TabRowKt$ScrollableTabRow$2 r1 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$2
            r29 = r1
            r30 = r8
            r31 = r37
            r32 = r3
            r33 = r28
            r34 = r9
            r35 = r13
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r15 = 286469328(0x11132cd0, float:1.1610064E-28)
            r14 = 1
            androidx.compose.runtime.internal.a r22 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r15, r14, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            r1 = r1 | r18
            r14 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r24 = r1 | r13
            r25 = 114(0x72, float:1.6E-43)
            r13 = r0
            r1 = 0
            r14 = r1
            r15 = r6
            r17 = r4
            r23 = r2
            androidx.compose.material3.SurfaceKt.m26352a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01d9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d9:
            r15 = r3
            r14 = r8
            r13 = r9
            r3 = r0
            r8 = r4
        L_0x01de:
            androidx.compose.runtime.t1 r5 = r2.mo15020s()
            if (r5 != 0) goto L_0x01e5
            goto L_0x0203
        L_0x01e5:
            androidx.compose.material3.TabRowKt$ScrollableTabRow$3 r4 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$3
            r0 = r4
            r1 = r28
            r2 = r3
            r26 = r4
            r3 = r6
            r7 = r5
            r5 = r8
            r9 = r7
            r7 = r14
            r8 = r13
            r13 = r9
            r9 = r15
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r0 = r26
            r13.mo15202a(r0)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m26580a(int, androidx.compose.ui.m, long, long, float, kotlin.jvm.functions.q, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26581b(int r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, long r27, long r29, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super java.util.List<androidx.compose.material3.C8184c3>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r1 = r25
            r9 = r33
            r10 = r35
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1199178586(0xffffffffb885fca6, float:-6.388994E-5)
            r2 = r34
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r36 & 1
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
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r26
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
            r5 = r26
        L_0x0047:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0060
            r6 = r36 & 4
            if (r6 != 0) goto L_0x005a
            r6 = r27
            boolean r8 = r2.mo14980g(r6)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r6 = r27
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
            goto L_0x0062
        L_0x0060:
            r6 = r27
        L_0x0062:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0079
            r8 = r36 & 8
            r11 = r29
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
            r11 = r29
        L_0x007b:
            r8 = r36 & 16
            if (r8 == 0) goto L_0x0082
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0082:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x0097
            r13 = r31
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
            r13 = r31
        L_0x0099:
            r14 = r36 & 32
            if (r14 == 0) goto L_0x00a1
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00b6
        L_0x00a1:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00b6
            r15 = r32
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
            r15 = r32
        L_0x00b8:
            r16 = r36 & 64
            if (r16 == 0) goto L_0x00c1
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00be:
            r3 = r3 | r16
            goto L_0x00d3
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r2.mo14927P(r9)
            if (r16 == 0) goto L_0x00d0
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00be
        L_0x00d0:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00be
        L_0x00d3:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00ec
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x00e4
            goto L_0x00ec
        L_0x00e4:
            r2.mo14958a0()
            r3 = r26
            r8 = r13
            goto L_0x0199
        L_0x00ec:
            r2.mo14930Q()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0110
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x00fa
            goto L_0x0110
        L_0x00fa:
            r2.mo14958a0()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0103
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0103:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0109
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0109:
            r0 = r26
            r4 = r11
            r8 = r13
        L_0x010d:
            r11 = r3
            r3 = r15
            goto L_0x0150
        L_0x0110:
            if (r4 == 0) goto L_0x0115
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0117
        L_0x0115:
            r0 = r26
        L_0x0117:
            r4 = r36 & 4
            r5 = 6
            if (r4 == 0) goto L_0x0124
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.f19830a
            long r6 = r4.mo12153b(r2, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0124:
            r4 = r36 & 8
            if (r4 == 0) goto L_0x0131
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.f19830a
            long r4 = r4.mo12154c(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0132
        L_0x0131:
            r4 = r11
        L_0x0132:
            if (r8 == 0) goto L_0x0142
            androidx.compose.material3.TabRowKt$TabRow$1 r8 = new androidx.compose.material3.TabRowKt$TabRow$1
            r8.<init>(r1)
            r11 = -2052073983(0xffffffff85afd601, float:-1.6535534E-35)
            r12 = 1
            androidx.compose.runtime.internal.a r8 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r11, r12, r8)
            goto L_0x0143
        L_0x0142:
            r8 = r13
        L_0x0143:
            if (r14 == 0) goto L_0x010d
            androidx.compose.material3.ComposableSingletons$TabRowKt r11 = androidx.compose.material3.ComposableSingletons$TabRowKt.f19288a
            kotlin.jvm.functions.p r11 = r11.mo11324a()
            r24 = r11
            r11 = r3
            r3 = r24
        L_0x0150:
            r2.mo14899E()
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0162
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.TabRow (TabRow.kt:125)"
            r14 = -1199178586(0xffffffffb885fca6, float:-6.388994E-5)
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r11, r12, r13)
        L_0x0162:
            androidx.compose.ui.m r12 = androidx.compose.foundation.selection.SelectableGroupKt.m12057a(r0)
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material3.TabRowKt$TabRow$2 r14 = new androidx.compose.material3.TabRowKt$TabRow$2
            r14.<init>(r9, r3, r8, r11)
            r15 = 1273256619(0x4be45aab, float:2.9930838E7)
            r13 = 1
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r15, r13, r14)
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r14 = r11 & 896(0x380, float:1.256E-42)
            r13 = r13 | r14
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r22 = r13 | r11
            r23 = 114(0x72, float:1.6E-43)
            r11 = r12
            r12 = 0
            r13 = r6
            r15 = r4
            r21 = r2
            androidx.compose.material3.SurfaceKt.m26352a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x0196
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0196:
            r15 = r3
            r11 = r4
            r3 = r0
        L_0x0199:
            androidx.compose.runtime.t1 r13 = r2.mo15020s()
            if (r13 != 0) goto L_0x01a0
            goto L_0x01b6
        L_0x01a0:
            androidx.compose.material3.TabRowKt$TabRow$3 r14 = new androidx.compose.material3.TabRowKt$TabRow$3
            r0 = r14
            r1 = r25
            r2 = r3
            r3 = r6
            r5 = r11
            r7 = r8
            r8 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r13.mo15202a(r14)
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m26581b(int, androidx.compose.ui.m, long, long, kotlin.jvm.functions.q, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }
}
