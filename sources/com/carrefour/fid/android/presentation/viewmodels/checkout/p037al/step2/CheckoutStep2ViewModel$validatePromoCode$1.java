package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2;

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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel$validatePromoCode$1", mo22502f = "CheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {243}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step2/CheckoutStep2ViewModel$validatePromoCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,286:1\n230#2,5:287\n230#2,5:292\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step2/CheckoutStep2ViewModel$validatePromoCode$1\n*L\n241#1:287,5\n249#1:292,5\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel$validatePromoCode$1 */
public final class CheckoutStep2ViewModel$validatePromoCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $promoCode;
    int label;
    final /* synthetic */ CheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ViewModel$validatePromoCode$1(CheckoutStep2ViewModel checkoutStep2ViewModel, String str, C11045c<? super CheckoutStep2ViewModel$validatePromoCode$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep2ViewModel;
        this.$promoCode = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep2ViewModel$validatePromoCode$1(this.this$0, this.$promoCode, cVar);
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
            C11940j j0 = this.this$0.f63754u;
            do {
                value2 = j0.getValue();
                C28892e eVar = (C28892e) value2;
            } while (!j0.mo24216e(value2, C28892e.C28894b.f70781b));
            this.this$0.mo75761t0().mo75784i();
            C37560c e0 = this.this$0.f63744k;
            C37971c a = C37971c.m156162a(C37971c.m156163b(this.$promoCode));
            this.label = 1;
            obj2 = e0.m172966invokegIAlus(a, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CheckoutStep2ViewModel checkoutStep2ViewModel = this.this$0;
        String str = this.$promoCode;
        Throwable e = Result.m38705e(obj2);
        if (e == null) {
            CheckoutStep2ViewModel checkoutStep2ViewModel2 = this.this$0;
            String str2 = this.$promoCode;
        } else {
            if (e instanceof AddPromoCodeThrowable) {
                checkoutStep2ViewModel.mo75761t0().mo75785j(str, ((AddPromoCodeThrowable) e).mo114262a());
            }
            C11940j j02 = checkoutStep2ViewModel.f63754u;
            do {
                value = j02.getValue();
                C28892e eVar2 = (C28892e) value;
            } while (!j02.mo24216e(value, new C28892e.C28893a(e)));
        }
        CheckoutStep2ViewModel checkoutStep2ViewModel22 = this.this$0;
        String str22 = this.$promoCode;
        if (Result.m38710j(obj2)) {
            Basket basket = (Basket) obj2;
            checkoutStep2ViewModel22.mo75761t0().mo75786k();
            checkoutStep2ViewModel22.mo75761t0().mo75783h(str22);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep2ViewModel$validatePromoCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
