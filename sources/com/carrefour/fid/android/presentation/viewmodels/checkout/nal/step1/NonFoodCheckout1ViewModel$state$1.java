package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$state$1", mo22502f = "NonFoodCheckout1ViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/interactors/basket/d;", "basketAndOffersState", "Lkotlin/d2;", "updateBasketState", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/b;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckout1ViewModel$state$1 extends SuspendLambda implements C11305q<C28892e<? extends C37562d>, C28892e<? extends C11079d2>, C11045c<? super C26144b>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public NonFoodCheckout1ViewModel$state$1(C11045c<? super NonFoodCheckout1ViewModel$state$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C28892e<C37562d> eVar, @C12579k C28892e<C11079d2> eVar2, @C12580l C11045c<? super C26144b> cVar) {
        NonFoodCheckout1ViewModel$state$1 nonFoodCheckout1ViewModel$state$1 = new NonFoodCheckout1ViewModel$state$1(cVar);
        nonFoodCheckout1ViewModel$state$1.L$0 = eVar;
        nonFoodCheckout1ViewModel$state$1.L$1 = eVar2;
        return nonFoodCheckout1ViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return new C26144b((C28892e) this.L$1, (C28892e) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
