package com.carrefour.fid.android.various.data.repository;

import com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource;
import com.carrefour.fid.android.various.domain.repository.C22798d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class RemoteConfigRepositoryImpl implements C22798d {
    @C12579k

    /* renamed from: a */
    public final RemoteConfigDataSource f58316a;

    @Inject
    public RemoteConfigRepositoryImpl(@C12579k RemoteConfigDataSource remoteConfigDataSource) {
        Intrinsics.checkNotNullParameter(remoteConfigDataSource, "remoteConfigDataSource");
        this.f58316a = remoteConfigDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo67178a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$checkRemoteConfig$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$checkRemoteConfig$1 r0 = (com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$checkRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$checkRemoteConfig$1 r0 = new com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$checkRemoteConfig$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource r6 = r4.f58316a
            r0.label = r3
            java.lang.Object r5 = r6.mo67154a(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl.mo67178a(com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo67179b(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$fetchRemoteConfig$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$fetchRemoteConfig$1 r0 = (com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$fetchRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$fetchRemoteConfig$1 r0 = new com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl$fetchRemoteConfig$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource r5 = r4.f58316a
            r0.label = r3
            java.lang.Object r5 = r5.mo67155b(r3, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x005c
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x006b
        L_0x005c:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RemoteConfigThrowable r5 = new com.carrefour.fid.android.shared.io.RemoteConfigThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x006b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl.mo67179b(kotlin.coroutines.c):java.lang.Object");
    }
}
