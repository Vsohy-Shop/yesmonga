package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37557b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketAddPromoCodeUseCase implements C37557b {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33845a;

    @Inject
    public BasketAddPromoCodeUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33845a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172749invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37557b.C37558a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.interactors.basket.b$a r6 = (com.carrefour.fid.android.domain.interactors.basket.C37557b.C37558a) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0057
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r5.f33845a
            java.lang.String r2 = r6.mo114355e()
            java.lang.String r2 = com.carrefour.fid.android.domain.models.basket.C37971c.m156163b(r2)
            java.lang.String r4 = r6.mo114357f()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.mo33382f(r2, r4, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r7)
            if (r0 != 0) goto L_0x0092
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            java.util.List r0 = r7.mo116858y()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0070
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
            goto L_0x009c
        L_0x0070:
            java.util.List r7 = r7.mo116858y()
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r7)
            com.carrefour.fid.android.domain.models.basket.BasketErrorMessage r7 = (com.carrefour.fid.android.domain.models.basket.BasketErrorMessage) r7
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.String r7 = r7.mo116909f()
            java.lang.String r6 = r6.mo114355e()
            com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable r0 = new com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable
            r0.<init>(r6, r7)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x009c
        L_0x0092:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x009c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase.m172749invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.b$a, kotlin.coroutines.c):java.lang.Object");
    }
}
