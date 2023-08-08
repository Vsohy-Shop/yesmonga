package androidx.core.content.res;

import androidx.annotation.C0359n0;

/* renamed from: androidx.core.content.res.r */
public final class C17484r {

    /* renamed from: k */
    public static final C17484r f45777k = m80245k(C17451b.f45729c, (float) ((((double) C17451b.m80113h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f45778a;

    /* renamed from: b */
    public final float f45779b;

    /* renamed from: c */
    public final float f45780c;

    /* renamed from: d */
    public final float f45781d;

    /* renamed from: e */
    public final float f45782e;

    /* renamed from: f */
    public final float f45783f;

    /* renamed from: g */
    public final float[] f45784g;

    /* renamed from: h */
    public final float f45785h;

    /* renamed from: i */
    public final float f45786i;

    /* renamed from: j */
    public final float f45787j;

    public C17484r(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f45783f = f;
        this.f45778a = f2;
        this.f45779b = f3;
        this.f45780c = f4;
        this.f45781d = f5;
        this.f45782e = f6;
        this.f45784g = fArr;
        this.f45785h = f7;
        this.f45786i = f8;
        this.f45787j = f9;
    }

    @C0359n0
    /* renamed from: k */
    public static C17484r m80245k(@C0359n0 float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float f6 = f;
        float[][] fArr2 = C17451b.f45727a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[0] * f7) + (fArr4[1] * f8) + (fArr4[2] * f9);
        float[] fArr5 = fArr2[2];
        float f12 = (f7 * fArr5[0]) + (f8 * fArr5[1]) + (f9 * fArr5[2]);
        float f13 = (f3 / 10.0f) + 0.8f;
        if (((double) f13) >= 0.9d) {
            f4 = C17451b.m80109d(0.59f, 0.69f, (f13 - 0.9f) * 10.0f);
        } else {
            f4 = C17451b.m80109d(0.525f, 0.59f, (f13 - 0.8f) * 10.0f);
        }
        float f14 = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = (1.0f - (((float) Math.exp((double) (((-f6) - 42.0f) / 92.0f))) * 0.2777778f)) * f13;
        }
        double d = (double) f5;
        if (d > 1.0d) {
            f5 = 1.0f;
        } else if (d < 0.0d) {
            f5 = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f10) * f5) + 1.0f) - f5, (((100.0f / f11) * f5) + 1.0f) - f5, (((100.0f / f12) * f5) + 1.0f) - f5};
        float f15 = 1.0f / ((5.0f * f6) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float cbrt = (f16 * f6) + (0.1f * f17 * f17 * ((float) Math.cbrt(((double) f6) * 5.0d)));
        float h = C17451b.m80113h(f2) / fArr[1];
        double d2 = (double) h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f12)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f11)) / 100.0d, 0.42d), pow2};
        float f18 = fArr7[0];
        float f19 = fArr7[1];
        return new C17484r(h, ((((f18 * 400.0f) / (f18 + 27.13f)) * 2.0f) + ((f19 * 400.0f) / (f19 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f14, f13, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float mo51904a() {
        return this.f45778a;
    }

    /* renamed from: b */
    public float mo51905b() {
        return this.f45781d;
    }

    /* renamed from: c */
    public float mo51906c() {
        return this.f45785h;
    }

    /* renamed from: d */
    public float mo51907d() {
        return this.f45786i;
    }

    /* renamed from: e */
    public float mo51908e() {
        return this.f45783f;
    }

    /* renamed from: f */
    public float mo51909f() {
        return this.f45779b;
    }

    /* renamed from: g */
    public float mo51910g() {
        return this.f45782e;
    }

    /* renamed from: h */
    public float mo51911h() {
        return this.f45780c;
    }

    @C0359n0
    /* renamed from: i */
    public float[] mo51912i() {
        return this.f45784g;
    }

    /* renamed from: j */
    public float mo51913j() {
        return this.f45787j;
    }
}
