package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.C2844t;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.C8329o0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2124:1\n76#2:2125\n154#3:2126\n154#3:2127\n154#3:2128\n154#3:2129\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1491#1:2125\n1354#1:2126\n1360#1:2127\n1365#1:2128\n1370#1:2129\n*E\n"})
public final class OutlinedTextFieldDefaults {
    @C12579k

    /* renamed from: a */
    public static final OutlinedTextFieldDefaults f19530a = new OutlinedTextFieldDefaults();

    /* renamed from: b */
    public static final float f19531b = C16483g.m74435M((float) 56);

    /* renamed from: c */
    public static final float f19532c = C16483g.m74435M((float) 280);

    /* renamed from: d */
    public static final float f19533d = C16483g.m74435M((float) 1);

    /* renamed from: e */
    public static final float f19534e = C16483g.m74435M((float) 2);

    /* renamed from: f */
    public static final int f19535f = 0;

    /* renamed from: e */
    public static /* synthetic */ C2366i0 m25983e(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m26643k();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m26643k();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.m26643k();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.m26643k();
        }
        return outlinedTextFieldDefaults.mo11747d(f, f2, f3, f4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11744a(boolean r21, boolean r22, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r23, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8189d3 r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r25, float r26, float r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r20 = this;
            r8 = r23
            r9 = r24
            r10 = r29
            r11 = r30
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1461761386(0x5720b56a, float:1.76701028E14)
            r1 = r28
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r10 | 6
            r13 = r21
            goto L_0x0036
        L_0x0024:
            r1 = r10 & 14
            r13 = r21
            if (r1 != 0) goto L_0x0035
            boolean r1 = r12.mo14961b(r13)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r10
            goto L_0x0036
        L_0x0035:
            r1 = r10
        L_0x0036:
            r2 = r11 & 2
            if (r2 == 0) goto L_0x003f
            r1 = r1 | 48
            r14 = r22
            goto L_0x0051
        L_0x003f:
            r2 = r10 & 112(0x70, float:1.57E-43)
            r14 = r22
            if (r2 != 0) goto L_0x0051
            boolean r2 = r12.mo14961b(r14)
            if (r2 == 0) goto L_0x004e
            r2 = 32
            goto L_0x0050
        L_0x004e:
            r2 = 16
        L_0x0050:
            r1 = r1 | r2
        L_0x0051:
            r2 = r11 & 4
            if (r2 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0068
            boolean r2 = r12.mo15006n0(r8)
            if (r2 == 0) goto L_0x0065
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r2
        L_0x0068:
            r2 = r11 & 8
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007f
            boolean r2 = r12.mo15006n0(r9)
            if (r2 == 0) goto L_0x007c
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r2
        L_0x007f:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r10 & r2
            if (r3 != 0) goto L_0x009b
            r3 = r11 & 16
            if (r3 != 0) goto L_0x0095
            r3 = r25
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x0097
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r3 = r25
        L_0x0097:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r4
            goto L_0x009d
        L_0x009b:
            r3 = r25
        L_0x009d:
            r4 = 458752(0x70000, float:6.42848E-40)
            r5 = r10 & r4
            if (r5 != 0) goto L_0x00b8
            r5 = r11 & 32
            if (r5 != 0) goto L_0x00b2
            r5 = r26
            boolean r6 = r12.mo14968d(r5)
            if (r6 == 0) goto L_0x00b4
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b2:
            r5 = r26
        L_0x00b4:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r6
            goto L_0x00ba
        L_0x00b8:
            r5 = r26
        L_0x00ba:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x00d4
            r6 = r11 & 64
            if (r6 != 0) goto L_0x00ce
            r6 = r27
            boolean r7 = r12.mo14968d(r6)
            if (r7 == 0) goto L_0x00d0
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00ce:
            r6 = r27
        L_0x00d0:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r1 = r1 | r7
            goto L_0x00d6
        L_0x00d4:
            r6 = r27
        L_0x00d6:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00e0
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r7
            r15 = r20
            goto L_0x00f3
        L_0x00e0:
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r10
            r15 = r20
            if (r7 != 0) goto L_0x00f3
            boolean r7 = r12.mo15006n0(r15)
            if (r7 == 0) goto L_0x00f0
            r7 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r7 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r1 = r1 | r7
        L_0x00f3:
            r7 = 23967451(0x16db6db, float:4.3661218E-38)
            r7 = r7 & r1
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r4) goto L_0x010b
            boolean r4 = r12.mo15011p()
            if (r4 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r12.mo14958a0()
            r7 = r5
            r8 = r6
            r6 = r3
            goto L_0x01d8
        L_0x010b:
            r12.mo14930Q()
            r4 = r10 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x0137
            boolean r4 = r12.mo14977f0()
            if (r4 == 0) goto L_0x0122
            goto L_0x0137
        L_0x0122:
            r12.mo14958a0()
            r4 = r11 & 16
            if (r4 == 0) goto L_0x012b
            r1 = r1 & r17
        L_0x012b:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0131
            r1 = r1 & r16
        L_0x0131:
            r4 = r11 & 64
            if (r4 == 0) goto L_0x015e
            r1 = r1 & r7
            goto L_0x015e
        L_0x0137:
            r4 = r11 & 16
            if (r4 == 0) goto L_0x0148
            androidx.compose.material3.tokens.o0 r3 = androidx.compose.material3.tokens.C8329o0.f21814a
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.mo14179c()
            r4 = 6
            androidx.compose.ui.graphics.g4 r3 = androidx.compose.material3.ShapesKt.m26127f(r3, r12, r4)
            r1 = r1 & r17
        L_0x0148:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0151
            float r4 = f19534e
            r1 = r1 & r16
            r5 = r4
        L_0x0151:
            r4 = r11 & 64
            if (r4 == 0) goto L_0x015e
            float r4 = f19533d
            r1 = r1 & r7
            r7 = r3
            r17 = r4
            r16 = r5
            goto L_0x0163
        L_0x015e:
            r7 = r3
            r16 = r5
            r17 = r6
        L_0x0163:
            r12.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0172
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1389)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r4)
        L_0x0172:
            r0 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r18 = r0 | r3
            int r0 = r1 >> 3
            r1 = r0 & r2
            r1 = r18 | r1
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r19 = r1 | r0
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r16
            r5 = r17
            r6 = r12
            r8 = r7
            r7 = r19
            androidx.compose.runtime.k2 r0 = androidx.compose.material3.C8195e3.m27068b(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.C2223i) r0
            androidx.compose.ui.m r6 = androidx.compose.foundation.BorderKt.m8850f(r1, r0, r8)
            r0 = r24
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r12
            r5 = r18
            androidx.compose.runtime.k2 r0 = r0.mo12538b(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r0 = r0.mo42833M()
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8824c(r6, r0, r8)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.m9839a(r0, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01d3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d3:
            r6 = r8
            r7 = r16
            r8 = r17
        L_0x01d8:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x01df
            goto L_0x01f7
        L_0x01df:
            androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1 r5 = new androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1
            r0 = r5
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r13 = r5
            r5 = r24
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mo15202a(r13)
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.mo11744a(boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material3.d3, androidx.compose.ui.graphics.g4, float, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11745b(@org.jetbrains.annotations.C12579k java.lang.String r118, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r119, boolean r120, boolean r121, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r122, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r123, boolean r124, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r125, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r126, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r127, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r128, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r129, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r130, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r131, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8189d3 r132, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r133, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r134, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r135, int r136, int r137, int r138) {
        /*
            r117 = this;
            r15 = r118
            r14 = r119
            r13 = r122
            r12 = r123
            r11 = r136
            r10 = r137
            r9 = r138
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            r1 = r135
            androidx.compose.runtime.o r8 = r1.mo15009o(r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x0032
            r0 = r11 | 6
            goto L_0x0042
        L_0x0032:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x0041
            boolean r0 = r8.mo15006n0(r15)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = 2
        L_0x003f:
            r0 = r0 | r11
            goto L_0x0042
        L_0x0041:
            r0 = r11
        L_0x0042:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0049
            r0 = r0 | 48
            goto L_0x0059
        L_0x0049:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0059
            boolean r3 = r8.mo14927P(r14)
            if (r3 == 0) goto L_0x0056
            r3 = 32
            goto L_0x0058
        L_0x0056:
            r3 = 16
        L_0x0058:
            r0 = r0 | r3
        L_0x0059:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0060
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0060:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0074
            r3 = r120
            boolean r16 = r8.mo14961b(r3)
            if (r16 == 0) goto L_0x006f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r0 = r0 | r16
            goto L_0x0076
        L_0x0074:
            r3 = r120
        L_0x0076:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0081
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0081:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0095
            r1 = r121
            boolean r16 = r8.mo14961b(r1)
            if (r16 == 0) goto L_0x0090
            r16 = r17
            goto L_0x0092
        L_0x0090:
            r16 = r18
        L_0x0092:
            r0 = r0 | r16
            goto L_0x0097
        L_0x0095:
            r1 = r121
        L_0x0097:
            r16 = r9 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r110 = 57344(0xe000, float:8.0356E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00a5
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b6
        L_0x00a5:
            r16 = r11 & r110
            if (r16 != 0) goto L_0x00b6
            boolean r16 = r8.mo15006n0(r13)
            if (r16 == 0) goto L_0x00b2
            r16 = r20
            goto L_0x00b4
        L_0x00b2:
            r16 = r19
        L_0x00b4:
            r0 = r0 | r16
        L_0x00b6:
            r16 = r9 & 32
            r21 = 65536(0x10000, float:9.18355E-41)
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00c3
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c0:
            r0 = r0 | r16
            goto L_0x00d3
        L_0x00c3:
            r16 = r11 & r111
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r8.mo15006n0(r12)
            if (r16 == 0) goto L_0x00d0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00d0:
            r16 = r21
            goto L_0x00c0
        L_0x00d3:
            r16 = r9 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r22
            r2 = r124
            goto L_0x00f3
        L_0x00e0:
            r22 = r11 & r112
            r2 = r124
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r8.mo14961b(r2)
            if (r23 == 0) goto L_0x00ef
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r0 = r0 | r23
        L_0x00f3:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r113 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x0100
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r24
            r5 = r125
            goto L_0x0113
        L_0x0100:
            r24 = r11 & r113
            r5 = r125
            if (r24 != 0) goto L_0x0113
            boolean r25 = r8.mo14927P(r5)
            if (r25 == 0) goto L_0x010f
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r0 = r0 | r25
        L_0x0113:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x011e
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r7 = r126
            goto L_0x0133
        L_0x011e:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r11 & r26
            r7 = r126
            if (r26 != 0) goto L_0x0133
            boolean r27 = r8.mo14927P(r7)
            if (r27 == 0) goto L_0x012f
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r0 = r0 | r27
        L_0x0133:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x013e
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r27
            r2 = r127
            goto L_0x0153
        L_0x013e:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r11 & r27
            r2 = r127
            if (r27 != 0) goto L_0x0153
            boolean r27 = r8.mo14927P(r2)
            if (r27 == 0) goto L_0x014f
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r0 = r0 | r27
        L_0x0153:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015c
            r22 = r10 | 6
            r3 = r128
            goto L_0x0172
        L_0x015c:
            r27 = r10 & 14
            r3 = r128
            if (r27 != 0) goto L_0x0170
            boolean r27 = r8.mo14927P(r3)
            if (r27 == 0) goto L_0x016b
            r22 = 4
            goto L_0x016d
        L_0x016b:
            r22 = 2
        L_0x016d:
            r22 = r10 | r22
            goto L_0x0172
        L_0x0170:
            r22 = r10
        L_0x0172:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0179
            r22 = r22 | 48
            goto L_0x018c
        L_0x0179:
            r27 = r10 & 112(0x70, float:1.57E-43)
            r5 = r129
            if (r27 != 0) goto L_0x018c
            boolean r27 = r8.mo14927P(r5)
            if (r27 == 0) goto L_0x0188
            r23 = 32
            goto L_0x018a
        L_0x0188:
            r23 = 16
        L_0x018a:
            r22 = r22 | r23
        L_0x018c:
            r5 = r22
            r7 = r9 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0195
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a9
        L_0x0195:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01a9
            r12 = r130
            boolean r22 = r8.mo14927P(r12)
            if (r22 == 0) goto L_0x01a4
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a6
        L_0x01a4:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a6:
            r5 = r5 | r26
            goto L_0x01ab
        L_0x01a9:
            r12 = r130
        L_0x01ab:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b2
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c4
        L_0x01b2:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c4
            r13 = r131
            boolean r22 = r8.mo14927P(r13)
            if (r22 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r17 = r18
        L_0x01c1:
            r5 = r5 | r17
            goto L_0x01c6
        L_0x01c4:
            r13 = r131
        L_0x01c6:
            r17 = r10 & r110
            if (r17 != 0) goto L_0x01de
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01d9
            r13 = r132
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x01db
            r19 = r20
            goto L_0x01db
        L_0x01d9:
            r13 = r132
        L_0x01db:
            r5 = r5 | r19
            goto L_0x01e0
        L_0x01de:
            r13 = r132
        L_0x01e0:
            r17 = r10 & r111
            if (r17 != 0) goto L_0x01fb
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            r13 = r133
            if (r17 != 0) goto L_0x01f6
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x01f6
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f8
        L_0x01f6:
            r17 = r21
        L_0x01f8:
            r5 = r5 | r17
            goto L_0x01fd
        L_0x01fb:
            r13 = r133
        L_0x01fd:
            r114 = r9 & r21
            if (r114 == 0) goto L_0x0208
            r17 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r17
            r13 = r134
            goto L_0x021b
        L_0x0208:
            r17 = r10 & r112
            r13 = r134
            if (r17 != 0) goto L_0x021b
            boolean r17 = r8.mo14927P(r13)
            if (r17 == 0) goto L_0x0217
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0219
        L_0x0217:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0219:
            r5 = r5 | r17
        L_0x021b:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x0228
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r15 = r117
            goto L_0x023b
        L_0x0228:
            r17 = r10 & r113
            r15 = r117
            if (r17 != 0) goto L_0x023b
            boolean r17 = r8.mo15006n0(r15)
            if (r17 == 0) goto L_0x0237
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0239
        L_0x0237:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0239:
            r5 = r5 | r17
        L_0x023b:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0272
            r10 = 23967451(0x16db6db, float:4.3661218E-38)
            r10 = r10 & r5
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r13) goto L_0x0272
            boolean r10 = r8.mo15011p()
            if (r10 != 0) goto L_0x0255
            goto L_0x0272
        L_0x0255:
            r8.mo14958a0()
            r9 = r125
            r10 = r126
            r11 = r127
            r12 = r128
            r13 = r129
            r14 = r130
            r15 = r131
            r16 = r132
            r17 = r133
            r18 = r134
            r33 = r8
            r8 = r124
            goto L_0x0473
        L_0x0272:
            r8.mo14930Q()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x02ad
            boolean r10 = r8.mo14977f0()
            if (r10 == 0) goto L_0x0280
            goto L_0x02ad
        L_0x0280:
            r8.mo14958a0()
            r1 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x028b
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x028b:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0295
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r1
        L_0x0295:
            r22 = r124
            r23 = r125
            r24 = r126
            r25 = r127
            r26 = r128
            r27 = r129
            r28 = r130
            r29 = r131
            r30 = r132
            r31 = r133
            r32 = r134
            goto L_0x03cd
        L_0x02ad:
            if (r16 == 0) goto L_0x02b1
            r10 = 0
            goto L_0x02b3
        L_0x02b1:
            r10 = r124
        L_0x02b3:
            r13 = 0
            if (r4 == 0) goto L_0x02b8
            r4 = r13
            goto L_0x02ba
        L_0x02b8:
            r4 = r125
        L_0x02ba:
            if (r6 == 0) goto L_0x02be
            r6 = r13
            goto L_0x02c0
        L_0x02be:
            r6 = r126
        L_0x02c0:
            if (r1 == 0) goto L_0x02c4
            r1 = r13
            goto L_0x02c6
        L_0x02c4:
            r1 = r127
        L_0x02c6:
            if (r2 == 0) goto L_0x02ca
            r2 = r13
            goto L_0x02cc
        L_0x02ca:
            r2 = r128
        L_0x02cc:
            if (r3 == 0) goto L_0x02d0
            r3 = r13
            goto L_0x02d2
        L_0x02d0:
            r3 = r129
        L_0x02d2:
            if (r7 == 0) goto L_0x02d6
            r7 = r13
            goto L_0x02d8
        L_0x02d6:
            r7 = r130
        L_0x02d8:
            if (r12 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r13 = r131
        L_0x02dd:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0358
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            int r12 = r5 >> 12
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r107 = r12
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r117
            r102 = r8
            androidx.compose.material3.d3 r12 = r16.mo11746c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r16
            goto L_0x035a
        L_0x0358:
            r12 = r132
        L_0x035a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r9 & r16
            if (r16 == 0) goto L_0x0385
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r124 = r117
            r125 = r16
            r126 = r17
            r127 = r18
            r128 = r19
            r129 = r20
            r130 = r21
            androidx.compose.foundation.layout.i0 r16 = m25983e(r124, r125, r126, r127, r128, r129, r130)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r17
            goto L_0x0387
        L_0x0385:
            r16 = r133
        L_0x0387:
            r135 = r1
            if (r114 == 0) goto L_0x03b3
            androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1 r1 = new androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
            r124 = r1
            r125 = r120
            r126 = r10
            r127 = r123
            r128 = r12
            r129 = r0
            r130 = r5
            r124.<init>(r125, r126, r127, r128, r129, r130)
            r124 = r2
            r2 = -1448570018(0xffffffffa9a8935e, float:-7.486263E-14)
            r125 = r3
            r3 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r2, r3, r1)
            r26 = r124
            r27 = r125
            r25 = r135
            r32 = r1
            goto L_0x03bf
        L_0x03b3:
            r124 = r2
            r125 = r3
            r26 = r124
            r27 = r125
            r32 = r134
            r25 = r135
        L_0x03bf:
            r23 = r4
            r24 = r6
            r28 = r7
            r22 = r10
            r30 = r12
            r29 = r13
            r31 = r16
        L_0x03cd:
            r8.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x03de
            r1 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            java.lang.String r2 = "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r5, r2)
        L_0x03de:
            androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Outlined
            r2 = r0
            r0 = r1
            int r1 = r2 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r2 >> 3
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r4
            int r4 = r2 >> 9
            r6 = r4 & r110
            r1 = r1 | r6
            r6 = r4 & r111
            r1 = r1 | r6
            r6 = r4 & r112
            r1 = r1 | r6
            int r6 = r5 << 21
            r7 = r6 & r113
            r1 = r1 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r6
            r1 = r1 | r7
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r7
            r19 = r1 | r6
            int r1 = r5 >> 9
            r1 = r1 & 14
            int r6 = r2 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r1 = r1 | r6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r3 & r110
            r1 = r1 | r2
            r2 = r5 & r111
            r1 = r1 | r2
            int r2 = r5 << 6
            r2 = r2 & r112
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & r113
            r20 = r1 | r2
            r21 = 0
            r1 = r118
            r2 = r119
            r3 = r122
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r33 = r8
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r121
            r12 = r120
            r13 = r22
            r14 = r123
            r15 = r31
            r16 = r30
            r17 = r32
            r18 = r33
            androidx.compose.material3.TextFieldImplKt.m26633a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x045d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x045d:
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
        L_0x0473:
            androidx.compose.runtime.t1 r7 = r33.mo15020s()
            if (r7 != 0) goto L_0x047a
            goto L_0x049f
        L_0x047a:
            androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2 r6 = new androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
            r0 = r6
            r1 = r117
            r2 = r118
            r3 = r119
            r4 = r120
            r5 = r121
            r115 = r6
            r6 = r122
            r116 = r7
            r7 = r123
            r19 = r136
            r20 = r137
            r21 = r138
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r115
            r0 = r116
            r0.mo15202a(r1)
        L_0x049f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.mo11745b(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material3.d3, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8189d3 mo11746c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @C12580l C2844t tVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @C12580l C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C8592o oVar2 = oVar;
        int i8 = i6;
        int i9 = i7;
        oVar2.mo14918M(1767617725);
        long k = (i8 & 1) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14152D(), oVar2, 6) : j;
        long k2 = (i8 & 2) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14166R(), oVar2, 6) : j2;
        long w = (i8 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14181d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i8 & 8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14204x(), oVar2, 6) : j4;
        long s = (i8 & 16) != 0 ? C15240j2.f37547b.mo42850s() : j5;
        long s2 = (i8 & 32) != 0 ? C15240j2.f37547b.mo42850s() : j6;
        long s3 = (i8 & 64) != 0 ? C15240j2.f37547b.mo42850s() : j7;
        long s4 = (i8 & 128) != 0 ? C15240j2.f37547b.mo42850s() : j8;
        long k4 = (i8 & 256) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14175a(), oVar2, 6) : j9;
        long k5 = (i8 & 512) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14191k(), oVar2, 6) : j10;
        C2844t tVar2 = (i8 & 1024) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k6 = (i8 & 2048) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14155G(), oVar2, 6) : j11;
        long k7 = (i8 & 4096) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14176a0(), oVar2, 6) : j12;
        long w2 = (i8 & 8192) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14187g(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long k8 = (i8 & 16384) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14149A(), oVar2, 6) : j14;
        long k9 = (32768 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14154F(), oVar2, 6) : j15;
        long k10 = (65536 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14173Y(), oVar2, 6) : j16;
        long w3 = (131072 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14185f(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long k11 = (262144 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14206z(), oVar2, 6) : j18;
        long k12 = (524288 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14158J(), oVar2, 6) : j19;
        long k13 = (1048576 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14184e0(), oVar2, 6) : j20;
        long w4 = (2097152 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14190j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long k14 = (4194304 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14151C(), oVar2, 6) : j22;
        long k15 = (8388608 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14153E(), oVar2, 6) : j23;
        long k16 = (16777216 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14171W(), oVar2, 6) : j24;
        long w5 = (33554432 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14183e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j25;
        long k17 = (67108864 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14205y(), oVar2, 6) : j26;
        long k18 = (134217728 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j27;
        long k19 = (268435456 & i8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j28;
        long w6 = (536870912 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14181d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long k20 = (i8 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j30;
        long k21 = (i9 & 1) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14157I(), oVar2, 6) : j31;
        long k22 = (i9 & 2) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14180c0(), oVar2, 6) : j32;
        long w7 = (i9 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14189i(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j33;
        long k23 = (i9 & 8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14150B(), oVar2, 6) : j34;
        long k24 = (i9 & 16) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j35;
        long k25 = (i9 & 32) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j36;
        long w8 = (i9 & 64) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j37;
        long k26 = (i9 & 128) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j38;
        long k27 = (i9 & 256) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j39;
        long k28 = (i9 & 512) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j40;
        long w9 = (i9 & 1024) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j41;
        long k29 = (i9 & 2048) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j42;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1478)");
        }
        C8189d3 d3Var = new C8189d3(k, k2, w, k3, s, s2, s3, s4, k4, k5, tVar2, k6, k7, w2, k8, k9, k10, w3, k11, k12, k13, w4, k14, k15, k16, w5, k17, k18, k19, w6, k20, k21, k22, w7, k23, k24, k25, w8, k26, k27, k28, w9, k29, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d3Var;
    }

    @C12579k
    /* renamed from: d */
    public final C2366i0 mo11747d(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f2, f3, f4);
    }

    /* renamed from: f */
    public final float mo11748f() {
        return f19534e;
    }

    /* renamed from: g */
    public final float mo11749g() {
        return f19531b;
    }

    /* renamed from: h */
    public final float mo11750h() {
        return f19532c;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: i */
    public final C15218g4 mo11751i(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1066756961);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1347)");
        }
        C15218g4 f = ShapesKt.m26127f(C8329o0.f21814a.mo14179c(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: j */
    public final float mo11752j() {
        return f19533d;
    }
}
