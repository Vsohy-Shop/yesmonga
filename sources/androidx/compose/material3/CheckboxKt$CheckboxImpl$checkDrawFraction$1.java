package androidx.compose.material3;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.state.ToggleableState;
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
public final class CheckboxKt$CheckboxImpl$checkDrawFraction$1 extends Lambda implements C11305q<Transition.C1927b<ToggleableState>, C8592o, Integer, C1956d0<Float>> {

    /* renamed from: f */
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$1 f19211f = new CheckboxKt$CheckboxImpl$checkDrawFraction$1();

    public CheckboxKt$CheckboxImpl$checkDrawFraction$1() {
        super(3);
    }

    @C8540g
    @C12579k
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final C1956d0<Float> mo11245a(@C12579k Transition.C1927b<ToggleableState> bVar, @C12580l C8592o oVar, int i) {
        C1956d0<Float> d0Var;
        Intrinsics.checkNotNullParameter(bVar, "$this$animateFloat");
        oVar.mo14918M(1373301606);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1373301606, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:237)");
        }
        ToggleableState c = bVar.mo6410c();
        ToggleableState toggleableState = ToggleableState.Off;
        if (c == toggleableState) {
            d0Var = C1972h.m8392q(100, 0, (C2022z) null, 6, (Object) null);
        } else if (bVar.mo6409a() == toggleableState) {
            d0Var = C1972h.m8387l(100);
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
        return mo11245a((Transition.C1927b) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
