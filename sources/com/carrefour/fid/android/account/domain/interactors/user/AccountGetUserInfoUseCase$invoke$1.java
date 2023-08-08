package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.user.C37878e;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase", mo22502f = "AccountGetUserInfoUseCase.kt", mo22503i = {0}, mo22504l = {14, 16}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountGetUserInfoUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountGetUserInfoUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountGetUserInfoUseCase$invoke$1(AccountGetUserInfoUseCase accountGetUserInfoUseCase, C11045c<? super AccountGetUserInfoUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = accountGetUserInfoUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172740invokegIAlus((C37878e.C37881c) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
