package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.product.C37755e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetComplementaryProductsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetComplementaryProductsUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetComplementaryProductsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n*S KotlinDebug\n*F\n+ 1 ProductGetComplementaryProductsUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetComplementaryProductsUseCase\n*L\n23#1:33\n23#1:34,3\n*E\n"})
public final class ProductGetComplementaryProductsUseCase implements C37755e {
    @C12579k

    /* renamed from: a */
    public final ProductsManagementRepository f66819a;
    @C12579k

    /* renamed from: b */
    public final C37823k f66820b;
    @C12579k

    /* renamed from: c */
    public final C37606z f66821c;

    @Inject
    public ProductGetComplementaryProductsUseCase(@C12579k ProductsManagementRepository productsManagementRepository, @C12579k C37823k kVar, @C12579k C37606z zVar) {
        Intrinsics.checkNotNullParameter(productsManagementRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "serviceSelectionUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        this.f66819a = productsManagementRepository;
        this.f66820b = kVar;
        this.f66821c = zVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172815invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.offer.C38064a>>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase$invoke$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0068
            if (r2 == r6) goto L_0x005a
            if (r2 == r5) goto L_0x004e
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0119
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0042:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase r4 = (com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase) r4
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00af
        L_0x004e:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase r5 = (com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase) r5
            kotlin.C11661u0.m45747n(r10)
            goto L_0x009f
        L_0x005a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0079
        L_0x0068:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.interactors.service.k r10 = r9.f66820b
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r2 = r9
        L_0x0079:
            boolean r6 = kotlin.Result.m38709i(r10)
            if (r6 == 0) goto L_0x0080
            r10 = r7
        L_0x0080:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x011a
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            if (r10 != 0) goto L_0x008c
            goto L_0x011a
        L_0x008c:
            com.carrefour.fid.android.domain.interactors.basket.z r6 = r2.f66821c
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r5 = r6.invoke(r0)
            if (r5 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L_0x009f:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            r0.L$0 = r5
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.C11909g.m47495u0(r10, r0)
            if (r10 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r4 = r5
        L_0x00af:
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10
            if (r10 != 0) goto L_0x00c3
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoFoodBasketThrowable r10 = new com.carrefour.fid.android.shared.io.NoFoodBasketThrowable
            r10.<init>()
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        L_0x00c3:
            java.util.List r10 = r10.mo116817B()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r10, r6)
            r5.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x00d8:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00f0
            java.lang.Object r6 = r10.next()
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            com.carrefour.fid.android.domain.models.product.Product r6 = r6.mo118010S()
            java.lang.String r6 = r6.mo118415P()
            r5.add(r6)
            goto L_0x00d8
        L_0x00f0:
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L_0x0106
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyBasketThrowable r10 = new com.carrefour.fid.android.shared.io.EmptyBasketThrowable
            r10.<init>()
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        L_0x0106:
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository r10 = r4.f66819a
            java.lang.String r2 = r2.mo119163G()
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r10 = r10.mo80193c(r2, r5, r0)
            if (r10 != r1) goto L_0x0119
            return r1
        L_0x0119:
            return r10
        L_0x011a:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoStoreServiceException r10 = new com.carrefour.fid.android.shared.io.NoStoreServiceException
            r10.<init>()
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase.m172815invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
