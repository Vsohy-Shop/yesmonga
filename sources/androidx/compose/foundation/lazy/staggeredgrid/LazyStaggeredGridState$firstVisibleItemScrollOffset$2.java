package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyStaggeredGridState$firstVisibleItemScrollOffset$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$firstVisibleItemScrollOffset$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    @C12579k
    public final Integer invoke() {
        int[] b = this.this$0.mo8904G().mo9005b();
        LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
        int t = lazyStaggeredGridState.mo8927t();
        int[] a = lazyStaggeredGridState.mo8904G().mo9004a();
        int length = b.length;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            if (a[i3] == t) {
                i2 = Math.min(i2, b[i3]);
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i = i2;
        }
        return Integer.valueOf(i);
    }
}
