package androidx.compose.material3;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
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
public final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends Lambda implements C11305q<Transition.C1927b<InputPhase>, C8592o, Integer, C1956d0<Float>> {

    /* renamed from: f */
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 f19880f = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    public TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C1956d0<Float> mo12254a(@C12579k Transition.C1927b<InputPhase> bVar, @C12580l C8592o oVar, int i) {
        C1956d0<Float> d0Var;
        Intrinsics.checkNotNullParameter(bVar, "$this$animateFloat");
        oVar.mo14918M(-1635067817);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1635067817, i, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:325)");
        }
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        if (bVar.mo6729d(inputPhase, inputPhase2)) {
            d0Var = C1972h.m8392q(67, 0, C1947b0.m8291c(), 2, (Object) null);
        } else if (bVar.mo6729d(inputPhase2, inputPhase) || bVar.mo6729d(InputPhase.UnfocusedNotEmpty, inputPhase2)) {
            d0Var = C1972h.m8391p(83, 67, C1947b0.m8291c());
        } else {
            d0Var = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12254a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
