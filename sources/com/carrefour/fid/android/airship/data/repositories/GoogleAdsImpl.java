package com.carrefour.fid.android.airship.data.repositories;

import com.carrefour.fid.android.airship.data.datasource.C13742a;
import com.carrefour.fid.android.airship.domain.repositories.C13755a;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

public final class GoogleAdsImpl implements C13755a {
    @C12579k

    /* renamed from: a */
    public final C13742a f33386a;
    @C12579k

    /* renamed from: b */
    public final CoroutineDispatcher f33387b;

    @Inject
    public GoogleAdsImpl(@C12579k C13742a aVar, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(aVar, "advertisingIdDataSource");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f33386a = aVar;
        this.f33387b = coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo32674a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$1 r0 = (com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$1 r0 = new com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f33387b
            com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$2 r2 = new com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl$getGaid$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C11965h.m47673h(r6, r2, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl.mo32674a(kotlin.coroutines.c):java.lang.Object");
    }
}
