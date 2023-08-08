package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.urbanairship.iam.C9259x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: androidx.constraintlayout.motion.widget.n */
public class C16894n implements Comparable<C16894n> {

    /* renamed from: S0 */
    public static final String f43641S0 = "MotionPaths";

    /* renamed from: T0 */
    public static final boolean f43642T0 = false;

    /* renamed from: U0 */
    public static final int f43643U0 = 1;

    /* renamed from: V0 */
    public static final int f43644V0 = 2;

    /* renamed from: W0 */
    public static String[] f43645W0 = {C9259x.f25239v, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E0 */
    public C16680d f43646E0;

    /* renamed from: F0 */
    public int f43647F0 = 0;

    /* renamed from: G0 */
    public float f43648G0;

    /* renamed from: H0 */
    public float f43649H0;

    /* renamed from: I0 */
    public float f43650I0;

    /* renamed from: J0 */
    public float f43651J0;

    /* renamed from: K0 */
    public float f43652K0;

    /* renamed from: L0 */
    public float f43653L0 = Float.NaN;

    /* renamed from: M0 */
    public float f43654M0 = Float.NaN;

    /* renamed from: N0 */
    public int f43655N0 = -1;

    /* renamed from: O0 */
    public LinkedHashMap<String, ConstraintAttribute> f43656O0 = new LinkedHashMap<>();

    /* renamed from: P0 */
    public int f43657P0 = 0;

    /* renamed from: Q0 */
    public double[] f43658Q0 = new double[18];

    /* renamed from: R0 */
    public double[] f43659R0 = new double[18];

    /* renamed from: X */
    public float f43660X = 0.0f;

    /* renamed from: Y */
    public float f43661Y = 0.0f;

    /* renamed from: Z */
    public float f43662Z = 0.0f;

    /* renamed from: a */
    public float f43663a = 1.0f;

    /* renamed from: b */
    public int f43664b = 0;

    /* renamed from: c */
    public int f43665c;

    /* renamed from: d */
    public boolean f43666d = false;

    /* renamed from: e */
    public float f43667e = 0.0f;

    /* renamed from: f */
    public float f43668f = 0.0f;

    /* renamed from: g */
    public float f43669g = 0.0f;

    /* renamed from: v */
    public float f43670v = 0.0f;

    /* renamed from: w */
    public float f43671w = 1.0f;

    /* renamed from: x */
    public float f43672x = 1.0f;

    /* renamed from: y */
    public float f43673y = Float.NaN;

    /* renamed from: z */
    public float f43674z = Float.NaN;

    /* renamed from: M */
    public void mo50197M(double[] dArr, int[] iArr) {
        float[] fArr = {this.f43648G0, this.f43649H0, this.f43650I0, this.f43651J0, this.f43652K0, this.f43663a, this.f43667e, this.f43668f, this.f43669g, this.f43670v, this.f43671w, this.f43672x, this.f43673y, this.f43674z, this.f43660X, this.f43661Y, this.f43662Z, this.f43653L0};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 18) {
                dArr[i] = (double) fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: Q */
    public int mo50198Q(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.f43656O0.get(str);
        if (constraintAttribute.mo50637p() == 1) {
            dArr[i] = (double) constraintAttribute.mo50632k();
            return 1;
        }
        int p = constraintAttribute.mo50637p();
        float[] fArr = new float[p];
        constraintAttribute.mo50633l(fArr);
        int i2 = 0;
        while (i2 < p) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return p;
    }

    /* renamed from: W */
    public int mo50199W(String str) {
        return this.f43656O0.get(str).mo50637p();
    }

    /* renamed from: X */
    public boolean mo50200X(String str) {
        return this.f43656O0.containsKey(str);
    }

    /* renamed from: Z */
    public void mo50201Z(float f, float f2, float f3, float f4) {
        this.f43649H0 = f;
        this.f43650I0 = f2;
        this.f43651J0 = f3;
        this.f43652K0 = f4;
    }

    /* renamed from: b */
    public void mo50202b(HashMap<String, C16831d> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            C16831d dVar = hashMap.get(next);
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
                case -1225497657:
                    if (next.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals(C16881f.f43378l)) {
                        c = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals(C16881f.f43379m)) {
                        c = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals(C16881f.f43375i)) {
                        c = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f43669g)) {
                        f2 = this.f43669g;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f43670v)) {
                        f2 = this.f43670v;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f43660X)) {
                        f2 = this.f43660X;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f43661Y)) {
                        f2 = this.f43661Y;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f43662Z)) {
                        f2 = this.f43662Z;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f43654M0)) {
                        f2 = this.f43654M0;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f43671w)) {
                        f = this.f43671w;
                    }
                    dVar.mo49074g(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f43672x)) {
                        f = this.f43672x;
                    }
                    dVar.mo49074g(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.f43673y)) {
                        f2 = this.f43673y;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 9:
                    if (!Float.isNaN(this.f43674z)) {
                        f2 = this.f43674z;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.f43668f)) {
                        f2 = this.f43668f;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f43667e)) {
                        f2 = this.f43667e;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 12:
                    if (!Float.isNaN(this.f43653L0)) {
                        f2 = this.f43653L0;
                    }
                    dVar.mo49074g(i, f2);
                    break;
                case 13:
                    if (!Float.isNaN(this.f43663a)) {
                        f = this.f43663a;
                    }
                    dVar.mo49074g(i, f);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN spline ");
                        sb.append(next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f43656O0.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.f43656O0.get(str);
                            if (!(dVar instanceof C16831d.C16833b)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(next);
                                sb2.append(" ViewSpline not a CustomSet frame = ");
                                sb2.append(i);
                                sb2.append(", value");
                                sb2.append(constraintAttribute.mo50632k());
                                sb2.append(dVar);
                                break;
                            } else {
                                ((C16831d.C16833b) dVar).mo49941n(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: e0 */
    public void mo50204e0(Rect rect, View view, int i, float f) {
        mo50201Z((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo50206g(view);
        this.f43673y = Float.NaN;
        this.f43674z = Float.NaN;
        if (i == 1) {
            this.f43668f = f - 90.0f;
        } else if (i == 2) {
            this.f43668f = f + 90.0f;
        }
    }

    /* renamed from: f0 */
    public void mo50205f0(Rect rect, C16934c cVar, int i, int i2) {
        mo50201Z((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo50208q(cVar.mo50898q0(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f43668f + 90.0f;
            this.f43668f = f;
            if (f > 180.0f) {
                this.f43668f = f - 360.0f;
                return;
            }
            return;
        }
        this.f43668f -= 90.0f;
    }

    /* renamed from: g */
    public void mo50206g(View view) {
        float f;
        this.f43665c = view.getVisibility();
        if (view.getVisibility() != 0) {
            f = 0.0f;
        } else {
            f = view.getAlpha();
        }
        this.f43663a = f;
        this.f43666d = false;
        this.f43667e = view.getElevation();
        this.f43668f = view.getRotation();
        this.f43669g = view.getRotationX();
        this.f43670v = view.getRotationY();
        this.f43671w = view.getScaleX();
        this.f43672x = view.getScaleY();
        this.f43673y = view.getPivotX();
        this.f43674z = view.getPivotY();
        this.f43660X = view.getTranslationX();
        this.f43661Y = view.getTranslationY();
        this.f43662Z = view.getTranslationZ();
    }

    /* renamed from: h0 */
    public void mo50207h0(View view) {
        mo50201Z(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo50206g(view);
    }

    /* renamed from: q */
    public void mo50208q(C16934c.C16935a aVar) {
        float f;
        C16934c.C16939d dVar = aVar.f44582c;
        int i = dVar.f44774c;
        this.f43664b = i;
        int i2 = dVar.f44773b;
        this.f43665c = i2;
        if (i2 == 0 || i != 0) {
            f = dVar.f44775d;
        } else {
            f = 0.0f;
        }
        this.f43663a = f;
        C16934c.C16940e eVar = aVar.f44585f;
        this.f43666d = eVar.f44802m;
        this.f43667e = eVar.f44803n;
        this.f43668f = eVar.f44791b;
        this.f43669g = eVar.f44792c;
        this.f43670v = eVar.f44793d;
        this.f43671w = eVar.f44794e;
        this.f43672x = eVar.f44795f;
        this.f43673y = eVar.f44796g;
        this.f43674z = eVar.f44797h;
        this.f43660X = eVar.f44799j;
        this.f43661Y = eVar.f44800k;
        this.f43662Z = eVar.f44801l;
        this.f43646E0 = C16680d.m76169c(aVar.f44583d.f44761d);
        C16934c.C16938c cVar = aVar.f44583d;
        this.f43653L0 = cVar.f44766i;
        this.f43647F0 = cVar.f44763f;
        this.f43655N0 = cVar.f44759b;
        this.f43654M0 = aVar.f44582c.f44776e;
        for (String next : aVar.f44586g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f44586g.get(next);
            if (constraintAttribute.mo50635n()) {
                this.f43656O0.put(next, constraintAttribute);
            }
        }
    }

    /* renamed from: r */
    public int compareTo(C16894n nVar) {
        return Float.compare(this.f43648G0, nVar.f43648G0);
    }

    /* renamed from: w */
    public final boolean mo50210w(float f, float f2) {
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

    /* renamed from: y */
    public void mo50211y(C16894n nVar, HashSet<String> hashSet) {
        if (mo50210w(this.f43663a, nVar.f43663a)) {
            hashSet.add("alpha");
        }
        if (mo50210w(this.f43667e, nVar.f43667e)) {
            hashSet.add("elevation");
        }
        int i = this.f43665c;
        int i2 = nVar.f43665c;
        if (i != i2 && this.f43664b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (mo50210w(this.f43668f, nVar.f43668f)) {
            hashSet.add(C16881f.f43375i);
        }
        if (!Float.isNaN(this.f43653L0) || !Float.isNaN(nVar.f43653L0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43654M0) || !Float.isNaN(nVar.f43654M0)) {
            hashSet.add("progress");
        }
        if (mo50210w(this.f43669g, nVar.f43669g)) {
            hashSet.add("rotationX");
        }
        if (mo50210w(this.f43670v, nVar.f43670v)) {
            hashSet.add("rotationY");
        }
        if (mo50210w(this.f43673y, nVar.f43673y)) {
            hashSet.add(C16881f.f43378l);
        }
        if (mo50210w(this.f43674z, nVar.f43674z)) {
            hashSet.add(C16881f.f43379m);
        }
        if (mo50210w(this.f43671w, nVar.f43671w)) {
            hashSet.add("scaleX");
        }
        if (mo50210w(this.f43672x, nVar.f43672x)) {
            hashSet.add("scaleY");
        }
        if (mo50210w(this.f43660X, nVar.f43660X)) {
            hashSet.add("translationX");
        }
        if (mo50210w(this.f43661Y, nVar.f43661Y)) {
            hashSet.add("translationY");
        }
        if (mo50210w(this.f43662Z, nVar.f43662Z)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: z */
    public void mo50212z(C16894n nVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | mo50210w(this.f43648G0, nVar.f43648G0);
        zArr[1] = zArr[1] | mo50210w(this.f43649H0, nVar.f43649H0);
        zArr[2] = zArr[2] | mo50210w(this.f43650I0, nVar.f43650I0);
        zArr[3] = zArr[3] | mo50210w(this.f43651J0, nVar.f43651J0);
        zArr[4] = mo50210w(this.f43652K0, nVar.f43652K0) | zArr[4];
    }
}
