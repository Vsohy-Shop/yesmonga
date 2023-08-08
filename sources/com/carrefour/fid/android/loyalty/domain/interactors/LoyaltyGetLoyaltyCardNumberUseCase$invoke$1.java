package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.models.loyalty.C38045b;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase", mo22502f = "LoyaltyGetLoyaltyCardNumberUseCase.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {14, 18}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "params", "params", "cachedCardNumber"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyGetLoyaltyCardNumberUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoyaltyGetLoyaltyCardNumberUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyGetLoyaltyCardNumberUseCase$invoke$1(LoyaltyGetLoyaltyCardNumberUseCase loyaltyGetLoyaltyCardNumberUseCase, C11045c<? super LoyaltyGetLoyaltyCardNumberUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = loyaltyGetLoyaltyCardNumberUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m173060invokegIAlus((C37697b.C37698a) null, (C11045c<? super Result<C38045b>>) this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
