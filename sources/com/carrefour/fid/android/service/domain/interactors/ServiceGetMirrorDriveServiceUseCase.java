package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetMirrorDriveServiceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "Lcom/carrefour/fid/android/domain/models/service/models/FacilityServiceId;", "facilityServiceId", "", "isMirror", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "invoke-CkRE9Mk", "(Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "repository", "Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceGetMirrorDriveServiceUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceGetMirrorDriveServiceUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceGetMirrorDriveServiceUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n288#2,2:38\n*S KotlinDebug\n*F\n+ 1 ServiceGetMirrorDriveServiceUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceGetMirrorDriveServiceUseCase\n*L\n21#1:38,2\n*E\n"})
public final class ServiceGetMirrorDriveServiceUseCase implements C37817f {
    @C12579k
    private final StoreFacilityRepository repository;

    @Inject
    public ServiceGetMirrorDriveServiceUseCase(@C12579k StoreFacilityRepository storeFacilityRepository) {
        Intrinsics.checkNotNullParameter(storeFacilityRepository, "repository");
        this.repository = storeFacilityRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-CkRE9Mk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172850invokeCkRE9Mk(@org.jetbrains.annotations.C12579k java.lang.String r5, boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.StoreService>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase$invoke$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            java.lang.String r7 = com.carrefour.fid.android.shared.extension.C28789y.m119118a(r5)
            if (r7 != 0) goto L_0x0051
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r5 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0051:
            com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository r2 = r4.repository
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r2.m172883getStoreByAnabelKey0E7RQCE(r7, r6, r0)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r6)
            if (r7 != 0) goto L_0x00bd
            com.carrefour.fid.android.domain.models.service.models.l r6 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r6
            java.util.List r6 = r6.mo119367K()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0074:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x008c
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r0
            java.lang.String r0 = r0.mo119163G()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x0074
            goto L_0x008d
        L_0x008c:
            r7 = 0
        L_0x008d:
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r7
            if (r7 == 0) goto L_0x0098
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r7)
            goto L_0x00bc
        L_0x0098:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157964i(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Couldn't find the store service with "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x00bc:
            return r5
        L_0x00bd:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase.m172850invokeCkRE9Mk(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
