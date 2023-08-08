package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37595q;
import com.carrefour.fid.android.domain.models.product.Gtin;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketGetOfferCountInBasketUseCase implements C37595q {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33859a;

    @Inject
    public BasketGetOfferCountInBasketUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33859a = basketRepository;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ all -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ all -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[EDGE_INSN: B:40:0x0095->B:32:0x0095 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo33271a(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Integer>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0060
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r5.f33859a
            kotlinx.coroutines.flow.u r7 = r7.mo33391o()
            java.lang.Object r7 = r7.getValue()
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            if (r7 != 0) goto L_0x0069
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r5.f33859a
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.mo33390n(r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            boolean r0 = kotlin.Result.m38709i(r7)
            if (r0 == 0) goto L_0x0067
            r7 = r3
        L_0x0067:
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
        L_0x0069:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x009e
            java.util.List r7 = r7.mo116817B()     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x009e
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x00a8 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x0079:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00a8 }
            r1 = r0
            com.carrefour.fid.android.domain.models.offer.Offer r1 = (com.carrefour.fid.android.domain.models.offer.Offer) r1     // Catch:{ all -> 0x00a8 }
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r1 = r1.mo118001J()     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r1.mo118136f()     // Catch:{ all -> 0x00a8 }
            boolean r1 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r1, r6)     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0079
            r3 = r0
        L_0x0095:
            com.carrefour.fid.android.domain.models.offer.Offer r3 = (com.carrefour.fid.android.domain.models.offer.Offer) r3     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x009e
            int r6 = r3.mo118012U()     // Catch:{ all -> 0x00a8 }
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x00b3
        L_0x00a8:
            r6 = move-exception
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00b3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase.mo33271a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172757invokegIAlus(Object obj, C11045c cVar) {
        return mo33271a(((Gtin) obj).mo118380i(), cVar);
    }
}
