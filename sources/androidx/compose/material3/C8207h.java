package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2401q1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8292c;
import androidx.compose.material3.tokens.C8337s;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.h */
public final class C8207h {
    @C12579k

    /* renamed from: a */
    public static final C8207h f20146a = new C8207h();

    /* renamed from: b */
    public static final float f20147b = C8292c.f20752a.mo13207b();
    @C12579k

    /* renamed from: c */
    public static final C2366i0 f20148c = PaddingKt.m10018e(AppBarKt.f19155a, AppBarKt.m25401u(), AppBarKt.f19155a, 0.0f, 8, (Object) null);

    /* renamed from: d */
    public static final int f20149d = 0;

    @C8540g
    @C11314h(name = "getBottomAppBarFabColor")
    /* renamed from: a */
    public final long mo12617a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1464561486);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1464561486, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:999)");
        }
        long k = ColorSchemeKt.m25524k(C8337s.f22023a.mo14370a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: b */
    public final long mo12618b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-368340078);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-368340078, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:972)");
        }
        long k = ColorSchemeKt.m25524k(C8292c.f20752a.mo13206a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    /* renamed from: c */
    public final float mo12619c() {
        return f20147b;
    }

    @C12579k
    /* renamed from: d */
    public final C2366i0 mo12620d() {
        return f20148c;
    }

    @C8540g
    @C11314h(name = "getWindowInsets")
    @C12579k
    /* renamed from: e */
    public final C2354e1 mo12621e(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(688896409);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(688896409, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:992)");
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
