package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.b */
public final class C32830b extends CrashlyticsReport {

    /* renamed from: b */
    public final String f79690b;

    /* renamed from: c */
    public final String f79691c;

    /* renamed from: d */
    public final int f79692d;

    /* renamed from: e */
    public final String f79693e;

    /* renamed from: f */
    public final String f79694f;

    /* renamed from: g */
    public final String f79695g;

    /* renamed from: h */
    public final CrashlyticsReport.C32774f f79696h;

    /* renamed from: i */
    public final CrashlyticsReport.C32770e f79697i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b */
    public static final class C32832b extends CrashlyticsReport.C32767c {

        /* renamed from: a */
        public String f79698a;

        /* renamed from: b */
        public String f79699b;

        /* renamed from: c */
        public Integer f79700c;

        /* renamed from: d */
        public String f79701d;

        /* renamed from: e */
        public String f79702e;

        /* renamed from: f */
        public String f79703f;

        /* renamed from: g */
        public CrashlyticsReport.C32774f f79704g;

        /* renamed from: h */
        public CrashlyticsReport.C32770e f79705h;

        /* renamed from: a */
        public CrashlyticsReport mo95174a() {
            String str = "";
            if (this.f79698a == null) {
                str = str + " sdkVersion";
            }
            if (this.f79699b == null) {
                str = str + " gmpAppId";
            }
            if (this.f79700c == null) {
                str = str + " platform";
            }
            if (this.f79701d == null) {
                str = str + " installationUuid";
            }
            if (this.f79702e == null) {
                str = str + " buildVersion";
            }
            if (this.f79703f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C32830b(this.f79698a, this.f79699b, this.f79700c.intValue(), this.f79701d, this.f79702e, this.f79703f, this.f79704g, this.f79705h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32767c mo95175b(String str) {
            if (str != null) {
                this.f79702e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32767c mo95176c(String str) {
            if (str != null) {
                this.f79703f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32767c mo95177d(String str) {
            if (str != null) {
                this.f79699b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        /* renamed from: e */
        public CrashlyticsReport.C32767c mo95178e(String str) {
            if (str != null) {
                this.f79701d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        /* renamed from: f */
        public CrashlyticsReport.C32767c mo95179f(CrashlyticsReport.C32770e eVar) {
            this.f79705h = eVar;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C32767c mo95180g(int i) {
            this.f79700c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C32767c mo95181h(String str) {
            if (str != null) {
                this.f79698a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        /* renamed from: i */
        public CrashlyticsReport.C32767c mo95182i(CrashlyticsReport.C32774f fVar) {
            this.f79704g = fVar;
            return this;
        }

        public C32832b() {
        }

        public C32832b(CrashlyticsReport crashlyticsReport) {
            this.f79698a = crashlyticsReport.mo95140i();
            this.f79699b = crashlyticsReport.mo95136e();
            this.f79700c = Integer.valueOf(crashlyticsReport.mo95139h());
            this.f79701d = crashlyticsReport.mo95137f();
            this.f79702e = crashlyticsReport.mo95134c();
            this.f79703f = crashlyticsReport.mo95135d();
            this.f79704g = crashlyticsReport.mo95141j();
            this.f79705h = crashlyticsReport.mo95138g();
        }
    }

    @C0359n0
    /* renamed from: c */
    public String mo95134c() {
        return this.f79694f;
    }

    @C0359n0
    /* renamed from: d */
    public String mo95135d() {
        return this.f79695g;
    }

    @C0359n0
    /* renamed from: e */
    public String mo95136e() {
        return this.f79691c;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.C32774f fVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f79690b.equals(crashlyticsReport.mo95140i()) && this.f79691c.equals(crashlyticsReport.mo95136e()) && this.f79692d == crashlyticsReport.mo95139h() && this.f79693e.equals(crashlyticsReport.mo95137f()) && this.f79694f.equals(crashlyticsReport.mo95134c()) && this.f79695g.equals(crashlyticsReport.mo95135d()) && ((fVar = this.f79696h) != null ? fVar.equals(crashlyticsReport.mo95141j()) : crashlyticsReport.mo95141j() == null)) {
            CrashlyticsReport.C32770e eVar = this.f79697i;
            if (eVar == null) {
                if (crashlyticsReport.mo95138g() == null) {
                    return true;
                }
            } else if (eVar.equals(crashlyticsReport.mo95138g())) {
                return true;
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public String mo95137f() {
        return this.f79693e;
    }

    @C0363p0
    /* renamed from: g */
    public CrashlyticsReport.C32770e mo95138g() {
        return this.f79697i;
    }

    /* renamed from: h */
    public int mo95139h() {
        return this.f79692d;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((this.f79690b.hashCode() ^ 1000003) * 1000003) ^ this.f79691c.hashCode()) * 1000003) ^ this.f79692d) * 1000003) ^ this.f79693e.hashCode()) * 1000003) ^ this.f79694f.hashCode()) * 1000003) ^ this.f79695g.hashCode()) * 1000003;
        CrashlyticsReport.C32774f fVar = this.f79696h;
        int i2 = 0;
        if (fVar == null) {
            i = 0;
        } else {
            i = fVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        CrashlyticsReport.C32770e eVar = this.f79697i;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return i3 ^ i2;
    }

    @C0359n0
    /* renamed from: i */
    public String mo95140i() {
        return this.f79690b;
    }

    @C0363p0
    /* renamed from: j */
    public CrashlyticsReport.C32774f mo95141j() {
        return this.f79696h;
    }

    /* renamed from: l */
    public CrashlyticsReport.C32767c mo95143l() {
        return new C32832b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f79690b + ", gmpAppId=" + this.f79691c + ", platform=" + this.f79692d + ", installationUuid=" + this.f79693e + ", buildVersion=" + this.f79694f + ", displayVersion=" + this.f79695g + ", session=" + this.f79696h + ", ndkPayload=" + this.f79697i + "}";
    }

    public C32830b(String str, String str2, int i, String str3, String str4, String str5, @C0363p0 CrashlyticsReport.C32774f fVar, @C0363p0 CrashlyticsReport.C32770e eVar) {
        this.f79690b = str;
        this.f79691c = str2;
        this.f79692d = i;
        this.f79693e = str3;
        this.f79694f = str4;
        this.f79695g = str5;
        this.f79696h = fVar;
        this.f79697i = eVar;
    }
}
