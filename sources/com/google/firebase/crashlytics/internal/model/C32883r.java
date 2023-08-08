package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.r */
public final class C32883r extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e {

    /* renamed from: a */
    public final String f79853a;

    /* renamed from: b */
    public final int f79854b;

    /* renamed from: c */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> f79855c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.r$b */
    public static final class C32885b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32794a {

        /* renamed from: a */
        public String f79856a;

        /* renamed from: b */
        public Integer f79857b;

        /* renamed from: c */
        public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> f79858c;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e mo95329a() {
            String str = "";
            if (this.f79856a == null) {
                str = str + " name";
            }
            if (this.f79857b == null) {
                str = str + " importance";
            }
            if (this.f79858c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C32883r(this.f79856a, this.f79857b.intValue(), this.f79858c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32794a mo95330b(C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> b0Var) {
            if (b0Var != null) {
                this.f79858c = b0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32794a mo95331c(int i) {
            this.f79857b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32794a mo95332d(String str) {
            if (str != null) {
                this.f79856a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @C0359n0
    /* renamed from: b */
    public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> mo95326b() {
        return this.f79855c;
    }

    /* renamed from: c */
    public int mo95327c() {
        return this.f79854b;
    }

    @C0359n0
    /* renamed from: d */
    public String mo95328d() {
        return this.f79853a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e eVar = (CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e) obj;
        if (!this.f79853a.equals(eVar.mo95328d()) || this.f79854b != eVar.mo95327c() || !this.f79855c.equals(eVar.mo95326b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f79853a.hashCode() ^ 1000003) * 1000003) ^ this.f79854b) * 1000003) ^ this.f79855c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f79853a + ", importance=" + this.f79854b + ", frames=" + this.f79855c + "}";
    }

    public C32883r(String str, int i, C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> b0Var) {
        this.f79853a = str;
        this.f79854b = i;
        this.f79855c = b0Var;
    }
}
