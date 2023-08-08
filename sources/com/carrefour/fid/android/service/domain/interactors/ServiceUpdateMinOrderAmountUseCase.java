package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37839u;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceUpdateMinOrderAmountUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/u;", "Lcom/carrefour/fid/android/domain/interactors/service/u$a;", "param", "Lkotlin/Result;", "Lkotlin/d2;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/service/u$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "storeFacilityRepository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceUpdateMinOrderAmountUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceUpdateMinOrderAmountUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceUpdateMinOrderAmountUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n288#2,2:33\n*S KotlinDebug\n*F\n+ 1 ServiceUpdateMinOrderAmountUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceUpdateMinOrderAmountUseCase\n*L\n16#1:33,2\n*E\n"})
public final class ServiceUpdateMinOrderAmountUseCase implements C37839u {
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;
    @C12579k
    private final StoreFacilityRepository storeFacilityRepository;

    @Inject
    public ServiceUpdateMinOrderAmountUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2, @C12579k StoreFacilityRepository storeFacilityRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        Intrinsics.checkNotNullParameter(storeFacilityRepository2, "storeFacilityRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
        this.storeFacilityRepository = storeFacilityRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172867invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.C37839u.C37840a r42, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r43
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase$invoke$1 r2 = (com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase$invoke$1 r2 = new com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r10 = 3
            r11 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0064
            if (r3 == r4) goto L_0x0051
            if (r3 == r11) goto L_0x0041
            if (r3 != r10) goto L_0x0039
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x012e
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r3 = r2.L$2
            com.carrefour.fid.android.domain.models.service.models.l r3 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r3
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.service.u$a r4 = (com.carrefour.fid.android.domain.interactors.service.C37839u.C37840a) r4
            java.lang.Object r5 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase r5 = (com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase) r5
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00a4
        L_0x0051:
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.interactors.service.u$a r3 = (com.carrefour.fid.android.domain.interactors.service.C37839u.C37840a) r3
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase r4 = (com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r5 = r4
            goto L_0x0083
        L_0x0064:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r3 = r0.storeFacilityRepository
            java.lang.String r1 = r42.mo115261e()
            r5 = 0
            r7 = 2
            r8 = 0
            r2.L$0 = r0
            r12 = r42
            r2.L$1 = r12
            r2.label = r4
            r4 = r1
            r6 = r2
            java.lang.Object r1 = com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172877getStoreByAnabelKey0E7RQCE$default(r3, r4, r5, r6, r7, r8)
            if (r1 != r9) goto L_0x0081
            return r9
        L_0x0081:
            r5 = r0
            r3 = r12
        L_0x0083:
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x0130
            kotlin.Result$a r4 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r4 = r5.serviceSelectionRepository
            r2.L$0 = r5
            r2.L$1 = r3
            r2.L$2 = r1
            r2.label = r11
            java.lang.Object r4 = r4.getServiceSelection(r2)
            if (r4 != r9) goto L_0x009e
            return r9
        L_0x009e:
            r40 = r3
            r3 = r1
            r1 = r4
            r4 = r40
        L_0x00a4:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            com.carrefour.fid.android.domain.models.service.models.l r6 = r1.mo119349a()
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = r1.mo119350b()
            if (r6 == 0) goto L_0x012e
            if (r11 == 0) goto L_0x012e
            java.util.List r1 = r3.mo119367K()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00bc:
            boolean r7 = r1.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x00d9
            java.lang.Object r7 = r1.next()
            r12 = r7
            com.carrefour.fid.android.domain.models.service.models.StoreService r12 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r12
            java.lang.String r12 = r12.mo119167K()
            java.lang.String r13 = r4.mo115263f()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x00bc
            goto L_0x00da
        L_0x00d9:
            r7 = r8
        L_0x00da:
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r7
            if (r7 == 0) goto L_0x012e
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
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
            r27 = 0
            r28 = 0
            java.lang.String r29 = r7.mo119168L()
            boolean r30 = r7.mo119173Q()
            boolean r31 = r3.mo119369M()
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 66191359(0x3f1ffff, float:1.4223481E-36)
            r39 = 0
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = com.carrefour.fid.android.domain.models.service.models.StoreService.m157998C(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r3 = r5.serviceSelectionRepository
            r2.L$0 = r8
            r2.L$1 = r8
            r2.L$2 = r8
            r2.label = r10
            java.lang.Object r1 = r3.m172876setSelectedService0E7RQCE(r6, r1, r2)
            if (r1 != r9) goto L_0x012e
            return r9
        L_0x012e:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x0130:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceUpdateMinOrderAmountUseCase.m172867invokegIAlus(com.carrefour.fid.android.domain.interactors.service.u$a, kotlin.coroutines.c):java.lang.Object");
    }
}
