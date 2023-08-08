package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.C11076d0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10953k0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyStaggeredGridState$firstVisibleItemIndex$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$firstVisibleItemIndex$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    @C12579k
    public final Integer invoke() {
        Integer num;
        int[] a = this.this$0.mo8904G().mo9004a();
        int i = 0;
        if (a.length == 0) {
            num = null;
        } else {
            int i2 = a[0];
            if (i2 == -1) {
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(a)).iterator();
            while (H.hasNext()) {
                int i3 = a[H.mo6374c()];
                if (i3 == -1) {
                    i3 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i3);
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        }
        Integer num2 = num;
        if (num2 != null) {
            i = num2.intValue();
        }
        return Integer.valueOf(i);
    }
}
