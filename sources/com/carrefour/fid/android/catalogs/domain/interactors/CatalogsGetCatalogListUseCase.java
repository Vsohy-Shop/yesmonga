package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository;
import com.carrefour.fid.android.domain.interactors.catalog.C37615g;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogListUseCase;", "Lcom/carrefour/fid/android/domain/interactors/catalog/g;", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "catalogRepository", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "<init>", "(Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogsGetCatalogListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsGetCatalogListUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n1655#2,8:20\n1045#2:28\n*S KotlinDebug\n*F\n+ 1 CatalogsGetCatalogListUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogListUseCase\n*L\n16#1:20,8\n17#1:28\n*E\n"})
public final class CatalogsGetCatalogListUseCase implements C37615g {
    @C12579k
    private final CatalogRepository catalogRepository;

    @Inject
    public CatalogsGetCatalogListUseCase(@C12579k CatalogRepository catalogRepository2) {
        Intrinsics.checkNotNullParameter(catalogRepository2, "catalogRepository");
        this.catalogRepository = catalogRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173100invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.catalog.Catalog>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke$1 r0 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke$1 r0 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke$1
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
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository r5 = r4.catalogRepository
            r0.label = r3
            java.lang.Object r5 = r5.mo130461d(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x008e
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke_IoAF18A$lambda$3$$inlined$compareBy$1 r0 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke_IoAF18A$lambda$3$$inlined$compareBy$1
            r0.<init>()
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x006a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r5.next()
            r3 = r2
            com.carrefour.fid.android.domain.models.catalog.Catalog r3 = (com.carrefour.fid.android.domain.models.catalog.Catalog) r3
            java.lang.String r3 = r3.mo117075w()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L_0x006a
            r1.add(r2)
            goto L_0x006a
        L_0x0085:
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke_IoAF18A$lambda$3$$inlined$sortedBy$1 r5 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke_IoAF18A$lambda$3$$inlined$sortedBy$1
            r5.<init>()
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r1, r5)
        L_0x008e:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase.m173100invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
