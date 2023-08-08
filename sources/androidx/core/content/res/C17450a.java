package androidx.core.content.res;

import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.core.graphics.C17586h0;

/* renamed from: androidx.core.content.res.a */
public class C17450a {

    /* renamed from: j */
    public static final float f45714j = 0.2f;

    /* renamed from: k */
    public static final float f45715k = 1.0f;

    /* renamed from: l */
    public static final float f45716l = 0.4f;

    /* renamed from: m */
    public static final float f45717m = 0.01f;

    /* renamed from: a */
    public final float f45718a;

    /* renamed from: b */
    public final float f45719b;

    /* renamed from: c */
    public final float f45720c;

    /* renamed from: d */
    public final float f45721d;

    /* renamed from: e */
    public final float f45722e;

    /* renamed from: f */
    public final float f45723f;

    /* renamed from: g */
    public final float f45724g;

    /* renamed from: h */
    public final float f45725h;

    /* renamed from: i */
    public final float f45726i;

    public C17450a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f45718a = f;
        this.f45719b = f2;
        this.f45720c = f3;
        this.f45721d = f4;
        this.f45722e = f5;
        this.f45723f = f6;
        this.f45724g = f7;
        this.f45725h = f8;
        this.f45726i = f9;
    }

    @C0363p0
    /* renamed from: b */
    public static C17450a m80087b(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @C0379x(from = 0.0d, mo1016to = 100.0d) float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C17450a aVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int s = m80090e(f8, f2, f).mo51879s();
            float b = C17451b.m80107b(s);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C17450a c = m80088c(s);
                float a = c.mo51868a(m80090e(c.mo51873k(), c.mo51871i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f5 = abs;
                    f7 = a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            } else if (b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return aVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C17450a m80088c(@C0354l int i) {
        return m80089d(i, C17484r.f45777k);
    }

    @C0359n0
    /* renamed from: d */
    public static C17450a m80089d(@C0354l int i, @C0359n0 C17484r rVar) {
        float f;
        float[] f2 = C17451b.m80111f(i);
        float[][] fArr = C17451b.f45727a;
        float f3 = f2[0];
        float[] fArr2 = fArr[0];
        float f4 = f2[1];
        float f5 = f2[2];
        float f6 = (fArr2[0] * f3) + (fArr2[1] * f4) + (fArr2[2] * f5);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[0] * f3) + (fArr3[1] * f4) + (fArr3[2] * f5);
        float[] fArr4 = fArr[2];
        float f8 = (f3 * fArr4[0]) + (f4 * fArr4[1]) + (f5 * fArr4[2]);
        float f9 = rVar.mo51912i()[0] * f6;
        float f10 = rVar.mo51912i()[1] * f7;
        float f11 = rVar.mo51912i()[2] * f8;
        float pow = (float) Math.pow(((double) (rVar.mo51906c() * Math.abs(f9))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (rVar.mo51906c() * Math.abs(f10))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (rVar.mo51906c() * Math.abs(f11))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f12 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f13 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f13, (double) f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f16 * rVar.mo51909f()) / rVar.mo51904a()), (double) (rVar.mo51905b() * rVar.mo51913j()))) * 100.0f;
        float d2 = rVar.mo51907d() * (4.0f / rVar.mo51905b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (rVar.mo51904a() + 4.0f);
        if (((double) f17) < 20.14d) {
            f = 360.0f + f17;
        } else {
            f = f17;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) rVar.mo51908e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.mo51910g()) * rVar.mo51911h()) * ((float) Math.sqrt((double) ((f12 * f12) + (f13 * f13))))) / (f15 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * rVar.mo51907d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * rVar.mo51905b()) / (rVar.mo51904a() + 4.0f)))) * 50.0f;
        float f19 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f18;
        return new C17450a(f17, sqrt, pow4, d2, d3, sqrt2, f19, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    @C0359n0
    /* renamed from: e */
    public static C17450a m80090e(@C0379x(from = 0.0d, mo1016to = 100.0d) float f, @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @C0379x(from = 0.0d, mo1016to = 360.0d) float f3) {
        return m80091f(f, f2, f3, C17484r.f45777k);
    }

    @C0359n0
    /* renamed from: f */
    public static C17450a m80091f(@C0379x(from = 0.0d, mo1016to = 100.0d) float f, @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @C0379x(from = 0.0d, mo1016to = 360.0d) float f3, C17484r rVar) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / rVar.mo51905b()) * ((float) Math.sqrt(d)) * (rVar.mo51904a() + 4.0f) * rVar.mo51907d();
        float d2 = f2 * rVar.mo51907d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * rVar.mo51905b()) / (rVar.mo51904a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C17450a(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: p */
    public static int m80092p(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @C0379x(from = 0.0d, mo1016to = 100.0d) float f3) {
        return m80093q(f, f2, f3, C17484r.f45777k);
    }

    @C0354l
    /* renamed from: q */
    public static int m80093q(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @C0379x(from = 0.0d, mo1016to = 100.0d) float f3, @C0359n0 C17484r rVar) {
        float f4;
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return C17451b.m80106a(f3);
        }
        if (f < 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = Math.min(360.0f, f);
        }
        C17450a aVar = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f2;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C17450a b = m80087b(f4, f6, f3);
            if (!z) {
                if (b == null) {
                    f2 = f6;
                } else {
                    f5 = f6;
                    aVar = b;
                }
                f6 = ((f2 - f5) / 2.0f) + f5;
            } else if (b != null) {
                return b.mo51878r(rVar);
            } else {
                f6 = ((f2 - f5) / 2.0f) + f5;
                z = false;
            }
        }
        if (aVar == null) {
            return C17451b.m80106a(f3);
        }
        return aVar.mo51878r(rVar);
    }

    /* renamed from: a */
    public float mo51868a(@C0359n0 C17450a aVar) {
        float l = mo51874l() - aVar.mo51874l();
        float g = mo51869g() - aVar.mo51869g();
        float h = mo51870h() - aVar.mo51870h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    @C0379x(from = Double.NEGATIVE_INFINITY, fromInclusive = false, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: g */
    public float mo51869g() {
        return this.f45725h;
    }

    @C0379x(from = Double.NEGATIVE_INFINITY, fromInclusive = false, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: h */
    public float mo51870h() {
        return this.f45726i;
    }

    @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: i */
    public float mo51871i() {
        return this.f45719b;
    }

    @C0379x(from = 0.0d, mo1016to = 360.0d, toInclusive = false)
    /* renamed from: j */
    public float mo51872j() {
        return this.f45718a;
    }

    @C0379x(from = 0.0d, mo1016to = 100.0d)
    /* renamed from: k */
    public float mo51873k() {
        return this.f45720c;
    }

    @C0379x(from = 0.0d, mo1016to = 100.0d)
    /* renamed from: l */
    public float mo51874l() {
        return this.f45724g;
    }

    @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: m */
    public float mo51875m() {
        return this.f45722e;
    }

    @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: n */
    public float mo51876n() {
        return this.f45721d;
    }

    @C0379x(from = 0.0d, mo1016to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: o */
    public float mo51877o() {
        return this.f45723f;
    }

    @C0354l
    /* renamed from: r */
    public int mo51878r(@C0359n0 C17484r rVar) {
        float f;
        if (((double) mo51871i()) == 0.0d || ((double) mo51873k()) == 0.0d) {
            f = 0.0f;
        } else {
            f = mo51871i() / ((float) Math.sqrt(((double) mo51873k()) / 100.0d));
        }
        float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) rVar.mo51908e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo51872j() * 3.1415927f) / 180.0f);
        float a = rVar.mo51904a() * ((float) Math.pow(((double) mo51873k()) / 100.0d, (1.0d / ((double) rVar.mo51905b())) / ((double) rVar.mo51913j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * rVar.mo51910g() * rVar.mo51911h();
        float f2 = a / rVar.mo51909f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / rVar.mo51906c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / rVar.mo51906c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float signum3 = Math.signum(f9) * (100.0f / rVar.mo51906c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
        float f10 = signum / rVar.mo51912i()[0];
        float f11 = signum2 / rVar.mo51912i()[1];
        float f12 = signum3 / rVar.mo51912i()[2];
        float[][] fArr = C17451b.f45728b;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C17586h0.m80570g((double) f13, (double) ((fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12)), (double) ((f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2])));
    }

    @C0354l
    /* renamed from: s */
    public int mo51879s() {
        return mo51878r(C17484r.f45777k);
    }
}
