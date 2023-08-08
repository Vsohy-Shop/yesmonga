package com.google.firebase.installations.remote;

import androidx.annotation.C0363p0;
import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
public final class C33116a extends InstallationResponse {

    /* renamed from: a */
    public final String f80299a;

    /* renamed from: b */
    public final String f80300b;

    /* renamed from: c */
    public final String f80301c;

    /* renamed from: d */
    public final TokenResult f80302d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f80303e;

    /* renamed from: com.google.firebase.installations.remote.a$b */
    public static final class C33118b extends InstallationResponse.C33114a {

        /* renamed from: a */
        public String f80304a;

        /* renamed from: b */
        public String f80305b;

        /* renamed from: c */
        public String f80306c;

        /* renamed from: d */
        public TokenResult f80307d;

        /* renamed from: e */
        public InstallationResponse.ResponseCode f80308e;

        /* renamed from: a */
        public InstallationResponse mo95874a() {
            return new C33116a(this.f80304a, this.f80305b, this.f80306c, this.f80307d, this.f80308e);
        }

        /* renamed from: b */
        public InstallationResponse.C33114a mo95875b(TokenResult tokenResult) {
            this.f80307d = tokenResult;
            return this;
        }

        /* renamed from: c */
        public InstallationResponse.C33114a mo95876c(String str) {
            this.f80305b = str;
            return this;
        }

        /* renamed from: d */
        public InstallationResponse.C33114a mo95877d(String str) {
            this.f80306c = str;
            return this;
        }

        /* renamed from: e */
        public InstallationResponse.C33114a mo95878e(InstallationResponse.ResponseCode responseCode) {
            this.f80308e = responseCode;
            return this;
        }

        /* renamed from: f */
        public InstallationResponse.C33114a mo95879f(String str) {
            this.f80304a = str;
            return this;
        }

        public C33118b() {
        }

        public C33118b(InstallationResponse installationResponse) {
            this.f80304a = installationResponse.mo95872f();
            this.f80305b = installationResponse.mo95869c();
            this.f80306c = installationResponse.mo95870d();
            this.f80307d = installationResponse.mo95868b();
            this.f80308e = installationResponse.mo95871e();
        }
    }

    @C0363p0
    /* renamed from: b */
    public TokenResult mo95868b() {
        return this.f80302d;
    }

    @C0363p0
    /* renamed from: c */
    public String mo95869c() {
        return this.f80300b;
    }

    @C0363p0
    /* renamed from: d */
    public String mo95870d() {
        return this.f80301c;
    }

    @C0363p0
    /* renamed from: e */
    public InstallationResponse.ResponseCode mo95871e() {
        return this.f80303e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f80299a;
        if (str != null ? str.equals(installationResponse.mo95872f()) : installationResponse.mo95872f() == null) {
            String str2 = this.f80300b;
            if (str2 != null ? str2.equals(installationResponse.mo95869c()) : installationResponse.mo95869c() == null) {
                String str3 = this.f80301c;
                if (str3 != null ? str3.equals(installationResponse.mo95870d()) : installationResponse.mo95870d() == null) {
                    TokenResult tokenResult = this.f80302d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo95868b()) : installationResponse.mo95868b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f80303e;
                        if (responseCode == null) {
                            if (installationResponse.mo95871e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo95871e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public String mo95872f() {
        return this.f80299a;
    }

    /* renamed from: g */
    public InstallationResponse.C33114a mo95873g() {
        return new C33118b(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f80299a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f80300b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f80301c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        TokenResult tokenResult = this.f80302d;
        if (tokenResult == null) {
            i4 = 0;
        } else {
            i4 = tokenResult.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f80303e;
        if (responseCode != null) {
            i5 = responseCode.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f80299a + ", fid=" + this.f80300b + ", refreshToken=" + this.f80301c + ", authToken=" + this.f80302d + ", responseCode=" + this.f80303e + "}";
    }

    public C33116a(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 TokenResult tokenResult, @C0363p0 InstallationResponse.ResponseCode responseCode) {
        this.f80299a = str;
        this.f80300b = str2;
        this.f80301c = str3;
        this.f80302d = tokenResult;
        this.f80303e = responseCode;
    }
}
