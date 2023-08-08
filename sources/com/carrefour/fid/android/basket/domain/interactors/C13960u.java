package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37597s;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nBasketHandleBasketErrorUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketHandleBasketErrorUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketHandleBasketErrorUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1#2:47\n1855#3,2:48\n*S KotlinDebug\n*F\n+ 1 BasketHandleBasketErrorUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketHandleBasketErrorUseCase\n*L\n19#1:48,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.u */
public final class C13960u implements C37597s {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        if (r0.mo118004M() > r0.mo118012U()) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        r5 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ea, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(new com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable(r0.mo118001J().mo118136f(), (kotlin.jvm.internal.DefaultConstructorMarker) null)));
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172798invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37597s.C37598a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            com.carrefour.fid.android.domain.models.basket.Basket r6 = r5.mo114440e()
            java.util.List r6 = r6.mo116817B()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r6.next()
            r2 = r0
            com.carrefour.fid.android.domain.models.offer.Offer r2 = (com.carrefour.fid.android.domain.models.offer.Offer) r2
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = r2.mo118001J()
            java.lang.String r2 = r2.mo118136f()
            com.carrefour.fid.android.domain.interactors.basket.o0$a r3 = r5.mo114442f()
            java.lang.String r3 = r3.mo114430k()
            boolean r2 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r2, r3)
            if (r2 == 0) goto L_0x000e
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            com.carrefour.fid.android.domain.models.offer.Offer r0 = (com.carrefour.fid.android.domain.models.offer.Offer) r0
            if (r0 != 0) goto L_0x0041
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0041:
            java.util.List r5 = r0.mo118005N()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x004b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00eb
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.offer.OfferMessage r6 = (com.carrefour.fid.android.domain.models.offer.OfferMessage) r6
            java.lang.String r6 = r6.mo118148e()
            int r2 = r6.hashCode()
            switch(r2) {
                case -1688620010: goto L_0x00c1;
                case -1015848577: goto L_0x00b8;
                case 140722205: goto L_0x009d;
                case 935189964: goto L_0x007e;
                case 1018325076: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x004b
        L_0x0063:
            java.lang.String r2 = "NOT_ADDED"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x006c
            goto L_0x004b
        L_0x006c:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketThrowable r5 = new com.carrefour.fid.android.domain.exceptions.BasketThrowable
            com.carrefour.fid.android.domain.exceptions.BasketErrorType r6 = com.carrefour.fid.android.domain.exceptions.BasketErrorType.BasketNotAdded
            r5.<init>(r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x007e:
            java.lang.String r2 = "QUANTITY_REQUESTED_RELATED_TO_PRODUCT_CATEGORY_HAS_EXCEEDED_THE_LIMIT"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0087
            goto L_0x004b
        L_0x0087:
            com.carrefour.fid.android.domain.models.offer.CategoryLimit r6 = r0.mo117996E()
            if (r6 == 0) goto L_0x004b
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable r5 = new com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable
            r5.<init>(r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x009d:
            java.lang.String r2 = "NOT_AVAILABLE"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00a6
            goto L_0x004b
        L_0x00a6:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketThrowable r5 = new com.carrefour.fid.android.domain.exceptions.BasketThrowable
            com.carrefour.fid.android.domain.exceptions.BasketErrorType r6 = com.carrefour.fid.android.domain.exceptions.BasketErrorType.ProductNotAvailable
            r5.<init>(r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x00b8:
            java.lang.String r2 = "QUANTITY_REQUESTED_HIGHER_THAN_MAX_POSSIBLE"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00c9
            goto L_0x004b
        L_0x00c1:
            java.lang.String r2 = "QUANTITY_REQUESTED_HIGHER_THAN_AVAILABLE"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x004b
        L_0x00c9:
            int r6 = r0.mo118004M()
            int r2 = r0.mo118012U()
            if (r6 > r2) goto L_0x004b
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable r5 = new com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r0.mo118001J()
            java.lang.String r6 = r6.mo118136f()
            r5.<init>(r6, r1)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x00eb:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.C13960u.m172798invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.s$a, kotlin.coroutines.c):java.lang.Object");
    }
}
