package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $endInteractionSource;
    final /* synthetic */ C11305q<C8264p2, C8592o, Integer, C11079d2> $endThumb;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C11457f<Float>, C11079d2> $onValueChange;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ C2243g $startInteractionSource;
    final /* synthetic */ C11305q<C8264p2, C8592o, Integer, C11079d2> $startThumb;
    final /* synthetic */ int $steps;
    final /* synthetic */ C11305q<C8264p2, C8592o, Integer, C11079d2> $track;
    final /* synthetic */ C11457f<Float> $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$3(C8767m mVar, C11457f<Float> fVar, C11300l<? super C11457f<Float>, C11079d2> lVar, boolean z, C11457f<Float> fVar2, int i, C11289a<C11079d2> aVar, C2243g gVar, C2243g gVar2, C11305q<? super C8264p2, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super C8264p2, ? super C8592o, ? super Integer, C11079d2> qVar2, C11305q<? super C8264p2, ? super C8592o, ? super Integer, C11079d2> qVar3, int i2, int i3, int i4) {
        super(2);
        this.$modifier = mVar;
        this.$value = fVar;
        this.$onValueChange = lVar;
        this.$enabled = z;
        this.$valueRange = fVar2;
        this.$steps = i;
        this.$onValueChangeFinished = aVar;
        this.$startInteractionSource = gVar;
        this.$endInteractionSource = gVar2;
        this.$startThumb = qVar;
        this.$endThumb = qVar2;
        this.$track = qVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SliderKt.m26207c(this.$modifier, this.$value, this.$onValueChange, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$startInteractionSource, this.$endInteractionSource, this.$startThumb, this.$endThumb, this.$track, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
