package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
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

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$2", mo22502f = "AbstractFlowConsolidator.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, mo22516d2 = {"T", "offerResult", "Lcom/carrefour/fid/android/domain/models/favorites/shoppinglist/a;", "shoppingList", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "syncingInBasket", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AbstractFlowConsolidator$getConsolidatedFlow$2 extends SuspendLambda implements C11307s<T, C38030a, Basket, Set<? extends Gtin>, C11045c<? super T>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ AbstractFlowConsolidator<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractFlowConsolidator$getConsolidatedFlow$2(AbstractFlowConsolidator<T> abstractFlowConsolidator, C11045c<? super AbstractFlowConsolidator$getConsolidatedFlow$2> cVar) {
        super(5, cVar);
        this.this$0 = abstractFlowConsolidator;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7709v5(T t, @C12580l C38030a aVar, @C12580l Basket basket, @C12579k Set<Gtin> set, @C12580l C11045c<? super T> cVar) {
        AbstractFlowConsolidator$getConsolidatedFlow$2 abstractFlowConsolidator$getConsolidatedFlow$2 = new AbstractFlowConsolidator$getConsolidatedFlow$2(this.this$0, cVar);
        abstractFlowConsolidator$getConsolidatedFlow$2.L$0 = t;
        abstractFlowConsolidator$getConsolidatedFlow$2.L$1 = aVar;
        abstractFlowConsolidator$getConsolidatedFlow$2.L$2 = basket;
        abstractFlowConsolidator$getConsolidatedFlow$2.L$3 = set;
        return abstractFlowConsolidator$getConsolidatedFlow$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return this.this$0.mo79920i(this.L$0, (C38030a) this.L$1, (Basket) this.L$2, (Set) this.L$3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
