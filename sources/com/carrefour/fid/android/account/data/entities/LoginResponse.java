package com.carrefour.fid.android.account.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/entities/LoginResponse;", "", "accessToken", "", "refreshToken", "scope", "idToken", "tokenType", "expiresIn", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()J", "getIdToken", "getRefreshToken", "getScope", "getTokenType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class LoginResponse {
    public static final int $stable = 0;
    @C33608c("access_token")
    @C12579k
    private final String accessToken;
    @C33608c("expires_in")
    private final long expiresIn;
    @C33608c("id_token")
    @C12579k
    private final String idToken;
    @C33608c("refresh_token")
    @C12579k
    private final String refreshToken;
    @C33608c("scope")
    @C12579k
    private final String scope;
    @C33608c("token_type")
    @C12579k
    private final String tokenType;

    public LoginResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = loginResponse.refreshToken;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = loginResponse.scope;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = loginResponse.idToken;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = loginResponse.tokenType;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            j = loginResponse.expiresIn;
        }
        return loginResponse.copy(str, str6, str7, str8, str9, j);
    }

    @C12579k
    public final String component1() {
        return this.accessToken;
    }

    @C12579k
    public final String component2() {
        return this.refreshToken;
    }

    @C12579k
    public final String component3() {
        return this.scope;
    }

    @C12579k
    public final String component4() {
        return this.idToken;
    }

    @C12579k
    public final String component5() {
        return this.tokenType;
    }

    public final long component6() {
        return this.expiresIn;
    }

    @C12579k
    public final LoginResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, long j) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "refreshToken");
        Intrinsics.checkNotNullParameter(str3, "scope");
        Intrinsics.checkNotNullParameter(str4, "idToken");
        Intrinsics.checkNotNullParameter(str5, "tokenType");
        return new LoginResponse(str, str2, str3, str4, str5, j);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        return Intrinsics.areEqual((Object) this.accessToken, (Object) loginResponse.accessToken) && Intrinsics.areEqual((Object) this.refreshToken, (Object) loginResponse.refreshToken) && Intrinsics.areEqual((Object) this.scope, (Object) loginResponse.scope) && Intrinsics.areEqual((Object) this.idToken, (Object) loginResponse.idToken) && Intrinsics.areEqual((Object) this.tokenType, (Object) loginResponse.tokenType) && this.expiresIn == loginResponse.expiresIn;
    }

    @C12579k
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    @C12579k
    public final String getIdToken() {
        return this.idToken;
    }

    @C12579k
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @C12579k
    public final String getScope() {
        return this.scope;
    }

    @C12579k
    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return (((((((((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.idToken.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + Long.hashCode(this.expiresIn);
    }

    @C12579k
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.scope;
        String str4 = this.idToken;
        String str5 = this.tokenType;
        long j = this.expiresIn;
        return "LoginResponse(accessToken=" + str + ", refreshToken=" + str2 + ", scope=" + str3 + ", idToken=" + str4 + ", tokenType=" + str5 + ", expiresIn=" + j + ")";
    }

    public LoginResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, long j) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "refreshToken");
        Intrinsics.checkNotNullParameter(str3, "scope");
        Intrinsics.checkNotNullParameter(str4, "idToken");
        Intrinsics.checkNotNullParameter(str5, "tokenType");
        this.accessToken = str;
        this.refreshToken = str2;
        this.scope = str3;
        this.idToken = str4;
        this.tokenType = str5;
        this.expiresIn = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LoginResponse(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0009
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x0009:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0012
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x0012:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x001c
            java.lang.String r8 = new java.lang.String
            r8.<init>()
        L_0x001c:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0026
            java.lang.String r9 = new java.lang.String
            r9.<init>()
        L_0x0026:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0030
            java.lang.String r10 = new java.lang.String
            r10.<init>()
        L_0x0030:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0037
            r11 = 0
        L_0x0037:
            r3 = r11
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.entities.LoginResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
