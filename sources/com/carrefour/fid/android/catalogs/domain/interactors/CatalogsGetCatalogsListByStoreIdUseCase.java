package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository;
import com.carrefour.fid.android.domain.interactors.catalog.C37614f;
import com.carrefour.fid.android.domain.models.catalog.C37978c;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogsListByStoreIdUseCase;", "Lcom/carrefour/fid/android/domain/interactors/catalog/f;", "Lcom/carrefour/fid/android/domain/models/catalog/c;", "param", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "invoke-ECzgm2g", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "catalogRepository", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "<init>", "(Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogsGetCatalogsListByStoreIdUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsGetCatalogsListByStoreIdUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogsListByStoreIdUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n766#2:19\n857#2,2:20\n*S KotlinDebug\n*F\n+ 1 CatalogsGetCatalogsListByStoreIdUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogsListByStoreIdUseCase\n*L\n15#1:19\n15#1:20,2\n*E\n"})
public final class CatalogsGetCatalogsListByStoreIdUseCase implements C37614f {
    @C12579k
    private final CatalogRepository catalogRepository;

    @Inject
    public CatalogsGetCatalogsListByStoreIdUseCase(@C12579k CatalogRepository catalogRepository2) {
        Intrinsics.checkNotNullParameter(catalogRepository2, "catalogRepository");
        this.catalogRepository = catalogRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-ECzgm2g  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173101invokeECzgm2g(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.catalog.Catalog>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase$invoke$1 r0 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase$invoke$1 r0 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository r6 = r4.catalogRepository
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo130461d(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x0080
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0060:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.catalog.Catalog r2 = (com.carrefour.fid.android.domain.models.catalog.Catalog) r2
            java.util.List r2 = r2.mo117047D()
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0060
            r0.add(r1)
            goto L_0x0060
        L_0x007b:
            java.lang.Object r5 = kotlin.Result.m38702b(r0)
            goto L_0x0084
        L_0x0080:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
        L_0x0084:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase.m173101invokeECzgm2g(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m173102invokegIAlus(Object obj, C11045c cVar) {
        return m173101invokeECzgm2g(((C37978c) obj).mo117092i(), cVar);
    }
}
