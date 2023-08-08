package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {500}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,704:1\n230#2,5:705\n230#2,5:710\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3\n*L\n503#1:705,5\n505#1:710,5\n*E\n"})
public final class NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Basket $basket;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, Basket basket, C11045c<? super NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
        this.$basket = basket;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3(this.this$0, this.$basket, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37581k0 k0 = this.this$0.f63956f;
            C37581k0.C37582a aVar = new C37581k0.C37582a(BasketReference.m156093b(this.this$0.mo75984O0()));
            this.label = 1;
            Object r2 = k0.m172966invokegIAlus(aVar, this);
            if (r2 == h) {
                return h;
            }
            obj2 = r2;
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.this$0;
        Basket basket = this.$basket;
        if (Result.m38710j(obj2)) {
            Basket basket2 = (Basket) obj2;
            C11940j n0 = nonFoodCheckoutStep2ViewModel.f63974x;
            while (true) {
                Object value2 = n0.getValue();
                C28892e eVar = (C28892e) value2;
                Basket basket3 = basket;
                if (n0.mo24216e(value2, new C28892e.C28895c(Basket.m155991v(basket, basket2.mo116855w(), (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 0, (BasketPromotionCode) null, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, (BasketType) null, (Integer) null, (List) null, (BasketReturnableBags) null, 524286, (Object) null)))) {
                    break;
                }
                basket = basket3;
            }
        }
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11940j n02 = nonFoodCheckoutStep2ViewModel2.f63974x;
            do {
                value = n02.getValue();
                C28892e eVar2 = (C28892e) value;
            } while (!n02.mo24216e(value, new C28892e.C28893a(e)));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
