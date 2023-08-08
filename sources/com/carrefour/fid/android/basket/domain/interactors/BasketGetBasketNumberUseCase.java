package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37585m;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketGetBasketNumberUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketGetBasketNumberUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketGetBasketNumberUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1747#2,3:31\n*S KotlinDebug\n*F\n+ 1 BasketGetBasketNumberUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketGetBasketNumberUseCase\n*L\n18#1:31,3\n*E\n"})
public final class BasketGetBasketNumberUseCase implements C37585m {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33857a;
    @C12579k

    /* renamed from: b */
    public final C37823k f33858b;

    @Inject
    public BasketGetBasketNumberUseCase(@C12579k BasketRepository basketRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        Intrinsics.checkNotNullParameter(kVar, "serviceSelectionUseCase");
        this.f33857a = basketRepository;
        this.f33858b = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        if (r4 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo33270a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase$getBasketNumber$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase$getBasketNumber$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase$getBasketNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase$getBasketNumber$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase$getBasketNumber$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.service.k r7 = r6.f33858b
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r6
        L_0x004c:
            boolean r1 = kotlin.Result.m38709i(r7)
            r2 = 0
            if (r1 == 0) goto L_0x0054
            r7 = r2
        L_0x0054:
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            if (r7 == 0) goto L_0x005c
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r7.mo119354f()
        L_0x005c:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = r0.f33857a
            kotlinx.coroutines.flow.u r7 = r7.mo33392p()
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r2 != 0) goto L_0x009d
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r4 = 0
            if (r1 == 0) goto L_0x007c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x007c
            goto L_0x009a
        L_0x007c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0080:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            com.carrefour.fid.android.domain.models.basket.BasketType r1 = r1.mo116829N()
            com.carrefour.fid.android.domain.models.basket.BasketType r5 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL
            if (r1 != r5) goto L_0x0096
            r1 = r3
            goto L_0x0097
        L_0x0096:
            r1 = r4
        L_0x0097:
            if (r1 == 0) goto L_0x0080
            r4 = r3
        L_0x009a:
            if (r4 == 0) goto L_0x009d
            goto L_0x00b7
        L_0x009d:
            if (r2 == 0) goto L_0x00b6
            com.carrefour.fid.android.domain.models.basket.BasketType$a r0 = com.carrefour.fid.android.domain.models.basket.BasketType.f95520a
            java.lang.String r1 = r2.mo119180X()
            com.carrefour.fid.android.domain.models.basket.BasketType r0 = r0.mo117009a(r1)
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = r2.mo119176T()
            java.util.List r7 = com.carrefour.fid.android.basket.domain.models.extension.C13969a.m59182a(r7, r0, r1)
            int r3 = r7.size()
            goto L_0x00b7
        L_0x00b6:
            r3 = -1
        L_0x00b7:
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase.mo33270a(kotlin.coroutines.c):java.lang.Object");
    }
}
