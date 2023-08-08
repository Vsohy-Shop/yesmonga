package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a;
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
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$removePromoCode$1", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {}, mo22504l = {347, 348}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$removePromoCode$1 */
public final class CheckoutStep3ViewModel$removePromoCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CheckoutStep3ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ViewModel$removePromoCode$1(CheckoutStep3ViewModel checkoutStep3ViewModel, C11045c<? super CheckoutStep3ViewModel$removePromoCode$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep3ViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep3ViewModel$removePromoCode$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        String G;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Basket basket = (Basket) C28897f.m119478b(this.this$0.mo75847x0().getValue());
            if (basket == null || (G = basket.mo116822G()) == null) {
                return C11079d2.f28267a;
            }
            C37561c0 h0 = this.this$0.f63825m;
            this.label = 1;
            obj2 = h0.m172966invokegIAlus(G, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutStep3ViewModel checkoutStep3ViewModel = this.this$0;
        if (Result.m38705e(obj2) != null) {
            C11744g k0 = checkoutStep3ViewModel.f63803F;
            C26122a.C26128f fVar = C26122a.C26128f.f63874a;
            this.L$0 = obj2;
            this.label = 2;
            if (k0.mo23757h0(fVar, this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep3ViewModel$removePromoCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
