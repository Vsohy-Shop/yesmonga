package com.carrefour.fid.android.basket.domain.interactors.home;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37554a;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketAddOneMoreItemHomeDeliveryNalBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketAddOneMoreItemHomeDeliveryNalBasket.kt\ncom/carrefour/fid/android/basket/domain/interactors/home/BasketAddOneMoreItemHomeDeliveryNalBasket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1#2:35\n288#3,2:36\n*S KotlinDebug\n*F\n+ 1 BasketAddOneMoreItemHomeDeliveryNalBasket.kt\ncom/carrefour/fid/android/basket/domain/interactors/home/BasketAddOneMoreItemHomeDeliveryNalBasket\n*L\n22#1:36,2\n*E\n"})
public final class BasketAddOneMoreItemHomeDeliveryNalBasket implements C37554a {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33946a;
    @C12579k

    /* renamed from: b */
    public final C37886i f33947b;

    @Inject
    public BasketAddOneMoreItemHomeDeliveryNalBasket(@C12579k BasketRepository basketRepository, @C12579k C37886i iVar) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        this.f33946a = basketRepository;
        this.f33947b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172779invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37554a.C37555a r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket$invoke$1
            r0.<init>(r11, r13)
        L_0x0018:
            r7 = r0
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x004e
            if (r1 == r3) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r12 = r13.mo21858l()
            goto L_0x010f
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            java.lang.Object r12 = r7.L$1
            com.carrefour.fid.android.domain.interactors.basket.a$a r12 = (com.carrefour.fid.android.domain.interactors.basket.C37554a.C37555a) r12
            java.lang.Object r1 = r7.L$0
            com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket r1 = (com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket) r1
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0061
        L_0x004e:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.domain.interactors.user.i r13 = r11.f33947b
            r7.L$0 = r11
            r7.L$1 = r12
            r7.label = r3
            java.lang.Object r13 = r13.m172965invokeIoAF18A(r7)
            if (r13 != r0) goto L_0x0060
            return r0
        L_0x0060:
            r1 = r11
        L_0x0061:
            java.lang.Throwable r13 = kotlin.Result.m38705e(r13)
            if (r13 == 0) goto L_0x0072
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        L_0x0072:
            java.lang.String r5 = r12.mo114349f()
            java.lang.String r4 = r12.mo114347e()
            if (r4 != 0) goto L_0x008e
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r13 = "facilityServiceId not provided"
            r12.<init>(r13)
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        L_0x008e:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r12 = r1.f33946a
            kotlinx.coroutines.flow.u r12 = r12.mo33392p()
            java.lang.Object r12 = r12.getValue()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x009e:
            boolean r13 = r12.hasNext()
            r6 = 0
            r8 = 0
            if (r13 == 0) goto L_0x00bb
            java.lang.Object r13 = r12.next()
            r9 = r13
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = r9.mo116829N()
            com.carrefour.fid.android.domain.models.basket.BasketType r10 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL
            if (r9 != r10) goto L_0x00b7
            r9 = r3
            goto L_0x00b8
        L_0x00b7:
            r9 = r6
        L_0x00b8:
            if (r9 == 0) goto L_0x009e
            goto L_0x00bc
        L_0x00bb:
            r13 = r8
        L_0x00bc:
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
            if (r13 == 0) goto L_0x00ec
            java.util.List r12 = r13.mo116817B()
            if (r12 == 0) goto L_0x00ec
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00cc:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x00e8
            java.lang.Object r9 = r12.next()
            r10 = r9
            com.carrefour.fid.android.domain.models.offer.Offer r10 = (com.carrefour.fid.android.domain.models.offer.Offer) r10
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r10 = r10.mo118001J()
            java.lang.String r10 = r10.mo118136f()
            boolean r10 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r10, r5)
            if (r10 == 0) goto L_0x00cc
            goto L_0x00e9
        L_0x00e8:
            r9 = r8
        L_0x00e9:
            com.carrefour.fid.android.domain.models.offer.Offer r9 = (com.carrefour.fid.android.domain.models.offer.Offer) r9
            goto L_0x00ed
        L_0x00ec:
            r9 = r8
        L_0x00ed:
            if (r9 == 0) goto L_0x00f3
            int r6 = r9.mo118012U()
        L_0x00f3:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r1 = r1.f33946a
            if (r13 == 0) goto L_0x00fc
            java.lang.String r12 = r13.mo116822G()
            goto L_0x00fd
        L_0x00fc:
            r12 = r8
        L_0x00fd:
            com.carrefour.fid.android.domain.models.basket.BasketType r13 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL
            int r6 = r6 + r3
            r7.L$0 = r8
            r7.L$1 = r8
            r7.label = r2
            r2 = r12
            r3 = r13
            java.lang.Object r12 = r1.mo33379J(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L_0x010f
            return r0
        L_0x010f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket.m172779invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.a$a, kotlin.coroutines.c):java.lang.Object");
    }
}
