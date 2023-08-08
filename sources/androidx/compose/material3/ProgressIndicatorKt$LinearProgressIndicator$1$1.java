package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ int $strokeCap;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j, int i, float f, long j2) {
        super(1);
        this.$trackColor = j;
        this.$strokeCap = i;
        this.$coercedProgress = f;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        float m = C15104m.m65016m(eVar.mo42718b());
        ProgressIndicatorKt.m26057x(eVar, this.$trackColor, m, this.$strokeCap);
        ProgressIndicatorKt.m26056w(eVar, 0.0f, this.$coercedProgress, this.$color, m, this.$strokeCap);
    }
}
