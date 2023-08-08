package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase$invoke$2", mo22502f = "ProductGetFacetsFlowUseCase.kt", mo22503i = {0, 1, 1, 2, 2, 3, 4, 5, 6, 7}, mo22504l = {27, 28, 28, 33, 41, 49, 56, 64, 74}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "$this$flow", "slotSlice", "$this$flow", "slotSlice", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/product/Facet;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetFacetsFlowUseCase$invoke$2 extends SuspendLambda implements C11304p<C11908f<? super Result<? extends Facet>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ProductListParam $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ProductGetFacetsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetFacetsFlowUseCase$invoke$2(ProductGetFacetsFlowUseCase productGetFacetsFlowUseCase, ProductListParam productListParam, C11045c<? super ProductGetFacetsFlowUseCase$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = productGetFacetsFlowUseCase;
        this.$param = productListParam;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ProductGetFacetsFlowUseCase$invoke$2 productGetFacetsFlowUseCase$invoke$2 = new ProductGetFacetsFlowUseCase$invoke$2(this.this$0, this.$param, cVar);
        productGetFacetsFlowUseCase$invoke$2.L$0 = obj;
        return productGetFacetsFlowUseCase$invoke$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Result<Facet>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductGetFacetsFlowUseCase$invoke$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (kotlin.Result.m38709i(r12) == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        r12 = (java.lang.String) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (r12 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r12 = "1A";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r1 = r11.this$0.f66861c;
        r11.L$0 = r3;
        r11.L$1 = r12;
        r11.label = 2;
        r1 = r1.invoke(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r1 != r0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r10 = r1;
        r1 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r11.L$0 = r3;
        r11.L$1 = r1;
        r11.label = 3;
        r12 = kotlinx.coroutines.flow.C11909g.m47495u0((kotlinx.coroutines.flow.C11907e) r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        if (r12 != r0) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12;
        r8 = com.carrefour.fid.android.domain.models.product.C38103b.m157529b(r12);
        r7 = com.carrefour.fid.android.domain.models.product.C38103b.m157528a(r12);
        r12 = r11.$param;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b8, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Department) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        r3 = r11.this$0.f66859a;
        r6 = ((com.carrefour.fid.android.domain.models.product.ProductListParam.Department) r11.$param).mo118481m();
        r4 = r11.$param.mo118467a();
        r11.L$0 = r1;
        r11.L$1 = null;
        r11.label = 4;
        r12 = r3.mo80172c(r4, r5, r6, r7, r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        if (r12 != r0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e1, code lost:
        r3 = r11.this$0.f66859a;
        r4 = r11.$param.mo118467a();
        r6 = new java.lang.String();
        r11.L$0 = r1;
        r11.L$1 = null;
        r11.label = 5;
        r12 = r3.mo80176i(r4, r5, r6, r7, r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r12 != r0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Promo) == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r3 = r11.this$0.f66859a;
        r4 = r11.$param.mo118467a();
        r11.L$0 = r1;
        r11.L$1 = null;
        r11.label = 6;
        r12 = r3.mo80175g(r4, r5, r7, r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011f, code lost:
        if (r12 != r0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0121, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Query) == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
        r3 = r11.this$0.f66859a;
        r4 = r11.$param.mo118467a();
        r6 = ((com.carrefour.fid.android.domain.models.product.ProductListParam.Query) r11.$param).mo118524f();
        r11.L$0 = r1;
        r11.L$1 = null;
        r11.label = 7;
        r12 = r3.mo80176i(r4, r5, r6, r7, r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        if (r12 != r0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0148, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014b, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Search) == false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014d, code lost:
        r3 = r11.this$0.f66859a;
        r4 = r11.$param.mo118467a();
        r6 = ((com.carrefour.fid.android.domain.models.product.ProductListParam.Search) r11.$param).mo118541i();
        r11.L$0 = r1;
        r11.L$1 = null;
        r11.label = 8;
        r12 = r3.mo80177k(r4, r5, r6, r7, r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016e, code lost:
        if (r12 != r0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0170, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        r11.this$0.f66862d.mo121196e();
        r12 = kotlin.Result.m38701a(r12);
        r11.L$0 = null;
        r11.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0188, code lost:
        if (r1.emit(r12, r11) != r0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018d, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0193, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r5 = r1;
        r1 = r3;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0050;
                case 1: goto L_0x0041;
                case 2: goto L_0x0035;
                case 3: goto L_0x0026;
                case 4: goto L_0x0017;
                case 5: goto L_0x0017;
                case 6: goto L_0x0017;
                case 7: goto L_0x0017;
                case 8: goto L_0x0017;
                case 9: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0012:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x018b
        L_0x0017:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0171
        L_0x0026:
            java.lang.Object r1 = r11.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.C11908f) r3
            kotlin.C11661u0.m45747n(r12)
        L_0x0031:
            r5 = r1
            r1 = r3
            goto L_0x00aa
        L_0x0035:
            java.lang.Object r1 = r11.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.C11908f) r3
            kotlin.C11661u0.m45747n(r12)
            goto L_0x009a
        L_0x0041:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r3 = r1
            goto L_0x0076
        L_0x0050:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.C11908f) r12
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r1 = r11.this$0
            com.carrefour.fid.android.performance.d r1 = r1.f66862d
            java.lang.String r3 = "facets_plp"
            r1.mo121195d(r3)
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r1 = r11.this$0
            com.carrefour.fid.android.domain.interactors.slot.d r1 = r1.f66860b
            r11.L$0 = r12
            r3 = 1
            r11.label = r3
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r11)
            if (r1 != r0) goto L_0x0074
            return r0
        L_0x0074:
            r3 = r12
            r12 = r1
        L_0x0076:
            boolean r1 = kotlin.Result.m38709i(r12)
            if (r1 == 0) goto L_0x007d
            r12 = r2
        L_0x007d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x0083
            java.lang.String r12 = "1A"
        L_0x0083:
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r1 = r11.this$0
            com.carrefour.fid.android.product.domain.interactors.l r1 = r1.f66861c
            r11.L$0 = r3
            r11.L$1 = r12
            r4 = 2
            r11.label = r4
            java.lang.Object r1 = r1.invoke(r11)
            if (r1 != r0) goto L_0x0097
            return r0
        L_0x0097:
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x009a:
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C11907e) r12
            r11.L$0 = r3
            r11.L$1 = r1
            r4 = 3
            r11.label = r4
            java.lang.Object r12 = kotlinx.coroutines.flow.C11909g.m47495u0(r12, r11)
            if (r12 != r0) goto L_0x0031
            return r0
        L_0x00aa:
            com.carrefour.fid.android.domain.models.product.Facet r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12
            java.util.List r8 = com.carrefour.fid.android.domain.models.product.C38103b.m157529b(r12)
            java.util.List r7 = com.carrefour.fid.android.domain.models.product.C38103b.m157528a(r12)
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            boolean r3 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Department
            if (r3 == 0) goto L_0x00dd
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r12 = r11.this$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r3 = r12.f66859a
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            com.carrefour.fid.android.domain.models.product.ProductListParam$Department r12 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Department) r12
            java.util.List r6 = r12.mo118481m()
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            java.lang.String r4 = r12.mo118467a()
            r11.L$0 = r1
            r11.L$1 = r2
            r12 = 4
            r11.label = r12
            r9 = r11
            java.lang.Object r12 = r3.mo80172c(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x0171
            return r0
        L_0x00dd:
            boolean r3 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins
            if (r3 == 0) goto L_0x0101
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r12 = r11.this$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r3 = r12.f66859a
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            java.lang.String r4 = r12.mo118467a()
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            r11.L$0 = r1
            r11.L$1 = r2
            r12 = 5
            r11.label = r12
            r9 = r11
            java.lang.Object r12 = r3.mo80176i(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x0171
            return r0
        L_0x0101:
            boolean r3 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Promo
            if (r3 == 0) goto L_0x0122
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r12 = r11.this$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r3 = r12.f66859a
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            java.lang.String r4 = r12.mo118467a()
            r11.L$0 = r1
            r11.L$1 = r2
            r12 = 6
            r11.label = r12
            r6 = r7
            r7 = r8
            r8 = r11
            java.lang.Object r12 = r3.mo80175g(r4, r5, r6, r7, r8)
            if (r12 != r0) goto L_0x0171
            return r0
        L_0x0122:
            boolean r3 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Query
            if (r3 == 0) goto L_0x0149
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r12 = r11.this$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r3 = r12.f66859a
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            java.lang.String r4 = r12.mo118467a()
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            com.carrefour.fid.android.domain.models.product.ProductListParam$Query r12 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Query) r12
            java.lang.String r6 = r12.mo118524f()
            r11.L$0 = r1
            r11.L$1 = r2
            r12 = 7
            r11.label = r12
            r9 = r11
            java.lang.Object r12 = r3.mo80176i(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x0171
            return r0
        L_0x0149:
            boolean r12 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Search
            if (r12 == 0) goto L_0x018e
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r12 = r11.this$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r3 = r12.f66859a
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            java.lang.String r4 = r12.mo118467a()
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = r11.$param
            com.carrefour.fid.android.domain.models.product.ProductListParam$Search r12 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Search) r12
            java.lang.String r6 = r12.mo118541i()
            r11.L$0 = r1
            r11.L$1 = r2
            r12 = 8
            r11.label = r12
            r9 = r11
            java.lang.Object r12 = r3.mo80177k(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x0171
            return r0
        L_0x0171:
            com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase r3 = r11.this$0
            com.carrefour.fid.android.performance.d r3 = r3.f66862d
            r3.mo121196e()
            kotlin.Result r12 = kotlin.Result.m38701a(r12)
            r11.L$0 = r2
            r2 = 9
            r11.label = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L_0x018b
            return r0
        L_0x018b:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x018e:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
