package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$2", mo22502f = "BasketRepository.kt", mo22503i = {1}, mo22504l = {273, 275}, mo22505m = "invokeSuspend", mo22506n = {"baskets"}, mo22507s = {"L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$setDeliveryType$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n223#2,2:387\n*S KotlinDebug\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$setDeliveryType$2\n*L\n276#1:387,2\n*E\n"})
public final class BasketRepository$setDeliveryType$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Basket>>, Object> {
    final /* synthetic */ String $basketReference;
    final /* synthetic */ DeliveryCode $deliveryCode;
    final /* synthetic */ String $providerId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$setDeliveryType$2(BasketRepository basketRepository, DeliveryCode deliveryCode, String str, String str2, C11045c<? super BasketRepository$setDeliveryType$2> cVar) {
        super(1, cVar);
        this.this$0 = basketRepository;
        this.$deliveryCode = deliveryCode;
        this.$basketReference = str;
        this.$providerId = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new BasketRepository$setDeliveryType$2(this.this$0, this.$deliveryCode, this.$basketReference, this.$providerId, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[Catch:{ all -> 0x001a }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r0 = r6.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r6.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x001a }
            goto L_0x0064
        L_0x001a:
            r7 = move-exception
            goto L_0x0090
        L_0x001d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0025:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0047
        L_0x002f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r6.this$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r7 = r7.f34098a
            com.carrefour.fid.android.domain.models.delivery.DeliveryCode r1 = r6.$deliveryCode
            java.lang.String r4 = r6.$basketReference
            java.lang.String r5 = r6.$providerId
            r6.label = r3
            java.lang.Object r7 = r7.mo32792l(r1, r4, r5, r6)
            if (r7 != r0) goto L_0x0047
            return r0
        L_0x0047:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r1 = r6.this$0
            java.lang.String r3 = r6.$basketReference
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x0096
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x001a }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x001a }
            r6.L$0 = r3     // Catch:{ all -> 0x001a }
            r6.L$1 = r7     // Catch:{ all -> 0x001a }
            r6.label = r2     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.mo33377G(r7, r6)     // Catch:{ all -> 0x001a }
            if (r1 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r0 = r7
            r1 = r3
        L_0x0064:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x001a }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x001a }
        L_0x006a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x001a }
            r2 = r0
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2     // Catch:{ all -> 0x001a }
            java.lang.String r2 = r2.mo116822G()     // Catch:{ all -> 0x001a }
            boolean r2 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156097f(r2, r1)     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x006a
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0     // Catch:{ all -> 0x001a }
            java.lang.Object r7 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x001a }
            goto L_0x009a
        L_0x0088:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch:{ all -> 0x001a }
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r7.<init>(r0)     // Catch:{ all -> 0x001a }
            throw r7     // Catch:{ all -> 0x001a }
        L_0x0090:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
        L_0x0096:
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x009a:
            kotlin.Result r7 = kotlin.Result.m38701a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Basket>> cVar) {
        return ((BasketRepository$setDeliveryType$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
