package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.t */
public final class C32898t extends CrashlyticsReport.C32774f.C32782d.C32798c {

    /* renamed from: a */
    public final Double f79870a;

    /* renamed from: b */
    public final int f79871b;

    /* renamed from: c */
    public final boolean f79872c;

    /* renamed from: d */
    public final int f79873d;

    /* renamed from: e */
    public final long f79874e;

    /* renamed from: f */
    public final long f79875f;

    /* renamed from: com.google.firebase.crashlytics.internal.model.t$b */
    public static final class C32900b extends CrashlyticsReport.C32774f.C32782d.C32798c.C32799a {

        /* renamed from: a */
        public Double f79876a;

        /* renamed from: b */
        public Integer f79877b;

        /* renamed from: c */
        public Boolean f79878c;

        /* renamed from: d */
        public Integer f79879d;

        /* renamed from: e */
        public Long f79880e;

        /* renamed from: f */
        public Long f79881f;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32798c mo95356a() {
            String str = "";
            if (this.f79877b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f79878c == null) {
                str = str + " proximityOn";
            }
            if (this.f79879d == null) {
                str = str + " orientation";
            }
            if (this.f79880e == null) {
                str = str + " ramUsed";
            }
            if (this.f79881f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C32898t(this.f79876a, this.f79877b.intValue(), this.f79878c.booleanValue(), this.f79879d.intValue(), this.f79880e.longValue(), this.f79881f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32798c.C32799a mo95357b(Double d) {
            this.f79876a = d;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32798c.C32799a mo95358c(int i) {
            this.f79877b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32798c.C32799a mo95359d(long j) {
            this.f79881f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32798c.C32799a mo95360e(int i) {
            this.f79879d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32782d.C32798c.C32799a mo95361f(boolean z) {
            this.f79878c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C32774f.C32782d.C32798c.C32799a mo95362g(long j) {
            this.f79880e = Long.valueOf(j);
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public Double mo95350b() {
        return this.f79870a;
    }

    /* renamed from: c */
    public int mo95351c() {
        return this.f79871b;
    }

    /* renamed from: d */
    public long mo95352d() {
        return this.f79875f;
    }

    /* renamed from: e */
    public int mo95353e() {
        return this.f79873d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32798c)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32798c cVar = (CrashlyticsReport.C32774f.C32782d.C32798c) obj;
        Double d = this.f79870a;
        if (d != null ? d.equals(cVar.mo95350b()) : cVar.mo95350b() == null) {
            if (this.f79871b == cVar.mo95351c() && this.f79872c == cVar.mo95355g() && this.f79873d == cVar.mo95353e() && this.f79874e == cVar.mo95354f() && this.f79875f == cVar.mo95352d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo95354f() {
        return this.f79874e;
    }

    /* renamed from: g */
    public boolean mo95355g() {
        return this.f79872c;
    }

    public int hashCode() {
        int i;
        int i2;
        Double d = this.f79870a;
        if (d == null) {
            i = 0;
        } else {
            i = d.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.f79871b) * 1000003;
        if (this.f79872c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.f79874e;
        long j2 = this.f79875f;
        return ((((((i3 ^ i2) * 1000003) ^ this.f79873d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f79870a + ", batteryVelocity=" + this.f79871b + ", proximityOn=" + this.f79872c + ", orientation=" + this.f79873d + ", ramUsed=" + this.f79874e + ", diskUsed=" + this.f79875f + "}";
    }

    public C32898t(@C0363p0 Double d, int i, boolean z, int i2, long j, long j2) {
        this.f79870a = d;
        this.f79871b = i;
        this.f79872c = z;
        this.f79873d = i2;
        this.f79874e = j;
        this.f79875f = j2;
    }
}
