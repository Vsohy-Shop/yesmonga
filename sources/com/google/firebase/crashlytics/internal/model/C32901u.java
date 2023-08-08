package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.u */
public final class C32901u extends CrashlyticsReport.C32774f.C32782d.C32800d {

    /* renamed from: a */
    public final String f79882a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.u$b */
    public static final class C32903b extends CrashlyticsReport.C32774f.C32782d.C32800d.C32801a {

        /* renamed from: a */
        public String f79883a;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32782d.C32800d mo95364a() {
            String str = "";
            if (this.f79883a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C32901u(this.f79883a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32782d.C32800d.C32801a mo95365b(String str) {
            if (str != null) {
                this.f79883a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95363b() {
        return this.f79882a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C32774f.C32782d.C32800d) {
            return this.f79882a.equals(((CrashlyticsReport.C32774f.C32782d.C32800d) obj).mo95363b());
        }
        return false;
    }

    public int hashCode() {
        return this.f79882a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f79882a + "}";
    }

    public C32901u(String str) {
        this.f79882a = str;
    }
}
