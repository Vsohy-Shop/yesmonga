package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11307s;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2", mo22502f = "ProductGetConsolidatedProductFlowUseCase.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "product", "Lcom/carrefour/fid/android/domain/models/favorites/shoppinglist/a;", "shoppingList", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "syncingInBasket", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2 extends SuspendLambda implements C11307s<Result<? extends C38115c>, C38030a, Basket, Set<? extends Gtin>, C11045c<? super Result<? extends C38114b>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ ProductGetConsolidatedProductFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2(ProductGetConsolidatedProductFlowUseCase productGetConsolidatedProductFlowUseCase, C11045c<? super ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2> cVar) {
        super(5, cVar);
        this.this$0 = productGetConsolidatedProductFlowUseCase;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo79975g(@C12579k Object obj, @C12580l C38030a aVar, @C12580l Basket basket, @C12579k Set<Gtin> set, @C12580l C11045c<? super Result<C38114b>> cVar) {
        ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2 productGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2 = new ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2(this.this$0, cVar);
        productGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2.L$0 = Result.m38701a(obj);
        productGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2.L$1 = aVar;
        productGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2.L$2 = basket;
        productGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2.L$3 = set;
        return productGetConsolidatedProductFlowUseCase$getConsolidatedFlow$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return Result.m38701a(this.this$0.mo79974e(((Result) this.L$0).mo21858l(), (C38030a) this.L$1, (Basket) this.L$2, (Set) this.L$3));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: v5 */
    public /* bridge */ /* synthetic */ Object mo7709v5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return mo79975g(((Result) obj).mo21858l(), (C38030a) obj2, (Basket) obj3, (Set) obj4, (C11045c) obj5);
    }
}
