package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.motion.utils.C16701m;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16727w;
import com.urbanairship.iam.C9259x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: androidx.constraintlayout.core.motion.c */
public class C16658c implements Comparable<C16658c> {

    /* renamed from: S0 */
    public static final String f41607S0 = "MotionPaths";

    /* renamed from: T0 */
    public static final boolean f41608T0 = false;

    /* renamed from: U0 */
    public static final int f41609U0 = 1;

    /* renamed from: V0 */
    public static final int f41610V0 = 2;

    /* renamed from: W0 */
    public static String[] f41611W0 = {C9259x.f25239v, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E0 */
    public C16680d f41612E0;

    /* renamed from: F0 */
    public int f41613F0 = 0;

    /* renamed from: G0 */
    public float f41614G0;

    /* renamed from: H0 */
    public float f41615H0;

    /* renamed from: I0 */
    public float f41616I0;

    /* renamed from: J0 */
    public float f41617J0;

    /* renamed from: K0 */
    public float f41618K0;

    /* renamed from: L0 */
    public float f41619L0 = Float.NaN;

    /* renamed from: M0 */
    public float f41620M0 = Float.NaN;

    /* renamed from: N0 */
    public int f41621N0 = -1;

    /* renamed from: O0 */
    public LinkedHashMap<String, C16655a> f41622O0 = new LinkedHashMap<>();

    /* renamed from: P0 */
    public int f41623P0 = 0;

    /* renamed from: Q0 */
    public double[] f41624Q0 = new double[18];

    /* renamed from: R0 */
    public double[] f41625R0 = new double[18];

    /* renamed from: X */
    public float f41626X = 0.0f;

    /* renamed from: Y */
    public float f41627Y = 0.0f;

    /* renamed from: Z */
    public float f41628Z = 0.0f;

    /* renamed from: a */
    public float f41629a = 1.0f;

    /* renamed from: b */
    public int f41630b = 0;

    /* renamed from: c */
    public int f41631c;

    /* renamed from: d */
    public boolean f41632d = false;

    /* renamed from: e */
    public float f41633e = 0.0f;

    /* renamed from: f */
    public float f41634f = 0.0f;

    /* renamed from: g */
    public float f41635g = 0.0f;

    /* renamed from: v */
    public float f41636v = 0.0f;

    /* renamed from: w */
    public float f41637w = 1.0f;

    /* renamed from: x */
    public float f41638x = 1.0f;

    /* renamed from: y */
    public float f41639y = Float.NaN;

    /* renamed from: z */
    public float f41640z = Float.NaN;

    /* renamed from: M */
    public int mo48852M(String str, double[] dArr, int i) {
        C16655a aVar = this.f41622O0.get(str);
        if (aVar.mo48784r() == 1) {
            dArr[i] = (double) aVar.mo48781n();
            return 1;
        }
        int r = aVar.mo48784r();
        float[] fArr = new float[r];
        aVar.mo48782o(fArr);
        int i2 = 0;
        while (i2 < r) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    /* renamed from: Q */
    public int mo48853Q(String str) {
        return this.f41622O0.get(str).mo48784r();
    }

    /* renamed from: W */
    public boolean mo48854W(String str) {
        return this.f41622O0.containsKey(str);
    }

    /* renamed from: X */
    public void mo48855X(float f, float f2, float f3, float f4) {
        this.f41615H0 = f;
        this.f41616I0 = f2;
        this.f41617J0 = f3;
        this.f41618K0 = f4;
    }

    /* renamed from: Z */
    public void mo48856Z(C16660e eVar) {
        mo48855X((float) eVar.mo48893E(), (float) eVar.mo48894F(), (float) eVar.mo48892D(), (float) eVar.mo48922k());
        mo48860g(eVar);
    }

    /* renamed from: b */
    public void mo48857b(HashMap<String, C16703o> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            C16703o oVar = hashMap.get(next);
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (next.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (next.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (next.equals("pivotY")) {
                        c = 8;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 9;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 10;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (next.equals("pathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f41635g)) {
                        f2 = this.f41635g;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f41636v)) {
                        f2 = this.f41636v;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f41634f)) {
                        f2 = this.f41634f;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f41626X)) {
                        f2 = this.f41626X;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f41627Y)) {
                        f2 = this.f41627Y;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f41628Z)) {
                        f2 = this.f41628Z;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f41620M0)) {
                        f2 = this.f41620M0;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.f41639y)) {
                        f2 = this.f41639y;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 8:
                    if (!Float.isNaN(this.f41640z)) {
                        f2 = this.f41640z;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                case 9:
                    if (!Float.isNaN(this.f41637w)) {
                        f = this.f41637w;
                    }
                    oVar.mo49074g(i, f);
                    break;
                case 10:
                    if (!Float.isNaN(this.f41638x)) {
                        f = this.f41638x;
                    }
                    oVar.mo49074g(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.f41629a)) {
                        f = this.f41629a;
                    }
                    oVar.mo49074g(i, f);
                    break;
                case 12:
                    if (!Float.isNaN(this.f41619L0)) {
                        f2 = this.f41619L0;
                    }
                    oVar.mo49074g(i, f2);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        C16727w.m76358f("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f41622O0.containsKey(str)) {
                            break;
                        } else {
                            C16655a aVar = this.f41622O0.get(str);
                            if (!(oVar instanceof C16703o.C16706c)) {
                                C16727w.m76358f("MotionPaths", next + " ViewSpline not a CustomSet frame = " + i + ", value" + aVar.mo48781n() + oVar);
                                break;
                            } else {
                                ((C16703o.C16706c) oVar).mo49081k(i, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: e0 */
    public void mo48859e0(C16701m mVar, C16660e eVar, int i, float f) {
        mo48855X((float) mVar.f42038b, (float) mVar.f42040d, (float) mVar.mo49068b(), (float) mVar.mo49067a());
        mo48860g(eVar);
        this.f41639y = Float.NaN;
        this.f41640z = Float.NaN;
        if (i == 1) {
            this.f41634f = f - 90.0f;
        } else if (i == 2) {
            this.f41634f = f + 90.0f;
        }
    }

    /* renamed from: g */
    public void mo48860g(C16660e eVar) {
        float f;
        this.f41631c = eVar.mo48890B();
        if (eVar.mo48890B() != 4) {
            f = 0.0f;
        } else {
            f = eVar.mo48918g();
        }
        this.f41629a = f;
        this.f41632d = false;
        this.f41634f = eVar.mo48931t();
        this.f41635g = eVar.mo48929r();
        this.f41636v = eVar.mo48930s();
        this.f41637w = eVar.mo48933u();
        this.f41638x = eVar.mo48934v();
        this.f41639y = eVar.mo48926o();
        this.f41640z = eVar.mo48927p();
        this.f41626X = eVar.mo48936x();
        this.f41627Y = eVar.mo48937y();
        this.f41628Z = eVar.mo48938z();
        for (String next : eVar.mo48921j()) {
            C16655a i = eVar.mo48920i(next);
            if (i != null && i.mo48783q()) {
                this.f41622O0.put(next, i);
            }
        }
    }

    /* renamed from: q */
    public int compareTo(C16658c cVar) {
        return Float.compare(this.f41614G0, cVar.f41614G0);
    }

    /* renamed from: r */
    public final boolean mo48862r(float f, float f2) {
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

    /* renamed from: w */
    public void mo48863w(C16658c cVar, HashSet<String> hashSet) {
        if (mo48862r(this.f41629a, cVar.f41629a)) {
            hashSet.add("alpha");
        }
        if (mo48862r(this.f41633e, cVar.f41633e)) {
            hashSet.add("translationZ");
        }
        int i = this.f41631c;
        int i2 = cVar.f41631c;
        if (i != i2 && this.f41630b == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (mo48862r(this.f41634f, cVar.f41634f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f41619L0) || !Float.isNaN(cVar.f41619L0)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f41620M0) || !Float.isNaN(cVar.f41620M0)) {
            hashSet.add("progress");
        }
        if (mo48862r(this.f41635g, cVar.f41635g)) {
            hashSet.add("rotationX");
        }
        if (mo48862r(this.f41636v, cVar.f41636v)) {
            hashSet.add("rotationY");
        }
        if (mo48862r(this.f41639y, cVar.f41639y)) {
            hashSet.add("pivotX");
        }
        if (mo48862r(this.f41640z, cVar.f41640z)) {
            hashSet.add("pivotY");
        }
        if (mo48862r(this.f41637w, cVar.f41637w)) {
            hashSet.add("scaleX");
        }
        if (mo48862r(this.f41638x, cVar.f41638x)) {
            hashSet.add("scaleY");
        }
        if (mo48862r(this.f41626X, cVar.f41626X)) {
            hashSet.add("translationX");
        }
        if (mo48862r(this.f41627Y, cVar.f41627Y)) {
            hashSet.add("translationY");
        }
        if (mo48862r(this.f41628Z, cVar.f41628Z)) {
            hashSet.add("translationZ");
        }
        if (mo48862r(this.f41633e, cVar.f41633e)) {
            hashSet.add("elevation");
        }
    }

    /* renamed from: y */
    public void mo48864y(C16658c cVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | mo48862r(this.f41614G0, cVar.f41614G0);
        zArr[1] = zArr[1] | mo48862r(this.f41615H0, cVar.f41615H0);
        zArr[2] = zArr[2] | mo48862r(this.f41616I0, cVar.f41616I0);
        zArr[3] = zArr[3] | mo48862r(this.f41617J0, cVar.f41617J0);
        zArr[4] = mo48862r(this.f41618K0, cVar.f41618K0) | zArr[4];
    }

    /* renamed from: z */
    public void mo48865z(double[] dArr, int[] iArr) {
        float[] fArr = {this.f41614G0, this.f41615H0, this.f41616I0, this.f41617J0, this.f41618K0, this.f41629a, this.f41633e, this.f41634f, this.f41635g, this.f41636v, this.f41637w, this.f41638x, this.f41639y, this.f41640z, this.f41626X, this.f41627Y, this.f41628Z, this.f41619L0};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 18) {
                dArr[i] = (double) fArr[i2];
                i++;
            }
        }
    }
}
