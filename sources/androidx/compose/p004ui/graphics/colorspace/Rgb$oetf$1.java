package androidx.compose.p004ui.graphics.colorspace;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 */
public final class Rgb$oetf$1 extends Lambda implements C11300l<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @C12579k
    /* renamed from: a */
    public final Double mo42539a(double d) {
        return Double.valueOf(C11479u.m44328G(this.this$0.mo42506a0().mo42590a(d), (double) this.this$0.f37368h, (double) this.this$0.f37369i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo42539a(((Number) obj).doubleValue());
    }
}
