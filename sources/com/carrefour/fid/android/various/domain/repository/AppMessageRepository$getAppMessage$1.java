package com.carrefour.fid.android.various.domain.repository;

import com.carrefour.fid.android.various.domain.model.AppMessageType;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.domain.repository.AppMessageRepository", mo22502f = "AppMessageRepository.kt", mo22503i = {0, 1}, mo22504l = {28, 29}, mo22505m = "getAppMessage-gIAlu-s", mo22506n = {"remote", "remote"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppMessageRepository$getAppMessage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppMessageRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppMessageRepository$getAppMessage$1(AppMessageRepository appMessageRepository, C11045c<? super AppMessageRepository$getAppMessage$1> cVar) {
        super(cVar);
        this.this$0 = appMessageRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo67239b((AppMessageType) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
