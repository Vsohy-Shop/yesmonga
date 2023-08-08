package androidx.compose.material3;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSliderImpl$startThumbSemantics$1$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ float $coercedEnd;
    final /* synthetic */ C8578k2<C11300l<C11457f<Float>, C11079d2>> $onValueChangeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$startThumbSemantics$1$1(C8578k2<? extends C11300l<? super C11457f<Float>, C11079d2>> k2Var, float f) {
        super(1);
        this.$onValueChangeState = k2Var;
        this.$coercedEnd = f;
    }

    /* renamed from: a */
    public final void mo11905a(float f) {
        this.$onValueChangeState.getValue().invoke(C11478t.m44305e(f, this.$coercedEnd));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11905a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
