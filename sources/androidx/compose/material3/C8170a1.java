package androidx.compose.material3;

import androidx.compose.material3.tokens.C8293c0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.a1 */
public final class C8170a1 {
    @C12579k

    /* renamed from: a */
    public static final C8170a1 f19981a = new C8170a1();

    /* renamed from: b */
    public static final float f19982b;

    /* renamed from: c */
    public static final float f19983c;

    /* renamed from: d */
    public static final float f19984d;

    /* renamed from: e */
    public static final int f19985e = 0;

    static {
        C8293c0 c0Var = C8293c0.f20784a;
        f19982b = c0Var.mo13237d();
        f19983c = c0Var.mo13246m();
        f19984d = c0Var.mo13235b();
    }

    /* renamed from: a */
    public final float mo12441a() {
        return f19984d;
    }

    /* renamed from: b */
    public final float mo12442b() {
        return f19982b;
    }

    /* renamed from: c */
    public final float mo12443c() {
        return f19983c;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: d */
    public final C15218g4 mo12444d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1052444143);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1052444143, i, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1133)");
        }
        C15218g4 f = ShapesKt.m26127f(C8293c0.f20784a.mo13238e(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final C8216i2 mo12445e(long j, long j2, long j3, long j4, float f, float f2, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f3;
        float f4;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-324924235);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8293c0.f20784a.mo13228R(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = C15240j2.f37547b.mo42850s();
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8293c0.f20784a.mo13243j(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.f37547b.mo42850s();
        } else {
            j8 = j4;
        }
        if ((i2 & 16) != 0) {
            f3 = C8293c0.f20784a.mo13229S();
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = C8293c0.f20784a.mo13259z();
        } else {
            f4 = f2;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-324924235, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1115)");
        }
        C8216i2 i2Var = new C8216i2(j5, j6, j7, j8, f3, f4, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i2Var;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8229j2 mo12446f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @C12580l C8592o oVar, int i, int i2, int i3) {
        C8592o oVar2 = oVar;
        int i4 = i3;
        oVar2.mo14918M(1312840646);
        long s = (i4 & 1) != 0 ? C15240j2.f37547b.mo42850s() : j;
        long k = (i4 & 2) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13226P(), oVar2, 6) : j2;
        long k2 = (i4 & 4) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13227Q(), oVar2, 6) : j3;
        long k3 = (i4 & 8) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13233W(), oVar2, 6) : j4;
        long s2 = (i4 & 16) != 0 ? C15240j2.f37547b.mo42850s() : j5;
        long w = (i4 & 32) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8293c0.f20784a.mo13239f(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long w2 = (i4 & 64) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8293c0.f20784a.mo13240g(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long w3 = (i4 & 128) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8293c0.f20784a.mo13242i(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long k4 = (i4 & 256) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13247n(), oVar2, 6) : j9;
        long w4 = (i4 & 512) != 0 ? C15240j2.m66080w(ColorSchemeKt.m25524k(C8293c0.f20784a.mo13241h(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long k5 = (i4 & 1024) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13257x(), oVar2, 6) : j11;
        long k6 = (i4 & 2048) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13258y(), oVar2, 6) : j12;
        long k7 = (i4 & 4096) != 0 ? ColorSchemeKt.m25524k(C8293c0.f20784a.mo13214D(), oVar2, 6) : j13;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1312840646, i, i2, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1038)");
        }
        C8229j2 j2Var = new C8229j2(s, k, k2, k3, s2, w, w2, w3, k4, w4, k5, k6, k7, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j2Var;
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public final SelectableChipElevation mo12447g(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(1745270109);
        if ((i2 & 1) != 0) {
            f7 = C8293c0.f20784a.mo13236c();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = f7;
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = f7;
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = f7;
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = C8293c0.f20784a.mo13244k();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1745270109, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1086)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return selectableChipElevation;
    }
}
