package com.carrefour.fid.android.account.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.core.constants.C13167a;
import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.entities.extentions.C13190l;
import com.carrefour.fid.android.shared.util.C28951s;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoginRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRepository.kt\ncom/carrefour/fid/android/account/data/repositories/LoginRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class LoginRepository {

    /* renamed from: c */
    public static final int f32381c = 8;
    @C12579k

    /* renamed from: a */
    public final RemoteLoginDataSource f32382a;
    @C12579k

    /* renamed from: b */
    public final LocalLoginDataSource f32383b;

    @Inject
    public LoginRepository(@C12579k RemoteLoginDataSource remoteLoginDataSource, @C12579k LocalLoginDataSource localLoginDataSource) {
        Intrinsics.checkNotNullParameter(remoteLoginDataSource, "remoteLoginDataSource");
        Intrinsics.checkNotNullParameter(localLoginDataSource, "localLoginDataSource");
        this.f32382a = remoteLoginDataSource;
        this.f32383b = localLoginDataSource;
    }

    /* renamed from: a */
    public final void mo31349a() {
        this.f32383b.mo31133b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getAccessToken();
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo31350b() {
        /*
            r2 = this;
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r0 = r2.mo31354f()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.getAccessToken()
            if (r0 == 0) goto L_0x0013
            com.carrefour.fid.android.shared.util.s r1 = com.carrefour.fid.android.shared.util.C28951s.f70964a
            java.lang.String r0 = r1.mo84276b(r0)
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = ""
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.LoginRepository.mo31350b():java.lang.String");
    }

    /* renamed from: c */
    public final Pair<String, String> mo31351c(String str) {
        if (C13181d.m57147f(mo31354f())) {
            return new Pair<>(str, "refresh_token");
        }
        return new Pair<>(mo31350b(), C13167a.f32306a);
    }

    @C12579k
    /* renamed from: d */
    public final String mo31352d() {
        String str;
        String uidIam;
        AuthStateResponse f = mo31354f();
        if (f == null || (uidIam = f.getUidIam()) == null) {
            str = null;
        } else {
            str = C28951s.f70964a.mo84276b(uidIam);
            if (str == null) {
                str = "";
            }
        }
        return str == null ? "" : str;
    }

    @C12579k
    /* renamed from: e */
    public final String mo31353e() {
        boolean z;
        AuthStateResponse f = mo31354f();
        if (f == null) {
            return "";
        }
        String b = C28951s.f70964a.mo84276b(f.getUidLocal());
        if (b != null) {
            if (b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return b;
            }
        }
        return C13190l.m57170b(C13181d.m57143b(mo31354f())).getUidLocal();
    }

    @C12580l
    /* renamed from: f */
    public final AuthStateResponse mo31354f() {
        return this.f32383b.mo31136e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31355g(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.account.data.entities.AuthStateResponse>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.data.repositories.LoginRepository$login$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.data.repositories.LoginRepository$login$1 r0 = (com.carrefour.fid.android.account.data.repositories.LoginRepository$login$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.LoginRepository$login$1 r0 = new com.carrefour.fid.android.account.data.repositories.LoginRepository$login$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.account.data.repositories.LoginRepository r6 = (com.carrefour.fid.android.account.data.repositories.LoginRepository) r6
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0090 }
            kotlin.Result r7 = (kotlin.Result) r7     // Catch:{ all -> 0x0090 }
            java.lang.Object r7 = r7.mo21858l()     // Catch:{ all -> 0x0090 }
            goto L_0x0052
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource r7 = r4.f32382a     // Catch:{ all -> 0x0090 }
            r0.L$0 = r4     // Catch:{ all -> 0x0090 }
            r0.L$1 = r5     // Catch:{ all -> 0x0090 }
            r0.label = r3     // Catch:{ all -> 0x0090 }
            java.lang.Object r7 = r7.mo31147g(r5, r6, r0)     // Catch:{ all -> 0x0090 }
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r6 = r4
        L_0x0052:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r7)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x006a
            com.carrefour.fid.android.account.data.entities.LoginResponse r7 = (com.carrefour.fid.android.account.data.entities.LoginResponse) r7     // Catch:{ all -> 0x0090 }
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0090 }
            com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource r5 = r6.f32383b     // Catch:{ all -> 0x0090 }
            r6 = 2
            r0 = 0
            r1 = 0
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r5 = com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource.m57098g(r5, r7, r1, r6, r0)     // Catch:{ all -> 0x0090 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0090 }
            goto L_0x009f
        L_0x006a:
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0090 }
            com.carrefour.fid.android.account.io.CredentialsResponseThrowable r6 = new com.carrefour.fid.android.account.io.CredentialsResponseThrowable     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r7.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "Authentication error with '"
            r7.append(r0)     // Catch:{ all -> 0x0090 }
            r7.append(r5)     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "' user"
            r7.append(r5)     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0090 }
            r6.<init>(r5)     // Catch:{ all -> 0x0090 }
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)     // Catch:{ all -> 0x0090 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0090 }
            goto L_0x009f
        L_0x0090:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r5 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r5)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x009f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.LoginRepository.mo31355g(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31356h(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.account.data.repositories.LoginRepository$refreshToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.account.data.repositories.LoginRepository$refreshToken$1 r0 = (com.carrefour.fid.android.account.data.repositories.LoginRepository$refreshToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.LoginRepository$refreshToken$1 r0 = new com.carrefour.fid.android.account.data.repositories.LoginRepository$refreshToken$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0044
            if (r2 != r4) goto L_0x003c
            java.lang.Object r1 = r0.L$1
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.account.data.repositories.LoginRepository r0 = (com.carrefour.fid.android.account.data.repositories.LoginRepository) r0
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x00f7
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0044:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = (com.carrefour.fid.android.account.data.repositories.LoginRepository) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0091
        L_0x0052:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource r13 = r12.f32383b
            java.lang.String r13 = r13.mo31135d()
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r7 = "refreshAccessToken() called"
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119704b(r6, r7, r8, r9, r10, r11)
            int r2 = r13.length()
            if (r2 != 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x006e:
            r2 = r3
        L_0x006f:
            if (r2 == 0) goto L_0x0083
            kotlin.Result$a r13 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.EmptyRefreshTokenException r13 = new com.carrefour.fid.android.account.io.EmptyRefreshTokenException
            java.lang.String r0 = "Access Token is empty"
            r13.<init>(r0)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            return r13
        L_0x0083:
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource r2 = r12.f32382a
            r0.L$0 = r12
            r0.label = r5
            java.lang.Object r13 = r2.mo31148h(r13, r0)
            if (r13 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r2 = r12
        L_0x0091:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r13)
            if (r6 != 0) goto L_0x00bb
            com.carrefour.fid.android.account.data.entities.LoginResponse r13 = (com.carrefour.fid.android.account.data.entities.LoginResponse) r13
            com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource r0 = r2.f32383b     // Catch:{ Exception -> 0x00aa }
            r0.mo31137f(r13, r3)     // Catch:{ Exception -> 0x00aa }
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00aa }
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r13 = kotlin.Result.m38702b(r13)     // Catch:{ Exception -> 0x00aa }
            goto L_0x0159
        L_0x00aa:
            r13 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r13 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r13)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            goto L_0x0159
        L_0x00bb:
            boolean r13 = r6 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            r3 = 0
            if (r13 == 0) goto L_0x00c4
            r5 = r6
            com.carrefour.fid.android.shared.io.ResponseThrowable r5 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r5
            goto L_0x00c5
        L_0x00c4:
            r5 = r3
        L_0x00c5:
            if (r5 == 0) goto L_0x00d0
            int r5 = r5.mo83810a()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r5)
            goto L_0x00d1
        L_0x00d0:
            r5 = r3
        L_0x00d1:
            if (r13 == 0) goto L_0x00d6
            com.carrefour.fid.android.shared.io.ResponseThrowable r6 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r6
            goto L_0x00d7
        L_0x00d6:
            r6 = r3
        L_0x00d7:
            if (r6 == 0) goto L_0x00dd
            java.lang.String r3 = r6.getMessage()
        L_0x00dd:
            if (r5 != 0) goto L_0x00e0
            goto L_0x0131
        L_0x00e0:
            int r13 = r5.intValue()
            r6 = 400(0x190, float:5.6E-43)
            if (r6 != r13) goto L_0x0131
            r0.L$0 = r2
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r13 = r2.mo31357i(r0)
            if (r13 != r1) goto L_0x00f5
            return r1
        L_0x00f5:
            r0 = r2
            r1 = r5
        L_0x00f7:
            boolean r2 = kotlin.Result.m38710j(r13)
            if (r2 == 0) goto L_0x010c
            kotlin.d2 r13 = (kotlin.C11079d2) r13
            com.carrefour.fid.android.shared.util.events.EventLiveData$a r13 = com.carrefour.fid.android.shared.util.events.EventLiveData.f70863b
            java.lang.String r2 = "EVENT_SIGN_IN_KEY"
            com.carrefour.fid.android.shared.util.events.c r13 = r13.mo84199a(r2)
            java.lang.String r2 = "EVENT_SIGN_IN_VALUE"
            r13.mo57493o(r2)
        L_0x010c:
            r0.mo31349a()
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = "After 400 bad request you need to revoke the token to re-connect user"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119704b(r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "After '"
            r13.append(r0)
            r13.append(r1)
            java.lang.String r0 = "' bad request you need to revoke the token to re-connect user"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            goto L_0x014a
        L_0x0131:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Refresh token: "
            r13.append(r0)
            r13.append(r5)
            java.lang.String r0 = "::"
            r13.append(r0)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
        L_0x014a:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.RefreshTokenException r0 = new com.carrefour.fid.android.account.io.RefreshTokenException
            r0.<init>(r13)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
        L_0x0159:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.LoginRepository.mo31356h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31357i(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.data.repositories.LoginRepository$revokeToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.data.repositories.LoginRepository$revokeToken$1 r0 = (com.carrefour.fid.android.account.data.repositories.LoginRepository$revokeToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.LoginRepository$revokeToken$1 r0 = new com.carrefour.fid.android.account.data.repositories.LoginRepository$revokeToken$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x002a }
            goto L_0x009e
        L_0x002a:
            r7 = move-exception
            goto L_0x00e0
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource r7 = r6.f32383b
            java.lang.String r7 = r7.mo31135d()
            kotlin.Pair r7 = r6.mo31351c(r7)
            java.lang.Object r2 = r7.mo21849e()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r4 = 0
            if (r2 != 0) goto L_0x0051
            r2 = r3
            goto L_0x0052
        L_0x0051:
            r2 = r4
        L_0x0052:
            if (r2 == 0) goto L_0x0066
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.EmptyRefreshTokenException r7 = new com.carrefour.fid.android.account.io.EmptyRefreshTokenException
            java.lang.String r0 = "The token cannot be empty"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x0066:
            java.lang.Object r2 = r7.mo21851f()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0073
            r4 = r3
        L_0x0073:
            if (r4 == 0) goto L_0x0087
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.EmptyRefreshTokenException r7 = new com.carrefour.fid.android.account.io.EmptyRefreshTokenException
            java.lang.String r0 = "The tokenType cannot be empty"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x0087:
            com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource r2 = r6.f32382a     // Catch:{ all -> 0x002a }
            java.lang.Object r4 = r7.mo21849e()     // Catch:{ all -> 0x002a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x002a }
            java.lang.Object r7 = r7.mo21851f()     // Catch:{ all -> 0x002a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x002a }
            r0.label = r3     // Catch:{ all -> 0x002a }
            java.lang.Object r7 = r2.mo31149i(r4, r7, r0)     // Catch:{ all -> 0x002a }
            if (r7 != r1) goto L_0x009e
            return r1
        L_0x009e:
            retrofit2.w r7 = (retrofit2.C13091w) r7     // Catch:{ all -> 0x002a }
            boolean r0 = r7.mo30576g()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x00af
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x002a }
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x002a }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x002a }
            goto L_0x00df
        L_0x00af:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x002a }
            com.carrefour.fid.android.account.io.RefreshTokenException r0 = new com.carrefour.fid.android.account.io.RefreshTokenException     // Catch:{ all -> 0x002a }
            int r1 = r7.mo30573b()     // Catch:{ all -> 0x002a }
            java.lang.String r7 = r7.mo30577h()     // Catch:{ all -> 0x002a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "Revoke token: "
            r2.append(r3)     // Catch:{ all -> 0x002a }
            r2.append(r1)     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "::"
            r2.append(r1)     // Catch:{ all -> 0x002a }
            r2.append(r7)     // Catch:{ all -> 0x002a }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x002a }
            r0.<init>(r7)     // Catch:{ all -> 0x002a }
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x002a }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x002a }
        L_0x00df:
            return r7
        L_0x00e0:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = 0
            r3 = 0
            r4 = 5
            r5 = 0
            r2 = r7
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r7 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r7)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.LoginRepository.mo31357i(kotlin.coroutines.c):java.lang.Object");
    }
}
