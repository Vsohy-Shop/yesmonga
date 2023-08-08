package androidx.compose.material3;

import androidx.compose.material3.tokens.C8299e0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.e1 */
public final class C8193e1 {
    @C12579k

    /* renamed from: a */
    public static final C8193e1 f20111a = new C8193e1();

    /* renamed from: b */
    public static final float f20112b = C8299e0.f21005a.mo13435b();

    /* renamed from: c */
    public static final int f20113c = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8187d1 mo12557a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @C12580l C8592o oVar, int i, int i2) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        C8592o oVar2 = oVar;
        int i3 = i2;
        oVar2.mo14918M(-352515689);
        if ((i3 & 1) != 0) {
            j10 = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13434a(), oVar2, 6);
        } else {
            j10 = j;
        }
        if ((i3 & 2) != 0) {
            j11 = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13453t(), oVar2, 6);
        } else {
            j11 = j2;
        }
        if ((i3 & 4) != 0) {
            j12 = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13410B(), oVar2, 6);
        } else {
            j12 = j3;
        }
        if ((i3 & 8) != 0) {
            j13 = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13418J(), oVar2, 6);
        } else {
            j13 = j4;
        }
        if ((i3 & 16) != 0) {
            j14 = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13425Q(), oVar2, 6);
        } else {
            j14 = j5;
        }
        if ((i3 & 32) != 0) {
            j15 = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13428T(), oVar2, 6);
        } else {
            j15 = j6;
        }
        if ((i3 & 64) != 0) {
            C8299e0 e0Var = C8299e0.f21005a;
            j16 = C15240j2.m66080w(ColorSchemeKt.m25524k(e0Var.mo13437d(), oVar2, 6), e0Var.mo13438e(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j16 = j7;
        }
        if ((i3 & 128) != 0) {
            C8299e0 e0Var2 = C8299e0.f21005a;
            j17 = C15240j2.m66080w(ColorSchemeKt.m25524k(e0Var2.mo13439f(), oVar2, 6), e0Var2.mo13440g(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j8;
        }
        if ((i3 & 256) != 0) {
            C8299e0 e0Var3 = C8299e0.f21005a;
            j18 = C15240j2.m66080w(ColorSchemeKt.m25524k(e0Var3.mo13441h(), oVar2, 6), e0Var3.mo13442i(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j9;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-352515689, i, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:301)");
        }
        C8187d1 d1Var = new C8187d1(j10, j11, j12, j13, j14, j15, j16, j17, j18, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d1Var;
    }

    @C8540g
    @C8582l1
    @C11314h(name = "getContainerColor")
    /* renamed from: b */
    public final long mo12558b(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1253579929, i, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:276)");
        }
        long k = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13434a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return k;
    }

    @C8540g
    @C8582l1
    @C11314h(name = "getContentColor")
    /* renamed from: c */
    public final long mo12559c(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1076068327, i, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:281)");
        }
        long k = ColorSchemeKt.m25524k(C8299e0.f21005a.mo13453t(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return k;
    }

    /* renamed from: d */
    public final float mo12560d() {
        return f20112b;
    }

    @C11314h(name = "getShape")
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: e */
    public final C15218g4 mo12561e(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-496871597, i, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:271)");
        }
        C15218g4 f = ShapesKt.m26127f(C8299e0.f21005a.mo13436c(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return f;
    }
}
