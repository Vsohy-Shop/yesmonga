package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.delivery.C38018c;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$setDeliveryOption$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {168}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckoutStep2ViewModel$setDeliveryOption$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C38017b $deliveryOption;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$setDeliveryOption$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C38017b bVar, C11045c<? super NonFoodCheckoutStep2ViewModel$setDeliveryOption$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
        this.$deliveryOption = bVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckoutStep2ViewModel$setDeliveryOption$1(this.this$0, this.$deliveryOption, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        String str;
        DeliveryCode deliveryCode;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Basket basket = (Basket) C28897f.m119478b((C28892e) this.this$0.f63974x.getValue());
            if (basket == null) {
                return C11079d2.f28267a;
            }
            String G = basket.mo116822G();
            C38080a m = this.this$0.mo75982M0().getValue().mo76127m();
            if (m == null || (str = m.mo118294u()) == null) {
                str = "";
            }
            if (C38018c.m156719a(this.$deliveryOption)) {
                C38080a m2 = this.this$0.mo75982M0().getValue().mo76127m();
                if (m2 == null) {
                    deliveryCode = this.$deliveryOption.mo117633a();
                } else if (m2.mo118295v()) {
                    deliveryCode = DeliveryCode.PRC;
                } else {
                    deliveryCode = DeliveryCode.PRE;
                }
            } else {
                deliveryCode = this.$deliveryOption.mo117633a();
            }
            NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.this$0;
            this.label = 1;
            if (nonFoodCheckoutStep2ViewModel.mo76001f1(deliveryCode, G, str, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$setDeliveryOption$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
