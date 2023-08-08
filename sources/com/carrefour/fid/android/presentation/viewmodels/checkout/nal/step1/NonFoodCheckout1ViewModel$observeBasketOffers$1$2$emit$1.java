package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2", mo22502f = "NonFoodCheckout1ViewModel.kt", mo22503i = {0, 0, 0, 0}, mo22504l = {120}, mo22505m = "emit", mo22506n = {"this", "basketAndOffers", "$this$update$iv", "prevValue$iv"}, mo22507s = {"L$0", "L$3", "L$4", "L$5"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NonFoodCheckout1ViewModel$observeBasketOffers$1.C261422 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1(NonFoodCheckout1ViewModel$observeBasketOffers$1.C261422 r1, C11045c<? super NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(Result.m38701a((Object) null), this);
    }
}
