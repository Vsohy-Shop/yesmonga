package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel", mo22502f = "ServiceStationsResultViewModel.kt", mo22503i = {0, 0, 1, 2}, mo22504l = {54, 66, 62, 76}, mo22505m = "postTicketCard", mo22506n = {"this", "mediaPath", "this", "this"}, mo22507s = {"L$0", "L$1", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceStationsResultViewModel$postTicketCard$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceStationsResultViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceStationsResultViewModel$postTicketCard$1(ServiceStationsResultViewModel serviceStationsResultViewModel, C11045c<? super ServiceStationsResultViewModel$postTicketCard$1> cVar) {
        super(cVar);
        this.this$0 = serviceStationsResultViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76651u0((String) null, this);
    }
}
