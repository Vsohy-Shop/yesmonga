package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nStdSynchronizeCurrentBasketUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StdSynchronizeCurrentBasketUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/standard/StdSynchronizeCurrentBasketUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class StdSynchronizeCurrentBasketUseCase implements C37584l0 {
    @C12579k

    /* renamed from: a */
    public final StdCheckBasketPermissionsUseCase f34056a;
    @C12579k

    /* renamed from: b */
    public final HandleBasketExceptionUseCase f34057b;
    @C12579k

    /* renamed from: c */
    public final BasketRepository f34058c;

    @Inject
    public StdSynchronizeCurrentBasketUseCase(@C12579k StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, @C12579k HandleBasketExceptionUseCase handleBasketExceptionUseCase, @C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(stdCheckBasketPermissionsUseCase, "stdCheckBasketPermissionsUseCase");
        Intrinsics.checkNotNullParameter(handleBasketExceptionUseCase, "handleBasketExceptionUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f34056a = stdCheckBasketPermissionsUseCase;
        this.f34057b = handleBasketExceptionUseCase;
        this.f34058c = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172796invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x009a
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0088
        L_0x004b:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x006a
        L_0x0059:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase r7 = r6.f34056a
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.m172794invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x007b
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x007b:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r2.f34058c
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo33375E(r0)
            if (r7 != r1) goto L_0x0088
            return r1
        L_0x0088:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase r2 = r2.f34057b
            com.carrefour.fid.android.shared.type.a r7 = com.carrefour.fid.android.shared.type.C28882b.m119445a(r7)
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r2.m172784invokegIAlus(r7, r0)
            if (r7 != r1) goto L_0x009a
            return r1
        L_0x009a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase.m172796invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
