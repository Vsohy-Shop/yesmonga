package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper", mo22502f = "OHMOrdersOnlineDetailsEntityDataMapper.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {52, 65}, mo22505m = "asDomain", mo22506n = {"this", "$this$asDomain", "this", "$this$asDomain"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OHMOrdersOnlineDetailsEntityDataMapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1(OHMOrdersOnlineDetailsEntityDataMapper oHMOrdersOnlineDetailsEntityDataMapper, C11045c<? super OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1> cVar) {
        super(cVar);
        this.this$0 = oHMOrdersOnlineDetailsEntityDataMapper;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo111174c((OHMOrdersOnlineDetailsDataEntity) null, this);
    }
}
