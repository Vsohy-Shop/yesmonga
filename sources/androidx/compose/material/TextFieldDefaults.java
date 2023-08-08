package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.C2683e;
import androidx.compose.foundation.shape.C2684f;
import androidx.compose.foundation.shape.C2685g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,855:1\n135#2:856\n76#3:857\n76#3:858\n154#4:859\n154#4:860\n154#4:861\n154#4:862\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n273#1:856\n378#1:857\n436#1:858\n196#1:859\n202#1:860\n231#1:861\n237#1:862\n*E\n"})
public final class TextFieldDefaults {
    @C12579k

    /* renamed from: a */
    public static final TextFieldDefaults f7961a = new TextFieldDefaults();

    /* renamed from: b */
    public static final float f7962b = C16483g.m74435M((float) 56);

    /* renamed from: c */
    public static final float f7963c = C16483g.m74435M((float) 280);

    /* renamed from: d */
    public static final float f7964d = 0.54f;

    /* renamed from: e */
    public static final float f7965e = C16483g.m74435M((float) 1);

    /* renamed from: f */
    public static final float f7966f = C16483g.m74435M((float) 2);

    /* renamed from: g */
    public static final float f7967g = 0.12f;

    /* renamed from: h */
    public static final float f7968h = 0.42f;

    /* renamed from: i */
    public static final int f7969i = 0;

    /* renamed from: k */
    public static /* synthetic */ C8767m m14114k(TextFieldDefaults textFieldDefaults, C8767m mVar, boolean z, boolean z2, C2241e eVar, C7930s1 s1Var, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = f7966f;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = f7965e;
        } else {
            f4 = f2;
        }
        return textFieldDefaults.mo10636j(mVar, z, z2, eVar, s1Var, f3, f4);
    }

    /* renamed from: n */
    public static /* synthetic */ C2366i0 m14115n(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m14140f();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m14140f();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.m14140f();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.m14140f();
        }
        return textFieldDefaults.mo10638m(f, f2, f3, f4);
    }

    /* renamed from: q */
    public static /* synthetic */ C2366i0 m14116q(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m14140f();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m14140f();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.m14161m();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.m14162n();
        }
        return textFieldDefaults.mo10640p(f, f2, f3, f4);
    }

    /* renamed from: s */
    public static /* synthetic */ C2366i0 m14117s(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m14140f();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m14140f();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.m14140f();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.m14140f();
        }
        return textFieldDefaults.mo10641r(f, f2, f3, f4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10627a(boolean r20, boolean r21, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r22, @org.jetbrains.annotations.C12579k androidx.compose.material.C7930s1 r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r24, float r25, float r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r19 = this;
            r11 = r19
            r8 = r22
            r9 = r23
            r10 = r28
            r12 = r29
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 943754022(0x38408b26, float:4.590596E-5)
            r1 = r27
            androidx.compose.runtime.o r13 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0026
            r1 = r10 | 6
            r14 = r20
            goto L_0x0038
        L_0x0026:
            r1 = r10 & 14
            r14 = r20
            if (r1 != 0) goto L_0x0037
            boolean r1 = r13.mo14961b(r14)
            if (r1 == 0) goto L_0x0034
            r1 = 4
            goto L_0x0035
        L_0x0034:
            r1 = 2
        L_0x0035:
            r1 = r1 | r10
            goto L_0x0038
        L_0x0037:
            r1 = r10
        L_0x0038:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0041
            r1 = r1 | 48
            r15 = r21
            goto L_0x0053
        L_0x0041:
            r2 = r10 & 112(0x70, float:1.57E-43)
            r15 = r21
            if (r2 != 0) goto L_0x0053
            boolean r2 = r13.mo14961b(r15)
            if (r2 == 0) goto L_0x0050
            r2 = 32
            goto L_0x0052
        L_0x0050:
            r2 = 16
        L_0x0052:
            r1 = r1 | r2
        L_0x0053:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x005a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            boolean r2 = r13.mo15006n0(r8)
            if (r2 == 0) goto L_0x0067
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r1 = r1 | r2
        L_0x006a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0081
            boolean r2 = r13.mo15006n0(r9)
            if (r2 == 0) goto L_0x007e
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r2
        L_0x0081:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r10 & r2
            if (r3 != 0) goto L_0x009d
            r3 = r12 & 16
            if (r3 != 0) goto L_0x0097
            r3 = r24
            boolean r4 = r13.mo15006n0(r3)
            if (r4 == 0) goto L_0x0099
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0097:
            r3 = r24
        L_0x0099:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r4
            goto L_0x009f
        L_0x009d:
            r3 = r24
        L_0x009f:
            r4 = 458752(0x70000, float:6.42848E-40)
            r5 = r10 & r4
            if (r5 != 0) goto L_0x00ba
            r5 = r12 & 32
            if (r5 != 0) goto L_0x00b4
            r5 = r25
            boolean r6 = r13.mo14968d(r5)
            if (r6 == 0) goto L_0x00b6
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b4:
            r5 = r25
        L_0x00b6:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r6
            goto L_0x00bc
        L_0x00ba:
            r5 = r25
        L_0x00bc:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x00d6
            r6 = r12 & 64
            if (r6 != 0) goto L_0x00d0
            r6 = r26
            boolean r7 = r13.mo14968d(r6)
            if (r7 == 0) goto L_0x00d2
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d0:
            r6 = r26
        L_0x00d2:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r1 = r1 | r7
            goto L_0x00d8
        L_0x00d6:
            r6 = r26
        L_0x00d8:
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00e0
            r7 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00de:
            r1 = r1 | r7
            goto L_0x00f1
        L_0x00e0:
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r10
            if (r7 != 0) goto L_0x00f1
            boolean r7 = r13.mo15006n0(r11)
            if (r7 == 0) goto L_0x00ee
            r7 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00de
        L_0x00ee:
            r7 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00de
        L_0x00f1:
            r7 = 23967451(0x16db6db, float:4.3661218E-38)
            r7 = r7 & r1
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r4) goto L_0x0109
            boolean r4 = r13.mo15011p()
            if (r4 != 0) goto L_0x0101
            goto L_0x0109
        L_0x0101:
            r13.mo14958a0()
            r7 = r5
            r8 = r6
            r6 = r3
            goto L_0x01b3
        L_0x0109:
            r13.mo14930Q()
            r4 = r10 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x0135
            boolean r4 = r13.mo14977f0()
            if (r4 == 0) goto L_0x0120
            goto L_0x0135
        L_0x0120:
            r13.mo14958a0()
            r4 = r12 & 16
            if (r4 == 0) goto L_0x0129
            r1 = r1 & r17
        L_0x0129:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x012f
            r1 = r1 & r16
        L_0x012f:
            r4 = r12 & 64
            if (r4 == 0) goto L_0x0159
            r1 = r1 & r7
            goto L_0x0159
        L_0x0135:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x0143
            int r3 = r1 >> 21
            r3 = r3 & 14
            androidx.compose.ui.graphics.g4 r3 = r11.mo10633g(r13, r3)
            r1 = r1 & r17
        L_0x0143:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x014c
            float r4 = f7966f
            r1 = r1 & r16
            r5 = r4
        L_0x014c:
            r4 = r12 & 64
            if (r4 == 0) goto L_0x0159
            float r4 = f7965e
            r1 = r1 & r7
            r7 = r3
            r17 = r4
            r16 = r5
            goto L_0x015e
        L_0x0159:
            r7 = r3
            r16 = r5
            r17 = r6
        L_0x015e:
            r13.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x016d
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r4)
        L_0x016d:
            r0 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            int r1 = r1 >> 3
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r17
            r6 = r13
            r8 = r7
            r7 = r18
            androidx.compose.runtime.k2 r0 = androidx.compose.material.C7938u1.m25326b(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.C2223i) r0
            androidx.compose.ui.m r0 = androidx.compose.foundation.BorderKt.m8850f(r1, r0, r8)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.m9839a(r0, r13, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ae
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ae:
            r6 = r8
            r7 = r16
            r8 = r17
        L_0x01b3:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x01ba
            goto L_0x01d2
        L_0x01ba:
            androidx.compose.material.TextFieldDefaults$BorderBox$1 r5 = new androidx.compose.material.TextFieldDefaults$BorderBox$1
            r0 = r5
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r14 = r5
            r5 = r23
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.mo15202a(r14)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo10627a(boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material.s1, androidx.compose.ui.graphics.g4, float, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10628b(@org.jetbrains.annotations.C12579k java.lang.String r68, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r69, boolean r70, boolean r71, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r72, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r73, boolean r74, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r75, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r76, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r77, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r78, @org.jetbrains.annotations.C12580l androidx.compose.material.C7930s1 r79, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r80, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r81, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r82, int r83, int r84, int r85) {
        /*
            r67 = this;
            r15 = r68
            r14 = r69
            r13 = r72
            r12 = r73
            r11 = r83
            r10 = r84
            r9 = r85
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1280721485(0xffffffffb3a9bdb3, float:-7.904182E-8)
            r1 = r82
            androidx.compose.runtime.o r8 = r1.mo15009o(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0032
            r1 = r11 | 6
            goto L_0x0042
        L_0x0032:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0041
            boolean r1 = r8.mo15006n0(r15)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r11
            goto L_0x0042
        L_0x0041:
            r1 = r11
        L_0x0042:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0059
        L_0x0049:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0059
            boolean r4 = r8.mo14927P(r14)
            if (r4 == 0) goto L_0x0056
            r4 = 32
            goto L_0x0058
        L_0x0056:
            r4 = 16
        L_0x0058:
            r1 = r1 | r4
        L_0x0059:
            r4 = r9 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0062
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0062:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0076
            r4 = r70
            boolean r17 = r8.mo14961b(r4)
            if (r17 == 0) goto L_0x0071
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r17 = r16
        L_0x0073:
            r1 = r1 | r17
            goto L_0x0078
        L_0x0076:
            r4 = r70
        L_0x0078:
            r17 = r9 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0083
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0097
        L_0x0083:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0097
            r2 = r71
            boolean r17 = r8.mo14961b(r2)
            if (r17 == 0) goto L_0x0092
            r17 = r19
            goto L_0x0094
        L_0x0092:
            r17 = r18
        L_0x0094:
            r1 = r1 | r17
            goto L_0x0099
        L_0x0097:
            r2 = r71
        L_0x0099:
            r17 = r9 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r64 = 57344(0xe000, float:8.0356E-41)
            if (r17 == 0) goto L_0x00a7
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b8
        L_0x00a7:
            r17 = r11 & r64
            if (r17 != 0) goto L_0x00b8
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x00b4
            r17 = r20
            goto L_0x00b6
        L_0x00b4:
            r17 = r21
        L_0x00b6:
            r1 = r1 | r17
        L_0x00b8:
            r17 = r9 & 32
            if (r17 == 0) goto L_0x00c1
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00be:
            r1 = r1 | r17
            goto L_0x00d3
        L_0x00c1:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r8.mo15006n0(r12)
            if (r17 == 0) goto L_0x00d0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00d0:
            r17 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00be
        L_0x00d3:
            r17 = r9 & 64
            if (r17 == 0) goto L_0x00de
            r22 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r22
            r3 = r74
            goto L_0x00f3
        L_0x00de:
            r22 = 3670016(0x380000, float:5.142788E-39)
            r22 = r11 & r22
            r3 = r74
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r8.mo14961b(r3)
            if (r23 == 0) goto L_0x00ef
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r1 = r1 | r23
        L_0x00f3:
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00fe
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r24
            r6 = r75
            goto L_0x0113
        L_0x00fe:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r11 & r24
            r6 = r75
            if (r24 != 0) goto L_0x0113
            boolean r25 = r8.mo14927P(r6)
            if (r25 == 0) goto L_0x010f
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r1 = r1 | r25
        L_0x0113:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x011e
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r26
            r0 = r76
            goto L_0x0133
        L_0x011e:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r11 & r26
            r0 = r76
            if (r26 != 0) goto L_0x0133
            boolean r26 = r8.mo14927P(r0)
            if (r26 == 0) goto L_0x012f
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r1 = r1 | r26
        L_0x0133:
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x013e
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r26
            r2 = r77
            goto L_0x0153
        L_0x013e:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r11 & r26
            r2 = r77
            if (r26 != 0) goto L_0x0153
            boolean r26 = r8.mo14927P(r2)
            if (r26 == 0) goto L_0x014f
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r1 = r1 | r26
        L_0x0153:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015c
            r22 = r10 | 6
            r3 = r78
            goto L_0x0172
        L_0x015c:
            r26 = r10 & 14
            r3 = r78
            if (r26 != 0) goto L_0x0170
            boolean r26 = r8.mo14927P(r3)
            if (r26 == 0) goto L_0x016b
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
            r26 = r10 & 112(0x70, float:1.57E-43)
            if (r26 != 0) goto L_0x018c
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0185
            r3 = r79
            boolean r26 = r8.mo15006n0(r3)
            if (r26 == 0) goto L_0x0187
            r23 = 32
            goto L_0x0189
        L_0x0185:
            r3 = r79
        L_0x0187:
            r23 = 16
        L_0x0189:
            r22 = r22 | r23
            goto L_0x018e
        L_0x018c:
            r3 = r79
        L_0x018e:
            r3 = r10 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x01a6
            r3 = r9 & 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x01a1
            r3 = r80
            boolean r23 = r8.mo15006n0(r3)
            if (r23 == 0) goto L_0x01a3
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x01a3
        L_0x01a1:
            r3 = r80
        L_0x01a3:
            r22 = r22 | r16
            goto L_0x01a8
        L_0x01a6:
            r3 = r80
        L_0x01a8:
            r3 = r22
            r4 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x01b1
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c2
        L_0x01b1:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x01c2
            r6 = r81
            boolean r16 = r8.mo14927P(r6)
            if (r16 == 0) goto L_0x01bf
            r18 = r19
        L_0x01bf:
            r3 = r3 | r18
            goto L_0x01c4
        L_0x01c2:
            r6 = r81
        L_0x01c4:
            r6 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x01cb
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01dd
        L_0x01cb:
            r6 = r10 & r64
            if (r6 != 0) goto L_0x01dd
            r6 = r67
            boolean r16 = r8.mo15006n0(r6)
            if (r16 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r20 = r21
        L_0x01da:
            r3 = r3 | r20
            goto L_0x01df
        L_0x01dd:
            r6 = r67
        L_0x01df:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r1 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r10) goto L_0x020f
            r6 = 46811(0xb6db, float:6.5596E-41)
            r6 = r6 & r3
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r6 != r10) goto L_0x020f
            boolean r6 = r8.mo15011p()
            if (r6 != 0) goto L_0x01f8
            goto L_0x020f
        L_0x01f8:
            r8.mo14958a0()
            r9 = r75
            r10 = r76
            r11 = r77
            r12 = r78
            r13 = r79
            r14 = r80
            r15 = r81
            r27 = r8
            r8 = r74
            goto L_0x039e
        L_0x020f:
            r8.mo14930Q()
            r6 = r11 & 1
            if (r6 == 0) goto L_0x023e
            boolean r6 = r8.mo14977f0()
            if (r6 == 0) goto L_0x021d
            goto L_0x023e
        L_0x021d:
            r8.mo14958a0()
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0226
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0226:
            r0 = r9 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x022c
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x022c:
            r19 = r74
            r20 = r75
            r21 = r76
            r22 = r77
            r23 = r78
            r24 = r79
            r25 = r80
            r26 = r81
            goto L_0x0308
        L_0x023e:
            if (r17 == 0) goto L_0x0242
            r6 = 0
            goto L_0x0244
        L_0x0242:
            r6 = r74
        L_0x0244:
            r10 = 0
            if (r5 == 0) goto L_0x0249
            r5 = r10
            goto L_0x024b
        L_0x0249:
            r5 = r75
        L_0x024b:
            if (r7 == 0) goto L_0x024f
            r7 = r10
            goto L_0x0251
        L_0x024f:
            r7 = r76
        L_0x0251:
            if (r0 == 0) goto L_0x0255
            r0 = r10
            goto L_0x0257
        L_0x0255:
            r0 = r77
        L_0x0257:
            if (r2 == 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r10 = r78
        L_0x025c:
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02a0
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
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            int r2 = r3 >> 9
            r62 = r2 & 112(0x70, float:1.57E-43)
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r16 = r67
            r59 = r8
            androidx.compose.material.s1 r2 = r16.mo10637l(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02a2
        L_0x02a0:
            r2 = r79
        L_0x02a2:
            r82 = r0
            r0 = r9 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x02c8
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 15
            r20 = 0
            r74 = r67
            r75 = r0
            r76 = r16
            r77 = r17
            r78 = r18
            r79 = r19
            r80 = r20
            androidx.compose.foundation.layout.i0 r0 = m14115n(r74, r75, r76, r77, r78, r79, r80)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02ca
        L_0x02c8:
            r0 = r80
        L_0x02ca:
            if (r4 == 0) goto L_0x02f4
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 r4 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
            r74 = r4
            r75 = r70
            r76 = r6
            r77 = r73
            r78 = r2
            r79 = r1
            r80 = r3
            r74.<init>(r75, r76, r77, r78, r79, r80)
            r74 = r0
            r0 = 1261916269(0x4b37506d, float:1.2013677E7)
            r75 = r2
            r2 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r0, r2, r4)
            r25 = r74
            r24 = r75
            r22 = r82
            r26 = r0
            goto L_0x0300
        L_0x02f4:
            r74 = r0
            r75 = r2
            r25 = r74
            r24 = r75
            r26 = r81
            r22 = r82
        L_0x0300:
            r20 = r5
            r19 = r6
            r21 = r7
            r23 = r10
        L_0x0308:
            r8.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0319
            java.lang.String r0 = "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)"
            r2 = -1280721485(0xffffffffb3a9bdb3, float:-7.904182E-8)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r0)
        L_0x0319:
            androidx.compose.material.TextFieldType r0 = androidx.compose.material.TextFieldType.Outlined
            int r2 = r1 << 3
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 >> 9
            r5 = r4 & r64
            r2 = r2 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r4
            r2 = r2 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r3 << 21
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r1 << 15
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r1 << 21
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r16 = r2 | r4
            int r2 = r1 >> 18
            r2 = r2 & 14
            int r1 = r1 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r2 = r3 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r3 << 3
            r2 = r2 & r64
            r17 = r1 | r2
            r18 = 0
            r1 = r68
            r2 = r69
            r3 = r72
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r27 = r8
            r8 = r71
            r9 = r70
            r10 = r19
            r11 = r73
            r12 = r25
            r13 = r24
            r14 = r26
            r15 = r27
            androidx.compose.material.TextFieldImplKt.m14135a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x038e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x038e:
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
        L_0x039e:
            androidx.compose.runtime.t1 r7 = r27.mo15020s()
            if (r7 != 0) goto L_0x03a5
            goto L_0x03ca
        L_0x03a5:
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 r6 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
            r0 = r6
            r1 = r67
            r2 = r68
            r3 = r69
            r4 = r70
            r5 = r71
            r65 = r6
            r6 = r72
            r66 = r7
            r7 = r73
            r16 = r83
            r17 = r84
            r18 = r85
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r65
            r0 = r66
            r0.mo15202a(r1)
        L_0x03ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo10628b(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material.s1, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013a  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10629c(@org.jetbrains.annotations.C12579k java.lang.String r70, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r71, boolean r72, boolean r73, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r74, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r75, boolean r76, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r77, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r78, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r79, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r80, @org.jetbrains.annotations.C12580l androidx.compose.material.C7930s1 r81, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r82, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r83, int r84, int r85, int r86) {
        /*
            r69 = this;
            r15 = r70
            r13 = r71
            r12 = r74
            r11 = r75
            r10 = r84
            r9 = r85
            r8 = r86
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1171040065(0x45cca741, float:6548.9067)
            r1 = r83
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x0032
            r1 = r10 | 6
            goto L_0x0042
        L_0x0032:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0041
            boolean r1 = r7.mo15006n0(r15)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r10
            goto L_0x0042
        L_0x0041:
            r1 = r10
        L_0x0042:
            r4 = r8 & 2
            if (r4 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0059
        L_0x0049:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0059
            boolean r4 = r7.mo14927P(r13)
            if (r4 == 0) goto L_0x0056
            r4 = 32
            goto L_0x0058
        L_0x0056:
            r4 = 16
        L_0x0058:
            r1 = r1 | r4
        L_0x0059:
            r4 = r8 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0062
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0062:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0076
            r4 = r72
            boolean r17 = r7.mo14961b(r4)
            if (r17 == 0) goto L_0x0071
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r17 = r16
        L_0x0073:
            r1 = r1 | r17
            goto L_0x0078
        L_0x0076:
            r4 = r72
        L_0x0078:
            r17 = r8 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0083
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0097
        L_0x0083:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0097
            r2 = r73
            boolean r17 = r7.mo14961b(r2)
            if (r17 == 0) goto L_0x0092
            r17 = r19
            goto L_0x0094
        L_0x0092:
            r17 = r18
        L_0x0094:
            r1 = r1 | r17
            goto L_0x0099
        L_0x0097:
            r2 = r73
        L_0x0099:
            r17 = r8 & 16
            r64 = 57344(0xe000, float:8.0356E-41)
            if (r17 == 0) goto L_0x00a3
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b4
        L_0x00a3:
            r17 = r10 & r64
            if (r17 != 0) goto L_0x00b4
            boolean r17 = r7.mo15006n0(r12)
            if (r17 == 0) goto L_0x00b0
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b2
        L_0x00b0:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00b2:
            r1 = r1 | r17
        L_0x00b4:
            r17 = r8 & 32
            r65 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00bf
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00bc:
            r1 = r1 | r17
            goto L_0x00cf
        L_0x00bf:
            r17 = r10 & r65
            if (r17 != 0) goto L_0x00cf
            boolean r17 = r7.mo15006n0(r11)
            if (r17 == 0) goto L_0x00cc
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00cc:
            r17 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00bc
        L_0x00cf:
            r17 = r8 & 64
            r66 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00dc
            r20 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r20
            r3 = r76
            goto L_0x00ef
        L_0x00dc:
            r20 = r10 & r66
            r3 = r76
            if (r20 != 0) goto L_0x00ef
            boolean r21 = r7.mo14961b(r3)
            if (r21 == 0) goto L_0x00eb
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ed
        L_0x00eb:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ed:
            r1 = r1 | r21
        L_0x00ef:
            r5 = r8 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00fa
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r22
            r6 = r77
            goto L_0x010f
        L_0x00fa:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r10 & r22
            r6 = r77
            if (r22 != 0) goto L_0x010f
            boolean r23 = r7.mo14927P(r6)
            if (r23 == 0) goto L_0x010b
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r1 = r1 | r23
        L_0x010f:
            r14 = r8 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x011a
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r24
            r0 = r78
            goto L_0x012f
        L_0x011a:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r10 & r24
            r0 = r78
            if (r24 != 0) goto L_0x012f
            boolean r24 = r7.mo14927P(r0)
            if (r24 == 0) goto L_0x012b
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012d
        L_0x012b:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012d:
            r1 = r1 | r24
        L_0x012f:
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x013a
            r24 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r24
            r2 = r79
            goto L_0x014f
        L_0x013a:
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r24 = r10 & r24
            r2 = r79
            if (r24 != 0) goto L_0x014f
            boolean r24 = r7.mo14927P(r2)
            if (r24 == 0) goto L_0x014b
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014d
        L_0x014b:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014d:
            r1 = r1 | r24
        L_0x014f:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0158
            r20 = r9 | 6
            r3 = r80
            goto L_0x016e
        L_0x0158:
            r24 = r9 & 14
            r3 = r80
            if (r24 != 0) goto L_0x016c
            boolean r24 = r7.mo14927P(r3)
            if (r24 == 0) goto L_0x0167
            r20 = 4
            goto L_0x0169
        L_0x0167:
            r20 = 2
        L_0x0169:
            r20 = r9 | r20
            goto L_0x016e
        L_0x016c:
            r20 = r9
        L_0x016e:
            r24 = r9 & 112(0x70, float:1.57E-43)
            if (r24 != 0) goto L_0x0188
            r3 = r8 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0181
            r3 = r81
            boolean r24 = r7.mo15006n0(r3)
            if (r24 == 0) goto L_0x0183
            r21 = 32
            goto L_0x0185
        L_0x0181:
            r3 = r81
        L_0x0183:
            r21 = 16
        L_0x0185:
            r20 = r20 | r21
            goto L_0x018a
        L_0x0188:
            r3 = r81
        L_0x018a:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x01a2
            r3 = r8 & 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x019d
            r3 = r82
            boolean r21 = r7.mo15006n0(r3)
            if (r21 == 0) goto L_0x019f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r3 = r82
        L_0x019f:
            r20 = r20 | r16
            goto L_0x01a4
        L_0x01a2:
            r3 = r82
        L_0x01a4:
            r3 = r20
            r4 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x01ad
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x01be
        L_0x01ad:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x01be
            r4 = r69
            boolean r16 = r7.mo15006n0(r4)
            if (r16 == 0) goto L_0x01bb
            r18 = r19
        L_0x01bb:
            r3 = r3 | r18
            goto L_0x01c0
        L_0x01be:
            r4 = r69
        L_0x01c0:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r1 & r16
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r6) goto L_0x01ec
            r4 = r3 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r4 != r6) goto L_0x01ec
            boolean r4 = r7.mo15011p()
            if (r4 != 0) goto L_0x01d7
            goto L_0x01ec
        L_0x01d7:
            r7.mo14958a0()
            r8 = r76
            r9 = r77
            r10 = r78
            r11 = r79
            r12 = r80
            r13 = r81
            r14 = r82
            r26 = r7
            goto L_0x0361
        L_0x01ec:
            r7.mo14930Q()
            r4 = r10 & 1
            if (r4 == 0) goto L_0x0219
            boolean r4 = r7.mo14977f0()
            if (r4 == 0) goto L_0x01fa
            goto L_0x0219
        L_0x01fa:
            r7.mo14958a0()
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0203
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0203:
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0209
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0209:
            r19 = r76
            r20 = r77
            r21 = r78
            r22 = r79
            r23 = r80
            r24 = r81
            r25 = r82
            goto L_0x02d5
        L_0x0219:
            if (r17 == 0) goto L_0x021d
            r4 = 0
            goto L_0x021f
        L_0x021d:
            r4 = r76
        L_0x021f:
            r6 = 0
            if (r5 == 0) goto L_0x0224
            r5 = r6
            goto L_0x0226
        L_0x0224:
            r5 = r77
        L_0x0226:
            if (r14 == 0) goto L_0x022a
            r14 = r6
            goto L_0x022c
        L_0x022a:
            r14 = r78
        L_0x022c:
            if (r0 == 0) goto L_0x0230
            r0 = r6
            goto L_0x0232
        L_0x0230:
            r0 = r79
        L_0x0232:
            if (r2 == 0) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r6 = r80
        L_0x0237:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x027b
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
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            int r2 = r3 >> 6
            r62 = r2 & 112(0x70, float:1.57E-43)
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r16 = r69
            r59 = r7
            androidx.compose.material.s1 r2 = r16.mo10639o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x027d
        L_0x027b:
            r2 = r81
        L_0x027d:
            r83 = r0
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x02c7
            if (r5 != 0) goto L_0x02a3
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 15
            r20 = 0
            r76 = r69
            r77 = r0
            r78 = r16
            r79 = r17
            r80 = r18
            r81 = r19
            r82 = r20
            androidx.compose.foundation.layout.i0 r0 = m14117s(r76, r77, r78, r79, r80, r81, r82)
            goto L_0x02c0
        L_0x02a3:
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 15
            r20 = 0
            r76 = r69
            r77 = r0
            r78 = r16
            r79 = r17
            r80 = r18
            r81 = r19
            r82 = r20
            androidx.compose.foundation.layout.i0 r0 = m14116q(r76, r77, r78, r79, r80, r81, r82)
        L_0x02c0:
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r22 = r83
            r25 = r0
            goto L_0x02cb
        L_0x02c7:
            r25 = r82
            r22 = r83
        L_0x02cb:
            r24 = r2
            r19 = r4
            r20 = r5
            r23 = r6
            r21 = r14
        L_0x02d5:
            r7.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)"
            r2 = 1171040065(0x45cca741, float:6548.9067)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r0)
        L_0x02e6:
            androidx.compose.material.TextFieldType r0 = androidx.compose.material.TextFieldType.Filled
            r14 = 0
            int r2 = r1 << 3
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 >> 9
            r5 = r4 & r64
            r2 = r2 | r5
            r5 = r4 & r65
            r2 = r2 | r5
            r4 = r4 & r66
            r2 = r2 | r4
            int r4 = r3 << 21
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r1 << 15
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r1 << 21
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r16 = r2 | r4
            int r2 = r1 >> 18
            r2 = r2 & 14
            int r1 = r1 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r2 = r3 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r17 = r1 | r2
            r18 = 16384(0x4000, float:2.2959E-41)
            r1 = r70
            r2 = r71
            r3 = r74
            r4 = r20
            r5 = r21
            r6 = r22
            r26 = r7
            r7 = r23
            r8 = r73
            r9 = r72
            r10 = r19
            r11 = r75
            r12 = r25
            r13 = r24
            r15 = r26
            androidx.compose.material.TextFieldImplKt.m14135a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0353
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0353:
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
        L_0x0361:
            androidx.compose.runtime.t1 r15 = r26.mo15020s()
            if (r15 != 0) goto L_0x0368
            goto L_0x038d
        L_0x0368:
            androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1 r7 = new androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
            r0 = r7
            r1 = r69
            r2 = r70
            r3 = r71
            r4 = r72
            r5 = r73
            r6 = r74
            r67 = r7
            r7 = r75
            r68 = r15
            r15 = r84
            r16 = r85
            r17 = r86
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r67
            r0 = r68
            r0.mo15202a(r1)
        L_0x038d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo10629c(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material.s1, androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: d */
    public final float mo10630d() {
        return f7966f;
    }

    /* renamed from: e */
    public final float mo10631e() {
        return f7962b;
    }

    /* renamed from: f */
    public final float mo10632f() {
        return f7963c;
    }

    @C11314h(name = "getOutlinedTextFieldShape")
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: g */
    public final C15218g4 mo10633g(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        C2683e e = C7933t0.f19075a.mo11076b(oVar, 6).mo10758e();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return e;
    }

    @C11314h(name = "getTextFieldShape")
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: h */
    public final C15218g4 mo10634h(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:215)");
        }
        C2683e d = C2683e.m12106d(C7933t0.f19075a.mo11076b(oVar, 6).mo10758e(), (C2684f) null, (C2684f) null, C2685g.m12119d(), C2685g.m12119d(), 3, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return d;
    }

    /* renamed from: i */
    public final float mo10635i() {
        return f7965e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.C3044g0
    @org.jetbrains.annotations.C12579k
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo10636j(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r13, boolean r14, boolean r15, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r16, @org.jetbrains.annotations.C12579k androidx.compose.material.C7930s1 r17, float r18, float r19) {
        /*
            r12 = this;
            r0 = r13
            java.lang.String r1 = "$this$indicatorLine"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "interactionSource"
            r9 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "colors"
            r10 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x002b
            androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x002f
        L_0x002b:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x002f:
            androidx.compose.material.TextFieldDefaults$indicatorLine$2 r11 = new androidx.compose.material.TextFieldDefaults$indicatorLine$2
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r13, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo10636j(androidx.compose.ui.m, boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material.s1, float, float):androidx.compose.ui.m");
    }

    @C8540g
    @C12579k
    /* renamed from: l */
    public final C7930s1 mo10637l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @C12580l C8592o oVar, int i, int i2, int i3, int i4) {
        C8592o oVar2 = oVar;
        int i5 = i4;
        oVar2.mo14918M(1762667317);
        long w = (i5 & 1) != 0 ? C15240j2.m66080w(((C15240j2) oVar2.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) oVar2.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        long w2 = (i5 & 2) != 0 ? C15240j2.m66080w(w, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long s = (i5 & 4) != 0 ? C15240j2.f37547b.mo42850s() : j3;
        long j22 = (i5 & 8) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j() : j4;
        long d = (i5 & 16) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j5;
        long w3 = (i5 & 32) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long w4 = (i5 & 64) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long w5 = (i5 & 128) != 0 ? C15240j2.m66080w(w4, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long d2 = (i5 & 256) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j9;
        long w6 = (i5 & 512) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long w7 = (i5 & 1024) != 0 ? C15240j2.m66080w(w6, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long j23 = (i5 & 2048) != 0 ? w6 : j12;
        long w8 = (i5 & 4096) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long w9 = (i5 & 8192) != 0 ? C15240j2.m66080w(w8, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14;
        long d3 = (i5 & 16384) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j15;
        long w10 = (32768 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long w11 = (65536 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long w12 = (131072 & i5) != 0 ? C15240j2.m66080w(w11, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j18;
        long d4 = (262144 & i5) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j19;
        long w13 = (524288 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long w14 = (i5 & 1048576) != 0 ? C15240j2.m66080w(w13, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        C3026a0 a0Var = new C3026a0(w, w2, j22, d, w3, w4, d2, w5, w6, w7, j23, w8, w9, d3, s, w10, w11, w12, d4, w13, w14, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a0Var;
    }

    @C3044g0
    @C12579k
    /* renamed from: m */
    public final C2366i0 mo10638m(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f2, f3, f4);
    }

    @C8540g
    @C12579k
    /* renamed from: o */
    public final C7930s1 mo10639o(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @C12580l C8592o oVar, int i, int i2, int i3, int i4) {
        C8592o oVar2 = oVar;
        int i5 = i4;
        oVar2.mo14918M(231892599);
        long w = (i5 & 1) != 0 ? C15240j2.m66080w(((C15240j2) oVar2.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) oVar2.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        long w2 = (i5 & 2) != 0 ? C15240j2.m66080w(w, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long w3 = (i5 & 4) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long j22 = (i5 & 8) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j() : j4;
        long d = (i5 & 16) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j5;
        long w4 = (i5 & 32) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long w5 = (i5 & 64) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long w6 = (i5 & 128) != 0 ? C15240j2.m66080w(w5, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long d2 = (i5 & 256) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j9;
        long w7 = (i5 & 512) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long w8 = (i5 & 1024) != 0 ? C15240j2.m66080w(w7, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long j23 = (i5 & 2048) != 0 ? w7 : j12;
        long w9 = (i5 & 4096) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long w10 = (i5 & 8192) != 0 ? C15240j2.m66080w(w9, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14;
        long d3 = (i5 & 16384) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j15;
        long w11 = (32768 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10971j(), C7904r.f18969a.mo10992c(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long w12 = (65536 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long w13 = (131072 & i5) != 0 ? C15240j2.m66080w(w12, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j18;
        long d4 = (262144 & i5) != 0 ? C7933t0.f19075a.mo11075a(oVar2, 6).mo10965d() : j19;
        long w14 = (524288 & i5) != 0 ? C15240j2.m66080w(C7933t0.f19075a.mo11075a(oVar2, 6).mo10970i(), C7904r.f18969a.mo10993d(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long w15 = (i5 & 1048576) != 0 ? C15240j2.m66080w(w14, C7904r.f18969a.mo10991b(oVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        C3026a0 a0Var = new C3026a0(w, w2, j22, d, w4, w5, d2, w6, w7, w8, j23, w9, w10, d3, w3, w11, w12, w13, d4, w14, w15, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a0Var;
    }

    @C3044g0
    @C12579k
    /* renamed from: p */
    public final C2366i0 mo10640p(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f3, f2, f4);
    }

    @C3044g0
    @C12579k
    /* renamed from: r */
    public final C2366i0 mo10641r(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f2, f3, f4);
    }
}
