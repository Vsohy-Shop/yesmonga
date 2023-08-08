package com.carrefour.fid.android.account.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.entities.RevokeTokenResponse;
import com.carrefour.fid.android.account.data.headers.C13200e;
import com.carrefour.fid.android.account.data.service.C13212c;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.net.URLEncoder;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C8567o(parameters = 0)
public final class RemoteLoginDataSource {

    /* renamed from: c */
    public static final int f32345c = 8;
    @C12579k

    /* renamed from: a */
    public final C13212c f32346a;
    @C12579k

    /* renamed from: b */
    public final C13200e f32347b;

    @Inject
    public RemoteLoginDataSource(@C12579k C13212c cVar, @C12579k C13200e eVar) {
        Intrinsics.checkNotNullParameter(cVar, "loginApiService");
        Intrinsics.checkNotNullParameter(eVar, "loginHeaders");
        this.f32346a = cVar;
        this.f32347b = eVar;
    }

    /* renamed from: e */
    public final HashMap<String, String> mo31145e(String str, String str2) {
        return C10977s0.m41446M(C11078d1.m42659a(C28534f.f69142a, "password"), C11078d1.m42659a("username", str), C11078d1.m42659a("password", URLEncoder.encode(str2, "utf-8")), C11078d1.m42659a("scope", C28534f.f69156h), C11078d1.m42659a(C28534f.f69150e, C28534f.f69158i));
    }

    /* renamed from: f */
    public final HashMap<String, String> mo31146f(String str) {
        return C10977s0.m41446M(C11078d1.m42659a(C28534f.f69142a, "refresh_token"), C11078d1.m42659a("refresh_token", str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31147g(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.account.data.entities.LoginResponse>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$1 r0 = (com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$1 r0 = new com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$2 r7 = new com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource.mo31147g(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31148h(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.account.data.entities.LoginResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$1 r0 = (com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$1 r0 = new com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$2 r6 = new com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$refreshToken$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource.mo31148h(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: i */
    public final Object mo31149i(@C12579k String str, @C12579k String str2, @C12579k C11045c<? super C13091w<RevokeTokenResponse>> cVar) {
        return this.f32346a.mo31370a(str, str2, C13200e.m57191b(this.f32347b, false, 1, (Object) null), cVar);
    }
}
