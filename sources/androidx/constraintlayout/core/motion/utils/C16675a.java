package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.a */
public class C16675a extends C16677b {

    /* renamed from: g */
    public static final int f41888g = 1;

    /* renamed from: h */
    public static final int f41889h = 2;

    /* renamed from: i */
    public static final int f41890i = 3;

    /* renamed from: j */
    public static final int f41891j = 0;

    /* renamed from: k */
    public static final int f41892k = 1;

    /* renamed from: l */
    public static final int f41893l = 2;

    /* renamed from: m */
    public static final int f41894m = 3;

    /* renamed from: d */
    public final double[] f41895d;

    /* renamed from: e */
    public C16676a[] f41896e;

    /* renamed from: f */
    public boolean f41897f = true;

    /* renamed from: androidx.constraintlayout.core.motion.utils.a$a */
    public static class C16676a {

        /* renamed from: s */
        public static final String f41898s = "Arc";

        /* renamed from: t */
        public static double[] f41899t = new double[91];

        /* renamed from: u */
        public static final double f41900u = 0.001d;

        /* renamed from: a */
        public double[] f41901a;

        /* renamed from: b */
        public double f41902b;

        /* renamed from: c */
        public double f41903c;

        /* renamed from: d */
        public double f41904d;

        /* renamed from: e */
        public double f41905e;

        /* renamed from: f */
        public double f41906f;

        /* renamed from: g */
        public double f41907g;

        /* renamed from: h */
        public double f41908h;

        /* renamed from: i */
        public double f41909i;

        /* renamed from: j */
        public double f41910j;

        /* renamed from: k */
        public double f41911k;

        /* renamed from: l */
        public double f41912l;

        /* renamed from: m */
        public double f41913m;

        /* renamed from: n */
        public double f41914n;

        /* renamed from: o */
        public double f41915o;

        /* renamed from: p */
        public double f41916p;

        /* renamed from: q */
        public boolean f41917q;

        /* renamed from: r */
        public boolean f41918r = false;

        public C16676a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            int i3 = i;
            double d9 = d;
            double d10 = d2;
            double d11 = d3;
            double d12 = d4;
            double d13 = d5;
            double d14 = d6;
            boolean z = false;
            int i4 = 1;
            this.f41917q = i3 == 1 ? true : z;
            this.f41903c = d9;
            this.f41904d = d10;
            this.f41909i = 1.0d / (d10 - d9);
            if (3 == i3) {
                this.f41918r = true;
            }
            double d15 = d13 - d11;
            double d16 = d14 - d12;
            if (this.f41918r || Math.abs(d15) < 0.001d || Math.abs(d16) < 0.001d) {
                this.f41918r = true;
                this.f41905e = d11;
                this.f41906f = d13;
                this.f41907g = d12;
                this.f41908h = d6;
                double hypot = Math.hypot(d16, d15);
                this.f41902b = hypot;
                this.f41914n = hypot * this.f41909i;
                double d17 = this.f41904d;
                double d18 = this.f41903c;
                this.f41912l = d15 / (d17 - d18);
                this.f41913m = d16 / (d17 - d18);
                return;
            }
            this.f41901a = new double[101];
            boolean z2 = this.f41917q;
            if (z2) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            this.f41910j = d15 * ((double) i2);
            this.f41911k = d16 * ((double) (!z2 ? -1 : i4));
            if (z2) {
                d7 = d13;
            } else {
                d7 = d11;
            }
            this.f41912l = d7;
            if (z2) {
                d8 = d12;
            } else {
                d8 = d6;
            }
            this.f41913m = d8;
            mo48987a(d3, d4, d5, d6);
            this.f41914n = this.f41902b * this.f41909i;
        }

        /* renamed from: a */
        public final void mo48987a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f41899t;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f41899t[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.f41902b = d13;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f41899t;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f41901a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f41899t, length);
                    if (binarySearch >= 0) {
                        this.f41901a[i3] = ((double) binarySearch) / ((double) (f41899t.length - 1));
                    } else if (binarySearch == -1) {
                        this.f41901a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f41899t;
                        double d14 = dArr4[i5];
                        this.f41901a[i3] = (((double) i5) + ((length - d14) / (dArr4[i4 - 1] - d14))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public double mo48988b() {
            double d = this.f41910j * this.f41916p;
            double hypot = this.f41914n / Math.hypot(d, (-this.f41911k) * this.f41915o);
            if (this.f41917q) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: c */
        public double mo48989c() {
            double d = this.f41910j * this.f41916p;
            double d2 = (-this.f41911k) * this.f41915o;
            double hypot = this.f41914n / Math.hypot(d, d2);
            if (this.f41917q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: d */
        public double mo48990d(double d) {
            return this.f41912l;
        }

        /* renamed from: e */
        public double mo48991e(double d) {
            return this.f41913m;
        }

        /* renamed from: f */
        public double mo48992f(double d) {
            double d2 = (d - this.f41903c) * this.f41909i;
            double d3 = this.f41905e;
            return d3 + (d2 * (this.f41906f - d3));
        }

        /* renamed from: g */
        public double mo48993g(double d) {
            double d2 = (d - this.f41903c) * this.f41909i;
            double d3 = this.f41907g;
            return d3 + (d2 * (this.f41908h - d3));
        }

        /* renamed from: h */
        public double mo48994h() {
            return this.f41912l + (this.f41910j * this.f41915o);
        }

        /* renamed from: i */
        public double mo48995i() {
            return this.f41913m + (this.f41911k * this.f41916p);
        }

        /* renamed from: j */
        public double mo48996j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f41901a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* renamed from: k */
        public void mo48997k(double d) {
            double d2;
            if (this.f41917q) {
                d2 = this.f41904d - d;
            } else {
                d2 = d - this.f41903c;
            }
            double j = mo48996j(d2 * this.f41909i) * 1.5707963267948966d;
            this.f41915o = Math.sin(j);
            this.f41916p = Math.cos(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r5 == 1) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16675a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f41897f = r2
            r0.f41895d = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.a$a[] r3 = new androidx.constraintlayout.core.motion.utils.C16675a.C16676a[r3]
            r0.f41896e = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L_0x0016:
            androidx.constraintlayout.core.motion.utils.a$a[] r7 = r0.f41896e
            int r8 = r7.length
            if (r4 >= r8) goto L_0x004f
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L_0x002f
            if (r8 == r2) goto L_0x002c
            r10 = 2
            if (r8 == r10) goto L_0x002a
            if (r8 == r9) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            if (r5 != r2) goto L_0x002c
        L_0x002a:
            r5 = r10
            goto L_0x002d
        L_0x002c:
            r5 = r2
        L_0x002d:
            r6 = r5
            goto L_0x0030
        L_0x002f:
            r6 = r9
        L_0x0030:
            androidx.constraintlayout.core.motion.utils.a$a r22 = new androidx.constraintlayout.core.motion.utils.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0016
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16675a.<init>(int[], double[], double[][]):void");
    }

    /* renamed from: c */
    public double mo48981c(double d, int i) {
        double g;
        double e;
        double i2;
        double c;
        double g2;
        double e2;
        int i3 = 0;
        if (this.f41897f) {
            C16676a[] aVarArr = this.f41896e;
            C16676a aVar = aVarArr[0];
            double d2 = aVar.f41903c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f41918r) {
                    if (i == 0) {
                        g2 = aVar.mo48992f(d2);
                        e2 = this.f41896e[0].mo48990d(d2);
                    } else {
                        g2 = aVar.mo48993g(d2);
                        e2 = this.f41896e[0].mo48991e(d2);
                    }
                    return g2 + (d3 * e2);
                }
                aVar.mo48997k(d2);
                if (i == 0) {
                    i2 = this.f41896e[0].mo48994h();
                    c = this.f41896e[0].mo48988b();
                } else {
                    i2 = this.f41896e[0].mo48995i();
                    c = this.f41896e[0].mo48989c();
                }
                return i2 + (d3 * c);
            } else if (d > aVarArr[aVarArr.length - 1].f41904d) {
                double d4 = aVarArr[aVarArr.length - 1].f41904d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    g = aVarArr[length].mo48992f(d4);
                    e = this.f41896e[length].mo48990d(d4);
                } else {
                    g = aVarArr[length].mo48993g(d4);
                    e = this.f41896e[length].mo48991e(d4);
                }
                return g + (d5 * e);
            }
        } else {
            C16676a[] aVarArr2 = this.f41896e;
            double d6 = aVarArr2[0].f41903c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].f41904d) {
                d = aVarArr2[aVarArr2.length - 1].f41904d;
            }
        }
        while (true) {
            C16676a[] aVarArr3 = this.f41896e;
            if (i3 >= aVarArr3.length) {
                return Double.NaN;
            }
            C16676a aVar2 = aVarArr3[i3];
            if (d > aVar2.f41904d) {
                i3++;
            } else if (!aVar2.f41918r) {
                aVar2.mo48997k(d);
                if (i == 0) {
                    return this.f41896e[i3].mo48994h();
                }
                return this.f41896e[i3].mo48995i();
            } else if (i == 0) {
                return aVar2.mo48992f(d);
            } else {
                return aVar2.mo48993g(d);
            }
        }
    }

    /* renamed from: d */
    public void mo48982d(double d, double[] dArr) {
        if (this.f41897f) {
            C16676a[] aVarArr = this.f41896e;
            C16676a aVar = aVarArr[0];
            double d2 = aVar.f41903c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f41918r) {
                    dArr[0] = aVar.mo48992f(d2) + (this.f41896e[0].mo48990d(d2) * d3);
                    dArr[1] = this.f41896e[0].mo48993g(d2) + (d3 * this.f41896e[0].mo48991e(d2));
                    return;
                }
                aVar.mo48997k(d2);
                dArr[0] = this.f41896e[0].mo48994h() + (this.f41896e[0].mo48988b() * d3);
                dArr[1] = this.f41896e[0].mo48995i() + (d3 * this.f41896e[0].mo48989c());
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f41904d) {
                double d4 = aVarArr[aVarArr.length - 1].f41904d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                C16676a aVar2 = aVarArr[length];
                if (aVar2.f41918r) {
                    dArr[0] = aVar2.mo48992f(d4) + (this.f41896e[length].mo48990d(d4) * d5);
                    dArr[1] = this.f41896e[length].mo48993g(d4) + (d5 * this.f41896e[length].mo48991e(d4));
                    return;
                }
                aVar2.mo48997k(d);
                dArr[0] = this.f41896e[length].mo48994h() + (this.f41896e[length].mo48988b() * d5);
                dArr[1] = this.f41896e[length].mo48995i() + (d5 * this.f41896e[length].mo48989c());
                return;
            }
        } else {
            C16676a[] aVarArr2 = this.f41896e;
            double d6 = aVarArr2[0].f41903c;
            if (d < d6) {
                d = d6;
            }
            if (d > aVarArr2[aVarArr2.length - 1].f41904d) {
                d = aVarArr2[aVarArr2.length - 1].f41904d;
            }
        }
        int i = 0;
        while (true) {
            C16676a[] aVarArr3 = this.f41896e;
            if (i < aVarArr3.length) {
                C16676a aVar3 = aVarArr3[i];
                if (d > aVar3.f41904d) {
                    i++;
                } else if (aVar3.f41918r) {
                    dArr[0] = aVar3.mo48992f(d);
                    dArr[1] = this.f41896e[i].mo48993g(d);
                    return;
                } else {
                    aVar3.mo48997k(d);
                    dArr[0] = this.f41896e[i].mo48994h();
                    dArr[1] = this.f41896e[i].mo48995i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo48983e(double d, float[] fArr) {
        if (this.f41897f) {
            C16676a[] aVarArr = this.f41896e;
            C16676a aVar = aVarArr[0];
            double d2 = aVar.f41903c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f41918r) {
                    fArr[0] = (float) (aVar.mo48992f(d2) + (this.f41896e[0].mo48990d(d2) * d3));
                    fArr[1] = (float) (this.f41896e[0].mo48993g(d2) + (d3 * this.f41896e[0].mo48991e(d2)));
                    return;
                }
                aVar.mo48997k(d2);
                fArr[0] = (float) (this.f41896e[0].mo48994h() + (this.f41896e[0].mo48988b() * d3));
                fArr[1] = (float) (this.f41896e[0].mo48995i() + (d3 * this.f41896e[0].mo48989c()));
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f41904d) {
                double d4 = aVarArr[aVarArr.length - 1].f41904d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                C16676a aVar2 = aVarArr[length];
                if (aVar2.f41918r) {
                    fArr[0] = (float) (aVar2.mo48992f(d4) + (this.f41896e[length].mo48990d(d4) * d5));
                    fArr[1] = (float) (this.f41896e[length].mo48993g(d4) + (d5 * this.f41896e[length].mo48991e(d4)));
                    return;
                }
                aVar2.mo48997k(d);
                fArr[0] = (float) this.f41896e[length].mo48994h();
                fArr[1] = (float) this.f41896e[length].mo48995i();
                return;
            }
        } else {
            C16676a[] aVarArr2 = this.f41896e;
            double d6 = aVarArr2[0].f41903c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].f41904d) {
                d = aVarArr2[aVarArr2.length - 1].f41904d;
            }
        }
        int i = 0;
        while (true) {
            C16676a[] aVarArr3 = this.f41896e;
            if (i < aVarArr3.length) {
                C16676a aVar3 = aVarArr3[i];
                if (d > aVar3.f41904d) {
                    i++;
                } else if (aVar3.f41918r) {
                    fArr[0] = (float) aVar3.mo48992f(d);
                    fArr[1] = (float) this.f41896e[i].mo48993g(d);
                    return;
                } else {
                    aVar3.mo48997k(d);
                    fArr[0] = (float) this.f41896e[i].mo48994h();
                    fArr[1] = (float) this.f41896e[i].mo48995i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public double mo48984f(double d, int i) {
        C16676a[] aVarArr = this.f41896e;
        int i2 = 0;
        double d2 = aVarArr[0].f41903c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].f41904d) {
            d = aVarArr[aVarArr.length - 1].f41904d;
        }
        while (true) {
            C16676a[] aVarArr2 = this.f41896e;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            C16676a aVar = aVarArr2[i2];
            if (d > aVar.f41904d) {
                i2++;
            } else if (!aVar.f41918r) {
                aVar.mo48997k(d);
                if (i == 0) {
                    return this.f41896e[i2].mo48988b();
                }
                return this.f41896e[i2].mo48989c();
            } else if (i == 0) {
                return aVar.mo48990d(d);
            } else {
                return aVar.mo48991e(d);
            }
        }
    }

    /* renamed from: g */
    public void mo48985g(double d, double[] dArr) {
        C16676a[] aVarArr = this.f41896e;
        double d2 = aVarArr[0].f41903c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].f41904d) {
            d = aVarArr[aVarArr.length - 1].f41904d;
        }
        int i = 0;
        while (true) {
            C16676a[] aVarArr2 = this.f41896e;
            if (i < aVarArr2.length) {
                C16676a aVar = aVarArr2[i];
                if (d > aVar.f41904d) {
                    i++;
                } else if (aVar.f41918r) {
                    dArr[0] = aVar.mo48990d(d);
                    dArr[1] = this.f41896e[i].mo48991e(d);
                    return;
                } else {
                    aVar.mo48997k(d);
                    dArr[0] = this.f41896e[i].mo48988b();
                    dArr[1] = this.f41896e[i].mo48989c();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public double[] mo48986h() {
        return this.f41895d;
    }
}
