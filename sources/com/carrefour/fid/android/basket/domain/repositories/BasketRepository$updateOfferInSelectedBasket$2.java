package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketType;
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

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$2", mo22502f = "BasketRepository.kt", mo22503i = {2}, mo22504l = {321, 323, 335}, mo22505m = "invokeSuspend", mo22506n = {"baskets"}, mo22507s = {"L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$updateOfferInSelectedBasket$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n288#2,2:387\n*S KotlinDebug\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$updateOfferInSelectedBasket$2\n*L\n337#1:387,2\n*E\n"})
public final class BasketRepository$updateOfferInSelectedBasket$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Basket>>, Object> {
    final /* synthetic */ String $basketReference;
    final /* synthetic */ BasketType $basketType;
    final /* synthetic */ String $facilityId;
    final /* synthetic */ String $gtin;
    final /* synthetic */ int $quantity;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$updateOfferInSelectedBasket$2(BasketRepository basketRepository, String str, BasketType basketType, String str2, String str3, int i, C11045c<? super BasketRepository$updateOfferInSelectedBasket$2> cVar) {
        super(1, cVar);
        this.this$0 = basketRepository;
        this.$basketReference = str;
        this.$basketType = basketType;
        this.$facilityId = str2;
        this.$gtin = str3;
        this.$quantity = i;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new BasketRepository$updateOfferInSelectedBasket$2(this.this$0, this.$basketReference, this.$basketType, this.$facilityId, this.$gtin, this.$quantity, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r17
            java.lang.Object r12 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r11.label
            r13 = 0
            r14 = 3
            r1 = 2
            r15 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0047
            if (r0 == r15) goto L_0x003b
            if (r0 == r1) goto L_0x002c
            if (r0 != r14) goto L_0x0024
            java.lang.Object r0 = r11.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r11.L$0
            com.carrefour.fid.android.domain.models.basket.BasketType r1 = (com.carrefour.fid.android.domain.models.basket.BasketType) r1
            kotlin.C11661u0.m45747n(r18)
            r16 = r10
            goto L_0x00be
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            kotlin.C11661u0.m45747n(r18)
            r0 = r18
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r16 = r10
            goto L_0x00a4
        L_0x003b:
            kotlin.C11661u0.m45747n(r18)
            r0 = r18
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x005e
        L_0x0047:
            kotlin.C11661u0.m45747n(r18)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r0 = r11.this$0
            com.carrefour.fid.android.domain.interactors.loyalty.b r0 = r0.f34099b
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r2 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r2.<init>(r13, r15, r10)
            r11.label = r15
            java.lang.Object r0 = r0.m172966invokegIAlus(r2, r11)
            if (r0 != r12) goto L_0x005e
            return r12
        L_0x005e:
            boolean r2 = kotlin.Result.m38709i(r0)
            if (r2 == 0) goto L_0x0065
            r0 = r10
        L_0x0065:
            com.carrefour.fid.android.domain.models.loyalty.b r0 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r0
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r0.mo117869h()
            goto L_0x006f
        L_0x006e:
            r0 = r10
        L_0x006f:
            if (r0 != 0) goto L_0x0072
            r0 = r10
        L_0x0072:
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = ""
        L_0x0076:
            r5 = r0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r0 = r11.this$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r0 = r0.f34098a
            java.lang.String r2 = r11.$basketReference
            com.carrefour.fid.android.domain.models.basket.BasketType r3 = r11.$basketType
            java.lang.String r4 = r11.$facilityId
            java.lang.String r6 = r11.$gtin
            java.lang.String r7 = com.carrefour.fid.android.basket.core.type.C13872a.m58833a(r5)
            int r8 = r11.$quantity
            r9 = 0
            r16 = 1
            r11.label = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r16
            r16 = r10
            r10 = r17
            java.lang.Object r0 = r0.mo32797q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r12) goto L_0x00a4
            return r12
        L_0x00a4:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r1 = r11.this$0
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = r11.$basketType
            java.lang.Throwable r3 = kotlin.Result.m38705e(r0)
            if (r3 != 0) goto L_0x00fe
            java.util.List r0 = (java.util.List) r0
            r11.L$0 = r2
            r11.L$1 = r0
            r11.label = r14
            java.lang.Object r1 = r1.mo33377G(r0, r11)
            if (r1 != r12) goto L_0x00bd
            return r12
        L_0x00bd:
            r1 = r2
        L_0x00be:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00c4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00dd
            java.lang.Object r10 = r0.next()
            r2 = r10
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = r2.mo116829N()
            if (r2 != r1) goto L_0x00d9
            r2 = r15
            goto L_0x00da
        L_0x00d9:
            r2 = r13
        L_0x00da:
            if (r2 == 0) goto L_0x00c4
            goto L_0x00df
        L_0x00dd:
            r10 = r16
        L_0x00df:
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10
            if (r10 != 0) goto L_0x00f3
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyBasketThrowable r0 = new com.carrefour.fid.android.shared.io.EmptyBasketThrowable
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x00f9
        L_0x00f3:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.Result.m38702b(r10)
        L_0x00f9:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
            goto L_0x010c
        L_0x00fe:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r3)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
        L_0x010c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Basket>> cVar) {
        return ((BasketRepository$updateOfferInSelectedBasket$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
