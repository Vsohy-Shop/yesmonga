package androidx.compose.animation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AnimatedVisibilityKt$AnimatedVisibility$17 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2025e $enter;
    final /* synthetic */ C2028g $exit;
    final /* synthetic */ boolean $initiallyVisible;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$17(boolean z, C8767m mVar, C2025e eVar, C2028g gVar, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, int i2) {
        super(2);
        this.$visible = z;
        this.$modifier = mVar;
        this.$enter = eVar;
        this.$exit = gVar;
        this.$initiallyVisible = z2;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AnimatedVisibilityKt.m7745j(this.$visible, this.$modifier, this.$enter, this.$exit, this.$initiallyVisible, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}
