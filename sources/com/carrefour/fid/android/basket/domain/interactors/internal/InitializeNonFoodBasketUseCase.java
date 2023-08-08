package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class InitializeNonFoodBasketUseCase implements C37678e<Basket> {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33970a;
    @C12579k

    /* renamed from: b */
    public final HandleBasketExceptionUseCase f33971b;

    @Inject
    public InitializeNonFoodBasketUseCase(@C12579k BasketRepository basketRepository, @C12579k HandleBasketExceptionUseCase handleBasketExceptionUseCase) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(handleBasketExceptionUseCase, "handleBasketExceptionUseCase");
        this.f33970a = basketRepository;
        this.f33971b = handleBasketExceptionUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172787invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0071
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005f
        L_0x0048:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = r5.f33970a
            java.lang.String r2 = "0261-150-6"
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r2)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo33400x(r2, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r5
        L_0x005f:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase r2 = r2.f33971b
            com.carrefour.fid.android.shared.type.a r6 = com.carrefour.fid.android.shared.type.C28882b.m119445a(r6)
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.m172784invokegIAlus(r6, r0)
            if (r6 != r1) goto L_0x0071
            return r1
        L_0x0071:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase.m172787invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
