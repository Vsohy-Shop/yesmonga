package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.urbanairship.iam.C9259x;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: androidx.constraintlayout.motion.widget.r */
public class C16899r implements Comparable<C16899r> {

    /* renamed from: I0 */
    public static final String f43742I0 = "MotionPaths";

    /* renamed from: J0 */
    public static final boolean f43743J0 = false;

    /* renamed from: K0 */
    public static final boolean f43744K0 = false;

    /* renamed from: L0 */
    public static final int f43745L0 = 0;

    /* renamed from: M0 */
    public static final int f43746M0 = 1;

    /* renamed from: N0 */
    public static final int f43747N0 = 2;

    /* renamed from: O0 */
    public static final int f43748O0 = 3;

    /* renamed from: P0 */
    public static final int f43749P0 = 4;

    /* renamed from: Q0 */
    public static final int f43750Q0 = 5;

    /* renamed from: R0 */
    public static final int f43751R0 = 1;

    /* renamed from: S0 */
    public static final int f43752S0 = 0;

    /* renamed from: T0 */
    public static final int f43753T0 = 2;

    /* renamed from: U0 */
    public static String[] f43754U0 = {C9259x.f25239v, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E0 */
    public int f43755E0;

    /* renamed from: F0 */
    public int f43756F0;

    /* renamed from: G0 */
    public double[] f43757G0;

    /* renamed from: H0 */
    public double[] f43758H0;

    /* renamed from: X */
    public float f43759X;

    /* renamed from: Y */
    public C16895o f43760Y;

    /* renamed from: Z */
    public LinkedHashMap<String, ConstraintAttribute> f43761Z;

    /* renamed from: a */
    public C16680d f43762a;

    /* renamed from: b */
    public int f43763b = 0;

    /* renamed from: c */
    public float f43764c;

    /* renamed from: d */
    public float f43765d;

    /* renamed from: e */
    public float f43766e;

    /* renamed from: f */
    public float f43767f;

    /* renamed from: g */
    public float f43768g;

    /* renamed from: v */
    public float f43769v;

    /* renamed from: w */
    public float f43770w = Float.NaN;

    /* renamed from: x */
    public float f43771x = Float.NaN;

    /* renamed from: y */
    public int f43772y;

    /* renamed from: z */
    public int f43773z;

    public C16899r() {
        int i = C16881f.f43372f;
        this.f43772y = i;
        this.f43773z = i;
        this.f43759X = Float.NaN;
        this.f43760Y = null;
        this.f43761Z = new LinkedHashMap<>();
        this.f43755E0 = 0;
        this.f43757G0 = new double[18];
        this.f43758H0 = new double[18];
    }

    /* renamed from: A0 */
    public static final float m77903A0(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* renamed from: u0 */
    public static final float m77904u0(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    /* renamed from: M */
    public void mo50268M(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f43766e;
        float f2 = this.f43767f;
        float f3 = this.f43768g;
        float f4 = this.f43769v;
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
        C16895o oVar = this.f43760Y;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.mo50253m(d, fArr2, new float[2]);
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
    public void mo50269Q(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f43766e;
        float f3 = this.f43767f;
        float f4 = this.f43768g;
        float f5 = this.f43769v;
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
        C16895o oVar = this.f43760Y;
        if (oVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            oVar.mo50253m(d, fArr3, fArr4);
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
    public void mo50270W(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f43766e;
        float f2 = this.f43767f;
        float f3 = this.f43768g;
        float f4 = this.f43769v;
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
        C16895o oVar = this.f43760Y;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.mo50253m(d, fArr2, new float[2]);
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
    public int mo50271X(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.f43761Z.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.mo50637p() == 1) {
            dArr[i] = (double) constraintAttribute.mo50632k();
            return 1;
        }
        int p = constraintAttribute.mo50637p();
        float[] fArr = new float[p];
        constraintAttribute.mo50633l(fArr);
        while (i2 < p) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return p;
    }

    /* renamed from: Z */
    public int mo50272Z(String str) {
        ConstraintAttribute constraintAttribute = this.f43761Z.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.mo50637p();
    }

    /* renamed from: b */
    public void mo50273b(C16934c.C16935a aVar) {
        this.f43762a = C16680d.m76169c(aVar.f44583d.f44761d);
        C16934c.C16938c cVar = aVar.f44583d;
        this.f43772y = cVar.f44762e;
        this.f43773z = cVar.f44759b;
        this.f43770w = cVar.f44766i;
        this.f43763b = cVar.f44763f;
        this.f43756F0 = cVar.f44760c;
        this.f43771x = aVar.f44582c.f44776e;
        this.f43759X = aVar.f44584e.f44678D;
        for (String next : aVar.f44586g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f44586g.get(next);
            if (constraintAttribute != null && constraintAttribute.mo50635n()) {
                this.f43761Z.put(next, constraintAttribute);
            }
        }
    }

    /* renamed from: e0 */
    public void mo50275e0(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f43766e;
        float f2 = this.f43767f;
        float f3 = this.f43768g;
        float f4 = this.f43769v;
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
        C16895o oVar = this.f43760Y;
        if (oVar != null) {
            float n = oVar.mo50254n();
            double d = (double) f;
            double d2 = (double) f2;
            f2 = (float) ((((double) this.f43760Y.mo50255o()) - (d * Math.cos(d2))) - ((double) (f4 / 2.0f)));
            f = (float) ((((double) n) + (Math.sin(d2) * d)) - ((double) (f3 / 2.0f)));
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
    public boolean mo50276f0(String str) {
        return this.f43761Z.containsKey(str);
    }

    /* renamed from: g */
    public int compareTo(@C0359n0 C16899r rVar) {
        return Float.compare(this.f43765d, rVar.f43765d);
    }

    /* renamed from: h0 */
    public void mo50278h0(C16887j jVar, C16899r rVar, C16899r rVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        C16887j jVar2 = jVar;
        C16899r rVar3 = rVar;
        C16899r rVar4 = rVar2;
        float f5 = ((float) jVar2.f43393a) / 100.0f;
        this.f43764c = f5;
        this.f43763b = jVar2.f43515H;
        if (Float.isNaN(jVar2.f43516I)) {
            f = f5;
        } else {
            f = jVar2.f43516I;
        }
        if (Float.isNaN(jVar2.f43517J)) {
            f2 = f5;
        } else {
            f2 = jVar2.f43517J;
        }
        float f6 = rVar4.f43768g;
        float f7 = rVar3.f43768g;
        float f8 = rVar4.f43769v;
        float f9 = rVar3.f43769v;
        this.f43765d = this.f43764c;
        float f10 = rVar3.f43766e;
        float f11 = rVar3.f43767f;
        float f12 = (rVar4.f43766e + (f6 / 2.0f)) - ((f7 / 2.0f) + f10);
        float f13 = (rVar4.f43767f + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f14 = (f6 - f7) * f;
        float f15 = f14 / 2.0f;
        this.f43766e = (float) ((int) ((f10 + (f12 * f5)) - f15));
        float f16 = (f8 - f9) * f2;
        float f17 = f16 / 2.0f;
        this.f43767f = (float) ((int) ((f11 + (f13 * f5)) - f17));
        this.f43768g = (float) ((int) (f7 + f14));
        this.f43769v = (float) ((int) (f9 + f16));
        C16887j jVar3 = jVar;
        if (Float.isNaN(jVar3.f43518K)) {
            f3 = f5;
        } else {
            f3 = jVar3.f43518K;
        }
        float f18 = 0.0f;
        if (Float.isNaN(jVar3.f43521N)) {
            f4 = 0.0f;
        } else {
            f4 = jVar3.f43521N;
        }
        if (!Float.isNaN(jVar3.f43519L)) {
            f5 = jVar3.f43519L;
        }
        if (!Float.isNaN(jVar3.f43520M)) {
            f18 = jVar3.f43520M;
        }
        this.f43755E0 = 0;
        C16899r rVar5 = rVar;
        this.f43766e = (float) ((int) (((rVar5.f43766e + (f3 * f12)) + (f18 * f13)) - f15));
        this.f43767f = (float) ((int) (((rVar5.f43767f + (f12 * f4)) + (f13 * f5)) - f17));
        this.f43762a = C16680d.m76169c(jVar3.f43513F);
        this.f43772y = jVar3.f43514G;
    }

    /* renamed from: i0 */
    public void mo50279i0(C16887j jVar, C16899r rVar, C16899r rVar2) {
        float f;
        float f2;
        float f3;
        C16887j jVar2 = jVar;
        C16899r rVar3 = rVar;
        C16899r rVar4 = rVar2;
        float f4 = ((float) jVar2.f43393a) / 100.0f;
        this.f43764c = f4;
        this.f43763b = jVar2.f43515H;
        if (Float.isNaN(jVar2.f43516I)) {
            f = f4;
        } else {
            f = jVar2.f43516I;
        }
        if (Float.isNaN(jVar2.f43517J)) {
            f2 = f4;
        } else {
            f2 = jVar2.f43517J;
        }
        float f5 = rVar4.f43768g - rVar3.f43768g;
        float f6 = rVar4.f43769v - rVar3.f43769v;
        this.f43765d = this.f43764c;
        if (!Float.isNaN(jVar2.f43518K)) {
            f4 = jVar2.f43518K;
        }
        float f7 = rVar3.f43766e;
        float f8 = rVar3.f43768g;
        float f9 = rVar3.f43767f;
        float f10 = rVar3.f43769v;
        float f11 = rVar4.f43766e + (rVar4.f43768g / 2.0f);
        float f12 = f11 - ((f8 / 2.0f) + f7);
        float f13 = (rVar4.f43767f + (rVar4.f43769v / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = f12 * f4;
        float f15 = f5 * f;
        float f16 = f15 / 2.0f;
        this.f43766e = (float) ((int) ((f7 + f14) - f16));
        float f17 = f4 * f13;
        float f18 = f6 * f2;
        float f19 = f18 / 2.0f;
        this.f43767f = (float) ((int) ((f9 + f17) - f19));
        this.f43768g = (float) ((int) (f8 + f15));
        this.f43769v = (float) ((int) (f10 + f18));
        C16887j jVar3 = jVar;
        if (Float.isNaN(jVar3.f43519L)) {
            f3 = 0.0f;
        } else {
            f3 = jVar3.f43519L;
        }
        float f20 = (-f13) * f3;
        float f21 = f12 * f3;
        this.f43755E0 = 1;
        C16899r rVar5 = rVar;
        this.f43766e = ((float) ((int) ((rVar5.f43766e + f14) - f16))) + f20;
        this.f43767f = ((float) ((int) ((rVar5.f43767f + f17) - f19))) + f21;
        this.f43773z = this.f43773z;
        this.f43762a = C16680d.m76169c(jVar3.f43513F);
        this.f43772y = jVar3.f43514G;
    }

    /* renamed from: j0 */
    public void mo50280j0(int i, int i2, C16887j jVar, C16899r rVar, C16899r rVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = ((float) jVar.f43393a) / 100.0f;
        this.f43764c = f7;
        this.f43763b = jVar.f43515H;
        this.f43755E0 = jVar.f43522O;
        if (Float.isNaN(jVar.f43516I)) {
            f = f7;
        } else {
            f = jVar.f43516I;
        }
        if (Float.isNaN(jVar.f43517J)) {
            f2 = f7;
        } else {
            f2 = jVar.f43517J;
        }
        float f8 = rVar2.f43768g;
        float f9 = rVar.f43768g;
        float f10 = rVar2.f43769v;
        float f11 = rVar.f43769v;
        this.f43765d = this.f43764c;
        this.f43768g = (float) ((int) (f9 + ((f8 - f9) * f)));
        this.f43769v = (float) ((int) (f11 + ((f10 - f11) * f2)));
        int i3 = jVar.f43522O;
        if (i3 == 1) {
            if (Float.isNaN(jVar.f43518K)) {
                f3 = f7;
            } else {
                f3 = jVar.f43518K;
            }
            float f12 = rVar2.f43766e;
            float f13 = rVar.f43766e;
            this.f43766e = (f3 * (f12 - f13)) + f13;
            if (!Float.isNaN(jVar.f43519L)) {
                f7 = jVar.f43519L;
            }
            float f14 = rVar2.f43767f;
            float f15 = rVar.f43767f;
            this.f43767f = (f7 * (f14 - f15)) + f15;
        } else if (i3 != 2) {
            if (Float.isNaN(jVar.f43518K)) {
                f6 = f7;
            } else {
                f6 = jVar.f43518K;
            }
            float f16 = rVar2.f43766e;
            float f17 = rVar.f43766e;
            this.f43766e = (f6 * (f16 - f17)) + f17;
            if (!Float.isNaN(jVar.f43519L)) {
                f7 = jVar.f43519L;
            }
            float f18 = rVar2.f43767f;
            float f19 = rVar.f43767f;
            this.f43767f = (f7 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(jVar.f43518K)) {
                float f20 = rVar2.f43766e;
                float f21 = rVar.f43766e;
                f4 = ((f20 - f21) * f7) + f21;
            } else {
                f4 = Math.min(f2, f) * jVar.f43518K;
            }
            this.f43766e = f4;
            if (Float.isNaN(jVar.f43519L)) {
                float f22 = rVar2.f43767f;
                float f23 = rVar.f43767f;
                f5 = (f7 * (f22 - f23)) + f23;
            } else {
                f5 = jVar.f43519L;
            }
            this.f43767f = f5;
        }
        this.f43773z = rVar.f43773z;
        this.f43762a = C16680d.m76169c(jVar.f43513F);
        this.f43772y = jVar.f43514G;
    }

    /* renamed from: m0 */
    public void mo50281m0(int i, int i2, C16887j jVar, C16899r rVar, C16899r rVar2) {
        float f;
        float f2;
        C16887j jVar2 = jVar;
        C16899r rVar3 = rVar;
        C16899r rVar4 = rVar2;
        float f3 = ((float) jVar2.f43393a) / 100.0f;
        this.f43764c = f3;
        this.f43763b = jVar2.f43515H;
        if (Float.isNaN(jVar2.f43516I)) {
            f = f3;
        } else {
            f = jVar2.f43516I;
        }
        if (Float.isNaN(jVar2.f43517J)) {
            f2 = f3;
        } else {
            f2 = jVar2.f43517J;
        }
        float f4 = rVar4.f43768g;
        float f5 = rVar3.f43768g;
        float f6 = rVar4.f43769v;
        float f7 = rVar3.f43769v;
        this.f43765d = this.f43764c;
        float f8 = rVar3.f43766e;
        float f9 = rVar3.f43767f;
        float f10 = rVar4.f43766e + (f4 / 2.0f);
        float f11 = rVar4.f43767f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f43766e = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f2;
        this.f43767f = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f)));
        this.f43768g = (float) ((int) (f5 + f12));
        this.f43769v = (float) ((int) (f7 + f13));
        this.f43755E0 = 2;
        C16887j jVar3 = jVar;
        if (!Float.isNaN(jVar3.f43518K)) {
            this.f43766e = (float) ((int) (jVar3.f43518K * ((float) ((int) (((float) i) - this.f43768g)))));
        }
        if (!Float.isNaN(jVar3.f43519L)) {
            this.f43767f = (float) ((int) (jVar3.f43519L * ((float) ((int) (((float) i2) - this.f43769v)))));
        }
        this.f43773z = this.f43773z;
        this.f43762a = C16680d.m76169c(jVar3.f43513F);
        this.f43772y = jVar3.f43514G;
    }

    /* renamed from: n0 */
    public void mo50282n0(float f, float f2, float f3, float f4) {
        this.f43766e = f;
        this.f43767f = f2;
        this.f43768g = f3;
        this.f43769v = f4;
    }

    /* renamed from: o0 */
    public void mo50283o0(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
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
    public void mo50284p0(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f43766e;
        float f5 = this.f43767f;
        float f6 = this.f43768g;
        float f7 = this.f43769v;
        if (iArr2.length != 0 && this.f43757G0.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f43757G0 = new double[i];
            this.f43758H0 = new double[i];
        }
        Arrays.fill(this.f43757G0, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            double[] dArr5 = this.f43757G0;
            int i3 = iArr2[i2];
            dArr5[i3] = dArr[i2];
            this.f43758H0[i3] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr6 = this.f43757G0;
            if (i4 >= dArr6.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr6[i4]) || !(dArr3 == null || dArr3[i4] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f43757G0[i4])) {
                    d = this.f43757G0[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f43758H0[i4];
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
        C16895o oVar = this.f43760Y;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.mo50253m((double) f, fArr, fArr2);
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
                z3 = false;
                dArr8[0] = (double) sin2;
                z2 = true;
                dArr8[1] = (double) cos2;
            } else {
                z3 = false;
                z2 = true;
            }
            if (!Float.isNaN(f15)) {
                view2.setRotation((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            z3 = false;
            z2 = true;
            if (!Float.isNaN(f22)) {
                view2.setRotation((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        if (view2 instanceof C16880e) {
            ((C16880e) view2).mo50155a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f23 = f4 + 0.5f;
        int i5 = (int) f23;
        float f24 = f5 + 0.5f;
        int i6 = (int) f24;
        int i7 = (int) (f23 + f6);
        int i8 = (int) (f24 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (!(i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight())) {
            z3 = z2;
        }
        if (z3 || z) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view2.layout(i5, i6, i7, i8);
    }

    /* renamed from: q */
    public void mo50285q(C16895o oVar) {
        oVar.mo50213A((double) this.f43771x);
    }

    /* renamed from: r */
    public final boolean mo50286r(float f, float f2) {
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
    public void mo50287t0(C16895o oVar, C16899r rVar) {
        double d = (double) (((this.f43766e + (this.f43768g / 2.0f)) - rVar.f43766e) - (rVar.f43768g / 2.0f));
        double d2 = (double) (((this.f43767f + (this.f43769v / 2.0f)) - rVar.f43767f) - (rVar.f43769v / 2.0f));
        this.f43760Y = oVar;
        this.f43766e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f43759X)) {
            this.f43767f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f43767f = (float) Math.toRadians((double) this.f43759X);
        }
    }

    /* renamed from: w */
    public void mo50288w(C16899r rVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean r = mo50286r(this.f43766e, rVar.f43766e);
        boolean r2 = mo50286r(this.f43767f, rVar.f43767f);
        zArr[0] = zArr[0] | mo50286r(this.f43765d, rVar.f43765d);
        boolean z2 = r | r2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | mo50286r(this.f43768g, rVar.f43768g);
        zArr[4] = mo50286r(this.f43769v, rVar.f43769v) | zArr[4];
    }

    /* renamed from: y */
    public void mo50289y(double[] dArr, int[] iArr) {
        float[] fArr = {this.f43765d, this.f43766e, this.f43767f, this.f43768g, this.f43769v, this.f43770w};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = (double) fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: z */
    public void mo50290z(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f43768g;
        float f2 = this.f43769v;
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

    public C16899r(int i, int i2, C16887j jVar, C16899r rVar, C16899r rVar2) {
        int i3 = C16881f.f43372f;
        this.f43772y = i3;
        this.f43773z = i3;
        this.f43759X = Float.NaN;
        this.f43760Y = null;
        this.f43761Z = new LinkedHashMap<>();
        this.f43755E0 = 0;
        this.f43757G0 = new double[18];
        this.f43758H0 = new double[18];
        if (rVar.f43773z != C16881f.f43372f) {
            mo50280j0(i, i2, jVar, rVar, rVar2);
            return;
        }
        int i4 = jVar.f43522O;
        if (i4 == 1) {
            mo50279i0(jVar, rVar, rVar2);
        } else if (i4 != 2) {
            mo50278h0(jVar, rVar, rVar2);
        } else {
            mo50281m0(i, i2, jVar, rVar, rVar2);
        }
    }
}
