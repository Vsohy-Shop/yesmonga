package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AccountGetUserInfoUseCase implements C37878e {
    @C12579k

    /* renamed from: a */
    public final AccountRepository f32635a;

    @Inject
    public AccountGetUserInfoUseCase(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32635a = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172740invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.user.C37878e.C37881c r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0069
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase r6 = (com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005b
        L_0x0042:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.user.e$b r7 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37880b.f94998a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x005a
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = r5.f32635a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo31322g(r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r6 = r5
        L_0x005b:
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = r6.f32635a
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.mo31324i(r0)
            if (r6 != r1) goto L_0x0069
            return r1
        L_0x0069:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase.m172740invokegIAlus(com.carrefour.fid.android.domain.interactors.user.e$c, kotlin.coroutines.c):java.lang.Object");
    }
}
