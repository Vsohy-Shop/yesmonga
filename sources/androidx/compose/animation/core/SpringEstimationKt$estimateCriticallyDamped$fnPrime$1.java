package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "t", "a", "(D)Ljava/lang/Double;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 extends Lambda implements C11300l<Double, Double> {
    final /* synthetic */ double $c1;
    final /* synthetic */ double $c2;

    /* renamed from: $r */
    final /* synthetic */ double f5336$r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(double d, double d2, double d3) {
        super(1);
        this.$c2 = d;
        this.f5336$r = d2;
        this.$c1 = d3;
    }

    @C12579k
    /* renamed from: a */
    public final Double mo6673a(double d) {
        double d2 = this.$c2;
        double d3 = this.f5336$r;
        return Double.valueOf(((d2 * ((d3 * d) + ((double) 1))) + (this.$c1 * d3)) * Math.exp(d3 * d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6673a(((Number) obj).doubleValue());
    }
}
