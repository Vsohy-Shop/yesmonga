package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceUpdateStoreServiceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "Lcom/carrefour/fid/android/domain/interactors/service/v$a;", "param", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/service/v$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceUpdateStoreServiceUseCase implements C37841v {
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;

    @Inject
    public ServiceUpdateStoreServiceUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172869invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.C37841v.C37842a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38162k>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x004c }
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r6 = r4.serviceSelectionRepository     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo115268d()     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r6 = r6.updateSelectedService(r5, r0)     // Catch:{ all -> 0x004c }
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase.m172869invokegIAlus(com.carrefour.fid.android.domain.interactors.service.v$a, kotlin.coroutines.c):java.lang.Object");
    }
}
