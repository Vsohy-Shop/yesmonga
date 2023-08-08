package com.carrefour.fid.android.account.presentation.viewmodels.address;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel", mo22502f = "VerifyUserAddressViewModel.kt", mo22503i = {0, 0, 0}, mo22504l = {138}, mo22505m = "saveNonDQEAddress", mo22506n = {"this", "address", "telephone"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class VerifyUserAddressViewModel$saveNonDQEAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifyUserAddressViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifyUserAddressViewModel$saveNonDQEAddress$1(VerifyUserAddressViewModel verifyUserAddressViewModel, C11045c<? super VerifyUserAddressViewModel$saveNonDQEAddress$1> cVar) {
        super(cVar);
        this.this$0 = verifyUserAddressViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32393o0(false, this);
    }
}
