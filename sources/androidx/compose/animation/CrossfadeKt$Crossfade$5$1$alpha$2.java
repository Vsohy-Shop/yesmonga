package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CrossfadeKt$Crossfade$5$1$alpha$2 extends Lambda implements C11305q<Transition.C1927b<T>, C8592o, Integer, C1956d0<Float>> {
    final /* synthetic */ C1956d0<Float> $animationSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$alpha$2(C1956d0<Float> d0Var) {
        super(3);
        this.$animationSpec = d0Var;
    }

    @C8540g
    @C12579k
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final C1956d0<Float> mo6513a(@C12579k Transition.C1927b<T> bVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "$this$animateFloat");
        oVar.mo14918M(438406499);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(438406499, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
        }
        C1956d0<Float> d0Var = this.$animationSpec;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6513a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
