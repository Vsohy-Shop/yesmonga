package androidx.constraintlayout.core.motion.utils;

/* renamed from: androidx.constraintlayout.core.motion.utils.b */
public abstract class C16677b {

    /* renamed from: a */
    public static final int f41919a = 0;

    /* renamed from: b */
    public static final int f41920b = 1;

    /* renamed from: c */
    public static final int f41921c = 2;

    /* renamed from: androidx.constraintlayout.core.motion.utils.b$a */
    public static class C16678a extends C16677b {

        /* renamed from: d */
        public double f41922d;

        /* renamed from: e */
        public double[] f41923e;

        public C16678a(double d, double[] dArr) {
            this.f41922d = d;
            this.f41923e = dArr;
        }

        /* renamed from: c */
        public double mo48981c(double d, int i) {
            return this.f41923e[i];
        }

        /* renamed from: d */
        public void mo48982d(double d, double[] dArr) {
            double[] dArr2 = this.f41923e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: e */
        public void mo48983e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f41923e;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public double mo48984f(double d, int i) {
            return 0.0d;
        }

        /* renamed from: g */
        public void mo48985g(double d, double[] dArr) {
            for (int i = 0; i < this.f41923e.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: h */
        public double[] mo48986h() {
            return new double[]{this.f41922d};
        }
    }

    /* renamed from: a */
    public static C16677b m76154a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C16699k(dArr, dArr2);
        }
        if (i != 2) {
            return new C16698j(dArr, dArr2);
        }
        return new C16678a(dArr[0], dArr2[0]);
    }

    /* renamed from: b */
    public static C16677b m76155b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C16675a(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo48981c(double d, int i);

    /* renamed from: d */
    public abstract void mo48982d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo48983e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo48984f(double d, int i);

    /* renamed from: g */
    public abstract void mo48985g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo48986h();
}
