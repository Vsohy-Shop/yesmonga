package com.google.firebase.installations;

import androidx.annotation.C0359n0;
import com.google.firebase.installations.C33098o;

/* renamed from: com.google.firebase.installations.a */
public final class C33059a extends C33098o {

    /* renamed from: a */
    public final String f80192a;

    /* renamed from: b */
    public final long f80193b;

    /* renamed from: c */
    public final long f80194c;

    /* renamed from: com.google.firebase.installations.a$b */
    public static final class C33061b extends C33098o.C33099a {

        /* renamed from: a */
        public String f80195a;

        /* renamed from: b */
        public Long f80196b;

        /* renamed from: c */
        public Long f80197c;

        /* renamed from: a */
        public C33098o mo95782a() {
            String str = "";
            if (this.f80195a == null) {
                str = str + " token";
            }
            if (this.f80196b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f80197c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C33059a(this.f80195a, this.f80196b.longValue(), this.f80197c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C33098o.C33099a mo95783b(String str) {
            if (str != null) {
                this.f80195a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public C33098o.C33099a mo95784c(long j) {
            this.f80197c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C33098o.C33099a mo95785d(long j) {
            this.f80196b = Long.valueOf(j);
            return this;
        }

        public C33061b() {
        }

        public C33061b(C33098o oVar) {
            this.f80195a = oVar.mo95775b();
            this.f80196b = Long.valueOf(oVar.mo95777d());
            this.f80197c = Long.valueOf(oVar.mo95776c());
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95775b() {
        return this.f80192a;
    }

    @C0359n0
    /* renamed from: c */
    public long mo95776c() {
        return this.f80194c;
    }

    @C0359n0
    /* renamed from: d */
    public long mo95777d() {
        return this.f80193b;
    }

    /* renamed from: e */
    public C33098o.C33099a mo95778e() {
        return new C33061b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33098o)) {
            return false;
        }
        C33098o oVar = (C33098o) obj;
        if (this.f80192a.equals(oVar.mo95775b()) && this.f80193b == oVar.mo95777d() && this.f80194c == oVar.mo95776c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f80193b;
        long j2 = this.f80194c;
        return ((((this.f80192a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f80192a + ", tokenExpirationTimestamp=" + this.f80193b + ", tokenCreationTimestamp=" + this.f80194c + "}";
    }

    public C33059a(String str, long j, long j2) {
        this.f80192a = str;
        this.f80193b = j;
        this.f80194c = j2;
    }
}
