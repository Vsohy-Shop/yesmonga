package androidx.compose.material3;

import androidx.compose.material3.tokens.C8328o;
import androidx.compose.material3.tokens.C8331p;
import androidx.compose.material3.tokens.C8333q;
import androidx.compose.material3.tokens.C8335r;
import androidx.compose.p004ui.graphics.C15218g4;
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
@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,619:1\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n470#1:620\n471#1:621\n472#1:622\n473#1:623\n*E\n"})
/* renamed from: androidx.compose.material3.u0 */
public final class C8355u0 {
    @C12579k

    /* renamed from: a */
    public static final C8355u0 f22430a = new C8355u0();

    /* renamed from: b */
    public static final float f22431b = C8331p.f21854a.mo14217k();

    /* renamed from: c */
    public static final int f22432c = 0;

    /* renamed from: b */
    public static /* synthetic */ FloatingActionButtonElevation m29335b(C8355u0 u0Var, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C16483g.m74435M((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return u0Var.mo14719a(f, f2, f3, f4);
    }

    @C12579k
    /* renamed from: a */
    public final FloatingActionButtonElevation mo14719a(float f, float f2, float f3, float f4) {
        return new FloatingActionButtonElevation(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final FloatingActionButtonElevation mo14720c(float f, float f2, float f3, float f4, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(-241106249);
        if ((i2 & 1) != 0) {
            f = C8335r.f21976a.mo14326b();
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = C8335r.f21976a.mo14340p();
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = C8335r.f21976a.mo14330f();
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = C8335r.f21976a.mo14332h();
        }
        float f8 = f4;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-241106249, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:423)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f5, f6, f7, f8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return floatingActionButtonElevation;
    }

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: d */
    public final long mo14721d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1855656391);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1855656391, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:409)");
        }
        long k = ColorSchemeKt.m25524k(C8335r.f21976a.mo14325a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C11314h(name = "getExtendedFabShape")
    @C12579k
    /* renamed from: e */
    public final C15218g4 mo14722e(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-536021915);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-536021915, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:405)");
        }
        C15218g4 f = ShapesKt.m26127f(C8328o.f21766a.mo14131d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: f */
    public final float mo14723f() {
        return f22431b;
    }

    @C8540g
    @C11314h(name = "getLargeShape")
    @C12579k
    /* renamed from: g */
    public final C15218g4 mo14724g(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1835912187);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1835912187, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:402)");
        }
        C15218g4 f = ShapesKt.m26127f(C8331p.f21854a.mo14210d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: h */
    public final C15218g4 mo14725h(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-53247565);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-53247565, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:396)");
        }
        C15218g4 f = ShapesKt.m26127f(C8335r.f21976a.mo14328d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getSmallShape")
    @C12579k
    /* renamed from: i */
    public final C15218g4 mo14726i(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(394933381);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(394933381, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:399)");
        }
        C15218g4 f = ShapesKt.m26127f(C8333q.f21953a.mo14307d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: j */
    public final FloatingActionButtonElevation mo14727j(float f, float f2, float f3, float f4, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(-285065125);
        if ((i2 & 1) != 0) {
            f = C8335r.f21976a.mo14336l();
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = C8335r.f21976a.mo14339o();
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = C8335r.f21976a.mo14337m();
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = C8335r.f21976a.mo14338n();
        }
        float f8 = f4;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-285065125, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:446)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f5, f6, f7, f8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return floatingActionButtonElevation;
    }
}
