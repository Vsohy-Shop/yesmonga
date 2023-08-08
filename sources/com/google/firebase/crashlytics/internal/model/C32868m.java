package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.m */
public final class C32868m extends CrashlyticsReport.C32774f.C32782d.C32783a {

    /* renamed from: a */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b f79809a;

    /* renamed from: b */
    public final C32833b0<CrashlyticsReport.C32768d> f79810b;

    /* renamed from: c */
    public final C32833b0<CrashlyticsReport.C32768d> f79811c;

    /* renamed from: d */
    public final Boolean f79812d;

    /* renamed from: e */
    public final int f79813e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.m$b */
    public static final class C32870b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32784a {

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b f79814a;

        /* renamed from: b */
        public C32833b0<CrashlyticsReport.C32768d> f79815b;

        /* renamed from: c */
        public C32833b0<CrashlyticsReport.C32768d> f79816c;

        /* renamed from: d */
        public Boolean f79817d;

        /* renamed from: e */
        public Integer f79818e;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a mo95280a() {
            String str = "";
            if (this.f79814a == null) {
                str = str + " execution";
            }
            if (this.f79818e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C32868m(this.f79814a, this.f79815b, this.f79816c, this.f79817d, this.f79818e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32784a mo95281b(@C0363p0 Boolean bool) {
            this.f79817d = bool;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32784a mo95282c(C32833b0<CrashlyticsReport.C32768d> b0Var) {
            this.f79815b = b0Var;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32784a mo95283d(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b bVar) {
            if (bVar != null) {
                this.f79814a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32784a mo95284e(C32833b0<CrashlyticsReport.C32768d> b0Var) {
            this.f79816c = b0Var;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32784a mo95285f(int i) {
            this.f79818e = Integer.valueOf(i);
            return this;
        }

        public C32870b() {
        }

        public C32870b(CrashlyticsReport.C32774f.C32782d.C32783a aVar) {
            this.f79814a = aVar.mo95276d();
            this.f79815b = aVar.mo95275c();
            this.f79816c = aVar.mo95277e();
            this.f79817d = aVar.mo95274b();
            this.f79818e = Integer.valueOf(aVar.mo95278f());
        }
    }

    @C0363p0
    /* renamed from: b */
    public Boolean mo95274b() {
        return this.f79812d;
    }

    @C0363p0
    /* renamed from: c */
    public C32833b0<CrashlyticsReport.C32768d> mo95275c() {
        return this.f79810b;
    }

    @C0359n0
    /* renamed from: d */
    public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b mo95276d() {
        return this.f79809a;
    }

    @C0363p0
    /* renamed from: e */
    public C32833b0<CrashlyticsReport.C32768d> mo95277e() {
        return this.f79811c;
    }

    public boolean equals(Object obj) {
        C32833b0<CrashlyticsReport.C32768d> b0Var;
        C32833b0<CrashlyticsReport.C32768d> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a aVar = (CrashlyticsReport.C32774f.C32782d.C32783a) obj;
        if (!this.f79809a.equals(aVar.mo95276d()) || ((b0Var = this.f79810b) != null ? !b0Var.equals(aVar.mo95275c()) : aVar.mo95275c() != null) || ((b0Var2 = this.f79811c) != null ? !b0Var2.equals(aVar.mo95277e()) : aVar.mo95277e() != null) || ((bool = this.f79812d) != null ? !bool.equals(aVar.mo95274b()) : aVar.mo95274b() != null) || this.f79813e != aVar.mo95278f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo95278f() {
        return this.f79813e;
    }

    /* renamed from: g */
    public CrashlyticsReport.C32774f.C32782d.C32783a.C32784a mo95279g() {
        return new C32870b(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f79809a.hashCode() ^ 1000003) * 1000003;
        C32833b0<CrashlyticsReport.C32768d> b0Var = this.f79810b;
        int i3 = 0;
        if (b0Var == null) {
            i = 0;
        } else {
            i = b0Var.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C32833b0<CrashlyticsReport.C32768d> b0Var2 = this.f79811c;
        if (b0Var2 == null) {
            i2 = 0;
        } else {
            i2 = b0Var2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Boolean bool = this.f79812d;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ this.f79813e;
    }

    public String toString() {
        return "Application{execution=" + this.f79809a + ", customAttributes=" + this.f79810b + ", internalKeys=" + this.f79811c + ", background=" + this.f79812d + ", uiOrientation=" + this.f79813e + "}";
    }

    public C32868m(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b bVar, @C0363p0 C32833b0<CrashlyticsReport.C32768d> b0Var, @C0363p0 C32833b0<CrashlyticsReport.C32768d> b0Var2, @C0363p0 Boolean bool, int i) {
        this.f79809a = bVar;
        this.f79810b = b0Var;
        this.f79811c = b0Var2;
        this.f79812d = bool;
        this.f79813e = i;
    }
}
