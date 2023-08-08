package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.foundation.layout.C2401q1;
import androidx.compose.material3.tokens.C8314j0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.r1 */
public final class C8273r1 {
    @C12579k

    /* renamed from: a */
    public static final C8273r1 f20440a = new C8273r1();

    /* renamed from: b */
    public static final int f20441b = 0;

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: a */
    public final long mo12951a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1949394041);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1949394041, i, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:263)");
        }
        long k = ColorSchemeKt.m25524k(C8314j0.f21426a.mo13830m(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C11314h(name = "getWindowInsets")
    @C12579k
    /* renamed from: b */
    public final C2354e1 mo12952b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1546379058);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1546379058, i, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:270)");
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
