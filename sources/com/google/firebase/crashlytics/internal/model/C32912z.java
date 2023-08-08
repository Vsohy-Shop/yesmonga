package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C32837c0;

/* renamed from: com.google.firebase.crashlytics.internal.model.z */
public final class C32912z extends C32837c0.C32839b {

    /* renamed from: a */
    public final int f79903a;

    /* renamed from: b */
    public final String f79904b;

    /* renamed from: c */
    public final int f79905c;

    /* renamed from: d */
    public final long f79906d;

    /* renamed from: e */
    public final long f79907e;

    /* renamed from: f */
    public final boolean f79908f;

    /* renamed from: g */
    public final int f79909g;

    /* renamed from: h */
    public final String f79910h;

    /* renamed from: i */
    public final String f79911i;

    public C32912z(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f79903a = i;
        if (str != null) {
            this.f79904b = str;
            this.f79905c = i2;
            this.f79906d = j;
            this.f79907e = j2;
            this.f79908f = z;
            this.f79909g = i3;
            if (str2 != null) {
                this.f79910h = str2;
                if (str3 != null) {
                    this.f79911i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    /* renamed from: a */
    public int mo95446a() {
        return this.f79903a;
    }

    /* renamed from: b */
    public int mo95447b() {
        return this.f79905c;
    }

    /* renamed from: d */
    public long mo95448d() {
        return this.f79907e;
    }

    /* renamed from: e */
    public boolean mo95449e() {
        return this.f79908f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32837c0.C32839b)) {
            return false;
        }
        C32837c0.C32839b bVar = (C32837c0.C32839b) obj;
        if (this.f79903a == bVar.mo95446a() && this.f79904b.equals(bVar.mo95451g()) && this.f79905c == bVar.mo95447b() && this.f79906d == bVar.mo95454j() && this.f79907e == bVar.mo95448d() && this.f79908f == bVar.mo95449e() && this.f79909g == bVar.mo95453i() && this.f79910h.equals(bVar.mo95450f()) && this.f79911i.equals(bVar.mo95452h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo95450f() {
        return this.f79910h;
    }

    /* renamed from: g */
    public String mo95451g() {
        return this.f79904b;
    }

    /* renamed from: h */
    public String mo95452h() {
        return this.f79911i;
    }

    public int hashCode() {
        int i;
        long j = this.f79906d;
        long j2 = this.f79907e;
        int hashCode = (((((((((this.f79903a ^ 1000003) * 1000003) ^ this.f79904b.hashCode()) * 1000003) ^ this.f79905c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f79908f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f79909g) * 1000003) ^ this.f79910h.hashCode()) * 1000003) ^ this.f79911i.hashCode();
    }

    /* renamed from: i */
    public int mo95453i() {
        return this.f79909g;
    }

    /* renamed from: j */
    public long mo95454j() {
        return this.f79906d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f79903a + ", model=" + this.f79904b + ", availableProcessors=" + this.f79905c + ", totalRam=" + this.f79906d + ", diskSpace=" + this.f79907e + ", isEmulator=" + this.f79908f + ", state=" + this.f79909g + ", manufacturer=" + this.f79910h + ", modelClass=" + this.f79911i + "}";
    }
}
