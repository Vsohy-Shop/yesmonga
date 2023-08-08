package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {490}, mo22505m = "setDeliveryOption-BUvihwM", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodCheckoutStep2ViewModel$setDeliveryOption$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$setDeliveryOption$2(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11045c<? super NonFoodCheckoutStep2ViewModel$setDeliveryOption$2> cVar) {
        super(cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object w0 = this.this$0.mo76001f1((DeliveryCode) null, (String) null, (String) null, this);
        return w0 == C11063b.m42612h() ? w0 : Result.m38701a(w0);
    }
}
