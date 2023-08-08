package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.p045di.annotation.C28663g;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C11363r0({"SMAP\nProductsManagementRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsManagementRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductsManagementRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1549#2:82\n1620#2,3:83\n1549#2:86\n1620#2,3:87\n*S KotlinDebug\n*F\n+ 1 ProductsManagementRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductsManagementRepository\n*L\n28#1:82\n28#1:83,3\n53#1:86\n53#1:87,3\n*E\n"})
public final class ProductsManagementRepository {
    @C12579k

    /* renamed from: a */
    public final ProductsDataSource f67055a;
    @C12579k

    /* renamed from: b */
    public final BffProductsManagementApi f67056b;
    @C12579k

    /* renamed from: c */
    public final C28646a f67057c;

    @Inject
    public ProductsManagementRepository(@C12579k ProductsDataSource productsDataSource, @C28663g @C12579k BffProductsManagementApi bffProductsManagementApi, @C12579k C28646a aVar) {
        Intrinsics.checkNotNullParameter(productsDataSource, "apiSource");
        Intrinsics.checkNotNullParameter(bffProductsManagementApi, "productsManagementApi");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        this.f67055a = productsDataSource;
        this.f67056b = bffProductsManagementApi;
        this.f67057c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80193c(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.offer.C38064a>>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getComplementaryProductList$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getComplementaryProductList$1 r0 = (com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getComplementaryProductList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getComplementaryProductList$1 r0 = new com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getComplementaryProductList$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r13 = r10.f67055a
            r0.label = r3
            java.lang.Object r11 = r13.mo79839d(r11, r12, r0)
            if (r11 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r11)
            if (r12 != 0) goto L_0x0093
            java.util.List r11 = (java.util.List) r11
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = kotlin.collections.C10978t.m41495Y(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L_0x0060:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x008e
            java.lang.Object r13 = r11.next()
            com.carrefour.fid.android.product.domain.model.f r13 = (com.carrefour.fid.android.product.domain.model.C27593f) r13
            com.carrefour.fid.android.domain.models.offer.a r9 = new com.carrefour.fid.android.domain.models.offer.a
            com.carrefour.fid.android.domain.models.offer.Offer r1 = r13.mo80162j()
            double r2 = r13.mo80164l()
            java.lang.String r4 = r13.mo80163k()
            java.lang.String r5 = r13.mo80166n()
            java.lang.String r6 = r13.mo80161i()
            double r7 = r13.mo80165m()
            r0 = r9
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r12.add(r9)
            goto L_0x0060
        L_0x008e:
            java.lang.Object r11 = kotlin.Result.m38702b(r12)
            goto L_0x009d
        L_0x0093:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x009d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository.mo80193c(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80194d(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.offer.C38064a>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getFrequentlyPurchasedProductList$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getFrequentlyPurchasedProductList$1 r0 = (com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getFrequentlyPurchasedProductList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getFrequentlyPurchasedProductList$1 r0 = new com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getFrequentlyPurchasedProductList$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r12 = r13.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0037:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r13 = r11.f67055a
            r0.label = r3
            java.lang.Object r12 = r13.mo79840e(r12, r0)
            if (r12 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r13 = kotlin.Result.m38705e(r12)
            if (r13 != 0) goto L_0x0093
            java.util.List r12 = (java.util.List) r12
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C10978t.m41495Y(r12, r0)
            r13.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0060:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r12.next()
            com.carrefour.fid.android.product.domain.model.f r0 = (com.carrefour.fid.android.product.domain.model.C27593f) r0
            com.carrefour.fid.android.domain.models.offer.a r10 = new com.carrefour.fid.android.domain.models.offer.a
            com.carrefour.fid.android.domain.models.offer.Offer r2 = r0.mo80162j()
            double r3 = r0.mo80164l()
            java.lang.String r5 = r0.mo80163k()
            java.lang.String r6 = r0.mo80166n()
            java.lang.String r7 = r0.mo80161i()
            double r8 = r0.mo80165m()
            r1 = r10
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r13.add(r10)
            goto L_0x0060
        L_0x008e:
            java.lang.Object r12 = kotlin.Result.m38702b(r13)
            goto L_0x009d
        L_0x0093:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
        L_0x009d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository.mo80194d(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80195e(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27586d>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$1 r0 = (com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$1 r0 = new com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$1
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
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$2 r7 = new com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository.mo80195e(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
