package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.AccountListShoppingViewModel", mo22502f = "AccountListShoppingViewModel.kt", mo22503i = {0, 0}, mo22504l = {167, 175}, mo22505m = "removeProductFromShoppingList", mo22506n = {"this", "offerProductModel"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AccountListShoppingViewModel$removeProductFromShoppingList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountListShoppingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListShoppingViewModel$removeProductFromShoppingList$1(AccountListShoppingViewModel accountListShoppingViewModel, C11045c<? super AccountListShoppingViewModel$removeProductFromShoppingList$1> cVar) {
        super(cVar);
        this.this$0 = accountListShoppingViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75092m0((OfferProductModel) null, this);
    }
}
