package androidx.constraintlayout.core.motion.utils;

/* renamed from: androidx.constraintlayout.core.motion.utils.j */
public class C16698j extends C16677b {

    /* renamed from: i */
    public static final String f42008i = "LinearCurveFit";

    /* renamed from: d */
    public double[] f42009d;

    /* renamed from: e */
    public double[][] f42010e;

    /* renamed from: f */
    public double f42011f = Double.NaN;

    /* renamed from: g */
    public boolean f42012g = true;

    /* renamed from: h */
    public double[] f42013h;

    public C16698j(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f42013h = new double[length2];
        this.f42009d = dArr;
        this.f42010e = dArr2;
        if (length2 > 2) {
            int i = 0;
            double d = 0.0d;
            while (true) {
                double d2 = d;
                if (i < dArr.length) {
                    double d3 = dArr2[i][0];
                    if (i > 0) {
                        Math.hypot(d3 - d, d3 - d2);
                    }
                    i++;
                    d = d3;
                } else {
                    this.f42011f = 0.0d;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public double mo48981c(double d, int i) {
        double d2;
        double d3;
        double f;
        double[] dArr = this.f42009d;
        int length = dArr.length;
        int i2 = 0;
        if (this.f42012g) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f42010e[0][i];
                d3 = d - d4;
                f = mo48984f(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.f42010e[i3][i];
                    d3 = d - d5;
                    f = mo48984f(d5, i);
                }
            }
            return d2 + (d3 * f);
        } else if (d <= dArr[0]) {
            return this.f42010e[0][i];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.f42010e[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f42009d;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.f42010e[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.f42010e;
                return (dArr3[i2][i] * (1.0d - d8)) + (dArr3[i5][i] * d8);
            }
            i2 = i5;
        }
        return 0.0d;
    }

    /* renamed from: d */
    public void mo48982d(double d, double[] dArr) {
        double[] dArr2 = this.f42009d;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f42010e[0].length;
        if (this.f42012g) {
            double d2 = dArr2[0];
            if (d <= d2) {
                mo48985g(d2, this.f42013h);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f42010e[0][i2] + ((d - this.f42009d[0]) * this.f42013h[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                mo48985g(d3, this.f42013h);
                while (i < length2) {
                    dArr[i] = this.f42010e[i3][i] + ((d - this.f42009d[i3]) * this.f42013h[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f42010e[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f42010e[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f42009d[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f42010e[i6][i7];
                }
            }
            double[] dArr3 = this.f42009d;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.f42010e;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: e */
    public void mo48983e(double d, float[] fArr) {
        double[] dArr = this.f42009d;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f42010e[0].length;
        if (this.f42012g) {
            double d2 = dArr[0];
            if (d <= d2) {
                mo48985g(d2, this.f42013h);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f42010e[0][i2] + ((d - this.f42009d[0]) * this.f42013h[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                mo48985g(d3, this.f42013h);
                while (i < length2) {
                    fArr[i] = (float) (this.f42010e[i3][i] + ((d - this.f42009d[i3]) * this.f42013h[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f42010e[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f42010e[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f42009d[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f42010e[i6][i7];
                }
            }
            double[] dArr2 = this.f42009d;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.f42010e;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r8 >= r3) goto L_0x000a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo48984f(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f42009d
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x000c
        L_0x000a:
            r8 = r3
            goto L_0x0015
        L_0x000c:
            int r3 = r1 + -1
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            int r0 = r1 + -1
            if (r2 >= r0) goto L_0x0035
            double[] r0 = r7.f42009d
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0033
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f42010e
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L_0x0033:
            r2 = r3
            goto L_0x0015
        L_0x0035:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16698j.mo48984f(double, int):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r13 >= r4) goto L_0x000f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48985g(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f42009d
            int r1 = r0.length
            double[][] r2 = r12.f42010e
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
        L_0x000f:
            r13 = r4
            goto L_0x001a
        L_0x0011:
            int r4 = r1 + -1
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r0 = r3
        L_0x001b:
            int r4 = r1 + -1
            if (r0 >= r4) goto L_0x0041
            double[] r4 = r12.f42009d
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003f
            r13 = r4[r0]
            double r6 = r6 - r13
        L_0x002c:
            if (r3 >= r2) goto L_0x0041
            double[][] r13 = r12.f42010e
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L_0x002c
        L_0x003f:
            r0 = r5
            goto L_0x001b
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16698j.mo48985g(double, double[]):void");
    }

    /* renamed from: h */
    public double[] mo48986h() {
        return this.f42009d;
    }

    /* renamed from: i */
    public final double mo49058i(double d) {
        if (Double.isNaN(this.f42011f)) {
            return 0.0d;
        }
        double[] dArr = this.f42009d;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return 0.0d;
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return this.f42011f;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.f42010e[i2];
            double d5 = dArr2[0];
            double d6 = dArr2[1];
            if (i2 > 0) {
                d2 += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.f42009d;
            double d7 = dArr3[i2];
            if (d == d7) {
                return d2;
            }
            int i3 = i2 + 1;
            double d8 = dArr3[i3];
            if (d < d8) {
                double d9 = (d - d7) / (d8 - d7);
                double[][] dArr4 = this.f42010e;
                double[] dArr5 = dArr4[i2];
                double d10 = dArr5[0];
                double[] dArr6 = dArr4[i3];
                double d11 = 1.0d - d9;
                return d2 + Math.hypot(d6 - ((dArr5[1] * d11) + (dArr6[1] * d9)), d5 - ((d10 * d11) + (dArr6[0] * d9)));
            }
            i2 = i3;
            d3 = d5;
            d4 = d6;
        }
        return 0.0d;
    }
}
