package com.carrefour.fid.android.service.domain.interactors;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase", mo22502f = "ServiceGetMirrorDriveServiceUseCase.kt", mo22503i = {0}, mo22504l = {19}, mo22505m = "invoke-CkRE9Mk", mo22506n = {"facilityServiceId"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceGetMirrorDriveServiceUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceGetMirrorDriveServiceUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceGetMirrorDriveServiceUseCase$invoke$1(ServiceGetMirrorDriveServiceUseCase serviceGetMirrorDriveServiceUseCase, C11045c<? super ServiceGetMirrorDriveServiceUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = serviceGetMirrorDriveServiceUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r3 = this.this$0.m172850invokeCkRE9Mk((String) null, false, this);
        return r3 == C11063b.m42612h() ? r3 : Result.m38701a(r3);
    }
}
