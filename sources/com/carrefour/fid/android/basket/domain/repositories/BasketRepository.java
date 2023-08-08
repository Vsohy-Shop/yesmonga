package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.slot.C37854a;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.collections.C10933e1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11363r0({"SMAP\nBasketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n1#2:387\n1#2:413\n4#3:388\n4#3:389\n4#3:390\n4#3:396\n4#3:397\n4#3:398\n4#3:399\n4#3:400\n4#3:401\n4#3:402\n2624#4,3:391\n288#4,2:394\n1603#4,9:403\n1855#4:412\n1856#4:414\n1612#4:415\n288#4,2:416\n*S KotlinDebug\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository\n*L\n371#1:413\n56#1:388\n78#1:389\n86#1:390\n134#1:396\n197#1:397\n217#1:398\n228#1:399\n250#1:400\n256#1:401\n292#1:402\n90#1:391,3\n120#1:394,2\n371#1:403,9\n371#1:412\n371#1:414\n371#1:415\n373#1:416,2\n*E\n"})
public final class BasketRepository {
    @C12579k

    /* renamed from: a */
    public final BasketApiDataSource f34098a;
    @C12579k

    /* renamed from: b */
    public final C37697b f34099b;
    @C12579k

    /* renamed from: c */
    public final C37854a f34100c;
    @C12579k

    /* renamed from: d */
    public final C11940j<Basket> f34101d;
    @C12579k

    /* renamed from: e */
    public final C11952u<Basket> f34102e;
    @C12579k

    /* renamed from: f */
    public final C11940j<List<Basket>> f34103f;
    @C12579k

    /* renamed from: g */
    public final C11952u<List<Basket>> f34104g;
    @C12579k

    /* renamed from: h */
    public final C11940j<List<BasketType>> f34105h;
    @C12579k

    /* renamed from: i */
    public final C11952u<List<BasketType>> f34106i;
    @C12579k

    /* renamed from: j */
    public final C11940j<BasketType> f34107j;
    @C12579k

    /* renamed from: k */
    public final C11952u<BasketType> f34108k;
    @C12579k

    /* renamed from: l */
    public final C11940j<Set<Gtin>> f34109l;
    @C12579k

    /* renamed from: m */
    public final C11952u<Set<Gtin>> f34110m;

    @Inject
    public BasketRepository(@C12579k BasketApiDataSource basketApiDataSource, @C12579k C37697b bVar, @C12579k C37854a aVar) {
        Intrinsics.checkNotNullParameter(basketApiDataSource, "dataSource");
        Intrinsics.checkNotNullParameter(bVar, "getLoyaltyCardNumberUseCase");
        Intrinsics.checkNotNullParameter(aVar, "clearSlotUseCase");
        this.f34098a = basketApiDataSource;
        this.f34099b = bVar;
        this.f34100c = aVar;
        C11940j<Basket> a = C11953v.m47628a(null);
        this.f34101d = a;
        this.f34102e = C11909g.m47470m(a);
        C11940j<List<Basket>> a2 = C11953v.m47628a(CollectionsKt__CollectionsKt.m40441E());
        this.f34103f = a2;
        this.f34104g = C11909g.m47470m(a2);
        C11940j<List<BasketType>> a3 = C11953v.m47628a(CollectionsKt__CollectionsKt.m40441E());
        this.f34105h = a3;
        this.f34106i = C11909g.m47470m(a3);
        C11940j<BasketType> a4 = C11953v.m47628a(BasketType.BASKET_V4_DRIVE);
        this.f34107j = a4;
        this.f34108k = C11909g.m47470m(a4);
        C11940j<Set<Gtin>> a5 = C11953v.m47628a(C10930d1.m40892k());
        this.f34109l = a5;
        this.f34110m = C11909g.m47470m(a5);
    }

    /* renamed from: I */
    public static /* synthetic */ Object m59185I(BasketRepository basketRepository, String str, String str2, int i, String str3, boolean z, BasketType basketType, C11045c cVar, int i2, Object obj) {
        BasketType basketType2;
        if ((i2 & 32) != 0) {
            basketType2 = BasketType.BASKET_V4_DRIVE;
        } else {
            basketType2 = basketType;
        }
        return basketRepository.mo33378H(str, str2, i, str3, z, basketType2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33371A(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.delivery.DeliveryCode r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$2 r14 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$setDeliveryType$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33371A(com.carrefour.fid.android.domain.models.delivery.DeliveryCode, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: B */
    public final void mo33372B(String str, boolean z) {
        Set set;
        Set value = this.f34109l.getValue();
        if (z) {
            set = C10933e1.m40912D(value, Gtin.m157307a(str));
        } else {
            set = C10933e1.m40917y(value, Gtin.m157307a(str));
        }
        this.f34109l.mo24198a(set);
    }

    @C12580l
    /* renamed from: C */
    public final Object mo33373C(@C12579k BasketType basketType, @C12579k C11045c<? super C11079d2> cVar) {
        Object emit = this.f34107j.emit(basketType, cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33374D(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x0078
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.mo33397u(r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r6
        L_0x005d:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)
            if (r4 != 0) goto L_0x0079
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$2 r4 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$2
            r5 = 0
            r4.<init>(r2, r7, r8, r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r4, r0)
            if (r7 != r1) goto L_0x0078
            return r1
        L_0x0078:
            return r7
        L_0x0079:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33374D(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e9 A[SYNTHETIC, Splitter:B:52:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010f A[SYNTHETIC, Splitter:B:61:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33375E(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$synchronizeBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$synchronizeBasket$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$synchronizeBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$synchronizeBasket$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$synchronizeBasket$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0083
            if (r2 == r7) goto L_0x0075
            if (r2 == r6) goto L_0x0063
            if (r2 == r5) goto L_0x0054
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            kotlin.C11661u0.m45747n(r14)     // Catch:{ all -> 0x003d }
            kotlin.Result r14 = (kotlin.Result) r14     // Catch:{ all -> 0x003d }
            java.lang.Object r14 = r14.mo21858l()     // Catch:{ all -> 0x003d }
            goto L_0x0120
        L_0x003d:
            r14 = move-exception
            goto L_0x012b
        L_0x0040:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0048:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r14)     // Catch:{ all -> 0x0051 }
            goto L_0x00f8
        L_0x0051:
            r14 = move-exception
            goto L_0x00ff
        L_0x0054:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x00e3
        L_0x0063:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r6
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x00b3
        L_0x0075:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0092
        L_0x0083:
            kotlin.C11661u0.m45747n(r14)
            r0.L$0 = r13
            r0.label = r7
            java.lang.Object r14 = r13.mo33397u(r0)
            if (r14 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r2 = r13
        L_0x0092:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r14)
            if (r9 != 0) goto L_0x0136
            com.carrefour.fid.android.domain.models.basket.Basket r14 = (com.carrefour.fid.android.domain.models.basket.Basket) r14
            com.carrefour.fid.android.domain.interactors.loyalty.b r9 = r2.f34099b
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r10 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r11 = 0
            r10.<init>(r11, r7, r8)
            r0.L$0 = r2
            r0.L$1 = r14
            r0.label = r6
            java.lang.Object r6 = r9.m172966invokegIAlus(r10, r0)
            if (r6 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r12 = r2
            r2 = r14
            r14 = r6
            r6 = r12
        L_0x00b3:
            boolean r7 = kotlin.Result.m38709i(r14)
            if (r7 == 0) goto L_0x00ba
            r14 = r8
        L_0x00ba:
            com.carrefour.fid.android.domain.models.loyalty.b r14 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r14
            if (r14 == 0) goto L_0x00c3
            java.lang.String r14 = r14.mo117869h()
            goto L_0x00c4
        L_0x00c3:
            r14 = r8
        L_0x00c4:
            if (r14 != 0) goto L_0x00c7
            r14 = r8
        L_0x00c7:
            if (r14 != 0) goto L_0x00cb
            java.lang.String r14 = ""
        L_0x00cb:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r7 = r6.f34098a
            java.lang.String r2 = r2.mo116822G()
            java.lang.String r9 = com.carrefour.fid.android.basket.core.type.C13872a.m58833a(r14)
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r14 = r7.mo32794n(r2, r14, r9, r0)
            if (r14 != r1) goto L_0x00e2
            return r1
        L_0x00e2:
            r2 = r6
        L_0x00e3:
            boolean r5 = kotlin.Result.m38710j(r14)
            if (r5 == 0) goto L_0x0105
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0051 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x0051 }
            r0.L$0 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r4     // Catch:{ all -> 0x0051 }
            java.lang.Object r14 = r2.mo33377G(r14, r0)     // Catch:{ all -> 0x0051 }
            if (r14 != r1) goto L_0x00f8
            return r1
        L_0x00f8:
            com.carrefour.fid.android.domain.models.basket.Basket r14 = (com.carrefour.fid.android.domain.models.basket.Basket) r14     // Catch:{ all -> 0x0051 }
            java.lang.Object r14 = kotlin.Result.m38702b(r14)     // Catch:{ all -> 0x0051 }
            goto L_0x0109
        L_0x00ff:
            kotlin.Result$a r4 = kotlin.Result.f28060a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
        L_0x0105:
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
        L_0x0109:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r14)
            if (r4 == 0) goto L_0x0135
            kotlin.Result$a r14 = kotlin.Result.f28060a     // Catch:{ all -> 0x003d }
            boolean r14 = r4 instanceof com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable     // Catch:{ all -> 0x003d }
            if (r14 == 0) goto L_0x012a
            r0.L$0 = r8     // Catch:{ all -> 0x003d }
            r0.label = r3     // Catch:{ all -> 0x003d }
            java.lang.Object r14 = r2.mo33390n(r0)     // Catch:{ all -> 0x003d }
            if (r14 != r1) goto L_0x0120
            return r1
        L_0x0120:
            kotlin.C11661u0.m45747n(r14)     // Catch:{ all -> 0x003d }
            com.carrefour.fid.android.domain.models.basket.Basket r14 = (com.carrefour.fid.android.domain.models.basket.Basket) r14     // Catch:{ all -> 0x003d }
            java.lang.Object r14 = kotlin.Result.m38702b(r14)     // Catch:{ all -> 0x003d }
            goto L_0x0135
        L_0x012a:
            throw r4     // Catch:{ all -> 0x003d }
        L_0x012b:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
        L_0x0135:
            return r14
        L_0x0136:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33375E(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC, Splitter:B:29:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33376F(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$unbookSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$unbookSlot$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$unbookSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$unbookSlot$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$unbookSlot$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00a3
        L_0x0031:
            r9 = move-exception
            goto L_0x00aa
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r9
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x008e
        L_0x004a:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L_0x0073
        L_0x0060:
            kotlin.C11661u0.m45747n(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r8.mo33397u(r0)
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r10
            r10 = r9
            r9 = r8
        L_0x0073:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r2)
            if (r6 != 0) goto L_0x00ba
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = r9.f34098a
            java.lang.String r2 = r2.mo116822G()
            r0.L$0 = r9
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r6.mo32796p(r10, r2, r0)
            if (r10 != r1) goto L_0x008e
            return r1
        L_0x008e:
            boolean r2 = kotlin.Result.m38710j(r10)
            if (r2 == 0) goto L_0x00b5
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0031 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0031 }
            r0.L$0 = r3     // Catch:{ all -> 0x0031 }
            r0.label = r4     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = r9.mo33377G(r10, r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0031 }
            java.lang.Object r9 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00b9
        L_0x00aa:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00b9
        L_0x00b5:
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
        L_0x00b9:
            return r9
        L_0x00ba:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33376F(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        r10 = r9.f34101d;
        r2 = com.carrefour.fid.android.domain.models.basket.Basket.f95463I0.mo116860a();
        r0.L$0 = r9;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c6, code lost:
        if (r10.emit(r2, r0) != r1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r9 = r9.f34103f;
        r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E();
        r0.L$0 = null;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
        if (r9.emit(r10, r0) != r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dd, code lost:
        throw com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0113, code lost:
        r2 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        if (r2.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        r6 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        if (((com.carrefour.fid.android.domain.models.basket.Basket) r6).mo116829N() != r10) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012d, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012f, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0130, code lost:
        if (r7 == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0133, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0134, code lost:
        r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        if (r10 != null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        r9 = r5.f34101d;
        r10 = com.carrefour.fid.android.domain.models.basket.Basket.f95463I0.mo116860a();
        r0.L$0 = r5;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014e, code lost:
        if (r9.emit(r10, r0) != r1) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0150, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0151, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        r9 = r9.f34103f;
        r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E();
        r0.L$0 = null;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0161, code lost:
        if (r9.emit(r10, r0) != r1) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0163, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0166, code lost:
        throw com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        if (r10.mo116826K().mo117001l() != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0171, code lost:
        r2 = r5.f34100c;
        r0.L$0 = r5;
        r0.L$1 = r9;
        r0.L$2 = r10;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0180, code lost:
        if (r2.m172965invokeIoAF18A(r0) != r1) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0182, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0183, code lost:
        r2 = r9;
        r9 = r10;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0188, code lost:
        r2 = r9;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018a, code lost:
        r9 = r3.f34101d;
        r0.L$0 = r3;
        r0.L$1 = r2;
        r0.L$2 = r10;
        r0.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019a, code lost:
        if (r9.emit(r10, r0) != r1) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019d, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019e, code lost:
        r10 = r3.f34103f;
        r0.L$0 = r9;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ae, code lost:
        if (r10.emit(r2, r0) != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33377G(java.util.List<com.carrefour.fid.android.domain.models.basket.Basket> r9, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.basket.Basket> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateCacheWithBasketList$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateCacheWithBasketList$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateCacheWithBasketList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateCacheWithBasketList$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateCacheWithBasketList$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0092;
                case 1: goto L_0x008a;
                case 2: goto L_0x0082;
                case 3: goto L_0x007e;
                case 4: goto L_0x006b;
                case 5: goto L_0x0062;
                case 6: goto L_0x005d;
                case 7: goto L_0x0047;
                case 8: goto L_0x0036;
                case 9: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002d:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x01b1
        L_0x0036:
            java.lang.Object r9 = r0.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r3 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r3
            kotlin.C11661u0.m45747n(r10)
            goto L_0x019e
        L_0x0047:
            java.lang.Object r9 = r0.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r3 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r3
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            r10.mo21858l()
            goto L_0x0186
        L_0x005d:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0164
        L_0x0062:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0152
        L_0x006b:
            java.lang.Object r9 = r0.L$2
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = (com.carrefour.fid.android.domain.models.basket.BasketType) r9
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r5 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r5
            kotlin.C11661u0.m45747n(r10)
            r10 = r9
            r9 = r2
            goto L_0x0113
        L_0x007e:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00db
        L_0x0082:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00c9
        L_0x008a:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00b5
        L_0x0092:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.basket.BasketType> r10 = r8.f34107j
            java.lang.Object r10 = r10.getValue()
            com.carrefour.fid.android.domain.models.basket.BasketType r10 = (com.carrefour.fid.android.domain.models.basket.BasketType) r10
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00de
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.basket.BasketType>> r9 = r8.f34105h
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r9 = r8
        L_0x00b5:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.basket.Basket> r10 = r9.f34101d
            com.carrefour.fid.android.domain.models.basket.Basket$a r2 = com.carrefour.fid.android.domain.models.basket.Basket.f95463I0
            com.carrefour.fid.android.domain.models.basket.Basket r2 = r2.mo116860a()
            r0.L$0 = r9
            r3 = 2
            r0.label = r3
            java.lang.Object r10 = r10.emit(r2, r0)
            if (r10 != r1) goto L_0x00c9
            return r1
        L_0x00c9:
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>> r9 = r9.f34103f
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0.L$0 = r4
            r2 = 3
            r0.label = r2
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L_0x00db
            return r1
        L_0x00db:
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r9 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            throw r9
        L_0x00de:
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.basket.BasketType>> r2 = r8.f34105h
            r5 = r9
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00ec:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0102
            java.lang.Object r7 = r5.next()
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            com.carrefour.fid.android.domain.models.basket.BasketType r7 = r7.mo116829N()
            if (r7 == 0) goto L_0x00ec
            r6.add(r7)
            goto L_0x00ec
        L_0x0102:
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r5 = 4
            r0.label = r5
            java.lang.Object r2 = r2.emit(r6, r0)
            if (r2 != r1) goto L_0x0112
            return r1
        L_0x0112:
            r5 = r8
        L_0x0113:
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x011a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0133
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            com.carrefour.fid.android.domain.models.basket.BasketType r7 = r7.mo116829N()
            if (r7 != r10) goto L_0x012f
            r7 = r3
            goto L_0x0130
        L_0x012f:
            r7 = 0
        L_0x0130:
            if (r7 == 0) goto L_0x011a
            goto L_0x0134
        L_0x0133:
            r6 = r4
        L_0x0134:
            r10 = r6
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10
            if (r10 != 0) goto L_0x0167
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.basket.Basket> r9 = r5.f34101d
            com.carrefour.fid.android.domain.models.basket.Basket$a r10 = com.carrefour.fid.android.domain.models.basket.Basket.f95463I0
            com.carrefour.fid.android.domain.models.basket.Basket r10 = r10.mo116860a()
            r0.L$0 = r5
            r0.L$1 = r4
            r0.L$2 = r4
            r2 = 5
            r0.label = r2
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L_0x0151
            return r1
        L_0x0151:
            r9 = r5
        L_0x0152:
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>> r9 = r9.f34103f
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0.L$0 = r4
            r2 = 6
            r0.label = r2
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L_0x0164
            return r1
        L_0x0164:
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r9 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            throw r9
        L_0x0167:
            com.carrefour.fid.android.domain.models.basket.BasketSlot r2 = r10.mo116826K()
            boolean r2 = r2.mo117001l()
            if (r2 != 0) goto L_0x0188
            com.carrefour.fid.android.domain.interactors.slot.a r2 = r5.f34100c
            r0.L$0 = r5
            r0.L$1 = r9
            r0.L$2 = r10
            r3 = 7
            r0.label = r3
            java.lang.Object r2 = r2.m172965invokeIoAF18A(r0)
            if (r2 != r1) goto L_0x0183
            return r1
        L_0x0183:
            r2 = r9
            r9 = r10
            r3 = r5
        L_0x0186:
            r10 = r9
            goto L_0x018a
        L_0x0188:
            r2 = r9
            r3 = r5
        L_0x018a:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.basket.Basket> r9 = r3.f34101d
            r0.L$0 = r3
            r0.L$1 = r2
            r0.L$2 = r10
            r5 = 8
            r0.label = r5
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L_0x019d
            return r1
        L_0x019d:
            r9 = r10
        L_0x019e:
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>> r10 = r3.f34103f
            r0.L$0 = r9
            r0.L$1 = r4
            r0.L$2 = r4
            r3 = 9
            r0.label = r3
            java.lang.Object r10 = r10.emit(r2, r0)
            if (r10 != r1) goto L_0x01b1
            return r1
        L_0x01b1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33377G(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f A[Catch:{ all -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146 A[Catch:{ all -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0149 A[Catch:{ all -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0176 A[SYNTHETIC, Splitter:B:68:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a3 A[SYNTHETIC, Splitter:B:83:0x01a3] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ba  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33378H(@org.jetbrains.annotations.C12580l java.lang.String r21, @org.jetbrains.annotations.C12579k java.lang.String r22, int r23, @org.jetbrains.annotations.C12580l java.lang.String r24, boolean r25, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.BasketType r26, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r27) {
        /*
            r20 = this;
            r1 = r20
            r0 = r27
            boolean r2 = r0 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInBasket$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInBasket$1 r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInBasket$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInBasket$1 r2 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInBasket$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r14 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r15 = 4
            r4 = 3
            r5 = 2
            r13 = 0
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00b3
            if (r3 == r6) goto L_0x0091
            if (r3 == r5) goto L_0x0066
            if (r3 == r4) goto L_0x004e
            if (r3 != r15) goto L_0x0046
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0042 }
            r1 = r13
            goto L_0x0189
        L_0x0042:
            r0 = move-exception
            r1 = r13
            goto L_0x0194
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004e:
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r4 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r4
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0062 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0062 }
            r1 = r13
            goto L_0x0170
        L_0x0062:
            r0 = move-exception
            r1 = r13
            goto L_0x01b6
        L_0x0066:
            boolean r3 = r2.Z$0
            int r5 = r2.I$0
            java.lang.Object r8 = r2.L$5
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            java.lang.Object r9 = r2.L$4
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = (com.carrefour.fid.android.domain.models.basket.BasketType) r9
            java.lang.Object r10 = r2.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r15 = r2.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r15 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r15
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r13 = r15
            r15 = r11
            r11 = r10
            r10 = r5
            goto L_0x0118
        L_0x0091:
            boolean r3 = r2.Z$0
            int r8 = r2.I$0
            java.lang.Object r9 = r2.L$4
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = (com.carrefour.fid.android.domain.models.basket.BasketType) r9
            java.lang.Object r10 = r2.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r15 = r2.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r15 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r15
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x00e9
        L_0x00b3:
            kotlin.C11661u0.m45747n(r0)
            r2.L$0 = r1
            r0 = r21
            r2.L$1 = r0
            r3 = r22
            r2.L$2 = r3
            r8 = r24
            r2.L$3 = r8
            r9 = r26
            r2.L$4 = r9
            r10 = r23
            r2.I$0 = r10
            r11 = r25
            r2.Z$0 = r11
            r2.label = r6
            java.lang.Object r12 = r1.mo33397u(r2)
            if (r12 != r14) goto L_0x00d9
            return r14
        L_0x00d9:
            r15 = r1
            r17 = r12
            r12 = r0
            r0 = r17
            r18 = r11
            r11 = r3
            r3 = r18
            r19 = r10
            r10 = r8
            r8 = r19
        L_0x00e9:
            java.lang.Throwable r16 = kotlin.Result.m38705e(r0)
            if (r16 != 0) goto L_0x01ba
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
            com.carrefour.fid.android.domain.interactors.loyalty.b r4 = r15.f34099b
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r5 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r5.<init>(r13, r6, r7)
            r2.L$0 = r15
            r2.L$1 = r12
            r2.L$2 = r11
            r2.L$3 = r10
            r2.L$4 = r9
            r2.L$5 = r0
            r2.I$0 = r8
            r2.Z$0 = r3
            r13 = 2
            r2.label = r13
            java.lang.Object r4 = r4.m172966invokegIAlus(r5, r2)
            if (r4 != r14) goto L_0x0112
            return r14
        L_0x0112:
            r13 = r15
            r15 = r11
            r11 = r10
            r10 = r8
            r8 = r0
            r0 = r4
        L_0x0118:
            boolean r4 = kotlin.Result.m38709i(r0)
            if (r4 == 0) goto L_0x011f
            r0 = r7
        L_0x011f:
            com.carrefour.fid.android.domain.models.loyalty.b r0 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r0
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = r0.mo117869h()
            goto L_0x0129
        L_0x0128:
            r0 = r7
        L_0x0129:
            if (r0 != 0) goto L_0x012c
            r0 = r7
        L_0x012c:
            if (r0 != 0) goto L_0x0130
            java.lang.String r0 = ""
        L_0x0130:
            r13.mo33372B(r15, r6)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r4 = r13.f34098a     // Catch:{ all -> 0x01af }
            java.lang.String r5 = r8.mo116822G()     // Catch:{ all -> 0x01af }
            com.carrefour.fid.android.domain.models.basket.BasketType r8 = r8.mo116829N()     // Catch:{ all -> 0x01af }
            if (r8 != 0) goto L_0x0140
            r8 = r9
        L_0x0140:
            java.lang.String r9 = com.carrefour.fid.android.basket.core.type.C13872a.m58833a(r0)     // Catch:{ all -> 0x01af }
            if (r3 == 0) goto L_0x0149
            r16 = r6
            goto L_0x014b
        L_0x0149:
            r16 = 0
        L_0x014b:
            r2.L$0 = r13     // Catch:{ all -> 0x01af }
            r2.L$1 = r15     // Catch:{ all -> 0x01af }
            r2.L$2 = r7     // Catch:{ all -> 0x01af }
            r2.L$3 = r7     // Catch:{ all -> 0x01af }
            r2.L$4 = r7     // Catch:{ all -> 0x01af }
            r2.L$5 = r7     // Catch:{ all -> 0x01af }
            r3 = 3
            r2.label = r3     // Catch:{ all -> 0x01af }
            r3 = r4
            r4 = r5
            r5 = r8
            r6 = r12
            r7 = r15
            r8 = r0
            r12 = r16
            r16 = r13
            r1 = 0
            r13 = r2
            java.lang.Object r0 = r3.mo32797q(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01ad }
            if (r0 != r14) goto L_0x016d
            return r14
        L_0x016d:
            r3 = r15
            r4 = r16
        L_0x0170:
            boolean r5 = kotlin.Result.m38710j(r0)     // Catch:{ all -> 0x01ab }
            if (r5 == 0) goto L_0x01a3
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0192 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0192 }
            r2.L$0 = r4     // Catch:{ all -> 0x0192 }
            r2.L$1 = r3     // Catch:{ all -> 0x0192 }
            r5 = 4
            r2.label = r5     // Catch:{ all -> 0x0192 }
            java.lang.Object r0 = r4.mo33377G(r0, r2)     // Catch:{ all -> 0x0192 }
            if (r0 != r14) goto L_0x0188
            return r14
        L_0x0188:
            r2 = r4
        L_0x0189:
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0     // Catch:{ all -> 0x0190 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0190 }
            goto L_0x019e
        L_0x0190:
            r0 = move-exception
            goto L_0x0194
        L_0x0192:
            r0 = move-exception
            r2 = r4
        L_0x0194:
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x01a0 }
        L_0x019e:
            r4 = r2
            goto L_0x01a7
        L_0x01a0:
            r0 = move-exception
            r4 = r2
            goto L_0x01b6
        L_0x01a3:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x01ab }
        L_0x01a7:
            r4.mo33372B(r3, r1)
            return r0
        L_0x01ab:
            r0 = move-exception
            goto L_0x01b6
        L_0x01ad:
            r0 = move-exception
            goto L_0x01b3
        L_0x01af:
            r0 = move-exception
            r16 = r13
            r1 = 0
        L_0x01b3:
            r3 = r15
            r4 = r16
        L_0x01b6:
            r4.mo33372B(r3, r1)
            throw r0
        L_0x01ba:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r16)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33378H(java.lang.String, java.lang.String, int, java.lang.String, boolean, com.carrefour.fid.android.domain.models.basket.BasketType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33379J(@org.jetbrains.annotations.C12580l java.lang.String r14, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.BasketType r15, @org.jetbrains.annotations.C12580l java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, int r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$1 r1 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            r10 = r13
            goto L_0x001c
        L_0x0016:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$1 r1 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$1
            r10 = r13
            r1.<init>(r13, r0)
        L_0x001c:
            java.lang.Object r0 = r1.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r12 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r12) goto L_0x0033
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0057
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$2 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateOfferInSelectedBasket$2
            r9 = 0
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.label = r12
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            if (r0 != r11) goto L_0x0057
            return r11
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33379J(java.lang.String, com.carrefour.fid.android.domain.models.basket.BasketType, java.lang.String, java.lang.String, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC, Splitter:B:29:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0 A[SYNTHETIC, Splitter:B:38:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33380K(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.slot.Slot r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateYieldFeesBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateYieldFeesBasket$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateYieldFeesBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateYieldFeesBasket$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$updateYieldFeesBasket$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00a3
        L_0x0031:
            r9 = move-exception
            goto L_0x00aa
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r9
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x008e
        L_0x004a:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r9 = (com.carrefour.fid.android.domain.models.slot.Slot) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L_0x0073
        L_0x0060:
            kotlin.C11661u0.m45747n(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r8.mo33397u(r0)
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r10
            r10 = r9
            r9 = r8
        L_0x0073:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r2)
            if (r6 != 0) goto L_0x00d1
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = r9.f34098a
            java.lang.String r2 = r2.mo116822G()
            r0.L$0 = r9
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r6.mo32799s(r10, r2, r0)
            if (r10 != r1) goto L_0x008e
            return r1
        L_0x008e:
            boolean r2 = kotlin.Result.m38710j(r10)
            if (r2 == 0) goto L_0x00b5
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0031 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0031 }
            r0.L$0 = r3     // Catch:{ all -> 0x0031 }
            r0.label = r4     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = r9.mo33377G(r10, r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0031 }
            java.lang.Object r9 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00b9
        L_0x00aa:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00b9
        L_0x00b5:
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
        L_0x00b9:
            java.lang.Throwable r10 = kotlin.Result.m38705e(r9)
            if (r10 != 0) goto L_0x00c0
            goto L_0x00d0
        L_0x00c0:
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x00c5 }
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable r9 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable.f94239a     // Catch:{ all -> 0x00c5 }
            throw r9     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r9 = move-exception
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x00d0:
            return r9
        L_0x00d1:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33380K(com.carrefour.fid.android.domain.models.slot.Slot, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC, Splitter:B:29:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33381e(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCode$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCode$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCode$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00a3
        L_0x0031:
            r9 = move-exception
            goto L_0x00aa
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r9
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x008e
        L_0x004a:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L_0x0073
        L_0x0060:
            kotlin.C11661u0.m45747n(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r8.mo33397u(r0)
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r10
            r10 = r9
            r9 = r8
        L_0x0073:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r2)
            if (r6 != 0) goto L_0x00ba
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = r9.f34098a
            java.lang.String r2 = r2.mo116822G()
            r0.L$0 = r9
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r6.mo32783b(r10, r2, r0)
            if (r10 != r1) goto L_0x008e
            return r1
        L_0x008e:
            boolean r2 = kotlin.Result.m38710j(r10)
            if (r2 == 0) goto L_0x00b5
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0031 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0031 }
            r0.L$0 = r3     // Catch:{ all -> 0x0031 }
            r0.label = r4     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = r9.mo33377G(r10, r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0031 }
            java.lang.Object r9 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00b9
        L_0x00aa:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00b9
        L_0x00b5:
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
        L_0x00b9:
            return r9
        L_0x00ba:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33381e(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33382f(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCodeBySubBasketId$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCodeBySubBasketId$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCodeBySubBasketId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCodeBySubBasketId$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$addPromotionCodeBySubBasketId$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0034 }
            goto L_0x0082
        L_0x0034:
            r9 = move-exception
            goto L_0x008c
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r7 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r7
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0068
        L_0x0051:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r9 = r6.f34098a
            java.lang.String r2 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156093b(r8)
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.mo32783b(r7, r2, r0)
            if (r9 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r7 = r6
        L_0x0068:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 != 0) goto L_0x00cf
            java.util.List r9 = (java.util.List) r9
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0088 }
            r0.L$0 = r8     // Catch:{ all -> 0x0088 }
            r0.L$1 = r9     // Catch:{ all -> 0x0088 }
            r0.label = r3     // Catch:{ all -> 0x0088 }
            java.lang.Object r7 = r7.mo33377G(r9, r0)     // Catch:{ all -> 0x0088 }
            if (r7 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r5 = r9
            r9 = r7
            r7 = r5
        L_0x0082:
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9     // Catch:{ all -> 0x0034 }
            kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0034 }
            goto L_0x0095
        L_0x0088:
            r7 = move-exception
            r5 = r9
            r9 = r7
            r7 = r5
        L_0x008c:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            kotlin.Result.m38702b(r9)
        L_0x0095:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x009b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00b3
            java.lang.Object r9 = r7.next()
            r0 = r9
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
            java.lang.String r0 = r0.mo116822G()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r8)
            if (r0 == 0) goto L_0x009b
            goto L_0x00b4
        L_0x00b3:
            r9 = 0
        L_0x00b4:
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            if (r9 != 0) goto L_0x00c8
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyBasketThrowable r7 = new com.carrefour.fid.android.shared.io.EmptyBasketThrowable
            r7.<init>()
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x00c8:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r9)
            return r7
        L_0x00cf:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r2)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33382f(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33383g(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x0078
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.mo33397u(r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r6
        L_0x005d:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)
            if (r4 != 0) goto L_0x0079
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$2 r4 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$bookSlot$2
            r5 = 0
            r4.<init>(r2, r7, r8, r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r4, r0)
            if (r7 != r1) goto L_0x0078
            return r1
        L_0x0078:
            return r7
        L_0x0079:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33383g(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo33384h() {
        this.f34101d.setValue(null);
        this.f34103f.setValue(CollectionsKt__CollectionsKt.m40441E());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33385i(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasket$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasket$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasket$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x004d
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0030 }
            goto L_0x00d6
        L_0x0030:
            r12 = move-exception
            goto L_0x00dc
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003b:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r4 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r4
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0089
        L_0x004d:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x006a
        L_0x005b:
            kotlin.C11661u0.m45747n(r12)
            r0.L$0 = r11
            r0.label = r5
            java.lang.Object r12 = r11.mo33397u(r0)
            if (r12 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r11
        L_0x006a:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r12)
            if (r6 != 0) goto L_0x0106
            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = r2.f34098a
            java.lang.String r7 = r12.mo116822G()
            r0.L$0 = r2
            r0.L$1 = r12
            r0.label = r4
            java.lang.Object r4 = r6.mo32785d(r7, r0)
            if (r4 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r10 = r2
            r2 = r12
            r12 = r4
            r4 = r10
        L_0x0089:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r12)
            if (r6 != 0) goto L_0x00fb
            java.util.List r12 = (java.util.List) r12
            r6 = r12
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            r8 = 0
            if (r7 == 0) goto L_0x00a4
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x00a4
        L_0x00a2:
            r2 = r5
            goto L_0x00c4
        L_0x00a4:
            java.util.Iterator r6 = r6.iterator()
        L_0x00a8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r6.next()
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            com.carrefour.fid.android.domain.models.basket.BasketType r7 = r7.mo116829N()
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = r2.mo116829N()
            if (r7 != r9) goto L_0x00c0
            r7 = r5
            goto L_0x00c1
        L_0x00c0:
            r7 = r8
        L_0x00c1:
            if (r7 == 0) goto L_0x00a8
            r2 = r8
        L_0x00c4:
            if (r2 == 0) goto L_0x00f0
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.L$0 = r2     // Catch:{ all -> 0x0030 }
            r0.L$1 = r2     // Catch:{ all -> 0x0030 }
            r0.label = r3     // Catch:{ all -> 0x0030 }
            java.lang.Object r12 = r4.mo33377G(r12, r0)     // Catch:{ all -> 0x0030 }
            if (r12 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12     // Catch:{ all -> 0x0030 }
            kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x0030 }
            goto L_0x00e5
        L_0x00dc:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            kotlin.Result.m38702b(r12)
        L_0x00e5:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            goto L_0x0105
        L_0x00f0:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            goto L_0x0105
        L_0x00fb:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
        L_0x0105:
            return r12
        L_0x0106:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33385i(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33386j(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$2 r6 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33386j(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = kotlin.Result.f28060a;
        r12 = kotlin.C11661u0.m45734a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r11.mo33372B(r10, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0034, B:18:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae A[SYNTHETIC, Splitter:B:39:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33387k(@org.jetbrains.annotations.C12579k java.lang.String r10, boolean r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOffer$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOffer$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOffer$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOffer$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 == r6) goto L_0x0059
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r11 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r11
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0039 }
            goto L_0x00bf
        L_0x0039:
            r12 = move-exception
            goto L_0x00c6
        L_0x003c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0044:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r11 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r11
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0056 }
            kotlin.Result r12 = (kotlin.Result) r12     // Catch:{ all -> 0x0056 }
            java.lang.Object r12 = r12.mo21858l()     // Catch:{ all -> 0x0056 }
            goto L_0x00a8
        L_0x0056:
            r12 = move-exception
            goto L_0x00d4
        L_0x0059:
            boolean r11 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r8 = r12
            r12 = r11
            r11 = r2
            r2 = r8
            goto L_0x0086
        L_0x0071:
            kotlin.C11661u0.m45747n(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.Z$0 = r11
            r0.label = r6
            java.lang.Object r12 = r9.mo33397u(r0)
            if (r12 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r12
            r12 = r11
            r11 = r9
        L_0x0086:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r2)
            if (r7 != 0) goto L_0x00d8
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            r11.mo33372B(r10, r6)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r7 = r11.f34098a     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r2.mo116822G()     // Catch:{ all -> 0x0056 }
            if (r12 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r6 = r5
        L_0x009b:
            r0.L$0 = r11     // Catch:{ all -> 0x0056 }
            r0.L$1 = r10     // Catch:{ all -> 0x0056 }
            r0.label = r4     // Catch:{ all -> 0x0056 }
            java.lang.Object r12 = r7.mo32786e(r2, r10, r6, r0)     // Catch:{ all -> 0x0056 }
            if (r12 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            boolean r2 = kotlin.Result.m38710j(r12)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x00cc
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0039 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0039 }
            r0.L$0 = r11     // Catch:{ all -> 0x0039 }
            r0.L$1 = r10     // Catch:{ all -> 0x0039 }
            r0.label = r3     // Catch:{ all -> 0x0039 }
            java.lang.Object r12 = r11.mo33377G(r12, r0)     // Catch:{ all -> 0x0039 }
            if (r12 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12     // Catch:{ all -> 0x0039 }
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x0039 }
            goto L_0x00d0
        L_0x00c6:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0056 }
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)     // Catch:{ all -> 0x0056 }
        L_0x00cc:
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x0056 }
        L_0x00d0:
            r11.mo33372B(r10, r5)
            return r12
        L_0x00d4:
            r11.mo33372B(r10, r5)
            throw r12
        L_0x00d8:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33387k(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33388l(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, boolean r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$2 r14 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteOfferByBasketReference$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r12
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33388l(java.lang.String, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC, Splitter:B:22:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[SYNTHETIC, Splitter:B:31:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33389m(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteYieldFees$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteYieldFees$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteYieldFees$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteYieldFees$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteYieldFees$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x002c }
            goto L_0x006b
        L_0x002c:
            r6 = move-exception
            goto L_0x0072
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0055
        L_0x0044:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = r5.f34098a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo32787f(r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            boolean r4 = kotlin.Result.m38710j(r6)
            if (r4 == 0) goto L_0x0078
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x002c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x002c }
            r4 = 0
            r0.L$0 = r4     // Catch:{ all -> 0x002c }
            r0.label = r3     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = r2.mo33377G(r6, r0)     // Catch:{ all -> 0x002c }
            if (r6 != r1) goto L_0x006b
            return r1
        L_0x006b:
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x002c }
            goto L_0x007c
        L_0x0072:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
        L_0x0078:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x007c:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 != 0) goto L_0x0083
            goto L_0x0093
        L_0x0083:
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0088 }
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable r6 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable.f94239a     // Catch:{ all -> 0x0088 }
            throw r6     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0093:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33389m(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC, Splitter:B:22:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33390n(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$fetchBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$fetchBasket$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$fetchBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$fetchBasket$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$fetchBasket$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x002c }
            goto L_0x006b
        L_0x002c:
            r6 = move-exception
            goto L_0x0072
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0055
        L_0x0044:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = r5.f34098a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo32788g(r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            boolean r4 = kotlin.Result.m38710j(r6)
            if (r4 == 0) goto L_0x0078
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x002c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x002c }
            r4 = 0
            r0.L$0 = r4     // Catch:{ all -> 0x002c }
            r0.label = r3     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = r2.mo33377G(r6, r0)     // Catch:{ all -> 0x002c }
            if (r6 != r1) goto L_0x006b
            return r1
        L_0x006b:
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x002c }
            goto L_0x007c
        L_0x0072:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
        L_0x0078:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x007c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33390n(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: o */
    public final C11952u<Basket> mo33391o() {
        return this.f34102e;
    }

    @C12579k
    /* renamed from: p */
    public final C11952u<List<Basket>> mo33392p() {
        return this.f34104g;
    }

    @C12579k
    /* renamed from: q */
    public final C11952u<BasketType> mo33393q() {
        return this.f34108k;
    }

    @C12579k
    /* renamed from: r */
    public final C11952u<List<BasketType>> mo33394r() {
        return this.f34106i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33395s(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$2 r6 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33395s(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33396t(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$2 r5 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33396t(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33397u(kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getCache$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getCache$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getCache$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getCache$1
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
            goto L_0x0054
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            kotlinx.coroutines.flow.u<com.carrefour.fid.android.domain.models.basket.Basket> r5 = r4.f34102e
            java.lang.Object r5 = r5.getValue()
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            if (r5 == 0) goto L_0x004b
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x004b:
            r0.label = r3
            java.lang.Object r5 = r4.mo33390n(r0)
            if (r5 != r1) goto L_0x0054
            return r1
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33397u(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: v */
    public final Basket mo33398v() {
        Object obj;
        boolean z;
        Iterator it = this.f34103f.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Basket) obj).mo116829N() == this.f34108k.getValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Basket) obj;
    }

    @C12579k
    /* renamed from: w */
    public final C11952u<Set<Gtin>> mo33399w() {
        return this.f34110m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC, Splitter:B:22:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33400x(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$initializeBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$initializeBasket$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$initializeBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$initializeBasket$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$initializeBasket$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x002c }
            goto L_0x006b
        L_0x002c:
            r6 = move-exception
            goto L_0x0072
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r6 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0055
        L_0x0044:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r7 = r5.f34098a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.mo32790j(r6, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r5
        L_0x0055:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x007d
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x002c }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x002c }
            r2 = 0
            r0.L$0 = r2     // Catch:{ all -> 0x002c }
            r0.label = r3     // Catch:{ all -> 0x002c }
            java.lang.Object r7 = r6.mo33377G(r7, r0)     // Catch:{ all -> 0x002c }
            if (r7 != r1) goto L_0x006b
            return r1
        L_0x006b:
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x002c }
            goto L_0x0081
        L_0x0072:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0081
        L_0x007d:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33400x(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[SYNTHETIC, Splitter:B:29:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33401y(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCode$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCode$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCode$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x002f }
            goto L_0x0093
        L_0x002f:
            r7 = move-exception
            goto L_0x009a
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x007d
        L_0x0047:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0064
        L_0x0055:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo33397u(r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r6
        L_0x0064:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r7)
            if (r5 != 0) goto L_0x00a5
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r5 = r2.f34098a
            java.lang.String r7 = r7.mo116822G()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r5.mo32791k(r7, r0)
            if (r7 != r1) goto L_0x007d
            return r1
        L_0x007d:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x00a0
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x002f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x002f }
            r4 = 0
            r0.L$0 = r4     // Catch:{ all -> 0x002f }
            r0.label = r3     // Catch:{ all -> 0x002f }
            java.lang.Object r7 = r2.mo33377G(r7, r0)     // Catch:{ all -> 0x002f }
            if (r7 != r1) goto L_0x0093
            return r1
        L_0x0093:
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7     // Catch:{ all -> 0x002f }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x002f }
            goto L_0x00a4
        L_0x009a:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
        L_0x00a0:
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x00a4:
            return r7
        L_0x00a5:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33401y(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33402z(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCodeByReference$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCodeByReference$1 r0 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCodeByReference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCodeByReference$1 r0 = new com.carrefour.fid.android.basket.domain.repositories.BasketRepository$removePromotionCodeByReference$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0034 }
            goto L_0x0082
        L_0x0034:
            r8 = move-exception
            goto L_0x008d
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r2 = (com.carrefour.fid.android.basket.domain.repositories.BasketRepository) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0067
        L_0x0050:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r8 = r6.f34098a
            java.lang.String r2 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156093b(r7)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo32791k(r2, r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r6
        L_0x0067:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)
            if (r4 != 0) goto L_0x00d0
            java.util.List r8 = (java.util.List) r8
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0088 }
            r0.L$0 = r7     // Catch:{ all -> 0x0088 }
            r0.L$1 = r8     // Catch:{ all -> 0x0088 }
            r0.label = r3     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r2.mo33377G(r8, r0)     // Catch:{ all -> 0x0088 }
            if (r0 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L_0x0082:
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8     // Catch:{ all -> 0x0034 }
            kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0034 }
            goto L_0x0096
        L_0x0088:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L_0x008d:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            kotlin.Result.m38702b(r8)
        L_0x0096:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x009c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b4
            java.lang.Object r8 = r7.next()
            r1 = r8
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.String r1 = r1.mo116822G()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r1 == 0) goto L_0x009c
            goto L_0x00b5
        L_0x00b4:
            r8 = 0
        L_0x00b5:
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            if (r8 != 0) goto L_0x00c9
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyBasketThrowable r7 = new com.carrefour.fid.android.shared.io.EmptyBasketThrowable
            r7.<init>()
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x00c9:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r8)
            return r7
        L_0x00d0:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository.mo33402z(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
