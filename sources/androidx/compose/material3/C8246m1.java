package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.foundation.layout.C2401q1;
import androidx.compose.material3.tokens.C8308h0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.m1 */
public final class C8246m1 {
    @C12579k

    /* renamed from: a */
    public static final C8246m1 f20359a = new C8246m1();

    /* renamed from: b */
    public static final float f20360b = C8308h0.f21270a.mo13682n();

    /* renamed from: c */
    public static final int f20361c = 0;

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: a */
    public final long mo12853a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1528098623);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1528098623, i, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:265)");
        }
        long k = ColorSchemeKt.m25524k(C8308h0.f21270a.mo13681m(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    /* renamed from: b */
    public final float mo12854b() {
        return f20360b;
    }

    @C8540g
    @C11314h(name = "getWindowInsets")
    @C12579k
    /* renamed from: c */
    public final C2354e1 mo12855c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1938678202);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1938678202, i, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:272)");
        }
        C2354e1 a = C8178b3.m26962a(C2354e1.f6262a, oVar, 8);
        C2401q1.C2402a aVar = C2401q1.f6318b;
        C2354e1 j = C2358f1.m10397j(a, C2401q1.m10555s(aVar.mo8146g(), aVar.mo8144e()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }
}
