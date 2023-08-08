package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37825m;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetStoreServiceTypeSelectedUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/m;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "getSelectedStoreServiceSelectionType", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceGetStoreServiceTypeSelectedUseCase implements C37825m {
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;

    @Inject
    public ServiceGetStoreServiceTypeSelectedUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getSelectedStoreServiceSelectionType(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.service.models.StoreServiceType> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.service.domain.interactors.C28356xa36aec5
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase$getSelectedStoreServiceSelectionType$1 r0 = (com.carrefour.fid.android.service.domain.interactors.C28356xa36aec5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase$getSelectedStoreServiceSelectionType$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase$getSelectedStoreServiceSelectionType$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r5 = r4.serviceSelectionRepository
            r0.label = r3
            java.lang.Object r5 = r5.getServiceSelection(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
            if (r5 == 0) goto L_0x004c
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r5 = r5.mo119176T()
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase.getSelectedStoreServiceSelectionType(kotlin.coroutines.c):java.lang.Object");
    }
}
