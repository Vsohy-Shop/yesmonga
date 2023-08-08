package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$selectSortField$job$1", mo22502f = "FacetViewModel.kt", mo22503i = {}, mo22504l = {108, 118}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFacetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$selectSortField$job$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n*S KotlinDebug\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$selectSortField$job$1\n*L\n115#1:156,5\n116#1:161,5\n*E\n"})
public final class FacetViewModel$selectSortField$job$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Sort $sortField;
    Object L$0;
    int label;
    final /* synthetic */ FacetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetViewModel$selectSortField$job$1(FacetViewModel facetViewModel, Sort sort, C11045c<? super FacetViewModel$selectSortField$job$1> cVar) {
        super(2, cVar);
        this.this$0 = facetViewModel;
        this.$sortField = sort;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FacetViewModel$selectSortField$job$1(this.this$0, this.$sortField, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ProductUpdateSortUseCase g0 = this.this$0.f68194a;
            ProductUpdateSortUseCase.C27548a aVar = new ProductUpdateSortUseCase.C27548a(this.this$0.f68199f, this.$sortField, this.this$0.getState().getValue().mo81899e());
            this.label = 1;
            obj2 = g0.m172820invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FacetViewModel facetViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            Pair pair = (Pair) obj2;
            C11940j i0 = facetViewModel.f68200g;
            do {
                value = i0.getValue();
                C28892e eVar = (C28892e) value;
            } while (!i0.mo24216e(value, new C28892e.C28895c(pair.mo21849e())));
            C11940j h0 = facetViewModel.f68201h;
            do {
                value2 = h0.getValue();
                C38104c cVar = (C38104c) value2;
            } while (!h0.mo24216e(value2, (C38104c) pair.mo21851f()));
        }
        FacetViewModel facetViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11744g k0 = facetViewModel2.f68204k;
            C28007b.C28008a aVar2 = new C28007b.C28008a(e);
            this.L$0 = obj2;
            this.label = 2;
            if (k0.mo23757h0(aVar2, this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacetViewModel$selectSortField$job$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
