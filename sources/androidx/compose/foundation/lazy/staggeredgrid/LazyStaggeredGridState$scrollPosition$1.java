package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements C11304p<Integer, Integer, int[]> {
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @C12579k
    /* renamed from: d */
    public final int[] mo8937d(int i, int i2) {
        return ((LazyStaggeredGridState) this.receiver).mo8925r(i, i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo8937d(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
