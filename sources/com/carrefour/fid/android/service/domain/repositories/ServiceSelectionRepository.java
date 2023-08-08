package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.constant.C28533e2;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007H@ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0007J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u0013\u0010\u0019\u001a\u00020\fH@ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "", "isStoreValid", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "getServiceSelectionFlow", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "storeService", "Lkotlin/Result;", "Lkotlin/d2;", "setSelectedService-0E7RQCE", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lcom/carrefour/fid/android/domain/models/service/models/StoreService;Lkotlin/coroutines/c;)Ljava/lang/Object;", "setSelectedService", "getServiceSelection", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "updateSelectedService", "(Lcom/carrefour/fid/android/domain/models/service/models/StoreService;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getPendingServiceSelection", "serviceSelection", "setPendingServiceSelection", "applyPendingServiceSelection-IoAF18A", "applyPendingServiceSelection", "clear", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;", "servicePersistence", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;", "pendingServiceSelection", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;)V", "ServicePersistence", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceSelectionRepository {
    @C12580l
    private C38162k pendingServiceSelection;
    @C12579k
    private final ServicePersistence servicePersistence;

    @C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH&\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;", "", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "storeService", "Lkotlin/d2;", "setSelectedService", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lcom/carrefour/fid/android/domain/models/service/models/StoreService;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getStore", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "getStoreService", "clear", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "getServiceSelectionFlow", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface ServicePersistence {
        @C12580l
        Object clear(@C12579k C11045c<? super C11079d2> cVar);

        @C12579k
        C11907e<C38162k> getServiceSelectionFlow();

        @C12580l
        Object getStore(@C12579k C11045c<? super C38163l> cVar);

        @C12580l
        Object getStoreService(@C12579k C11045c<? super StoreService> cVar);

        @C12580l
        Object setSelectedService(@C12579k C38163l lVar, @C12579k StoreService storeService, @C12579k C11045c<? super C11079d2> cVar);
    }

    @Inject
    public ServiceSelectionRepository(@C12579k ServicePersistence servicePersistence2) {
        Intrinsics.checkNotNullParameter(servicePersistence2, "servicePersistence");
        this.servicePersistence = servicePersistence2;
    }

    private final boolean isStoreValid(C38163l lVar) {
        return !Intrinsics.areEqual((Object) lVar.mo119393w(), (Object) C28533e2.f69109b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: applyPendingServiceSelection-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172875applyPendingServiceSelectionIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$applyPendingServiceSelection$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$applyPendingServiceSelection$1 r0 = (com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$applyPendingServiceSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$applyPendingServiceSelection$1 r0 = new com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$applyPendingServiceSelection$1
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
            goto L_0x0076
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.models.service.models.k r5 = r4.pendingServiceSelection
            if (r5 == 0) goto L_0x0065
            com.carrefour.fid.android.domain.models.service.models.l r2 = r5.mo119352e()
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
            if (r2 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0053
            r0.label = r3
            java.lang.Object r5 = r4.m172876setSelectedService0E7RQCE(r2, r5, r0)
            if (r5 != r1) goto L_0x0076
            return r1
        L_0x0053:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pending store or service is null"
            r5.<init>(r0)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0076
        L_0x0065:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pending service selection is null"
            r5.<init>(r0)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0076:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository.m172875applyPendingServiceSelectionIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    public final Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object clear = this.servicePersistence.clear(cVar);
        return clear == C11063b.m42612h() ? clear : C11079d2.f28267a;
    }

    @C12579k
    public final C38162k getPendingServiceSelection() {
        C38162k kVar = this.pendingServiceSelection;
        return kVar == null ? new C38162k((C38163l) null, (StoreService) null, 3, (DefaultConstructorMarker) null) : kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getServiceSelection(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.service.models.C38162k> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$getServiceSelection$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$getServiceSelection$1 r0 = (com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$getServiceSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$getServiceSelection$1 r0 = new com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$getServiceSelection$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.service.models.l r0 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0063
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r2 = (com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0051
        L_0x0040:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$ServicePersistence r7 = r6.servicePersistence
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getStore(r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r6
        L_0x0051:
            com.carrefour.fid.android.domain.models.service.models.l r7 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r7
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$ServicePersistence r2 = r2.servicePersistence
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.getStoreService(r0)
            if (r0 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0063:
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r7
            com.carrefour.fid.android.domain.models.service.models.k r1 = new com.carrefour.fid.android.domain.models.service.models.k
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository.getServiceSelection(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final C11907e<C38162k> getServiceSelectionFlow() {
        return this.servicePersistence.getServiceSelectionFlow();
    }

    public final void setPendingServiceSelection(@C12579k C38162k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "serviceSelection");
        this.pendingServiceSelection = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: setSelectedService-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172876setSelectedService0E7RQCE(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.C38163l r5, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.StoreService r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$setSelectedService$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$setSelectedService$1 r0 = (com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$setSelectedService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$setSelectedService$1 r0 = new com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$setSelectedService$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0056 }
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x0056 }
            boolean r7 = r4.isStoreValid(r5)     // Catch:{ all -> 0x0056 }
            if (r7 == 0) goto L_0x004e
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$ServicePersistence r7 = r4.servicePersistence     // Catch:{ all -> 0x0056 }
            r0.label = r3     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r7.setSelectedService(r5, r6, r0)     // Catch:{ all -> 0x0056 }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0061
        L_0x004e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "Cannot set virtual store as selected store"
            r5.<init>(r6)     // Catch:{ all -> 0x0056 }
            throw r5     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository.m172876setSelectedService0E7RQCE(com.carrefour.fid.android.domain.models.service.models.l, com.carrefour.fid.android.domain.models.service.models.StoreService, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateSelectedService(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.StoreService r30, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.service.models.C38162k> r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$updateSelectedService$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$updateSelectedService$1 r2 = (com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$updateSelectedService$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$updateSelectedService$1 r2 = new com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository$updateSelectedService$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0056
            if (r4 == r6) goto L_0x0045
            if (r4 != r5) goto L_0x003d
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.l r3 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r3
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x00a9
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r6 = (com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository) r6
            kotlin.C11661u0.m45747n(r1)
            r28 = r4
            r4 = r1
            r1 = r28
            goto L_0x0069
        L_0x0056:
            kotlin.C11661u0.m45747n(r1)
            r2.L$0 = r0
            r1 = r30
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r4 = r0.getServiceSelection(r2)
            if (r4 != r3) goto L_0x0068
            return r3
        L_0x0068:
            r6 = r0
        L_0x0069:
            com.carrefour.fid.android.domain.models.service.models.k r4 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r4
            com.carrefour.fid.android.domain.models.service.models.l r7 = r4.mo119352e()
            if (r7 == 0) goto L_0x00af
            boolean r23 = r1.mo119173Q()
            java.lang.String r22 = r1.mo119168L()
            r8 = 0
            r9 = 0
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
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 212991(0x33fff, float:2.98464E-40)
            r27 = 0
            com.carrefour.fid.android.domain.models.service.models.l r4 = com.carrefour.fid.android.domain.models.service.models.C38163l.m158177u(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.L$0 = r1
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r2 = r6.m172876setSelectedService0E7RQCE(r4, r1, r2)
            if (r2 != r3) goto L_0x00a7
            return r3
        L_0x00a7:
            r2 = r1
            r3 = r4
        L_0x00a9:
            com.carrefour.fid.android.domain.models.service.models.k r1 = new com.carrefour.fid.android.domain.models.service.models.k
            r1.<init>(r3, r2)
            return r1
        L_0x00af:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "No store set"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository.updateSelectedService(com.carrefour.fid.android.domain.models.service.models.StoreService, kotlin.coroutines.c):java.lang.Object");
    }
}
