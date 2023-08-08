package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nStdUpdateBasketContentUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StdUpdateBasketContentUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/standard/StdUpdateBasketContentUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class StdUpdateBasketContentUseCase implements C37588n0 {
    @C12579k

    /* renamed from: a */
    public final StdCheckBasketPermissionsUseCase f34059a;
    @C12579k

    /* renamed from: b */
    public final RemoveOfferFromBasketUseCase f34060b;
    @C12579k

    /* renamed from: c */
    public final UpdateBasketOfferQuantityUseCase f34061c;

    @Inject
    public StdUpdateBasketContentUseCase(@C12579k StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, @C12579k RemoveOfferFromBasketUseCase removeOfferFromBasketUseCase, @C12579k UpdateBasketOfferQuantityUseCase updateBasketOfferQuantityUseCase) {
        Intrinsics.checkNotNullParameter(stdCheckBasketPermissionsUseCase, "stdCheckBasketPermissionsUseCase");
        Intrinsics.checkNotNullParameter(removeOfferFromBasketUseCase, "removeOfferFromBasketUseCase");
        Intrinsics.checkNotNullParameter(updateBasketOfferQuantityUseCase, "updateBasketOfferQuantityUseCase");
        this.f34059a = stdCheckBasketPermissionsUseCase;
        this.f34060b = removeOfferFromBasketUseCase;
        this.f34061c = updateBasketOfferQuantityUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172797invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x00a3
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x0093
        L_0x0047:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r7 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x006c
        L_0x0059:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase r8 = r6.f34059a
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r8.m172794invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r6
        L_0x006c:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x007d
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x007d:
            int r8 = r7.mo114415g()
            r5 = 0
            if (r8 <= 0) goto L_0x0094
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r8 = r2.f34061c
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r8.m172789invokegIAlus(r7, r0)
            if (r7 != r1) goto L_0x0093
            return r1
        L_0x0093:
            return r7
        L_0x0094:
            com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase r8 = r2.f34060b
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r8.m172788invokegIAlus(r7, r0)
            if (r7 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase.m172797invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.n0$a, kotlin.coroutines.c):java.lang.Object");
    }
}
