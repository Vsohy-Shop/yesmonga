package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.domain.interactors.user.C37877d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AccountGetUserInfoStoreUseCase implements C37877d {
    @C12579k

    /* renamed from: a */
    public final LocalAccountDataSource f32634a;

    @Inject
    public AccountGetUserInfoStoreUseCase(@C12579k LocalAccountDataSource localAccountDataSource) {
        Intrinsics.checkNotNullParameter(localAccountDataSource, "localAccountDataSource");
        this.f32634a = localAccountDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052 A[Catch:{ all -> 0x0062 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172739invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0062 }
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0062 }
            goto L_0x0048
        L_0x0038:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0062 }
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r6 = r5.f32634a     // Catch:{ all -> 0x0062 }
            r0.label = r4     // Catch:{ all -> 0x0062 }
            java.lang.Object r6 = r6.mo31122b(r0)     // Catch:{ all -> 0x0062 }
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6     // Catch:{ all -> 0x0062 }
            r0.label = r3     // Catch:{ all -> 0x0062 }
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47501w0(r6, r0)     // Catch:{ all -> 0x0062 }
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            com.carrefour.fid.android.UserInfo r6 = (com.carrefour.fid.android.UserInfo) r6     // Catch:{ all -> 0x0062 }
            if (r6 == 0) goto L_0x005c
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = com.carrefour.fid.android.account.data.entities.extentions.C13188k.m57161a(r6)     // Catch:{ all -> 0x0062 }
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0062 }
            goto L_0x006d
        L_0x0062:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x006d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase.m172739invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
