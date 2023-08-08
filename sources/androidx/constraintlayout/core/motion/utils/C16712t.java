package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.utils.C16694i;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: androidx.constraintlayout.core.motion.utils.t */
public abstract class C16712t {

    /* renamed from: k */
    public static final String f42089k = "SplineSet";

    /* renamed from: l */
    public static final int f42090l = 0;

    /* renamed from: m */
    public static final int f42091m = 1;

    /* renamed from: n */
    public static final int f42092n = 2;

    /* renamed from: o */
    public static float f42093o = 6.2831855f;

    /* renamed from: a */
    public C16677b f42094a;

    /* renamed from: b */
    public int f42095b = 0;

    /* renamed from: c */
    public int[] f42096c = new int[10];

    /* renamed from: d */
    public float[][] f42097d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e */
    public int f42098e;

    /* renamed from: f */
    public String f42099f;

    /* renamed from: g */
    public float[] f42100g = new float[3];

    /* renamed from: h */
    public boolean f42101h = false;

    /* renamed from: i */
    public long f42102i;

    /* renamed from: j */
    public float f42103j = Float.NaN;

    /* renamed from: androidx.constraintlayout.core.motion.utils.t$a */
    public static class C16713a extends C16712t {

        /* renamed from: p */
        public String f42104p;

        /* renamed from: q */
        public C16694i.C16695a f42105q;

        /* renamed from: r */
        public C16694i.C16697c f42106r = new C16694i.C16697c();

        /* renamed from: s */
        public float[] f42107s;

        /* renamed from: t */
        public float[] f42108t;

        public C16713a(String str, C16694i.C16695a aVar) {
            this.f42104p = str.split(",")[1];
            this.f42105q = aVar;
        }

        /* renamed from: c */
        public void mo49097c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public void mo49100f(int i) {
            int f = this.f42105q.mo49042f();
            int h = this.f42105q.mo49043g(0).mo48763h();
            double[] dArr = new double[f];
            int i2 = h + 2;
            this.f42107s = new float[i2];
            this.f42108t = new float[h];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.f42105q.mo49040d(i3);
                CustomAttribute g = this.f42105q.mo49043g(i3);
                float[] g2 = this.f42106r.mo49057g(i3);
                dArr[i3] = ((double) d) * 0.01d;
                g.mo48761e(this.f42107s);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f42107s;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                double[] dArr3 = dArr2[i3];
                dArr3[h] = (double) g2[0];
                dArr3[h + 1] = (double) g2[1];
            }
            this.f42094a = C16677b.m76154a(i, dArr, dArr2);
        }

        /* renamed from: g */
        public void mo49102g(int i, CustomAttribute customAttribute, float f, int i2, float f2) {
            this.f42105q.mo49037a(i, customAttribute);
            this.f42106r.mo49051a(i, new float[]{f, f2});
            this.f42095b = Math.max(this.f42095b, i2);
        }

        /* renamed from: h */
        public boolean mo49103h(C16660e eVar, float f, long j, C16685g gVar) {
            boolean z;
            C16660e eVar2 = eVar;
            long j2 = j;
            this.f42094a.mo48983e((double) f, this.f42107s);
            float[] fArr = this.f42107s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f42102i;
            if (Float.isNaN(this.f42103j)) {
                float a = gVar.mo49016a(eVar2, this.f42104p, 0);
                this.f42103j = a;
                if (Float.isNaN(a)) {
                    this.f42103j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f42103j) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f42103j = f4;
            this.f42102i = j2;
            float a2 = mo49095a(f4);
            this.f42101h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f42108t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f42101h;
                float f5 = this.f42107s[i];
                if (((double) f5) != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.f42101h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            eVar2.mo48901M(this.f42105q.mo49043g(0), this.f42108t);
            if (f2 != 0.0f) {
                this.f42101h = true;
            }
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.t$b */
    public static class C16714b extends C16712t {

        /* renamed from: p */
        public String f42109p;

        /* renamed from: q */
        public C16694i.C16696b f42110q;

        /* renamed from: r */
        public C16694i.C16697c f42111r = new C16694i.C16697c();

        /* renamed from: s */
        public float[] f42112s;

        /* renamed from: t */
        public float[] f42113t;

        public C16714b(String str, C16694i.C16696b bVar) {
            this.f42109p = str.split(",")[1];
            this.f42110q = bVar;
        }

        /* renamed from: c */
        public void mo49097c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public void mo49100f(int i) {
            int f = this.f42110q.mo49049f();
            int r = this.f42110q.mo49050g(0).mo48784r();
            double[] dArr = new double[f];
            int i2 = r + 2;
            this.f42112s = new float[i2];
            this.f42113t = new float[r];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.f42110q.mo49047d(i3);
                C16655a g = this.f42110q.mo49050g(i3);
                float[] g2 = this.f42111r.mo49057g(i3);
                dArr[i3] = ((double) d) * 0.01d;
                g.mo48782o(this.f42112s);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f42112s;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                double[] dArr3 = dArr2[i3];
                dArr3[r] = (double) g2[0];
                dArr3[r + 1] = (double) g2[1];
            }
            this.f42094a = C16677b.m76154a(i, dArr, dArr2);
        }

        /* renamed from: g */
        public void mo49104g(int i, C16655a aVar, float f, int i2, float f2) {
            this.f42110q.mo49044a(i, aVar);
            this.f42111r.mo49051a(i, new float[]{f, f2});
            this.f42095b = Math.max(this.f42095b, i2);
        }

        /* renamed from: h */
        public boolean mo49105h(C16660e eVar, float f, long j, C16685g gVar) {
            boolean z;
            C16660e eVar2 = eVar;
            long j2 = j;
            this.f42094a.mo48983e((double) f, this.f42112s);
            float[] fArr = this.f42112s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f42102i;
            if (Float.isNaN(this.f42103j)) {
                float a = gVar.mo49016a(eVar2, this.f42109p, 0);
                this.f42103j = a;
                if (Float.isNaN(a)) {
                    this.f42103j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f42103j) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f42103j = f4;
            this.f42102i = j2;
            float a2 = mo49095a(f4);
            this.f42101h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f42113t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f42101h;
                float f5 = this.f42112s[i];
                if (((double) f5) != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.f42101h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            this.f42110q.mo49050g(0).mo48789w(eVar2, this.f42113t);
            if (f2 != 0.0f) {
                this.f42101h = true;
            }
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.t$c */
    public static class C16715c {
        /* renamed from: a */
        public static void m76329a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m76330b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m76330b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m76331c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m76331c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m76331c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: a */
    public float mo49095a(float f) {
        float abs;
        switch (this.f42095b) {
            case 1:
                return Math.signum(f * f42093o);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f42093o));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f42093o));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public C16677b mo49096b() {
        return this.f42094a;
    }

    /* renamed from: c */
    public void mo49097c(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f42096c;
        int i3 = this.f42098e;
        iArr[i3] = i;
        float[] fArr = this.f42097d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f42095b = Math.max(this.f42095b, i2);
        this.f42098e++;
    }

    /* renamed from: d */
    public void mo49098d(long j) {
        this.f42102i = j;
    }

    /* renamed from: e */
    public void mo49099e(String str) {
        this.f42099f = str;
    }

    /* renamed from: f */
    public void mo49100f(int i) {
        int i2 = this.f42098e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f42099f);
            return;
        }
        C16715c.m76329a(this.f42096c, this.f42097d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f42096c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i4;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f42098e; i6++) {
            if (i6 > 0) {
                int[] iArr3 = this.f42096c;
                if (iArr3[i6] == iArr3[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f42096c[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[] fArr = this.f42097d[i6];
            dArr3[0] = (double) fArr[0];
            dArr3[1] = (double) fArr[1];
            dArr3[2] = (double) fArr[2];
            i5++;
        }
        this.f42094a = C16677b.m76154a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f42099f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f42098e; i++) {
            str = str + "[" + this.f42096c[i] + " , " + decimalFormat.format(this.f42097d[i]) + "] ";
        }
        return str;
    }
}
