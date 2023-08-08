package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class InitializeBasketUseCase implements C37678e<Basket> {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33967a;
    @C12579k

    /* renamed from: b */
    public final C37823k f33968b;
    @C12579k

    /* renamed from: c */
    public final HandleBasketExceptionUseCase f33969c;

    @Inject
    public InitializeBasketUseCase(@C12579k BasketRepository basketRepository, @C12579k C37823k kVar, @C12579k HandleBasketExceptionUseCase handleBasketExceptionUseCase) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(handleBasketExceptionUseCase, "handleBasketExceptionUseCase");
        this.f33967a = basketRepository;
        this.f33968b = kVar;
        this.f33969c = handleBasketExceptionUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172786invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x00a6
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0095
        L_0x004d:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x006c
        L_0x005b:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.service.k r8 = r7.f33968b
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r7
        L_0x006c:
            boolean r6 = kotlin.Result.m38709i(r8)
            if (r6 == 0) goto L_0x0073
            r8 = r3
        L_0x0073:
            com.carrefour.fid.android.domain.models.service.models.k r8 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r8
            if (r8 == 0) goto L_0x00a7
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = r8.mo119354f()
            if (r8 == 0) goto L_0x00a7
            java.lang.String r8 = r8.mo119163G()
            if (r8 != 0) goto L_0x0084
            goto L_0x00a7
        L_0x0084:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = r2.f33967a
            java.lang.String r8 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r8)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r8 = r6.mo33400x(r8, r0)
            if (r8 != r1) goto L_0x0095
            return r1
        L_0x0095:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase r2 = r2.f33969c
            com.carrefour.fid.android.shared.type.a r8 = com.carrefour.fid.android.shared.type.C28882b.m119445a(r8)
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r8 = r2.m172784invokegIAlus(r8, r0)
            if (r8 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            return r8
        L_0x00a7:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r8 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase.m172786invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
