package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckboxKt$TriStateCheckbox$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C7880m $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ ToggleableState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$TriStateCheckbox$2(ToggleableState toggleableState, C11289a<C11079d2> aVar, C8767m mVar, boolean z, C2243g gVar, C7880m mVar2, int i, int i2) {
        super(2);
        this.$state = toggleableState;
        this.$onClick = aVar;
        this.$modifier = mVar;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$colors = mVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckboxKt.m13355h(this.$state, this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$colors, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
