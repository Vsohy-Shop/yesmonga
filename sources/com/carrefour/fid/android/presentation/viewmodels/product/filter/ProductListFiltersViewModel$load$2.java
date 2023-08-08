package com.carrefour.fid.android.presentation.viewmodels.product.filter;

import com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$2", mo22502f = "ProductListFiltersViewModel.kt", mo22503i = {}, mo22504l = {70}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductListFiltersViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel$load$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class ProductListFiltersViewModel$load$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ GetProductListUseCase.C37766a $params;
    int label;
    final /* synthetic */ ProductListFiltersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductListFiltersViewModel$load$2(ProductListFiltersViewModel productListFiltersViewModel, GetProductListUseCase.C37766a aVar, C11045c<? super ProductListFiltersViewModel$load$2> cVar) {
        super(2, cVar);
        this.this$0 = productListFiltersViewModel;
        this.$params = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ProductListFiltersViewModel$load$2(this.this$0, this.$params, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            GetProductListUseCase g0 = this.this$0.f66073e;
            GetProductListUseCase.C37766a aVar = this.$params;
            this.label = 1;
            obj2 = g0.m172989invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.mo78995k0(obj2);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductListFiltersViewModel$load$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
