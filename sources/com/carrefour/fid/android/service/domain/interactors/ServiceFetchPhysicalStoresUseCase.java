package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37830b;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchPhysicalStoresUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/b;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/b$a;", "param", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/b$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "storeFacilityRepository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceFetchPhysicalStoresUseCase implements C37830b {
    @C12579k
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int RADIUS = 10000;
    @C12579k
    private final StoreFacilityRepository storeFacilityRepository;

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceFetchPhysicalStoresUseCase$Companion;", "", "()V", "RADIUS", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public ServiceFetchPhysicalStoresUseCase(@C12579k StoreFacilityRepository storeFacilityRepository2) {
        Intrinsics.checkNotNullParameter(storeFacilityRepository2, "storeFacilityRepository");
        this.storeFacilityRepository = storeFacilityRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172844invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.physicalstore.C37830b.C37831a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x0065
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r1 = r8.storeFacilityRepository
            com.carrefour.fid.android.domain.models.LatLon r10 = new com.carrefour.fid.android.domain.models.LatLon
            double r3 = r9.mo115245e()
            double r5 = r9.mo115247f()
            r10.<init>(r3, r5)
            r3 = 10000(0x2710, float:1.4013E-41)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7.label = r2
            r2 = r10
            java.lang.Object r9 = r1.m172879fetchStoreByCoordinatesFromWShUnOzRk(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x0065
            return r0
        L_0x0065:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase.m172844invokegIAlus(com.carrefour.fid.android.domain.interactors.service.physicalstore.b$a, kotlin.coroutines.c):java.lang.Object");
    }
}
