package com.carrefour.fid.android.account.presentation.viewmodels.account;

import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel", mo22502f = "UpdateUserPasswordViewModel.kt", mo22503i = {0, 0}, mo22504l = {79}, mo22505m = "validatePassword", mo22506n = {"this", "vld"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateUserPasswordViewModel$validatePassword$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateUserPasswordViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserPasswordViewModel$validatePassword$1(UpdateUserPasswordViewModel updateUserPasswordViewModel, C11045c<? super UpdateUserPasswordViewModel$validatePassword$1> cVar) {
        super(cVar);
        this.this$0 = updateUserPasswordViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32242p0((UpdateUserPassword.C13615b.C13619d) null, this);
    }
}
