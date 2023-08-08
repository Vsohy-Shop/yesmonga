package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$1$itemProviderState$1 */
public final class C2442x3addb60b extends Lambda implements C11289a<LazyListItemProviderImpl> {
    final /* synthetic */ LazyItemScopeImpl $itemScope;
    final /* synthetic */ C8578k2<C11300l<LazyListScope, C11079d2>> $latestContent;
    final /* synthetic */ C8578k2<C11466l> $nearestItemsRangeState;
    final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2442x3addb60b(C8578k2<? extends C11300l<? super LazyListScope, C11079d2>> k2Var, C8578k2<C11466l> k2Var2, LazyItemScopeImpl lazyItemScopeImpl, LazyListState lazyListState) {
        super(0);
        this.$latestContent = k2Var;
        this.$nearestItemsRangeState = k2Var2;
        this.$itemScope = lazyItemScopeImpl;
        this.$state = lazyListState;
    }

    @C12579k
    /* renamed from: a */
    public final LazyListItemProviderImpl invoke() {
        LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
        this.$latestContent.getValue().invoke(lazyListScopeImpl);
        return new LazyListItemProviderImpl(lazyListScopeImpl.mo8314p(), this.$nearestItemsRangeState.getValue(), lazyListScopeImpl.mo8313o(), this.$itemScope, this.$state);
    }
}
