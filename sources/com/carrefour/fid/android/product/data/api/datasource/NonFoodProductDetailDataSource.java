package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.p045di.annotation.C28663g;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class NonFoodProductDetailDataSource {
    @C12579k

    /* renamed from: a */
    public final BffProductsManagementApi f66584a;
    @C12579k

    /* renamed from: b */
    public final C28646a f66585b;

    @Inject
    public NonFoodProductDetailDataSource(@C28663g @C12579k BffProductsManagementApi bffProductsManagementApi, @C12579k C28646a aVar) {
        Intrinsics.checkNotNullParameter(bffProductsManagementApi, "api");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        this.f66584a = bffProductsManagementApi;
        this.f66585b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79830a(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27586d>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource$getProduct$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource$getProduct$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource$getProduct$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource$getProduct$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource$getProduct$1
            r2.<init>(r15, r0)
        L_0x001b:
            r12 = r2
            java.lang.Object r0 = r12.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r12.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r2 = r12.L$0
            com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource r2 = (com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x006a }
            goto L_0x005b
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66584a     // Catch:{ all -> 0x006a }
            java.util.List r11 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r16)     // Catch:{ all -> 0x006a }
            r0 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r13 = 103(0x67, float:1.44E-43)
            r14 = 0
            r12.L$0 = r1     // Catch:{ all -> 0x006a }
            r12.label = r4     // Catch:{ all -> 0x006a }
            r4 = r0
            r7 = r17
            r8 = r18
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPdpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x006a }
            if (r0 != r2) goto L_0x005a
            return r2
        L_0x005a:
            r2 = r1
        L_0x005b:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x006a }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse) r0     // Catch:{ all -> 0x006a }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f66585b     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt.m115579f(r0, r2)     // Catch:{ all -> 0x006a }
            goto L_0x0075
        L_0x006a:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource.mo79830a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
