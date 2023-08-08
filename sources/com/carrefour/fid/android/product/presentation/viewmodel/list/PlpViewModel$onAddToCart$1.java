package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel", mo22502f = "PlpViewModel.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {216, 220}, mo22505m = "onAddToCart", mo22506n = {"this", "intent", "this", "intent"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PlpViewModel$onAddToCart$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlpViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpViewModel$onAddToCart$1(PlpViewModel plpViewModel, C11045c<? super PlpViewModel$onAddToCart$1> cVar) {
        super(cVar);
        this.this$0 = plpViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo81928y0((PlpViewModel.C28181c.C28182a) null, this);
    }
}
