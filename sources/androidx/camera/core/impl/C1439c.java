package androidx.camera.core.impl;

import androidx.annotation.C0359n0;

/* renamed from: androidx.camera.core.impl.c */
public final class C1439c extends C1466j0 {

    /* renamed from: a */
    public final String f4183a;

    /* renamed from: b */
    public final String f4184b;

    /* renamed from: c */
    public final int f4185c;

    public C1439c(String str, String str2, int i) {
        if (str != null) {
            this.f4183a = str;
            if (str2 != null) {
                this.f4184b = str2;
                this.f4185c = i;
                return;
            }
            throw new NullPointerException("Null model");
        }
        throw new NullPointerException("Null manufacturer");
    }

    @C0359n0
    /* renamed from: c */
    public String mo5196c() {
        return this.f4183a;
    }

    @C0359n0
    /* renamed from: d */
    public String mo5197d() {
        return this.f4184b;
    }

    /* renamed from: e */
    public int mo5198e() {
        return this.f4185c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1466j0)) {
            return false;
        }
        C1466j0 j0Var = (C1466j0) obj;
        if (!this.f4183a.equals(j0Var.mo5196c()) || !this.f4184b.equals(j0Var.mo5197d()) || this.f4185c != j0Var.mo5198e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f4183a.hashCode() ^ 1000003) * 1000003) ^ this.f4184b.hashCode()) * 1000003) ^ this.f4185c;
    }

    public String toString() {
        return "DeviceProperties{manufacturer=" + this.f4183a + ", model=" + this.f4184b + ", sdkVersion=" + this.f4185c + "}";
    }
}
