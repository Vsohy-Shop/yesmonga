package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37554a;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.basket.C37591o0;
import com.carrefour.fid.android.domain.interactors.basket.C37597s;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketUpdateBasketUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketUpdateBasketUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketUpdateBasketUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n288#2,2:95\n*S KotlinDebug\n*F\n+ 1 BasketUpdateBasketUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketUpdateBasketUseCase\n*L\n76#1:95,2\n*E\n"})
public final class BasketUpdateBasketUseCase implements C37591o0 {
    @C12579k

    /* renamed from: a */
    public final C37588n0 f33896a;
    @C12579k

    /* renamed from: b */
    public final C37597s f33897b;
    @C12579k

    /* renamed from: c */
    public final C37554a f33898c;
    @C12579k

    /* renamed from: d */
    public final InitializeBasketUseCase f33899d;
    @C12579k

    /* renamed from: e */
    public final InitializeNonFoodBasketUseCase f33900e;
    @C12579k

    /* renamed from: f */
    public final BasketRepository f33901f;

    @Inject
    public BasketUpdateBasketUseCase(@C12579k C37588n0 n0Var, @C12579k C37597s sVar, @C12579k C37554a aVar, @C12579k InitializeBasketUseCase initializeBasketUseCase, @C12579k InitializeNonFoodBasketUseCase initializeNonFoodBasketUseCase, @C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(n0Var, "updateBasketContentUseCase");
        Intrinsics.checkNotNullParameter(sVar, "handleBasketErrorUseCase");
        Intrinsics.checkNotNullParameter(aVar, "addOneMoreItemHomeDeliveryNalBasket");
        Intrinsics.checkNotNullParameter(initializeBasketUseCase, "initializeBasketUseCase");
        Intrinsics.checkNotNullParameter(initializeNonFoodBasketUseCase, "initializeNonFoodBasketUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33896a = n0Var;
        this.f33897b = sVar;
        this.f33898c = aVar;
        this.f33899d = initializeBasketUseCase;
        this.f33900e = initializeNonFoodBasketUseCase;
        this.f33901f = basketRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33289c(com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a r6, kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0084
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.o0$a r6 = (com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.mo33291e(r6, r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r5
        L_0x005d:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x007a
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            com.carrefour.fid.android.domain.interactors.basket.s r2 = r2.f33897b
            com.carrefour.fid.android.domain.interactors.basket.s$a r4 = new com.carrefour.fid.android.domain.interactors.basket.s$a
            r4.<init>(r6, r7)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r2.m172966invokegIAlus(r4, r0)
            if (r6 != r1) goto L_0x0084
            return r1
        L_0x007a:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase.mo33289c(com.carrefour.fid.android.domain.interactors.basket.o0$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        r4 = kotlin.Result.m38705e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (r4 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        r2 = r2.f33897b;
        r4 = new com.carrefour.fid.android.domain.interactors.basket.C37597s.C37598a(r6, (com.carrefour.fid.android.domain.models.basket.Basket) r7);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 2;
        r6 = r2.m172966invokegIAlus(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r6 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        if ((r4 instanceof com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        r7 = r2.f33899d;
        r0.L$0 = r2;
        r0.L$1 = r6;
        r0.label = 3;
        r7 = r7.m172786invokeIoAF18A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (r7 != r1) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r4 = kotlin.Result.m38705e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r4 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 4;
        r6 = r2.mo33289c(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c4, code lost:
        if (r6 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        if ((r4 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        r7 = r2.f33900e;
        r0.L$0 = r2;
        r0.L$1 = r6;
        r0.label = 5;
        r7 = r7.m172787invokeIoAF18A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        if (r7 != r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00db, code lost:
        r4 = kotlin.Result.m38705e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 6;
        r6 = r2.mo33289c(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (r6 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r6 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        r6 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        r6 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(r4));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172770invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x006e;
                case 1: goto L_0x005c;
                case 2: goto L_0x0051;
                case 3: goto L_0x003f;
                case 4: goto L_0x0051;
                case 5: goto L_0x002c;
                case 6: goto L_0x0051;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002c:
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.o0$a r6 = (com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x00db
        L_0x003f:
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.o0$a r6 = (com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x00b1
        L_0x0051:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0111
        L_0x005c:
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.o0$a r6 = (com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0080
        L_0x006e:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r7 = 1
            r0.label = r7
            java.lang.Object r7 = r5.mo33291e(r6, r0)
            if (r7 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r2 = r5
        L_0x0080:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x009d
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            com.carrefour.fid.android.domain.interactors.basket.s r2 = r2.f33897b
            com.carrefour.fid.android.domain.interactors.basket.s$a r4 = new com.carrefour.fid.android.domain.interactors.basket.s$a
            r4.<init>(r6, r7)
            r0.L$0 = r3
            r0.L$1 = r3
            r6 = 2
            r0.label = r6
            java.lang.Object r6 = r2.m172966invokegIAlus(r4, r0)
            if (r6 != r1) goto L_0x0111
            return r1
        L_0x009d:
            boolean r7 = r4 instanceof com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable
            if (r7 == 0) goto L_0x0107
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase r7 = r2.f33899d
            r0.L$0 = r2
            r0.L$1 = r6
            r4 = 3
            r0.label = r4
            java.lang.Object r7 = r7.m172786invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x00c7
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            r0.L$0 = r3
            r0.L$1 = r3
            r7 = 4
            r0.label = r7
            java.lang.Object r6 = r2.mo33289c(r6, r0)
            if (r6 != r1) goto L_0x0111
            return r1
        L_0x00c7:
            boolean r7 = r4 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r7 == 0) goto L_0x00fc
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase r7 = r2.f33900e
            r0.L$0 = r2
            r0.L$1 = r6
            r4 = 5
            r0.label = r4
            java.lang.Object r7 = r7.m172787invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x00db
            return r1
        L_0x00db:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x00f1
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            r0.L$0 = r3
            r0.L$1 = r3
            r7 = 6
            r0.label = r7
            java.lang.Object r6 = r2.mo33289c(r6, r0)
            if (r6 != r1) goto L_0x0111
            return r1
        L_0x00f1:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0111
        L_0x00fc:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0111
        L_0x0107:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0111:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase.m172770invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.o0$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33291e(com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a r9, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$updateBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$updateBasket$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$updateBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$updateBasket$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase$updateBasket$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x00d0
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x0067
        L_0x0045:
            kotlin.C11661u0.m45747n(r10)
            boolean r10 = r9.mo114435p()
            r2 = 0
            if (r10 == 0) goto L_0x0068
            com.carrefour.fid.android.domain.interactors.basket.a r10 = r8.f33898c
            com.carrefour.fid.android.domain.interactors.basket.a$a r3 = new com.carrefour.fid.android.domain.interactors.basket.a$a
            java.lang.String r5 = r9.mo114430k()
            java.lang.String r9 = r9.mo114429j()
            r3.<init>(r5, r9, r2)
            r0.label = r4
            java.lang.Object r9 = r10.m172966invokegIAlus(r3, r0)
            if (r9 != r1) goto L_0x0067
            return r1
        L_0x0067:
            return r9
        L_0x0068:
            int r10 = r9.mo114433n()
            if (r10 != 0) goto L_0x00b4
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r10 = r8.f33901f
            kotlinx.coroutines.flow.u r10 = r10.mo33391o()
            java.lang.Object r10 = r10.getValue()
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10
            if (r10 == 0) goto L_0x00aa
            java.util.List r10 = r10.mo116817B()
            if (r10 == 0) goto L_0x00aa
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0088:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00a8
            java.lang.Object r5 = r10.next()
            r6 = r5
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r6.mo118001J()
            java.lang.String r6 = r6.mo118136f()
            java.lang.String r7 = r9.mo114430k()
            boolean r6 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r6, r7)
            if (r6 == 0) goto L_0x0088
            r2 = r5
        L_0x00a8:
            com.carrefour.fid.android.domain.models.offer.Offer r2 = (com.carrefour.fid.android.domain.models.offer.Offer) r2
        L_0x00aa:
            if (r2 == 0) goto L_0x00b1
            int r10 = r2.mo118012U()
            goto L_0x00b2
        L_0x00b1:
            r10 = 0
        L_0x00b2:
            int r10 = r10 + r4
            goto L_0x00b8
        L_0x00b4:
            int r10 = r9.mo114433n()
        L_0x00b8:
            com.carrefour.fid.android.domain.interactors.basket.n0 r2 = r8.f33896a
            com.carrefour.fid.android.domain.interactors.basket.n0$a r4 = new com.carrefour.fid.android.domain.interactors.basket.n0$a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r5 = r9.mo114432m()
            boolean r9 = r9.mo114434o()
            r4.<init>(r5, r10, r9)
            r0.label = r3
            java.lang.Object r9 = r2.m172966invokegIAlus(r4, r0)
            if (r9 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase.mo33291e(com.carrefour.fid.android.domain.interactors.basket.o0$a, kotlin.coroutines.c):java.lang.Object");
    }
}
