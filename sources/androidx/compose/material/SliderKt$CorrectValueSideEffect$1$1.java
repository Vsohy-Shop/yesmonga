package androidx.compose.material;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$CorrectValueSideEffect$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<Float, Float> $scaleToOffset;
    final /* synthetic */ C11457f<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ C11457f<Float> $valueRange;
    final /* synthetic */ C8700z0<Float> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$1$1(C11457f<Float> fVar, C11300l<? super Float, Float> lVar, float f, C8700z0<Float> z0Var, C11457f<Float> fVar2) {
        super(0);
        this.$valueRange = fVar;
        this.$scaleToOffset = lVar;
        this.$value = f;
        this.$valueState = z0Var;
        this.$trackRange = fVar2;
    }

    public final void invoke() {
        float floatValue = (this.$valueRange.mo23013q().floatValue() - this.$valueRange.getStart().floatValue()) / ((float) 1000);
        float floatValue2 = this.$scaleToOffset.invoke(Float.valueOf(this.$value)).floatValue();
        if (Math.abs(floatValue2 - this.$valueState.getValue().floatValue()) > floatValue && this.$trackRange.mo23006e(this.$valueState.getValue())) {
            this.$valueState.setValue(Float.valueOf(floatValue2));
        }
    }
}
