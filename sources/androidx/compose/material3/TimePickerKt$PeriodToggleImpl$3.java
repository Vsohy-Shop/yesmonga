package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$PeriodToggleImpl$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ C15218g4 $endShape;
    final /* synthetic */ C15560f0 $measurePolicy;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $startShape;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$PeriodToggleImpl$3(C8767m mVar, TimePickerState timePickerState, C8212h3 h3Var, C15560f0 f0Var, C15218g4 g4Var, C15218g4 g4Var2, int i) {
        super(2);
        this.$modifier = mVar;
        this.$state = timePickerState;
        this.$colors = h3Var;
        this.$measurePolicy = f0Var;
        this.$startShape = g4Var;
        this.$endShape = g4Var2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TimePickerKt.m26755k(this.$modifier, this.$state, this.$colors, this.$measurePolicy, this.$startShape, this.$endShape, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
