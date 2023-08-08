package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2", mo22502f = "PlpFlowProvider.kt", mo22503i = {0, 1, 2}, mo22504l = {46, 46, 48, 57}, mo22505m = "invokeSuspend", mo22506n = {"productListParam", "productListParam", "facetApplied"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/k;", "serviceSelection", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/core/paging/a;", "Lcom/carrefour/fid/android/domain/models/v;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPlpFlowProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpFlowProvider.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProvider$getProductFlow$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,94:1\n53#2:95\n55#2:99\n50#3:96\n55#3:98\n106#4:97\n*S KotlinDebug\n*F\n+ 1 PlpFlowProvider.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProvider$getProductFlow$2\n*L\n52#1:95\n52#1:99\n52#1:96\n52#1:98\n52#1:97\n*E\n"})
public final class PlpFlowProvider$getProductFlow$2 extends SuspendLambda implements C11304p<C38162k, C11045c<? super C11907e<? extends C36328a<C38184v>>>, Object> {
    final /* synthetic */ C11911i<C36334b> $eventFlow;
    final /* synthetic */ ProductListSource $source;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlpFlowProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpFlowProvider$getProductFlow$2(ProductListSource productListSource, PlpFlowProvider plpFlowProvider, C11911i<C36334b> iVar, C11045c<? super PlpFlowProvider$getProductFlow$2> cVar) {
        super(2, cVar);
        this.$source = productListSource;
        this.this$0 = plpFlowProvider;
        this.$eventFlow = iVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PlpFlowProvider$getProductFlow$2 plpFlowProvider$getProductFlow$2 = new PlpFlowProvider$getProductFlow$2(this.$source, this.this$0, this.$eventFlow, cVar);
        plpFlowProvider$getProductFlow$2.L$0 = obj;
        return plpFlowProvider$getProductFlow$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C38162k kVar, @C12580l C11045c<? super C11907e<C36328a<C38184v>>> cVar) {
        return ((PlpFlowProvider$getProductFlow$2) create(kVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 == r5) goto L_0x0032
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00b2
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r0 = r8.L$0
            com.carrefour.fid.android.domain.models.product.Facet r0 = (com.carrefour.fid.android.domain.models.product.Facet) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0096
        L_0x002a:
            java.lang.Object r1 = r8.L$0
            com.carrefour.fid.android.domain.models.product.ProductListParam r1 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r1
            kotlin.C11661u0.m45747n(r9)
            goto L_0x006f
        L_0x0032:
            java.lang.Object r1 = r8.L$0
            com.carrefour.fid.android.domain.models.product.ProductListParam r1 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r1
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0062
        L_0x003a:
            kotlin.C11661u0.m45747n(r9)
            java.lang.Object r9 = r8.L$0
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r1 = r8.$source
            com.carrefour.fid.android.domain.models.product.ProductListParam r9 = com.carrefour.fid.android.product.presentation.viewmodel.list.C28206e.m118086b(r1, r9)
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider r1 = r8.this$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r6 = r8.$source
            r1.f68220d = r6
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider r1 = r8.this$0
            com.carrefour.fid.android.product.domain.interactors.l r1 = r1.f68219c
            r8.L$0 = r9
            r8.label = r5
            java.lang.Object r1 = r1.invoke(r8)
            if (r1 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0062:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C11909g.m47495u0(r9, r8)
            if (r9 != r0) goto L_0x006f
            return r0
        L_0x006f:
            com.carrefour.fid.android.domain.models.product.Facet r9 = (com.carrefour.fid.android.domain.models.product.Facet) r9
            com.carrefour.fid.android.domain.models.product.Facet$a r4 = com.carrefour.fid.android.domain.models.product.Facet.f96242f
            com.carrefour.fid.android.domain.models.product.Facet r4 = r4.mo118351a()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x009e
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider r2 = r8.this$0
            com.carrefour.fid.android.domain.interactors.product.h r2 = r2.f68218b
            com.carrefour.fid.android.domain.models.product.c r4 = com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt.m117911b(r9)
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.core.paging.b> r5 = r8.$eventFlow
            r8.L$0 = r9
            r8.label = r3
            java.lang.Object r1 = r2.invoke(r1, r4, r5, r8)
            if (r1 != r0) goto L_0x0094
            return r0
        L_0x0094:
            r0 = r9
            r9 = r1
        L_0x0096:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1 r1 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1
            r1.<init>(r9, r0)
            goto L_0x00b5
        L_0x009e:
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider r9 = r8.this$0
            com.carrefour.fid.android.domain.interactors.product.h r9 = r9.f68218b
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.core.paging.b> r3 = r8.$eventFlow
            r4 = 0
            r8.L$0 = r4
            r8.label = r2
            java.lang.Object r9 = r9.invoke(r1, r4, r3, r8)
            if (r9 != r0) goto L_0x00b2
            return r0
        L_0x00b2:
            r1 = r9
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
