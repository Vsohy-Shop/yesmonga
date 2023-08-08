package androidx.compose.material3;

import androidx.compose.material3.tokens.C8334q0;
import androidx.compose.material3.tokens.C8340t0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.o3 */
public final class C8259o3 {
    @C12579k

    /* renamed from: a */
    public static final C8259o3 f20406a = new C8259o3();

    /* renamed from: b */
    public static final int f20407b = 0;

    @C8540g
    @C11314h(name = "getPlainTooltipContainerColor")
    /* renamed from: a */
    public final long mo12891a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(102696215);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(102696215, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:362)");
        }
        long k = ColorSchemeKt.m25524k(C8334q0.f21971a.mo14321a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C11314h(name = "getPlainTooltipContainerShape")
    @C12579k
    /* renamed from: b */
    public final C15218g4 mo12892b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(49570325);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(49570325, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:356)");
        }
        C15218g4 f = ShapesKt.m26127f(C8334q0.f21971a.mo14322b(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getPlainTooltipContentColor")
    /* renamed from: c */
    public final long mo12893c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1982928937);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1982928937, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:368)");
        }
        long k = ColorSchemeKt.m25524k(C8334q0.f21971a.mo14323c(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C11314h(name = "getRichTooltipContainerShape")
    @C12579k
    /* renamed from: d */
    public final C15218g4 mo12894d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1138709783);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1138709783, i, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:373)");
        }
        C15218g4 f = ShapesKt.m26127f(C8340t0.f22131a.mo14473h(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final C8183c2 mo12895e(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1498555081);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8340t0.f22131a.mo14471f(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25524k(C8340t0.f22131a.mo14477l(), oVar2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = ColorSchemeKt.m25524k(C8340t0.f22131a.mo14475j(), oVar2, 6);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = ColorSchemeKt.m25524k(C8340t0.f22131a.mo14468c(), oVar2, 6);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1498555081, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:381)");
        }
        C8183c2 c2Var = new C8183c2(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c2Var;
    }
}
