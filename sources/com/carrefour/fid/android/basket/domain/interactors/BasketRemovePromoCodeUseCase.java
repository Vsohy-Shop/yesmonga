package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketRemovePromoCodeUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRemovePromoCodeUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketRemovePromoCodeUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
public final class BasketRemovePromoCodeUseCase implements C37561c0 {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33876a;

    @Inject
    public BasketRemovePromoCodeUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33876a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172761invokegIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = r4.f33876a
            r0.label = r3
            java.lang.Object r5 = r6.mo33402z(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r5)
            if (r6 != 0) goto L_0x0052
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x0058
        L_0x0052:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)
        L_0x0058:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase.m172761invokegIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
