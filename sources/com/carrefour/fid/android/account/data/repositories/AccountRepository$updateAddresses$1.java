package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.repositories.AccountRepository", mo22502f = "AccountRepository.kt", mo22503i = {}, mo22504l = {166}, mo22505m = "updateAddresses-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountRepository$updateAddresses$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepository$updateAddresses$1(AccountRepository accountRepository, C11045c<? super AccountRepository$updateAddresses$1> cVar) {
        super(cVar);
        this.this$0 = accountRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.mo31335u((List<AddressUserResponse>) null, (List<PhonesUserResponse>) null, this);
        return f == C11063b.m42612h() ? f : Result.m38701a(f);
    }
}
