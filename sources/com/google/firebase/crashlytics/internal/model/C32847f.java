package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.f */
public final class C32847f extends CrashlyticsReport.C32770e {

    /* renamed from: a */
    public final C32833b0<CrashlyticsReport.C32770e.C32772b> f79735a;

    /* renamed from: b */
    public final String f79736b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.f$b */
    public static final class C32849b extends CrashlyticsReport.C32770e.C32771a {

        /* renamed from: a */
        public C32833b0<CrashlyticsReport.C32770e.C32772b> f79737a;

        /* renamed from: b */
        public String f79738b;

        /* renamed from: a */
        public CrashlyticsReport.C32770e mo95191a() {
            String str = "";
            if (this.f79737a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C32847f(this.f79737a, this.f79738b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32770e.C32771a mo95192b(C32833b0<CrashlyticsReport.C32770e.C32772b> b0Var) {
            if (b0Var != null) {
                this.f79737a = b0Var;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32770e.C32771a mo95193c(String str) {
            this.f79738b = str;
            return this;
        }

        public C32849b() {
        }

        public C32849b(CrashlyticsReport.C32770e eVar) {
            this.f79737a = eVar.mo95188b();
            this.f79738b = eVar.mo95189c();
        }
    }

    @C0359n0
    /* renamed from: b */
    public C32833b0<CrashlyticsReport.C32770e.C32772b> mo95188b() {
        return this.f79735a;
    }

    @C0363p0
    /* renamed from: c */
    public String mo95189c() {
        return this.f79736b;
    }

    /* renamed from: d */
    public CrashlyticsReport.C32770e.C32771a mo95190d() {
        return new C32849b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32770e)) {
            return false;
        }
        CrashlyticsReport.C32770e eVar = (CrashlyticsReport.C32770e) obj;
        if (this.f79735a.equals(eVar.mo95188b())) {
            String str = this.f79736b;
            if (str == null) {
                if (eVar.mo95189c() == null) {
                    return true;
                }
            } else if (str.equals(eVar.mo95189c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f79735a.hashCode() ^ 1000003) * 1000003;
        String str = this.f79736b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f79735a + ", orgId=" + this.f79736b + "}";
    }

    public C32847f(C32833b0<CrashlyticsReport.C32770e.C32772b> b0Var, @C0363p0 String str) {
        this.f79735a = b0Var;
        this.f79736b = str;
    }
}
