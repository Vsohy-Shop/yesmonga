package androidx.compose.foundation.lazy.grid;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$1 */
public final class C2469xf96bda6c extends Lambda implements C11289a<Integer> {
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2469xf96bda6c(LazyGridState lazyGridState) {
        super(0);
        this.$state = lazyGridState;
    }

    @C12579k
    public final Integer invoke() {
        return Integer.valueOf(this.$state.mo8519q());
    }
}
