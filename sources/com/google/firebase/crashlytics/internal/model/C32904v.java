package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.v */
public final class C32904v extends CrashlyticsReport.C32774f.C32802e {

    /* renamed from: a */
    public final int f79884a;

    /* renamed from: b */
    public final String f79885b;

    /* renamed from: c */
    public final String f79886c;

    /* renamed from: d */
    public final boolean f79887d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.v$b */
    public static final class C32906b extends CrashlyticsReport.C32774f.C32802e.C32803a {

        /* renamed from: a */
        public Integer f79888a;

        /* renamed from: b */
        public String f79889b;

        /* renamed from: c */
        public String f79890c;

        /* renamed from: d */
        public Boolean f79891d;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32802e mo95370a() {
            String str = "";
            if (this.f79888a == null) {
                str = str + " platform";
            }
            if (this.f79889b == null) {
                str = str + " version";
            }
            if (this.f79890c == null) {
                str = str + " buildVersion";
            }
            if (this.f79891d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C32904v(this.f79888a.intValue(), this.f79889b, this.f79890c, this.f79891d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32802e.C32803a mo95371b(String str) {
            if (str != null) {
                this.f79890c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32802e.C32803a mo95372c(boolean z) {
            this.f79891d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32802e.C32803a mo95373d(int i) {
            this.f79888a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32802e.C32803a mo95374e(String str) {
            if (str != null) {
                this.f79889b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95366b() {
        return this.f79886c;
    }

    /* renamed from: c */
    public int mo95367c() {
        return this.f79884a;
    }

    @C0359n0
    /* renamed from: d */
    public String mo95368d() {
        return this.f79885b;
    }

    /* renamed from: e */
    public boolean mo95369e() {
        return this.f79887d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32802e)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32802e eVar = (CrashlyticsReport.C32774f.C32802e) obj;
        if (this.f79884a != eVar.mo95367c() || !this.f79885b.equals(eVar.mo95368d()) || !this.f79886c.equals(eVar.mo95366b()) || this.f79887d != eVar.mo95369e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f79884a ^ 1000003) * 1000003) ^ this.f79885b.hashCode()) * 1000003) ^ this.f79886c.hashCode()) * 1000003;
        if (this.f79887d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f79884a + ", version=" + this.f79885b + ", buildVersion=" + this.f79886c + ", jailbroken=" + this.f79887d + "}";
    }

    public C32904v(int i, String str, String str2, boolean z) {
        this.f79884a = i;
        this.f79885b = str;
        this.f79886c = str2;
        this.f79887d = z;
    }
}
