package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.utils.C16694i;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.state.C16772o;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.o */
public abstract class C16703o {

    /* renamed from: f */
    public static final String f42045f = "SplineSet";

    /* renamed from: a */
    public C16677b f42046a;

    /* renamed from: b */
    public int[] f42047b = new int[10];

    /* renamed from: c */
    public float[] f42048c = new float[10];

    /* renamed from: d */
    public int f42049d;

    /* renamed from: e */
    public String f42050e;

    /* renamed from: androidx.constraintlayout.core.motion.utils.o$a */
    public static class C16704a extends C16703o {

        /* renamed from: g */
        public String f42051g;

        /* renamed from: h */
        public long f42052h;

        public C16704a(String str, long j) {
            this.f42051g = str;
            this.f42052h = j;
        }

        /* renamed from: h */
        public void mo49075h(C16717v vVar, float f) {
            vVar.mo48822c(vVar.mo48818a(this.f42051g), mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.o$b */
    public static class C16705b extends C16703o {

        /* renamed from: g */
        public String f42053g;

        /* renamed from: h */
        public C16694i.C16695a f42054h;

        /* renamed from: i */
        public float[] f42055i;

        public C16705b(String str, C16694i.C16695a aVar) {
            this.f42053g = str.split(",")[1];
            this.f42054h = aVar;
        }

        /* renamed from: g */
        public void mo49074g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: j */
        public void mo49077j(int i) {
            int f = this.f42054h.mo49042f();
            int h = this.f42054h.mo49043g(0).mo48763h();
            double[] dArr = new double[f];
            this.f42055i = new float[h];
            int[] iArr = new int[2];
            iArr[1] = h;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.f42054h.mo49040d(i2);
                CustomAttribute g = this.f42054h.mo49043g(i2);
                dArr[i2] = ((double) d) * 0.01d;
                g.mo48761e(this.f42055i);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f42055i;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f42046a = C16677b.m76154a(i, dArr, dArr2);
        }

        /* renamed from: k */
        public void mo49079k(int i, CustomAttribute customAttribute) {
            this.f42054h.mo49037a(i, customAttribute);
        }

        /* renamed from: l */
        public void mo49080l(C16772o oVar, float f) {
            this.f42046a.mo48983e((double) f, this.f42055i);
            oVar.mo49416z(this.f42054h.mo49043g(0), this.f42055i);
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.o$c */
    public static class C16706c extends C16703o {

        /* renamed from: g */
        public String f42056g;

        /* renamed from: h */
        public C16694i.C16696b f42057h;

        /* renamed from: i */
        public float[] f42058i;

        public C16706c(String str, C16694i.C16696b bVar) {
            this.f42056g = str.split(",")[1];
            this.f42057h = bVar;
        }

        /* renamed from: g */
        public void mo49074g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: h */
        public void mo49075h(C16717v vVar, float f) {
            mo49082l((C16660e) vVar, f);
        }

        /* renamed from: j */
        public void mo49077j(int i) {
            int f = this.f42057h.mo49049f();
            int r = this.f42057h.mo49050g(0).mo48784r();
            double[] dArr = new double[f];
            this.f42058i = new float[r];
            int[] iArr = new int[2];
            iArr[1] = r;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.f42057h.mo49047d(i2);
                C16655a g = this.f42057h.mo49050g(i2);
                dArr[i2] = ((double) d) * 0.01d;
                g.mo48782o(this.f42058i);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f42058i;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f42046a = C16677b.m76154a(i, dArr, dArr2);
        }

        /* renamed from: k */
        public void mo49081k(int i, C16655a aVar) {
            this.f42057h.mo49044a(i, aVar);
        }

        /* renamed from: l */
        public void mo49082l(C16660e eVar, float f) {
            this.f42046a.mo48983e((double) f, this.f42058i);
            this.f42057h.mo49050g(0).mo48789w(eVar, this.f42058i);
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.o$d */
    public static class C16707d {
        /* renamed from: a */
        public static void m76289a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m76290b(iArr, fArr, i5, i6);
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
        public static int m76290b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m76291c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m76291c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m76291c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: d */
    public static C16703o m76269d(String str, C16694i.C16695a aVar) {
        return new C16705b(str, aVar);
    }

    /* renamed from: e */
    public static C16703o m76270e(String str, C16694i.C16696b bVar) {
        return new C16706c(str, bVar);
    }

    /* renamed from: f */
    public static C16703o m76271f(String str, long j) {
        return new C16704a(str, j);
    }

    /* renamed from: a */
    public float mo49071a(float f) {
        return (float) this.f42046a.mo48981c((double) f, 0);
    }

    /* renamed from: b */
    public C16677b mo49072b() {
        return this.f42046a;
    }

    /* renamed from: c */
    public float mo49073c(float f) {
        return (float) this.f42046a.mo48984f((double) f, 0);
    }

    /* renamed from: g */
    public void mo49074g(int i, float f) {
        int[] iArr = this.f42047b;
        if (iArr.length < this.f42049d + 1) {
            this.f42047b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f42048c;
            this.f42048c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f42047b;
        int i2 = this.f42049d;
        iArr2[i2] = i;
        this.f42048c[i2] = f;
        this.f42049d = i2 + 1;
    }

    /* renamed from: h */
    public void mo49075h(C16717v vVar, float f) {
        vVar.mo48822c(C16717v.C16718a.m76346a(this.f42050e), mo49071a(f));
    }

    /* renamed from: i */
    public void mo49076i(String str) {
        this.f42050e = str;
    }

    /* renamed from: j */
    public void mo49077j(int i) {
        int i2 = this.f42049d;
        if (i2 != 0) {
            C16707d.m76289a(this.f42047b, this.f42048c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f42049d; i4++) {
                int[] iArr = this.f42047b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i3;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            int i5 = 0;
            for (int i6 = 0; i6 < this.f42049d; i6++) {
                if (i6 > 0) {
                    int[] iArr3 = this.f42047b;
                    if (iArr3[i6] == iArr3[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f42047b[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f42048c[i6];
                i5++;
            }
            this.f42046a = C16677b.m76154a(i, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f42050e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f42049d; i++) {
            str = str + "[" + this.f42047b[i] + " , " + decimalFormat.format((double) this.f42048c[i]) + "] ";
        }
        return str;
    }
}
