package com.carrefour.fid.android.data.repositories;

import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository", mo22502f = "APIMProductDetailsRepository.kt", mo22503i = {0}, mo22504l = {90}, mo22505m = "buildProductDetailsBody", mo22506n = {"gtinList"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class APIMProductDetailsRepository$buildProductDetailsBody$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ APIMProductDetailsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APIMProductDetailsRepository$buildProductDetailsBody$1(APIMProductDetailsRepository aPIMProductDetailsRepository, C11045c<? super APIMProductDetailsRepository$buildProductDetailsBody$1> cVar) {
        super(cVar);
        this.this$0 = aPIMProductDetailsRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo111475j((List<String>) null, (String) null, this);
    }
}
