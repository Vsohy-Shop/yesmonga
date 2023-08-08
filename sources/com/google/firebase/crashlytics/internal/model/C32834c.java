package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.c */
public final class C32834c extends CrashlyticsReport.C32762a {

    /* renamed from: a */
    public final int f79707a;

    /* renamed from: b */
    public final String f79708b;

    /* renamed from: c */
    public final int f79709c;

    /* renamed from: d */
    public final int f79710d;

    /* renamed from: e */
    public final long f79711e;

    /* renamed from: f */
    public final long f79712f;

    /* renamed from: g */
    public final long f79713g;

    /* renamed from: h */
    public final String f79714h;

    /* renamed from: i */
    public final C32833b0<CrashlyticsReport.C32762a.C32763a> f79715i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.c$b */
    public static final class C32836b extends CrashlyticsReport.C32762a.C32765b {

        /* renamed from: a */
        public Integer f79716a;

        /* renamed from: b */
        public String f79717b;

        /* renamed from: c */
        public Integer f79718c;

        /* renamed from: d */
        public Integer f79719d;

        /* renamed from: e */
        public Long f79720e;

        /* renamed from: f */
        public Long f79721f;

        /* renamed from: g */
        public Long f79722g;

        /* renamed from: h */
        public String f79723h;

        /* renamed from: i */
        public C32833b0<CrashlyticsReport.C32762a.C32763a> f79724i;

        /* renamed from: a */
        public CrashlyticsReport.C32762a mo95164a() {
            String str = "";
            if (this.f79716a == null) {
                str = str + " pid";
            }
            if (this.f79717b == null) {
                str = str + " processName";
            }
            if (this.f79718c == null) {
                str = str + " reasonCode";
            }
            if (this.f79719d == null) {
                str = str + " importance";
            }
            if (this.f79720e == null) {
                str = str + " pss";
            }
            if (this.f79721f == null) {
                str = str + " rss";
            }
            if (this.f79722g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C32834c(this.f79716a.intValue(), this.f79717b, this.f79718c.intValue(), this.f79719d.intValue(), this.f79720e.longValue(), this.f79721f.longValue(), this.f79722g.longValue(), this.f79723h, this.f79724i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32762a.C32765b mo95165b(@C0363p0 C32833b0<CrashlyticsReport.C32762a.C32763a> b0Var) {
            this.f79724i = b0Var;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32762a.C32765b mo95166c(int i) {
            this.f79719d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32762a.C32765b mo95167d(int i) {
            this.f79716a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32762a.C32765b mo95168e(String str) {
            if (str != null) {
                this.f79717b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        /* renamed from: f */
        public CrashlyticsReport.C32762a.C32765b mo95169f(long j) {
            this.f79720e = Long.valueOf(j);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C32762a.C32765b mo95170g(int i) {
            this.f79718c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C32762a.C32765b mo95171h(long j) {
            this.f79721f = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C32762a.C32765b mo95172i(long j) {
            this.f79722g = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public CrashlyticsReport.C32762a.C32765b mo95173j(@C0363p0 String str) {
            this.f79723h = str;
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public C32833b0<CrashlyticsReport.C32762a.C32763a> mo95148b() {
        return this.f79715i;
    }

    @C0359n0
    /* renamed from: c */
    public int mo95149c() {
        return this.f79710d;
    }

    @C0359n0
    /* renamed from: d */
    public int mo95150d() {
        return this.f79707a;
    }

    @C0359n0
    /* renamed from: e */
    public String mo95151e() {
        return this.f79708b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32762a)) {
            return false;
        }
        CrashlyticsReport.C32762a aVar = (CrashlyticsReport.C32762a) obj;
        if (this.f79707a == aVar.mo95150d() && this.f79708b.equals(aVar.mo95151e()) && this.f79709c == aVar.mo95153g() && this.f79710d == aVar.mo95149c() && this.f79711e == aVar.mo95152f() && this.f79712f == aVar.mo95154h() && this.f79713g == aVar.mo95155i() && ((str = this.f79714h) != null ? str.equals(aVar.mo95156j()) : aVar.mo95156j() == null)) {
            C32833b0<CrashlyticsReport.C32762a.C32763a> b0Var = this.f79715i;
            if (b0Var == null) {
                if (aVar.mo95148b() == null) {
                    return true;
                }
            } else if (b0Var.equals(aVar.mo95148b())) {
                return true;
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public long mo95152f() {
        return this.f79711e;
    }

    @C0359n0
    /* renamed from: g */
    public int mo95153g() {
        return this.f79709c;
    }

    @C0359n0
    /* renamed from: h */
    public long mo95154h() {
        return this.f79712f;
    }

    public int hashCode() {
        int i;
        long j = this.f79711e;
        long j2 = this.f79712f;
        long j3 = this.f79713g;
        int hashCode = (((((((((((((this.f79707a ^ 1000003) * 1000003) ^ this.f79708b.hashCode()) * 1000003) ^ this.f79709c) * 1000003) ^ this.f79710d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f79714h;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C32833b0<CrashlyticsReport.C32762a.C32763a> b0Var = this.f79715i;
        if (b0Var != null) {
            i2 = b0Var.hashCode();
        }
        return i3 ^ i2;
    }

    @C0359n0
    /* renamed from: i */
    public long mo95155i() {
        return this.f79713g;
    }

    @C0363p0
    /* renamed from: j */
    public String mo95156j() {
        return this.f79714h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f79707a + ", processName=" + this.f79708b + ", reasonCode=" + this.f79709c + ", importance=" + this.f79710d + ", pss=" + this.f79711e + ", rss=" + this.f79712f + ", timestamp=" + this.f79713g + ", traceFile=" + this.f79714h + ", buildIdMappingForArch=" + this.f79715i + "}";
    }

    public C32834c(int i, String str, int i2, int i3, long j, long j2, long j3, @C0363p0 String str2, @C0363p0 C32833b0<CrashlyticsReport.C32762a.C32763a> b0Var) {
        this.f79707a = i;
        this.f79708b = str;
        this.f79709c = i2;
        this.f79710d = i3;
        this.f79711e = j;
        this.f79712f = j2;
        this.f79713g = j3;
        this.f79714h = str2;
        this.f79715i = b0Var;
    }
}
