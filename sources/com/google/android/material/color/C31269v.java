package com.google.android.material.color;

/* renamed from: com.google.android.material.color.v */
public final class C31269v {

    /* renamed from: k */
    public static final C31269v f75278k = m125974k(C31247k.m125877n(), (float) ((((double) C31247k.m125879p(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f75279a;

    /* renamed from: b */
    public final float f75280b;

    /* renamed from: c */
    public final float f75281c;

    /* renamed from: d */
    public final float f75282d;

    /* renamed from: e */
    public final float f75283e;

    /* renamed from: f */
    public final float f75284f;

    /* renamed from: g */
    public final float[] f75285g;

    /* renamed from: h */
    public final float f75286h;

    /* renamed from: i */
    public final float f75287i;

    /* renamed from: j */
    public final float f75288j;

    public C31269v(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f75284f = f;
        this.f75279a = f2;
        this.f75280b = f3;
        this.f75281c = f4;
        this.f75282d = f5;
        this.f75283e = f6;
        this.f75285g = fArr;
        this.f75286h = f7;
        this.f75287i = f8;
        this.f75288j = f9;
    }

    /* renamed from: k */
    public static C31269v m125974k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float f6 = f;
        float[][] fArr2 = C31227b.f75141j;
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
            f4 = C31267t.m125967c(0.59f, 0.69f, (f13 - 0.9f) * 10.0f);
        } else {
            f4 = C31267t.m125967c(0.525f, 0.59f, (f13 - 0.8f) * 10.0f);
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
        float p = C31247k.m125879p(f2) / fArr[1];
        double d2 = (double) p;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f12)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f11)) / 100.0d, 0.42d), pow2};
        float f18 = fArr7[0];
        float f19 = fArr7[1];
        return new C31269v(p, ((((f18 * 400.0f) / (f18 + 27.13f)) * 2.0f) + ((f19 * 400.0f) / (f19 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f14, f13, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float mo89241a() {
        return this.f75279a;
    }

    /* renamed from: b */
    public float mo89242b() {
        return this.f75282d;
    }

    /* renamed from: c */
    public float mo89243c() {
        return this.f75286h;
    }

    /* renamed from: d */
    public float mo89244d() {
        return this.f75287i;
    }

    /* renamed from: e */
    public float mo89245e() {
        return this.f75284f;
    }

    /* renamed from: f */
    public float mo89246f() {
        return this.f75280b;
    }

    /* renamed from: g */
    public float mo89247g() {
        return this.f75283e;
    }

    /* renamed from: h */
    public float mo89248h() {
        return this.f75281c;
    }

    /* renamed from: i */
    public float[] mo89249i() {
        return this.f75285g;
    }

    /* renamed from: j */
    public float mo89250j() {
        return this.f75288j;
    }
}
