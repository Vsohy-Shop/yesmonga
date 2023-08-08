package androidx.camera.core;

import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.i */
public final class C1414i extends SurfaceRequest.C1342f {

    /* renamed from: a */
    public final Rect f4076a;

    /* renamed from: b */
    public final int f4077b;

    /* renamed from: c */
    public final int f4078c;

    public C1414i(Rect rect, int i, int i2) {
        if (rect != null) {
            this.f4076a = rect;
            this.f4077b = i;
            this.f4078c = i2;
            return;
        }
        throw new NullPointerException("Null cropRect");
    }

    @C0359n0
    /* renamed from: a */
    public Rect mo4940a() {
        return this.f4076a;
    }

    /* renamed from: b */
    public int mo4941b() {
        return this.f4077b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public int mo4942c() {
        return this.f4078c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.C1342f)) {
            return false;
        }
        SurfaceRequest.C1342f fVar = (SurfaceRequest.C1342f) obj;
        if (this.f4076a.equals(fVar.mo4940a()) && this.f4077b == fVar.mo4941b() && this.f4078c == fVar.mo4942c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4076a.hashCode() ^ 1000003) * 1000003) ^ this.f4077b) * 1000003) ^ this.f4078c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f4076a + ", rotationDegrees=" + this.f4077b + ", targetRotation=" + this.f4078c + "}";
    }
}
