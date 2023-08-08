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
public final class TooltipKt$RichTooltipBox$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $action;
    final /* synthetic */ C8183c2 $colors;
    final /* synthetic */ C11305q<C8254n3, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ C8194e2 $tooltipState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$RichTooltipBox$4(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, C8194e2 e2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C15218g4 g4Var, C8183c2 c2Var, C11305q<? super C8254n3, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$text = pVar;
        this.$modifier = mVar;
        this.$tooltipState = e2Var;
        this.$title = pVar2;
        this.$action = pVar3;
        this.$shape = g4Var;
        this.$colors = c2Var;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TooltipKt.m26856c(this.$text, this.$modifier, this.$tooltipState, this.$title, this.$action, this.$shape, this.$colors, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
