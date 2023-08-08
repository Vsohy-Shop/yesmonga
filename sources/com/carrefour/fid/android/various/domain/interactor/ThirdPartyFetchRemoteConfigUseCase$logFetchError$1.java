package com.carrefour.fid.android.various.domain.interactor;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase", mo22502f = "ThirdPartyFetchRemoteConfigUseCase.kt", mo22503i = {}, mo22504l = {29}, mo22505m = "logFetchError", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ThirdPartyFetchRemoteConfigUseCase$logFetchError$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ThirdPartyFetchRemoteConfigUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdPartyFetchRemoteConfigUseCase$logFetchError$1(ThirdPartyFetchRemoteConfigUseCase thirdPartyFetchRemoteConfigUseCase, C11045c<? super ThirdPartyFetchRemoteConfigUseCase$logFetchError$1> cVar) {
        super(cVar);
        this.this$0 = thirdPartyFetchRemoteConfigUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo67194c((Throwable) null, this);
    }
}
