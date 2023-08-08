package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$Scaffold$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $bottomBar;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2354e1 $contentWindowInsets;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1(int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C2354e1 e1Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, int i2) {
        super(2);
        this.$floatingActionButtonPosition = i;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$snackbarHost = pVar2;
        this.$floatingActionButton = pVar3;
        this.$contentWindowInsets = e1Var;
        this.$bottomBar = pVar4;
        this.$$dirty = i2;
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
                ComposerKt.m29845w0(-1979205334, i, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:85)");
            }
            int i2 = this.$floatingActionButtonPosition;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
            C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = this.$content;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$snackbarHost;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$floatingActionButton;
            C2354e1 e1Var = this.$contentWindowInsets;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$bottomBar;
            int i3 = this.$$dirty;
            ScaffoldKt.m26078b(i2, pVar, qVar, pVar2, pVar3, e1Var, pVar4, oVar, ((i3 >> 15) & 14) | (i3 & 112) | ((i3 >> 21) & 896) | (i3 & 7168) | (57344 & i3) | ((i3 >> 9) & 458752) | ((i3 << 12) & 3670016));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
