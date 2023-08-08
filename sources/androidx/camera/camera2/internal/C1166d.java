package androidx.camera.camera2.internal;

import androidx.annotation.C0359n0;

/* renamed from: androidx.camera.camera2.internal.d */
public final class C1166d extends C1035b1 {

    /* renamed from: a */
    public final String f3373a;

    /* renamed from: b */
    public final String f3374b;

    /* renamed from: c */
    public final String f3375c;

    /* renamed from: d */
    public final String f3376d;

    public C1166d(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.f3373a = str;
            if (str2 != null) {
                this.f3374b = str2;
                if (str3 != null) {
                    this.f3375c = str3;
                    if (str4 != null) {
                        this.f3376d = str4;
                        return;
                    }
                    throw new NullPointerException("Null cameraId");
                }
                throw new NullPointerException("Null model");
            }
            throw new NullPointerException("Null device");
        }
        throw new NullPointerException("Null brand");
    }

    @C0359n0
    /* renamed from: b */
    public String mo4238b() {
        return this.f3373a;
    }

    @C0359n0
    /* renamed from: c */
    public String mo4239c() {
        return this.f3376d;
    }

    @C0359n0
    /* renamed from: d */
    public String mo4240d() {
        return this.f3374b;
    }

    @C0359n0
    /* renamed from: e */
    public String mo4241e() {
        return this.f3375c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1035b1)) {
            return false;
        }
        C1035b1 b1Var = (C1035b1) obj;
        if (!this.f3373a.equals(b1Var.mo4238b()) || !this.f3374b.equals(b1Var.mo4240d()) || !this.f3375c.equals(b1Var.mo4241e()) || !this.f3376d.equals(b1Var.mo4239c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f3373a.hashCode() ^ 1000003) * 1000003) ^ this.f3374b.hashCode()) * 1000003) ^ this.f3375c.hashCode()) * 1000003) ^ this.f3376d.hashCode();
    }

    public String toString() {
        return "CameraDeviceId{brand=" + this.f3373a + ", device=" + this.f3374b + ", model=" + this.f3375c + ", cameraId=" + this.f3376d + "}";
    }
}
