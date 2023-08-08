package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.C32995a;

/* renamed from: com.google.firebase.crashlytics.internal.model.h */
public final class C32853h extends CrashlyticsReport.C32774f {

    /* renamed from: a */
    public final String f79743a;

    /* renamed from: b */
    public final String f79744b;

    /* renamed from: c */
    public final long f79745c;

    /* renamed from: d */
    public final Long f79746d;

    /* renamed from: e */
    public final boolean f79747e;

    /* renamed from: f */
    public final CrashlyticsReport.C32774f.C32775a f79748f;

    /* renamed from: g */
    public final CrashlyticsReport.C32774f.C32804f f79749g;

    /* renamed from: h */
    public final CrashlyticsReport.C32774f.C32802e f79750h;

    /* renamed from: i */
    public final CrashlyticsReport.C32774f.C32780c f79751i;

    /* renamed from: j */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d> f79752j;

    /* renamed from: k */
    public final int f79753k;

    /* renamed from: com.google.firebase.crashlytics.internal.model.h$b */
    public static final class C32855b extends CrashlyticsReport.C32774f.C32779b {

        /* renamed from: a */
        public String f79754a;

        /* renamed from: b */
        public String f79755b;

        /* renamed from: c */
        public Long f79756c;

        /* renamed from: d */
        public Long f79757d;

        /* renamed from: e */
        public Boolean f79758e;

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32775a f79759f;

        /* renamed from: g */
        public CrashlyticsReport.C32774f.C32804f f79760g;

        /* renamed from: h */
        public CrashlyticsReport.C32774f.C32802e f79761h;

        /* renamed from: i */
        public CrashlyticsReport.C32774f.C32780c f79762i;

        /* renamed from: j */
        public C32833b0<CrashlyticsReport.C32774f.C32782d> f79763j;

        /* renamed from: k */
        public Integer f79764k;

        /* renamed from: a */
        public CrashlyticsReport.C32774f mo95236a() {
            String str = "";
            if (this.f79754a == null) {
                str = str + " generator";
            }
            if (this.f79755b == null) {
                str = str + " identifier";
            }
            if (this.f79756c == null) {
                str = str + " startedAt";
            }
            if (this.f79758e == null) {
                str = str + " crashed";
            }
            if (this.f79759f == null) {
                str = str + " app";
            }
            if (this.f79764k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C32853h(this.f79754a, this.f79755b, this.f79756c.longValue(), this.f79757d, this.f79758e.booleanValue(), this.f79759f, this.f79760g, this.f79761h, this.f79762i, this.f79763j, this.f79764k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32779b mo95237b(CrashlyticsReport.C32774f.C32775a aVar) {
            if (aVar != null) {
                this.f79759f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32779b mo95238c(boolean z) {
            this.f79758e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32779b mo95239d(CrashlyticsReport.C32774f.C32780c cVar) {
            this.f79762i = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32779b mo95240e(Long l) {
            this.f79757d = l;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32779b mo95241f(C32833b0<CrashlyticsReport.C32774f.C32782d> b0Var) {
            this.f79763j = b0Var;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C32774f.C32779b mo95242g(String str) {
            if (str != null) {
                this.f79754a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        /* renamed from: h */
        public CrashlyticsReport.C32774f.C32779b mo95243h(int i) {
            this.f79764k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C32774f.C32779b mo95244i(String str) {
            if (str != null) {
                this.f79755b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: k */
        public CrashlyticsReport.C32774f.C32779b mo95246k(CrashlyticsReport.C32774f.C32802e eVar) {
            this.f79761h = eVar;
            return this;
        }

        /* renamed from: l */
        public CrashlyticsReport.C32774f.C32779b mo95247l(long j) {
            this.f79756c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public CrashlyticsReport.C32774f.C32779b mo95248m(CrashlyticsReport.C32774f.C32804f fVar) {
            this.f79760g = fVar;
            return this;
        }

        public C32855b() {
        }

        public C32855b(CrashlyticsReport.C32774f fVar) {
            this.f79754a = fVar.mo95203f();
            this.f79755b = fVar.mo95205h();
            this.f79756c = Long.valueOf(fVar.mo95208k());
            this.f79757d = fVar.mo95201d();
            this.f79758e = Boolean.valueOf(fVar.mo95210m());
            this.f79759f = fVar.mo95199b();
            this.f79760g = fVar.mo95209l();
            this.f79761h = fVar.mo95207j();
            this.f79762i = fVar.mo95200c();
            this.f79763j = fVar.mo95202e();
            this.f79764k = Integer.valueOf(fVar.mo95204g());
        }
    }

    @C0359n0
    /* renamed from: b */
    public CrashlyticsReport.C32774f.C32775a mo95199b() {
        return this.f79748f;
    }

    @C0363p0
    /* renamed from: c */
    public CrashlyticsReport.C32774f.C32780c mo95200c() {
        return this.f79751i;
    }

    @C0363p0
    /* renamed from: d */
    public Long mo95201d() {
        return this.f79746d;
    }

    @C0363p0
    /* renamed from: e */
    public C32833b0<CrashlyticsReport.C32774f.C32782d> mo95202e() {
        return this.f79752j;
    }

    public boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.C32774f.C32804f fVar;
        CrashlyticsReport.C32774f.C32802e eVar;
        CrashlyticsReport.C32774f.C32780c cVar;
        C32833b0<CrashlyticsReport.C32774f.C32782d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f)) {
            return false;
        }
        CrashlyticsReport.C32774f fVar2 = (CrashlyticsReport.C32774f) obj;
        if (!this.f79743a.equals(fVar2.mo95203f()) || !this.f79744b.equals(fVar2.mo95205h()) || this.f79745c != fVar2.mo95208k() || ((l = this.f79746d) != null ? !l.equals(fVar2.mo95201d()) : fVar2.mo95201d() != null) || this.f79747e != fVar2.mo95210m() || !this.f79748f.equals(fVar2.mo95199b()) || ((fVar = this.f79749g) != null ? !fVar.equals(fVar2.mo95209l()) : fVar2.mo95209l() != null) || ((eVar = this.f79750h) != null ? !eVar.equals(fVar2.mo95207j()) : fVar2.mo95207j() != null) || ((cVar = this.f79751i) != null ? !cVar.equals(fVar2.mo95200c()) : fVar2.mo95200c() != null) || ((b0Var = this.f79752j) != null ? !b0Var.equals(fVar2.mo95202e()) : fVar2.mo95202e() != null) || this.f79753k != fVar2.mo95204g()) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: f */
    public String mo95203f() {
        return this.f79743a;
    }

    /* renamed from: g */
    public int mo95204g() {
        return this.f79753k;
    }

    @C0359n0
    @C32995a.C32997b
    /* renamed from: h */
    public String mo95205h() {
        return this.f79744b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = this.f79745c;
        int hashCode = (((((this.f79743a.hashCode() ^ 1000003) * 1000003) ^ this.f79744b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f79746d;
        int i6 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.f79747e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int hashCode2 = (((i7 ^ i2) * 1000003) ^ this.f79748f.hashCode()) * 1000003;
        CrashlyticsReport.C32774f.C32804f fVar = this.f79749g;
        if (fVar == null) {
            i3 = 0;
        } else {
            i3 = fVar.hashCode();
        }
        int i8 = (hashCode2 ^ i3) * 1000003;
        CrashlyticsReport.C32774f.C32802e eVar = this.f79750h;
        if (eVar == null) {
            i4 = 0;
        } else {
            i4 = eVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        CrashlyticsReport.C32774f.C32780c cVar = this.f79751i;
        if (cVar == null) {
            i5 = 0;
        } else {
            i5 = cVar.hashCode();
        }
        int i10 = (i9 ^ i5) * 1000003;
        C32833b0<CrashlyticsReport.C32774f.C32782d> b0Var = this.f79752j;
        if (b0Var != null) {
            i6 = b0Var.hashCode();
        }
        return ((i10 ^ i6) * 1000003) ^ this.f79753k;
    }

    @C0363p0
    /* renamed from: j */
    public CrashlyticsReport.C32774f.C32802e mo95207j() {
        return this.f79750h;
    }

    /* renamed from: k */
    public long mo95208k() {
        return this.f79745c;
    }

    @C0363p0
    /* renamed from: l */
    public CrashlyticsReport.C32774f.C32804f mo95209l() {
        return this.f79749g;
    }

    /* renamed from: m */
    public boolean mo95210m() {
        return this.f79747e;
    }

    /* renamed from: n */
    public CrashlyticsReport.C32774f.C32779b mo95211n() {
        return new C32855b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f79743a + ", identifier=" + this.f79744b + ", startedAt=" + this.f79745c + ", endedAt=" + this.f79746d + ", crashed=" + this.f79747e + ", app=" + this.f79748f + ", user=" + this.f79749g + ", os=" + this.f79750h + ", device=" + this.f79751i + ", events=" + this.f79752j + ", generatorType=" + this.f79753k + "}";
    }

    public C32853h(String str, String str2, long j, @C0363p0 Long l, boolean z, CrashlyticsReport.C32774f.C32775a aVar, @C0363p0 CrashlyticsReport.C32774f.C32804f fVar, @C0363p0 CrashlyticsReport.C32774f.C32802e eVar, @C0363p0 CrashlyticsReport.C32774f.C32780c cVar, @C0363p0 C32833b0<CrashlyticsReport.C32774f.C32782d> b0Var, int i) {
        this.f79743a = str;
        this.f79744b = str2;
        this.f79745c = j;
        this.f79746d = l;
        this.f79747e = z;
        this.f79748f = aVar;
        this.f79749g = fVar;
        this.f79750h = eVar;
        this.f79751i = cVar;
        this.f79752j = b0Var;
        this.f79753k = i;
    }
}
