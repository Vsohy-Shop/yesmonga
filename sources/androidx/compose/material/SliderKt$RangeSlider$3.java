package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSlider$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C3045g1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C11457f<Float>, C11079d2> $onValueChange;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ C11457f<Float> $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$3(C11457f<Float> fVar, C11300l<? super C11457f<Float>, C11079d2> lVar, C8767m mVar, boolean z, C11457f<Float> fVar2, int i, C11289a<C11079d2> aVar, C3045g1 g1Var, int i2, int i3) {
        super(2);
        this.$value = fVar;
        this.$onValueChange = lVar;
        this.$modifier = mVar;
        this.$enabled = z;
        this.$valueRange = fVar2;
        this.$steps = i;
        this.$onValueChangeFinished = aVar;
        this.$colors = g1Var;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SliderKt.m13783b(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$colors, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
