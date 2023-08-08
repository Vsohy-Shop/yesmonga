package com.carrefour.fid.android.cms.domain.repositories;

import com.carrefour.fid.android.cms.data.cache.StorePetrolCache;
import com.carrefour.fid.android.cms.data.headers.C40020a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/repositories/StorePetrolRepository;", "", "", "minifiCode", "Lcom/carrefour/fid/android/cms/domain/models/StorePetrolInfo;", "fetchPetrolInfo", "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/d2;", "clear", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/cms/data/cache/StorePetrolCache;", "cache", "Lcom/carrefour/fid/android/cms/data/cache/StorePetrolCache;", "Lcom/carrefour/fid/android/cms/data/services/a;", "cmsApiService", "Lcom/carrefour/fid/android/cms/data/services/a;", "Lcom/carrefour/fid/android/cms/data/headers/a;", "cmsHeaders", "Lcom/carrefour/fid/android/cms/data/headers/a;", "<init>", "(Lcom/carrefour/fid/android/cms/data/cache/StorePetrolCache;Lcom/carrefour/fid/android/cms/data/services/a;Lcom/carrefour/fid/android/cms/data/headers/a;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class StorePetrolRepository {
    @C12579k
    private final StorePetrolCache cache;
    @C12579k
    private final C40023a cmsApiService;
    @C12579k
    private final C40020a cmsHeaders;

    @Inject
    public StorePetrolRepository(@C12579k StorePetrolCache storePetrolCache, @C12579k C40023a aVar, @C12579k C40020a aVar2) {
        Intrinsics.checkNotNullParameter(storePetrolCache, "cache");
        Intrinsics.checkNotNullParameter(aVar, "cmsApiService");
        Intrinsics.checkNotNullParameter(aVar2, "cmsHeaders");
        this.cache = storePetrolCache;
        this.cmsApiService = aVar;
        this.cmsHeaders = aVar2;
    }

    @C12580l
    public final Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object c = this.cache.mo131893c(cVar);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[SYNTHETIC, Splitter:B:31:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchPetrolInfo(int r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.cms.domain.models.StorePetrolInfo> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository$fetchPetrolInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository$fetchPetrolInfo$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository$fetchPetrolInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository$fetchPetrolInfo$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository$fetchPetrolInfo$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo r11 = (com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo) r11
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00c5
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository r11 = (com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository) r11
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0045 }
            goto L_0x009d
        L_0x0045:
            r12 = move-exception
            goto L_0x00a4
        L_0x0047:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository r2 = (com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository) r2
            kotlin.C11661u0.m45747n(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x006a
        L_0x0055:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache r12 = r10.cache
            r0.L$0 = r10
            r0.I$0 = r11
            r0.label = r5
            java.lang.Object r12 = r12.mo131895e(r0)
            if (r12 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r12
            r12 = r11
            r11 = r10
        L_0x006a:
            com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo r2 = (com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo) r2
            if (r2 == 0) goto L_0x0077
            long r7 = r2.getDateOfSave()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.C11064a.m42621g(r7)
            goto L_0x0078
        L_0x0077:
            r5 = r6
        L_0x0078:
            r7 = 14400000(0xdbba00, float:2.0178698E-38)
            boolean r5 = com.carrefour.fid.android.shared.util.C28929f.m119636a(r5, r7)
            if (r5 == 0) goto L_0x0088
            if (r2 == 0) goto L_0x00cb
            com.carrefour.fid.android.cms.domain.models.StorePetrolInfo r6 = com.carrefour.fid.android.cms.domain.extension.StorePetrolInfoKt.toDomain(r2)
            goto L_0x00cb
        L_0x0088:
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0045 }
            com.carrefour.fid.android.cms.data.services.a r2 = r11.cmsApiService     // Catch:{ all -> 0x0045 }
            com.carrefour.fid.android.cms.data.headers.a r5 = r11.cmsHeaders     // Catch:{ all -> 0x0045 }
            java.util.HashMap r5 = r5.mo132259a()     // Catch:{ all -> 0x0045 }
            r0.L$0 = r11     // Catch:{ all -> 0x0045 }
            r0.label = r4     // Catch:{ all -> 0x0045 }
            java.lang.Object r12 = r2.mo132265e(r12, r5, r0)     // Catch:{ all -> 0x0045 }
            if (r12 != r1) goto L_0x009d
            return r1
        L_0x009d:
            com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo r12 = (com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo) r12     // Catch:{ all -> 0x0045 }
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x0045 }
            goto L_0x00ae
        L_0x00a4:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
        L_0x00ae:
            boolean r2 = kotlin.Result.m38709i(r12)
            if (r2 == 0) goto L_0x00b5
            r12 = r6
        L_0x00b5:
            com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo r12 = (com.carrefour.fid.android.cms.data.entities.StorePetrolInfoPojo) r12
            com.carrefour.fid.android.cms.data.cache.StorePetrolCache r11 = r11.cache
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r11.mo131896f(r12, r0)
            if (r11 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            r11 = r12
        L_0x00c5:
            if (r11 == 0) goto L_0x00cb
            com.carrefour.fid.android.cms.domain.models.StorePetrolInfo r6 = com.carrefour.fid.android.cms.domain.extension.StorePetrolInfoKt.toDomain(r11)
        L_0x00cb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository.fetchPetrolInfo(int, kotlin.coroutines.c):java.lang.Object");
    }
}
