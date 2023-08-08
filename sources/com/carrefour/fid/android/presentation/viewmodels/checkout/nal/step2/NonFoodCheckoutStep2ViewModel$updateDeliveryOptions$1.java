package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {459, 470}, mo22505m = "updateDeliveryOptions-qpngmBQ", mo22506n = {"this", "basketReference", "this", "options"}, mo22507s = {"L$0", "L$1", "L$0", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodCheckoutStep2ViewModel$updateDeliveryOptions$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$updateDeliveryOptions$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11045c<? super NonFoodCheckoutStep2ViewModel$updateDeliveryOptions$1> cVar) {
        super(cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76010n1((List<Offer>) null, (String) null, this);
    }
}
