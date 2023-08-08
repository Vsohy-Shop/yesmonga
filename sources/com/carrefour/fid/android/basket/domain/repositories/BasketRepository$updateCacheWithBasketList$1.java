package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.domain.models.basket.Basket;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository", mo22502f = "BasketRepository.kt", mo22503i = {0, 1, 3, 3, 3, 4, 6, 6, 6, 7, 7, 7, 8}, mo22504l = {365, 366, 367, 371, 375, 376, 380, 381, 382}, mo22505m = "updateCacheWithBasketList", mo22506n = {"this", "this", "this", "baskets", "type", "$this$updateCacheWithBasketList_u24lambda_u2440", "this", "baskets", "basket", "this", "baskets", "basket", "basket"}, mo22507s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketRepository$updateCacheWithBasketList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$updateCacheWithBasketList$1(BasketRepository basketRepository, C11045c<? super BasketRepository$updateCacheWithBasketList$1> cVar) {
        super(cVar);
        this.this$0 = basketRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo33377G((List<Basket>) null, this);
    }
}
