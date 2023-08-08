package com.carrefour.fid.android.catalogs.data.repositories;

import com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource;
import com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCatalogRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogRepository.kt\ncom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n*L\n1#1,49:1\n1#2:50\n766#3:51\n857#3,2:52\n53#4:54\n55#4:58\n50#5:55\n55#5:57\n106#6:56\n3#7:59\n*S KotlinDebug\n*F\n+ 1 CatalogRepository.kt\ncom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository\n*L\n22#1:51\n22#1:52,2\n33#1:54\n33#1:58\n33#1:55\n33#1:57\n33#1:56\n33#1:59\n*E\n"})
public final class CatalogRepository {
    @C12579k

    /* renamed from: a */
    public final CatalogsRemoteDataSource f100783a;
    @C12579k

    /* renamed from: b */
    public final CatalogsLocalDataSource f100784b;

    @Inject
    public CatalogRepository(@C12579k CatalogsRemoteDataSource catalogsRemoteDataSource, @C12579k CatalogsLocalDataSource catalogsLocalDataSource) {
        Intrinsics.checkNotNullParameter(catalogsRemoteDataSource, "catalogsRemoteDataSource");
        Intrinsics.checkNotNullParameter(catalogsLocalDataSource, "catalogsLocalDataSource");
        this.f100783a = catalogsRemoteDataSource;
        this.f100784b = catalogsLocalDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130458a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$addFavoriteProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$addFavoriteProduct$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$addFavoriteProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$addFavoriteProduct$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$addFavoriteProduct$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r6 = r4.f100784b
            com.carrefour.fid.android.CatalogProduct r5 = com.carrefour.fid.android.catalogs.data.local.mapper.C39405a.m161515c(r5)
            java.lang.String r2 = "product.toFavoriteCatalogProduct()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0.label = r3
            java.lang.Object r6 = r6.mo130442e(r5, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130458a(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130459b(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$clearAllProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$clearAllProducts$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$clearAllProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$clearAllProducts$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$clearAllProducts$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r5 = r4.f100784b
            r0.label = r3
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x0055
            kotlin.Result$a r0 = kotlin.Result.f28060a
            kotlin.d2 r5 = (kotlin.C11079d2) r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
        L_0x0055:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130459b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130460c(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogDetails$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogDetails$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogDetails$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource r6 = r4.f100783a
            r0.label = r3
            java.lang.Object r5 = r6.mo130278b(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r6 = kotlin.Result.m38710j(r5)
            if (r6 == 0) goto L_0x0069
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails r5 = (com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails) r5
            if (r5 == 0) goto L_0x0064
            com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails r6 = r5.mo117135g()
            if (r6 == 0) goto L_0x0064
            java.util.List r6 = r6.mo117171r()
            if (r6 == 0) goto L_0x0064
            java.lang.String r0 = "mobile"
            boolean r6 = r6.contains(r0)
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r6 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130460c(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130461d(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.catalog.Catalog>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogList$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogList$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getCatalogList$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource r5 = r4.f100783a
            r0.label = r3
            java.lang.Object r5 = r5.mo130279c(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x007c
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x005a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.catalog.Catalog r2 = (com.carrefour.fid.android.domain.models.catalog.Catalog) r2
            java.util.List r2 = r2.mo117070s()
            java.lang.String r3 = "mobile"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x005a
            r0.add(r1)
            goto L_0x005a
        L_0x0077:
            java.lang.Object r5 = kotlin.Result.m38702b(r0)
            goto L_0x0080
        L_0x007c:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130461d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130462e(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0046
        L_0x0038:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r6 = r5.f100784b
            r0.label = r4
            java.lang.Object r6 = r6.mo31122b(r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts-IoAF18A$$inlined$map$1 r2 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$getFavoriteProducts-IoAF18A$$inlined$map$1
            r2.<init>(r6)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47501w0(r2, r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x005e
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x005e:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130462e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130463f(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeExpiredProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeExpiredProducts$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeExpiredProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeExpiredProducts$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeExpiredProducts$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r5 = r4.f100784b
            r0.label = r3
            java.lang.Object r5 = r5.mo130445h(r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130463f(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130464g(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeFavoriteProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeFavoriteProduct$1 r0 = (com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeFavoriteProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeFavoriteProduct$1 r0 = new com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository$removeFavoriteProduct$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r6 = r4.f100784b
            com.carrefour.fid.android.CatalogProduct r5 = com.carrefour.fid.android.catalogs.data.local.mapper.C39405a.m161515c(r5)
            java.lang.String r2 = "product.toFavoriteCatalogProduct()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0.label = r3
            java.lang.Object r6 = r6.mo130446j(r5, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository.mo130464g(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, kotlin.coroutines.c):java.lang.Object");
    }
}
