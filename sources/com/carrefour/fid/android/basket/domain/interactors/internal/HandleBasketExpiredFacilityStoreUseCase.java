package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nHandleBasketExpiredFacilityStoreUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandleBasketExpiredFacilityStoreUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/HandleBasketExpiredFacilityStoreUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1#2:42\n288#3,2:43\n*S KotlinDebug\n*F\n+ 1 HandleBasketExpiredFacilityStoreUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/HandleBasketExpiredFacilityStoreUseCase\n*L\n31#1:43,2\n*E\n"})
public final class HandleBasketExpiredFacilityStoreUseCase implements C37678e<Basket> {
    @C12579k

    /* renamed from: a */
    public final C37816e f33963a;
    @C12579k

    /* renamed from: b */
    public final C37823k f33964b;
    @C12579k

    /* renamed from: c */
    public final C37841v f33965c;
    @C12579k

    /* renamed from: d */
    public final C37578j0 f33966d;

    @Inject
    public HandleBasketExpiredFacilityStoreUseCase(@C12579k C37816e eVar, @C12579k C37823k kVar, @C12579k C37841v vVar, @C12579k C37578j0 j0Var) {
        Intrinsics.checkNotNullParameter(eVar, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(vVar, "updateStoreServiceUseCase");
        Intrinsics.checkNotNullParameter(j0Var, "switchFacilityServiceInBasketUseCase");
        this.f33963a = eVar;
        this.f33964b = kVar;
        this.f33965c = vVar;
        this.f33966d = j0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172785invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase$invoke$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0074
            if (r2 == r6) goto L_0x0066
            if (r2 == r4) goto L_0x0054
            if (r2 == r5) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0148
        L_0x003a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0042:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase r4 = (com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase) r4
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            r14.mo21858l()
            goto L_0x012d
        L_0x0054:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase r4 = (com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase) r4
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x00c0
        L_0x0066:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0085
        L_0x0074:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.interactors.service.k r14 = r13.f33964b
            r0.L$0 = r13
            r0.label = r6
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r2 = r13
        L_0x0085:
            com.carrefour.fid.android.domain.models.service.models.k r8 = new com.carrefour.fid.android.domain.models.service.models.k
            r8.<init>(r7, r7, r5, r7)
            boolean r9 = kotlin.Result.m38709i(r14)
            if (r9 == 0) goto L_0x0091
            r14 = r8
        L_0x0091:
            com.carrefour.fid.android.domain.models.service.models.k r14 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r14
            com.carrefour.fid.android.domain.models.service.models.l r8 = r14.mo119349a()
            com.carrefour.fid.android.domain.models.service.models.StoreService r14 = r14.mo119350b()
            if (r8 == 0) goto L_0x0156
            if (r14 != 0) goto L_0x00a1
            goto L_0x0156
        L_0x00a1:
            com.carrefour.fid.android.domain.interactors.service.e r9 = r2.f33963a
            java.lang.String r8 = r8.mo119393w()
            java.lang.String r8 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r8)
            com.carrefour.fid.android.domain.models.service.models.a r8 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r8)
            r0.L$0 = r2
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r4 = r9.m172966invokegIAlus(r8, r0)
            if (r4 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r12 = r2
            r2 = r14
            r14 = r4
            r4 = r12
        L_0x00c0:
            boolean r8 = kotlin.Result.m38710j(r14)
            if (r8 == 0) goto L_0x00ce
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.l r14 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r14
            java.util.List r14 = r14.mo119367K()
        L_0x00ce:
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            boolean r8 = kotlin.Result.m38709i(r14)
            if (r8 == 0) goto L_0x00d9
            r14 = r7
        L_0x00d9:
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x0149
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x00e3:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x0112
            java.lang.Object r8 = r14.next()
            r9 = r8
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r9
            java.lang.String r10 = r9.mo119167K()
            java.lang.String r11 = r2.mo119167K()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x010e
            java.lang.String r9 = r9.mo119175S()
            java.lang.String r10 = r2.mo119175S()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x010e
            r9 = r6
            goto L_0x010f
        L_0x010e:
            r9 = 0
        L_0x010f:
            if (r9 == 0) goto L_0x00e3
            goto L_0x0113
        L_0x0112:
            r8 = r7
        L_0x0113:
            r2 = r8
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            if (r2 != 0) goto L_0x0119
            goto L_0x0149
        L_0x0119:
            com.carrefour.fid.android.domain.interactors.service.v r14 = r4.f33965c
            com.carrefour.fid.android.domain.interactors.service.v$a r6 = new com.carrefour.fid.android.domain.interactors.service.v$a
            r6.<init>(r2)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r14 = r14.m172966invokegIAlus(r6, r0)
            if (r14 != r1) goto L_0x012d
            return r1
        L_0x012d:
            com.carrefour.fid.android.domain.interactors.basket.j0 r14 = r4.f33966d
            java.lang.String r2 = r2.mo119163G()
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r2)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r2 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r2)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r14 = r14.m172966invokegIAlus(r2, r0)
            if (r14 != r1) goto L_0x0148
            return r1
        L_0x0148:
            return r14
        L_0x0149:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable r14 = com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable.f94234a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        L_0x0156:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r14 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase.m172785invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
