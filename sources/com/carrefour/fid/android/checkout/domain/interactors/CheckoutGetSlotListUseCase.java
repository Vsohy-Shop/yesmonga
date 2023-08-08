package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.checkout.domain.repositories.SlotRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.slot.C37856c;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCheckoutGetSlotListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutGetSlotListUseCase.kt\ncom/carrefour/fid/android/checkout/domain/interactors/CheckoutGetSlotListUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class CheckoutGetSlotListUseCase implements C37856c {
    @C12579k

    /* renamed from: a */
    public final C37566e0 f101658a;
    @C12579k

    /* renamed from: b */
    public final SlotRepository f101659b;

    @Inject
    public CheckoutGetSlotListUseCase(@C12579k C37566e0 e0Var, @C12579k SlotRepository slotRepository) {
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(slotRepository, "repository");
        this.f101658a = e0Var;
        this.f101659b = slotRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[SYNTHETIC, Splitter:B:25:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173111invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.slot.C37863h r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase$invoke$1 r0 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase$invoke$1 r0 = new com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0049 }
            kotlin.Result r10 = (kotlin.Result) r10     // Catch:{ all -> 0x0049 }
            java.lang.Object r9 = r10.mo21858l()     // Catch:{ all -> 0x0049 }
            goto L_0x00d1
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0049 }
            kotlin.Result r10 = (kotlin.Result) r10     // Catch:{ all -> 0x0049 }
            java.lang.Object r9 = r10.mo21858l()     // Catch:{ all -> 0x0049 }
            goto L_0x00b8
        L_0x0049:
            r9 = move-exception
            goto L_0x00db
        L_0x004c:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.interactors.slot.h r9 = (com.carrefour.fid.android.domain.interactors.slot.C37863h) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase r2 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0071
        L_0x005e:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.interactors.basket.e0 r10 = r8.f101658a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r8
        L_0x0071:
            boolean r5 = kotlin.Result.m38710j(r10)
            if (r5 == 0) goto L_0x00e6
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0049 }
            r5 = 0
            if (r10 == 0) goto L_0x0083
            com.carrefour.fid.android.domain.models.basket.BasketType r6 = r10.mo116829N()     // Catch:{ all -> 0x0049 }
            goto L_0x0084
        L_0x0083:
            r6 = r5
        L_0x0084:
            com.carrefour.fid.android.domain.models.basket.BasketType r7 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ all -> 0x0049 }
            if (r6 != r7) goto L_0x00be
            java.util.List r10 = r10.mo116817B()     // Catch:{ all -> 0x0049 }
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ all -> 0x0049 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0049 }
            r3 = 0
        L_0x0093:
            boolean r6 = r10.hasNext()     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x00a5
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6     // Catch:{ all -> 0x0049 }
            int r6 = r6.mo118012U()     // Catch:{ all -> 0x0049 }
            int r3 = r3 + r6
            goto L_0x0093
        L_0x00a5:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository r10 = r2.f101659b     // Catch:{ all -> 0x0049 }
            java.lang.String r9 = r9.mo115316d()     // Catch:{ all -> 0x0049 }
            r0.L$0 = r5     // Catch:{ all -> 0x0049 }
            r0.L$1 = r5     // Catch:{ all -> 0x0049 }
            r0.label = r4     // Catch:{ all -> 0x0049 }
            java.lang.Object r9 = r10.mo131430d(r9, r3, r0)     // Catch:{ all -> 0x0049 }
            if (r9 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r9 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r9     // Catch:{ all -> 0x0049 }
            goto L_0x00d6
        L_0x00be:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository r10 = r2.f101659b     // Catch:{ all -> 0x0049 }
            java.lang.String r9 = r9.mo115316d()     // Catch:{ all -> 0x0049 }
            r0.L$0 = r5     // Catch:{ all -> 0x0049 }
            r0.L$1 = r5     // Catch:{ all -> 0x0049 }
            r0.label = r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r9 = r10.mo131435i(r9, r0)     // Catch:{ all -> 0x0049 }
            if (r9 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0049 }
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r9 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r9     // Catch:{ all -> 0x0049 }
        L_0x00d6:
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0049 }
            goto L_0x00ea
        L_0x00db:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00ea
        L_0x00e6:
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
        L_0x00ea:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase.m173111invokegIAlus(com.carrefour.fid.android.domain.interactors.slot.h, kotlin.coroutines.c):java.lang.Object");
    }
}
