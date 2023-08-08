package com.carrefour.fid.android.various.data.repository;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl", mo22502f = "RemoteConfigRepositoryImpl.kt", mo22503i = {}, mo22504l = {14}, mo22505m = "fetchRemoteConfig-IoAF18A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class RemoteConfigRepositoryImpl$fetchRemoteConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteConfigRepositoryImpl$fetchRemoteConfig$1(RemoteConfigRepositoryImpl remoteConfigRepositoryImpl, C11045c<? super RemoteConfigRepositoryImpl$fetchRemoteConfig$1> cVar) {
        super(cVar);
        this.this$0 = remoteConfigRepositoryImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo67179b(this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
