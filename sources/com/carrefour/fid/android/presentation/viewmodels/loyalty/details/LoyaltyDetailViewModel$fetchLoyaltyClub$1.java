package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel", mo22502f = "LoyaltyDetailViewModel.kt", mo22503i = {0, 1, 2}, mo22504l = {263, 268, 271}, mo22505m = "fetchLoyaltyClub", mo22506n = {"this", "this", "this"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyDetailViewModel$fetchLoyaltyClub$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoyaltyDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewModel$fetchLoyaltyClub$1(LoyaltyDetailViewModel loyaltyDetailViewModel, C11045c<? super LoyaltyDetailViewModel$fetchLoyaltyClub$1> cVar) {
        super(cVar);
        this.this$0 = loyaltyDetailViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77220B0(this);
    }
}
