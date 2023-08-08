package com.carrefour.fid.android.data.repositories;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository", mo22502f = "APIMProductDetailsRepository.kt", mo22503i = {}, mo22504l = {39}, mo22505m = "getOfferList-BWLJW6A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class APIMProductDetailsRepository$getOfferList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ APIMProductDetailsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APIMProductDetailsRepository$getOfferList$1(APIMProductDetailsRepository aPIMProductDetailsRepository, C11045c<? super APIMProductDetailsRepository$getOfferList$1> cVar) {
        super(cVar);
        this.this$0 = aPIMProductDetailsRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.mo111474c((List<String>) null, false, (String) null, this);
        return c == C11063b.m42612h() ? c : Result.m38701a(c);
    }
}
