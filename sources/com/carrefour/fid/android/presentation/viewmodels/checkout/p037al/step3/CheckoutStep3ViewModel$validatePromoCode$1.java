package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable;
import com.carrefour.fid.android.domain.interactors.basket.C37560c;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.C37971c;
import com.carrefour.fid.android.shared.type.C28892e;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$validatePromoCode$1", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {}, mo22504l = {327}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep3ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel$validatePromoCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,472:1\n230#2,5:473\n230#2,5:478\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel$validatePromoCode$1\n*L\n325#1:473,5\n333#1:478,5\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$validatePromoCode$1 */
public final class CheckoutStep3ViewModel$validatePromoCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $promoCode;
    int label;
    final /* synthetic */ CheckoutStep3ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ViewModel$validatePromoCode$1(CheckoutStep3ViewModel checkoutStep3ViewModel, String str, C11045c<? super CheckoutStep3ViewModel$validatePromoCode$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep3ViewModel;
        this.$promoCode = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep3ViewModel$validatePromoCode$1(this.this$0, this.$promoCode, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11940j m0 = this.this$0.f63799B;
            do {
                value2 = m0.getValue();
                C28892e eVar = (C28892e) value2;
            } while (!m0.mo24216e(value2, C28892e.C28894b.f70781b));
            this.this$0.mo75846w0().mo75866e();
            C37560c d0 = this.this$0.f63824l;
            C37971c a = C37971c.m156162a(C37971c.m156163b(this.$promoCode));
            this.label = 1;
            obj2 = d0.m172966invokegIAlus(a, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutStep3ViewModel checkoutStep3ViewModel = this.this$0;
        String str = this.$promoCode;
        Throwable e = Result.m38705e(obj2);
        if (e == null) {
            CheckoutStep3ViewModel checkoutStep3ViewModel2 = this.this$0;
            String str2 = this.$promoCode;
        } else {
            if (e instanceof AddPromoCodeThrowable) {
                checkoutStep3ViewModel.mo75846w0().mo75871j(str, ((AddPromoCodeThrowable) e).mo114262a());
            }
            C11940j m02 = checkoutStep3ViewModel.f63799B;
            do {
                value = m02.getValue();
                C28892e eVar2 = (C28892e) value;
            } while (!m02.mo24216e(value, new C28892e.C28893a(e)));
        }
        CheckoutStep3ViewModel checkoutStep3ViewModel22 = this.this$0;
        String str22 = this.$promoCode;
        if (Result.m38710j(obj2)) {
            Basket basket = (Basket) obj2;
            checkoutStep3ViewModel22.mo75846w0().mo75872k();
            checkoutStep3ViewModel22.mo75846w0().mo75865d(str22);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep3ViewModel$validatePromoCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
