package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import com.carrefour.fid.android.domain.extension.C37498a;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getBasket$1", mo22502f = "CheckoutConfirmationViewModel.kt", mo22503i = {}, mo22504l = {120}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CheckoutConfirmationViewModel$getBasket$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ CheckoutConfirmationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationViewModel$getBasket$1(CheckoutConfirmationViewModel checkoutConfirmationViewModel, C11045c<? super CheckoutConfirmationViewModel$getBasket$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutConfirmationViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutConfirmationViewModel$getBasket$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37569f0 n0 = this.this$0.f64066d;
            this.label = 1;
            obj2 = n0.m172965invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutConfirmationViewModel checkoutConfirmationViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            checkoutConfirmationViewModel.mo83421f0().mo57493o(C11064a.m42615a(false));
            checkoutConfirmationViewModel.f64081s.mo57493o(C37498a.m153932b((Basket) obj2));
        }
        CheckoutConfirmationViewModel checkoutConfirmationViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            checkoutConfirmationViewModel2.mo83421f0().mo57493o(C11064a.m42615a(false));
            checkoutConfirmationViewModel2.mo83420e0().mo57493o(e);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutConfirmationViewModel$getBasket$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
