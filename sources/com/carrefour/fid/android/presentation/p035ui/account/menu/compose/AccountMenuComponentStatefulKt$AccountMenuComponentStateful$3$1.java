package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1", mo22502f = "AccountMenuComponentStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1 */
public final class AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<String, C11079d2> $onUserUuidFetched;
    final /* synthetic */ C8578k2<C25798c> $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1(C8578k2<C25798c> k2Var, C11300l<? super String, C11079d2> lVar, C11045c<? super AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1> cVar) {
        super(2, cVar);
        this.$state = k2Var;
        this.$onUserUuidFetched = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1(this.$state, this.$onUserUuidFetched, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            String l = this.$state.getValue().mo74902l();
            if (l != null) {
                this.$onUserUuidFetched.invoke(l);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountMenuComponentStatefulKt$AccountMenuComponentStateful$3$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
