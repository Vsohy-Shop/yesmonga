package com.carrefour.fid.android.logm.data.datasource;

import com.carrefour.fid.android.logm.data.service.C38276a;
import com.carrefour.fid.android.shared.app.C28443a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class LogMDataSource {
    @C12579k

    /* renamed from: a */
    public final C38276a f96941a;
    @C12579k

    /* renamed from: b */
    public final C28443a f96942b;

    @Inject
    public LogMDataSource(@C12579k C38276a aVar, @C12579k C28443a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "apiService");
        Intrinsics.checkNotNullParameter(aVar2, "appInfo");
        this.f96941a = aVar;
        this.f96942b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo119713a(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.logm.LogMEntry> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.logm.data.datasource.LogMDataSource$sendRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.logm.data.datasource.LogMDataSource$sendRequest$1 r0 = (com.carrefour.fid.android.logm.data.datasource.LogMDataSource$sendRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.logm.data.datasource.LogMDataSource$sendRequest$1 r0 = new com.carrefour.fid.android.logm.data.datasource.LogMDataSource$sendRequest$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0059 }
            goto L_0x0052
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0059 }
            com.carrefour.fid.android.logm.data.service.a r6 = r4.f96941a     // Catch:{ all -> 0x0059 }
            com.carrefour.fid.android.shared.app.a r2 = r4.f96942b     // Catch:{ all -> 0x0059 }
            boolean r2 = com.carrefour.fid.android.shared.extension.C28763k.m119071a(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "one-app-prd-a3"
            goto L_0x0045
        L_0x0043:
            java.lang.String r2 = "one-app-nonprd-a3"
        L_0x0045:
            java.util.List r5 = com.carrefour.fid.android.logm.data.datasource.C38270a.m158549c(r5)     // Catch:{ all -> 0x0059 }
            r0.label = r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = r6.mo119872a(r2, r5, r0)     // Catch:{ all -> 0x0059 }
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x0064
        L_0x0059:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.logm.data.datasource.LogMDataSource.mo119713a(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
