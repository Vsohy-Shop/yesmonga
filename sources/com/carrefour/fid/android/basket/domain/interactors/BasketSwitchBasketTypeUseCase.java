package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37541b;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketSwitchBasketTypeUseCase implements C37576i0 {
    @C12579k

    /* renamed from: a */
    public final C37541b f33883a;
    @C12579k

    /* renamed from: b */
    public final C37886i f33884b;
    @C12579k

    /* renamed from: c */
    public final UpdateBasketTypeUseCase f33885c;

    @Inject
    public BasketSwitchBasketTypeUseCase(@C12579k C37541b bVar, @C12579k C37886i iVar, @C12579k UpdateBasketTypeUseCase updateBasketTypeUseCase) {
        Intrinsics.checkNotNullParameter(bVar, "setAdditionalOrderContextUseCase");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        Intrinsics.checkNotNullParameter(updateBasketTypeUseCase, "updateBasketTypeUseCase");
        this.f33883a = bVar;
        this.f33884b = iVar;
        this.f33885c = updateBasketTypeUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[SYNTHETIC, Splitter:B:26:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0 A[Catch:{ all -> 0x004e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172765invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.BasketType r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0062
            if (r2 == r5) goto L_0x0050
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x004e }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x004e }
            r9.mo21858l()     // Catch:{ all -> 0x004e }
            goto L_0x00a1
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.BasketType r8 = (com.carrefour.fid.android.domain.models.basket.BasketType) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x004e }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x004e }
            r9.mo21858l()     // Catch:{ all -> 0x004e }
            goto L_0x0092
        L_0x004e:
            r8 = move-exception
            goto L_0x00a8
        L_0x0050:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.BasketType r8 = (com.carrefour.fid.android.domain.models.basket.BasketType) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0075
        L_0x0062:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.user.i r9 = r7.f33884b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r2 = r7
        L_0x0075:
            boolean r5 = kotlin.Result.m38710j(r9)
            if (r5 == 0) goto L_0x00b3
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x004e }
            kotlin.d2 r9 = (kotlin.C11079d2) r9     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER     // Catch:{ all -> 0x004e }
            if (r8 == r9) goto L_0x0092
            com.carrefour.fid.android.domain.interactors.additionalorder.b r9 = r2.f33883a     // Catch:{ all -> 0x004e }
            r0.L$0 = r2     // Catch:{ all -> 0x004e }
            r0.L$1 = r8     // Catch:{ all -> 0x004e }
            r0.label = r4     // Catch:{ all -> 0x004e }
            java.lang.Object r9 = r9.m172966invokegIAlus(r6, r0)     // Catch:{ all -> 0x004e }
            if (r9 != r1) goto L_0x0092
            return r1
        L_0x0092:
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase r9 = r2.f33885c     // Catch:{ all -> 0x004e }
            r0.L$0 = r6     // Catch:{ all -> 0x004e }
            r0.L$1 = r6     // Catch:{ all -> 0x004e }
            r0.label = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r8 = r9.m172790invokegIAlus(r8, r0)     // Catch:{ all -> 0x004e }
            if (r8 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004e }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x004e }
            goto L_0x00b7
        L_0x00a8:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00b7
        L_0x00b3:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00b7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase.m172765invokegIAlus(com.carrefour.fid.android.domain.models.basket.BasketType, kotlin.coroutines.c):java.lang.Object");
    }
}
