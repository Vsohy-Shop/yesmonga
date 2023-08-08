package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AdditionalOrderUpdateBasketContentUseCase implements C37588n0 {
    @C12579k

    /* renamed from: a */
    public final CheckAdditionalOrderPermissionUseCase f33917a;
    @C12579k

    /* renamed from: b */
    public final BasketRepository f33918b;
    @C12579k

    /* renamed from: c */
    public final RemoveOfferFromBasketUseCase f33919c;

    @Inject
    public AdditionalOrderUpdateBasketContentUseCase(@C12579k CheckAdditionalOrderPermissionUseCase checkAdditionalOrderPermissionUseCase, @C12579k BasketRepository basketRepository, @C12579k RemoveOfferFromBasketUseCase removeOfferFromBasketUseCase) {
        Intrinsics.checkNotNullParameter(checkAdditionalOrderPermissionUseCase, "checkAdditionalOrderPermissionUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(removeOfferFromBasketUseCase, "removeOfferFromBasketUseCase");
        this.f33917a = checkAdditionalOrderPermissionUseCase;
        this.f33918b = basketRepository;
        this.f33919c = removeOfferFromBasketUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[SYNTHETIC, Splitter:B:25:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172776invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            r8 = r0
            java.lang.Object r11 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 == r4) goto L_0x004c
            if (r1 == r3) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            kotlin.C11661u0.m45747n(r11)     // Catch:{ all -> 0x0049 }
            kotlin.Result r11 = (kotlin.Result) r11     // Catch:{ all -> 0x0049 }
            java.lang.Object r10 = r11.mo21858l()     // Catch:{ all -> 0x0049 }
            goto L_0x00c4
        L_0x0037:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003f:
            kotlin.C11661u0.m45747n(r11)     // Catch:{ all -> 0x0049 }
            kotlin.Result r11 = (kotlin.Result) r11     // Catch:{ all -> 0x0049 }
            java.lang.Object r10 = r11.mo21858l()     // Catch:{ all -> 0x0049 }
            goto L_0x00af
        L_0x0049:
            r10 = move-exception
            goto L_0x00ce
        L_0x004c:
            java.lang.Object r10 = r8.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r10 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r10
            java.lang.Object r1 = r8.L$0
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase r1 = (com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase) r1
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0071
        L_0x005e:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase r11 = r9.f33917a
            r8.L$0 = r9
            r8.L$1 = r10
            r8.label = r4
            java.lang.Object r11 = r11.m172777invokeIoAF18A(r8)
            if (r11 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r1 = r9
        L_0x0071:
            boolean r4 = kotlin.Result.m38710j(r11)
            if (r4 == 0) goto L_0x00d9
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.additionalorder.a r11 = (com.carrefour.fid.android.domain.models.additionalorder.C37952a) r11     // Catch:{ all -> 0x0049 }
            int r4 = r10.mo114415g()     // Catch:{ all -> 0x0049 }
            r5 = 0
            if (r4 <= 0) goto L_0x00b5
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r1 = r1.f33918b     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r11.mo116800g()     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r4 = r10.mo114414f()     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.mo118136f()     // Catch:{ all -> 0x0049 }
            int r6 = r10.mo114415g()     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = r11.mo116804j()     // Catch:{ all -> 0x0049 }
            boolean r10 = r10.mo114416h()     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.basket.BasketType r7 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER     // Catch:{ all -> 0x0049 }
            r8.L$0 = r5     // Catch:{ all -> 0x0049 }
            r8.L$1 = r5     // Catch:{ all -> 0x0049 }
            r8.label = r3     // Catch:{ all -> 0x0049 }
            r3 = r4
            r4 = r6
            r5 = r11
            r6 = r10
            java.lang.Object r10 = r1.mo33378H(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0049 }
            if (r10 != r0) goto L_0x00af
            return r0
        L_0x00af:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0049 }
            goto L_0x00c9
        L_0x00b5:
            com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase r11 = r1.f33919c     // Catch:{ all -> 0x0049 }
            r8.L$0 = r5     // Catch:{ all -> 0x0049 }
            r8.L$1 = r5     // Catch:{ all -> 0x0049 }
            r8.label = r2     // Catch:{ all -> 0x0049 }
            java.lang.Object r10 = r11.m172788invokegIAlus(r10, r8)     // Catch:{ all -> 0x0049 }
            if (r10 != r0) goto L_0x00c4
            return r0
        L_0x00c4:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0049 }
        L_0x00c9:
            java.lang.Object r10 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0049 }
            goto L_0x00dd
        L_0x00ce:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x00dd
        L_0x00d9:
            java.lang.Object r10 = kotlin.Result.m38702b(r11)
        L_0x00dd:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase.m172776invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.n0$a, kotlin.coroutines.c):java.lang.Object");
    }
}
