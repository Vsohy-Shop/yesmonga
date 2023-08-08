package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$state$1", mo22502f = "FacetViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/product/Facet;", "facet", "Lcom/carrefour/fid/android/domain/models/product/c;", "currentSelection", "Lcom/carrefour/fid/android/product/presentation/viewmodel/facet/a;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FacetViewModel$state$1 extends SuspendLambda implements C11305q<C28892e<? extends Facet>, C38104c, C11045c<? super C28160a>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public FacetViewModel$state$1(C11045c<? super FacetViewModel$state$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C28892e<Facet> eVar, @C12579k C38104c cVar, @C12580l C11045c<? super C28160a> cVar2) {
        FacetViewModel$state$1 facetViewModel$state$1 = new FacetViewModel$state$1(cVar2);
        facetViewModel$state$1.L$0 = eVar;
        facetViewModel$state$1.L$1 = cVar;
        return facetViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return new C28160a((C28892e) this.L$0, (C38104c) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
