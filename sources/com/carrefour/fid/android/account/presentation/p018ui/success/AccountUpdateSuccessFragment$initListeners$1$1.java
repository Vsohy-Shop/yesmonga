package com.carrefour.fid.android.account.presentation.p018ui.success;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment$initListeners$1$1", mo22502f = "AccountUpdateSuccessFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment$initListeners$1$1 */
public final class AccountUpdateSuccessFragment$initListeners$1$1 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AccountUpdateSuccessFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountUpdateSuccessFragment$initListeners$1$1(AccountUpdateSuccessFragment accountUpdateSuccessFragment, C11045c<? super AccountUpdateSuccessFragment$initListeners$1$1> cVar) {
        super(2, cVar);
        this.this$0 = accountUpdateSuccessFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountUpdateSuccessFragment$initListeners$1$1(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountUpdateSuccessFragment$initListeners$1$1) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo32160b1();
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
