package com.carrefour.fid.android.domain.interactors.account.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.user.C37883f;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class AccountGetUserInfoWithCardTypeUseCase implements C37883f {

    /* renamed from: b */
    public static final int f94282b = 8;
    @C12579k

    /* renamed from: a */
    public final C37878e f94283a;

    @Inject
    public AccountGetUserInfoWithCardTypeUseCase(@C12579k C37878e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        this.f94283a = eVar;
    }

    @C12579k
    /* renamed from: a */
    public final C37878e mo114310a() {
        return this.f94283a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172938invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.accountmenu.C37951b>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase$invoke$1
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
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.user.e r5 = r4.f94283a
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.label = r3
            java.lang.Object r5 = r5.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x007b
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            java.util.List r0 = r5.mo116669w()
            com.carrefour.fid.android.domain.models.account.UserCards r0 = com.carrefour.fid.android.account.data.entities.extentions.C13187j.m57159d(r0)
            if (r0 == 0) goto L_0x006e
            boolean r1 = r0.mo116764l()
            if (r1 == 0) goto L_0x006e
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r1 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.lang.String r0 = r0.mo116763k()
            int r0 = r1.getTypeCard(r0)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r0)
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.accountmenu.b r1 = new com.carrefour.fid.android.domain.models.accountmenu.b
            r1.<init>(r5, r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r1)
            goto L_0x0085
        L_0x007b:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase.m172938invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
