package androidx.compose.foundation;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollState$scrollableState$1 extends Lambda implements C11300l<Float, Float> {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @C12579k
    /* renamed from: a */
    public final Float mo7267a(float f) {
        boolean z;
        float r = ((float) this.this$0.mo7258r()) + f + this.this$0.f5786e;
        float H = C11479u.m44331H(r, 0.0f, (float) this.this$0.mo7257q());
        if (r == H) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        float r2 = H - ((float) this.this$0.mo7258r());
        int L0 = C11409d.m43851L0(r2);
        ScrollState scrollState = this.this$0;
        scrollState.mo7262v(scrollState.mo7258r() + L0);
        this.this$0.f5786e = r2 - ((float) L0);
        if (z2) {
            f = r2;
        }
        return Float.valueOf(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo7267a(((Number) obj).floatValue());
    }
}
