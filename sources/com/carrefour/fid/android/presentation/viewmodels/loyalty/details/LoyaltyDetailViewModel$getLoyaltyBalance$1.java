package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

import com.carrefour.fid.android.domain.models.account.UserCards;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel", mo22502f = "LoyaltyDetailViewModel.kt", mo22503i = {0, 0}, mo22504l = {152}, mo22505m = "getLoyaltyBalance", mo22506n = {"this", "cardModel"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyDetailViewModel$getLoyaltyBalance$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoyaltyDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewModel$getLoyaltyBalance$1(LoyaltyDetailViewModel loyaltyDetailViewModel, C11045c<? super LoyaltyDetailViewModel$getLoyaltyBalance$1> cVar) {
        super(cVar);
        this.this$0 = loyaltyDetailViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77226H0((UserCards) null, this);
    }
}
