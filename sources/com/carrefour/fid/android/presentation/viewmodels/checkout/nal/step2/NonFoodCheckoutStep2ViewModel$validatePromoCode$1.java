package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.interactors.basket.C37557b;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$validatePromoCode$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {623}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$validatePromoCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,704:1\n230#2,5:705\n230#2,5:710\n230#2,5:715\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$validatePromoCode$1\n*L\n622#1:705,5\n625#1:710,5\n628#1:715,5\n*E\n"})
public final class NonFoodCheckoutStep2ViewModel$validatePromoCode$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $promoCode;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ViewModel$validatePromoCode$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, String str, C11045c<? super NonFoodCheckoutStep2ViewModel$validatePromoCode$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckoutStep2ViewModel;
        this.$promoCode = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckoutStep2ViewModel$validatePromoCode$1(this.this$0, this.$promoCode, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        C26191b value;
        C26191b value2;
        C26191b value3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11940j<C26191b> M0 = this.this$0.mo75982M0();
            do {
                value3 = M0.getValue();
            } while (!M0.mo24216e(value3, C26191b.m111921j(value3, (C28892e) null, (C38080a) null, (C28892e) null, C28892e.C28894b.f70781b, (C28892e) null, (C28892e) null, false, false, 247, (Object) null)));
            C37557b d0 = this.this$0.f63962l;
            C37557b.C37558a aVar = new C37557b.C37558a(this.this$0.mo75984O0(), this.$promoCode);
            this.label = 1;
            obj2 = d0.m172966invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11940j<C26191b> M02 = nonFoodCheckoutStep2ViewModel.mo75982M0();
            do {
                value2 = M02.getValue();
            } while (!M02.mo24216e(value2, C26191b.m111921j(value2, (C28892e) null, (C38080a) null, (C28892e) null, new C28892e.C28893a(e), (C28892e) null, (C28892e) null, false, false, 247, (Object) null)));
        }
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel2 = this.this$0;
        if (Result.m38710j(obj2)) {
            nonFoodCheckoutStep2ViewModel2.mo76008l1(((Basket) obj2).mo116820E());
            C11940j<C26191b> M03 = nonFoodCheckoutStep2ViewModel2.mo75982M0();
            do {
                value = M03.getValue();
            } while (!M03.mo24216e(value, C26191b.m111921j(value, (C28892e) null, (C38080a) null, (C28892e) null, new C28892e.C28895c(C11079d2.f28267a), (C28892e) null, (C28892e) null, false, false, 247, (Object) null)));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ViewModel$validatePromoCode$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
