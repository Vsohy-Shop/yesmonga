package com.carrefour.fid.android.service.data.api.datasource;

import com.carrefour.fid.android.service.data.api.service.FacilityService;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/datasource/FacilityDataSource;", "", "", "anabelKey", "", "isMirror", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "getStoreByAnabel-0E7RQCE", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getStoreByAnabel", "Lcom/carrefour/fid/android/service/data/api/service/FacilityService;", "facilityService", "Lcom/carrefour/fid/android/service/data/api/service/FacilityService;", "<init>", "(Lcom/carrefour/fid/android/service/data/api/service/FacilityService;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class FacilityDataSource {
    @C12579k
    private final FacilityService facilityService;

    @Inject
    public FacilityDataSource(@C12579k FacilityService facilityService2) {
        Intrinsics.checkNotNullParameter(facilityService2, "facilityService");
        this.facilityService = facilityService2;
    }

    /* renamed from: getStoreByAnabel-0E7RQCE$default  reason: not valid java name */
    public static /* synthetic */ Object m172826getStoreByAnabel0E7RQCE$default(FacilityDataSource facilityDataSource, String str, Boolean bool, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return facilityDataSource.m172827getStoreByAnabel0E7RQCE(str, bool, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getStoreByAnabel-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172827getStoreByAnabel0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.Boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38163l>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource$getStoreByAnabel$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource$getStoreByAnabel$1 r0 = (com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource$getStoreByAnabel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource$getStoreByAnabel$1 r0 = new com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource$getStoreByAnabel$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x004c }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.service.data.api.service.FacilityService r7 = r4.facilityService     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r7 = r7.getStoreByAnabel(r5, r6, r0)     // Catch:{ all -> 0x004c }
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.carrefour.fid.android.service.data.api.entities.DetailedFacilityResponse r7 = (com.carrefour.fid.android.service.data.api.entities.DetailedFacilityResponse) r7     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.domain.models.service.models.l r5 = com.carrefour.fid.android.service.data.api.extension.DataToDomainKt.toDomain((com.carrefour.fid.android.service.data.api.entities.DetailedFacilityResponse) r7)     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource.m172827getStoreByAnabel0E7RQCE(java.lang.String, java.lang.Boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
