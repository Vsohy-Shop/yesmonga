package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.n */
public final class C32871n extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b {

    /* renamed from: a */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> f79819a;

    /* renamed from: b */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c f79820b;

    /* renamed from: c */
    public final CrashlyticsReport.C32762a f79821c;

    /* renamed from: d */
    public final CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d f79822d;

    /* renamed from: e */
    public final C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> f79823e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.n$b */
    public static final class C32873b extends CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b {

        /* renamed from: a */
        public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> f79824a;

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c f79825b;

        /* renamed from: c */
        public CrashlyticsReport.C32762a f79826c;

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d f79827d;

        /* renamed from: e */
        public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> f79828e;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b mo95302a() {
            String str = "";
            if (this.f79827d == null) {
                str = str + " signal";
            }
            if (this.f79828e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C32871n(this.f79824a, this.f79825b, this.f79826c, this.f79827d, this.f79828e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b mo95303b(CrashlyticsReport.C32762a aVar) {
            this.f79826c = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b mo95304c(C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> b0Var) {
            if (b0Var != null) {
                this.f79828e = b0Var;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        /* renamed from: d */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b mo95305d(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar) {
            this.f79825b = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b mo95306e(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d dVar) {
            if (dVar != null) {
                this.f79827d = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        /* renamed from: f */
        public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b mo95307f(C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> b0Var) {
            this.f79824a = b0Var;
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public CrashlyticsReport.C32762a mo95286b() {
        return this.f79821c;
    }

    @C0359n0
    /* renamed from: c */
    public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> mo95287c() {
        return this.f79823e;
    }

    @C0363p0
    /* renamed from: d */
    public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c mo95288d() {
        return this.f79820b;
    }

    @C0359n0
    /* renamed from: e */
    public CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d mo95289e() {
        return this.f79822d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32774f.C32782d.C32783a.C32785b)) {
            return false;
        }
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b bVar = (CrashlyticsReport.C32774f.C32782d.C32783a.C32785b) obj;
        C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> b0Var = this.f79819a;
        if (b0Var != null ? b0Var.equals(bVar.mo95290f()) : bVar.mo95290f() == null) {
            CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar = this.f79820b;
            if (cVar != null ? cVar.equals(bVar.mo95288d()) : bVar.mo95288d() == null) {
                CrashlyticsReport.C32762a aVar = this.f79821c;
                if (aVar != null ? aVar.equals(bVar.mo95286b()) : bVar.mo95286b() == null) {
                    if (this.f79822d.equals(bVar.mo95289e()) && this.f79823e.equals(bVar.mo95287c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> mo95290f() {
        return this.f79819a;
    }

    public int hashCode() {
        int i;
        int i2;
        C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> b0Var = this.f79819a;
        int i3 = 0;
        if (b0Var == null) {
            i = 0;
        } else {
            i = b0Var.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar = this.f79820b;
        if (cVar == null) {
            i2 = 0;
        } else {
            i2 = cVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        CrashlyticsReport.C32762a aVar = this.f79821c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f79822d.hashCode()) * 1000003) ^ this.f79823e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f79819a + ", exception=" + this.f79820b + ", appExitInfo=" + this.f79821c + ", signal=" + this.f79822d + ", binaries=" + this.f79823e + "}";
    }

    public C32871n(@C0363p0 C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> b0Var, @C0363p0 CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar, @C0363p0 CrashlyticsReport.C32762a aVar, CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d dVar, C32833b0<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> b0Var2) {
        this.f79819a = b0Var;
        this.f79820b = cVar;
        this.f79821c = aVar;
        this.f79822d = dVar;
        this.f79823e = b0Var2;
    }
}
