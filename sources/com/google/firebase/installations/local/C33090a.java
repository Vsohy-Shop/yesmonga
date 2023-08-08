package com.google.firebase.installations.local;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.installations.local.C33094c;
import com.google.firebase.installations.local.PersistedInstallation;

/* renamed from: com.google.firebase.installations.local.a */
public final class C33090a extends C33094c {

    /* renamed from: b */
    public final String f80261b;

    /* renamed from: c */
    public final PersistedInstallation.RegistrationStatus f80262c;

    /* renamed from: d */
    public final String f80263d;

    /* renamed from: e */
    public final String f80264e;

    /* renamed from: f */
    public final long f80265f;

    /* renamed from: g */
    public final long f80266g;

    /* renamed from: h */
    public final String f80267h;

    /* renamed from: com.google.firebase.installations.local.a$b */
    public static final class C33092b extends C33094c.C33095a {

        /* renamed from: a */
        public String f80268a;

        /* renamed from: b */
        public PersistedInstallation.RegistrationStatus f80269b;

        /* renamed from: c */
        public String f80270c;

        /* renamed from: d */
        public String f80271d;

        /* renamed from: e */
        public Long f80272e;

        /* renamed from: f */
        public Long f80273f;

        /* renamed from: g */
        public String f80274g;

        /* renamed from: a */
        public C33094c mo95839a() {
            String str = "";
            if (this.f80269b == null) {
                str = str + " registrationStatus";
            }
            if (this.f80272e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f80273f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C33090a(this.f80268a, this.f80269b, this.f80270c, this.f80271d, this.f80272e.longValue(), this.f80273f.longValue(), this.f80274g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C33094c.C33095a mo95840b(@C0363p0 String str) {
            this.f80270c = str;
            return this;
        }

        /* renamed from: c */
        public C33094c.C33095a mo95841c(long j) {
            this.f80272e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C33094c.C33095a mo95842d(String str) {
            this.f80268a = str;
            return this;
        }

        /* renamed from: e */
        public C33094c.C33095a mo95843e(@C0363p0 String str) {
            this.f80274g = str;
            return this;
        }

        /* renamed from: f */
        public C33094c.C33095a mo95844f(@C0363p0 String str) {
            this.f80271d = str;
            return this;
        }

        /* renamed from: g */
        public C33094c.C33095a mo95845g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f80269b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C33094c.C33095a mo95846h(long j) {
            this.f80273f = Long.valueOf(j);
            return this;
        }

        public C33092b() {
        }

        public C33092b(C33094c cVar) {
            this.f80268a = cVar.mo95830d();
            this.f80269b = cVar.mo95834g();
            this.f80270c = cVar.mo95828b();
            this.f80271d = cVar.mo95833f();
            this.f80272e = Long.valueOf(cVar.mo95829c());
            this.f80273f = Long.valueOf(cVar.mo95835h());
            this.f80274g = cVar.mo95831e();
        }
    }

    @C0363p0
    /* renamed from: b */
    public String mo95828b() {
        return this.f80263d;
    }

    /* renamed from: c */
    public long mo95829c() {
        return this.f80265f;
    }

    @C0363p0
    /* renamed from: d */
    public String mo95830d() {
        return this.f80261b;
    }

    @C0363p0
    /* renamed from: e */
    public String mo95831e() {
        return this.f80267h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33094c)) {
            return false;
        }
        C33094c cVar = (C33094c) obj;
        String str3 = this.f80261b;
        if (str3 != null ? str3.equals(cVar.mo95830d()) : cVar.mo95830d() == null) {
            if (this.f80262c.equals(cVar.mo95834g()) && ((str = this.f80263d) != null ? str.equals(cVar.mo95828b()) : cVar.mo95828b() == null) && ((str2 = this.f80264e) != null ? str2.equals(cVar.mo95833f()) : cVar.mo95833f() == null) && this.f80265f == cVar.mo95829c() && this.f80266g == cVar.mo95835h()) {
                String str4 = this.f80267h;
                if (str4 == null) {
                    if (cVar.mo95831e() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.mo95831e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public String mo95833f() {
        return this.f80264e;
    }

    @C0359n0
    /* renamed from: g */
    public PersistedInstallation.RegistrationStatus mo95834g() {
        return this.f80262c;
    }

    /* renamed from: h */
    public long mo95835h() {
        return this.f80266g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f80261b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f80262c.hashCode()) * 1000003;
        String str2 = this.f80263d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f80264e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f80265f;
        long j2 = this.f80266g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f80267h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    /* renamed from: n */
    public C33094c.C33095a mo95837n() {
        return new C33092b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f80261b + ", registrationStatus=" + this.f80262c + ", authToken=" + this.f80263d + ", refreshToken=" + this.f80264e + ", expiresInSecs=" + this.f80265f + ", tokenCreationEpochInSecs=" + this.f80266g + ", fisError=" + this.f80267h + "}";
    }

    public C33090a(@C0363p0 String str, PersistedInstallation.RegistrationStatus registrationStatus, @C0363p0 String str2, @C0363p0 String str3, long j, long j2, @C0363p0 String str4) {
        this.f80261b = str;
        this.f80262c = registrationStatus;
        this.f80263d = str2;
        this.f80264e = str3;
        this.f80265f = j;
        this.f80266g = j2;
        this.f80267h = str4;
    }
}
