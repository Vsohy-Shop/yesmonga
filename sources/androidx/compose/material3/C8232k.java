package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8300e1;
import androidx.compose.material3.tokens.C8319l;
import androidx.compose.material3.tokens.C8320l0;
import androidx.compose.material3.tokens.C8341u;
import androidx.compose.material3.tokens.C8349y;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,956:1\n154#2:957\n154#2:958\n154#2:959\n154#2:960\n154#2:961\n154#2:962\n154#2:963\n154#2:964\n154#2:965\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n738#1:957\n451#1:958\n452#1:959\n471#1:960\n482#1:961\n497#1:962\n512#1:963\n518#1:964\n526#1:965\n*E\n"})
/* renamed from: androidx.compose.material3.k */
public final class C8232k {
    @C12579k

    /* renamed from: a */
    public static final C8232k f20254a = new C8232k();

    /* renamed from: b */
    public static final float f20255b;

    /* renamed from: c */
    public static final float f20256c;
    @C12579k

    /* renamed from: d */
    public static final C2366i0 f20257d;

    /* renamed from: e */
    public static final float f20258e;
    @C12579k

    /* renamed from: f */
    public static final C2366i0 f20259f;

    /* renamed from: g */
    public static final float f20260g;
    @C12579k

    /* renamed from: h */
    public static final C2366i0 f20261h;

    /* renamed from: i */
    public static final float f20262i;
    @C12579k

    /* renamed from: j */
    public static final C2366i0 f20263j;

    /* renamed from: k */
    public static final float f20264k = C16483g.m74435M((float) 58);

    /* renamed from: l */
    public static final float f20265l = C16483g.m74435M((float) 40);

    /* renamed from: m */
    public static final float f20266m = C8341u.f22145a.mo14494p();

    /* renamed from: n */
    public static final float f20267n;

    /* renamed from: o */
    public static final int f20268o = 0;

    static {
        float M = C16483g.m74435M((float) 24);
        f20255b = M;
        float f = (float) 8;
        float M2 = C16483g.m74435M(f);
        f20256c = M2;
        C2366i0 d = PaddingKt.m10017d(M, M2, M, M2);
        f20257d = d;
        float f2 = (float) 16;
        float M3 = C16483g.m74435M(f2);
        f20258e = M3;
        f20259f = PaddingKt.m10017d(M3, M2, M, M2);
        float M4 = C16483g.m74435M((float) 12);
        f20260g = M4;
        f20261h = PaddingKt.m10017d(M4, d.mo8093d(), M4, d.mo8090a());
        float M5 = C16483g.m74435M(f2);
        f20262i = M5;
        f20263j = PaddingKt.m10017d(M4, d.mo8093d(), M5, d.mo8090a());
        f20267n = C16483g.m74435M(f);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8226j mo12729a(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-339300779);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8341u.f22145a.mo14479a(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8341u.f22145a.mo14495q(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8341u.f22145a.mo14483e(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8341u.f22145a.mo14486h(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:552)");
        }
        C8226j jVar = new C8226j(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return jVar;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final ButtonElevation mo12730b(float f, float f2, float f3, float f4, float f5, @C12580l C8592o oVar, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        oVar.mo14918M(1827791191);
        if ((i2 & 1) != 0) {
            f6 = C8341u.f22145a.mo14480b();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = C8341u.f22145a.mo14497s();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = C8341u.f22145a.mo14487i();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = C8341u.f22145a.mo14490l();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = C8341u.f22145a.mo14484f();
        } else {
            f10 = f5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:679)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return buttonElevation;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8226j mo12731c(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1507908383);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8319l.f21556a.mo13938a(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8319l.f21556a.mo13955r(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8319l.f21556a.mo13943f(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8319l.f21556a.mo13946i(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1507908383, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:577)");
        }
        C8226j jVar = new C8226j(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return jVar;
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public final ButtonElevation mo12732d(float f, float f2, float f3, float f4, float f5, @C12580l C8592o oVar, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        oVar.mo14918M(1065482445);
        if ((i2 & 1) != 0) {
            f6 = C8319l.f21556a.mo13939b();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = C8319l.f21556a.mo13957t();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = C8319l.f21556a.mo13947j();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = C8319l.f21556a.mo13950m();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = C8319l.f21556a.mo13944g();
        } else {
            f10 = f5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1065482445, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:705)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return buttonElevation;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final C8226j mo12733e(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1670757653);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8349y.f22320a.mo14632a(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8349y.f22320a.mo14648q(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8349y.f22320a.mo14636e(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8349y.f22320a.mo14639h(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1670757653, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:603)");
        }
        C8226j jVar = new C8226j(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return jVar;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final ButtonElevation mo12734f(float f, float f2, float f3, float f4, float f5, @C12580l C8592o oVar, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        oVar.mo14918M(5982871);
        if ((i2 & 1) != 0) {
            f6 = C8349y.f22320a.mo14633b();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = C8349y.f22320a.mo14650s();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = C8349y.f22320a.mo14640i();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = C8349y.f22320a.mo14643l();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = C16483g.m74435M((float) 0);
        } else {
            f10 = f5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(5982871, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:732)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return buttonElevation;
    }

    @C12579k
    /* renamed from: g */
    public final C2366i0 mo12735g() {
        return f20259f;
    }

    @C12579k
    /* renamed from: h */
    public final C2366i0 mo12736h() {
        return f20257d;
    }

    @C8540g
    @C11314h(name = "getElevatedShape")
    @C12579k
    /* renamed from: i */
    public final C15218g4 mo12737i(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(2143958791);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2143958791, i, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:531)");
        }
        C15218g4 f = ShapesKt.m26127f(C8319l.f21556a.mo13941d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getFilledTonalShape")
    @C12579k
    /* renamed from: j */
    public final C15218g4 mo12738j(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-886584987);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-886584987, i, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:534)");
        }
        C15218g4 f = ShapesKt.m26127f(C8349y.f22320a.mo14635d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: k */
    public final float mo12739k() {
        return f20266m;
    }

    /* renamed from: l */
    public final float mo12740l() {
        return f20267n;
    }

    /* renamed from: m */
    public final float mo12741m() {
        return f20265l;
    }

    /* renamed from: n */
    public final float mo12742n() {
        return f20264k;
    }

    @C8540g
    @C11314h(name = "getOutlinedButtonBorder")
    @C12579k
    /* renamed from: o */
    public final C2223i mo12743o(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-563957672);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-563957672, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:749)");
        }
        C8320l0 l0Var = C8320l0.f21582a;
        C2223i a = C2250j.m9695a(l0Var.mo13976q(), ColorSchemeKt.m25524k(l0Var.mo13975p(), oVar, 6));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    @C8540g
    @C11314h(name = "getOutlinedShape")
    @C12579k
    /* renamed from: p */
    public final C15218g4 mo12744p(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-2045213065);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:537)");
        }
        C15218g4 f = ShapesKt.m26127f(C8320l0.f21582a.mo13961b(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: q */
    public final C15218g4 mo12745q(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1234923021);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:528)");
        }
        C15218g4 f = ShapesKt.m26127f(C8341u.f22145a.mo14482d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C12579k
    /* renamed from: r */
    public final C2366i0 mo12746r() {
        return f20261h;
    }

    @C12579k
    /* renamed from: s */
    public final C2366i0 mo12747s() {
        return f20263j;
    }

    @C8540g
    @C11314h(name = "getTextShape")
    @C12579k
    /* renamed from: t */
    public final C15218g4 mo12748t(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-349121587);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:540)");
        }
        C15218g4 f = ShapesKt.m26127f(C8300e1.f21031a.mo13461b(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: u */
    public final C8226j mo12749u(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-1778526249);
        if ((i2 & 1) != 0) {
            j5 = C15240j2.f37547b.mo42850s();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8320l0.f21582a.mo13973n(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.f37547b.mo42850s();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8320l0.f21582a.mo13963d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:629)");
        }
        C8226j jVar = new C8226j(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return jVar;
    }

    @C8540g
    @C12579k
    /* renamed from: v */
    public final C8226j mo12750v(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-1402274782);
        if ((i2 & 1) != 0) {
            j5 = C15240j2.f37547b.mo42850s();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8300e1.f21031a.mo13470k(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = C15240j2.f37547b.mo42850s();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8300e1.f21031a.mo13463d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:653)");
        }
        C8226j jVar = new C8226j(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return jVar;
    }
}
