package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.interactors.basket.C37571g0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$setDeliveryOption$3", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {0}, mo22504l = {491}, mo22505m = "invokeSuspend", mo22506n = {"$this$coroutineScope"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$setDeliveryOption$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,704:1\n230#2,5:705\n230#2,5:710\n230#2,5:715\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$setDeliveryOption$3\n*L\n494#1:705,5\n495#1:710,5\n509#1:715,5\n*E\n"})
public final class NonFoodCheckoutStep2ViewModel$setDeliveryOption$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Result<? extends Basket>>, Object> {
    final /* synthetic */ String $basketReference;
    final /* synthetic */ DeliveryCode $deliveryCode;
    final /* synthetic */ String $providerId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$setDeliveryOption$3(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, DeliveryCode deliveryCode, String str, String str2, C11045c<? super NonFoodCheckoutStep2ViewModel$setDeliveryOption$3> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
        this.$deliveryCode = deliveryCode;
        this.$basketReference = str;
        this.$providerId = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        NonFoodCheckoutStep2ViewModel$setDeliveryOption$3 nonFoodCheckoutStep2ViewModel$setDeliveryOption$3 = new NonFoodCheckoutStep2ViewModel$setDeliveryOption$3(this.this$0, this.$deliveryCode, this.$basketReference, this.$providerId, cVar);
        nonFoodCheckoutStep2ViewModel$setDeliveryOption$3.L$0 = obj;
        return nonFoodCheckoutStep2ViewModel$setDeliveryOption$3;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        C12074o0 o0Var;
        Object value;
        Object value2;
        Object value3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var2 = (C12074o0) this.L$0;
            C37571g0 j0 = this.this$0.f63952b;
            C37571g0.C37572a aVar = new C37571g0.C37572a(this.$deliveryCode, this.$basketReference, this.$providerId, (DefaultConstructorMarker) null);
            this.L$0 = o0Var2;
            this.label = 1;
            Object r1 = j0.m172966invokegIAlus(aVar, this);
            if (r1 == h) {
                return h;
            }
            o0Var = o0Var2;
            obj2 = r1;
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
            o0Var = (C12074o0) this.L$0;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            Basket basket = (Basket) obj2;
            C11940j n0 = nonFoodCheckoutStep2ViewModel.f63974x;
            do {
                value2 = n0.getValue();
                C28892e eVar = (C28892e) value2;
            } while (!n0.mo24216e(value2, C28892e.C28894b.f70781b));
            C11940j n02 = nonFoodCheckoutStep2ViewModel.f63974x;
            do {
                value3 = n02.getValue();
                C28892e eVar2 = (C28892e) value3;
            } while (!n02.mo24216e(value3, new C28892e.C28895c(basket)));
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3(nonFoodCheckoutStep2ViewModel, basket, (C11045c<? super NonFoodCheckoutStep2ViewModel$setDeliveryOption$3$1$3>) null), 3, (Object) null);
        }
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11940j n03 = nonFoodCheckoutStep2ViewModel2.f63974x;
            do {
                value = n03.getValue();
                C28892e eVar3 = (C28892e) value;
            } while (!n03.mo24216e(value, new C28892e.C28893a(e)));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Result<Basket>> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$setDeliveryOption$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
