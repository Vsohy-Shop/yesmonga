package com.carrefour.fid.android.domain.interactors.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class AppClearUserDataUseCase implements C37874b {

    /* renamed from: c */
    public static final int f94987c = (LocalLoginDataSource.f32335e | AccountRepository.f32373c);
    @C12579k

    /* renamed from: a */
    public final AccountRepository f94988a;
    @C12579k

    /* renamed from: b */
    public final LocalLoginDataSource f94989b;

    @Inject
    public AppClearUserDataUseCase(@C12579k AccountRepository accountRepository, @C12579k LocalLoginDataSource localLoginDataSource) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(localLoginDataSource, "localLoginDataSource");
        this.f94988a = accountRepository;
        this.f94989b = localLoginDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173013invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase r0 = (com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r5 = r4.f94988a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo31322g(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource r5 = r0.f94989b
            r5.mo31133b()
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase.m173013invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
