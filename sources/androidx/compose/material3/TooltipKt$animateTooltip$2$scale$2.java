package androidx.compose.material3;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TooltipKt$animateTooltip$2$scale$2 extends Lambda implements C11305q<Transition.C1927b<Boolean>, C8592o, Integer, C1956d0<Float>> {

    /* renamed from: f */
    public static final TooltipKt$animateTooltip$2$scale$2 f19951f = new TooltipKt$animateTooltip$2$scale$2();

    public TooltipKt$animateTooltip$2$scale$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C1956d0<Float> mo12391a(@C12579k Transition.C1927b<Boolean> bVar, @C12580l C8592o oVar, int i) {
        C2023z0 z0Var;
        Intrinsics.checkNotNullParameter(bVar, "$this$animateFloat");
        oVar.mo14918M(386845748);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(386845748, i, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:701)");
        }
        if (bVar.mo6729d(Boolean.FALSE, Boolean.TRUE)) {
            z0Var = C1972h.m8392q(150, 0, C1947b0.m8292d(), 2, (Object) null);
        } else {
            z0Var = C1972h.m8392q(75, 0, C1947b0.m8292d(), 2, (Object) null);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12391a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
