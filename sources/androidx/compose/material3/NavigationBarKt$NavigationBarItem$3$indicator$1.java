package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.C8308h0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationBarKt$NavigationBarItem$3$indicator$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C8578k2<Float> $animationProgress$delegate;
    final /* synthetic */ C8252n1 $colors;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$3$indicator$1(C8252n1 n1Var, C8578k2<Float> k2Var) {
        super(2);
        this.$colors = n1Var;
        this.$animationProgress$delegate = k2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-474426875, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
            }
            BoxKt.m9839a(BackgroundKt.m8824c(C15594q.m69318b(C8767m.f23478j, "indicator"), C15240j2.m66080w(this.$colors.mo12867a(), NavigationBarKt.m25914e(this.$animationProgress$delegate), 0.0f, 0.0f, 0.0f, 14, (Object) null), ShapesKt.m26127f(C8308h0.f21270a.mo13676h(), oVar, 6)), oVar, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
