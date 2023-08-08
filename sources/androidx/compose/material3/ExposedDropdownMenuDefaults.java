package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.C2844t;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.C3053a;
import androidx.compose.material.icons.filled.C3287g3;
import androidx.compose.material3.tokens.C8317k0;
import androidx.compose.material3.tokens.C8339t;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8755m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8567o(parameters = 0)
@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1058:1\n76#2:1059\n76#2:1060\n76#2:1061\n76#2:1062\n76#2:1063\n76#2:1064\n154#3:1065\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n370#1:1059\n524#1:1060\n637#1:1061\n743#1:1062\n844#1:1063\n934#1:1064\n622#1:1065\n*E\n"})
public final class ExposedDropdownMenuDefaults {
    @C12579k

    /* renamed from: a */
    public static final ExposedDropdownMenuDefaults f19407a = new ExposedDropdownMenuDefaults();
    @C12579k

    /* renamed from: b */
    public static final C2366i0 f19408b = PaddingKt.m10015b(ExposedDropdownMenuKt.f19410a, C16483g.m74435M((float) 0));

    /* renamed from: c */
    public static final int f19409c = 0;

    @C8540g
    @C8251n0
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11550a(boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        float f;
        int i3;
        C8592o o = oVar.mo15009o(-1803742020);
        if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1803742020, i, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:300)");
            }
            C15340c a = C3287g3.m14828a(C3053a.C3054a.f8153a);
            C8767m.C8768a aVar = C8767m.f23478j;
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            IconKt.m25825c(a, (String) null, C8755m.m32557a(aVar, f), 0, o, 48, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ExposedDropdownMenuDefaults$TrailingIcon$1(this, z, i));
        }
    }

    @C12579k
    /* renamed from: b */
    public final C2366i0 mo11551b() {
        return f19408b;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8189d3 mo11552c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @C12580l C2844t tVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, @C12580l C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C8592o oVar2 = oVar;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i5;
        int i11 = i6;
        oVar2.mo14918M(-325161132);
        long k = (i10 & 1) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13910m(), oVar2, 6) : j;
        long k2 = (i10 & 2) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13918s(), oVar2, 6) : j2;
        long w = (i10 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13886a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i10 & 8) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13904j(), oVar2, 6) : j4;
        long s = (i10 & 16) != 0 ? C15240j2.f37547b.mo42850s() : j5;
        long s2 = (i10 & 32) != 0 ? C15240j2.f37547b.mo42850s() : j6;
        long s3 = (i10 & 64) != 0 ? C15240j2.f37547b.mo42850s() : j7;
        long s4 = (i10 & 128) != 0 ? C15240j2.f37547b.mo42850s() : j8;
        long k4 = (i10 & 256) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13868I(), oVar2, 6) : j9;
        long k5 = (i10 & 512) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13876Q(), oVar2, 6) : j10;
        C2844t tVar2 = (i10 & 1024) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k6 = (i10 & 2048) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13889b0(), oVar2, 6) : j11;
        long k7 = (i10 & 4096) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13907k0(), oVar2, 6) : j12;
        long w2 = (i10 & 8192) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13873N(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long k8 = (i10 & 16384) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13884Y(), oVar2, 6) : j14;
        long k9 = (32768 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13887a0(), oVar2, 6) : j15;
        long k10 = (65536 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13903i0(), oVar2, 6) : j16;
        long w3 = (131072 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13872M(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long k11 = (262144 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13883X(), oVar2, 6) : j18;
        long k12 = (524288 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13893d0(), oVar2, 6) : j19;
        long k13 = (1048576 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13911m0(), oVar2, 6) : j20;
        long w4 = (2097152 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13875P(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long k14 = (4194304 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13885Z(), oVar2, 6) : j22;
        long k15 = (8388608 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13912n(), oVar2, 6) : j23;
        long k16 = (16777216 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13920u(), oVar2, 6) : j24;
        long w5 = (33554432 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13888b(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j25;
        long k17 = (67108864 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13906k(), oVar2, 6) : j26;
        long k18 = (134217728 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j27;
        long k19 = (268435456 & i10) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j28;
        long w6 = (536870912 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long k20 = (i10 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j30;
        long k21 = (i11 & 1) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j31;
        long k22 = (i11 & 2) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j32;
        long w7 = (i11 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j33;
        long k23 = (i11 & 8) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j34;
        long k24 = (i11 & 16) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j35;
        long k25 = (i11 & 32) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j36;
        long w8 = (i11 & 64) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j37;
        long k26 = (i11 & 128) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j38;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-325161132, i7, i8, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:510)");
        }
        int i12 = i4 << 12;
        int i13 = i4 >> 18;
        C8189d3 c = OutlinedTextFieldDefaults.f19530a.mo11746c(k, k2, w, k3, s, s2, s3, s4, k4, k5, tVar2, k6, k7, w2, k8, k9, k10, w3, k11, k12, k13, w4, k14, k15, k16, w5, k17, k18, k19, w6, k20, 0, 0, 0, 0, k21, k22, w7, k23, k24, k25, w8, k26, oVar, (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i4 & 14) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 14) | 3072 | (i13 & 112) | (i13 & 896), 0, 15);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    /* renamed from: d */
    public final /* synthetic */ C8189d3 mo11553d(long j, long j2, long j3, long j4, long j5, C2844t tVar, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, C8592o oVar, int i, int i2, int i3, int i4) {
        C8592o oVar2 = oVar;
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        oVar2.mo14918M(-83147315);
        long k = (i7 & 1) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13918s(), oVar2, 6) : j;
        long w = (i7 & 2) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13886a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long s = (i7 & 4) != 0 ? C15240j2.f37547b.mo42850s() : j3;
        long k2 = (i7 & 8) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13868I(), oVar2, 6) : j4;
        long k3 = (i7 & 16) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13876Q(), oVar2, 6) : j5;
        C2844t tVar2 = (i7 & 32) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k4 = (i7 & 64) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13889b0(), oVar2, 6) : j6;
        long k5 = (i7 & 128) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13907k0(), oVar2, 6) : j7;
        long w2 = (i7 & 256) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13873N(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long k6 = (i7 & 512) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13884Y(), oVar2, 6) : j9;
        long k7 = (i7 & 1024) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13887a0(), oVar2, 6) : j10;
        long k8 = (i7 & 2048) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13903i0(), oVar2, 6) : j11;
        long w3 = (i7 & 4096) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13872M(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long k9 = (i7 & 8192) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13883X(), oVar2, 6) : j13;
        long k10 = (i7 & 16384) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13893d0(), oVar2, 6) : j14;
        long k11 = (32768 & i7) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13911m0(), oVar2, 6) : j15;
        long w4 = (65536 & i7) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13875P(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long k12 = (131072 & i7) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13885Z(), oVar2, 6) : j17;
        long k13 = (262144 & i7) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13912n(), oVar2, 6) : j18;
        long k14 = (524288 & i7) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13920u(), oVar2, 6) : j19;
        long w5 = (1048576 & i7) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13888b(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long k15 = (2097152 & i7) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13906k(), oVar2, 6) : j21;
        long k16 = (4194304 & i7) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j22;
        long w6 = (i7 & 8388608) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13886a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-83147315, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:925)");
        }
        C8317k0 k0Var = C8317k0.f21496a;
        long k17 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long k18 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long w7 = C15240j2.m66080w(ColorSchemeKt.m25524k(k0Var.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        long k19 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long k20 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long k21 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long w8 = C15240j2.m66080w(ColorSchemeKt.m25524k(k0Var.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        long k22 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        int i8 = i5 << 3;
        int i9 = (i5 & 14) | (i8 & 112) | (i8 & 896);
        int i10 = i5 << 9;
        int i11 = i9 | (i10 & 7168) | ((i5 << 6) & 57344) | (i10 & 458752) | ((i5 << 12) & 3670016);
        int i12 = i5 << 15;
        int i13 = i11 | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i5 >> 15;
        int i15 = i6 << 15;
        int i16 = (i14 & 57344) | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i6 >> 15;
        int i18 = i3 << 15;
        int i19 = i3 << 18;
        C8189d3 c = mo11552c(k, k, w, k, s, s, s, s, k2, k3, tVar2, k4, k5, w2, k6, k7, k8, w3, k9, k10, k11, w4, k12, k13, k14, w5, k15, k16, k16, w6, k16, k17, k18, w7, k19, k20, k21, w8, k22, oVar, i13, i16, (i17 & 57344) | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), ((i3 >> 6) & 14) | (i18 & 1879048192), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    /* renamed from: e */
    public final /* synthetic */ C8189d3 mo11554e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, C2844t tVar, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C8592o oVar2 = oVar;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        oVar2.mo14918M(-907010558);
        long k = (i9 & 1) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13910m(), oVar2, 6) : j;
        long k2 = (i9 & 2) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13918s(), oVar2, 6) : j2;
        long w = (i9 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13886a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i9 & 8) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13904j(), oVar2, 6) : j4;
        long s = (i9 & 16) != 0 ? C15240j2.f37547b.mo42850s() : j5;
        long s2 = (i9 & 32) != 0 ? C15240j2.f37547b.mo42850s() : j6;
        long k4 = (i9 & 64) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13868I(), oVar2, 6) : j7;
        long k5 = (i9 & 128) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13876Q(), oVar2, 6) : j8;
        C2844t tVar2 = (i9 & 256) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k6 = (i9 & 512) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13889b0(), oVar2, 6) : j9;
        long k7 = (i9 & 1024) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13907k0(), oVar2, 6) : j10;
        long w2 = (i9 & 2048) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13873N(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long k8 = (i9 & 4096) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13884Y(), oVar2, 6) : j12;
        long k9 = (i9 & 8192) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13887a0(), oVar2, 6) : j13;
        long k10 = (i9 & 16384) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13903i0(), oVar2, 6) : j14;
        long w3 = (32768 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13872M(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long k11 = (65536 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13883X(), oVar2, 6) : j16;
        long k12 = (131072 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13893d0(), oVar2, 6) : j17;
        long k13 = (262144 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13911m0(), oVar2, 6) : j18;
        long w4 = (524288 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13875P(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long k14 = (1048576 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13885Z(), oVar2, 6) : j20;
        long k15 = (2097152 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13912n(), oVar2, 6) : j21;
        long k16 = (4194304 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13920u(), oVar2, 6) : j22;
        long w5 = (8388608 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13888b(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long k17 = (16777216 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13906k(), oVar2, 6) : j24;
        long k18 = (33554432 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j25;
        long k19 = (67108864 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j26;
        long w6 = (134217728 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j27;
        long k20 = (268435456 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j28;
        long k21 = (536870912 & i9) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j29;
        long k22 = (i9 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j30;
        long w7 = (i6 & 1) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j31;
        long k23 = (i6 & 2) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j32;
        long k24 = (i6 & 4) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j33;
        long k25 = (i6 & 8) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j34;
        long w8 = (i6 & 16) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8317k0.f21496a.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j35;
        long k26 = (i6 & 32) != 0 ? ColorSchemeKt.m25524k(C8317k0.f21496a.mo13922w(), oVar2, 6) : j36;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-907010558, i7, i8, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:731)");
        }
        int i10 = i7 << 6;
        int i11 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | ((i7 << 3) & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i7 >> 24;
        int i13 = i8 << 6;
        int i14 = (i12 & 112) | (i12 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i8 >> 24;
        int i16 = i3 << 6;
        int i17 = (i15 & 112) | (i15 & 14) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i3 >> 24;
        int i19 = i4 << 6;
        C8189d3 c = mo11552c(k, k2, w, k3, s, s, s, s2, k4, k5, tVar2, k6, k7, w2, k8, k9, k10, w3, k11, k12, k13, w4, k14, k15, k16, w5, k17, k18, k19, w6, k20, k21, k22, w7, k23, k24, k25, w8, k26, oVar, i11, i14, i17, (i18 & 112) | (i18 & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8189d3 mo11555f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @C12580l C2844t tVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, @C12580l C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C8592o oVar2 = oVar;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i5;
        int i11 = i6;
        oVar2.mo14918M(-375683630);
        long k = (i10 & 1) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14449m(), oVar2, 6) : j;
        long k2 = (i10 & 2) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14458s(), oVar2, 6) : j2;
        long w = (i10 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14425a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i10 & 8) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14443j(), oVar2, 6) : j4;
        long k4 = (i10 & 16) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j5;
        long k5 = (i10 & 32) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j6;
        long k6 = (i10 & 64) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j7;
        long k7 = (i10 & 128) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j8;
        long k8 = (i10 & 256) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14409K(), oVar2, 6) : j9;
        long k9 = (i10 & 512) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14420V(), oVar2, 6) : j10;
        C2844t tVar2 = (i10 & 1024) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k10 = (i10 & 2048) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14432d0(), oVar2, 6) : j11;
        long k11 = (i10 & 4096) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14407I(), oVar2, 6) : j12;
        long w2 = (i10 & 8192) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14413O(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long k12 = (i10 & 16384) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14418T(), oVar2, 6) : j14;
        long k13 = (32768 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14436f0(), oVar2, 6) : j15;
        long k14 = (65536 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14448l0(), oVar2, 6) : j16;
        long w3 = (131072 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14416R(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long k15 = (262144 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14428b0(), oVar2, 6) : j18;
        long k16 = (524288 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14438g0(), oVar2, 6) : j19;
        long k17 = (1048576 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14452n0(), oVar2, 6) : j20;
        long w4 = (2097152 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14417S(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long k18 = (4194304 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14430c0(), oVar2, 6) : j22;
        long k19 = (8388608 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14451n(), oVar2, 6) : j23;
        long k20 = (16777216 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14460u(), oVar2, 6) : j24;
        long k21 = (33554432 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14427b(), oVar2, 6) : j25;
        long k22 = (67108864 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14445k(), oVar2, 6) : j26;
        long k23 = (134217728 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j27;
        long k24 = (268435456 & i10) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j28;
        long w5 = (536870912 & i10) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14429c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long k25 = (i10 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j30;
        long k26 = (i11 & 1) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j31;
        long k27 = (i11 & 2) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j32;
        long w6 = (i11 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14429c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j33;
        long k28 = (i11 & 8) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j34;
        long k29 = (i11 & 16) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j35;
        long k30 = (i11 & 32) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j36;
        long w7 = (i11 & 64) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14429c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j37;
        long k31 = (i11 & 128) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j38;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-375683630, i7, i8, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:357)");
        }
        int i12 = i4 << 12;
        int i13 = i4 >> 18;
        C8189d3 i14 = TextFieldDefaults.f19839a.mo12188i(k, k2, w, k3, k4, k5, k6, k7, k8, k9, tVar2, k10, k11, w2, k12, k13, k14, w3, k15, k16, k17, w4, k18, k19, k20, k21, k22, k23, k24, w5, k25, 0, 0, 0, 0, k26, k27, w6, k28, k29, k30, w7, k31, oVar, (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i4 & 14) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 14) | 3072 | (i13 & 112) | (i13 & 896), 0, 15);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i14;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    /* renamed from: g */
    public final /* synthetic */ C8189d3 mo11556g(long j, long j2, long j3, long j4, long j5, C2844t tVar, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, C8592o oVar, int i, int i2, int i3, int i4) {
        C8592o oVar2 = oVar;
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        oVar2.mo14918M(-2013303349);
        long k = (i7 & 1) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14458s(), oVar2, 6) : j;
        long w = (i7 & 2) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14425a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long k2 = (i7 & 4) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j3;
        long k3 = (i7 & 8) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14409K(), oVar2, 6) : j4;
        long k4 = (i7 & 16) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14420V(), oVar2, 6) : j5;
        C2844t tVar2 = (i7 & 32) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k5 = (i7 & 64) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14432d0(), oVar2, 6) : j6;
        long k6 = (i7 & 128) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14407I(), oVar2, 6) : j7;
        long w2 = (i7 & 256) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14413O(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long k7 = (i7 & 512) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14418T(), oVar2, 6) : j9;
        long k8 = (i7 & 1024) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14436f0(), oVar2, 6) : j10;
        long k9 = (i7 & 2048) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14448l0(), oVar2, 6) : j11;
        long w3 = (i7 & 4096) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14416R(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long k10 = (i7 & 8192) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14428b0(), oVar2, 6) : j13;
        long k11 = (i7 & 16384) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14438g0(), oVar2, 6) : j14;
        long k12 = (32768 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14452n0(), oVar2, 6) : j15;
        long w4 = (65536 & i7) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14417S(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long k13 = (131072 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14430c0(), oVar2, 6) : j17;
        long k14 = (262144 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14451n(), oVar2, 6) : j18;
        long k15 = (524288 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14460u(), oVar2, 6) : j19;
        long k16 = (1048576 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14427b(), oVar2, 6) : j20;
        long k17 = (2097152 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14445k(), oVar2, 6) : j21;
        long k18 = (4194304 & i7) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j22;
        long w5 = (i7 & 8388608) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14425a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2013303349, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:836)");
        }
        C8317k0 k0Var = C8317k0.f21496a;
        long k19 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long k20 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long w6 = C15240j2.m66080w(ColorSchemeKt.m25524k(k0Var.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        long k21 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long k22 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long k23 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        long w7 = C15240j2.m66080w(ColorSchemeKt.m25524k(k0Var.mo13890c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        long k24 = ColorSchemeKt.m25524k(k0Var.mo13922w(), oVar2, 6);
        int i8 = i5 << 3;
        int i9 = (i5 & 14) | (i8 & 112) | (i8 & 896);
        int i10 = i5 << 9;
        int i11 = i9 | (i10 & 7168) | ((i5 << 6) & 57344) | (i10 & 458752) | ((i5 << 12) & 3670016);
        int i12 = i5 << 15;
        int i13 = i11 | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i5 >> 15;
        int i15 = i6 << 15;
        int i16 = (i14 & 57344) | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i6 >> 15;
        int i18 = i3 << 15;
        int i19 = i3 << 18;
        C8189d3 f = mo11555f(k, k, w, k, k2, k2, k2, k2, k3, k4, tVar2, k5, k6, w2, k7, k8, k9, w3, k10, k11, k12, w4, k13, k14, k15, k16, k17, k18, k18, w5, k18, k19, k20, w6, k21, k22, k23, w7, k24, oVar, i13, i16, (i17 & 57344) | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), ((i3 >> 6) & 14) | (i18 & 1879048192), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    /* renamed from: h */
    public final /* synthetic */ C8189d3 mo11557h(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, C2844t tVar, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, C8592o oVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C8592o oVar2 = oVar;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        oVar2.mo14918M(1357676928);
        long k = (i9 & 1) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14449m(), oVar2, 6) : j;
        long k2 = (i9 & 2) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14458s(), oVar2, 6) : j2;
        long w = (i9 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14425a(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i9 & 8) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14443j(), oVar2, 6) : j4;
        long k4 = (i9 & 16) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j5;
        long k5 = (i9 & 32) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14410L(), oVar2, 6) : j6;
        long k6 = (i9 & 64) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14409K(), oVar2, 6) : j7;
        long k7 = (i9 & 128) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14420V(), oVar2, 6) : j8;
        C2844t tVar2 = (i9 & 256) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k8 = (i9 & 512) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14432d0(), oVar2, 6) : j9;
        long k9 = (i9 & 1024) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14407I(), oVar2, 6) : j10;
        long w2 = (i9 & 2048) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14413O(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long k10 = (i9 & 4096) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14418T(), oVar2, 6) : j12;
        long k11 = (i9 & 8192) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14436f0(), oVar2, 6) : j13;
        long k12 = (i9 & 16384) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14448l0(), oVar2, 6) : j14;
        long w3 = (32768 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14416R(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long k13 = (65536 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14428b0(), oVar2, 6) : j16;
        long k14 = (131072 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14438g0(), oVar2, 6) : j17;
        long k15 = (262144 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14452n0(), oVar2, 6) : j18;
        long w4 = (524288 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14417S(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long k16 = (1048576 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14430c0(), oVar2, 6) : j20;
        long k17 = (2097152 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14451n(), oVar2, 6) : j21;
        long k18 = (4194304 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14460u(), oVar2, 6) : j22;
        long k19 = (8388608 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14427b(), oVar2, 6) : j23;
        long k20 = (16777216 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14445k(), oVar2, 6) : j24;
        long k21 = (33554432 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j25;
        long k22 = (67108864 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j26;
        long w5 = (134217728 & i9) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14429c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j27;
        long k23 = (268435456 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j28;
        long k24 = (536870912 & i9) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j29;
        long k25 = (i9 & 1073741824) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j30;
        long w6 = (i6 & 1) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14429c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j31;
        long k26 = (i6 & 2) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j32;
        long k27 = (i6 & 4) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j33;
        long k28 = (i6 & 8) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j34;
        long w7 = (i6 & 16) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8339t.f22082a.mo14429c(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j35;
        long k29 = (i6 & 32) != 0 ? ColorSchemeKt.m25524k(C8339t.f22082a.mo14462w(), oVar2, 6) : j36;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1357676928, i7, i8, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:626)");
        }
        int i10 = i7 << 6;
        int i11 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | ((i7 << 3) & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i7 >> 24;
        int i13 = i8 << 6;
        int i14 = (i12 & 112) | (i12 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = i8 >> 24;
        int i16 = i3 << 6;
        int i17 = (i15 & 112) | (i15 & 14) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i3 >> 24;
        int i19 = i4 << 6;
        C8189d3 f = mo11555f(k, k2, w, k3, k4, k4, k4, k5, k6, k7, tVar2, k8, k9, w2, k10, k11, k12, w3, k13, k14, k15, w4, k16, k17, k18, k19, k20, k21, k22, w5, k23, k24, k25, w6, k26, k27, k28, w7, k29, oVar, i11, i14, i17, (i18 & 112) | (i18 & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }
}
