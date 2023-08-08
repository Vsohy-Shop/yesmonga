package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26916f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel$3$1$1", mo22502f = "CheckoutStepOneAdditionalOrderViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CheckoutStepOneAdditionalOrderViewModel$3$1$1 extends SuspendLambda implements C11304p<List<? extends OfferModel>, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CheckoutStepOneAdditionalOrderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepOneAdditionalOrderViewModel$3$1$1(CheckoutStepOneAdditionalOrderViewModel checkoutStepOneAdditionalOrderViewModel, C11045c<? super CheckoutStepOneAdditionalOrderViewModel$3$1$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStepOneAdditionalOrderViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CheckoutStepOneAdditionalOrderViewModel$3$1$1 checkoutStepOneAdditionalOrderViewModel$3$1$1 = new CheckoutStepOneAdditionalOrderViewModel$3$1$1(this.this$0, cVar);
        checkoutStepOneAdditionalOrderViewModel$3$1$1.L$0 = obj;
        return checkoutStepOneAdditionalOrderViewModel$3$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k List<? extends OfferModel> list, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStepOneAdditionalOrderViewModel$3$1$1) create(list, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.publishState(new C26916f.C26922b.C26931i((List) this.L$0));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
