package com.carrefour.fid.android.domain.interactors.account.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.user.C37885h;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class AccountGetUserUuidUseCase implements C37885h {

    /* renamed from: b */
    public static final int f94284b = BaseAppPreferencesStorage.f70153d;
    @C12579k

    /* renamed from: a */
    public final BaseAppPreferencesStorage f94285a;

    @Inject
    public AccountGetUserUuidUseCase(@C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferencesStorage");
        this.f94285a = baseAppPreferencesStorage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114311a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase$getUuid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase$getUuid$1 r0 = (com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase$getUuid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase$getUuid$1 r0 = new com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase$getUuid$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage r5 = r4.f94285a
            r0.label = r3
            java.lang.Object r5 = r5.mo83495c(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.shared.data.datastore.pref.e r5 = (com.carrefour.fid.android.shared.data.datastore.pref.C28631e) r5
            java.lang.String r5 = r5.mo83520d()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase.mo114311a(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: b */
    public final BaseAppPreferencesStorage mo114312b() {
        return this.f94285a;
    }
}
