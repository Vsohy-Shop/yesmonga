package androidx.camera.core;

import androidx.camera.core.C1360b2;

/* renamed from: androidx.camera.core.f */
public final class C1398f extends C1360b2.C1361a {

    /* renamed from: a */
    public final int f4053a;

    /* renamed from: b */
    public final int f4054b;

    public C1398f(int i, int i2) {
        this.f4053a = i;
        this.f4054b = i2;
    }

    /* renamed from: b */
    public int mo5000b() {
        return this.f4054b;
    }

    /* renamed from: c */
    public int mo5001c() {
        return this.f4053a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1360b2.C1361a)) {
            return false;
        }
        C1360b2.C1361a aVar = (C1360b2.C1361a) obj;
        if (this.f4053a == aVar.mo5001c() && this.f4054b == aVar.mo5000b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4053a ^ 1000003) * 1000003) ^ this.f4054b;
    }

    public String toString() {
        return "FormatCombo{imageCaptureFormat=" + this.f4053a + ", imageAnalysisFormat=" + this.f4054b + "}";
    }
}
