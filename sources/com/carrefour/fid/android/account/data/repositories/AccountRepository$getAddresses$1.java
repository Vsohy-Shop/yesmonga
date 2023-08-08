package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.repositories.AccountRepository", mo22502f = "AccountRepository.kt", mo22503i = {0, 0, 0}, mo22504l = {200}, mo22505m = "getAddresses", mo22506n = {"address", "$this$getAddresses_u24lambda_u248", "mergedAddress"}, mo22507s = {"L$0", "L$2", "L$3"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountRepository$getAddresses$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepository$getAddresses$1(AccountRepository accountRepository, C11045c<? super AccountRepository$getAddresses$1> cVar) {
        super(cVar);
        this.this$0 = accountRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo31326k((Address) null, (DQEAddressDomain) null, this);
    }
}
