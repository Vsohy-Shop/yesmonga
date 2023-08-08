package com.carrefour.fid.android.account.presentation.viewmodels.account;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel", mo22502f = "UpdateUserEmailViewModel.kt", mo22503i = {0, 0}, mo22504l = {36}, mo22505m = "saveEmail", mo22506n = {"this", "email"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateUserEmailViewModel$saveEmail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateUserEmailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserEmailViewModel$saveEmail$1(UpdateUserEmailViewModel updateUserEmailViewModel, C11045c<? super UpdateUserEmailViewModel$saveEmail$1> cVar) {
        super(cVar);
        this.this$0 = updateUserEmailViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32225g0((String) null, this);
    }
}
