package com.carrefour.fid.android.presentation.viewmodels.coupons;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel$burnCoupons$1", mo22502f = "CouponsListViewModel.kt", mo22503i = {}, mo22504l = {204}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CouponsListViewModel$burnCoupons$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11723c2 $job;
    int label;
    final /* synthetic */ CouponsListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListViewModel$burnCoupons$1(CouponsListViewModel couponsListViewModel, C11723c2 c2Var, C11045c<? super CouponsListViewModel$burnCoupons$1> cVar) {
        super(2, cVar);
        this.this$0 = couponsListViewModel;
        this.$job = c2Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CouponsListViewModel$burnCoupons$1(this.this$0, this.$job, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11744g h0 = this.this$0.f64143j;
            C11723c2 c2Var = this.$job;
            this.label = 1;
            if (h0.mo23757h0(c2Var, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CouponsListViewModel$burnCoupons$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
