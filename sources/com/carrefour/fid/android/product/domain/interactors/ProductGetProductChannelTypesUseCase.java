package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37779q;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetProductChannelTypesUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetProductChannelTypesUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetProductChannelTypesUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n766#2:34\n857#2,2:35\n1603#2,9:37\n1855#2:46\n1856#2:48\n1612#2:49\n1#3:47\n*S KotlinDebug\n*F\n+ 1 ProductGetProductChannelTypesUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetProductChannelTypesUseCase\n*L\n27#1:34\n27#1:35,2\n27#1:37,9\n27#1:46\n27#1:48\n27#1:49\n27#1:47\n*E\n"})
public final class ProductGetProductChannelTypesUseCase implements C37779q {
    @C12579k

    /* renamed from: a */
    public final ProductsManagementRepository f66877a;
    @C12579k

    /* renamed from: b */
    public final C37823k f66878b;

    @Inject
    public ProductGetProductChannelTypesUseCase(@C12579k ProductsManagementRepository productsManagementRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(productsManagementRepository, "productsManagementRepository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f66877a = productsManagementRepository;
        this.f66878b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo79986a(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.interactors.C27541x3d296290
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase$getProductChannelTypesByGtin$1 r0 = (com.carrefour.fid.android.product.domain.interactors.C27541x3d296290) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase$getProductChannelTypesByGtin$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase$getProductChannelTypesByGtin$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x009a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x005f
        L_0x004c:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.service.k r9 = r7.f66878b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r7
        L_0x005f:
            boolean r5 = kotlin.Result.m38709i(r9)
            r6 = 0
            if (r5 == 0) goto L_0x0068
            r5 = r6
            goto L_0x0069
        L_0x0068:
            r5 = r9
        L_0x0069:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 != 0) goto L_0x0083
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Throwable r8 = kotlin.Result.m38705e(r9)
            if (r8 != 0) goto L_0x007a
            java.lang.Throwable r8 = new java.lang.Throwable
            r8.<init>()
        L_0x007a:
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        L_0x0083:
            com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository r9 = r2.f66877a
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r5)
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r2)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r9.mo80195e(r8, r2, r0)
            if (r8 != r1) goto L_0x009a
            return r1
        L_0x009a:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r8)
            if (r9 != 0) goto L_0x00f9
            com.carrefour.fid.android.product.domain.model.d r8 = (com.carrefour.fid.android.product.domain.model.C27586d) r8
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.product.detail.b r8 = r8.mo80095f()
            java.util.List r8 = r8.mo118720b()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00b7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r1
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = r1.mo118699r()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r2 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r1 != r2) goto L_0x00ce
            r1 = r4
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x00b7
            r9.add(r0)
            goto L_0x00b7
        L_0x00d5:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00de:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r9.next()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r0 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r0
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r0 = r0.mo118700s()
            if (r0 == 0) goto L_0x00de
            r8.add(r0)
            goto L_0x00de
        L_0x00f4:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x0103
        L_0x00f9:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x0103:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase.mo79986a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
