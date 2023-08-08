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
public final class SliderKt$SliderImpl$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Float, C11079d2> $onValueChange;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ C11305q<C8264p2, C8592o, Integer, C11079d2> $thumb;
    final /* synthetic */ C11305q<C8264p2, C8592o, Integer, C11079d2> $track;
    final /* synthetic */ float $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$3(C8767m mVar, boolean z, C2243g gVar, C11300l<? super Float, C11079d2> lVar, C11289a<C11079d2> aVar, int i, float f, C11457f<Float> fVar, C11305q<? super C8264p2, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super C8264p2, ? super C8592o, ? super Integer, C11079d2> qVar2, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$onValueChange = lVar;
        this.$onValueChangeFinished = aVar;
        this.$steps = i;
        this.$value = f;
        this.$valueRange = fVar;
        this.$thumb = qVar;
        this.$track = qVar2;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SliderKt.m26218n(this.$modifier, this.$enabled, this.$interactionSource, this.$onValueChange, this.$onValueChangeFinished, this.$steps, this.$value, this.$valueRange, this.$thumb, this.$track, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
