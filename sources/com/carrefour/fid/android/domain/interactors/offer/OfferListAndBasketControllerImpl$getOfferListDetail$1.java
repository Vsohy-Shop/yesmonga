package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.models.offer.AvailableType;
import com.carrefour.fid.android.domain.models.offer.UnavailableType;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl", mo22502f = "OfferListAndBasketControllerImpl.kt", mo22503i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4}, mo22504l = {151, 159, 156, 164, 176}, mo22505m = "getOfferListDetail", mo22506n = {"this", "this", "shoppingListRequestType", "availableType", "unavailableType", "this", "shoppingListRequestType", "availableType", "unavailableType", "this", "shoppingListRequestType", "availableType", "unavailableType", "this"}, mo22507s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OfferListAndBasketControllerImpl$getOfferListDetail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfferListAndBasketControllerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferListAndBasketControllerImpl$getOfferListDetail$1(OfferListAndBasketControllerImpl offerListAndBasketControllerImpl, C11045c<? super OfferListAndBasketControllerImpl$getOfferListDetail$1> cVar) {
        super(cVar);
        this.this$0 = offerListAndBasketControllerImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo114803l((List<String>) null, (RequestType) null, (AvailableType) null, (UnavailableType) null, this);
    }
}
