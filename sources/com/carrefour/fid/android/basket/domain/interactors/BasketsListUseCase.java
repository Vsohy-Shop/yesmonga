package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.account.C37516b;
import com.carrefour.fid.android.domain.interactors.basket.C37570g;
import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.performance.C38328d;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketsListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketsListUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketsListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n288#2,2:79\n*S KotlinDebug\n*F\n+ 1 BasketsListUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketsListUseCase\n*L\n40#1:79,2\n*E\n"})
public final class BasketsListUseCase implements C37587n {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33905a;
    @C12579k

    /* renamed from: b */
    public final C37516b f33906b;
    @C12579k

    /* renamed from: c */
    public final C37823k f33907c;
    @C12579k

    /* renamed from: d */
    public final C37570g f33908d;
    @C12579k

    /* renamed from: e */
    public final C38328d f33909e;

    @Inject
    public BasketsListUseCase(@C12579k BasketRepository basketRepository, @C12579k C37516b bVar, @C12579k C37823k kVar, @C12579k C37570g gVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        Intrinsics.checkNotNullParameter(bVar, "userInfo");
        Intrinsics.checkNotNullParameter(kVar, "serviceSelectionUseCase");
        Intrinsics.checkNotNullParameter(gVar, "checkSelectedServiceTypeUseCase");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f33905a = basketRepository;
        this.f33906b = bVar;
        this.f33907c = kVar;
        this.f33908d = gVar;
        this.f33909e = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33293c(kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$checkFacilityServiceId$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$checkFacilityServiceId$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$checkFacilityServiceId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$checkFacilityServiceId$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$checkFacilityServiceId$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.basket.g r5 = r4.f33908d
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x0056
            kotlin.d2 r5 = (kotlin.C11079d2) r5
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x006d
        L_0x0056:
            boolean r5 = r0 instanceof com.carrefour.fid.android.domain.exceptions.FacilityIdSwitchNotNecessaryThrowable
            if (r5 == 0) goto L_0x0063
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0063:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x006d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase.mo33293c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.carrefour.fid.android.domain.models.basket.Basket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.carrefour.fid.android.domain.models.basket.Basket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.carrefour.fid.android.domain.models.basket.Basket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.carrefour.fid.android.domain.models.basket.Basket} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172772invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase$invoke$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x006f
            if (r2 == r7) goto L_0x0067
            if (r2 == r5) goto L_0x0059
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x00f2
        L_0x0042:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x004a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x00cf
        L_0x0059:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x00aa
        L_0x0067:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0087
        L_0x006f:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.performance.d r9 = r8.f33909e
            java.lang.String r2 = "get_basket_list"
            r9.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.account.b r9 = r8.f33906b
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = r9.mo31420a(r0)
            if (r9 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r2 = r8
        L_0x0087:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x009f
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r9 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r9.<init>()
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x009f:
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r9 = r2.mo33293c(r0)
            if (r9 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            boolean r5 = kotlin.Result.m38709i(r9)
            if (r5 == 0) goto L_0x00c2
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x00c2:
            com.carrefour.fid.android.domain.interactors.service.k r9 = r2.f33907c
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            boolean r4 = kotlin.Result.m38709i(r9)
            if (r4 == 0) goto L_0x00d6
            r9 = r6
        L_0x00d6:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x00df
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            goto L_0x00e0
        L_0x00df:
            r9 = r6
        L_0x00e0:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r4 = r2.f33905a
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r4.mo33396t(r0)
            if (r0 != r1) goto L_0x00ef
            return r1
        L_0x00ef:
            r1 = r9
            r9 = r0
            r0 = r2
        L_0x00f2:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 != 0) goto L_0x017b
            java.util.List r9 = (java.util.List) r9
            if (r1 != 0) goto L_0x0147
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0102:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x011d
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = r2.mo116829N()
            com.carrefour.fid.android.domain.models.basket.BasketType r3 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL
            if (r2 != r3) goto L_0x0119
            r2 = r7
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            if (r2 == 0) goto L_0x0102
            r6 = r1
        L_0x011d:
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6
            com.carrefour.fid.android.performance.d r9 = r0.f33909e
            r9.mo121196e()
            if (r6 == 0) goto L_0x0137
            int r9 = r6.mo116819D()
            if (r9 <= 0) goto L_0x0137
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.util.List r9 = kotlin.collections.C10976s.m41419k(r6)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x0180
        L_0x0137:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyBasketThrowable r9 = new com.carrefour.fid.android.shared.io.EmptyBasketThrowable
            r9.<init>()
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x0180
        L_0x0147:
            com.carrefour.fid.android.domain.models.basket.BasketType$a r2 = com.carrefour.fid.android.domain.models.basket.BasketType.f95520a
            java.lang.String r3 = r1.mo119180X()
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = r2.mo117009a(r3)
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = r1.mo119176T()
            java.util.List r9 = com.carrefour.fid.android.basket.domain.models.extension.C13969a.m59182a(r9, r2, r1)
            com.carrefour.fid.android.performance.d r0 = r0.f33909e
            r0.mo121196e()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0174
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyBasketThrowable r9 = new com.carrefour.fid.android.shared.io.EmptyBasketThrowable
            r9.<init>()
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x0180
        L_0x0174:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x0180
        L_0x017b:
            com.carrefour.fid.android.performance.d r0 = r0.f33909e
            r0.mo121196e()
        L_0x0180:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase.m172772invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
