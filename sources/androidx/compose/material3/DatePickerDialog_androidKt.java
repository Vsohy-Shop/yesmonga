package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n154#2:122\n154#2:123\n154#2:124\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n*L\n118#1:122\n119#1:123\n120#1:124\n*E\n"})
public final class DatePickerDialog_androidKt {
    @C12579k

    /* renamed from: a */
    public static final C2366i0 f19311a;

    /* renamed from: b */
    public static final float f19312b;

    /* renamed from: c */
    public static final float f19313c = C16483g.m74435M((float) 12);

    static {
        float f = (float) 8;
        f19311a = PaddingKt.m10018e(0.0f, 0.0f, C16483g.m74435M((float) 6), C16483g.m74435M(f), 3, (Object) null);
        f19312b = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25577a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r54, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r55, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r56, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r57, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r58, float r59, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8180c0 r60, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.window.C16541b r61, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r62, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r63, int r64, int r65) {
        /*
            r7 = r54
            r6 = r55
            r5 = r62
            r4 = r64
            r3 = r65
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "confirmButton"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -36517340(0xfffffffffdd2ca24, float:-3.5023432E37)
            r1 = r63
            androidx.compose.runtime.o r2 = r1.mo15009o(r0)
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r4 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r4 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r2.mo14927P(r7)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r4
            goto L_0x0039
        L_0x0038:
            r1 = r4
        L_0x0039:
            r8 = r3 & 2
            if (r8 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0050
            boolean r8 = r2.mo14927P(r6)
            if (r8 == 0) goto L_0x004d
            r8 = 32
            goto L_0x004f
        L_0x004d:
            r8 = 16
        L_0x004f:
            r1 = r1 | r8
        L_0x0050:
            r8 = r3 & 4
            if (r8 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006a
            r9 = r56
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x0066
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r10
            goto L_0x006c
        L_0x006a:
            r9 = r56
        L_0x006c:
            r10 = r3 & 8
            if (r10 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r11 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0086
            r11 = r57
            boolean r12 = r2.mo14927P(r11)
            if (r12 == 0) goto L_0x0082
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r12
            goto L_0x0088
        L_0x0086:
            r11 = r57
        L_0x0088:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r4
            if (r12 != 0) goto L_0x00a3
            r12 = r3 & 16
            if (r12 != 0) goto L_0x009d
            r12 = r58
            boolean r13 = r2.mo15006n0(r12)
            if (r13 == 0) goto L_0x009f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009d:
            r12 = r58
        L_0x009f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r1 = r1 | r13
            goto L_0x00a5
        L_0x00a3:
            r12 = r58
        L_0x00a5:
            r13 = r3 & 32
            if (r13 == 0) goto L_0x00ad
            r14 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r14
            goto L_0x00c1
        L_0x00ad:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r4
            if (r14 != 0) goto L_0x00c1
            r14 = r59
            boolean r15 = r2.mo14968d(r14)
            if (r15 == 0) goto L_0x00bd
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r15
            goto L_0x00c3
        L_0x00c1:
            r14 = r59
        L_0x00c3:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r4
            if (r15 != 0) goto L_0x00de
            r15 = r3 & 64
            if (r15 != 0) goto L_0x00d7
            r15 = r60
            boolean r16 = r2.mo15006n0(r15)
            if (r16 == 0) goto L_0x00d9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d7:
            r15 = r60
        L_0x00d9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r16
            goto L_0x00e0
        L_0x00de:
            r15 = r60
        L_0x00e0:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00eb
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r15 = r61
            goto L_0x0100
        L_0x00eb:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r4 & r16
            r15 = r61
            if (r16 != 0) goto L_0x0100
            boolean r16 = r2.mo15006n0(r15)
            if (r16 == 0) goto L_0x00fc
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r1 = r1 | r16
        L_0x0100:
            r6 = r3 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0108
            r6 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0106:
            r1 = r1 | r6
            goto L_0x0119
        L_0x0108:
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r4
            if (r6 != 0) goto L_0x0119
            boolean r6 = r2.mo14927P(r5)
            if (r6 == 0) goto L_0x0116
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0116:
            r6 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0106
        L_0x0119:
            r6 = 191739611(0xb6db6db, float:4.5782105E-32)
            r6 = r6 & r1
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r5) goto L_0x0136
            boolean r5 = r2.mo15011p()
            if (r5 != 0) goto L_0x0129
            goto L_0x0136
        L_0x0129:
            r2.mo14958a0()
            r17 = r60
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r14
            r8 = r15
            r11 = r2
            goto L_0x0252
        L_0x0136:
            r2.mo14930Q()
            r5 = r4 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 0
            if (r5 == 0) goto L_0x0166
            boolean r5 = r2.mo14977f0()
            if (r5 == 0) goto L_0x014b
            goto L_0x0166
        L_0x014b:
            r2.mo14958a0()
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0154
            r1 = r1 & r16
        L_0x0154:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x0159
            r1 = r1 & r6
        L_0x0159:
            r17 = r60
            r18 = r61
            r6 = r9
            r51 = r11
            r16 = r12
            r53 = r14
            goto L_0x01f3
        L_0x0166:
            if (r8 == 0) goto L_0x016b
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x016c
        L_0x016b:
            r5 = r9
        L_0x016c:
            if (r10 == 0) goto L_0x0171
            r51 = r15
            goto L_0x0173
        L_0x0171:
            r51 = r11
        L_0x0173:
            r8 = r3 & 16
            if (r8 == 0) goto L_0x0184
            androidx.compose.material3.DatePickerDefaults r8 = androidx.compose.material3.DatePickerDefaults.f19304a
            r9 = 6
            androidx.compose.ui.graphics.g4 r8 = r8.mo11348d(r2, r9)
            r1 = r1 & r16
            r52 = r1
            r1 = r8
            goto L_0x0187
        L_0x0184:
            r52 = r1
            r1 = r12
        L_0x0187:
            if (r13 == 0) goto L_0x0192
            androidx.compose.material3.DatePickerDefaults r8 = androidx.compose.material3.DatePickerDefaults.f19304a
            float r8 = r8.mo11349e()
            r53 = r8
            goto L_0x0194
        L_0x0192:
            r53 = r14
        L_0x0194:
            r8 = r3 & 64
            if (r8 == 0) goto L_0x01d4
            androidx.compose.material3.DatePickerDefaults r8 = androidx.compose.material3.DatePickerDefaults.f19304a
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r48 = 0
            r49 = 805306368(0x30000000, float:4.656613E-10)
            r50 = 524287(0x7ffff, float:7.34683E-40)
            r47 = r2
            androidx.compose.material3.c0 r8 = r8.mo11347c(r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r48, r49, r50)
            r6 = r52 & r6
            r52 = r6
            goto L_0x01d6
        L_0x01d4:
            r8 = r60
        L_0x01d6:
            if (r0 == 0) goto L_0x01ea
            androidx.compose.ui.window.b r0 = new androidx.compose.ui.window.b
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 23
            r16 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r18 = r0
            goto L_0x01ec
        L_0x01ea:
            r18 = r61
        L_0x01ec:
            r16 = r1
            r6 = r5
            r17 = r8
            r1 = r52
        L_0x01f3:
            r2.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0205
            r0 = -1
            java.lang.String r5 = "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)"
            r8 = -36517340(0xfffffffffdd2ca24, float:-3.5023432E37)
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r1, r0, r5)
        L_0x0205:
            r0 = 0
            r5 = 3
            r8 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10096L(r6, r8, r0, r5, r8)
            androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1 r0 = new androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
            r8 = r0
            r9 = r16
            r10 = r17
            r11 = r53
            r12 = r1
            r13 = r62
            r14 = r51
            r15 = r55
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r8 = -476003174(0xffffffffe3a0c49a, float:-5.9312914E21)
            r9 = 1
            androidx.compose.runtime.internal.a r8 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r8, r9, r0)
            r0 = r1 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r1 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r9 = r0 | r1
            r10 = 0
            r0 = r54
            r1 = r5
            r11 = r2
            r2 = r18
            r3 = r8
            r4 = r11
            r5 = r9
            r9 = r6
            r6 = r10
            androidx.compose.material3.AndroidAlertDialog_androidKt.m25374a(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0249
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0249:
            r3 = r9
            r5 = r16
            r8 = r18
            r4 = r51
            r6 = r53
        L_0x0252:
            androidx.compose.runtime.t1 r12 = r11.mo15020s()
            if (r12 != 0) goto L_0x0259
            goto L_0x026e
        L_0x0259:
            androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$2 r13 = new androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$2
            r0 = r13
            r1 = r54
            r2 = r55
            r7 = r17
            r9 = r62
            r10 = r64
            r11 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDialog_androidKt.m25577a(kotlin.jvm.functions.a, kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, float, androidx.compose.material3.c0, androidx.compose.ui.window.b, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }
}
