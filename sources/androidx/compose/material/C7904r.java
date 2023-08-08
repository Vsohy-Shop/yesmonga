package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,132:1\n76#2:133\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n77#1:133\n*E\n"})
/* renamed from: androidx.compose.material.r */
public final class C7904r {
    @C12579k

    /* renamed from: a */
    public static final C7904r f18969a = new C7904r();

    /* renamed from: b */
    public static final int f18970b = 0;

    @C8540g
    /* renamed from: a */
    public final float mo10990a(float f, float f2, C8592o oVar, int i) {
        oVar.mo14918M(-1528360391);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1528360391, i, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)");
        }
        long M = ((C15240j2) oVar.mo15032w(ContentColorKt.m13406a())).mo42833M();
        if (!C7933t0.f19075a.mo11075a(oVar, 6).mo10976o() ? ((double) C15258l2.m66190o(M)) >= 0.5d : ((double) C15258l2.m66190o(M)) <= 0.5d) {
            f = f2;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getDisabled")
    /* renamed from: b */
    public final float mo10991b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(621183615);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(621183615, i, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)");
        }
        float a = mo10990a(0.38f, 0.38f, oVar, ((i << 6) & 896) | 54);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    @C8540g
    @C11314h(name = "getHigh")
    /* renamed from: c */
    public final float mo10992c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(629162431);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(629162431, i, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)");
        }
        float a = mo10990a(1.0f, 0.87f, oVar, ((i << 6) & 896) | 54);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    @C8540g
    @C11314h(name = "getMedium")
    /* renamed from: d */
    public final float mo10993d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1999054879);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1999054879, i, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)");
        }
        float a = mo10990a(0.74f, 0.6f, oVar, ((i << 6) & 896) | 54);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }
}
