package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.C2844t;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.C8329o0;
import androidx.compose.material3.tokens.C8347x;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2124:1\n135#2:2125\n154#3:2126\n154#3:2132\n154#3:2133\n154#3:2134\n154#3:2135\n76#4:2127\n76#4:2128\n76#4:2129\n76#4:2130\n76#4:2131\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n132#1:2125\n189#1:2126\n64#1:2132\n70#1:2133\n75#1:2134\n80#1:2135\n259#1:2127\n681#1:2128\n831#1:2129\n1067#1:2130\n1162#1:2131\n*E\n"})
public final class TextFieldDefaults {
    @C12579k

    /* renamed from: a */
    public static final TextFieldDefaults f19839a = new TextFieldDefaults();

    /* renamed from: b */
    public static final float f19840b = C16483g.m74435M((float) 56);

    /* renamed from: c */
    public static final float f19841c = C16483g.m74435M((float) 280);

    /* renamed from: d */
    public static final float f19842d;

    /* renamed from: e */
    public static final float f19843e;

    /* renamed from: f */
    public static final float f19844f;

    /* renamed from: g */
    public static final float f19845g;

    /* renamed from: h */
    public static final int f19846h = 0;

    static {
        float M = C16483g.m74435M((float) 1);
        f19842d = M;
        float M2 = C16483g.m74435M((float) 2);
        f19843e = M2;
        f19844f = M;
        f19845g = M2;
    }

    /* renamed from: B */
    public static /* synthetic */ C8767m m26591B(TextFieldDefaults textFieldDefaults, C8767m mVar, boolean z, boolean z2, C2241e eVar, C8189d3 d3Var, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = f19843e;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = f19842d;
        } else {
            f4 = f2;
        }
        return textFieldDefaults.mo12171A(mVar, z, z2, eVar, d3Var, f3, f4);
    }

    /* renamed from: F */
    public static /* synthetic */ C2366i0 m26592F(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.mo12174E(f, f2, f3, f4);
    }

    /* renamed from: H */
    public static /* synthetic */ C2366i0 m26593H(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m26643k();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m26642j();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.m26643k();
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return textFieldDefaults.mo12175G(f, f2, f3, f4);
    }

    /* renamed from: L */
    public static /* synthetic */ C2366i0 m26594L(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m26643k();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m26643k();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.m26664m();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.m26664m();
        }
        return textFieldDefaults.mo12178K(f, f2, f3, f4);
    }

    /* renamed from: N */
    public static /* synthetic */ C2366i0 m26595N(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.mo12179M(f, f2, f3, f4);
    }

    /* renamed from: k */
    public static /* synthetic */ C2366i0 m26596k(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.m26643k();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.m26643k();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.m26664m();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.m26664m();
        }
        return textFieldDefaults.mo12189j(f, f2, f3, f4);
    }

    /* renamed from: m */
    public static /* synthetic */ C2366i0 m26597m(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.mo12190l(f, f2, f3, f4);
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @C11587t0(expression = "TextFieldDefaults.shape", imports = {}))
    /* renamed from: o */
    public static /* synthetic */ void m26598o() {
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @C11587t0(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: q */
    public static /* synthetic */ void m26599q() {
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @C11587t0(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: v */
    public static /* synthetic */ void m26600v() {
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @C11587t0(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: y */
    public static /* synthetic */ void m26601y() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material3.C8251n0
    @org.jetbrains.annotations.C12579k
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo12171A(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r13, boolean r14, boolean r15, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r16, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8189d3 r17, float r18, float r19) {
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
            androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
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
            androidx.compose.material3.TextFieldDefaults$indicatorLine$2 r11 = new androidx.compose.material3.TextFieldDefaults$indicatorLine$2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12171A(androidx.compose.ui.m, boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material3.d3, float, float):androidx.compose.ui.m");
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `OutlinedTextFieldDefaults.colors` with additional parameters tocontrol container color based on state.", replaceWith = @C11587t0(expression = "OutlinedTextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedBorderColor = focusedBorderColor,\n        unfocusedBorderColor = unfocusedBorderColor,\n        disabledBorderColor = disabledBorderColor,\n        errorBorderColor = errorBorderColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: C */
    public final C8189d3 mo12172C(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @C12580l C2844t tVar, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, @C12580l C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C8592o oVar2 = oVar;
        int i8 = i;
        int i9 = i2;
        int i10 = i6;
        int i11 = i7;
        oVar2.mo14918M(618732090);
        long k = (i10 & 1) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14152D(), oVar2, 6) : j;
        long k2 = (i10 & 2) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14166R(), oVar2, 6) : j2;
        long w = (i10 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14181d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i10 & 8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14204x(), oVar2, 6) : j4;
        long s = (i10 & 16) != 0 ? C15240j2.f37547b.mo42850s() : j5;
        long s2 = (i10 & 32) != 0 ? C15240j2.f37547b.mo42850s() : j6;
        long k4 = (i10 & 64) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14175a(), oVar2, 6) : j7;
        long k5 = (i10 & 128) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14191k(), oVar2, 6) : j8;
        C2844t tVar2 = (i10 & 256) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k6 = (i10 & 512) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14155G(), oVar2, 6) : j9;
        long k7 = (i10 & 1024) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14176a0(), oVar2, 6) : j10;
        long w2 = (i10 & 2048) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14187g(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long k8 = (i10 & 4096) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14149A(), oVar2, 6) : j12;
        long k9 = (i10 & 8192) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14154F(), oVar2, 6) : j13;
        long k10 = (i10 & 16384) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14173Y(), oVar2, 6) : j14;
        long w3 = (32768 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14185f(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long k11 = (65536 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14206z(), oVar2, 6) : j16;
        long k12 = (131072 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14158J(), oVar2, 6) : j17;
        long k13 = (262144 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14184e0(), oVar2, 6) : j18;
        long w4 = (524288 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14190j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long k14 = (1048576 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14151C(), oVar2, 6) : j20;
        long k15 = (2097152 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14153E(), oVar2, 6) : j21;
        long k16 = (4194304 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14171W(), oVar2, 6) : j22;
        long w5 = (8388608 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14183e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long k17 = (16777216 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14205y(), oVar2, 6) : j24;
        long k18 = (33554432 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j25;
        long k19 = (67108864 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j26;
        long w6 = (134217728 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14181d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j27;
        long k20 = (268435456 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j28;
        long k21 = (536870912 & i10) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14157I(), oVar2, 6) : j29;
        long k22 = (i10 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14180c0(), oVar2, 6) : j30;
        long w7 = (i11 & 1) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14189i(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j31;
        long k23 = (i11 & 2) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14150B(), oVar2, 6) : j32;
        long k24 = (i11 & 4) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j33;
        long k25 = (i11 & 8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j34;
        long w8 = (i11 & 16) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j35;
        long k26 = (i11 & 32) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j36;
        long k27 = (i11 & 64) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j37;
        long k28 = (i11 & 128) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j38;
        long w9 = (i11 & 256) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j39;
        long k29 = (i11 & 512) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j40;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(618732090, i8, i9, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:820)");
        }
        int i12 = i8 << 6;
        int i13 = (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | ((i8 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i8 >> 24;
        int i15 = i9 << 6;
        int i16 = (i14 & 112) | (i14 & 14) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i9 >> 24;
        int i18 = i3 << 6;
        int i19 = (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i3 >> 24;
        int i21 = i4 << 6;
        int i22 = (i20 & 112) | (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i4 >> 24;
        C8189d3 c = OutlinedTextFieldDefaults.f19530a.mo11746c(k, k2, w, k3, s, s, s, s2, k4, k5, tVar2, k6, k7, w2, k8, k9, k10, w3, k11, k12, k13, w4, k14, k15, k16, w5, k17, k18, k19, w6, k20, k21, k22, w7, k23, k24, k25, w8, k26, k27, k28, w9, k29, oVar, i13, i16, i19, i22, (i23 & 112) | (i23 & 14) | 3072 | ((i5 << 6) & 896), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @C8251n0
    /* renamed from: D */
    public final /* synthetic */ C8189d3 mo12173D(long j, long j2, long j3, long j4, long j5, C2844t tVar, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C8592o oVar2 = oVar;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        oVar2.mo14918M(1767818445);
        long k = (i9 & 1) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14166R(), oVar2, 6) : j;
        long w = (i9 & 2) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14181d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long s = (i9 & 4) != 0 ? C15240j2.f37547b.mo42850s() : j3;
        long k2 = (i9 & 8) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14175a(), oVar2, 6) : j4;
        long k3 = (i9 & 16) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14191k(), oVar2, 6) : j5;
        C2844t tVar2 = (i9 & 32) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k4 = (i9 & 64) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14155G(), oVar2, 6) : j6;
        long k5 = (i9 & 128) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14176a0(), oVar2, 6) : j7;
        long w2 = (i9 & 256) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14187g(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long k6 = (i9 & 512) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14149A(), oVar2, 6) : j9;
        long k7 = (i9 & 1024) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14154F(), oVar2, 6) : j10;
        long k8 = (i9 & 2048) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14173Y(), oVar2, 6) : j11;
        long w3 = (i9 & 4096) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14185f(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long k9 = (i9 & 8192) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14206z(), oVar2, 6) : j13;
        long k10 = (i9 & 16384) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14158J(), oVar2, 6) : j14;
        long k11 = (32768 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14184e0(), oVar2, 6) : j15;
        long w4 = (65536 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14190j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long k12 = (131072 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14151C(), oVar2, 6) : j17;
        long k13 = (262144 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14153E(), oVar2, 6) : j18;
        long k14 = (524288 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14171W(), oVar2, 6) : j19;
        long w5 = (1048576 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14183e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long k15 = (2097152 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14205y(), oVar2, 6) : j21;
        long k16 = (4194304 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14168T(), oVar2, 6) : j22;
        long w6 = (8388608 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14181d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long k17 = (16777216 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14157I(), oVar2, 6) : j24;
        long k18 = (33554432 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14180c0(), oVar2, 6) : j25;
        long w7 = (67108864 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14189i(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j26;
        long k19 = (134217728 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14150B(), oVar2, 6) : j27;
        long k20 = (268435456 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j28;
        long k21 = (536870912 & i9) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j29;
        long w8 = (i9 & 1073741824) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j30;
        long k22 = (i6 & 1) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14169U(), oVar2, 6) : j31;
        long k23 = (i6 & 2) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j32;
        long k24 = (i6 & 4) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j33;
        long w9 = (i6 & 8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j34;
        long k25 = (i6 & 16) != 0 ? ColorSchemeKt.m25524k(C8329o0.f21814a.mo14170V(), oVar2, 6) : j35;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1767818445, i7, i8, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1154)");
        }
        int i10 = i7 << 3;
        int i11 = (i7 & 14) | (i10 & 112) | (i10 & 896);
        int i12 = i7 << 9;
        int i13 = i11 | (i12 & 7168) | ((i7 << 6) & 57344) | (i12 & 458752) | ((i7 << 12) & 3670016);
        int i14 = i7 << 15;
        int i15 = i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i7 >> 15;
        int i17 = i8 << 15;
        int i18 = (i16 & 57344) | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i8 >> 15;
        int i20 = i3 << 15;
        int i21 = (i19 & 57344) | (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128);
        int i22 = i3 << 18;
        int i23 = i21 | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = i3 >> 9;
        int i25 = ((i3 >> 6) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016);
        int i26 = i4 << 21;
        int i27 = i25 | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
        int i28 = i4 >> 9;
        C8189d3 c = OutlinedTextFieldDefaults.f19530a.mo11746c(k, k, w, k, s, s, s, s, k2, k3, tVar2, k4, k5, w2, k6, k7, k8, w3, k9, k10, k11, w4, k12, k13, k14, w5, k15, k16, k16, w6, k16, k17, k18, w7, k19, k20, k21, w8, k22, k23, k24, w9, k25, oVar, i15, i18, i23, i27, (i28 & 14) | 3072 | (i28 & 112) | (i28 & 896), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @C11587t0(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @C12579k
    /* renamed from: E */
    public final C2366i0 mo12174E(float f, float f2, float f3, float f4) {
        return OutlinedTextFieldDefaults.f19530a.mo11747d(f, f2, f3, f4);
    }

    @C8251n0
    @C12579k
    /* renamed from: G */
    public final C2366i0 mo12175G(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f2, f3, f4);
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `TextFieldDefaults.colors` with additional parameters to controlcontainer color based on state.", replaceWith = @C11587t0(expression = "TextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedIndicatorColor = focusedIndicatorColor,\n        unfocusedIndicatorColor = unfocusedIndicatorColor,\n        disabledIndicatorColor = disabledIndicatorColor,\n        errorIndicatorColor = errorIndicatorColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {}))
    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: I */
    public final C8189d3 mo12176I(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @C12580l C2844t tVar, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, @C12580l C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C8592o oVar2 = oVar;
        int i8 = i;
        int i9 = i2;
        int i10 = i6;
        int i11 = i7;
        oVar2.mo14918M(568209592);
        long k = (i10 & 1) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14570J(), oVar2, 6) : j;
        long k2 = (i10 & 2) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14582V(), oVar2, 6) : j2;
        long w = (i10 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i10 & 8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14563C(), oVar2, 6) : j4;
        long k4 = (i10 & 16) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j5;
        long k5 = (i10 & 32) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j6;
        long k6 = (i10 & 64) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14591c(), oVar2, 6) : j7;
        long k7 = (i10 & 128) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14611q(), oVar2, 6) : j8;
        C2844t tVar2 = (i10 & 256) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k8 = (i10 & 512) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14568H(), oVar2, 6) : j9;
        long k9 = (i10 & 1024) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14587a(), oVar2, 6) : j10;
        long w2 = (i10 & 2048) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14599g(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long k10 = (i10 & 4096) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14609o(), oVar2, 6) : j12;
        long k11 = (i10 & 8192) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14572L(), oVar2, 6) : j13;
        long k12 = (i10 & 16384) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14592c0(), oVar2, 6) : j14;
        long w3 = (32768 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14606l(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long k13 = (65536 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14565E(), oVar2, 6) : j16;
        long k14 = (131072 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14574N(), oVar2, 6) : j17;
        long k15 = (262144 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14600g0(), oVar2, 6) : j18;
        long w4 = (524288 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14608n(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long k16 = (1048576 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14567G(), oVar2, 6) : j20;
        long k17 = (2097152 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14571K(), oVar2, 6) : j21;
        long k18 = (4194304 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14588a0(), oVar2, 6) : j22;
        long w5 = (8388608 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14605k(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long k19 = (16777216 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14564D(), oVar2, 6) : j24;
        long k20 = (33554432 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j25;
        long k21 = (67108864 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j26;
        long w6 = (134217728 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j27;
        long k22 = (268435456 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j28;
        long k23 = (536870912 & i10) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14573M(), oVar2, 6) : j29;
        long k24 = (i10 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14596e0(), oVar2, 6) : j30;
        long w7 = (i11 & 1) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14607m(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j31;
        long k25 = (i11 & 2) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14566F(), oVar2, 6) : j32;
        long k26 = (i11 & 4) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j33;
        long k27 = (i11 & 8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j34;
        long w8 = (i11 & 16) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j35;
        long k28 = (i11 & 32) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j36;
        long k29 = (i11 & 64) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j37;
        long k30 = (i11 & 128) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j38;
        long w9 = (i11 & 256) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j39;
        long k31 = (i11 & 512) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j40;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(568209592, i8, i9, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:670)");
        }
        int i12 = i8 << 6;
        int i13 = (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | ((i8 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i8 >> 24;
        int i15 = i9 << 6;
        int i16 = (i14 & 112) | (i14 & 14) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i9 >> 24;
        int i18 = i3 << 6;
        int i19 = (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i3 >> 24;
        int i21 = i4 << 6;
        int i22 = (i20 & 112) | (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i4 >> 24;
        int i24 = i5 << 6;
        C8189d3 i25 = mo12188i(k, k2, w, k3, k4, k4, k4, k5, k6, k7, tVar2, k8, k9, w2, k10, k11, k12, w3, k13, k14, k15, w4, k16, k17, k18, w5, k19, k20, k21, w6, k22, k23, k24, w7, k25, k26, k27, w8, k28, k29, k30, w9, k31, oVar, i13, i16, i19, i22, (i23 & 112) | (i23 & 14) | (i24 & 896) | (i24 & 7168), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i25;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @C8251n0
    /* renamed from: J */
    public final /* synthetic */ C8189d3 mo12177J(long j, long j2, long j3, long j4, long j5, C2844t tVar, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C8592o oVar2 = oVar;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        oVar2.mo14918M(-595874869);
        long k = (i9 & 1) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14582V(), oVar2, 6) : j;
        long w = (i9 & 2) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long k2 = (i9 & 4) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j3;
        long k3 = (i9 & 8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14591c(), oVar2, 6) : j4;
        long k4 = (i9 & 16) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14611q(), oVar2, 6) : j5;
        C2844t tVar2 = (i9 & 32) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k5 = (i9 & 64) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14568H(), oVar2, 6) : j6;
        long k6 = (i9 & 128) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14587a(), oVar2, 6) : j7;
        long w2 = (i9 & 256) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14599g(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long k7 = (i9 & 512) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14609o(), oVar2, 6) : j9;
        long k8 = (i9 & 1024) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14572L(), oVar2, 6) : j10;
        long k9 = (i9 & 2048) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14592c0(), oVar2, 6) : j11;
        long w3 = (i9 & 4096) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14606l(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long k10 = (i9 & 8192) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14565E(), oVar2, 6) : j13;
        long k11 = (i9 & 16384) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14574N(), oVar2, 6) : j14;
        long k12 = (32768 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14600g0(), oVar2, 6) : j15;
        long w4 = (65536 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14608n(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long k13 = (131072 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14567G(), oVar2, 6) : j17;
        long k14 = (262144 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14571K(), oVar2, 6) : j18;
        long k15 = (524288 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14588a0(), oVar2, 6) : j19;
        long w5 = (1048576 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14605k(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long k16 = (2097152 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14564D(), oVar2, 6) : j21;
        long k17 = (4194304 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j22;
        long w6 = (8388608 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long k18 = (16777216 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14573M(), oVar2, 6) : j24;
        long k19 = (33554432 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14596e0(), oVar2, 6) : j25;
        long w7 = (67108864 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14607m(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j26;
        long k20 = (134217728 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14566F(), oVar2, 6) : j27;
        long k21 = (268435456 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j28;
        long k22 = (536870912 & i9) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j29;
        long w8 = (i9 & 1073741824) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j30;
        long k23 = (i6 & 1) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j31;
        long k24 = (i6 & 2) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j32;
        long k25 = (i6 & 4) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j33;
        long w9 = (i6 & 8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j34;
        long k26 = (i6 & 16) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j35;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-595874869, i7, i8, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1059)");
        }
        int i10 = i7 << 3;
        int i11 = (i7 & 14) | (i10 & 112) | (i10 & 896);
        int i12 = i7 << 9;
        int i13 = i11 | (i12 & 7168) | ((i7 << 6) & 57344) | (i12 & 458752) | ((i7 << 12) & 3670016);
        int i14 = i7 << 15;
        int i15 = i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i7 >> 15;
        int i17 = i8 << 15;
        int i18 = (i16 & 57344) | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i8 >> 15;
        int i20 = i3 << 15;
        int i21 = (i19 & 57344) | (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128);
        int i22 = i3 << 18;
        int i23 = i21 | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = i3 >> 9;
        int i25 = ((i3 >> 6) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016);
        int i26 = i4 << 21;
        int i27 = i25 | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
        int i28 = i4 >> 9;
        C8189d3 i29 = mo12188i(k, k, w, k, k2, k2, k2, k2, k3, k4, tVar2, k5, k6, w2, k7, k8, k9, w3, k10, k11, k12, w4, k13, k14, k15, w5, k16, k17, k17, w6, k17, k18, k19, w7, k20, k21, k22, w8, k23, k24, k25, w9, k26, oVar, i15, i18, i23, i27, (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i29;
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @C11587t0(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @C12579k
    /* renamed from: K */
    public final C2366i0 mo12178K(float f, float f2, float f3, float f4) {
        return mo12189j(f, f2, f3, f4);
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @C11587t0(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @C12579k
    /* renamed from: M */
    public final C2366i0 mo12179M(float f, float f2, float f3, float f4) {
        return mo12190l(f, f2, f3, f4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e3, code lost:
        if ((r27 & 16) != 0) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12180a(boolean r20, boolean r21, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r22, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8189d3 r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r24, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r25, int r26, int r27) {
        /*
            r19 = this;
            r10 = r22
            r11 = r23
            r12 = r26
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 918564008(0x36c02ca8, float:5.7272446E-6)
            r1 = r25
            androidx.compose.runtime.o r13 = r1.mo15009o(r0)
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r12 | 6
            r14 = r20
            goto L_0x0034
        L_0x0022:
            r1 = r12 & 14
            r14 = r20
            if (r1 != 0) goto L_0x0033
            boolean r1 = r13.mo14961b(r14)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r12
            goto L_0x0034
        L_0x0033:
            r1 = r12
        L_0x0034:
            r2 = r27 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            r15 = r21
            goto L_0x004f
        L_0x003d:
            r2 = r12 & 112(0x70, float:1.57E-43)
            r15 = r21
            if (r2 != 0) goto L_0x004f
            boolean r2 = r13.mo14961b(r15)
            if (r2 == 0) goto L_0x004c
            r2 = 32
            goto L_0x004e
        L_0x004c:
            r2 = 16
        L_0x004e:
            r1 = r1 | r2
        L_0x004f:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r2 = r12 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0066
            boolean r2 = r13.mo15006n0(r10)
            if (r2 == 0) goto L_0x0063
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r27 & 8
            if (r2 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r2 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007d
            boolean r2 = r13.mo15006n0(r11)
            if (r2 == 0) goto L_0x007a
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r2
        L_0x007d:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0098
            r2 = r27 & 16
            if (r2 != 0) goto L_0x0092
            r2 = r24
            boolean r3 = r13.mo15006n0(r2)
            if (r3 == 0) goto L_0x0094
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r2 = r24
        L_0x0094:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r1 = r1 | r3
            goto L_0x009a
        L_0x0098:
            r2 = r24
        L_0x009a:
            r3 = r27 & 32
            if (r3 == 0) goto L_0x00a4
            r3 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r3
            r9 = r19
            goto L_0x00b7
        L_0x00a4:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r12
            r9 = r19
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r13.mo15006n0(r9)
            if (r3 == 0) goto L_0x00b4
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r3
        L_0x00b7:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r1
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r4) goto L_0x00cd
            boolean r3 = r13.mo15011p()
            if (r3 != 0) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            r13.mo14958a0()
            r6 = r2
            goto L_0x0154
        L_0x00cd:
            r13.mo14930Q()
            r3 = r12 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x00e6
            boolean r3 = r13.mo14977f0()
            if (r3 == 0) goto L_0x00de
            goto L_0x00e6
        L_0x00de:
            r13.mo14958a0()
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00f2
            goto L_0x00f1
        L_0x00e6:
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00f2
            androidx.compose.material3.TextFieldDefaults r2 = f19839a
            r3 = 6
            androidx.compose.ui.graphics.g4 r2 = r2.mo12197w(r13, r3)
        L_0x00f1:
            r1 = r1 & r4
        L_0x00f2:
            r8 = r2
            r13.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0102
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:95)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0102:
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r23
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r13
            androidx.compose.runtime.k2 r0 = r0.mo12538b(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r0 = r0.mo42833M()
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8824c(r6, r0, r8)
            r6 = 0
            r7 = 0
            r16 = 48
            r17 = 0
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r18 = r8
            r8 = r16
            r9 = r17
            androidx.compose.ui.m r0 = m26591B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.m9839a(r0, r13, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0152
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0152:
            r6 = r18
        L_0x0154:
            androidx.compose.runtime.t1 r9 = r13.mo15020s()
            if (r9 != 0) goto L_0x015b
            goto L_0x0172
        L_0x015b:
            androidx.compose.material3.TextFieldDefaults$ContainerBox$1 r13 = new androidx.compose.material3.TextFieldDefaults$ContainerBox$1
            r0 = r13
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r13)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12180a(boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material3.d3, androidx.compose.ui.graphics.g4, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01d2, code lost:
        if (r8.mo15006n0(r134) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013c  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12181b(@org.jetbrains.annotations.C12579k java.lang.String r120, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r121, boolean r122, boolean r123, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r124, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r125, boolean r126, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r127, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r128, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r129, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r130, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r131, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r132, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r133, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r134, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8189d3 r135, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r136, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r137, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r138, int r139, int r140, int r141) {
        /*
            r119 = this;
            r15 = r120
            r14 = r121
            r13 = r124
            r12 = r125
            r11 = r139
            r10 = r140
            r9 = r141
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 289640444(0x11438ffc, float:1.5427156E-28)
            r1 = r138
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
            r3 = r122
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
            r3 = r122
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
            r1 = r123
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
            r1 = r123
        L_0x0097:
            r16 = r9 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00a3
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b4
        L_0x00a3:
            r16 = r11 & r110
            if (r16 != 0) goto L_0x00b4
            boolean r16 = r8.mo15006n0(r13)
            if (r16 == 0) goto L_0x00b0
            r16 = r19
            goto L_0x00b2
        L_0x00b0:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00b2:
            r0 = r0 | r16
        L_0x00b4:
            r16 = r9 & 32
            r111 = 458752(0x70000, float:6.42848E-40)
            r112 = 65536(0x10000, float:9.18355E-41)
            if (r16 == 0) goto L_0x00c1
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00be:
            r0 = r0 | r16
            goto L_0x00d1
        L_0x00c1:
            r16 = r11 & r111
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r8.mo15006n0(r12)
            if (r16 == 0) goto L_0x00ce
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00ce:
            r16 = r112
            goto L_0x00be
        L_0x00d1:
            r16 = r9 & 64
            r113 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00de
            r20 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r20
            r2 = r126
            goto L_0x00f1
        L_0x00de:
            r20 = r11 & r113
            r2 = r126
            if (r20 != 0) goto L_0x00f1
            boolean r21 = r8.mo14961b(r2)
            if (r21 == 0) goto L_0x00ed
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ef
        L_0x00ed:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ef:
            r0 = r0 | r21
        L_0x00f1:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r114 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x00fe
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r22
            r5 = r127
            goto L_0x0111
        L_0x00fe:
            r22 = r11 & r114
            r5 = r127
            if (r22 != 0) goto L_0x0111
            boolean r23 = r8.mo14927P(r5)
            if (r23 == 0) goto L_0x010d
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010f
        L_0x010d:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x010f:
            r0 = r0 | r23
        L_0x0111:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x011c
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r24
            r7 = r128
            goto L_0x0131
        L_0x011c:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r11 & r24
            r7 = r128
            if (r24 != 0) goto L_0x0131
            boolean r25 = r8.mo14927P(r7)
            if (r25 == 0) goto L_0x012d
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012f
        L_0x012d:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012f:
            r0 = r0 | r25
        L_0x0131:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x013c
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r25
            r2 = r129
            goto L_0x0151
        L_0x013c:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r11 & r25
            r2 = r129
            if (r25 != 0) goto L_0x0151
            boolean r25 = r8.mo14927P(r2)
            if (r25 == 0) goto L_0x014d
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014f
        L_0x014d:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014f:
            r0 = r0 | r25
        L_0x0151:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015a
            r20 = r10 | 6
            r3 = r130
            goto L_0x0170
        L_0x015a:
            r25 = r10 & 14
            r3 = r130
            if (r25 != 0) goto L_0x016e
            boolean r25 = r8.mo14927P(r3)
            if (r25 == 0) goto L_0x0169
            r20 = 4
            goto L_0x016b
        L_0x0169:
            r20 = 2
        L_0x016b:
            r20 = r10 | r20
            goto L_0x0170
        L_0x016e:
            r20 = r10
        L_0x0170:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0177
            r20 = r20 | 48
            goto L_0x018a
        L_0x0177:
            r25 = r10 & 112(0x70, float:1.57E-43)
            r5 = r131
            if (r25 != 0) goto L_0x018a
            boolean r25 = r8.mo14927P(r5)
            if (r25 == 0) goto L_0x0186
            r21 = 32
            goto L_0x0188
        L_0x0186:
            r21 = 16
        L_0x0188:
            r20 = r20 | r21
        L_0x018a:
            r5 = r20
            r7 = r9 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0193
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a7
        L_0x0193:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01a7
            r12 = r132
            boolean r20 = r8.mo14927P(r12)
            if (r20 == 0) goto L_0x01a2
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x01a4
        L_0x01a2:
            r23 = 128(0x80, float:1.794E-43)
        L_0x01a4:
            r5 = r5 | r23
            goto L_0x01a9
        L_0x01a7:
            r12 = r132
        L_0x01a9:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b0
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c2
        L_0x01b0:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c2
            r13 = r133
            boolean r20 = r8.mo14927P(r13)
            if (r20 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r17 = r18
        L_0x01bf:
            r5 = r5 | r17
            goto L_0x01c4
        L_0x01c2:
            r13 = r133
        L_0x01c4:
            r17 = r10 & r110
            if (r17 != 0) goto L_0x01dc
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01d5
            r13 = r134
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d5:
            r13 = r134
        L_0x01d7:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01d9:
            r5 = r5 | r19
            goto L_0x01de
        L_0x01dc:
            r13 = r134
        L_0x01de:
            r17 = r10 & r111
            if (r17 != 0) goto L_0x01f9
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            r13 = r135
            if (r17 != 0) goto L_0x01f4
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x01f4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f6
        L_0x01f4:
            r17 = r112
        L_0x01f6:
            r5 = r5 | r17
            goto L_0x01fb
        L_0x01f9:
            r13 = r135
        L_0x01fb:
            r17 = r10 & r113
            if (r17 != 0) goto L_0x0213
            r17 = r9 & r112
            r13 = r136
            if (r17 != 0) goto L_0x020e
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x020e
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0210
        L_0x020e:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0210:
            r5 = r5 | r17
            goto L_0x0215
        L_0x0213:
            r13 = r136
        L_0x0215:
            r17 = 131072(0x20000, float:1.83671E-40)
            r115 = r9 & r17
            if (r115 == 0) goto L_0x0222
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r13 = r137
            goto L_0x0235
        L_0x0222:
            r17 = r10 & r114
            r13 = r137
            if (r17 != 0) goto L_0x0235
            boolean r17 = r8.mo14927P(r13)
            if (r17 == 0) goto L_0x0231
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0233
        L_0x0231:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0233:
            r5 = r5 | r17
        L_0x0235:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x0242
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r17
            r15 = r119
            goto L_0x0257
        L_0x0242:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            r15 = r119
            if (r17 != 0) goto L_0x0257
            boolean r17 = r8.mo15006n0(r15)
            if (r17 == 0) goto L_0x0253
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0255
        L_0x0253:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0255:
            r5 = r5 | r17
        L_0x0257:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0290
            r10 = 191739611(0xb6db6db, float:4.5782105E-32)
            r10 = r10 & r5
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r10 != r13) goto L_0x0290
            boolean r10 = r8.mo15011p()
            if (r10 != 0) goto L_0x0271
            goto L_0x0290
        L_0x0271:
            r8.mo14958a0()
            r9 = r127
            r10 = r128
            r11 = r129
            r12 = r130
            r13 = r131
            r14 = r132
            r15 = r133
            r16 = r134
            r17 = r135
            r18 = r136
            r19 = r137
            r33 = r8
            r8 = r126
            goto L_0x04de
        L_0x0290:
            r8.mo14930Q()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x02d5
            boolean r10 = r8.mo14977f0()
            if (r10 == 0) goto L_0x029e
            goto L_0x02d5
        L_0x029e:
            r8.mo14958a0()
            r1 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02a9
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x02a9:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x02b3
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r1
        L_0x02b3:
            r1 = r9 & r112
            if (r1 == 0) goto L_0x02bb
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x02bb:
            r22 = r126
            r23 = r127
            r24 = r128
            r116 = r129
            r25 = r130
            r26 = r131
            r27 = r132
            r28 = r133
            r29 = r134
            r30 = r135
            r31 = r136
            r32 = r137
            goto L_0x0436
        L_0x02d5:
            if (r16 == 0) goto L_0x02d9
            r10 = 0
            goto L_0x02db
        L_0x02d9:
            r10 = r126
        L_0x02db:
            r16 = 0
            if (r4 == 0) goto L_0x02e2
            r4 = r16
            goto L_0x02e4
        L_0x02e2:
            r4 = r127
        L_0x02e4:
            if (r6 == 0) goto L_0x02e9
            r6 = r16
            goto L_0x02eb
        L_0x02e9:
            r6 = r128
        L_0x02eb:
            if (r1 == 0) goto L_0x02f0
            r1 = r16
            goto L_0x02f2
        L_0x02f0:
            r1 = r129
        L_0x02f2:
            if (r2 == 0) goto L_0x02f7
            r2 = r16
            goto L_0x02f9
        L_0x02f7:
            r2 = r130
        L_0x02f9:
            if (r3 == 0) goto L_0x02fe
            r3 = r16
            goto L_0x0300
        L_0x02fe:
            r3 = r131
        L_0x0300:
            if (r7 == 0) goto L_0x0305
            r7 = r16
            goto L_0x0307
        L_0x0305:
            r7 = r132
        L_0x0307:
            if (r12 == 0) goto L_0x030c
            r12 = r16
            goto L_0x030e
        L_0x030c:
            r12 = r133
        L_0x030e:
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0320
            androidx.compose.material3.TextFieldDefaults r13 = f19839a
            r116 = r1
            r1 = 6
            androidx.compose.ui.graphics.g4 r13 = r13.mo12197w(r8, r1)
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
            goto L_0x0324
        L_0x0320:
            r116 = r1
            r13 = r134
        L_0x0324:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x03a1
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
            int r1 = r5 >> 15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r107 = r1
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r119
            r102 = r8
            androidx.compose.material3.d3 r1 = r16.mo12188i(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r16
            goto L_0x03a3
        L_0x03a1:
            r1 = r135
        L_0x03a3:
            r16 = r9 & r112
            if (r16 == 0) goto L_0x03ec
            if (r4 != 0) goto L_0x03c8
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r126 = r119
            r127 = r16
            r128 = r17
            r129 = r18
            r130 = r19
            r131 = r20
            r132 = r21
            androidx.compose.foundation.layout.i0 r16 = m26597m(r126, r127, r128, r129, r130, r131, r132)
            goto L_0x03e6
        L_0x03c8:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r126 = r119
            r127 = r16
            r128 = r17
            r129 = r18
            r130 = r19
            r131 = r20
            r132 = r21
            androidx.compose.foundation.layout.i0 r16 = m26596k(r126, r127, r128, r129, r130, r131, r132)
        L_0x03e6:
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r17
            goto L_0x03ee
        L_0x03ec:
            r16 = r136
        L_0x03ee:
            if (r115 == 0) goto L_0x041a
            r17 = r2
            androidx.compose.material3.TextFieldDefaults$DecorationBox$1 r2 = new androidx.compose.material3.TextFieldDefaults$DecorationBox$1
            r126 = r2
            r127 = r122
            r128 = r10
            r129 = r125
            r130 = r1
            r131 = r13
            r132 = r0
            r133 = r5
            r126.<init>(r127, r128, r129, r130, r131, r132, r133)
            r126 = r1
            r1 = -435523791(0xffffffffe60a6f31, float:-1.6343442E23)
            r127 = r3
            r3 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r1, r3, r2)
            r30 = r126
            r26 = r127
            r32 = r1
            goto L_0x0426
        L_0x041a:
            r126 = r1
            r17 = r2
            r127 = r3
            r30 = r126
            r26 = r127
            r32 = r137
        L_0x0426:
            r23 = r4
            r24 = r6
            r27 = r7
            r22 = r10
            r28 = r12
            r29 = r13
            r31 = r16
            r25 = r17
        L_0x0436:
            r8.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0447
            r1 = 289640444(0x11438ffc, float:1.5427156E-28)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:410)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r5, r2)
        L_0x0447:
            androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Filled
            r2 = r0
            r0 = r1
            int r1 = r2 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r4 = 6
            r3 = r3 | r4
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
            r6 = r4 & r113
            r1 = r1 | r6
            int r6 = r5 << 21
            r7 = r6 & r114
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
            int r2 = r5 >> 3
            r2 = r2 & r111
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & r113
            r1 = r1 | r2
            r2 = r5 & r114
            r20 = r1 | r2
            r21 = 0
            r1 = r120
            r2 = r121
            r3 = r124
            r4 = r23
            r5 = r24
            r6 = r116
            r7 = r25
            r33 = r8
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r123
            r12 = r122
            r13 = r22
            r14 = r125
            r15 = r31
            r16 = r30
            r17 = r32
            r18 = r33
            androidx.compose.material3.TextFieldImplKt.m26633a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x04c6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04c6:
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r11 = r116
        L_0x04de:
            androidx.compose.runtime.t1 r7 = r33.mo15020s()
            if (r7 != 0) goto L_0x04e5
            goto L_0x050a
        L_0x04e5:
            androidx.compose.material3.TextFieldDefaults$DecorationBox$2 r6 = new androidx.compose.material3.TextFieldDefaults$DecorationBox$2
            r0 = r6
            r1 = r119
            r2 = r120
            r3 = r121
            r4 = r122
            r5 = r123
            r117 = r6
            r6 = r124
            r118 = r7
            r7 = r125
            r20 = r139
            r21 = r140
            r22 = r141
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r117
            r0 = r118
            r0.mo15202a(r1)
        L_0x050a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12181b(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.d3, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e4, code lost:
        if ((r25 & 16) != 0) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012b  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28049a, message = "Renamed to `TextFieldDefaults.ContainerBox`", replaceWith = @kotlin.C11587t0(expression = "TextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n    )", imports = {}))
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12182c(boolean r18, boolean r19, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r20, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8189d3 r21, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r17 = this;
            r9 = r20
            r10 = r21
            r11 = r24
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1358797526(0xffffffffaf02652a, float:-1.1859372E-10)
            r1 = r23
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r11 | 6
            r13 = r18
            goto L_0x0034
        L_0x0022:
            r1 = r11 & 14
            r13 = r18
            if (r1 != 0) goto L_0x0033
            boolean r1 = r12.mo14961b(r13)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r11
            goto L_0x0034
        L_0x0033:
            r1 = r11
        L_0x0034:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            r14 = r19
            goto L_0x004f
        L_0x003d:
            r2 = r11 & 112(0x70, float:1.57E-43)
            r14 = r19
            if (r2 != 0) goto L_0x004f
            boolean r2 = r12.mo14961b(r14)
            if (r2 == 0) goto L_0x004c
            r2 = 32
            goto L_0x004e
        L_0x004c:
            r2 = 16
        L_0x004e:
            r1 = r1 | r2
        L_0x004f:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0066
            boolean r2 = r12.mo15006n0(r9)
            if (r2 == 0) goto L_0x0063
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r25 & 8
            if (r2 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007d
            boolean r2 = r12.mo15006n0(r10)
            if (r2 == 0) goto L_0x007a
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r2
        L_0x007d:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r11 & r2
            if (r3 != 0) goto L_0x0099
            r3 = r25 & 16
            if (r3 != 0) goto L_0x0093
            r3 = r22
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x0095
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r3 = r22
        L_0x0095:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r4
            goto L_0x009b
        L_0x0099:
            r3 = r22
        L_0x009b:
            r4 = r25 & 32
            r5 = 458752(0x70000, float:6.42848E-40)
            if (r4 == 0) goto L_0x00a7
            r4 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r4
            r15 = r17
            goto L_0x00b9
        L_0x00a7:
            r4 = r11 & r5
            r15 = r17
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r12.mo15006n0(r15)
            if (r4 == 0) goto L_0x00b6
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r4
        L_0x00b9:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r1
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r6) goto L_0x00ce
            boolean r4 = r12.mo15011p()
            if (r4 != 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            r12.mo14958a0()
            r6 = r3
            goto L_0x0130
        L_0x00ce:
            r12.mo14930Q()
            r4 = r11 & 1
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00e7
            boolean r4 = r12.mo14977f0()
            if (r4 == 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            r12.mo14958a0()
            r4 = r25 & 16
            if (r4 == 0) goto L_0x00f3
            goto L_0x00f2
        L_0x00e7:
            r4 = r25 & 16
            if (r4 == 0) goto L_0x00f3
            androidx.compose.material3.TextFieldDefaults r3 = f19839a
            r4 = 6
            androidx.compose.ui.graphics.g4 r3 = r3.mo12197w(r12, r4)
        L_0x00f2:
            r1 = r1 & r6
        L_0x00f3:
            r16 = r3
            r12.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0104
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:503)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r4)
        L_0x0104:
            r0 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r5
            r7 = r0 | r1
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r16
            r6 = r12
            r0.mo12180a(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x012e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x012e:
            r6 = r16
        L_0x0130:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x0137
            goto L_0x014f
        L_0x0137:
            androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1 r8 = new androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r7 = r24
            r9 = r8
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.mo15202a(r9)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12182c(boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material3.d3, androidx.compose.ui.graphics.g4, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0180  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28049a, message = "Renamed to `OutlinedTextFieldDefaults.ContainerBox`", replaceWith = @kotlin.C11587t0(expression = "OutlinedTextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n        focusedBorderThickness = focusedBorderThickness,\n        unfocusedBorderThickness = unfocusedBorderThickness,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12183d(boolean r21, boolean r22, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r23, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8189d3 r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r25, float r26, float r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r20 = this;
            r11 = r23
            r12 = r24
            r13 = r29
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1998946250(0xffffffff88da8036, float:-1.315054E-33)
            r1 = r28
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            r15 = r21
            goto L_0x0034
        L_0x0022:
            r1 = r13 & 14
            r15 = r21
            if (r1 != 0) goto L_0x0033
            boolean r1 = r14.mo14961b(r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            r10 = r22
            goto L_0x004f
        L_0x003d:
            r2 = r13 & 112(0x70, float:1.57E-43)
            r10 = r22
            if (r2 != 0) goto L_0x004f
            boolean r2 = r14.mo14961b(r10)
            if (r2 == 0) goto L_0x004c
            r2 = 32
            goto L_0x004e
        L_0x004c:
            r2 = 16
        L_0x004e:
            r1 = r1 | r2
        L_0x004f:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0066
            boolean r2 = r14.mo15006n0(r11)
            if (r2 == 0) goto L_0x0063
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r30 & 8
            if (r2 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007d
            boolean r2 = r14.mo15006n0(r12)
            if (r2 == 0) goto L_0x007a
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r2
        L_0x007d:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r13 & r2
            if (r3 != 0) goto L_0x0099
            r3 = r30 & 16
            if (r3 != 0) goto L_0x0093
            r3 = r25
            boolean r4 = r14.mo15006n0(r3)
            if (r4 == 0) goto L_0x0095
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r3 = r25
        L_0x0095:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r4
            goto L_0x009b
        L_0x0099:
            r3 = r25
        L_0x009b:
            r4 = r30 & 32
            r5 = 458752(0x70000, float:6.42848E-40)
            if (r4 == 0) goto L_0x00a5
            r6 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r6
            goto L_0x00b8
        L_0x00a5:
            r6 = r13 & r5
            if (r6 != 0) goto L_0x00b8
            r6 = r26
            boolean r7 = r14.mo14968d(r6)
            if (r7 == 0) goto L_0x00b4
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r7
            goto L_0x00ba
        L_0x00b8:
            r6 = r26
        L_0x00ba:
            r7 = r30 & 64
            r8 = 3670016(0x380000, float:5.142788E-39)
            if (r7 == 0) goto L_0x00c4
            r9 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r9
            goto L_0x00d8
        L_0x00c4:
            r9 = r13 & r8
            if (r9 != 0) goto L_0x00d8
            r9 = r27
            boolean r16 = r14.mo14968d(r9)
            if (r16 == 0) goto L_0x00d3
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r16
            goto L_0x00da
        L_0x00d8:
            r9 = r27
        L_0x00da:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r1 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r5) goto L_0x00f3
            boolean r5 = r14.mo15011p()
            if (r5 != 0) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r14.mo14958a0()
            r7 = r6
            r8 = r9
            r6 = r3
            goto L_0x0189
        L_0x00f3:
            r14.mo14930Q()
            r5 = r13 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x0113
            boolean r5 = r14.mo14977f0()
            if (r5 == 0) goto L_0x0104
            goto L_0x0113
        L_0x0104:
            r14.mo14958a0()
            r4 = r30 & 16
            if (r4 == 0) goto L_0x010c
            r1 = r1 & r8
        L_0x010c:
            r17 = r3
            r18 = r6
            r19 = r9
            goto L_0x013a
        L_0x0113:
            r5 = r30 & 16
            if (r5 == 0) goto L_0x0123
            androidx.compose.material3.tokens.o0 r3 = androidx.compose.material3.tokens.C8329o0.f21814a
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.mo14179c()
            r5 = 6
            androidx.compose.ui.graphics.g4 r3 = androidx.compose.material3.ShapesKt.m26127f(r3, r14, r5)
            r1 = r1 & r8
        L_0x0123:
            if (r4 == 0) goto L_0x012c
            androidx.compose.material3.OutlinedTextFieldDefaults r4 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            float r4 = r4.mo11748f()
            r6 = r4
        L_0x012c:
            if (r7 == 0) goto L_0x010c
            androidx.compose.material3.OutlinedTextFieldDefaults r4 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            float r4 = r4.mo11752j()
            r17 = r3
            r19 = r4
            r18 = r6
        L_0x013a:
            r14.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0149
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:533)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r4)
        L_0x0149:
            androidx.compose.material3.OutlinedTextFieldDefaults r0 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r1 & 14
            r3 = r3 | r4
            r4 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r2 = r2 & r1
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r9 = r2 | r1
            r16 = 0
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r14
            r10 = r16
            r0.mo11744a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0183
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0183:
            r6 = r17
            r7 = r18
            r8 = r19
        L_0x0189:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x0190
            goto L_0x01a8
        L_0x0190:
            androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1 r10 = new androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1
            r0 = r10
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r9 = r29
            r11 = r10
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo15202a(r11)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12183d(boolean, boolean, androidx.compose.foundation.interaction.e, androidx.compose.material3.d3, androidx.compose.ui.graphics.g4, float, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01b6, code lost:
        if (r6.mo15006n0(r129) != false) goto L_0x01bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo12184e(java.lang.String r116, kotlin.jvm.functions.C11304p r117, boolean r118, boolean r119, androidx.compose.p004ui.text.input.C16275a1 r120, androidx.compose.foundation.interaction.C2241e r121, boolean r122, kotlin.jvm.functions.C11304p r123, kotlin.jvm.functions.C11304p r124, kotlin.jvm.functions.C11304p r125, kotlin.jvm.functions.C11304p r126, kotlin.jvm.functions.C11304p r127, androidx.compose.material3.C8189d3 r128, androidx.compose.foundation.layout.C2366i0 r129, kotlin.jvm.functions.C11304p r130, androidx.compose.runtime.C8592o r131, int r132, int r133, int r134) {
        /*
            r115 = this;
            r15 = r116
            r14 = r117
            r11 = r120
            r10 = r121
            r9 = r132
            r8 = r133
            r7 = r134
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 508645792(0x1e5151a0, float:1.10812475E-20)
            r1 = r131
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0032
            r1 = r9 | 6
            goto L_0x0042
        L_0x0032:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0041
            boolean r1 = r6.mo15006n0(r15)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r9
            goto L_0x0042
        L_0x0041:
            r1 = r9
        L_0x0042:
            r4 = r7 & 2
            if (r4 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0059
        L_0x0049:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0059
            boolean r4 = r6.mo14927P(r14)
            if (r4 == 0) goto L_0x0056
            r4 = 32
            goto L_0x0058
        L_0x0056:
            r4 = 16
        L_0x0058:
            r1 = r1 | r4
        L_0x0059:
            r4 = r7 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0062
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0062:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0076
            r4 = r118
            boolean r17 = r6.mo14961b(r4)
            if (r17 == 0) goto L_0x0071
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r17 = r16
        L_0x0073:
            r1 = r1 | r17
            goto L_0x0078
        L_0x0076:
            r4 = r118
        L_0x0078:
            r17 = r7 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0083
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0097
        L_0x0083:
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0097
            r2 = r119
            boolean r17 = r6.mo14961b(r2)
            if (r17 == 0) goto L_0x0092
            r17 = r18
            goto L_0x0094
        L_0x0092:
            r17 = r19
        L_0x0094:
            r1 = r1 | r17
            goto L_0x0099
        L_0x0097:
            r2 = r119
        L_0x0099:
            r17 = r7 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r110 = 57344(0xe000, float:8.0356E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r17 == 0) goto L_0x00a7
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b8
        L_0x00a7:
            r17 = r9 & r110
            if (r17 != 0) goto L_0x00b8
            boolean r17 = r6.mo15006n0(r11)
            if (r17 == 0) goto L_0x00b4
            r17 = r20
            goto L_0x00b6
        L_0x00b4:
            r17 = r21
        L_0x00b6:
            r1 = r1 | r17
        L_0x00b8:
            r17 = r7 & 32
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00c3
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00c0:
            r1 = r1 | r17
            goto L_0x00d3
        L_0x00c3:
            r17 = r9 & r111
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r6.mo15006n0(r10)
            if (r17 == 0) goto L_0x00d0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00d0:
            r17 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c0
        L_0x00d3:
            r17 = r7 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00e0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r22
            r3 = r122
            goto L_0x00f3
        L_0x00e0:
            r22 = r9 & r112
            r3 = r122
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r6.mo14961b(r3)
            if (r23 == 0) goto L_0x00ef
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r1 = r1 | r23
        L_0x00f3:
            r5 = r7 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00fe
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r24
            r12 = r123
            goto L_0x0113
        L_0x00fe:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r9 & r24
            r12 = r123
            if (r24 != 0) goto L_0x0113
            boolean r25 = r6.mo14927P(r12)
            if (r25 == 0) goto L_0x010f
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r1 = r1 | r25
        L_0x0113:
            r13 = r7 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x011e
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r26
            r0 = r124
            goto L_0x0133
        L_0x011e:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r9 & r26
            r0 = r124
            if (r26 != 0) goto L_0x0133
            boolean r26 = r6.mo14927P(r0)
            if (r26 == 0) goto L_0x012f
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r1 = r1 | r26
        L_0x0133:
            r0 = r7 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x013e
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r26
            r2 = r125
            goto L_0x0153
        L_0x013e:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r9 & r26
            r2 = r125
            if (r26 != 0) goto L_0x0153
            boolean r26 = r6.mo14927P(r2)
            if (r26 == 0) goto L_0x014f
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r1 = r1 | r26
        L_0x0153:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015c
            r22 = r8 | 6
            r3 = r126
            goto L_0x0172
        L_0x015c:
            r26 = r8 & 14
            r3 = r126
            if (r26 != 0) goto L_0x0170
            boolean r26 = r6.mo14927P(r3)
            if (r26 == 0) goto L_0x016b
            r22 = 4
            goto L_0x016d
        L_0x016b:
            r22 = 2
        L_0x016d:
            r22 = r8 | r22
            goto L_0x0172
        L_0x0170:
            r22 = r8
        L_0x0172:
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x017b
            r22 = r22 | 48
            r4 = r127
            goto L_0x018e
        L_0x017b:
            r26 = r8 & 112(0x70, float:1.57E-43)
            r4 = r127
            if (r26 != 0) goto L_0x018e
            boolean r26 = r6.mo14927P(r4)
            if (r26 == 0) goto L_0x018a
            r23 = 32
            goto L_0x018c
        L_0x018a:
            r23 = 16
        L_0x018c:
            r22 = r22 | r23
        L_0x018e:
            r4 = r8 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x01a6
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x01a1
            r4 = r128
            boolean r23 = r6.mo15006n0(r4)
            if (r23 == 0) goto L_0x01a3
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x01a3
        L_0x01a1:
            r4 = r128
        L_0x01a3:
            r22 = r22 | r16
            goto L_0x01a8
        L_0x01a6:
            r4 = r128
        L_0x01a8:
            r4 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x01c0
            r4 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r4 != 0) goto L_0x01b9
            r4 = r129
            boolean r16 = r6.mo15006n0(r4)
            if (r16 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01b9:
            r4 = r129
        L_0x01bb:
            r18 = r19
        L_0x01bd:
            r22 = r22 | r18
            goto L_0x01c2
        L_0x01c0:
            r4 = r129
        L_0x01c2:
            r4 = r22
            r10 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01cd
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r8 = r130
            goto L_0x01de
        L_0x01cd:
            r16 = r8 & r110
            r8 = r130
            if (r16 != 0) goto L_0x01de
            boolean r16 = r6.mo14927P(r8)
            if (r16 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r20 = r21
        L_0x01dc:
            r4 = r4 | r20
        L_0x01de:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r1 & r16
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r11) goto L_0x020f
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r4
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r11) goto L_0x020f
            boolean r8 = r6.mo15011p()
            if (r8 != 0) goto L_0x01f7
            goto L_0x020f
        L_0x01f7:
            r6.mo14958a0()
            r8 = r122
            r10 = r124
            r11 = r125
            r13 = r127
            r14 = r128
            r15 = r129
            r16 = r130
            r31 = r6
            r9 = r12
            r12 = r126
            goto L_0x03cb
        L_0x020f:
            r6.mo14930Q()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x0240
            boolean r8 = r6.mo14977f0()
            if (r8 == 0) goto L_0x021d
            goto L_0x0240
        L_0x021d:
            r6.mo14958a0()
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0226
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0226:
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x022c
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x022c:
            r22 = r122
            r24 = r124
            r25 = r125
            r26 = r126
            r27 = r127
            r28 = r128
            r29 = r129
            r30 = r130
            r23 = r12
            goto L_0x033e
        L_0x0240:
            if (r17 == 0) goto L_0x0244
            r8 = 0
            goto L_0x0246
        L_0x0244:
            r8 = r122
        L_0x0246:
            r11 = 0
            if (r5 == 0) goto L_0x024a
            r12 = r11
        L_0x024a:
            if (r13 == 0) goto L_0x024e
            r5 = r11
            goto L_0x0250
        L_0x024e:
            r5 = r124
        L_0x0250:
            if (r0 == 0) goto L_0x0254
            r0 = r11
            goto L_0x0256
        L_0x0254:
            r0 = r125
        L_0x0256:
            if (r2 == 0) goto L_0x025a
            r2 = r11
            goto L_0x025c
        L_0x025a:
            r2 = r126
        L_0x025c:
            if (r3 == 0) goto L_0x025f
            goto L_0x0261
        L_0x025f:
            r11 = r127
        L_0x0261:
            r3 = r7 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x02d5
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
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
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r6
            androidx.compose.material3.d3 r3 = r16.mo11746c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02d7
        L_0x02d5:
            r3 = r128
        L_0x02d7:
            r13 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x02fe
            androidx.compose.material3.OutlinedTextFieldDefaults r13 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r122 = r13
            r123 = r16
            r124 = r17
            r125 = r18
            r126 = r19
            r127 = r20
            r128 = r21
            androidx.compose.foundation.layout.i0 r13 = androidx.compose.material3.OutlinedTextFieldDefaults.m25983e(r122, r123, r124, r125, r126, r127, r128)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0300
        L_0x02fe:
            r13 = r129
        L_0x0300:
            if (r10 == 0) goto L_0x0328
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$3 r10 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$3
            r122 = r10
            r123 = r118
            r124 = r8
            r125 = r121
            r126 = r3
            r127 = r1
            r128 = r4
            r122.<init>(r123, r124, r125, r126, r127, r128)
            r122 = r0
            r0 = 144282315(0x89992cb, float:9.242863E-34)
            r123 = r2
            r2 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r6, r0, r2, r10)
            r25 = r122
            r26 = r123
            r30 = r0
            goto L_0x0332
        L_0x0328:
            r122 = r0
            r123 = r2
            r25 = r122
            r26 = r123
            r30 = r130
        L_0x0332:
            r28 = r3
            r24 = r5
            r22 = r8
            r27 = r11
            r23 = r12
            r29 = r13
        L_0x033e:
            r6.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x034f
            java.lang.String r0 = "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1299)"
            r2 = 508645792(0x1e5151a0, float:1.10812475E-20)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r4, r0)
        L_0x034f:
            androidx.compose.material3.OutlinedTextFieldDefaults r0 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            r12 = 0
            r13 = 0
            r2 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = r1 & r110
            r2 = r2 | r3
            r3 = r1 & r111
            r2 = r2 | r3
            r3 = r1 & r112
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r19 = r2 | r1
            r1 = 12583344(0xc001b0, float:1.763302E-38)
            r2 = r4 & 14
            r1 = r1 | r2
            int r2 = r4 << 6
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            r3 = r2 & r110
            r1 = r1 | r3
            r3 = r2 & r111
            r1 = r1 | r3
            r2 = r2 & r112
            r20 = r1 | r2
            r21 = 0
            r1 = r116
            r2 = r117
            r3 = r118
            r4 = r119
            r5 = r120
            r31 = r6
            r6 = r121
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r0.mo11745b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03b9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03b9:
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
        L_0x03cb:
            androidx.compose.runtime.t1 r7 = r31.mo15020s()
            if (r7 != 0) goto L_0x03d2
            goto L_0x03f7
        L_0x03d2:
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$4 r6 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$4
            r0 = r6
            r1 = r115
            r2 = r116
            r3 = r117
            r4 = r118
            r5 = r119
            r113 = r6
            r6 = r120
            r114 = r7
            r7 = r121
            r17 = r132
            r18 = r133
            r19 = r134
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r113
            r0 = r114
            r0.mo15202a(r1)
        L_0x03f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12184e(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material3.d3, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0140  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28049a, message = "Renamed to `OutlinedTextFieldDefaults.DecorationBox`", replaceWith = @kotlin.C11587t0(expression = "OutlinedTextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12185f(@org.jetbrains.annotations.C12579k java.lang.String r118, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r119, boolean r120, boolean r121, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r122, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r123, boolean r124, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r125, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r126, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r127, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r128, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r129, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r130, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r131, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8189d3 r132, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r133, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r134, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r135, int r136, int r137, int r138) {
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
            r0 = -789275592(0xffffffffd0f49c38, float:-3.28310292E10)
            r1 = r135
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
            r4 = r120
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
            r4 = r120
        L_0x0078:
            r17 = r9 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0083
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0097
        L_0x0083:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0097
            r2 = r121
            boolean r17 = r8.mo14961b(r2)
            if (r17 == 0) goto L_0x0092
            r17 = r18
            goto L_0x0094
        L_0x0092:
            r17 = r19
        L_0x0094:
            r1 = r1 | r17
            goto L_0x0099
        L_0x0097:
            r2 = r121
        L_0x0099:
            r17 = r9 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r110 = 57344(0xe000, float:8.0356E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r17 == 0) goto L_0x00a7
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b8
        L_0x00a7:
            r17 = r11 & r110
            if (r17 != 0) goto L_0x00b8
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x00b4
            r17 = r21
            goto L_0x00b6
        L_0x00b4:
            r17 = r20
        L_0x00b6:
            r1 = r1 | r17
        L_0x00b8:
            r17 = r9 & 32
            r22 = 65536(0x10000, float:9.18355E-41)
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00c5
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00c2:
            r1 = r1 | r17
            goto L_0x00d5
        L_0x00c5:
            r17 = r11 & r111
            if (r17 != 0) goto L_0x00d5
            boolean r17 = r8.mo15006n0(r12)
            if (r17 == 0) goto L_0x00d2
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00d2:
            r17 = r22
            goto L_0x00c2
        L_0x00d5:
            r17 = r9 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00e2
            r23 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r23
            r3 = r124
            goto L_0x00f5
        L_0x00e2:
            r23 = r11 & r112
            r3 = r124
            if (r23 != 0) goto L_0x00f5
            boolean r24 = r8.mo14961b(r3)
            if (r24 == 0) goto L_0x00f1
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f3
        L_0x00f1:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00f3:
            r1 = r1 | r24
        L_0x00f5:
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0100
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r25
            r6 = r125
            goto L_0x0115
        L_0x0100:
            r25 = 29360128(0x1c00000, float:7.052966E-38)
            r25 = r11 & r25
            r6 = r125
            if (r25 != 0) goto L_0x0115
            boolean r26 = r8.mo14927P(r6)
            if (r26 == 0) goto L_0x0111
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0113
        L_0x0111:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x0113:
            r1 = r1 | r26
        L_0x0115:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0120
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r27
            r0 = r126
            goto L_0x0135
        L_0x0120:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r11 & r27
            r0 = r126
            if (r27 != 0) goto L_0x0135
            boolean r27 = r8.mo14927P(r0)
            if (r27 == 0) goto L_0x0131
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0133
        L_0x0131:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0133:
            r1 = r1 | r27
        L_0x0135:
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0140
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            r2 = r127
            goto L_0x0155
        L_0x0140:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r11 & r27
            r2 = r127
            if (r27 != 0) goto L_0x0155
            boolean r27 = r8.mo14927P(r2)
            if (r27 == 0) goto L_0x0151
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0153
        L_0x0151:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0153:
            r1 = r1 | r27
        L_0x0155:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015e
            r23 = r10 | 6
            r3 = r128
            goto L_0x0174
        L_0x015e:
            r27 = r10 & 14
            r3 = r128
            if (r27 != 0) goto L_0x0172
            boolean r27 = r8.mo14927P(r3)
            if (r27 == 0) goto L_0x016d
            r23 = 4
            goto L_0x016f
        L_0x016d:
            r23 = 2
        L_0x016f:
            r23 = r10 | r23
            goto L_0x0174
        L_0x0172:
            r23 = r10
        L_0x0174:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x017b
            r23 = r23 | 48
            goto L_0x018e
        L_0x017b:
            r27 = r10 & 112(0x70, float:1.57E-43)
            r4 = r129
            if (r27 != 0) goto L_0x018e
            boolean r27 = r8.mo14927P(r4)
            if (r27 == 0) goto L_0x018a
            r24 = 32
            goto L_0x018c
        L_0x018a:
            r24 = 16
        L_0x018c:
            r23 = r23 | r24
        L_0x018e:
            r4 = r23
            r6 = r9 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0197
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x01ab
        L_0x0197:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01ab
            r12 = r130
            boolean r23 = r8.mo14927P(r12)
            if (r23 == 0) goto L_0x01a6
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a8
        L_0x01a6:
            r26 = r16
        L_0x01a8:
            r4 = r4 | r26
            goto L_0x01ad
        L_0x01ab:
            r12 = r130
        L_0x01ad:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b4
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c6
        L_0x01b4:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c6
            r13 = r131
            boolean r16 = r8.mo14927P(r13)
            if (r16 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r18 = r19
        L_0x01c3:
            r4 = r4 | r18
            goto L_0x01c8
        L_0x01c6:
            r13 = r131
        L_0x01c8:
            r16 = r10 & r110
            if (r16 != 0) goto L_0x01e0
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01db
            r13 = r132
            boolean r16 = r8.mo15006n0(r13)
            if (r16 == 0) goto L_0x01dd
            r20 = r21
            goto L_0x01dd
        L_0x01db:
            r13 = r132
        L_0x01dd:
            r4 = r4 | r20
            goto L_0x01e2
        L_0x01e0:
            r13 = r132
        L_0x01e2:
            r16 = r10 & r111
            r113 = 32768(0x8000, float:4.5918E-41)
            if (r16 != 0) goto L_0x01fd
            r16 = r9 & r113
            r13 = r133
            if (r16 != 0) goto L_0x01f8
            boolean r16 = r8.mo15006n0(r13)
            if (r16 == 0) goto L_0x01f8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fa
        L_0x01f8:
            r16 = r22
        L_0x01fa:
            r4 = r4 | r16
            goto L_0x01ff
        L_0x01fd:
            r13 = r133
        L_0x01ff:
            r114 = r9 & r22
            if (r114 == 0) goto L_0x020a
            r16 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r16
            r10 = r134
            goto L_0x021d
        L_0x020a:
            r16 = r10 & r112
            r10 = r134
            if (r16 != 0) goto L_0x021d
            boolean r16 = r8.mo14927P(r10)
            if (r16 == 0) goto L_0x0219
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021b
        L_0x0219:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x021b:
            r4 = r4 | r16
        L_0x021d:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r1 & r16
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0254
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r4
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r13) goto L_0x0254
            boolean r10 = r8.mo15011p()
            if (r10 != 0) goto L_0x0237
            goto L_0x0254
        L_0x0237:
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
            goto L_0x043e
        L_0x0254:
            r8.mo14930Q()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x028d
            boolean r10 = r8.mo14977f0()
            if (r10 == 0) goto L_0x0262
            goto L_0x028d
        L_0x0262:
            r8.mo14958a0()
            r0 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x026d
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r0
        L_0x026d:
            r0 = r9 & r113
            if (r0 == 0) goto L_0x0275
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x0275:
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
            goto L_0x03a8
        L_0x028d:
            if (r17 == 0) goto L_0x0291
            r10 = 0
            goto L_0x0293
        L_0x0291:
            r10 = r124
        L_0x0293:
            r13 = 0
            if (r5 == 0) goto L_0x0298
            r5 = r13
            goto L_0x029a
        L_0x0298:
            r5 = r125
        L_0x029a:
            if (r7 == 0) goto L_0x029e
            r7 = r13
            goto L_0x02a0
        L_0x029e:
            r7 = r126
        L_0x02a0:
            if (r0 == 0) goto L_0x02a4
            r0 = r13
            goto L_0x02a6
        L_0x02a4:
            r0 = r127
        L_0x02a6:
            if (r2 == 0) goto L_0x02aa
            r2 = r13
            goto L_0x02ac
        L_0x02aa:
            r2 = r128
        L_0x02ac:
            if (r3 == 0) goto L_0x02b0
            r3 = r13
            goto L_0x02b2
        L_0x02b0:
            r3 = r129
        L_0x02b2:
            if (r6 == 0) goto L_0x02b6
            r6 = r13
            goto L_0x02b8
        L_0x02b6:
            r6 = r130
        L_0x02b8:
            if (r12 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r13 = r131
        L_0x02bd:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0334
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
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
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r8
            androidx.compose.material3.d3 r12 = r16.mo11746c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r16
            goto L_0x0336
        L_0x0334:
            r12 = r132
        L_0x0336:
            r16 = r9 & r113
            if (r16 == 0) goto L_0x0360
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            r124 = r16
            r125 = r17
            r126 = r18
            r127 = r19
            r128 = r20
            r129 = r21
            r130 = r22
            androidx.compose.foundation.layout.i0 r16 = androidx.compose.material3.OutlinedTextFieldDefaults.m25983e(r124, r125, r126, r127, r128, r129, r130)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r17
            goto L_0x0362
        L_0x0360:
            r16 = r133
        L_0x0362:
            r135 = r0
            if (r114 == 0) goto L_0x038e
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 r0 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
            r124 = r0
            r125 = r120
            r126 = r10
            r127 = r123
            r128 = r12
            r129 = r1
            r130 = r4
            r124.<init>(r125, r126, r127, r128, r129, r130)
            r124 = r2
            r2 = -1153197597(0xffffffffbb4399e3, float:-0.0029846362)
            r125 = r3
            r3 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r2, r3, r0)
            r26 = r124
            r27 = r125
            r25 = r135
            r32 = r0
            goto L_0x039a
        L_0x038e:
            r124 = r2
            r125 = r3
            r26 = r124
            r27 = r125
            r32 = r134
            r25 = r135
        L_0x039a:
            r23 = r5
            r28 = r6
            r24 = r7
            r22 = r10
            r30 = r12
            r29 = r13
            r31 = r16
        L_0x03a8:
            r8.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1016)"
            r2 = -789275592(0xffffffffd0f49c38, float:-3.28310292E10)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r4, r0)
        L_0x03b9:
            androidx.compose.material3.OutlinedTextFieldDefaults r0 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            r2 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = r1 & r110
            r2 = r2 | r3
            r3 = r1 & r111
            r2 = r2 | r3
            r3 = r1 & r112
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r19 = r2 | r1
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r4 & 14
            r1 = r1 | r2
            r2 = r4 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r4 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r4 & r110
            r1 = r1 | r2
            r2 = r4 & r111
            r1 = r1 | r2
            r2 = r4 & r112
            r20 = r1 | r2
            r21 = 0
            r1 = r118
            r2 = r119
            r3 = r120
            r4 = r121
            r5 = r122
            r6 = r123
            r7 = r22
            r33 = r8
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r18 = r33
            r0.mo11745b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0428
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0428:
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
        L_0x043e:
            androidx.compose.runtime.t1 r7 = r33.mo15020s()
            if (r7 != 0) goto L_0x0445
            goto L_0x046a
        L_0x0445:
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 r6 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
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
        L_0x046a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12185f(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material3.d3, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b8, code lost:
        if (r6.mo15006n0(r132) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01d2, code lost:
        if (r6.mo15006n0(r133) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
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
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo12186g(java.lang.String r119, kotlin.jvm.functions.C11304p r120, boolean r121, boolean r122, androidx.compose.p004ui.text.input.C16275a1 r123, androidx.compose.foundation.interaction.C2241e r124, boolean r125, kotlin.jvm.functions.C11304p r126, kotlin.jvm.functions.C11304p r127, kotlin.jvm.functions.C11304p r128, kotlin.jvm.functions.C11304p r129, kotlin.jvm.functions.C11304p r130, androidx.compose.p004ui.graphics.C15218g4 r131, androidx.compose.material3.C8189d3 r132, androidx.compose.foundation.layout.C2366i0 r133, kotlin.jvm.functions.C11304p r134, androidx.compose.runtime.C8592o r135, int r136, int r137, int r138) {
        /*
            r118 = this;
            r15 = r119
            r14 = r120
            r11 = r123
            r10 = r124
            r9 = r136
            r8 = r137
            r7 = r138
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1224712461(0xffffffffb7005ef3, float:-7.651502E-6)
            r1 = r135
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r0 = r7 & 1
            if (r0 == 0) goto L_0x0032
            r0 = r9 | 6
            goto L_0x0042
        L_0x0032:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x0041
            boolean r0 = r6.mo15006n0(r15)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = 2
        L_0x003f:
            r0 = r0 | r9
            goto L_0x0042
        L_0x0041:
            r0 = r9
        L_0x0042:
            r3 = r7 & 2
            if (r3 == 0) goto L_0x0049
            r0 = r0 | 48
            goto L_0x0059
        L_0x0049:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0059
            boolean r3 = r6.mo14927P(r14)
            if (r3 == 0) goto L_0x0056
            r3 = 32
            goto L_0x0058
        L_0x0056:
            r3 = 16
        L_0x0058:
            r0 = r0 | r3
        L_0x0059:
            r3 = r7 & 4
            if (r3 == 0) goto L_0x0060
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0060:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0074
            r3 = r121
            boolean r16 = r6.mo14961b(r3)
            if (r16 == 0) goto L_0x006f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r0 = r0 | r16
            goto L_0x0076
        L_0x0074:
            r3 = r121
        L_0x0076:
            r16 = r7 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0081
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0081:
            r1 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0095
            r1 = r122
            boolean r16 = r6.mo14961b(r1)
            if (r16 == 0) goto L_0x0090
            r16 = r17
            goto L_0x0092
        L_0x0090:
            r16 = r18
        L_0x0092:
            r0 = r0 | r16
            goto L_0x0097
        L_0x0095:
            r1 = r122
        L_0x0097:
            r16 = r7 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x00a5
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b6
        L_0x00a5:
            r16 = r9 & r110
            if (r16 != 0) goto L_0x00b6
            boolean r16 = r6.mo15006n0(r11)
            if (r16 == 0) goto L_0x00b2
            r16 = r19
            goto L_0x00b4
        L_0x00b2:
            r16 = r20
        L_0x00b4:
            r0 = r0 | r16
        L_0x00b6:
            r16 = r7 & 32
            r21 = 65536(0x10000, float:9.18355E-41)
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00c3
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c0:
            r0 = r0 | r16
            goto L_0x00d3
        L_0x00c3:
            r16 = r9 & r111
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r6.mo15006n0(r10)
            if (r16 == 0) goto L_0x00d0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00d0:
            r16 = r21
            goto L_0x00c0
        L_0x00d3:
            r16 = r7 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r22
            r2 = r125
            goto L_0x00f3
        L_0x00e0:
            r22 = r9 & r112
            r2 = r125
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r6.mo14961b(r2)
            if (r23 == 0) goto L_0x00ef
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r0 = r0 | r23
        L_0x00f3:
            r4 = r7 & 128(0x80, float:1.794E-43)
            r113 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x0100
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r24
            r5 = r126
            goto L_0x0113
        L_0x0100:
            r24 = r9 & r113
            r5 = r126
            if (r24 != 0) goto L_0x0113
            boolean r25 = r6.mo14927P(r5)
            if (r25 == 0) goto L_0x010f
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r0 = r0 | r25
        L_0x0113:
            r12 = r7 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x011e
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r13 = r127
            goto L_0x0133
        L_0x011e:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r9 & r26
            r13 = r127
            if (r26 != 0) goto L_0x0133
            boolean r27 = r6.mo14927P(r13)
            if (r27 == 0) goto L_0x012f
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r0 = r0 | r27
        L_0x0133:
            r1 = r7 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x013e
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r27
            r2 = r128
            goto L_0x0153
        L_0x013e:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r9 & r27
            r2 = r128
            if (r27 != 0) goto L_0x0153
            boolean r27 = r6.mo14927P(r2)
            if (r27 == 0) goto L_0x014f
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r0 = r0 | r27
        L_0x0153:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015c
            r22 = r8 | 6
            r3 = r129
            goto L_0x0172
        L_0x015c:
            r27 = r8 & 14
            r3 = r129
            if (r27 != 0) goto L_0x0170
            boolean r27 = r6.mo14927P(r3)
            if (r27 == 0) goto L_0x016b
            r22 = 4
            goto L_0x016d
        L_0x016b:
            r22 = 2
        L_0x016d:
            r22 = r8 | r22
            goto L_0x0172
        L_0x0170:
            r22 = r8
        L_0x0172:
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x017b
            r22 = r22 | 48
            r5 = r130
            goto L_0x018e
        L_0x017b:
            r27 = r8 & 112(0x70, float:1.57E-43)
            r5 = r130
            if (r27 != 0) goto L_0x018e
            boolean r27 = r6.mo14927P(r5)
            if (r27 == 0) goto L_0x018a
            r23 = 32
            goto L_0x018c
        L_0x018a:
            r23 = 16
        L_0x018c:
            r22 = r22 | r23
        L_0x018e:
            r5 = r8 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x01a8
            r5 = r7 & 4096(0x1000, float:5.74E-42)
            if (r5 != 0) goto L_0x01a1
            r5 = r131
            boolean r23 = r6.mo15006n0(r5)
            if (r23 == 0) goto L_0x01a3
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x01a5
        L_0x01a1:
            r5 = r131
        L_0x01a3:
            r25 = 128(0x80, float:1.794E-43)
        L_0x01a5:
            r22 = r22 | r25
            goto L_0x01aa
        L_0x01a8:
            r5 = r131
        L_0x01aa:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x01c2
            r5 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r5 != 0) goto L_0x01bb
            r5 = r132
            boolean r23 = r6.mo15006n0(r5)
            if (r23 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bb:
            r5 = r132
        L_0x01bd:
            r17 = r18
        L_0x01bf:
            r22 = r22 | r17
            goto L_0x01c4
        L_0x01c2:
            r5 = r132
        L_0x01c4:
            r17 = r8 & r110
            if (r17 != 0) goto L_0x01dc
            r5 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x01d5
            r5 = r133
            boolean r17 = r6.mo15006n0(r5)
            if (r17 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d5:
            r5 = r133
        L_0x01d7:
            r19 = r20
        L_0x01d9:
            r22 = r22 | r19
            goto L_0x01de
        L_0x01dc:
            r5 = r133
        L_0x01de:
            r17 = 32768(0x8000, float:4.5918E-41)
            r114 = r7 & r17
            if (r114 == 0) goto L_0x01ec
            r17 = 196608(0x30000, float:2.75506E-40)
            r22 = r22 | r17
            r5 = r134
            goto L_0x01ff
        L_0x01ec:
            r17 = r8 & r111
            r5 = r134
            if (r17 != 0) goto L_0x01ff
            boolean r17 = r6.mo14927P(r5)
            if (r17 == 0) goto L_0x01fb
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fd
        L_0x01fb:
            r17 = r21
        L_0x01fd:
            r22 = r22 | r17
        L_0x01ff:
            r17 = r7 & r21
            if (r17 == 0) goto L_0x020a
            r17 = 1572864(0x180000, float:2.204052E-39)
            r22 = r22 | r17
            r13 = r118
            goto L_0x021d
        L_0x020a:
            r17 = r8 & r112
            r13 = r118
            if (r17 != 0) goto L_0x021d
            boolean r17 = r6.mo15006n0(r13)
            if (r17 == 0) goto L_0x0219
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021b
        L_0x0219:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x021b:
            r22 = r22 | r17
        L_0x021d:
            r5 = r22
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r0 & r17
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r10) goto L_0x0254
            r8 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r8 & r5
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r10) goto L_0x0254
            boolean r8 = r6.mo15011p()
            if (r8 != 0) goto L_0x0239
            goto L_0x0254
        L_0x0239:
            r6.mo14958a0()
            r8 = r125
            r9 = r126
            r10 = r127
            r11 = r128
            r12 = r129
            r13 = r130
            r14 = r131
            r15 = r132
            r16 = r133
            r17 = r134
            r32 = r6
            goto L_0x0470
        L_0x0254:
            r6.mo14930Q()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x028f
            boolean r8 = r6.mo14977f0()
            if (r8 == 0) goto L_0x0262
            goto L_0x028f
        L_0x0262:
            r6.mo14958a0()
            r1 = r7 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x026b
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x026b:
            r1 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0271
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0271:
            r1 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0279
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x0279:
            r23 = r125
            r24 = r126
            r25 = r127
            r115 = r128
            r26 = r129
            r27 = r130
            r28 = r131
            r29 = r132
            r30 = r133
            r31 = r134
            goto L_0x03d9
        L_0x028f:
            if (r16 == 0) goto L_0x0293
            r8 = 0
            goto L_0x0295
        L_0x0293:
            r8 = r125
        L_0x0295:
            r16 = 0
            if (r4 == 0) goto L_0x029c
            r4 = r16
            goto L_0x029e
        L_0x029c:
            r4 = r126
        L_0x029e:
            if (r12 == 0) goto L_0x02a3
            r12 = r16
            goto L_0x02a5
        L_0x02a3:
            r12 = r127
        L_0x02a5:
            if (r1 == 0) goto L_0x02aa
            r1 = r16
            goto L_0x02ac
        L_0x02aa:
            r1 = r128
        L_0x02ac:
            if (r2 == 0) goto L_0x02b1
            r2 = r16
            goto L_0x02b3
        L_0x02b1:
            r2 = r129
        L_0x02b3:
            if (r3 == 0) goto L_0x02b8
            r3 = r16
            goto L_0x02ba
        L_0x02b8:
            r3 = r130
        L_0x02ba:
            r10 = r7 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x02ca
            androidx.compose.material3.TextFieldDefaults r10 = f19839a
            r115 = r1
            r1 = 6
            androidx.compose.ui.graphics.g4 r10 = r10.mo12197w(r6, r1)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02ce
        L_0x02ca:
            r115 = r1
            r10 = r131
        L_0x02ce:
            r1 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0346
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
            int r1 = r5 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r107 = r1
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r118
            r102 = r6
            androidx.compose.material3.d3 r1 = r16.mo12188i(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0348
        L_0x0346:
            r1 = r132
        L_0x0348:
            r16 = r2
            r2 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0391
            if (r4 != 0) goto L_0x036e
            r2 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r125 = r118
            r126 = r2
            r127 = r17
            r128 = r18
            r129 = r19
            r130 = r20
            r131 = r21
            androidx.compose.foundation.layout.i0 r2 = m26597m(r125, r126, r127, r128, r129, r130, r131)
            goto L_0x038b
        L_0x036e:
            r2 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r125 = r118
            r126 = r2
            r127 = r17
            r128 = r18
            r129 = r19
            r130 = r20
            r131 = r21
            androidx.compose.foundation.layout.i0 r2 = m26596k(r125, r126, r127, r128, r129, r130, r131)
        L_0x038b:
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r17
            goto L_0x0393
        L_0x0391:
            r2 = r133
        L_0x0393:
            if (r114 == 0) goto L_0x03c1
            r133 = r2
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$3 r2 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$3
            r125 = r2
            r126 = r121
            r127 = r8
            r128 = r124
            r129 = r1
            r130 = r10
            r131 = r0
            r132 = r5
            r125.<init>(r126, r127, r128, r129, r130, r131, r132)
            r125 = r1
            r1 = -1171460386(0xffffffffba2ceede, float:-6.596873E-4)
            r126 = r3
            r3 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r6, r1, r3, r2)
            r29 = r125
            r27 = r126
            r30 = r133
            r31 = r1
            goto L_0x03cf
        L_0x03c1:
            r125 = r1
            r133 = r2
            r126 = r3
            r29 = r125
            r27 = r126
            r30 = r133
            r31 = r134
        L_0x03cf:
            r24 = r4
            r23 = r8
            r28 = r10
            r25 = r12
            r26 = r16
        L_0x03d9:
            r6.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x03ea
            r1 = -1224712461(0xffffffffb7005ef3, float:-7.651502E-6)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:1249)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r5, r2)
        L_0x03ea:
            r12 = 0
            r1 = 0
            r13 = r1
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r112
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r20 = r1 | r0
            r0 = r5 & 14
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r1 = 6
            int r1 = r5 << 6
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r110
            r0 = r0 | r2
            r2 = r1 & r111
            r0 = r0 | r2
            r2 = r1 & r112
            r0 = r0 | r2
            r2 = r1 & r113
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r21 = r0 | r1
            r22 = 0
            r0 = r118
            r1 = r119
            r2 = r120
            r3 = r121
            r4 = r122
            r5 = r123
            r32 = r6
            r6 = r124
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r115
            r11 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r0.mo12181b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x045c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x045c:
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r11 = r115
        L_0x0470:
            androidx.compose.runtime.t1 r7 = r32.mo15020s()
            if (r7 != 0) goto L_0x0477
            goto L_0x049c
        L_0x0477:
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$4 r6 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$4
            r0 = r6
            r1 = r118
            r2 = r119
            r3 = r120
            r4 = r121
            r5 = r122
            r116 = r6
            r6 = r123
            r117 = r7
            r7 = r124
            r18 = r136
            r19 = r137
            r20 = r138
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r116
            r0 = r117
            r0.mo15202a(r1)
        L_0x049c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12186g(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.d3, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01d2, code lost:
        if (r8.mo15006n0(r134) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013c  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28049a, message = "Renamed to `TextFieldDefaults.DecorationBox`", replaceWith = @kotlin.C11587t0(expression = "TextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        shape = shape,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {}))
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12187h(@org.jetbrains.annotations.C12579k java.lang.String r120, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r121, boolean r122, boolean r123, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16275a1 r124, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r125, boolean r126, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r127, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r128, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r129, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r130, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r131, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r132, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r133, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r134, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8189d3 r135, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r136, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r137, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r138, int r139, int r140, int r141) {
        /*
            r119 = this;
            r15 = r120
            r14 = r121
            r13 = r124
            r12 = r125
            r11 = r139
            r10 = r140
            r9 = r141
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1042273141(0xffffffffc1e02c8b, float:-28.02175)
            r1 = r138
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
            r3 = r122
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
            r3 = r122
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
            r1 = r123
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
            r1 = r123
        L_0x0097:
            r16 = r9 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00a3
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b4
        L_0x00a3:
            r16 = r11 & r110
            if (r16 != 0) goto L_0x00b4
            boolean r16 = r8.mo15006n0(r13)
            if (r16 == 0) goto L_0x00b0
            r16 = r19
            goto L_0x00b2
        L_0x00b0:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00b2:
            r0 = r0 | r16
        L_0x00b4:
            r16 = r9 & 32
            r111 = 458752(0x70000, float:6.42848E-40)
            r112 = 65536(0x10000, float:9.18355E-41)
            if (r16 == 0) goto L_0x00c1
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00be:
            r0 = r0 | r16
            goto L_0x00d1
        L_0x00c1:
            r16 = r11 & r111
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r8.mo15006n0(r12)
            if (r16 == 0) goto L_0x00ce
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00ce:
            r16 = r112
            goto L_0x00be
        L_0x00d1:
            r16 = r9 & 64
            r113 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00de
            r20 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r20
            r2 = r126
            goto L_0x00f1
        L_0x00de:
            r20 = r11 & r113
            r2 = r126
            if (r20 != 0) goto L_0x00f1
            boolean r21 = r8.mo14961b(r2)
            if (r21 == 0) goto L_0x00ed
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ef
        L_0x00ed:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ef:
            r0 = r0 | r21
        L_0x00f1:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r114 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x00fe
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r22
            r5 = r127
            goto L_0x0111
        L_0x00fe:
            r22 = r11 & r114
            r5 = r127
            if (r22 != 0) goto L_0x0111
            boolean r23 = r8.mo14927P(r5)
            if (r23 == 0) goto L_0x010d
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010f
        L_0x010d:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x010f:
            r0 = r0 | r23
        L_0x0111:
            r6 = r9 & 256(0x100, float:3.59E-43)
            r115 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x011e
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r24
            r7 = r128
            goto L_0x0131
        L_0x011e:
            r24 = r11 & r115
            r7 = r128
            if (r24 != 0) goto L_0x0131
            boolean r25 = r8.mo14927P(r7)
            if (r25 == 0) goto L_0x012d
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012f
        L_0x012d:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012f:
            r0 = r0 | r25
        L_0x0131:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x013c
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r25
            r2 = r129
            goto L_0x0151
        L_0x013c:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r11 & r25
            r2 = r129
            if (r25 != 0) goto L_0x0151
            boolean r25 = r8.mo14927P(r2)
            if (r25 == 0) goto L_0x014d
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014f
        L_0x014d:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014f:
            r0 = r0 | r25
        L_0x0151:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015a
            r20 = r10 | 6
            r3 = r130
            goto L_0x0170
        L_0x015a:
            r25 = r10 & 14
            r3 = r130
            if (r25 != 0) goto L_0x016e
            boolean r25 = r8.mo14927P(r3)
            if (r25 == 0) goto L_0x0169
            r20 = 4
            goto L_0x016b
        L_0x0169:
            r20 = 2
        L_0x016b:
            r20 = r10 | r20
            goto L_0x0170
        L_0x016e:
            r20 = r10
        L_0x0170:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0177
            r20 = r20 | 48
            goto L_0x018a
        L_0x0177:
            r25 = r10 & 112(0x70, float:1.57E-43)
            r5 = r131
            if (r25 != 0) goto L_0x018a
            boolean r25 = r8.mo14927P(r5)
            if (r25 == 0) goto L_0x0186
            r21 = 32
            goto L_0x0188
        L_0x0186:
            r21 = 16
        L_0x0188:
            r20 = r20 | r21
        L_0x018a:
            r5 = r20
            r7 = r9 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0193
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a7
        L_0x0193:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01a7
            r12 = r132
            boolean r20 = r8.mo14927P(r12)
            if (r20 == 0) goto L_0x01a2
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x01a4
        L_0x01a2:
            r23 = 128(0x80, float:1.794E-43)
        L_0x01a4:
            r5 = r5 | r23
            goto L_0x01a9
        L_0x01a7:
            r12 = r132
        L_0x01a9:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b0
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c2
        L_0x01b0:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c2
            r13 = r133
            boolean r20 = r8.mo14927P(r13)
            if (r20 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r17 = r18
        L_0x01bf:
            r5 = r5 | r17
            goto L_0x01c4
        L_0x01c2:
            r13 = r133
        L_0x01c4:
            r17 = r10 & r110
            if (r17 != 0) goto L_0x01dc
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01d5
            r13 = r134
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d5:
            r13 = r134
        L_0x01d7:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01d9:
            r5 = r5 | r19
            goto L_0x01de
        L_0x01dc:
            r13 = r134
        L_0x01de:
            r17 = r10 & r111
            if (r17 != 0) goto L_0x01f9
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            r13 = r135
            if (r17 != 0) goto L_0x01f4
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x01f4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f6
        L_0x01f4:
            r17 = r112
        L_0x01f6:
            r5 = r5 | r17
            goto L_0x01fb
        L_0x01f9:
            r13 = r135
        L_0x01fb:
            r17 = r10 & r113
            if (r17 != 0) goto L_0x0213
            r17 = r9 & r112
            r13 = r136
            if (r17 != 0) goto L_0x020e
            boolean r17 = r8.mo15006n0(r13)
            if (r17 == 0) goto L_0x020e
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0210
        L_0x020e:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0210:
            r5 = r5 | r17
            goto L_0x0215
        L_0x0213:
            r13 = r136
        L_0x0215:
            r17 = 131072(0x20000, float:1.83671E-40)
            r116 = r9 & r17
            if (r116 == 0) goto L_0x0222
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r13 = r137
            goto L_0x0235
        L_0x0222:
            r17 = r10 & r114
            r13 = r137
            if (r17 != 0) goto L_0x0235
            boolean r17 = r8.mo14927P(r13)
            if (r17 == 0) goto L_0x0231
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0233
        L_0x0231:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0233:
            r5 = r5 | r17
        L_0x0235:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x0242
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r17
            r15 = r119
            goto L_0x0255
        L_0x0242:
            r17 = r10 & r115
            r15 = r119
            if (r17 != 0) goto L_0x0255
            boolean r17 = r8.mo15006n0(r15)
            if (r17 == 0) goto L_0x0251
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0253
        L_0x0251:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0253:
            r5 = r5 | r17
        L_0x0255:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x028e
            r10 = 191739611(0xb6db6db, float:4.5782105E-32)
            r10 = r10 & r5
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r10 != r13) goto L_0x028e
            boolean r10 = r8.mo15011p()
            if (r10 != 0) goto L_0x026f
            goto L_0x028e
        L_0x026f:
            r8.mo14958a0()
            r9 = r127
            r10 = r128
            r11 = r129
            r12 = r130
            r13 = r131
            r14 = r132
            r15 = r133
            r16 = r134
            r17 = r135
            r18 = r136
            r19 = r137
            r35 = r8
            r8 = r126
            goto L_0x04ca
        L_0x028e:
            r8.mo14930Q()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x02d3
            boolean r10 = r8.mo14977f0()
            if (r10 == 0) goto L_0x029c
            goto L_0x02d3
        L_0x029c:
            r8.mo14958a0()
            r1 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02a7
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x02a7:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x02b1
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r1
        L_0x02b1:
            r1 = r9 & r112
            if (r1 == 0) goto L_0x02b9
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x02b9:
            r23 = r126
            r24 = r127
            r25 = r128
            r26 = r129
            r27 = r130
            r28 = r131
            r29 = r132
            r30 = r133
            r31 = r134
            r32 = r135
            r33 = r136
            r34 = r137
            goto L_0x042f
        L_0x02d3:
            if (r16 == 0) goto L_0x02d7
            r10 = 0
            goto L_0x02d9
        L_0x02d7:
            r10 = r126
        L_0x02d9:
            r13 = 0
            if (r4 == 0) goto L_0x02de
            r4 = r13
            goto L_0x02e0
        L_0x02de:
            r4 = r127
        L_0x02e0:
            if (r6 == 0) goto L_0x02e4
            r6 = r13
            goto L_0x02e6
        L_0x02e4:
            r6 = r128
        L_0x02e6:
            if (r1 == 0) goto L_0x02ea
            r1 = r13
            goto L_0x02ec
        L_0x02ea:
            r1 = r129
        L_0x02ec:
            if (r2 == 0) goto L_0x02f0
            r2 = r13
            goto L_0x02f2
        L_0x02f0:
            r2 = r130
        L_0x02f2:
            if (r3 == 0) goto L_0x02f6
            r3 = r13
            goto L_0x02f8
        L_0x02f6:
            r3 = r131
        L_0x02f8:
            if (r7 == 0) goto L_0x02fc
            r7 = r13
            goto L_0x02fe
        L_0x02fc:
            r7 = r132
        L_0x02fe:
            if (r12 == 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r13 = r133
        L_0x0303:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0315
            androidx.compose.material3.TextFieldDefaults r12 = f19839a
            r138 = r1
            r1 = 6
            androidx.compose.ui.graphics.g4 r1 = r12.mo12197w(r8, r1)
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r12
            goto L_0x0319
        L_0x0315:
            r138 = r1
            r1 = r134
        L_0x0319:
            r12 = 32768(0x8000, float:4.5918E-41)
            r12 = r12 & r9
            if (r12 == 0) goto L_0x0396
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
            int r12 = r5 >> 15
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r107 = r12
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r119
            r102 = r8
            androidx.compose.material3.d3 r12 = r16.mo12188i(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r16
            goto L_0x0398
        L_0x0396:
            r12 = r135
        L_0x0398:
            r16 = r9 & r112
            if (r16 == 0) goto L_0x03e1
            if (r4 != 0) goto L_0x03bd
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r126 = r119
            r127 = r16
            r128 = r17
            r129 = r18
            r130 = r19
            r131 = r20
            r132 = r21
            androidx.compose.foundation.layout.i0 r16 = m26597m(r126, r127, r128, r129, r130, r131, r132)
            goto L_0x03db
        L_0x03bd:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r126 = r119
            r127 = r16
            r128 = r17
            r129 = r18
            r130 = r19
            r131 = r20
            r132 = r21
            androidx.compose.foundation.layout.i0 r16 = m26596k(r126, r127, r128, r129, r130, r131, r132)
        L_0x03db:
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r17
            goto L_0x03e3
        L_0x03e1:
            r16 = r136
        L_0x03e3:
            if (r116 == 0) goto L_0x0411
            r17 = r2
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1 r2 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
            r126 = r2
            r127 = r122
            r128 = r10
            r129 = r125
            r130 = r12
            r131 = r1
            r132 = r0
            r133 = r5
            r126.<init>(r127, r128, r129, r130, r131, r132, r133)
            r126 = r1
            r1 = 2023266550(0x789898f6, float:2.476036E34)
            r127 = r3
            r3 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r1, r3, r2)
            r31 = r126
            r28 = r127
            r26 = r138
            r34 = r1
            goto L_0x041f
        L_0x0411:
            r126 = r1
            r17 = r2
            r127 = r3
            r31 = r126
            r28 = r127
            r34 = r137
            r26 = r138
        L_0x041f:
            r24 = r4
            r25 = r6
            r29 = r7
            r23 = r10
            r32 = r12
            r30 = r13
            r33 = r16
            r27 = r17
        L_0x042f:
            r8.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0440
            r1 = -1042273141(0xffffffffc1e02c8b, float:-28.02175)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:943)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r5, r2)
        L_0x0440:
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = r0 & r114
            r1 = r1 | r2
            r2 = r0 & r115
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r20 = r1 | r0
            r0 = r5 & 14
            r1 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = r5 & r110
            r0 = r0 | r1
            r1 = r5 & r111
            r0 = r0 | r1
            r1 = r5 & r113
            r0 = r0 | r1
            r1 = r5 & r114
            r0 = r0 | r1
            r1 = r5 & r115
            r21 = r0 | r1
            r22 = 0
            r0 = r119
            r1 = r120
            r2 = r121
            r3 = r122
            r4 = r123
            r5 = r124
            r6 = r125
            r7 = r23
            r35 = r8
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r18 = r34
            r19 = r35
            r0.mo12181b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x04b2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04b2:
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r18 = r33
            r19 = r34
        L_0x04ca:
            androidx.compose.runtime.t1 r7 = r35.mo15020s()
            if (r7 != 0) goto L_0x04d1
            goto L_0x04f6
        L_0x04d1:
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2 r6 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
            r0 = r6
            r1 = r119
            r2 = r120
            r3 = r121
            r4 = r122
            r5 = r123
            r117 = r6
            r6 = r124
            r118 = r7
            r7 = r125
            r20 = r139
            r21 = r140
            r22 = r141
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r117
            r0 = r118
            r0.mo15202a(r1)
        L_0x04f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.mo12187h(java.lang.String, kotlin.jvm.functions.p, boolean, boolean, androidx.compose.ui.text.input.a1, androidx.compose.foundation.interaction.e, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.d3, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C12579k
    /* renamed from: i */
    public final C8189d3 mo12188i(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @C12580l C2844t tVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @C12580l C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C8592o oVar2 = oVar;
        int i8 = i6;
        int i9 = i7;
        oVar2.mo14918M(1513344955);
        long k = (i8 & 1) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14570J(), oVar2, 6) : j;
        long k2 = (i8 & 2) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14582V(), oVar2, 6) : j2;
        long w = (i8 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i8 & 8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14563C(), oVar2, 6) : j4;
        long k4 = (i8 & 16) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j5;
        long k5 = (i8 & 32) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j6;
        long k6 = (i8 & 64) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j7;
        long k7 = (i8 & 128) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14593d(), oVar2, 6) : j8;
        long k8 = (i8 & 256) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14591c(), oVar2, 6) : j9;
        long k9 = (i8 & 512) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14611q(), oVar2, 6) : j10;
        C2844t tVar2 = (i8 & 1024) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k10 = (i8 & 2048) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14568H(), oVar2, 6) : j11;
        long k11 = (i8 & 4096) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14587a(), oVar2, 6) : j12;
        long w2 = (i8 & 8192) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14599g(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long k12 = (i8 & 16384) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14609o(), oVar2, 6) : j14;
        long k13 = (32768 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14572L(), oVar2, 6) : j15;
        long k14 = (65536 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14592c0(), oVar2, 6) : j16;
        long w3 = (131072 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14606l(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long k15 = (262144 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14565E(), oVar2, 6) : j18;
        long k16 = (524288 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14574N(), oVar2, 6) : j19;
        long k17 = (1048576 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14600g0(), oVar2, 6) : j20;
        long w4 = (2097152 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14608n(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long k18 = (4194304 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14567G(), oVar2, 6) : j22;
        long k19 = (8388608 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14571K(), oVar2, 6) : j23;
        long k20 = (16777216 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14588a0(), oVar2, 6) : j24;
        long w5 = (33554432 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14605k(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j25;
        long k21 = (67108864 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14564D(), oVar2, 6) : j26;
        long k22 = (134217728 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j27;
        long k23 = (268435456 & i8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j28;
        long w6 = (536870912 & i8) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long k24 = (i8 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14584X(), oVar2, 6) : j30;
        long k25 = (i9 & 1) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14573M(), oVar2, 6) : j31;
        long k26 = (i9 & 2) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14596e0(), oVar2, 6) : j32;
        long w7 = (i9 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14607m(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j33;
        long k27 = (i9 & 8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14566F(), oVar2, 6) : j34;
        long k28 = (i9 & 16) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j35;
        long k29 = (i9 & 32) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j36;
        long w8 = (i9 & 64) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j37;
        long k30 = (i9 & 128) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14585Y(), oVar2, 6) : j38;
        long k31 = (i9 & 256) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j39;
        long k32 = (i9 & 512) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j40;
        long w9 = (i9 & 1024) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j41;
        long k33 = (i9 & 2048) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14586Z(), oVar2, 6) : j42;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:246)");
        }
        C8189d3 d3Var = new C8189d3(k, k2, w, k3, k4, k5, k6, k7, k8, k9, tVar2, k10, k11, w2, k12, k13, k14, w3, k15, k16, k17, w4, k18, k19, k20, w5, k21, k22, k23, w6, k24, k25, k26, w7, k27, k28, k29, w8, k30, k31, k32, w9, k33, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d3Var;
    }

    @C12579k
    /* renamed from: j */
    public final C2366i0 mo12189j(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f3, f2, f4);
    }

    @C12579k
    /* renamed from: l */
    public final C2366i0 mo12190l(float f, float f2, float f3, float f4) {
        return PaddingKt.m10017d(f, f2, f3, f4);
    }

    @C8540g
    @C11314h(name = "getFilledShape")
    @C12579k
    /* renamed from: n */
    public final C15218g4 mo12191n(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(611926497);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:472)");
        }
        C15218g4 w = mo12197w(oVar, i & 14);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return w;
    }

    /* renamed from: p */
    public final float mo12192p() {
        return f19845g;
    }

    /* renamed from: r */
    public final float mo12193r() {
        return f19843e;
    }

    /* renamed from: s */
    public final float mo12194s() {
        return f19840b;
    }

    /* renamed from: t */
    public final float mo12195t() {
        return f19841c;
    }

    @C8540g
    @C11314h(name = "getOutlinedShape")
    @C12579k
    /* renamed from: u */
    public final C15218g4 mo12196u(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-584749279);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:465)");
        }
        C15218g4 i2 = OutlinedTextFieldDefaults.f19530a.mo11751i(oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i2;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: w */
    public final C15218g4 mo12197w(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1941327459);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:57)");
        }
        C15218g4 f = ShapesKt.m26127f(C8347x.f22266a.mo14597f(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: x */
    public final float mo12198x() {
        return f19844f;
    }

    /* renamed from: z */
    public final float mo12199z() {
        return f19842d;
    }
}
