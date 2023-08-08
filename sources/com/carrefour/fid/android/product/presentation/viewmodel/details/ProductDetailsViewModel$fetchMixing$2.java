package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b;
import com.carrefour.fid.android.shared.paging.C28850b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$fetchMixing$2", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {153, 160}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductDetailsViewModel$fetchMixing$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<Gtin> $gtins;
    final /* synthetic */ boolean $isSyncingInBasket;
    final /* synthetic */ C28850b $pageEmitter;
    final /* synthetic */ String $storeService;
    int label;
    final /* synthetic */ ProductDetailsViewModel this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$fetchMixing$2$1", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/paging/a;", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "pagingData", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$fetchMixing$2$1 */
    public static final class C281121 extends SuspendLambda implements C11304p<C36328a<C38115c>, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C281121 r0 = new C281121(productDetailsViewModel, z, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C36328a<C38115c> aVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C281121) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                productDetailsViewModel.publishState(new C28135b.C28140b.C28144d(((C36328a) this.L$0).mo108395h(), z));
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$fetchMixing$2(ProductDetailsViewModel productDetailsViewModel, String str, List<Gtin> list, C28850b bVar, boolean z, C11045c<? super ProductDetailsViewModel$fetchMixing$2> cVar) {
        super(2, cVar);
        this.this$0 = productDetailsViewModel;
        this.$storeService = str;
        this.$gtins = list;
        this.$pageEmitter = bVar;
        this.$isSyncingInBasket = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ProductDetailsViewModel$fetchMixing$2(this.this$0, this.$storeService, this.$gtins, this.$pageEmitter, this.$isSyncingInBasket, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37778p h0 = this.this$0.f68094c;
            ProductListParam.Gtins gtins = new ProductListParam.Gtins(this.$storeService, this.$gtins, false, 4, (DefaultConstructorMarker) null);
            C11911i<C36334b> a = this.$pageEmitter.mo83961a();
            this.label = 1;
            obj = h0.invoke(gtins, null, a, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final ProductDetailsViewModel productDetailsViewModel = this.this$0;
        final boolean z = this.$isSyncingInBasket;
        C281121 r1 = new C281121((C11045c<? super C281121>) null);
        this.label = 2;
        if (C11909g.m47348A((C11907e) obj, r1, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductDetailsViewModel$fetchMixing$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
