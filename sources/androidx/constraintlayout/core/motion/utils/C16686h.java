package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.motion.utils.h */
public abstract class C16686h {

    /* renamed from: h */
    public static final String f41960h = "KeyCycleOscillator";

    /* renamed from: a */
    public C16677b f41961a;

    /* renamed from: b */
    public C16689c f41962b;

    /* renamed from: c */
    public String f41963c;

    /* renamed from: d */
    public int f41964d = 0;

    /* renamed from: e */
    public String f41965e = null;

    /* renamed from: f */
    public int f41966f = 0;

    /* renamed from: g */
    public ArrayList<C16693g> f41967g = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$a */
    public class C16687a implements Comparator<C16693g> {
        public C16687a() {
        }

        /* renamed from: a */
        public int compare(C16693g gVar, C16693g gVar2) {
            return Integer.compare(gVar.f41991a, gVar2.f41991a);
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$b */
    public static class C16688b extends C16686h {

        /* renamed from: i */
        public String f41969i;

        /* renamed from: j */
        public int f41970j;

        public C16688b(String str) {
            this.f41969i = str;
            this.f41970j = C16717v.C16720c.m76348a(str);
        }

        /* renamed from: h */
        public void mo49024h(C16660e eVar, float f) {
            eVar.mo48822c(this.f41970j, mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$c */
    public static class C16689c {

        /* renamed from: q */
        public static final int f41971q = -1;

        /* renamed from: r */
        public static final String f41972r = "CycleOscillator";

        /* renamed from: a */
        public final int f41973a;

        /* renamed from: b */
        public C16700l f41974b;

        /* renamed from: c */
        public final int f41975c = 0;

        /* renamed from: d */
        public final int f41976d = 1;

        /* renamed from: e */
        public final int f41977e = 2;

        /* renamed from: f */
        public float[] f41978f;

        /* renamed from: g */
        public double[] f41979g;

        /* renamed from: h */
        public float[] f41980h;

        /* renamed from: i */
        public float[] f41981i;

        /* renamed from: j */
        public float[] f41982j;

        /* renamed from: k */
        public float[] f41983k;

        /* renamed from: l */
        public int f41984l;

        /* renamed from: m */
        public C16677b f41985m;

        /* renamed from: n */
        public double[] f41986n;

        /* renamed from: o */
        public double[] f41987o;

        /* renamed from: p */
        public float f41988p;

        public C16689c(int i, String str, int i2, int i3) {
            C16700l lVar = new C16700l();
            this.f41974b = lVar;
            this.f41984l = i;
            this.f41973a = i2;
            lVar.mo49065g(i, str);
            this.f41978f = new float[i3];
            this.f41979g = new double[i3];
            this.f41980h = new float[i3];
            this.f41981i = new float[i3];
            this.f41982j = new float[i3];
            this.f41983k = new float[i3];
        }

        /* renamed from: a */
        public double mo49031a() {
            return this.f41986n[1];
        }

        /* renamed from: b */
        public double mo49032b(float f) {
            C16677b bVar = this.f41985m;
            if (bVar != null) {
                double d = (double) f;
                bVar.mo48985g(d, this.f41987o);
                this.f41985m.mo48982d(d, this.f41986n);
            } else {
                double[] dArr = this.f41987o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = (double) f;
            double e = this.f41974b.mo49063e(d2, this.f41986n[1]);
            double d3 = this.f41974b.mo49062d(d2, this.f41986n[1], this.f41987o[1]);
            double[] dArr2 = this.f41987o;
            return dArr2[0] + (e * dArr2[2]) + (d3 * this.f41986n[2]);
        }

        /* renamed from: c */
        public double mo49033c(float f) {
            C16677b bVar = this.f41985m;
            if (bVar != null) {
                bVar.mo48982d((double) f, this.f41986n);
            } else {
                double[] dArr = this.f41986n;
                dArr[0] = (double) this.f41981i[0];
                dArr[1] = (double) this.f41982j[0];
                dArr[2] = (double) this.f41978f[0];
            }
            double[] dArr2 = this.f41986n;
            return dArr2[0] + (this.f41974b.mo49063e((double) f, dArr2[1]) * this.f41986n[2]);
        }

        /* renamed from: d */
        public void mo49034d(int i, int i2, float f, float f2, float f3, float f4) {
            this.f41979g[i] = ((double) i2) / 100.0d;
            this.f41980h[i] = f;
            this.f41981i[i] = f2;
            this.f41982j[i] = f3;
            this.f41978f[i] = f4;
        }

        /* renamed from: e */
        public void mo49035e(float f) {
            this.f41988p = f;
            int length = this.f41979g.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr);
            float[] fArr = this.f41978f;
            this.f41986n = new double[(fArr.length + 2)];
            this.f41987o = new double[(fArr.length + 2)];
            if (this.f41979g[0] > 0.0d) {
                this.f41974b.mo49059a(0.0d, this.f41980h[0]);
            }
            double[] dArr2 = this.f41979g;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f41974b.mo49059a(1.0d, this.f41980h[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = (double) this.f41981i[i];
                dArr3[1] = (double) this.f41982j[i];
                dArr3[2] = (double) this.f41978f[i];
                this.f41974b.mo49059a(this.f41979g[i], this.f41980h[i]);
            }
            this.f41974b.mo49064f();
            double[] dArr4 = this.f41979g;
            if (dArr4.length > 1) {
                this.f41985m = C16677b.m76154a(0, dArr4, dArr);
            } else {
                this.f41985m = null;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$d */
    public static class C16690d {
        /* renamed from: a */
        public static int m76210a(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m76212c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m76212c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: b */
        public static void m76211b(int[] iArr, float[] fArr, int i, int i2) {
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
                    int a = m76210a(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = a - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = a + 1;
                }
            }
        }

        /* renamed from: c */
        public static void m76212c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$e */
    public static class C16691e {
        /* renamed from: a */
        public static int m76213a(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m76215c(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            m76215c(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        /* renamed from: b */
        public static void m76214b(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
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
                    int a = m76213a(iArr, fArr, fArr2, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = a - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = a + 1;
                }
            }
        }

        /* renamed from: c */
        public static void m76215c(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$f */
    public static class C16692f extends C16686h {

        /* renamed from: i */
        public String f41989i;

        /* renamed from: j */
        public int f41990j;

        public C16692f(String str) {
            this.f41989i = str;
            this.f41990j = C16717v.C16720c.m76348a(str);
        }

        /* renamed from: h */
        public void mo49024h(C16660e eVar, float f) {
            eVar.mo48822c(this.f41990j, mo49018a(f));
        }

        /* renamed from: l */
        public void mo49036l(C16660e eVar, float f, double d, double d2) {
            eVar.mo48906R(mo49018a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.h$g */
    public static class C16693g {

        /* renamed from: a */
        public int f41991a;

        /* renamed from: b */
        public float f41992b;

        /* renamed from: c */
        public float f41993c;

        /* renamed from: d */
        public float f41994d;

        /* renamed from: e */
        public float f41995e;

        public C16693g(int i, float f, float f2, float f3, float f4) {
            this.f41991a = i;
            this.f41992b = f4;
            this.f41993c = f2;
            this.f41994d = f;
            this.f41995e = f3;
        }
    }

    /* renamed from: d */
    public static C16686h m76192d(String str) {
        if (str.equals("pathRotate")) {
            return new C16692f(str);
        }
        return new C16688b(str);
    }

    /* renamed from: a */
    public float mo49018a(float f) {
        return (float) this.f41962b.mo49033c(f);
    }

    /* renamed from: b */
    public C16677b mo49019b() {
        return this.f41961a;
    }

    /* renamed from: c */
    public float mo49020c(float f) {
        return (float) this.f41962b.mo49032b(f);
    }

    /* renamed from: e */
    public void mo49021e(Object obj) {
    }

    /* renamed from: f */
    public void mo49022f(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        int i4 = i3;
        this.f41967g.add(new C16693g(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f41966f = i4;
        }
        this.f41964d = i2;
        this.f41965e = str;
    }

    /* renamed from: g */
    public void mo49023g(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        int i4 = i3;
        this.f41967g.add(new C16693g(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f41966f = i4;
        }
        this.f41964d = i2;
        mo49021e(obj);
        this.f41965e = str;
    }

    /* renamed from: h */
    public void mo49024h(C16660e eVar, float f) {
    }

    /* renamed from: i */
    public void mo49025i(String str) {
        this.f41963c = str;
    }

    /* renamed from: j */
    public void mo49026j(float f) {
        int size = this.f41967g.size();
        if (size != 0) {
            Collections.sort(this.f41967g, new C16687a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f41962b = new C16689c(this.f41964d, this.f41965e, this.f41966f, size);
            Iterator<C16693g> it = this.f41967g.iterator();
            int i = 0;
            while (it.hasNext()) {
                C16693g next = it.next();
                float f2 = next.f41994d;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.f41992b;
                dArr3[0] = (double) f3;
                float f4 = next.f41993c;
                dArr3[1] = (double) f4;
                float f5 = next.f41995e;
                dArr3[2] = (double) f5;
                this.f41962b.mo49034d(i, next.f41991a, f2, f4, f5, f3);
                i++;
                dArr2 = dArr2;
            }
            double[][] dArr4 = dArr2;
            this.f41962b.mo49035e(f);
            this.f41961a = C16677b.m76154a(0, dArr, dArr2);
        }
    }

    /* renamed from: k */
    public boolean mo49027k() {
        return this.f41966f == 1;
    }

    public String toString() {
        String str = this.f41963c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C16693g> it = this.f41967g.iterator();
        while (it.hasNext()) {
            C16693g next = it.next();
            str = str + "[" + next.f41991a + " , " + decimalFormat.format((double) next.f41992b) + "] ";
        }
        return str;
    }
}
