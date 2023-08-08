package com.carrefour.fid.android.service.data.api.datasource;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource", mo22502f = "FacilityDataSource.kt", mo22503i = {}, mo22504l = {13}, mo22505m = "getStoreByAnabel-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FacilityDataSource$getStoreByAnabel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FacilityDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacilityDataSource$getStoreByAnabel$1(FacilityDataSource facilityDataSource, C11045c<? super FacilityDataSource$getStoreByAnabel$1> cVar) {
        super(cVar);
        this.this$0 = facilityDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172827getStoreByAnabel0E7RQCE((String) null, (Boolean) null, this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
