package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37564e;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketBookSlotForCurrentBasketUseCase implements C37564e {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33847a;

    @Inject
    public BasketBookSlotForCurrentBasketUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33847a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172751invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37564e.C37565a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x00b8
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.e$a r7 = (com.carrefour.fid.android.domain.interactors.basket.C37564e.C37565a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x008e
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r8 = r6.f33847a
            kotlinx.coroutines.flow.u r8 = r8.mo33391o()
            java.lang.Object r8 = r8.getValue()
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            if (r8 != 0) goto L_0x006c
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r7 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x006c:
            java.lang.String r8 = r8.mo116859z()
            java.lang.String r2 = r7.mo114375e()
            boolean r8 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r8, r2)
            if (r8 != 0) goto L_0x00a4
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r8 = r6.f33847a
            java.lang.String r2 = r7.mo114375e()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo33374D(r2, r0)
            if (r8 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r2 = r6
        L_0x008e:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x00a5
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketFacilitySwitchThrowable r7 = new com.carrefour.fid.android.domain.exceptions.BasketFacilitySwitchThrowable
            r7.<init>(r8)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x00a4:
            r2 = r6
        L_0x00a5:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r8 = r2.f33847a
            java.lang.String r7 = r7.mo114377f()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r8.mo33383g(r7, r0)
            if (r7 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            boolean r8 = kotlin.Result.m38709i(r7)
            if (r8 == 0) goto L_0x0125
            java.lang.Throwable r8 = kotlin.Result.m38705e(r7)
            if (r8 == 0) goto L_0x00c9
            java.lang.Throwable r8 = r8.getCause()
            goto L_0x00ca
        L_0x00c9:
            r8 = r5
        L_0x00ca:
            boolean r0 = r8 instanceof com.carrefour.fid.android.shared.p046io.BasketSlotBookThrowable
            if (r0 == 0) goto L_0x010f
            java.lang.Integer[] r0 = new java.lang.Integer[r3]
            r1 = 400(0x190, float:5.6E-43)
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r1)
            r2 = 0
            r0[r2] = r1
            r1 = 404(0x194, float:5.66E-43)
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r1)
            r0[r4] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r8 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r1 == 0) goto L_0x00ee
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r8
            goto L_0x00ef
        L_0x00ee:
            r8 = r5
        L_0x00ef:
            if (r8 == 0) goto L_0x00f9
            int r8 = r8.mo83810a()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r8)
        L_0x00f9:
            boolean r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40558R1(r0, r5)
            if (r8 == 0) goto L_0x010f
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.BasketSlotBookBadRequestThrowable r7 = new com.carrefour.fid.android.shared.io.BasketSlotBookBadRequestThrowable
            r7.<init>()
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x010f:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 != 0) goto L_0x011c
            java.lang.Throwable r7 = new java.lang.Throwable
            r7.<init>()
        L_0x011c:
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x0125:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            kotlin.C11661u0.m45747n(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase.m172751invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.e$a, kotlin.coroutines.c):java.lang.Object");
    }
}
