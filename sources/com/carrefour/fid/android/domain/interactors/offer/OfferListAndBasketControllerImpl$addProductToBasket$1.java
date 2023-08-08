package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.presentation.models.OfferModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl", mo22502f = "OfferListAndBasketControllerImpl.kt", mo22503i = {0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7, 7}, mo22504l = {360, 365, 371, 385, 398, 409, 410, 417, 418}, mo22505m = "addProductToBasket", mo22506n = {"this", "product", "quantity", "offerInList", "enableProductMixingIfAny", "incrementInController", "this", "product", "offerInList", "enableProductMixingIfAny", "lastQuantity", "this", "product", "it", "enableProductMixingIfAny", "this", "it", "this", "this", "it"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$0", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OfferListAndBasketControllerImpl$addProductToBasket$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfferListAndBasketControllerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferListAndBasketControllerImpl$addProductToBasket$1(OfferListAndBasketControllerImpl offerListAndBasketControllerImpl, C11045c<? super OfferListAndBasketControllerImpl$addProductToBasket$1> cVar) {
        super(cVar);
        this.this$0 = offerListAndBasketControllerImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo114801j((OfferModel) null, false, (Integer) null, false, this);
    }
}
