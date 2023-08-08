package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37776o;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ProductGetFrequentlyPurchasedProductsUseCase implements C37776o {
    @C12579k

    /* renamed from: a */
    public final ProductsManagementRepository f66863a;
    @C12579k

    /* renamed from: b */
    public final C37823k f66864b;

    @Inject
    public ProductGetFrequentlyPurchasedProductsUseCase(@C12579k ProductsManagementRepository productsManagementRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(productsManagementRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "serviceSelectionUseCase");
        this.f66863a = productsManagementRepository;
        this.f66864b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo79978a(boolean r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.offer.C38064a>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x00b2
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x0090
        L_0x0048:
            boolean r8 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006b
        L_0x0058:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.service.k r9 = r7.f66864b
            r0.L$0 = r7
            r0.Z$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r2 = r7
        L_0x006b:
            boolean r5 = kotlin.Result.m38709i(r9)
            r6 = 0
            if (r5 == 0) goto L_0x0073
            r9 = r6
        L_0x0073:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x007c
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            goto L_0x007d
        L_0x007c:
            r9 = r6
        L_0x007d:
            if (r9 == 0) goto L_0x0091
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository r8 = r2.f66863a
            java.lang.String r9 = r9.mo119163G()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r8.mo80194d(r9, r0)
            if (r8 != r1) goto L_0x0090
            return r1
        L_0x0090:
            return r8
        L_0x0091:
            if (r8 == 0) goto L_0x00a3
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoStoreServiceException r8 = new com.carrefour.fid.android.shared.io.NoStoreServiceException
            r8.<init>()
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        L_0x00a3:
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository r8 = r2.f66863a
            r0.L$0 = r6
            r0.label = r3
            java.lang.String r9 = "0261-150-6"
            java.lang.Object r8 = r8.mo80194d(r9, r0)
            if (r8 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase.mo79978a(boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
