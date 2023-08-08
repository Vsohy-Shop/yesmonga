package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class RemoveOfferFromBasketUseCase implements C37679f<C37588n0.C37589a, Basket> {
    @C12579k

    /* renamed from: a */
    public final FetchBasketUseCase f33972a;
    @C12579k

    /* renamed from: b */
    public final HandleBasketExceptionUseCase f33973b;
    @C12579k

    /* renamed from: c */
    public final BasketRepository f33974c;

    @Inject
    public RemoveOfferFromBasketUseCase(@C12579k FetchBasketUseCase fetchBasketUseCase, @C12579k HandleBasketExceptionUseCase handleBasketExceptionUseCase, @C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(fetchBasketUseCase, "fetchBasketUseCase");
        Intrinsics.checkNotNullParameter(handleBasketExceptionUseCase, "handleBasketExceptionUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33972a = fetchBasketUseCase;
        this.f33973b = handleBasketExceptionUseCase;
        this.f33974c = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172788invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x002b
            if (r2 != r3) goto L_0x0035
        L_0x002b:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x0092
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase r7 = (com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0068
        L_0x004b:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r8 = r6.f33974c
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = r7.mo114414f()
            java.lang.String r2 = r2.mo118136f()
            boolean r7 = r7.mo114416h()
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r8 = r8.mo33387k(r2, r7, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r7 = r6
        L_0x0068:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r8)
            if (r2 == 0) goto L_0x0093
            boolean r8 = r2 instanceof com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable
            r5 = 0
            if (r8 == 0) goto L_0x0080
            com.carrefour.fid.android.basket.domain.interactors.internal.FetchBasketUseCase r7 = r7.f33972a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.m172783invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0092
            return r1
        L_0x0080:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase r7 = r7.f33973b
            com.carrefour.fid.android.shared.type.a$a r8 = new com.carrefour.fid.android.shared.type.a$a
            r8.<init>(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.m172784invokegIAlus(r8, r0)
            if (r7 != r1) goto L_0x0092
            return r1
        L_0x0092:
            return r7
        L_0x0093:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase.m172788invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.n0$a, kotlin.coroutines.c):java.lang.Object");
    }
}
