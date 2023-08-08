package com.carrefour.fid.android.various.data.datasource;

import com.carrefour.fid.android.various.domain.repository.C22796c;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
public final class RemoteConfigDataSource {
    @C12579k

    /* renamed from: a */
    public final C22796c f58276a;

    @Inject
    public RemoteConfigDataSource(@C12579k C22796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "remoteConfig");
        this.f58276a = cVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m102930c(RemoteConfigDataSource remoteConfigDataSource, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return remoteConfigDataSource.mo67155b(z, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[SYNTHETIC, Splitter:B:18:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67154a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$checkRemoteConfig$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$checkRemoteConfig$1 r0 = (com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$checkRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$checkRemoteConfig$1 r0 = new com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$checkRemoteConfig$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r7 = (com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag) r7
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource r0 = (com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource) r0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0052
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            r8 = 0
            java.lang.Object r8 = m102930c(r6, r3, r0, r4, r8)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r6
        L_0x0052:
            boolean r1 = kotlin.Result.m38710j(r8)
            if (r1 == 0) goto L_0x00c0
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x00b4 }
            r8.booleanValue()     // Catch:{ all -> 0x00b4 }
            com.carrefour.fid.android.various.domain.repository.c r8 = r0.f58276a     // Catch:{ all -> 0x00b4 }
            java.util.Map r8 = r8.mo67176b()     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r7.mo119009q()     // Catch:{ all -> 0x00b4 }
            boolean r0 = r8.containsKey(r0)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r7.mo119009q()     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = r7.mo119009q()     // Catch:{ all -> 0x00b4 }
            java.lang.Object r1 = r8.get(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r2.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r5 = "RemoteConfigTag "
            r2.append(r5)     // Catch:{ all -> 0x00b4 }
            r2.append(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = " = "
            r2.append(r0)     // Catch:{ all -> 0x00b4 }
            r2.append(r1)     // Catch:{ all -> 0x00b4 }
        L_0x0090:
            java.lang.String r0 = r7.mo119009q()     // Catch:{ all -> 0x00b4 }
            boolean r0 = r8.containsKey(r0)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r7 = r7.mo119009q()     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00b4 }
            boolean r7 = com.carrefour.fid.android.shared.extension.StringKt.m118943w(r7, r3)     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x00ab
            r3 = r4
        L_0x00ab:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r7 = move-exception
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x00c4
        L_0x00c0:
            java.lang.Object r7 = kotlin.Result.m38702b(r8)
        L_0x00c4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource.mo67154a(com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67155b(boolean r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$fetchRemoteConfigValues$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$fetchRemoteConfigValues$1 r0 = (com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$fetchRemoteConfigValues$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$fetchRemoteConfigValues$1 r0 = new com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource$fetchRemoteConfigValues$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.C11661u0.m45747n(r6)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0048
        L_0x0029:
            r5 = move-exception
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0029 }
            com.carrefour.fid.android.various.domain.repository.c r6 = r4.f58276a     // Catch:{ Exception -> 0x0029 }
            if (r5 == 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            r0.label = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r6 = r6.mo67175a(r5, r0)     // Catch:{ Exception -> 0x0029 }
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0071
        L_0x004d:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = r5.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error fetching remote config "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0, r5)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0071:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource.mo67155b(boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
