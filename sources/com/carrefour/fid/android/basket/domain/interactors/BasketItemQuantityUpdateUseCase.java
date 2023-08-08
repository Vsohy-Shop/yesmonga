package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.product.C37803u;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketItemQuantityUpdateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketItemQuantityUpdateUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketItemQuantityUpdateUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class BasketItemQuantityUpdateUseCase implements C37803u {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33863a;

    @Inject
    public BasketItemQuantityUpdateUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33863a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172760invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.C37803u.C37804a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x00bc
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r10 = r8.f33863a
            kotlinx.coroutines.flow.u r10 = r10.mo33392p()
            java.lang.Object r10 = r10.getValue()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x004c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r10.next()
            r3 = r1
            com.carrefour.fid.android.domain.models.basket.Basket r3 = (com.carrefour.fid.android.domain.models.basket.Basket) r3
            java.lang.String r3 = r3.mo116822G()
            java.lang.String r4 = r9.mo115189f()
            boolean r3 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156097f(r3, r4)
            if (r3 == 0) goto L_0x004c
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            if (r1 != 0) goto L_0x0081
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoBasketThrowable r10 = new com.carrefour.fid.android.shared.io.NoBasketThrowable
            java.lang.String r9 = r9.mo115189f()
            r10.<init>(r9)
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x0081:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r10 = r8.f33863a
            java.lang.String r3 = r9.mo115189f()
            com.carrefour.fid.android.domain.models.basket.BasketType r4 = r1.mo116829N()
            if (r4 != 0) goto L_0x00a1
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoBasketTypeThrowable r10 = new com.carrefour.fid.android.shared.io.NoBasketTypeThrowable
            java.lang.String r9 = r9.mo115189f()
            r10.<init>(r9)
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x00a1:
            java.lang.String r5 = r1.mo116859z()
            java.lang.String r6 = r9.mo115190g()
            int r9 = r9.mo115191h()
            r7.label = r2
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r9 = r1.mo33379J(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            boolean r10 = kotlin.Result.m38710j(r9)
            if (r10 == 0) goto L_0x00cb
            kotlin.Result$a r9 = kotlin.Result.f28060a
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00dc
        L_0x00cb:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x00dc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase.m172760invokegIAlus(com.carrefour.fid.android.domain.interactors.product.u$a, kotlin.coroutines.c):java.lang.Object");
    }
}
