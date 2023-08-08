package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.l */
public final class C32865l extends CrashlyticsReport.C32774f.C32782d {

    /* renamed from: a */
    public final long f79799a;

    /* renamed from: b */
    public final String f79800b;

    /* renamed from: c */
    public final CrashlyticsReport.C32774f.C32782d.C32783a f79801c;

    /* renamed from: d */
    public final CrashlyticsReport.C32774f.C32782d.C32798c f79802d;

    /* renamed from: e */
    public final CrashlyticsReport.C32774f.C32782d.C32800d f79803e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.l$b */
    public static final class C32867b extends CrashlyticsReport.C32774f.C32782d.C32797b {

        /* renamed from: a */
        public Long f79804a;

        /* renamed from: b */
        public String f79805b;

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a f79806c;

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32798c f79807d;

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32800d f79808e;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d mo95344a() {
            String str = "";
            if (this.f79804a == null) {
                str = str + " timestamp";
            }
            if (this.f79805b == null) {
                str = str + " type";
            }
            if (this.f79806c == null) {
                str = str + " app";
            }
            if (this.f79807d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C32865l(this.f79804a.longValue(), this.f79805b, this.f79806c, this.f79807d, this.f79808e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32797b mo95345b(CrashlyticsReport.C32774f.C32782d.C32783a aVar) {
            if (aVar != null) {
                this.f79806c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32797b mo95346c(CrashlyticsReport.C32774f.C32782d.C32798c cVar) {
            if (cVar != null) {
                this.f79807d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32797b mo95347d(CrashlyticsReport.C32774f.C32782d.C32800d dVar) {
            this.f79808e = dVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32797b mo95348e(long j) {
            this.f79804a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32782d.C32797b mo95349f(String str) {
            if (str != null) {
                this.f79805b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public C32867b() {
        }

        public C32867b(CrashlyticsReport.C32774f.C32782d dVar) {
            this.f79804a = Long.valueOf(dVar.mo95271e());
            this.f79805b = dVar.mo95272f();
            this.f79806c = dVar.mo95268b();
            this.f79807d = dVar.mo95269c();
            this.f79808e = dVar.mo95270d();
        }
    }

    @C0359n0
    /* renamed from: b */
    public CrashlyticsReport.C32774f.C32782d.C32783a mo95268b() {
        return this.f79801c;
    }

    @C0359n0
    /* renamed from: c */
    public CrashlyticsReport.C32774f.C32782d.C32798c mo95269c() {
        return this.f79802d;
    }

    @C0363p0
    /* renamed from: d */
    public CrashlyticsReport.C32774f.C32782d.C32800d mo95270d() {
        return this.f79803e;
    }

    /* renamed from: e */
    public long mo95271e() {
        return this.f79799a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d dVar = (CrashlyticsReport.C32774f.C32782d) obj;
        if (this.f79799a == dVar.mo95271e() && this.f79800b.equals(dVar.mo95272f()) && this.f79801c.equals(dVar.mo95268b()) && this.f79802d.equals(dVar.mo95269c())) {
            CrashlyticsReport.C32774f.C32782d.C32800d dVar2 = this.f79803e;
            if (dVar2 == null) {
                if (dVar.mo95270d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.mo95270d())) {
                return true;
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public String mo95272f() {
        return this.f79800b;
    }

    /* renamed from: g */
    public CrashlyticsReport.C32774f.C32782d.C32797b mo95273g() {
        return new C32867b(this);
    }

    public int hashCode() {
        int i;
        long j = this.f79799a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f79800b.hashCode()) * 1000003) ^ this.f79801c.hashCode()) * 1000003) ^ this.f79802d.hashCode()) * 1000003;
        CrashlyticsReport.C32774f.C32782d.C32800d dVar = this.f79803e;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Event{timestamp=" + this.f79799a + ", type=" + this.f79800b + ", app=" + this.f79801c + ", device=" + this.f79802d + ", log=" + this.f79803e + "}";
    }

    public C32865l(long j, String str, CrashlyticsReport.C32774f.C32782d.C32783a aVar, CrashlyticsReport.C32774f.C32782d.C32798c cVar, @C0363p0 CrashlyticsReport.C32774f.C32782d.C32800d dVar) {
        this.f79799a = j;
        this.f79800b = str;
        this.f79801c = aVar;
        this.f79802d = cVar;
        this.f79803e = dVar;
    }
}
