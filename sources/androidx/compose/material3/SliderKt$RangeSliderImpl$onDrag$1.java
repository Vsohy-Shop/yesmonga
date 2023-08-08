package androidx.compose.material3;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$onDrag$1 extends Lambda implements C11304p<Boolean, Float, C11079d2> {
    final /* synthetic */ C8700z0<Float> $endThumbWidth$delegate;
    final /* synthetic */ C8578k2<C11300l<C11457f<Float>, C11079d2>> $onValueChangeState;
    final /* synthetic */ C8700z0<Float> $rawOffsetEnd;
    final /* synthetic */ C8700z0<Float> $rawOffsetStart;
    final /* synthetic */ C8700z0<Float> $startThumbWidth$delegate;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ C8700z0<Integer> $totalWidth$delegate;
    final /* synthetic */ C11457f<Float> $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$onDrag$1(C8700z0<Float> z0Var, C8700z0<Float> z0Var2, C11457f<Float> fVar, float[] fArr, C8578k2<? extends C11300l<? super C11457f<Float>, C11079d2>> k2Var, C8700z0<Integer> z0Var3, C8700z0<Float> z0Var4, C8700z0<Float> z0Var5, C11457f<Float> fVar2) {
        super(2);
        this.$rawOffsetStart = z0Var;
        this.$rawOffsetEnd = z0Var2;
        this.$value = fVar;
        this.$tickFractions = fArr;
        this.$onValueChangeState = k2Var;
        this.$totalWidth$delegate = z0Var3;
        this.$endThumbWidth$delegate = z0Var4;
        this.$startThumbWidth$delegate = z0Var5;
        this.$valueRange = fVar2;
    }

    /* renamed from: a */
    public final void mo11903a(boolean z, float f) {
        C11457f<Float> fVar;
        float f2 = (float) 2;
        float max = Math.max(((float) SliderKt.m26212h(this.$totalWidth$delegate)) - (SliderKt.m26210f(this.$endThumbWidth$delegate) / f2), 0.0f);
        float min = Math.min(SliderKt.m26208d(this.$startThumbWidth$delegate) / f2, max);
        if (z) {
            C8700z0<Float> z0Var = this.$rawOffsetStart;
            z0Var.setValue(Float.valueOf(z0Var.getValue().floatValue() + f));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt.m26214j(this.$valueRange, min, max, this.$value.mo23013q().floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            fVar = C11478t.m44305e(SliderKt.m26203W(C11479u.m44331H(this.$rawOffsetStart.getValue().floatValue(), min, floatValue), this.$tickFractions, min, max), floatValue);
        } else {
            C8700z0<Float> z0Var2 = this.$rawOffsetEnd;
            z0Var2.setValue(Float.valueOf(z0Var2.getValue().floatValue() + f));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt.m26214j(this.$valueRange, min, max, this.$value.getStart().floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            fVar = C11478t.m44305e(floatValue2, SliderKt.m26203W(C11479u.m44331H(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, max), this.$tickFractions, min, max));
        }
        this.$onValueChangeState.getValue().invoke(SliderKt.m26215k(this.$valueRange, min, max, fVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo11903a(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return C11079d2.f28267a;
    }
}
