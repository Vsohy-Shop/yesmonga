package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.window.C16546g;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TooltipKt$TooltipBox$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11305q<C8254n3, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ float $elevation;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tooltipContent;
    final /* synthetic */ C16546g $tooltipPositionProvider;
    final /* synthetic */ C8265p3 $tooltipState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16546g gVar, C8767m mVar, C15218g4 g4Var, C8265p3 p3Var, long j, float f, float f2, C11305q<? super C8254n3, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$tooltipContent = pVar;
        this.$tooltipPositionProvider = gVar;
        this.$modifier = mVar;
        this.$shape = g4Var;
        this.$tooltipState = p3Var;
        this.$containerColor = j;
        this.$elevation = f;
        this.$maxWidth = f2;
        this.$content = qVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TooltipKt.m26858e(this.$tooltipContent, this.$tooltipPositionProvider, this.$modifier, this.$shape, this.$tooltipState, this.$containerColor, this.$elevation, this.$maxWidth, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
