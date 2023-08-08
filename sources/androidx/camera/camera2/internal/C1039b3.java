package androidx.camera.camera2.internal;

import androidx.camera.core.C1403f4;
import androidx.core.math.C17760a;

/* renamed from: androidx.camera.camera2.internal.b3 */
public class C1039b3 implements C1403f4 {

    /* renamed from: a */
    public float f3206a;

    /* renamed from: b */
    public final float f3207b;

    /* renamed from: c */
    public final float f3208c;

    /* renamed from: d */
    public float f3209d;

    public C1039b3(float f, float f2) {
        this.f3207b = f;
        this.f3208c = f2;
    }

    /* renamed from: a */
    public float mo4265a() {
        return this.f3207b;
    }

    /* renamed from: b */
    public float mo4266b() {
        return this.f3209d;
    }

    /* renamed from: c */
    public float mo4267c() {
        return this.f3208c;
    }

    /* renamed from: d */
    public float mo4268d() {
        return this.f3206a;
    }

    /* renamed from: e */
    public final float mo4269e(float f) {
        float f2 = this.f3207b;
        float f3 = this.f3208c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    /* renamed from: f */
    public final float mo4270f(float f) {
        if (f == 1.0f) {
            return this.f3207b;
        }
        if (f == 0.0f) {
            return this.f3208c;
        }
        float f2 = this.f3207b;
        float f3 = this.f3208c;
        double d = (double) (1.0f / f3);
        return (float) C17760a.m81100c(1.0d / (d + ((((double) (1.0f / f2)) - d) * ((double) f))), (double) f3, (double) f2);
    }

    /* renamed from: g */
    public void mo4271g(float f) throws IllegalArgumentException {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
        this.f3209d = f;
        this.f3206a = mo4270f(f);
    }

    /* renamed from: h */
    public void mo4272h(float f) throws IllegalArgumentException {
        if (f > this.f3207b || f < this.f3208c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f3208c + " , " + this.f3207b + "]");
        }
        this.f3206a = f;
        this.f3209d = mo4269e(f);
    }
}
