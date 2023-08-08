package com.carrefour.fid.android.data.managers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C11395k(message = "This class should be deleted after getting rid of all managers", replaceWith = @C11587t0(expression = "ClearUserDataUseCase", imports = {}))
@C8567o(parameters = 0)
public final class ClearAppManager {

    /* renamed from: d */
    public static final int f90272d = 8;
    @C12579k

    /* renamed from: a */
    public final AccountRepository f90273a;
    @C12579k

    /* renamed from: b */
    public final C36555b f90274b;
    @C12579k

    /* renamed from: c */
    public final C13783a f90275c;

    @Inject
    public ClearAppManager(@C12579k AccountRepository accountRepository, @C12579k C36555b bVar, @C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(bVar, "loginManager");
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f90273a = accountRepository;
        this.f90274b = bVar;
        this.f90275c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111416a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.managers.ClearAppManager$clearAppCashedData$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.managers.ClearAppManager$clearAppCashedData$1 r0 = (com.carrefour.fid.android.data.managers.ClearAppManager$clearAppCashedData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.managers.ClearAppManager$clearAppCashedData$1 r0 = new com.carrefour.fid.android.data.managers.ClearAppManager$clearAppCashedData$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.managers.ClearAppManager r0 = (com.carrefour.fid.android.data.managers.ClearAppManager) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r5 = r4.f90273a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo31322g(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            com.carrefour.fid.android.data.managers.b r5 = r0.f90274b
            r5.mo111418a()
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.managers.ClearAppManager.mo111416a(kotlin.coroutines.c):java.lang.Object");
    }
}
