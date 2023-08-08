package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.i */
public final class C32856i extends CrashlyticsReport.C32774f.C32775a {

    /* renamed from: a */
    public final String f79765a;

    /* renamed from: b */
    public final String f79766b;

    /* renamed from: c */
    public final String f79767c;

    /* renamed from: d */
    public final CrashlyticsReport.C32774f.C32775a.C32777b f79768d;

    /* renamed from: e */
    public final String f79769e;

    /* renamed from: f */
    public final String f79770f;

    /* renamed from: g */
    public final String f79771g;

    /* renamed from: com.google.firebase.crashlytics.internal.model.i$b */
    public static final class C32858b extends CrashlyticsReport.C32774f.C32775a.C32776a {

        /* renamed from: a */
        public String f79772a;

        /* renamed from: b */
        public String f79773b;

        /* renamed from: c */
        public String f79774c;

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32775a.C32777b f79775d;

        /* renamed from: e */
        public String f79776e;

        /* renamed from: f */
        public String f79777f;

        /* renamed from: g */
        public String f79778g;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32775a mo95224a() {
            String str = "";
            if (this.f79772a == null) {
                str = str + " identifier";
            }
            if (this.f79773b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C32856i(this.f79772a, this.f79773b, this.f79774c, this.f79775d, this.f79776e, this.f79777f, this.f79778g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95225b(@C0363p0 String str) {
            this.f79777f = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95226c(@C0363p0 String str) {
            this.f79778g = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95227d(String str) {
            this.f79774c = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95228e(String str) {
            if (str != null) {
                this.f79772a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95229f(String str) {
            this.f79776e = str;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95230g(CrashlyticsReport.C32774f.C32775a.C32777b bVar) {
            this.f79775d = bVar;
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C32774f.C32775a.C32776a mo95231h(String str) {
            if (str != null) {
                this.f79773b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        public C32858b() {
        }

        public C32858b(CrashlyticsReport.C32774f.C32775a aVar) {
            this.f79772a = aVar.mo95218e();
            this.f79773b = aVar.mo95221h();
            this.f79774c = aVar.mo95217d();
            this.f79775d = aVar.mo95220g();
            this.f79776e = aVar.mo95219f();
            this.f79777f = aVar.mo95215b();
            this.f79778g = aVar.mo95216c();
        }
    }

    @C0363p0
    /* renamed from: b */
    public String mo95215b() {
        return this.f79770f;
    }

    @C0363p0
    /* renamed from: c */
    public String mo95216c() {
        return this.f79771g;
    }

    @C0363p0
    /* renamed from: d */
    public String mo95217d() {
        return this.f79767c;
    }

    @C0359n0
    /* renamed from: e */
    public String mo95218e() {
        return this.f79765a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.C32774f.C32775a.C32777b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32775a)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32775a aVar = (CrashlyticsReport.C32774f.C32775a) obj;
        if (this.f79765a.equals(aVar.mo95218e()) && this.f79766b.equals(aVar.mo95221h()) && ((str = this.f79767c) != null ? str.equals(aVar.mo95217d()) : aVar.mo95217d() == null) && ((bVar = this.f79768d) != null ? bVar.equals(aVar.mo95220g()) : aVar.mo95220g() == null) && ((str2 = this.f79769e) != null ? str2.equals(aVar.mo95219f()) : aVar.mo95219f() == null) && ((str3 = this.f79770f) != null ? str3.equals(aVar.mo95215b()) : aVar.mo95215b() == null)) {
            String str4 = this.f79771g;
            if (str4 == null) {
                if (aVar.mo95216c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.mo95216c())) {
                return true;
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public String mo95219f() {
        return this.f79769e;
    }

    @C0363p0
    /* renamed from: g */
    public CrashlyticsReport.C32774f.C32775a.C32777b mo95220g() {
        return this.f79768d;
    }

    @C0359n0
    /* renamed from: h */
    public String mo95221h() {
        return this.f79766b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.f79765a.hashCode() ^ 1000003) * 1000003) ^ this.f79766b.hashCode()) * 1000003;
        String str = this.f79767c;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        CrashlyticsReport.C32774f.C32775a.C32777b bVar = this.f79768d;
        if (bVar == null) {
            i2 = 0;
        } else {
            i2 = bVar.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str2 = this.f79769e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str3 = this.f79770f;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str4 = this.f79771g;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 ^ i5;
    }

    /* renamed from: i */
    public CrashlyticsReport.C32774f.C32775a.C32776a mo95222i() {
        return new C32858b(this);
    }

    public String toString() {
        return "Application{identifier=" + this.f79765a + ", version=" + this.f79766b + ", displayVersion=" + this.f79767c + ", organization=" + this.f79768d + ", installationUuid=" + this.f79769e + ", developmentPlatform=" + this.f79770f + ", developmentPlatformVersion=" + this.f79771g + "}";
    }

    public C32856i(String str, String str2, @C0363p0 String str3, @C0363p0 CrashlyticsReport.C32774f.C32775a.C32777b bVar, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6) {
        this.f79765a = str;
        this.f79766b = str2;
        this.f79767c = str3;
        this.f79768d = bVar;
        this.f79769e = str4;
        this.f79770f = str5;
        this.f79771g = str6;
    }
}
