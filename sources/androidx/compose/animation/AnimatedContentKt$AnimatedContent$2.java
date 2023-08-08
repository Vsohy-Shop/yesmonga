package androidx.compose.animation;

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
public final class AnimatedContentKt$AnimatedContent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11306r<AnimatedVisibilityScope, S, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8734c $contentAlignment;
    final /* synthetic */ String $label;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ S $targetState;
    final /* synthetic */ C11300l<AnimatedContentScope<S>, C2024d> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$2(S s, C8767m mVar, C11300l<? super AnimatedContentScope<S>, C2024d> lVar, C8734c cVar, String str, C11306r<? super AnimatedVisibilityScope, ? super S, ? super C8592o, ? super Integer, C11079d2> rVar, int i, int i2) {
        super(2);
        this.$targetState = s;
        this.$modifier = mVar;
        this.$transitionSpec = lVar;
        this.$contentAlignment = cVar;
        this.$label = str;
        this.$content = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AnimatedContentKt.m7632b(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
