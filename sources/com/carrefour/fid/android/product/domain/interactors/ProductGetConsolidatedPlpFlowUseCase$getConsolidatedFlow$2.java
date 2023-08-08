package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11307s;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2", mo22502f = "ProductGetConsolidatedPlpFlowUseCase.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/paging/a;", "Lcom/carrefour/fid/android/domain/models/v;", "pagingData", "Lcom/carrefour/fid/android/domain/models/favorites/shoppinglist/a;", "shoppingList", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "syncingInBasket", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2 extends SuspendLambda implements C11307s<C36328a<C38184v>, C38030a, Basket, Set<? extends Gtin>, C11045c<? super C36328a<C38184v>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ ProductGetConsolidatedPlpFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2(ProductGetConsolidatedPlpFlowUseCase productGetConsolidatedPlpFlowUseCase, C11045c<? super ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2> cVar) {
        super(5, cVar);
        this.this$0 = productGetConsolidatedPlpFlowUseCase;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7709v5(@C12579k C36328a<C38184v> aVar, @C12580l C38030a aVar2, @C12580l Basket basket, @C12579k Set<Gtin> set, @C12580l C11045c<? super C36328a<C38184v>> cVar) {
        ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2 productGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2 = new ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2(this.this$0, cVar);
        productGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2.L$0 = aVar;
        productGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2.L$1 = aVar2;
        productGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2.L$2 = basket;
        productGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2.L$3 = set;
        return productGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return this.this$0.mo79960h((C36328a) this.L$0, (C38030a) this.L$1, (Basket) this.L$2, (Set) this.L$3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
