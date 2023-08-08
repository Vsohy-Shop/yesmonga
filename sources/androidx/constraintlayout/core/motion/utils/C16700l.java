package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.l */
public class C16700l {

    /* renamed from: i */
    public static String f42020i = "Oscillator";

    /* renamed from: j */
    public static final int f42021j = 0;

    /* renamed from: k */
    public static final int f42022k = 1;

    /* renamed from: l */
    public static final int f42023l = 2;

    /* renamed from: m */
    public static final int f42024m = 3;

    /* renamed from: n */
    public static final int f42025n = 4;

    /* renamed from: o */
    public static final int f42026o = 5;

    /* renamed from: p */
    public static final int f42027p = 6;

    /* renamed from: q */
    public static final int f42028q = 7;

    /* renamed from: a */
    public float[] f42029a = new float[0];

    /* renamed from: b */
    public double[] f42030b = new double[0];

    /* renamed from: c */
    public double[] f42031c;

    /* renamed from: d */
    public String f42032d;

    /* renamed from: e */
    public C16699k f42033e;

    /* renamed from: f */
    public int f42034f;

    /* renamed from: g */
    public double f42035g = 6.283185307179586d;

    /* renamed from: h */
    public boolean f42036h = false;

    /* renamed from: a */
    public void mo49059a(double d, float f) {
        int length = this.f42029a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f42030b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f42030b = Arrays.copyOf(this.f42030b, length);
        this.f42029a = Arrays.copyOf(this.f42029a, length);
        this.f42031c = new double[length];
        double[] dArr = this.f42030b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f42030b[binarySearch] = d;
        this.f42029a[binarySearch] = f;
        this.f42036h = false;
    }

    /* renamed from: b */
    public double mo49060b(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f42030b, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f42029a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = (double) (f - f2);
        double[] dArr = this.f42030b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return (((double) f2) - (d5 * d4)) + (d * d5);
    }

    /* renamed from: c */
    public double mo49061c(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f42030b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f42029a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = (double) (f - f2);
        double[] dArr = this.f42030b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return this.f42031c[i2] + ((((double) f2) - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    /* renamed from: d */
    public double mo49062d(double d, double d2, double d3) {
        double c = d2 + mo49061c(d);
        double b = mo49060b(d) + d3;
        switch (this.f42034f) {
            case 1:
                return 0.0d;
            case 2:
                return b * 4.0d * Math.signum((((c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b * 2.0d;
            case 4:
                return (-b) * 2.0d;
            case 5:
                double d4 = this.f42035g;
                return (-d4) * b * Math.sin(d4 * c);
            case 6:
                return b * 4.0d * ((((c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f42033e.mo48984f(c % 1.0d, 0);
            default:
                double d5 = this.f42035g;
                return b * d5 * Math.cos(d5 * c);
        }
    }

    /* renamed from: e */
    public double mo49063e(double d, double d2) {
        double abs;
        double c = mo49061c(d) + d2;
        switch (this.f42034f) {
            case 1:
                return Math.signum(0.5d - (c % 1.0d));
            case 2:
                abs = Math.abs((((c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f42035g * (d2 + c));
            case 6:
                double abs2 = 1.0d - Math.abs(((c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f42033e.mo48981c(c % 1.0d, 0);
            default:
                return Math.sin(this.f42035g * c);
        }
        return 1.0d - abs;
    }

    /* renamed from: f */
    public void mo49064f() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f42029a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f42029a;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            double[] dArr = this.f42030b;
            d2 += (dArr[i2] - dArr[i3]) * ((double) ((fArr2[i3] + fArr2[i2]) / 2.0f));
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f42029a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.f42031c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f42029a;
            if (i5 < fArr4.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.f42030b;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.f42031c;
                dArr3[i5] = dArr3[i6] + (d3 * ((double) ((fArr4[i6] + fArr4[i5]) / 2.0f)));
                i5++;
            } else {
                this.f42036h = true;
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo49065g(int i, String str) {
        this.f42034f = i;
        this.f42032d = str;
        if (str != null) {
            this.f42033e = C16699k.m76246i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f42030b) + " period=" + Arrays.toString(this.f42029a);
    }
}
