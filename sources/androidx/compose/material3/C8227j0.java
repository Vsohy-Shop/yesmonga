package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.foundation.layout.C2401q1;
import androidx.compose.material3.tokens.C8311i0;
import androidx.compose.material3.tokens.C8342u0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.j0 */
public final class C8227j0 {
    @C12579k

    /* renamed from: a */
    public static final C8227j0 f20227a = new C8227j0();

    /* renamed from: b */
    public static final float f20228b;

    /* renamed from: c */
    public static final float f20229c;

    /* renamed from: d */
    public static final float f20230d;

    /* renamed from: e */
    public static final float f20231e;

    /* renamed from: f */
    public static final int f20232f = 0;

    static {
        C8311i0 i0Var = C8311i0.f21364a;
        f20228b = i0Var.mo13757F();
        f20229c = i0Var.mo13758G();
        f20230d = i0Var.mo13758G();
        f20231e = i0Var.mo13775q();
    }

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: a */
    public final long mo12707a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1797317261);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1797317261, i, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:615)");
        }
        long k = ColorSchemeKt.m25524k(C8311i0.f21364a.mo13772n(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    /* renamed from: b */
    public final float mo12708b() {
        return f20230d;
    }

    /* renamed from: c */
    public final float mo12709c() {
        return f20231e;
    }

    /* renamed from: d */
    public final float mo12710d() {
        return f20228b;
    }

    /* renamed from: e */
    public final float mo12711e() {
        return f20229c;
    }

    @C8540g
    @C11314h(name = "getScrimColor")
    /* renamed from: f */
    public final long mo12712f(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1055074989);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1055074989, i, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:612)");
        }
        long w = C15240j2.m66080w(ColorSchemeKt.m25524k(C8342u0.f22170a.mo14500a(), oVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return w;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: g */
    public final C15218g4 mo12713g(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(928378975);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(928378975, i, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:608)");
        }
        C15218g4 f = ShapesKt.m26127f(C8311i0.f21364a.mo13773o(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getWindowInsets")
    @C12579k
    /* renamed from: h */
    public final C2354e1 mo12714h(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-909973510);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-909973510, i, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:625)");
        }
        C2354e1 a = C8178b3.m26962a(C2354e1.f6262a, oVar, 8);
        C2401q1.C2402a aVar = C2401q1.f6318b;
        C2354e1 j = C2358f1.m10397j(a, C2401q1.m10555s(aVar.mo8151l(), aVar.mo8149j()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }
}
