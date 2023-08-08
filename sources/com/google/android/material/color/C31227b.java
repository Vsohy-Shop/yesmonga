package com.google.android.material.color;

/* renamed from: com.google.android.material.color.b */
public final class C31227b {

    /* renamed from: j */
    public static final float[][] f75141j = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: k */
    public static final float[][] f75142k = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: a */
    public final float f75143a;

    /* renamed from: b */
    public final float f75144b;

    /* renamed from: c */
    public final float f75145c;

    /* renamed from: d */
    public final float f75146d;

    /* renamed from: e */
    public final float f75147e;

    /* renamed from: f */
    public final float f75148f;

    /* renamed from: g */
    public final float f75149g;

    /* renamed from: h */
    public final float f75150h;

    /* renamed from: i */
    public final float f75151i;

    public C31227b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f75143a = f;
        this.f75144b = f2;
        this.f75145c = f3;
        this.f75146d = f4;
        this.f75147e = f5;
        this.f75148f = f6;
        this.f75149g = f7;
        this.f75150h = f8;
        this.f75151i = f9;
    }

    /* renamed from: b */
    public static C31227b m125797b(int i) {
        return m125798c(i, C31269v.f75278k);
    }

    /* renamed from: c */
    public static C31227b m125798c(int i, C31269v vVar) {
        float f;
        int i2 = i;
        float k = C31247k.m125874k(((float) ((16711680 & i2) >> 16)) / 255.0f) * 100.0f;
        float k2 = C31247k.m125874k(((float) ((65280 & i2) >> 8)) / 255.0f) * 100.0f;
        float k3 = C31247k.m125874k(((float) (i2 & 255)) / 255.0f) * 100.0f;
        float f2 = (0.41233894f * k) + (0.35762063f * k2) + (0.18051042f * k3);
        float f3 = (0.2126f * k) + (0.7152f * k2) + (0.0722f * k3);
        float f4 = (k * 0.01932141f) + (k2 * 0.11916382f) + (k3 * 0.9503448f);
        float[][] fArr = f75141j;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = vVar.mo89249i()[0] * f5;
        float f9 = vVar.mo89249i()[1] * f6;
        float f10 = vVar.mo89249i()[2] * f7;
        float pow = (float) Math.pow(((double) (vVar.mo89243c() * Math.abs(f8))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (vVar.mo89243c() * Math.abs(f9))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (vVar.mo89243c() * Math.abs(f10))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f11 = signum2 * 20.0f;
        float f12 = (((signum * 20.0f) + f11) + (21.0f * signum3)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        double d2 = (double) (((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f);
        double d3 = (double) (((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f);
        float atan2 = (((float) Math.atan2(d2, d3)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f13 * vVar.mo89246f()) / vVar.mo89241a()), (double) (vVar.mo89242b() * vVar.mo89250j()))) * 100.0f;
        float b = (4.0f / vVar.mo89242b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (vVar.mo89241a() + 4.0f) * vVar.mo89244d();
        if (((double) atan2) < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) vVar.mo89245e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(Math.toRadians((double) f) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * vVar.mo89247g()) * vVar.mo89248h()) * ((float) Math.hypot(d3, d2))) / (f12 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d4 = sqrt * vVar.mo89244d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * vVar.mo89242b()) / (vVar.mo89241a() + 4.0f)))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log1p = ((float) Math.log1p((double) (0.0228f * d4))) * 43.85965f;
        double d5 = (double) f14;
        return new C31227b(atan2, sqrt, pow4, b, d4, sqrt2, f15, log1p * ((float) Math.cos(d5)), log1p * ((float) Math.sin(d5)));
    }

    /* renamed from: d */
    public static C31227b m125799d(float f, float f2, float f3) {
        return m125800e(f, f2, f3, C31269v.f75278k);
    }

    /* renamed from: e */
    public static C31227b m125800e(float f, float f2, float f3, C31269v vVar) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / vVar.mo89242b()) * ((float) Math.sqrt(d)) * (vVar.mo89241a() + 4.0f) * vVar.mo89244d();
        float d2 = f2 * vVar.mo89244d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * vVar.mo89242b()) / (vVar.mo89241a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log1p = ((float) Math.log1p(((double) d2) * 0.0228d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C31227b(f3, f2, f4, b, d2, sqrt, f5, log1p * ((float) Math.cos(d3)), log1p * ((float) Math.sin(d3)));
    }

    /* renamed from: f */
    public static C31227b m125801f(float f, float f2, float f3) {
        return m125802g(f, f2, f3, C31269v.f75278k);
    }

    /* renamed from: g */
    public static C31227b m125802g(float f, float f2, float f3, C31269v vVar) {
        double d = (double) f2;
        double d2 = (double) f3;
        double expm1 = (Math.expm1(Math.hypot(d, d2) * 0.02280000038444996d) / 0.02280000038444996d) / ((double) vVar.mo89244d());
        double atan2 = Math.atan2(d2, d) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return m125800e(f / (1.0f - ((f - 100.0f) * 0.007f)), (float) expm1, (float) atan2, vVar);
    }

    /* renamed from: a */
    public float mo89170a(C31227b bVar) {
        float n = mo89177n() - bVar.mo89177n();
        float h = mo89171h() - bVar.mo89171h();
        float i = mo89172i() - bVar.mo89172i();
        return (float) (Math.pow(Math.sqrt((double) ((n * n) + (h * h) + (i * i))), 0.63d) * 1.41d);
    }

    /* renamed from: h */
    public float mo89171h() {
        return this.f75150h;
    }

    /* renamed from: i */
    public float mo89172i() {
        return this.f75151i;
    }

    /* renamed from: j */
    public float mo89173j() {
        return this.f75144b;
    }

    /* renamed from: k */
    public float mo89174k() {
        return this.f75143a;
    }

    /* renamed from: l */
    public int mo89175l() {
        return mo89181r(C31269v.f75278k);
    }

    /* renamed from: m */
    public float mo89176m() {
        return this.f75145c;
    }

    /* renamed from: n */
    public float mo89177n() {
        return this.f75149g;
    }

    /* renamed from: o */
    public float mo89178o() {
        return this.f75147e;
    }

    /* renamed from: p */
    public float mo89179p() {
        return this.f75146d;
    }

    /* renamed from: q */
    public float mo89180q() {
        return this.f75148f;
    }

    /* renamed from: r */
    public int mo89181r(C31269v vVar) {
        float f;
        if (((double) mo89173j()) == 0.0d || ((double) mo89176m()) == 0.0d) {
            f = 0.0f;
        } else {
            f = mo89173j() / ((float) Math.sqrt(((double) mo89176m()) / 100.0d));
        }
        float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) vVar.mo89245e()), 0.73d), 1.1111111111111112d);
        double k = (double) ((mo89174k() * 3.1415927f) / 180.0f);
        float a = vVar.mo89241a() * ((float) Math.pow(((double) mo89176m()) / 100.0d, (1.0d / ((double) vVar.mo89242b())) / ((double) vVar.mo89250j())));
        float cos = ((float) (Math.cos(2.0d + k) + 3.8d)) * 0.25f * 3846.1538f * vVar.mo89247g() * vVar.mo89248h();
        float f2 = a / vVar.mo89246f();
        float sin = (float) Math.sin(k);
        float cos2 = (float) Math.cos(k);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / vVar.mo89243c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / vVar.mo89243c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float signum3 = Math.signum(f9) * (100.0f / vVar.mo89243c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
        float f10 = signum / vVar.mo89249i()[0];
        float f11 = signum2 / vVar.mo89249i()[1];
        float f12 = signum3 / vVar.mo89249i()[2];
        float[][] fArr = f75142k;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C31247k.m125872i(f13, (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12), (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }
}
