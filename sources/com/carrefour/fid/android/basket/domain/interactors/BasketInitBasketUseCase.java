package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37599t;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketInitBasketUseCase implements C37599t {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33860a;
    @C12579k

    /* renamed from: b */
    public final HandleBasketExceptionUseCase f33861b;

    @Inject
    public BasketInitBasketUseCase(@C12579k BasketRepository basketRepository, @C12579k HandleBasketExceptionUseCase handleBasketExceptionUseCase) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(handleBasketExceptionUseCase, "handleBasketExceptionUseCase");
        this.f33860a = basketRepository;
        this.f33861b = handleBasketExceptionUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo33272a(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x006b
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase r6 = (com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0059
        L_0x0048:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r5.f33860a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.mo33400x(r6, r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r6 = r5
        L_0x0059:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase r6 = r6.f33861b
            com.carrefour.fid.android.shared.type.a r7 = com.carrefour.fid.android.shared.type.C28882b.m119445a(r7)
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.m172784invokegIAlus(r7, r0)
            if (r6 != r1) goto L_0x006b
            return r1
        L_0x006b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase.mo33272a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172758invokegIAlus(Object obj, C11045c cVar) {
        return mo33272a(((FacilityServiceId) obj).mo119111j(), cVar);
    }
}
