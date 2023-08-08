package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.shared.type.C28879a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class HandleBasketExceptionUseCase implements C37679f<C28879a<? extends Basket, ? extends Throwable>, Basket> {
    @C12579k

    /* renamed from: a */
    public final HandleBasketExpiredFacilityStoreUseCase f33962a;

    @Inject
    public HandleBasketExceptionUseCase(@C12579k HandleBasketExpiredFacilityStoreUseCase handleBasketExpiredFacilityStoreUseCase) {
        Intrinsics.checkNotNullParameter(handleBasketExpiredFacilityStoreUseCase, "handleBasketExpiredFacilityStoreUseCase");
        this.f33962a = handleBasketExpiredFacilityStoreUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172784invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.shared.type.C28879a<com.carrefour.fid.android.domain.models.basket.Basket, ? extends java.lang.Throwable> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase$invoke$1
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
            goto L_0x0064
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            boolean r6 = r5 instanceof com.carrefour.fid.android.shared.type.C28879a.C28881b
            if (r6 == 0) goto L_0x004b
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.type.a$b r5 = (com.carrefour.fid.android.shared.type.C28879a.C28881b) r5
            java.lang.Object r5 = r5.mo84060d()
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x006f
        L_0x004b:
            boolean r6 = r5 instanceof com.carrefour.fid.android.shared.type.C28879a.C28880a
            if (r6 == 0) goto L_0x0070
            com.carrefour.fid.android.shared.type.a$a r5 = (com.carrefour.fid.android.shared.type.C28879a.C28880a) r5
            java.lang.Throwable r5 = r5.mo84054d()
            boolean r6 = r5 instanceof com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable
            if (r6 == 0) goto L_0x0065
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase r5 = r4.f33962a
            r0.label = r3
            java.lang.Object r5 = r5.m172785invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0064
            return r1
        L_0x0064:
            return r5
        L_0x0065:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x006f:
            return r5
        L_0x0070:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase.m172784invokegIAlus(com.carrefour.fid.android.shared.type.a, kotlin.coroutines.c):java.lang.Object");
    }
}
