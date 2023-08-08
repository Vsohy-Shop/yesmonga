package com.carrefour.fid.android.catalogs.data.api.datasources.remote;

import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class CatalogsRemoteDataSource {
    @C12579k

    /* renamed from: a */
    public final C39401a f100751a;

    @Inject
    public CatalogsRemoteDataSource(@C12579k C39401a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "catalogApiService");
        this.f100751a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130278b(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$1 r0 = (com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$1 r0 = new com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$1
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
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$2 r6 = new com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogDetails$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource.mo130278b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130279c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.catalog.Catalog>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$1 r0 = (com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$1 r0 = new com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$2 r5 = new com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource$getCatalogList$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource.mo130279c(kotlin.coroutines.c):java.lang.Object");
    }
}
