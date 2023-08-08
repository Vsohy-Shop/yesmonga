package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$2$1", mo22502f = "ServiceFetchDeliveryStoresUseCase.kt", mo22503i = {0}, mo22504l = {44}, mo22505m = "invokeSuspend", mo22506n = {"store"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceFetchDeliveryStoresUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceFetchDeliveryStoresUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase$invoke$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1194#2,2:68\n1222#2,4:70\n1549#2:74\n1620#2,3:75\n*S KotlinDebug\n*F\n+ 1 ServiceFetchDeliveryStoresUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceFetchDeliveryStoresUseCase$invoke$2$1\n*L\n46#1:68,2\n46#1:70,4\n50#1:74\n50#1:75,3\n*E\n"})
public final class ServiceFetchDeliveryStoresUseCase$invoke$2$1 extends SuspendLambda implements C11304p<C38163l, C11045c<? super C38163l>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServiceFetchDeliveryStoresUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceFetchDeliveryStoresUseCase$invoke$2$1(ServiceFetchDeliveryStoresUseCase serviceFetchDeliveryStoresUseCase, C11045c<? super ServiceFetchDeliveryStoresUseCase$invoke$2$1> cVar) {
        super(2, cVar);
        this.this$0 = serviceFetchDeliveryStoresUseCase;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ServiceFetchDeliveryStoresUseCase$invoke$2$1 serviceFetchDeliveryStoresUseCase$invoke$2$1 = new ServiceFetchDeliveryStoresUseCase$invoke$2$1(this.this$0, cVar);
        serviceFetchDeliveryStoresUseCase$invoke$2$1.L$0 = obj;
        return serviceFetchDeliveryStoresUseCase$invoke$2$1;
    }

    @C12580l
    public final Object invoke(@C12579k C38163l lVar, @C12580l C11045c<? super C38163l> cVar) {
        return ((ServiceFetchDeliveryStoresUseCase$invoke$2$1) create(lVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.carrefour.fid.android.domain.models.service.models.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r50) {
        /*
            r49 = this;
            r6 = r49
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x001e
            java.lang.Object r0 = r6.L$0
            com.carrefour.fid.android.domain.models.service.models.l r0 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r0
            kotlin.C11661u0.m45747n(r50)
            r1 = r50
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r9 = r0
            goto L_0x004b
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            kotlin.C11661u0.m45747n(r50)
            java.lang.Object r0 = r6.L$0
            r8 = r0
            com.carrefour.fid.android.domain.models.service.models.l r8 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r8
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase r0 = r6.this$0
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r0 = r0.storeFacilityRepository
            java.lang.String r2 = r8.mo119393w()
            r3 = 0
            r4 = 2
            r5 = 0
            r6.L$0 = r8
            r6.label = r1
            r1 = r2
            r2 = r3
            r3 = r49
            java.lang.Object r1 = com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172877getStoreByAnabelKey0E7RQCE$default(r0, r1, r2, r3, r4, r5)
            if (r1 != r7) goto L_0x004a
            return r7
        L_0x004a:
            r9 = r8
        L_0x004b:
            boolean r0 = kotlin.Result.m38709i(r1)
            if (r0 == 0) goto L_0x0052
            r1 = 0
        L_0x0052:
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            if (r1 == 0) goto L_0x0127
            java.util.List r0 = r1.mo119367K()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r0, r1)
            int r2 = kotlin.collections.C10975r0.m41400j(r2)
            r3 = 16
            int r2 = kotlin.ranges.C11479u.m44447u(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0075:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.String r4 = r4.mo119163G()
            r3.put(r4, r2)
            goto L_0x0075
        L_0x008a:
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.util.List r0 = r9.mo119367K()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = kotlin.collections.C10978t.m41495Y(r0, r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ab:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010e
            java.lang.Object r1 = r0.next()
            r20 = r1
            com.carrefour.fid.android.domain.models.service.models.StoreService r20 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r20
            java.lang.String r1 = r20.mo119163G()
            java.lang.Object r1 = r3.get(r1)
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            if (r1 == 0) goto L_0x0108
            boolean r40 = r1.mo119185b0()
            java.lang.String r38 = r1.mo119168L()
            boolean r42 = r1.mo119182Z()
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 64356351(0x3d5ffff, float:1.2577789E-36)
            r48 = 0
            com.carrefour.fid.android.domain.models.service.models.StoreService r20 = com.carrefour.fid.android.domain.models.service.models.StoreService.m157998C(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
        L_0x0108:
            r1 = r20
            r2.add(r1)
            goto L_0x00ab
        L_0x010e:
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 261119(0x3fbff, float:3.65906E-40)
            r29 = 0
            r20 = r2
            com.carrefour.fid.android.domain.models.service.models.l r9 = com.carrefour.fid.android.domain.models.service.models.C38163l.m158177u(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0127:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase$invoke$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
