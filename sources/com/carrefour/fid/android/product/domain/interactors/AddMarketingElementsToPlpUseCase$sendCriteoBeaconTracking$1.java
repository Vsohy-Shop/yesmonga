package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.utilities.C38207a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase", mo22502f = "AddMarketingElementsToPlpUseCase.kt", mo22503i = {0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5}, mo22504l = {86, 90, 96, 100, 105, 109}, mo22505m = "sendCriteoBeaconTracking", mo22506n = {"this", "criteoDomain", "butterfly", "this", "criteoDomain", "this", "criteoDomain", "this", "criteoDomain", "this", "criteoDomain", "this"}, mo22507s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AddMarketingElementsToPlpUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1(AddMarketingElementsToPlpUseCase addMarketingElementsToPlpUseCase, C11045c<? super AddMarketingElementsToPlpUseCase$sendCriteoBeaconTracking$1> cVar) {
        super(cVar);
        this.this$0 = addMarketingElementsToPlpUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79934o((C38207a) null, this);
    }
}
