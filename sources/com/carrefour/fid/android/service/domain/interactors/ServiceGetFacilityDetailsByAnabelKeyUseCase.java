package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.models.service.models.C38146a;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFacilityDetailsByAnabelKeyUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "Lcom/carrefour/fid/android/domain/models/service/models/a;", "param", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "invoke-0zxx4Q0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "repository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceGetFacilityDetailsByAnabelKeyUseCase implements C37816e {
    @C12579k
    private final StoreFacilityRepository repository;

    @Inject
    public ServiceGetFacilityDetailsByAnabelKeyUseCase(@C12579k StoreFacilityRepository storeFacilityRepository) {
        Intrinsics.checkNotNullParameter(storeFacilityRepository, "repository");
        this.repository = storeFacilityRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-0zxx4Q0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172847invoke0zxx4Q0(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38163l>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x004a
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r1 = r7.repository
            r3 = 0
            r5 = 2
            r6 = 0
            r4.label = r2
            r2 = r8
            java.lang.Object r8 = com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository.m172877getStoreByAnabelKey0E7RQCE$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x004a
            return r0
        L_0x004a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase.m172847invoke0zxx4Q0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172848invokegIAlus(Object obj, C11045c cVar) {
        return m172847invoke0zxx4Q0(((C38146a) obj).mo119248h(), cVar);
    }
}
