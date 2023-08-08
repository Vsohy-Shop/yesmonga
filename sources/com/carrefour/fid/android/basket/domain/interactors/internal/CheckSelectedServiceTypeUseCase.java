package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37573h;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class CheckSelectedServiceTypeUseCase implements C37678e<C11079d2> {
    @C12579k

    /* renamed from: a */
    public final C13924e f33955a;
    @C12579k

    /* renamed from: b */
    public final C37566e0 f33956b;
    @C12579k

    /* renamed from: c */
    public final BasketRepository f33957c;
    @C12579k

    /* renamed from: d */
    public final C37823k f33958d;
    @C12579k

    /* renamed from: e */
    public final C37573h f33959e;

    @Inject
    public CheckSelectedServiceTypeUseCase(@C12579k C13924e eVar, @C12579k C37566e0 e0Var, @C12579k BasketRepository basketRepository, @C12579k C37823k kVar, @C12579k C37573h hVar) {
        Intrinsics.checkNotNullParameter(eVar, "getBasketTypeUseCase");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(hVar, "clearBasketCacheUseCase");
        this.f33955a = eVar;
        this.f33956b = e0Var;
        this.f33957c = basketRepository;
        this.f33958d = kVar;
        this.f33959e = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015b A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0160 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0163 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0164 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0175 A[Catch:{ all -> 0x0058 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172781invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase$invoke$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x009b
            if (r2 == r8) goto L_0x008c
            if (r2 == r7) goto L_0x0076
            if (r2 == r6) goto L_0x005b
            if (r2 == r5) goto L_0x0046
            if (r2 != r4) goto L_0x003e
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x0058 }
            kotlin.Result r13 = (kotlin.Result) r13     // Catch:{ all -> 0x0058 }
            r13.mo21858l()     // Catch:{ all -> 0x0058 }
            goto L_0x0176
        L_0x003e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0046:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x0058 }
            kotlin.Result r13 = (kotlin.Result) r13     // Catch:{ all -> 0x0058 }
            r13.mo21858l()     // Catch:{ all -> 0x0058 }
            goto L_0x0153
        L_0x0058:
            r13 = move-exception
            goto L_0x017d
        L_0x005b:
            java.lang.Object r2 = r0.L$3
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = (com.carrefour.fid.android.domain.models.basket.BasketType) r2
            java.lang.Object r6 = r0.L$2
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r6 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r6
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase r8 = (com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase) r8
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x00f9
        L_0x0076:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r2 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r2
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase r8 = (com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase) r8
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x00d9
        L_0x008c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            r8 = r2
            goto L_0x00ac
        L_0x009b:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.domain.interactors.service.k r13 = r12.f33958d
            r0.L$0 = r12
            r0.label = r8
            java.lang.Object r13 = r13.m172965invokeIoAF18A(r0)
            if (r13 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            r8 = r12
        L_0x00ac:
            boolean r2 = kotlin.Result.m38709i(r13)
            if (r2 == 0) goto L_0x00b3
            r13 = r9
        L_0x00b3:
            com.carrefour.fid.android.domain.models.service.models.k r13 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r13
            if (r13 == 0) goto L_0x01a3
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r13.mo119354f()
            if (r2 == 0) goto L_0x01a3
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r2 = r2.mo119176T()
            if (r2 != 0) goto L_0x00c5
            goto L_0x01a3
        L_0x00c5:
            com.carrefour.fid.android.basket.domain.interactors.internal.e r10 = r8.f33955a
            r0.L$0 = r8
            r0.L$1 = r13
            r0.L$2 = r2
            r0.label = r7
            java.lang.Object r7 = r10.m172791invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r11 = r7
            r7 = r13
            r13 = r11
        L_0x00d9:
            boolean r10 = kotlin.Result.m38709i(r13)
            if (r10 == 0) goto L_0x00e0
            r13 = r9
        L_0x00e0:
            com.carrefour.fid.android.domain.models.basket.BasketType r13 = (com.carrefour.fid.android.domain.models.basket.BasketType) r13
            com.carrefour.fid.android.domain.interactors.basket.e0 r10 = r8.f33956b
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r2
            r0.L$3 = r13
            r0.label = r6
            java.lang.Object r6 = r10.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x00f5
            return r1
        L_0x00f5:
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r11
        L_0x00f9:
            boolean r10 = kotlin.Result.m38709i(r13)
            if (r10 == 0) goto L_0x0100
            r13 = r9
        L_0x0100:
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
            java.util.Map r10 = com.carrefour.fid.android.domain.models.basket.C37969b.m156161a()
            java.lang.Object r2 = r10.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0112
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0112:
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x0191
            if (r13 == 0) goto L_0x0188
            java.lang.String r13 = r13.mo116859z()
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r7.mo119354f()
            if (r2 == 0) goto L_0x0129
            java.lang.String r2 = r2.mo119163G()
            goto L_0x012a
        L_0x0129:
            r2 = r9
        L_0x012a:
            if (r2 != 0) goto L_0x012d
            r2 = r3
        L_0x012d:
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r2)
            java.lang.String r2 = com.carrefour.fid.android.basket.domain.models.extension.C13970b.m59184a(r2)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r2)
            if (r13 == 0) goto L_0x013c
            goto L_0x0188
        L_0x013c:
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ all -> 0x0058 }
            com.carrefour.fid.android.domain.interactors.basket.h r13 = r8.f33959e     // Catch:{ all -> 0x0058 }
            r0.L$0 = r7     // Catch:{ all -> 0x0058 }
            r0.L$1 = r8     // Catch:{ all -> 0x0058 }
            r0.L$2 = r9     // Catch:{ all -> 0x0058 }
            r0.L$3 = r9     // Catch:{ all -> 0x0058 }
            r0.label = r5     // Catch:{ all -> 0x0058 }
            java.lang.Object r13 = r13.m172965invokeIoAF18A(r0)     // Catch:{ all -> 0x0058 }
            if (r13 != r1) goto L_0x0151
            return r1
        L_0x0151:
            r5 = r7
            r2 = r8
        L_0x0153:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r13 = r2.f33957c     // Catch:{ all -> 0x0058 }
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r5.mo119354f()     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0160
            java.lang.String r2 = r2.mo119163G()     // Catch:{ all -> 0x0058 }
            goto L_0x0161
        L_0x0160:
            r2 = r9
        L_0x0161:
            if (r2 != 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r3 = r2
        L_0x0165:
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r3)     // Catch:{ all -> 0x0058 }
            r0.L$0 = r9     // Catch:{ all -> 0x0058 }
            r0.L$1 = r9     // Catch:{ all -> 0x0058 }
            r0.label = r4     // Catch:{ all -> 0x0058 }
            java.lang.Object r13 = r13.mo33374D(r2, r0)     // Catch:{ all -> 0x0058 }
            if (r13 != r1) goto L_0x0176
            return r1
        L_0x0176:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0058 }
            java.lang.Object r13 = kotlin.Result.m38702b(r13)     // Catch:{ all -> 0x0058 }
            goto L_0x0190
        L_0x017d:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            goto L_0x0190
        L_0x0188:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
        L_0x0190:
            return r13
        L_0x0191:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Throwable r13 = new java.lang.Throwable
            java.lang.String r0 = "Unknown service type"
            r13.<init>(r0)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        L_0x01a3:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase.m172781invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
