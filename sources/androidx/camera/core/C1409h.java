package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.h */
public final class C1409h extends SurfaceRequest.C1340e {

    /* renamed from: f */
    public final int f4072f;

    /* renamed from: g */
    public final Surface f4073g;

    public C1409h(int i, Surface surface) {
        this.f4072f = i;
        if (surface != null) {
            this.f4073g = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    /* renamed from: a */
    public int mo4938a() {
        return this.f4072f;
    }

    @C0359n0
    /* renamed from: b */
    public Surface mo4939b() {
        return this.f4073g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.C1340e)) {
            return false;
        }
        SurfaceRequest.C1340e eVar = (SurfaceRequest.C1340e) obj;
        if (this.f4072f != eVar.mo4938a() || !this.f4073g.equals(eVar.mo4939b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f4072f ^ 1000003) * 1000003) ^ this.f4073g.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f4072f + ", surface=" + this.f4073g + "}";
    }
}
