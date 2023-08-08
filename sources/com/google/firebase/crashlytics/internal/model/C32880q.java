package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.q */
public final class C32880q extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d {

    /* renamed from: a */
    public final String f79847a;

    /* renamed from: b */
    public final String f79848b;

    /* renamed from: c */
    public final long f79849c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.q$b */
    public static final class C32882b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.C32792a {

        /* renamed from: a */
        public String f79850a;

        /* renamed from: b */
        public String f79851b;

        /* renamed from: c */
        public Long f79852c;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d mo95322a() {
            String str = "";
            if (this.f79850a == null) {
                str = str + " name";
            }
            if (this.f79851b == null) {
                str = str + " code";
            }
            if (this.f79852c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C32880q(this.f79850a, this.f79851b, this.f79852c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.C32792a mo95323b(long j) {
            this.f79852c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.C32792a mo95324c(String str) {
            if (str != null) {
                this.f79851b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.C32792a mo95325d(String str) {
            if (str != null) {
                this.f79850a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @C0359n0
    /* renamed from: b */
    public long mo95319b() {
        return this.f79849c;
    }

    @C0359n0
    /* renamed from: c */
    public String mo95320c() {
        return this.f79848b;
    }

    @C0359n0
    /* renamed from: d */
    public String mo95321d() {
        return this.f79847a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d dVar = (CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d) obj;
        if (!this.f79847a.equals(dVar.mo95321d()) || !this.f79848b.equals(dVar.mo95320c()) || this.f79849c != dVar.mo95319b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f79849c;
        return ((((this.f79847a.hashCode() ^ 1000003) * 1000003) ^ this.f79848b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f79847a + ", code=" + this.f79848b + ", address=" + this.f79849c + "}";
    }

    public C32880q(String str, String str2, long j) {
        this.f79847a = str;
        this.f79848b = str2;
        this.f79849c = j;
    }
}
