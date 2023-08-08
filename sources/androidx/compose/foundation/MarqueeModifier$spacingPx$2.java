package androidx.compose.foundation;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MarqueeModifier$spacingPx$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ MarqueeModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeModifier$spacingPx$2(MarqueeModifier marqueeModifier) {
        super(0);
        this.this$0 = marqueeModifier;
    }

    @C12579k
    public final Integer invoke() {
        C2124g0 y = this.this$0.mo7223y();
        MarqueeModifier marqueeModifier = this.this$0;
        return Integer.valueOf(y.mo7127a(marqueeModifier.f5757e, marqueeModifier.mo7221v(), marqueeModifier.mo7220u()));
    }
}
