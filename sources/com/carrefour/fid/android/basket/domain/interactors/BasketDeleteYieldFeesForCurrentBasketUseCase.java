package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37577j;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketDeleteYieldFeesForCurrentBasketUseCase implements C37577j {
    @C12579k

    /* renamed from: a */
    public final C37823k f33853a;
    @C12579k

    /* renamed from: b */
    public final BasketRepository f33854b;
    @C12579k

    /* renamed from: c */
    public final StdCheckBasketPermissionsUseCase f33855c;

    @Inject
    public BasketDeleteYieldFeesForCurrentBasketUseCase(@C12579k C37823k kVar, @C12579k BasketRepository basketRepository, @C12579k StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(stdCheckBasketPermissionsUseCase, "stdCheckBasketPermissionsUseCase");
        this.f33853a = kVar;
        this.f33854b = basketRepository;
        this.f33855c = stdCheckBasketPermissionsUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[SYNTHETIC, Splitter:B:26:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9 A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172755invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x004f
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x004c }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x004c }
            java.lang.Object r8 = r8.mo21858l()     // Catch:{ all -> 0x004c }
            goto L_0x00ac
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x004c }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x004c }
            java.lang.Object r8 = r8.mo21858l()     // Catch:{ all -> 0x004c }
            goto L_0x0085
        L_0x004c:
            r8 = move-exception
            goto L_0x00bc
        L_0x004f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x006e
        L_0x005d:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase r8 = r7.f33855c
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.m172794invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r7
        L_0x006e:
            boolean r6 = kotlin.Result.m38710j(r8)
            if (r6 == 0) goto L_0x00c2
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x004c }
            kotlin.d2 r8 = (kotlin.C11079d2) r8     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.domain.interactors.service.k r8 = r2.f33853a     // Catch:{ all -> 0x004c }
            r0.L$0 = r2     // Catch:{ all -> 0x004c }
            r0.label = r4     // Catch:{ all -> 0x004c }
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)     // Catch:{ all -> 0x004c }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)     // Catch:{ all -> 0x004c }
            if (r4 != 0) goto L_0x00b9
            com.carrefour.fid.android.domain.models.service.models.k r8 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r8     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = r8.mo119354f()     // Catch:{ all -> 0x004c }
            r4 = 0
            if (r8 == 0) goto L_0x009b
            boolean r8 = r8.mo119182Z()     // Catch:{ all -> 0x004c }
            if (r8 != r5) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r5 = r4
        L_0x009c:
            if (r5 == 0) goto L_0x00b6
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r8 = r2.f33854b     // Catch:{ all -> 0x004c }
            r2 = 0
            r0.L$0 = r2     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r8 = r8.mo33389m(r0)     // Catch:{ all -> 0x004c }
            if (r8 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8     // Catch:{ all -> 0x004c }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x004c }
            goto L_0x00c6
        L_0x00b6:
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesEligibilityThrowable r8 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesEligibilityThrowable.f94238a     // Catch:{ all -> 0x004c }
            throw r8     // Catch:{ all -> 0x004c }
        L_0x00b9:
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable r8 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable.f94239a     // Catch:{ all -> 0x004c }
            throw r8     // Catch:{ all -> 0x004c }
        L_0x00bc:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
        L_0x00c2:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00c6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase.m172755invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
