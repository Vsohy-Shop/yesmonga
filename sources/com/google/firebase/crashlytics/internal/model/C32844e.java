package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.e */
public final class C32844e extends CrashlyticsReport.C32768d {

    /* renamed from: a */
    public final String f79731a;

    /* renamed from: b */
    public final String f79732b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.e$b */
    public static final class C32846b extends CrashlyticsReport.C32768d.C32769a {

        /* renamed from: a */
        public String f79733a;

        /* renamed from: b */
        public String f79734b;

        /* renamed from: a */
        public CrashlyticsReport.C32768d mo95185a() {
            String str = "";
            if (this.f79733a == null) {
                str = str + " key";
            }
            if (this.f79734b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C32844e(this.f79733a, this.f79734b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32768d.C32769a mo95186b(String str) {
            if (str != null) {
                this.f79733a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32768d.C32769a mo95187c(String str) {
            if (str != null) {
                this.f79734b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95183b() {
        return this.f79731a;
    }

    @C0359n0
    /* renamed from: c */
    public String mo95184c() {
        return this.f79732b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32768d)) {
            return false;
        }
        CrashlyticsReport.C32768d dVar = (CrashlyticsReport.C32768d) obj;
        if (!this.f79731a.equals(dVar.mo95183b()) || !this.f79732b.equals(dVar.mo95184c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f79731a.hashCode() ^ 1000003) * 1000003) ^ this.f79732b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f79731a + ", value=" + this.f79732b + "}";
    }

    public C32844e(String str, String str2) {
        this.f79731a = str;
        this.f79732b = str2;
    }
}
