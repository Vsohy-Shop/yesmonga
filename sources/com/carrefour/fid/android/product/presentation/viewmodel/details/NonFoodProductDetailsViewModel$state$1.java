package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.models.basket.C37968a;
import com.carrefour.fid.android.domain.models.product.detail.C38106a;
import com.carrefour.fid.android.product.presentation.models.C27656e;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$state$1", mo22502f = "NonFoodProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/product/detail/a;", "productAndOffer", "Lcom/carrefour/fid/android/domain/models/basket/a;", "basketQuantity", "Lcom/carrefour/fid/android/product/presentation/models/e;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodProductDetailsViewModel$state$1 extends SuspendLambda implements C11305q<C28892e<? extends C38106a>, C37968a, C11045c<? super C27656e>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public NonFoodProductDetailsViewModel$state$1(C11045c<? super NonFoodProductDetailsViewModel$state$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C28892e<C38106a> eVar, @C12579k C37968a aVar, @C12580l C11045c<? super C27656e> cVar) {
        NonFoodProductDetailsViewModel$state$1 nonFoodProductDetailsViewModel$state$1 = new NonFoodProductDetailsViewModel$state$1(cVar);
        nonFoodProductDetailsViewModel$state$1.L$0 = eVar;
        nonFoodProductDetailsViewModel$state$1.L$1 = aVar;
        return nonFoodProductDetailsViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C37968a aVar = (C37968a) this.L$1;
            return new C27656e((C28892e) this.L$0, aVar.mo117026f(), aVar.mo117024e(), false, 8, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
