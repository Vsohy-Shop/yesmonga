package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.q */
public class C16709q extends C16680d {

    /* renamed from: q */
    public static final boolean f42071q = false;

    /* renamed from: p */
    public C16699k f42072p;

    public C16709q(String str) {
        this.f41938a = str;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f42072p = m76301e(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: d */
    public static C16699k m76300d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(split[i]);
        }
        return m76301e(dArr);
    }

    /* renamed from: e */
    public static C16699k m76301e(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr4 = new double[length];
        for (int i = 0; i < dArr2.length; i++) {
            double d2 = dArr2[i];
            int i2 = i + length2;
            dArr3[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr4[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr3[i3][0] = d2 + 1.0d;
                dArr4[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr3[i4][0] = (d2 - 1.0d) - d;
                dArr4[i4] = (d3 - 4.0d) - d;
            }
        }
        C16699k kVar = new C16699k(dArr4, dArr3);
        System.out.println(" 0 " + kVar.mo48981c(0.0d, 0));
        System.out.println(" 1 " + kVar.mo48981c(1.0d, 0));
        return kVar;
    }

    /* renamed from: a */
    public double mo48998a(double d) {
        return this.f42072p.mo48981c(d, 0);
    }

    /* renamed from: b */
    public double mo48999b(double d) {
        return this.f42072p.mo48984f(d, 0);
    }
}
