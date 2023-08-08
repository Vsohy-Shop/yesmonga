package androidx.compose.material;

import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProgressIndicatorKt$CircularProgressIndicator$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ C15198m $stroke;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$1(float f, long j, C15198m mVar, long j2) {
        super(1);
        this.$coercedProgress = f;
        this.$backgroundColor = j;
        this.$stroke = mVar;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        float f = this.$coercedProgress * 360.0f;
        ProgressIndicatorKt.m13699J(eVar, this.$backgroundColor, this.$stroke);
        ProgressIndicatorKt.m13700K(eVar, 270.0f, f, this.$color, this.$stroke);
    }
}
