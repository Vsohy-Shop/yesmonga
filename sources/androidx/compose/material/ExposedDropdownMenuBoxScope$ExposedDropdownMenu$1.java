package androidx.compose.material;

import androidx.compose.animation.core.C1998o0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C1998o0<Boolean> $expandedStates;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C8700z0<C15283o4> $transformOriginState;
    final /* synthetic */ ExposedDropdownMenuBoxScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(C1998o0<Boolean> o0Var, C8700z0<C15283o4> z0Var, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, C8767m mVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$expandedStates = o0Var;
        this.$transformOriginState = z0Var;
        this.this$0 = exposedDropdownMenuBoxScope;
        this.$modifier = mVar;
        this.$content = qVar;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(-406650841, i, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:259)");
            }
            MenuKt.m13564a(this.$expandedStates, this.$transformOriginState, ExposedDropdownMenuBoxScope.m13502d(this.this$0, this.$modifier, false, 1, (Object) null), this.$content, oVar, C1998o0.f5575d | 48 | (this.$$dirty & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
