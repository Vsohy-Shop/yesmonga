package com.carrefour.fid.android.basket.data.api.datasources;

import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketListResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.BasketResponseKt;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension.C13875b;
import com.carrefour.fid.android.basket.data.api.services.C13881a;
import com.carrefour.fid.android.domain.exceptions.BasketAddPromotionThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketRemovePromotionThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketSlotOutdatedThrowable;
import com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.exceptions.WrongFacilityServiceThrowable;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import com.carrefour.fid.android.shared.network.C28801b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13091w;

@C11363r0({"SMAP\nBasketApiDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketApiDataSource.kt\ncom/carrefour/fid/android/basket/data/api/datasources/BasketApiDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,335:1\n1549#2:336\n1620#2,3:337\n1549#2:340\n1620#2,3:341\n*S KotlinDebug\n*F\n+ 1 BasketApiDataSource.kt\ncom/carrefour/fid/android/basket/data/api/datasources/BasketApiDataSource\n*L\n197#1:336\n197#1:337,3\n306#1:340\n306#1:341,3\n*E\n"})
public final class BasketApiDataSource {
    @C12579k

    /* renamed from: a */
    public final C13881a f33827a;
    @C12579k

    /* renamed from: b */
    public final C28801b f33828b;

    @Inject
    public BasketApiDataSource(@C12579k C13881a aVar, @C12579k C28801b bVar) {
        Intrinsics.checkNotNullParameter(aVar, "service");
        Intrinsics.checkNotNullParameter(bVar, "basketHeadersProvider");
        this.f33827a = aVar;
        this.f33828b = bVar;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m58835i(BasketApiDataSource basketApiDataSource, C13091w wVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = new String();
        }
        return basketApiDataSource.mo32789h(wVar, str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32783b(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$addPromotionCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$addPromotionCode$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$addPromotionCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$addPromotionCode$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$addPromotionCode$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.L$2
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005e
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.data.api.services.a r8 = r5.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r5.f33828b
            java.util.Map r2 = r2.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.AddPromoRequest r4 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.AddPromoRequest
            r4.<init>(r6, r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r8.mo33220m(r2, r4, r0)
            if (r8 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r5
        L_0x005e:
            retrofit2.w r8 = (retrofit2.C13091w) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error adding promo code '"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = "' to basket '"
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = "'"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.Object r6 = r0.mo32789h(r8, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32783b(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32784c(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$bookSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$bookSlot$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$bookSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$bookSlot$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$bookSlot$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.data.api.datasources.SlotAction r7 = com.carrefour.fid.android.basket.data.api.datasources.SlotAction.BOOK
            r0.label = r3
            java.lang.Object r5 = r4.mo32798r(r5, r6, r7, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32784c(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32785d(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteBasket$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteBasket$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteBasket$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0052
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.data.api.services.a r6 = r4.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r4.f33828b
            java.util.Map r2 = r2.getHeaders()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo33215h(r2, r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r4
        L_0x0052:
            retrofit2.w r6 = (retrofit2.C13091w) r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error deleting basket '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r5 = r0.mo32789h(r6, r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32785d(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32786e(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k java.lang.String r9, boolean r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteOfferFromBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteOfferFromBasket$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteOfferFromBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteOfferFromBasket$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteOfferFromBasket$1
            r0.<init>(r7, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            java.lang.Object r8 = r6.L$2
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r6.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r10 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x005e
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.basket.data.api.services.a r1 = r7.f33827a
            com.carrefour.fid.android.shared.network.b r11 = r7.f33828b
            java.util.Map r11 = r11.getHeaders()
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r9
            r6.label = r2
            r2 = r11
            r3 = r9
            r4 = r8
            r5 = r10
            java.lang.Object r11 = r1.mo33213f(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x005d
            return r0
        L_0x005d:
            r10 = r7
        L_0x005e:
            retrofit2.w r11 = (retrofit2.C13091w) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error deleting offer '"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = "' from basket '"
            r0.append(r9)
            r0.append(r8)
            java.lang.String r9 = "'"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.Object r8 = r10.mo32789h(r11, r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32786e(java.lang.String, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32787f(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteYieldFees$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteYieldFees$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteYieldFees$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteYieldFees$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$deleteYieldFees$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.data.api.services.a r7 = r6.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r6.f33828b
            java.util.Map r2 = r2.getHeaders()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.mo33216i(r2, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r6
        L_0x004c:
            r1 = r7
            retrofit2.w r1 = (retrofit2.C13091w) r1
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.lang.Object r7 = m58835i(r0, r1, r2, r3, r4, r5)
            java.lang.Throwable r0 = kotlin.Result.m38705e(r7)
            if (r0 != 0) goto L_0x0066
            java.util.List r7 = (java.util.List) r7
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x0072
        L_0x0066:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable r7 = com.carrefour.fid.android.domain.exceptions.BasketYieldFeesThrowable.f94239a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x0072:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32787f(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32788g(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$getBasketList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$getBasketList$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$getBasketList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$getBasketList$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$getBasketList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.basket.data.api.services.a r5 = r4.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r4.f33828b
            java.util.Map r2 = r2.getHeaders()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo33214g(r2, r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            retrofit2.w r5 = (retrofit2.C13091w) r5
            r1 = 0
            java.lang.String r2 = "Error getting basket list."
            java.lang.Object r5 = r0.mo32789h(r5, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32788g(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final Object mo32789h(C13091w<BasketListResponse> wVar, String str, String str2) {
        Throwable th;
        List list;
        BasketListResponse a = wVar.mo30572a();
        if (!wVar.mo30576g() || a == null) {
            int a2 = BasketResponseKt.m58857a(wVar);
            if (a2 != 1) {
                if (a2 == 2) {
                    th = BasketClosedStoreThrowable.f94229a;
                } else if (a2 == 1103) {
                    th = ExpiredBasketThrowable.f94240a;
                } else if (a2 == 1142) {
                    th = WrongFacilityServiceThrowable.f94244a;
                } else if (a2 == 1152) {
                    th = BasketNotFoundThrowable.f94236a;
                } else if (a2 == 1170) {
                    String h = wVar.mo30577h();
                    Intrinsics.checkNotNullExpressionValue(h, "response.message()");
                    th = new BasketSlotOutdatedThrowable(h);
                } else if (a2 == 1180) {
                    th = BasketAddPromotionThrowable.f94228a;
                } else if (a2 != 1181) {
                    th = C28639a.m118565d(wVar, str2);
                } else {
                    th = BasketRemovePromotionThrowable.f94237a;
                }
            } else if (str != null) {
                th = BasketExpiredFacilityStoreIdThrowable.f94234a;
            } else {
                th = RequireServiceSelectionThrowable.f94243a;
            }
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(th));
        }
        Result.C10852a aVar2 = Result.f28060a;
        Iterable baskets = a.getBaskets();
        if (baskets != null) {
            Iterable<BasketResponse> iterable = baskets;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BasketResponse o : iterable) {
                list.add(C13875b.m58876o(o));
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return Result.m38702b(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32790j(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$initializeBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$initializeBasket$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$initializeBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$initializeBasket$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$initializeBasket$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0055
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.data.api.services.a r7 = r5.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r5.f33828b
            java.util.Map r2 = r2.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.FacilityServiceRequest r4 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.FacilityServiceRequest
            java.lang.String r6 = com.carrefour.fid.android.basket.domain.models.extension.C13970b.m59184a(r6)
            r4.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.mo33217j(r2, r4, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r5
        L_0x0055:
            retrofit2.w r7 = (retrofit2.C13091w) r7
            r0 = 0
            java.lang.String r1 = "Cannot init basket."
            java.lang.Object r6 = r6.mo32789h(r7, r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32790j(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32791k(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$removePromotionCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$removePromotionCode$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$removePromotionCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$removePromotionCode$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$removePromotionCode$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0052
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.basket.data.api.services.a r6 = r4.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r4.f33828b
            java.util.Map r2 = r2.getHeaders()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo33210c(r2, r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r4
        L_0x0052:
            retrofit2.w r6 = (retrofit2.C13091w) r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error removing promo code from basket '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r5 = r0.mo32789h(r6, r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32791k(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32792l(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.delivery.DeliveryCode r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$setDeliveryType$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$setDeliveryType$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$setDeliveryType$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$setDeliveryType$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$setDeliveryType$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r6 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r6
            kotlin.C11661u0.m45747n(r9)
            goto L_0x005c
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.basket.data.api.services.a r9 = r5.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r5.f33828b
            java.util.Map r2 = r2.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.ShippingTypeRequest r4 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.ShippingTypeRequest
            java.lang.String r6 = r6.name()
            r4.<init>(r6, r7, r8)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r9 = r9.mo33209b(r2, r4, r0)
            if (r9 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r6 = r5
        L_0x005c:
            retrofit2.w r9 = (retrofit2.C13091w) r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Error setDeliveryType in basket '"
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = "'"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.Object r6 = r6.mo32789h(r9, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32792l(com.carrefour.fid.android.domain.models.delivery.DeliveryCode, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32793m(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12580l java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$switchFacilityService$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$switchFacilityService$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$switchFacilityService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$switchFacilityService$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$switchFacilityService$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r8 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r8
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.basket.data.api.services.a r10 = r7.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r7.f33828b
            java.util.Map r2 = r2.getHeaders()
            if (r9 != 0) goto L_0x004a
            r5 = r3
            goto L_0x004b
        L_0x004a:
            r5 = r9
        L_0x004b:
            java.lang.String r8 = com.carrefour.fid.android.basket.domain.models.extension.C13970b.m59184a(r8)
            com.carrefour.fid.android.basket.data.api.entities.v4.request.SwitchFacilityServiceRequest r6 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.SwitchFacilityServiceRequest
            r6.<init>(r8, r5)
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.mo33211d(r2, r6, r0)
            if (r10 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r8 = r7
        L_0x0062:
            retrofit2.w r10 = (retrofit2.C13091w) r10
            if (r9 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r3 = r9
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error switching facility id for basket '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r8 = r8.mo32789h(r10, r9, r0)
            java.lang.Throwable r9 = kotlin.Result.m38705e(r8)
            if (r9 != 0) goto L_0x0091
            java.util.List r8 = (java.util.List) r8
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00a0
        L_0x0091:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketFacilitySwitchThrowable r8 = new com.carrefour.fid.android.domain.exceptions.BasketFacilitySwitchThrowable
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32793m(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32794n(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12580l java.lang.String r9, @org.jetbrains.annotations.C12580l java.lang.String r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasket$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasket$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasket$1
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r9 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r9
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0066
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.basket.data.api.services.a r11 = r7.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r7.f33828b
            java.util.Map r2 = r2.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.SynchronizeBasketRequest r4 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.SynchronizeBasketRequest
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r8)
            if (r9 == 0) goto L_0x0054
            if (r10 == 0) goto L_0x0054
            com.carrefour.fid.android.basket.data.api.entities.v4.request.LoyaltyCardRequest r6 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.LoyaltyCardRequest
            r6.<init>(r9, r10)
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            r4.<init>(r5, r6)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r11 = r11.mo33208a(r2, r4, r0)
            if (r11 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r9 = r7
        L_0x0066:
            retrofit2.w r11 = (retrofit2.C13091w) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Error syncing basket.: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.Object r8 = r9.mo32789h(r11, r8, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32794n(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[LOOP:0: B:22:0x0076->B:24:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32795o(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r8, @org.jetbrains.annotations.C12580l java.lang.String r9, @org.jetbrains.annotations.C12580l java.lang.String r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasketsByReference$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasketsByReference$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasketsByReference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasketsByReference$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$synchronizeBasketsByReference$1
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r9 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r9
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0063
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.basket.data.api.services.a r11 = r7.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r7.f33828b
            java.util.Map r2 = r2.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.SynchronizeBasketRequest r5 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.SynchronizeBasketRequest
            if (r9 == 0) goto L_0x0051
            if (r10 == 0) goto L_0x0051
            com.carrefour.fid.android.basket.data.api.entities.v4.request.LoyaltyCardRequest r6 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.LoyaltyCardRequest
            r6.<init>(r9, r10)
            goto L_0x0052
        L_0x0051:
            r6 = r3
        L_0x0052:
            r5.<init>(r8, r6)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r11 = r11.mo33208a(r2, r5, r0)
            if (r11 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r9 = r7
        L_0x0063:
            retrofit2.w r11 = (retrofit2.C13091w) r11
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C10978t.m41495Y(r8, r0)
            r10.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x0076:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r10.add(r0)
            goto L_0x0076
        L_0x0086:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Error syncing basket.: "
            r8.append(r0)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r9.mo32789h(r11, r3, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32795o(java.util.List, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32796p(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$unbookSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$unbookSlot$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$unbookSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$unbookSlot$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$unbookSlot$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.basket.data.api.datasources.SlotAction r7 = com.carrefour.fid.android.basket.data.api.datasources.SlotAction.UNBOOK
            r0.label = r3
            java.lang.Object r5 = r4.mo32798r(r5, r6, r7, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32796p(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32797q(@org.jetbrains.annotations.C12580l java.lang.String r14, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.BasketType r15, @org.jetbrains.annotations.C12580l java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12580l java.lang.String r18, @org.jetbrains.annotations.C12580l java.lang.String r19, int r20, @org.jetbrains.annotations.C12580l java.lang.String r21, boolean r22, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r23) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = r19
            r3 = r23
            boolean r4 = r3 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateOfferInBasket$1
            if (r4 == 0) goto L_0x001a
            r4 = r3
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateOfferInBasket$1 r4 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateOfferInBasket$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x001f
        L_0x001a:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateOfferInBasket$1 r4 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateOfferInBasket$1
            r4.<init>(r13, r3)
        L_0x001f:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r6 = r4.label
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0042
            if (r6 != r7) goto L_0x003a
            java.lang.Object r1 = r4.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r2 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r2
            kotlin.C11661u0.m45747n(r3)
            goto L_0x009c
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            kotlin.C11661u0.m45747n(r3)
            com.carrefour.fid.android.basket.data.api.services.a r3 = r0.f33827a
            com.carrefour.fid.android.shared.network.b r6 = r0.f33828b
            java.util.Map r6 = r6.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.UpdateOfferRequest r9 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.UpdateOfferRequest
            if (r16 == 0) goto L_0x0056
            java.lang.String r10 = com.carrefour.fid.android.basket.domain.models.extension.C13970b.m59184a(r16)
            goto L_0x0057
        L_0x0056:
            r10 = r8
        L_0x0057:
            if (r10 != 0) goto L_0x005b
            java.lang.String r10 = ""
        L_0x005b:
            if (r1 == 0) goto L_0x0065
            if (r2 == 0) goto L_0x0065
            com.carrefour.fid.android.basket.data.api.entities.v4.request.LoyaltyCardRequest r11 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.LoyaltyCardRequest
            r11.<init>(r1, r2)
            goto L_0x0066
        L_0x0065:
            r11 = r8
        L_0x0066:
            com.carrefour.fid.android.basket.data.api.entities.v4.request.OfferRequest r1 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.OfferRequest
            r2 = r17
            r12 = r20
            r1.<init>(r2, r12)
            java.util.List r1 = kotlin.collections.C10976s.m41419k(r1)
            java.lang.String r2 = r15.mo117008q()
            if (r21 != 0) goto L_0x007b
            r12 = r8
            goto L_0x007d
        L_0x007b:
            r12 = r21
        L_0x007d:
            r15 = r9
            r16 = r10
            r17 = r11
            r18 = r1
            r19 = r22
            r20 = r2
            r21 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r4.L$0 = r0
            r1 = r14
            r4.L$1 = r1
            r4.label = r7
            java.lang.Object r3 = r3.mo33218k(r6, r9, r4)
            if (r3 != r5) goto L_0x009b
            return r5
        L_0x009b:
            r2 = r0
        L_0x009c:
            retrofit2.w r3 = (retrofit2.C13091w) r3
            if (r1 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r8 = r1
        L_0x00a2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error updateOffer basket '"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = "'"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r1 = r2.mo32789h(r3, r1, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32797q(java.lang.String, com.carrefour.fid.android.domain.models.basket.BasketType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32798r(java.lang.String r6, java.lang.String r7, com.carrefour.fid.android.basket.data.api.datasources.SlotAction r8, kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateSlot$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateSlot$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateSlot$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.L$2
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r8 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r8
            kotlin.C11661u0.m45747n(r9)
            goto L_0x006d
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.basket.data.api.services.a r9 = r5.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r5.f33828b
            java.util.Map r2 = r2.getHeaders()
            java.lang.String r8 = r8.name()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r4)
            java.lang.String r4 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            com.carrefour.fid.android.basket.data.api.entities.v4.request.BookUnBookSlotRequest r4 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.BookUnBookSlotRequest
            r4.<init>(r8, r6, r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r9 = r9.mo33212e(r2, r4, r0)
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r8 = r5
        L_0x006d:
            retrofit2.w r9 = (retrofit2.C13091w) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error booking|releasing '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "' slot for basket '"
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = "'"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.Object r6 = r8.mo32789h(r9, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32798r(java.lang.String, java.lang.String, com.carrefour.fid.android.basket.data.api.datasources.SlotAction, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32799s(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.slot.Slot r8, @org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.basket.Basket>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateYieldFees$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateYieldFees$1 r0 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateYieldFees$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateYieldFees$1 r0 = new com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource$updateYieldFees$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r8 = (com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource) r8
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0068
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.basket.data.api.services.a r10 = r7.f33827a
            com.carrefour.fid.android.shared.network.b r2 = r7.f33828b
            java.util.Map r2 = r2.getHeaders()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.BasketYieldFeesRequest r4 = new com.carrefour.fid.android.basket.data.api.entities.v4.request.BasketYieldFeesRequest
            java.lang.String r5 = r8.mo119508t()
            java.lang.Double r6 = r8.mo119512w()
            com.carrefour.fid.android.basket.data.api.entities.v4.request.YieldFeesAmountRequest r6 = com.carrefour.fid.android.basket.data.api.extension.C13878a.m58879a(r6)
            java.lang.String r8 = r8.mo119511v()
            r4.<init>(r5, r9, r6, r8)
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r10.mo33219l(r2, r4, r0)
            if (r10 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r8 = r7
        L_0x0068:
            retrofit2.w r10 = (retrofit2.C13091w) r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error updateYieldFees in basket '"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r8 = r8.mo32789h(r10, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource.mo32799s(com.carrefour.fid.android.domain.models.slot.Slot, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
