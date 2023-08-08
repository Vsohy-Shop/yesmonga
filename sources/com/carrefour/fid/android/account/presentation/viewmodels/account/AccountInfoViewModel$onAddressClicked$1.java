package com.carrefour.fid.android.account.presentation.viewmodels.account;

import com.carrefour.fid.android.domain.models.AddressCategory;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel", mo22502f = "AccountInfoViewModel.kt", mo22503i = {0, 0}, mo22504l = {66}, mo22505m = "onAddressClicked", mo22506n = {"this", "category"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountInfoViewModel$onAddressClicked$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountInfoViewModel$onAddressClicked$1(AccountInfoViewModel accountInfoViewModel, C11045c<? super AccountInfoViewModel$onAddressClicked$1> cVar) {
        super(cVar);
        this.this$0 = accountInfoViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32192g0((AddressCategory) null, this);
    }
}
