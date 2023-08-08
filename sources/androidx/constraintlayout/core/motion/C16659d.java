package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.key.C16667e;
import androidx.constraintlayout.core.motion.utils.C16680d;
import com.urbanairship.iam.C9259x;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.motion.d */
public class C16659d implements Comparable<C16659d> {

    /* renamed from: I0 */
    public static final String f41641I0 = "MotionPaths";

    /* renamed from: J0 */
    public static final boolean f41642J0 = false;

    /* renamed from: K0 */
    public static final boolean f41643K0 = false;

    /* renamed from: L0 */
    public static final int f41644L0 = 0;

    /* renamed from: M0 */
    public static final int f41645M0 = 1;

    /* renamed from: N0 */
    public static final int f41646N0 = 2;

    /* renamed from: O0 */
    public static final int f41647O0 = 3;

    /* renamed from: P0 */
    public static final int f41648P0 = 4;

    /* renamed from: Q0 */
    public static final int f41649Q0 = 5;

    /* renamed from: R0 */
    public static final int f41650R0 = 1;

    /* renamed from: S0 */
    public static final int f41651S0 = 0;

    /* renamed from: T0 */
    public static final int f41652T0 = 2;

    /* renamed from: U0 */
    public static String[] f41653U0 = {C9259x.f25239v, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E0 */
    public int f41654E0 = 0;

    /* renamed from: F0 */
    public int f41655F0;

    /* renamed from: G0 */
    public double[] f41656G0 = new double[18];

    /* renamed from: H0 */
    public double[] f41657H0 = new double[18];

    /* renamed from: X */
    public float f41658X = Float.NaN;

    /* renamed from: Y */
    public C16656b f41659Y = null;

    /* renamed from: Z */
    public HashMap<String, C16655a> f41660Z = new HashMap<>();

    /* renamed from: a */
    public C16680d f41661a;

    /* renamed from: b */
    public int f41662b = 0;

    /* renamed from: c */
    public float f41663c;

    /* renamed from: d */
    public float f41664d;

    /* renamed from: e */
    public float f41665e;

    /* renamed from: f */
    public float f41666f;

    /* renamed from: g */
    public float f41667g;

    /* renamed from: v */
    public float f41668v;

    /* renamed from: w */
    public float f41669w = Float.NaN;

    /* renamed from: x */
    public float f41670x = Float.NaN;

    /* renamed from: y */
    public int f41671y = -1;

    /* renamed from: z */
    public int f41672z = -1;

    public C16659d() {
    }

    /* renamed from: A0 */
    public static final float m75972A0(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* renamed from: u0 */
    public static final float m75973u0(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    /* renamed from: M */
    public void mo48866M(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f41665e;
        float f2 = this.f41666f;
        float f3 = this.f41667g;
        float f4 = this.f41668v;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C16656b bVar = this.f41659Y;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.mo48840r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (d3 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* renamed from: Q */
    public void mo48867Q(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f41665e;
        float f3 = this.f41666f;
        float f4 = this.f41667g;
        float f5 = this.f41668v;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        C16656b bVar = this.f41659Y;
        if (bVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            bVar.mo48840r(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            double d2 = (double) f2;
            float f18 = fArr4[1];
            double d3 = (double) f3;
            f = f4;
            double d4 = (double) f6;
            double d5 = (double) f8;
            float sin = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f16) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* renamed from: W */
    public void mo48868W(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f41665e;
        float f2 = this.f41666f;
        float f3 = this.f41667g;
        float f4 = this.f41668v;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C16656b bVar = this.f41659Y;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.mo48840r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (d3 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* renamed from: X */
    public int mo48869X(String str, double[] dArr, int i) {
        C16655a aVar = this.f41660Z.get(str);
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.mo48784r() == 1) {
            dArr[i] = (double) aVar.mo48781n();
            return 1;
        }
        int r = aVar.mo48784r();
        float[] fArr = new float[r];
        aVar.mo48782o(fArr);
        while (i2 < r) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    /* renamed from: Z */
    public int mo48870Z(String str) {
        C16655a aVar = this.f41660Z.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.mo48784r();
    }

    /* renamed from: b */
    public void mo48871b(C16660e eVar) {
        this.f41661a = C16680d.m76169c(eVar.f41695i.f41704c);
        C16660e.C16661a aVar = eVar.f41695i;
        this.f41671y = aVar.f41705d;
        this.f41672z = aVar.f41702a;
        this.f41669w = aVar.f41709h;
        this.f41662b = aVar.f41706e;
        this.f41655F0 = aVar.f41703b;
        this.f41670x = eVar.f41696j.f41718d;
        this.f41658X = 0.0f;
        for (String next : eVar.mo48921j()) {
            C16655a i = eVar.mo48920i(next);
            if (i != null && i.mo48783q()) {
                this.f41660Z.put(next, i);
            }
        }
    }

    /* renamed from: e0 */
    public void mo48873e0(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f41665e;
        float f2 = this.f41666f;
        float f3 = this.f41667g;
        float f4 = this.f41668v;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C16656b bVar = this.f41659Y;
        if (bVar != null) {
            float s = bVar.mo48841s();
            double d = (double) f;
            double d2 = (double) f2;
            f2 = (float) ((((double) this.f41659Y.mo48842t()) - (d * Math.cos(d2))) - ((double) (f4 / 2.0f)));
            f = (float) ((((double) s) + (Math.sin(d2) * d)) - ((double) (f3 / 2.0f)));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* renamed from: f0 */
    public boolean mo48874f0(String str) {
        return this.f41660Z.containsKey(str);
    }

    /* renamed from: g */
    public int compareTo(C16659d dVar) {
        return Float.compare(this.f41664d, dVar.f41664d);
    }

    /* renamed from: h0 */
    public void mo48876h0(C16667e eVar, C16659d dVar, C16659d dVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        C16667e eVar2 = eVar;
        C16659d dVar3 = dVar;
        C16659d dVar4 = dVar2;
        float f5 = ((float) eVar2.f41744h) / 100.0f;
        this.f41663c = f5;
        this.f41662b = eVar2.f41810B;
        if (Float.isNaN(eVar2.f41811C)) {
            f = f5;
        } else {
            f = eVar2.f41811C;
        }
        if (Float.isNaN(eVar2.f41812D)) {
            f2 = f5;
        } else {
            f2 = eVar2.f41812D;
        }
        float f6 = dVar4.f41667g;
        float f7 = dVar3.f41667g;
        float f8 = dVar4.f41668v;
        float f9 = dVar3.f41668v;
        this.f41664d = this.f41663c;
        float f10 = dVar3.f41665e;
        float f11 = dVar3.f41666f;
        float f12 = (dVar4.f41665e + (f6 / 2.0f)) - ((f7 / 2.0f) + f10);
        float f13 = (dVar4.f41666f + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f14 = (f6 - f7) * f;
        float f15 = f14 / 2.0f;
        this.f41665e = (float) ((int) ((f10 + (f12 * f5)) - f15));
        float f16 = (f8 - f9) * f2;
        float f17 = f16 / 2.0f;
        this.f41666f = (float) ((int) ((f11 + (f13 * f5)) - f17));
        this.f41667g = (float) ((int) (f7 + f14));
        this.f41668v = (float) ((int) (f9 + f16));
        C16667e eVar3 = eVar;
        if (Float.isNaN(eVar3.f41813E)) {
            f3 = f5;
        } else {
            f3 = eVar3.f41813E;
        }
        float f18 = 0.0f;
        if (Float.isNaN(eVar3.f41816H)) {
            f4 = 0.0f;
        } else {
            f4 = eVar3.f41816H;
        }
        if (!Float.isNaN(eVar3.f41814F)) {
            f5 = eVar3.f41814F;
        }
        if (!Float.isNaN(eVar3.f41815G)) {
            f18 = eVar3.f41815G;
        }
        this.f41654E0 = 0;
        C16659d dVar5 = dVar;
        this.f41665e = (float) ((int) (((dVar5.f41665e + (f3 * f12)) + (f18 * f13)) - f15));
        this.f41666f = (float) ((int) (((dVar5.f41666f + (f12 * f4)) + (f13 * f5)) - f17));
        this.f41661a = C16680d.m76169c(eVar3.f41821z);
        this.f41671y = eVar3.f41809A;
    }

    /* renamed from: i0 */
    public void mo48877i0(C16667e eVar, C16659d dVar, C16659d dVar2) {
        float f;
        float f2;
        float f3;
        C16667e eVar2 = eVar;
        C16659d dVar3 = dVar;
        C16659d dVar4 = dVar2;
        float f4 = ((float) eVar2.f41744h) / 100.0f;
        this.f41663c = f4;
        this.f41662b = eVar2.f41810B;
        if (Float.isNaN(eVar2.f41811C)) {
            f = f4;
        } else {
            f = eVar2.f41811C;
        }
        if (Float.isNaN(eVar2.f41812D)) {
            f2 = f4;
        } else {
            f2 = eVar2.f41812D;
        }
        float f5 = dVar4.f41667g - dVar3.f41667g;
        float f6 = dVar4.f41668v - dVar3.f41668v;
        this.f41664d = this.f41663c;
        if (!Float.isNaN(eVar2.f41813E)) {
            f4 = eVar2.f41813E;
        }
        float f7 = dVar3.f41665e;
        float f8 = dVar3.f41667g;
        float f9 = dVar3.f41666f;
        float f10 = dVar3.f41668v;
        float f11 = dVar4.f41665e + (dVar4.f41667g / 2.0f);
        float f12 = f11 - ((f8 / 2.0f) + f7);
        float f13 = (dVar4.f41666f + (dVar4.f41668v / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = f12 * f4;
        float f15 = f5 * f;
        float f16 = f15 / 2.0f;
        this.f41665e = (float) ((int) ((f7 + f14) - f16));
        float f17 = f4 * f13;
        float f18 = f6 * f2;
        float f19 = f18 / 2.0f;
        this.f41666f = (float) ((int) ((f9 + f17) - f19));
        this.f41667g = (float) ((int) (f8 + f15));
        this.f41668v = (float) ((int) (f10 + f18));
        C16667e eVar3 = eVar;
        if (Float.isNaN(eVar3.f41814F)) {
            f3 = 0.0f;
        } else {
            f3 = eVar3.f41814F;
        }
        float f20 = (-f13) * f3;
        float f21 = f12 * f3;
        this.f41654E0 = 1;
        C16659d dVar5 = dVar;
        this.f41665e = ((float) ((int) ((dVar5.f41665e + f14) - f16))) + f20;
        this.f41666f = ((float) ((int) ((dVar5.f41666f + f17) - f19))) + f21;
        this.f41672z = this.f41672z;
        this.f41661a = C16680d.m76169c(eVar3.f41821z);
        this.f41671y = eVar3.f41809A;
    }

    /* renamed from: j0 */
    public void mo48878j0(int i, int i2, C16667e eVar, C16659d dVar, C16659d dVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = ((float) eVar.f41744h) / 100.0f;
        this.f41663c = f7;
        this.f41662b = eVar.f41810B;
        this.f41654E0 = eVar.f41817I;
        if (Float.isNaN(eVar.f41811C)) {
            f = f7;
        } else {
            f = eVar.f41811C;
        }
        if (Float.isNaN(eVar.f41812D)) {
            f2 = f7;
        } else {
            f2 = eVar.f41812D;
        }
        float f8 = dVar2.f41667g;
        float f9 = dVar.f41667g;
        float f10 = dVar2.f41668v;
        float f11 = dVar.f41668v;
        this.f41664d = this.f41663c;
        this.f41667g = (float) ((int) (f9 + ((f8 - f9) * f)));
        this.f41668v = (float) ((int) (f11 + ((f10 - f11) * f2)));
        int i3 = eVar.f41817I;
        if (i3 == 1) {
            if (Float.isNaN(eVar.f41813E)) {
                f3 = f7;
            } else {
                f3 = eVar.f41813E;
            }
            float f12 = dVar2.f41665e;
            float f13 = dVar.f41665e;
            this.f41665e = (f3 * (f12 - f13)) + f13;
            if (!Float.isNaN(eVar.f41814F)) {
                f7 = eVar.f41814F;
            }
            float f14 = dVar2.f41666f;
            float f15 = dVar.f41666f;
            this.f41666f = (f7 * (f14 - f15)) + f15;
        } else if (i3 != 2) {
            if (Float.isNaN(eVar.f41813E)) {
                f6 = f7;
            } else {
                f6 = eVar.f41813E;
            }
            float f16 = dVar2.f41665e;
            float f17 = dVar.f41665e;
            this.f41665e = (f6 * (f16 - f17)) + f17;
            if (!Float.isNaN(eVar.f41814F)) {
                f7 = eVar.f41814F;
            }
            float f18 = dVar2.f41666f;
            float f19 = dVar.f41666f;
            this.f41666f = (f7 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(eVar.f41813E)) {
                float f20 = dVar2.f41665e;
                float f21 = dVar.f41665e;
                f4 = ((f20 - f21) * f7) + f21;
            } else {
                f4 = Math.min(f2, f) * eVar.f41813E;
            }
            this.f41665e = f4;
            if (Float.isNaN(eVar.f41814F)) {
                float f22 = dVar2.f41666f;
                float f23 = dVar.f41666f;
                f5 = (f7 * (f22 - f23)) + f23;
            } else {
                f5 = eVar.f41814F;
            }
            this.f41666f = f5;
        }
        this.f41672z = dVar.f41672z;
        this.f41661a = C16680d.m76169c(eVar.f41821z);
        this.f41671y = eVar.f41809A;
    }

    /* renamed from: m0 */
    public void mo48879m0(int i, int i2, C16667e eVar, C16659d dVar, C16659d dVar2) {
        float f;
        float f2;
        C16667e eVar2 = eVar;
        C16659d dVar3 = dVar;
        C16659d dVar4 = dVar2;
        float f3 = ((float) eVar2.f41744h) / 100.0f;
        this.f41663c = f3;
        this.f41662b = eVar2.f41810B;
        if (Float.isNaN(eVar2.f41811C)) {
            f = f3;
        } else {
            f = eVar2.f41811C;
        }
        if (Float.isNaN(eVar2.f41812D)) {
            f2 = f3;
        } else {
            f2 = eVar2.f41812D;
        }
        float f4 = dVar4.f41667g;
        float f5 = dVar3.f41667g;
        float f6 = dVar4.f41668v;
        float f7 = dVar3.f41668v;
        this.f41664d = this.f41663c;
        float f8 = dVar3.f41665e;
        float f9 = dVar3.f41666f;
        float f10 = dVar4.f41665e + (f4 / 2.0f);
        float f11 = dVar4.f41666f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f41665e = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f2;
        this.f41666f = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f)));
        this.f41667g = (float) ((int) (f5 + f12));
        this.f41668v = (float) ((int) (f7 + f13));
        this.f41654E0 = 2;
        C16667e eVar3 = eVar;
        if (!Float.isNaN(eVar3.f41813E)) {
            this.f41665e = (float) ((int) (eVar3.f41813E * ((float) ((int) (((float) i) - this.f41667g)))));
        }
        if (!Float.isNaN(eVar3.f41814F)) {
            this.f41666f = (float) ((int) (eVar3.f41814F * ((float) ((int) (((float) i2) - this.f41668v)))));
        }
        this.f41672z = this.f41672z;
        this.f41661a = C16680d.m76169c(eVar3.f41821z);
        this.f41671y = eVar3.f41809A;
    }

    /* renamed from: n0 */
    public void mo48880n0(float f, float f2, float f3, float f4) {
        this.f41665e = f;
        this.f41666f = f2;
        this.f41667g = f3;
        this.f41668v = f4;
    }

    /* renamed from: o0 */
    public void mo48881o0(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* renamed from: p0 */
    public void mo48882p0(float f, C16660e eVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        C16660e eVar2 = eVar;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f41665e;
        float f5 = this.f41666f;
        float f6 = this.f41667g;
        float f7 = this.f41668v;
        if (iArr2.length != 0 && this.f41656G0.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f41656G0 = new double[i];
            this.f41657H0 = new double[i];
        }
        Arrays.fill(this.f41656G0, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            double[] dArr5 = this.f41656G0;
            int i3 = iArr2[i2];
            dArr5[i3] = dArr[i2];
            this.f41657H0[i3] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr6 = this.f41656G0;
            if (i4 >= dArr6.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr6[i4]) || !(dArr3 == null || dArr3[i4] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f41656G0[i4])) {
                    d = this.f41656G0[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f41657H0[i4];
                if (i4 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i4 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i4 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i4 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i4 == 5) {
                    f8 = f13;
                }
                i4++;
                double[] dArr7 = dArr2;
            } else {
                f3 = f8;
            }
            f8 = f3;
            i4++;
            double[] dArr72 = dArr2;
        }
        float f15 = f8;
        C16656b bVar = this.f41659Y;
        if (bVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            bVar.mo48840r((double) f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = (double) f4;
            double d3 = (double) f5;
            double sin = ((double) f16) + (Math.sin(d3) * d2);
            f2 = f7;
            float f20 = (float) (sin - ((double) (f6 / 2.0f)));
            float cos = (float) ((((double) f17) - (Math.cos(d3) * d2)) - ((double) (f7 / 2.0f)));
            double d4 = (double) f9;
            double d5 = (double) f10;
            float sin2 = (float) (((double) f18) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float f21 = f20;
            float cos2 = (float) ((((double) f19) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            double[] dArr8 = dArr2;
            if (dArr8.length >= 2) {
                dArr8[0] = (double) sin2;
                dArr8[1] = (double) cos2;
            }
            if (!Float.isNaN(f15)) {
                eVar2.mo48906R((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            if (!Float.isNaN(f22)) {
                eVar2.mo48906R((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        float f23 = f4 + 0.5f;
        float f24 = f5 + 0.5f;
        eVar2.mo48895G((int) f23, (int) f24, (int) (f23 + f6), (int) (f24 + f2));
    }

    /* renamed from: q */
    public void mo48883q(C16656b bVar) {
        bVar.mo48797F((double) this.f41670x);
    }

    /* renamed from: r */
    public final boolean mo48884r(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: t0 */
    public void mo48885t0(C16656b bVar, C16659d dVar) {
        double d = (double) (((this.f41665e + (this.f41667g / 2.0f)) - dVar.f41665e) - (dVar.f41667g / 2.0f));
        double d2 = (double) (((this.f41666f + (this.f41668v / 2.0f)) - dVar.f41666f) - (dVar.f41668v / 2.0f));
        this.f41659Y = bVar;
        this.f41665e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f41658X)) {
            this.f41666f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f41666f = (float) Math.toRadians((double) this.f41658X);
        }
    }

    /* renamed from: w */
    public void mo48886w(C16659d dVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean r = mo48884r(this.f41665e, dVar.f41665e);
        boolean r2 = mo48884r(this.f41666f, dVar.f41666f);
        zArr[0] = zArr[0] | mo48884r(this.f41664d, dVar.f41664d);
        boolean z2 = r | r2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | mo48884r(this.f41667g, dVar.f41667g);
        zArr[4] = mo48884r(this.f41668v, dVar.f41668v) | zArr[4];
    }

    /* renamed from: y */
    public void mo48887y(double[] dArr, int[] iArr) {
        float[] fArr = {this.f41664d, this.f41665e, this.f41666f, this.f41667g, this.f41668v, this.f41669w};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = (double) fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: z */
    public void mo48888z(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f41667g;
        float f2 = this.f41668v;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public C16659d(int i, int i2, C16667e eVar, C16659d dVar, C16659d dVar2) {
        if (dVar.f41672z != -1) {
            mo48878j0(i, i2, eVar, dVar, dVar2);
            return;
        }
        int i3 = eVar.f41817I;
        if (i3 == 1) {
            mo48877i0(eVar, dVar, dVar2);
        } else if (i3 != 2) {
            mo48876h0(eVar, dVar, dVar2);
        } else {
            mo48879m0(i, i2, eVar, dVar, dVar2);
        }
    }
}
