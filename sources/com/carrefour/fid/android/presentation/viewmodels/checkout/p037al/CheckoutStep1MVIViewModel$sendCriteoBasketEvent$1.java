package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel", mo22502f = "CheckoutStep1MVIViewModel.kt", mo22503i = {}, mo22504l = {678, 680}, mo22505m = "sendCriteoBasketEvent", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$sendCriteoBasketEvent$1 */
public final class CheckoutStep1MVIViewModel$sendCriteoBasketEvent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStep1MVIViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1MVIViewModel$sendCriteoBasketEvent$1(CheckoutStep1MVIViewModel checkoutStep1MVIViewModel, C11045c<? super CheckoutStep1MVIViewModel$sendCriteoBasketEvent$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStep1MVIViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75422F1((OfferProductModel) null, 0, this);
    }
}
