package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
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

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$2", mo22502f = "ProductGetFavoriteFlowUseCase.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, mo22516d2 = {"", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "source", "Lcom/carrefour/fid/android/domain/models/favorites/shoppinglist/a;", "shoppingList", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "syncingInBasket", "Lcom/carrefour/fid/android/domain/models/v;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetFavoriteFlowUseCase$invoke$2 extends SuspendLambda implements C11307s<List<? extends C38115c>, C38030a, Basket, Set<? extends Gtin>, C11045c<? super List<? extends C38184v>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ ProductGetFavoriteFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetFavoriteFlowUseCase$invoke$2(ProductGetFavoriteFlowUseCase productGetFavoriteFlowUseCase, C11045c<? super ProductGetFavoriteFlowUseCase$invoke$2> cVar) {
        super(5, cVar);
        this.this$0 = productGetFavoriteFlowUseCase;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7709v5(@C12579k List<C38115c> list, @C12580l C38030a aVar, @C12580l Basket basket, @C12579k Set<Gtin> set, @C12580l C11045c<? super List<? extends C38184v>> cVar) {
        ProductGetFavoriteFlowUseCase$invoke$2 productGetFavoriteFlowUseCase$invoke$2 = new ProductGetFavoriteFlowUseCase$invoke$2(this.this$0, cVar);
        productGetFavoriteFlowUseCase$invoke$2.L$0 = list;
        productGetFavoriteFlowUseCase$invoke$2.L$1 = aVar;
        productGetFavoriteFlowUseCase$invoke$2.L$2 = basket;
        productGetFavoriteFlowUseCase$invoke$2.L$3 = set;
        return productGetFavoriteFlowUseCase$invoke$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return this.this$0.mo115280f((List) this.L$0, (C38030a) this.L$1, (Basket) this.L$2, (Set) this.L$3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
