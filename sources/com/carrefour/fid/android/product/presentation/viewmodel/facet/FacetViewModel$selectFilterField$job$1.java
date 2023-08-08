package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import com.carrefour.fid.android.domain.models.product.C38105d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$selectFilterField$job$1", mo22502f = "FacetViewModel.kt", mo22503i = {}, mo22504l = {129, 130, 139, 141}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFacetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$selectFilterField$job$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n*S KotlinDebug\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$selectFilterField$job$1\n*L\n137#1:156,5\n138#1:161,5\n*E\n"})
public final class FacetViewModel$selectFilterField$job$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C38105d $filterSelection;
    Object L$0;
    int label;
    final /* synthetic */ FacetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetViewModel$selectFilterField$job$1(FacetViewModel facetViewModel, C38105d dVar, C11045c<? super FacetViewModel$selectFilterField$job$1> cVar) {
        super(2, cVar);
        this.this$0 = facetViewModel;
        this.$filterSelection = dVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FacetViewModel$selectFilterField$job$1(this.this$0, this.$filterSelection, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r5) goto L_0x0033
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00e0
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0021:
            java.lang.Object r1 = r9.L$0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00c4
        L_0x0028:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
        L_0x0031:
            r1 = r10
            goto L_0x0077
        L_0x0033:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x004b
        L_0x0037:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r10 = r9.this$0
            kotlinx.coroutines.channels.g r10 = r10.f68204k
            com.carrefour.fid.android.product.presentation.ui.facet.facets.b$b r1 = com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b.C28009b.f67854a
            r9.label = r5
            java.lang.Object r10 = r10.mo23757h0(r1, r9)
            if (r10 != r0) goto L_0x004b
            return r0
        L_0x004b:
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r10 = r9.this$0
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase r10 = r10.f68195b
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$a r1 = new com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$a
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r5 = r9.this$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r5 = r5.f68199f
            com.carrefour.fid.android.domain.models.product.d r6 = r9.$filterSelection
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r7 = r9.this$0
            kotlinx.coroutines.flow.u r7 = r7.getState()
            java.lang.Object r7 = r7.getValue()
            com.carrefour.fid.android.product.presentation.viewmodel.facet.a r7 = (com.carrefour.fid.android.product.presentation.viewmodel.facet.C28160a) r7
            com.carrefour.fid.android.domain.models.product.c r7 = r7.mo81899e()
            r1.<init>(r5, r6, r7)
            r9.label = r4
            java.lang.Object r10 = r10.m172819invokegIAlus(r1, r9)
            if (r10 != r0) goto L_0x0031
            return r0
        L_0x0077:
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r10 = r9.this$0
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x00c4
            r4 = r1
            kotlin.Pair r4 = (kotlin.Pair) r4
            kotlinx.coroutines.flow.j r5 = r10.f68200g
        L_0x0086:
            java.lang.Object r6 = r5.getValue()
            r7 = r6
            com.carrefour.fid.android.shared.type.e r7 = (com.carrefour.fid.android.shared.type.C28892e) r7
            com.carrefour.fid.android.shared.type.e$c r7 = new com.carrefour.fid.android.shared.type.e$c
            java.lang.Object r8 = r4.mo21849e()
            r7.<init>(r8)
            boolean r6 = r5.mo24216e(r6, r7)
            if (r6 == 0) goto L_0x0086
            kotlinx.coroutines.flow.j r6 = r10.f68201h
        L_0x00a0:
            java.lang.Object r5 = r6.getValue()
            r7 = r5
            com.carrefour.fid.android.domain.models.product.c r7 = (com.carrefour.fid.android.domain.models.product.C38104c) r7
            java.lang.Object r7 = r4.mo21851f()
            com.carrefour.fid.android.domain.models.product.c r7 = (com.carrefour.fid.android.domain.models.product.C38104c) r7
            boolean r5 = r6.mo24216e(r5, r7)
            if (r5 == 0) goto L_0x00a0
            kotlinx.coroutines.channels.g r10 = r10.f68204k
            com.carrefour.fid.android.product.presentation.ui.facet.facets.b$c r4 = com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C28007b.C28010c.f67856a
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = r10.mo23757h0(r4, r9)
            if (r10 != r0) goto L_0x00c4
            return r0
        L_0x00c4:
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r10 = r9.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 == 0) goto L_0x00e0
            kotlinx.coroutines.channels.g r10 = r10.f68204k
            com.carrefour.fid.android.product.presentation.ui.facet.facets.b$a r4 = new com.carrefour.fid.android.product.presentation.ui.facet.facets.b$a
            r4.<init>(r3)
            r9.L$0 = r1
            r9.label = r2
            java.lang.Object r10 = r10.mo23757h0(r4, r9)
            if (r10 != r0) goto L_0x00e0
            return r0
        L_0x00e0:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$selectFilterField$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacetViewModel$selectFilterField$job$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
