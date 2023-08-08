package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel", mo22502f = "InitLoyaltyCardViewModel.kt", mo22503i = {0, 0, 0, 1}, mo22504l = {104, 105, 120, 114}, mo22505m = "activateAndLinkLoyaltyProcess", mo22506n = {"this", "loyaltyMembershipConsent", "loyaltyCard", "this"}, mo22507s = {"L$0", "L$1", "L$2", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitLoyaltyCardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1(InitLoyaltyCardViewModel initLoyaltyCardViewModel, C11045c<? super InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1> cVar) {
        super(cVar);
        this.this$0 = initLoyaltyCardViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.activateAndLinkLoyaltyProcess((LoyaltyMembershipConsentModel) null, (String) null, this);
    }
}
