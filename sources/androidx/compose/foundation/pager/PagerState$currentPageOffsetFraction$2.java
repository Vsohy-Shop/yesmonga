package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.C2517l;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"", "a", "()Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PagerState$currentPageOffsetFraction$2 extends Lambda implements C11289a<Float> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$currentPageOffsetFraction$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        int i;
        float f;
        C2517l l = this.this$0.mo9094v();
        boolean z = false;
        if (l != null) {
            i = l.getOffset();
        } else {
            i = 0;
        }
        float m = (float) this.this$0.mo9072G();
        if (m == 0.0f) {
            z = true;
        }
        if (z) {
            f = this.this$0.mo9068C();
        } else {
            f = C11479u.m44331H(((float) (-i)) / m, -0.5f, 0.5f);
        }
        return Float.valueOf(f);
    }
}
