package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel", mo22502f = "ShoppingListViewModel.kt", mo22503i = {0}, mo22504l = {128}, mo22505m = "handleBasketThrowableListMessage", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ShoppingListViewModel$handleBasketThrowableListMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShoppingListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListViewModel$handleBasketThrowableListMessage$1(ShoppingListViewModel shoppingListViewModel, C11045c<? super ShoppingListViewModel$handleBasketThrowableListMessage$1> cVar) {
        super(cVar);
        this.this$0 = shoppingListViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75136q0((Basket) null, (OfferIdentifier) null, this);
    }
}
