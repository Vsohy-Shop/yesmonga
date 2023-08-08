package com.carrefour.fid.android.presentation.viewmodels.account.home;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$clearUserUuid$1", mo22502f = "AccountMenuViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/home/AccountMenuViewModel$clearUserUuid$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,160:1\n230#2,5:161\n*S KotlinDebug\n*F\n+ 1 AccountMenuViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/home/AccountMenuViewModel$clearUserUuid$1\n*L\n134#1:161,5\n*E\n"})
public final class AccountMenuViewModel$clearUserUuid$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AccountMenuViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuViewModel$clearUserUuid$1(AccountMenuViewModel accountMenuViewModel, C11045c<? super AccountMenuViewModel$clearUserUuid$1> cVar) {
        super(2, cVar);
        this.this$0 = accountMenuViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountMenuViewModel$clearUserUuid$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object value;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11940j r0 = this.this$0.f63178s;
            do {
                value = r0.getValue();
                String str = (String) value;
            } while (!r0.mo24216e(value, null));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountMenuViewModel$clearUserUuid$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
