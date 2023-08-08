package androidx.compose.material;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$CorrectValueSideEffect$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<Float, Float> $scaleToOffset;
    final /* synthetic */ C11457f<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ C11457f<Float> $valueRange;
    final /* synthetic */ C8700z0<Float> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$2(C11300l<? super Float, Float> lVar, C11457f<Float> fVar, C11457f<Float> fVar2, C8700z0<Float> z0Var, float f, int i) {
        super(2);
        this.$scaleToOffset = lVar;
        this.$valueRange = fVar;
        this.$trackRange = fVar2;
        this.$valueState = z0Var;
        this.$value = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SliderKt.m13782a(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
