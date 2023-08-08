package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketDetailsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketDetailsUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketDetailsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n288#2,2:34\n*S KotlinDebug\n*F\n+ 1 BasketDetailsUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketDetailsUseCase\n*L\n22#1:34,2\n*E\n"})
public final class BasketDetailsUseCase implements C37581k0 {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33856a;

    @Inject
    public BasketDetailsUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33856a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172756invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37581k0.C37582a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.interactors.basket.k0$a r5 = (com.carrefour.fid.android.domain.interactors.basket.C37581k0.C37582a) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0053
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = r4.f33856a
            java.lang.String r2 = r5.mo114405d()
            java.util.List r2 = kotlin.collections.C10976s.m41419k(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo33395s(r2, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 != 0) goto L_0x00a9
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x006e
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r5 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x00a8
        L_0x006e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0074:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.String r1 = r1.mo116822G()
            java.lang.String r2 = r5.mo114405d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0074
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
            if (r0 == 0) goto L_0x009c
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r0)
            goto L_0x00a8
        L_0x009c:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r5 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x00a8:
            return r5
        L_0x00a9:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase.m172756invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.k0$a, kotlin.coroutines.c):java.lang.Object");
    }
}
