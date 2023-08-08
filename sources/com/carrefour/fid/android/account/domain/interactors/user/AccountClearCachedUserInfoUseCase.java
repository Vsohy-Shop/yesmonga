package com.carrefour.fid.android.account.domain.interactors.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.account.C37515a;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class AccountClearCachedUserInfoUseCase implements C37515a {

    /* renamed from: d */
    public static final int f32629d = 8;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32630a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f32631b;
    @C12579k

    /* renamed from: c */
    public final CoroutineDispatcher f32632c;

    @Inject
    public AccountClearCachedUserInfoUseCase(@C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f32630a = loginRepository;
        this.f32631b = accountRepository;
        this.f32632c = coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172737invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x004e }
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f32632c     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$2$1 r2 = new com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase$invoke$2$1     // Catch:{ all -> 0x004e }
            r4 = 0
            r2.<init>(r5, r4)     // Catch:{ all -> 0x004e }
            r0.label = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = kotlinx.coroutines.C11965h.m47673h(r6, r2, r0)     // Catch:{ all -> 0x004e }
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x004e }
            goto L_0x0059
        L_0x004e:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase.m172737invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
