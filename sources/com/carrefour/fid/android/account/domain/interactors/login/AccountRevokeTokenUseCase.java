package com.carrefour.fid.android.account.domain.interactors.login;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.account.C37522h;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AccountRevokeTokenUseCase implements C37522h {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32615a;

    @Inject
    public AccountRevokeTokenUseCase(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "repository");
        this.f32615a = loginRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172733invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase$invoke$1
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
            com.carrefour.fid.android.account.data.repositories.LoginRepository r5 = r4.f32615a
            r0.label = r3
            java.lang.Object r5 = r5.mo31357i(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase.m172733invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
