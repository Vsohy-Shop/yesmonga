package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37586m0;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketUnBookSlotForCurrentBasketUseCase implements C37586m0 {
    @C12579k

    /* renamed from: a */
    public final StdCheckBasketPermissionsUseCase f33891a;
    @C12579k

    /* renamed from: b */
    public final BasketRepository f33892b;

    @Inject
    public BasketUnBookSlotForCurrentBasketUseCase(@C12579k StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, @C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(stdCheckBasketPermissionsUseCase, "stdCheckBasketPermissionsUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33891a = stdCheckBasketPermissionsUseCase;
        this.f33892b = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[SYNTHETIC, Splitter:B:22:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo33287a(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            kotlin.Result r7 = (kotlin.Result) r7     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r7.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x007b
        L_0x0032:
            r6 = move-exception
            goto L_0x0085
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0061
        L_0x004e:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase r7 = r5.f33891a
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m172794invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r5
        L_0x0061:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x0090
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            kotlin.d2 r7 = (kotlin.C11079d2) r7     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r2.f33892b     // Catch:{ all -> 0x0032 }
            r2 = 0
            r0.L$0 = r2     // Catch:{ all -> 0x0032 }
            r0.L$1 = r2     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r7.mo33376F(r6, r0)     // Catch:{ all -> 0x0032 }
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0094
        L_0x0085:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0094
        L_0x0090:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x0094:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase.mo33287a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172768invokegIAlus(Object obj, C11045c cVar) {
        return mo33287a(((SlotId) obj).mo119541j(), cVar);
    }
}
