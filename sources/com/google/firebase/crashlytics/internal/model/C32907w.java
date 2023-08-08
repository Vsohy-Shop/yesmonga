package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.w */
public final class C32907w extends CrashlyticsReport.C32774f.C32804f {

    /* renamed from: a */
    public final String f79892a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.w$b */
    public static final class C32909b extends CrashlyticsReport.C32774f.C32804f.C32805a {

        /* renamed from: a */
        public String f79893a;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32804f mo95376a() {
            String str = "";
            if (this.f79893a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C32907w(this.f79893a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32804f.C32805a mo95377b(String str) {
            if (str != null) {
                this.f79893a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95375b() {
        return this.f79892a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C32774f.C32804f) {
            return this.f79892a.equals(((CrashlyticsReport.C32774f.C32804f) obj).mo95375b());
        }
        return false;
    }

    public int hashCode() {
        return this.f79892a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f79892a + "}";
    }

    public C32907w(String str) {
        this.f79892a = str;
    }
}
