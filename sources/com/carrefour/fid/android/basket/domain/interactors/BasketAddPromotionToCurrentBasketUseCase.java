package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37560c;
import com.carrefour.fid.android.domain.models.basket.C37971c;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketAddPromotionToCurrentBasketUseCase implements C37560c {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33846a;

    @Inject
    public BasketAddPromotionToCurrentBasketUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33846a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo33265a(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = r4.f33846a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo33381e(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 != 0) goto L_0x0082
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6
            java.util.List r0 = r6.mo116858y()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0064
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
            goto L_0x008c
        L_0x0064:
            java.util.List r6 = r6.mo116858y()
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r6)
            com.carrefour.fid.android.domain.models.basket.BasketErrorMessage r6 = (com.carrefour.fid.android.domain.models.basket.BasketErrorMessage) r6
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.String r6 = r6.mo116909f()
            com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable r0 = new com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable
            r0.<init>(r5, r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x008c
        L_0x0082:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x008c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase.mo33265a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172750invokegIAlus(Object obj, C11045c cVar) {
        return mo33265a(((C37971c) obj).mo117031h(), cVar);
    }
}
