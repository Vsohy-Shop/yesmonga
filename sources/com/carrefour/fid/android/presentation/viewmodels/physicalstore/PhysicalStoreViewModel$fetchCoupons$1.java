package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel", mo22502f = "PhysicalStoreViewModel.kt", mo22503i = {0}, mo22504l = {255}, mo22505m = "fetchCoupons", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PhysicalStoreViewModel$fetchCoupons$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PhysicalStoreViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreViewModel$fetchCoupons$1(PhysicalStoreViewModel physicalStoreViewModel, C11045c<? super PhysicalStoreViewModel$fetchCoupons$1> cVar) {
        super(cVar);
        this.this$0 = physicalStoreViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo78799r0((String) null, this);
    }
}
