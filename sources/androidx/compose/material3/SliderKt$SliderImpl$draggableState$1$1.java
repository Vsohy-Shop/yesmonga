package androidx.compose.material3;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$SliderImpl$draggableState$1$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C8578k2<C11300l<Float, C11079d2>> $onValueChangeState;
    final /* synthetic */ C8700z0<Float> $pressOffset;
    final /* synthetic */ C8700z0<Float> $rawOffset;
    final /* synthetic */ C8700z0<Float> $thumbWidth;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ C8700z0<Integer> $totalWidth;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$draggableState$1$1(C8700z0<Integer> z0Var, C8700z0<Float> z0Var2, C8700z0<Float> z0Var3, C8700z0<Float> z0Var4, float[] fArr, C8578k2<? extends C11300l<? super Float, C11079d2>> k2Var, C11457f<Float> fVar) {
        super(1);
        this.$totalWidth = z0Var;
        this.$thumbWidth = z0Var2;
        this.$rawOffset = z0Var3;
        this.$pressOffset = z0Var4;
        this.$tickFractions = fArr;
        this.$onValueChangeState = k2Var;
        this.$valueRange = fVar;
    }

    /* renamed from: a */
    public final void mo11915a(float f) {
        float f2 = (float) 2;
        float max = Math.max(this.$totalWidth.getValue().floatValue() - (this.$thumbWidth.getValue().floatValue() / f2), 0.0f);
        float min = Math.min(this.$thumbWidth.getValue().floatValue() / f2, max);
        C8700z0<Float> z0Var = this.$rawOffset;
        z0Var.setValue(Float.valueOf(z0Var.getValue().floatValue() + f + this.$pressOffset.getValue().floatValue()));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        this.$onValueChangeState.getValue().invoke(Float.valueOf(SliderKt.m26220p(this.$valueRange, min, max, SliderKt.m26203W(this.$rawOffset.getValue().floatValue(), this.$tickFractions, min, max))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11915a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
