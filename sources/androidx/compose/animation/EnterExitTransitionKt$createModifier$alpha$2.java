package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
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
public final class EnterExitTransitionKt$createModifier$alpha$2 extends Lambda implements C11305q<Transition.C1927b<EnterExitState>, C8592o, Integer, C1956d0<Float>> {
    final /* synthetic */ C2025e $enter;
    final /* synthetic */ C2028g $exit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$alpha$2(C2025e eVar, C2028g gVar) {
        super(3);
        this.$enter = eVar;
        this.$exit = gVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C1956d0<Float> mo6520a(@C12579k Transition.C1927b<EnterExitState> bVar, @C12580l C8592o oVar, int i) {
        C1956d0<Float> d0Var;
        Intrinsics.checkNotNullParameter(bVar, "$this$animateFloat");
        oVar.mo14918M(-57153604);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-57153604, i, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:861)");
        }
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (bVar.mo6729d(enterExitState, enterExitState2)) {
            C2033j h = this.$enter.mo7022b().mo7093h();
            if (h == null || (d0Var = h.mo7039f()) == null) {
                d0Var = EnterExitTransitionKt.f5231c;
            }
        } else if (bVar.mo6729d(enterExitState2, EnterExitState.PostExit)) {
            C2033j h2 = this.$exit.mo7028b().mo7093h();
            if (h2 == null || (d0Var = h2.mo7039f()) == null) {
                d0Var = EnterExitTransitionKt.f5231c;
            }
        } else {
            d0Var = EnterExitTransitionKt.f5231c;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6520a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
