package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0003H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository;", "", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "getPhysicalStore-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "getPhysicalStore", "store", "Lkotlin/d2;", "setPhysicalStore-gIAlu-s", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "setPhysicalStore", "clear-IoAF18A", "clear", "Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;", "persistence", "Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;)V", "PhysicalStorePersistence", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class PhysicalStoreRepository {
    @C12579k
    private final PhysicalStorePersistence persistence;

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;", "", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lkotlin/d2;", "setPhysicalStore", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getPhysicalStore", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "clear", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface PhysicalStorePersistence {
        @C12580l
        Object clear(@C12579k C11045c<? super C11079d2> cVar);

        @C12580l
        Object getPhysicalStore(@C12579k C11045c<? super C38163l> cVar);

        @C12580l
        Object setPhysicalStore(@C12579k C38163l lVar, @C12579k C11045c<? super C11079d2> cVar);
    }

    @Inject
    public PhysicalStoreRepository(@C12579k PhysicalStorePersistence physicalStorePersistence) {
        Intrinsics.checkNotNullParameter(physicalStorePersistence, "persistence");
        this.persistence = physicalStorePersistence;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: clear-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172872clearIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$clear$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$clear$1 r0 = (com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$clear$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$clear$1 r0 = new com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$clear$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$PhysicalStorePersistence r5 = r4.persistence     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r5.clear(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository.m172872clearIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getPhysicalStore-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172873getPhysicalStoreIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38163l>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$getPhysicalStore$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$getPhysicalStore$1 r0 = (com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$getPhysicalStore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$getPhysicalStore$1 r0 = new com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$getPhysicalStore$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$PhysicalStorePersistence r5 = r4.persistence     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r5.getPhysicalStore(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.carrefour.fid.android.domain.models.service.models.l r5 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r5     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository.m172873getPhysicalStoreIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: setPhysicalStore-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172874setPhysicalStoregIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.C38163l r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$setPhysicalStore$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$setPhysicalStore$1 r0 = (com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$setPhysicalStore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$setPhysicalStore$1 r0 = new com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$setPhysicalStore$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository$PhysicalStorePersistence r6 = r4.persistence     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.setPhysicalStore(r5, r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository.m172874setPhysicalStoregIAlus(com.carrefour.fid.android.domain.models.service.models.l, kotlin.coroutines.c):java.lang.Object");
    }
}
