package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import com.carrefour.fid.android.presentation.components.home.CouponCardView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$initNbCoupon$1$1", mo22502f = "LoyaltyDetailViewFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$initNbCoupon$1$1 */
public final class LoyaltyDetailViewFragment$initNbCoupon$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CouponCardView $couponCardView;
    final /* synthetic */ Integer $nbCoupon;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewFragment$initNbCoupon$1$1(CouponCardView couponCardView, Integer num, C11045c<? super LoyaltyDetailViewFragment$initNbCoupon$1$1> cVar) {
        super(2, cVar);
        this.$couponCardView = couponCardView;
        this.$nbCoupon = num;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoyaltyDetailViewFragment$initNbCoupon$1$1(this.$couponCardView, this.$nbCoupon, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.$couponCardView.mo121226c();
            this.$couponCardView.mo121225b(String.valueOf(this.$nbCoupon));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyDetailViewFragment$initNbCoupon$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
