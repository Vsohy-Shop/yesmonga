package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {0, 0, 0}, mo22504l = {305, 310}, mo22505m = "editShoppingList", mo22506n = {"this", "isInShoppingList", "isCriteoProduct"}, mo22507s = {"L$0", "Z$0", "Z$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductDetailsViewModel$editShoppingList$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$editShoppingList$1(ProductDetailsViewModel productDetailsViewModel, C11045c<? super ProductDetailsViewModel$editShoppingList$1> cVar) {
        super(cVar);
        this.this$0 = productDetailsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo81721v0(false, (C38032c) null, false, this);
    }
}
