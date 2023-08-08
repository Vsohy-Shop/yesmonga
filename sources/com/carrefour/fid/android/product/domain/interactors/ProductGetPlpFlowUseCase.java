package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.interactors.product.C37786s;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.PlpProductRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ProductGetPlpFlowUseCase implements C37778p {
    @C12579k

    /* renamed from: a */
    public final PlpProductRepository f66873a;
    @C12579k

    /* renamed from: b */
    public final C37857d f66874b;
    @C12579k

    /* renamed from: c */
    public final C37786s f66875c;
    @C12579k

    /* renamed from: d */
    public final C38328d f66876d;

    @Inject
    public ProductGetPlpFlowUseCase(@C12579k PlpProductRepository plpProductRepository, @C12579k C37857d dVar, @C12579k C37786s sVar, @C12579k C38328d dVar2) {
        Intrinsics.checkNotNullParameter(plpProductRepository, "repository");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        Intrinsics.checkNotNullParameter(sVar, "shouldClearProductListCacheUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "performance");
        this.f66873a = plpProductRepository;
        this.f66874b = dVar;
        this.f66875c = sVar;
        this.f66876d = dVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.carrefour.fid.android.domain.models.product.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79984b(com.carrefour.fid.android.domain.models.product.ProductListParam r7, com.carrefour.fid.android.domain.models.product.C38104c r8, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.product.domain.model.C27587e> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$generateProductListIdentifier$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$generateProductListIdentifier$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$generateProductListIdentifier$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$generateProductListIdentifier$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$generateProductListIdentifier$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.carrefour.fid.android.domain.models.product.c r8 = (com.carrefour.fid.android.domain.models.product.C38104c) r8
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.domain.models.product.ProductListParam r7 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r7
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0052
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.slot.d r9 = r6.f66874b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r4 = r8
            boolean r8 = kotlin.Result.m38709i(r9)
            if (r8 == 0) goto L_0x005a
            r9 = 0
        L_0x005a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0062
            java.lang.String r8 = "1A"
            r2 = r8
            goto L_0x0063
        L_0x0062:
            r2 = r9
        L_0x0063:
            boolean r8 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Department
            if (r8 == 0) goto L_0x007b
            com.carrefour.fid.android.product.domain.model.e$a r8 = new com.carrefour.fid.android.product.domain.model.e$a
            java.lang.String r9 = r7.mo118467a()
            java.util.List r9 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r9)
            com.carrefour.fid.android.domain.models.product.ProductListParam$Department r7 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Department) r7
            java.util.List r7 = r7.mo118481m()
            r8.<init>(r9, r2, r7, r4)
            goto L_0x00e6
        L_0x007b:
            boolean r8 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Search
            if (r8 == 0) goto L_0x0095
            com.carrefour.fid.android.product.domain.model.e$e r8 = new com.carrefour.fid.android.product.domain.model.e$e
            java.lang.String r9 = r7.mo118467a()
            java.util.List r1 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r9)
            com.carrefour.fid.android.domain.models.product.ProductListParam$Search r7 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Search) r7
            java.lang.String r3 = r7.mo118541i()
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00e6
        L_0x0095:
            boolean r8 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Promo
            if (r8 == 0) goto L_0x00a7
            com.carrefour.fid.android.product.domain.model.e$c r8 = new com.carrefour.fid.android.product.domain.model.e$c
            java.lang.String r7 = r7.mo118467a()
            java.util.List r7 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r7)
            r8.<init>(r7, r2, r4)
            goto L_0x00e6
        L_0x00a7:
            boolean r8 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Query
            if (r8 == 0) goto L_0x00bf
            com.carrefour.fid.android.product.domain.model.e$d r8 = new com.carrefour.fid.android.product.domain.model.e$d
            java.lang.String r9 = r7.mo118467a()
            java.util.List r9 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r9)
            com.carrefour.fid.android.domain.models.product.ProductListParam$Query r7 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Query) r7
            java.lang.String r7 = r7.mo118524f()
            r8.<init>(r9, r2, r7, r4)
            goto L_0x00e6
        L_0x00bf:
            boolean r8 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins
            if (r8 == 0) goto L_0x00e7
            com.carrefour.fid.android.product.domain.model.e$b r8 = new com.carrefour.fid.android.product.domain.model.e$b
            r9 = r7
            com.carrefour.fid.android.domain.models.product.ProductListParam$Gtins r9 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins) r9
            boolean r0 = r9.mo118496h()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r7 = r7.mo118467a()
            java.util.List r7 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r7)
            goto L_0x00df
        L_0x00d7:
            java.lang.String r7 = r7.mo118467a()
            java.util.List r7 = kotlin.collections.C10976s.m41419k(r7)
        L_0x00df:
            java.util.List r9 = r9.mo118495g()
            r8.<init>(r7, r9)
        L_0x00e6:
            return r8
        L_0x00e7:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase.mo79984b(com.carrefour.fid.android.domain.models.product.ProductListParam, com.carrefour.fid.android.domain.models.product.c, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: kotlinx.coroutines.flow.i<com.carrefour.fid.android.core.paging.b>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.carrefour.fid.android.domain.models.product.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.product.ProductListParam r8, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.product.C38104c r9, @org.jetbrains.annotations.C12580l kotlinx.coroutines.flow.C11911i<com.carrefour.fid.android.core.paging.C36334b> r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.core.paging.C36328a<com.carrefour.fid.android.domain.models.product.plp.C38115c>>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase$invoke$1
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r8 = r0.Z$0
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.C11911i) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase r10 = (com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00af
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            java.lang.Object r8 = r0.L$3
            r10 = r8
            kotlinx.coroutines.flow.i r10 = (kotlinx.coroutines.flow.C11911i) r10
            java.lang.Object r8 = r0.L$2
            r9 = r8
            com.carrefour.fid.android.domain.models.product.c r9 = (com.carrefour.fid.android.domain.models.product.C38104c) r9
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.models.product.ProductListParam r8 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            r6 = r11
            r11 = r10
            r10 = r2
            r2 = r6
            goto L_0x007f
        L_0x005f:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.performance.d r11 = r7.f66876d
            java.lang.String r2 = "get_plp"
            r11.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.product.s r11 = r7.f66875c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r4
            java.lang.Object r11 = r11.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r2 = r11
            r11 = r10
            r10 = r7
        L_0x007f:
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            boolean r5 = kotlin.Result.m38709i(r2)
            if (r5 == 0) goto L_0x008b
            r2 = r4
        L_0x008b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0098
            com.carrefour.fid.android.domain.interactors.product.s r4 = r10.f66875c
            r4.mo80057b()
        L_0x0098:
            r0.L$0 = r10
            r0.L$1 = r11
            r4 = 0
            r0.L$2 = r4
            r0.L$3 = r4
            r0.Z$0 = r2
            r0.label = r3
            java.lang.Object r8 = r10.mo79984b(r8, r9, r0)
            if (r8 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r9 = r11
            r11 = r8
            r8 = r2
        L_0x00af:
            com.carrefour.fid.android.product.domain.model.e r11 = (com.carrefour.fid.android.product.domain.model.C27587e) r11
            com.carrefour.fid.android.product.domain.repositories.PlpProductRepository r0 = r10.f66873a
            kotlinx.coroutines.flow.e r8 = r0.mo80183c(r11, r9, r8)
            com.carrefour.fid.android.performance.d r9 = r10.f66876d
            r9.mo121196e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase.invoke(com.carrefour.fid.android.domain.models.product.ProductListParam, com.carrefour.fid.android.domain.models.product.c, kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }
}
