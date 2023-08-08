package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository;
import com.carrefour.fid.android.domain.interactors.catalog.C37616h;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/domain/interactors/CatalogsRemoveCatalogFavoriteListUseCase;", "Lcom/carrefour/fid/android/domain/interactors/catalog/h;", "Lcom/carrefour/fid/android/domain/interactors/catalog/h$a;", "param", "Lkotlin/Result;", "", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/catalog/h$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "catalogRepository", "Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;", "<init>", "(Lcom/carrefour/fid/android/catalogs/data/repositories/CatalogRepository;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class CatalogsRemoveCatalogFavoriteListUseCase implements C37616h {
    @C12579k
    private final CatalogRepository catalogRepository;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval[] r0 = com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval r1 = com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval.EXPIRED_ONLY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval r1 = com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval.f94364b     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase.WhenMappings.<clinit>():void");
        }
    }

    @Inject
    public CatalogsRemoveCatalogFavoriteListUseCase(@C12579k CatalogRepository catalogRepository2) {
        Intrinsics.checkNotNullParameter(catalogRepository2, "catalogRepository");
        this.catalogRepository = catalogRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173104invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.catalog.C37616h.C37617a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase$invoke$1 r0 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase$invoke$1 r0 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0062
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0074
        L_0x0044:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval r6 = r6.mo114462d()
            int[] r7 = com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r4) goto L_0x0069
            if (r6 != r3) goto L_0x0063
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository r6 = r5.catalogRepository
            r0.label = r3
            java.lang.Object r6 = r6.mo130459b(r0)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            return r6
        L_0x0063:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0069:
            com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository r6 = r5.catalogRepository
            r0.label = r4
            java.lang.Object r6 = r6.mo130463f(r0)
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0074:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase.m173104invokegIAlus(com.carrefour.fid.android.domain.interactors.catalog.h$a, kotlin.coroutines.c):java.lang.Object");
    }
}
