package com.carrefour.fid.android.domain.interactors.luckycart;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.datasource.LuckyCartGateway;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class LuckyCartGetLuckyCartBannersUseCase implements C37708b {

    /* renamed from: d */
    public static final int f94580d = 8;
    @C12579k

    /* renamed from: a */
    public final LuckyCartGateway f94581a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94582b;
    @C12579k

    /* renamed from: c */
    public final C37823k f94583c;

    @Inject
    public LuckyCartGetLuckyCartBannersUseCase(@C12579k LuckyCartGateway luckyCartGateway, @C12579k C37807b bVar, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(luckyCartGateway, "luckyCartGateway");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f94581a = luckyCartGateway;
        this.f94582b = bVar;
        this.f94583c = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[SYNTHETIC, Splitter:B:30:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172974invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase$invoke$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r5) goto L_0x0053
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0036 }
            kotlin.Result r10 = (kotlin.Result) r10     // Catch:{ all -> 0x0036 }
            java.lang.Object r10 = r10.mo21858l()     // Catch:{ all -> 0x0036 }
            goto L_0x00c1
        L_0x0036:
            r10 = move-exception
            goto L_0x00cb
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0041:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.k r2 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase r4 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase) r4
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0094
        L_0x0053:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase r2 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0072
        L_0x0061:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.interactors.service.k r10 = r9.f94583c
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r2 = r9
        L_0x0072:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r10)
            if (r5 != 0) goto L_0x00d6
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r5 = r2.f94582b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r6 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r7 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.LuckyCartProducts
            r6.<init>(r7)
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r4 = r5.m172966invokegIAlus(r6, r0)
            if (r4 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r8 = r2
            r2 = r10
            r10 = r4
            r4 = r8
        L_0x0094:
            boolean r5 = kotlin.Result.m38710j(r10)
            if (r5 == 0) goto L_0x00d1
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0036 }
            r10.booleanValue()     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.data.datasource.LuckyCartGateway r10 = r4.f94581a     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = com.carrefour.fid.android.shared.extension.C28762j0.m119069b(r2)     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.models.service.models.l r2 = r2.mo119352e()     // Catch:{ all -> 0x0036 }
            r5 = 0
            if (r2 == 0) goto L_0x00b3
            java.lang.String r2 = r2.mo119357A()     // Catch:{ all -> 0x0036 }
            goto L_0x00b4
        L_0x00b3:
            r2 = r5
        L_0x00b4:
            r0.L$0 = r5     // Catch:{ all -> 0x0036 }
            r0.L$1 = r5     // Catch:{ all -> 0x0036 }
            r0.label = r3     // Catch:{ all -> 0x0036 }
            java.lang.Object r10 = r10.mo108667c(r4, r2, r0)     // Catch:{ all -> 0x0036 }
            if (r10 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners r10 = (com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners) r10     // Catch:{ all -> 0x0036 }
            java.lang.Object r10 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0036 }
            goto L_0x00d5
        L_0x00cb:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
        L_0x00d1:
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
        L_0x00d5:
            return r10
        L_0x00d6:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase.m172974invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
