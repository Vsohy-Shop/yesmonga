package com.carrefour.fid.android.various.domain.interactor;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase", mo22502f = "ThirdPartyCheckAppMessageUseCase.kt", mo22503i = {0, 1, 2}, mo22504l = {17, 18, 19}, mo22505m = "invoke-IoAF18A", mo22506n = {"this", "this", "noAppBroadcastMessage"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ThirdPartyCheckAppMessageUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ThirdPartyCheckAppMessageUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdPartyCheckAppMessageUseCase$invoke$1(ThirdPartyCheckAppMessageUseCase thirdPartyCheckAppMessageUseCase, C11045c<? super ThirdPartyCheckAppMessageUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = thirdPartyCheckAppMessageUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172810invokeIoAF18A(this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
