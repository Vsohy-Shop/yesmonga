package androidx.compose.material3;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.foundation.layout.C2401q1;
import androidx.compose.material3.tokens.C8309h1;
import androidx.compose.material3.tokens.C8312i1;
import androidx.compose.material3.tokens.C8315j1;
import androidx.compose.material3.tokens.C8318k1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8567o(parameters = 0)
public final class TopAppBarDefaults {
    @C12579k

    /* renamed from: a */
    public static final TopAppBarDefaults f19955a = new TopAppBarDefaults();

    /* renamed from: b */
    public static final int f19956b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8270q3 mo12402a(long j, long j2, long j3, long j4, long j5, @C12580l C8592o oVar, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1896017784);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.m25524k(C8315j1.f21452a.mo13846c(), oVar2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m25514a(C8215i1.f20180a.mo12652a(oVar2, 6), j6, C8318k1.f21543a.mo13935j());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.m25524k(C8315j1.f21452a.mo13853j(), oVar2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.m25524k(C8315j1.f21452a.mo13851h(), oVar2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.m25524k(C8315j1.f21452a.mo13856m(), oVar2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1896017784, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:622)");
        }
        C8270q3 q3Var = new C8270q3(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return q3Var;
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: b */
    public final C8275r3 mo12403b(@C12580l TopAppBarState topAppBarState, @C12580l C11289a<Boolean> aVar, @C12580l C1968g<Float> gVar, @C12580l C2013v<Float> vVar, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(959086674);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.m25403w(0.0f, 0.0f, 0.0f, oVar, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = TopAppBarDefaults$enterAlwaysScrollBehavior$1.f19957f;
        }
        if ((i2 & 4) != 0) {
            gVar = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 8) != 0) {
            vVar = C2046v.m8765b(oVar, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(959086674, i, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:735)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, gVar, vVar, aVar);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return enterAlwaysScrollBehavior;
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8275r3 mo12404c(@C12580l TopAppBarState topAppBarState, @C12580l C11289a<Boolean> aVar, @C12580l C1968g<Float> gVar, @C12580l C2013v<Float> vVar, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(-1757023234);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.m25403w(0.0f, 0.0f, 0.0f, oVar, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = TopAppBarDefaults$exitUntilCollapsedScrollBehavior$1.f19958f;
        }
        if ((i2 & 4) != 0) {
            gVar = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 8) != 0) {
            vVar = C2046v.m8765b(oVar, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1757023234, i, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:768)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, gVar, vVar, aVar);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return exitUntilCollapsedScrollBehavior;
    }

    @C8540g
    @C11314h(name = "getWindowInsets")
    @C12579k
    /* renamed from: d */
    public final C2354e1 mo12405d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(2143182847);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:607)");
        }
        C2354e1 a = C8178b3.m26962a(C2354e1.f6262a, oVar, 8);
        C2401q1.C2402a aVar = C2401q1.f6318b;
        C2354e1 j = C2358f1.m10397j(a, C2401q1.m10555s(aVar.mo8146g(), aVar.mo8150k()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final C8270q3 mo12406e(long j, long j2, long j3, long j4, long j5, @C12580l C8592o oVar, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-1471507700);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.m25524k(C8309h1.f21296a.mo13695a(), oVar2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m25514a(C8215i1.f20180a.mo12652a(oVar2, 6), j6, C8318k1.f21543a.mo13935j());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.m25524k(C8309h1.f21296a.mo13702h(), oVar2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.m25524k(C8309h1.f21296a.mo13700f(), oVar2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.m25524k(C8309h1.f21296a.mo13704j(), oVar2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1471507700, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:684)");
        }
        C8270q3 q3Var = new C8270q3(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return q3Var;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8270q3 mo12407f(long j, long j2, long j3, long j4, long j5, @C12580l C8592o oVar, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(-582474442);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.m25524k(C8312i1.f21390a.mo13785a(), oVar2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m25514a(C8215i1.f20180a.mo12652a(oVar2, 6), j6, C8318k1.f21543a.mo13935j());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.m25524k(C8312i1.f21390a.mo13792h(), oVar2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.m25524k(C8312i1.f21390a.mo13790f(), oVar2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.m25524k(C8312i1.f21390a.mo13794j(), oVar2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-582474442, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:653)");
        }
        C8270q3 q3Var = new C8270q3(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return q3Var;
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: g */
    public final C8275r3 mo12408g(@C12580l TopAppBarState topAppBarState, @C12580l C11289a<Boolean> aVar, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(286497075);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.m25403w(0.0f, 0.0f, 0.0f, oVar, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = TopAppBarDefaults$pinnedScrollBehavior$1.f19959f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(286497075, i, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:713)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, aVar);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return pinnedScrollBehavior;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28049a, message = "Use topAppBarColors instead.", replaceWith = @C11587t0(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @C12579k
    /* renamed from: h */
    public final C8270q3 mo12409h(long j, long j2, long j3, long j4, long j5, @C12580l C8592o oVar, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar2.mo14918M(-1717201472);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13926a(), oVar2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m25514a(C8215i1.f20180a.mo12652a(oVar2, 6), j6, C8318k1.f21543a.mo13935j());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13933h(), oVar2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13931f(), oVar2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13936k(), oVar2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1717201472, i3, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:584)");
        }
        C8270q3 i4 = mo12410i(j6, j7, j8, j9, j10, oVar, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i4;
    }

    @C8540g
    @C12579k
    /* renamed from: i */
    public final C8270q3 mo12410i(long j, long j2, long j3, long j4, long j5, @C12580l C8592o oVar, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(2142919275);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13926a(), oVar2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m25514a(C8215i1.f20180a.mo12652a(oVar2, 6), j6, C8318k1.f21543a.mo13935j());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13933h(), oVar2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13931f(), oVar2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.m25524k(C8318k1.f21543a.mo13936k(), oVar2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2142919275, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:545)");
        }
        C8270q3 q3Var = new C8270q3(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return q3Var;
    }
}
