package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.C16664b;
import androidx.constraintlayout.core.motion.key.C16665c;
import androidx.constraintlayout.core.motion.key.C16666d;
import androidx.constraintlayout.core.motion.key.C16667e;
import androidx.constraintlayout.core.motion.key.C16668f;
import androidx.constraintlayout.core.motion.key.C16669g;
import androidx.constraintlayout.core.motion.utils.C16677b;
import androidx.constraintlayout.core.motion.utils.C16679c;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.motion.utils.C16682e;
import androidx.constraintlayout.core.motion.utils.C16685g;
import androidx.constraintlayout.core.motion.utils.C16686h;
import androidx.constraintlayout.core.motion.utils.C16694i;
import androidx.constraintlayout.core.motion.utils.C16701m;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16712t;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.motion.utils.C16727w;
import androidx.constraintlayout.core.motion.utils.C16729x;
import androidx.constraintlayout.core.motion.utils.C16730y;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.motion.b */
public class C16656b implements C16717v {

    /* renamed from: T */
    public static final int f41540T = 0;

    /* renamed from: U */
    public static final int f41541U = 1;

    /* renamed from: V */
    public static final int f41542V = 2;

    /* renamed from: W */
    public static final int f41543W = 3;

    /* renamed from: X */
    public static final int f41544X = 4;

    /* renamed from: Y */
    public static final int f41545Y = 5;

    /* renamed from: Z */
    public static final int f41546Z = 0;

    /* renamed from: a0 */
    public static final int f41547a0 = 1;

    /* renamed from: b0 */
    public static final int f41548b0 = 2;

    /* renamed from: c0 */
    public static final int f41549c0 = 3;

    /* renamed from: d0 */
    public static final int f41550d0 = 4;

    /* renamed from: e0 */
    public static final int f41551e0 = 5;

    /* renamed from: f0 */
    public static final int f41552f0 = 6;

    /* renamed from: g0 */
    public static final int f41553g0 = 1;

    /* renamed from: h0 */
    public static final int f41554h0 = 2;

    /* renamed from: i0 */
    public static final String f41555i0 = "MotionController";

    /* renamed from: j0 */
    public static final boolean f41556j0 = false;

    /* renamed from: k0 */
    public static final boolean f41557k0 = false;

    /* renamed from: l0 */
    public static final int f41558l0 = 0;

    /* renamed from: m0 */
    public static final int f41559m0 = 1;

    /* renamed from: n0 */
    public static final int f41560n0 = 2;

    /* renamed from: o0 */
    public static final int f41561o0 = 3;

    /* renamed from: p0 */
    public static final int f41562p0 = 4;

    /* renamed from: q0 */
    public static final int f41563q0 = 5;

    /* renamed from: r0 */
    public static final int f41564r0 = -1;

    /* renamed from: s0 */
    public static final int f41565s0 = -2;

    /* renamed from: t0 */
    public static final int f41566t0 = -3;

    /* renamed from: A */
    public String[] f41567A;

    /* renamed from: B */
    public int[] f41568B;

    /* renamed from: C */
    public int f41569C = 4;

    /* renamed from: D */
    public float[] f41570D = new float[4];

    /* renamed from: E */
    public ArrayList<C16659d> f41571E = new ArrayList<>();

    /* renamed from: F */
    public float[] f41572F = new float[1];

    /* renamed from: G */
    public ArrayList<C16664b> f41573G = new ArrayList<>();

    /* renamed from: H */
    public HashMap<String, C16712t> f41574H;

    /* renamed from: I */
    public HashMap<String, C16703o> f41575I;

    /* renamed from: J */
    public HashMap<String, C16686h> f41576J;

    /* renamed from: K */
    public C16669g[] f41577K;

    /* renamed from: L */
    public int f41578L = -1;

    /* renamed from: M */
    public int f41579M = -1;

    /* renamed from: N */
    public C16660e f41580N = null;

    /* renamed from: O */
    public int f41581O = -1;

    /* renamed from: P */
    public float f41582P = Float.NaN;

    /* renamed from: Q */
    public C16679c f41583Q = null;

    /* renamed from: R */
    public boolean f41584R = false;

    /* renamed from: S */
    public String[] f41585S;

    /* renamed from: h */
    public C16701m f41586h = new C16701m();

    /* renamed from: i */
    public C16660e f41587i;

    /* renamed from: j */
    public int f41588j;

    /* renamed from: k */
    public String f41589k;

    /* renamed from: l */
    public int f41590l = -1;

    /* renamed from: m */
    public C16659d f41591m = new C16659d();

    /* renamed from: n */
    public C16659d f41592n = new C16659d();

    /* renamed from: o */
    public C16658c f41593o = new C16658c();

    /* renamed from: p */
    public C16658c f41594p = new C16658c();

    /* renamed from: q */
    public C16677b[] f41595q;

    /* renamed from: r */
    public C16677b f41596r;

    /* renamed from: s */
    public float f41597s = Float.NaN;

    /* renamed from: t */
    public float f41598t = 0.0f;

    /* renamed from: u */
    public float f41599u = 1.0f;

    /* renamed from: v */
    public float f41600v;

    /* renamed from: w */
    public float f41601w;

    /* renamed from: x */
    public int[] f41602x;

    /* renamed from: y */
    public double[] f41603y;

    /* renamed from: z */
    public double[] f41604z;

    /* renamed from: androidx.constraintlayout.core.motion.b$a */
    public static class C16657a implements C16679c {

        /* renamed from: a */
        public float f41605a;

        /* renamed from: b */
        public final /* synthetic */ C16680d f41606b;

        public C16657a(C16680d dVar) {
            this.f41606b = dVar;
        }

        /* renamed from: a */
        public float mo48850a() {
            return (float) this.f41606b.mo48999b((double) this.f41605a);
        }

        public float getInterpolation(float f) {
            this.f41605a = f;
            return (float) this.f41606b.mo48998a((double) f);
        }
    }

    public C16656b(C16660e eVar) {
        mo48823c0(eVar);
    }

    /* renamed from: A */
    public static C16679c m75901A(int i, String str, int i2) {
        if (i != -1) {
            return null;
        }
        return new C16657a(C16680d.m76169c(str));
    }

    /* renamed from: B */
    public C16659d mo48793B(int i) {
        return this.f41571E.get(i);
    }

    /* renamed from: C */
    public int mo48794C(int i, int[] iArr) {
        int i2 = i;
        float[] fArr = new float[2];
        Iterator<C16664b> it = this.f41573G.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            C16664b next = it.next();
            int i5 = next.f41747k;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.f41744h;
                iArr[i7] = i8;
                double d = (double) (((float) i8) / 100.0f);
                this.f41595q[0].mo48982d(d, this.f41603y);
                this.f41591m.mo48866M(d, this.f41602x, this.f41603y, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof C16667e) {
                    C16667e eVar = (C16667e) next;
                    int i11 = i10 + 1;
                    iArr[i11] = eVar.f41817I;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(eVar.f41813E);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(eVar.f41814F);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    /* renamed from: D */
    public float mo48795D(int i, float f, float f2) {
        C16659d dVar = this.f41592n;
        float f3 = dVar.f41665e;
        C16659d dVar2 = this.f41591m;
        float f4 = dVar2.f41665e;
        float f5 = f3 - f4;
        float f6 = dVar.f41666f;
        float f7 = dVar2.f41666f;
        float f8 = f6 - f7;
        float f9 = f4 + (dVar2.f41667g / 2.0f);
        float f10 = f7 + (dVar2.f41668v / 2.0f);
        float hypot = (float) Math.hypot((double) f5, (double) f8);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot((double) f11, (double) f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f13 * f13)));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    /* renamed from: E */
    public int mo48796E(int[] iArr, float[] fArr) {
        Iterator<C16664b> it = this.f41573G.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C16664b next = it.next();
            int i3 = next.f41744h;
            iArr[i] = (next.f41747k * 1000) + i3;
            double d = (double) (((float) i3) / 100.0f);
            this.f41595q[0].mo48982d(d, this.f41603y);
            this.f41591m.mo48866M(d, this.f41602x, this.f41603y, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    /* renamed from: F */
    public double[] mo48797F(double d) {
        this.f41595q[0].mo48982d(d, this.f41603y);
        C16677b bVar = this.f41596r;
        if (bVar != null) {
            double[] dArr = this.f41603y;
            if (dArr.length > 0) {
                bVar.mo48982d(d, dArr);
            }
        }
        return this.f41603y;
    }

    /* renamed from: G */
    public C16667e mo48798G(int i, int i2, float f, float f2) {
        C16682e eVar = new C16682e();
        C16659d dVar = this.f41591m;
        float f3 = dVar.f41665e;
        eVar.f41946b = f3;
        float f4 = dVar.f41666f;
        eVar.f41948d = f4;
        eVar.f41947c = f3 + dVar.f41667g;
        eVar.f41945a = f4 + dVar.f41668v;
        C16682e eVar2 = new C16682e();
        C16659d dVar2 = this.f41592n;
        float f5 = dVar2.f41665e;
        eVar2.f41946b = f5;
        float f6 = dVar2.f41666f;
        eVar2.f41948d = f6;
        eVar2.f41947c = f5 + dVar2.f41667g;
        eVar2.f41945a = f6 + dVar2.f41668v;
        Iterator<C16664b> it = this.f41573G.iterator();
        while (it.hasNext()) {
            C16664b next = it.next();
            if (next instanceof C16667e) {
                C16667e eVar3 = (C16667e) next;
                if (eVar3.mo48964B(i, i2, eVar, eVar2, f, f2)) {
                    return eVar3;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    public void mo48799H(float f, int i, int i2, float f2, float f3, float[] fArr) {
        C16703o oVar;
        C16703o oVar2;
        C16703o oVar3;
        C16703o oVar4;
        C16703o oVar5;
        C16686h hVar;
        C16686h hVar2;
        C16686h hVar3;
        C16686h hVar4;
        float o = mo48837o(f, this.f41572F);
        HashMap<String, C16703o> hashMap = this.f41575I;
        C16686h hVar5 = null;
        if (hashMap == null) {
            oVar = null;
        } else {
            oVar = hashMap.get("translationX");
        }
        HashMap<String, C16703o> hashMap2 = this.f41575I;
        if (hashMap2 == null) {
            oVar2 = null;
        } else {
            oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, C16703o> hashMap3 = this.f41575I;
        if (hashMap3 == null) {
            oVar3 = null;
        } else {
            oVar3 = hashMap3.get("rotationZ");
        }
        HashMap<String, C16703o> hashMap4 = this.f41575I;
        if (hashMap4 == null) {
            oVar4 = null;
        } else {
            oVar4 = hashMap4.get("scaleX");
        }
        HashMap<String, C16703o> hashMap5 = this.f41575I;
        if (hashMap5 == null) {
            oVar5 = null;
        } else {
            oVar5 = hashMap5.get("scaleY");
        }
        HashMap<String, C16686h> hashMap6 = this.f41576J;
        if (hashMap6 == null) {
            hVar = null;
        } else {
            hVar = hashMap6.get("translationX");
        }
        HashMap<String, C16686h> hashMap7 = this.f41576J;
        if (hashMap7 == null) {
            hVar2 = null;
        } else {
            hVar2 = hashMap7.get("translationY");
        }
        HashMap<String, C16686h> hashMap8 = this.f41576J;
        if (hashMap8 == null) {
            hVar3 = null;
        } else {
            hVar3 = hashMap8.get("rotationZ");
        }
        HashMap<String, C16686h> hashMap9 = this.f41576J;
        if (hashMap9 == null) {
            hVar4 = null;
        } else {
            hVar4 = hashMap9.get("scaleX");
        }
        HashMap<String, C16686h> hashMap10 = this.f41576J;
        if (hashMap10 != null) {
            hVar5 = hashMap10.get("scaleY");
        }
        C16729x xVar = new C16729x();
        xVar.mo49118b();
        xVar.mo49120d(oVar3, o);
        xVar.mo49124h(oVar, oVar2, o);
        xVar.mo49122f(oVar4, oVar5, o);
        xVar.mo49119c(hVar3, o);
        xVar.mo49123g(hVar, hVar2, o);
        xVar.mo49121e(hVar4, hVar5, o);
        C16677b bVar = this.f41596r;
        if (bVar != null) {
            double[] dArr = this.f41603y;
            if (dArr.length > 0) {
                double d = (double) o;
                bVar.mo48982d(d, dArr);
                this.f41596r.mo48985g(d, this.f41604z);
                this.f41591m.mo48881o0(f2, f3, fArr, this.f41602x, this.f41604z, this.f41603y);
            }
            xVar.mo49117a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f41595q != null) {
            double o2 = (double) mo48837o(o, this.f41572F);
            this.f41595q[0].mo48985g(o2, this.f41604z);
            this.f41595q[0].mo48982d(o2, this.f41603y);
            float f4 = this.f41572F[0];
            while (true) {
                double[] dArr2 = this.f41604z;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.f41591m.mo48881o0(f5, f6, fArr, this.f41602x, dArr2, this.f41603y);
                    xVar.mo49117a(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            C16659d dVar = this.f41592n;
            float f7 = dVar.f41665e;
            C16659d dVar2 = this.f41591m;
            float f8 = f7 - dVar2.f41665e;
            float f9 = dVar.f41666f - dVar2.f41666f;
            C16686h hVar6 = hVar4;
            float f10 = (dVar.f41668v - dVar2.f41668v) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((dVar.f41667g - dVar2.f41667g) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            xVar.mo49118b();
            xVar.mo49120d(oVar3, o);
            xVar.mo49124h(oVar, oVar2, o);
            xVar.mo49122f(oVar4, oVar5, o);
            xVar.mo49119c(hVar3, o);
            xVar.mo49123g(hVar, hVar2, o);
            xVar.mo49121e(hVar6, hVar5, o);
            xVar.mo49117a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: I */
    public final float mo48800I() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            C16680d dVar = this.f41591m.f41661a;
            Iterator<C16659d> it = this.f41571E.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                C16659d next = it.next();
                C16680d dVar2 = next.f41661a;
                if (dVar2 != null) {
                    float f7 = next.f41663c;
                    if (f7 < f4) {
                        dVar = dVar2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.f41663c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) dVar.mo48998a((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.f41595q[0].mo48982d(d3, this.f41603y);
            float f9 = f3;
            int i2 = i;
            this.f41591m.mo48866M(d3, this.f41602x, this.f41603y, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (((double) f9) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    /* renamed from: J */
    public float mo48801J() {
        return this.f41591m.f41668v;
    }

    /* renamed from: K */
    public float mo48802K() {
        return this.f41591m.f41667g;
    }

    /* renamed from: L */
    public float mo48803L() {
        return this.f41591m.f41665e;
    }

    /* renamed from: M */
    public float mo48804M() {
        return this.f41591m.f41666f;
    }

    /* renamed from: N */
    public int mo48805N() {
        return this.f41579M;
    }

    /* renamed from: O */
    public C16660e mo48806O() {
        return this.f41587i;
    }

    /* renamed from: P */
    public final void mo48807P(C16659d dVar) {
        Iterator<C16659d> it = this.f41571E.iterator();
        C16659d dVar2 = null;
        while (it.hasNext()) {
            C16659d next = it.next();
            if (dVar.f41664d == next.f41664d) {
                dVar2 = next;
            }
        }
        if (dVar2 != null) {
            this.f41571E.remove(dVar2);
        }
        int binarySearch = Collections.binarySearch(this.f41571E, dVar);
        if (binarySearch == 0) {
            C16727w.m76358f("MotionController", " KeyPath position \"" + dVar.f41664d + "\" outside of range");
        }
        this.f41571E.add((-binarySearch) - 1, dVar);
    }

    /* renamed from: Q */
    public boolean mo48808Q(C16660e eVar, float f, long j, C16685g gVar) {
        double d;
        float f2;
        C16660e eVar2 = eVar;
        float o = mo48837o(f, (float[]) null);
        int i = this.f41581O;
        if (i != -1) {
            float f3 = 1.0f / ((float) i);
            float floor = ((float) Math.floor((double) (o / f3))) * f3;
            float f4 = (o % f3) / f3;
            if (!Float.isNaN(this.f41582P)) {
                f4 = (f4 + this.f41582P) % 1.0f;
            }
            C16679c cVar = this.f41583Q;
            if (cVar != null) {
                f2 = cVar.getInterpolation(f4);
            } else if (((double) f4) > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            o = (f2 * f3) + floor;
        }
        float f5 = o;
        HashMap<String, C16703o> hashMap = this.f41575I;
        if (hashMap != null) {
            for (C16703o h : hashMap.values()) {
                h.mo49075h(eVar2, f5);
            }
        }
        C16677b[] bVarArr = this.f41595q;
        if (bVarArr != null) {
            double d2 = (double) f5;
            bVarArr[0].mo48982d(d2, this.f41603y);
            this.f41595q[0].mo48985g(d2, this.f41604z);
            C16677b bVar = this.f41596r;
            if (bVar != null) {
                double[] dArr = this.f41603y;
                if (dArr.length > 0) {
                    bVar.mo48982d(d2, dArr);
                    this.f41596r.mo48985g(d2, this.f41604z);
                }
            }
            if (!this.f41584R) {
                d = d2;
                this.f41591m.mo48882p0(f5, eVar, this.f41602x, this.f41603y, this.f41604z, (double[]) null);
            } else {
                d = d2;
            }
            if (this.f41579M != -1) {
                if (this.f41580N == null) {
                    this.f41580N = eVar.mo48925n().mo48917f(this.f41579M);
                }
                C16660e eVar3 = this.f41580N;
                if (eVar3 != null) {
                    float w = ((float) (eVar3.mo48935w() + this.f41580N.mo48919h())) / 2.0f;
                    float l = ((float) (this.f41580N.mo48923l() + this.f41580N.mo48928q())) / 2.0f;
                    if (eVar.mo48928q() - eVar.mo48923l() > 0 && eVar.mo48919h() - eVar.mo48935w() > 0) {
                        eVar2.mo48902N(l - ((float) eVar.mo48923l()));
                        eVar2.mo48903O(w - ((float) eVar.mo48935w()));
                    }
                }
            }
            int i2 = 1;
            while (true) {
                C16677b[] bVarArr2 = this.f41595q;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i2].mo48983e(d, this.f41570D);
                this.f41591m.f41660Z.get(this.f41567A[i2 - 1]).mo48789w(eVar2, this.f41570D);
                i2++;
            }
            C16658c cVar2 = this.f41593o;
            if (cVar2.f41630b == 0) {
                if (f5 <= 0.0f) {
                    eVar2.mo48916b0(cVar2.f41631c);
                } else if (f5 >= 1.0f) {
                    eVar2.mo48916b0(this.f41594p.f41631c);
                } else if (this.f41594p.f41631c != cVar2.f41631c) {
                    eVar2.mo48916b0(4);
                }
            }
            if (this.f41577K != null) {
                int i3 = 0;
                while (true) {
                    C16669g[] gVarArr = this.f41577K;
                    if (i3 >= gVarArr.length) {
                        break;
                    }
                    gVarArr[i3].mo48976v(f5, eVar2);
                    i3++;
                }
            }
        } else {
            C16659d dVar = this.f41591m;
            float f6 = dVar.f41665e;
            C16659d dVar2 = this.f41592n;
            float f7 = f6 + ((dVar2.f41665e - f6) * f5);
            float f8 = dVar.f41666f;
            float f9 = f8 + ((dVar2.f41666f - f8) * f5);
            float f10 = dVar.f41667g;
            float f11 = f10 + ((dVar2.f41667g - f10) * f5);
            float f12 = dVar.f41668v;
            float f13 = f7 + 0.5f;
            float f14 = f9 + 0.5f;
            eVar2.mo48895G((int) f13, (int) f14, (int) (f13 + f11), (int) (f14 + f12 + ((dVar2.f41668v - f12) * f5)));
        }
        HashMap<String, C16686h> hashMap2 = this.f41576J;
        if (hashMap2 == null) {
            return false;
        }
        for (C16686h next : hashMap2.values()) {
            if (next instanceof C16686h.C16692f) {
                double[] dArr2 = this.f41604z;
                ((C16686h.C16692f) next).mo49036l(eVar, f5, dArr2[0], dArr2[1]);
            } else {
                next.mo49024h(eVar2, f5);
            }
        }
        return false;
    }

    /* renamed from: R */
    public String mo48809R() {
        return this.f41587i.mo48924m();
    }

    /* renamed from: S */
    public void mo48810S(C16660e eVar, C16667e eVar2, float f, float f2, String[] strArr, float[] fArr) {
        C16682e eVar3 = new C16682e();
        C16659d dVar = this.f41591m;
        float f3 = dVar.f41665e;
        eVar3.f41946b = f3;
        float f4 = dVar.f41666f;
        eVar3.f41948d = f4;
        eVar3.f41947c = f3 + dVar.f41667g;
        eVar3.f41945a = f4 + dVar.f41668v;
        C16682e eVar4 = new C16682e();
        C16659d dVar2 = this.f41592n;
        float f5 = dVar2.f41665e;
        eVar4.f41946b = f5;
        float f6 = dVar2.f41666f;
        eVar4.f41948d = f6;
        eVar4.f41947c = f5 + dVar2.f41667g;
        eVar4.f41945a = f6 + dVar2.f41668v;
        eVar2.mo48965C(eVar, eVar3, eVar4, f, f2, strArr, fArr);
    }

    /* renamed from: T */
    public final void mo48811T(C16659d dVar) {
        dVar.mo48880n0((float) this.f41587i.mo48893E(), (float) this.f41587i.mo48894F(), (float) this.f41587i.mo48892D(), (float) this.f41587i.mo48922k());
    }

    /* renamed from: U */
    public void mo48812U(C16701m mVar, C16701m mVar2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = mVar.f42038b + mVar.f42039c;
            mVar2.f42038b = ((mVar.f42040d + mVar.f42037a) - mVar.mo49068b()) / 2;
            mVar2.f42040d = i3 - ((i4 + mVar.mo49067a()) / 2);
            mVar2.f42039c = mVar2.f42038b + mVar.mo49068b();
            mVar2.f42037a = mVar2.f42040d + mVar.mo49067a();
        } else if (i == 2) {
            int i5 = mVar.f42038b + mVar.f42039c;
            mVar2.f42038b = i2 - (((mVar.f42040d + mVar.f42037a) + mVar.mo49068b()) / 2);
            mVar2.f42040d = (i5 - mVar.mo49067a()) / 2;
            mVar2.f42039c = mVar2.f42038b + mVar.mo49068b();
            mVar2.f42037a = mVar2.f42040d + mVar.mo49067a();
        } else if (i == 3) {
            int i6 = mVar.f42038b + mVar.f42039c;
            mVar2.f42038b = ((mVar.mo49067a() / 2) + mVar.f42040d) - (i6 / 2);
            mVar2.f42040d = i3 - ((i6 + mVar.mo49067a()) / 2);
            mVar2.f42039c = mVar2.f42038b + mVar.mo49068b();
            mVar2.f42037a = mVar2.f42040d + mVar.mo49067a();
        } else if (i == 4) {
            int i7 = mVar.f42038b + mVar.f42039c;
            mVar2.f42038b = i2 - (((mVar.f42037a + mVar.f42040d) + mVar.mo49068b()) / 2);
            mVar2.f42040d = (i7 - mVar.mo49067a()) / 2;
            mVar2.f42039c = mVar2.f42038b + mVar.mo49068b();
            mVar2.f42037a = mVar2.f42040d + mVar.mo49067a();
        }
    }

    /* renamed from: V */
    public void mo48813V(C16660e eVar) {
        C16659d dVar = this.f41591m;
        dVar.f41663c = 0.0f;
        dVar.f41664d = 0.0f;
        this.f41584R = true;
        dVar.mo48880n0((float) eVar.mo48893E(), (float) eVar.mo48894F(), (float) eVar.mo48892D(), (float) eVar.mo48922k());
        this.f41592n.mo48880n0((float) eVar.mo48893E(), (float) eVar.mo48894F(), (float) eVar.mo48892D(), (float) eVar.mo48922k());
        this.f41593o.mo48856Z(eVar);
        this.f41594p.mo48856Z(eVar);
    }

    /* renamed from: W */
    public void mo48814W(int i) {
        this.f41591m.f41662b = i;
    }

    /* renamed from: X */
    public void mo48815X(C16660e eVar) {
        C16659d dVar = this.f41592n;
        dVar.f41663c = 1.0f;
        dVar.f41664d = 1.0f;
        mo48811T(dVar);
        this.f41592n.mo48880n0((float) eVar.mo48923l(), (float) eVar.mo48935w(), (float) eVar.mo48892D(), (float) eVar.mo48922k());
        this.f41592n.mo48871b(eVar);
        this.f41594p.mo48856Z(eVar);
    }

    /* renamed from: Y */
    public void mo48816Y(int i) {
        this.f41578L = i;
    }

    /* renamed from: Z */
    public void mo48817Z(C16660e eVar) {
        C16659d dVar = this.f41591m;
        dVar.f41663c = 0.0f;
        dVar.f41664d = 0.0f;
        dVar.mo48880n0((float) eVar.mo48893E(), (float) eVar.mo48894F(), (float) eVar.mo48892D(), (float) eVar.mo48922k());
        this.f41591m.mo48871b(eVar);
        this.f41593o.mo48856Z(eVar);
    }

    /* renamed from: a */
    public int mo48818a(String str) {
        return 0;
    }

    /* renamed from: a0 */
    public void mo48819a0(C16730y yVar, C16660e eVar, int i, int i2, int i3) {
        C16659d dVar = this.f41591m;
        dVar.f41663c = 0.0f;
        dVar.f41664d = 0.0f;
        C16701m mVar = new C16701m();
        if (i == 1) {
            int i4 = yVar.f42369b + yVar.f42371d;
            mVar.f42038b = ((yVar.f42370c + yVar.f42372e) - yVar.mo49127c()) / 2;
            mVar.f42040d = i2 - ((i4 + yVar.mo49126b()) / 2);
            mVar.f42039c = mVar.f42038b + yVar.mo49127c();
            mVar.f42037a = mVar.f42040d + yVar.mo49126b();
        } else if (i == 2) {
            int i5 = yVar.f42369b + yVar.f42371d;
            mVar.f42038b = i3 - (((yVar.f42370c + yVar.f42372e) + yVar.mo49127c()) / 2);
            mVar.f42040d = (i5 - yVar.mo49126b()) / 2;
            mVar.f42039c = mVar.f42038b + yVar.mo49127c();
            mVar.f42037a = mVar.f42040d + yVar.mo49126b();
        }
        this.f41591m.mo48880n0((float) mVar.f42038b, (float) mVar.f42040d, (float) mVar.mo49068b(), (float) mVar.mo49067a());
        this.f41593o.mo48859e0(mVar, eVar, i, yVar.f42368a);
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i != 509) {
            return i == 704;
        }
        mo48816Y(i2);
        return true;
    }

    /* renamed from: b0 */
    public void mo48821b0(int i) {
        this.f41579M = i;
        this.f41580N = null;
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        return false;
    }

    /* renamed from: c0 */
    public void mo48823c0(C16660e eVar) {
        this.f41587i = eVar;
    }

    /* renamed from: d */
    public boolean mo48824d(int i, boolean z) {
        return false;
    }

    /* renamed from: d0 */
    public void mo48825d0(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        C16659d[] dVarArr;
        int i3;
        C16655a aVar;
        int i4;
        C16703o oVar;
        C16655a aVar2;
        int i5;
        Integer num;
        C16703o oVar2;
        C16655a aVar3;
        long j2 = j;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i6 = this.f41578L;
        if (i6 != -1) {
            this.f41591m.f41671y = i6;
        }
        this.f41593o.mo48863w(this.f41594p, hashSet2);
        ArrayList<C16664b> arrayList2 = this.f41573G;
        if (arrayList2 != null) {
            Iterator<C16664b> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                C16664b next = it.next();
                if (next instanceof C16667e) {
                    C16667e eVar = (C16667e) next;
                    mo48807P(new C16659d(i, i2, eVar, this.f41591m, this.f41592n));
                    int i7 = eVar.f41820y;
                    if (i7 != -1) {
                        this.f41590l = i7;
                    }
                } else if (next instanceof C16666d) {
                    next.mo48943i(hashSet3);
                } else if (next instanceof C16668f) {
                    next.mo48943i(hashSet);
                } else if (next instanceof C16669g) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C16669g) next);
                } else {
                    next.mo48951q(hashMap);
                    next.mo48943i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f41577K = (C16669g[]) arrayList.toArray(new C16669g[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f41575I = new HashMap<>();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    C16694i.C16696b bVar = new C16694i.C16696b();
                    String str2 = str.split(",")[c];
                    Iterator<C16664b> it3 = this.f41573G.iterator();
                    while (it3.hasNext()) {
                        C16664b next2 = it3.next();
                        HashMap<String, C16655a> hashMap2 = next2.f41748l;
                        if (!(hashMap2 == null || (aVar3 = hashMap2.get(str2)) == null)) {
                            bVar.mo49044a(next2.f41744h, aVar3);
                        }
                    }
                    oVar2 = C16703o.m76270e(str, bVar);
                } else {
                    oVar2 = C16703o.m76271f(str, j2);
                }
                if (oVar2 != null) {
                    oVar2.mo49076i(str);
                    this.f41575I.put(str, oVar2);
                }
                c = 1;
            }
            ArrayList<C16664b> arrayList3 = this.f41573G;
            if (arrayList3 != null) {
                Iterator<C16664b> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C16664b next3 = it4.next();
                    if (next3 instanceof C16665c) {
                        next3.mo48940f(this.f41575I);
                    }
                }
            }
            this.f41593o.mo48857b(this.f41575I, 0);
            this.f41594p.mo48857b(this.f41575I, 100);
            for (String next4 : this.f41575I.keySet()) {
                if (!hashMap.containsKey(next4) || (num = (Integer) hashMap.get(next4)) == null) {
                    i5 = 0;
                } else {
                    i5 = num.intValue();
                }
                C16703o oVar3 = this.f41575I.get(next4);
                if (oVar3 != null) {
                    oVar3.mo49077j(i5);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f41574H == null) {
                this.f41574H = new HashMap<>();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str3 = (String) it5.next();
                if (!this.f41574H.containsKey(str3)) {
                    if (str3.startsWith("CUSTOM,")) {
                        C16694i.C16696b bVar2 = new C16694i.C16696b();
                        String str4 = str3.split(",")[1];
                        Iterator<C16664b> it6 = this.f41573G.iterator();
                        while (it6.hasNext()) {
                            C16664b next5 = it6.next();
                            HashMap<String, C16655a> hashMap3 = next5.f41748l;
                            if (!(hashMap3 == null || (aVar2 = hashMap3.get(str4)) == null)) {
                                bVar2.mo49044a(next5.f41744h, aVar2);
                            }
                        }
                        oVar = C16703o.m76270e(str3, bVar2);
                    } else {
                        oVar = C16703o.m76271f(str3, j2);
                    }
                    if (oVar != null) {
                        oVar.mo49076i(str3);
                    }
                }
            }
            ArrayList<C16664b> arrayList4 = this.f41573G;
            if (arrayList4 != null) {
                Iterator<C16664b> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    C16664b next6 = it7.next();
                    if (next6 instanceof C16668f) {
                        ((C16668f) next6).mo48974v(this.f41574H);
                    }
                }
            }
            for (String next7 : this.f41574H.keySet()) {
                if (hashMap.containsKey(next7)) {
                    i4 = ((Integer) hashMap.get(next7)).intValue();
                } else {
                    i4 = 0;
                }
                this.f41574H.get(next7).mo49100f(i4);
            }
        }
        int i8 = 2;
        int size = this.f41571E.size() + 2;
        C16659d[] dVarArr2 = new C16659d[size];
        dVarArr2[0] = this.f41591m;
        dVarArr2[size - 1] = this.f41592n;
        if (this.f41571E.size() > 0 && this.f41590l == C16664b.f41732m) {
            this.f41590l = 0;
        }
        Iterator<C16659d> it8 = this.f41571E.iterator();
        int i9 = 1;
        while (it8.hasNext()) {
            dVarArr2[i9] = it8.next();
            i9++;
        }
        HashSet hashSet4 = new HashSet();
        for (String next8 : this.f41592n.f41660Z.keySet()) {
            if (this.f41591m.f41660Z.containsKey(next8)) {
                if (!hashSet2.contains("CUSTOM," + next8)) {
                    hashSet4.add(next8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f41567A = strArr2;
        this.f41568B = new int[strArr2.length];
        int i10 = 0;
        while (true) {
            strArr = this.f41567A;
            if (i10 >= strArr.length) {
                break;
            }
            String str5 = strArr[i10];
            this.f41568B[i10] = 0;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (dVarArr2[i11].f41660Z.containsKey(str5) && (aVar = dVarArr2[i11].f41660Z.get(str5)) != null) {
                        int[] iArr = this.f41568B;
                        iArr[i10] = iArr[i10] + aVar.mo48784r();
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            i10++;
        }
        if (dVarArr2[0].f41671y != -1) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 1; i12 < size; i12++) {
            dVarArr2[i12].mo48886w(dVarArr2[i12 - 1], zArr, this.f41567A, z);
        }
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                i13++;
            }
        }
        this.f41602x = new int[i13];
        int max = Math.max(2, i13);
        this.f41603y = new double[max];
        this.f41604z = new double[max];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f41602x[i15] = i16;
                i15++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[1] = this.f41602x.length;
        iArr2[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        double[] dArr2 = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            dVarArr2[i17].mo48887y(dArr[i17], this.f41602x);
            dArr2[i17] = (double) dVarArr2[i17].f41663c;
        }
        int i18 = 0;
        while (true) {
            int[] iArr3 = this.f41602x;
            if (i18 >= iArr3.length) {
                break;
            }
            if (iArr3[i18] < C16659d.f41653U0.length) {
                String str6 = C16659d.f41653U0[this.f41602x[i18]] + " [";
                for (int i19 = 0; i19 < size; i19++) {
                    str6 = str6 + dArr[i19][i18];
                }
            }
            i18++;
        }
        this.f41595q = new C16677b[(this.f41567A.length + 1)];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f41567A;
            if (i20 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i20];
            int i21 = 0;
            int i22 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i21 < size) {
                if (dVarArr2[i21].mo48874f0(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr4 = new int[i8];
                        iArr4[1] = dVarArr2[i21].mo48870Z(str7);
                        i3 = 0;
                        iArr4[0] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
                    } else {
                        i3 = 0;
                    }
                    C16659d dVar = dVarArr2[i21];
                    dVarArr = dVarArr2;
                    dArr3[i22] = (double) dVar.f41663c;
                    dVar.mo48869X(str7, dArr4[i22], i3);
                    i22++;
                } else {
                    dVarArr = dVarArr2;
                }
                i21++;
                dVarArr2 = dVarArr;
                i8 = 2;
            }
            i20++;
            this.f41595q[i20] = C16677b.m76154a(this.f41590l, Arrays.copyOf(dArr3, i22), (double[][]) Arrays.copyOf(dArr4, i22));
            dVarArr2 = dVarArr2;
            i8 = 2;
        }
        C16659d[] dVarArr3 = dVarArr2;
        this.f41595q[0] = C16677b.m76154a(this.f41590l, dArr2, dArr);
        if (dVarArr3[0].f41671y != -1) {
            int[] iArr5 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr6 = new int[2];
            iArr6[1] = 2;
            iArr6[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr6);
            for (int i23 = 0; i23 < size; i23++) {
                C16659d dVar2 = dVarArr3[i23];
                iArr5[i23] = dVar2.f41671y;
                dArr5[i23] = (double) dVar2.f41663c;
                double[] dArr7 = dArr6[i23];
                dArr7[0] = (double) dVar2.f41665e;
                dArr7[1] = (double) dVar2.f41666f;
            }
            this.f41596r = C16677b.m76155b(iArr5, dArr5, dArr6);
        }
        this.f41576J = new HashMap<>();
        if (this.f41573G != null) {
            Iterator it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String str8 = (String) it9.next();
                C16686h d = C16686h.m76192d(str8);
                if (d != null) {
                    if (d.mo49027k() && Float.isNaN(f2)) {
                        f2 = mo48800I();
                    }
                    d.mo49025i(str8);
                    this.f41576J.put(str8, d);
                }
            }
            Iterator<C16664b> it10 = this.f41573G.iterator();
            while (it10.hasNext()) {
                C16664b next9 = it10.next();
                if (next9 instanceof C16666d) {
                    ((C16666d) next9).mo48959v(this.f41576J);
                }
            }
            for (C16686h j3 : this.f41576J.values()) {
                j3.mo49026j(f2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (705 == i) {
            PrintStream printStream = System.out;
            printStream.println("TYPE_INTERPOLATOR  " + str);
            this.f41583Q = m75901A(-1, str, 0);
        }
        return false;
    }

    /* renamed from: e0 */
    public void mo48827e0(C16656b bVar) {
        this.f41591m.mo48885t0(bVar, bVar.f41591m);
        this.f41592n.mo48885t0(bVar, bVar.f41592n);
    }

    /* renamed from: f */
    public void mo48828f(C16664b bVar) {
        this.f41573G.add(bVar);
    }

    /* renamed from: g */
    public void mo48829g(ArrayList<C16664b> arrayList) {
        this.f41573G.addAll(arrayList);
    }

    /* renamed from: h */
    public void mo48830h(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f / ((float) (i2 - 1));
        HashMap<String, C16703o> hashMap = this.f41575I;
        if (hashMap != null) {
            C16703o oVar = hashMap.get("translationX");
        }
        HashMap<String, C16703o> hashMap2 = this.f41575I;
        if (hashMap2 != null) {
            C16703o oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, C16686h> hashMap3 = this.f41576J;
        if (hashMap3 != null) {
            C16686h hVar = hashMap3.get("translationX");
        }
        HashMap<String, C16686h> hashMap4 = this.f41576J;
        if (hashMap4 != null) {
            C16686h hVar2 = hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) * f;
            float f3 = this.f41599u;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f41598t;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && ((double) f2) < 1.0d) {
                    f2 = Math.min((f2 - f5) * f3, 1.0f);
                }
            }
            double d = (double) f2;
            C16680d dVar = this.f41591m.f41661a;
            Iterator<C16659d> it = this.f41571E.iterator();
            float f6 = Float.NaN;
            while (it.hasNext()) {
                C16659d next = it.next();
                C16680d dVar2 = next.f41661a;
                if (dVar2 != null) {
                    float f7 = next.f41663c;
                    if (f7 < f2) {
                        dVar = dVar2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.f41663c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) dVar.mo48998a((double) ((f2 - f4) / f8))) * f8) + f4);
            }
            this.f41595q[0].mo48982d(d, this.f41603y);
            C16677b bVar = this.f41596r;
            if (bVar != null) {
                double[] dArr = this.f41603y;
                if (dArr.length > 0) {
                    bVar.mo48982d(d, dArr);
                }
            }
            this.f41591m.mo48888z(this.f41602x, this.f41603y, fArr, i3 * 2);
        }
    }

    /* renamed from: i */
    public int mo48831i(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f41595q[0].mo48986h();
        if (iArr != null) {
            Iterator<C16659d> it = this.f41571E.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f41654E0;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.f41595q[0].mo48982d(d, this.f41603y);
            this.f41591m.mo48888z(this.f41602x, this.f41603y, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: j */
    public int mo48832j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f41595q[0].mo48986h();
        if (iArr != null) {
            Iterator<C16659d> it = this.f41571E.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f41654E0;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator<C16659d> it2 = this.f41571E.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (it2.next().f41664d * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < h.length; i4++) {
            this.f41595q[0].mo48982d(h[i4], this.f41603y);
            this.f41591m.mo48866M(h[i4], this.f41602x, this.f41603y, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* renamed from: k */
    public void mo48833k(float[] fArr, int i) {
        C16703o oVar;
        C16703o oVar2;
        C16686h hVar;
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, C16703o> hashMap = this.f41575I;
        C16686h hVar2 = null;
        if (hashMap == null) {
            oVar = null;
        } else {
            oVar = hashMap.get("translationX");
        }
        HashMap<String, C16703o> hashMap2 = this.f41575I;
        if (hashMap2 == null) {
            oVar2 = null;
        } else {
            oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, C16686h> hashMap3 = this.f41576J;
        if (hashMap3 == null) {
            hVar = null;
        } else {
            hVar = hashMap3.get("translationX");
        }
        HashMap<String, C16686h> hashMap4 = this.f41576J;
        if (hashMap4 != null) {
            hVar2 = hashMap4.get("translationY");
        }
        C16686h hVar3 = hVar2;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.f41599u;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.f41598t;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, f);
                }
            }
            float f7 = f3;
            double d2 = (double) f7;
            C16680d dVar = this.f41591m.f41661a;
            Iterator<C16659d> it = this.f41571E.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                C16659d next = it.next();
                C16680d dVar2 = next.f41661a;
                double d3 = d2;
                if (dVar2 != null) {
                    float f9 = next.f41663c;
                    if (f9 < f7) {
                        f5 = f9;
                        dVar = dVar2;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.f41663c;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (dVar != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                float f10 = f8 - f5;
                d = (double) ((((float) dVar.mo48998a((double) ((f7 - f5) / f10))) * f10) + f5);
            } else {
                d = d4;
            }
            this.f41595q[0].mo48982d(d, this.f41603y);
            C16677b bVar = this.f41596r;
            if (bVar != null) {
                double[] dArr = this.f41603y;
                if (dArr.length > 0) {
                    bVar.mo48982d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f7;
            int i5 = i3;
            this.f41591m.mo48866M(d, this.f41602x, this.f41603y, fArr, i4);
            if (hVar != null) {
                fArr[i4] = fArr[i4] + hVar.mo49018a(f11);
            } else if (oVar != null) {
                fArr[i4] = fArr[i4] + oVar.mo49071a(f11);
            }
            if (hVar3 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + hVar3.mo49018a(f11);
            } else if (oVar2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + oVar2.mo49071a(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* renamed from: l */
    public void mo48834l(float f, float[] fArr, int i) {
        this.f41595q[0].mo48982d((double) mo48837o(f, (float[]) null), this.f41603y);
        this.f41591m.mo48873e0(this.f41602x, this.f41603y, fArr, i);
    }

    /* renamed from: m */
    public void mo48835m(float[] fArr, int i) {
        float f = 1.0f / ((float) (i - 1));
        for (int i2 = 0; i2 < i; i2++) {
            this.f41595q[0].mo48982d((double) mo48837o(((float) i2) * f, (float[]) null), this.f41603y);
            this.f41591m.mo48873e0(this.f41602x, this.f41603y, fArr, i2 * 8);
        }
    }

    /* renamed from: n */
    public void mo48836n(boolean z) {
    }

    /* renamed from: o */
    public final float mo48837o(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f41599u;
            if (((double) f4) != 1.0d) {
                float f5 = this.f41598t;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C16680d dVar = this.f41591m.f41661a;
        Iterator<C16659d> it = this.f41571E.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            C16659d next = it.next();
            C16680d dVar2 = next.f41661a;
            if (dVar2 != null) {
                float f7 = next.f41663c;
                if (f7 < f) {
                    dVar = dVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f41663c;
                }
            }
        }
        if (dVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) dVar.mo48998a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) dVar.mo48999b(d);
            }
        }
        return f;
    }

    /* renamed from: p */
    public int mo48838p() {
        return this.f41591m.f41672z;
    }

    /* renamed from: q */
    public int mo48839q(String str, float[] fArr, int i) {
        C16703o oVar = this.f41575I.get(str);
        if (oVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = oVar.mo49071a((float) (i2 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    /* renamed from: r */
    public void mo48840r(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f41595q[0].mo48982d(d, dArr);
        this.f41595q[0].mo48985g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f41591m.mo48867Q(d, this.f41602x, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: s */
    public float mo48841s() {
        return this.f41600v;
    }

    /* renamed from: t */
    public float mo48842t() {
        return this.f41601w;
    }

    public String toString() {
        return " start: x: " + this.f41591m.f41665e + " y: " + this.f41591m.f41666f + " end: x: " + this.f41592n.f41665e + " y: " + this.f41592n.f41666f;
    }

    /* renamed from: u */
    public void mo48844u(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float o = mo48837o(f, this.f41572F);
        C16677b[] bVarArr = this.f41595q;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) o;
            bVarArr[0].mo48985g(d, this.f41604z);
            this.f41595q[0].mo48982d(d, this.f41603y);
            float f4 = this.f41572F[0];
            while (true) {
                dArr = this.f41604z;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            C16677b bVar = this.f41596r;
            if (bVar != null) {
                double[] dArr2 = this.f41603y;
                if (dArr2.length > 0) {
                    bVar.mo48982d(d, dArr2);
                    this.f41596r.mo48985g(d, this.f41604z);
                    this.f41591m.mo48881o0(f2, f3, fArr, this.f41602x, this.f41604z, this.f41603y);
                    return;
                }
                return;
            }
            this.f41591m.mo48881o0(f2, f3, fArr, this.f41602x, dArr, this.f41603y);
            return;
        }
        C16659d dVar = this.f41592n;
        float f5 = dVar.f41665e;
        C16659d dVar2 = this.f41591m;
        float f6 = f5 - dVar2.f41665e;
        float f7 = dVar.f41666f - dVar2.f41666f;
        float f8 = (dVar.f41667g - dVar2.f41667g) + f6;
        float f9 = (dVar.f41668v - dVar2.f41668v) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: v */
    public int mo48845v() {
        int i = this.f41591m.f41662b;
        Iterator<C16659d> it = this.f41571E.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f41662b);
        }
        return Math.max(i, this.f41592n.f41662b);
    }

    /* renamed from: w */
    public float mo48846w() {
        return this.f41592n.f41668v;
    }

    /* renamed from: x */
    public float mo48847x() {
        return this.f41592n.f41667g;
    }

    /* renamed from: y */
    public float mo48848y() {
        return this.f41592n.f41665e;
    }

    /* renamed from: z */
    public float mo48849z() {
        return this.f41592n.f41666f;
    }
}
