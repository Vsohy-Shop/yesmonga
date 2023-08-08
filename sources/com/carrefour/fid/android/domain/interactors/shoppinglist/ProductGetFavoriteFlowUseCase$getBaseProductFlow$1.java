package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase", mo22502f = "ProductGetFavoriteFlowUseCase.kt", mo22503i = {0, 0, 0}, mo22504l = {58, 65}, mo22505m = "getBaseProductFlow", mo22506n = {"this", "gtins", "listService"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetFavoriteFlowUseCase$getBaseProductFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetFavoriteFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetFavoriteFlowUseCase$getBaseProductFlow$1(ProductGetFavoriteFlowUseCase productGetFavoriteFlowUseCase, C11045c<? super ProductGetFavoriteFlowUseCase$getBaseProductFlow$1> cVar) {
        super(cVar);
        this.this$0 = productGetFavoriteFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo115278d((List<Gtin>) null, this);
    }
}
