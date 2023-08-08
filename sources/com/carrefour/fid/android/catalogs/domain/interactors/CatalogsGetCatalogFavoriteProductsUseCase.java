package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogFavoriteProductsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "catalogRepository", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "<init>", "(Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class CatalogsGetCatalogFavoriteProductsUseCase implements C37613e {
    @C12579k
    private final CatalogRepository catalogRepository;

    @Inject
    public CatalogsGetCatalogFavoriteProductsUseCase(@C12579k CatalogRepository catalogRepository2) {
        Intrinsics.checkNotNullParameter(catalogRepository2, "catalogRepository");
        this.catalogRepository = catalogRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173099invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase$invoke$1 r0 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase$invoke$1 r0 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase$invoke$1
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
            java.lang.Object r5 = r5.mo130462e(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase.m173099invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
