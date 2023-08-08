package androidx.compose.material3;

import androidx.compose.material3.tokens.C8294c1;
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

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.v2 */
public final class C8361v2 {
    @C12579k

    /* renamed from: a */
    public static final C8361v2 f22440a = new C8361v2();

    /* renamed from: b */
    public static final float f22441b;

    /* renamed from: c */
    public static final float f22442c;

    /* renamed from: d */
    public static final int f22443d = 0;

    static {
        C8294c1 c1Var = C8294c1.f20823a;
        f22441b = c1Var.mo13264a();
        f22442c = c1Var.mo13261B();
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8366x mo14741a(long j, long j2, long j3, long j4, long j5, long j6, @C12580l C8592o oVar, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1269423125);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.m25524k(C8294c1.f20823a.mo13272i(), oVar2, 6);
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.m25524k(C8294c1.f20823a.mo13288y(), oVar2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = C8215i1.f20180a.mo12652a(oVar2, 6).mo14851q();
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8294c1.f20823a.mo13274k(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8294c1.f20823a.mo13267d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = C15240j2.m66080w(C8215i1.f20180a.mo12652a(oVar2, 6).mo14850p(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1269423125, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1243)");
        }
        C15240j2.C15241a aVar = C15240j2.f37547b;
        C8366x xVar = new C8366x(j7, j8, j9, aVar.mo42851u(), j10, j11, j12, aVar.mo42851u(), (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return xVar;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final ChipElevation mo14742b(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(1118088467);
        if ((i2 & 1) != 0) {
            f7 = C8294c1.f20823a.mo13273j();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = C8294c1.f20823a.mo13278o();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = C8294c1.f20823a.mo13276m();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = C8294c1.f20823a.mo13277n();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = C8294c1.f20823a.mo13269f();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = C8294c1.f20823a.mo13275l();
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1118088467, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1280)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return chipElevation;
    }

    /* renamed from: c */
    public final float mo14743c() {
        return f22441b;
    }

    /* renamed from: d */
    public final float mo14744d() {
        return f22442c;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: e */
    public final C15218g4 mo14745e(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(641188183);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(641188183, i, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1297)");
        }
        C15218g4 f = ShapesKt.m26127f(C8294c1.f20823a.mo13265b(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8362w mo14746f(long j, long j2, float f, @C12580l C8592o oVar, int i, int i2) {
        long j3;
        long j4;
        float f2;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(439283919);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.m25524k(C8294c1.f20823a.mo13282s(), oVar2, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8294c1.f20823a.mo13280q(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            f2 = C8294c1.f20823a.mo13283t();
        } else {
            f2 = f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(439283919, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1220)");
        }
        C8362w wVar = new C8362w(j3, j4, f2, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return wVar;
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public final C8366x mo14747g(long j, long j2, long j3, long j4, long j5, long j6, @C12580l C8592o oVar, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1882647883);
        if ((i2 & 1) != 0) {
            j7 = C15240j2.f37547b.mo42850s();
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.m25524k(C8294c1.f20823a.mo13288y(), oVar2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = ColorSchemeKt.m25524k(C8294c1.f20823a.mo13260A(), oVar2, 6);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = C15240j2.f37547b.mo42850s();
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8294c1.f20823a.mo13267d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8294c1.f20823a.mo13268e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1882647883, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1163)");
        }
        C15240j2.C15241a aVar = C15240j2.f37547b;
        C8366x xVar = new C8366x(j7, j8, j9, aVar.mo42851u(), j10, j11, j12, aVar.mo42851u(), (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return xVar;
    }

    @C8540g
    @C12579k
    /* renamed from: h */
    public final ChipElevation mo14748h(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(1929994057);
        if ((i2 & 1) != 0) {
            f7 = C8294c1.f20823a.mo13279p();
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
            f11 = C8294c1.f20823a.mo13269f();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1929994057, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1196)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return chipElevation;
    }
}
