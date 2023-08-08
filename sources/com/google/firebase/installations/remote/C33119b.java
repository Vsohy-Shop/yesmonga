package com.google.firebase.installations.remote;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
public final class C33119b extends TokenResult {

    /* renamed from: a */
    public final String f80309a;

    /* renamed from: b */
    public final long f80310b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f80311c;

    /* renamed from: com.google.firebase.installations.remote.b$b */
    public static final class C33121b extends TokenResult.C33115a {

        /* renamed from: a */
        public String f80312a;

        /* renamed from: b */
        public Long f80313b;

        /* renamed from: c */
        public TokenResult.ResponseCode f80314c;

        /* renamed from: a */
        public TokenResult mo95884a() {
            String str = "";
            if (this.f80313b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C33119b(this.f80312a, this.f80313b.longValue(), this.f80314c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public TokenResult.C33115a mo95885b(TokenResult.ResponseCode responseCode) {
            this.f80314c = responseCode;
            return this;
        }

        /* renamed from: c */
        public TokenResult.C33115a mo95886c(String str) {
            this.f80312a = str;
            return this;
        }

        /* renamed from: d */
        public TokenResult.C33115a mo95887d(long j) {
            this.f80313b = Long.valueOf(j);
            return this;
        }

        public C33121b() {
        }

        public C33121b(TokenResult tokenResult) {
            this.f80312a = tokenResult.mo95881c();
            this.f80313b = Long.valueOf(tokenResult.mo95882d());
            this.f80314c = tokenResult.mo95880b();
        }
    }

    @C0363p0
    /* renamed from: b */
    public TokenResult.ResponseCode mo95880b() {
        return this.f80311c;
    }

    @C0363p0
    /* renamed from: c */
    public String mo95881c() {
        return this.f80309a;
    }

    @C0359n0
    /* renamed from: d */
    public long mo95882d() {
        return this.f80310b;
    }

    /* renamed from: e */
    public TokenResult.C33115a mo95883e() {
        return new C33121b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f80309a;
        if (str != null ? str.equals(tokenResult.mo95881c()) : tokenResult.mo95881c() == null) {
            if (this.f80310b == tokenResult.mo95882d()) {
                TokenResult.ResponseCode responseCode = this.f80311c;
                if (responseCode == null) {
                    if (tokenResult.mo95880b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo95880b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f80309a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f80310b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f80311c;
        if (responseCode != null) {
            i2 = responseCode.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f80309a + ", tokenExpirationTimestamp=" + this.f80310b + ", responseCode=" + this.f80311c + "}";
    }

    public C33119b(@C0363p0 String str, long j, @C0363p0 TokenResult.ResponseCode responseCode) {
        this.f80309a = str;
        this.f80310b = j;
        this.f80311c = responseCode;
    }
}
