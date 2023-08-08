package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* renamed from: androidx.constraintlayout.core.motion.utils.f */
public class C16683f {

    /* renamed from: a */
    public int f41949a;

    /* renamed from: b */
    public C16684a[][] f41950b;

    /* renamed from: c */
    public int f41951c;

    /* renamed from: d */
    public double[] f41952d;

    /* renamed from: e */
    public double f41953e;

    /* renamed from: f */
    public double[][] f41954f;

    /* renamed from: androidx.constraintlayout.core.motion.utils.f$a */
    public static class C16684a {

        /* renamed from: a */
        public double f41955a;

        /* renamed from: b */
        public double f41956b;

        /* renamed from: c */
        public double f41957c;

        /* renamed from: d */
        public double f41958d;

        public C16684a(double d, double d2, double d3, double d4) {
            this.f41955a = d;
            this.f41956b = d2;
            this.f41957c = d3;
            this.f41958d = d4;
        }

        /* renamed from: a */
        public double mo49014a(double d) {
            return (((((this.f41958d * d) + this.f41957c) * d) + this.f41956b) * d) + this.f41955a;
        }

        /* renamed from: b */
        public double mo49015b(double d) {
            return (((this.f41958d * 3.0d * d) + (this.f41957c * 2.0d)) * d) + this.f41956b;
        }
    }

    public C16683f(double[][] dArr) {
        mo49013g(dArr);
    }

    /* renamed from: b */
    public static C16684a[] m76181b(int i, double[] dArr) {
        int i2 = i;
        double[] dArr2 = new double[i2];
        double[] dArr3 = new double[i2];
        double[] dArr4 = new double[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        dArr2[0] = 0.5d;
        int i5 = 1;
        for (int i6 = 1; i6 < i3; i6++) {
            dArr2[i6] = 1.0d / (4.0d - dArr2[i6 - 1]);
        }
        int i7 = i3 - 1;
        dArr2[i3] = 1.0d / (2.0d - dArr2[i7]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i5 < i3) {
            int i8 = i5 + 1;
            int i9 = i5 - 1;
            dArr3[i5] = (((dArr[i8] - dArr[i9]) * 3.0d) - dArr3[i9]) * dArr2[i5];
            i5 = i8;
        }
        double d = (((dArr[i3] - dArr[i7]) * 3.0d) - dArr3[i7]) * dArr2[i3];
        dArr3[i3] = d;
        dArr4[i3] = d;
        while (i7 >= 0) {
            dArr4[i7] = dArr3[i7] - (dArr2[i7] * dArr4[i7 + 1]);
            i7--;
        }
        C16684a[] aVarArr = new C16684a[i3];
        while (i4 < i3) {
            double d2 = dArr[i4];
            double d3 = dArr4[i4];
            int i10 = i4 + 1;
            double d4 = dArr[i10];
            double d5 = dArr4[i10];
            aVarArr[i4] = new C16684a((double) ((float) d2), d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i4 = i10;
        }
        return aVarArr;
    }

    /* renamed from: a */
    public double mo49008a(C16684a[] aVarArr) {
        int i;
        C16684a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        double[] dArr = new double[aVarArr2.length];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i < aVarArr2.length) {
                double d5 = dArr[i];
                double a = aVarArr2[i].mo49014a(d2);
                dArr[i] = a;
                double d6 = d5 - a;
                d4 += d6 * d6;
                i++;
            }
            if (d2 > 0.0d) {
                d3 += Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i < aVarArr2.length) {
            double d7 = dArr[i];
            double a2 = aVarArr2[i].mo49014a(1.0d);
            dArr[i] = a2;
            double d8 = d7 - a2;
            d += d8 * d8;
            i++;
        }
        return d3 + Math.sqrt(d);
    }

    /* renamed from: c */
    public double mo49009c(double d, int i) {
        double[] dArr;
        double d2 = d * this.f41953e;
        int i2 = 0;
        while (true) {
            dArr = this.f41952d;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.f41950b[i][i2].mo49014a(d2 / dArr[i2]);
    }

    /* renamed from: d */
    public void mo49010d(double d, double[] dArr) {
        double d2 = d * this.f41953e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f41952d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f41950b[i2][i].mo49014a(d2 / this.f41952d[i]);
        }
    }

    /* renamed from: e */
    public void mo49011e(double d, float[] fArr) {
        double d2 = d * this.f41953e;
        int i = 0;
        while (true) {
            double[] dArr = this.f41952d;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.f41950b[i2][i].mo49014a(d2 / this.f41952d[i]);
        }
    }

    /* renamed from: f */
    public void mo49012f(double d, double[] dArr) {
        double d2 = d * this.f41953e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f41952d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f41950b[i2][i].mo49015b(d2 / this.f41952d[i]);
        }
    }

    /* renamed from: g */
    public void mo49013g(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.f41951c = length;
        int length2 = dArr.length;
        this.f41949a = length2;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length;
        this.f41954f = (double[][]) Array.newInstance(Double.TYPE, iArr);
        this.f41950b = new C16684a[this.f41951c][];
        for (int i2 = 0; i2 < this.f41951c; i2++) {
            for (int i3 = 0; i3 < this.f41949a; i3++) {
                this.f41954f[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f41951c;
            if (i4 >= i) {
                break;
            }
            C16684a[][] aVarArr = this.f41950b;
            double[] dArr2 = this.f41954f[i4];
            aVarArr[i4] = m76181b(dArr2.length, dArr2);
            i4++;
        }
        this.f41952d = new double[(this.f41949a - 1)];
        this.f41953e = 0.0d;
        C16684a[] aVarArr2 = new C16684a[i];
        for (int i5 = 0; i5 < this.f41952d.length; i5++) {
            for (int i6 = 0; i6 < this.f41951c; i6++) {
                aVarArr2[i6] = this.f41950b[i6][i5];
            }
            double d = this.f41953e;
            double[] dArr3 = this.f41952d;
            double a = mo49008a(aVarArr2);
            dArr3[i5] = a;
            this.f41953e = d + a;
        }
    }

    public C16683f() {
    }
}
