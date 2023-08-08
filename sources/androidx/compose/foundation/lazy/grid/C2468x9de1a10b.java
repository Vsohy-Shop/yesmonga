package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$1$itemProviderState$1 */
public final class C2468x9de1a10b extends Lambda implements C11289a<LazyGridItemProviderImpl> {
    final /* synthetic */ C8578k2<C11300l<LazyGridScope, C11079d2>> $latestContent;
    final /* synthetic */ C8578k2<C11466l> $nearestItemsRangeState;
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2468x9de1a10b(C8578k2<? extends C11300l<? super LazyGridScope, C11079d2>> k2Var, LazyGridState lazyGridState, C8578k2<C11466l> k2Var2) {
        super(0);
        this.$latestContent = k2Var;
        this.$state = lazyGridState;
        this.$nearestItemsRangeState = k2Var2;
    }

    @C12579k
    /* renamed from: a */
    public final LazyGridItemProviderImpl invoke() {
        LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
        this.$latestContent.getValue().invoke(lazyGridScopeImpl);
        return new LazyGridItemProviderImpl(lazyGridScopeImpl.mo8469f(), lazyGridScopeImpl.mo8468e(), this.$state, this.$nearestItemsRangeState.getValue());
    }
}
