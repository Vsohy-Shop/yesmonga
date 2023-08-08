package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.FetchBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nStdRetrieveBasketUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StdRetrieveBasketUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/standard/StdRetrieveBasketUseCase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n483#2,7:53\n1#3:60\n*S KotlinDebug\n*F\n+ 1 StdRetrieveBasketUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/standard/StdRetrieveBasketUseCase\n*L\n47#1:53,7\n*E\n"})
public final class StdRetrieveBasketUseCase implements C37569f0 {
    @C12579k

    /* renamed from: a */
    public final FetchBasketUseCase f34052a;
    @C12579k

    /* renamed from: b */
    public final InitializeBasketUseCase f34053b;
    @C12579k

    /* renamed from: c */
    public final C37823k f34054c;
    @C12579k

    /* renamed from: d */
    public final UpdateBasketTypeUseCase f34055d;

    @Inject
    public StdRetrieveBasketUseCase(@C12579k FetchBasketUseCase fetchBasketUseCase, @C12579k InitializeBasketUseCase initializeBasketUseCase, @C12579k C37823k kVar, @C12579k UpdateBasketTypeUseCase updateBasketTypeUseCase) {
        Intrinsics.checkNotNullParameter(fetchBasketUseCase, "fetchBasketUseCase");
        Intrinsics.checkNotNullParameter(initializeBasketUseCase, "initializeBasketUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(updateBasketTypeUseCase, "updateBasketTypeUseCase");
        this.f34052a = fetchBasketUseCase;
        this.f34053b = initializeBasketUseCase;
        this.f34054c = kVar;
        this.f34055d = updateBasketTypeUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33355c(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$setBasketTypeForSelectedService$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$setBasketTypeForSelectedService$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$setBasketTypeForSelectedService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$setBasketTypeForSelectedService$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$setBasketTypeForSelectedService$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.basket.BasketType r0 = (com.carrefour.fid.android.domain.models.basket.BasketType) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            r10.mo21858l()
            goto L_0x00d7
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.interactors.service.k r10 = r9.f34054c
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r9
        L_0x005d:
            boolean r4 = kotlin.Result.m38709i(r10)
            r5 = 0
            if (r4 == 0) goto L_0x0065
            r10 = r5
        L_0x0065:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x00da
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            if (r10 == 0) goto L_0x00da
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r10 = r10.mo119176T()
            if (r10 != 0) goto L_0x0076
            goto L_0x00da
        L_0x0076:
            java.util.Map r4 = com.carrefour.fid.android.domain.models.basket.C37969b.m156161a()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0087:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x0087
        L_0x00ab:
            java.util.Set r10 = r6.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b3:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00c8
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            com.carrefour.fid.android.domain.models.basket.BasketType r4 = (com.carrefour.fid.android.domain.models.basket.BasketType) r4
            if (r4 == 0) goto L_0x00b3
            r5 = r4
        L_0x00c8:
            if (r5 == 0) goto L_0x00d7
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase r10 = r2.f34055d
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r10 = r10.m172790invokegIAlus(r5, r0)
            if (r10 != r1) goto L_0x00d7
            return r1
        L_0x00d7:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00da:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase.mo33355c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172795invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x00a3
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x006f
        L_0x004b:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0062
        L_0x0053:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo33355c(r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r2 = r6
        L_0x0062:
            com.carrefour.fid.android.basket.domain.interactors.internal.FetchBasketUseCase r7 = r2.f34052a
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.m172783invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x006f
            return r1
        L_0x006f:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x007e
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x007e:
            boolean r7 = r4 instanceof com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable
            if (r7 == 0) goto L_0x0083
            goto L_0x0089
        L_0x0083:
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r7 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
        L_0x0089:
            if (r5 == 0) goto L_0x0099
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase r7 = r2.f34053b
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.m172786invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x00a3
            return r1
        L_0x0099:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x00a3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase.m172795invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
