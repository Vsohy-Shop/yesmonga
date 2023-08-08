package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.s */
public final class C32886s extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b {

    /* renamed from: a */
    public final long f79859a;

    /* renamed from: b */
    public final String f79860b;

    /* renamed from: c */
    public final String f79861c;

    /* renamed from: d */
    public final long f79862d;

    /* renamed from: e */
    public final int f79863e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.s$b */
    public static final class C32888b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a {

        /* renamed from: a */
        public Long f79864a;

        /* renamed from: b */
        public String f79865b;

        /* renamed from: c */
        public String f79866c;

        /* renamed from: d */
        public Long f79867d;

        /* renamed from: e */
        public Integer f79868e;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b mo95338a() {
            String str = "";
            if (this.f79864a == null) {
                str = str + " pc";
            }
            if (this.f79865b == null) {
                str = str + " symbol";
            }
            if (this.f79867d == null) {
                str = str + " offset";
            }
            if (this.f79868e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C32886s(this.f79864a.longValue(), this.f79865b, this.f79866c, this.f79867d.longValue(), this.f79868e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a mo95339b(String str) {
            this.f79866c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a mo95340c(int i) {
            this.f79868e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a mo95341d(long j) {
            this.f79867d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a mo95342e(long j) {
            this.f79864a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a mo95343f(String str) {
            if (str != null) {
                this.f79865b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @C0363p0
    /* renamed from: b */
    public String mo95333b() {
        return this.f79861c;
    }

    /* renamed from: c */
    public int mo95334c() {
        return this.f79863e;
    }

    /* renamed from: d */
    public long mo95335d() {
        return this.f79862d;
    }

    /* renamed from: e */
    public long mo95336e() {
        return this.f79859a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b bVar = (CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b) obj;
        if (this.f79859a == bVar.mo95336e() && this.f79860b.equals(bVar.mo95337f()) && ((str = this.f79861c) != null ? str.equals(bVar.mo95333b()) : bVar.mo95333b() == null) && this.f79862d == bVar.mo95335d() && this.f79863e == bVar.mo95334c()) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public String mo95337f() {
        return this.f79860b;
    }

    public int hashCode() {
        int i;
        long j = this.f79859a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f79860b.hashCode()) * 1000003;
        String str = this.f79861c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j2 = this.f79862d;
        return ((((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f79863e;
    }

    public String toString() {
        return "Frame{pc=" + this.f79859a + ", symbol=" + this.f79860b + ", file=" + this.f79861c + ", offset=" + this.f79862d + ", importance=" + this.f79863e + "}";
    }

    public C32886s(long j, String str, @C0363p0 String str2, long j2, int i) {
        this.f79859a = j;
        this.f79860b = str;
        this.f79861c = str2;
        this.f79862d = j2;
        this.f79863e = i;
    }
}
