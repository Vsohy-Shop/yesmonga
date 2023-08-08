package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.network.C28812h;
import com.carrefour.fid.android.shared.p045di.annotation.C28664h;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ProductsDataSource {
    @C12579k

    /* renamed from: a */
    public final BffProductsManagementApi f66592a;
    @C12579k

    /* renamed from: b */
    public final C28646a f66593b;
    @C12579k

    /* renamed from: c */
    public final C37823k f66594c;
    @C12579k

    /* renamed from: d */
    public final C28642c f66595d;
    @C12579k

    /* renamed from: e */
    public final C28812h f66596e;

    @Inject
    public ProductsDataSource(@C28664h @C12579k BffProductsManagementApi bffProductsManagementApi, @C12579k C28646a aVar, @C12579k C37823k kVar, @C12579k C28642c cVar, @C12579k C28812h hVar) {
        Intrinsics.checkNotNullParameter(bffProductsManagementApi, "api");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(cVar, "authHeadersRepository");
        Intrinsics.checkNotNullParameter(hVar, "tokenProvider");
        this.f66592a = bffProductsManagementApi;
        this.f66593b = aVar;
        this.f66594c = kVar;
        this.f66595d = cVar;
        this.f66596e = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79839d(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.product.domain.model.C27593f>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$1 r0 = (com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$1 r0 = new com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$2 r7 = new com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource.mo79839d(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79840e(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.product.domain.model.C27593f>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$1 r0 = (com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$1 r0 = new com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$2 r6 = new com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource.mo79840e(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[Catch:{ all -> 0x00b8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096 A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad A[Catch:{ all -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79841f(@org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k java.lang.String r19, @org.jetbrains.annotations.C12579k java.lang.String r20, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27585c>> r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getProduct$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getProduct$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getProduct$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getProduct$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getProduct$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r14 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0051
            if (r3 == r4) goto L_0x0046
            if (r3 != r14) goto L_0x003e
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse) r3
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00b8 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x00b8 }
            goto L_0x0090
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            java.lang.Object r3 = r2.L$0
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r3 = (com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource) r3
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00b8 }
            r4 = r3
            r3 = r0
            r0 = r14
            goto L_0x0078
        L_0x0051:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66592a     // Catch:{ all -> 0x00b8 }
            java.util.List r11 = kotlin.collections.C10976s.m41419k(r18)     // Catch:{ all -> 0x00b8 }
            r0 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r13 = 103(0x67, float:1.44E-43)
            r16 = 0
            r2.L$0 = r1     // Catch:{ all -> 0x00b8 }
            r2.label = r4     // Catch:{ all -> 0x00b8 }
            r4 = r0
            r7 = r19
            r8 = r20
            r12 = r2
            r0 = r14
            r14 = r16
            java.lang.Object r3 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPdpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00b8 }
            if (r3 != r15) goto L_0x0077
            return r15
        L_0x0077:
            r4 = r1
        L_0x0078:
            retrofit2.w r3 = (retrofit2.C13091w) r3     // Catch:{ all -> 0x00b8 }
            java.lang.Object r3 = r3.mo30572a()     // Catch:{ all -> 0x00b8 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse) r3     // Catch:{ all -> 0x00b8 }
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f66594c     // Catch:{ all -> 0x00b8 }
            r2.L$0 = r4     // Catch:{ all -> 0x00b8 }
            r2.L$1 = r3     // Catch:{ all -> 0x00b8 }
            r2.label = r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r5.m172965invokeIoAF18A(r2)     // Catch:{ all -> 0x00b8 }
            if (r0 != r15) goto L_0x008f
            return r15
        L_0x008f:
            r2 = r4
        L_0x0090:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r0)     // Catch:{ all -> 0x00b8 }
            if (r4 != 0) goto L_0x00ad
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0     // Catch:{ all -> 0x00b8 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66593b     // Catch:{ all -> 0x00b8 }
            com.carrefour.fid.android.shared.util.ServiceUtil r4 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a     // Catch:{ all -> 0x00b8 }
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r4.mo84123e(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.datasource.C27461b.m115605n(r3, r2, r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c3
        L_0x00ad:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c3
        L_0x00b8:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00c3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource.mo79841f(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
