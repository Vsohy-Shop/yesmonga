package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TooltipKt$PlainTooltipBox$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11305q<C8254n3, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tooltip;
    final /* synthetic */ C8364w1 $tooltipState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$PlainTooltipBox$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, C8364w1 w1Var, C15218g4 g4Var, long j, long j2, C11305q<? super C8254n3, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$tooltip = pVar;
        this.$modifier = mVar;
        this.$tooltipState = w1Var;
        this.$shape = g4Var;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TooltipKt.m26854a(this.$tooltip, this.$modifier, this.$tooltipState, this.$shape, this.$containerColor, this.$contentColor, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
