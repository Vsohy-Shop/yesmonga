package com.google.mlkit.vision.common;

/* renamed from: com.google.mlkit.vision.common.e */
public final class C34029e extends C34027c {

    /* renamed from: a */
    public final float f82655a;

    /* renamed from: b */
    public final float f82656b;

    /* renamed from: c */
    public final float f82657c;

    public C34029e(float f, float f2, float f3) {
        this.f82655a = f;
        this.f82656b = f2;
        this.f82657c = f3;
    }

    /* renamed from: b */
    public final float mo98964b() {
        return this.f82655a;
    }

    /* renamed from: c */
    public final float mo98965c() {
        return this.f82656b;
    }

    /* renamed from: d */
    public final float mo98966d() {
        return this.f82657c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34027c) {
            C34027c cVar = (C34027c) obj;
            if (Float.floatToIntBits(this.f82655a) == Float.floatToIntBits(cVar.mo98964b()) && Float.floatToIntBits(this.f82656b) == Float.floatToIntBits(cVar.mo98965c()) && Float.floatToIntBits(this.f82657c) == Float.floatToIntBits(cVar.mo98966d())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f82655a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f82656b)) * 1000003) ^ Float.floatToIntBits(this.f82657c);
    }

    public final String toString() {
        float f = this.f82655a;
        float f2 = this.f82656b;
        float f3 = this.f82657c;
        StringBuilder sb = new StringBuilder(65);
        sb.append("PointF3D{x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append("}");
        return sb.toString();
    }
}
