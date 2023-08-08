package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase;
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
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$resetFilters$1", mo22502f = "FacetViewModel.kt", mo22503i = {}, mo22504l = {96}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFacetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$resetFilters$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n230#2,5:166\n*S KotlinDebug\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$resetFilters$1\n*L\n98#1:156,5\n99#1:161,5\n101#1:166,5\n*E\n"})
public final class FacetViewModel$resetFilters$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ FacetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetViewModel$resetFilters$1(FacetViewModel facetViewModel, C11045c<? super FacetViewModel$resetFilters$1> cVar) {
        super(2, cVar);
        this.this$0 = facetViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FacetViewModel$resetFilters$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.this$0.f68196c.invoke();
            ProductUpdateFacetUseCase e0 = this.this$0.f68198e;
            ProductUpdateFacetUseCase.C27546a aVar = new ProductUpdateFacetUseCase.C27546a(this.this$0.f68199f, (C38104c) null);
            this.label = 1;
            obj2 = e0.m172818invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FacetViewModel facetViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            Pair pair = (Pair) obj2;
            C11940j i0 = facetViewModel.f68200g;
            do {
                value2 = i0.getValue();
                C28892e eVar = (C28892e) value2;
            } while (!i0.mo24216e(value2, new C28892e.C28895c(pair.mo21849e())));
            C11940j h0 = facetViewModel.f68201h;
            do {
                value3 = h0.getValue();
                C38104c cVar = (C38104c) value3;
            } while (!h0.mo24216e(value3, (C38104c) pair.mo21851f()));
        }
        FacetViewModel facetViewModel2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            C11940j i02 = facetViewModel2.f68200g;
            do {
                value = i02.getValue();
                C28892e eVar2 = (C28892e) value;
            } while (!i02.mo24216e(value, new C28892e.C28893a(e)));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacetViewModel$resetFilters$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
