package androidx.camera.core.internal;

/* renamed from: androidx.camera.core.internal.a */
public final class C1591a extends C1593c {

    /* renamed from: a */
    public final float f4526a;

    /* renamed from: b */
    public final float f4527b;

    /* renamed from: c */
    public final float f4528c;

    /* renamed from: d */
    public final float f4529d;

    public C1591a(float f, float f2, float f3, float f4) {
        this.f4526a = f;
        this.f4527b = f2;
        this.f4528c = f3;
        this.f4529d = f4;
    }

    /* renamed from: a */
    public float mo4265a() {
        return this.f4527b;
    }

    /* renamed from: b */
    public float mo4266b() {
        return this.f4529d;
    }

    /* renamed from: c */
    public float mo4267c() {
        return this.f4528c;
    }

    /* renamed from: d */
    public float mo4268d() {
        return this.f4526a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1593c)) {
            return false;
        }
        C1593c cVar = (C1593c) obj;
        if (Float.floatToIntBits(this.f4526a) == Float.floatToIntBits(cVar.mo4268d()) && Float.floatToIntBits(this.f4527b) == Float.floatToIntBits(cVar.mo4265a()) && Float.floatToIntBits(this.f4528c) == Float.floatToIntBits(cVar.mo4267c()) && Float.floatToIntBits(this.f4529d) == Float.floatToIntBits(cVar.mo4266b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f4526a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f4527b)) * 1000003) ^ Float.floatToIntBits(this.f4528c)) * 1000003) ^ Float.floatToIntBits(this.f4529d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f4526a + ", maxZoomRatio=" + this.f4527b + ", minZoomRatio=" + this.f4528c + ", linearZoom=" + this.f4529d + "}";
    }
}
