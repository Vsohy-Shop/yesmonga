package com.carrefour.fid.android.various.data.repository;

import com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl", mo22502f = "RemoteConfigRepositoryImpl.kt", mo22503i = {}, mo22504l = {20}, mo22505m = "checkRemoteConfig-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class RemoteConfigRepositoryImpl$checkRemoteConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteConfigRepositoryImpl$checkRemoteConfig$1(RemoteConfigRepositoryImpl remoteConfigRepositoryImpl, C11045c<? super RemoteConfigRepositoryImpl$checkRemoteConfig$1> cVar) {
        super(cVar);
        this.this$0 = remoteConfigRepositoryImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo67178a((RemoteConfigTag) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
