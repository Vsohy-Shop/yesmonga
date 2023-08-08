package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.models.loyalty.C38045b;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1", mo22502f = "CheckoutStepTwoAdditionalOderViewModel.kt", mo22503i = {}, mo22504l = {150}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ CheckoutStepTwoAdditionalOderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1(CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, C11045c<? super CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStepTwoAdditionalOderViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37697b h0 = this.this$0.f65344e;
            C37697b.C37698a aVar = new C37697b.C37698a(false, 1, (DefaultConstructorMarker) null);
            this.label = 1;
            obj2 = h0.m172966invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            checkoutStepTwoAdditionalOderViewModel.emitEvent(new C26944g.C26945a.C26952g(((C38045b) obj2).mo117869h()));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
