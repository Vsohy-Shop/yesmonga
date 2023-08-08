package com.carrefour.fid.android.product.presentation.viewmodel.quantity;

import com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel", mo22502f = "QuantityBackDropViewModel.kt", mo22503i = {0, 0, 0}, mo22504l = {110}, mo22505m = "onSetProductQuantity", mo22506n = {"this", "intent", "offer"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class QuantityBackDropViewModel$onSetProductQuantity$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuantityBackDropViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuantityBackDropViewModel$onSetProductQuantity$1(QuantityBackDropViewModel quantityBackDropViewModel, C11045c<? super QuantityBackDropViewModel$onSetProductQuantity$1> cVar) {
        super(cVar);
        this.this$0 = quantityBackDropViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo82125o0((QuantityBackDropViewModel.C28218d.C28220b) null, this);
    }
}
