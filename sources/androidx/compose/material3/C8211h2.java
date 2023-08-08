package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2405r1;
import androidx.compose.foundation.text.selection.C2844t;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.C8344v0;
import androidx.compose.material3.tokens.C8346w0;
import androidx.compose.material3.tokens.C8347x;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,746:1\n76#2:747\n76#2:748\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n567#1:747\n605#1:748\n*E\n"})
/* renamed from: androidx.compose.material3.h2 */
public final class C8211h2 {
    @C12579k

    /* renamed from: a */
    public static final C8211h2 f20155a = new C8211h2();

    /* renamed from: b */
    public static final float f20156b;

    /* renamed from: c */
    public static final float f20157c;

    /* renamed from: d */
    public static final int f20158d = 0;

    static {
        C8344v0 v0Var = C8344v0.f22186a;
        f20156b = v0Var.mo14515d();
        f20157c = v0Var.mo14516e();
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8205g2 mo12628a(long j, long j2, @C12580l C8189d3 d3Var, @C12580l C8592o oVar, int i, int i2) {
        long j3;
        long j4;
        C8189d3 d3Var2;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar2.mo14918M(701925149);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14514c(), oVar2, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = ColorSchemeKt.m25524k(C8346w0.f22225a.mo14550d(), oVar2, 6);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            d3Var2 = mo12636i(0, 0, 0, 0, (C2844t) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, oVar, 0, (i3 << 3) & 57344, 16383);
        } else {
            d3Var2 = d3Var;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(701925149, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:525)");
        }
        C8205g2 g2Var = new C8205g2(j3, j4, d3Var2, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return g2Var;
    }

    @C8540g
    @C11314h(name = "getDockedShape")
    @C12579k
    /* renamed from: b */
    public final C15218g4 mo12629b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1447354121);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1447354121, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:511)");
        }
        C15218g4 f = ShapesKt.m26127f(C8346w0.f22225a.mo14551e(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: c */
    public final float mo12630c() {
        return f20156b;
    }

    @C8540g
    @C11314h(name = "getFullScreenShape")
    @C12579k
    /* renamed from: d */
    public final C15218g4 mo12631d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-2009956471);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2009956471, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:508)");
        }
        C15218g4 f = ShapesKt.m26127f(C8346w0.f22225a.mo14553g(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: e */
    public final float mo12632e() {
        return f20157c;
    }

    @C8540g
    @C11314h(name = "getInputFieldShape")
    @C12579k
    /* renamed from: f */
    public final C15218g4 mo12633f(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1770571533);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1770571533, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:504)");
        }
        C15218g4 f = ShapesKt.m26127f(C8344v0.f22186a.mo14517f(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getWindowInsets")
    @C12579k
    /* renamed from: g */
    public final C2354e1 mo12634g(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1795925906);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1795925906, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:514)");
        }
        C2354e1 y = C2405r1.m10623y(C2354e1.f6262a, oVar, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return y;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    /* renamed from: h */
    public final /* synthetic */ C8189d3 mo12635h(long j, long j2, long j3, C2844t tVar, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, C8592o oVar, int i, int i2, int i3) {
        long j12;
        long j13;
        long j14;
        C2844t tVar2;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        C8592o oVar2 = oVar;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        oVar2.mo14918M(1842555178);
        if ((i6 & 1) != 0) {
            j12 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14520i(), oVar2, 6);
        } else {
            j12 = j;
        }
        if ((i6 & 2) != 0) {
            j13 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j13 = j2;
        }
        if ((i6 & 4) != 0) {
            j14 = ColorSchemeKt.m25524k(C8347x.f22266a.mo14591c(), oVar2, 6);
        } else {
            j14 = j3;
        }
        if ((i6 & 8) != 0) {
            tVar2 = (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c());
        } else {
            tVar2 = tVar;
        }
        if ((i6 & 16) != 0) {
            j15 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14522k(), oVar2, 6);
        } else {
            j15 = j4;
        }
        if ((i6 & 32) != 0) {
            j16 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14522k(), oVar2, 6);
        } else {
            j16 = j5;
        }
        if ((i6 & 64) != 0) {
            j17 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14606l(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j6;
        }
        if ((i6 & 128) != 0) {
            j18 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14526o(), oVar2, 6);
        } else {
            j18 = j7;
        }
        if ((i6 & 256) != 0) {
            j19 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14526o(), oVar2, 6);
        } else {
            j19 = j8;
        }
        if ((i6 & 512) != 0) {
            j20 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14608n(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j20 = j9;
        }
        if ((i6 & 1024) != 0) {
            j21 = ColorSchemeKt.m25524k(C8344v0.f22186a.mo14524m(), oVar2, 6);
        } else {
            j21 = j10;
        }
        if ((i6 & 2048) != 0) {
            j22 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j22 = j11;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1842555178, i4, i5, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:599)");
        }
        int i7 = i4 << 3;
        int i8 = i5 << 6;
        C8189d3 i9 = mo12636i(j12, j12, j13, j14, tVar2, j15, j16, j17, j18, j19, j20, j21, j21, j22, oVar, (i4 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i4 >> 27) & 14) | ((i5 << 3) & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i9;
    }

    @C8540g
    @C12579k
    /* renamed from: i */
    public final C8189d3 mo12636i(long j, long j2, long j3, long j4, @C12580l C2844t tVar, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @C12580l C8592o oVar, int i, int i2, int i3) {
        C8592o oVar2 = oVar;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        oVar2.mo14918M(-2048506052);
        long k = (i6 & 1) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14520i(), oVar2, 6) : j;
        long k2 = (i6 & 2) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14520i(), oVar2, 6) : j2;
        long w = (i6 & 4) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long k3 = (i6 & 8) != 0 ? ColorSchemeKt.m25524k(C8347x.f22266a.mo14591c(), oVar2, 6) : j4;
        C2844t tVar2 = (i6 & 16) != 0 ? (C2844t) oVar2.mo15032w(TextSelectionColorsKt.m12954c()) : tVar;
        long k4 = (i6 & 32) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14522k(), oVar2, 6) : j5;
        long k5 = (i6 & 64) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14522k(), oVar2, 6) : j6;
        long w2 = (i6 & 128) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14606l(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long k6 = (i6 & 256) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14526o(), oVar2, 6) : j8;
        long k7 = (i6 & 512) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14526o(), oVar2, 6) : j9;
        long w3 = (i6 & 1024) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14608n(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long k8 = (i6 & 2048) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14524m(), oVar2, 6) : j11;
        long k9 = (i6 & 4096) != 0 ? ColorSchemeKt.m25524k(C8344v0.f22186a.mo14524m(), oVar2, 6) : j12;
        long w4 = (i6 & 8192) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8347x.f22266a.mo14604j(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2048506052, i4, i5, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:560)");
        }
        int i7 = i5 << 18;
        C8189d3 i8 = TextFieldDefaults.f19839a.mo12188i(k, k2, w, 0, 0, 0, 0, 0, k3, 0, tVar2, 0, 0, 0, 0, k4, k5, w2, 0, k6, k7, w3, 0, 0, 0, 0, 0, k8, k9, w4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, oVar, (i4 & 14) | (i4 & 112) | (i4 & 896) | ((i4 << 15) & 234881024), ((i4 >> 12) & 14) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | ((i5 << 3) & 112) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i8;
    }
}
