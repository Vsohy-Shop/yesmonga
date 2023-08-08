package androidx.compose.material3;

import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<Float> $baseRotation;
    final /* synthetic */ long $color;
    final /* synthetic */ C8578k2<Integer> $currentRotation;
    final /* synthetic */ C8578k2<Float> $endAngle;
    final /* synthetic */ C8578k2<Float> $startAngle;
    final /* synthetic */ C15198m $stroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j, C15198m mVar, C8578k2<Integer> k2Var, C8578k2<Float> k2Var2, C8578k2<Float> k2Var3, C8578k2<Float> k2Var4, float f, long j2) {
        super(1);
        this.$trackColor = j;
        this.$stroke = mVar;
        this.$currentRotation = k2Var;
        this.$endAngle = k2Var2;
        this.$startAngle = k2Var3;
        this.$baseRotation = k2Var4;
        this.$strokeWidth = f;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        ProgressIndicatorKt.m26053t(eVar, this.$trackColor, this.$stroke);
        C15187e eVar2 = eVar;
        ProgressIndicatorKt.m26055v(eVar2, this.$startAngle.getValue().floatValue() + (((this.$currentRotation.getValue().floatValue() * 216.0f) % 360.0f) - 0.049804688f) + this.$baseRotation.getValue().floatValue(), this.$strokeWidth, Math.abs(this.$endAngle.getValue().floatValue() - this.$startAngle.getValue().floatValue()), this.$color, this.$stroke);
    }
}
