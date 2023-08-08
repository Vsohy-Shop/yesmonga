package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import java.util.Objects;

/* renamed from: androidx.core.graphics.h0 */
public final class C17586h0 {

    /* renamed from: a */
    public static final double f45934a = 95.047d;

    /* renamed from: b */
    public static final double f45935b = 100.0d;

    /* renamed from: c */
    public static final double f45936c = 108.883d;

    /* renamed from: d */
    public static final double f45937d = 0.008856d;

    /* renamed from: e */
    public static final double f45938e = 903.3d;

    /* renamed from: f */
    public static final int f45939f = 10;

    /* renamed from: g */
    public static final int f45940g = 1;

    /* renamed from: h */
    public static final ThreadLocal<double[]> f45941h = new ThreadLocal<>();

    @C0376v0(26)
    /* renamed from: androidx.core.graphics.h0$a */
    public static class C17587a {
        @C0373u
        /* renamed from: a */
        public static Color m80590a(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] a = color.getComponents();
                float[] a2 = color2.getComponents();
                float a3 = color.alpha();
                float a4 = color2.alpha() * (1.0f - a3);
                int a5 = color2.getComponentCount() - 1;
                float f = a3 + a4;
                a2[a5] = f;
                if (f > 0.0f) {
                    a3 /= f;
                    a4 /= f;
                }
                for (int i = 0; i < a5; i++) {
                    a2[i] = (a[i] * a3) + (a2[i] * a4);
                }
                return Color.valueOf(a2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
    }

    /* renamed from: A */
    public static double m80562A(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    @C0354l
    /* renamed from: B */
    public static int m80563B(@C0354l int i, @C0337f0(from = 0, mo995to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    @C0354l
    /* renamed from: a */
    public static int m80564a(@C0359n0 float[] fArr) {
        int i;
        int i2;
        int i3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 2:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                i = 0;
                i3 = 0;
                i2 = 0;
                break;
        }
        return Color.rgb(m80587x(i3, 0, 255), m80587x(i2, 0, 255), m80587x(i, 0, 255));
    }

    @C0354l
    /* renamed from: b */
    public static int m80565b(@C0379x(from = 0.0d, mo1016to = 100.0d) double d, @C0379x(from = -128.0d, mo1016to = 127.0d) double d2, @C0379x(from = -128.0d, mo1016to = 127.0d) double d3) {
        double[] z = m80589z();
        m80566c(d, d2, d3, z);
        return m80570g(z[0], z[1], z[2]);
    }

    /* renamed from: c */
    public static void m80566c(@C0379x(from = 0.0d, mo1016to = 100.0d) double d, @C0379x(from = -128.0d, mo1016to = 127.0d) double d2, @C0379x(from = -128.0d, mo1016to = 127.0d) double d3, @C0359n0 double[] dArr) {
        double d4;
        double d5 = (d + 16.0d) / 116.0d;
        double d6 = (d2 / 500.0d) + d5;
        double d7 = d5 - (d3 / 200.0d);
        double pow = Math.pow(d6, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        if (d > 7.9996247999999985d) {
            d4 = Math.pow(d5, 3.0d);
        } else {
            d4 = d / 903.3d;
        }
        double pow2 = Math.pow(d7, 3.0d);
        if (pow2 <= 0.008856d) {
            pow2 = ((d7 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = d4 * 100.0d;
        dArr[2] = pow2 * 108.883d;
    }

    /* renamed from: d */
    public static void m80567d(@C0337f0(from = 0, mo995to = 255) int i, @C0337f0(from = 0, mo995to = 255) int i2, @C0337f0(from = 0, mo995to = 255) int i3, @C0359n0 float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            if (max == f3) {
                f = ((f4 - f5) / f6) % 6.0f;
            } else if (max == f4) {
                f = ((f5 - f3) / f6) + 2.0f;
            } else {
                f = 4.0f + ((f3 - f4) / f6);
            }
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = m80586w(f8, 0.0f, 360.0f);
        fArr[1] = m80586w(f2, 0.0f, 1.0f);
        fArr[2] = m80586w(f7, 0.0f, 1.0f);
    }

    /* renamed from: e */
    public static void m80568e(@C0337f0(from = 0, mo995to = 255) int i, @C0337f0(from = 0, mo995to = 255) int i2, @C0337f0(from = 0, mo995to = 255) int i3, @C0359n0 double[] dArr) {
        m80569f(i, i2, i3, dArr);
        m80571h(dArr[0], dArr[1], dArr[2], dArr);
    }

    /* renamed from: f */
    public static void m80569f(@C0337f0(from = 0, mo995to = 255) int i, @C0337f0(from = 0, mo995to = 255) int i2, @C0337f0(from = 0, mo995to = 255) int i3, @C0359n0 double[] dArr) {
        double d;
        double d2;
        double d3;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d4 = ((double) i) / 255.0d;
            if (d4 < 0.04045d) {
                d = d4 / 12.92d;
            } else {
                d = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) i2) / 255.0d;
            if (d5 < 0.04045d) {
                d2 = d5 / 12.92d;
            } else {
                d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) i3) / 255.0d;
            if (d6 < 0.04045d) {
                d3 = d6 / 12.92d;
            } else {
                d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr2[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr2[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @C0354l
    /* renamed from: g */
    public static int m80570g(@C0379x(from = 0.0d, mo1016to = 95.047d) double d, @C0379x(from = 0.0d, mo1016to = 100.0d) double d2, @C0379x(from = 0.0d, mo1016to = 108.883d) double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d8 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m80587x((int) Math.round(d4 * 255.0d), 0, 255), m80587x((int) Math.round(d5 * 255.0d), 0, 255), m80587x((int) Math.round(d6 * 255.0d), 0, 255));
    }

    /* renamed from: h */
    public static void m80571h(@C0379x(from = 0.0d, mo1016to = 95.047d) double d, @C0379x(from = 0.0d, mo1016to = 100.0d) double d2, @C0379x(from = 0.0d, mo1016to = 108.883d) double d3, @C0359n0 double[] dArr) {
        if (dArr.length == 3) {
            double A = m80562A(d / 95.047d);
            double A2 = m80562A(d2 / 100.0d);
            double A3 = m80562A(d3 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * A2) - 16.0d);
            dArr[1] = (A - A2) * 500.0d;
            dArr[2] = (A2 - A3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @C0354l
    /* renamed from: i */
    public static int m80572i(@C0354l int i, @C0354l int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: j */
    public static void m80573j(@C0359n0 float[] fArr, @C0359n0 float[] fArr2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0359n0 float[] fArr3) {
        if (fArr3.length == 3) {
            float f2 = 1.0f - f;
            fArr3[0] = m80578o(fArr[0], fArr2[0], f);
            fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
            fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    /* renamed from: k */
    public static void m80574k(@C0359n0 double[] dArr, @C0359n0 double[] dArr2, @C0379x(from = 0.0d, mo1016to = 1.0d) double d, @C0359n0 double[] dArr3) {
        if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
            dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
            dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    /* renamed from: l */
    public static double m80575l(@C0354l int i, @C0354l int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m80583t(i, i2);
            }
            double m = m80576m(i) + 0.05d;
            double m2 = m80576m(i2) + 0.05d;
            return Math.max(m, m2) / Math.min(m, m2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: m */
    public static double m80576m(@C0354l int i) {
        double[] z = m80589z();
        m80581r(i, z);
        return z[1] / 100.0d;
    }

    /* renamed from: n */
    public static int m80577n(@C0354l int i, @C0354l int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m80575l(m80563B(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m80575l(m80563B(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    @C0344h1
    /* renamed from: o */
    public static float m80578o(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (f + ((f2 - f) * f3)) % 360.0f;
    }

    /* renamed from: p */
    public static void m80579p(@C0354l int i, @C0359n0 float[] fArr) {
        m80567d(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: q */
    public static void m80580q(@C0354l int i, @C0359n0 double[] dArr) {
        m80568e(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: r */
    public static void m80581r(@C0354l int i, @C0359n0 double[] dArr) {
        m80569f(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: s */
    public static int m80582s(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: t */
    public static int m80583t(@C0354l int i, @C0354l int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int s = m80582s(alpha2, alpha);
        return Color.argb(s, m80585v(Color.red(i), alpha2, Color.red(i2), alpha, s), m80585v(Color.green(i), alpha2, Color.green(i2), alpha, s), m80585v(Color.blue(i), alpha2, Color.blue(i2), alpha, s));
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: u */
    public static Color m80584u(@C0359n0 Color color, @C0359n0 Color color2) {
        return C17587a.m80590a(color, color2);
    }

    /* renamed from: v */
    public static int m80585v(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: w */
    public static float m80586w(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    /* renamed from: x */
    public static int m80587x(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: y */
    public static double m80588y(@C0359n0 double[] dArr, @C0359n0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    /* renamed from: z */
    public static double[] m80589z() {
        ThreadLocal<double[]> threadLocal = f45941h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
