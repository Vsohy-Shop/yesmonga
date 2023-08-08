package com.carrefour.fid.android.account.presentation.viewmodels.signin;

import com.carrefour.fid.android.account.domain.models.LoginDomain;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel", mo22502f = "SignInViewModel.kt", mo22503i = {0, 1, 1, 2, 2, 2, 2}, mo22504l = {100, 115, 126}, mo22505m = "getUserInfo", mo22506n = {"this", "this", "result", "this", "userProfiling", "userProfilingPartner", "userHasFidCard"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SignInViewModel$getUserInfo$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SignInViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignInViewModel$getUserInfo$1(SignInViewModel signInViewModel, C11045c<? super SignInViewModel$getUserInfo$1> cVar) {
        super(cVar);
        this.this$0 = signInViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32603f0((LoginDomain) null, this);
    }
}
