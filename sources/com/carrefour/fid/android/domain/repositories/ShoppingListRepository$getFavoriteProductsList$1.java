package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.repositories.ShoppingListRepository", mo22502f = "ShoppingListRepository.kt", mo22503i = {0, 1}, mo22504l = {162, 163}, mo22505m = "getFavoriteProductsList$app_release", mo22506n = {"this", "this"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ShoppingListRepository$getFavoriteProductsList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShoppingListRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListRepository$getFavoriteProductsList$1(ShoppingListRepository shoppingListRepository, C11045c<? super ShoppingListRepository$getFavoriteProductsList$1> cVar) {
        super(cVar);
        this.this$0 = shoppingListRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo119614f((List<String>) null, (List<Gtin>) null, this);
    }
}
