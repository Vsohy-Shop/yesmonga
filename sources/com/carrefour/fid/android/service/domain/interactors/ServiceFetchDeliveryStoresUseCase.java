package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "Lcom/carrefour/fid/android/domain/interactors/service/b$a;", "param", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/service/b$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "storeFacilityRepository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceFetchDeliveryStoresUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceFetchDeliveryStoresUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1549#2:68\n1620#2,2:69\n819#2:71\n847#2,2:72\n1622#2:74\n*S KotlinDebug\n*F\n+ 1 ServiceFetchDeliveryStoresUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase\n*L\n30#1:68\n30#1:69,2\n32#1:71\n32#1:72,2\n30#1:74\n*E\n"})
public final class ServiceFetchDeliveryStoresUseCase implements C37812b {
    /* access modifiers changed from: private */
    @C12579k
    public final StoreFacilityRepository storeFacilityRepository;

    @Inject
    public ServiceFetchDeliveryStoresUseCase(@C12579k StoreFacilityRepository storeFacilityRepository2) {
        Intrinsics.checkNotNullParameter(storeFacilityRepository2, "storeFacilityRepository");
        this.storeFacilityRepository = storeFacilityRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172842invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.C37812b.C37813a r38, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r39
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$1 r2 = (com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$1 r2 = new com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r14 = 2
            r4 = 1
            if (r3 == 0) goto L_0x004e
            if (r3 == r4) goto L_0x0039
            if (r3 != r14) goto L_0x0031
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0130
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.interactors.service.b$a r3 = (com.carrefour.fid.android.domain.interactors.service.C37812b.C37813a) r3
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase r4 = (com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r5 = r4
            r4 = r1
            r1 = r14
            goto L_0x0089
        L_0x004e:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r3 = r0.storeFacilityRepository
            double r5 = r38.mo115223k()
            double r7 = r38.mo115224l()
            int r1 = r38.mo115226n()
            boolean r9 = r38.mo115230r()
            boolean r10 = r38.mo115229q()
            int r12 = r38.mo115228p()
            int r13 = r38.mo115225m()
            r2.L$0 = r0
            r11 = r38
            r2.L$1 = r11
            r2.label = r4
            r4 = r5
            r6 = r7
            r8 = r1
            r1 = 0
            r11 = r1
            r1 = r14
            r14 = r2
            java.lang.Object r3 = r3.m172881fetchStoreFacilitiesByCoordinatestZkwj4A(r4, r6, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r15) goto L_0x0085
            return r15
        L_0x0085:
            r5 = r0
            r4 = r3
            r3 = r38
        L_0x0089:
            boolean r6 = kotlin.Result.m38710j(r4)
            if (r6 == 0) goto L_0x013c
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.m r4 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r4
            boolean r3 = r3.mo115227o()
            if (r3 == 0) goto L_0x0117
            java.util.List r3 = r4.mo119402d()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.C10978t.m41495Y(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x00ae:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0113
            java.lang.Object r7 = r3.next()
            r16 = r7
            com.carrefour.fid.android.domain.models.service.models.l r16 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            java.util.List r7 = r16.mo119367K()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00df:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00f6
            java.lang.Object r9 = r7.next()
            r10 = r9
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r10
            boolean r10 = r10.mo119183a0()
            if (r10 != 0) goto L_0x00df
            r8.add(r9)
            goto L_0x00df
        L_0x00f6:
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 261119(0x3fbff, float:3.65906E-40)
            r36 = 0
            r27 = r8
            com.carrefour.fid.android.domain.models.service.models.l r7 = com.carrefour.fid.android.domain.models.service.models.C38163l.m158177u(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r6.add(r7)
            goto L_0x00ae
        L_0x0113:
            com.carrefour.fid.android.domain.models.service.models.m r4 = r4.mo119401b(r6)
        L_0x0117:
            java.util.List r3 = r4.mo119402d()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$2$1 r4 = new com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$2$1
            r6 = 0
            r4.<init>(r5, r6)
            r2.L$0 = r6
            r2.L$1 = r6
            r2.label = r1
            java.lang.Object r1 = com.carrefour.fid.android.shared.util.ParallelMapKt.m119521a(r3, r4, r2)
            if (r1 != r15) goto L_0x0130
            return r15
        L_0x0130:
            java.util.List r1 = (java.util.List) r1
            com.carrefour.fid.android.domain.models.service.models.m r2 = new com.carrefour.fid.android.domain.models.service.models.m
            r2.<init>(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r2)
            goto L_0x0140
        L_0x013c:
            java.lang.Object r1 = kotlin.Result.m38702b(r4)
        L_0x0140:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase.m172842invokegIAlus(com.carrefour.fid.android.domain.interactors.service.b$a, kotlin.coroutines.c):java.lang.Object");
    }
}
