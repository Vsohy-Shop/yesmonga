package com.carrefour.fid.android.account.data.datasource;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource", mo22502f = "RemoteLoginDataSource.kt", mo22503i = {}, mo22504l = {48}, mo22505m = "refreshToken-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class RemoteLoginDataSource$refreshToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteLoginDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteLoginDataSource$refreshToken$1(RemoteLoginDataSource remoteLoginDataSource, C11045c<? super RemoteLoginDataSource$refreshToken$1> cVar) {
        super(cVar);
        this.this$0 = remoteLoginDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object h = this.this$0.mo31148h((String) null, this);
        return h == C11063b.m42612h() ? h : Result.m38701a(h);
    }
}
