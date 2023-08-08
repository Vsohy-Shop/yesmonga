package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,547:1\n400#1:549\n400#1:550\n400#1:551\n400#1:552\n400#1:553\n400#1:554\n76#2:548\n154#3:555\n154#3:556\n154#3:557\n154#3:559\n154#3:561\n154#3:562\n58#4:558\n58#4:560\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n426#1:549\n458#1:550\n459#1:551\n461#1:552\n468#1:553\n469#1:554\n224#1:548\n534#1:555\n536#1:556\n538#1:557\n541#1:559\n544#1:561\n546#1:562\n538#1:558\n541#1:560\n*E\n"})
public final class AppBarKt {

    /* renamed from: a */
    public static final float f7503a = C16483g.m74435M((float) 56);

    /* renamed from: b */
    public static final float f7504b;
    @C12579k

    /* renamed from: c */
    public static final C8767m f7505c;
    @C12579k

    /* renamed from: d */
    public static final C8767m f7506d;

    /* renamed from: e */
    public static final float f7507e = C16483g.m74435M((float) 8);

    /* renamed from: f */
    public static final float f7508f;

    static {
        float f = (float) 4;
        float M = C16483g.m74435M(f);
        f7504b = M;
        C8767m.C8768a aVar = C8767m.f23478j;
        f7505c = SizeKt.m10092H(aVar, C16483g.m74435M(C16483g.m74435M((float) 16) - M));
        f7506d = SizeKt.m10092H(SizeKt.m10110j(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(C16483g.m74435M((float) 72) - M));
        f7508f = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13205a(long r24, long r26, float r28, androidx.compose.foundation.layout.C2366i0 r29, androidx.compose.p004ui.graphics.C15218g4 r30, androidx.compose.p004ui.C8767m r31, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r6 = r29
            r9 = r32
            r10 = r34
            r0 = -1249680788(0xffffffffb583626c, float:-9.788905E-7)
            r1 = r33
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            r4 = r2
            r2 = r24
            goto L_0x002d
        L_0x0019:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002a
            r2 = r24
            boolean r4 = r1.mo14980g(r2)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r10
            goto L_0x002d
        L_0x002a:
            r2 = r24
            r4 = r10
        L_0x002d:
            r5 = r35 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
            r7 = r26
            goto L_0x0048
        L_0x0036:
            r5 = r10 & 112(0x70, float:1.57E-43)
            r7 = r26
            if (r5 != 0) goto L_0x0048
            boolean r5 = r1.mo14980g(r7)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0045:
            r5 = 16
        L_0x0047:
            r4 = r4 | r5
        L_0x0048:
            r5 = r35 & 4
            if (r5 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x004f:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0062
            r5 = r28
            boolean r11 = r1.mo14968d(r5)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r11
            goto L_0x0064
        L_0x0062:
            r5 = r28
        L_0x0064:
            r11 = r35 & 8
            if (r11 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007b
            boolean r11 = r1.mo15006n0(r6)
            if (r11 == 0) goto L_0x0078
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r11
        L_0x007b:
            r11 = r35 & 16
            if (r11 == 0) goto L_0x0084
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r15 = r30
            goto L_0x0098
        L_0x0084:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            r15 = r30
            if (r11 != 0) goto L_0x0098
            boolean r11 = r1.mo15006n0(r15)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r4 = r4 | r11
        L_0x0098:
            r11 = r35 & 32
            r12 = 458752(0x70000, float:6.42848E-40)
            if (r11 == 0) goto L_0x00a2
            r13 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r13
            goto L_0x00b5
        L_0x00a2:
            r13 = r10 & r12
            if (r13 != 0) goto L_0x00b5
            r13 = r31
            boolean r14 = r1.mo15006n0(r13)
            if (r14 == 0) goto L_0x00b1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r14
            goto L_0x00b7
        L_0x00b5:
            r13 = r31
        L_0x00b7:
            r14 = r35 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00c0
            r4 = r4 | r16
            goto L_0x00d1
        L_0x00c0:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00d1
            boolean r14 = r1.mo14927P(r9)
            if (r14 == 0) goto L_0x00ce
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r4 = r4 | r14
        L_0x00d1:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r4
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r12) goto L_0x00e7
            boolean r12 = r1.mo15011p()
            if (r12 != 0) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            r1.mo14958a0()
            r23 = r13
            goto L_0x013f
        L_0x00e7:
            if (r11 == 0) goto L_0x00ee
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            r23 = r11
            goto L_0x00f0
        L_0x00ee:
            r23 = r13
        L_0x00f0:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x00fc
            r11 = -1
            java.lang.String r12 = "androidx.compose.material.AppBar (AppBar.kt:504)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r11, r12)
        L_0x00fc:
            r17 = 0
            androidx.compose.material.AppBarKt$AppBar$1 r0 = new androidx.compose.material.AppBarKt$AppBar$1
            r0.<init>(r6, r9, r4)
            r11 = -1027830352(0xffffffffc2bc8db0, float:-94.27673)
            r12 = 1
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r12, r0)
            int r0 = r4 >> 15
            r0 = r0 & 14
            r0 = r0 | r16
            int r11 = r4 >> 9
            r11 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 | r11
            int r11 = r4 << 6
            r12 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r11
            int r4 = r4 << 9
            r11 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r11
            r21 = r0 | r4
            r22 = 16
            r11 = r23
            r12 = r30
            r13 = r24
            r15 = r26
            r18 = r28
            r20 = r1
            androidx.compose.material.SurfaceKt.m13879b(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x013f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x013f:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x0146
            goto L_0x0161
        L_0x0146:
            androidx.compose.material.AppBarKt$AppBar$2 r13 = new androidx.compose.material.AppBarKt$AppBar$2
            r0 = r13
            r1 = r24
            r3 = r26
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r23
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m13205a(long, long, float, androidx.compose.foundation.layout.i0, androidx.compose.ui.graphics.g4, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13206b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, long r26, long r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r30, float r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1651948973(0xffffffff9d894253, float:-3.6332176E-21)
            r1 = r34
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r36 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r26
            boolean r6 = r14.mo14980g(r4)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r26
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
            goto L_0x004b
        L_0x0049:
            r4 = r26
        L_0x004b:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r36 & 4
            if (r6 != 0) goto L_0x005e
            r6 = r28
            boolean r8 = r14.mo14980g(r6)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r6 = r28
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
            goto L_0x0066
        L_0x0064:
            r6 = r28
        L_0x0066:
            r8 = r36 & 8
            if (r8 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r9 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0080
            r9 = r30
            boolean r10 = r14.mo15006n0(r9)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r9 = r30
        L_0x0082:
            r10 = r36 & 16
            if (r10 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x009e
            r11 = r31
            boolean r15 = r14.mo14968d(r11)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r15
            goto L_0x00a0
        L_0x009e:
            r11 = r31
        L_0x00a0:
            r15 = r36 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00ad
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r0 = r32
            goto L_0x00c0
        L_0x00ad:
            r17 = r13 & r16
            r0 = r32
            if (r17 != 0) goto L_0x00c0
            boolean r18 = r14.mo15006n0(r0)
            if (r18 == 0) goto L_0x00bc
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r3 = r3 | r18
        L_0x00c0:
            r18 = r36 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c8:
            r3 = r3 | r18
            goto L_0x00db
        L_0x00cb:
            r18 = r13 & r19
            if (r18 != 0) goto L_0x00db
            boolean r18 = r14.mo14927P(r12)
            if (r18 == 0) goto L_0x00d8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c8
        L_0x00d8:
            r18 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c8
        L_0x00db:
            r18 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r18
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00f9
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            r14.mo14958a0()
            r1 = r25
            r8 = r32
            r2 = r4
            r4 = r6
            r6 = r9
            r7 = r11
            goto L_0x01df
        L_0x00f9:
            r14.mo14930Q()
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0122
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x0107
            goto L_0x0122
        L_0x0107:
            r14.mo14958a0()
            r0 = r36 & 2
            if (r0 == 0) goto L_0x0110
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0110:
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0116
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0116:
            r15 = r25
            r24 = r32
        L_0x011a:
            r20 = r4
            r22 = r6
            r18 = r11
            r11 = r9
            goto L_0x0167
        L_0x0122:
            if (r1 == 0) goto L_0x0127
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0129
        L_0x0127:
            r0 = r25
        L_0x0129:
            r1 = r36 & 2
            if (r1 == 0) goto L_0x013b
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            r2 = 6
            androidx.compose.material.q r1 = r1.mo11075a(r14, r2)
            long r1 = androidx.compose.material.ColorsKt.m13385f(r1)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r1
        L_0x013b:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x014a
            int r1 = r3 >> 3
            r1 = r1 & 14
            long r1 = androidx.compose.material.ColorsKt.m13381b(r4, r14, r1)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = r1
        L_0x014a:
            if (r8 == 0) goto L_0x014e
            r1 = 0
            r9 = r1
        L_0x014e:
            if (r10 == 0) goto L_0x0157
            androidx.compose.material.b r1 = androidx.compose.material.C3028b.f8056a
            float r1 = r1.mo10713a()
            r11 = r1
        L_0x0157:
            if (r15 == 0) goto L_0x0163
            androidx.compose.material.b r1 = androidx.compose.material.C3028b.f8056a
            androidx.compose.foundation.layout.i0 r1 = r1.mo10714b()
            r15 = r0
            r24 = r1
            goto L_0x011a
        L_0x0163:
            r24 = r32
            r15 = r0
            goto L_0x011a
        L_0x0167:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0179
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.BottomAppBar (AppBar.kt:214)"
            r2 = -1651948973(0xffffffff9d894253, float:-3.6332176E-21)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x0179:
            androidx.compose.runtime.i1 r0 = androidx.compose.material.ScaffoldKt.m13751e()
            java.lang.Object r0 = r14.mo15032w(r0)
            androidx.compose.material.h0 r0 = (androidx.compose.material.C3047h0) r0
            if (r11 == 0) goto L_0x0199
            r1 = 0
            if (r0 == 0) goto L_0x0190
            boolean r2 = r0.mo10773d()
            r4 = 1
            if (r2 != r4) goto L_0x0190
            r1 = r4
        L_0x0190:
            if (r1 == 0) goto L_0x0199
            androidx.compose.material.d r1 = new androidx.compose.material.d
            r1.<init>(r11, r0)
            r6 = r1
            goto L_0x019e
        L_0x0199:
            androidx.compose.ui.graphics.g4 r0 = androidx.compose.p004ui.graphics.C15321t3.m66567a()
            r6 = r0
        L_0x019e:
            int r0 = r3 >> 3
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 >> 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r3 << 15
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = r3 & r19
            r10 = r0 | r1
            r16 = 0
            r0 = r20
            r2 = r22
            r4 = r18
            r5 = r24
            r7 = r15
            r8 = r33
            r9 = r14
            r17 = r11
            r11 = r16
            m13205a(r0, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01d4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d4:
            r1 = r15
            r6 = r17
            r7 = r18
            r2 = r20
            r4 = r22
            r8 = r24
        L_0x01df:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x01e6
            goto L_0x01f5
        L_0x01e6:
            androidx.compose.material.AppBarKt$BottomAppBar$1 r15 = new androidx.compose.material.AppBarKt$BottomAppBar$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r14.mo15202a(r15)
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m13206b(androidx.compose.ui.m, long, long, androidx.compose.ui.graphics.g4, float, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x014b  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13207c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r23, long r24, long r26, float r28, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r12 = r30
            r13 = r32
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1897058582(0x7112d116, float:7.270013E29)
            r1 = r31
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r23
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r23
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r23
            r3 = r13
        L_0x0030:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r33 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r24
            boolean r6 = r14.mo14980g(r4)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r24
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
            goto L_0x004b
        L_0x0049:
            r4 = r24
        L_0x004b:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r33 & 4
            if (r6 != 0) goto L_0x005e
            r6 = r26
            boolean r8 = r14.mo14980g(r6)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r6 = r26
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
            goto L_0x0066
        L_0x0064:
            r6 = r26
        L_0x0066:
            r8 = r33 & 8
            if (r8 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r9 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0080
            r9 = r28
            boolean r10 = r14.mo14968d(r9)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r9 = r28
        L_0x0082:
            r10 = r33 & 16
            if (r10 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x009e
            r11 = r29
            boolean r15 = r14.mo15006n0(r11)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r15
            goto L_0x00a0
        L_0x009e:
            r11 = r29
        L_0x00a0:
            r15 = r33 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00aa
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a8:
            r3 = r3 | r15
            goto L_0x00ba
        L_0x00aa:
            r15 = r13 & r16
            if (r15 != 0) goto L_0x00ba
            boolean r15 = r14.mo14927P(r12)
            if (r15 == 0) goto L_0x00b7
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00b7:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a8
        L_0x00ba:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r3
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r0) goto L_0x00d4
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x00ca
            goto L_0x00d4
        L_0x00ca:
            r14.mo14958a0()
            r1 = r2
            r2 = r4
            r4 = r6
            r6 = r9
            r7 = r11
            goto L_0x0195
        L_0x00d4:
            r14.mo14930Q()
            r0 = r13 & 1
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x00e2
            goto L_0x00fb
        L_0x00e2:
            r14.mo14958a0()
            r0 = r33 & 2
            if (r0 == 0) goto L_0x00eb
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00eb:
            r0 = r33 & 4
            if (r0 == 0) goto L_0x00f1
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f1:
            r15 = r2
            r17 = r4
        L_0x00f4:
            r19 = r6
            r21 = r9
            r22 = r11
            goto L_0x0142
        L_0x00fb:
            if (r1 == 0) goto L_0x0100
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0101
        L_0x0100:
            r0 = r2
        L_0x0101:
            r1 = r33 & 2
            if (r1 == 0) goto L_0x0113
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            r2 = 6
            androidx.compose.material.q r1 = r1.mo11075a(r14, r2)
            long r1 = androidx.compose.material.ColorsKt.m13385f(r1)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0114
        L_0x0113:
            r1 = r4
        L_0x0114:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x0123
            int r4 = r3 >> 3
            r4 = r4 & 14
            long r4 = androidx.compose.material.ColorsKt.m13381b(r1, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = r4
        L_0x0123:
            if (r8 == 0) goto L_0x012c
            androidx.compose.material.b r4 = androidx.compose.material.C3028b.f8056a
            float r4 = r4.mo10715c()
            r9 = r4
        L_0x012c:
            if (r10 == 0) goto L_0x013e
            androidx.compose.material.b r4 = androidx.compose.material.C3028b.f8056a
            androidx.compose.foundation.layout.i0 r4 = r4.mo10714b()
            r15 = r0
            r17 = r1
            r22 = r4
            r19 = r6
            r21 = r9
            goto L_0x0142
        L_0x013e:
            r15 = r0
            r17 = r1
            goto L_0x00f4
        L_0x0142:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0154
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.TopAppBar (AppBar.kt:154)"
            r2 = 1897058582(0x7112d116, float:7.270013E29)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x0154:
            androidx.compose.ui.graphics.g4 r6 = androidx.compose.p004ui.graphics.C15321t3.m66567a()
            int r0 = r3 >> 3
            r1 = r0 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r3 << 15
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            int r2 = r3 << 3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r17
            r2 = r19
            r4 = r21
            r5 = r22
            r7 = r15
            r8 = r30
            r9 = r14
            m13205a(r0, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x018c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x018c:
            r1 = r15
            r2 = r17
            r4 = r19
            r6 = r21
            r7 = r22
        L_0x0195:
            androidx.compose.runtime.t1 r11 = r14.mo15020s()
            if (r11 != 0) goto L_0x019c
            goto L_0x01ab
        L_0x019c:
            androidx.compose.material.AppBarKt$TopAppBar$3 r14 = new androidx.compose.material.AppBarKt$TopAppBar$3
            r0 = r14
            r8 = r30
            r9 = r32
            r10 = r33
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r11.mo15202a(r14)
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m13207c(androidx.compose.ui.m, long, long, float, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f6  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13208d(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, long r29, long r31, float r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r1 = r25
            r10 = r35
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -2087748139(0xffffffff838f7dd5, float:-8.433674E-37)
            r2 = r34
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r10 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x0029
        L_0x0028:
            r3 = r10
        L_0x0029:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r26
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r26
        L_0x0045:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005f
            r7 = r27
            boolean r8 = r2.mo14927P(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r27
        L_0x0061:
            r8 = r36 & 8
            if (r8 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            r9 = r28
            boolean r11 = r2.mo14927P(r9)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
            goto L_0x007d
        L_0x007b:
            r9 = r28
        L_0x007d:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x0098
            r11 = r36 & 16
            if (r11 != 0) goto L_0x0092
            r11 = r29
            boolean r13 = r2.mo14980g(r11)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r11 = r29
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
            goto L_0x009a
        L_0x0098:
            r11 = r29
        L_0x009a:
            r13 = 458752(0x70000, float:6.42848E-40)
            r14 = r10 & r13
            if (r14 != 0) goto L_0x00b6
            r14 = r36 & 32
            if (r14 != 0) goto L_0x00af
            r14 = r31
            boolean r16 = r2.mo14980g(r14)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00af:
            r14 = r31
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r16
            goto L_0x00b8
        L_0x00b6:
            r14 = r31
        L_0x00b8:
            r16 = r36 & 64
            if (r16 == 0) goto L_0x00c3
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r13 = r33
            goto L_0x00d8
        L_0x00c3:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r10 & r17
            r13 = r33
            if (r17 != 0) goto L_0x00d8
            boolean r17 = r2.mo14968d(r13)
            if (r17 == 0) goto L_0x00d4
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r3 = r3 | r17
        L_0x00d8:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00f6
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x00e9
            goto L_0x00f6
        L_0x00e9:
            r2.mo14958a0()
            r3 = r26
            r4 = r7
            r6 = r9
            r7 = r11
            r9 = r13
            r23 = r14
            goto L_0x01bd
        L_0x00f6:
            r2.mo14930Q()
            r0 = r10 & 1
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0121
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x010a
            goto L_0x0121
        L_0x010a:
            r2.mo14958a0()
            r0 = r36 & 16
            if (r0 == 0) goto L_0x0113
            r3 = r3 & r17
        L_0x0113:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x0118
            r3 = r3 & r5
        L_0x0118:
            r0 = r26
            r4 = r7
            r6 = r9
            r7 = r11
            r5 = r13
            r23 = r14
            goto L_0x0167
        L_0x0121:
            if (r4 == 0) goto L_0x0126
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0128
        L_0x0126:
            r0 = r26
        L_0x0128:
            if (r6 == 0) goto L_0x012c
            r4 = 0
            goto L_0x012d
        L_0x012c:
            r4 = r7
        L_0x012d:
            if (r8 == 0) goto L_0x0136
            androidx.compose.material.ComposableSingletons$AppBarKt r6 = androidx.compose.material.ComposableSingletons$AppBarKt.f7588a
            kotlin.jvm.functions.q r6 = r6.mo10099a()
            goto L_0x0137
        L_0x0136:
            r6 = r9
        L_0x0137:
            r7 = r36 & 16
            if (r7 == 0) goto L_0x0149
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            r8 = 6
            androidx.compose.material.q r7 = r7.mo11075a(r2, r8)
            long r7 = androidx.compose.material.ColorsKt.m13385f(r7)
            r3 = r3 & r17
            goto L_0x014a
        L_0x0149:
            r7 = r11
        L_0x014a:
            r9 = r36 & 32
            if (r9 == 0) goto L_0x0158
            int r9 = r3 >> 12
            r9 = r9 & 14
            long r11 = androidx.compose.material.ColorsKt.m13381b(r7, r2, r9)
            r3 = r3 & r5
            goto L_0x0159
        L_0x0158:
            r11 = r14
        L_0x0159:
            if (r16 == 0) goto L_0x0164
            androidx.compose.material.b r5 = androidx.compose.material.C3028b.f8056a
            float r5 = r5.mo10715c()
            r23 = r11
            goto L_0x0167
        L_0x0164:
            r23 = r11
            r5 = r13
        L_0x0167:
            r2.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0179
            r9 = -1
            java.lang.String r11 = "androidx.compose.material.TopAppBar (AppBar.kt:76)"
            r12 = -2087748139(0xffffffff838f7dd5, float:-8.433674E-37)
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r3, r9, r11)
        L_0x0179:
            androidx.compose.material.b r9 = androidx.compose.material.C3028b.f8056a
            androidx.compose.foundation.layout.i0 r16 = r9.mo10714b()
            androidx.compose.ui.graphics.g4 r17 = androidx.compose.p004ui.graphics.C15321t3.m66567a()
            androidx.compose.material.AppBarKt$TopAppBar$1 r9 = new androidx.compose.material.AppBarKt$TopAppBar$1
            r9.<init>(r4, r3, r1, r6)
            r11 = -1484077694(0xffffffffa78ac582, float:-3.8516833E-15)
            r12 = 1
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r11, r12, r9)
            int r9 = r3 >> 12
            r11 = r9 & 14
            r12 = 1600512(0x186c00, float:2.242795E-39)
            r11 = r11 | r12
            r12 = r9 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r9 = r9 & 896(0x380, float:1.256E-42)
            r9 = r9 | r11
            int r3 = r3 << 12
            r11 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r11
            r21 = r9 | r3
            r22 = 0
            r11 = r7
            r13 = r23
            r15 = r5
            r18 = r0
            r20 = r2
            m13205a(r11, r13, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01bb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01bb:
            r3 = r0
            r9 = r5
        L_0x01bd:
            androidx.compose.runtime.t1 r12 = r2.mo15020s()
            if (r12 != 0) goto L_0x01c4
            goto L_0x01d9
        L_0x01c4:
            androidx.compose.material.AppBarKt$TopAppBar$2 r13 = new androidx.compose.material.AppBarKt$TopAppBar$2
            r0 = r13
            r1 = r25
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r7
            r7 = r23
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m13208d(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.q, long, long, float, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: l */
    public static final float m13216l(float f, float f2) {
        return -((float) Math.sqrt((double) ((f * f) - (f2 * f2))));
    }

    @C12579k
    /* renamed from: m */
    public static final Pair<Float, Float> m13217m(float f, float f2, float f3) {
        Pair pair;
        Float f4;
        Float f5;
        Float f6;
        Float f7;
        float f8 = f2 * f2;
        float f9 = f3 * f3;
        float f10 = (f * f) + f8;
        float f11 = f8 * f9 * (f10 - f9);
        float f12 = f * f9;
        double d = (double) f11;
        float sqrt = (f12 - ((float) Math.sqrt(d))) / f10;
        float sqrt2 = (f12 + ((float) Math.sqrt(d))) / f10;
        float sqrt3 = (float) Math.sqrt((double) (f9 - (sqrt * sqrt)));
        float sqrt4 = (float) Math.sqrt((double) (f9 - (sqrt2 * sqrt2)));
        if (f2 > 0.0f) {
            if (sqrt3 > sqrt4) {
                f7 = Float.valueOf(sqrt);
                f6 = Float.valueOf(sqrt3);
            } else {
                f7 = Float.valueOf(sqrt2);
                f6 = Float.valueOf(sqrt4);
            }
            pair = C11078d1.m42659a(f7, f6);
        } else {
            if (sqrt3 < sqrt4) {
                f5 = Float.valueOf(sqrt);
                f4 = Float.valueOf(sqrt3);
            } else {
                f5 = Float.valueOf(sqrt2);
                f4 = Float.valueOf(sqrt4);
            }
            pair = C11078d1.m42659a(f5, f4);
        }
        float floatValue = ((Number) pair.mo21846a()).floatValue();
        float floatValue2 = ((Number) pair.mo21847b()).floatValue();
        if (floatValue < f) {
            floatValue2 = -floatValue2;
        }
        return C11078d1.m42659a(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    /* renamed from: n */
    public static final float m13218n(float f) {
        return f * f;
    }
}
