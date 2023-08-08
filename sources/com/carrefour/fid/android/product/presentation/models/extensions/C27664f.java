package com.carrefour.fid.android.product.presentation.models.extensions;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nProductDetailExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailExtensions.kt\ncom/carrefour/fid/android/product/presentation/models/extensions/ProductDetailExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n288#2,2:19\n288#2,2:21\n288#2,2:23\n*S KotlinDebug\n*F\n+ 1 ProductDetailExtensions.kt\ncom/carrefour/fid/android/product/presentation/models/extensions/ProductDetailExtensionsKt\n*L\n10#1:19,2\n13#1:21,2\n15#1:23,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.f */
public final class C27664f {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.product.detail.OfferDetail m116398a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.product.detail.C38107b r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.models.product.detail.C38110e
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = r8.mo118720b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r6 = r5.mo118700s()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r7 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r6 == r7) goto L_0x0035
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x0035
            r5 = r1
            goto L_0x0036
        L_0x0035:
            r5 = r2
        L_0x0036:
            if (r5 == 0) goto L_0x0016
            goto L_0x003a
        L_0x0039:
            r4 = r3
        L_0x003a:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r4 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r4
            if (r4 != 0) goto L_0x008f
            java.util.List r0 = r8.mo118720b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0048:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x005f
            r5 = r1
            goto L_0x0060
        L_0x005f:
            r5 = r2
        L_0x0060:
            if (r5 == 0) goto L_0x0048
            r3 = r4
        L_0x0063:
            r4 = r3
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r4 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r4
            goto L_0x008f
        L_0x0067:
            java.util.List r0 = r8.mo118720b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x0088
            r5 = r1
            goto L_0x0089
        L_0x0088:
            r5 = r2
        L_0x0089:
            if (r5 == 0) goto L_0x0071
            r3 = r4
        L_0x008c:
            r4 = r3
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r4 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r4
        L_0x008f:
            if (r4 != 0) goto L_0x009c
            java.util.List r8 = r8.mo118720b()
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r8)
            r4 = r8
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r4 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r4
        L_0x009c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.models.extensions.C27664f.m116398a(com.carrefour.fid.android.domain.models.product.detail.b):com.carrefour.fid.android.domain.models.product.detail.OfferDetail");
    }
}
