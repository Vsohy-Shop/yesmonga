package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.shared.paging.Pager;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.PlpProductRepository$getProductList$1$1", mo22502f = "PlpProductRepository.kt", mo22503i = {}, mo22504l = {38}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PlpProductRepository$getProductList$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11911i<C36334b> $it;
    final /* synthetic */ Pager<Integer, C38115c> $pager;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpProductRepository$getProductList$1$1(Pager<Integer, C38115c> pager, C11911i<C36334b> iVar, C11045c<? super PlpProductRepository$getProductList$1$1> cVar) {
        super(2, cVar);
        this.$pager = pager;
        this.$it = iVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PlpProductRepository$getProductList$1$1(this.$pager, this.$it, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Pager<Integer, C38115c> pager = this.$pager;
            C11911i<C36334b> iVar = this.$it;
            this.label = 1;
            if (pager.mo83915t(iVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PlpProductRepository$getProductList$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
