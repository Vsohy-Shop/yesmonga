package com.carrefour.fid.android.basket.data.api.datasources;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource", mo22502f = "BasketApiDataSource.kt", mo22503i = {0, 0, 0}, mo22504l = {54}, mo22505m = "addPromotionCode-GmnbIkU", mo22506n = {"this", "promotionCode", "basketReference"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketApiDataSource$addPromotionCode$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketApiDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketApiDataSource$addPromotionCode$1(BasketApiDataSource basketApiDataSource, C11045c<? super BasketApiDataSource$addPromotionCode$1> cVar) {
        super(cVar);
        this.this$0 = basketApiDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo32783b((String) null, (String) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
