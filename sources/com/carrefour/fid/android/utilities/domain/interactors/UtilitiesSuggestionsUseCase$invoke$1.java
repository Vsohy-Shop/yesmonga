package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase", mo22502f = "UtilitiesSuggestionsUseCase.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UtilitiesSuggestionsUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UtilitiesSuggestionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UtilitiesSuggestionsUseCase$invoke$1(UtilitiesSuggestionsUseCase utilitiesSuggestionsUseCase, C11045c<? super UtilitiesSuggestionsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = utilitiesSuggestionsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172805invokegIAlus((SearchProductSuggestions.SearchParams) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
