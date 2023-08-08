package com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist;

import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel$getBasketsList$1", mo22502f = "CheckoutBasketsListViewModel.kt", mo22503i = {}, mo22504l = {31}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutBasketsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutBasketsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/basketslist/CheckoutBasketsListViewModel$getBasketsList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,48:1\n230#2,5:49\n230#2,5:54\n230#2,5:59\n*S KotlinDebug\n*F\n+ 1 CheckoutBasketsListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/basketslist/CheckoutBasketsListViewModel$getBasketsList$1\n*L\n30#1:49,5\n32#1:54,5\n34#1:59,5\n*E\n"})
public final class CheckoutBasketsListViewModel$getBasketsList$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ CheckoutBasketsListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListViewModel$getBasketsList$1(CheckoutBasketsListViewModel checkoutBasketsListViewModel, C11045c<? super CheckoutBasketsListViewModel$getBasketsList$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutBasketsListViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutBasketsListViewModel$getBasketsList$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11940j e0 = this.this$0.f63898d;
            do {
                value3 = e0.getValue();
                C28892e eVar = (C28892e) value3;
            } while (!e0.mo24216e(value3, C28892e.C28894b.f70781b));
            C37587n c0 = this.this$0.f63895a;
            this.label = 1;
            obj2 = c0.m172965invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutBasketsListViewModel checkoutBasketsListViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            List list = (List) obj2;
            C11940j e02 = checkoutBasketsListViewModel.f63898d;
            do {
                value2 = e02.getValue();
                C28892e eVar2 = (C28892e) value2;
            } while (!e02.mo24216e(value2, new C28892e.C28895c(list)));
        }
        CheckoutBasketsListViewModel checkoutBasketsListViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11940j e03 = checkoutBasketsListViewModel2.f63898d;
            do {
                value = e03.getValue();
                C28892e eVar3 = (C28892e) value;
            } while (!e03.mo24216e(value, new C28892e.C28893a(e)));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutBasketsListViewModel$getBasketsList$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
