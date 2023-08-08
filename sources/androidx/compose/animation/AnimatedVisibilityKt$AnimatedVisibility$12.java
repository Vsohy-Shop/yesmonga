package androidx.compose.animation;

import androidx.compose.animation.core.C1998o0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AnimatedVisibilityKt$AnimatedVisibility$12 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<AnimatedVisibilityScope, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2025e $enter;
    final /* synthetic */ C2028g $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C2373k $this_AnimatedVisibility;
    final /* synthetic */ C1998o0<Boolean> $visibleState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$12(C2373k kVar, C1998o0<Boolean> o0Var, C8767m mVar, C2025e eVar, C2028g gVar, String str, C11305q<? super AnimatedVisibilityScope, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = kVar;
        this.$visibleState = o0Var;
        this.$modifier = mVar;
        this.$enter = eVar;
        this.$exit = gVar;
        this.$label = str;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AnimatedVisibilityKt.m7740e(this.$this_AnimatedVisibility, this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
