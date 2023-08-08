package com.carrefour.fid.android.categories.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class CategoriesDataSource {
    @C12579k

    /* renamed from: a */
    public final BffStoresManagementApi f101377a;
    @C12579k

    /* renamed from: b */
    public final C28646a f101378b;

    @Inject
    public CategoriesDataSource(@C12579k BffStoresManagementApi bffStoresManagementApi, @C12579k C28646a aVar) {
        Intrinsics.checkNotNullParameter(bffStoresManagementApi, "bffStoresManagementApi");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        this.f101377a = bffStoresManagementApi;
        this.f101378b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131018a(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>>> r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            boolean r2 = r0 instanceof com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource$getCategories$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource$getCategories$1 r2 = (com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource$getCategories$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource$getCategories$1 r2 = new com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource$getCategories$1
            r2.<init>(r1, r0)
        L_0x001c:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            java.lang.Object r2 = r8.L$0
            com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource r2 = (com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0065
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi r3 = r1.f101377a     // Catch:{ Exception -> 0x0074 }
            r9 = r19
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ Exception -> 0x0074 }
            java.lang.String r10 = ","
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 62
            r17 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0074 }
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 14
            r10 = 0
            r8.L$0 = r1     // Catch:{ Exception -> 0x0074 }
            r8.label = r4     // Catch:{ Exception -> 0x0074 }
            r4 = r0
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi.DefaultImpls.getCategoryTreeWithStoreServices$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0074 }
            if (r0 != r2) goto L_0x0064
            return r2
        L_0x0064:
            r2 = r1
        L_0x0065:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ Exception -> 0x0074 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategoryTreeResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategoryTreeResponse) r0     // Catch:{ Exception -> 0x0074 }
            com.carrefour.fid.android.shared.data.parsing.a r2 = r2.f101378b     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r0 = com.carrefour.fid.android.categories.data.api.datasource.C39734b.m162166a(r0, r2)     // Catch:{ Exception -> 0x0074 }
            goto L_0x007f
        L_0x0074:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource.mo131018a(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
