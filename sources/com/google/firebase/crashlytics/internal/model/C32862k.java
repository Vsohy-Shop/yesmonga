package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.k */
public final class C32862k extends CrashlyticsReport.C32774f.C32780c {

    /* renamed from: a */
    public final int f79781a;

    /* renamed from: b */
    public final String f79782b;

    /* renamed from: c */
    public final int f79783c;

    /* renamed from: d */
    public final long f79784d;

    /* renamed from: e */
    public final long f79785e;

    /* renamed from: f */
    public final boolean f79786f;

    /* renamed from: g */
    public final int f79787g;

    /* renamed from: h */
    public final String f79788h;

    /* renamed from: i */
    public final String f79789i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.k$b */
    public static final class C32864b extends CrashlyticsReport.C32774f.C32780c.C32781a {

        /* renamed from: a */
        public Integer f79790a;

        /* renamed from: b */
        public String f79791b;

        /* renamed from: c */
        public Integer f79792c;

        /* renamed from: d */
        public Long f79793d;

        /* renamed from: e */
        public Long f79794e;

        /* renamed from: f */
        public Boolean f79795f;

        /* renamed from: g */
        public Integer f79796g;

        /* renamed from: h */
        public String f79797h;

        /* renamed from: i */
        public String f79798i;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32780c mo95258a() {
            String str = "";
            if (this.f79790a == null) {
                str = str + " arch";
            }
            if (this.f79791b == null) {
                str = str + " model";
            }
            if (this.f79792c == null) {
                str = str + " cores";
            }
            if (this.f79793d == null) {
                str = str + " ram";
            }
            if (this.f79794e == null) {
                str = str + " diskSpace";
            }
            if (this.f79795f == null) {
                str = str + " simulator";
            }
            if (this.f79796g == null) {
                str = str + " state";
            }
            if (this.f79797h == null) {
                str = str + " manufacturer";
            }
            if (this.f79798i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C32862k(this.f79790a.intValue(), this.f79791b, this.f79792c.intValue(), this.f79793d.longValue(), this.f79794e.longValue(), this.f79795f.booleanValue(), this.f79796g.intValue(), this.f79797h, this.f79798i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95259b(int i) {
            this.f79790a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95260c(int i) {
            this.f79792c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95261d(long j) {
            this.f79794e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95262e(String str) {
            if (str != null) {
                this.f79797h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95263f(String str) {
            if (str != null) {
                this.f79791b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        /* renamed from: g */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95264g(String str) {
            if (str != null) {
                this.f79798i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        /* renamed from: h */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95265h(long j) {
            this.f79793d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95266i(boolean z) {
            this.f79795f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public CrashlyticsReport.C32774f.C32780c.C32781a mo95267j(int i) {
            this.f79796g = Integer.valueOf(i);
            return this;
        }
    }

    @C0359n0
    /* renamed from: b */
    public int mo95249b() {
        return this.f79781a;
    }

    /* renamed from: c */
    public int mo95250c() {
        return this.f79783c;
    }

    /* renamed from: d */
    public long mo95251d() {
        return this.f79785e;
    }

    @C0359n0
    /* renamed from: e */
    public String mo95252e() {
        return this.f79788h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32780c)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32780c cVar = (CrashlyticsReport.C32774f.C32780c) obj;
        if (this.f79781a == cVar.mo95249b() && this.f79782b.equals(cVar.mo95253f()) && this.f79783c == cVar.mo95250c() && this.f79784d == cVar.mo95255h() && this.f79785e == cVar.mo95251d() && this.f79786f == cVar.mo95257j() && this.f79787g == cVar.mo95256i() && this.f79788h.equals(cVar.mo95252e()) && this.f79789i.equals(cVar.mo95254g())) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public String mo95253f() {
        return this.f79782b;
    }

    @C0359n0
    /* renamed from: g */
    public String mo95254g() {
        return this.f79789i;
    }

    /* renamed from: h */
    public long mo95255h() {
        return this.f79784d;
    }

    public int hashCode() {
        int i;
        long j = this.f79784d;
        long j2 = this.f79785e;
        int hashCode = (((((((((this.f79781a ^ 1000003) * 1000003) ^ this.f79782b.hashCode()) * 1000003) ^ this.f79783c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f79786f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f79787g) * 1000003) ^ this.f79788h.hashCode()) * 1000003) ^ this.f79789i.hashCode();
    }

    /* renamed from: i */
    public int mo95256i() {
        return this.f79787g;
    }

    /* renamed from: j */
    public boolean mo95257j() {
        return this.f79786f;
    }

    public String toString() {
        return "Device{arch=" + this.f79781a + ", model=" + this.f79782b + ", cores=" + this.f79783c + ", ram=" + this.f79784d + ", diskSpace=" + this.f79785e + ", simulator=" + this.f79786f + ", state=" + this.f79787g + ", manufacturer=" + this.f79788h + ", modelClass=" + this.f79789i + "}";
    }

    public C32862k(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f79781a = i;
        this.f79782b = str;
        this.f79783c = i2;
        this.f79784d = j;
        this.f79785e = j2;
        this.f79786f = z;
        this.f79787g = i3;
        this.f79788h = str2;
        this.f79789i = str3;
    }
}
