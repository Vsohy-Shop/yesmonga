package com.carrefour.fid.android.account.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.repositories.LoginRepository", mo22502f = "LoginRepository.kt", mo22503i = {0, 0}, mo22504l = {33}, mo22505m = "login-0E7RQCE", mo22506n = {"this", "userName"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoginRepository$login$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoginRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginRepository$login$1(LoginRepository loginRepository, C11045c<? super LoginRepository$login$1> cVar) {
        super(cVar);
        this.this$0 = loginRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.mo31355g((String) null, (String) null, this);
        return g == C11063b.m42612h() ? g : Result.m38701a(g);
    }
}
