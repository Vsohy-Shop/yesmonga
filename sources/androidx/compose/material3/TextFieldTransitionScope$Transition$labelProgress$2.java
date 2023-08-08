package androidx.compose.material3;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
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
public final class TextFieldTransitionScope$Transition$labelProgress$2 extends Lambda implements C11305q<Transition.C1927b<InputPhase>, C8592o, Integer, C1956d0<Float>> {

    /* renamed from: f */
    public static final TextFieldTransitionScope$Transition$labelProgress$2 f19878f = new TextFieldTransitionScope$Transition$labelProgress$2();

    public TextFieldTransitionScope$Transition$labelProgress$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C1956d0<Float> mo12252a(@C12579k Transition.C1927b<InputPhase> bVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "$this$animateFloat");
        oVar.mo14918M(-4765522);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-4765522, i, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:314)");
        }
        C2023z0 q = C1972h.m8392q(150, 0, (C2022z) null, 6, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return q;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12252a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
