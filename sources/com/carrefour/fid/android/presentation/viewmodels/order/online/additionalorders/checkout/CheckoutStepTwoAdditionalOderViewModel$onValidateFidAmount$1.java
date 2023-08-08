package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1", mo22502f = "CheckoutStepTwoAdditionalOderViewModel.kt", mo22503i = {}, mo22504l = {100}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $amount;
    int label;
    final /* synthetic */ CheckoutStepTwoAdditionalOderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1(String str, CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, C11045c<? super CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1> cVar) {
        super(2, cVar);
        this.$amount = str;
        this.this$0 = checkoutStepTwoAdditionalOderViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1(this.$amount, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (StringKt.m118946z(this.$amount, 0.0d, 1, (Object) null) < 10.0d) {
                CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel = this.this$0;
                String str = this.$amount;
                this.label = 1;
                if (checkoutStepTwoAdditionalOderViewModel.mo77868O0(str, this) == h) {
                    return h;
                }
            } else {
                this.this$0.f65352m = this.$amount;
                this.this$0.emitEvent(C26944g.C26945a.C26946a.f65624a);
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
