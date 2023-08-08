package androidx.compose.material;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11479u;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$Slider$3$draggableState$1$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ C8578k2<C11300l<Float, C11079d2>> $onValueChangeState;
    final /* synthetic */ C8700z0<Float> $pressOffset;
    final /* synthetic */ C8700z0<Float> $rawOffset;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$draggableState$1$1(C8700z0<Float> z0Var, C8700z0<Float> z0Var2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C8578k2<? extends C11300l<? super Float, C11079d2>> k2Var, C11457f<Float> fVar) {
        super(1);
        this.$rawOffset = z0Var;
        this.$pressOffset = z0Var2;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$onValueChangeState = k2Var;
        this.$valueRange = fVar;
    }

    /* renamed from: a */
    public final void mo10399a(float f) {
        C8700z0<Float> z0Var = this.$rawOffset;
        z0Var.setValue(Float.valueOf(z0Var.getValue().floatValue() + f + this.$pressOffset.getValue().floatValue()));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        this.$onValueChangeState.getValue().invoke(Float.valueOf(SliderKt$Slider$3.m13824e(this.$minPx, this.$maxPx, this.$valueRange, C11479u.m44331H(this.$rawOffset.getValue().floatValue(), this.$minPx.element, this.$maxPx.element))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10399a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
