package androidx.compose.material;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ C8578k2<Float> $firstLineHead$delegate;
    final /* synthetic */ C8578k2<Float> $firstLineTail$delegate;
    final /* synthetic */ C8578k2<Float> $secondLineHead$delegate;
    final /* synthetic */ C8578k2<Float> $secondLineTail$delegate;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, int i, long j2, C8578k2<Float> k2Var, C8578k2<Float> k2Var2, C8578k2<Float> k2Var3, C8578k2<Float> k2Var4) {
        super(1);
        this.$backgroundColor = j;
        this.$strokeCap = i;
        this.$color = j2;
        this.$firstLineHead$delegate = k2Var;
        this.$firstLineTail$delegate = k2Var2;
        this.$secondLineHead$delegate = k2Var3;
        this.$secondLineTail$delegate = k2Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        float m = C15104m.m65016m(eVar.mo42718b());
        ProgressIndicatorKt.m13703N(eVar, this.$backgroundColor, m, this.$strokeCap);
        if (ProgressIndicatorKt.m13716m(this.$firstLineHead$delegate) - ProgressIndicatorKt.m13717n(this.$firstLineTail$delegate) > 0.0f) {
            ProgressIndicatorKt.m13702M(eVar, ProgressIndicatorKt.m13716m(this.$firstLineHead$delegate), ProgressIndicatorKt.m13717n(this.$firstLineTail$delegate), this.$color, m, this.$strokeCap);
        }
        if (ProgressIndicatorKt.m13718o(this.$secondLineHead$delegate) - ProgressIndicatorKt.m13719p(this.$secondLineTail$delegate) > 0.0f) {
            ProgressIndicatorKt.m13702M(eVar, ProgressIndicatorKt.m13718o(this.$secondLineHead$delegate), ProgressIndicatorKt.m13719p(this.$secondLineTail$delegate), this.$color, m, this.$strokeCap);
        }
    }
}
