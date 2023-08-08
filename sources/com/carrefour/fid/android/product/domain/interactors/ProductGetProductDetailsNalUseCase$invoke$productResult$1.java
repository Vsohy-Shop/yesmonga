package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.product.detail.C38107b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$productResult$1", mo22502f = "ProductGetProductDetailsNalUseCase.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/types/a;", "Lcom/carrefour/fid/android/domain/models/product/detail/b;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetProductDetailsNalUseCase$invoke$productResult$1 extends SuspendLambda implements C11304p<C36371a<? extends C38107b>, C11045c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public ProductGetProductDetailsNalUseCase$invoke$productResult$1(C11045c<? super ProductGetProductDetailsNalUseCase$invoke$productResult$1> cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ProductGetProductDetailsNalUseCase$invoke$productResult$1 productGetProductDetailsNalUseCase$invoke$productResult$1 = new ProductGetProductDetailsNalUseCase$invoke$productResult$1(cVar);
        productGetProductDetailsNalUseCase$invoke$productResult$1.L$0 = obj;
        return productGetProductDetailsNalUseCase$invoke$productResult$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C36371a<? extends C38107b> aVar, @C12580l C11045c<? super Boolean> cVar) {
        return ((ProductGetProductDetailsNalUseCase$invoke$productResult$1) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return C11064a.m42615a(!((C36371a) this.L$0).mo108617d());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
