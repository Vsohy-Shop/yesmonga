package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.basket.C37570g;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketCheckSelectedServiceAndBasketSynchronicityUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketCheckSelectedServiceAndBasketSynchronicityUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/BasketCheckSelectedServiceAndBasketSynchronicityUseCase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n483#2,7:36\n1#3:43\n*S KotlinDebug\n*F\n+ 1 BasketCheckSelectedServiceAndBasketSynchronicityUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/BasketCheckSelectedServiceAndBasketSynchronicityUseCase\n*L\n25#1:36,7\n*E\n"})
public final class BasketCheckSelectedServiceAndBasketSynchronicityUseCase implements C37570g {
    @C12579k

    /* renamed from: a */
    public final C37823k f33952a;
    @C12579k

    /* renamed from: b */
    public final UpdateBasketTypeUseCase f33953b;
    @C12579k

    /* renamed from: c */
    public final CheckSelectedServiceTypeUseCase f33954c;

    @Inject
    public BasketCheckSelectedServiceAndBasketSynchronicityUseCase(@C12579k C37823k kVar, @C12579k UpdateBasketTypeUseCase updateBasketTypeUseCase, @C12579k CheckSelectedServiceTypeUseCase checkSelectedServiceTypeUseCase) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(updateBasketTypeUseCase, "updateBasketTypeUseCase");
        Intrinsics.checkNotNullParameter(checkSelectedServiceTypeUseCase, "checkSelectedServiceTypeUseCase");
        this.f33952a = kVar;
        this.f33953b = updateBasketTypeUseCase;
        this.f33954c = checkSelectedServiceTypeUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172780invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase$invoke$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x004f
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.basket.BasketType r0 = (com.carrefour.fid.android.domain.models.basket.BasketType) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            r10.mo21858l()
            goto L_0x00fb
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0041:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0081
        L_0x004f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x006e
        L_0x005d:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase r10 = r9.f33954c
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.m172781invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r9
        L_0x006e:
            boolean r10 = kotlin.Result.m38709i(r10)
            if (r10 == 0) goto L_0x0111
            com.carrefour.fid.android.domain.interactors.service.k r10 = r2.f33952a
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0081
            return r1
        L_0x0081:
            boolean r4 = kotlin.Result.m38709i(r10)
            r5 = 0
            if (r4 == 0) goto L_0x0089
            r10 = r5
        L_0x0089:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x0108
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            if (r10 == 0) goto L_0x0108
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r10 = r10.mo119176T()
            if (r10 != 0) goto L_0x009a
            goto L_0x0108
        L_0x009a:
            java.util.Map r4 = com.carrefour.fid.android.domain.models.basket.C37969b.m156161a()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ab:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00cf
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x00ab
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x00ab
        L_0x00cf:
            java.util.Set r10 = r6.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d7:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00ec
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            com.carrefour.fid.android.domain.models.basket.BasketType r4 = (com.carrefour.fid.android.domain.models.basket.BasketType) r4
            if (r4 == 0) goto L_0x00d7
            r5 = r4
        L_0x00ec:
            if (r5 == 0) goto L_0x00fb
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase r10 = r2.f33953b
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r10 = r10.m172790invokegIAlus(r5, r0)
            if (r10 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.FacilityIdSwitchNotNecessaryThrowable r10 = com.carrefour.fid.android.domain.exceptions.FacilityIdSwitchNotNecessaryThrowable.f94241a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        L_0x0108:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        L_0x0111:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase.m172780invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
