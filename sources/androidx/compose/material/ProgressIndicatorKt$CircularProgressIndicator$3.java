package androidx.compose.material;

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
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C8578k2<Float> $baseRotation$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ C8578k2<Integer> $currentRotation$delegate;
    final /* synthetic */ C8578k2<Float> $endAngle$delegate;
    final /* synthetic */ C8578k2<Float> $startAngle$delegate;
    final /* synthetic */ C15198m $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j, C15198m mVar, float f, long j2, C8578k2<Integer> k2Var, C8578k2<Float> k2Var2, C8578k2<Float> k2Var3, C8578k2<Float> k2Var4) {
        super(1);
        this.$backgroundColor = j;
        this.$stroke = mVar;
        this.$strokeWidth = f;
        this.$color = j2;
        this.$currentRotation$delegate = k2Var;
        this.$endAngle$delegate = k2Var2;
        this.$startAngle$delegate = k2Var3;
        this.$baseRotation$delegate = k2Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        ProgressIndicatorKt.m13699J(eVar, this.$backgroundColor, this.$stroke);
        C15187e eVar2 = eVar;
        ProgressIndicatorKt.m13701L(eVar2, ProgressIndicatorKt.m13709f(this.$startAngle$delegate) + (((((float) ProgressIndicatorKt.m13710g(this.$currentRotation$delegate)) * 216.0f) % 360.0f) - 0.049804688f) + ProgressIndicatorKt.m13711h(this.$baseRotation$delegate), this.$strokeWidth, Math.abs(ProgressIndicatorKt.m13708e(this.$endAngle$delegate) - ProgressIndicatorKt.m13709f(this.$startAngle$delegate)), this.$color, this.$stroke);
    }
}
