package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CrossfadeKt$Crossfade$7 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C1956d0<Float> $animationSpec;
    final /* synthetic */ C11305q<T, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11300l<T, Object> $contentKey;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$7(Transition<T> transition, C8767m mVar, C1956d0<Float> d0Var, C11300l<? super T, ? extends Object> lVar, C11305q<? super T, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$this_Crossfade = transition;
        this.$modifier = mVar;
        this.$animationSpec = d0Var;
        this.$contentKey = lVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CrossfadeKt.m7788a(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
