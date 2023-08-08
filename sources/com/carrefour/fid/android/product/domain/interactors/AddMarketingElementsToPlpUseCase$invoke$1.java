package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase", mo22502f = "AddMarketingElementsToPlpUseCase.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {54, 59}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param", "this", "param"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AddMarketingElementsToPlpUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AddMarketingElementsToPlpUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddMarketingElementsToPlpUseCase$invoke$1(AddMarketingElementsToPlpUseCase addMarketingElementsToPlpUseCase, C11045c<? super AddMarketingElementsToPlpUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = addMarketingElementsToPlpUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = this.this$0.m172814invokegIAlus((AddMarketingElementsToPlpUseCase.C27519a) null, this);
        return n == C11063b.m42612h() ? n : Result.m38701a(n);
    }
}
