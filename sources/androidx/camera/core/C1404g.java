package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1472k1;

/* renamed from: androidx.camera.core.g */
public final class C1404g extends C1412h2 {

    /* renamed from: a */
    public final C1472k1 f4063a;

    /* renamed from: b */
    public final long f4064b;

    /* renamed from: c */
    public final int f4065c;

    public C1404g(C1472k1 k1Var, long j, int i) {
        if (k1Var != null) {
            this.f4063a = k1Var;
            this.f4064b = j;
            this.f4065c = i;
            return;
        }
        throw new NullPointerException("Null tagBundle");
    }

    @C0359n0
    /* renamed from: b */
    public C1472k1 mo5101b() {
        return this.f4063a;
    }

    /* renamed from: c */
    public int mo5102c() {
        return this.f4065c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1412h2)) {
            return false;
        }
        C1412h2 h2Var = (C1412h2) obj;
        if (this.f4063a.equals(h2Var.mo5101b()) && this.f4064b == h2Var.getTimestamp() && this.f4065c == h2Var.mo5102c()) {
            return true;
        }
        return false;
    }

    public long getTimestamp() {
        return this.f4064b;
    }

    public int hashCode() {
        long j = this.f4064b;
        return ((((this.f4063a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f4065c;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f4063a + ", timestamp=" + this.f4064b + ", rotationDegrees=" + this.f4065c + "}";
    }
}
