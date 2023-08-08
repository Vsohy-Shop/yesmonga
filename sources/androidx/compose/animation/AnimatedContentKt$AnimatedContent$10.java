package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AnimatedContentKt$AnimatedContent$10 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11306r<AnimatedVisibilityScope, S, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8734c $contentAlignment;
    final /* synthetic */ C11300l<S, Object> $contentKey;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ C11300l<AnimatedContentScope<S>, C2024d> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$10(Transition<S> transition, C8767m mVar, C11300l<? super AnimatedContentScope<S>, C2024d> lVar, C8734c cVar, C11300l<? super S, ? extends Object> lVar2, C11306r<? super AnimatedVisibilityScope, ? super S, ? super C8592o, ? super Integer, C11079d2> rVar, int i, int i2) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$modifier = mVar;
        this.$transitionSpec = lVar;
        this.$contentAlignment = cVar;
        this.$contentKey = lVar2;
        this.$content = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AnimatedContentKt.m7631a(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
