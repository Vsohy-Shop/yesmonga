package com.carrefour.fid.android.domain.interactors.product.search;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase", mo22502f = "SearchWithListUseCase.kt", mo22503i = {0, 0, 1, 1, 1}, mo22504l = {23, 28, 30}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param", "this", "param", "customerKey"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchWithListUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchWithListUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithListUseCase$invoke$1(SearchWithListUseCase searchWithListUseCase, C11045c<? super SearchWithListUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = searchWithListUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.m173001invokegIAlus((List<String>) null, this);
        return f == C11063b.m42612h() ? f : Result.m38701a(f);
    }
}
