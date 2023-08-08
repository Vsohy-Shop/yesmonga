package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37594p0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketUpdateYieldFeesForCurrentBasketUseCase implements C37594p0 {
    @C12579k

    /* renamed from: a */
    public final C37823k f33902a;
    @C12579k

    /* renamed from: b */
    public final BasketRepository f33903b;
    @C12579k

    /* renamed from: c */
    public final StdCheckBasketPermissionsUseCase f33904c;

    @Inject
    public BasketUpdateYieldFeesForCurrentBasketUseCase(@C12579k C37823k kVar, @C12579k BasketRepository basketRepository, @C12579k StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(stdCheckBasketPermissionsUseCase, "stdCheckBasketPermissionsUseCase");
        this.f33902a = kVar;
        this.f33903b = basketRepository;
        this.f33904c = stdCheckBasketPermissionsUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[SYNTHETIC, Splitter:B:26:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172771invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.slot.Slot r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r5) goto L_0x0053
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0050 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0050 }
            java.lang.Object r8 = r9.mo21858l()     // Catch:{ all -> 0x0050 }
            goto L_0x00c6
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r8 = (com.carrefour.fid.android.domain.models.slot.Slot) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0050 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0050 }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x0050 }
            goto L_0x0091
        L_0x0050:
            r8 = move-exception
            goto L_0x00d6
        L_0x0053:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r8 = (com.carrefour.fid.android.domain.models.slot.Slot) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0078
        L_0x0065:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase r9 = r7.f33904c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172794invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r2 = r7
        L_0x0078:
            boolean r6 = kotlin.Result.m38710j(r9)
            if (r6 == 0) goto L_0x00e1
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0050 }
            kotlin.d2 r9 = (kotlin.C11079d2) r9     // Catch:{ all -> 0x0050 }
            com.carrefour.fid.android.domain.interactors.service.k r9 = r2.f33902a     // Catch:{ all -> 0x0050 }
            r0.L$0 = r2     // Catch:{ all -> 0x0050 }
            r0.L$1 = r8     // Catch:{ all -> 0x0050 }
            r0.label = r4     // Catch:{ all -> 0x0050 }
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)     // Catch:{ all -> 0x0050 }
            if (r9 != r1) goto L_0x0091
            return r1
        L_0x0091:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r9)     // Catch:{ all -> 0x0050 }
            if (r4 != 0) goto L_0x00d3
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9     // Catch:{ all -> 0x0050 }
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()     // Catch:{ all -> 0x0050 }
            r4 = 0
            if (r9 == 0) goto L_0x00a7
            boolean r9 = r9.mo119182Z()     // Catch:{ all -> 0x0050 }
            if (r9 != r5) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r5 = r4
        L_0x00a8:
            if (r5 == 0) goto L_0x00d0
            java.lang.Double r9 = r8.mo119512w()     // Catch:{ all -> 0x0050 }
            if (r9 == 0) goto L_0x00d0
            java.lang.String r9 = r8.mo119511v()     // Catch:{ all -> 0x0050 }
            if (r9 == 0) goto L_0x00d0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = r2.f33903b     // Catch:{ all -> 0x0050 }
            r2 = 0
            r0.L$0 = r2     // Catch:{ all -> 0x0050 }
            r0.L$1 = r2     // Catch:{ all -> 0x0050 }
            r0.label = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r8 = r9.mo33380K(r8, r0)     // Catch:{ all -> 0x0050 }
            if (r8 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0050 }
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8     // Catch:{ all -> 0x0050 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x00e5
        L_0x00d0:
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesEligibilityThrowable r8 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesEligibilityThrowable.f94238a     // Catch:{ all -> 0x0050 }
            throw r8     // Catch:{ all -> 0x0050 }
        L_0x00d3:
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable r8 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable.f94239a     // Catch:{ all -> 0x0050 }
            throw r8     // Catch:{ all -> 0x0050 }
        L_0x00d6:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00e5
        L_0x00e1:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00e5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase.m172771invokegIAlus(com.carrefour.fid.android.domain.models.slot.Slot, kotlin.coroutines.c):java.lang.Object");
    }
}
