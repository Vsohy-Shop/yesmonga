package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.user.C37875c;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase", mo22502f = "AccountGetUserAddressUseCase.kt", mo22503i = {0}, mo22504l = {14}, mo22505m = "invoke-gIAlu-s", mo22506n = {"param"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountGetUserAddressUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountGetUserAddressUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountGetUserAddressUseCase$invoke$1(AccountGetUserAddressUseCase accountGetUserAddressUseCase, C11045c<? super AccountGetUserAddressUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = accountGetUserAddressUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172738invokegIAlus((C37875c.C37876a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
