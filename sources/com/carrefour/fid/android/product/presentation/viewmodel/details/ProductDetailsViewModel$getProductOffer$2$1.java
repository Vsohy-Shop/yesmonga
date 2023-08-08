package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import kotlinx.coroutines.flow.C11908f;

public final class ProductDetailsViewModel$getProductOffer$2$1 implements C11908f<C36371a<? extends Offer>> {

    /* renamed from: a */
    public final /* synthetic */ ProductDetailsViewModel f68105a;

    /* renamed from: b */
    public final /* synthetic */ boolean f68106b;

    /* renamed from: c */
    public final /* synthetic */ C38162k f68107c;

    public ProductDetailsViewModel$getProductOffer$2$1(ProductDetailsViewModel productDetailsViewModel, boolean z, C38162k kVar) {
        this.f68105a = productDetailsViewModel;
        this.f68106b = z;
        this.f68107c = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.types.C36371a<com.carrefour.fid.android.domain.models.offer.Offer> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1$emit$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1$emit$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1$emit$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00ef
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.core.types.a r9 = (com.carrefour.fid.android.core.types.C36371a) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1 r2 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00d6
        L_0x0043:
            kotlin.C11661u0.m45747n(r10)
            boolean r10 = r9 instanceof com.carrefour.fid.android.core.types.C36371a.C36375d
            if (r10 == 0) goto L_0x00f2
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r10 = r8.f68105a
            kotlinx.coroutines.flow.i r10 = r10.f68103l
            java.util.List r10 = r10.mo24203d()
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x0075
            boolean r10 = r8.f68106b
            if (r10 == 0) goto L_0x0075
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r10 = r8.f68105a
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$g r2 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$g
            r5 = r9
            com.carrefour.fid.android.core.types.a$d r5 = (com.carrefour.fid.android.core.types.C36371a.C36375d) r5
            java.lang.Object r5 = r5.mo108633i()
            com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
            r2.<init>(r5)
            r10.publishState(r2)
            goto L_0x00d5
        L_0x0075:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r10 = r8.f68105a
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$e r2 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$e
            r6 = r9
            com.carrefour.fid.android.core.types.a$d r6 = (com.carrefour.fid.android.core.types.C36371a.C36375d) r6
            java.lang.Object r7 = r6.mo108633i()
            com.carrefour.fid.android.domain.models.offer.Offer r7 = (com.carrefour.fid.android.domain.models.offer.Offer) r7
            r2.<init>(r7)
            r10.publishState(r2)
            java.lang.Object r10 = r6.mo108633i()
            com.carrefour.fid.android.domain.models.offer.Offer r10 = (com.carrefour.fid.android.domain.models.offer.Offer) r10
            com.carrefour.fid.android.domain.models.offer.Discount r10 = r10.mo118011T()
            r2 = 0
            if (r10 == 0) goto L_0x009c
            boolean r10 = r10.mo117958F()
            if (r10 != r5) goto L_0x009c
            r2 = r5
        L_0x009c:
            if (r2 == 0) goto L_0x00d5
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r10 = r8.f68105a
            com.carrefour.fid.android.domain.models.service.models.k r2 = r8.f68107c
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r2)
            java.lang.Object r7 = r6.mo108633i()
            com.carrefour.fid.android.domain.models.offer.Offer r7 = (com.carrefour.fid.android.domain.models.offer.Offer) r7
            com.carrefour.fid.android.domain.models.offer.Discount r7 = r7.mo118011T()
            if (r7 == 0) goto L_0x00b7
            java.util.List r7 = r7.mo117984w()
            goto L_0x00b8
        L_0x00b7:
            r7 = r4
        L_0x00b8:
            if (r7 != 0) goto L_0x00be
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00be:
            java.lang.Object r6 = r6.mo108633i()
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            boolean r6 = r6.mo118023c0()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.mo81722w0(r2, r7, r6, r0)
            if (r10 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r2 = r8
        L_0x00d6:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r10 = r2.f68105a
            kotlinx.coroutines.flow.i r10 = r10.f68103l
            com.carrefour.fid.android.core.types.a$d r9 = (com.carrefour.fid.android.core.types.C36371a.C36375d) r9
            java.lang.Object r9 = r9.mo108633i()
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto L_0x00ef
            return r1
        L_0x00ef:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x00f2:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1.emit(com.carrefour.fid.android.core.types.a, kotlin.coroutines.c):java.lang.Object");
    }
}
