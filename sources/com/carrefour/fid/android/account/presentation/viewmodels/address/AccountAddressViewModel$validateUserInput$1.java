package com.carrefour.fid.android.account.presentation.viewmodels.address;

import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel", mo22502f = "AccountAddressViewModel.kt", mo22503i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3}, mo22504l = {184, 192, 216, 221}, mo22505m = "validateUserInput", mo22506n = {"this", "address", "telephone", "this", "address", "telephone", "initialAddress", "autoSave", "this", "telephone", "suggestions", "addressUpdatedWithDqe", "autoSave", "this", "telephone", "addressUpdatedWithDqe"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$3"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountAddressViewModel$validateUserInput$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountAddressViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountAddressViewModel$validateUserInput$1(AccountAddressViewModel accountAddressViewModel, C11045c<? super AccountAddressViewModel$validateUserInput$1> cVar) {
        super(cVar);
        this.this$0 = accountAddressViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32388q0((Address) null, (String) null, false, this);
    }
}
