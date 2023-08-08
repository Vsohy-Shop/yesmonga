package androidx.compose.material3;

import androidx.compose.material3.tokens.C8286a;
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
/* renamed from: androidx.compose.material3.f */
public final class C8196f {
    @C12579k

    /* renamed from: a */
    public static final C8196f f20117a = new C8196f();

    /* renamed from: b */
    public static final float f20118b;

    /* renamed from: c */
    public static final float f20119c;

    /* renamed from: d */
    public static final int f20120d = 0;

    static {
        C8286a aVar = C8286a.f20612a;
        f20118b = aVar.mo13082a();
        f20119c = aVar.mo13107z();
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8362w mo12568a(long j, long j2, float f, @C12580l C8592o oVar, int i, int i2) {
        long j3;
        long j4;
        float f2;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(382372847);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.m25524k(C8286a.f20612a.mo13100s(), oVar2, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8286a.f20612a.mo13098q(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            f2 = C8286a.f20612a.mo13101t();
        } else {
            f2 = f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(382372847, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:703)");
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
    /* renamed from: b */
    public final C8366x mo12569b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @C12580l C8592o oVar, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        C8592o oVar2 = oVar;
        int i3 = i2;
        oVar2.mo14918M(-391745725);
        if ((i3 & 1) != 0) {
            j9 = C15240j2.f37547b.mo42850s();
        } else {
            j9 = j;
        }
        if ((i3 & 2) != 0) {
            j10 = ColorSchemeKt.m25524k(C8286a.f20612a.mo13078A(), oVar2, 6);
        } else {
            j10 = j2;
        }
        if ((i3 & 4) != 0) {
            j11 = ColorSchemeKt.m25524k(C8286a.f20612a.mo13106y(), oVar2, 6);
        } else {
            j11 = j3;
        }
        if ((i3 & 8) != 0) {
            j12 = j11;
        } else {
            j12 = j4;
        }
        if ((i3 & 16) != 0) {
            j13 = C15240j2.f37547b.mo42850s();
        } else {
            j13 = j5;
        }
        if ((i3 & 32) != 0) {
            j14 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8286a.f20612a.mo13086e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j6;
        }
        if ((i3 & 64) != 0) {
            j15 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8286a.f20612a.mo13085d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j7;
        }
        if ((i3 & 128) != 0) {
            j16 = j15;
        } else {
            j16 = j8;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-391745725, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:643)");
        }
        C8366x xVar = new C8366x(j9, j10, j11, j12, j13, j14, j15, j16, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return xVar;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final ChipElevation mo12570c(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(245366099);
        if ((i2 & 1) != 0) {
            f7 = C8286a.f20612a.mo13097p();
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
            f11 = C8286a.f20612a.mo13087f();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(245366099, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:679)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return chipElevation;
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public final C8366x mo12571d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @C12580l C8592o oVar, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        C8592o oVar2 = oVar;
        int i3 = i2;
        oVar2.mo14918M(-535762675);
        if ((i3 & 1) != 0) {
            j9 = ColorSchemeKt.m25524k(C8286a.f20612a.mo13090i(), oVar2, 6);
        } else {
            j9 = j;
        }
        if ((i3 & 2) != 0) {
            j10 = ColorSchemeKt.m25524k(C8286a.f20612a.mo13078A(), oVar2, 6);
        } else {
            j10 = j2;
        }
        if ((i3 & 4) != 0) {
            j11 = ColorSchemeKt.m25524k(C8286a.f20612a.mo13106y(), oVar2, 6);
        } else {
            j11 = j3;
        }
        if ((i3 & 8) != 0) {
            j12 = j11;
        } else {
            j12 = j4;
        }
        if ((i3 & 16) != 0) {
            j13 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8286a.f20612a.mo13092k(), oVar2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j13 = j5;
        }
        if ((i3 & 32) != 0) {
            j14 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8286a.f20612a.mo13086e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j6;
        }
        if ((i3 & 64) != 0) {
            j15 = C15240j2.m66080w(ColorSchemeKt.m25524k(C8286a.f20612a.mo13085d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j7;
        }
        if ((i3 & 128) != 0) {
            j16 = j15;
        } else {
            j16 = j8;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-535762675, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:728)");
        }
        C8366x xVar = new C8366x(j9, j10, j11, j12, j13, j14, j15, j16, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return xVar;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final ChipElevation mo12572e(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(1457698077);
        if ((i2 & 1) != 0) {
            f7 = C8286a.f20612a.mo13091j();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = C8286a.f20612a.mo13096o();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = C8286a.f20612a.mo13094m();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = C8286a.f20612a.mo13095n();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = C8286a.f20612a.mo13087f();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = C8286a.f20612a.mo13093l();
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1457698077, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:765)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return chipElevation;
    }

    /* renamed from: f */
    public final float mo12573f() {
        return f20118b;
    }

    /* renamed from: g */
    public final float mo12574g() {
        return f20119c;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: h */
    public final C15218g4 mo12575h(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1988153916);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1988153916, i, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:782)");
        }
        C15218g4 f = ShapesKt.m26127f(C8286a.f20612a.mo13083b(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }
}
