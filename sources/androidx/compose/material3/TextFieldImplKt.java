package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15598s;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n50#2:430\n49#2:431\n1114#3,6:432\n658#4:438\n646#4:439\n658#4:440\n646#4:441\n154#5:442\n154#5:443\n154#5:444\n154#5:445\n154#5:446\n154#5:447\n154#5:448\n154#5:449\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n*L\n82#1:430\n82#1:431\n82#1:432,6\n107#1:438\n107#1:439\n110#1:440\n110#1:441\n421#1:442\n422#1:443\n423#1:444\n424#1:445\n425#1:446\n426#1:447\n427#1:448\n429#1:449\n*E\n"})
public final class TextFieldImplKt {
    @C12579k

    /* renamed from: a */
    public static final String f19847a = "TextField";
    @C12579k

    /* renamed from: b */
    public static final String f19848b = "Hint";
    @C12579k

    /* renamed from: c */
    public static final String f19849c = "Label";
    @C12579k

    /* renamed from: d */
    public static final String f19850d = "Leading";
    @C12579k

    /* renamed from: e */
    public static final String f19851e = "Trailing";
    @C12579k

    /* renamed from: f */
    public static final String f19852f = "Prefix";
    @C12579k

    /* renamed from: g */
    public static final String f19853g = "Suffix";
    @C12579k

    /* renamed from: h */
    public static final String f19854h = "Supporting";
    @C12579k

    /* renamed from: i */
    public static final String f19855i = "Container";

    /* renamed from: j */
    public static final long f19856j = C16478c.m74376a(0, 0, 0, 0);

    /* renamed from: k */
    public static final int f19857k = 150;

    /* renamed from: l */
    public static final int f19858l = 83;

    /* renamed from: m */
    public static final int f19859m = 67;

    /* renamed from: n */
    public static final float f19860n;

    /* renamed from: o */
    public static final float f19861o = C16483g.m74435M((float) 12);

    /* renamed from: p */
    public static final float f19862p = C16483g.m74435M((float) 4);

    /* renamed from: q */
    public static final float f19863q = C16483g.m74435M((float) 2);

    /* renamed from: r */
    public static final float f19864r = C16483g.m74435M((float) 24);

    /* renamed from: s */
    public static final float f19865s;

    /* renamed from: t */
    public static final float f19866t;
    @C12579k

    /* renamed from: u */
    public static final C8767m f19867u;

    static {
        float f = (float) 16;
        f19860n = C16483g.m74435M(f);
        f19865s = C16483g.m74435M(f);
        f19866t = C16483g.m74435M(f);
        float f2 = (float) 48;
        f19867u = SizeKt.m10107g(C8767m.f23478j, C16483g.m74435M(f2), C16483g.m74435M(f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26633a(@org.jetbrains.annotations.C12579k androidx.compose.material3.TextFieldType r44, @org.jetbrains.annotations.C12579k java.lang.String r45, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r46, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r47, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r49, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r51, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r52, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r54, boolean r55, boolean r56, boolean r57, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r58, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r59, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8189d3 r60, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r61, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r62, int r63, int r64, int r65) {
        /*
            r15 = r44
            r14 = r45
            r13 = r46
            r12 = r47
            r11 = r48
            r10 = r58
            r9 = r59
            r8 = r60
            r7 = r61
            r6 = r63
            r5 = r64
            r4 = r65
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -947035500(0xffffffffc78d6294, float:-72389.16)
            r1 = r62
            androidx.compose.runtime.o r3 = r1.mo15009o(r0)
            r1 = r4 & 1
            r16 = 2
            if (r1 == 0) goto L_0x0052
            r1 = r6 | 6
            goto L_0x0063
        L_0x0052:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0062
            boolean r1 = r3.mo15006n0(r15)
            if (r1 == 0) goto L_0x005e
            r1 = 4
            goto L_0x0060
        L_0x005e:
            r1 = r16
        L_0x0060:
            r1 = r1 | r6
            goto L_0x0063
        L_0x0062:
            r1 = r6
        L_0x0063:
            r17 = r4 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x006e
            r1 = r1 | 48
            goto L_0x007f
        L_0x006e:
            r17 = r6 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x007f
            boolean r17 = r3.mo15006n0(r14)
            if (r17 == 0) goto L_0x007b
            r17 = r18
            goto L_0x007d
        L_0x007b:
            r17 = r19
        L_0x007d:
            r1 = r1 | r17
        L_0x007f:
            r17 = r4 & 4
            r20 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r17 == 0) goto L_0x008a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x009a
        L_0x008a:
            r2 = r6 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x009a
            boolean r2 = r3.mo14927P(r13)
            if (r2 == 0) goto L_0x0097
            r2 = r20
            goto L_0x0099
        L_0x0097:
            r2 = r21
        L_0x0099:
            r1 = r1 | r2
        L_0x009a:
            r2 = r4 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r22 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x00a5
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00b5
        L_0x00a5:
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00b5
            boolean r2 = r3.mo15006n0(r12)
            if (r2 == 0) goto L_0x00b2
            r2 = r17
            goto L_0x00b4
        L_0x00b2:
            r2 = r22
        L_0x00b4:
            r1 = r1 | r2
        L_0x00b5:
            r2 = r4 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x00c0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00d2
        L_0x00c0:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r6
            if (r2 != 0) goto L_0x00d2
            boolean r2 = r3.mo14927P(r11)
            if (r2 == 0) goto L_0x00cf
            r2 = r23
            goto L_0x00d1
        L_0x00cf:
            r2 = r24
        L_0x00d1:
            r1 = r1 | r2
        L_0x00d2:
            r2 = r4 & 32
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x00e1
            r27 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r27
            r0 = r49
            goto L_0x00f6
        L_0x00e1:
            r27 = 458752(0x70000, float:6.42848E-40)
            r27 = r6 & r27
            r0 = r49
            if (r27 != 0) goto L_0x00f6
            boolean r28 = r3.mo14927P(r0)
            if (r28 == 0) goto L_0x00f2
            r28 = r25
            goto L_0x00f4
        L_0x00f2:
            r28 = r26
        L_0x00f4:
            r1 = r1 | r28
        L_0x00f6:
            r28 = r4 & 64
            if (r28 == 0) goto L_0x0101
            r29 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r29
            r0 = r50
            goto L_0x0116
        L_0x0101:
            r29 = 3670016(0x380000, float:5.142788E-39)
            r29 = r6 & r29
            r0 = r50
            if (r29 != 0) goto L_0x0116
            boolean r29 = r3.mo14927P(r0)
            if (r29 == 0) goto L_0x0112
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0114
        L_0x0112:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x0114:
            r1 = r1 | r29
        L_0x0116:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0121
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r29
            r13 = r51
            goto L_0x0136
        L_0x0121:
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r29 = r6 & r29
            r13 = r51
            if (r29 != 0) goto L_0x0136
            boolean r29 = r3.mo14927P(r13)
            if (r29 == 0) goto L_0x0132
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0134
        L_0x0132:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x0134:
            r1 = r1 | r29
        L_0x0136:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0141
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r29
            r15 = r52
            goto L_0x0156
        L_0x0141:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r6 & r29
            r15 = r52
            if (r29 != 0) goto L_0x0156
            boolean r29 = r3.mo14927P(r15)
            if (r29 == 0) goto L_0x0152
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0154
        L_0x0152:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0154:
            r1 = r1 | r29
        L_0x0156:
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0161
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r29
            r6 = r53
            goto L_0x0176
        L_0x0161:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r6 & r29
            r6 = r53
            if (r29 != 0) goto L_0x0176
            boolean r29 = r3.mo14927P(r6)
            if (r29 == 0) goto L_0x0172
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0174
        L_0x0172:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0174:
            r1 = r1 | r29
        L_0x0176:
            r6 = r4 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x017f
            r16 = r5 | 6
            r11 = r54
            goto L_0x0192
        L_0x017f:
            r29 = r5 & 14
            r11 = r54
            if (r29 != 0) goto L_0x0190
            boolean r29 = r3.mo14927P(r11)
            if (r29 == 0) goto L_0x018d
            r16 = 4
        L_0x018d:
            r16 = r5 | r16
            goto L_0x0192
        L_0x0190:
            r16 = r5
        L_0x0192:
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0199
            r16 = r16 | 48
            goto L_0x01aa
        L_0x0199:
            r29 = r5 & 112(0x70, float:1.57E-43)
            r12 = r55
            if (r29 != 0) goto L_0x01aa
            boolean r29 = r3.mo14961b(r12)
            if (r29 == 0) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            r18 = r19
        L_0x01a8:
            r16 = r16 | r18
        L_0x01aa:
            r12 = r16
            r14 = r4 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x01b5
            r12 = r12 | 384(0x180, float:5.38E-43)
            r16 = r14
            goto L_0x01c9
        L_0x01b5:
            r16 = r14
            r14 = r5 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01c9
            r14 = r56
            boolean r18 = r3.mo14961b(r14)
            if (r18 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r20 = r21
        L_0x01c6:
            r12 = r12 | r20
            goto L_0x01cb
        L_0x01c9:
            r14 = r56
        L_0x01cb:
            r14 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01d4
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            r18 = r14
            goto L_0x01e8
        L_0x01d4:
            r18 = r14
            r14 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x01e8
            r14 = r57
            boolean r19 = r3.mo14961b(r14)
            if (r19 == 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r17 = r22
        L_0x01e5:
            r12 = r12 | r17
            goto L_0x01ea
        L_0x01e8:
            r14 = r57
        L_0x01ea:
            r14 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01f1
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0202
        L_0x01f1:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x0202
            boolean r14 = r3.mo15006n0(r10)
            if (r14 == 0) goto L_0x01fe
            goto L_0x0200
        L_0x01fe:
            r23 = r24
        L_0x0200:
            r12 = r12 | r23
        L_0x0202:
            r14 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 & r4
            if (r14 == 0) goto L_0x020c
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x020a:
            r12 = r12 | r14
            goto L_0x021d
        L_0x020c:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x021d
            boolean r14 = r3.mo15006n0(r9)
            if (r14 == 0) goto L_0x021a
            r14 = r25
            goto L_0x020a
        L_0x021a:
            r14 = r26
            goto L_0x020a
        L_0x021d:
            r14 = r4 & r26
            if (r14 == 0) goto L_0x0225
            r14 = 1572864(0x180000, float:2.204052E-39)
        L_0x0223:
            r12 = r12 | r14
            goto L_0x0236
        L_0x0225:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x0236
            boolean r14 = r3.mo15006n0(r8)
            if (r14 == 0) goto L_0x0233
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0223
        L_0x0233:
            r14 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0223
        L_0x0236:
            r14 = r4 & r25
            if (r14 == 0) goto L_0x023e
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x023c:
            r12 = r12 | r14
            goto L_0x024f
        L_0x023e:
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x024f
            boolean r14 = r3.mo14927P(r7)
            if (r14 == 0) goto L_0x024c
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023c
        L_0x024c:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x023c
        L_0x024f:
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r1
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r4) goto L_0x0280
            r4 = 23967451(0x16db6db, float:4.3661218E-38)
            r4 = r4 & r12
            r14 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r14) goto L_0x0280
            boolean r4 = r3.mo15011p()
            if (r4 != 0) goto L_0x0268
            goto L_0x0280
        L_0x0268:
            r3.mo14958a0()
            r6 = r49
            r7 = r50
            r8 = r51
            r9 = r52
            r10 = r53
            r11 = r54
            r30 = r55
            r13 = r56
            r14 = r57
            r12 = r3
            goto L_0x0484
        L_0x0280:
            r4 = 0
            if (r2 == 0) goto L_0x0286
            r23 = r4
            goto L_0x0288
        L_0x0286:
            r23 = r49
        L_0x0288:
            if (r28 == 0) goto L_0x028d
            r24 = r4
            goto L_0x028f
        L_0x028d:
            r24 = r50
        L_0x028f:
            if (r0 == 0) goto L_0x0294
            r25 = r4
            goto L_0x0296
        L_0x0294:
            r25 = r51
        L_0x0296:
            if (r13 == 0) goto L_0x029b
            r26 = r4
            goto L_0x029d
        L_0x029b:
            r26 = r52
        L_0x029d:
            if (r15 == 0) goto L_0x02a2
            r28 = r4
            goto L_0x02a4
        L_0x02a2:
            r28 = r53
        L_0x02a4:
            if (r6 == 0) goto L_0x02a9
            r29 = r4
            goto L_0x02ab
        L_0x02a9:
            r29 = r54
        L_0x02ab:
            if (r11 == 0) goto L_0x02b0
            r30 = 0
            goto L_0x02b2
        L_0x02b0:
            r30 = r55
        L_0x02b2:
            if (r16 == 0) goto L_0x02b7
            r31 = 1
            goto L_0x02b9
        L_0x02b7:
            r31 = r56
        L_0x02b9:
            if (r18 == 0) goto L_0x02be
            r32 = 0
            goto L_0x02c0
        L_0x02be:
            r32 = r57
        L_0x02c0:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x02ce
            java.lang.String r2 = "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:61)"
            r4 = -947035500(0xffffffffc78d6294, float:-72389.16)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r12, r2)
        L_0x02ce:
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r2)
            r14 = r45
            boolean r2 = r3.mo15006n0(r14)
            r13 = r47
            boolean r4 = r3.mo15006n0(r13)
            r2 = r2 | r4
            java.lang.Object r4 = r3.mo14921N()
            if (r2 != 0) goto L_0x02ef
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r4 != r2) goto L_0x030c
        L_0x02ef:
            androidx.compose.ui.text.d r2 = new androidx.compose.ui.text.d
            r4 = 0
            r6 = 0
            r11 = 6
            r16 = 0
            r49 = r2
            r50 = r45
            r51 = r4
            r52 = r6
            r53 = r11
            r54 = r16
            r49.<init>(r50, r51, r52, r53, r54)
            androidx.compose.ui.text.input.z0 r4 = r13.mo12556a(r2)
            r3.mo14893C(r4)
        L_0x030c:
            r3.mo15002m0()
            androidx.compose.ui.text.input.z0 r4 = (androidx.compose.p004ui.text.input.C16334z0) r4
            androidx.compose.ui.text.d r2 = r4.mo47343b()
            java.lang.String r4 = r2.mo46683j()
            int r2 = r12 >> 12
            r2 = r2 & 14
            androidx.compose.runtime.k2 r2 = androidx.compose.foundation.interaction.FocusInteractionKt.m9673a(r10, r3, r2)
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0331
            androidx.compose.material3.InputPhase r2 = androidx.compose.material3.InputPhase.Focused
        L_0x032f:
            r11 = r2
            goto L_0x0342
        L_0x0331:
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0339
            r2 = 1
            goto L_0x033a
        L_0x0339:
            r2 = 0
        L_0x033a:
            if (r2 == 0) goto L_0x033f
            androidx.compose.material3.InputPhase r2 = androidx.compose.material3.InputPhase.UnfocusedEmpty
            goto L_0x032f
        L_0x033f:
            androidx.compose.material3.InputPhase r2 = androidx.compose.material3.InputPhase.UnfocusedNotEmpty
            goto L_0x032f
        L_0x0342:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1 r6 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
            r49 = r6
            r50 = r60
            r51 = r31
            r52 = r32
            r53 = r58
            r54 = r12
            r49.<init>(r50, r51, r52, r53, r54)
            androidx.compose.material3.i1 r2 = androidx.compose.material3.C8215i1.f20180a
            r15 = 6
            androidx.compose.material3.s3 r16 = r2.mo12654c(r3, r15)
            androidx.compose.ui.text.p0 r20 = r16.mo12983c()
            androidx.compose.ui.text.p0 r21 = r16.mo12985e()
            r62 = r1
            long r0 = r20.mo47510r()
            androidx.compose.ui.graphics.j2$a r16 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r7 = r16.mo42851u()
            boolean r0 = androidx.compose.p004ui.graphics.C15240j2.m66082y(r0, r7)
            if (r0 == 0) goto L_0x0382
            long r0 = r21.mo47510r()
            long r7 = r16.mo42851u()
            boolean r0 = androidx.compose.p004ui.graphics.C15240j2.m66082y(r0, r7)
            if (r0 == 0) goto L_0x039e
        L_0x0382:
            long r0 = r20.mo47510r()
            long r7 = r16.mo42851u()
            boolean r0 = androidx.compose.p004ui.graphics.C15240j2.m66082y(r0, r7)
            if (r0 != 0) goto L_0x03a1
            long r0 = r21.mo47510r()
            long r7 = r16.mo42851u()
            boolean r0 = androidx.compose.p004ui.graphics.C15240j2.m66082y(r0, r7)
            if (r0 == 0) goto L_0x03a1
        L_0x039e:
            r19 = 1
            goto L_0x03a3
        L_0x03a1:
            r19 = 0
        L_0x03a3:
            androidx.compose.material3.TextFieldTransitionScope r27 = androidx.compose.material3.TextFieldTransitionScope.f19876a
            r0 = -646388253(0xffffffffd978e5e3, float:-4.37865983E15)
            r3.mo14918M(r0)
            androidx.compose.material3.s3 r0 = r2.mo12654c(r3, r15)
            androidx.compose.ui.text.p0 r0 = r0.mo12985e()
            long r0 = r0.mo47510r()
            if (r19 == 0) goto L_0x03d6
            long r7 = r16.mo42851u()
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x03c3
            r7 = 1
            goto L_0x03c4
        L_0x03c3:
            r7 = 0
        L_0x03c4:
            if (r7 == 0) goto L_0x03c7
            goto L_0x03d6
        L_0x03c7:
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r6.invoke(r11, r3, r1)
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r0 = r0.mo42833M()
        L_0x03d6:
            r33 = r0
            r3.mo15002m0()
            r0 = -646388060(0xffffffffd978e6a4, float:-4.37871164E15)
            r3.mo14918M(r0)
            androidx.compose.material3.s3 r0 = r2.mo12654c(r3, r15)
            androidx.compose.ui.text.p0 r0 = r0.mo12983c()
            long r0 = r0.mo47510r()
            if (r19 == 0) goto L_0x040d
            long r7 = r16.mo42851u()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x03f9
            r2 = 1
            goto L_0x03fa
        L_0x03f9:
            r2 = 0
        L_0x03fa:
            if (r2 == 0) goto L_0x03fd
            goto L_0x040d
        L_0x03fd:
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r6.invoke(r11, r3, r0)
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r0 = r0.mo42833M()
            goto L_0x040e
        L_0x040d:
            r2 = 0
        L_0x040e:
            r35 = r0
            r3.mo15002m0()
            if (r48 == 0) goto L_0x0418
            r37 = 1
            goto L_0x041a
        L_0x0418:
            r37 = r2
        L_0x041a:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3 r15 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3
            r0 = r15
            r18 = r62
            r1 = r48
            r2 = r23
            r8 = r3
            r3 = r4
            r4 = r60
            r5 = r31
            r38 = r6
            r6 = r32
            r7 = r58
            r39 = r8
            r8 = r12
            r9 = r26
            r10 = r28
            r40 = r11
            r11 = r24
            r12 = r25
            r13 = r29
            r14 = r44
            r41 = r15
            r15 = r46
            r16 = r30
            r17 = r59
            r22 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = 1290853831(0x4cf0ddc7, float:1.2628332E8)
            r12 = r39
            r1 = r41
            r2 = 1
            androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r0, r2, r1)
            r11 = 1769472(0x1b0000, float:2.479558E-39)
            r1 = r27
            r2 = r40
            r3 = r33
            r5 = r35
            r7 = r38
            r8 = r37
            r10 = r12
            r1.mo12249a(r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0474
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0474:
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            r11 = r29
            r13 = r31
            r14 = r32
        L_0x0484:
            androidx.compose.runtime.t1 r15 = r12.mo15020s()
            if (r15 != 0) goto L_0x048b
            goto L_0x04b6
        L_0x048b:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$4 r12 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$4
            r0 = r12
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            r42 = r12
            r12 = r30
            r43 = r15
            r15 = r58
            r16 = r59
            r17 = r60
            r18 = r61
            r19 = r63
            r20 = r64
            r21 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r42
            r0 = r43
            r0.mo15202a(r1)
        L_0x04b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.m26633a(androidx.compose.material3.TextFieldType, java.lang.String, kotlin.jvm.functions.p, androidx.compose.ui.text.input.a1, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.foundation.layout.i0, androidx.compose.material3.d3, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    /* renamed from: b */
    public static final void m26634b(long j, @C12580l C16361p0 p0Var, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-1520066345);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14980g(j)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(p0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                p0Var = null;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1520066345, i3, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:274)");
            }
            C8552a b = C8553b.m31048b(o, 1449369305, true, new TextFieldImplKt$Decoration$contentWithColor$1(j, pVar, i3));
            if (p0Var != null) {
                o.mo14918M(1830468032);
                TextKt.m26698a(p0Var, b, o, ((i3 >> 3) & 14) | 48);
            } else {
                o.mo14918M(1830468084);
                b.invoke(o, 6);
            }
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C16361p0 p0Var2 = p0Var;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TextFieldImplKt$Decoration$1(j, p0Var2, pVar, i, i2));
        }
    }

    /* renamed from: c */
    public static final float m26635c() {
        return f19861o;
    }

    @C12579k
    /* renamed from: d */
    public static final C8767m m26636d() {
        return f19867u;
    }

    @C12580l
    /* renamed from: e */
    public static final Object m26637e(@C12579k C15580l lVar) {
        C15598s sVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Object c = lVar.mo44319c();
        if (c instanceof C15598s) {
            sVar = (C15598s) c;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            return sVar.mo44449u();
        }
        return null;
    }

    /* renamed from: f */
    public static final float m26638f() {
        return f19865s;
    }

    /* renamed from: g */
    public static final float m26639g() {
        return f19866t;
    }

    /* renamed from: h */
    public static final float m26640h() {
        return f19864r;
    }

    /* renamed from: i */
    public static final float m26641i() {
        return f19863q;
    }

    /* renamed from: j */
    public static final float m26642j() {
        return f19862p;
    }

    /* renamed from: k */
    public static final float m26643k() {
        return f19860n;
    }

    /* renamed from: l */
    public static final long m26644l() {
        return f19856j;
    }

    /* renamed from: m */
    public static final int m26645m(@C12580l C15611w0 w0Var) {
        if (w0Var != null) {
            return w0Var.mo44468G0();
        }
        return 0;
    }

    /* renamed from: n */
    public static final int m26646n(@C12580l C15611w0 w0Var) {
        if (w0Var != null) {
            return w0Var.mo44471K0();
        }
        return 0;
    }
}
