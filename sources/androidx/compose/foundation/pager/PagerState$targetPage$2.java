package androidx.compose.foundation.pager;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerState$targetPage$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    @C12579k
    public final Integer invoke() {
        int i;
        if (!this.this$0.mo7251e()) {
            i = this.this$0.mo9095w();
        } else if (this.this$0.mo9093u() != -1) {
            i = this.this$0.mo9093u();
        } else {
            if (!(this.this$0.mo9079N() == 0.0f)) {
                i = C11409d.m43851L0(this.this$0.mo9079N() / ((float) this.this$0.mo9072G())) + this.this$0.mo9095w();
            } else if (Math.abs(this.this$0.mo9096x()) >= Math.abs(this.this$0.mo9076K())) {
                i = this.this$0.mo9095w() + ((int) Math.signum(this.this$0.mo9096x()));
            } else {
                i = this.this$0.mo9095w();
            }
        }
        return Integer.valueOf(this.this$0.mo9092t(i));
    }
}
