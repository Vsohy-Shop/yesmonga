package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.C32995a;

/* renamed from: com.google.firebase.crashlytics.internal.model.o */
public final class C32874o extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a {

    /* renamed from: a */
    public final long f79829a;

    /* renamed from: b */
    public final long f79830b;

    /* renamed from: c */
    public final String f79831c;

    /* renamed from: d */
    public final String f79832d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.o$b */
    public static final class C32876b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.C32787a {

        /* renamed from: a */
        public Long f79833a;

        /* renamed from: b */
        public Long f79834b;

        /* renamed from: c */
        public String f79835c;

        /* renamed from: d */
        public String f79836d;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a mo95296a() {
            String str = "";
            if (this.f79833a == null) {
                str = str + " baseAddress";
            }
            if (this.f79834b == null) {
                str = str + " size";
            }
            if (this.f79835c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C32874o(this.f79833a.longValue(), this.f79834b.longValue(), this.f79835c, this.f79836d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.C32787a mo95297b(long j) {
            this.f79833a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.C32787a mo95298c(String str) {
            if (str != null) {
                this.f79835c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.C32787a mo95299d(long j) {
            this.f79834b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.C32787a mo95300e(@C0363p0 String str) {
            this.f79836d = str;
            return this;
        }
    }

    @C0359n0
    /* renamed from: b */
    public long mo95291b() {
        return this.f79829a;
    }

    @C0359n0
    /* renamed from: c */
    public String mo95292c() {
        return this.f79831c;
    }

    /* renamed from: d */
    public long mo95293d() {
        return this.f79830b;
    }

    @C0363p0
    @C32995a.C32997b
    /* renamed from: e */
    public String mo95294e() {
        return this.f79832d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a aVar = (CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a) obj;
        if (this.f79829a == aVar.mo95291b() && this.f79830b == aVar.mo95293d() && this.f79831c.equals(aVar.mo95292c())) {
            String str = this.f79832d;
            if (str == null) {
                if (aVar.mo95294e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo95294e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f79829a;
        long j2 = this.f79830b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f79831c.hashCode()) * 1000003;
        String str = this.f79832d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f79829a + ", size=" + this.f79830b + ", name=" + this.f79831c + ", uuid=" + this.f79832d + "}";
    }

    public C32874o(long j, long j2, String str, @C0363p0 String str2) {
        this.f79829a = j;
        this.f79830b = j2;
        this.f79831c = str;
        this.f79832d = str2;
    }
}
