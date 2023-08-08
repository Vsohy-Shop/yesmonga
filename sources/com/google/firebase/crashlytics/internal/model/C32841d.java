package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.d */
public final class C32841d extends CrashlyticsReport.C32762a.C32763a {

    /* renamed from: a */
    public final String f79725a;

    /* renamed from: b */
    public final String f79726b;

    /* renamed from: c */
    public final String f79727c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.d$b */
    public static final class C32843b extends CrashlyticsReport.C32762a.C32763a.C32764a {

        /* renamed from: a */
        public String f79728a;

        /* renamed from: b */
        public String f79729b;

        /* renamed from: c */
        public String f79730c;

        /* renamed from: a */
        public CrashlyticsReport.C32762a.C32763a mo95160a() {
            String str = "";
            if (this.f79728a == null) {
                str = str + " arch";
            }
            if (this.f79729b == null) {
                str = str + " libraryName";
            }
            if (this.f79730c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C32841d(this.f79728a, this.f79729b, this.f79730c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32762a.C32763a.C32764a mo95161b(String str) {
            if (str != null) {
                this.f79728a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32762a.C32763a.C32764a mo95162c(String str) {
            if (str != null) {
                this.f79730c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32762a.C32763a.C32764a mo95163d(String str) {
            if (str != null) {
                this.f79729b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95157b() {
        return this.f79725a;
    }

    @C0359n0
    /* renamed from: c */
    public String mo95158c() {
        return this.f79727c;
    }

    @C0359n0
    /* renamed from: d */
    public String mo95159d() {
        return this.f79726b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32762a.C32763a)) {
            return false;
        }
        CrashlyticsReport.C32762a.C32763a aVar = (CrashlyticsReport.C32762a.C32763a) obj;
        if (!this.f79725a.equals(aVar.mo95157b()) || !this.f79726b.equals(aVar.mo95159d()) || !this.f79727c.equals(aVar.mo95158c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f79725a.hashCode() ^ 1000003) * 1000003) ^ this.f79726b.hashCode()) * 1000003) ^ this.f79727c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f79725a + ", libraryName=" + this.f79726b + ", buildId=" + this.f79727c + "}";
    }

    public C32841d(String str, String str2, String str3) {
        this.f79725a = str;
        this.f79726b = str2;
        this.f79727c = str3;
    }
}
