package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ C3045g1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $endInteractionSource;
    final /* synthetic */ C8767m $endThumbSemantics;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ C2243g $startInteractionSource;
    final /* synthetic */ C8767m $startThumbSemantics;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2(boolean z, float f, float f2, List<Float> list, C3045g1 g1Var, float f3, C2243g gVar, C2243g gVar2, C8767m mVar, C8767m mVar2, C8767m mVar3, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$positionFractionStart = f;
        this.$positionFractionEnd = f2;
        this.$tickFractions = list;
        this.$colors = g1Var;
        this.$width = f3;
        this.$startInteractionSource = gVar;
        this.$endInteractionSource = gVar2;
        this.$modifier = mVar;
        this.$startThumbSemantics = mVar2;
        this.$endThumbSemantics = mVar3;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SliderKt.m13784c(this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$colors, this.$width, this.$startInteractionSource, this.$endInteractionSource, this.$modifier, this.$startThumbSemantics, this.$endThumbSemantics, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
