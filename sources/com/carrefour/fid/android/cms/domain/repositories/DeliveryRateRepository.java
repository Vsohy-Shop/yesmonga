package com.carrefour.fid.android.cms.domain.repositories;

import com.carrefour.fid.android.cms.data.headers.C40020a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/repositories/DeliveryRateRepository;", "", "", "Lcom/carrefour/fid/android/domain/models/h;", "fetchClcvDeliveryRate", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchH1h3DeliveryRate", "Lcom/carrefour/fid/android/cms/data/services/a;", "cmsApiService", "Lcom/carrefour/fid/android/cms/data/services/a;", "Lcom/carrefour/fid/android/cms/data/headers/a;", "cmsHeaders", "Lcom/carrefour/fid/android/cms/data/headers/a;", "<init>", "(Lcom/carrefour/fid/android/cms/data/services/a;Lcom/carrefour/fid/android/cms/data/headers/a;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class DeliveryRateRepository {
    @C12579k
    private final C40023a cmsApiService;
    @C12579k
    private final C40020a cmsHeaders;

    @Inject
    public DeliveryRateRepository(@C12579k C40023a aVar, @C12579k C40020a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "cmsApiService");
        Intrinsics.checkNotNullParameter(aVar2, "cmsHeaders");
        this.cmsApiService = aVar;
        this.cmsHeaders = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchClcvDeliveryRate(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<? extends com.carrefour.fid.android.domain.models.C38038h>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchClcvDeliveryRate$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchClcvDeliveryRate$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchClcvDeliveryRate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchClcvDeliveryRate$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchClcvDeliveryRate$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.cms.data.services.a r5 = r4.cmsApiService     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.cms.data.headers.a r2 = r4.cmsHeaders     // Catch:{ all -> 0x004e }
            java.util.HashMap r2 = r2.mo132259a()     // Catch:{ all -> 0x004e }
            r0.label = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r5.mo132261a(r2, r0)     // Catch:{ all -> 0x004e }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo r5 = (com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo) r5     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0059
        L_0x004e:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0059:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0061
            r5 = r1
        L_0x0061:
            com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo r5 = (com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo) r5
            if (r5 == 0) goto L_0x0069
            java.util.List r1 = com.carrefour.fid.android.cms.domain.extension.DeliveryRateKt.toDomain(r5)
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository.fetchClcvDeliveryRate(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchH1h3DeliveryRate(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<? extends com.carrefour.fid.android.domain.models.C38038h>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchH1h3DeliveryRate$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchH1h3DeliveryRate$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchH1h3DeliveryRate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchH1h3DeliveryRate$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository$fetchH1h3DeliveryRate$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.cms.data.services.a r5 = r4.cmsApiService     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.cms.data.headers.a r2 = r4.cmsHeaders     // Catch:{ all -> 0x004e }
            java.util.HashMap r2 = r2.mo132259a()     // Catch:{ all -> 0x004e }
            r0.label = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r5.mo132267g(r2, r0)     // Catch:{ all -> 0x004e }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo r5 = (com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo) r5     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0059
        L_0x004e:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0059:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0061
            r5 = r1
        L_0x0061:
            com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo r5 = (com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo) r5
            if (r5 == 0) goto L_0x0069
            java.util.List r1 = com.carrefour.fid.android.cms.domain.extension.DeliveryRateKt.toDomain(r5)
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository.fetchH1h3DeliveryRate(kotlin.coroutines.c):java.lang.Object");
    }
}
