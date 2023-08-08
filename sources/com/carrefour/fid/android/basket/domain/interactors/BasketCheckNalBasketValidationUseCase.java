package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37567f;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketCheckNalBasketValidationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketCheckNalBasketValidationUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketCheckNalBasketValidationUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1#2:41\n1747#3,3:42\n*S KotlinDebug\n*F\n+ 1 BasketCheckNalBasketValidationUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketCheckNalBasketValidationUseCase\n*L\n24#1:42,3\n*E\n"})
public final class BasketCheckNalBasketValidationUseCase implements C37567f {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33848a;

    @Inject
    public BasketCheckNalBasketValidationUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33848a = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172752invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37567f.C37568a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.interactors.basket.f$a r5 = (com.carrefour.fid.android.domain.interactors.basket.C37567f.C37568a) r5
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
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = r4.f33848a
            java.lang.String r2 = r5.mo114382d()
            java.util.List r2 = kotlin.collections.C10976s.m41419k(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo33395s(r2, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 != 0) goto L_0x011e
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0061:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.String r1 = r1.mo116822G()
            java.lang.String r2 = r5.mo114382d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0061
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
            if (r0 != 0) goto L_0x0096
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoBasketThrowable r6 = new com.carrefour.fid.android.shared.io.NoBasketThrowable
            java.lang.String r5 = r5.mo114382d()
            r6.<init>(r5)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0096:
            java.util.List r5 = r0.mo116817B()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            r1 = 0
            if (r6 == 0) goto L_0x00ac
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00ac
        L_0x00aa:
            r3 = r1
            goto L_0x00c2
        L_0x00ac:
            java.util.Iterator r5 = r5.iterator()
        L_0x00b0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00aa
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            boolean r6 = r6.mo118015X()
            if (r6 == 0) goto L_0x00b0
        L_0x00c2:
            if (r3 == 0) goto L_0x00d4
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.BasketContainsDigitalCardThrowable r5 = new com.carrefour.fid.android.shared.io.BasketContainsDigitalCardThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0128
        L_0x00d4:
            java.util.List r5 = r0.mo116858y()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00e7
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x00e7:
            java.util.List r5 = r0.mo116858y()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r5)
            com.carrefour.fid.android.domain.models.basket.BasketErrorMessage r5 = (com.carrefour.fid.android.domain.models.basket.BasketErrorMessage) r5
            java.lang.String r5 = r5.mo116911h()
            java.lang.String r6 = "FAILURE_CASE_CHECK_TOTAL_AMOUNT"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0115
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.BasketCheckTotalAmountThrowable r5 = new com.carrefour.fid.android.shared.io.BasketCheckTotalAmountThrowable
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r6 = r0.mo116855w()
            double r0 = r6.mo116898z()
            r5.<init>(r0)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x011d
        L_0x0115:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x011d:
            return r5
        L_0x011e:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0128:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase.m172752invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.f$a, kotlin.coroutines.c):java.lang.Object");
    }
}
