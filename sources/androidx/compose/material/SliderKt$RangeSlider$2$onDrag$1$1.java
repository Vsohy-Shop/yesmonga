package androidx.compose.material;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSlider$2$onDrag$1$1 extends Lambda implements C11304p<Boolean, Float, C11079d2> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ C8578k2<C11300l<C11457f<Float>, C11079d2>> $onValueChangeState;
    final /* synthetic */ C8700z0<Float> $rawOffsetEnd;
    final /* synthetic */ C8700z0<Float> $rawOffsetStart;
    final /* synthetic */ C11457f<Float> $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$onDrag$1$1(C8700z0<Float> z0Var, C8700z0<Float> z0Var2, C11457f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C8578k2<? extends C11300l<? super C11457f<Float>, C11079d2>> k2Var, C11457f<Float> fVar2) {
        super(2);
        this.$rawOffsetStart = z0Var;
        this.$rawOffsetEnd = z0Var2;
        this.$value = fVar;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$onValueChangeState = k2Var;
        this.$valueRange = fVar2;
    }

    /* renamed from: a */
    public final void mo10390a(boolean z, float f) {
        C11457f<Float> fVar;
        if (z) {
            C8700z0<Float> z0Var = this.$rawOffsetStart;
            z0Var.setValue(Float.valueOf(z0Var.getValue().floatValue() + f));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt$RangeSlider$2.m13811d(this.$valueRange, this.$minPx, this.$maxPx, this.$value.mo23013q().floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            fVar = C11478t.m44305e(C11479u.m44331H(this.$rawOffsetStart.getValue().floatValue(), this.$minPx.element, floatValue), floatValue);
        } else {
            C8700z0<Float> z0Var2 = this.$rawOffsetEnd;
            z0Var2.setValue(Float.valueOf(z0Var2.getValue().floatValue() + f));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt$RangeSlider$2.m13811d(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getStart().floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            fVar = C11478t.m44305e(floatValue2, C11479u.m44331H(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, this.$maxPx.element));
        }
        this.$onValueChangeState.getValue().invoke(SliderKt$RangeSlider$2.m13812e(this.$minPx, this.$maxPx, this.$valueRange, fVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo10390a(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return C11079d2.f28267a;
    }
}
