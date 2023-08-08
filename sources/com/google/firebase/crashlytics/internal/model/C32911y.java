package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.C32738e;
import com.google.firebase.crashlytics.internal.model.C32837c0;

/* renamed from: com.google.firebase.crashlytics.internal.model.y */
public final class C32911y extends C32837c0.C32838a {

    /* renamed from: a */
    public final String f79897a;

    /* renamed from: b */
    public final String f79898b;

    /* renamed from: c */
    public final String f79899c;

    /* renamed from: d */
    public final String f79900d;

    /* renamed from: e */
    public final int f79901e;

    /* renamed from: f */
    public final C32738e f79902f;

    public C32911y(String str, String str2, String str3, String str4, int i, C32738e eVar) {
        if (str != null) {
            this.f79897a = str;
            if (str2 != null) {
                this.f79898b = str2;
                if (str3 != null) {
                    this.f79899c = str3;
                    if (str4 != null) {
                        this.f79900d = str4;
                        this.f79901e = i;
                        if (eVar != null) {
                            this.f79902f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    /* renamed from: a */
    public String mo95440a() {
        return this.f79897a;
    }

    /* renamed from: c */
    public int mo95441c() {
        return this.f79901e;
    }

    /* renamed from: d */
    public C32738e mo95442d() {
        return this.f79902f;
    }

    /* renamed from: e */
    public String mo95443e() {
        return this.f79900d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32837c0.C32838a)) {
            return false;
        }
        C32837c0.C32838a aVar = (C32837c0.C32838a) obj;
        if (!this.f79897a.equals(aVar.mo95440a()) || !this.f79898b.equals(aVar.mo95444f()) || !this.f79899c.equals(aVar.mo95445g()) || !this.f79900d.equals(aVar.mo95443e()) || this.f79901e != aVar.mo95441c() || !this.f79902f.equals(aVar.mo95442d())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo95444f() {
        return this.f79898b;
    }

    /* renamed from: g */
    public String mo95445g() {
        return this.f79899c;
    }

    public int hashCode() {
        return ((((((((((this.f79897a.hashCode() ^ 1000003) * 1000003) ^ this.f79898b.hashCode()) * 1000003) ^ this.f79899c.hashCode()) * 1000003) ^ this.f79900d.hashCode()) * 1000003) ^ this.f79901e) * 1000003) ^ this.f79902f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f79897a + ", versionCode=" + this.f79898b + ", versionName=" + this.f79899c + ", installUuid=" + this.f79900d + ", deliveryMechanism=" + this.f79901e + ", developmentPlatformProvider=" + this.f79902f + "}";
    }
}
