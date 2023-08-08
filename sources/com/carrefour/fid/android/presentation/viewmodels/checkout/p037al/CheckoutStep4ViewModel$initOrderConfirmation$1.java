package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase;
import com.carrefour.fid.android.domain.models.OrderConfirmationDomain;
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
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep4ViewModel$initOrderConfirmation$1", mo22502f = "CheckoutStep4ViewModel.kt", mo22503i = {}, mo22504l = {44}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep4ViewModel$initOrderConfirmation$1 */
public final class CheckoutStep4ViewModel$initOrderConfirmation$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<String> $list;
    final /* synthetic */ String $userLoyaltyAmount;
    int label;
    final /* synthetic */ CheckoutStep4ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep4ViewModel$initOrderConfirmation$1(CheckoutStep4ViewModel checkoutStep4ViewModel, List<String> list, String str, C11045c<? super CheckoutStep4ViewModel$initOrderConfirmation$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep4ViewModel;
        this.$list = list;
        this.$userLoyaltyAmount = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep4ViewModel$initOrderConfirmation$1(this.this$0, this.$list, this.$userLoyaltyAmount, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ConfirmPaymentUseCase g0 = this.this$0.f63562d;
            ConfirmPaymentUseCase.C37621a aVar = new ConfirmPaymentUseCase.C37621a(this.$list.get(0), this.$list.get(1), this.$userLoyaltyAmount);
            this.label = 1;
            obj2 = g0.m172945invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutStep4ViewModel checkoutStep4ViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            checkoutStep4ViewModel.f63565g.mo57493o(checkoutStep4ViewModel.f63563e.mo72340a((OrderConfirmationDomain) obj2));
        }
        CheckoutStep4ViewModel checkoutStep4ViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            checkoutStep4ViewModel2.mo83420e0().mo57493o(e);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep4ViewModel$initOrderConfirmation$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
