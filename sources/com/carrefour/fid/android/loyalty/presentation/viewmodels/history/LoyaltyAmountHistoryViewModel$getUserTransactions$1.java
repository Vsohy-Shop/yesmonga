package com.carrefour.fid.android.loyalty.presentation.viewmodels.history;

import com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel", mo22502f = "LoyaltyAmountHistoryViewModel.kt", mo22503i = {0, 0}, mo22504l = {53}, mo22505m = "getUserTransactions", mo22506n = {"this", "list"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyAmountHistoryViewModel$getUserTransactions$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoyaltyAmountHistoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyAmountHistoryViewModel$getUserTransactions$1(LoyaltyAmountHistoryViewModel loyaltyAmountHistoryViewModel, C11045c<? super LoyaltyAmountHistoryViewModel$getUserTransactions$1> cVar) {
        super(cVar);
        this.this$0 = loyaltyAmountHistoryViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getUserTransactions((List<LoyaltyCardOperationHistoryDomain>) null, this);
    }
}
