package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37828p;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceOpenUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/p;", "Lkotlin/Result;", "Lkotlin/Pair;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "storeFacilityRepository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceIsServiceOpenUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceIsServiceOpenUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceOpenUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1360#2:34\n1446#2,5:35\n288#2,2:40\n*S KotlinDebug\n*F\n+ 1 ServiceIsServiceOpenUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceIsServiceOpenUseCase\n*L\n19#1:34\n19#1:35,5\n21#1:40,2\n*E\n"})
public final class ServiceIsServiceOpenUseCase implements C37828p {
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;
    @C12579k
    private final StoreFacilityRepository storeFacilityRepository;

    @Inject
    public ServiceIsServiceOpenUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2, @C12579k StoreFacilityRepository storeFacilityRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        Intrinsics.checkNotNullParameter(storeFacilityRepository2, "storeFacilityRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
        this.storeFacilityRepository = storeFacilityRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172859invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.Pair<com.carrefour.fid.android.domain.models.service.models.C38162k, java.lang.Boolean>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0073
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase r2 = (com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0057
        L_0x0046:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository r7 = r6.serviceSelectionRepository
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getServiceSelection(r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r6
        L_0x0057:
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = r7.mo119354f()
            if (r4 == 0) goto L_0x00ee
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r2 = r2.storeFacilityRepository
            java.lang.String r4 = r4.mo119167K()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.m172880fetchStoreByMetiRefgIAlus(r4, r0)
            if (r0 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0073:
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x00c9
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.m r7 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r7
            java.util.List r7 = r7.mo119402d()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x008c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r7.next()
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            java.util.List r2 = r2.mo119367K()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.C10994x.m42360n0(r1, r2)
            goto L_0x008c
        L_0x00a2:
            java.util.Iterator r7 = r1.iterator()
        L_0x00a6:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            boolean r2 = r2.mo119189d0()
            if (r2 == 0) goto L_0x00a6
            goto L_0x00bb
        L_0x00ba:
            r1 = 0
        L_0x00bb:
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            if (r1 == 0) goto L_0x00c4
            boolean r7 = r1.mo119189d0()
            goto L_0x00c5
        L_0x00c4:
            r7 = 0
        L_0x00c5:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
        L_0x00c9:
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x00e9
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            r1.<init>(r0, r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r1)
            goto L_0x00ff
        L_0x00e9:
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x00ff
        L_0x00ee:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r0 = "Service not selected"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x00ff:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase.m172859invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
