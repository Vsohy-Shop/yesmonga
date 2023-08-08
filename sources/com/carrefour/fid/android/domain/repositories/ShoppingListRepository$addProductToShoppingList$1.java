package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.repositories.ShoppingListRepository", mo22502f = "ShoppingListRepository.kt", mo22503i = {0, 0, 1, 1, 1, 2, 2}, mo22504l = {61, 70, 71, 72}, mo22505m = "addProductToShoppingList-gIAlu-s", mo22506n = {"this", "shoppingListParam", "this", "shoppingListParam", "currentShoppingList", "this", "currentShoppingList"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ShoppingListRepository$addProductToShoppingList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShoppingListRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListRepository$addProductToShoppingList$1(ShoppingListRepository shoppingListRepository, C11045c<? super ShoppingListRepository$addProductToShoppingList$1> cVar) {
        super(cVar);
        this.this$0 = shoppingListRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.mo119611c((C38032c) null, this);
        return c == C11063b.m42612h() ? c : Result.m38701a(c);
    }
}
