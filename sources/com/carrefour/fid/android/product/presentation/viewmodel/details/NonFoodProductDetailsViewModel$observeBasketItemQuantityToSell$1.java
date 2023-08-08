package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.interactors.basket.C37605y;
import com.carrefour.fid.android.domain.models.basket.C37968a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1", mo22502f = "NonFoodProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {135, 135}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ NonFoodProductDetailsViewModel this$0;

    @C11363r0({"SMAP\nNonFoodProductDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,142:1\n230#2,5:143\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1$1\n*L\n136#1:143,5\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1$a */
    public static final class C28110a implements C11908f<C37968a> {

        /* renamed from: a */
        public final /* synthetic */ NonFoodProductDetailsViewModel f68090a;

        public C28110a(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel) {
            this.f68090a = nonFoodProductDetailsViewModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C37968a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object value;
            C11940j h0 = this.f68090a.f68086g;
            do {
                value = h0.getValue();
                C37968a aVar2 = (C37968a) value;
            } while (!h0.mo24216e(value, aVar));
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, C11045c<? super NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodProductDetailsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Gtin gtin;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37605y c0 = this.this$0.f68082c;
            String e0 = this.this$0.f68084e;
            if (e0 != null) {
                gtin = Gtin.m157307a(e0);
            } else {
                gtin = null;
            }
            this.label = 1;
            obj = c0.invoke(gtin, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C28110a aVar = new C28110a(this.this$0);
        this.label = 2;
        if (((C11907e) obj).collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
