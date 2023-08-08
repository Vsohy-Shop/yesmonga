package com.carrefour.fid.android.account.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17239t;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jl\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/entities/AuthStateResponse;", "", "accessToken", "", "refreshToken", "scope", "uidIam", "uidLocal", "idToken", "accessTokenExpirationTime", "", "lastModification", "expiresIn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getAccessTokenExpirationTime", "()Ljava/lang/Long;", "setAccessTokenExpirationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getExpiresIn", "setExpiresIn", "getIdToken", "setIdToken", "getLastModification", "setLastModification", "getRefreshToken", "setRefreshToken", "getScope", "setScope", "getUidIam", "setUidIam", "getUidLocal", "setUidLocal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/carrefour/fid/android/account/data/entities/AuthStateResponse;", "equals", "", "other", "hashCode", "", "toString", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class AuthStateResponse {
    public static final int $stable = 8;
    @C33608c("access_token")
    @C12579k
    private String accessToken;
    @C33608c("expires_at")
    @C12580l
    private Long accessTokenExpirationTime;
    @C33608c("expires_in")
    @C12579k
    private String expiresIn;
    @C33608c("id_Token")
    @C12579k
    private String idToken;
    @C33608c("last_modification")
    @C12580l
    private Long lastModification;
    @C33608c("refresh_token")
    @C12579k
    private String refreshToken;
    @C33608c("scope")
    @C12579k
    private String scope;
    @C33608c("uid_iam")
    @C12579k
    private String uidIam;
    @C33608c("uid_local")
    @C12579k
    private String uidLocal;

    public AuthStateResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, C17239t.f45525u, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AuthStateResponse copy$default(AuthStateResponse authStateResponse, String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, String str7, int i, Object obj) {
        AuthStateResponse authStateResponse2 = authStateResponse;
        int i2 = i;
        return authStateResponse.copy((i2 & 1) != 0 ? authStateResponse2.accessToken : str, (i2 & 2) != 0 ? authStateResponse2.refreshToken : str2, (i2 & 4) != 0 ? authStateResponse2.scope : str3, (i2 & 8) != 0 ? authStateResponse2.uidIam : str4, (i2 & 16) != 0 ? authStateResponse2.uidLocal : str5, (i2 & 32) != 0 ? authStateResponse2.idToken : str6, (i2 & 64) != 0 ? authStateResponse2.accessTokenExpirationTime : l, (i2 & 128) != 0 ? authStateResponse2.lastModification : l2, (i2 & 256) != 0 ? authStateResponse2.expiresIn : str7);
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
        return this.uidIam;
    }

    @C12579k
    public final String component5() {
        return this.uidLocal;
    }

    @C12579k
    public final String component6() {
        return this.idToken;
    }

    @C12580l
    public final Long component7() {
        return this.accessTokenExpirationTime;
    }

    @C12580l
    public final Long component8() {
        return this.lastModification;
    }

    @C12579k
    public final String component9() {
        return this.expiresIn;
    }

    @C12579k
    public final AuthStateResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12580l Long l, @C12580l Long l2, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "refreshToken");
        Intrinsics.checkNotNullParameter(str3, "scope");
        Intrinsics.checkNotNullParameter(str4, "uidIam");
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, "uidLocal");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "idToken");
        String str10 = str7;
        Intrinsics.checkNotNullParameter(str10, "expiresIn");
        return new AuthStateResponse(str, str2, str3, str4, str8, str9, l, l2, str10);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthStateResponse)) {
            return false;
        }
        AuthStateResponse authStateResponse = (AuthStateResponse) obj;
        return Intrinsics.areEqual((Object) this.accessToken, (Object) authStateResponse.accessToken) && Intrinsics.areEqual((Object) this.refreshToken, (Object) authStateResponse.refreshToken) && Intrinsics.areEqual((Object) this.scope, (Object) authStateResponse.scope) && Intrinsics.areEqual((Object) this.uidIam, (Object) authStateResponse.uidIam) && Intrinsics.areEqual((Object) this.uidLocal, (Object) authStateResponse.uidLocal) && Intrinsics.areEqual((Object) this.idToken, (Object) authStateResponse.idToken) && Intrinsics.areEqual((Object) this.accessTokenExpirationTime, (Object) authStateResponse.accessTokenExpirationTime) && Intrinsics.areEqual((Object) this.lastModification, (Object) authStateResponse.lastModification) && Intrinsics.areEqual((Object) this.expiresIn, (Object) authStateResponse.expiresIn);
    }

    @C12579k
    public final String getAccessToken() {
        return this.accessToken;
    }

    @C12580l
    public final Long getAccessTokenExpirationTime() {
        return this.accessTokenExpirationTime;
    }

    @C12579k
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @C12579k
    public final String getIdToken() {
        return this.idToken;
    }

    @C12580l
    public final Long getLastModification() {
        return this.lastModification;
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
    public final String getUidIam() {
        return this.uidIam;
    }

    @C12579k
    public final String getUidLocal() {
        return this.uidLocal;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.uidIam.hashCode()) * 31) + this.uidLocal.hashCode()) * 31) + this.idToken.hashCode()) * 31;
        Long l = this.accessTokenExpirationTime;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastModification;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.expiresIn.hashCode();
    }

    public final void setAccessToken(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setAccessTokenExpirationTime(@C12580l Long l) {
        this.accessTokenExpirationTime = l;
    }

    public final void setExpiresIn(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expiresIn = str;
    }

    public final void setIdToken(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idToken = str;
    }

    public final void setLastModification(@C12580l Long l) {
        this.lastModification = l;
    }

    public final void setRefreshToken(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setScope(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scope = str;
    }

    public final void setUidIam(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uidIam = str;
    }

    public final void setUidLocal(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uidLocal = str;
    }

    @C12579k
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.scope;
        String str4 = this.uidIam;
        String str5 = this.uidLocal;
        String str6 = this.idToken;
        Long l = this.accessTokenExpirationTime;
        Long l2 = this.lastModification;
        String str7 = this.expiresIn;
        return "AuthStateResponse(accessToken=" + str + ", refreshToken=" + str2 + ", scope=" + str3 + ", uidIam=" + str4 + ", uidLocal=" + str5 + ", idToken=" + str6 + ", accessTokenExpirationTime=" + l + ", lastModification=" + l2 + ", expiresIn=" + str7 + ")";
    }

    public AuthStateResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12580l Long l, @C12580l Long l2, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "refreshToken");
        Intrinsics.checkNotNullParameter(str3, "scope");
        Intrinsics.checkNotNullParameter(str4, "uidIam");
        Intrinsics.checkNotNullParameter(str5, "uidLocal");
        Intrinsics.checkNotNullParameter(str6, "idToken");
        Intrinsics.checkNotNullParameter(str7, "expiresIn");
        this.accessToken = str;
        this.refreshToken = str2;
        this.scope = str3;
        this.uidIam = str4;
        this.uidLocal = str5;
        this.idToken = str6;
        this.accessTokenExpirationTime = l;
        this.lastModification = l2;
        this.expiresIn = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuthStateResponse(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Long r18, java.lang.Long r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r12
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r13
        L_0x0018:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0023
        L_0x0022:
            r3 = r14
        L_0x0023:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x002e
        L_0x002d:
            r4 = r15
        L_0x002e:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003a
        L_0x0038:
            r5 = r16
        L_0x003a:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0044
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0046
        L_0x0044:
            r6 = r17
        L_0x0046:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x0051
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            goto L_0x0053
        L_0x0051:
            r7 = r18
        L_0x0053:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x005c
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x005e
        L_0x005c:
            r8 = r19
        L_0x005e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x006a
        L_0x0068:
            r0 = r20
        L_0x006a:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.entities.AuthStateResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
