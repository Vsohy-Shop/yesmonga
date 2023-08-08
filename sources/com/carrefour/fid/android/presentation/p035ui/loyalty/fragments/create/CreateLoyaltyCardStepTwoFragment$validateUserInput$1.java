package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment", mo22502f = "CreateLoyaltyCardStepTwoFragment.kt", mo22503i = {0, 0}, mo22504l = {77, 84}, mo22505m = "validateUserInput", mo22506n = {"this", "loyaltyAddress"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$1 */
public final class CreateLoyaltyCardStepTwoFragment$validateUserInput$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateLoyaltyCardStepTwoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoFragment$validateUserInput$1(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment, C11045c<? super CreateLoyaltyCardStepTwoFragment$validateUserInput$1> cVar) {
        super(cVar);
        this.this$0 = createLoyaltyCardStepTwoFragment;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo71183O0((LoyaltyMembershipConsentModel) null, this);
    }
}
