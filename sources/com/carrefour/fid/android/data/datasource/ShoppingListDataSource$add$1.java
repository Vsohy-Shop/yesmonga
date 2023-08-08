package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.ShoppingListDataSource", mo22502f = "ShoppingListDataSource.kt", mo22503i = {}, mo22504l = {25}, mo22505m = "add-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ShoppingListDataSource$add$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShoppingListDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListDataSource$add$1(ShoppingListDataSource shoppingListDataSource, C11045c<? super ShoppingListDataSource$add$1> cVar) {
        super(cVar);
        this.this$0 = shoppingListDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.mo108683e((String) null, (ShoppingListItemToAddRequest) null, this);
        return e == C11063b.m42612h() ? e : Result.m38701a(e);
    }
}
