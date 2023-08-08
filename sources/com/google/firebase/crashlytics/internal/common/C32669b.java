package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* renamed from: com.google.firebase.crashlytics.internal.common.b */
public final class C32669b extends C32716p {

    /* renamed from: a */
    public final CrashlyticsReport f79289a;

    /* renamed from: b */
    public final String f79290b;

    /* renamed from: c */
    public final File f79291c;

    public C32669b(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.f79289a = crashlyticsReport;
            if (str != null) {
                this.f79290b = str;
                if (file != null) {
                    this.f79291c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    /* renamed from: b */
    public CrashlyticsReport mo94854b() {
        return this.f79289a;
    }

    /* renamed from: c */
    public File mo94855c() {
        return this.f79291c;
    }

    /* renamed from: d */
    public String mo94856d() {
        return this.f79290b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32716p)) {
            return false;
        }
        C32716p pVar = (C32716p) obj;
        if (!this.f79289a.equals(pVar.mo94854b()) || !this.f79290b.equals(pVar.mo94856d()) || !this.f79291c.equals(pVar.mo94855c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f79289a.hashCode() ^ 1000003) * 1000003) ^ this.f79290b.hashCode()) * 1000003) ^ this.f79291c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f79289a + ", sessionId=" + this.f79290b + ", reportFile=" + this.f79291c + "}";
    }
}
