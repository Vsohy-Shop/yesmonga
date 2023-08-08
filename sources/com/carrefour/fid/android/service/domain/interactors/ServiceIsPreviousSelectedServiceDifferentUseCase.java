package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37826n;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsPreviousSelectedServiceDifferentUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/n;", "Lkotlin/Result;", "", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "currentServiceSelected", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceIsPreviousSelectedServiceDifferentUseCase implements C37826n {
    @C12580l
    private C38162k currentServiceSelected;
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;

    @Inject
    public ServiceIsPreviousSelectedServiceDifferentUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066 A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172857invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.L$2
            com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase r1 = (com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase) r1
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.k r2 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase) r0
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0070 }
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003d:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0070 }
            com.carrefour.fid.android.domain.models.service.models.k r2 = r4.currentServiceSelected     // Catch:{ all -> 0x0070 }
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r5 = r4.serviceSelectionRepository     // Catch:{ all -> 0x0070 }
            r0.L$0 = r4     // Catch:{ all -> 0x0070 }
            r0.L$1 = r2     // Catch:{ all -> 0x0070 }
            r0.L$2 = r4     // Catch:{ all -> 0x0070 }
            r0.label = r3     // Catch:{ all -> 0x0070 }
            java.lang.Object r5 = r5.getServiceSelection(r0)     // Catch:{ all -> 0x0070 }
            if (r5 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r4
            r1 = r0
        L_0x0057:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5     // Catch:{ all -> 0x0070 }
            r1.currentServiceSelected = r5     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0066
            com.carrefour.fid.android.domain.models.service.models.k r5 = r0.currentServiceSelected     // Catch:{ all -> 0x0070 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)     // Catch:{ all -> 0x0070 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0070 }
            goto L_0x007b
        L_0x0070:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x007b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase.m172857invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
