package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSplineBasedFloatDecayAnimationSpec.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n76#2:50\n36#3:51\n1057#4,6:52\n*S KotlinDebug\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n*L\n44#1:50\n45#1:51\n45#1:52,6\n*E\n"})
/* renamed from: androidx.compose.animation.v */
public final class C2046v {

    /* renamed from: a */
    public static final float f5697a = ViewConfiguration.getScrollFriction();

    /* renamed from: a */
    public static final float m8764a() {
        return f5697a;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final <T> C2013v<T> m8765b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(904445851);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(904445851, i, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        Float valueOf = Float.valueOf(dVar.getDensity());
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(valueOf);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C2017x.m8658e(new C2045u(dVar));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2013v<T> vVar = (C2013v) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return vVar;
    }
}
