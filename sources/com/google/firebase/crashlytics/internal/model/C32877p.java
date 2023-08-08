package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.p */
public final class C32877p extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c {

    /* renamed from: a */
    public final String f79837a;

    /* renamed from: b */
    public final String f79838b;

    /* renamed from: c */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> f79839c;

    /* renamed from: d */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c f79840d;

    /* renamed from: e */
    public final int f79841e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.p$b */
    public static final class C32879b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a {

        /* renamed from: a */
        public String f79842a;

        /* renamed from: b */
        public String f79843b;

        /* renamed from: c */
        public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> f79844c;

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c f79845d;

        /* renamed from: e */
        public Integer f79846e;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c mo95313a() {
            String str = "";
            if (this.f79842a == null) {
                str = str + " type";
            }
            if (this.f79844c == null) {
                str = str + " frames";
            }
            if (this.f79846e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C32877p(this.f79842a, this.f79843b, this.f79844c, this.f79845d, this.f79846e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a mo95314b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar) {
            this.f79845d = cVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a mo95315c(C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> b0Var) {
            if (b0Var != null) {
                this.f79844c = b0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a mo95316d(int i) {
            this.f79846e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a mo95317e(String str) {
            this.f79843b = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a mo95318f(String str) {
            if (str != null) {
                this.f79842a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @C0363p0
    /* renamed from: b */
    public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c mo95308b() {
        return this.f79840d;
    }

    @C0359n0
    /* renamed from: c */
    public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> mo95309c() {
        return this.f79839c;
    }

    /* renamed from: d */
    public int mo95310d() {
        return this.f79841e;
    }

    @C0363p0
    /* renamed from: e */
    public String mo95311e() {
        return this.f79838b;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar2 = (CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c) obj;
        if (!this.f79837a.equals(cVar2.mo95312f()) || ((str = this.f79838b) != null ? !str.equals(cVar2.mo95311e()) : cVar2.mo95311e() != null) || !this.f79839c.equals(cVar2.mo95309c()) || ((cVar = this.f79840d) != null ? !cVar.equals(cVar2.mo95308b()) : cVar2.mo95308b() != null) || this.f79841e != cVar2.mo95310d()) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: f */
    public String mo95312f() {
        return this.f79837a;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f79837a.hashCode() ^ 1000003) * 1000003;
        String str = this.f79838b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f79839c.hashCode()) * 1000003;
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar = this.f79840d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f79841e;
    }

    public String toString() {
        return "Exception{type=" + this.f79837a + ", reason=" + this.f79838b + ", frames=" + this.f79839c + ", causedBy=" + this.f79840d + ", overflowCount=" + this.f79841e + "}";
    }

    public C32877p(String str, @C0363p0 String str2, C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> b0Var, @C0363p0 CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar, int i) {
        this.f79837a = str;
        this.f79838b = str2;
        this.f79839c = b0Var;
        this.f79840d = cVar;
        this.f79841e = i;
    }
}
